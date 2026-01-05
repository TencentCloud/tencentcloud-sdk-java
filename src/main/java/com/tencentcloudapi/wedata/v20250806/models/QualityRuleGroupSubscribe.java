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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityRuleGroupSubscribe extends AbstractModel {

    /**
    * 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 订阅接收人列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Receivers")
    @Expose
    private QualitySubscribeReceiver [] Receivers;

    /**
    * 订阅方式 1.邮件email  2.短信sms
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscribeType")
    @Expose
    private Long [] SubscribeType;

    /**
    * 群机器人配置的webhook信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebHooks")
    @Expose
    private QualitySubscribeWebHook [] WebHooks;

    /**
    * 规则Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 发送对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmMessageRule")
    @Expose
    private String AlarmMessageRule;

    /**
     * Get 规则组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupId 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupId 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 订阅接收人列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Receivers 订阅接收人列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualitySubscribeReceiver [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 订阅接收人列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Receivers 订阅接收人列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceivers(QualitySubscribeReceiver [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 订阅方式 1.邮件email  2.短信sms
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscribeType 订阅方式 1.邮件email  2.短信sms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getSubscribeType() {
        return this.SubscribeType;
    }

    /**
     * Set 订阅方式 1.邮件email  2.短信sms
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscribeType 订阅方式 1.邮件email  2.短信sms
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscribeType(Long [] SubscribeType) {
        this.SubscribeType = SubscribeType;
    }

    /**
     * Get 群机器人配置的webhook信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebHooks 群机器人配置的webhook信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualitySubscribeWebHook [] getWebHooks() {
        return this.WebHooks;
    }

    /**
     * Set 群机器人配置的webhook信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebHooks 群机器人配置的webhook信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebHooks(QualitySubscribeWebHook [] WebHooks) {
        this.WebHooks = WebHooks;
    }

    /**
     * Get 规则Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 发送对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmMessageRule 发送对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmMessageRule() {
        return this.AlarmMessageRule;
    }

    /**
     * Set 发送对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmMessageRule 发送对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmMessageRule(String AlarmMessageRule) {
        this.AlarmMessageRule = AlarmMessageRule;
    }

    public QualityRuleGroupSubscribe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityRuleGroupSubscribe(QualityRuleGroupSubscribe source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.Receivers != null) {
            this.Receivers = new QualitySubscribeReceiver[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new QualitySubscribeReceiver(source.Receivers[i]);
            }
        }
        if (source.SubscribeType != null) {
            this.SubscribeType = new Long[source.SubscribeType.length];
            for (int i = 0; i < source.SubscribeType.length; i++) {
                this.SubscribeType[i] = new Long(source.SubscribeType[i]);
            }
        }
        if (source.WebHooks != null) {
            this.WebHooks = new QualitySubscribeWebHook[source.WebHooks.length];
            for (int i = 0; i < source.WebHooks.length; i++) {
                this.WebHooks[i] = new QualitySubscribeWebHook(source.WebHooks[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.AlarmMessageRule != null) {
            this.AlarmMessageRule = new String(source.AlarmMessageRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamArrayObj(map, prefix + "Receivers.", this.Receivers);
        this.setParamArraySimple(map, prefix + "SubscribeType.", this.SubscribeType);
        this.setParamArrayObj(map, prefix + "WebHooks.", this.WebHooks);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "AlarmMessageRule", this.AlarmMessageRule);

    }
}

