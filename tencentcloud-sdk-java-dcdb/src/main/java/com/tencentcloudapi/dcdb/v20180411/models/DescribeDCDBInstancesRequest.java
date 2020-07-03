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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDCDBInstancesRequest extends AbstractModel{

    /**
    * 按照一个或者多个实例 ID 查询。实例 ID 形如：dcdbt-2t4cf98d
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 搜索的字段名，当前支持的值有：instancename、vip、all。传 instancename 表示按实例名进行搜索；传 vip 表示按内网IP进行搜索；传 all 将会按实例ID、实例名和内网IP进行搜索。
    */
    @SerializedName("SearchName")
    @Expose
    private String SearchName;

    /**
    * 搜索的关键字，支持模糊搜索。多个关键字使用换行符（'\n'）分割。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 按项目 ID 查询
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 是否根据 VPC 网络来搜索
    */
    @SerializedName("IsFilterVpc")
    @Expose
    private Boolean IsFilterVpc;

    /**
    * 私有网络 ID， IsFilterVpc 为 1 时有效
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络的子网 ID， IsFilterVpc 为 1 时有效
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 排序字段， projectId， createtime， instancename 三者之一
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序类型， desc 或者 asc
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为 10，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 1非独享集群，2独享集群， 0全部
    */
    @SerializedName("ExclusterType")
    @Expose
    private Long ExclusterType;

    /**
    * 标识是否使用ExclusterType字段, false不使用，true使用
    */
    @SerializedName("IsFilterExcluster")
    @Expose
    private Boolean IsFilterExcluster;

    /**
    * 独享集群ID
    */
    @SerializedName("ExclusterIds")
    @Expose
    private String [] ExclusterIds;

    /**
     * Get 按照一个或者多个实例 ID 查询。实例 ID 形如：dcdbt-2t4cf98d 
     * @return InstanceIds 按照一个或者多个实例 ID 查询。实例 ID 形如：dcdbt-2t4cf98d
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 按照一个或者多个实例 ID 查询。实例 ID 形如：dcdbt-2t4cf98d
     * @param InstanceIds 按照一个或者多个实例 ID 查询。实例 ID 形如：dcdbt-2t4cf98d
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 搜索的字段名，当前支持的值有：instancename、vip、all。传 instancename 表示按实例名进行搜索；传 vip 表示按内网IP进行搜索；传 all 将会按实例ID、实例名和内网IP进行搜索。 
     * @return SearchName 搜索的字段名，当前支持的值有：instancename、vip、all。传 instancename 表示按实例名进行搜索；传 vip 表示按内网IP进行搜索；传 all 将会按实例ID、实例名和内网IP进行搜索。
     */
    public String getSearchName() {
        return this.SearchName;
    }

    /**
     * Set 搜索的字段名，当前支持的值有：instancename、vip、all。传 instancename 表示按实例名进行搜索；传 vip 表示按内网IP进行搜索；传 all 将会按实例ID、实例名和内网IP进行搜索。
     * @param SearchName 搜索的字段名，当前支持的值有：instancename、vip、all。传 instancename 表示按实例名进行搜索；传 vip 表示按内网IP进行搜索；传 all 将会按实例ID、实例名和内网IP进行搜索。
     */
    public void setSearchName(String SearchName) {
        this.SearchName = SearchName;
    }

    /**
     * Get 搜索的关键字，支持模糊搜索。多个关键字使用换行符（'\n'）分割。 
     * @return SearchKey 搜索的关键字，支持模糊搜索。多个关键字使用换行符（'\n'）分割。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索的关键字，支持模糊搜索。多个关键字使用换行符（'\n'）分割。
     * @param SearchKey 搜索的关键字，支持模糊搜索。多个关键字使用换行符（'\n'）分割。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 按项目 ID 查询 
     * @return ProjectIds 按项目 ID 查询
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 按项目 ID 查询
     * @param ProjectIds 按项目 ID 查询
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 是否根据 VPC 网络来搜索 
     * @return IsFilterVpc 是否根据 VPC 网络来搜索
     */
    public Boolean getIsFilterVpc() {
        return this.IsFilterVpc;
    }

    /**
     * Set 是否根据 VPC 网络来搜索
     * @param IsFilterVpc 是否根据 VPC 网络来搜索
     */
    public void setIsFilterVpc(Boolean IsFilterVpc) {
        this.IsFilterVpc = IsFilterVpc;
    }

    /**
     * Get 私有网络 ID， IsFilterVpc 为 1 时有效 
     * @return VpcId 私有网络 ID， IsFilterVpc 为 1 时有效
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络 ID， IsFilterVpc 为 1 时有效
     * @param VpcId 私有网络 ID， IsFilterVpc 为 1 时有效
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络的子网 ID， IsFilterVpc 为 1 时有效 
     * @return SubnetId 私有网络的子网 ID， IsFilterVpc 为 1 时有效
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络的子网 ID， IsFilterVpc 为 1 时有效
     * @param SubnetId 私有网络的子网 ID， IsFilterVpc 为 1 时有效
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 排序字段， projectId， createtime， instancename 三者之一 
     * @return OrderBy 排序字段， projectId， createtime， instancename 三者之一
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段， projectId， createtime， instancename 三者之一
     * @param OrderBy 排序字段， projectId， createtime， instancename 三者之一
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序类型， desc 或者 asc 
     * @return OrderByType 排序类型， desc 或者 asc
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序类型， desc 或者 asc
     * @param OrderByType 排序类型， desc 或者 asc
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 偏移量，默认为 0 
     * @return Offset 偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0
     * @param Offset 偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为 10，最大值为 100。 
     * @return Limit 返回数量，默认为 10，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 10，最大值为 100。
     * @param Limit 返回数量，默认为 10，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 1非独享集群，2独享集群， 0全部 
     * @return ExclusterType 1非独享集群，2独享集群， 0全部
     */
    public Long getExclusterType() {
        return this.ExclusterType;
    }

    /**
     * Set 1非独享集群，2独享集群， 0全部
     * @param ExclusterType 1非独享集群，2独享集群， 0全部
     */
    public void setExclusterType(Long ExclusterType) {
        this.ExclusterType = ExclusterType;
    }

    /**
     * Get 标识是否使用ExclusterType字段, false不使用，true使用 
     * @return IsFilterExcluster 标识是否使用ExclusterType字段, false不使用，true使用
     */
    public Boolean getIsFilterExcluster() {
        return this.IsFilterExcluster;
    }

    /**
     * Set 标识是否使用ExclusterType字段, false不使用，true使用
     * @param IsFilterExcluster 标识是否使用ExclusterType字段, false不使用，true使用
     */
    public void setIsFilterExcluster(Boolean IsFilterExcluster) {
        this.IsFilterExcluster = IsFilterExcluster;
    }

    /**
     * Get 独享集群ID 
     * @return ExclusterIds 独享集群ID
     */
    public String [] getExclusterIds() {
        return this.ExclusterIds;
    }

    /**
     * Set 独享集群ID
     * @param ExclusterIds 独享集群ID
     */
    public void setExclusterIds(String [] ExclusterIds) {
        this.ExclusterIds = ExclusterIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "SearchName", this.SearchName);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "IsFilterVpc", this.IsFilterVpc);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ExclusterType", this.ExclusterType);
        this.setParamSimple(map, prefix + "IsFilterExcluster", this.IsFilterExcluster);
        this.setParamArraySimple(map, prefix + "ExclusterIds.", this.ExclusterIds);

    }
}

