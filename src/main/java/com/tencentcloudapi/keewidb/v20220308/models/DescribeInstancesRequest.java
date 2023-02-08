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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * 每页输出的实例列表的大小，即每页输出的实例数量，默认值20，取值范围为[1,1000]。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，取Limit整数倍。
计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 实例 ID，如：kee-6ubh****。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 排序依据。枚举范围如下所示。 <ul><li>projectId：实例按照项目ID排序。</li><li>createtime：实例按照创建时间排序。</li><li>instancename：实例按照实例名称排序。</li><li>type：实例按照类型排序。</li><li>curDeadline：实例按照到期时间排序。</li></ul>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式。<ul><li>1：倒序。默认为倒序。</li><li>0：顺序。</li></ul>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 私有网络ID数组。数组下标从0开始，如果不传则默认选择基础网络，如：47525
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * 子网ID数组，数组下标从0开始，如：56854
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 项目ID 组成的数组，数组下标从0开始
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 查找关键字，可输入实例的ID或者实例名称。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 包年包月计费的续费模式。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</ul>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long [] AutoRenew;

    /**
    * 计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private String BillingMode;

    /**
    * 实例类型。<ul><li>13：标准版。</li><li>14：集群版。</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 搜索关键词：支持实例 ID、实例名称、私有网络IP地址。
    */
    @SerializedName("SearchKeys")
    @Expose
    private String [] SearchKeys;

    /**
    * 内部参数，用户可忽略。
    */
    @SerializedName("TypeList")
    @Expose
    private Long [] TypeList;

    /**
    * 内部参数，用户可忽略。
    */
    @SerializedName("MonitorVersion")
    @Expose
    private String MonitorVersion;

    /**
    * 根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo InstanceTags;

    /**
    * 根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
     * Get 每页输出的实例列表的大小，即每页输出的实例数量，默认值20，取值范围为[1,1000]。 
     * @return Limit 每页输出的实例列表的大小，即每页输出的实例数量，默认值20，取值范围为[1,1000]。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页输出的实例列表的大小，即每页输出的实例数量，默认值20，取值范围为[1,1000]。
     * @param Limit 每页输出的实例列表的大小，即每页输出的实例数量，默认值20，取值范围为[1,1000]。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，取Limit整数倍。
计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。 
     * @return Offset 分页偏移量，取Limit整数倍。
计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，取Limit整数倍。
计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。
     * @param Offset 分页偏移量，取Limit整数倍。
计算公式为offset=limit*(页码-1)。例如 limit=10，第1页offset就为0，第2页offset就为10，依次类推。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 实例 ID，如：kee-6ubh****。 
     * @return InstanceId 实例 ID，如：kee-6ubh****。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，如：kee-6ubh****。
     * @param InstanceId 实例 ID，如：kee-6ubh****。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 排序依据。枚举范围如下所示。 <ul><li>projectId：实例按照项目ID排序。</li><li>createtime：实例按照创建时间排序。</li><li>instancename：实例按照实例名称排序。</li><li>type：实例按照类型排序。</li><li>curDeadline：实例按照到期时间排序。</li></ul> 
     * @return OrderBy 排序依据。枚举范围如下所示。 <ul><li>projectId：实例按照项目ID排序。</li><li>createtime：实例按照创建时间排序。</li><li>instancename：实例按照实例名称排序。</li><li>type：实例按照类型排序。</li><li>curDeadline：实例按照到期时间排序。</li></ul>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序依据。枚举范围如下所示。 <ul><li>projectId：实例按照项目ID排序。</li><li>createtime：实例按照创建时间排序。</li><li>instancename：实例按照实例名称排序。</li><li>type：实例按照类型排序。</li><li>curDeadline：实例按照到期时间排序。</li></ul>
     * @param OrderBy 排序依据。枚举范围如下所示。 <ul><li>projectId：实例按照项目ID排序。</li><li>createtime：实例按照创建时间排序。</li><li>instancename：实例按照实例名称排序。</li><li>type：实例按照类型排序。</li><li>curDeadline：实例按照到期时间排序。</li></ul>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式。<ul><li>1：倒序。默认为倒序。</li><li>0：顺序。</li></ul> 
     * @return OrderType 排序方式。<ul><li>1：倒序。默认为倒序。</li><li>0：顺序。</li></ul>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序方式。<ul><li>1：倒序。默认为倒序。</li><li>0：顺序。</li></ul>
     * @param OrderType 排序方式。<ul><li>1：倒序。默认为倒序。</li><li>0：顺序。</li></ul>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 私有网络ID数组。数组下标从0开始，如果不传则默认选择基础网络，如：47525 
     * @return VpcIds 私有网络ID数组。数组下标从0开始，如果不传则默认选择基础网络，如：47525
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set 私有网络ID数组。数组下标从0开始，如果不传则默认选择基础网络，如：47525
     * @param VpcIds 私有网络ID数组。数组下标从0开始，如果不传则默认选择基础网络，如：47525
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get 子网ID数组，数组下标从0开始，如：56854 
     * @return SubnetIds 子网ID数组，数组下标从0开始，如：56854
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网ID数组，数组下标从0开始，如：56854
     * @param SubnetIds 子网ID数组，数组下标从0开始，如：56854
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 项目ID 组成的数组，数组下标从0开始 
     * @return ProjectIds 项目ID 组成的数组，数组下标从0开始
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目ID 组成的数组，数组下标从0开始
     * @param ProjectIds 项目ID 组成的数组，数组下标从0开始
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 查找关键字，可输入实例的ID或者实例名称。 
     * @return SearchKey 查找关键字，可输入实例的ID或者实例名称。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 查找关键字，可输入实例的ID或者实例名称。
     * @param SearchKey 查找关键字，可输入实例的ID或者实例名称。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk 
     * @return UniqVpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     * @param UniqVpcIds 私有网络ID数组，数组下标从0开始，如果不传则默认选择基础网络，如：vpc-sad23jfdfk
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * Get 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2 
     * @return UniqSubnetIds 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     * @param UniqSubnetIds 子网ID数组，数组下标从0开始，如：subnet-fdj24n34j2
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul> 
     * @return Status 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     * @param Status 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 包年包月计费的续费模式。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</ul> 
     * @return AutoRenew 包年包月计费的续费模式。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</ul>
     */
    public Long [] getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 包年包月计费的续费模式。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</ul>
     * @param AutoRenew 包年包月计费的续费模式。<ul><li>0：默认状态，指手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</ul>
     */
    public void setAutoRenew(Long [] AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul> 
     * @return BillingMode 计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
     */
    public String getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set 计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
     * @param BillingMode 计费模式。<ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
     */
    public void setBillingMode(String BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get 实例类型。<ul><li>13：标准版。</li><li>14：集群版。</li></ul> 
     * @return Type 实例类型。<ul><li>13：标准版。</li><li>14：集群版。</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 实例类型。<ul><li>13：标准版。</li><li>14：集群版。</li></ul>
     * @param Type 实例类型。<ul><li>13：标准版。</li><li>14：集群版。</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 搜索关键词：支持实例 ID、实例名称、私有网络IP地址。 
     * @return SearchKeys 搜索关键词：支持实例 ID、实例名称、私有网络IP地址。
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set 搜索关键词：支持实例 ID、实例名称、私有网络IP地址。
     * @param SearchKeys 搜索关键词：支持实例 ID、实例名称、私有网络IP地址。
     */
    public void setSearchKeys(String [] SearchKeys) {
        this.SearchKeys = SearchKeys;
    }

    /**
     * Get 内部参数，用户可忽略。 
     * @return TypeList 内部参数，用户可忽略。
     */
    public Long [] getTypeList() {
        return this.TypeList;
    }

    /**
     * Set 内部参数，用户可忽略。
     * @param TypeList 内部参数，用户可忽略。
     */
    public void setTypeList(Long [] TypeList) {
        this.TypeList = TypeList;
    }

    /**
     * Get 内部参数，用户可忽略。 
     * @return MonitorVersion 内部参数，用户可忽略。
     */
    public String getMonitorVersion() {
        return this.MonitorVersion;
    }

    /**
     * Set 内部参数，用户可忽略。
     * @param MonitorVersion 内部参数，用户可忽略。
     */
    public void setMonitorVersion(String MonitorVersion) {
        this.MonitorVersion = MonitorVersion;
    }

    /**
     * Get 根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。 
     * @return InstanceTags 根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。
     */
    public InstanceTagInfo getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set 根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。
     * @param InstanceTags 根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。
     */
    public void setInstanceTags(InstanceTagInfo InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get 根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。 
     * @return TagKeys 根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set 根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。
     * @param TagKeys 根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
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

    }
}

