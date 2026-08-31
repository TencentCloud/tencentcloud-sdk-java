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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiBaseItem extends AbstractModel {

    /**
    * <p>后端转发协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Api Base URL</p>
    */
    @SerializedName("ApiBase")
    @Expose
    private String ApiBase;

    /**
     * Get <p>后端转发协议</p> 
     * @return Protocol <p>后端转发协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>后端转发协议</p>
     * @param Protocol <p>后端转发协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Api Base URL</p> 
     * @return ApiBase <p>Api Base URL</p>
     */
    public String getApiBase() {
        return this.ApiBase;
    }

    /**
     * Set <p>Api Base URL</p>
     * @param ApiBase <p>Api Base URL</p>
     */
    public void setApiBase(String ApiBase) {
        this.ApiBase = ApiBase;
    }

    public ApiBaseItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiBaseItem(ApiBaseItem source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.ApiBase != null) {
            this.ApiBase = new String(source.ApiBase);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ApiBase", this.ApiBase);

    }
}

