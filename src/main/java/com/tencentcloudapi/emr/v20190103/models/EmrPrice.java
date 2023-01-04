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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmrPrice extends AbstractModel{

    /**
    * 刊例价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * 折扣价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountCost")
    @Expose
    private String DiscountCost;

    /**
    * 单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 询价配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PriceSpec")
    @Expose
    private PriceResource PriceSpec;

    /**
    * 是否支持竞价实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportSpotPaid")
    @Expose
    private Boolean SupportSpotPaid;

    /**
     * Get 刊例价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalCost 刊例价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set 刊例价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalCost 刊例价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get 折扣价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountCost 折扣价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set 折扣价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountCost 折扣价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountCost(String DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    /**
     * Get 单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 询价配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PriceSpec 询价配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PriceResource getPriceSpec() {
        return this.PriceSpec;
    }

    /**
     * Set 询价配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param PriceSpec 询价配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriceSpec(PriceResource PriceSpec) {
        this.PriceSpec = PriceSpec;
    }

    /**
     * Get 是否支持竞价实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportSpotPaid 是否支持竞价实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportSpotPaid() {
        return this.SupportSpotPaid;
    }

    /**
     * Set 是否支持竞价实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportSpotPaid 是否支持竞价实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportSpotPaid(Boolean SupportSpotPaid) {
        this.SupportSpotPaid = SupportSpotPaid;
    }

    public EmrPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmrPrice(EmrPrice source) {
        if (source.OriginalCost != null) {
            this.OriginalCost = new String(source.OriginalCost);
        }
        if (source.DiscountCost != null) {
            this.DiscountCost = new String(source.DiscountCost);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.PriceSpec != null) {
            this.PriceSpec = new PriceResource(source.PriceSpec);
        }
        if (source.SupportSpotPaid != null) {
            this.SupportSpotPaid = new Boolean(source.SupportSpotPaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "DiscountCost", this.DiscountCost);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamObj(map, prefix + "PriceSpec.", this.PriceSpec);
        this.setParamSimple(map, prefix + "SupportSpotPaid", this.SupportSpotPaid);

    }
}

