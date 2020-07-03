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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel{

    /**
    * 项目 ID，可使用 [查询项目列表](https://cloud.tencent.com/document/product/378/4400) 接口查询项目 ID。
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
    * 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 隔离中（可在回收站恢复开机）
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
    * 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成
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
    * 是否锁定标记。
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
    * 返回结果集排序方式，目前支持："ASC" 或者 "DESC"。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * 是否以安全组 ID 为过滤条件。
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
     * Get 项目 ID，可使用 [查询项目列表](https://cloud.tencent.com/document/product/378/4400) 接口查询项目 ID。 
     * @return ProjectId 项目 ID，可使用 [查询项目列表](https://cloud.tencent.com/document/product/378/4400) 接口查询项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID，可使用 [查询项目列表](https://cloud.tencent.com/document/product/378/4400) 接口查询项目 ID。
     * @param ProjectId 项目 ID，可使用 [查询项目列表](https://cloud.tencent.com/document/product/378/4400) 接口查询项目 ID。
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
     * Get 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 隔离中（可在回收站恢复开机） 
     * @return Status 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 隔离中（可在回收站恢复开机）
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 隔离中（可在回收站恢复开机）
     * @param Status 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 隔离中（可在回收站恢复开机）
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
     * Get 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成 
     * @return TaskStatus 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成
     * @param TaskStatus 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成
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
     * Get 是否锁定标记。 
     * @return CdbErrors 是否锁定标记。
     */
    public Long [] getCdbErrors() {
        return this.CdbErrors;
    }

    /**
     * Set 是否锁定标记。
     * @param CdbErrors 是否锁定标记。
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
     * Get 返回结果集排序方式，目前支持："ASC" 或者 "DESC"。 
     * @return OrderDirection 返回结果集排序方式，目前支持："ASC" 或者 "DESC"。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 返回结果集排序方式，目前支持："ASC" 或者 "DESC"。
     * @param OrderDirection 返回结果集排序方式，目前支持："ASC" 或者 "DESC"。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get 是否以安全组 ID 为过滤条件。 
     * @return WithSecurityGroup 是否以安全组 ID 为过滤条件。
     */
    public Long getWithSecurityGroup() {
        return this.WithSecurityGroup;
    }

    /**
     * Set 是否以安全组 ID 为过滤条件。
     * @param WithSecurityGroup 是否以安全组 ID 为过滤条件。
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

    }
}

