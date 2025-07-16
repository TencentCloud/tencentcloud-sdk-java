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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusAlertGroupSet extends AbstractModel {

    /**
    * 告警分组ID，满足正则表达式`alert-[a-z0-9]{8}`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 告警分组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 腾讯云可观测平台告警模板ID ，返回告警模板转换后的notice ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AMPReceivers")
    @Expose
    private String [] AMPReceivers;

    /**
    * 自定义告警模板
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomReceiver")
    @Expose
    private PrometheusAlertCustomReceiver CustomReceiver;

    /**
    * 告警通知间隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepeatInterval")
    @Expose
    private String RepeatInterval;

    /**
    * 若告警分组通过模板创建，则返回模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 分组内告警规则详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private PrometheusAlertGroupRuleSet [] Rules;

    /**
    * 分组创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 分组更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get 告警分组ID，满足正则表达式`alert-[a-z0-9]{8}`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 告警分组ID，满足正则表达式`alert-[a-z0-9]{8}`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 告警分组ID，满足正则表达式`alert-[a-z0-9]{8}`
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 告警分组ID，满足正则表达式`alert-[a-z0-9]{8}`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 告警分组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 告警分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 告警分组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 告警分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 腾讯云可观测平台告警模板ID ，返回告警模板转换后的notice ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AMPReceivers 腾讯云可观测平台告警模板ID ，返回告警模板转换后的notice ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAMPReceivers() {
        return this.AMPReceivers;
    }

    /**
     * Set 腾讯云可观测平台告警模板ID ，返回告警模板转换后的notice ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AMPReceivers 腾讯云可观测平台告警模板ID ，返回告警模板转换后的notice ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAMPReceivers(String [] AMPReceivers) {
        this.AMPReceivers = AMPReceivers;
    }

    /**
     * Get 自定义告警模板
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomReceiver 自定义告警模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertCustomReceiver getCustomReceiver() {
        return this.CustomReceiver;
    }

    /**
     * Set 自定义告警模板
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomReceiver 自定义告警模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomReceiver(PrometheusAlertCustomReceiver CustomReceiver) {
        this.CustomReceiver = CustomReceiver;
    }

    /**
     * Get 告警通知间隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepeatInterval 告警通知间隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepeatInterval() {
        return this.RepeatInterval;
    }

    /**
     * Set 告警通知间隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepeatInterval 告警通知间隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepeatInterval(String RepeatInterval) {
        this.RepeatInterval = RepeatInterval;
    }

    /**
     * Get 若告警分组通过模板创建，则返回模板ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 若告警分组通过模板创建，则返回模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 若告警分组通过模板创建，则返回模板ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 若告警分组通过模板创建，则返回模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 分组内告警规则详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules 分组内告警规则详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertGroupRuleSet [] getRules() {
        return this.Rules;
    }

    /**
     * Set 分组内告警规则详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 分组内告警规则详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(PrometheusAlertGroupRuleSet [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 分组创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 分组创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 分组创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 分组创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 分组更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 分组更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 分组更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 分组更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public PrometheusAlertGroupSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusAlertGroupSet(PrometheusAlertGroupSet source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.AMPReceivers != null) {
            this.AMPReceivers = new String[source.AMPReceivers.length];
            for (int i = 0; i < source.AMPReceivers.length; i++) {
                this.AMPReceivers[i] = new String(source.AMPReceivers[i]);
            }
        }
        if (source.CustomReceiver != null) {
            this.CustomReceiver = new PrometheusAlertCustomReceiver(source.CustomReceiver);
        }
        if (source.RepeatInterval != null) {
            this.RepeatInterval = new String(source.RepeatInterval);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Rules != null) {
            this.Rules = new PrometheusAlertGroupRuleSet[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PrometheusAlertGroupRuleSet(source.Rules[i]);
            }
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArraySimple(map, prefix + "AMPReceivers.", this.AMPReceivers);
        this.setParamObj(map, prefix + "CustomReceiver.", this.CustomReceiver);
        this.setParamSimple(map, prefix + "RepeatInterval", this.RepeatInterval);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

