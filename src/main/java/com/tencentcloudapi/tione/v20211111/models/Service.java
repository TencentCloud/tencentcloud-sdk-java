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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Service extends AbstractModel{

    /**
    * 服务组id
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * 服务id
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 服务组名
    */
    @SerializedName("ServiceGroupName")
    @Expose
    private String ServiceGroupName;

    /**
    * 服务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDescription")
    @Expose
    private String ServiceDescription;

    /**
    * 服务的详细信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceInfo")
    @Expose
    private ServiceInfo ServiceInfo;

    /**
    * 集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 付费类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 包年包月服务的资源组id，按量计费的服务为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 包年包月服务对应的资源组名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 服务的标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 服务所在的 ingress 的 name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IngressName")
    @Expose
    private String IngressName;

    /**
    * 创建者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 主账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * app_id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 服务的业务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessStatus")
    @Expose
    private String BusinessStatus;

    /**
    * 已废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceLimit")
    @Expose
    private ServiceLimit ServiceLimit;

    /**
    * 已废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduledAction")
    @Expose
    private ScheduledAction ScheduledAction;

    /**
    * 服务创建失败的原因，创建成功后该字段为默认值 CREATE_SUCCEED
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateFailedReason")
    @Expose
    private String CreateFailedReason;

    /**
    * 服务状态
CREATING 创建中
CREATE_FAILED 创建失败
Normal	正常运行中
Stopped  已停止
Stopping 停止中
Abnormal 异常
Pending 启动中
Waiting 就绪中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 费用信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
    * 模型权重
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 服务的创建来源
AUTO_ML: 来自自动学习的一键发布
DEFAULT: 其他来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateSource")
    @Expose
    private String CreateSource;

    /**
    * 版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 服务组下服务的最高版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
     * Get 服务组id 
     * @return ServiceGroupId 服务组id
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set 服务组id
     * @param ServiceGroupId 服务组id
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get 服务id 
     * @return ServiceId 服务id
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务id
     * @param ServiceId 服务id
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 服务组名 
     * @return ServiceGroupName 服务组名
     */
    public String getServiceGroupName() {
        return this.ServiceGroupName;
    }

    /**
     * Set 服务组名
     * @param ServiceGroupName 服务组名
     */
    public void setServiceGroupName(String ServiceGroupName) {
        this.ServiceGroupName = ServiceGroupName;
    }

    /**
     * Get 服务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDescription 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceDescription() {
        return this.ServiceDescription;
    }

    /**
     * Set 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDescription 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDescription(String ServiceDescription) {
        this.ServiceDescription = ServiceDescription;
    }

    /**
     * Get 服务的详细信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceInfo 服务的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceInfo getServiceInfo() {
        return this.ServiceInfo;
    }

    /**
     * Set 服务的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceInfo 服务的详细信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceInfo(ServiceInfo ServiceInfo) {
        this.ServiceInfo = ServiceInfo;
    }

    /**
     * Get 集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 付费类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 付费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 付费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 付费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 包年包月服务的资源组id，按量计费的服务为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId 包年包月服务的资源组id，按量计费的服务为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 包年包月服务的资源组id，按量计费的服务为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId 包年包月服务的资源组id，按量计费的服务为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 包年包月服务对应的资源组名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 包年包月服务对应的资源组名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 包年包月服务对应的资源组名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 包年包月服务对应的资源组名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 服务的标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 服务的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 服务的标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 服务的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 服务所在的 ingress 的 name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IngressName 服务所在的 ingress 的 name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIngressName() {
        return this.IngressName;
    }

    /**
     * Set 服务所在的 ingress 的 name
注意：此字段可能返回 null，表示取不到有效值。
     * @param IngressName 服务所在的 ingress 的 name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIngressName(String IngressName) {
        this.IngressName = IngressName;
    }

    /**
     * Get 创建者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedBy 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set 创建者
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedBy 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 主账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 主账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUin 子账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 子账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUin 子账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get app_id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId app_id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set app_id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId app_id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 服务的业务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessStatus 服务的业务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessStatus() {
        return this.BusinessStatus;
    }

    /**
     * Set 服务的业务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessStatus 服务的业务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessStatus(String BusinessStatus) {
        this.BusinessStatus = BusinessStatus;
    }

    /**
     * Get 已废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceLimit 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceLimit getServiceLimit() {
        return this.ServiceLimit;
    }

    /**
     * Set 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceLimit 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceLimit(ServiceLimit ServiceLimit) {
        this.ServiceLimit = ServiceLimit;
    }

    /**
     * Get 已废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduledAction 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScheduledAction getScheduledAction() {
        return this.ScheduledAction;
    }

    /**
     * Set 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduledAction 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduledAction(ScheduledAction ScheduledAction) {
        this.ScheduledAction = ScheduledAction;
    }

    /**
     * Get 服务创建失败的原因，创建成功后该字段为默认值 CREATE_SUCCEED
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateFailedReason 服务创建失败的原因，创建成功后该字段为默认值 CREATE_SUCCEED
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateFailedReason() {
        return this.CreateFailedReason;
    }

    /**
     * Set 服务创建失败的原因，创建成功后该字段为默认值 CREATE_SUCCEED
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateFailedReason 服务创建失败的原因，创建成功后该字段为默认值 CREATE_SUCCEED
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateFailedReason(String CreateFailedReason) {
        this.CreateFailedReason = CreateFailedReason;
    }

    /**
     * Get 服务状态
CREATING 创建中
CREATE_FAILED 创建失败
Normal	正常运行中
Stopped  已停止
Stopping 停止中
Abnormal 异常
Pending 启动中
Waiting 就绪中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 服务状态
CREATING 创建中
CREATE_FAILED 创建失败
Normal	正常运行中
Stopped  已停止
Stopping 停止中
Abnormal 异常
Pending 启动中
Waiting 就绪中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 服务状态
CREATING 创建中
CREATE_FAILED 创建失败
Normal	正常运行中
Stopped  已停止
Stopping 停止中
Abnormal 异常
Pending 启动中
Waiting 就绪中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 服务状态
CREATING 创建中
CREATE_FAILED 创建失败
Normal	正常运行中
Stopped  已停止
Stopping 停止中
Abnormal 异常
Pending 启动中
Waiting 就绪中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 费用信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingInfo 费用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set 费用信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingInfo 费用信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get 模型权重
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weight 模型权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 模型权重
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weight 模型权重
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 服务的创建来源
AUTO_ML: 来自自动学习的一键发布
DEFAULT: 其他来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateSource 服务的创建来源
AUTO_ML: 来自自动学习的一键发布
DEFAULT: 其他来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateSource() {
        return this.CreateSource;
    }

    /**
     * Set 服务的创建来源
AUTO_ML: 来自自动学习的一键发布
DEFAULT: 其他来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateSource 服务的创建来源
AUTO_ML: 来自自动学习的一键发布
DEFAULT: 其他来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateSource(String CreateSource) {
        this.CreateSource = CreateSource;
    }

    /**
     * Get 版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 服务组下服务的最高版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestVersion 服务组下服务的最高版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set 服务组下服务的最高版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestVersion 服务组下服务的最高版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
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

    }
}

