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

public class DeregisterModelsFromServiceProviderRequest extends AbstractModel {

    /**
    * <p>BYOK的ID</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>模型别名列表</p>
    */
    @SerializedName("ModelAliases")
    @Expose
    private String [] ModelAliases;

    /**
     * Get <p>BYOK的ID</p> 
     * @return ServiceProviderId <p>BYOK的ID</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>BYOK的ID</p>
     * @param ServiceProviderId <p>BYOK的ID</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get <p>模型别名列表</p> 
     * @return ModelAliases <p>模型别名列表</p>
     */
    public String [] getModelAliases() {
        return this.ModelAliases;
    }

    /**
     * Set <p>模型别名列表</p>
     * @param ModelAliases <p>模型别名列表</p>
     */
    public void setModelAliases(String [] ModelAliases) {
        this.ModelAliases = ModelAliases;
    }

    public DeregisterModelsFromServiceProviderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeregisterModelsFromServiceProviderRequest(DeregisterModelsFromServiceProviderRequest source) {
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.ModelAliases != null) {
            this.ModelAliases = new String[source.ModelAliases.length];
            for (int i = 0; i < source.ModelAliases.length; i++) {
                this.ModelAliases[i] = new String(source.ModelAliases[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamArraySimple(map, prefix + "ModelAliases.", this.ModelAliases);

    }
}

