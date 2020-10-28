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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodePool extends AbstractModel{

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
    * LifeState 状态
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
    * NodeCountSummary 节点列表
    */
    @SerializedName("NodeCountSummary")
    @Expose
    private NodeCountSummary NodeCountSummary;

    /**
    * 状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoscalingGroupStatus")
    @Expose
    private String AutoscalingGroupStatus;

    /**
    * 最大节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxNodesNum")
    @Expose
    private Long MaxNodesNum;

    /**
    * 最小节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinNodesNum")
    @Expose
    private Long MinNodesNum;

    /**
    * 期望的节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DesiredNodesNum")
    @Expose
    private Long DesiredNodesNum;

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
     * Get LifeState 状态 
     * @return LifeState LifeState 状态
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set LifeState 状态
     * @param LifeState LifeState 状态
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoscalingGroupStatus 状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAutoscalingGroupStatus() {
        return this.AutoscalingGroupStatus;
    }

    /**
     * Set 状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoscalingGroupStatus 状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoscalingGroupStatus(String AutoscalingGroupStatus) {
        this.AutoscalingGroupStatus = AutoscalingGroupStatus;
    }

    /**
     * Get 最大节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxNodesNum 最大节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxNodesNum() {
        return this.MaxNodesNum;
    }

    /**
     * Set 最大节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxNodesNum 最大节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxNodesNum(Long MaxNodesNum) {
        this.MaxNodesNum = MaxNodesNum;
    }

    /**
     * Get 最小节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinNodesNum 最小节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinNodesNum() {
        return this.MinNodesNum;
    }

    /**
     * Set 最小节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinNodesNum 最小节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinNodesNum(Long MinNodesNum) {
        this.MinNodesNum = MinNodesNum;
    }

    /**
     * Get 期望的节点数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DesiredNodesNum 期望的节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDesiredNodesNum() {
        return this.DesiredNodesNum;
    }

    /**
     * Set 期望的节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DesiredNodesNum 期望的节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesiredNodesNum(Long DesiredNodesNum) {
        this.DesiredNodesNum = DesiredNodesNum;
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
        this.setParamObj(map, prefix + "NodeCountSummary.", this.NodeCountSummary);
        this.setParamSimple(map, prefix + "AutoscalingGroupStatus", this.AutoscalingGroupStatus);
        this.setParamSimple(map, prefix + "MaxNodesNum", this.MaxNodesNum);
        this.setParamSimple(map, prefix + "MinNodesNum", this.MinNodesNum);
        this.setParamSimple(map, prefix + "DesiredNodesNum", this.DesiredNodesNum);

    }
}

