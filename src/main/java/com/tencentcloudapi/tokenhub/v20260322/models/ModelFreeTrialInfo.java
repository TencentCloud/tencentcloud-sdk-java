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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelFreeTrialInfo extends AbstractModel {

    /**
    * 推荐顺序，值越小排序越靠前。为空表示使用模型默认权重。
    */
    @SerializedName("RecommendWeight")
    @Expose
    private Long RecommendWeight;

    /**
    * 体验包容量大小。
    */
    @SerializedName("CapacitySize")
    @Expose
    private Long CapacitySize;

    /**
    * 容量单位。取值：token。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 有效期天数（如90天）。为空表示不限期。
    */
    @SerializedName("ValidityDays")
    @Expose
    private Long ValidityDays;

    /**
     * Get 推荐顺序，值越小排序越靠前。为空表示使用模型默认权重。 
     * @return RecommendWeight 推荐顺序，值越小排序越靠前。为空表示使用模型默认权重。
     */
    public Long getRecommendWeight() {
        return this.RecommendWeight;
    }

    /**
     * Set 推荐顺序，值越小排序越靠前。为空表示使用模型默认权重。
     * @param RecommendWeight 推荐顺序，值越小排序越靠前。为空表示使用模型默认权重。
     */
    public void setRecommendWeight(Long RecommendWeight) {
        this.RecommendWeight = RecommendWeight;
    }

    /**
     * Get 体验包容量大小。 
     * @return CapacitySize 体验包容量大小。
     */
    public Long getCapacitySize() {
        return this.CapacitySize;
    }

    /**
     * Set 体验包容量大小。
     * @param CapacitySize 体验包容量大小。
     */
    public void setCapacitySize(Long CapacitySize) {
        this.CapacitySize = CapacitySize;
    }

    /**
     * Get 容量单位。取值：token。 
     * @return Unit 容量单位。取值：token。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 容量单位。取值：token。
     * @param Unit 容量单位。取值：token。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 有效期天数（如90天）。为空表示不限期。 
     * @return ValidityDays 有效期天数（如90天）。为空表示不限期。
     */
    public Long getValidityDays() {
        return this.ValidityDays;
    }

    /**
     * Set 有效期天数（如90天）。为空表示不限期。
     * @param ValidityDays 有效期天数（如90天）。为空表示不限期。
     */
    public void setValidityDays(Long ValidityDays) {
        this.ValidityDays = ValidityDays;
    }

    public ModelFreeTrialInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelFreeTrialInfo(ModelFreeTrialInfo source) {
        if (source.RecommendWeight != null) {
            this.RecommendWeight = new Long(source.RecommendWeight);
        }
        if (source.CapacitySize != null) {
            this.CapacitySize = new Long(source.CapacitySize);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.ValidityDays != null) {
            this.ValidityDays = new Long(source.ValidityDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecommendWeight", this.RecommendWeight);
        this.setParamSimple(map, prefix + "CapacitySize", this.CapacitySize);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "ValidityDays", this.ValidityDays);

    }
}

