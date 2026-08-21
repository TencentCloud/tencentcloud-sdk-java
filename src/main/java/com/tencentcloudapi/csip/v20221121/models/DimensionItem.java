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

public class DimensionItem extends AbstractModel {

    /**
    * 维度ID
枚举值：
risk_governance：风险治理
threat_detection：威胁检测
protection_config：防护配置
    */
    @SerializedName("DimensionId")
    @Expose
    private String DimensionId;

    /**
    * 维度名称
    */
    @SerializedName("DimensionName")
    @Expose
    private String DimensionName;

    /**
    * 维度扣分上限
    */
    @SerializedName("MaxDeductScore")
    @Expose
    private Long MaxDeductScore;

    /**
    * 维度实际扣分
    */
    @SerializedName("DeductScore")
    @Expose
    private Long DeductScore;

    /**
    * 子项列表
    */
    @SerializedName("Categories")
    @Expose
    private CategoryItem [] Categories;

    /**
     * Get 维度ID
枚举值：
risk_governance：风险治理
threat_detection：威胁检测
protection_config：防护配置 
     * @return DimensionId 维度ID
枚举值：
risk_governance：风险治理
threat_detection：威胁检测
protection_config：防护配置
     */
    public String getDimensionId() {
        return this.DimensionId;
    }

    /**
     * Set 维度ID
枚举值：
risk_governance：风险治理
threat_detection：威胁检测
protection_config：防护配置
     * @param DimensionId 维度ID
枚举值：
risk_governance：风险治理
threat_detection：威胁检测
protection_config：防护配置
     */
    public void setDimensionId(String DimensionId) {
        this.DimensionId = DimensionId;
    }

    /**
     * Get 维度名称 
     * @return DimensionName 维度名称
     */
    public String getDimensionName() {
        return this.DimensionName;
    }

    /**
     * Set 维度名称
     * @param DimensionName 维度名称
     */
    public void setDimensionName(String DimensionName) {
        this.DimensionName = DimensionName;
    }

    /**
     * Get 维度扣分上限 
     * @return MaxDeductScore 维度扣分上限
     */
    public Long getMaxDeductScore() {
        return this.MaxDeductScore;
    }

    /**
     * Set 维度扣分上限
     * @param MaxDeductScore 维度扣分上限
     */
    public void setMaxDeductScore(Long MaxDeductScore) {
        this.MaxDeductScore = MaxDeductScore;
    }

    /**
     * Get 维度实际扣分 
     * @return DeductScore 维度实际扣分
     */
    public Long getDeductScore() {
        return this.DeductScore;
    }

    /**
     * Set 维度实际扣分
     * @param DeductScore 维度实际扣分
     */
    public void setDeductScore(Long DeductScore) {
        this.DeductScore = DeductScore;
    }

    /**
     * Get 子项列表 
     * @return Categories 子项列表
     */
    public CategoryItem [] getCategories() {
        return this.Categories;
    }

    /**
     * Set 子项列表
     * @param Categories 子项列表
     */
    public void setCategories(CategoryItem [] Categories) {
        this.Categories = Categories;
    }

    public DimensionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DimensionItem(DimensionItem source) {
        if (source.DimensionId != null) {
            this.DimensionId = new String(source.DimensionId);
        }
        if (source.DimensionName != null) {
            this.DimensionName = new String(source.DimensionName);
        }
        if (source.MaxDeductScore != null) {
            this.MaxDeductScore = new Long(source.MaxDeductScore);
        }
        if (source.DeductScore != null) {
            this.DeductScore = new Long(source.DeductScore);
        }
        if (source.Categories != null) {
            this.Categories = new CategoryItem[source.Categories.length];
            for (int i = 0; i < source.Categories.length; i++) {
                this.Categories[i] = new CategoryItem(source.Categories[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DimensionId", this.DimensionId);
        this.setParamSimple(map, prefix + "DimensionName", this.DimensionName);
        this.setParamSimple(map, prefix + "MaxDeductScore", this.MaxDeductScore);
        this.setParamSimple(map, prefix + "DeductScore", this.DeductScore);
        this.setParamArrayObj(map, prefix + "Categories.", this.Categories);

    }
}

