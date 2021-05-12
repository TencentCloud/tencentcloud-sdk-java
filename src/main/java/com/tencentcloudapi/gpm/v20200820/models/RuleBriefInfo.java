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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleBriefInfo extends AbstractModel{

    /**
    * 规则名称 [a-zA-Z\d-\.]*
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 关联匹配
    */
    @SerializedName("MatchCodeList")
    @Expose
    private StringKV [] MatchCodeList;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 规则code
    */
    @SerializedName("RuleCode")
    @Expose
    private String RuleCode;

    /**
     * Get 规则名称 [a-zA-Z\d-\.]* 
     * @return RuleName 规则名称 [a-zA-Z\d-\.]*
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称 [a-zA-Z\d-\.]*
     * @param RuleName 规则名称 [a-zA-Z\d-\.]*
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 关联匹配 
     * @return MatchCodeList 关联匹配
     */
    public StringKV [] getMatchCodeList() {
        return this.MatchCodeList;
    }

    /**
     * Set 关联匹配
     * @param MatchCodeList 关联匹配
     */
    public void setMatchCodeList(StringKV [] MatchCodeList) {
        this.MatchCodeList = MatchCodeList;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 规则code 
     * @return RuleCode 规则code
     */
    public String getRuleCode() {
        return this.RuleCode;
    }

    /**
     * Set 规则code
     * @param RuleCode 规则code
     */
    public void setRuleCode(String RuleCode) {
        this.RuleCode = RuleCode;
    }

    public RuleBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleBriefInfo(RuleBriefInfo source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.MatchCodeList != null) {
            this.MatchCodeList = new StringKV[source.MatchCodeList.length];
            for (int i = 0; i < source.MatchCodeList.length; i++) {
                this.MatchCodeList[i] = new StringKV(source.MatchCodeList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RuleCode != null) {
            this.RuleCode = new String(source.RuleCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "MatchCodeList.", this.MatchCodeList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RuleCode", this.RuleCode);

    }
}

