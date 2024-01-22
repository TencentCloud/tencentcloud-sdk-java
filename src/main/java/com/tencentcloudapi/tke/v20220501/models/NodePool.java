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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodePool extends AbstractModel {

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 节点池 ID
    */
    @SerializedName("NodePoolId")
    @Expose
    private String NodePoolId;

    /**
    * 节点污点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * 是否开启删除保护
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * 节点池类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 节点  Labels
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 节点池状态
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 节点池名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 原生节点池参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Native")
    @Expose
    private NativeNodePoolInfo Native;

    /**
    * 节点 Annotation 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Annotations")
    @Expose
    private Annotation [] Annotations;

    /**
    * 超级节点池参数，在Type等于Super该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Super")
    @Expose
    private SuperNodePoolInfo Super;

    /**
    * 普通节点池参数，在Type等于Regular该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Regular")
    @Expose
    private RegularNodePoolInfo Regular;

    /**
    * 第三方节点池参数，在Type等于External该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("External")
    @Expose
    private ExternalNodePoolInfo External;

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 节点池 ID 
     * @return NodePoolId 节点池 ID
     */
    public String getNodePoolId() {
        return this.NodePoolId;
    }

    /**
     * Set 节点池 ID
     * @param NodePoolId 节点池 ID
     */
    public void setNodePoolId(String NodePoolId) {
        this.NodePoolId = NodePoolId;
    }

    /**
     * Get 节点污点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Taints 节点污点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set 节点污点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Taints 节点污点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get 是否开启删除保护
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeletionProtection 是否开启删除保护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 是否开启删除保护
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeletionProtection 是否开启删除保护
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get 节点池类型 
     * @return Type 节点池类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 节点池类型
     * @param Type 节点池类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 节点  Labels
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 节点  Labels
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 节点  Labels
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 节点  Labels
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 节点池状态 
     * @return LifeState 节点池状态
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set 节点池状态
     * @param LifeState 节点池状态
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 节点池名称 
     * @return Name 节点池名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 节点池名称
     * @param Name 节点池名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 原生节点池参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Native 原生节点池参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NativeNodePoolInfo getNative() {
        return this.Native;
    }

    /**
     * Set 原生节点池参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Native 原生节点池参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNative(NativeNodePoolInfo Native) {
        this.Native = Native;
    }

    /**
     * Get 节点 Annotation 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Annotations 节点 Annotation 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Annotation [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 节点 Annotation 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Annotations 节点 Annotation 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotations(Annotation [] Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get 超级节点池参数，在Type等于Super该字段才有值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Super 超级节点池参数，在Type等于Super该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SuperNodePoolInfo getSuper() {
        return this.Super;
    }

    /**
     * Set 超级节点池参数，在Type等于Super该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Super 超级节点池参数，在Type等于Super该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuper(SuperNodePoolInfo Super) {
        this.Super = Super;
    }

    /**
     * Get 普通节点池参数，在Type等于Regular该字段才有值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Regular 普通节点池参数，在Type等于Regular该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegularNodePoolInfo getRegular() {
        return this.Regular;
    }

    /**
     * Set 普通节点池参数，在Type等于Regular该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Regular 普通节点池参数，在Type等于Regular该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegular(RegularNodePoolInfo Regular) {
        this.Regular = Regular;
    }

    /**
     * Get 第三方节点池参数，在Type等于External该字段才有值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return External 第三方节点池参数，在Type等于External该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExternalNodePoolInfo getExternal() {
        return this.External;
    }

    /**
     * Set 第三方节点池参数，在Type等于External该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
     * @param External 第三方节点池参数，在Type等于External该字段才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternal(ExternalNodePoolInfo External) {
        this.External = External;
    }

    public NodePool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodePool(NodePool source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.Taints != null) {
            this.Taints = new Taint[source.Taints.length];
            for (int i = 0; i < source.Taints.length; i++) {
                this.Taints[i] = new Taint(source.Taints[i]);
            }
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Native != null) {
            this.Native = new NativeNodePoolInfo(source.Native);
        }
        if (source.Annotations != null) {
            this.Annotations = new Annotation[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new Annotation(source.Annotations[i]);
            }
        }
        if (source.Super != null) {
            this.Super = new SuperNodePoolInfo(source.Super);
        }
        if (source.Regular != null) {
            this.Regular = new RegularNodePoolInfo(source.Regular);
        }
        if (source.External != null) {
            this.External = new ExternalNodePoolInfo(source.External);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Native.", this.Native);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);
        this.setParamObj(map, prefix + "Super.", this.Super);
        this.setParamObj(map, prefix + "Regular.", this.Regular);
        this.setParamObj(map, prefix + "External.", this.External);

    }
}

