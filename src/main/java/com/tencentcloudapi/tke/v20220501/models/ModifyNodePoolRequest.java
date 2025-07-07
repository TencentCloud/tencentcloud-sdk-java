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

public class ModifyNodePoolRequest extends AbstractModel {

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
    * 节点池名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 节点  Labels
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 节点污点
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * 节点标签
    */
    @SerializedName("Tags")
    @Expose
    private TagSpecification [] Tags;

    /**
    * 是否开启删除保护
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * 节点是否不可调度
    */
    @SerializedName("Unschedulable")
    @Expose
    private Boolean Unschedulable;

    /**
    * 原生节点池更新参数
    */
    @SerializedName("Native")
    @Expose
    private UpdateNativeNodePoolParam Native;

    /**
    * 节点 Annotation 列表
    */
    @SerializedName("Annotations")
    @Expose
    private Annotation [] Annotations;

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
     * Get 节点  Labels 
     * @return Labels 节点  Labels
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 节点  Labels
     * @param Labels 节点  Labels
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 节点污点 
     * @return Taints 节点污点
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set 节点污点
     * @param Taints 节点污点
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get 节点标签 
     * @return Tags 节点标签
     */
    public TagSpecification [] getTags() {
        return this.Tags;
    }

    /**
     * Set 节点标签
     * @param Tags 节点标签
     */
    public void setTags(TagSpecification [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否开启删除保护 
     * @return DeletionProtection 是否开启删除保护
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set 是否开启删除保护
     * @param DeletionProtection 是否开启删除保护
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get 节点是否不可调度 
     * @return Unschedulable 节点是否不可调度
     */
    public Boolean getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set 节点是否不可调度
     * @param Unschedulable 节点是否不可调度
     */
    public void setUnschedulable(Boolean Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    /**
     * Get 原生节点池更新参数 
     * @return Native 原生节点池更新参数
     */
    public UpdateNativeNodePoolParam getNative() {
        return this.Native;
    }

    /**
     * Set 原生节点池更新参数
     * @param Native 原生节点池更新参数
     */
    public void setNative(UpdateNativeNodePoolParam Native) {
        this.Native = Native;
    }

    /**
     * Get 节点 Annotation 列表 
     * @return Annotations 节点 Annotation 列表
     */
    public Annotation [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 节点 Annotation 列表
     * @param Annotations 节点 Annotation 列表
     */
    public void setAnnotations(Annotation [] Annotations) {
        this.Annotations = Annotations;
    }

    public ModifyNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNodePoolRequest(ModifyNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NodePoolId != null) {
            this.NodePoolId = new String(source.NodePoolId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.Tags != null) {
            this.Tags = new TagSpecification[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagSpecification(source.Tags[i]);
            }
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new Boolean(source.DeletionProtection);
        }
        if (source.Unschedulable != null) {
            this.Unschedulable = new Boolean(source.Unschedulable);
        }
        if (source.Native != null) {
            this.Native = new UpdateNativeNodePoolParam(source.Native);
        }
        if (source.Annotations != null) {
            this.Annotations = new Annotation[source.Annotations.length];
            for (int i = 0; i < source.Annotations.length; i++) {
                this.Annotations[i] = new Annotation(source.Annotations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NodePoolId", this.NodePoolId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamObj(map, prefix + "Native.", this.Native);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);

    }
}

