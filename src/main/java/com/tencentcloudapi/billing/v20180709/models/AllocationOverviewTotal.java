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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationOverviewTotal extends AbstractModel {

    /**
    * 总费用：现金费用合计+分成金费用合计+赠送金费用合计+优惠券费用合计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * 现金： 现金费用合计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 赠送金：赠送金费用合计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * 优惠券：优惠券费用合计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * 分成金：分成金费用合计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
     * Get 总费用：现金费用合计+分成金费用合计+赠送金费用合计+优惠券费用合计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealTotalCost 总费用：现金费用合计+分成金费用合计+赠送金费用合计+优惠券费用合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 总费用：现金费用合计+分成金费用合计+赠送金费用合计+优惠券费用合计
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealTotalCost 总费用：现金费用合计+分成金费用合计+赠送金费用合计+优惠券费用合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 现金： 现金费用合计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CashPayAmount 现金： 现金费用合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set 现金： 现金费用合计
注意：此字段可能返回 null，表示取不到有效值。
     * @param CashPayAmount 现金： 现金费用合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get 赠送金：赠送金费用合计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncentivePayAmount 赠送金：赠送金费用合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set 赠送金：赠送金费用合计
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncentivePayAmount 赠送金：赠送金费用合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get 优惠券：优惠券费用合计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoucherPayAmount 优惠券：优惠券费用合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set 优惠券：优惠券费用合计
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoucherPayAmount 优惠券：优惠券费用合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get 分成金：分成金费用合计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferPayAmount 分成金：分成金费用合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set 分成金：分成金费用合计
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferPayAmount 分成金：分成金费用合计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    public AllocationOverviewTotal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationOverviewTotal(AllocationOverviewTotal source) {
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);

    }
}

