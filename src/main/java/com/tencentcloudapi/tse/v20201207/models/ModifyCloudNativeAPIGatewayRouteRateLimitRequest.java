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

public class ModifyCloudNativeAPIGatewayRouteRateLimitRequest extends AbstractModel{

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 路由id，或路由名称。
不支持“未命名”
    */
    @SerializedName("Id")
    @Expose
    private String Id;

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
     * Get 路由id，或路由名称。
不支持“未命名” 
     * @return Id 路由id，或路由名称。
不支持“未命名”
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 路由id，或路由名称。
不支持“未命名”
     * @param Id 路由id，或路由名称。
不支持“未命名”
     */
    public void setId(String Id) {
        this.Id = Id;
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

    public ModifyCloudNativeAPIGatewayRouteRateLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCloudNativeAPIGatewayRouteRateLimitRequest(ModifyCloudNativeAPIGatewayRouteRateLimitRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "LimitDetail.", this.LimitDetail);

    }
}

