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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cluster extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群描述</p>
    */
    @SerializedName("ClusterDescription")
    @Expose
    private String ClusterDescription;

    /**
    * <p>集群版本（默认值为1.10.5）</p>
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * <p>集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64</p>
    */
    @SerializedName("ClusterOs")
    @Expose
    private String ClusterOs;

    /**
    * <p>集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>集群网络相关参数</p>
    */
    @SerializedName("ClusterNetworkSettings")
    @Expose
    private ClusterNetworkSettings ClusterNetworkSettings;

    /**
    * <p>集群当前node数量</p>
    */
    @SerializedName("ClusterNodeNum")
    @Expose
    private Long ClusterNodeNum;

    /**
    * <p>集群所属的项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>标签描述列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * <p>集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Scaling 规模调整中,Upgrading 升级中,WaittingForConnect 等待注册,Trading 集群开通中,Isolated 欠费隔离中,Pause 集群升级暂停,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 隔离中,ResourceIsolated 已隔离,ResourceReverse 冲正中,Abnormal 异常)</p>
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * <p>集群属性(包括集群不同属性的MAP，属性字段包括NodeNameType (lan-ip模式和hostname 模式，默认无lan-ip模式))</p>
    */
    @SerializedName("Property")
    @Expose
    private String Property;

    /**
    * <p>集群当前master数量</p>
    */
    @SerializedName("ClusterMaterNodeNum")
    @Expose
    private Long ClusterMaterNodeNum;

    /**
    * <p>集群使用镜像id</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>OsCustomizeType 系统定制类型</p>
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * <p>集群运行环境docker或container</p>
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>集群删除保护开关，打开：true，关闭：false</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * <p>集群是否开启第三方节点支持，开启：true，关闭：false</p>
    */
    @SerializedName("EnableExternalNode")
    @Expose
    private Boolean EnableExternalNode;

    /**
    * <p>集群等级，针对托管集群生效</p>
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * <p>自动变配集群等级，针对托管集群生效。开启：true，关闭：false</p>
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private Boolean AutoUpgradeClusterLevel;

    /**
    * <p>是否开启QGPU共享，开启：true，关闭：false</p>
    */
    @SerializedName("QGPUShareEnable")
    @Expose
    private Boolean QGPUShareEnable;

    /**
    * <p>运行时版本</p>
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * <p>集群当前etcd数量</p>
    */
    @SerializedName("ClusterEtcdNodeNum")
    @Expose
    private Long ClusterEtcdNodeNum;

    /**
    * <p>本地专用集群Id</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行</p>
    */
    @SerializedName("IsHighAvailability")
    @Expose
    private Boolean IsHighAvailability;

    /**
    * <p>开启后会下发Gatekeeper和网络策略</p>
    */
    @SerializedName("SecurityModeConfig")
    @Expose
    private SecurityModeConfig SecurityModeConfig;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群描述</p> 
     * @return ClusterDescription <p>集群描述</p>
     */
    public String getClusterDescription() {
        return this.ClusterDescription;
    }

    /**
     * Set <p>集群描述</p>
     * @param ClusterDescription <p>集群描述</p>
     */
    public void setClusterDescription(String ClusterDescription) {
        this.ClusterDescription = ClusterDescription;
    }

    /**
     * Get <p>集群版本（默认值为1.10.5）</p> 
     * @return ClusterVersion <p>集群版本（默认值为1.10.5）</p>
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set <p>集群版本（默认值为1.10.5）</p>
     * @param ClusterVersion <p>集群版本（默认值为1.10.5）</p>
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get <p>集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64</p> 
     * @return ClusterOs <p>集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64</p>
     */
    public String getClusterOs() {
        return this.ClusterOs;
    }

    /**
     * Set <p>集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64</p>
     * @param ClusterOs <p>集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64</p>
     */
    public void setClusterOs(String ClusterOs) {
        this.ClusterOs = ClusterOs;
    }

    /**
     * Get <p>集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。</p> 
     * @return ClusterType <p>集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。</p>
     * @param ClusterType <p>集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>集群网络相关参数</p> 
     * @return ClusterNetworkSettings <p>集群网络相关参数</p>
     */
    public ClusterNetworkSettings getClusterNetworkSettings() {
        return this.ClusterNetworkSettings;
    }

    /**
     * Set <p>集群网络相关参数</p>
     * @param ClusterNetworkSettings <p>集群网络相关参数</p>
     */
    public void setClusterNetworkSettings(ClusterNetworkSettings ClusterNetworkSettings) {
        this.ClusterNetworkSettings = ClusterNetworkSettings;
    }

    /**
     * Get <p>集群当前node数量</p> 
     * @return ClusterNodeNum <p>集群当前node数量</p>
     */
    public Long getClusterNodeNum() {
        return this.ClusterNodeNum;
    }

    /**
     * Set <p>集群当前node数量</p>
     * @param ClusterNodeNum <p>集群当前node数量</p>
     */
    public void setClusterNodeNum(Long ClusterNodeNum) {
        this.ClusterNodeNum = ClusterNodeNum;
    }

    /**
     * Get <p>集群所属的项目ID</p> 
     * @return ProjectId <p>集群所属的项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>集群所属的项目ID</p>
     * @param ProjectId <p>集群所属的项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>标签描述列表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSpecification <p>标签描述列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set <p>标签描述列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSpecification <p>标签描述列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get <p>集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Scaling 规模调整中,Upgrading 升级中,WaittingForConnect 等待注册,Trading 集群开通中,Isolated 欠费隔离中,Pause 集群升级暂停,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 隔离中,ResourceIsolated 已隔离,ResourceReverse 冲正中,Abnormal 异常)</p> 
     * @return ClusterStatus <p>集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Scaling 规模调整中,Upgrading 升级中,WaittingForConnect 等待注册,Trading 集群开通中,Isolated 欠费隔离中,Pause 集群升级暂停,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 隔离中,ResourceIsolated 已隔离,ResourceReverse 冲正中,Abnormal 异常)</p>
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set <p>集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Scaling 规模调整中,Upgrading 升级中,WaittingForConnect 等待注册,Trading 集群开通中,Isolated 欠费隔离中,Pause 集群升级暂停,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 隔离中,ResourceIsolated 已隔离,ResourceReverse 冲正中,Abnormal 异常)</p>
     * @param ClusterStatus <p>集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Scaling 规模调整中,Upgrading 升级中,WaittingForConnect 等待注册,Trading 集群开通中,Isolated 欠费隔离中,Pause 集群升级暂停,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 隔离中,ResourceIsolated 已隔离,ResourceReverse 冲正中,Abnormal 异常)</p>
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get <p>集群属性(包括集群不同属性的MAP，属性字段包括NodeNameType (lan-ip模式和hostname 模式，默认无lan-ip模式))</p> 
     * @return Property <p>集群属性(包括集群不同属性的MAP，属性字段包括NodeNameType (lan-ip模式和hostname 模式，默认无lan-ip模式))</p>
     */
    public String getProperty() {
        return this.Property;
    }

    /**
     * Set <p>集群属性(包括集群不同属性的MAP，属性字段包括NodeNameType (lan-ip模式和hostname 模式，默认无lan-ip模式))</p>
     * @param Property <p>集群属性(包括集群不同属性的MAP，属性字段包括NodeNameType (lan-ip模式和hostname 模式，默认无lan-ip模式))</p>
     */
    public void setProperty(String Property) {
        this.Property = Property;
    }

    /**
     * Get <p>集群当前master数量</p> 
     * @return ClusterMaterNodeNum <p>集群当前master数量</p>
     */
    public Long getClusterMaterNodeNum() {
        return this.ClusterMaterNodeNum;
    }

    /**
     * Set <p>集群当前master数量</p>
     * @param ClusterMaterNodeNum <p>集群当前master数量</p>
     */
    public void setClusterMaterNodeNum(Long ClusterMaterNodeNum) {
        this.ClusterMaterNodeNum = ClusterMaterNodeNum;
    }

    /**
     * Get <p>集群使用镜像id</p> 
     * @return ImageId <p>集群使用镜像id</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>集群使用镜像id</p>
     * @param ImageId <p>集群使用镜像id</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>OsCustomizeType 系统定制类型</p> 
     * @return OsCustomizeType <p>OsCustomizeType 系统定制类型</p>
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set <p>OsCustomizeType 系统定制类型</p>
     * @param OsCustomizeType <p>OsCustomizeType 系统定制类型</p>
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get <p>集群运行环境docker或container</p> 
     * @return ContainerRuntime <p>集群运行环境docker或container</p>
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set <p>集群运行环境docker或container</p>
     * @param ContainerRuntime <p>集群运行环境docker或container</p>
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>集群删除保护开关，打开：true，关闭：false</p> 
     * @return DeletionProtection <p>集群删除保护开关，打开：true，关闭：false</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>集群删除保护开关，打开：true，关闭：false</p>
     * @param DeletionProtection <p>集群删除保护开关，打开：true，关闭：false</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get <p>集群是否开启第三方节点支持，开启：true，关闭：false</p> 
     * @return EnableExternalNode <p>集群是否开启第三方节点支持，开启：true，关闭：false</p>
     */
    public Boolean getEnableExternalNode() {
        return this.EnableExternalNode;
    }

    /**
     * Set <p>集群是否开启第三方节点支持，开启：true，关闭：false</p>
     * @param EnableExternalNode <p>集群是否开启第三方节点支持，开启：true，关闭：false</p>
     */
    public void setEnableExternalNode(Boolean EnableExternalNode) {
        this.EnableExternalNode = EnableExternalNode;
    }

    /**
     * Get <p>集群等级，针对托管集群生效</p> 
     * @return ClusterLevel <p>集群等级，针对托管集群生效</p>
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set <p>集群等级，针对托管集群生效</p>
     * @param ClusterLevel <p>集群等级，针对托管集群生效</p>
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get <p>自动变配集群等级，针对托管集群生效。开启：true，关闭：false</p> 
     * @return AutoUpgradeClusterLevel <p>自动变配集群等级，针对托管集群生效。开启：true，关闭：false</p>
     */
    public Boolean getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set <p>自动变配集群等级，针对托管集群生效。开启：true，关闭：false</p>
     * @param AutoUpgradeClusterLevel <p>自动变配集群等级，针对托管集群生效。开启：true，关闭：false</p>
     */
    public void setAutoUpgradeClusterLevel(Boolean AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    /**
     * Get <p>是否开启QGPU共享，开启：true，关闭：false</p> 
     * @return QGPUShareEnable <p>是否开启QGPU共享，开启：true，关闭：false</p>
     */
    public Boolean getQGPUShareEnable() {
        return this.QGPUShareEnable;
    }

    /**
     * Set <p>是否开启QGPU共享，开启：true，关闭：false</p>
     * @param QGPUShareEnable <p>是否开启QGPU共享，开启：true，关闭：false</p>
     */
    public void setQGPUShareEnable(Boolean QGPUShareEnable) {
        this.QGPUShareEnable = QGPUShareEnable;
    }

    /**
     * Get <p>运行时版本</p> 
     * @return RuntimeVersion <p>运行时版本</p>
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set <p>运行时版本</p>
     * @param RuntimeVersion <p>运行时版本</p>
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get <p>集群当前etcd数量</p> 
     * @return ClusterEtcdNodeNum <p>集群当前etcd数量</p>
     */
    public Long getClusterEtcdNodeNum() {
        return this.ClusterEtcdNodeNum;
    }

    /**
     * Set <p>集群当前etcd数量</p>
     * @param ClusterEtcdNodeNum <p>集群当前etcd数量</p>
     */
    public void setClusterEtcdNodeNum(Long ClusterEtcdNodeNum) {
        this.ClusterEtcdNodeNum = ClusterEtcdNodeNum;
    }

    /**
     * Get <p>本地专用集群Id</p> 
     * @return CdcId <p>本地专用集群Id</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>本地专用集群Id</p>
     * @param CdcId <p>本地专用集群Id</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行</p> 
     * @return IsHighAvailability <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行</p>
     */
    public Boolean getIsHighAvailability() {
        return this.IsHighAvailability;
    }

    /**
     * Set <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行</p>
     * @param IsHighAvailability <p>集群是否启用高可用模式。用于指导跨可用区资源打散等高可用策略的执行</p>
     */
    public void setIsHighAvailability(Boolean IsHighAvailability) {
        this.IsHighAvailability = IsHighAvailability;
    }

    /**
     * Get <p>开启后会下发Gatekeeper和网络策略</p> 
     * @return SecurityModeConfig <p>开启后会下发Gatekeeper和网络策略</p>
     */
    public SecurityModeConfig getSecurityModeConfig() {
        return this.SecurityModeConfig;
    }

    /**
     * Set <p>开启后会下发Gatekeeper和网络策略</p>
     * @param SecurityModeConfig <p>开启后会下发Gatekeeper和网络策略</p>
     */
    public void setSecurityModeConfig(SecurityModeConfig SecurityModeConfig) {
        this.SecurityModeConfig = SecurityModeConfig;
    }

    public Cluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cluster(Cluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDescription != null) {
            this.ClusterDescription = new String(source.ClusterDescription);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.ClusterOs != null) {
            this.ClusterOs = new String(source.ClusterOs);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterNetworkSettings != null) {
            this.ClusterNetworkSettings = new ClusterNetworkSettings(source.ClusterNetworkSettings);
        }
        if (source.ClusterNodeNum != null) {
            this.ClusterNodeNum = new Long(source.ClusterNodeNum);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.Property != null) {
            this.Property = new String(source.Property);
        }
        if (source.ClusterMaterNodeNum != null) {
            this.ClusterMaterNodeNum = new Long(source.ClusterMaterNodeNum);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.OsCustomizeType != null) {
            this.OsCustomizeType = new String(source.OsCustomizeType);
        }
        if (source.ContainerRuntime != null) {
            this.ContainerRuntime = new String(source.ContainerRuntime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.EnableExternalNode != null) {
            this.EnableExternalNode = new Boolean(source.EnableExternalNode);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
        }
        if (source.AutoUpgradeClusterLevel != null) {
            this.AutoUpgradeClusterLevel = new Boolean(source.AutoUpgradeClusterLevel);
        }
        if (source.QGPUShareEnable != null) {
            this.QGPUShareEnable = new Boolean(source.QGPUShareEnable);
        }
        if (source.RuntimeVersion != null) {
            this.RuntimeVersion = new String(source.RuntimeVersion);
        }
        if (source.ClusterEtcdNodeNum != null) {
            this.ClusterEtcdNodeNum = new Long(source.ClusterEtcdNodeNum);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.IsHighAvailability != null) {
            this.IsHighAvailability = new Boolean(source.IsHighAvailability);
        }
        if (source.SecurityModeConfig != null) {
            this.SecurityModeConfig = new SecurityModeConfig(source.SecurityModeConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDescription", this.ClusterDescription);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "ClusterOs", this.ClusterOs);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamObj(map, prefix + "ClusterNetworkSettings.", this.ClusterNetworkSettings);
        this.setParamSimple(map, prefix + "ClusterNodeNum", this.ClusterNodeNum);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "Property", this.Property);
        this.setParamSimple(map, prefix + "ClusterMaterNodeNum", this.ClusterMaterNodeNum);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamSimple(map, prefix + "ContainerRuntime", this.ContainerRuntime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "EnableExternalNode", this.EnableExternalNode);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamSimple(map, prefix + "AutoUpgradeClusterLevel", this.AutoUpgradeClusterLevel);
        this.setParamSimple(map, prefix + "QGPUShareEnable", this.QGPUShareEnable);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "ClusterEtcdNodeNum", this.ClusterEtcdNodeNum);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "IsHighAvailability", this.IsHighAvailability);
        this.setParamObj(map, prefix + "SecurityModeConfig.", this.SecurityModeConfig);

    }
}

