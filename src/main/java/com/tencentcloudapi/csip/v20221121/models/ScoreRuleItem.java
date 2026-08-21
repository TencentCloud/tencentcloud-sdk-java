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

public class ScoreRuleItem extends AbstractModel {

    /**
    * <p>规则类型<br>枚举值：<br>dimension：维度级规则<br>category：子项级规则<br>severity：等级级规则</p>
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * <p>维度ID</p>
    */
    @SerializedName("DimensionId")
    @Expose
    private String DimensionId;

    /**
    * <p>维度名称</p>
    */
    @SerializedName("DimensionName")
    @Expose
    private String DimensionName;

    /**
    * <p>子项ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>子项扣分规则说明</p>
    */
    @SerializedName("CategoryDesc")
    @Expose
    private String CategoryDesc;

    /**
    * <p>子项名称</p>
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * <p>等级<br>枚举值：<br>critical：严重<br>high：高危<br>medium：中危<br>low：低危</p>
    */
    @SerializedName("Severity")
    @Expose
    private String Severity;

    /**
    * <p>扣分上限</p>
    */
    @SerializedName("MaxDeductScore")
    @Expose
    private Long MaxDeductScore;

    /**
    * <p>单次扣分</p>
    */
    @SerializedName("DeductPerItem")
    @Expose
    private Long DeductPerItem;

    /**
    * <p>单项扣分是否不可编辑（防护配置维度子项为 true）</p>
    */
    @SerializedName("DeductPerItemDisabled")
    @Expose
    private Boolean DeductPerItemDisabled;

    /**
    * <p>排序序号</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private Long SortOrder;

    /**
     * Get <p>规则类型<br>枚举值：<br>dimension：维度级规则<br>category：子项级规则<br>severity：等级级规则</p> 
     * @return RuleType <p>规则类型<br>枚举值：<br>dimension：维度级规则<br>category：子项级规则<br>severity：等级级规则</p>
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set <p>规则类型<br>枚举值：<br>dimension：维度级规则<br>category：子项级规则<br>severity：等级级规则</p>
     * @param RuleType <p>规则类型<br>枚举值：<br>dimension：维度级规则<br>category：子项级规则<br>severity：等级级规则</p>
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get <p>维度ID</p> 
     * @return DimensionId <p>维度ID</p>
     */
    public String getDimensionId() {
        return this.DimensionId;
    }

    /**
     * Set <p>维度ID</p>
     * @param DimensionId <p>维度ID</p>
     */
    public void setDimensionId(String DimensionId) {
        this.DimensionId = DimensionId;
    }

    /**
     * Get <p>维度名称</p> 
     * @return DimensionName <p>维度名称</p>
     */
    public String getDimensionName() {
        return this.DimensionName;
    }

    /**
     * Set <p>维度名称</p>
     * @param DimensionName <p>维度名称</p>
     */
    public void setDimensionName(String DimensionName) {
        this.DimensionName = DimensionName;
    }

    /**
     * Get <p>子项ID</p> 
     * @return CategoryId <p>子项ID</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>子项ID</p>
     * @param CategoryId <p>子项ID</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>子项扣分规则说明</p> 
     * @return CategoryDesc <p>子项扣分规则说明</p>
     */
    public String getCategoryDesc() {
        return this.CategoryDesc;
    }

    /**
     * Set <p>子项扣分规则说明</p>
     * @param CategoryDesc <p>子项扣分规则说明</p>
     */
    public void setCategoryDesc(String CategoryDesc) {
        this.CategoryDesc = CategoryDesc;
    }

    /**
     * Get <p>子项名称</p> 
     * @return CategoryName <p>子项名称</p>
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set <p>子项名称</p>
     * @param CategoryName <p>子项名称</p>
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get <p>等级<br>枚举值：<br>critical：严重<br>high：高危<br>medium：中危<br>low：低危</p> 
     * @return Severity <p>等级<br>枚举值：<br>critical：严重<br>high：高危<br>medium：中危<br>low：低危</p>
     */
    public String getSeverity() {
        return this.Severity;
    }

    /**
     * Set <p>等级<br>枚举值：<br>critical：严重<br>high：高危<br>medium：中危<br>low：低危</p>
     * @param Severity <p>等级<br>枚举值：<br>critical：严重<br>high：高危<br>medium：中危<br>low：低危</p>
     */
    public void setSeverity(String Severity) {
        this.Severity = Severity;
    }

    /**
     * Get <p>扣分上限</p> 
     * @return MaxDeductScore <p>扣分上限</p>
     */
    public Long getMaxDeductScore() {
        return this.MaxDeductScore;
    }

    /**
     * Set <p>扣分上限</p>
     * @param MaxDeductScore <p>扣分上限</p>
     */
    public void setMaxDeductScore(Long MaxDeductScore) {
        this.MaxDeductScore = MaxDeductScore;
    }

    /**
     * Get <p>单次扣分</p> 
     * @return DeductPerItem <p>单次扣分</p>
     */
    public Long getDeductPerItem() {
        return this.DeductPerItem;
    }

    /**
     * Set <p>单次扣分</p>
     * @param DeductPerItem <p>单次扣分</p>
     */
    public void setDeductPerItem(Long DeductPerItem) {
        this.DeductPerItem = DeductPerItem;
    }

    /**
     * Get <p>单项扣分是否不可编辑（防护配置维度子项为 true）</p> 
     * @return DeductPerItemDisabled <p>单项扣分是否不可编辑（防护配置维度子项为 true）</p>
     */
    public Boolean getDeductPerItemDisabled() {
        return this.DeductPerItemDisabled;
    }

    /**
     * Set <p>单项扣分是否不可编辑（防护配置维度子项为 true）</p>
     * @param DeductPerItemDisabled <p>单项扣分是否不可编辑（防护配置维度子项为 true）</p>
     */
    public void setDeductPerItemDisabled(Boolean DeductPerItemDisabled) {
        this.DeductPerItemDisabled = DeductPerItemDisabled;
    }

    /**
     * Get <p>排序序号</p> 
     * @return SortOrder <p>排序序号</p>
     */
    public Long getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>排序序号</p>
     * @param SortOrder <p>排序序号</p>
     */
    public void setSortOrder(Long SortOrder) {
        this.SortOrder = SortOrder;
    }

    public ScoreRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScoreRuleItem(ScoreRuleItem source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.DimensionId != null) {
            this.DimensionId = new String(source.DimensionId);
        }
        if (source.DimensionName != null) {
            this.DimensionName = new String(source.DimensionName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CategoryDesc != null) {
            this.CategoryDesc = new String(source.CategoryDesc);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.Severity != null) {
            this.Severity = new String(source.Severity);
        }
        if (source.MaxDeductScore != null) {
            this.MaxDeductScore = new Long(source.MaxDeductScore);
        }
        if (source.DeductPerItem != null) {
            this.DeductPerItem = new Long(source.DeductPerItem);
        }
        if (source.DeductPerItemDisabled != null) {
            this.DeductPerItemDisabled = new Boolean(source.DeductPerItemDisabled);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new Long(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "DimensionId", this.DimensionId);
        this.setParamSimple(map, prefix + "DimensionName", this.DimensionName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryDesc", this.CategoryDesc);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "Severity", this.Severity);
        this.setParamSimple(map, prefix + "MaxDeductScore", this.MaxDeductScore);
        this.setParamSimple(map, prefix + "DeductPerItem", this.DeductPerItem);
        this.setParamSimple(map, prefix + "DeductPerItemDisabled", this.DeductPerItemDisabled);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

