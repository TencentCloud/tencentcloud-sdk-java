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

public class NodePool extends AbstractModel {

    /**
    * NodePoolId 资源池id
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * Name 资源池名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * ClusterInstanceId 集群实例id
    */
    @SerializedName("ClusterInstanceId")
    @Expose
    private String ClusterInstanceId;

    /**
    * LifeState 状态，当前节点池生命周期状态包括：creating，normal，updating，deleting，deleted
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * LaunchConfigurationId 配置
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * AutoscalingGroupId 分组id
    */
    @SerializedName("AutoscalingGroupId")
    @Expose
    private String AutoscalingGroupId;

    /**
    * Labels 标签
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Taints 污点标记
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * 节点 Annotation 列表
    */
    @SerializedName("Annotations")
    @Expose
    private AnnotationValue [] Annotations;

    /**
    * NodeCountSummary 节点列表
    */
    @SerializedName("NodeCountSummary")
    @Expose
    private NodeCountSummary NodeCountSummary;

    /**
    * 状态信息
    */
    @SerializedName("AutoscalingGroupStatus")
    @Expose
    private String AutoscalingGroupStatus;

    /**
    * 最大节点数量
    */
    @SerializedName("MaxNodesNum")
    @Expose
    private Long MaxNodesNum;

    /**
    * 最小节点数量
    */
    @SerializedName("MinNodesNum")
    @Expose
    private Long MinNodesNum;

    /**
    * 期望的节点数量
    */
    @SerializedName("DesiredNodesNum")
    @Expose
    private Long DesiredNodesNum;

    /**
    * 运行时描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeConfig")
    @Expose
    private RuntimeConfig RuntimeConfig;

    /**
    * 节点池osName
    */
    @SerializedName("NodePoolOs")
    @Expose
    private String NodePoolOs;

    /**
    * 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
    */
    @SerializedName("OsCustomizeType")
    @Expose
    private String OsCustomizeType;

    /**
    * 镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 集群属于节点podCIDR大小自定义模式时，节点池需要带上pod数量属性
    */
    @SerializedName("DesiredPodNum")
    @Expose
    private Long DesiredPodNum;

    /**
    * 用户自定义脚本
    */
    @SerializedName("UserScript")
    @Expose
    private String UserScript;

    /**
    * 资源标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 删除保护开关
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * 节点配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraArgs")
    @Expose
    private InstanceExtraArgs ExtraArgs;

    /**
    * GPU驱动相关参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUArgs")
    @Expose
    private GPUArgs GPUArgs;

    /**
    * dockerd --graph 指定值, 默认为 /var/lib/docker
    */
    @SerializedName("DockerGraphPath")
    @Expose
    private String DockerGraphPath;

    /**
    * 多盘数据盘挂载信息：新建节点时请确保购买CVM的参数传递了购买多个数据盘的信息，如CreateClusterInstances API的RunInstancesPara下的DataDisks也需要设置购买多个数据盘, 具体可以参考CreateClusterInstances接口的添加集群节点(多块数据盘)样例；添加已有节点时，请确保填写的分区信息在节点上真实存在
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * 是否不可调度
    */
    @SerializedName("Unschedulable")
    @Expose
    private Long Unschedulable;

    /**
    * 用户自定义脚本,在UserScript前执行
    */
    @SerializedName("PreStartUserScript")
    @Expose
    private String PreStartUserScript;

    /**
     * Get NodePoolId 资源池id 
     * @return NodePoolId NodePoolId 资源池id
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set NodePoolId 资源池id
     * @param NodePoolId NodePoolId 资源池id
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get Name 资源池名称 
     * @return Name Name 资源池名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name 资源池名称
     * @param Name Name 资源池名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get ClusterInstanceId 集群实例id 
     * @return ClusterInstanceId ClusterInstanceId 集群实例id
     */
    public String getClusterInstanceId() {
        return this.ClusterInstanceId;
    }

    /**
     * Set ClusterInstanceId 集群实例id
     * @param ClusterInstanceId ClusterInstanceId 集群实例id
     */
    public void setClusterInstanceId(String ClusterInstanceId) {
        this.ClusterInstanceId = ClusterInstanceId;
    }

    /**
     * Get LifeState 状态，当前节点池生命周期状态包括：creating，normal，updating，deleting，deleted 
     * @return LifeState LifeState 状态，当前节点池生命周期状态包括：creating，normal，updating，deleting，deleted
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set LifeState 状态，当前节点池生命周期状态包括：creating，normal，updating，deleting，deleted
     * @param LifeState LifeState 状态，当前节点池生命周期状态包括：creating，normal，updating，deleting，deleted
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get LaunchConfigurationId 配置 
     * @return LaunchConfigurationId LaunchConfigurationId 配置
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * Set LaunchConfigurationId 配置
     * @param LaunchConfigurationId LaunchConfigurationId 配置
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * Get AutoscalingGroupId 分组id 
     * @return AutoscalingGroupId AutoscalingGroupId 分组id
     */
    public String getAutoscalingGroupId() {
        return this.AutoscalingGroupId;
    }

    /**
     * Set AutoscalingGroupId 分组id
     * @param AutoscalingGroupId AutoscalingGroupId 分组id
     */
    public void setAutoscalingGroupId(String AutoscalingGroupId) {
        this.AutoscalingGroupId = AutoscalingGroupId;
    }

    /**
     * Get Labels 标签 
     * @return Labels Labels 标签
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Labels 标签
     * @param Labels Labels 标签
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Taints 污点标记 
     * @return Taints Taints 污点标记
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set Taints 污点标记
     * @param Taints Taints 污点标记
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get 节点 Annotation 列表 
     * @return Annotations 节点 Annotation 列表
     */
    public AnnotationValue [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 节点 Annotation 列表
     * @param Annotations 节点 Annotation 列表
     */
    public void setAnnotations(AnnotationValue [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get NodeCountSummary 节点列表 
     * @return NodeCountSummary NodeCountSummary 节点列表
     */
    public NodeCountSummary getNodeCountSummary() {
        return this.NodeCountSummary;
    }

    /**
     * Set NodeCountSummary 节点列表
     * @param NodeCountSummary NodeCountSummary 节点列表
     */
    public void setNodeCountSummary(NodeCountSummary NodeCountSummary) {
        this.NodeCountSummary = NodeCountSummary;
    }

    /**
     * Get 状态信息 
     * @return AutoscalingGroupStatus 状态信息
     */
    public String getAutoscalingGroupStatus() {
        return this.AutoscalingGroupStatus;
    }

    /**
     * Set 状态信息
     * @param AutoscalingGroupStatus 状态信息
     */
    public void setAutoscalingGroupStatus(String AutoscalingGroupStatus) {
        this.AutoscalingGroupStatus = AutoscalingGroupStatus;
    }

    /**
     * Get 最大节点数量 
     * @return MaxNodesNum 最大节点数量
     */
    public Long getMaxNodesNum() {
        return this.MaxNodesNum;
    }

    /**
     * Set 最大节点数量
     * @param MaxNodesNum 最大节点数量
     */
    public void setMaxNodesNum(Long MaxNodesNum) {
        this.MaxNodesNum = MaxNodesNum;
    }

    /**
     * Get 最小节点数量 
     * @return MinNodesNum 最小节点数量
     */
    public Long getMinNodesNum() {
        return this.MinNodesNum;
    }

    /**
     * Set 最小节点数量
     * @param MinNodesNum 最小节点数量
     */
    public void setMinNodesNum(Long MinNodesNum) {
        this.MinNodesNum = MinNodesNum;
    }

    /**
     * Get 期望的节点数量 
     * @return DesiredNodesNum 期望的节点数量
     */
    public Long getDesiredNodesNum() {
        return this.DesiredNodesNum;
    }

    /**
     * Set 期望的节点数量
     * @param DesiredNodesNum 期望的节点数量
     */
    public void setDesiredNodesNum(Long DesiredNodesNum) {
        this.DesiredNodesNum = DesiredNodesNum;
    }

    /**
     * Get 运行时描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeConfig 运行时描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuntimeConfig getRuntimeConfig() {
        return this.RuntimeConfig;
    }

    /**
     * Set 运行时描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeConfig 运行时描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeConfig(RuntimeConfig RuntimeConfig) {
        this.RuntimeConfig = RuntimeConfig;
    }

    /**
     * Get 节点池osName 
     * @return NodePoolOs 节点池osName
     */
    public String getNodePoolOs() {
        return this.NodePoolOs;
    }

    /**
     * Set 节点池osName
     * @param NodePoolOs 节点池osName
     */
    public void setNodePoolOs(String NodePoolOs) {
        this.NodePoolOs = NodePoolOs;
    }

    /**
     * Get 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值) 
     * @return OsCustomizeType 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     */
    public String getOsCustomizeType() {
        return this.OsCustomizeType;
    }

    /**
     * Set 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     * @param OsCustomizeType 容器的镜像版本，"DOCKER_CUSTOMIZE"(容器定制版),"GENERAL"(普通版本，默认值)
     */
    public void setOsCustomizeType(String OsCustomizeType) {
        this.OsCustomizeType = OsCustomizeType;
    }

    /**
     * Get 镜像id 
     * @return ImageId 镜像id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id
     * @param ImageId 镜像id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 集群属于节点podCIDR大小自定义模式时，节点池需要带上pod数量属性 
     * @return DesiredPodNum 集群属于节点podCIDR大小自定义模式时，节点池需要带上pod数量属性
     */
    public Long getDesiredPodNum() {
        return this.DesiredPodNum;
    }

    /**
     * Set 集群属于节点podCIDR大小自定义模式时，节点池需要带上pod数量属性
     * @param DesiredPodNum 集群属于节点podCIDR大小自定义模式时，节点池需要带上pod数量属性
     */
    public void setDesiredPodNum(Long DesiredPodNum) {
        this.DesiredPodNum = DesiredPodNum;
    }

    /**
     * Get 用户自定义脚本 
     * @return UserScript 用户自定义脚本
     */
    public String getUserScript() {
        return this.UserScript;
    }

    /**
     * Set 用户自定义脚本
     * @param UserScript 用户自定义脚本
     */
    public void setUserScript(String UserScript) {
        this.UserScript = UserScript;
    }

    /**
     * Get 资源标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 资源标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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
     * Get 节点配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraArgs 节点配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceExtraArgs getExtraArgs() {
        return this.ExtraArgs;
    }

    /**
     * Set 节点配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraArgs 节点配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraArgs(InstanceExtraArgs ExtraArgs) {
        this.ExtraArgs = ExtraArgs;
    }

    /**
     * Get GPU驱动相关参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUArgs GPU驱动相关参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GPUArgs getGPUArgs() {
        return this.GPUArgs;
    }

    /**
     * Set GPU驱动相关参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUArgs GPU驱动相关参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUArgs(GPUArgs GPUArgs) {
        this.GPUArgs = GPUArgs;
    }

    /**
     * Get dockerd --graph 指定值, 默认为 /var/lib/docker 
     * @return DockerGraphPath dockerd --graph 指定值, 默认为 /var/lib/docker
     */
    public String getDockerGraphPath() {
        return this.DockerGraphPath;
    }

    /**
     * Set dockerd --graph 指定值, 默认为 /var/lib/docker
     * @param DockerGraphPath dockerd --graph 指定值, 默认为 /var/lib/docker
     */
    public void setDockerGraphPath(String DockerGraphPath) {
        this.DockerGraphPath = DockerGraphPath;
    }

    /**
     * Get 多盘数据盘挂载信息：新建节点时请确保购买CVM的参数传递了购买多个数据盘的信息，如CreateClusterInstances API的RunInstancesPara下的DataDisks也需要设置购买多个数据盘, 具体可以参考CreateClusterInstances接口的添加集群节点(多块数据盘)样例；添加已有节点时，请确保填写的分区信息在节点上真实存在
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDisks 多盘数据盘挂载信息：新建节点时请确保购买CVM的参数传递了购买多个数据盘的信息，如CreateClusterInstances API的RunInstancesPara下的DataDisks也需要设置购买多个数据盘, 具体可以参考CreateClusterInstances接口的添加集群节点(多块数据盘)样例；添加已有节点时，请确保填写的分区信息在节点上真实存在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 多盘数据盘挂载信息：新建节点时请确保购买CVM的参数传递了购买多个数据盘的信息，如CreateClusterInstances API的RunInstancesPara下的DataDisks也需要设置购买多个数据盘, 具体可以参考CreateClusterInstances接口的添加集群节点(多块数据盘)样例；添加已有节点时，请确保填写的分区信息在节点上真实存在
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDisks 多盘数据盘挂载信息：新建节点时请确保购买CVM的参数传递了购买多个数据盘的信息，如CreateClusterInstances API的RunInstancesPara下的DataDisks也需要设置购买多个数据盘, 具体可以参考CreateClusterInstances接口的添加集群节点(多块数据盘)样例；添加已有节点时，请确保填写的分区信息在节点上真实存在
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get 是否不可调度 
     * @return Unschedulable 是否不可调度
     */
    public Long getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set 是否不可调度
     * @param Unschedulable 是否不可调度
     */
    public void setUnschedulable(Long Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    /**
     * Get 用户自定义脚本,在UserScript前执行 
     * @return PreStartUserScript 用户自定义脚本,在UserScript前执行
     */
    public String getPreStartUserScript() {
        return this.PreStartUserScript;
    }

    /**
     * Set 用户自定义脚本,在UserScript前执行
     * @param PreStartUserScript 用户自定义脚本,在UserScript前执行
     */
    public void setPreStartUserScript(String PreStartUserScript) {
        this.PreStartUserScript = PreStartUserScript;
    }

    public NodePool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodePool(NodePool source) {
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ClusterInstanceId != null) {
            this.ClusterInstanceId = new String(source.ClusterInstanceId);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.AutoscalingGroupId != null) {
            this.AutoscalingGroupId = new String(source.AutoscalingGroupId);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Taints != null) {
            this.Taints = new Taint[source.Taints.length];
            for (int i = 0; i < source.Taints.length; i++) {
                this.Taints[i] = new Taint(source.Taints[i]);
            }
        }
        if (source.Annotations != null) {
            this.Annotations = new AnnotationValue[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new AnnotationValue(source.Annotations[i]);
            }
        }
        if (source.NodeCountSummary != null) {
            this.NodeCountSummary = new NodeCountSummary(source.NodeCountSummary);
        }
        if (source.AutoscalingGroupStatus != null) {
            this.AutoscalingGroupStatus = new String(source.AutoscalingGroupStatus);
        }
        if (source.MaxNodesNum != null) {
            this.MaxNodesNum = new Long(source.MaxNodesNum);
        }
        if (source.MinNodesNum != null) {
            this.MinNodesNum = new Long(source.MinNodesNum);
        }
        if (source.DesiredNodesNum != null) {
            this.DesiredNodesNum = new Long(source.DesiredNodesNum);
        }
        if (source.RuntimeConfig != null) {
            this.RuntimeConfig = new RuntimeConfig(source.RuntimeConfig);
        }
        if (source.NodePoolOs != null) {
            this.NodePoolOs = new String(source.NodePoolOs);
        }
        if (source.OsCustomizeType != null) {
            this.OsCustomizeType = new String(source.OsCustomizeType);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.DesiredPodNum != null) {
            this.DesiredPodNum = new Long(source.DesiredPodNum);
        }
        if (source.UserScript != null) {
            this.UserScript = new String(source.UserScript);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.ExtraArgs != null) {
            this.ExtraArgs = new InstanceExtraArgs(source.ExtraArgs);
        }
        if (source.GPUArgs != null) {
            this.GPUArgs = new GPUArgs(source.GPUArgs);
        }
        if (source.DockerGraphPath != null) {
            this.DockerGraphPath = new String(source.DockerGraphPath);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.Unschedulable != null) {
            this.Unschedulable = new Long(source.Unschedulable);
        }
        if (source.PreStartUserScript != null) {
            this.PreStartUserScript = new String(source.PreStartUserScript);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClusterInstanceId", this.ClusterInstanceId);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "AutoscalingGroupId", this.AutoscalingGroupId);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamObj(map, prefix + "NodeCountSummary.", this.NodeCountSummary);
        this.setParamSimple(map, prefix + "AutoscalingGroupStatus", this.AutoscalingGroupStatus);
        this.setParamSimple(map, prefix + "MaxNodesNum", this.MaxNodesNum);
        this.setParamSimple(map, prefix + "MinNodesNum", this.MinNodesNum);
        this.setParamSimple(map, prefix + "DesiredNodesNum", this.DesiredNodesNum);
        this.setParamObj(map, prefix + "RuntimeConfig.", this.RuntimeConfig);
        this.setParamSimple(map, prefix + "NodePoolOs", this.NodePoolOs);
        this.setParamSimple(map, prefix + "OsCustomizeType", this.OsCustomizeType);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "DesiredPodNum", this.DesiredPodNum);
        this.setParamSimple(map, prefix + "UserScript", this.UserScript);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamObj(map, prefix + "ExtraArgs.", this.ExtraArgs);
        this.setParamObj(map, prefix + "GPUArgs.", this.GPUArgs);
        this.setParamSimple(map, prefix + "DockerGraphPath", this.DockerGraphPath);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamSimple(map, prefix + "PreStartUserScript", this.PreStartUserScript);

    }
}

