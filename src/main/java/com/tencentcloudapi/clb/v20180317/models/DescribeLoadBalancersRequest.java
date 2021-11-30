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

public class DescribeLoadBalancersRequest extends AbstractModel{

    /**
    * 负载均衡实例ID。
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡实例的类型。1：通用的负载均衡实例，0：传统型负载均衡实例。如果不传此参数，则查询所有类型的负载均衡实例。
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * 负载均衡实例的名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 腾讯云为负载均衡实例分配的域名，本参数仅对传统型公网负载均衡才有意义。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 负载均衡实例的 VIP 地址，支持多个。
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * 负载均衡绑定的后端服务的外网 IP。
    */
    @SerializedName("BackendPublicIps")
    @Expose
    private String [] BackendPublicIps;

    /**
    * 负载均衡绑定的后端服务的内网 IP。
    */
    @SerializedName("BackendPrivateIps")
    @Expose
    private String [] BackendPrivateIps;

    /**
    * 数据偏移量，默认为0。
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
    * 排序参数，支持以下字段：LoadBalancerName，CreateTime，Domain，LoadBalancerType。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 1：倒序，0：顺序，默认按照创建时间倒序。
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 搜索字段，模糊匹配名称、域名、VIP。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 负载均衡是否绑定后端服务，0：没有绑定后端服务，1：绑定后端服务，-1：查询全部。
    */
    @SerializedName("WithRs")
    @Expose
    private Long WithRs;

    /**
    * 负载均衡实例所属私有网络唯一ID，如 vpc-bhqkbhdx，
基础网络可传入'0'。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 安全组ID，如 sg-m1cc****。
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * 主可用区ID，如 ："100001" （对应的是广州一区）。
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。<br/>`Filter.Name`和`Filter.Values`皆为必填项。详细的过滤条件如下：
<li> charge-type - String - 是否必填：否 - （过滤条件）按照 CLB 的实例计费模式过滤，包括"PREPAID","POSTPAID_BY_HOUR"。</li>
<li> internet-charge-type - String - 是否必填：否 - （过滤条件）按照 CLB 的网络计费模式过滤，包括"BANDWIDTH_PREPAID","TRAFFIC_POSTPAID_BY_HOUR","BANDWIDTH_POSTPAID_BY_HOUR","BANDWIDTH_PACKAGE"。</li>
<li> master-zone-id - String - 是否必填：否 - （过滤条件）按照 CLB 的主可用区ID过滤，如 ："100001" （对应的是广州一区）。</li>
<li> tag-key - String - 是否必填：否 - （过滤条件）按照 CLB 标签的键过滤。</li>
<li> tag:tag-key - String - 是否必填：否 - （过滤条件）按照CLB标签键值对进行过滤，tag-key使用具体的标签键进行替换。</li>
<li> function-name - String - 是否必填：否 - （过滤条件）按照 CLB 后端绑定的SCF云函数的函数名称过滤。</li>
<li> function-name - String - 是否必填：否 - （过滤条件）按照 CLB 后端绑定的SCF云函数的函数名称过滤。</li>
<li> vip-isp - String - 是否必填：否 - （过滤条件）按照 CLB VIP的运营商类型过滤，如："BGP","INTERNAL","CMCC","CTCC","CUCC"等。</li>
<li> sla-type - String - 是否必填：否 - （过滤条件）按照 CLB 的性能容量型规格过滤，包括"clb.c2.medium","clb.c3.small","clb.c3.medium","clb.c4.small","clb.c4.medium","clb.c4.large","clb.c4.xlarge"。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 负载均衡实例ID。 
     * @return LoadBalancerIds 负载均衡实例ID。
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 负载均衡实例ID。
     * @param LoadBalancerIds 负载均衡实例ID。
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。 
     * @return LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     * @param LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 负载均衡实例的类型。1：通用的负载均衡实例，0：传统型负载均衡实例。如果不传此参数，则查询所有类型的负载均衡实例。 
     * @return Forward 负载均衡实例的类型。1：通用的负载均衡实例，0：传统型负载均衡实例。如果不传此参数，则查询所有类型的负载均衡实例。
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set 负载均衡实例的类型。1：通用的负载均衡实例，0：传统型负载均衡实例。如果不传此参数，则查询所有类型的负载均衡实例。
     * @param Forward 负载均衡实例的类型。1：通用的负载均衡实例，0：传统型负载均衡实例。如果不传此参数，则查询所有类型的负载均衡实例。
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
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
     * Get 腾讯云为负载均衡实例分配的域名，本参数仅对传统型公网负载均衡才有意义。 
     * @return Domain 腾讯云为负载均衡实例分配的域名，本参数仅对传统型公网负载均衡才有意义。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 腾讯云为负载均衡实例分配的域名，本参数仅对传统型公网负载均衡才有意义。
     * @param Domain 腾讯云为负载均衡实例分配的域名，本参数仅对传统型公网负载均衡才有意义。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
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
     * Get 负载均衡绑定的后端服务的外网 IP。 
     * @return BackendPublicIps 负载均衡绑定的后端服务的外网 IP。
     */
    public String [] getBackendPublicIps() {
        return this.BackendPublicIps;
    }

    /**
     * Set 负载均衡绑定的后端服务的外网 IP。
     * @param BackendPublicIps 负载均衡绑定的后端服务的外网 IP。
     */
    public void setBackendPublicIps(String [] BackendPublicIps) {
        this.BackendPublicIps = BackendPublicIps;
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
     * Get 数据偏移量，默认为0。 
     * @return Offset 数据偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，默认为0。
     * @param Offset 数据偏移量，默认为0。
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
     * Get 排序参数，支持以下字段：LoadBalancerName，CreateTime，Domain，LoadBalancerType。 
     * @return OrderBy 排序参数，支持以下字段：LoadBalancerName，CreateTime，Domain，LoadBalancerType。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序参数，支持以下字段：LoadBalancerName，CreateTime，Domain，LoadBalancerType。
     * @param OrderBy 排序参数，支持以下字段：LoadBalancerName，CreateTime，Domain，LoadBalancerType。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 1：倒序，0：顺序，默认按照创建时间倒序。 
     * @return OrderType 1：倒序，0：顺序，默认按照创建时间倒序。
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 1：倒序，0：顺序，默认按照创建时间倒序。
     * @param OrderType 1：倒序，0：顺序，默认按照创建时间倒序。
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 搜索字段，模糊匹配名称、域名、VIP。 
     * @return SearchKey 搜索字段，模糊匹配名称、域名、VIP。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索字段，模糊匹配名称、域名、VIP。
     * @param SearchKey 搜索字段，模糊匹配名称、域名、VIP。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。 
     * @return ProjectId 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。
     * @param ProjectId 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 负载均衡是否绑定后端服务，0：没有绑定后端服务，1：绑定后端服务，-1：查询全部。 
     * @return WithRs 负载均衡是否绑定后端服务，0：没有绑定后端服务，1：绑定后端服务，-1：查询全部。
     */
    public Long getWithRs() {
        return this.WithRs;
    }

    /**
     * Set 负载均衡是否绑定后端服务，0：没有绑定后端服务，1：绑定后端服务，-1：查询全部。
     * @param WithRs 负载均衡是否绑定后端服务，0：没有绑定后端服务，1：绑定后端服务，-1：查询全部。
     */
    public void setWithRs(Long WithRs) {
        this.WithRs = WithRs;
    }

    /**
     * Get 负载均衡实例所属私有网络唯一ID，如 vpc-bhqkbhdx，
基础网络可传入'0'。 
     * @return VpcId 负载均衡实例所属私有网络唯一ID，如 vpc-bhqkbhdx，
基础网络可传入'0'。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 负载均衡实例所属私有网络唯一ID，如 vpc-bhqkbhdx，
基础网络可传入'0'。
     * @param VpcId 负载均衡实例所属私有网络唯一ID，如 vpc-bhqkbhdx，
基础网络可传入'0'。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 安全组ID，如 sg-m1cc****。 
     * @return SecurityGroup 安全组ID，如 sg-m1cc****。
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组ID，如 sg-m1cc****。
     * @param SecurityGroup 安全组ID，如 sg-m1cc****。
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 主可用区ID，如 ："100001" （对应的是广州一区）。 
     * @return MasterZone 主可用区ID，如 ："100001" （对应的是广州一区）。
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set 主可用区ID，如 ："100001" （对应的是广州一区）。
     * @param MasterZone 主可用区ID，如 ："100001" （对应的是广州一区）。
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。<br/>`Filter.Name`和`Filter.Values`皆为必填项。详细的过滤条件如下：
<li> charge-type - String - 是否必填：否 - （过滤条件）按照 CLB 的实例计费模式过滤，包括"PREPAID","POSTPAID_BY_HOUR"。</li>
<li> internet-charge-type - String - 是否必填：否 - （过滤条件）按照 CLB 的网络计费模式过滤，包括"BANDWIDTH_PREPAID","TRAFFIC_POSTPAID_BY_HOUR","BANDWIDTH_POSTPAID_BY_HOUR","BANDWIDTH_PACKAGE"。</li>
<li> master-zone-id - String - 是否必填：否 - （过滤条件）按照 CLB 的主可用区ID过滤，如 ："100001" （对应的是广州一区）。</li>
<li> tag-key - String - 是否必填：否 - （过滤条件）按照 CLB 标签的键过滤。</li>
<li> tag:tag-key - String - 是否必填：否 - （过滤条件）按照CLB标签键值对进行过滤，tag-key使用具体的标签键进行替换。</li>
<li> function-name - String - 是否必填：否 - （过滤条件）按照 CLB 后端绑定的SCF云函数的函数名称过滤。</li>
<li> function-name - String - 是否必填：否 - （过滤条件）按照 CLB 后端绑定的SCF云函数的函数名称过滤。</li>
<li> vip-isp - String - 是否必填：否 - （过滤条件）按照 CLB VIP的运营商类型过滤，如："BGP","INTERNAL","CMCC","CTCC","CUCC"等。</li>
<li> sla-type - String - 是否必填：否 - （过滤条件）按照 CLB 的性能容量型规格过滤，包括"clb.c2.medium","clb.c3.small","clb.c3.medium","clb.c4.small","clb.c4.medium","clb.c4.large","clb.c4.xlarge"。</li> 
     * @return Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。<br/>`Filter.Name`和`Filter.Values`皆为必填项。详细的过滤条件如下：
<li> charge-type - String - 是否必填：否 - （过滤条件）按照 CLB 的实例计费模式过滤，包括"PREPAID","POSTPAID_BY_HOUR"。</li>
<li> internet-charge-type - String - 是否必填：否 - （过滤条件）按照 CLB 的网络计费模式过滤，包括"BANDWIDTH_PREPAID","TRAFFIC_POSTPAID_BY_HOUR","BANDWIDTH_POSTPAID_BY_HOUR","BANDWIDTH_PACKAGE"。</li>
<li> master-zone-id - String - 是否必填：否 - （过滤条件）按照 CLB 的主可用区ID过滤，如 ："100001" （对应的是广州一区）。</li>
<li> tag-key - String - 是否必填：否 - （过滤条件）按照 CLB 标签的键过滤。</li>
<li> tag:tag-key - String - 是否必填：否 - （过滤条件）按照CLB标签键值对进行过滤，tag-key使用具体的标签键进行替换。</li>
<li> function-name - String - 是否必填：否 - （过滤条件）按照 CLB 后端绑定的SCF云函数的函数名称过滤。</li>
<li> function-name - String - 是否必填：否 - （过滤条件）按照 CLB 后端绑定的SCF云函数的函数名称过滤。</li>
<li> vip-isp - String - 是否必填：否 - （过滤条件）按照 CLB VIP的运营商类型过滤，如："BGP","INTERNAL","CMCC","CTCC","CUCC"等。</li>
<li> sla-type - String - 是否必填：否 - （过滤条件）按照 CLB 的性能容量型规格过滤，包括"clb.c2.medium","clb.c3.small","clb.c3.medium","clb.c4.small","clb.c4.medium","clb.c4.large","clb.c4.xlarge"。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。<br/>`Filter.Name`和`Filter.Values`皆为必填项。详细的过滤条件如下：
<li> charge-type - String - 是否必填：否 - （过滤条件）按照 CLB 的实例计费模式过滤，包括"PREPAID","POSTPAID_BY_HOUR"。</li>
<li> internet-charge-type - String - 是否必填：否 - （过滤条件）按照 CLB 的网络计费模式过滤，包括"BANDWIDTH_PREPAID","TRAFFIC_POSTPAID_BY_HOUR","BANDWIDTH_POSTPAID_BY_HOUR","BANDWIDTH_PACKAGE"。</li>
<li> master-zone-id - String - 是否必填：否 - （过滤条件）按照 CLB 的主可用区ID过滤，如 ："100001" （对应的是广州一区）。</li>
<li> tag-key - String - 是否必填：否 - （过滤条件）按照 CLB 标签的键过滤。</li>
<li> tag:tag-key - String - 是否必填：否 - （过滤条件）按照CLB标签键值对进行过滤，tag-key使用具体的标签键进行替换。</li>
<li> function-name - String - 是否必填：否 - （过滤条件）按照 CLB 后端绑定的SCF云函数的函数名称过滤。</li>
<li> function-name - String - 是否必填：否 - （过滤条件）按照 CLB 后端绑定的SCF云函数的函数名称过滤。</li>
<li> vip-isp - String - 是否必填：否 - （过滤条件）按照 CLB VIP的运营商类型过滤，如："BGP","INTERNAL","CMCC","CTCC","CUCC"等。</li>
<li> sla-type - String - 是否必填：否 - （过滤条件）按照 CLB 的性能容量型规格过滤，包括"clb.c2.medium","clb.c3.small","clb.c3.medium","clb.c4.small","clb.c4.medium","clb.c4.large","clb.c4.xlarge"。</li>
     * @param Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。<br/>`Filter.Name`和`Filter.Values`皆为必填项。详细的过滤条件如下：
<li> charge-type - String - 是否必填：否 - （过滤条件）按照 CLB 的实例计费模式过滤，包括"PREPAID","POSTPAID_BY_HOUR"。</li>
<li> internet-charge-type - String - 是否必填：否 - （过滤条件）按照 CLB 的网络计费模式过滤，包括"BANDWIDTH_PREPAID","TRAFFIC_POSTPAID_BY_HOUR","BANDWIDTH_POSTPAID_BY_HOUR","BANDWIDTH_PACKAGE"。</li>
<li> master-zone-id - String - 是否必填：否 - （过滤条件）按照 CLB 的主可用区ID过滤，如 ："100001" （对应的是广州一区）。</li>
<li> tag-key - String - 是否必填：否 - （过滤条件）按照 CLB 标签的键过滤。</li>
<li> tag:tag-key - String - 是否必填：否 - （过滤条件）按照CLB标签键值对进行过滤，tag-key使用具体的标签键进行替换。</li>
<li> function-name - String - 是否必填：否 - （过滤条件）按照 CLB 后端绑定的SCF云函数的函数名称过滤。</li>
<li> function-name - String - 是否必填：否 - （过滤条件）按照 CLB 后端绑定的SCF云函数的函数名称过滤。</li>
<li> vip-isp - String - 是否必填：否 - （过滤条件）按照 CLB VIP的运营商类型过滤，如："BGP","INTERNAL","CMCC","CTCC","CUCC"等。</li>
<li> sla-type - String - 是否必填：否 - （过滤条件）按照 CLB 的性能容量型规格过滤，包括"clb.c2.medium","clb.c3.small","clb.c3.medium","clb.c4.small","clb.c4.medium","clb.c4.large","clb.c4.xlarge"。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancersRequest(DescribeLoadBalancersRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LoadBalancerVips != null) {
            this.LoadBalancerVips = new String[source.LoadBalancerVips.length];
            for (int i = 0; i < source.LoadBalancerVips.length; i++) {
                this.LoadBalancerVips[i] = new String(source.LoadBalancerVips[i]);
            }
        }
        if (source.BackendPublicIps != null) {
            this.BackendPublicIps = new String[source.BackendPublicIps.length];
            for (int i = 0; i < source.BackendPublicIps.length; i++) {
                this.BackendPublicIps[i] = new String(source.BackendPublicIps[i]);
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
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.WithRs != null) {
            this.WithRs = new Long(source.WithRs);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamArraySimple(map, prefix + "BackendPublicIps.", this.BackendPublicIps);
        this.setParamArraySimple(map, prefix + "BackendPrivateIps.", this.BackendPrivateIps);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WithRs", this.WithRs);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

