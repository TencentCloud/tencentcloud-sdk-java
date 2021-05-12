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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancersRequest extends AbstractModel{

    /**
    * 区域。如果不传则默认查询所有区域。
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 负载均衡实例 ID。
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * 负载均衡实例的名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡实例的 VIP 地址，支持多个。
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * 负载均衡绑定的后端服务的内网 IP。
    */
    @SerializedName("BackendPrivateIps")
    @Expose
    private String [] BackendPrivateIps;

    /**
    * 数据偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回负载均衡实例的数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 负载均衡是否绑定后端服务，0：没有绑定后端服务，1：绑定后端服务，-1：查询全部。 
如果不传则默认查询全部。
    */
    @SerializedName("WithBackend")
    @Expose
    private Long WithBackend;

    /**
    * 负载均衡实例所属私有网络唯一ID，如 vpc-bhqkbhdx。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。详细的过滤条件如下：
tag-key - String - 是否必填：否 - （过滤条件）按照标签的键过滤。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 安全组。
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
     * Get 区域。如果不传则默认查询所有区域。 
     * @return EcmRegion 区域。如果不传则默认查询所有区域。
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set 区域。如果不传则默认查询所有区域。
     * @param EcmRegion 区域。如果不传则默认查询所有区域。
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get 负载均衡实例 ID。 
     * @return LoadBalancerIds 负载均衡实例 ID。
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 负载均衡实例 ID。
     * @param LoadBalancerIds 负载均衡实例 ID。
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get 负载均衡实例的名称。 
     * @return LoadBalancerName 负载均衡实例的名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡实例的名称。
     * @param LoadBalancerName 负载均衡实例的名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡实例的 VIP 地址，支持多个。 
     * @return LoadBalancerVips 负载均衡实例的 VIP 地址，支持多个。
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set 负载均衡实例的 VIP 地址，支持多个。
     * @param LoadBalancerVips 负载均衡实例的 VIP 地址，支持多个。
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get 负载均衡绑定的后端服务的内网 IP。 
     * @return BackendPrivateIps 负载均衡绑定的后端服务的内网 IP。
     */
    public String [] getBackendPrivateIps() {
        return this.BackendPrivateIps;
    }

    /**
     * Set 负载均衡绑定的后端服务的内网 IP。
     * @param BackendPrivateIps 负载均衡绑定的后端服务的内网 IP。
     */
    public void setBackendPrivateIps(String [] BackendPrivateIps) {
        this.BackendPrivateIps = BackendPrivateIps;
    }

    /**
     * Get 数据偏移量，默认为 0。 
     * @return Offset 数据偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，默认为 0。
     * @param Offset 数据偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回负载均衡实例的数量，默认为20，最大值为100。 
     * @return Limit 返回负载均衡实例的数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回负载均衡实例的数量，默认为20，最大值为100。
     * @param Limit 返回负载均衡实例的数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 负载均衡是否绑定后端服务，0：没有绑定后端服务，1：绑定后端服务，-1：查询全部。 
如果不传则默认查询全部。 
     * @return WithBackend 负载均衡是否绑定后端服务，0：没有绑定后端服务，1：绑定后端服务，-1：查询全部。 
如果不传则默认查询全部。
     */
    public Long getWithBackend() {
        return this.WithBackend;
    }

    /**
     * Set 负载均衡是否绑定后端服务，0：没有绑定后端服务，1：绑定后端服务，-1：查询全部。 
如果不传则默认查询全部。
     * @param WithBackend 负载均衡是否绑定后端服务，0：没有绑定后端服务，1：绑定后端服务，-1：查询全部。 
如果不传则默认查询全部。
     */
    public void setWithBackend(Long WithBackend) {
        this.WithBackend = WithBackend;
    }

    /**
     * Get 负载均衡实例所属私有网络唯一ID，如 vpc-bhqkbhdx。 
     * @return VpcId 负载均衡实例所属私有网络唯一ID，如 vpc-bhqkbhdx。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 负载均衡实例所属私有网络唯一ID，如 vpc-bhqkbhdx。
     * @param VpcId 负载均衡实例所属私有网络唯一ID，如 vpc-bhqkbhdx。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。详细的过滤条件如下：
tag-key - String - 是否必填：否 - （过滤条件）按照标签的键过滤。 
     * @return Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。详细的过滤条件如下：
tag-key - String - 是否必填：否 - （过滤条件）按照标签的键过滤。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。详细的过滤条件如下：
tag-key - String - 是否必填：否 - （过滤条件）按照标签的键过滤。
     * @param Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。详细的过滤条件如下：
tag-key - String - 是否必填：否 - （过滤条件）按照标签的键过滤。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 安全组。 
     * @return SecurityGroup 安全组。
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组。
     * @param SecurityGroup 安全组。
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    public DescribeLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancersRequest(DescribeLoadBalancersRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerVips != null) {
            this.LoadBalancerVips = new String[source.LoadBalancerVips.length];
            for (int i = 0; i < source.LoadBalancerVips.length; i++) {
                this.LoadBalancerVips[i] = new String(source.LoadBalancerVips[i]);
            }
        }
        if (source.BackendPrivateIps != null) {
            this.BackendPrivateIps = new String[source.BackendPrivateIps.length];
            for (int i = 0; i < source.BackendPrivateIps.length; i++) {
                this.BackendPrivateIps[i] = new String(source.BackendPrivateIps[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.WithBackend != null) {
            this.WithBackend = new Long(source.WithBackend);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamArraySimple(map, prefix + "BackendPrivateIps.", this.BackendPrivateIps);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "WithBackend", this.WithBackend);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);

    }
}

