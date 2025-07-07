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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBlockIgnoreRuleNewRequest extends AbstractModel {

    /**
    * 非自定义类型规则列表
    */
    @SerializedName("Rules")
    @Expose
    private BanAndAllowRule [] Rules;

    /**
    * RuleType: 1黑名单 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
    * 是否覆盖重复数据，1覆盖，非1不覆盖，跳过重复数据
    */
    @SerializedName("CoverDuplicate")
    @Expose
    private Long CoverDuplicate;

    /**
     * Get 非自定义类型规则列表 
     * @return Rules 非自定义类型规则列表
     */
    public BanAndAllowRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 非自定义类型规则列表
     * @param Rules 非自定义类型规则列表
     */
    public void setRules(BanAndAllowRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get RuleType: 1黑名单 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则 
     * @return RuleType RuleType: 1黑名单 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set RuleType: 1黑名单 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则
     * @param RuleType RuleType: 1黑名单 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 是否覆盖重复数据，1覆盖，非1不覆盖，跳过重复数据 
     * @return CoverDuplicate 是否覆盖重复数据，1覆盖，非1不覆盖，跳过重复数据
     */
    public Long getCoverDuplicate() {
        return this.CoverDuplicate;
    }

    /**
     * Set 是否覆盖重复数据，1覆盖，非1不覆盖，跳过重复数据
     * @param CoverDuplicate 是否覆盖重复数据，1覆盖，非1不覆盖，跳过重复数据
     */
    public void setCoverDuplicate(Long CoverDuplicate) {
        this.CoverDuplicate = CoverDuplicate;
    }

    public CreateBlockIgnoreRuleNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBlockIgnoreRuleNewRequest(CreateBlockIgnoreRuleNewRequest source) {
        if (source.Rules != null) {
            this.Rules = new BanAndAllowRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new BanAndAllowRule(source.Rules[i]);
            }
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
        if (source.CoverDuplicate != null) {
            this.CoverDuplicate = new Long(source.CoverDuplicate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "CoverDuplicate", this.CoverDuplicate);

    }
}

