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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecuteAgentApiV1Request extends AbstractModel {

    /**
    * <p>参数路径</p>
    */
    @SerializedName("RequestPath")
    @Expose
    private String RequestPath;

    /**
    * <p>post还是get</p><p>枚举值：</p><ul><li>post： post请求</li><li>get： get请求</li></ul>
    */
    @SerializedName("RequestType")
    @Expose
    private String RequestType;

    /**
     * Get <p>参数路径</p> 
     * @return RequestPath <p>参数路径</p>
     */
    public String getRequestPath() {
        return this.RequestPath;
    }

    /**
     * Set <p>参数路径</p>
     * @param RequestPath <p>参数路径</p>
     */
    public void setRequestPath(String RequestPath) {
        this.RequestPath = RequestPath;
    }

    /**
     * Get <p>post还是get</p><p>枚举值：</p><ul><li>post： post请求</li><li>get： get请求</li></ul> 
     * @return RequestType <p>post还是get</p><p>枚举值：</p><ul><li>post： post请求</li><li>get： get请求</li></ul>
     */
    public String getRequestType() {
        return this.RequestType;
    }

    /**
     * Set <p>post还是get</p><p>枚举值：</p><ul><li>post： post请求</li><li>get： get请求</li></ul>
     * @param RequestType <p>post还是get</p><p>枚举值：</p><ul><li>post： post请求</li><li>get： get请求</li></ul>
     */
    public void setRequestType(String RequestType) {
        this.RequestType = RequestType;
    }

    public ExecuteAgentApiV1Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecuteAgentApiV1Request(ExecuteAgentApiV1Request source) {
        if (source.RequestPath != null) {
            this.RequestPath = new String(source.RequestPath);
        }
        if (source.RequestType != null) {
            this.RequestType = new String(source.RequestType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestPath", this.RequestPath);
        this.setParamSimple(map, prefix + "RequestType", this.RequestType);

    }
}

