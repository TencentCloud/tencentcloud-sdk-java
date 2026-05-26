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

public class VirtualNodePool extends AbstractModel {

    /**
    * <p>节点池ID</p>
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * <p>子网列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * <p>节点池名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>节点池生命周期</p><ul><li>creating：创建中</li><li>normal：正常</li><li>updating：更新中</li></ul>
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * <p>虚拟节点label</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * <p>虚拟节点taint</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * <p>子网分配策略</p>
    */
    @SerializedName("SubnetAllocationPolicy")
    @Expose
    private SubnetAllocationPolicy SubnetAllocationPolicy;

    /**
     * Get <p>节点池ID</p> 
     * @return NodePoolId <p>节点池ID</p>
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set <p>节点池ID</p>
     * @param NodePoolId <p>节点池ID</p>
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get <p>子网列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetIds <p>子网列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set <p>子网列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetIds <p>子网列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get <p>节点池名称</p> 
     * @return Name <p>节点池名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>节点池名称</p>
     * @param Name <p>节点池名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>节点池生命周期</p><ul><li>creating：创建中</li><li>normal：正常</li><li>updating：更新中</li></ul> 
     * @return LifeState <p>节点池生命周期</p><ul><li>creating：创建中</li><li>normal：正常</li><li>updating：更新中</li></ul>
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set <p>节点池生命周期</p><ul><li>creating：创建中</li><li>normal：正常</li><li>updating：更新中</li></ul>
     * @param LifeState <p>节点池生命周期</p><ul><li>creating：创建中</li><li>normal：正常</li><li>updating：更新中</li></ul>
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get <p>虚拟节点label</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels <p>虚拟节点label</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>虚拟节点label</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels <p>虚拟节点label</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>虚拟节点taint</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Taints <p>虚拟节点taint</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set <p>虚拟节点taint</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Taints <p>虚拟节点taint</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get <p>子网分配策略</p> 
     * @return SubnetAllocationPolicy <p>子网分配策略</p>
     */
    public SubnetAllocationPolicy getSubnetAllocationPolicy() {
        return this.SubnetAllocationPolicy;
    }

    /**
     * Set <p>子网分配策略</p>
     * @param SubnetAllocationPolicy <p>子网分配策略</p>
     */
    public void setSubnetAllocationPolicy(SubnetAllocationPolicy SubnetAllocationPolicy) {
        this.SubnetAllocationPolicy = SubnetAllocationPolicy;
    }

    public VirtualNodePool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirtualNodePool(VirtualNodePool source) {
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
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
        if (source.SubnetAllocationPolicy != null) {
            this.SubnetAllocationPolicy = new SubnetAllocationPolicy(source.SubnetAllocationPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamObj(map, prefix + "SubnetAllocationPolicy.", this.SubnetAllocationPolicy);

    }
}

