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
    * <p>请求参数</p>
    */
    @SerializedName("Request")
    @Expose
    private String Request;

    /**
    * <p>响应参数</p>
    */
    @SerializedName("Response")
    @Expose
    private String Response;

    /**
     * Get <p>请求参数</p> 
     * @return Request <p>请求参数</p>
     */
    public String getRequest() {
        return this.Request;
    }

    /**
     * Set <p>请求参数</p>
     * @param Request <p>请求参数</p>
     */
    public void setRequest(String Request) {
        this.Request = Request;
    }

    /**
     * Get <p>响应参数</p> 
     * @return Response <p>响应参数</p>
     */
    public String getResponse() {
        return this.Response;
    }

    /**
     * Set <p>响应参数</p>
     * @param Response <p>响应参数</p>
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

