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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotJavaScript extends AbstractModel{

    /**
    * on|off
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 规则类型，当前只有file
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 规则值，['html', 'htm']
    */
    @SerializedName("RuleValue")
    @Expose
    private String [] RuleValue;

    /**
    * 执行动作，monitor|intercept|redirect|captcha
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 重定向时设置的重定向页面
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get on|off 
     * @return Switch on|off
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set on|off
     * @param Switch on|off
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 规则类型，当前只有file 
     * @return RuleType 规则类型，当前只有file
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型，当前只有file
     * @param RuleType 规则类型，当前只有file
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 规则值，['html', 'htm'] 
     * @return RuleValue 规则值，['html', 'htm']
     */
    public String [] getRuleValue() {
        return this.RuleValue;
    }

    /**
     * Set 规则值，['html', 'htm']
     * @param RuleValue 规则值，['html', 'htm']
     */
    public void setRuleValue(String [] RuleValue) {
        this.RuleValue = RuleValue;
    }

    /**
     * Get 执行动作，monitor|intercept|redirect|captcha 
     * @return Action 执行动作，monitor|intercept|redirect|captcha
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作，monitor|intercept|redirect|captcha
     * @param Action 执行动作，monitor|intercept|redirect|captcha
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 重定向时设置的重定向页面
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RedirectUrl 重定向时设置的重定向页面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 重定向时设置的重定向页面
注意：此字段可能返回 null，表示取不到有效值。
     * @param RedirectUrl 重定向时设置的重定向页面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public BotJavaScript() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotJavaScript(BotJavaScript source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.RuleValue != null) {
            this.RuleValue = new String[source.RuleValue.length];
            for (int i = 0; i < source.RuleValue.length; i++) {
                this.RuleValue[i] = new String(source.RuleValue[i]);
            }
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamArraySimple(map, prefix + "RuleValue.", this.RuleValue);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

