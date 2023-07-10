/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCloudNativeAPIGatewayServiceRateLimitRequest extends AbstractModel{

    /**
    * 网关Id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 服务名称，或服务ID
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 网关Id 
     * @return GatewayId 网关Id
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关Id
     * @param GatewayId 网关Id
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 服务名称，或服务ID 
     * @return Name 服务名称，或服务ID
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名称，或服务ID
     * @param Name 服务名称，或服务ID
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DeleteCloudNativeAPIGatewayServiceRateLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCloudNativeAPIGatewayServiceRateLimitRequest(DeleteCloudNativeAPIGatewayServiceRateLimitRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

