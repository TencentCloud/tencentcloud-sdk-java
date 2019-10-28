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

public class DescribeDBInstancesRequest  extends AbstractModel{

    /**
    * 项目 ID，可使用 [查询项目列表](https://cloud.tencent.com/document/product/378/4400) 接口查询项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。
    */
    @SerializedName("InstanceTypes")
    @Expose
    private Integer [] InstanceTypes;

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
    private Integer [] Status;

    /**
    * 偏移量，默认值为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 单次请求返回的数量，默认值为 20，最大值为 2000。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

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
    private Integer [] PayTypes;

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
    private Integer [] TaskStatus;

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
    private Integer [] VpcIds;

    /**
    * 可用区的 ID。
    */
    @SerializedName("ZoneIds")
    @Expose
    private Integer [] ZoneIds;

    /**
    * 子网 ID。
    */
    @SerializedName("SubnetIds")
    @Expose
    private Integer [] SubnetIds;

    /**
    * 是否锁定标记。
    */
    @SerializedName("CdbErrors")
    @Expose
    private Integer [] CdbErrors;

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
    private Integer WithSecurityGroup;

    /**
    * 是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。
    */
    @SerializedName("WithExCluster")
    @Expose
    private Integer WithExCluster;

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
    private Integer InitFlag;

    /**
    * 是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。
    */
    @SerializedName("WithDr")
    @Expose
    private Integer WithDr;

    /**
    * 是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
    */
    @SerializedName("WithRo")
    @Expose
    private Integer WithRo;

    /**
    * 是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
    */
    @SerializedName("WithMaster")
    @Expose
    private Integer WithMaster;

    /**
     * 获取项目 ID，可使用 [查询项目列表](https://cloud.tencent.com/document/product/378/4400) 接口查询项目 ID。
     * @return ProjectId 项目 ID，可使用 [查询项目列表](https://cloud.tencent.com/document/product/378/4400) 接口查询项目 ID。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目 ID，可使用 [查询项目列表](https://cloud.tencent.com/document/product/378/4400) 接口查询项目 ID。
     * @param ProjectId 项目 ID，可使用 [查询项目列表](https://cloud.tencent.com/document/product/378/4400) 接口查询项目 ID。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。
     * @return InstanceTypes 实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。
     */
    public Integer [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * 设置实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。
     * @param InstanceTypes 实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。
     */
    public void setInstanceTypes(Integer [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * 获取实例的内网 IP 地址。
     * @return Vips 实例的内网 IP 地址。
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * 设置实例的内网 IP 地址。
     * @param Vips 实例的内网 IP 地址。
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * 获取实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 隔离中（可在回收站恢复开机）
     * @return Status 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 隔离中（可在回收站恢复开机）
     */
    public Integer [] getStatus() {
        return this.Status;
    }

    /**
     * 设置实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 隔离中（可在回收站恢复开机）
     * @param Status 实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 隔离中（可在回收站恢复开机）
     */
    public void setStatus(Integer [] Status) {
        this.Status = Status;
    }

    /**
     * 获取偏移量，默认值为 0。
     * @return Offset 偏移量，默认值为 0。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认值为 0。
     * @param Offset 偏移量，默认值为 0。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取单次请求返回的数量，默认值为 20，最大值为 2000。
     * @return Limit 单次请求返回的数量，默认值为 20，最大值为 2000。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置单次请求返回的数量，默认值为 20，最大值为 2000。
     * @param Limit 单次请求返回的数量，默认值为 20，最大值为 2000。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。
     * @return SecurityGroupId 安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * 设置安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。
     * @param SecurityGroupId 安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * 获取付费类型，可取值：0 - 包年包月，1 - 小时计费。
     * @return PayTypes 付费类型，可取值：0 - 包年包月，1 - 小时计费。
     */
    public Integer [] getPayTypes() {
        return this.PayTypes;
    }

    /**
     * 设置付费类型，可取值：0 - 包年包月，1 - 小时计费。
     * @param PayTypes 付费类型，可取值：0 - 包年包月，1 - 小时计费。
     */
    public void setPayTypes(Integer [] PayTypes) {
        this.PayTypes = PayTypes;
    }

    /**
     * 获取实例名称。
     * @return InstanceNames 实例名称。
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * 设置实例名称。
     * @param InstanceNames 实例名称。
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * 获取实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成
     * @return TaskStatus 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成
     */
    public Integer [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * 设置实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成
     * @param TaskStatus 实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成
     */
    public void setTaskStatus(Integer [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * 获取实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。
     * @return EngineVersions 实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。
     */
    public String [] getEngineVersions() {
        return this.EngineVersions;
    }

    /**
     * 设置实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。
     * @param EngineVersions 实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。
     */
    public void setEngineVersions(String [] EngineVersions) {
        this.EngineVersions = EngineVersions;
    }

    /**
     * 获取私有网络的 ID。
     * @return VpcIds 私有网络的 ID。
     */
    public Integer [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * 设置私有网络的 ID。
     * @param VpcIds 私有网络的 ID。
     */
    public void setVpcIds(Integer [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * 获取可用区的 ID。
     * @return ZoneIds 可用区的 ID。
     */
    public Integer [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * 设置可用区的 ID。
     * @param ZoneIds 可用区的 ID。
     */
    public void setZoneIds(Integer [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * 获取子网 ID。
     * @return SubnetIds 子网 ID。
     */
    public Integer [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * 设置子网 ID。
     * @param SubnetIds 子网 ID。
     */
    public void setSubnetIds(Integer [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * 获取是否锁定标记。
     * @return CdbErrors 是否锁定标记。
     */
    public Integer [] getCdbErrors() {
        return this.CdbErrors;
    }

    /**
     * 设置是否锁定标记。
     * @param CdbErrors 是否锁定标记。
     */
    public void setCdbErrors(Integer [] CdbErrors) {
        this.CdbErrors = CdbErrors;
    }

    /**
     * 获取返回结果集排序的字段，目前支持："InstanceId"，"InstanceName"，"CreateTime"，"DeadlineTime"。
     * @return OrderBy 返回结果集排序的字段，目前支持："InstanceId"，"InstanceName"，"CreateTime"，"DeadlineTime"。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * 设置返回结果集排序的字段，目前支持："InstanceId"，"InstanceName"，"CreateTime"，"DeadlineTime"。
     * @param OrderBy 返回结果集排序的字段，目前支持："InstanceId"，"InstanceName"，"CreateTime"，"DeadlineTime"。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * 获取返回结果集排序方式，目前支持："ASC" 或者 "DESC"。
     * @return OrderDirection 返回结果集排序方式，目前支持："ASC" 或者 "DESC"。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * 设置返回结果集排序方式，目前支持："ASC" 或者 "DESC"。
     * @param OrderDirection 返回结果集排序方式，目前支持："ASC" 或者 "DESC"。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * 获取是否以安全组 ID 为过滤条件。
     * @return WithSecurityGroup 是否以安全组 ID 为过滤条件。
     */
    public Integer getWithSecurityGroup() {
        return this.WithSecurityGroup;
    }

    /**
     * 设置是否以安全组 ID 为过滤条件。
     * @param WithSecurityGroup 是否以安全组 ID 为过滤条件。
     */
    public void setWithSecurityGroup(Integer WithSecurityGroup) {
        this.WithSecurityGroup = WithSecurityGroup;
    }

    /**
     * 获取是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。
     * @return WithExCluster 是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。
     */
    public Integer getWithExCluster() {
        return this.WithExCluster;
    }

    /**
     * 设置是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。
     * @param WithExCluster 是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。
     */
    public void setWithExCluster(Integer WithExCluster) {
        this.WithExCluster = WithExCluster;
    }

    /**
     * 获取独享集群 ID。
     * @return ExClusterId 独享集群 ID。
     */
    public String getExClusterId() {
        return this.ExClusterId;
    }

    /**
     * 设置独享集群 ID。
     * @param ExClusterId 独享集群 ID。
     */
    public void setExClusterId(String ExClusterId) {
        this.ExClusterId = ExClusterId;
    }

    /**
     * 获取实例 ID。
     * @return InstanceIds 实例 ID。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置实例 ID。
     * @param InstanceIds 实例 ID。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取初始化标记，可取值：0 - 未初始化，1 - 初始化。
     * @return InitFlag 初始化标记，可取值：0 - 未初始化，1 - 初始化。
     */
    public Integer getInitFlag() {
        return this.InitFlag;
    }

    /**
     * 设置初始化标记，可取值：0 - 未初始化，1 - 初始化。
     * @param InitFlag 初始化标记，可取值：0 - 未初始化，1 - 初始化。
     */
    public void setInitFlag(Integer InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * 获取是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。
     * @return WithDr 是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。
     */
    public Integer getWithDr() {
        return this.WithDr;
    }

    /**
     * 设置是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。
     * @param WithDr 是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。
     */
    public void setWithDr(Integer WithDr) {
        this.WithDr = WithDr;
    }

    /**
     * 获取是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     * @return WithRo 是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     */
    public Integer getWithRo() {
        return this.WithRo;
    }

    /**
     * 设置是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     * @param WithRo 是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     */
    public void setWithRo(Integer WithRo) {
        this.WithRo = WithRo;
    }

    /**
     * 获取是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     * @return WithMaster 是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     */
    public Integer getWithMaster() {
        return this.WithMaster;
    }

    /**
     * 设置是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     * @param WithMaster 是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。
     */
    public void setWithMaster(Integer WithMaster) {
        this.WithMaster = WithMaster;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

