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

public class ModifyCloudNativeAPIGatewayServiceRateLimitRequest extends AbstractModel{

    /**
    * 网关ID
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
    * 限流配置
    */
    @SerializedName("LimitDetail")
    @Expose
    private CloudNativeAPIGatewayRateLimitDetail LimitDetail;

    /**
     * Get 网关ID 
     * @return GatewayId 网关ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关ID
     * @param GatewayId 网关ID
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

    /**
     * Get 限流配置 
     * @return LimitDetail 限流配置
     */
    public CloudNativeAPIGatewayRateLimitDetail getLimitDetail() {
        return this.LimitDetail;
    }

    /**
     * Set 限流配置
     * @param LimitDetail 限流配置
     */
    public void setLimitDetail(CloudNativeAPIGatewayRateLimitDetail LimitDetail) {
        this.LimitDetail = LimitDetail;
    }

    public ModifyCloudNativeAPIGatewayServiceRateLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayServiceRateLimitRequest(ModifyCloudNativeAPIGatewayServiceRateLimitRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LimitDetail != null) {
            this.LimitDetail = new CloudNativeAPIGatewayRateLimitDetail(source.LimitDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "LimitDetail.", this.LimitDetail);

    }
}

