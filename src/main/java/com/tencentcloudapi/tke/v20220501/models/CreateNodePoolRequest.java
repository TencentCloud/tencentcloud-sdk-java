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

public class CreateNodePoolRequest extends AbstractModel {

    /**
    * <p>集群 ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>节点池名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>节点池类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>节点  Labels</p>
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * <p>节点污点</p>
    */
    @SerializedName("Taints")
    @Expose
    private Taint [] Taints;

    /**
    * <p>节点标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagSpecification [] Tags;

    /**
    * <p>是否开启删除保护</p>
    */
    @SerializedName("DeletionProtection")
    @Expose
    private Boolean DeletionProtection;

    /**
    * <p>节点是否默认不可调度</p>
    */
    @SerializedName("Unschedulable")
    @Expose
    private Boolean Unschedulable;

    /**
    * <p>原生节点池创建参数（Type字段设置为Native时需填写）</p>
    */
    @SerializedName("Native")
    @Expose
    private CreateNativeNodePoolParam Native;

    /**
    * <p>节点 Annotation 列表</p>
    */
    @SerializedName("Annotations")
    @Expose
    private Annotation [] Annotations;

    /**
     * Get <p>集群 ID</p> 
     * @return ClusterId <p>集群 ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID</p>
     * @param ClusterId <p>集群 ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get <p>节点池类型</p> 
     * @return Type <p>节点池类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>节点池类型</p>
     * @param Type <p>节点池类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>节点  Labels</p> 
     * @return Labels <p>节点  Labels</p>
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>节点  Labels</p>
     * @param Labels <p>节点  Labels</p>
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>节点污点</p> 
     * @return Taints <p>节点污点</p>
     */
    public Taint [] getTaints() {
        return this.Taints;
    }

    /**
     * Set <p>节点污点</p>
     * @param Taints <p>节点污点</p>
     */
    public void setTaints(Taint [] Taints) {
        this.Taints = Taints;
    }

    /**
     * Get <p>节点标签</p> 
     * @return Tags <p>节点标签</p>
     */
    public TagSpecification [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>节点标签</p>
     * @param Tags <p>节点标签</p>
     */
    public void setTags(TagSpecification [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否开启删除保护</p> 
     * @return DeletionProtection <p>是否开启删除保护</p>
     */
    public Boolean getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set <p>是否开启删除保护</p>
     * @param DeletionProtection <p>是否开启删除保护</p>
     */
    public void setDeletionProtection(Boolean DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get <p>节点是否默认不可调度</p> 
     * @return Unschedulable <p>节点是否默认不可调度</p>
     */
    public Boolean getUnschedulable() {
        return this.Unschedulable;
    }

    /**
     * Set <p>节点是否默认不可调度</p>
     * @param Unschedulable <p>节点是否默认不可调度</p>
     */
    public void setUnschedulable(Boolean Unschedulable) {
        this.Unschedulable = Unschedulable;
    }

    /**
     * Get <p>原生节点池创建参数（Type字段设置为Native时需填写）</p> 
     * @return Native <p>原生节点池创建参数（Type字段设置为Native时需填写）</p>
     */
    public CreateNativeNodePoolParam getNative() {
        return this.Native;
    }

    /**
     * Set <p>原生节点池创建参数（Type字段设置为Native时需填写）</p>
     * @param Native <p>原生节点池创建参数（Type字段设置为Native时需填写）</p>
     */
    public void setNative(CreateNativeNodePoolParam Native) {
        this.Native = Native;
    }

    /**
     * Get <p>节点 Annotation 列表</p> 
     * @return Annotations <p>节点 Annotation 列表</p>
     */
    public Annotation [] getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set <p>节点 Annotation 列表</p>
     * @param Annotations <p>节点 Annotation 列表</p>
     */
    public void setAnnotations(Annotation [] Annotations) {
        this.Annotations = Annotations;
    }

    public CreateNodePoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNodePoolRequest(CreateNodePoolRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
            this.Native = new CreateNativeNodePoolParam(source.Native);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Taints.", this.Taints);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeletionProtection", this.DeletionProtection);
        this.setParamSimple(map, prefix + "Unschedulable", this.Unschedulable);
        this.setParamObj(map, prefix + "Native.", this.Native);
        this.setParamArrayObj(map, prefix + "Annotations.", this.Annotations);

    }
}

