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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndpointConfigurations extends AbstractModel {

    /**
    * 域名类型。可选值'Domain', 'PublicIp'。
    */
    @SerializedName("EndpointType")
    @Expose
    private String EndpointType;

    /**
    * 域名。
    */
    @SerializedName("EndpointService")
    @Expose
    private String EndpointService;

    /**
    * 权重。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 健康检查状态；HEALTH：健康；UNHEALTH：不健康。
    */
    @SerializedName("HealthCheckStatus")
    @Expose
    private String HealthCheckStatus;

    /**
     * Get 域名类型。可选值'Domain', 'PublicIp'。 
     * @return EndpointType 域名类型。可选值'Domain', 'PublicIp'。
     */
    public String getEndpointType() {
        return this.EndpointType;
    }

    /**
     * Set 域名类型。可选值'Domain', 'PublicIp'。
     * @param EndpointType 域名类型。可选值'Domain', 'PublicIp'。
     */
    public void setEndpointType(String EndpointType) {
        this.EndpointType = EndpointType;
    }

    /**
     * Get 域名。 
     * @return EndpointService 域名。
     */
    public String getEndpointService() {
        return this.EndpointService;
    }

    /**
     * Set 域名。
     * @param EndpointService 域名。
     */
    public void setEndpointService(String EndpointService) {
        this.EndpointService = EndpointService;
    }

    /**
     * Get 权重。 
     * @return Weight 权重。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重。
     * @param Weight 权重。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 健康检查状态；HEALTH：健康；UNHEALTH：不健康。 
     * @return HealthCheckStatus 健康检查状态；HEALTH：健康；UNHEALTH：不健康。
     */
    public String getHealthCheckStatus() {
        return this.HealthCheckStatus;
    }

    /**
     * Set 健康检查状态；HEALTH：健康；UNHEALTH：不健康。
     * @param HealthCheckStatus 健康检查状态；HEALTH：健康；UNHEALTH：不健康。
     */
    public void setHealthCheckStatus(String HealthCheckStatus) {
        this.HealthCheckStatus = HealthCheckStatus;
    }

    public EndpointConfigurations() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointConfigurations(EndpointConfigurations source) {
        if (source.EndpointType != null) {
            this.EndpointType = new String(source.EndpointType);
        }
        if (source.EndpointService != null) {
            this.EndpointService = new String(source.EndpointService);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.HealthCheckStatus != null) {
            this.HealthCheckStatus = new String(source.HealthCheckStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndpointType", this.EndpointType);
        this.setParamSimple(map, prefix + "EndpointService", this.EndpointService);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "HealthCheckStatus", this.HealthCheckStatus);

    }
}

