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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbHostResult extends AbstractModel {

    /**
    * WAF绑定的监听器实例
    */
    @SerializedName("LoadBalancer")
    @Expose
    private LoadBalancer LoadBalancer;

    /**
    * WAF绑定的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * WAF绑定的实例ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 是否有绑定WAF，1：绑定了WAF，0：没有绑定WAF
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 绑定了WAF的情况下，WAF流量模式，1：清洗模式，0：镜像模式（默认）
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
     * Get WAF绑定的监听器实例 
     * @return LoadBalancer WAF绑定的监听器实例
     */
    public LoadBalancer getLoadBalancer() {
        return this.LoadBalancer;
    }

    /**
     * Set WAF绑定的监听器实例
     * @param LoadBalancer WAF绑定的监听器实例
     */
    public void setLoadBalancer(LoadBalancer LoadBalancer) {
        this.LoadBalancer = LoadBalancer;
    }

    /**
     * Get WAF绑定的域名 
     * @return Domain WAF绑定的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set WAF绑定的域名
     * @param Domain WAF绑定的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get WAF绑定的实例ID 
     * @return DomainId WAF绑定的实例ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set WAF绑定的实例ID
     * @param DomainId WAF绑定的实例ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 是否有绑定WAF，1：绑定了WAF，0：没有绑定WAF 
     * @return Status 是否有绑定WAF，1：绑定了WAF，0：没有绑定WAF
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 是否有绑定WAF，1：绑定了WAF，0：没有绑定WAF
     * @param Status 是否有绑定WAF，1：绑定了WAF，0：没有绑定WAF
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 绑定了WAF的情况下，WAF流量模式，1：清洗模式，0：镜像模式（默认） 
     * @return FlowMode 绑定了WAF的情况下，WAF流量模式，1：清洗模式，0：镜像模式（默认）
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set 绑定了WAF的情况下，WAF流量模式，1：清洗模式，0：镜像模式（默认）
     * @param FlowMode 绑定了WAF的情况下，WAF流量模式，1：清洗模式，0：镜像模式（默认）
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    public ClbHostResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbHostResult(ClbHostResult source) {
        if (source.LoadBalancer != null) {
            this.LoadBalancer = new LoadBalancer(source.LoadBalancer);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FlowMode != null) {
            this.FlowMode = new Long(source.FlowMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LoadBalancer.", this.LoadBalancer);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FlowMode", this.FlowMode);

    }
}

