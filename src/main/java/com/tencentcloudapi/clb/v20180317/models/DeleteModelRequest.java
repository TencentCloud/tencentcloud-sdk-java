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

public class DeleteModelRequest extends AbstractModel {

    /**
    * <p>服务提供商ID列表</p>
    */
    @SerializedName("ServiceProviderIds")
    @Expose
    private String [] ServiceProviderIds;

    /**
     * Get <p>服务提供商ID列表</p> 
     * @return ServiceProviderIds <p>服务提供商ID列表</p>
     */
    public String [] getServiceProviderIds() {
        return this.ServiceProviderIds;
    }

    /**
     * Set <p>服务提供商ID列表</p>
     * @param ServiceProviderIds <p>服务提供商ID列表</p>
     */
    public void setServiceProviderIds(String [] ServiceProviderIds) {
        this.ServiceProviderIds = ServiceProviderIds;
    }

    public DeleteModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteModelRequest(DeleteModelRequest source) {
        if (source.ServiceProviderIds != null) {
            this.ServiceProviderIds = new String[source.ServiceProviderIds.length];
            for (int i = 0; i < source.ServiceProviderIds.length; i++) {
                this.ServiceProviderIds[i] = new String(source.ServiceProviderIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ServiceProviderIds.", this.ServiceProviderIds);

    }
}

