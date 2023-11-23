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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListConfigRulesRequest extends AbstractModel {

    /**
    * 每页限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序类型, 倒序：desc，顺序：asc
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 风险等级
1：高风险。
2：中风险。
3：低风险。
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long [] RiskLevel;

    /**
    * 规则状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 评估结果
    */
    @SerializedName("ComplianceResult")
    @Expose
    private String [] ComplianceResult;

    /**
    * 规则名
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get 每页限制 
     * @return Limit 每页限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页限制
     * @param Limit 每页限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序类型, 倒序：desc，顺序：asc 
     * @return OrderType 排序类型, 倒序：desc，顺序：asc
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型, 倒序：desc，顺序：asc
     * @param OrderType 排序类型, 倒序：desc，顺序：asc
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 风险等级
1：高风险。
2：中风险。
3：低风险。 
     * @return RiskLevel 风险等级
1：高风险。
2：中风险。
3：低风险。
     */
    public Long [] getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
1：高风险。
2：中风险。
3：低风险。
     * @param RiskLevel 风险等级
1：高风险。
2：中风险。
3：低风险。
     */
    public void setRiskLevel(Long [] RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 规则状态 
     * @return State 规则状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 规则状态
     * @param State 规则状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 评估结果 
     * @return ComplianceResult 评估结果
     */
    public String [] getComplianceResult() {
        return this.ComplianceResult;
    }

    /**
     * Set 评估结果
     * @param ComplianceResult 评估结果
     */
    public void setComplianceResult(String [] ComplianceResult) {
        this.ComplianceResult = ComplianceResult;
    }

    /**
     * Get 规则名 
     * @return RuleName 规则名
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名
     * @param RuleName 规则名
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public ListConfigRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListConfigRulesRequest(ListConfigRulesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long[source.RiskLevel.length];
            for (int i = 0; i < source.RiskLevel.length; i++) {
                this.RiskLevel[i] = new Long(source.RiskLevel[i]);
            }
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.ComplianceResult != null) {
            this.ComplianceResult = new String[source.ComplianceResult.length];
            for (int i = 0; i < source.ComplianceResult.length; i++) {
                this.ComplianceResult[i] = new String(source.ComplianceResult[i]);
            }
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "RiskLevel.", this.RiskLevel);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArraySimple(map, prefix + "ComplianceResult.", this.ComplianceResult);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

