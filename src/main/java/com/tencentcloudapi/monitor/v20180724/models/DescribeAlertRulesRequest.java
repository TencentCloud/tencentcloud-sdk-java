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

public class DescribeAlertRulesRequest extends AbstractModel {

    /**
    * <p>Prometheus 实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>返回数量，默认为 20，最大值为 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>规则 ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>规则状态码，取值如下：</p><li>2=RuleEnabled</li><li>3=RuleDisabled</li>
    */
    @SerializedName("RuleState")
    @Expose
    private Long RuleState;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>报警策略模板分类</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>Prometheus 实例 ID</p> 
     * @return InstanceId <p>Prometheus 实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Prometheus 实例 ID</p>
     * @param InstanceId <p>Prometheus 实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>返回数量，默认为 20，最大值为 100</p> 
     * @return Limit <p>返回数量，默认为 20，最大值为 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为 20，最大值为 100</p>
     * @param Limit <p>返回数量，默认为 20，最大值为 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为 0</p> 
     * @return Offset <p>偏移量，默认为 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为 0</p>
     * @param Offset <p>偏移量，默认为 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>规则 ID</p> 
     * @return RuleId <p>规则 ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则 ID</p>
     * @param RuleId <p>规则 ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>规则状态码，取值如下：</p><li>2=RuleEnabled</li><li>3=RuleDisabled</li> 
     * @return RuleState <p>规则状态码，取值如下：</p><li>2=RuleEnabled</li><li>3=RuleDisabled</li>
     */
    public Long getRuleState() {
        return this.RuleState;
    }

    /**
     * Set <p>规则状态码，取值如下：</p><li>2=RuleEnabled</li><li>3=RuleDisabled</li>
     * @param RuleState <p>规则状态码，取值如下：</p><li>2=RuleEnabled</li><li>3=RuleDisabled</li>
     */
    public void setRuleState(Long RuleState) {
        this.RuleState = RuleState;
    }

    /**
     * Get <p>规则名称</p> 
     * @return RuleName <p>规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
     * @param RuleName <p>规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>报警策略模板分类</p> 
     * @return Type <p>报警策略模板分类</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>报警策略模板分类</p>
     * @param Type <p>报警策略模板分类</p>
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

