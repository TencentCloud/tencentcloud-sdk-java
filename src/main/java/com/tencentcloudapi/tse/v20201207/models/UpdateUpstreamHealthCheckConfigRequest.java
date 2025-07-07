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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUpstreamHealthCheckConfigRequest extends AbstractModel {

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关服务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 健康检查配置
    */
    @SerializedName("HealthCheckConfig")
    @Expose
    private UpstreamHealthCheckConfig HealthCheckConfig;

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
     * Get 网关服务名称 
     * @return Name 网关服务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 网关服务名称
     * @param Name 网关服务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 健康检查配置 
     * @return HealthCheckConfig 健康检查配置
     */
    public UpstreamHealthCheckConfig getHealthCheckConfig() {
        return this.HealthCheckConfig;
    }

    /**
     * Set 健康检查配置
     * @param HealthCheckConfig 健康检查配置
     */
    public void setHealthCheckConfig(UpstreamHealthCheckConfig HealthCheckConfig) {
        this.HealthCheckConfig = HealthCheckConfig;
    }

    public UpdateUpstreamHealthCheckConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUpstreamHealthCheckConfigRequest(UpdateUpstreamHealthCheckConfigRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.HealthCheckConfig != null) {
            this.HealthCheckConfig = new UpstreamHealthCheckConfig(source.HealthCheckConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "HealthCheckConfig.", this.HealthCheckConfig);

    }
}

