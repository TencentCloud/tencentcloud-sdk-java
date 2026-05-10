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
    * <p>项目 ID。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private Long [] InstanceTypes;

    /**
    * <p>实例的内网 IP 地址。</p>
    */
    @SerializedName("Vips")
    @Expose
    private String [] Vips;

    /**
    * <p>实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 已隔离（可在回收站恢复开机）</p>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>偏移量，默认值为 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>单次请求返回的数量，默认值为 20，最大值为 2000。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。</p>
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * <p>付费类型，可取值：0 - 包年包月，1 - 小时计费。</p>
    */
    @SerializedName("PayTypes")
    @Expose
    private Long [] PayTypes;

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceNames")
    @Expose
    private String [] InstanceNames;

    /**
    * <p>实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成<br>19 - 参数设置待执行<br>34 - 原地升级待执行</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * <p>实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。</p>
    */
    @SerializedName("EngineVersions")
    @Expose
    private String [] EngineVersions;

    /**
    * <p>私有网络的 ID。</p>
    */
    @SerializedName("VpcIds")
    @Expose
    private Long [] VpcIds;

    /**
    * <p>可用区的 ID。</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>子网 ID。</p>
    */
    @SerializedName("SubnetIds")
    @Expose
    private Long [] SubnetIds;

    /**
    * <p>是否锁定标记，可选值：0 - 不锁定，1 - 锁定，默认为0。</p>
    */
    @SerializedName("CdbErrors")
    @Expose
    private Long [] CdbErrors;

    /**
    * <p>返回结果集排序的字段，目前支持：&quot;instanceId&quot;，&quot;instanceName&quot;，&quot;createTime&quot;，&quot;deadlineTime&quot;。</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>返回结果集排序方式。目前支持值：&quot;ASC&quot; - 表示升序，&quot;DESC&quot; - 表示降序，默认为 &quot;DESC&quot;。</p>
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
    * <p>是否以安全组 ID 为过滤条件。<br>说明：0表示否，1表示是。</p>
    */
    @SerializedName("WithSecurityGroup")
    @Expose
    private Long WithSecurityGroup;

    /**
    * <p>是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。</p>
    */
    @SerializedName("WithExCluster")
    @Expose
    private Long WithExCluster;

    /**
    * <p>独享集群 ID。</p>
    */
    @SerializedName("ExClusterId")
    @Expose
    private String ExClusterId;

    /**
    * <p>实例 ID。</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>初始化标记，可取值：0 - 未初始化，1 - 初始化。</p>
    */
    @SerializedName("InitFlag")
    @Expose
    private Long InitFlag;

    /**
    * <p>是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。</p>
    */
    @SerializedName("WithDr")
    @Expose
    private Long WithDr;

    /**
    * <p>是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。</p>
    */
    @SerializedName("WithRo")
    @Expose
    private Long WithRo;

    /**
    * <p>是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。</p>
    */
    @SerializedName("WithMaster")
    @Expose
    private Long WithMaster;

    /**
    * <p>置放群组ID列表。</p>
    */
    @SerializedName("DeployGroupIds")
    @Expose
    private String [] DeployGroupIds;

    /**
    * <p>是否以标签键为过滤条件。</p>
    */
    @SerializedName("TagKeysForSearch")
    @Expose
    private String [] TagKeysForSearch;

    /**
    * <p>金融围拢 ID 。</p>
    */
    @SerializedName("CageIds")
    @Expose
    private String [] CageIds;

    /**
    * <p>标签值</p>
    */
    @SerializedName("TagValues")
    @Expose
    private String [] TagValues;

    /**
    * <p>私有网络字符型vpcId</p>
    */
    @SerializedName("UniqueVpcIds")
    @Expose
    private String [] UniqueVpcIds;

    /**
    * <p>私有网络字符型subnetId</p>
    */
    @SerializedName("UniqSubnetIds")
    @Expose
    private String [] UniqSubnetIds;

    /**
    * <p>标签键值<br>请注意，创建中的实例无法查询到标签。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>数据库代理 IP 。</p>
    */
    @SerializedName("ProxyVips")
    @Expose
    private String [] ProxyVips;

    /**
    * <p>数据库代理 ID 。</p>
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * <p>数据库引擎类型。可选值为：InnoDB、RocksDB。</p>
    */
    @SerializedName("EngineTypes")
    @Expose
    private String [] EngineTypes;

    /**
    * <p>是否获取云盘版实例节点信息，可填：true 或 false。默认为 false。</p>
    */
    @SerializedName("QueryClusterInfo")
    @Expose
    private Boolean QueryClusterInfo;

    /**
     * Get <p>项目 ID。</p> 
     * @return ProjectId <p>项目 ID。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目 ID。</p>
     * @param ProjectId <p>项目 ID。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。</p> 
     * @return InstanceTypes <p>实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。</p>
     */
    public Long [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set <p>实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。</p>
     * @param InstanceTypes <p>实例类型，可取值：1 - 主实例，2 - 灾备实例，3 - 只读实例。</p>
     */
    public void setInstanceTypes(Long [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get <p>实例的内网 IP 地址。</p> 
     * @return Vips <p>实例的内网 IP 地址。</p>
     */
    public String [] getVips() {
        return this.Vips;
    }

    /**
     * Set <p>实例的内网 IP 地址。</p>
     * @param Vips <p>实例的内网 IP 地址。</p>
     */
    public void setVips(String [] Vips) {
        this.Vips = Vips;
    }

    /**
     * Get <p>实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 已隔离（可在回收站恢复开机）</p> 
     * @return Status <p>实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 已隔离（可在回收站恢复开机）</p>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 已隔离（可在回收站恢复开机）</p>
     * @param Status <p>实例状态，可取值：<br>0 - 创建中<br>1 - 运行中<br>4 - 正在进行隔离操作<br>5 - 已隔离（可在回收站恢复开机）</p>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>偏移量，默认值为 0。</p> 
     * @return Offset <p>偏移量，默认值为 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认值为 0。</p>
     * @param Offset <p>偏移量，默认值为 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>单次请求返回的数量，默认值为 20，最大值为 2000。</p> 
     * @return Limit <p>单次请求返回的数量，默认值为 20，最大值为 2000。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单次请求返回的数量，默认值为 20，最大值为 2000。</p>
     * @param Limit <p>单次请求返回的数量，默认值为 20，最大值为 2000。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。</p> 
     * @return SecurityGroupId <p>安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。</p>
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set <p>安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。</p>
     * @param SecurityGroupId <p>安全组 ID。当使用安全组 ID 为过滤条件时，需指定 WithSecurityGroup 参数为 1。</p>
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get <p>付费类型，可取值：0 - 包年包月，1 - 小时计费。</p> 
     * @return PayTypes <p>付费类型，可取值：0 - 包年包月，1 - 小时计费。</p>
     */
    public Long [] getPayTypes() {
        return this.PayTypes;
    }

    /**
     * Set <p>付费类型，可取值：0 - 包年包月，1 - 小时计费。</p>
     * @param PayTypes <p>付费类型，可取值：0 - 包年包月，1 - 小时计费。</p>
     */
    public void setPayTypes(Long [] PayTypes) {
        this.PayTypes = PayTypes;
    }

    /**
     * Get <p>实例名称。</p> 
     * @return InstanceNames <p>实例名称。</p>
     */
    public String [] getInstanceNames() {
        return this.InstanceNames;
    }

    /**
     * Set <p>实例名称。</p>
     * @param InstanceNames <p>实例名称。</p>
     */
    public void setInstanceNames(String [] InstanceNames) {
        this.InstanceNames = InstanceNames;
    }

    /**
     * Get <p>实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成<br>19 - 参数设置待执行<br>34 - 原地升级待执行</p> 
     * @return TaskStatus <p>实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成<br>19 - 参数设置待执行<br>34 - 原地升级待执行</p>
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成<br>19 - 参数设置待执行<br>34 - 原地升级待执行</p>
     * @param TaskStatus <p>实例任务状态，可能取值：<br>0 - 没有任务<br>1 - 升级中<br>2 - 数据导入中<br>3 - 开放Slave中<br>4 - 外网访问开通中<br>5 - 批量操作执行中<br>6 - 回档中<br>7 - 外网访问关闭中<br>8 - 密码修改中<br>9 - 实例名修改中<br>10 - 重启中<br>12 - 自建迁移中<br>13 - 删除库表中<br>14 - 灾备实例创建同步中<br>15 - 升级待切换<br>16 - 升级切换中<br>17 - 升级切换完成<br>19 - 参数设置待执行<br>34 - 原地升级待执行</p>
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。</p> 
     * @return EngineVersions <p>实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。</p>
     */
    public String [] getEngineVersions() {
        return this.EngineVersions;
    }

    /**
     * Set <p>实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。</p>
     * @param EngineVersions <p>实例数据库引擎版本，可能取值：5.1、5.5、5.6 和 5.7。</p>
     */
    public void setEngineVersions(String [] EngineVersions) {
        this.EngineVersions = EngineVersions;
    }

    /**
     * Get <p>私有网络的 ID。</p> 
     * @return VpcIds <p>私有网络的 ID。</p>
     */
    public Long [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set <p>私有网络的 ID。</p>
     * @param VpcIds <p>私有网络的 ID。</p>
     */
    public void setVpcIds(Long [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get <p>可用区的 ID。</p> 
     * @return ZoneIds <p>可用区的 ID。</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>可用区的 ID。</p>
     * @param ZoneIds <p>可用区的 ID。</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>子网 ID。</p> 
     * @return SubnetIds <p>子网 ID。</p>
     */
    public Long [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set <p>子网 ID。</p>
     * @param SubnetIds <p>子网 ID。</p>
     */
    public void setSubnetIds(Long [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get <p>是否锁定标记，可选值：0 - 不锁定，1 - 锁定，默认为0。</p> 
     * @return CdbErrors <p>是否锁定标记，可选值：0 - 不锁定，1 - 锁定，默认为0。</p>
     */
    public Long [] getCdbErrors() {
        return this.CdbErrors;
    }

    /**
     * Set <p>是否锁定标记，可选值：0 - 不锁定，1 - 锁定，默认为0。</p>
     * @param CdbErrors <p>是否锁定标记，可选值：0 - 不锁定，1 - 锁定，默认为0。</p>
     */
    public void setCdbErrors(Long [] CdbErrors) {
        this.CdbErrors = CdbErrors;
    }

    /**
     * Get <p>返回结果集排序的字段，目前支持：&quot;instanceId&quot;，&quot;instanceName&quot;，&quot;createTime&quot;，&quot;deadlineTime&quot;。</p> 
     * @return OrderBy <p>返回结果集排序的字段，目前支持：&quot;instanceId&quot;，&quot;instanceName&quot;，&quot;createTime&quot;，&quot;deadlineTime&quot;。</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>返回结果集排序的字段，目前支持：&quot;instanceId&quot;，&quot;instanceName&quot;，&quot;createTime&quot;，&quot;deadlineTime&quot;。</p>
     * @param OrderBy <p>返回结果集排序的字段，目前支持：&quot;instanceId&quot;，&quot;instanceName&quot;，&quot;createTime&quot;，&quot;deadlineTime&quot;。</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>返回结果集排序方式。目前支持值：&quot;ASC&quot; - 表示升序，&quot;DESC&quot; - 表示降序，默认为 &quot;DESC&quot;。</p> 
     * @return OrderDirection <p>返回结果集排序方式。目前支持值：&quot;ASC&quot; - 表示升序，&quot;DESC&quot; - 表示降序，默认为 &quot;DESC&quot;。</p>
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set <p>返回结果集排序方式。目前支持值：&quot;ASC&quot; - 表示升序，&quot;DESC&quot; - 表示降序，默认为 &quot;DESC&quot;。</p>
     * @param OrderDirection <p>返回结果集排序方式。目前支持值：&quot;ASC&quot; - 表示升序，&quot;DESC&quot; - 表示降序，默认为 &quot;DESC&quot;。</p>
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Get <p>是否以安全组 ID 为过滤条件。<br>说明：0表示否，1表示是。</p> 
     * @return WithSecurityGroup <p>是否以安全组 ID 为过滤条件。<br>说明：0表示否，1表示是。</p>
     */
    public Long getWithSecurityGroup() {
        return this.WithSecurityGroup;
    }

    /**
     * Set <p>是否以安全组 ID 为过滤条件。<br>说明：0表示否，1表示是。</p>
     * @param WithSecurityGroup <p>是否以安全组 ID 为过滤条件。<br>说明：0表示否，1表示是。</p>
     */
    public void setWithSecurityGroup(Long WithSecurityGroup) {
        this.WithSecurityGroup = WithSecurityGroup;
    }

    /**
     * Get <p>是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。</p> 
     * @return WithExCluster <p>是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。</p>
     */
    public Long getWithExCluster() {
        return this.WithExCluster;
    }

    /**
     * Set <p>是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。</p>
     * @param WithExCluster <p>是否包含独享集群详细信息，可取值：0 - 不包含，1 - 包含。</p>
     */
    public void setWithExCluster(Long WithExCluster) {
        this.WithExCluster = WithExCluster;
    }

    /**
     * Get <p>独享集群 ID。</p> 
     * @return ExClusterId <p>独享集群 ID。</p>
     */
    public String getExClusterId() {
        return this.ExClusterId;
    }

    /**
     * Set <p>独享集群 ID。</p>
     * @param ExClusterId <p>独享集群 ID。</p>
     */
    public void setExClusterId(String ExClusterId) {
        this.ExClusterId = ExClusterId;
    }

    /**
     * Get <p>实例 ID。</p> 
     * @return InstanceIds <p>实例 ID。</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>实例 ID。</p>
     * @param InstanceIds <p>实例 ID。</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>初始化标记，可取值：0 - 未初始化，1 - 初始化。</p> 
     * @return InitFlag <p>初始化标记，可取值：0 - 未初始化，1 - 初始化。</p>
     */
    public Long getInitFlag() {
        return this.InitFlag;
    }

    /**
     * Set <p>初始化标记，可取值：0 - 未初始化，1 - 初始化。</p>
     * @param InitFlag <p>初始化标记，可取值：0 - 未初始化，1 - 初始化。</p>
     */
    public void setInitFlag(Long InitFlag) {
        this.InitFlag = InitFlag;
    }

    /**
     * Get <p>是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。</p> 
     * @return WithDr <p>是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。</p>
     */
    public Long getWithDr() {
        return this.WithDr;
    }

    /**
     * Set <p>是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。</p>
     * @param WithDr <p>是否包含灾备关系对应的实例，可取值：0 - 不包含，1 - 包含。默认取值为1。如果拉取主实例，则灾备关系的数据在DrInfo字段中， 如果拉取灾备实例， 则灾备关系的数据在MasterInfo字段中。灾备关系中只包含部分基本的数据，详细的数据需要自行调接口拉取。</p>
     */
    public void setWithDr(Long WithDr) {
        this.WithDr = WithDr;
    }

    /**
     * Get <p>是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。</p> 
     * @return WithRo <p>是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。</p>
     */
    public Long getWithRo() {
        return this.WithRo;
    }

    /**
     * Set <p>是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。</p>
     * @param WithRo <p>是否包含只读实例，可取值：0 - 不包含，1 - 包含。默认取值为1。</p>
     */
    public void setWithRo(Long WithRo) {
        this.WithRo = WithRo;
    }

    /**
     * Get <p>是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。</p> 
     * @return WithMaster <p>是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。</p>
     */
    public Long getWithMaster() {
        return this.WithMaster;
    }

    /**
     * Set <p>是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。</p>
     * @param WithMaster <p>是否包含主实例，可取值：0 - 不包含，1 - 包含。默认取值为1。</p>
     */
    public void setWithMaster(Long WithMaster) {
        this.WithMaster = WithMaster;
    }

    /**
     * Get <p>置放群组ID列表。</p> 
     * @return DeployGroupIds <p>置放群组ID列表。</p>
     */
    public String [] getDeployGroupIds() {
        return this.DeployGroupIds;
    }

    /**
     * Set <p>置放群组ID列表。</p>
     * @param DeployGroupIds <p>置放群组ID列表。</p>
     */
    public void setDeployGroupIds(String [] DeployGroupIds) {
        this.DeployGroupIds = DeployGroupIds;
    }

    /**
     * Get <p>是否以标签键为过滤条件。</p> 
     * @return TagKeysForSearch <p>是否以标签键为过滤条件。</p>
     */
    public String [] getTagKeysForSearch() {
        return this.TagKeysForSearch;
    }

    /**
     * Set <p>是否以标签键为过滤条件。</p>
     * @param TagKeysForSearch <p>是否以标签键为过滤条件。</p>
     */
    public void setTagKeysForSearch(String [] TagKeysForSearch) {
        this.TagKeysForSearch = TagKeysForSearch;
    }

    /**
     * Get <p>金融围拢 ID 。</p> 
     * @return CageIds <p>金融围拢 ID 。</p>
     */
    public String [] getCageIds() {
        return this.CageIds;
    }

    /**
     * Set <p>金融围拢 ID 。</p>
     * @param CageIds <p>金融围拢 ID 。</p>
     */
    public void setCageIds(String [] CageIds) {
        this.CageIds = CageIds;
    }

    /**
     * Get <p>标签值</p> 
     * @return TagValues <p>标签值</p>
     */
    public String [] getTagValues() {
        return this.TagValues;
    }

    /**
     * Set <p>标签值</p>
     * @param TagValues <p>标签值</p>
     */
    public void setTagValues(String [] TagValues) {
        this.TagValues = TagValues;
    }

    /**
     * Get <p>私有网络字符型vpcId</p> 
     * @return UniqueVpcIds <p>私有网络字符型vpcId</p>
     */
    public String [] getUniqueVpcIds() {
        return this.UniqueVpcIds;
    }

    /**
     * Set <p>私有网络字符型vpcId</p>
     * @param UniqueVpcIds <p>私有网络字符型vpcId</p>
     */
    public void setUniqueVpcIds(String [] UniqueVpcIds) {
        this.UniqueVpcIds = UniqueVpcIds;
    }

    /**
     * Get <p>私有网络字符型subnetId</p> 
     * @return UniqSubnetIds <p>私有网络字符型subnetId</p>
     */
    public String [] getUniqSubnetIds() {
        return this.UniqSubnetIds;
    }

    /**
     * Set <p>私有网络字符型subnetId</p>
     * @param UniqSubnetIds <p>私有网络字符型subnetId</p>
     */
    public void setUniqSubnetIds(String [] UniqSubnetIds) {
        this.UniqSubnetIds = UniqSubnetIds;
    }

    /**
     * Get <p>标签键值<br>请注意，创建中的实例无法查询到标签。</p> 
     * @return Tags <p>标签键值<br>请注意，创建中的实例无法查询到标签。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签键值<br>请注意，创建中的实例无法查询到标签。</p>
     * @param Tags <p>标签键值<br>请注意，创建中的实例无法查询到标签。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>数据库代理 IP 。</p> 
     * @return ProxyVips <p>数据库代理 IP 。</p>
     */
    public String [] getProxyVips() {
        return this.ProxyVips;
    }

    /**
     * Set <p>数据库代理 IP 。</p>
     * @param ProxyVips <p>数据库代理 IP 。</p>
     */
    public void setProxyVips(String [] ProxyVips) {
        this.ProxyVips = ProxyVips;
    }

    /**
     * Get <p>数据库代理 ID 。</p> 
     * @return ProxyIds <p>数据库代理 ID 。</p>
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set <p>数据库代理 ID 。</p>
     * @param ProxyIds <p>数据库代理 ID 。</p>
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    /**
     * Get <p>数据库引擎类型。可选值为：InnoDB、RocksDB。</p> 
     * @return EngineTypes <p>数据库引擎类型。可选值为：InnoDB、RocksDB。</p>
     */
    public String [] getEngineTypes() {
        return this.EngineTypes;
    }

    /**
     * Set <p>数据库引擎类型。可选值为：InnoDB、RocksDB。</p>
     * @param EngineTypes <p>数据库引擎类型。可选值为：InnoDB、RocksDB。</p>
     */
    public void setEngineTypes(String [] EngineTypes) {
        this.EngineTypes = EngineTypes;
    }

    /**
     * Get <p>是否获取云盘版实例节点信息，可填：true 或 false。默认为 false。</p> 
     * @return QueryClusterInfo <p>是否获取云盘版实例节点信息，可填：true 或 false。默认为 false。</p>
     */
    public Boolean getQueryClusterInfo() {
        return this.QueryClusterInfo;
    }

    /**
     * Set <p>是否获取云盘版实例节点信息，可填：true 或 false。默认为 false。</p>
     * @param QueryClusterInfo <p>是否获取云盘版实例节点信息，可填：true 或 false。默认为 false。</p>
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

