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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvocationIndicator extends AbstractModel{

    /**
    * 总请求数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationQuantity")
    @Expose
    private Long InvocationQuantity;

    /**
    * 请求成功率，百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationSuccessRate")
    @Expose
    private Float InvocationSuccessRate;

    /**
    * 请求平均耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationAvgDuration")
    @Expose
    private Float InvocationAvgDuration;

    /**
    * 成功请求数时间分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationSuccessDistribution")
    @Expose
    private IndicatorCoord [] InvocationSuccessDistribution;

    /**
    * 失败请求数时间分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationFailedDistribution")
    @Expose
    private IndicatorCoord [] InvocationFailedDistribution;

    /**
    * 状态码分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationStatusDistribution")
    @Expose
    private IndicatorCoord [] InvocationStatusDistribution;

    /**
    * 时延分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationDurationDistribution")
    @Expose
    private IndicatorCoord [] InvocationDurationDistribution;

    /**
    * 并发请求次数时间分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationQuantityDistribution")
    @Expose
    private IndicatorCoord [] InvocationQuantityDistribution;

    /**
     * Get 总请求数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationQuantity 总请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInvocationQuantity() {
        return this.InvocationQuantity;
    }

    /**
     * Set 总请求数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationQuantity 总请求数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationQuantity(Long InvocationQuantity) {
        this.InvocationQuantity = InvocationQuantity;
    }

    /**
     * Get 请求成功率，百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationSuccessRate 请求成功率，百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInvocationSuccessRate() {
        return this.InvocationSuccessRate;
    }

    /**
     * Set 请求成功率，百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationSuccessRate 请求成功率，百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationSuccessRate(Float InvocationSuccessRate) {
        this.InvocationSuccessRate = InvocationSuccessRate;
    }

    /**
     * Get 请求平均耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationAvgDuration 请求平均耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInvocationAvgDuration() {
        return this.InvocationAvgDuration;
    }

    /**
     * Set 请求平均耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationAvgDuration 请求平均耗时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationAvgDuration(Float InvocationAvgDuration) {
        this.InvocationAvgDuration = InvocationAvgDuration;
    }

    /**
     * Get 成功请求数时间分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationSuccessDistribution 成功请求数时间分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorCoord [] getInvocationSuccessDistribution() {
        return this.InvocationSuccessDistribution;
    }

    /**
     * Set 成功请求数时间分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationSuccessDistribution 成功请求数时间分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationSuccessDistribution(IndicatorCoord [] InvocationSuccessDistribution) {
        this.InvocationSuccessDistribution = InvocationSuccessDistribution;
    }

    /**
     * Get 失败请求数时间分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationFailedDistribution 失败请求数时间分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorCoord [] getInvocationFailedDistribution() {
        return this.InvocationFailedDistribution;
    }

    /**
     * Set 失败请求数时间分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationFailedDistribution 失败请求数时间分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationFailedDistribution(IndicatorCoord [] InvocationFailedDistribution) {
        this.InvocationFailedDistribution = InvocationFailedDistribution;
    }

    /**
     * Get 状态码分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationStatusDistribution 状态码分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorCoord [] getInvocationStatusDistribution() {
        return this.InvocationStatusDistribution;
    }

    /**
     * Set 状态码分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationStatusDistribution 状态码分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationStatusDistribution(IndicatorCoord [] InvocationStatusDistribution) {
        this.InvocationStatusDistribution = InvocationStatusDistribution;
    }

    /**
     * Get 时延分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationDurationDistribution 时延分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorCoord [] getInvocationDurationDistribution() {
        return this.InvocationDurationDistribution;
    }

    /**
     * Set 时延分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationDurationDistribution 时延分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationDurationDistribution(IndicatorCoord [] InvocationDurationDistribution) {
        this.InvocationDurationDistribution = InvocationDurationDistribution;
    }

    /**
     * Get 并发请求次数时间分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationQuantityDistribution 并发请求次数时间分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorCoord [] getInvocationQuantityDistribution() {
        return this.InvocationQuantityDistribution;
    }

    /**
     * Set 并发请求次数时间分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationQuantityDistribution 并发请求次数时间分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationQuantityDistribution(IndicatorCoord [] InvocationQuantityDistribution) {
        this.InvocationQuantityDistribution = InvocationQuantityDistribution;
    }

    public InvocationIndicator() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvocationIndicator(InvocationIndicator source) {
        if (source.InvocationQuantity != null) {
            this.InvocationQuantity = new Long(source.InvocationQuantity);
        }
        if (source.InvocationSuccessRate != null) {
            this.InvocationSuccessRate = new Float(source.InvocationSuccessRate);
        }
        if (source.InvocationAvgDuration != null) {
            this.InvocationAvgDuration = new Float(source.InvocationAvgDuration);
        }
        if (source.InvocationSuccessDistribution != null) {
            this.InvocationSuccessDistribution = new IndicatorCoord[source.InvocationSuccessDistribution.length];
            for (int i = 0; i < source.InvocationSuccessDistribution.length; i++) {
                this.InvocationSuccessDistribution[i] = new IndicatorCoord(source.InvocationSuccessDistribution[i]);
            }
        }
        if (source.InvocationFailedDistribution != null) {
            this.InvocationFailedDistribution = new IndicatorCoord[source.InvocationFailedDistribution.length];
            for (int i = 0; i < source.InvocationFailedDistribution.length; i++) {
                this.InvocationFailedDistribution[i] = new IndicatorCoord(source.InvocationFailedDistribution[i]);
            }
        }
        if (source.InvocationStatusDistribution != null) {
            this.InvocationStatusDistribution = new IndicatorCoord[source.InvocationStatusDistribution.length];
            for (int i = 0; i < source.InvocationStatusDistribution.length; i++) {
                this.InvocationStatusDistribution[i] = new IndicatorCoord(source.InvocationStatusDistribution[i]);
            }
        }
        if (source.InvocationDurationDistribution != null) {
            this.InvocationDurationDistribution = new IndicatorCoord[source.InvocationDurationDistribution.length];
            for (int i = 0; i < source.InvocationDurationDistribution.length; i++) {
                this.InvocationDurationDistribution[i] = new IndicatorCoord(source.InvocationDurationDistribution[i]);
            }
        }
        if (source.InvocationQuantityDistribution != null) {
            this.InvocationQuantityDistribution = new IndicatorCoord[source.InvocationQuantityDistribution.length];
            for (int i = 0; i < source.InvocationQuantityDistribution.length; i++) {
                this.InvocationQuantityDistribution[i] = new IndicatorCoord(source.InvocationQuantityDistribution[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvocationQuantity", this.InvocationQuantity);
        this.setParamSimple(map, prefix + "InvocationSuccessRate", this.InvocationSuccessRate);
        this.setParamSimple(map, prefix + "InvocationAvgDuration", this.InvocationAvgDuration);
        this.setParamArrayObj(map, prefix + "InvocationSuccessDistribution.", this.InvocationSuccessDistribution);
        this.setParamArrayObj(map, prefix + "InvocationFailedDistribution.", this.InvocationFailedDistribution);
        this.setParamArrayObj(map, prefix + "InvocationStatusDistribution.", this.InvocationStatusDistribution);
        this.setParamArrayObj(map, prefix + "InvocationDurationDistribution.", this.InvocationDurationDistribution);
        this.setParamArrayObj(map, prefix + "InvocationQuantityDistribution.", this.InvocationQuantityDistribution);

    }
}

