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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRuleRequest extends AbstractModel{

    /**
    * 负载均衡实例ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 要删除的转发规则的ID组成的数组。
    */
    @SerializedName("LocationIds")
    @Expose
    private String [] LocationIds;

    /**
    * 要删除的转发规则的域名，如果是多域名，可以指定多域名列表中的任意一个。已提供LocationIds参数时本参数不生效。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 要删除的转发规则的转发路径，已提供LocationIds参数时本参数不生效。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 监听器下必须配置一个默认域名，当需要删除默认域名时，可以指定另一个域名作为新的默认域名，如果新的默认域名是多域名，可以指定多域名列表中的任意一个。
    */
    @SerializedName("NewDefaultServerDomain")
    @Expose
    private String NewDefaultServerDomain;

    /**
     * Get 负载均衡实例ID。 
     * @return LoadBalancerId 负载均衡实例ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID。
     * @param LoadBalancerId 负载均衡实例ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡监听器ID。 
     * @return ListenerId 负载均衡监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器ID。
     * @param ListenerId 负载均衡监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 要删除的转发规则的ID组成的数组。 
     * @return LocationIds 要删除的转发规则的ID组成的数组。
     */
    public String [] getLocationIds() {
        return this.LocationIds;
    }

    /**
     * Set 要删除的转发规则的ID组成的数组。
     * @param LocationIds 要删除的转发规则的ID组成的数组。
     */
    public void setLocationIds(String [] LocationIds) {
        this.LocationIds = LocationIds;
    }

    /**
     * Get 要删除的转发规则的域名，如果是多域名，可以指定多域名列表中的任意一个。已提供LocationIds参数时本参数不生效。 
     * @return Domain 要删除的转发规则的域名，如果是多域名，可以指定多域名列表中的任意一个。已提供LocationIds参数时本参数不生效。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 要删除的转发规则的域名，如果是多域名，可以指定多域名列表中的任意一个。已提供LocationIds参数时本参数不生效。
     * @param Domain 要删除的转发规则的域名，如果是多域名，可以指定多域名列表中的任意一个。已提供LocationIds参数时本参数不生效。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 要删除的转发规则的转发路径，已提供LocationIds参数时本参数不生效。 
     * @return Url 要删除的转发规则的转发路径，已提供LocationIds参数时本参数不生效。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 要删除的转发规则的转发路径，已提供LocationIds参数时本参数不生效。
     * @param Url 要删除的转发规则的转发路径，已提供LocationIds参数时本参数不生效。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 监听器下必须配置一个默认域名，当需要删除默认域名时，可以指定另一个域名作为新的默认域名，如果新的默认域名是多域名，可以指定多域名列表中的任意一个。 
     * @return NewDefaultServerDomain 监听器下必须配置一个默认域名，当需要删除默认域名时，可以指定另一个域名作为新的默认域名，如果新的默认域名是多域名，可以指定多域名列表中的任意一个。
     */
    public String getNewDefaultServerDomain() {
        return this.NewDefaultServerDomain;
    }

    /**
     * Set 监听器下必须配置一个默认域名，当需要删除默认域名时，可以指定另一个域名作为新的默认域名，如果新的默认域名是多域名，可以指定多域名列表中的任意一个。
     * @param NewDefaultServerDomain 监听器下必须配置一个默认域名，当需要删除默认域名时，可以指定另一个域名作为新的默认域名，如果新的默认域名是多域名，可以指定多域名列表中的任意一个。
     */
    public void setNewDefaultServerDomain(String NewDefaultServerDomain) {
        this.NewDefaultServerDomain = NewDefaultServerDomain;
    }

    public DeleteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRuleRequest(DeleteRuleRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LocationIds != null) {
            this.LocationIds = new String[source.LocationIds.length];
            for (int i = 0; i < source.LocationIds.length; i++) {
                this.LocationIds[i] = new String(source.LocationIds[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.NewDefaultServerDomain != null) {
            this.NewDefaultServerDomain = new String(source.NewDefaultServerDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArraySimple(map, prefix + "LocationIds.", this.LocationIds);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "NewDefaultServerDomain", this.NewDefaultServerDomain);

    }
}

