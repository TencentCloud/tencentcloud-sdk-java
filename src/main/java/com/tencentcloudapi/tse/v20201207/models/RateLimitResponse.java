/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitResponse extends AbstractModel {

    /**
    * 自定义响应体
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * Headers
    */
    @SerializedName("Headers")
    @Expose
    private KVMapping [] Headers;

    /**
    * http状态码
    */
    @SerializedName("HttpStatus")
    @Expose
    private Long HttpStatus;

    /**
     * Get 自定义响应体 
     * @return Body 自定义响应体
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 自定义响应体
     * @param Body 自定义响应体
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get Headers 
     * @return Headers Headers
     */
    public KVMapping [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set Headers
     * @param Headers Headers
     */
    public void setHeaders(KVMapping [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get http状态码 
     * @return HttpStatus http状态码
     */
    public Long getHttpStatus() {
        return this.HttpStatus;
    }

    /**
     * Set http状态码
     * @param HttpStatus http状态码
     */
    public void setHttpStatus(Long HttpStatus) {
        this.HttpStatus = HttpStatus;
    }

    public RateLimitResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitResponse(RateLimitResponse source) {
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Headers != null) {
            this.Headers = new KVMapping[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new KVMapping(source.Headers[i]);
            }
        }
        if (source.HttpStatus != null) {
            this.HttpStatus = new Long(source.HttpStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "HttpStatus", this.HttpStatus);

    }
}

