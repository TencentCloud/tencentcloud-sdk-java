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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIdentifyRuleDetail extends AbstractModel {

    /**
    * 数据项id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 数据项名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 敏感级别id
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 敏感级别名称
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * 敏感程度
    */
    @SerializedName("LevelScore")
    @Expose
    private Long LevelScore;

    /**
     * Get 数据项id 
     * @return RuleId 数据项id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 数据项id
     * @param RuleId 数据项id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 数据项名称 
     * @return RuleName 数据项名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 数据项名称
     * @param RuleName 数据项名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 敏感级别id 
     * @return LevelId 敏感级别id
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 敏感级别id
     * @param LevelId 敏感级别id
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 敏感级别名称 
     * @return LevelName 敏感级别名称
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set 敏感级别名称
     * @param LevelName 敏感级别名称
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get 敏感程度 
     * @return LevelScore 敏感程度
     */
    public Long getLevelScore() {
        return this.LevelScore;
    }

    /**
     * Set 敏感程度
     * @param LevelScore 敏感程度
     */
    public void setLevelScore(Long LevelScore) {
        this.LevelScore = LevelScore;
    }

    public DspmIdentifyRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIdentifyRuleDetail(DspmIdentifyRuleDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.LevelScore != null) {
            this.LevelScore = new Long(source.LevelScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "LevelScore", this.LevelScore);

    }
}

