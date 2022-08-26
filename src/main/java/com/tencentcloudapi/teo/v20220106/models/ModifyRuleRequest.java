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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRuleRequest extends AbstractModel{

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 规则名称，字符串名称长度 1~255。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则内容。
    */
    @SerializedName("Rules")
    @Expose
    private RuleItem [] Rules;

    /**
    * 规则 ID。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则状态，取值有：
<li> enable: 启用； </li>
<li> disable: 未启用。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 规则名称，字符串名称长度 1~255。 
     * @return RuleName 规则名称，字符串名称长度 1~255。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称，字符串名称长度 1~255。
     * @param RuleName 规则名称，字符串名称长度 1~255。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则内容。 
     * @return Rules 规则内容。
     */
    public RuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set 规则内容。
     * @param Rules 规则内容。
     */
    public void setRules(RuleItem [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 规则 ID。 
     * @return RuleId 规则 ID。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则 ID。
     * @param RuleId 规则 ID。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则状态，取值有：
<li> enable: 启用； </li>
<li> disable: 未启用。</li> 
     * @return Status 规则状态，取值有：
<li> enable: 启用； </li>
<li> disable: 未启用。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态，取值有：
<li> enable: 启用； </li>
<li> disable: 未启用。</li>
     * @param Status 规则状态，取值有：
<li> enable: 启用； </li>
<li> disable: 未启用。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleRequest(ModifyRuleRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Rules != null) {
            this.Rules = new RuleItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RuleItem(source.Rules[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

