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

public class RuleSettingDetail extends AbstractModel{

    /**
    * 规则ID。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则名称，名称字符串长度 1~255。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则状态，取值有:
<li> enable: 启用； </li>
<li> disable: 未启用。 </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规则内容。
    */
    @SerializedName("Rules")
    @Expose
    private RuleItem [] Rules;

    /**
    * 规则优先级, 值越大优先级越高，最小为 1。
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
     * Get 规则ID。 
     * @return RuleId 规则ID。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID。
     * @param RuleId 规则ID。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称，名称字符串长度 1~255。 
     * @return RuleName 规则名称，名称字符串长度 1~255。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称，名称字符串长度 1~255。
     * @param RuleName 规则名称，名称字符串长度 1~255。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则状态，取值有:
<li> enable: 启用； </li>
<li> disable: 未启用。 </li> 
     * @return Status 规则状态，取值有:
<li> enable: 启用； </li>
<li> disable: 未启用。 </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态，取值有:
<li> enable: 启用； </li>
<li> disable: 未启用。 </li>
     * @param Status 规则状态，取值有:
<li> enable: 启用； </li>
<li> disable: 未启用。 </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get 规则优先级, 值越大优先级越高，最小为 1。 
     * @return RulePriority 规则优先级, 值越大优先级越高，最小为 1。
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set 规则优先级, 值越大优先级越高，最小为 1。
     * @param RulePriority 规则优先级, 值越大优先级越高，最小为 1。
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    public RuleSettingDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleSettingDetail(RuleSettingDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Rules != null) {
            this.Rules = new RuleItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RuleItem(source.Rules[i]);
            }
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);

    }
}

