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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DistributeMultiApplyResult extends AbstractModel{

    /**
    * 分账状态（0分账初始 1分账成功 2分账失败）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 平台分账单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DistributeNo")
    @Expose
    private String DistributeNo;

    /**
    * 入账日期，yyyy-MM-dd格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InDate")
    @Expose
    private String InDate;

    /**
    * 分账金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Amount")
    @Expose
    private String Amount;

    /**
    * 商户分账单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutDistributeNo")
    @Expose
    private String OutDistributeNo;

    /**
    * 平台支付单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
     * Get 分账状态（0分账初始 1分账成功 2分账失败）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 分账状态（0分账初始 1分账成功 2分账失败）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 分账状态（0分账初始 1分账成功 2分账失败）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 分账状态（0分账初始 1分账成功 2分账失败）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 平台分账单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DistributeNo 平台分账单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDistributeNo() {
        return this.DistributeNo;
    }

    /**
     * Set 平台分账单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DistributeNo 平台分账单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistributeNo(String DistributeNo) {
        this.DistributeNo = DistributeNo;
    }

    /**
     * Get 入账日期，yyyy-MM-dd格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InDate 入账日期，yyyy-MM-dd格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInDate() {
        return this.InDate;
    }

    /**
     * Set 入账日期，yyyy-MM-dd格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param InDate 入账日期，yyyy-MM-dd格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInDate(String InDate) {
        this.InDate = InDate;
    }

    /**
     * Get 分账金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Amount 分账金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAmount() {
        return this.Amount;
    }

    /**
     * Set 分账金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Amount 分账金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 商户分账单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutDistributeNo 商户分账单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutDistributeNo() {
        return this.OutDistributeNo;
    }

    /**
     * Set 商户分账单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutDistributeNo 商户分账单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutDistributeNo(String OutDistributeNo) {
        this.OutDistributeNo = OutDistributeNo;
    }

    /**
     * Get 平台支付单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderNo 平台支付单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 平台支付单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderNo 平台支付单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public DistributeMultiApplyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistributeMultiApplyResult(DistributeMultiApplyResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DistributeNo != null) {
            this.DistributeNo = new String(source.DistributeNo);
        }
        if (source.InDate != null) {
            this.InDate = new String(source.InDate);
        }
        if (source.Amount != null) {
            this.Amount = new String(source.Amount);
        }
        if (source.OutDistributeNo != null) {
            this.OutDistributeNo = new String(source.OutDistributeNo);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new String(source.OrderNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DistributeNo", this.DistributeNo);
        this.setParamSimple(map, prefix + "InDate", this.InDate);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "OutDistributeNo", this.OutDistributeNo);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);

    }
}

