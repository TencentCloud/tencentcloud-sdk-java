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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryComplianceGroupRuleInfo extends AbstractModel {

    /**
    * 敏感数据识别规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 敏感数据识别规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 敏感数据分类ID
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 敏感数据分级ID, 目前只支持高、中、低三级
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
     * Get 敏感数据识别规则ID 
     * @return RuleId 敏感数据识别规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 敏感数据识别规则ID
     * @param RuleId 敏感数据识别规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 敏感数据识别规则名称 
     * @return RuleName 敏感数据识别规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 敏感数据识别规则名称
     * @param RuleName 敏感数据识别规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 敏感数据分类ID 
     * @return CategoryId 敏感数据分类ID
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 敏感数据分类ID
     * @param CategoryId 敏感数据分类ID
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 敏感数据分级ID, 目前只支持高、中、低三级 
     * @return LevelId 敏感数据分级ID, 目前只支持高、中、低三级
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 敏感数据分级ID, 目前只支持高、中、低三级
     * @param LevelId 敏感数据分级ID, 目前只支持高、中、低三级
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    public DspaDiscoveryComplianceGroupRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryComplianceGroupRuleInfo(DspaDiscoveryComplianceGroupRuleInfo source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);

    }
}

