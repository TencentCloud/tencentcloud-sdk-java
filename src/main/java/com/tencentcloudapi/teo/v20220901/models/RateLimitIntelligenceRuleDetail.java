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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitIntelligenceRuleDetail extends AbstractModel{

    /**
    * 智能识别到的客户端IP。
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
    * 应用的动作。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 更新时间。
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * 失效时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 规则id。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 处置状态，allowed即已经人为放行。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 智能识别到的客户端IP。 
     * @return MatchContent 智能识别到的客户端IP。
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set 智能识别到的客户端IP。
     * @param MatchContent 智能识别到的客户端IP。
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
    }

    /**
     * Get 应用的动作。 
     * @return Action 应用的动作。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 应用的动作。
     * @param Action 应用的动作。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 更新时间。 
     * @return EffectiveTime 更新时间。
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set 更新时间。
     * @param EffectiveTime 更新时间。
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get 失效时间。 
     * @return ExpireTime 失效时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 失效时间。
     * @param ExpireTime 失效时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 规则id。 
     * @return RuleId 规则id。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id。
     * @param RuleId 规则id。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 处置状态，allowed即已经人为放行。 
     * @return Status 处置状态，allowed即已经人为放行。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 处置状态，allowed即已经人为放行。
     * @param Status 处置状态，allowed即已经人为放行。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public RateLimitIntelligenceRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitIntelligenceRuleDetail(RateLimitIntelligenceRuleDetail source) {
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

