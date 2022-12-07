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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleGroupSubscribe extends AbstractModel{

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
    private SubscribeReceiver [] Receivers;

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
    private SubscribeWebHook [] WebHooks;

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
    public SubscribeReceiver [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 订阅接收人列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Receivers 订阅接收人列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceivers(SubscribeReceiver [] Receivers) {
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
    public SubscribeWebHook [] getWebHooks() {
        return this.WebHooks;
    }

    /**
     * Set 群机器人配置的webhook信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebHooks 群机器人配置的webhook信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebHooks(SubscribeWebHook [] WebHooks) {
        this.WebHooks = WebHooks;
    }

    public RuleGroupSubscribe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupSubscribe(RuleGroupSubscribe source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.Receivers != null) {
            this.Receivers = new SubscribeReceiver[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new SubscribeReceiver(source.Receivers[i]);
            }
        }
        if (source.SubscribeType != null) {
            this.SubscribeType = new Long[source.SubscribeType.length];
            for (int i = 0; i < source.SubscribeType.length; i++) {
                this.SubscribeType[i] = new Long(source.SubscribeType[i]);
            }
        }
        if (source.WebHooks != null) {
            this.WebHooks = new SubscribeWebHook[source.WebHooks.length];
            for (int i = 0; i < source.WebHooks.length; i++) {
                this.WebHooks[i] = new SubscribeWebHook(source.WebHooks[i]);
            }
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

    }
}

