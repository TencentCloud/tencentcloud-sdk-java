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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceScaleOutInstanceResponse extends AbstractModel {

    /**
    * 原价，单位为元。
    */
    @SerializedName("OriginalCost")
    @Expose
    private String OriginalCost;

    /**
    * 折扣价，单位为元。
    */
    @SerializedName("DiscountCost")
    @Expose
    private String DiscountCost;

    /**
    * 扩容的时间单位。取值范围：
<li>s：表示秒。</li>
<li>m：表示月份。</li>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 询价的节点规格。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PriceSpec")
    @Expose
    private PriceResource PriceSpec;

    /**
    * 对应入参MultipleResources中多个规格的询价结果，其它出参返回的是第一个规格的询价结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultipleEmrPrice")
    @Expose
    private EmrPrice [] MultipleEmrPrice;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 原价，单位为元。 
     * @return OriginalCost 原价，单位为元。
     */
    public String getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set 原价，单位为元。
     * @param OriginalCost 原价，单位为元。
     */
    public void setOriginalCost(String OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get 折扣价，单位为元。 
     * @return DiscountCost 折扣价，单位为元。
     */
    public String getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set 折扣价，单位为元。
     * @param DiscountCost 折扣价，单位为元。
     */
    public void setDiscountCost(String DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    /**
     * Get 扩容的时间单位。取值范围：
<li>s：表示秒。</li>
<li>m：表示月份。</li> 
     * @return Unit 扩容的时间单位。取值范围：
<li>s：表示秒。</li>
<li>m：表示月份。</li>
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 扩容的时间单位。取值范围：
<li>s：表示秒。</li>
<li>m：表示月份。</li>
     * @param Unit 扩容的时间单位。取值范围：
<li>s：表示秒。</li>
<li>m：表示月份。</li>
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 询价的节点规格。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PriceSpec 询价的节点规格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PriceResource getPriceSpec() {
        return this.PriceSpec;
    }

    /**
     * Set 询价的节点规格。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PriceSpec 询价的节点规格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriceSpec(PriceResource PriceSpec) {
        this.PriceSpec = PriceSpec;
    }

    /**
     * Get 对应入参MultipleResources中多个规格的询价结果，其它出参返回的是第一个规格的询价结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultipleEmrPrice 对应入参MultipleResources中多个规格的询价结果，其它出参返回的是第一个规格的询价结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmrPrice [] getMultipleEmrPrice() {
        return this.MultipleEmrPrice;
    }

    /**
     * Set 对应入参MultipleResources中多个规格的询价结果，其它出参返回的是第一个规格的询价结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultipleEmrPrice 对应入参MultipleResources中多个规格的询价结果，其它出参返回的是第一个规格的询价结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultipleEmrPrice(EmrPrice [] MultipleEmrPrice) {
        this.MultipleEmrPrice = MultipleEmrPrice;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public InquiryPriceScaleOutInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceScaleOutInstanceResponse(InquiryPriceScaleOutInstanceResponse source) {
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
        if (source.MultipleEmrPrice != null) {
            this.MultipleEmrPrice = new EmrPrice[source.MultipleEmrPrice.length];
            for (int i = 0; i < source.MultipleEmrPrice.length; i++) {
                this.MultipleEmrPrice[i] = new EmrPrice(source.MultipleEmrPrice[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamArrayObj(map, prefix + "MultipleEmrPrice.", this.MultipleEmrPrice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

