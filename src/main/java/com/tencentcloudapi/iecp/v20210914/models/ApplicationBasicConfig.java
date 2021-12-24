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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationBasicConfig extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 工作负载类型
    */
    @SerializedName("WorkflowKind")
    @Expose
    private String WorkflowKind;

    /**
    * 标签信息
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * Grid唯一Key
    */
    @SerializedName("GridUniqKey")
    @Expose
    private String GridUniqKey;

    /**
    * NodeSelector标签
    */
    @SerializedName("NodeSelector")
    @Expose
    private Label [] NodeSelector;

    /**
    * 实例数
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 可用实例数
    */
    @SerializedName("AvailableReplicas")
    @Expose
    private Long AvailableReplicas;

    /**
    * 是否开启service环境变量注入pod
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableServiceLinks")
    @Expose
    private Boolean EnableServiceLinks;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 工作负载类型 
     * @return WorkflowKind 工作负载类型
     */
    public String getWorkflowKind() {
        return this.WorkflowKind;
    }

    /**
     * Set 工作负载类型
     * @param WorkflowKind 工作负载类型
     */
    public void setWorkflowKind(String WorkflowKind) {
        this.WorkflowKind = WorkflowKind;
    }

    /**
     * Get 标签信息 
     * @return Labels 标签信息
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签信息
     * @param Labels 标签信息
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Grid唯一Key 
     * @return GridUniqKey Grid唯一Key
     */
    public String getGridUniqKey() {
        return this.GridUniqKey;
    }

    /**
     * Set Grid唯一Key
     * @param GridUniqKey Grid唯一Key
     */
    public void setGridUniqKey(String GridUniqKey) {
        this.GridUniqKey = GridUniqKey;
    }

    /**
     * Get NodeSelector标签 
     * @return NodeSelector NodeSelector标签
     */
    public Label [] getNodeSelector() {
        return this.NodeSelector;
    }

    /**
     * Set NodeSelector标签
     * @param NodeSelector NodeSelector标签
     */
    public void setNodeSelector(Label [] NodeSelector) {
        this.NodeSelector = NodeSelector;
    }

    /**
     * Get 实例数 
     * @return Replicas 实例数
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 实例数
     * @param Replicas 实例数
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 可用实例数 
     * @return AvailableReplicas 可用实例数
     */
    public Long getAvailableReplicas() {
        return this.AvailableReplicas;
    }

    /**
     * Set 可用实例数
     * @param AvailableReplicas 可用实例数
     */
    public void setAvailableReplicas(Long AvailableReplicas) {
        this.AvailableReplicas = AvailableReplicas;
    }

    /**
     * Get 是否开启service环境变量注入pod
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableServiceLinks 是否开启service环境变量注入pod
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableServiceLinks() {
        return this.EnableServiceLinks;
    }

    /**
     * Set 是否开启service环境变量注入pod
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableServiceLinks 是否开启service环境变量注入pod
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableServiceLinks(Boolean EnableServiceLinks) {
        this.EnableServiceLinks = EnableServiceLinks;
    }

    public ApplicationBasicConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationBasicConfig(ApplicationBasicConfig source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.WorkflowKind != null) {
            this.WorkflowKind = new String(source.WorkflowKind);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.GridUniqKey != null) {
            this.GridUniqKey = new String(source.GridUniqKey);
        }
        if (source.NodeSelector != null) {
            this.NodeSelector = new Label[source.NodeSelector.length];
            for (int i = 0; i < source.NodeSelector.length; i++) {
                this.NodeSelector[i] = new Label(source.NodeSelector[i]);
            }
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.AvailableReplicas != null) {
            this.AvailableReplicas = new Long(source.AvailableReplicas);
        }
        if (source.EnableServiceLinks != null) {
            this.EnableServiceLinks = new Boolean(source.EnableServiceLinks);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "WorkflowKind", this.WorkflowKind);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "GridUniqKey", this.GridUniqKey);
        this.setParamArrayObj(map, prefix + "NodeSelector.", this.NodeSelector);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "AvailableReplicas", this.AvailableReplicas);
        this.setParamSimple(map, prefix + "EnableServiceLinks", this.EnableServiceLinks);

    }
}

