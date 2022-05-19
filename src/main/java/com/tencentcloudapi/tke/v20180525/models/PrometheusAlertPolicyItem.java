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

public class PrometheusAlertPolicyItem extends AbstractModel{

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则列表
    */
    @SerializedName("Rules")
    @Expose
    private PrometheusAlertRule [] Rules;

    /**
    * 告警策略 id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 如果该告警来自模板下发，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 告警渠道，模板中使用可能返回null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Notification")
    @Expose
    private PrometheusNotificationItem Notification;

    /**
    * 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 如果告警策略来源于用户集群CRD资源定义，则ClusterId为所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 策略名称 
     * @return Name 策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名称
     * @param Name 策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则列表 
     * @return Rules 规则列表
     */
    public PrometheusAlertRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则列表
     * @param Rules 规则列表
     */
    public void setRules(PrometheusAlertRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 告警策略 id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 告警策略 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 告警策略 id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 告警策略 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 如果该告警来自模板下发，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 如果该告警来自模板下发，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 如果该告警来自模板下发，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 如果该告警来自模板下发，则TemplateId为模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 告警渠道，模板中使用可能返回null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Notification 告警渠道，模板中使用可能返回null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusNotificationItem getNotification() {
        return this.Notification;
    }

    /**
     * Set 告警渠道，模板中使用可能返回null
注意：此字段可能返回 null，表示取不到有效值。
     * @param Notification 告警渠道，模板中使用可能返回null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotification(PrometheusNotificationItem Notification) {
        this.Notification = Notification;
    }

    /**
     * Get 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 如果告警策略来源于用户集群CRD资源定义，则ClusterId为所属集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 如果告警策略来源于用户集群CRD资源定义，则ClusterId为所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 如果告警策略来源于用户集群CRD资源定义，则ClusterId为所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 如果告警策略来源于用户集群CRD资源定义，则ClusterId为所属集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public PrometheusAlertPolicyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertPolicyItem(PrometheusAlertPolicyItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rules != null) {
            this.Rules = new PrometheusAlertRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PrometheusAlertRule(source.Rules[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Notification != null) {
            this.Notification = new PrometheusNotificationItem(source.Notification);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
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
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamObj(map, prefix + "Notification.", this.Notification);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

