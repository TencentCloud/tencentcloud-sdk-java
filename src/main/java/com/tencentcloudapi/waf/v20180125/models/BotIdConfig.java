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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotIdConfig extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则开关
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 动作配置
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 规则名称
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 重定向路径
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则开关 
     * @return Status 规则开关
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 规则开关
     * @param Status 规则开关
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 动作配置 
     * @return Action 动作配置
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作配置
     * @param Action 动作配置
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 规则名称 
     * @return BotId 规则名称
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set 规则名称
     * @param BotId 规则名称
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get 重定向路径 
     * @return Redirect 重定向路径
     */
    public String getRedirect() {
        return this.Redirect;
    }

    /**
     * Set 重定向路径
     * @param Redirect 重定向路径
     */
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    public BotIdConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotIdConfig(BotIdConfig source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);

    }
}

