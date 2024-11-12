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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IgnoreBaselineRule extends AbstractModel {

    /**
    * 基线检测项名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 基线检测项id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 更新时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 修复建议
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * 影响主机数
    */
    @SerializedName("EffectHostCount")
    @Expose
    private Long EffectHostCount;

    /**
     * Get 基线检测项名称 
     * @return RuleName 基线检测项名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 基线检测项名称
     * @param RuleName 基线检测项名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 基线检测项id 
     * @return RuleId 基线检测项id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 基线检测项id
     * @param RuleId 基线检测项id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 更新时间 
     * @return ModifyTime 更新时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间
     * @param ModifyTime 更新时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 修复建议 
     * @return Fix 修复建议
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set 修复建议
     * @param Fix 修复建议
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get 影响主机数 
     * @return EffectHostCount 影响主机数
     */
    public Long getEffectHostCount() {
        return this.EffectHostCount;
    }

    /**
     * Set 影响主机数
     * @param EffectHostCount 影响主机数
     */
    public void setEffectHostCount(Long EffectHostCount) {
        this.EffectHostCount = EffectHostCount;
    }

    public IgnoreBaselineRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IgnoreBaselineRule(IgnoreBaselineRule source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.EffectHostCount != null) {
            this.EffectHostCount = new Long(source.EffectHostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "EffectHostCount", this.EffectHostCount);

    }
}

