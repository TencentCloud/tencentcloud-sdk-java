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

public class PrometheusRecordRuleYamlItem extends AbstractModel{

    /**
    * 实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 最近更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Yaml内容
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 如果该聚合规则来至模板，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 该聚合规则如果来源于用户集群crd资源定义，则ClusterId为所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 实例名称 
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 最近更新时间 
     * @return UpdateTime 最近更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近更新时间
     * @param UpdateTime 最近更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Yaml内容 
     * @return TemplateId Yaml内容
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Yaml内容
     * @param TemplateId Yaml内容
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 如果该聚合规则来至模板，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 如果该聚合规则来至模板，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 如果该聚合规则来至模板，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 如果该聚合规则来至模板，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 该聚合规则如果来源于用户集群crd资源定义，则ClusterId为所属集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 该聚合规则如果来源于用户集群crd资源定义，则ClusterId为所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 该聚合规则如果来源于用户集群crd资源定义，则ClusterId为所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 该聚合规则如果来源于用户集群crd资源定义，则ClusterId为所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public PrometheusRecordRuleYamlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusRecordRuleYamlItem(PrometheusRecordRuleYamlItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

