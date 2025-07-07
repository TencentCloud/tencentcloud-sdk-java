/*
 * Copyright (c) 2018 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tencentcloudapi.common;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.Closeable;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public abstract class SSEResponseModel extends AbstractModel implements Iterable<SSEResponseModel.SSE>, Closeable {
    private Response response;
    private CircuitBreaker.Token token;

    public abstract String getRequestId();

    public abstract void setRequestId(String requestId);

    public void setResponse(Response response) {
        this.response = response;
    }

    public boolean isStream() {
        return this.response != null;
    }

    public void setToken(CircuitBreaker.Token token) {
        this.token = token;
    }

    public static class SSE {
        public String Id;
        public String Event;
        public String Data;
        public long Retry;

        @Override
        public String toString() {
            return String.format("Id=%s Event=%s Retry=%d Data=%s", Id, Event, Retry, Data);
        }
    }

    private static class SSEIterator implements Iterator<SSE> {
        private final Scanner scanner;

        public SSEIterator(SSEResponseModel resp) throws TencentCloudSDKException {
            ResponseBody body = resp.response.body();
            if (body == null) {
                throw new TencentCloudSDKException("Response body should not be null");
            }
            this.scanner = new Scanner(body.source(), StandardCharsets.UTF_8.name());
        }

        @Override
        public boolean hasNext() {
            return this.scanner.hasNextLine();
        }

        @Override
        public SSE next() {
            SSE e = new SSE();
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = this.scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                }

                //comment
                if (line.charAt(0) == ':') {
                    continue;
                }

                int colonIdx = line.indexOf(':');
                String key = line.substring(0, colonIdx);
                switch (key) {
                    case "id":
                        e.Id = line.substring(colonIdx + 1);
                        break;
                    case "event":
                        e.Event = line.substring(colonIdx + 1);
                        break;
                    case "data":
                        // The spec allows for multiple data fields per event, concatenated them with "\n".
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        line = line.substring(colonIdx + 1);
                        if (line.charAt(0) == ' ') {
                            line = line.substring(1);
                        }
                        sb.append(line);
                        break;
                    case "retry":
                        e.Retry = Integer.parseInt(line.substring(colonIdx + 1));
                        break;
                }
            }
            e.Data = sb.toString();
            return e;
        }

        @Override
        public void remove() {
        }
    }


    @Override
    public Iterator<SSE> iterator() {
        try {
            return new SSEIterator(this);
        } catch (TencentCloudSDKException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
    }

    @Override
    public void close() {
        this.response.close();
    }
}
