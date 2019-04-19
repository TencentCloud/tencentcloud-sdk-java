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

public class DescribeLoadBalancersRequest  extends AbstractModel{

    /**
    * 负载均衡实例 ID。
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
    * 1：应用型，0：传统型。
    */
    @SerializedName("Forward")
    @Expose
    private Integer Forward;

    /**
    * 负载均衡实例名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 腾讯云为负载均衡实例分配的域名，应用型负载均衡该字段无意义。
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
    * 后端云服务器的外网 IP。
    */
    @SerializedName("BackendPublicIps")
    @Expose
    private String [] BackendPublicIps;

    /**
    * 后端云服务器的内网 IP。
    */
    @SerializedName("BackendPrivateIps")
    @Expose
    private String [] BackendPrivateIps;

    /**
    * 数据偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回负载均衡个数，默认为 20。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 排序字段，支持以下字段：LoadBalancerName，CreateTime，Domain，LoadBalancerType。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 1：倒序，0：顺序，默认按照创建时间倒序。
    */
    @SerializedName("OrderType")
    @Expose
    private Integer OrderType;

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
    private Integer ProjectId;

    /**
    * 查询的负载均衡是否绑定后端服务器，0：没有绑定云服务器，1：绑定云服务器，-1：查询全部。
    */
    @SerializedName("WithRs")
    @Expose
    private Integer WithRs;

    /**
    * 负载均衡实例所属网络，如 vpc-bhqkbhdx
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * 获取负载均衡实例 ID。
     * @return LoadBalancerIds 负载均衡实例 ID。
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * 设置负载均衡实例 ID。
     * @param LoadBalancerIds 负载均衡实例 ID。
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * 获取负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     * @return LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * 设置负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     * @param LoadBalancerType 负载均衡实例的网络类型：
OPEN：公网属性， INTERNAL：内网属性。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * 获取1：应用型，0：传统型。
     * @return Forward 1：应用型，0：传统型。
     */
    public Integer getForward() {
        return this.Forward;
    }

    /**
     * 设置1：应用型，0：传统型。
     * @param Forward 1：应用型，0：传统型。
     */
    public void setForward(Integer Forward) {
        this.Forward = Forward;
    }

    /**
     * 获取负载均衡实例名称。
     * @return LoadBalancerName 负载均衡实例名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * 设置负载均衡实例名称。
     * @param LoadBalancerName 负载均衡实例名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * 获取腾讯云为负载均衡实例分配的域名，应用型负载均衡该字段无意义。
     * @return Domain 腾讯云为负载均衡实例分配的域名，应用型负载均衡该字段无意义。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置腾讯云为负载均衡实例分配的域名，应用型负载均衡该字段无意义。
     * @param Domain 腾讯云为负载均衡实例分配的域名，应用型负载均衡该字段无意义。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取负载均衡实例的 VIP 地址，支持多个。
     * @return LoadBalancerVips 负载均衡实例的 VIP 地址，支持多个。
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * 设置负载均衡实例的 VIP 地址，支持多个。
     * @param LoadBalancerVips 负载均衡实例的 VIP 地址，支持多个。
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * 获取后端云服务器的外网 IP。
     * @return BackendPublicIps 后端云服务器的外网 IP。
     */
    public String [] getBackendPublicIps() {
        return this.BackendPublicIps;
    }

    /**
     * 设置后端云服务器的外网 IP。
     * @param BackendPublicIps 后端云服务器的外网 IP。
     */
    public void setBackendPublicIps(String [] BackendPublicIps) {
        this.BackendPublicIps = BackendPublicIps;
    }

    /**
     * 获取后端云服务器的内网 IP。
     * @return BackendPrivateIps 后端云服务器的内网 IP。
     */
    public String [] getBackendPrivateIps() {
        return this.BackendPrivateIps;
    }

    /**
     * 设置后端云服务器的内网 IP。
     * @param BackendPrivateIps 后端云服务器的内网 IP。
     */
    public void setBackendPrivateIps(String [] BackendPrivateIps) {
        this.BackendPrivateIps = BackendPrivateIps;
    }

    /**
     * 获取数据偏移量，默认为 0。
     * @return Offset 数据偏移量，默认为 0。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置数据偏移量，默认为 0。
     * @param Offset 数据偏移量，默认为 0。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回负载均衡个数，默认为 20。
     * @return Limit 返回负载均衡个数，默认为 20。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回负载均衡个数，默认为 20。
     * @param Limit 返回负载均衡个数，默认为 20。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取排序字段，支持以下字段：LoadBalancerName，CreateTime，Domain，LoadBalancerType。
     * @return OrderBy 排序字段，支持以下字段：LoadBalancerName，CreateTime，Domain，LoadBalancerType。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * 设置排序字段，支持以下字段：LoadBalancerName，CreateTime，Domain，LoadBalancerType。
     * @param OrderBy 排序字段，支持以下字段：LoadBalancerName，CreateTime，Domain，LoadBalancerType。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * 获取1：倒序，0：顺序，默认按照创建时间倒序。
     * @return OrderType 1：倒序，0：顺序，默认按照创建时间倒序。
     */
    public Integer getOrderType() {
        return this.OrderType;
    }

    /**
     * 设置1：倒序，0：顺序，默认按照创建时间倒序。
     * @param OrderType 1：倒序，0：顺序，默认按照创建时间倒序。
     */
    public void setOrderType(Integer OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * 获取搜索字段，模糊匹配名称、域名、VIP。
     * @return SearchKey 搜索字段，模糊匹配名称、域名、VIP。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * 设置搜索字段，模糊匹配名称、域名、VIP。
     * @param SearchKey 搜索字段，模糊匹配名称、域名、VIP。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * 获取负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。
     * @return ProjectId 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。
     * @param ProjectId 负载均衡实例所属的项目 ID，可以通过 DescribeProject 接口获取。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取查询的负载均衡是否绑定后端服务器，0：没有绑定云服务器，1：绑定云服务器，-1：查询全部。
     * @return WithRs 查询的负载均衡是否绑定后端服务器，0：没有绑定云服务器，1：绑定云服务器，-1：查询全部。
     */
    public Integer getWithRs() {
        return this.WithRs;
    }

    /**
     * 设置查询的负载均衡是否绑定后端服务器，0：没有绑定云服务器，1：绑定云服务器，-1：查询全部。
     * @param WithRs 查询的负载均衡是否绑定后端服务器，0：没有绑定云服务器，1：绑定云服务器，-1：查询全部。
     */
    public void setWithRs(Integer WithRs) {
        this.WithRs = WithRs;
    }

    /**
     * 获取负载均衡实例所属网络，如 vpc-bhqkbhdx
     * @return VpcId 负载均衡实例所属网络，如 vpc-bhqkbhdx
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置负载均衡实例所属网络，如 vpc-bhqkbhdx
     * @param VpcId 负载均衡实例所属网络，如 vpc-bhqkbhdx
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

