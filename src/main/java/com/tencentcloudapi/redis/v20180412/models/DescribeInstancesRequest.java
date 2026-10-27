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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * <p>每页输出实例的数量，参数默认值20，最大值为1000。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例列表排序依据，枚举值如下所示：</p><ul><li>projectId：依据项目ID排序。</li><li>createtime：依据实例创建时间排序。</li><li>instancename：依据实例名称排序。</li><li>type：依据实例类型排序。</li><li>curDeadline：依据实例到期时间排序。</li></ul>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>实例排序方式，默认为倒序排序。</p><ul><li>1：倒序。</li><li>0：顺序。</li></ul>
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * <p>私有网络 ID 数组。如果不配置该参数或设置数组为空则默认选择基础网络。例如47525。该参数暂时保留，可忽略。请根据 UniqVpcIds 参数格式设置私有网络ID数组。</p>
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * <p>私有网络所属子网 ID 数组，例如：56854。该参数暂时保留，可忽略。请根据 UniqSubnetIds 参数格式设置私有网络子网 ID 数组。</p>
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * <p>设置模糊查询关键字段，仅实例名称支持模糊查询。</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>项目 ID 组成的数组。</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>私有网络 ID 数组。如果不配置该参数或者设置数组为空则默认选择基础网络，如：vpc-sad23jfdfk。</p>
    */
    @SerializedName("UniqVpcIds")
    @Expose
    private String [] UniqVpcIds;

    /**
    * <p>私有网络所属子网 ID 数组，如：subnet-fdj24n34j2。</p>
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * <p>地域 ID 数组，该参数已经弃用，可通过公共参数Region查询对应地域。</p>
    */
    @SerializedName("RegionIds")
    @Expose
    private Long [] RegionIds;

    /**
    * <p>实例状态。</p><ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>实例架构版本。</p><ul><li>1：单机版。</li><li>2：主从版。</li><li>3：集群版。</li></ul>
    */
    @SerializedName("TypeVersion")
    @Expose
    private Long TypeVersion;

    /**
    * <p>存储引擎信息。可设置为Redis-2.8、Redis-4.0、Redis-5.0、Redis-6.0 或者 CKV。</p>
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * <p>续费模式。</p><ul><li>0：手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</li></ul>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long [] AutoRenew;

    /**
    * <p>计费模式。</p><ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
    */
    @SerializedName("BillingMode")
    @Expose
    private String BillingMode;

    /**
    * <p>实例类型。</p><ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>5：Redis 2.8 内存版（单机）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li><li>200:Memcached 1.6 内存版（集群架构）。</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>该参数为数组类型，支持配置实例名称、实例 ID、IP地址，其中实例名称为模糊匹配，实例 ID 和 IP 地址精确匹配。</p><ul><li>数组中每一个元素取并集进行匹配查询。</li><li><strong>InstanceId</strong> 与 <strong>SearchKeys</strong> 同时配置，则取二者交集进行匹配查询。</li></ul>
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
    * <p>根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTagInfo [] InstanceTags;

    /**
    * <p>根据标签的 Key 筛选资源，该参数不配置或者数组设置为空值，则不根据标签Key进行过滤。</p>
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * <p>实例的部署类型。如果该参数不配置或者数组设置为空值，则默认不依据此参数过滤实例。</p><p>枚举值：</p><ul><li>local： 通用 I 型。</li><li>localv2： 通用 II 型。</li><li>cdc： 独享集群型。</li></ul>
    */
    @SerializedName("ProductVersions")
    @Expose
    private String [] ProductVersions;

    /**
    * <p>批量查询指定的实例 ID，返回结果已 Limit 限制为主。</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>可用区模式。</p><ul><li>singleaz：单可用区。</li><li>multiaz：多可用区。</li></ul>
    */
    @SerializedName("AzMode")
    @Expose
    private String AzMode;

    /**
     * Get <p>每页输出实例的数量，参数默认值20，最大值为1000。</p> 
     * @return Limit <p>每页输出实例的数量，参数默认值20，最大值为1000。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页输出实例的数量，参数默认值20，最大值为1000。</p>
     * @param Limit <p>每页输出实例的数量，参数默认值20，最大值为1000。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。</p> 
     * @return Offset <p>分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。</p>
     * @param Offset <p>分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例列表排序依据，枚举值如下所示：</p><ul><li>projectId：依据项目ID排序。</li><li>createtime：依据实例创建时间排序。</li><li>instancename：依据实例名称排序。</li><li>type：依据实例类型排序。</li><li>curDeadline：依据实例到期时间排序。</li></ul> 
     * @return OrderBy <p>实例列表排序依据，枚举值如下所示：</p><ul><li>projectId：依据项目ID排序。</li><li>createtime：依据实例创建时间排序。</li><li>instancename：依据实例名称排序。</li><li>type：依据实例类型排序。</li><li>curDeadline：依据实例到期时间排序。</li></ul>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>实例列表排序依据，枚举值如下所示：</p><ul><li>projectId：依据项目ID排序。</li><li>createtime：依据实例创建时间排序。</li><li>instancename：依据实例名称排序。</li><li>type：依据实例类型排序。</li><li>curDeadline：依据实例到期时间排序。</li></ul>
     * @param OrderBy <p>实例列表排序依据，枚举值如下所示：</p><ul><li>projectId：依据项目ID排序。</li><li>createtime：依据实例创建时间排序。</li><li>instancename：依据实例名称排序。</li><li>type：依据实例类型排序。</li><li>curDeadline：依据实例到期时间排序。</li></ul>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>实例排序方式，默认为倒序排序。</p><ul><li>1：倒序。</li><li>0：顺序。</li></ul> 
     * @return OrderType <p>实例排序方式，默认为倒序排序。</p><ul><li>1：倒序。</li><li>0：顺序。</li></ul>
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>实例排序方式，默认为倒序排序。</p><ul><li>1：倒序。</li><li>0：顺序。</li></ul>
     * @param OrderType <p>实例排序方式，默认为倒序排序。</p><ul><li>1：倒序。</li><li>0：顺序。</li></ul>
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>私有网络 ID 数组。如果不配置该参数或设置数组为空则默认选择基础网络。例如47525。该参数暂时保留，可忽略。请根据 UniqVpcIds 参数格式设置私有网络ID数组。</p> 
     * @return VpcIds <p>私有网络 ID 数组。如果不配置该参数或设置数组为空则默认选择基础网络。例如47525。该参数暂时保留，可忽略。请根据 UniqVpcIds 参数格式设置私有网络ID数组。</p>
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set <p>私有网络 ID 数组。如果不配置该参数或设置数组为空则默认选择基础网络。例如47525。该参数暂时保留，可忽略。请根据 UniqVpcIds 参数格式设置私有网络ID数组。</p>
     * @param VpcIds <p>私有网络 ID 数组。如果不配置该参数或设置数组为空则默认选择基础网络。例如47525。该参数暂时保留，可忽略。请根据 UniqVpcIds 参数格式设置私有网络ID数组。</p>
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get <p>私有网络所属子网 ID 数组，例如：56854。该参数暂时保留，可忽略。请根据 UniqSubnetIds 参数格式设置私有网络子网 ID 数组。</p> 
     * @return SubnetIds <p>私有网络所属子网 ID 数组，例如：56854。该参数暂时保留，可忽略。请根据 UniqSubnetIds 参数格式设置私有网络子网 ID 数组。</p>
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set <p>私有网络所属子网 ID 数组，例如：56854。该参数暂时保留，可忽略。请根据 UniqSubnetIds 参数格式设置私有网络子网 ID 数组。</p>
     * @param SubnetIds <p>私有网络所属子网 ID 数组，例如：56854。该参数暂时保留，可忽略。请根据 UniqSubnetIds 参数格式设置私有网络子网 ID 数组。</p>
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get <p>设置模糊查询关键字段，仅实例名称支持模糊查询。</p> 
     * @return SearchKey <p>设置模糊查询关键字段，仅实例名称支持模糊查询。</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>设置模糊查询关键字段，仅实例名称支持模糊查询。</p>
     * @param SearchKey <p>设置模糊查询关键字段，仅实例名称支持模糊查询。</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get <p>项目 ID 组成的数组。</p> 
     * @return ProjectIds <p>项目 ID 组成的数组。</p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>项目 ID 组成的数组。</p>
     * @param ProjectIds <p>项目 ID 组成的数组。</p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
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
     * Get <p>私有网络 ID 数组。如果不配置该参数或者设置数组为空则默认选择基础网络，如：vpc-sad23jfdfk。</p> 
     * @return UniqVpcIds <p>私有网络 ID 数组。如果不配置该参数或者设置数组为空则默认选择基础网络，如：vpc-sad23jfdfk。</p>
     */
    public String [] getUniqVpcIds() {
        return this.UniqVpcIds;
    }

    /**
     * Set <p>私有网络 ID 数组。如果不配置该参数或者设置数组为空则默认选择基础网络，如：vpc-sad23jfdfk。</p>
     * @param UniqVpcIds <p>私有网络 ID 数组。如果不配置该参数或者设置数组为空则默认选择基础网络，如：vpc-sad23jfdfk。</p>
     */
    public void setUniqVpcIds(String [] UniqVpcIds) {
        this.UniqVpcIds = UniqVpcIds;
    }

    /**
     * Get <p>私有网络所属子网 ID 数组，如：subnet-fdj24n34j2。</p> 
     * @return UniqSubnetIds <p>私有网络所属子网 ID 数组，如：subnet-fdj24n34j2。</p>
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set <p>私有网络所属子网 ID 数组，如：subnet-fdj24n34j2。</p>
     * @param UniqSubnetIds <p>私有网络所属子网 ID 数组，如：subnet-fdj24n34j2。</p>
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get <p>地域 ID 数组，该参数已经弃用，可通过公共参数Region查询对应地域。</p> 
     * @return RegionIds <p>地域 ID 数组，该参数已经弃用，可通过公共参数Region查询对应地域。</p>
     */
    public Long [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set <p>地域 ID 数组，该参数已经弃用，可通过公共参数Region查询对应地域。</p>
     * @param RegionIds <p>地域 ID 数组，该参数已经弃用，可通过公共参数Region查询对应地域。</p>
     */
    public void setRegionIds(Long [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get <p>实例状态。</p><ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul> 
     * @return Status <p>实例状态。</p><ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态。</p><ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     * @param Status <p>实例状态。</p><ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例架构版本。</p><ul><li>1：单机版。</li><li>2：主从版。</li><li>3：集群版。</li></ul> 
     * @return TypeVersion <p>实例架构版本。</p><ul><li>1：单机版。</li><li>2：主从版。</li><li>3：集群版。</li></ul>
     */
    public Long getTypeVersion() {
        return this.TypeVersion;
    }

    /**
     * Set <p>实例架构版本。</p><ul><li>1：单机版。</li><li>2：主从版。</li><li>3：集群版。</li></ul>
     * @param TypeVersion <p>实例架构版本。</p><ul><li>1：单机版。</li><li>2：主从版。</li><li>3：集群版。</li></ul>
     */
    public void setTypeVersion(Long TypeVersion) {
        this.TypeVersion = TypeVersion;
    }

    /**
     * Get <p>存储引擎信息。可设置为Redis-2.8、Redis-4.0、Redis-5.0、Redis-6.0 或者 CKV。</p> 
     * @return EngineName <p>存储引擎信息。可设置为Redis-2.8、Redis-4.0、Redis-5.0、Redis-6.0 或者 CKV。</p>
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set <p>存储引擎信息。可设置为Redis-2.8、Redis-4.0、Redis-5.0、Redis-6.0 或者 CKV。</p>
     * @param EngineName <p>存储引擎信息。可设置为Redis-2.8、Redis-4.0、Redis-5.0、Redis-6.0 或者 CKV。</p>
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get <p>续费模式。</p><ul><li>0：手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</li></ul> 
     * @return AutoRenew <p>续费模式。</p><ul><li>0：手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</li></ul>
     */
    public Long [] getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>续费模式。</p><ul><li>0：手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</li></ul>
     * @param AutoRenew <p>续费模式。</p><ul><li>0：手动续费。</li><li>1：自动续费。</li><li>2：到期不再续费。</li></ul>
     */
    public void setAutoRenew(Long [] AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>计费模式。</p><ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul> 
     * @return BillingMode <p>计费模式。</p><ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
     */
    public String getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>计费模式。</p><ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
     * @param BillingMode <p>计费模式。</p><ul><li>postpaid：按量计费。</li><li>prepaid：包年包月。</li></ul>
     */
    public void setBillingMode(String BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>实例类型。</p><ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>5：Redis 2.8 内存版（单机）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li><li>200:Memcached 1.6 内存版（集群架构）。</li></ul> 
     * @return Type <p>实例类型。</p><ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>5：Redis 2.8 内存版（单机）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li><li>200:Memcached 1.6 内存版（集群架构）。</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>实例类型。</p><ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>5：Redis 2.8 内存版（单机）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li><li>200:Memcached 1.6 内存版（集群架构）。</li></ul>
     * @param Type <p>实例类型。</p><ul><li>2：Redis 2.8 内存版（标准架构）。</li><li>3：CKV 3.2 内存版（标准架构）。</li><li>4：CKV 3.2 内存版（集群架构）。</li><li>5：Redis 2.8 内存版（单机）。</li><li>6：Redis 4.0 内存版（标准架构）。</li><li>7：Redis 4.0 内存版（集群架构）。</li><li>8：Redis 5.0 内存版（标准架构）。</li><li>9：Redis 5.0 内存版（集群架构）。</li><li>15：Redis 6.2 内存版（标准架构）。</li><li>16：Redis 6.2 内存版（集群架构）。</li><li>17：Redis 7.0 内存版（标准架构）。</li><li>18：Redis 7.0 内存版（集群架构）。</li><li>200:Memcached 1.6 内存版（集群架构）。</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>该参数为数组类型，支持配置实例名称、实例 ID、IP地址，其中实例名称为模糊匹配，实例 ID 和 IP 地址精确匹配。</p><ul><li>数组中每一个元素取并集进行匹配查询。</li><li><strong>InstanceId</strong> 与 <strong>SearchKeys</strong> 同时配置，则取二者交集进行匹配查询。</li></ul> 
     * @return SearchKeys <p>该参数为数组类型，支持配置实例名称、实例 ID、IP地址，其中实例名称为模糊匹配，实例 ID 和 IP 地址精确匹配。</p><ul><li>数组中每一个元素取并集进行匹配查询。</li><li><strong>InstanceId</strong> 与 <strong>SearchKeys</strong> 同时配置，则取二者交集进行匹配查询。</li></ul>
     */
    public String [] getSearchKeys() {
        return this.SearchKeys;
    }

    /**
     * Set <p>该参数为数组类型，支持配置实例名称、实例 ID、IP地址，其中实例名称为模糊匹配，实例 ID 和 IP 地址精确匹配。</p><ul><li>数组中每一个元素取并集进行匹配查询。</li><li><strong>InstanceId</strong> 与 <strong>SearchKeys</strong> 同时配置，则取二者交集进行匹配查询。</li></ul>
     * @param SearchKeys <p>该参数为数组类型，支持配置实例名称、实例 ID、IP地址，其中实例名称为模糊匹配，实例 ID 和 IP 地址精确匹配。</p><ul><li>数组中每一个元素取并集进行匹配查询。</li><li><strong>InstanceId</strong> 与 <strong>SearchKeys</strong> 同时配置，则取二者交集进行匹配查询。</li></ul>
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
     * Get <p>根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。</p> 
     * @return InstanceTags <p>根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。</p>
     */
    public InstanceTagInfo [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。</p>
     * @param InstanceTags <p>根据标签的 Key 和 Value 筛选资源。该参数不配置或者数组设置为空值，则不根据标签进行过滤。</p>
     */
    public void setInstanceTags(InstanceTagInfo [] InstanceTags) {
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
     * Get <p>实例的部署类型。如果该参数不配置或者数组设置为空值，则默认不依据此参数过滤实例。</p><p>枚举值：</p><ul><li>local： 通用 I 型。</li><li>localv2： 通用 II 型。</li><li>cdc： 独享集群型。</li></ul> 
     * @return ProductVersions <p>实例的部署类型。如果该参数不配置或者数组设置为空值，则默认不依据此参数过滤实例。</p><p>枚举值：</p><ul><li>local： 通用 I 型。</li><li>localv2： 通用 II 型。</li><li>cdc： 独享集群型。</li></ul>
     */
    public String [] getProductVersions() {
        return this.ProductVersions;
    }

    /**
     * Set <p>实例的部署类型。如果该参数不配置或者数组设置为空值，则默认不依据此参数过滤实例。</p><p>枚举值：</p><ul><li>local： 通用 I 型。</li><li>localv2： 通用 II 型。</li><li>cdc： 独享集群型。</li></ul>
     * @param ProductVersions <p>实例的部署类型。如果该参数不配置或者数组设置为空值，则默认不依据此参数过滤实例。</p><p>枚举值：</p><ul><li>local： 通用 I 型。</li><li>localv2： 通用 II 型。</li><li>cdc： 独享集群型。</li></ul>
     */
    public void setProductVersions(String [] ProductVersions) {
        this.ProductVersions = ProductVersions;
    }

    /**
     * Get <p>批量查询指定的实例 ID，返回结果已 Limit 限制为主。</p> 
     * @return InstanceIds <p>批量查询指定的实例 ID，返回结果已 Limit 限制为主。</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>批量查询指定的实例 ID，返回结果已 Limit 限制为主。</p>
     * @param InstanceIds <p>批量查询指定的实例 ID，返回结果已 Limit 限制为主。</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>可用区模式。</p><ul><li>singleaz：单可用区。</li><li>multiaz：多可用区。</li></ul> 
     * @return AzMode <p>可用区模式。</p><ul><li>singleaz：单可用区。</li><li>multiaz：多可用区。</li></ul>
     */
    public String getAzMode() {
        return this.AzMode;
    }

    /**
     * Set <p>可用区模式。</p><ul><li>singleaz：单可用区。</li><li>multiaz：多可用区。</li></ul>
     * @param AzMode <p>可用区模式。</p><ul><li>singleaz：单可用区。</li><li>multiaz：多可用区。</li></ul>
     */
    public void setAzMode(String AzMode) {
        this.AzMode = AzMode;
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
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
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
        if (source.RegionIds != null) {
            this.RegionIds = new Long[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new Long(source.RegionIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.TypeVersion != null) {
            this.TypeVersion = new Long(source.TypeVersion);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
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
            this.InstanceTags = new InstanceTagInfo[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTagInfo(source.InstanceTags[i]);
            }
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.ProductVersions != null) {
            this.ProductVersions = new String[source.ProductVersions.length];
            for (int i = 0; i < source.ProductVersions.length; i++) {
                this.ProductVersions[i] = new String(source.ProductVersions[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.AzMode != null) {
            this.AzMode = new String(source.AzMode);
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
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArraySimple(map, prefix + "UniqVpcIds.", this.UniqVpcIds);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "TypeVersion", this.TypeVersion);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamArraySimple(map, prefix + "AutoRenew.", this.AutoRenew);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "SearchKeys.", this.SearchKeys);
        this.setParamArraySimple(map, prefix + "TypeList.", this.TypeList);
        this.setParamSimple(map, prefix + "MonitorVersion", this.MonitorVersion);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamArraySimple(map, prefix + "ProductVersions.", this.ProductVersions);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "AzMode", this.AzMode);

    }
}

