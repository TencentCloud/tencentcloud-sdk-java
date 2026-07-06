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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * <p>每页输出的实例列表的大小，即每页输出的实例数量，默认值20，取值范围为[1,1000]。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量，取Limit整数倍。<br>计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>实例 ID，如：kee-6ubh****。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>排序依据。枚举范围如下所示。 <ul><li>projectId：实例按照项目ID排序。</li><li>createtime：实例按照创建时间排序。</li><li>instancename：实例按照实例名称排序。</li><li>type：实例按照类型排序。</li><li>curDeadline：实例按照到期时间排序。</li></ul></p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序方式。<ul><li>1：倒序。默认为倒序。</li><li>0：顺序。</li></ul></p>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * <p>私有网络ID数组。数组下标从0开始，如果不传则默认选择基础网络，如：47525</p>
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * <p>子网ID数组，数组下标从0开始，如：56854</p>
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * <p>项目ID 组成的数组，数组下标从0开始</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * <p>查找关键字，可输入实例的ID或者实例名称。</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk</p>
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * <p>子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2</p>
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * <p>实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul></p>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>续费模式。- 0：手动续费。- 1：自动续费。- 2：到期不再续费。</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long [] AutoRenew;

    /**
    * <p>计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul></p>
    */
    @SerializedName("BillingMode")
    @Expose
    private String BillingMode;

    /**
    * <p>实例类型。</p><p>枚举值：</p><ul><li>11： 存储版标准架构。</li><li>12： 存储版集群架构。</li><li>13： 极速版标准架构。</li><li>14： 极速版集群架构。</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>搜索关键词：支持实例 ID、实例名称、私有网络IP地址。</p>
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * <p>内部参数，用户可忽略。</p>
    */
    @SerializedName("TypeList")
    @Expose
    private Long [] TypeList;

    /**
    * <p>内部参数，用户可忽略。</p>
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * <p>废弃字段。请使用TagList传参。</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo InstanceTags;

    /**
    * <p>根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。</p>
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * <p>根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。</p>
    */
    @SerializedName("TagList")
    @Expose
    private InstanceTagInfo [] TagList;

    /**
     * Get <p>每页输出的实例列表的大小，即每页输出的实例数量，默认值20，取值范围为[1,1000]。</p> 
     * @return Limit <p>每页输出的实例列表的大小，即每页输出的实例数量，默认值20，取值范围为[1,1000]。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页输出的实例列表的大小，即每页输出的实例数量，默认值20，取值范围为[1,1000]。</p>
     * @param Limit <p>每页输出的实例列表的大小，即每页输出的实例数量，默认值20，取值范围为[1,1000]。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量，取Limit整数倍。<br>计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。</p> 
     * @return Offset <p>分页偏移量，取Limit整数倍。<br>计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，取Limit整数倍。<br>计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。</p>
     * @param Offset <p>分页偏移量，取Limit整数倍。<br>计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>实例 ID，如：kee-6ubh****。</p> 
     * @return InstanceId <p>实例 ID，如：kee-6ubh****。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，如：kee-6ubh****。</p>
     * @param InstanceId <p>实例 ID，如：kee-6ubh****。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>排序依据。枚举范围如下所示。 <ul><li>projectId：实例按照项目ID排序。</li><li>createtime：实例按照创建时间排序。</li><li>instancename：实例按照实例名称排序。</li><li>type：实例按照类型排序。</li><li>curDeadline：实例按照到期时间排序。</li></ul></p> 
     * @return OrderBy <p>排序依据。枚举范围如下所示。 <ul><li>projectId：实例按照项目ID排序。</li><li>createtime：实例按照创建时间排序。</li><li>instancename：实例按照实例名称排序。</li><li>type：实例按照类型排序。</li><li>curDeadline：实例按照到期时间排序。</li></ul></p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序依据。枚举范围如下所示。 <ul><li>projectId：实例按照项目ID排序。</li><li>createtime：实例按照创建时间排序。</li><li>instancename：实例按照实例名称排序。</li><li>type：实例按照类型排序。</li><li>curDeadline：实例按照到期时间排序。</li></ul></p>
     * @param OrderBy <p>排序依据。枚举范围如下所示。 <ul><li>projectId：实例按照项目ID排序。</li><li>createtime：实例按照创建时间排序。</li><li>instancename：实例按照实例名称排序。</li><li>type：实例按照类型排序。</li><li>curDeadline：实例按照到期时间排序。</li></ul></p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序方式。<ul><li>1：倒序。默认为倒序。</li><li>0：顺序。</li></ul></p> 
     * @return OrderType <p>排序方式。<ul><li>1：倒序。默认为倒序。</li><li>0：顺序。</li></ul></p>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>排序方式。<ul><li>1：倒序。默认为倒序。</li><li>0：顺序。</li></ul></p>
     * @param OrderType <p>排序方式。<ul><li>1：倒序。默认为倒序。</li><li>0：顺序。</li></ul></p>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>私有网络ID数组。数组下标从0开始，如果不传则默认选择基础网络，如：47525</p> 
     * @return VpcIds <p>私有网络ID数组。数组下标从0开始，如果不传则默认选择基础网络，如：47525</p>
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set <p>私有网络ID数组。数组下标从0开始，如果不传则默认选择基础网络，如：47525</p>
     * @param VpcIds <p>私有网络ID数组。数组下标从0开始，如果不传则默认选择基础网络，如：47525</p>
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get <p>子网ID数组，数组下标从0开始，如：56854</p> 
     * @return SubnetIds <p>子网ID数组，数组下标从0开始，如：56854</p>
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set <p>子网ID数组，数组下标从0开始，如：56854</p>
     * @param SubnetIds <p>子网ID数组，数组下标从0开始，如：56854</p>
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get <p>项目ID 组成的数组，数组下标从0开始</p> 
     * @return ProjectIds <p>项目ID 组成的数组，数组下标从0开始</p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>项目ID 组成的数组，数组下标从0开始</p>
     * @param ProjectIds <p>项目ID 组成的数组，数组下标从0开始</p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>查找关键字，可输入实例的ID或者实例名称。</p> 
     * @return SearchKey <p>查找关键字，可输入实例的ID或者实例名称。</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>查找关键字，可输入实例的ID或者实例名称。</p>
     * @param SearchKey <p>查找关键字，可输入实例的ID或者实例名称。</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get <p>实例名称。</p> 
     * @return InstanceName <p>实例名称。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。</p>
     * @param InstanceName <p>实例名称。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk</p> 
     * @return UniqVpcIds <p>私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk</p>
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set <p>私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk</p>
     * @param UniqVpcIds <p>私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk</p>
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * Get <p>子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2</p> 
     * @return UniqSubnetIds <p>子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2</p>
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set <p>子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2</p>
     * @param UniqSubnetIds <p>子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2</p>
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get <p>实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul></p> 
     * @return Status <p>实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul></p>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul></p>
     * @param Status <p>实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul></p>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>续费模式。- 0：手动续费。- 1：自动续费。- 2：到期不再续费。</p> 
     * @return AutoRenew <p>续费模式。- 0：手动续费。- 1：自动续费。- 2：到期不再续费。</p>
     */
    public Long [] getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>续费模式。- 0：手动续费。- 1：自动续费。- 2：到期不再续费。</p>
     * @param AutoRenew <p>续费模式。- 0：手动续费。- 1：自动续费。- 2：到期不再续费。</p>
     */
    public void setAutoRenew(Long [] AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul></p> 
     * @return BillingMode <p>计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul></p>
     */
    public String getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul></p>
     * @param BillingMode <p>计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul></p>
     */
    public void setBillingMode(String BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>实例类型。</p><p>枚举值：</p><ul><li>11： 存储版标准架构。</li><li>12： 存储版集群架构。</li><li>13： 极速版标准架构。</li><li>14： 极速版集群架构。</li></ul> 
     * @return Type <p>实例类型。</p><p>枚举值：</p><ul><li>11： 存储版标准架构。</li><li>12： 存储版集群架构。</li><li>13： 极速版标准架构。</li><li>14： 极速版集群架构。</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>实例类型。</p><p>枚举值：</p><ul><li>11： 存储版标准架构。</li><li>12： 存储版集群架构。</li><li>13： 极速版标准架构。</li><li>14： 极速版集群架构。</li></ul>
     * @param Type <p>实例类型。</p><p>枚举值：</p><ul><li>11： 存储版标准架构。</li><li>12： 存储版集群架构。</li><li>13： 极速版标准架构。</li><li>14： 极速版集群架构。</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>搜索关键词：支持实例 ID、实例名称、私有网络IP地址。</p> 
     * @return SearchKeys <p>搜索关键词：支持实例 ID、实例名称、私有网络IP地址。</p>
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set <p>搜索关键词：支持实例 ID、实例名称、私有网络IP地址。</p>
     * @param SearchKeys <p>搜索关键词：支持实例 ID、实例名称、私有网络IP地址。</p>
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get <p>内部参数，用户可忽略。</p> 
     * @return TypeList <p>内部参数，用户可忽略。</p>
     */
    public Long [] getTypeList() {
        return this.TypeList;
    }

    /**
     * Set <p>内部参数，用户可忽略。</p>
     * @param TypeList <p>内部参数，用户可忽略。</p>
     */
    public void setTypeList(Long [] TypeList) {
        this.TypeList = TypeList;
    }

    /**
     * Get <p>内部参数，用户可忽略。</p> 
     * @return MonitorVersion <p>内部参数，用户可忽略。</p>
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set <p>内部参数，用户可忽略。</p>
     * @param MonitorVersion <p>内部参数，用户可忽略。</p>
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get <p>废弃字段。请使用TagList传参。</p> 
     * @return InstanceTags <p>废弃字段。请使用TagList传参。</p>
     * @deprecated
     */
    @Deprecated
    public InstanceTagInfo getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>废弃字段。请使用TagList传参。</p>
     * @param InstanceTags <p>废弃字段。请使用TagList传参。</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceTags(InstanceTagInfo InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。</p> 
     * @return TagKeys <p>根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。</p>
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set <p>根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。</p>
     * @param TagKeys <p>根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。</p>
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get <p>根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。</p> 
     * @return TagList <p>根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。</p>
     */
    public InstanceTagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。</p>
     * @param TagList <p>根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。</p>
     */
    public void setTagList(InstanceTagInfo [] TagList) {
        this.TagList = TagList;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.UniqVpcIds != null) {
            this.UniqVpcIds = new String[source.UniqVpcIds.length];
            for (int i = 0; i < source.UniqVpcIds.length; i++) {
                this.UniqVpcIds[i] = new String(source.UniqVpcIds[i]);
            }
        }
        if (source.UniqSubnetIds != null) {
            this.UniqSubnetIds = new String[source.UniqSubnetIds.length];
            for (int i = 0; i < source.UniqSubnetIds.length; i++) {
                this.UniqSubnetIds[i] = new String(source.UniqSubnetIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long[source.AutoRenew.length];
            for (int i = 0; i < source.AutoRenew.length; i++) {
                this.AutoRenew[i] = new Long(source.AutoRenew[i]);
            }
        }
        if (source.BillingMode != null) {
            this.BillingMode = new String(source.BillingMode);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SearchKeys != null) {
            this.SearchKeys = new String[source.SearchKeys.length];
            for (int i = 0; i < source.SearchKeys.length; i++) {
                this.SearchKeys[i] = new String(source.SearchKeys[i]);
            }
        }
        if (source.TypeList != null) {
            this.TypeList = new Long[source.TypeList.length];
            for (int i = 0; i < source.TypeList.length; i++) {
                this.TypeList[i] = new Long(source.TypeList[i]);
            }
        }
        if (source.MonitorVersion != null) {
            this.MonitorVersion = new String(source.MonitorVersion);
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTagInfo(source.InstanceTags);
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new InstanceTagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new InstanceTagInfo(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "UniqVpcIds.", this.UniqVpcIds);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "AutoRenew.", this.AutoRenew);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamArraySimple(map, prefix + "TypeList.", this.TypeList);
        this.setParamSimple(map, prefix + "MonitorVersion", this.MonitorVersion);
        this.setParamObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

