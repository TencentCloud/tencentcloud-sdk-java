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

public class BindApiKeyRequest extends AbstractModel {

    /**
    * <p>apiKey的Id</p>
    */
    @SerializedName("ApiKeyIds")
    @Expose
    private String [] ApiKeyIds;

    /**
    * <p>服务Id</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
     * Get <p>apiKey的Id</p> 
     * @return ApiKeyIds <p>apiKey的Id</p>
     */
    public String [] getApiKeyIds() {
        return this.ApiKeyIds;
    }

    /**
     * Set <p>apiKey的Id</p>
     * @param ApiKeyIds <p>apiKey的Id</p>
     */
    public void setApiKeyIds(String [] ApiKeyIds) {
        this.ApiKeyIds = ApiKeyIds;
    }

    /**
     * Get <p>服务Id</p> 
     * @return ServiceId <p>服务Id</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务Id</p>
     * @param ServiceId <p>服务Id</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public BindApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindApiKeyRequest(BindApiKeyRequest source) {
        if (source.ApiKeyIds != null) {
            this.ApiKeyIds = new String[source.ApiKeyIds.length];
            for (int i = 0; i < source.ApiKeyIds.length; i++) {
                this.ApiKeyIds[i] = new String(source.ApiKeyIds[i]);
            }
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ApiKeyIds.", this.ApiKeyIds);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);

    }
}

