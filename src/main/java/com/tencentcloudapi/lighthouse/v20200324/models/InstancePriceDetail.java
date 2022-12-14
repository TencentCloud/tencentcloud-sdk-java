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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstancePriceDetail extends AbstractModel{

    /**
    * 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 询价信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstancePrice")
    @Expose
    private InstancePrice InstancePrice;

    /**
    * 折扣梯度详情，每个梯度包含的信息有：时长，折扣数，总价，折扣价，折扣详情（用户折扣、官网折扣、最终折扣）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountDetail")
    @Expose
    private DiscountDetail [] DiscountDetail;

    /**
     * Get 实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 询价信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstancePrice 询价信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstancePrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set 询价信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstancePrice 询价信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstancePrice(InstancePrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get 折扣梯度详情，每个梯度包含的信息有：时长，折扣数，总价，折扣价，折扣详情（用户折扣、官网折扣、最终折扣）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountDetail 折扣梯度详情，每个梯度包含的信息有：时长，折扣数，总价，折扣价，折扣详情（用户折扣、官网折扣、最终折扣）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiscountDetail [] getDiscountDetail() {
        return this.DiscountDetail;
    }

    /**
     * Set 折扣梯度详情，每个梯度包含的信息有：时长，折扣数，总价，折扣价，折扣详情（用户折扣、官网折扣、最终折扣）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountDetail 折扣梯度详情，每个梯度包含的信息有：时长，折扣数，总价，折扣价，折扣详情（用户折扣、官网折扣、最终折扣）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountDetail(DiscountDetail [] DiscountDetail) {
        this.DiscountDetail = DiscountDetail;
    }

    public InstancePriceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstancePriceDetail(InstancePriceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstancePrice != null) {
            this.InstancePrice = new InstancePrice(source.InstancePrice);
        }
        if (source.DiscountDetail != null) {
            this.DiscountDetail = new DiscountDetail[source.DiscountDetail.length];
            for (int i = 0; i < source.DiscountDetail.length; i++) {
                this.DiscountDetail[i] = new DiscountDetail(source.DiscountDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamArrayObj(map, prefix + "DiscountDetail.", this.DiscountDetail);

    }
}

