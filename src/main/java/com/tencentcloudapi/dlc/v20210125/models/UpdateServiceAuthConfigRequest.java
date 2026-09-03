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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateServiceAuthConfigRequest extends AbstractModel {

    /**
    * <p>服务ID</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>是否启用 API-Key 鉴权</p>
    */
    @SerializedName("ApiKeyAuthEnabled")
    @Expose
    private Boolean ApiKeyAuthEnabled;

    /**
     * Get <p>服务ID</p> 
     * @return ServiceId <p>服务ID</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务ID</p>
     * @param ServiceId <p>服务ID</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>是否启用 API-Key 鉴权</p> 
     * @return ApiKeyAuthEnabled <p>是否启用 API-Key 鉴权</p>
     */
    public Boolean getApiKeyAuthEnabled() {
        return this.ApiKeyAuthEnabled;
    }

    /**
     * Set <p>是否启用 API-Key 鉴权</p>
     * @param ApiKeyAuthEnabled <p>是否启用 API-Key 鉴权</p>
     */
    public void setApiKeyAuthEnabled(Boolean ApiKeyAuthEnabled) {
        this.ApiKeyAuthEnabled = ApiKeyAuthEnabled;
    }

    public UpdateServiceAuthConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateServiceAuthConfigRequest(UpdateServiceAuthConfigRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ApiKeyAuthEnabled != null) {
            this.ApiKeyAuthEnabled = new Boolean(source.ApiKeyAuthEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ApiKeyAuthEnabled", this.ApiKeyAuthEnabled);

    }
}

