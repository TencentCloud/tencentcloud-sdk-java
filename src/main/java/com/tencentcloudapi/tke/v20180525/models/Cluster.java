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
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群描述
    */
    @SerializedName("ClusterDescription")
    @Expose
    private String ClusterDescription;

    /**
    * 集群版本（默认值为1.10.5）
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64
    */
    @SerializedName("ClusterOs")
    @Expose
    private String ClusterOs;

    /**
    * 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群网络相关参数
    */
    @SerializedName("ClusterNetworkSettings")
    @Expose
    private ClusterNetworkSettings ClusterNetworkSettings;

    /**
    * 集群当前node数量
    */
    @SerializedName("ClusterNodeNum")
    @Expose
    private Long ClusterNodeNum;

    /**
    * 集群所属的项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
    * 集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Scaling 规模调整中,Upgrading 升级中,WaittingForConnect 等待注册,Trading 集群开通中,Isolated 欠费隔离中,Pause 集群升级暂停,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 隔离中,ResourceIsolated 已隔离,ResourceReverse 冲正中,Abnormal 异常)
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 集群属性(包括集群不同属性的MAP，属性字段包括NodeNameType (lan-ip模式和hostname 模式，默认无lan-ip模式))
    */
    @SerializedName("Property")
    @Expose
    private String Property;

    /**
    * 集群当前master数量
    */
    @SerializedName("ClusterMaterNodeNum")
    @Expose
    private Long ClusterMaterNodeNum;

    /**
    * 集群使用镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * OsCustomizeType 系统定制类型
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * 集群运行环境docker或container
    */
    @SerializedName("ContainerRuntime")
    @Expose
    private String ContainerRuntime;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 删除保护开关
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * 集群是否开启第三方节点支持
    */
    @SerializedName("EnableExternalNode")
    @Expose
    private Boolean EnableExternalNode;

    /**
    * 集群等级，针对托管集群生效
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * 自动变配集群等级，针对托管集群生效
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private Boolean AutoUpgradeClusterLevel;

    /**
    * 是否开启QGPU共享
    */
    @SerializedName("QGPUShareEnable")
    @Expose
    private Boolean QGPUShareEnable;

    /**
    * 运行时版本
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 集群当前etcd数量
    */
    @SerializedName("ClusterEtcdNodeNum")
    @Expose
    private Long ClusterEtcdNodeNum;

    /**
    * 本地专用集群Id
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群描述 
     * @return ClusterDescription 集群描述
     */
    public String getClusterDescription() {
        return this.ClusterDescription;
    }

    /**
     * Set 集群描述
     * @param ClusterDescription 集群描述
     */
    public void setClusterDescription(String ClusterDescription) {
        this.ClusterDescription = ClusterDescription;
    }

    /**
     * Get 集群版本（默认值为1.10.5） 
     * @return ClusterVersion 集群版本（默认值为1.10.5）
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本（默认值为1.10.5）
     * @param ClusterVersion 集群版本（默认值为1.10.5）
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64 
     * @return ClusterOs 集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64
     */
    public String getClusterOs() {
        return this.ClusterOs;
    }

    /**
     * Set 集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64
     * @param ClusterOs 集群系统。centos7.2x86_64 或者 ubuntu16.04.1 LTSx86_64，默认取值为ubuntu16.04.1 LTSx86_64
     */
    public void setClusterOs(String ClusterOs) {
        this.ClusterOs = ClusterOs;
    }

    /**
     * Get 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。 
     * @return ClusterType 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     * @param ClusterType 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 集群网络相关参数 
     * @return ClusterNetworkSettings 集群网络相关参数
     */
    public ClusterNetworkSettings getClusterNetworkSettings() {
        return this.ClusterNetworkSettings;
    }

    /**
     * Set 集群网络相关参数
     * @param ClusterNetworkSettings 集群网络相关参数
     */
    public void setClusterNetworkSettings(ClusterNetworkSettings ClusterNetworkSettings) {
        this.ClusterNetworkSettings = ClusterNetworkSettings;
    }

    /**
     * Get 集群当前node数量 
     * @return ClusterNodeNum 集群当前node数量
     */
    public Long getClusterNodeNum() {
        return this.ClusterNodeNum;
    }

    /**
     * Set 集群当前node数量
     * @param ClusterNodeNum 集群当前node数量
     */
    public void setClusterNodeNum(Long ClusterNodeNum) {
        this.ClusterNodeNum = ClusterNodeNum;
    }

    /**
     * Get 集群所属的项目ID 
     * @return ProjectId 集群所属的项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 集群所属的项目ID
     * @param ProjectId 集群所属的项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSpecification 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSpecification 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get 集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Scaling 规模调整中,Upgrading 升级中,WaittingForConnect 等待注册,Trading 集群开通中,Isolated 欠费隔离中,Pause 集群升级暂停,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 隔离中,ResourceIsolated 已隔离,ResourceReverse 冲正中,Abnormal 异常) 
     * @return ClusterStatus 集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Scaling 规模调整中,Upgrading 升级中,WaittingForConnect 等待注册,Trading 集群开通中,Isolated 欠费隔离中,Pause 集群升级暂停,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 隔离中,ResourceIsolated 已隔离,ResourceReverse 冲正中,Abnormal 异常)
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Scaling 规模调整中,Upgrading 升级中,WaittingForConnect 等待注册,Trading 集群开通中,Isolated 欠费隔离中,Pause 集群升级暂停,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 隔离中,ResourceIsolated 已隔离,ResourceReverse 冲正中,Abnormal 异常)
     * @param ClusterStatus 集群状态 (Trading 集群开通中,Creating 创建中,Running 运行中,Deleting 删除中,Idling 闲置中,Recovering 唤醒中,Scaling 规模调整中,Upgrading 升级中,WaittingForConnect 等待注册,Trading 集群开通中,Isolated 欠费隔离中,Pause 集群升级暂停,NodeUpgrading 节点升级中,RuntimeUpgrading 节点运行时升级中,MasterScaling Master扩缩容中,ClusterLevelUpgrading 调整规格中,ResourceIsolate 隔离中,ResourceIsolated 已隔离,ResourceReverse 冲正中,Abnormal 异常)
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get 集群属性(包括集群不同属性的MAP，属性字段包括NodeNameType (lan-ip模式和hostname 模式，默认无lan-ip模式)) 
     * @return Property 集群属性(包括集群不同属性的MAP，属性字段包括NodeNameType (lan-ip模式和hostname 模式，默认无lan-ip模式))
     */
    public String getProperty() {
        return this.Property;
    }

    /**
     * Set 集群属性(包括集群不同属性的MAP，属性字段包括NodeNameType (lan-ip模式和hostname 模式，默认无lan-ip模式))
     * @param Property 集群属性(包括集群不同属性的MAP，属性字段包括NodeNameType (lan-ip模式和hostname 模式，默认无lan-ip模式))
     */
    public void setProperty(String Property) {
        this.Property = Property;
    }

    /**
     * Get 集群当前master数量 
     * @return ClusterMaterNodeNum 集群当前master数量
     */
    public Long getClusterMaterNodeNum() {
        return this.ClusterMaterNodeNum;
    }

    /**
     * Set 集群当前master数量
     * @param ClusterMaterNodeNum 集群当前master数量
     */
    public void setClusterMaterNodeNum(Long ClusterMaterNodeNum) {
        this.ClusterMaterNodeNum = ClusterMaterNodeNum;
    }

    /**
     * Get 集群使用镜像id 
     * @return ImageId 集群使用镜像id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 集群使用镜像id
     * @param ImageId 集群使用镜像id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get OsCustomizeType 系统定制类型 
     * @return OsCustomizeType OsCustomizeType 系统定制类型
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set OsCustomizeType 系统定制类型
     * @param OsCustomizeType OsCustomizeType 系统定制类型
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get 集群运行环境docker或container 
     * @return ContainerRuntime 集群运行环境docker或container
     */
    public String getContainerRuntime() {
        return this.ContainerRuntime;
    }

    /**
     * Set 集群运行环境docker或container
     * @param ContainerRuntime 集群运行环境docker或container
     */
    public void setContainerRuntime(String ContainerRuntime) {
        this.ContainerRuntime = ContainerRuntime;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 删除保护开关 
     * @return DeletionProtection 删除保护开关
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 删除保护开关
     * @param DeletionProtection 删除保护开关
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get 集群是否开启第三方节点支持 
     * @return EnableExternalNode 集群是否开启第三方节点支持
     */
    public Boolean getEnableExternalNode() {
        return this.EnableExternalNode;
    }

    /**
     * Set 集群是否开启第三方节点支持
     * @param EnableExternalNode 集群是否开启第三方节点支持
     */
    public void setEnableExternalNode(Boolean EnableExternalNode) {
        this.EnableExternalNode = EnableExternalNode;
    }

    /**
     * Get 集群等级，针对托管集群生效 
     * @return ClusterLevel 集群等级，针对托管集群生效
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set 集群等级，针对托管集群生效
     * @param ClusterLevel 集群等级，针对托管集群生效
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get 自动变配集群等级，针对托管集群生效 
     * @return AutoUpgradeClusterLevel 自动变配集群等级，针对托管集群生效
     */
    public Boolean getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set 自动变配集群等级，针对托管集群生效
     * @param AutoUpgradeClusterLevel 自动变配集群等级，针对托管集群生效
     */
    public void setAutoUpgradeClusterLevel(Boolean AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    /**
     * Get 是否开启QGPU共享 
     * @return QGPUShareEnable 是否开启QGPU共享
     */
    public Boolean getQGPUShareEnable() {
        return this.QGPUShareEnable;
    }

    /**
     * Set 是否开启QGPU共享
     * @param QGPUShareEnable 是否开启QGPU共享
     */
    public void setQGPUShareEnable(Boolean QGPUShareEnable) {
        this.QGPUShareEnable = QGPUShareEnable;
    }

    /**
     * Get 运行时版本 
     * @return RuntimeVersion 运行时版本
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * Set 运行时版本
     * @param RuntimeVersion 运行时版本
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * Get 集群当前etcd数量 
     * @return ClusterEtcdNodeNum 集群当前etcd数量
     */
    public Long getClusterEtcdNodeNum() {
        return this.ClusterEtcdNodeNum;
    }

    /**
     * Set 集群当前etcd数量
     * @param ClusterEtcdNodeNum 集群当前etcd数量
     */
    public void setClusterEtcdNodeNum(Long ClusterEtcdNodeNum) {
        this.ClusterEtcdNodeNum = ClusterEtcdNodeNum;
    }

    /**
     * Get 本地专用集群Id 
     * @return CdcId 本地专用集群Id
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set 本地专用集群Id
     * @param CdcId 本地专用集群Id
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
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

    }
}

