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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegularNodePoolInfo extends AbstractModel {

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
    * 节点池osName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodePoolOs")
    @Expose
    private String NodePoolOs;

    /**
    * 节点配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

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
     * Get 节点池osName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodePoolOs 节点池osName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodePoolOs() {
        return this.NodePoolOs;
    }

    /**
     * Set 节点池osName
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodePoolOs 节点池osName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodePoolOs(String NodePoolOs) {
        this.NodePoolOs = NodePoolOs;
    }

    /**
     * Get 节点配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceAdvancedSettings 节点配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set 节点配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceAdvancedSettings 节点配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    public RegularNodePoolInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegularNodePoolInfo(RegularNodePoolInfo source) {
        if (source.LaunchConfigurationId != null) {
            this.LaunchConfigurationId = new String(source.LaunchConfigurationId);
        }
        if (source.AutoscalingGroupId != null) {
            this.AutoscalingGroupId = new String(source.AutoscalingGroupId);
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
        if (source.NodePoolOs != null) {
            this.NodePoolOs = new String(source.NodePoolOs);
        }
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "AutoscalingGroupId", this.AutoscalingGroupId);
        this.setParamObj(map, prefix + "NodeCountSummary.", this.NodeCountSummary);
        this.setParamSimple(map, prefix + "AutoscalingGroupStatus", this.AutoscalingGroupStatus);
        this.setParamSimple(map, prefix + "MaxNodesNum", this.MaxNodesNum);
        this.setParamSimple(map, prefix + "MinNodesNum", this.MinNodesNum);
        this.setParamSimple(map, prefix + "DesiredNodesNum", this.DesiredNodesNum);
        this.setParamSimple(map, prefix + "NodePoolOs", this.NodePoolOs);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);

    }
}

