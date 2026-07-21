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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Service extends AbstractModel {

    /**
    * <p>服务组id</p>
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * <p>服务id</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>服务组名</p>
    */
    @SerializedName("ServiceGroupName")
    @Expose
    private String ServiceGroupName;

    /**
    * <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDescription")
    @Expose
    private String ServiceDescription;

    /**
    * <p>服务的详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceInfo")
    @Expose
    private ServiceInfo ServiceInfo;

    /**
    * <p>集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>付费类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>包年包月服务的资源组id，按量计费的服务为空</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>包年包月服务对应的资源组名字</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>服务的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>服务所在的 ingress 的 name</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IngressName")
    @Expose
    private String IngressName;

    /**
    * <p>创建者</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>子账号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>app_id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>服务的业务状态<br>CREATING 创建中<br>CREATE_FAILED 创建失败<br>CREATE_SUCCEED 创建成功<br>ARREARS_STOP 因欠费停止<br>WHITELIST_STOP 白名单额度不足<br>RELEASE_FAILED 资源释放失败<br>WHITELIST_RELEASE_FAILED 白名单资源释放失败<br>TIMEOUT_EXCEPTION 创建超时异常<br>BILLING 计费中<br>WHITELIST_USING 白名单试用中</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessStatus")
    @Expose
    private String BusinessStatus;

    /**
    * <p>已废弃,以ServiceInfo中的对应为准</p>
    */
    @SerializedName("ServiceLimit")
    @Expose
    private ServiceLimit ServiceLimit;

    /**
    * <p>已废弃,以ServiceInfo中的对应为准</p>
    */
    @SerializedName("ScheduledAction")
    @Expose
    private ScheduledAction ScheduledAction;

    /**
    * <p>服务创建失败的原因，创建成功后该字段为默认值 CREATE_SUCCEED</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateFailedReason")
    @Expose
    private String CreateFailedReason;

    /**
    * <p>服务状态<br>CREATING 创建中<br>CREATE_FAILED 创建失败<br>TIMEOUT_EXCEPTION 创建超时异常<br>Normal 正常运行中<br>Stopped 已停止<br>Stopping 停止中<br>Abnormal 异常<br>Pending 启动中<br>Waiting 就绪中</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>费用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
    * <p>模型权重</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * <p>服务的创建来源<br>AUTO_ML: 来自自动学习的一键发布<br>DEFAULT: 其他来源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateSource")
    @Expose
    private String CreateSource;

    /**
    * <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>服务组下服务的最高版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
    * <p>资源组类别 托管 NORMAL，纳管 SW</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupSWType")
    @Expose
    private String ResourceGroupSWType;

    /**
    * <p>服务的归档状态  Waiting 等待归档中，Archived 已归档</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArchiveStatus")
    @Expose
    private String ArchiveStatus;

    /**
    * <p>服务的部署类型 [STANDARD 标准部署，DIST 分布式多机部署] 默认STANDARD</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
    * <p>单副本下的实例数，仅在部署类型为DIST时生效，默认1</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstancePerReplicas")
    @Expose
    private String InstancePerReplicas;

    /**
    * <p>用于监控查询的Source<br>枚举值，部分情况下与CreateSource不同，通过该字段兼容</p>
    */
    @SerializedName("MonitorSource")
    @Expose
    private String MonitorSource;

    /**
    * <p>服务创建者的子账号名称</p>
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
    * <p>服务的调度策略</p>
    */
    @SerializedName("SchedulingPolicy")
    @Expose
    private SchedulingPolicy SchedulingPolicy;

    /**
    * <p>外部的资源组信息，表示借调了哪些资源组的资源</p>
    */
    @SerializedName("ExternalResourceGroups")
    @Expose
    private ResourceGroupInfo [] ExternalResourceGroups;

    /**
    * <p>服务所属的项目 id,0表示默认空间</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>变更服务的子账户</p>
    */
    @SerializedName("Changer")
    @Expose
    private String Changer;

    /**
    * <p>变更服务的子账户名称</p>
    */
    @SerializedName("ChangerName")
    @Expose
    private String ChangerName;

    /**
     * Get <p>服务组id</p> 
     * @return ServiceGroupId <p>服务组id</p>
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set <p>服务组id</p>
     * @param ServiceGroupId <p>服务组id</p>
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get <p>服务id</p> 
     * @return ServiceId <p>服务id</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务id</p>
     * @param ServiceId <p>服务id</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>服务组名</p> 
     * @return ServiceGroupName <p>服务组名</p>
     */
    public String getServiceGroupName() {
        return this.ServiceGroupName;
    }

    /**
     * Set <p>服务组名</p>
     * @param ServiceGroupName <p>服务组名</p>
     */
    public void setServiceGroupName(String ServiceGroupName) {
        this.ServiceGroupName = ServiceGroupName;
    }

    /**
     * Get <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDescription <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceDescription() {
        return this.ServiceDescription;
    }

    /**
     * Set <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDescription <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }

    /**
     * Get <p>服务的详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceInfo <p>服务的详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceInfo getServiceInfo() {
        return this.ServiceInfo;
    }

    /**
     * Set <p>服务的详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceInfo <p>服务的详细信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceInfo(ServiceInfo ServiceInfo) {
        this.ServiceInfo = ServiceInfo;
    }

    /**
     * Get <p>集群id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId <p>集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId <p>集群id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace <p>命名空间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>付费类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType <p>付费类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>付费类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType <p>付费类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>包年包月服务的资源组id，按量计费的服务为空</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId <p>包年包月服务的资源组id，按量计费的服务为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>包年包月服务的资源组id，按量计费的服务为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId <p>包年包月服务的资源组id，按量计费的服务为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>包年包月服务对应的资源组名字</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName <p>包年包月服务对应的资源组名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>包年包月服务对应的资源组名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName <p>包年包月服务对应的资源组名字</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>服务的标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>服务的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>服务的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>服务的标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>服务所在的 ingress 的 name</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IngressName <p>服务所在的 ingress 的 name</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIngressName() {
        return this.IngressName;
    }

    /**
     * Set <p>服务所在的 ingress 的 name</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IngressName <p>服务所在的 ingress 的 name</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIngressName(String IngressName) {
        this.IngressName = IngressName;
    }

    /**
     * Get <p>创建者</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedBy <p>创建者</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set <p>创建者</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedBy <p>创建者</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>主账号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin <p>主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin <p>主账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>子账号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUin <p>子账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>子账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUin <p>子账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>app_id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>app_id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>app_id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>app_id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>服务的业务状态<br>CREATING 创建中<br>CREATE_FAILED 创建失败<br>CREATE_SUCCEED 创建成功<br>ARREARS_STOP 因欠费停止<br>WHITELIST_STOP 白名单额度不足<br>RELEASE_FAILED 资源释放失败<br>WHITELIST_RELEASE_FAILED 白名单资源释放失败<br>TIMEOUT_EXCEPTION 创建超时异常<br>BILLING 计费中<br>WHITELIST_USING 白名单试用中</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessStatus <p>服务的业务状态<br>CREATING 创建中<br>CREATE_FAILED 创建失败<br>CREATE_SUCCEED 创建成功<br>ARREARS_STOP 因欠费停止<br>WHITELIST_STOP 白名单额度不足<br>RELEASE_FAILED 资源释放失败<br>WHITELIST_RELEASE_FAILED 白名单资源释放失败<br>TIMEOUT_EXCEPTION 创建超时异常<br>BILLING 计费中<br>WHITELIST_USING 白名单试用中</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessStatus() {
        return this.BusinessStatus;
    }

    /**
     * Set <p>服务的业务状态<br>CREATING 创建中<br>CREATE_FAILED 创建失败<br>CREATE_SUCCEED 创建成功<br>ARREARS_STOP 因欠费停止<br>WHITELIST_STOP 白名单额度不足<br>RELEASE_FAILED 资源释放失败<br>WHITELIST_RELEASE_FAILED 白名单资源释放失败<br>TIMEOUT_EXCEPTION 创建超时异常<br>BILLING 计费中<br>WHITELIST_USING 白名单试用中</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessStatus <p>服务的业务状态<br>CREATING 创建中<br>CREATE_FAILED 创建失败<br>CREATE_SUCCEED 创建成功<br>ARREARS_STOP 因欠费停止<br>WHITELIST_STOP 白名单额度不足<br>RELEASE_FAILED 资源释放失败<br>WHITELIST_RELEASE_FAILED 白名单资源释放失败<br>TIMEOUT_EXCEPTION 创建超时异常<br>BILLING 计费中<br>WHITELIST_USING 白名单试用中</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessStatus(String BusinessStatus) {
        this.BusinessStatus = BusinessStatus;
    }

    /**
     * Get <p>已废弃,以ServiceInfo中的对应为准</p> 
     * @return ServiceLimit <p>已废弃,以ServiceInfo中的对应为准</p>
     * @deprecated
     */
    @Deprecated
    public ServiceLimit getServiceLimit() {
        return this.ServiceLimit;
    }

    /**
     * Set <p>已废弃,以ServiceInfo中的对应为准</p>
     * @param ServiceLimit <p>已废弃,以ServiceInfo中的对应为准</p>
     * @deprecated
     */
    @Deprecated
    public void setServiceLimit(ServiceLimit ServiceLimit) {
        this.ServiceLimit = ServiceLimit;
    }

    /**
     * Get <p>已废弃,以ServiceInfo中的对应为准</p> 
     * @return ScheduledAction <p>已废弃,以ServiceInfo中的对应为准</p>
     * @deprecated
     */
    @Deprecated
    public ScheduledAction getScheduledAction() {
        return this.ScheduledAction;
    }

    /**
     * Set <p>已废弃,以ServiceInfo中的对应为准</p>
     * @param ScheduledAction <p>已废弃,以ServiceInfo中的对应为准</p>
     * @deprecated
     */
    @Deprecated
    public void setScheduledAction(ScheduledAction ScheduledAction) {
        this.ScheduledAction = ScheduledAction;
    }

    /**
     * Get <p>服务创建失败的原因，创建成功后该字段为默认值 CREATE_SUCCEED</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateFailedReason <p>服务创建失败的原因，创建成功后该字段为默认值 CREATE_SUCCEED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateFailedReason() {
        return this.CreateFailedReason;
    }

    /**
     * Set <p>服务创建失败的原因，创建成功后该字段为默认值 CREATE_SUCCEED</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateFailedReason <p>服务创建失败的原因，创建成功后该字段为默认值 CREATE_SUCCEED</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateFailedReason(String CreateFailedReason) {
        this.CreateFailedReason = CreateFailedReason;
    }

    /**
     * Get <p>服务状态<br>CREATING 创建中<br>CREATE_FAILED 创建失败<br>TIMEOUT_EXCEPTION 创建超时异常<br>Normal 正常运行中<br>Stopped 已停止<br>Stopping 停止中<br>Abnormal 异常<br>Pending 启动中<br>Waiting 就绪中</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>服务状态<br>CREATING 创建中<br>CREATE_FAILED 创建失败<br>TIMEOUT_EXCEPTION 创建超时异常<br>Normal 正常运行中<br>Stopped 已停止<br>Stopping 停止中<br>Abnormal 异常<br>Pending 启动中<br>Waiting 就绪中</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>服务状态<br>CREATING 创建中<br>CREATE_FAILED 创建失败<br>TIMEOUT_EXCEPTION 创建超时异常<br>Normal 正常运行中<br>Stopped 已停止<br>Stopping 停止中<br>Abnormal 异常<br>Pending 启动中<br>Waiting 就绪中</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>服务状态<br>CREATING 创建中<br>CREATE_FAILED 创建失败<br>TIMEOUT_EXCEPTION 创建超时异常<br>Normal 正常运行中<br>Stopped 已停止<br>Stopping 停止中<br>Abnormal 异常<br>Pending 启动中<br>Waiting 就绪中</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>费用信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingInfo <p>费用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set <p>费用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingInfo <p>费用信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get <p>模型权重</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight <p>模型权重</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>模型权重</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight <p>模型权重</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get <p>服务的创建来源<br>AUTO_ML: 来自自动学习的一键发布<br>DEFAULT: 其他来源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateSource <p>服务的创建来源<br>AUTO_ML: 来自自动学习的一键发布<br>DEFAULT: 其他来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateSource() {
        return this.CreateSource;
    }

    /**
     * Set <p>服务的创建来源<br>AUTO_ML: 来自自动学习的一键发布<br>DEFAULT: 其他来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateSource <p>服务的创建来源<br>AUTO_ML: 来自自动学习的一键发布<br>DEFAULT: 其他来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateSource(String CreateSource) {
        this.CreateSource = CreateSource;
    }

    /**
     * Get <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>服务组下服务的最高版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestVersion <p>服务组下服务的最高版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set <p>服务组下服务的最高版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestVersion <p>服务组下服务的最高版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Get <p>资源组类别 托管 NORMAL，纳管 SW</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupSWType <p>资源组类别 托管 NORMAL，纳管 SW</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupSWType() {
        return this.ResourceGroupSWType;
    }

    /**
     * Set <p>资源组类别 托管 NORMAL，纳管 SW</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupSWType <p>资源组类别 托管 NORMAL，纳管 SW</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupSWType(String ResourceGroupSWType) {
        this.ResourceGroupSWType = ResourceGroupSWType;
    }

    /**
     * Get <p>服务的归档状态  Waiting 等待归档中，Archived 已归档</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArchiveStatus <p>服务的归档状态  Waiting 等待归档中，Archived 已归档</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArchiveStatus() {
        return this.ArchiveStatus;
    }

    /**
     * Set <p>服务的归档状态  Waiting 等待归档中，Archived 已归档</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArchiveStatus <p>服务的归档状态  Waiting 等待归档中，Archived 已归档</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArchiveStatus(String ArchiveStatus) {
        this.ArchiveStatus = ArchiveStatus;
    }

    /**
     * Get <p>服务的部署类型 [STANDARD 标准部署，DIST 分布式多机部署] 默认STANDARD</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployType <p>服务的部署类型 [STANDARD 标准部署，DIST 分布式多机部署] 默认STANDARD</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployType() {
        return this.DeployType;
    }

    /**
     * Set <p>服务的部署类型 [STANDARD 标准部署，DIST 分布式多机部署] 默认STANDARD</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployType <p>服务的部署类型 [STANDARD 标准部署，DIST 分布式多机部署] 默认STANDARD</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployType(String DeployType) {
        this.DeployType = DeployType;
    }

    /**
     * Get <p>单副本下的实例数，仅在部署类型为DIST时生效，默认1</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstancePerReplicas <p>单副本下的实例数，仅在部署类型为DIST时生效，默认1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstancePerReplicas() {
        return this.InstancePerReplicas;
    }

    /**
     * Set <p>单副本下的实例数，仅在部署类型为DIST时生效，默认1</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstancePerReplicas <p>单副本下的实例数，仅在部署类型为DIST时生效，默认1</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstancePerReplicas(String InstancePerReplicas) {
        this.InstancePerReplicas = InstancePerReplicas;
    }

    /**
     * Get <p>用于监控查询的Source<br>枚举值，部分情况下与CreateSource不同，通过该字段兼容</p> 
     * @return MonitorSource <p>用于监控查询的Source<br>枚举值，部分情况下与CreateSource不同，通过该字段兼容</p>
     */
    public String getMonitorSource() {
        return this.MonitorSource;
    }

    /**
     * Set <p>用于监控查询的Source<br>枚举值，部分情况下与CreateSource不同，通过该字段兼容</p>
     * @param MonitorSource <p>用于监控查询的Source<br>枚举值，部分情况下与CreateSource不同，通过该字段兼容</p>
     */
    public void setMonitorSource(String MonitorSource) {
        this.MonitorSource = MonitorSource;
    }

    /**
     * Get <p>服务创建者的子账号名称</p> 
     * @return SubUinName <p>服务创建者的子账号名称</p>
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set <p>服务创建者的子账号名称</p>
     * @param SubUinName <p>服务创建者的子账号名称</p>
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    /**
     * Get <p>服务的调度策略</p> 
     * @return SchedulingPolicy <p>服务的调度策略</p>
     */
    public SchedulingPolicy getSchedulingPolicy() {
        return this.SchedulingPolicy;
    }

    /**
     * Set <p>服务的调度策略</p>
     * @param SchedulingPolicy <p>服务的调度策略</p>
     */
    public void setSchedulingPolicy(SchedulingPolicy SchedulingPolicy) {
        this.SchedulingPolicy = SchedulingPolicy;
    }

    /**
     * Get <p>外部的资源组信息，表示借调了哪些资源组的资源</p> 
     * @return ExternalResourceGroups <p>外部的资源组信息，表示借调了哪些资源组的资源</p>
     */
    public ResourceGroupInfo [] getExternalResourceGroups() {
        return this.ExternalResourceGroups;
    }

    /**
     * Set <p>外部的资源组信息，表示借调了哪些资源组的资源</p>
     * @param ExternalResourceGroups <p>外部的资源组信息，表示借调了哪些资源组的资源</p>
     */
    public void setExternalResourceGroups(ResourceGroupInfo [] ExternalResourceGroups) {
        this.ExternalResourceGroups = ExternalResourceGroups;
    }

    /**
     * Get <p>服务所属的项目 id,0表示默认空间</p> 
     * @return ProjectId <p>服务所属的项目 id,0表示默认空间</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>服务所属的项目 id,0表示默认空间</p>
     * @param ProjectId <p>服务所属的项目 id,0表示默认空间</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>变更服务的子账户</p> 
     * @return Changer <p>变更服务的子账户</p>
     */
    public String getChanger() {
        return this.Changer;
    }

    /**
     * Set <p>变更服务的子账户</p>
     * @param Changer <p>变更服务的子账户</p>
     */
    public void setChanger(String Changer) {
        this.Changer = Changer;
    }

    /**
     * Get <p>变更服务的子账户名称</p> 
     * @return ChangerName <p>变更服务的子账户名称</p>
     */
    public String getChangerName() {
        return this.ChangerName;
    }

    /**
     * Set <p>变更服务的子账户名称</p>
     * @param ChangerName <p>变更服务的子账户名称</p>
     */
    public void setChangerName(String ChangerName) {
        this.ChangerName = ChangerName;
    }

    public Service() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Service(Service source) {
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceGroupName != null) {
            this.ServiceGroupName = new String(source.ServiceGroupName);
        }
        if (source.ServiceDescription != null) {
            this.ServiceDescription = new String(source.ServiceDescription);
        }
        if (source.ServiceInfo != null) {
            this.ServiceInfo = new ServiceInfo(source.ServiceInfo);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.IngressName != null) {
            this.IngressName = new String(source.IngressName);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BusinessStatus != null) {
            this.BusinessStatus = new String(source.BusinessStatus);
        }
        if (source.ServiceLimit != null) {
            this.ServiceLimit = new ServiceLimit(source.ServiceLimit);
        }
        if (source.ScheduledAction != null) {
            this.ScheduledAction = new ScheduledAction(source.ScheduledAction);
        }
        if (source.CreateFailedReason != null) {
            this.CreateFailedReason = new String(source.CreateFailedReason);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BillingInfo != null) {
            this.BillingInfo = new String(source.BillingInfo);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.CreateSource != null) {
            this.CreateSource = new String(source.CreateSource);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
        if (source.ResourceGroupSWType != null) {
            this.ResourceGroupSWType = new String(source.ResourceGroupSWType);
        }
        if (source.ArchiveStatus != null) {
            this.ArchiveStatus = new String(source.ArchiveStatus);
        }
        if (source.DeployType != null) {
            this.DeployType = new String(source.DeployType);
        }
        if (source.InstancePerReplicas != null) {
            this.InstancePerReplicas = new String(source.InstancePerReplicas);
        }
        if (source.MonitorSource != null) {
            this.MonitorSource = new String(source.MonitorSource);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
        if (source.SchedulingPolicy != null) {
            this.SchedulingPolicy = new SchedulingPolicy(source.SchedulingPolicy);
        }
        if (source.ExternalResourceGroups != null) {
            this.ExternalResourceGroups = new ResourceGroupInfo[source.ExternalResourceGroups.length];
            for (int i = 0; i < source.ExternalResourceGroups.length; i++) {
                this.ExternalResourceGroups[i] = new ResourceGroupInfo(source.ExternalResourceGroups[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Changer != null) {
            this.Changer = new String(source.Changer);
        }
        if (source.ChangerName != null) {
            this.ChangerName = new String(source.ChangerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceGroupName", this.ServiceGroupName);
        this.setParamSimple(map, prefix + "ServiceDescription", this.ServiceDescription);
        this.setParamObj(map, prefix + "ServiceInfo.", this.ServiceInfo);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IngressName", this.IngressName);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BusinessStatus", this.BusinessStatus);
        this.setParamObj(map, prefix + "ServiceLimit.", this.ServiceLimit);
        this.setParamObj(map, prefix + "ScheduledAction.", this.ScheduledAction);
        this.setParamSimple(map, prefix + "CreateFailedReason", this.CreateFailedReason);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BillingInfo", this.BillingInfo);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "CreateSource", this.CreateSource);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);
        this.setParamSimple(map, prefix + "ResourceGroupSWType", this.ResourceGroupSWType);
        this.setParamSimple(map, prefix + "ArchiveStatus", this.ArchiveStatus);
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);
        this.setParamSimple(map, prefix + "InstancePerReplicas", this.InstancePerReplicas);
        this.setParamSimple(map, prefix + "MonitorSource", this.MonitorSource);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);
        this.setParamObj(map, prefix + "SchedulingPolicy.", this.SchedulingPolicy);
        this.setParamArrayObj(map, prefix + "ExternalResourceGroups.", this.ExternalResourceGroups);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Changer", this.Changer);
        this.setParamSimple(map, prefix + "ChangerName", this.ChangerName);

    }
}

