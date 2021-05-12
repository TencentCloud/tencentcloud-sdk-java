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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlertRulesRequest extends AbstractModel{

    /**
    * Prometheus 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 返回数量，默认为 20，最大值为 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 规则 ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则状态码，取值如下：
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 报警策略模板分类
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Prometheus 实例 ID 
     * @return InstanceId Prometheus 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Prometheus 实例 ID
     * @param InstanceId Prometheus 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100 
     * @return Limit 返回数量，默认为 20，最大值为 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100
     * @param Limit 返回数量，默认为 20，最大值为 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为 0 
     * @return Offset 偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0
     * @param Offset 偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 规则 ID 
     * @return RuleId 规则 ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则 ID
     * @param RuleId 规则 ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则状态码，取值如下：
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li> 
     * @return RuleState 规则状态码，取值如下：
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set 规则状态码，取值如下：
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
     * @param RuleState 规则状态码，取值如下：
<li>2=RuleEnabled</li>
<li>3=RuleDisabled</li>
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 报警策略模板分类 
     * @return Type 报警策略模板分类
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 报警策略模板分类
     * @param Type 报警策略模板分类
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeAlertRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlertRulesRequest(DescribeAlertRulesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleState != null) {
            this.RuleState = new Long(source.RuleState);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleState", this.RuleState);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

