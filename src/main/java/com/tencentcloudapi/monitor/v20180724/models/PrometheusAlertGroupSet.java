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
    * <p>告警分组ID，满足正则表达式<code>alert-[a-z0-9]{8}</code></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>告警分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>腾讯云可观测平台告警模板ID ，返回告警模板转换后的notice ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AMPReceivers")
    @Expose
    private String [] AMPReceivers;

    /**
    * <p>自定义告警模板</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomReceiver")
    @Expose
    private PrometheusAlertCustomReceiver CustomReceiver;

    /**
    * <p>告警通知间隔</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepeatInterval")
    @Expose
    private String RepeatInterval;

    /**
    * <p>若告警分组通过模板创建，则返回模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>分组内告警规则详情</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private PrometheusAlertGroupRuleSet [] Rules;

    /**
    * <p>分组创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>分组更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>最后修改人子账号uin</p>
    */
    @SerializedName("LastModifySubAccountUin")
    @Expose
    private String LastModifySubAccountUin;

    /**
     * Get <p>告警分组ID，满足正则表达式<code>alert-[a-z0-9]{8}</code></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId <p>告警分组ID，满足正则表达式<code>alert-[a-z0-9]{8}</code></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>告警分组ID，满足正则表达式<code>alert-[a-z0-9]{8}</code></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId <p>告警分组ID，满足正则表达式<code>alert-[a-z0-9]{8}</code></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>告警分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName <p>告警分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>告警分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName <p>告警分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>腾讯云可观测平台告警模板ID ，返回告警模板转换后的notice ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AMPReceivers <p>腾讯云可观测平台告警模板ID ，返回告警模板转换后的notice ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAMPReceivers() {
        return this.AMPReceivers;
    }

    /**
     * Set <p>腾讯云可观测平台告警模板ID ，返回告警模板转换后的notice ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AMPReceivers <p>腾讯云可观测平台告警模板ID ，返回告警模板转换后的notice ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAMPReceivers(String [] AMPReceivers) {
        this.AMPReceivers = AMPReceivers;
    }

    /**
     * Get <p>自定义告警模板</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomReceiver <p>自定义告警模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertCustomReceiver getCustomReceiver() {
        return this.CustomReceiver;
    }

    /**
     * Set <p>自定义告警模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomReceiver <p>自定义告警模板</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomReceiver(PrometheusAlertCustomReceiver CustomReceiver) {
        this.CustomReceiver = CustomReceiver;
    }

    /**
     * Get <p>告警通知间隔</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepeatInterval <p>告警通知间隔</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepeatInterval() {
        return this.RepeatInterval;
    }

    /**
     * Set <p>告警通知间隔</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepeatInterval <p>告警通知间隔</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepeatInterval(String RepeatInterval) {
        this.RepeatInterval = RepeatInterval;
    }

    /**
     * Get <p>若告警分组通过模板创建，则返回模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId <p>若告警分组通过模板创建，则返回模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>若告警分组通过模板创建，则返回模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId <p>若告警分组通过模板创建，则返回模板ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>分组内告警规则详情</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules <p>分组内告警规则详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusAlertGroupRuleSet [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>分组内告警规则详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules <p>分组内告警规则详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(PrometheusAlertGroupRuleSet [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>分组创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt <p>分组创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>分组创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt <p>分组创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>分组更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt <p>分组更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>分组更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt <p>分组更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>最后修改人子账号uin</p> 
     * @return LastModifySubAccountUin <p>最后修改人子账号uin</p>
     */
    public String getLastModifySubAccountUin() {
        return this.LastModifySubAccountUin;
    }

    /**
     * Set <p>最后修改人子账号uin</p>
     * @param LastModifySubAccountUin <p>最后修改人子账号uin</p>
     */
    public void setLastModifySubAccountUin(String LastModifySubAccountUin) {
        this.LastModifySubAccountUin = LastModifySubAccountUin;
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
        if (source.LastModifySubAccountUin != null) {
            this.LastModifySubAccountUin = new String(source.LastModifySubAccountUin);
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
        this.setParamSimple(map, prefix + "LastModifySubAccountUin", this.LastModifySubAccountUin);

    }
}

