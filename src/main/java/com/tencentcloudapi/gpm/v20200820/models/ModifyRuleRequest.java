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

public class ModifyRuleRequest extends AbstractModel{

    /**
    * 规则code
    */
    @SerializedName("RuleCode")
    @Expose
    private String RuleCode;

    /**
    * 规则名称，只能包含数字、字母、. 和 -
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则描述，最长1024
    */
    @SerializedName("RuleDesc")
    @Expose
    private String RuleDesc;

    /**
    * 标签，key-value结构的数组，最多关联50组标签
    */
    @SerializedName("Tags")
    @Expose
    private StringKV [] Tags;

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

    /**
     * Get 规则名称，只能包含数字、字母、. 和 - 
     * @return RuleName 规则名称，只能包含数字、字母、. 和 -
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称，只能包含数字、字母、. 和 -
     * @param RuleName 规则名称，只能包含数字、字母、. 和 -
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则描述，最长1024 
     * @return RuleDesc 规则描述，最长1024
     */
    public String getRuleDesc() {
        return this.RuleDesc;
    }

    /**
     * Set 规则描述，最长1024
     * @param RuleDesc 规则描述，最长1024
     */
    public void setRuleDesc(String RuleDesc) {
        this.RuleDesc = RuleDesc;
    }

    /**
     * Get 标签，key-value结构的数组，最多关联50组标签 
     * @return Tags 标签，key-value结构的数组，最多关联50组标签
     */
    public StringKV [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签，key-value结构的数组，最多关联50组标签
     * @param Tags 标签，key-value结构的数组，最多关联50组标签
     */
    public void setTags(StringKV [] Tags) {
        this.Tags = Tags;
    }

    public ModifyRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleRequest(ModifyRuleRequest source) {
        if (source.RuleCode != null) {
            this.RuleCode = new String(source.RuleCode);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleDesc != null) {
            this.RuleDesc = new String(source.RuleDesc);
        }
        if (source.Tags != null) {
            this.Tags = new StringKV[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new StringKV(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleCode", this.RuleCode);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleDesc", this.RuleDesc);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

