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

public class ExternalNodePool extends AbstractModel {

    /**
    * 注册节点池ID
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 注册节点池名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 节点池生命周期
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * 集群CIDR
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * 集群网络插件类型
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 注册节点运行时配置
    */
    @SerializedName("RuntimeConfig")
    @Expose
    private RuntimeConfig RuntimeConfig;

    /**
    * 注册节点标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 注册节点污点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * 注册节点高级设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * 删除保护开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * 注册节点类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
     * Get 注册节点池ID 
     * @return NodePoolId 注册节点池ID
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 注册节点池ID
     * @param NodePoolId 注册节点池ID
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get 注册节点池名称 
     * @return Name 注册节点池名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 注册节点池名称
     * @param Name 注册节点池名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 节点池生命周期 
     * @return LifeState 节点池生命周期
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set 节点池生命周期
     * @param LifeState 节点池生命周期
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get 集群CIDR 
     * @return ClusterCIDR 集群CIDR
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * Set 集群CIDR
     * @param ClusterCIDR 集群CIDR
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * Get 集群网络插件类型 
     * @return NetworkType 集群网络插件类型
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 集群网络插件类型
     * @param NetworkType 集群网络插件类型
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 注册节点运行时配置 
     * @return RuntimeConfig 注册节点运行时配置
     */
    public RuntimeConfig getRuntimeConfig() {
        return this.RuntimeConfig;
    }

    /**
     * Set 注册节点运行时配置
     * @param RuntimeConfig 注册节点运行时配置
     */
    public void setRuntimeConfig(RuntimeConfig RuntimeConfig) {
        this.RuntimeConfig = RuntimeConfig;
    }

    /**
     * Get 注册节点标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 注册节点标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 注册节点标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 注册节点标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 注册节点污点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Taints 注册节点污点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set 注册节点污点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Taints 注册节点污点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get 注册节点高级设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceAdvancedSettings 注册节点高级设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set 注册节点高级设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceAdvancedSettings 注册节点高级设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Get 删除保护开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeletionProtection 删除保护开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 删除保护开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeletionProtection 删除保护开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get 注册节点类型 
     * @return NodeType 注册节点类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 注册节点类型
     * @param NodeType 注册节点类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    public ExternalNodePool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalNodePool(ExternalNodePool source) {
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.ClusterCIDR != null) {
            this.ClusterCIDR = new String(source.ClusterCIDR);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.RuntimeConfig != null) {
            this.RuntimeConfig = new RuntimeConfig(source.RuntimeConfig);
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
        if (source.InstanceAdvancedSettings != null) {
            this.InstanceAdvancedSettings = new InstanceAdvancedSettings(source.InstanceAdvancedSettings);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "ClusterCIDR", this.ClusterCIDR);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamObj(map, prefix + "RuntimeConfig.", this.RuntimeConfig);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);

    }
}

