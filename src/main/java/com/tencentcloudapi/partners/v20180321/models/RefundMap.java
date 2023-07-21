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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RefundMap extends AbstractModel{

    /**
    * 退款单关联的原始子订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundAmount")
    @Expose
    private Long RefundAmount;

    /**
     * Get 退款单关联的原始子订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealName 退款单关联的原始子订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 退款单关联的原始子订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealName 退款单关联的原始子订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundAmount 退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRefundAmount() {
        return this.RefundAmount;
    }

    /**
     * Set 退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundAmount 退款金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundAmount(Long RefundAmount) {
        this.RefundAmount = RefundAmount;
    }

    public RefundMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefundMap(RefundMap source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.RefundAmount != null) {
            this.RefundAmount = new Long(source.RefundAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "RefundAmount", this.RefundAmount);

    }
}

