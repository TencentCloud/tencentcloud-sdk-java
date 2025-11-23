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

public class ApiSecCustomEventRule extends AbstractModel {

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 开关，1：开，0:关
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * api匹配列表
    */
    @SerializedName("ApiNameOp")
    @Expose
    private ApiNameOp [] ApiNameOp;

    /**
    * 事件详情
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 时间戳，出参有该值，入参不需要传没有
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 匹配规则列表
    */
    @SerializedName("MatchRuleList")
    @Expose
    private ApiSecSceneRuleEntry [] MatchRuleList;

    /**
    * 统计规则列表
    */
    @SerializedName("StatRuleList")
    @Expose
    private ApiSecSceneRuleEntry [] StatRuleList;

    /**
    * 访问频次，第一个字段表示次数，第二个字段表示分钟
    */
    @SerializedName("ReqFrequency")
    @Expose
    private Long [] ReqFrequency;

    /**
    * 风险等级，取值为100,200,300，分别表示低位、中危、高危
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 规则来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

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
     * Get 开关，1：开，0:关 
     * @return Status 开关，1：开，0:关
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关，1：开，0:关
     * @param Status 开关，1：开，0:关
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get api匹配列表 
     * @return ApiNameOp api匹配列表
     */
    public ApiNameOp [] getApiNameOp() {
        return this.ApiNameOp;
    }

    /**
     * Set api匹配列表
     * @param ApiNameOp api匹配列表
     */
    public void setApiNameOp(ApiNameOp [] ApiNameOp) {
        this.ApiNameOp = ApiNameOp;
    }

    /**
     * Get 事件详情 
     * @return Description 事件详情
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件详情
     * @param Description 事件详情
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 时间戳，出参有该值，入参不需要传没有 
     * @return UpdateTime 时间戳，出参有该值，入参不需要传没有
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 时间戳，出参有该值，入参不需要传没有
     * @param UpdateTime 时间戳，出参有该值，入参不需要传没有
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 匹配规则列表 
     * @return MatchRuleList 匹配规则列表
     */
    public ApiSecSceneRuleEntry [] getMatchRuleList() {
        return this.MatchRuleList;
    }

    /**
     * Set 匹配规则列表
     * @param MatchRuleList 匹配规则列表
     */
    public void setMatchRuleList(ApiSecSceneRuleEntry [] MatchRuleList) {
        this.MatchRuleList = MatchRuleList;
    }

    /**
     * Get 统计规则列表 
     * @return StatRuleList 统计规则列表
     */
    public ApiSecSceneRuleEntry [] getStatRuleList() {
        return this.StatRuleList;
    }

    /**
     * Set 统计规则列表
     * @param StatRuleList 统计规则列表
     */
    public void setStatRuleList(ApiSecSceneRuleEntry [] StatRuleList) {
        this.StatRuleList = StatRuleList;
    }

    /**
     * Get 访问频次，第一个字段表示次数，第二个字段表示分钟 
     * @return ReqFrequency 访问频次，第一个字段表示次数，第二个字段表示分钟
     */
    public Long [] getReqFrequency() {
        return this.ReqFrequency;
    }

    /**
     * Set 访问频次，第一个字段表示次数，第二个字段表示分钟
     * @param ReqFrequency 访问频次，第一个字段表示次数，第二个字段表示分钟
     */
    public void setReqFrequency(Long [] ReqFrequency) {
        this.ReqFrequency = ReqFrequency;
    }

    /**
     * Get 风险等级，取值为100,200,300，分别表示低位、中危、高危 
     * @return RiskLevel 风险等级，取值为100,200,300，分别表示低位、中危、高危
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级，取值为100,200,300，分别表示低位、中危、高危
     * @param RiskLevel 风险等级，取值为100,200,300，分别表示低位、中危、高危
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 规则来源 
     * @return Source 规则来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 规则来源
     * @param Source 规则来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public ApiSecCustomEventRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiSecCustomEventRule(ApiSecCustomEventRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ApiNameOp != null) {
            this.ApiNameOp = new ApiNameOp[source.ApiNameOp.length];
            for (int i = 0; i < source.ApiNameOp.length; i++) {
                this.ApiNameOp[i] = new ApiNameOp(source.ApiNameOp[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.MatchRuleList != null) {
            this.MatchRuleList = new ApiSecSceneRuleEntry[source.MatchRuleList.length];
            for (int i = 0; i < source.MatchRuleList.length; i++) {
                this.MatchRuleList[i] = new ApiSecSceneRuleEntry(source.MatchRuleList[i]);
            }
        }
        if (source.StatRuleList != null) {
            this.StatRuleList = new ApiSecSceneRuleEntry[source.StatRuleList.length];
            for (int i = 0; i < source.StatRuleList.length; i++) {
                this.StatRuleList[i] = new ApiSecSceneRuleEntry(source.StatRuleList[i]);
            }
        }
        if (source.ReqFrequency != null) {
            this.ReqFrequency = new Long[source.ReqFrequency.length];
            for (int i = 0; i < source.ReqFrequency.length; i++) {
                this.ReqFrequency[i] = new Long(source.ReqFrequency[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ApiNameOp.", this.ApiNameOp);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "MatchRuleList.", this.MatchRuleList);
        this.setParamArrayObj(map, prefix + "StatRuleList.", this.StatRuleList);
        this.setParamArraySimple(map, prefix + "ReqFrequency.", this.ReqFrequency);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

