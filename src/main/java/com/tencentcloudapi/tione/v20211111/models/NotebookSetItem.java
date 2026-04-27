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

public class NotebookSetItem extends AbstractModel {

    /**
    * <p>notebook ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>notebook 名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>计费模式</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>资源配置</p>
    */
    @SerializedName("ResourceConf")
    @Expose
    private ResourceConf ResourceConf;

    /**
    * <p>预付费资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>存储卷大小</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeSizeInGB")
    @Expose
    private Long VolumeSizeInGB;

    /**
    * <p>计费金额信息，eg：2.00元/小时 (for后付费)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingInfos")
    @Expose
    private String [] BillingInfos;

    /**
    * <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeInSeconds")
    @Expose
    private Long RuntimeInSeconds;

    /**
    * <p>计费状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeStatus")
    @Expose
    private String ChargeStatus;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>后付费资源规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTypeAlias")
    @Expose
    private String InstanceTypeAlias;

    /**
    * <p>预付费资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>是否自动终止</p>
    */
    @SerializedName("AutoStopping")
    @Expose
    private Boolean AutoStopping;

    /**
    * <p>自动停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutomaticStopTime")
    @Expose
    private Long AutomaticStopTime;

    /**
    * <p>存储的类型。取值包含：<br>    FREE:        预付费的免费存储<br>    CLOUD_PREMIUM： 高性能云硬盘<br>    CLOUD_SSD： SSD云硬盘<br>    CFS:     CFS存储，包含NFS和turbo</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeSourceType")
    @Expose
    private String VolumeSourceType;

    /**
    * <p>CFS存储的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeSourceCFS")
    @Expose
    private CFSConfig VolumeSourceCFS;

    /**
    * <p>notebook 信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>notebook用户类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserTypes")
    @Expose
    private String [] UserTypes;

    /**
    * <p>SSH配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSHConfig")
    @Expose
    private SSHConfig SSHConfig;

    /**
    * <p>GooseFS存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeSourceGooseFS")
    @Expose
    private GooseFS VolumeSourceGooseFS;

    /**
    * <p>子用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>子用户名称</p>
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
    * <p>AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>容器服务暴露端口配置</p>
    */
    @SerializedName("ExposePortConfig")
    @Expose
    private ExposePortConfig ExposePortConfig;

    /**
    * <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>操作者信息</p>
    */
    @SerializedName("LatestOperatorInfo")
    @Expose
    private OperatorInfo LatestOperatorInfo;

    /**
     * Get <p>notebook ID</p> 
     * @return Id <p>notebook ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>notebook ID</p>
     * @param Id <p>notebook ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>notebook 名称</p> 
     * @return Name <p>notebook 名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>notebook 名称</p>
     * @param Name <p>notebook 名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>计费模式</p> 
     * @return ChargeType <p>计费模式</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>计费模式</p>
     * @param ChargeType <p>计费模式</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>资源配置</p> 
     * @return ResourceConf <p>资源配置</p>
     */
    public ResourceConf getResourceConf() {
        return this.ResourceConf;
    }

    /**
     * Set <p>资源配置</p>
     * @param ResourceConf <p>资源配置</p>
     */
    public void setResourceConf(ResourceConf ResourceConf) {
        this.ResourceConf = ResourceConf;
    }

    /**
     * Get <p>预付费资源组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId <p>预付费资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>预付费资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId <p>预付费资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>存储卷大小</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeSizeInGB <p>存储卷大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVolumeSizeInGB() {
        return this.VolumeSizeInGB;
    }

    /**
     * Set <p>存储卷大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeSizeInGB <p>存储卷大小</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeSizeInGB(Long VolumeSizeInGB) {
        this.VolumeSizeInGB = VolumeSizeInGB;
    }

    /**
     * Get <p>计费金额信息，eg：2.00元/小时 (for后付费)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingInfos <p>计费金额信息，eg：2.00元/小时 (for后付费)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBillingInfos() {
        return this.BillingInfos;
    }

    /**
     * Set <p>计费金额信息，eg：2.00元/小时 (for后付费)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingInfos <p>计费金额信息，eg：2.00元/小时 (for后付费)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingInfos(String [] BillingInfos) {
        this.BillingInfos = BillingInfos;
    }

    /**
     * Get <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeInSeconds <p>运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuntimeInSeconds() {
        return this.RuntimeInSeconds;
    }

    /**
     * Set <p>运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeInSeconds <p>运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeInSeconds(Long RuntimeInSeconds) {
        this.RuntimeInSeconds = RuntimeInSeconds;
    }

    /**
     * Get <p>计费状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeStatus <p>计费状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set <p>计费状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeStatus <p>计费状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeStatus(String ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureReason <p>错误原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set <p>错误原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureReason <p>错误原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName <p>Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName <p>Pod名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>后付费资源规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTypeAlias <p>后付费资源规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceTypeAlias() {
        return this.InstanceTypeAlias;
    }

    /**
     * Set <p>后付费资源规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTypeAlias <p>后付费资源规格名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTypeAlias(String InstanceTypeAlias) {
        this.InstanceTypeAlias = InstanceTypeAlias;
    }

    /**
     * Get <p>预付费资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName <p>预付费资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>预付费资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName <p>预付费资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>是否自动终止</p> 
     * @return AutoStopping <p>是否自动终止</p>
     */
    public Boolean getAutoStopping() {
        return this.AutoStopping;
    }

    /**
     * Set <p>是否自动终止</p>
     * @param AutoStopping <p>是否自动终止</p>
     */
    public void setAutoStopping(Boolean AutoStopping) {
        this.AutoStopping = AutoStopping;
    }

    /**
     * Get <p>自动停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutomaticStopTime <p>自动停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutomaticStopTime() {
        return this.AutomaticStopTime;
    }

    /**
     * Set <p>自动停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutomaticStopTime <p>自动停止时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutomaticStopTime(Long AutomaticStopTime) {
        this.AutomaticStopTime = AutomaticStopTime;
    }

    /**
     * Get <p>存储的类型。取值包含：<br>    FREE:        预付费的免费存储<br>    CLOUD_PREMIUM： 高性能云硬盘<br>    CLOUD_SSD： SSD云硬盘<br>    CFS:     CFS存储，包含NFS和turbo</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeSourceType <p>存储的类型。取值包含：<br>    FREE:        预付费的免费存储<br>    CLOUD_PREMIUM： 高性能云硬盘<br>    CLOUD_SSD： SSD云硬盘<br>    CFS:     CFS存储，包含NFS和turbo</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVolumeSourceType() {
        return this.VolumeSourceType;
    }

    /**
     * Set <p>存储的类型。取值包含：<br>    FREE:        预付费的免费存储<br>    CLOUD_PREMIUM： 高性能云硬盘<br>    CLOUD_SSD： SSD云硬盘<br>    CFS:     CFS存储，包含NFS和turbo</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeSourceType <p>存储的类型。取值包含：<br>    FREE:        预付费的免费存储<br>    CLOUD_PREMIUM： 高性能云硬盘<br>    CLOUD_SSD： SSD云硬盘<br>    CFS:     CFS存储，包含NFS和turbo</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeSourceType(String VolumeSourceType) {
        this.VolumeSourceType = VolumeSourceType;
    }

    /**
     * Get <p>CFS存储的配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeSourceCFS <p>CFS存储的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CFSConfig getVolumeSourceCFS() {
        return this.VolumeSourceCFS;
    }

    /**
     * Set <p>CFS存储的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeSourceCFS <p>CFS存储的配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeSourceCFS(CFSConfig VolumeSourceCFS) {
        this.VolumeSourceCFS = VolumeSourceCFS;
    }

    /**
     * Get <p>notebook 信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message <p>notebook 信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>notebook 信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message <p>notebook 信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>notebook用户类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserTypes <p>notebook用户类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserTypes() {
        return this.UserTypes;
    }

    /**
     * Set <p>notebook用户类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserTypes <p>notebook用户类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserTypes(String [] UserTypes) {
        this.UserTypes = UserTypes;
    }

    /**
     * Get <p>SSH配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSHConfig <p>SSH配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SSHConfig getSSHConfig() {
        return this.SSHConfig;
    }

    /**
     * Set <p>SSH配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSHConfig <p>SSH配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSHConfig(SSHConfig SSHConfig) {
        this.SSHConfig = SSHConfig;
    }

    /**
     * Get <p>GooseFS存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeSourceGooseFS <p>GooseFS存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GooseFS getVolumeSourceGooseFS() {
        return this.VolumeSourceGooseFS;
    }

    /**
     * Set <p>GooseFS存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeSourceGooseFS <p>GooseFS存储配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeSourceGooseFS(GooseFS VolumeSourceGooseFS) {
        this.VolumeSourceGooseFS = VolumeSourceGooseFS;
    }

    /**
     * Get <p>子用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUin <p>子用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>子用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUin <p>子用户ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>子用户名称</p> 
     * @return SubUinName <p>子用户名称</p>
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set <p>子用户名称</p>
     * @param SubUinName <p>子用户名称</p>
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    /**
     * Get <p>AppId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>容器服务暴露端口配置</p> 
     * @return ExposePortConfig <p>容器服务暴露端口配置</p>
     */
    public ExposePortConfig getExposePortConfig() {
        return this.ExposePortConfig;
    }

    /**
     * Set <p>容器服务暴露端口配置</p>
     * @param ExposePortConfig <p>容器服务暴露端口配置</p>
     */
    public void setExposePortConfig(ExposePortConfig ExposePortConfig) {
        this.ExposePortConfig = ExposePortConfig;
    }

    /**
     * Get <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>操作者信息</p> 
     * @return LatestOperatorInfo <p>操作者信息</p>
     */
    public OperatorInfo getLatestOperatorInfo() {
        return this.LatestOperatorInfo;
    }

    /**
     * Set <p>操作者信息</p>
     * @param LatestOperatorInfo <p>操作者信息</p>
     */
    public void setLatestOperatorInfo(OperatorInfo LatestOperatorInfo) {
        this.LatestOperatorInfo = LatestOperatorInfo;
    }

    public NotebookSetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotebookSetItem(NotebookSetItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceConf != null) {
            this.ResourceConf = new ResourceConf(source.ResourceConf);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.VolumeSizeInGB != null) {
            this.VolumeSizeInGB = new Long(source.VolumeSizeInGB);
        }
        if (source.BillingInfos != null) {
            this.BillingInfos = new String[source.BillingInfos.length];
            for (int i = 0; i < source.BillingInfos.length; i++) {
                this.BillingInfos[i] = new String(source.BillingInfos[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RuntimeInSeconds != null) {
            this.RuntimeInSeconds = new Long(source.RuntimeInSeconds);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new String(source.ChargeStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.InstanceTypeAlias != null) {
            this.InstanceTypeAlias = new String(source.InstanceTypeAlias);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.AutoStopping != null) {
            this.AutoStopping = new Boolean(source.AutoStopping);
        }
        if (source.AutomaticStopTime != null) {
            this.AutomaticStopTime = new Long(source.AutomaticStopTime);
        }
        if (source.VolumeSourceType != null) {
            this.VolumeSourceType = new String(source.VolumeSourceType);
        }
        if (source.VolumeSourceCFS != null) {
            this.VolumeSourceCFS = new CFSConfig(source.VolumeSourceCFS);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.UserTypes != null) {
            this.UserTypes = new String[source.UserTypes.length];
            for (int i = 0; i < source.UserTypes.length; i++) {
                this.UserTypes[i] = new String(source.UserTypes[i]);
            }
        }
        if (source.SSHConfig != null) {
            this.SSHConfig = new SSHConfig(source.SSHConfig);
        }
        if (source.VolumeSourceGooseFS != null) {
            this.VolumeSourceGooseFS = new GooseFS(source.VolumeSourceGooseFS);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ExposePortConfig != null) {
            this.ExposePortConfig = new ExposePortConfig(source.ExposePortConfig);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LatestOperatorInfo != null) {
            this.LatestOperatorInfo = new OperatorInfo(source.LatestOperatorInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "ResourceConf.", this.ResourceConf);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "VolumeSizeInGB", this.VolumeSizeInGB);
        this.setParamArraySimple(map, prefix + "BillingInfos.", this.BillingInfos);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RuntimeInSeconds", this.RuntimeInSeconds);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "InstanceTypeAlias", this.InstanceTypeAlias);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "AutoStopping", this.AutoStopping);
        this.setParamSimple(map, prefix + "AutomaticStopTime", this.AutomaticStopTime);
        this.setParamSimple(map, prefix + "VolumeSourceType", this.VolumeSourceType);
        this.setParamObj(map, prefix + "VolumeSourceCFS.", this.VolumeSourceCFS);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArraySimple(map, prefix + "UserTypes.", this.UserTypes);
        this.setParamObj(map, prefix + "SSHConfig.", this.SSHConfig);
        this.setParamObj(map, prefix + "VolumeSourceGooseFS.", this.VolumeSourceGooseFS);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamObj(map, prefix + "ExposePortConfig.", this.ExposePortConfig);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "LatestOperatorInfo.", this.LatestOperatorInfo);

    }
}

