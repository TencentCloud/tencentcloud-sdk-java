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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGatherRuleRequest extends AbstractModel {

    /**
    * <p>规则所属分账单元ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>归集规则详情</p>
    */
    @SerializedName("RuleList")
    @Expose
    private GatherRuleSummary RuleList;

    /**
    * <p>月份，不传默认当前月</p>
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * Get <p>规则所属分账单元ID</p> 
     * @return Id <p>规则所属分账单元ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>规则所属分账单元ID</p>
     * @param Id <p>规则所属分账单元ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>归集规则详情</p> 
     * @return RuleList <p>归集规则详情</p>
     */
    public GatherRuleSummary getRuleList() {
        return this.RuleList;
    }

    /**
     * Set <p>归集规则详情</p>
     * @param RuleList <p>归集规则详情</p>
     */
    public void setRuleList(GatherRuleSummary RuleList) {
        this.RuleList = RuleList;
    }

    /**
     * Get <p>月份，不传默认当前月</p> 
     * @return Month <p>月份，不传默认当前月</p>
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set <p>月份，不传默认当前月</p>
     * @param Month <p>月份，不传默认当前月</p>
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    public CreateGatherRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGatherRuleRequest(CreateGatherRuleRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.RuleList != null) {
            this.RuleList = new GatherRuleSummary(source.RuleList);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "RuleList.", this.RuleList);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

