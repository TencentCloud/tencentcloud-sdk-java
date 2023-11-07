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

public class ClbHostsParams extends AbstractModel {

    /**
    * 负载均衡实例ID，如果不传次参数则默认认为操作的是整个AppId的监听器，如果此参数不为空则认为操作的是对应负载均衡实例。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器ID，，如果不传次参数则默认认为操作的是整个负载均衡实例，如果此参数不为空则认为操作的是对应负载均衡监听器。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * WAF实例ID，，如果不传次参数则默认认为操作的是整个负载均衡监听器实例，如果此参数不为空则认为操作的是对应负载均衡监听器的某一个具体的域名。
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
     * Get 负载均衡实例ID，如果不传次参数则默认认为操作的是整个AppId的监听器，如果此参数不为空则认为操作的是对应负载均衡实例。 
     * @return LoadBalancerId 负载均衡实例ID，如果不传次参数则默认认为操作的是整个AppId的监听器，如果此参数不为空则认为操作的是对应负载均衡实例。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID，如果不传次参数则默认认为操作的是整个AppId的监听器，如果此参数不为空则认为操作的是对应负载均衡实例。
     * @param LoadBalancerId 负载均衡实例ID，如果不传次参数则默认认为操作的是整个AppId的监听器，如果此参数不为空则认为操作的是对应负载均衡实例。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡监听器ID，，如果不传次参数则默认认为操作的是整个负载均衡实例，如果此参数不为空则认为操作的是对应负载均衡监听器。 
     * @return ListenerId 负载均衡监听器ID，，如果不传次参数则默认认为操作的是整个负载均衡实例，如果此参数不为空则认为操作的是对应负载均衡监听器。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器ID，，如果不传次参数则默认认为操作的是整个负载均衡实例，如果此参数不为空则认为操作的是对应负载均衡监听器。
     * @param ListenerId 负载均衡监听器ID，，如果不传次参数则默认认为操作的是整个负载均衡实例，如果此参数不为空则认为操作的是对应负载均衡监听器。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get WAF实例ID，，如果不传次参数则默认认为操作的是整个负载均衡监听器实例，如果此参数不为空则认为操作的是对应负载均衡监听器的某一个具体的域名。 
     * @return DomainId WAF实例ID，，如果不传次参数则默认认为操作的是整个负载均衡监听器实例，如果此参数不为空则认为操作的是对应负载均衡监听器的某一个具体的域名。
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set WAF实例ID，，如果不传次参数则默认认为操作的是整个负载均衡监听器实例，如果此参数不为空则认为操作的是对应负载均衡监听器的某一个具体的域名。
     * @param DomainId WAF实例ID，，如果不传次参数则默认认为操作的是整个负载均衡监听器实例，如果此参数不为空则认为操作的是对应负载均衡监听器的某一个具体的域名。
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    public ClbHostsParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbHostsParams(ClbHostsParams source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

