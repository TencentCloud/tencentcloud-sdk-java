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
    * <p>域名类型。可选值&#39;Domain&#39;, &#39;PublicIp&#39;。</p>
    */
    @SerializedName("EndpointType")
    @Expose
    private String EndpointType;

    /**
    * <p>域名。</p>
    */
    @SerializedName("EndpointService")
    @Expose
    private String EndpointService;

    /**
    * <p>权重。</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>健康检查状态；HEALTH：健康；UNHEALTH：不健康。</p>
    */
    @SerializedName("HealthCheckStatus")
    @Expose
    private String HealthCheckStatus;

    /**
     * Get <p>域名类型。可选值&#39;Domain&#39;, &#39;PublicIp&#39;。</p> 
     * @return EndpointType <p>域名类型。可选值&#39;Domain&#39;, &#39;PublicIp&#39;。</p>
     */
    public String getEndpointType() {
        return this.EndpointType;
    }

    /**
     * Set <p>域名类型。可选值&#39;Domain&#39;, &#39;PublicIp&#39;。</p>
     * @param EndpointType <p>域名类型。可选值&#39;Domain&#39;, &#39;PublicIp&#39;。</p>
     */
    public void setEndpointType(String EndpointType) {
        this.EndpointType = EndpointType;
    }

    /**
     * Get <p>域名。</p> 
     * @return EndpointService <p>域名。</p>
     */
    public String getEndpointService() {
        return this.EndpointService;
    }

    /**
     * Set <p>域名。</p>
     * @param EndpointService <p>域名。</p>
     */
    public void setEndpointService(String EndpointService) {
        this.EndpointService = EndpointService;
    }

    /**
     * Get <p>权重。</p> 
     * @return Weight <p>权重。</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>权重。</p>
     * @param Weight <p>权重。</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>健康检查状态；HEALTH：健康；UNHEALTH：不健康。</p> 
     * @return HealthCheckStatus <p>健康检查状态；HEALTH：健康；UNHEALTH：不健康。</p>
     */
    public String getHealthCheckStatus() {
        return this.HealthCheckStatus;
    }

    /**
     * Set <p>健康检查状态；HEALTH：健康；UNHEALTH：不健康。</p>
     * @param HealthCheckStatus <p>健康检查状态；HEALTH：健康；UNHEALTH：不健康。</p>
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

