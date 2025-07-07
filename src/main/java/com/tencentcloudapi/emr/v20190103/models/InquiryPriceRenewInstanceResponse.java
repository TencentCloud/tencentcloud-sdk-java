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

public class InquiryPriceRenewInstanceResponse extends AbstractModel {

    /**
    * 原价，单位为元。
    */
    @SerializedName("OriginalCost")
    @Expose
    private Float OriginalCost;

    /**
    * 折扣价，单位为元。
    */
    @SerializedName("DiscountCost")
    @Expose
    private Float DiscountCost;

    /**
    * 实例续费的时间单位。取值范围：
<li>m：表示月份。</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 实例续费的时长。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 价格详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PriceDetail")
    @Expose
    private PriceDetail [] PriceDetail;

    /**
    * 节点续费询价明细列表
    */
    @SerializedName("NodeRenewPriceDetails")
    @Expose
    private NodeRenewPriceDetail [] NodeRenewPriceDetails;

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
    public Float getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set 原价，单位为元。
     * @param OriginalCost 原价，单位为元。
     */
    public void setOriginalCost(Float OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get 折扣价，单位为元。 
     * @return DiscountCost 折扣价，单位为元。
     */
    public Float getDiscountCost() {
        return this.DiscountCost;
    }

    /**
     * Set 折扣价，单位为元。
     * @param DiscountCost 折扣价，单位为元。
     */
    public void setDiscountCost(Float DiscountCost) {
        this.DiscountCost = DiscountCost;
    }

    /**
     * Get 实例续费的时间单位。取值范围：
<li>m：表示月份。</li> 
     * @return TimeUnit 实例续费的时间单位。取值范围：
<li>m：表示月份。</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 实例续费的时间单位。取值范围：
<li>m：表示月份。</li>
     * @param TimeUnit 实例续费的时间单位。取值范围：
<li>m：表示月份。</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 实例续费的时长。 
     * @return TimeSpan 实例续费的时长。
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 实例续费的时长。
     * @param TimeSpan 实例续费的时长。
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 价格详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PriceDetail 价格详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PriceDetail [] getPriceDetail() {
        return this.PriceDetail;
    }

    /**
     * Set 价格详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param PriceDetail 价格详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriceDetail(PriceDetail [] PriceDetail) {
        this.PriceDetail = PriceDetail;
    }

    /**
     * Get 节点续费询价明细列表 
     * @return NodeRenewPriceDetails 节点续费询价明细列表
     */
    public NodeRenewPriceDetail [] getNodeRenewPriceDetails() {
        return this.NodeRenewPriceDetails;
    }

    /**
     * Set 节点续费询价明细列表
     * @param NodeRenewPriceDetails 节点续费询价明细列表
     */
    public void setNodeRenewPriceDetails(NodeRenewPriceDetail [] NodeRenewPriceDetails) {
        this.NodeRenewPriceDetails = NodeRenewPriceDetails;
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

    public InquiryPriceRenewInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewInstanceResponse(InquiryPriceRenewInstanceResponse source) {
        if (source.OriginalCost != null) {
            this.OriginalCost = new Float(source.OriginalCost);
        }
        if (source.DiscountCost != null) {
            this.DiscountCost = new Float(source.DiscountCost);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.PriceDetail != null) {
            this.PriceDetail = new PriceDetail[source.PriceDetail.length];
            for (int i = 0; i < source.PriceDetail.length; i++) {
                this.PriceDetail[i] = new PriceDetail(source.PriceDetail[i]);
            }
        }
        if (source.NodeRenewPriceDetails != null) {
            this.NodeRenewPriceDetails = new NodeRenewPriceDetail[source.NodeRenewPriceDetails.length];
            for (int i = 0; i < source.NodeRenewPriceDetails.length; i++) {
                this.NodeRenewPriceDetails[i] = new NodeRenewPriceDetail(source.NodeRenewPriceDetails[i]);
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
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamArrayObj(map, prefix + "PriceDetail.", this.PriceDetail);
        this.setParamArrayObj(map, prefix + "NodeRenewPriceDetails.", this.NodeRenewPriceDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

