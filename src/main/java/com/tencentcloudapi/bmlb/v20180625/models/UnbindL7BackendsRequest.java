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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindL7BackendsRequest extends AbstractModel {

    /**
    * 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 七层监听器实例ID，可通过接口DescribeL7Listeners查询。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 转发域名实例ID，可通过接口DescribeL7Rules查询。
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 转发路径实例ID，可通过接口DescribeL7Rules查询。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 待绑定的主机信息。
    */
    @SerializedName("BackendSet")
    @Expose
    private UnbindL7Backend [] BackendSet;

    /**
    * 绑定类型。0：物理机  1：虚拟机 2：半托管机器
    */
    @SerializedName("BindType")
    @Expose
    private Long BindType;

    /**
     * Get 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。 
     * @return LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @param LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 七层监听器实例ID，可通过接口DescribeL7Listeners查询。 
     * @return ListenerId 七层监听器实例ID，可通过接口DescribeL7Listeners查询。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 七层监听器实例ID，可通过接口DescribeL7Listeners查询。
     * @param ListenerId 七层监听器实例ID，可通过接口DescribeL7Listeners查询。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 转发域名实例ID，可通过接口DescribeL7Rules查询。 
     * @return DomainId 转发域名实例ID，可通过接口DescribeL7Rules查询。
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 转发域名实例ID，可通过接口DescribeL7Rules查询。
     * @param DomainId 转发域名实例ID，可通过接口DescribeL7Rules查询。
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 转发路径实例ID，可通过接口DescribeL7Rules查询。 
     * @return LocationId 转发路径实例ID，可通过接口DescribeL7Rules查询。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发路径实例ID，可通过接口DescribeL7Rules查询。
     * @param LocationId 转发路径实例ID，可通过接口DescribeL7Rules查询。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 待绑定的主机信息。 
     * @return BackendSet 待绑定的主机信息。
     */
    public UnbindL7Backend [] getBackendSet() {
        return this.BackendSet;
    }

    /**
     * Set 待绑定的主机信息。
     * @param BackendSet 待绑定的主机信息。
     */
    public void setBackendSet(UnbindL7Backend [] BackendSet) {
        this.BackendSet = BackendSet;
    }

    /**
     * Get 绑定类型。0：物理机  1：虚拟机 2：半托管机器 
     * @return BindType 绑定类型。0：物理机  1：虚拟机 2：半托管机器
     */
    public Long getBindType() {
        return this.BindType;
    }

    /**
     * Set 绑定类型。0：物理机  1：虚拟机 2：半托管机器
     * @param BindType 绑定类型。0：物理机  1：虚拟机 2：半托管机器
     */
    public void setBindType(Long BindType) {
        this.BindType = BindType;
    }

    public UnbindL7BackendsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindL7BackendsRequest(UnbindL7BackendsRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.BackendSet != null) {
            this.BackendSet = new UnbindL7Backend[source.BackendSet.length];
            for (int i = 0; i < source.BackendSet.length; i++) {
                this.BackendSet[i] = new UnbindL7Backend(source.BackendSet[i]);
            }
        }
        if (source.BindType != null) {
            this.BindType = new Long(source.BindType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamArrayObj(map, prefix + "BackendSet.", this.BackendSet);
        this.setParamSimple(map, prefix + "BindType", this.BindType);

    }
}

