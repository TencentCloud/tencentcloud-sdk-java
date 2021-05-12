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

public class PrometheusTemplate extends AbstractModel{

    /**
    * 模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板维度，支持以下类型
instance 实例级别
cluster 集群级别
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 模板描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 当Level为instance时有效，
模板中的告警配置列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertRules")
    @Expose
    private PrometheusAlertRule [] AlertRules;

    /**
    * 当Level为instance时有效，
模板中的聚合规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordRules")
    @Expose
    private PrometheusConfigItem [] RecordRules;

    /**
    * 当Level为cluster时有效，
模板中的ServiceMonitor规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceMonitors")
    @Expose
    private PrometheusConfigItem [] ServiceMonitors;

    /**
    * 当Level为cluster时有效，
模板中的PodMonitors规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodMonitors")
    @Expose
    private PrometheusConfigItem [] PodMonitors;

    /**
    * 当Level为cluster时有效，
模板中的RawJobs规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawJobs")
    @Expose
    private PrometheusConfigItem [] RawJobs;

    /**
    * 模板的ID, 用于出参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 最近更新时间，用于出参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 当前版本，用于出参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 是否系统提供的默认模板，用于出参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 当Level为instance时有效，
模板中的告警配置列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlertDetailRules")
    @Expose
    private PrometheusAlertRuleDetail [] AlertDetailRules;

    /**
     * Get 模板名称 
     * @return Name 模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称
     * @param Name 模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板维度，支持以下类型
instance 实例级别
cluster 集群级别 
     * @return Level 模板维度，支持以下类型
instance 实例级别
cluster 集群级别
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 模板维度，支持以下类型
instance 实例级别
cluster 集群级别
     * @param Level 模板维度，支持以下类型
instance 实例级别
cluster 集群级别
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 模板描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Describe 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Describe 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 当Level为instance时有效，
模板中的告警配置列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertRules 当Level为instance时有效，
模板中的告警配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertRule [] getAlertRules() {
        return this.AlertRules;
    }

    /**
     * Set 当Level为instance时有效，
模板中的告警配置列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertRules 当Level为instance时有效，
模板中的告警配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertRules(PrometheusAlertRule [] AlertRules) {
        this.AlertRules = AlertRules;
    }

    /**
     * Get 当Level为instance时有效，
模板中的聚合规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordRules 当Level为instance时有效，
模板中的聚合规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getRecordRules() {
        return this.RecordRules;
    }

    /**
     * Set 当Level为instance时有效，
模板中的聚合规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordRules 当Level为instance时有效，
模板中的聚合规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordRules(PrometheusConfigItem [] RecordRules) {
        this.RecordRules = RecordRules;
    }

    /**
     * Get 当Level为cluster时有效，
模板中的ServiceMonitor规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceMonitors 当Level为cluster时有效，
模板中的ServiceMonitor规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getServiceMonitors() {
        return this.ServiceMonitors;
    }

    /**
     * Set 当Level为cluster时有效，
模板中的ServiceMonitor规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceMonitors 当Level为cluster时有效，
模板中的ServiceMonitor规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceMonitors(PrometheusConfigItem [] ServiceMonitors) {
        this.ServiceMonitors = ServiceMonitors;
    }

    /**
     * Get 当Level为cluster时有效，
模板中的PodMonitors规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodMonitors 当Level为cluster时有效，
模板中的PodMonitors规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getPodMonitors() {
        return this.PodMonitors;
    }

    /**
     * Set 当Level为cluster时有效，
模板中的PodMonitors规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodMonitors 当Level为cluster时有效，
模板中的PodMonitors规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodMonitors(PrometheusConfigItem [] PodMonitors) {
        this.PodMonitors = PodMonitors;
    }

    /**
     * Get 当Level为cluster时有效，
模板中的RawJobs规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawJobs 当Level为cluster时有效，
模板中的RawJobs规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusConfigItem [] getRawJobs() {
        return this.RawJobs;
    }

    /**
     * Set 当Level为cluster时有效，
模板中的RawJobs规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawJobs 当Level为cluster时有效，
模板中的RawJobs规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawJobs(PrometheusConfigItem [] RawJobs) {
        this.RawJobs = RawJobs;
    }

    /**
     * Get 模板的ID, 用于出参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 模板的ID, 用于出参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板的ID, 用于出参
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 模板的ID, 用于出参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 最近更新时间，用于出参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 最近更新时间，用于出参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最近更新时间，用于出参
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 最近更新时间，用于出参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 当前版本，用于出参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 当前版本，用于出参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 当前版本，用于出参
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 当前版本，用于出参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 是否系统提供的默认模板，用于出参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefault 是否系统提供的默认模板，用于出参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否系统提供的默认模板，用于出参
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefault 是否系统提供的默认模板，用于出参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 当Level为instance时有效，
模板中的告警配置列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlertDetailRules 当Level为instance时有效，
模板中的告警配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertRuleDetail [] getAlertDetailRules() {
        return this.AlertDetailRules;
    }

    /**
     * Set 当Level为instance时有效，
模板中的告警配置列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlertDetailRules 当Level为instance时有效，
模板中的告警配置列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlertDetailRules(PrometheusAlertRuleDetail [] AlertDetailRules) {
        this.AlertDetailRules = AlertDetailRules;
    }

    public PrometheusTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusTemplate(PrometheusTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.AlertRules != null) {
            this.AlertRules = new PrometheusAlertRule[source.AlertRules.length];
            for (int i = 0; i < source.AlertRules.length; i++) {
                this.AlertRules[i] = new PrometheusAlertRule(source.AlertRules[i]);
            }
        }
        if (source.RecordRules != null) {
            this.RecordRules = new PrometheusConfigItem[source.RecordRules.length];
            for (int i = 0; i < source.RecordRules.length; i++) {
                this.RecordRules[i] = new PrometheusConfigItem(source.RecordRules[i]);
            }
        }
        if (source.ServiceMonitors != null) {
            this.ServiceMonitors = new PrometheusConfigItem[source.ServiceMonitors.length];
            for (int i = 0; i < source.ServiceMonitors.length; i++) {
                this.ServiceMonitors[i] = new PrometheusConfigItem(source.ServiceMonitors[i]);
            }
        }
        if (source.PodMonitors != null) {
            this.PodMonitors = new PrometheusConfigItem[source.PodMonitors.length];
            for (int i = 0; i < source.PodMonitors.length; i++) {
                this.PodMonitors[i] = new PrometheusConfigItem(source.PodMonitors[i]);
            }
        }
        if (source.RawJobs != null) {
            this.RawJobs = new PrometheusConfigItem[source.RawJobs.length];
            for (int i = 0; i < source.RawJobs.length; i++) {
                this.RawJobs[i] = new PrometheusConfigItem(source.RawJobs[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.AlertDetailRules != null) {
            this.AlertDetailRules = new PrometheusAlertRuleDetail[source.AlertDetailRules.length];
            for (int i = 0; i < source.AlertDetailRules.length; i++) {
                this.AlertDetailRules[i] = new PrometheusAlertRuleDetail(source.AlertDetailRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamArrayObj(map, prefix + "AlertRules.", this.AlertRules);
        this.setParamArrayObj(map, prefix + "RecordRules.", this.RecordRules);
        this.setParamArrayObj(map, prefix + "ServiceMonitors.", this.ServiceMonitors);
        this.setParamArrayObj(map, prefix + "PodMonitors.", this.PodMonitors);
        this.setParamArrayObj(map, prefix + "RawJobs.", this.RawJobs);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamArrayObj(map, prefix + "AlertDetailRules.", this.AlertDetailRules);

    }
}

