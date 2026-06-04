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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ToolExample extends AbstractModel {

    /**
    * 请求示例，json字符串
    */
    @SerializedName("Request")
    @Expose
    private String Request;

    /**
    * 回复示例，json字符串
    */
    @SerializedName("Response")
    @Expose
    private String Response;

    /**
     * Get 请求示例，json字符串 
     * @return Request 请求示例，json字符串
     */
    public String getRequest() {
        return this.Request;
    }

    /**
     * Set 请求示例，json字符串
     * @param Request 请求示例，json字符串
     */
    public void setRequest(String Request) {
        this.Request = Request;
    }

    /**
     * Get 回复示例，json字符串 
     * @return Response 回复示例，json字符串
     */
    public String getResponse() {
        return this.Response;
    }

    /**
     * Set 回复示例，json字符串
     * @param Response 回复示例，json字符串
     */
    public void setResponse(String Response) {
        this.Response = Response;
    }

    public ToolExample() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolExample(ToolExample source) {
        if (source.Request != null) {
            this.Request = new String(source.Request);
        }
        if (source.Response != null) {
            this.Response = new String(source.Response);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Request", this.Request);
        this.setParamSimple(map, prefix + "Response", this.Response);

    }
}

