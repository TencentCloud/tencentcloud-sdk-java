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
package com.tencentcloudapi.cloudhsm.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceBuyVsmResponse extends AbstractModel{

    /**
    * 总金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCost")
    @Expose
    private Float TotalCost;

    /**
    * 购买的实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 商品的时间大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeSpan")
    @Expose
    private String TimeSpan;

    /**
    * 商品的时间单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 原始总金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalCost")
    @Expose
    private Float OriginalCost;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCost 总金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 总金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCost 总金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 购买的实例数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GoodsNum 购买的实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 购买的实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsNum 购买的实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get 商品的时间大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeSpan 商品的时间大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 商品的时间大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeSpan 商品的时间大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeSpan(String TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 商品的时间单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeUnit 商品的时间单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 商品的时间单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeUnit 商品的时间单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 原始总金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalCost 原始总金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOriginalCost() {
        return this.OriginalCost;
    }

    /**
     * Set 原始总金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalCost 原始总金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalCost(Float OriginalCost) {
        this.OriginalCost = OriginalCost;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "OriginalCost", this.OriginalCost);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

