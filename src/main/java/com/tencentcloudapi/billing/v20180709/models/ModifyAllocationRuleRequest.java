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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAllocationRuleRequest extends AbstractModel {

    /**
    * 所编辑公摊规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 编辑后公摊规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 公摊策略类型，枚举值如下： 1 - 自定义分摊占比 2 - 等比分摊 3 - 按占比分摊
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 编辑后公摊规则表达式
    */
    @SerializedName("RuleDetail")
    @Expose
    private AllocationRuleExpression RuleDetail;

    /**
    * 编辑后公摊比例表达式
    */
    @SerializedName("RatioDetail")
    @Expose
    private AllocationRationExpression [] RatioDetail;

    /**
    * 月份，不传默认当前月
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * Get 所编辑公摊规则ID 
     * @return RuleId 所编辑公摊规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 所编辑公摊规则ID
     * @param RuleId 所编辑公摊规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 编辑后公摊规则名称 
     * @return Name 编辑后公摊规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 编辑后公摊规则名称
     * @param Name 编辑后公摊规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 公摊策略类型，枚举值如下： 1 - 自定义分摊占比 2 - 等比分摊 3 - 按占比分摊 
     * @return Type 公摊策略类型，枚举值如下： 1 - 自定义分摊占比 2 - 等比分摊 3 - 按占比分摊
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 公摊策略类型，枚举值如下： 1 - 自定义分摊占比 2 - 等比分摊 3 - 按占比分摊
     * @param Type 公摊策略类型，枚举值如下： 1 - 自定义分摊占比 2 - 等比分摊 3 - 按占比分摊
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 编辑后公摊规则表达式 
     * @return RuleDetail 编辑后公摊规则表达式
     */
    public AllocationRuleExpression getRuleDetail() {
        return this.RuleDetail;
    }

    /**
     * Set 编辑后公摊规则表达式
     * @param RuleDetail 编辑后公摊规则表达式
     */
    public void setRuleDetail(AllocationRuleExpression RuleDetail) {
        this.RuleDetail = RuleDetail;
    }

    /**
     * Get 编辑后公摊比例表达式 
     * @return RatioDetail 编辑后公摊比例表达式
     */
    public AllocationRationExpression [] getRatioDetail() {
        return this.RatioDetail;
    }

    /**
     * Set 编辑后公摊比例表达式
     * @param RatioDetail 编辑后公摊比例表达式
     */
    public void setRatioDetail(AllocationRationExpression [] RatioDetail) {
        this.RatioDetail = RatioDetail;
    }

    /**
     * Get 月份，不传默认当前月 
     * @return Month 月份，不传默认当前月
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 月份，不传默认当前月
     * @param Month 月份，不传默认当前月
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    public ModifyAllocationRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAllocationRuleRequest(ModifyAllocationRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RuleDetail != null) {
            this.RuleDetail = new AllocationRuleExpression(source.RuleDetail);
        }
        if (source.RatioDetail != null) {
            this.RatioDetail = new AllocationRationExpression[source.RatioDetail.length];
            for (int i = 0; i < source.RatioDetail.length; i++) {
                this.RatioDetail[i] = new AllocationRationExpression(source.RatioDetail[i]);
            }
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "RuleDetail.", this.RuleDetail);
        this.setParamArrayObj(map, prefix + "RatioDetail.", this.RatioDetail);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

