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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaunchConfiguration extends AbstractModel {

    /**
    * <p>实例所属项目ID。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>启动配置ID。</p>
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * <p>启动配置名称。</p>
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * <p>实例机型。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例系统盘配置信息。</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * <p>实例数据盘配置信息。</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>实例登录设置。</p>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LimitedLoginSettings LoginSettings;

    /**
    * <p>公网带宽相关信息设置。</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>实例所属安全组。</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * <p>启动配置关联的伸缩组。</p>
    */
    @SerializedName("AutoScalingGroupAbstractSet")
    @Expose
    private AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet;

    /**
    * <p>自定义数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>启动配置创建时间，为标准<code>UTC</code>时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>实例的增强服务启用情况与其设置。</p>
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * <p>镜像ID。</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>启动配置当前状态。取值范围：<li>NORMAL：正常</li><li>IMAGE_ABNORMAL：启动配置镜像异常</li><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常</li><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常</li></p>
    */
    @SerializedName("LaunchConfigurationStatus")
    @Expose
    private String LaunchConfigurationStatus;

    /**
    * <p>实例计费类型，取值范围如下：</p><li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * <p>实例机型列表。</p>
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * <p>实例标签列表。扩容出来的实例会自动带上标签，最多支持10个标签。</p>
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTag [] InstanceTags;

    /**
    * <p>标签列表，该参数内的标签仅用于绑定启动配置，不会传递给基于该启动配置扩容的 CVM 实例。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>版本号。</p>
    */
    @SerializedName("VersionNumber")
    @Expose
    private Long VersionNumber;

    /**
    * <p>更新时间，为标准<code>UTC</code>时间。</p>
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>CAM角色名称。可通过<a href="https://cloud.tencent.com/document/product/598/36223">DescribeRoleList</a>接口返回值中的roleName获取。</p>
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * <p>上次操作时，InstanceTypesCheckPolicy 取值。</p>
    */
    @SerializedName("LastOperationInstanceTypesCheckPolicy")
    @Expose
    private String LastOperationInstanceTypesCheckPolicy;

    /**
    * <p>云服务器主机名（HostName）的相关设置。</p>
    */
    @SerializedName("HostNameSettings")
    @Expose
    private HostNameSettings HostNameSettings;

    /**
    * <p>云服务器实例名（InstanceName）的相关设置。</p>
    */
    @SerializedName("InstanceNameSettings")
    @Expose
    private InstanceNameSettings InstanceNameSettings;

    /**
    * <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>云盘类型选择策略。取值范围：<li>ORIGINAL：使用设置的云盘类型</li><li>AUTOMATIC：自动选择当前可用区下可用的云盘类型</li></p>
    */
    @SerializedName("DiskTypePolicy")
    @Expose
    private String DiskTypePolicy;

    /**
    * <p>高性能计算集群ID。<br><br>注意：此字段默认为空。</p>
    */
    @SerializedName("HpcClusterId")
    @Expose
    private String HpcClusterId;

    /**
    * <p>IPv6公网带宽相关信息设置。</p>
    */
    @SerializedName("IPv6InternetAccessible")
    @Expose
    private IPv6InternetAccessible IPv6InternetAccessible;

    /**
    * <p>置放群组id，仅支持指定一个。</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>镜像族名称。</p>
    */
    @SerializedName("ImageFamily")
    @Expose
    private String ImageFamily;

    /**
    * <p>本地专用集群 ID。</p>
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
    * <p>启动配置的弹性网卡配置。</p>
    */
    @SerializedName("NetworkInterfaces")
    @Expose
    private NetworkInterface [] NetworkInterfaces;

    /**
     * Get <p>实例所属项目ID。</p> 
     * @return ProjectId <p>实例所属项目ID。</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>实例所属项目ID。</p>
     * @param ProjectId <p>实例所属项目ID。</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>启动配置ID。</p> 
     * @return LaunchConfigurationId <p>启动配置ID。</p>
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set <p>启动配置ID。</p>
     * @param LaunchConfigurationId <p>启动配置ID。</p>
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get <p>启动配置名称。</p> 
     * @return LaunchConfigurationName <p>启动配置名称。</p>
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * Set <p>启动配置名称。</p>
     * @param LaunchConfigurationName <p>启动配置名称。</p>
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * Get <p>实例机型。</p> 
     * @return InstanceType <p>实例机型。</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例机型。</p>
     * @param InstanceType <p>实例机型。</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例系统盘配置信息。</p> 
     * @return SystemDisk <p>实例系统盘配置信息。</p>
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>实例系统盘配置信息。</p>
     * @param SystemDisk <p>实例系统盘配置信息。</p>
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>实例数据盘配置信息。</p> 
     * @return DataDisks <p>实例数据盘配置信息。</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>实例数据盘配置信息。</p>
     * @param DataDisks <p>实例数据盘配置信息。</p>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>实例登录设置。</p> 
     * @return LoginSettings <p>实例登录设置。</p>
     */
    public LimitedLoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>实例登录设置。</p>
     * @param LoginSettings <p>实例登录设置。</p>
     */
    public void setLoginSettings(LimitedLoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * Get <p>公网带宽相关信息设置。</p> 
     * @return InternetAccessible <p>公网带宽相关信息设置。</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>公网带宽相关信息设置。</p>
     * @param InternetAccessible <p>公网带宽相关信息设置。</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>实例所属安全组。</p> 
     * @return SecurityGroupIds <p>实例所属安全组。</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>实例所属安全组。</p>
     * @param SecurityGroupIds <p>实例所属安全组。</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get <p>启动配置关联的伸缩组。</p> 
     * @return AutoScalingGroupAbstractSet <p>启动配置关联的伸缩组。</p>
     */
    public AutoScalingGroupAbstract [] getAutoScalingGroupAbstractSet() {
        return this.AutoScalingGroupAbstractSet;
    }

    /**
     * Set <p>启动配置关联的伸缩组。</p>
     * @param AutoScalingGroupAbstractSet <p>启动配置关联的伸缩组。</p>
     */
    public void setAutoScalingGroupAbstractSet(AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet) {
        this.AutoScalingGroupAbstractSet = AutoScalingGroupAbstractSet;
    }

    /**
     * Get <p>自定义数据。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserData <p>自定义数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>自定义数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserData <p>自定义数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>启动配置创建时间，为标准<code>UTC</code>时间。</p> 
     * @return CreatedTime <p>启动配置创建时间，为标准<code>UTC</code>时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>启动配置创建时间，为标准<code>UTC</code>时间。</p>
     * @param CreatedTime <p>启动配置创建时间，为标准<code>UTC</code>时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>实例的增强服务启用情况与其设置。</p> 
     * @return EnhancedService <p>实例的增强服务启用情况与其设置。</p>
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set <p>实例的增强服务启用情况与其设置。</p>
     * @param EnhancedService <p>实例的增强服务启用情况与其设置。</p>
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get <p>镜像ID。</p> 
     * @return ImageId <p>镜像ID。</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像ID。</p>
     * @param ImageId <p>镜像ID。</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>启动配置当前状态。取值范围：<li>NORMAL：正常</li><li>IMAGE_ABNORMAL：启动配置镜像异常</li><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常</li><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常</li></p> 
     * @return LaunchConfigurationStatus <p>启动配置当前状态。取值范围：<li>NORMAL：正常</li><li>IMAGE_ABNORMAL：启动配置镜像异常</li><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常</li><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常</li></p>
     */
    public String getLaunchConfigurationStatus() {
        return this.LaunchConfigurationStatus;
    }

    /**
     * Set <p>启动配置当前状态。取值范围：<li>NORMAL：正常</li><li>IMAGE_ABNORMAL：启动配置镜像异常</li><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常</li><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常</li></p>
     * @param LaunchConfigurationStatus <p>启动配置当前状态。取值范围：<li>NORMAL：正常</li><li>IMAGE_ABNORMAL：启动配置镜像异常</li><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常</li><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常</li></p>
     */
    public void setLaunchConfigurationStatus(String LaunchConfigurationStatus) {
        this.LaunchConfigurationStatus = LaunchConfigurationStatus;
    }

    /**
     * Get <p>实例计费类型，取值范围如下：</p><li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li> 
     * @return InstanceChargeType <p>实例计费类型，取值范围如下：</p><li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例计费类型，取值范围如下：</p><li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li>
     * @param InstanceChargeType <p>实例计费类型，取值范围如下：</p><li>POSTPAID_BY_HOUR：按小时后付费</li><li>SPOTPAID：竞价付费</li><li>PREPAID：预付费，即包年包月</li><li>CDCPAID：专用集群付费</li>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceMarketOptions <p>实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * Set <p>实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceMarketOptions <p>实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * Get <p>实例机型列表。</p> 
     * @return InstanceTypes <p>实例机型列表。</p>
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set <p>实例机型列表。</p>
     * @param InstanceTypes <p>实例机型列表。</p>
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * Get <p>实例标签列表。扩容出来的实例会自动带上标签，最多支持10个标签。</p> 
     * @return InstanceTags <p>实例标签列表。扩容出来的实例会自动带上标签，最多支持10个标签。</p>
     */
    public InstanceTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * Set <p>实例标签列表。扩容出来的实例会自动带上标签，最多支持10个标签。</p>
     * @param InstanceTags <p>实例标签列表。扩容出来的实例会自动带上标签，最多支持10个标签。</p>
     */
    public void setInstanceTags(InstanceTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * Get <p>标签列表，该参数内的标签仅用于绑定启动配置，不会传递给基于该启动配置扩容的 CVM 实例。</p> 
     * @return Tags <p>标签列表，该参数内的标签仅用于绑定启动配置，不会传递给基于该启动配置扩容的 CVM 实例。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表，该参数内的标签仅用于绑定启动配置，不会传递给基于该启动配置扩容的 CVM 实例。</p>
     * @param Tags <p>标签列表，该参数内的标签仅用于绑定启动配置，不会传递给基于该启动配置扩容的 CVM 实例。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>版本号。</p> 
     * @return VersionNumber <p>版本号。</p>
     */
    public Long getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * Set <p>版本号。</p>
     * @param VersionNumber <p>版本号。</p>
     */
    public void setVersionNumber(Long VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * Get <p>更新时间，为标准<code>UTC</code>时间。</p> 
     * @return UpdatedTime <p>更新时间，为标准<code>UTC</code>时间。</p>
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>更新时间，为标准<code>UTC</code>时间。</p>
     * @param UpdatedTime <p>更新时间，为标准<code>UTC</code>时间。</p>
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>CAM角色名称。可通过<a href="https://cloud.tencent.com/document/product/598/36223">DescribeRoleList</a>接口返回值中的roleName获取。</p> 
     * @return CamRoleName <p>CAM角色名称。可通过<a href="https://cloud.tencent.com/document/product/598/36223">DescribeRoleList</a>接口返回值中的roleName获取。</p>
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * Set <p>CAM角色名称。可通过<a href="https://cloud.tencent.com/document/product/598/36223">DescribeRoleList</a>接口返回值中的roleName获取。</p>
     * @param CamRoleName <p>CAM角色名称。可通过<a href="https://cloud.tencent.com/document/product/598/36223">DescribeRoleList</a>接口返回值中的roleName获取。</p>
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * Get <p>上次操作时，InstanceTypesCheckPolicy 取值。</p> 
     * @return LastOperationInstanceTypesCheckPolicy <p>上次操作时，InstanceTypesCheckPolicy 取值。</p>
     */
    public String getLastOperationInstanceTypesCheckPolicy() {
        return this.LastOperationInstanceTypesCheckPolicy;
    }

    /**
     * Set <p>上次操作时，InstanceTypesCheckPolicy 取值。</p>
     * @param LastOperationInstanceTypesCheckPolicy <p>上次操作时，InstanceTypesCheckPolicy 取值。</p>
     */
    public void setLastOperationInstanceTypesCheckPolicy(String LastOperationInstanceTypesCheckPolicy) {
        this.LastOperationInstanceTypesCheckPolicy = LastOperationInstanceTypesCheckPolicy;
    }

    /**
     * Get <p>云服务器主机名（HostName）的相关设置。</p> 
     * @return HostNameSettings <p>云服务器主机名（HostName）的相关设置。</p>
     */
    public HostNameSettings getHostNameSettings() {
        return this.HostNameSettings;
    }

    /**
     * Set <p>云服务器主机名（HostName）的相关设置。</p>
     * @param HostNameSettings <p>云服务器主机名（HostName）的相关设置。</p>
     */
    public void setHostNameSettings(HostNameSettings HostNameSettings) {
        this.HostNameSettings = HostNameSettings;
    }

    /**
     * Get <p>云服务器实例名（InstanceName）的相关设置。</p> 
     * @return InstanceNameSettings <p>云服务器实例名（InstanceName）的相关设置。</p>
     */
    public InstanceNameSettings getInstanceNameSettings() {
        return this.InstanceNameSettings;
    }

    /**
     * Set <p>云服务器实例名（InstanceName）的相关设置。</p>
     * @param InstanceNameSettings <p>云服务器实例名（InstanceName）的相关设置。</p>
     */
    public void setInstanceNameSettings(InstanceNameSettings InstanceNameSettings) {
        this.InstanceNameSettings = InstanceNameSettings;
    }

    /**
     * Get <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p> 
     * @return InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     * @param InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>云盘类型选择策略。取值范围：<li>ORIGINAL：使用设置的云盘类型</li><li>AUTOMATIC：自动选择当前可用区下可用的云盘类型</li></p> 
     * @return DiskTypePolicy <p>云盘类型选择策略。取值范围：<li>ORIGINAL：使用设置的云盘类型</li><li>AUTOMATIC：自动选择当前可用区下可用的云盘类型</li></p>
     */
    public String getDiskTypePolicy() {
        return this.DiskTypePolicy;
    }

    /**
     * Set <p>云盘类型选择策略。取值范围：<li>ORIGINAL：使用设置的云盘类型</li><li>AUTOMATIC：自动选择当前可用区下可用的云盘类型</li></p>
     * @param DiskTypePolicy <p>云盘类型选择策略。取值范围：<li>ORIGINAL：使用设置的云盘类型</li><li>AUTOMATIC：自动选择当前可用区下可用的云盘类型</li></p>
     */
    public void setDiskTypePolicy(String DiskTypePolicy) {
        this.DiskTypePolicy = DiskTypePolicy;
    }

    /**
     * Get <p>高性能计算集群ID。<br><br>注意：此字段默认为空。</p> 
     * @return HpcClusterId <p>高性能计算集群ID。<br><br>注意：此字段默认为空。</p>
     */
    public String getHpcClusterId() {
        return this.HpcClusterId;
    }

    /**
     * Set <p>高性能计算集群ID。<br><br>注意：此字段默认为空。</p>
     * @param HpcClusterId <p>高性能计算集群ID。<br><br>注意：此字段默认为空。</p>
     */
    public void setHpcClusterId(String HpcClusterId) {
        this.HpcClusterId = HpcClusterId;
    }

    /**
     * Get <p>IPv6公网带宽相关信息设置。</p> 
     * @return IPv6InternetAccessible <p>IPv6公网带宽相关信息设置。</p>
     */
    public IPv6InternetAccessible getIPv6InternetAccessible() {
        return this.IPv6InternetAccessible;
    }

    /**
     * Set <p>IPv6公网带宽相关信息设置。</p>
     * @param IPv6InternetAccessible <p>IPv6公网带宽相关信息设置。</p>
     */
    public void setIPv6InternetAccessible(IPv6InternetAccessible IPv6InternetAccessible) {
        this.IPv6InternetAccessible = IPv6InternetAccessible;
    }

    /**
     * Get <p>置放群组id，仅支持指定一个。</p> 
     * @return DisasterRecoverGroupIds <p>置放群组id，仅支持指定一个。</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>置放群组id，仅支持指定一个。</p>
     * @param DisasterRecoverGroupIds <p>置放群组id，仅支持指定一个。</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>镜像族名称。</p> 
     * @return ImageFamily <p>镜像族名称。</p>
     */
    public String getImageFamily() {
        return this.ImageFamily;
    }

    /**
     * Set <p>镜像族名称。</p>
     * @param ImageFamily <p>镜像族名称。</p>
     */
    public void setImageFamily(String ImageFamily) {
        this.ImageFamily = ImageFamily;
    }

    /**
     * Get <p>本地专用集群 ID。</p> 
     * @return DedicatedClusterId <p>本地专用集群 ID。</p>
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set <p>本地专用集群 ID。</p>
     * @param DedicatedClusterId <p>本地专用集群 ID。</p>
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    /**
     * Get <p>启动配置的弹性网卡配置。</p> 
     * @return NetworkInterfaces <p>启动配置的弹性网卡配置。</p>
     */
    public NetworkInterface [] getNetworkInterfaces() {
        return this.NetworkInterfaces;
    }

    /**
     * Set <p>启动配置的弹性网卡配置。</p>
     * @param NetworkInterfaces <p>启动配置的弹性网卡配置。</p>
     */
    public void setNetworkInterfaces(NetworkInterface [] NetworkInterfaces) {
        this.NetworkInterfaces = NetworkInterfaces;
    }

    public LaunchConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaunchConfiguration(LaunchConfiguration source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.LaunchConfigurationName != null) {
            this.LaunchConfigurationName = new String(source.LaunchConfigurationName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LimitedLoginSettings(source.LoginSettings);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.AutoScalingGroupAbstractSet != null) {
            this.AutoScalingGroupAbstractSet = new AutoScalingGroupAbstract[source.AutoScalingGroupAbstractSet.length];
            for (int i = 0; i < source.AutoScalingGroupAbstractSet.length; i++) {
                this.AutoScalingGroupAbstractSet[i] = new AutoScalingGroupAbstract(source.AutoScalingGroupAbstractSet[i]);
            }
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.LaunchConfigurationStatus != null) {
            this.LaunchConfigurationStatus = new String(source.LaunchConfigurationStatus);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceMarketOptions != null) {
            this.InstanceMarketOptions = new InstanceMarketOptionsRequest(source.InstanceMarketOptions);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new String[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new String(source.InstanceTypes[i]);
            }
        }
        if (source.InstanceTags != null) {
            this.InstanceTags = new InstanceTag[source.InstanceTags.length];
            for (int i = 0; i < source.InstanceTags.length; i++) {
                this.InstanceTags[i] = new InstanceTag(source.InstanceTags[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.VersionNumber != null) {
            this.VersionNumber = new Long(source.VersionNumber);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.CamRoleName != null) {
            this.CamRoleName = new String(source.CamRoleName);
        }
        if (source.LastOperationInstanceTypesCheckPolicy != null) {
            this.LastOperationInstanceTypesCheckPolicy = new String(source.LastOperationInstanceTypesCheckPolicy);
        }
        if (source.HostNameSettings != null) {
            this.HostNameSettings = new HostNameSettings(source.HostNameSettings);
        }
        if (source.InstanceNameSettings != null) {
            this.InstanceNameSettings = new InstanceNameSettings(source.InstanceNameSettings);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.DiskTypePolicy != null) {
            this.DiskTypePolicy = new String(source.DiskTypePolicy);
        }
        if (source.HpcClusterId != null) {
            this.HpcClusterId = new String(source.HpcClusterId);
        }
        if (source.IPv6InternetAccessible != null) {
            this.IPv6InternetAccessible = new IPv6InternetAccessible(source.IPv6InternetAccessible);
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.ImageFamily != null) {
            this.ImageFamily = new String(source.ImageFamily);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
        if (source.NetworkInterfaces != null) {
            this.NetworkInterfaces = new NetworkInterface[source.NetworkInterfaces.length];
            for (int i = 0; i < source.NetworkInterfaces.length; i++) {
                this.NetworkInterfaces[i] = new NetworkInterface(source.NetworkInterfaces[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "AutoScalingGroupAbstractSet.", this.AutoScalingGroupAbstractSet);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "LaunchConfigurationStatus", this.LaunchConfigurationStatus);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "LastOperationInstanceTypesCheckPolicy", this.LastOperationInstanceTypesCheckPolicy);
        this.setParamObj(map, prefix + "HostNameSettings.", this.HostNameSettings);
        this.setParamObj(map, prefix + "InstanceNameSettings.", this.InstanceNameSettings);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "DiskTypePolicy", this.DiskTypePolicy);
        this.setParamSimple(map, prefix + "HpcClusterId", this.HpcClusterId);
        this.setParamObj(map, prefix + "IPv6InternetAccessible.", this.IPv6InternetAccessible);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "ImageFamily", this.ImageFamily);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);
        this.setParamArrayObj(map, prefix + "NetworkInterfaces.", this.NetworkInterfaces);

    }
}

