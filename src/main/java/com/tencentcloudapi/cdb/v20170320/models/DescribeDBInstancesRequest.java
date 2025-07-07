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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel {

    /**
    * 项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。
    */
    @SerializedName("InstanceTypes")
    @Expose
    private Long [] InstanceTypes;

    /**
    * 实例的内网 IP 地址。
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 已隔离（可在回收站恢复开机）
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 偏移量，默认值为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次请求返回的数量，默认值为 20，最大值为 2000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 付费类型，可取值：0 - 包年包月，1 - 小时计费。
    */
    @SerializedName("PayTypes")
    @Expose
    private Long [] PayTypes;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成<br>19 - 参数设置待执行<br>34 - 原地升级待执行
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * 实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。
    */
    @SerializedName("EngineVersions")
    @Expose
    private String [] EngineVersions;

    /**
    * 私有网络的 ID。
    */
    @SerializedName("VpcIds")
    @Expose
    private Long [] VpcIds;

    /**
    * 可用区的 ID。
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * 子网 ID。
    */
    @SerializedName("SubnetIds")
    @Expose
    private Long [] SubnetIds;

    /**
    * 是否锁定标记，可选值：0 - 不锁定，1 - 锁定，默认为0。
    */
    @SerializedName("CdbErrors")
    @Expose
    private Long [] CdbErrors;

    /**
    * 返回结果集排序的字段，目前支持："InstanceId"，"InstanceName"，"CreateTime"，"DeadlineTime"。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 返回结果集排序方式。目前支持值："ASC" - 表示升序，"DESC" - 表示降序，默认为 "DESC"。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * 是否以安全组 ID 为过滤条件。
说明：0表示否，1表示是。
    */
    @SerializedName("WithSecurityGroup")
    @Expose
    private Long WithSecurityGroup;

    /**
    * 是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。
    */
    @SerializedName("WithExCluster")
    @Expose
    private Long WithExCluster;

    /**
    * 独享集群 ID。
    */
    @SerializedName("ExClusterId")
    @Expose
    private String ExClusterId;

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 初始化标记，可取值：0 - 未初始化，1 - 初始化。
    */
    @SerializedName("InitFlag")
    @Expose
    private Long InitFlag;

    /**
    * 是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。
    */
    @SerializedName("WithDr")
    @Expose
    private Long WithDr;

    /**
    * 是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
    */
    @SerializedName("WithRo")
    @Expose
    private Long WithRo;

    /**
    * 是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
    */
    @SerializedName("WithMaster")
    @Expose
    private Long WithMaster;

    /**
    * 置放群组ID列表。
    */
    @SerializedName("DeployGroupIds")
    @Expose
    private String [] DeployGroupIds;

    /**
    * 是否以标签键为过滤条件。
    */
    @SerializedName("TagKeysForSearch")
    @Expose
    private String [] TagKeysForSearch;

    /**
    * 金融围拢 ID 。
    */
    @SerializedName("CageIds")
    @Expose
    private String [] CageIds;

    /**
    * 标签值
    */
    @SerializedName("TagValues")
    @Expose
    private String [] TagValues;

    /**
    * 私有网络字符型vpcId
    */
    @SerializedName("UniqueVpcIds")
    @Expose
    private String [] UniqueVpcIds;

    /**
    * 私有网络字符型subnetId
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * 标签键值
请注意，创建中的实例无法查询到标签。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 数据库代理 IP 。
    */
    @SerializedName("ProxyVips")
    @Expose
    private String [] ProxyVips;

    /**
    * 数据库代理 ID 。
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * 数据库引擎类型。可选值为：InnoDB、RocksDB。
    */
    @SerializedName("EngineTypes")
    @Expose
    private String [] EngineTypes;

    /**
    * 是否获取集群版实例节点信息，可填：true 或 false。默认为 false。
    */
    @SerializedName("QueryClusterInfo")
    @Expose
    private Boolean QueryClusterInfo;

    /**
     * Get 项目 ID。 
     * @return ProjectId 项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
     * @param ProjectId 项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。 
     * @return InstanceTypes 实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。
     */
    public Long [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set 实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。
     * @param InstanceTypes 实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。
     */
    public void setInstanceTypes(Long [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get 实例的内网 IP 地址。 
     * @return Vips 实例的内网 IP 地址。
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set 实例的内网 IP 地址。
     * @param Vips 实例的内网 IP 地址。
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 已隔离（可在回收站恢复开机） 
     * @return Status 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 已隔离（可在回收站恢复开机）
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 已隔离（可在回收站恢复开机）
     * @param Status 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 已隔离（可在回收站恢复开机）
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 偏移量，默认值为 0。 
     * @return Offset 偏移量，默认值为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为 0。
     * @param Offset 偏移量，默认值为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次请求返回的数量，默认值为 20，最大值为 2000。 
     * @return Limit 单次请求返回的数量，默认值为 20，最大值为 2000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次请求返回的数量，默认值为 20，最大值为 2000。
     * @param Limit 单次请求返回的数量，默认值为 20，最大值为 2000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。 
     * @return SecurityGroupId 安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。
     * @param SecurityGroupId 安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 付费类型，可取值：0 - 包年包月，1 - 小时计费。 
     * @return PayTypes 付费类型，可取值：0 - 包年包月，1 - 小时计费。
     */
    public Long [] getPayTypes() {
        return this.PayTypes;
    }

    /**
     * Set 付费类型，可取值：0 - 包年包月，1 - 小时计费。
     * @param PayTypes 付费类型，可取值：0 - 包年包月，1 - 小时计费。
     */
    public void setPayTypes(Long [] PayTypes) {
        this.PayTypes = PayTypes;
    }

    /**
     * Get 实例名称。 
     * @return InstanceNames 实例名称。
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set 实例名称。
     * @param InstanceNames 实例名称。
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成<br>19 - 参数设置待执行<br>34 - 原地升级待执行 
     * @return TaskStatus 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成<br>19 - 参数设置待执行<br>34 - 原地升级待执行
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成<br>19 - 参数设置待执行<br>34 - 原地升级待执行
     * @param TaskStatus 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成<br>19 - 参数设置待执行<br>34 - 原地升级待执行
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。 
     * @return EngineVersions 实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。
     */
    public String [] getEngineVersions() {
        return this.EngineVersions;
    }

    /**
     * Set 实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。
     * @param EngineVersions 实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。
     */
    public void setEngineVersions(String [] EngineVersions) {
        this.EngineVersions = EngineVersions;
    }

    /**
     * Get 私有网络的 ID。 
     * @return VpcIds 私有网络的 ID。
     */
    public Long [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set 私有网络的 ID。
     * @param VpcIds 私有网络的 ID。
     */
    public void setVpcIds(Long [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get 可用区的 ID。 
     * @return ZoneIds 可用区的 ID。
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 可用区的 ID。
     * @param ZoneIds 可用区的 ID。
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 子网 ID。 
     * @return SubnetIds 子网 ID。
     */
    public Long [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网 ID。
     * @param SubnetIds 子网 ID。
     */
    public void setSubnetIds(Long [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 是否锁定标记，可选值：0 - 不锁定，1 - 锁定，默认为0。 
     * @return CdbErrors 是否锁定标记，可选值：0 - 不锁定，1 - 锁定，默认为0。
     */
    public Long [] getCdbErrors() {
        return this.CdbErrors;
    }

    /**
     * Set 是否锁定标记，可选值：0 - 不锁定，1 - 锁定，默认为0。
     * @param CdbErrors 是否锁定标记，可选值：0 - 不锁定，1 - 锁定，默认为0。
     */
    public void setCdbErrors(Long [] CdbErrors) {
        this.CdbErrors = CdbErrors;
    }

    /**
     * Get 返回结果集排序的字段，目前支持："InstanceId"，"InstanceName"，"CreateTime"，"DeadlineTime"。 
     * @return OrderBy 返回结果集排序的字段，目前支持："InstanceId"，"InstanceName"，"CreateTime"，"DeadlineTime"。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 返回结果集排序的字段，目前支持："InstanceId"，"InstanceName"，"CreateTime"，"DeadlineTime"。
     * @param OrderBy 返回结果集排序的字段，目前支持："InstanceId"，"InstanceName"，"CreateTime"，"DeadlineTime"。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 返回结果集排序方式。目前支持值："ASC" - 表示升序，"DESC" - 表示降序，默认为 "DESC"。 
     * @return OrderDirection 返回结果集排序方式。目前支持值："ASC" - 表示升序，"DESC" - 表示降序，默认为 "DESC"。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 返回结果集排序方式。目前支持值："ASC" - 表示升序，"DESC" - 表示降序，默认为 "DESC"。
     * @param OrderDirection 返回结果集排序方式。目前支持值："ASC" - 表示升序，"DESC" - 表示降序，默认为 "DESC"。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get 是否以安全组 ID 为过滤条件。
说明：0表示否，1表示是。 
     * @return WithSecurityGroup 是否以安全组 ID 为过滤条件。
说明：0表示否，1表示是。
     */
    public Long getWithSecurityGroup() {
        return this.WithSecurityGroup;
    }

    /**
     * Set 是否以安全组 ID 为过滤条件。
说明：0表示否，1表示是。
     * @param WithSecurityGroup 是否以安全组 ID 为过滤条件。
说明：0表示否，1表示是。
     */
    public void setWithSecurityGroup(Long WithSecurityGroup) {
        this.WithSecurityGroup = WithSecurityGroup;
    }

    /**
     * Get 是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。 
     * @return WithExCluster 是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。
     */
    public Long getWithExCluster() {
        return this.WithExCluster;
    }

    /**
     * Set 是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。
     * @param WithExCluster 是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。
     */
    public void setWithExCluster(Long WithExCluster) {
        this.WithExCluster = WithExCluster;
    }

    /**
     * Get 独享集群 ID。 
     * @return ExClusterId 独享集群 ID。
     */
    public String getExClusterId() {
        return this.ExClusterId;
    }

    /**
     * Set 独享集群 ID。
     * @param ExClusterId 独享集群 ID。
     */
    public void setExClusterId(String ExClusterId) {
        this.ExClusterId = ExClusterId;
    }

    /**
     * Get 实例 ID。 
     * @return InstanceIds 实例 ID。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID。
     * @param InstanceIds 实例 ID。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 初始化标记，可取值：0 - 未初始化，1 - 初始化。 
     * @return InitFlag 初始化标记，可取值：0 - 未初始化，1 - 初始化。
     */
    public Long getInitFlag() {
        return this.InitFlag;
    }

    /**
     * Set 初始化标记，可取值：0 - 未初始化，1 - 初始化。
     * @param InitFlag 初始化标记，可取值：0 - 未初始化，1 - 初始化。
     */
    public void setInitFlag(Long InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * Get 是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。 
     * @return WithDr 是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。
     */
    public Long getWithDr() {
        return this.WithDr;
    }

    /**
     * Set 是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。
     * @param WithDr 是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。
     */
    public void setWithDr(Long WithDr) {
        this.WithDr = WithDr;
    }

    /**
     * Get 是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。 
     * @return WithRo 是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     */
    public Long getWithRo() {
        return this.WithRo;
    }

    /**
     * Set 是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     * @param WithRo 是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     */
    public void setWithRo(Long WithRo) {
        this.WithRo = WithRo;
    }

    /**
     * Get 是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。 
     * @return WithMaster 是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     */
    public Long getWithMaster() {
        return this.WithMaster;
    }

    /**
     * Set 是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     * @param WithMaster 是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     */
    public void setWithMaster(Long WithMaster) {
        this.WithMaster = WithMaster;
    }

    /**
     * Get 置放群组ID列表。 
     * @return DeployGroupIds 置放群组ID列表。
     */
    public String [] getDeployGroupIds() {
        return this.DeployGroupIds;
    }

    /**
     * Set 置放群组ID列表。
     * @param DeployGroupIds 置放群组ID列表。
     */
    public void setDeployGroupIds(String [] DeployGroupIds) {
        this.DeployGroupIds = DeployGroupIds;
    }

    /**
     * Get 是否以标签键为过滤条件。 
     * @return TagKeysForSearch 是否以标签键为过滤条件。
     */
    public String [] getTagKeysForSearch() {
        return this.TagKeysForSearch;
    }

    /**
     * Set 是否以标签键为过滤条件。
     * @param TagKeysForSearch 是否以标签键为过滤条件。
     */
    public void setTagKeysForSearch(String [] TagKeysForSearch) {
        this.TagKeysForSearch = TagKeysForSearch;
    }

    /**
     * Get 金融围拢 ID 。 
     * @return CageIds 金融围拢 ID 。
     */
    public String [] getCageIds() {
        return this.CageIds;
    }

    /**
     * Set 金融围拢 ID 。
     * @param CageIds 金融围拢 ID 。
     */
    public void setCageIds(String [] CageIds) {
        this.CageIds = CageIds;
    }

    /**
     * Get 标签值 
     * @return TagValues 标签值
     */
    public String [] getTagValues() {
        return this.TagValues;
    }

    /**
     * Set 标签值
     * @param TagValues 标签值
     */
    public void setTagValues(String [] TagValues) {
        this.TagValues = TagValues;
    }

    /**
     * Get 私有网络字符型vpcId 
     * @return UniqueVpcIds 私有网络字符型vpcId
     */
    public String [] getUniqueVpcIds() {
        return this.UniqueVpcIds;
    }

    /**
     * Set 私有网络字符型vpcId
     * @param UniqueVpcIds 私有网络字符型vpcId
     */
    public void setUniqueVpcIds(String [] UniqueVpcIds) {
        this.UniqueVpcIds = UniqueVpcIds;
    }

    /**
     * Get 私有网络字符型subnetId 
     * @return UniqSubnetIds 私有网络字符型subnetId
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set 私有网络字符型subnetId
     * @param UniqSubnetIds 私有网络字符型subnetId
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get 标签键值
请注意，创建中的实例无法查询到标签。 
     * @return Tags 标签键值
请注意，创建中的实例无法查询到标签。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签键值
请注意，创建中的实例无法查询到标签。
     * @param Tags 标签键值
请注意，创建中的实例无法查询到标签。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 数据库代理 IP 。 
     * @return ProxyVips 数据库代理 IP 。
     */
    public String [] getProxyVips() {
        return this.ProxyVips;
    }

    /**
     * Set 数据库代理 IP 。
     * @param ProxyVips 数据库代理 IP 。
     */
    public void setProxyVips(String [] ProxyVips) {
        this.ProxyVips = ProxyVips;
    }

    /**
     * Get 数据库代理 ID 。 
     * @return ProxyIds 数据库代理 ID 。
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set 数据库代理 ID 。
     * @param ProxyIds 数据库代理 ID 。
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Get 数据库引擎类型。可选值为：InnoDB、RocksDB。 
     * @return EngineTypes 数据库引擎类型。可选值为：InnoDB、RocksDB。
     */
    public String [] getEngineTypes() {
        return this.EngineTypes;
    }

    /**
     * Set 数据库引擎类型。可选值为：InnoDB、RocksDB。
     * @param EngineTypes 数据库引擎类型。可选值为：InnoDB、RocksDB。
     */
    public void setEngineTypes(String [] EngineTypes) {
        this.EngineTypes = EngineTypes;
    }

    /**
     * Get 是否获取集群版实例节点信息，可填：true 或 false。默认为 false。 
     * @return QueryClusterInfo 是否获取集群版实例节点信息，可填：true 或 false。默认为 false。
     */
    public Boolean getQueryClusterInfo() {
        return this.QueryClusterInfo;
    }

    /**
     * Set 是否获取集群版实例节点信息，可填：true 或 false。默认为 false。
     * @param QueryClusterInfo 是否获取集群版实例节点信息，可填：true 或 false。默认为 false。
     */
    public void setQueryClusterInfo(Boolean QueryClusterInfo) {
        this.QueryClusterInfo = QueryClusterInfo;
    }

    public DescribeDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesRequest(DescribeDBInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new Long[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new Long(source.InstanceTypes[i]);
            }
        }
        if (source.Vips != null) {
            this.Vips = new String[source.Vips.length];
            for (int i = 0; i < source.Vips.length; i++) {
                this.Vips[i] = new String(source.Vips[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.PayTypes != null) {
            this.PayTypes = new Long[source.PayTypes.length];
            for (int i = 0; i < source.PayTypes.length; i++) {
                this.PayTypes[i] = new Long(source.PayTypes[i]);
            }
        }
        if (source.InstanceNames != null) {
            this.InstanceNames = new String[source.InstanceNames.length];
            for (int i = 0; i < source.InstanceNames.length; i++) {
                this.InstanceNames[i] = new String(source.InstanceNames[i]);
            }
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long[source.TaskStatus.length];
            for (int i = 0; i < source.TaskStatus.length; i++) {
                this.TaskStatus[i] = new Long(source.TaskStatus[i]);
            }
        }
        if (source.EngineVersions != null) {
            this.EngineVersions = new String[source.EngineVersions.length];
            for (int i = 0; i < source.EngineVersions.length; i++) {
                this.EngineVersions[i] = new String(source.EngineVersions[i]);
            }
        }
        if (source.VpcIds != null) {
            this.VpcIds = new Long[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new Long(source.VpcIds[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new Long[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new Long(source.SubnetIds[i]);
            }
        }
        if (source.CdbErrors != null) {
            this.CdbErrors = new Long[source.CdbErrors.length];
            for (int i = 0; i < source.CdbErrors.length; i++) {
                this.CdbErrors[i] = new Long(source.CdbErrors[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
        if (source.WithSecurityGroup != null) {
            this.WithSecurityGroup = new Long(source.WithSecurityGroup);
        }
        if (source.WithExCluster != null) {
            this.WithExCluster = new Long(source.WithExCluster);
        }
        if (source.ExClusterId != null) {
            this.ExClusterId = new String(source.ExClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InitFlag != null) {
            this.InitFlag = new Long(source.InitFlag);
        }
        if (source.WithDr != null) {
            this.WithDr = new Long(source.WithDr);
        }
        if (source.WithRo != null) {
            this.WithRo = new Long(source.WithRo);
        }
        if (source.WithMaster != null) {
            this.WithMaster = new Long(source.WithMaster);
        }
        if (source.DeployGroupIds != null) {
            this.DeployGroupIds = new String[source.DeployGroupIds.length];
            for (int i = 0; i < source.DeployGroupIds.length; i++) {
                this.DeployGroupIds[i] = new String(source.DeployGroupIds[i]);
            }
        }
        if (source.TagKeysForSearch != null) {
            this.TagKeysForSearch = new String[source.TagKeysForSearch.length];
            for (int i = 0; i < source.TagKeysForSearch.length; i++) {
                this.TagKeysForSearch[i] = new String(source.TagKeysForSearch[i]);
            }
        }
        if (source.CageIds != null) {
            this.CageIds = new String[source.CageIds.length];
            for (int i = 0; i < source.CageIds.length; i++) {
                this.CageIds[i] = new String(source.CageIds[i]);
            }
        }
        if (source.TagValues != null) {
            this.TagValues = new String[source.TagValues.length];
            for (int i = 0; i < source.TagValues.length; i++) {
                this.TagValues[i] = new String(source.TagValues[i]);
            }
        }
        if (source.UniqueVpcIds != null) {
            this.UniqueVpcIds = new String[source.UniqueVpcIds.length];
            for (int i = 0; i < source.UniqueVpcIds.length; i++) {
                this.UniqueVpcIds[i] = new String(source.UniqueVpcIds[i]);
            }
        }
        if (source.UniqSubnetIds != null) {
            this.UniqSubnetIds = new String[source.UniqSubnetIds.length];
            for (int i = 0; i < source.UniqSubnetIds.length; i++) {
                this.UniqSubnetIds[i] = new String(source.UniqSubnetIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ProxyVips != null) {
            this.ProxyVips = new String[source.ProxyVips.length];
            for (int i = 0; i < source.ProxyVips.length; i++) {
                this.ProxyVips[i] = new String(source.ProxyVips[i]);
            }
        }
        if (source.ProxyIds != null) {
            this.ProxyIds = new String[source.ProxyIds.length];
            for (int i = 0; i < source.ProxyIds.length; i++) {
                this.ProxyIds[i] = new String(source.ProxyIds[i]);
            }
        }
        if (source.EngineTypes != null) {
            this.EngineTypes = new String[source.EngineTypes.length];
            for (int i = 0; i < source.EngineTypes.length; i++) {
                this.EngineTypes[i] = new String(source.EngineTypes[i]);
            }
        }
        if (source.QueryClusterInfo != null) {
            this.QueryClusterInfo = new Boolean(source.QueryClusterInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArraySimple(map, prefix + "Vips.", this.Vips);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArraySimple(map, prefix + "PayTypes.", this.PayTypes);
        this.setParamArraySimple(map, prefix + "InstanceNames.", this.InstanceNames);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamArraySimple(map, prefix + "EngineVersions.", this.EngineVersions);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamArraySimple(map, prefix + "CdbErrors.", this.CdbErrors);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);
        this.setParamSimple(map, prefix + "WithSecurityGroup", this.WithSecurityGroup);
        this.setParamSimple(map, prefix + "WithExCluster", this.WithExCluster);
        this.setParamSimple(map, prefix + "ExClusterId", this.ExClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InitFlag", this.InitFlag);
        this.setParamSimple(map, prefix + "WithDr", this.WithDr);
        this.setParamSimple(map, prefix + "WithRo", this.WithRo);
        this.setParamSimple(map, prefix + "WithMaster", this.WithMaster);
        this.setParamArraySimple(map, prefix + "DeployGroupIds.", this.DeployGroupIds);
        this.setParamArraySimple(map, prefix + "TagKeysForSearch.", this.TagKeysForSearch);
        this.setParamArraySimple(map, prefix + "CageIds.", this.CageIds);
        this.setParamArraySimple(map, prefix + "TagValues.", this.TagValues);
        this.setParamArraySimple(map, prefix + "UniqueVpcIds.", this.UniqueVpcIds);
        this.setParamArraySimple(map, prefix + "UniqSubnetIds.", this.UniqSubnetIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "ProxyVips.", this.ProxyVips);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);
        this.setParamArraySimple(map, prefix + "EngineTypes.", this.EngineTypes);
        this.setParamSimple(map, prefix + "QueryClusterInfo", this.QueryClusterInfo);

    }
}

