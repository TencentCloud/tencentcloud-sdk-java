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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SettlementOrderResult extends AbstractModel {

    /**
    * 收入类型
LABOR:劳务所得
OCCASION:偶然所得
    */
    @SerializedName("IncomeType")
    @Expose
    private String IncomeType;

    /**
    * 税前金额
    */
    @SerializedName("AmountBeforeTax")
    @Expose
    private String AmountBeforeTax;

    /**
    * 税后金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AmountAfterTax")
    @Expose
    private String AmountAfterTax;

    /**
    * 税金
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * 外部订单ID
    */
    @SerializedName("OutOrderId")
    @Expose
    private String OutOrderId;

    /**
    * 订单ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 发起时间
    */
    @SerializedName("InitiateTime")
    @Expose
    private String InitiateTime;

    /**
    * 完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 状态
ACCEPTED:已受理
ACCOUNTED:已记账
SUCCEED:已成功
FAILED:已失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 收款用户ID
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 外部用户ID
    */
    @SerializedName("OutUserId")
    @Expose
    private String OutUserId;

    /**
    * 操作类型
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
     * Get 收入类型
LABOR:劳务所得
OCCASION:偶然所得 
     * @return IncomeType 收入类型
LABOR:劳务所得
OCCASION:偶然所得
     */
    public String getIncomeType() {
        return this.IncomeType;
    }

    /**
     * Set 收入类型
LABOR:劳务所得
OCCASION:偶然所得
     * @param IncomeType 收入类型
LABOR:劳务所得
OCCASION:偶然所得
     */
    public void setIncomeType(String IncomeType) {
        this.IncomeType = IncomeType;
    }

    /**
     * Get 税前金额 
     * @return AmountBeforeTax 税前金额
     */
    public String getAmountBeforeTax() {
        return this.AmountBeforeTax;
    }

    /**
     * Set 税前金额
     * @param AmountBeforeTax 税前金额
     */
    public void setAmountBeforeTax(String AmountBeforeTax) {
        this.AmountBeforeTax = AmountBeforeTax;
    }

    /**
     * Get 税后金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AmountAfterTax 税后金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAmountAfterTax() {
        return this.AmountAfterTax;
    }

    /**
     * Set 税后金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param AmountAfterTax 税后金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmountAfterTax(String AmountAfterTax) {
        this.AmountAfterTax = AmountAfterTax;
    }

    /**
     * Get 税金
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tax 税金
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set 税金
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tax 税金
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get 外部订单ID 
     * @return OutOrderId 外部订单ID
     */
    public String getOutOrderId() {
        return this.OutOrderId;
    }

    /**
     * Set 外部订单ID
     * @param OutOrderId 外部订单ID
     */
    public void setOutOrderId(String OutOrderId) {
        this.OutOrderId = OutOrderId;
    }

    /**
     * Get 订单ID 
     * @return OrderId 订单ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单ID
     * @param OrderId 订单ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 发起时间 
     * @return InitiateTime 发起时间
     */
    public String getInitiateTime() {
        return this.InitiateTime;
    }

    /**
     * Set 发起时间
     * @param InitiateTime 发起时间
     */
    public void setInitiateTime(String InitiateTime) {
        this.InitiateTime = InitiateTime;
    }

    /**
     * Get 完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishTime 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishTime 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 状态
ACCEPTED:已受理
ACCOUNTED:已记账
SUCCEED:已成功
FAILED:已失败 
     * @return Status 状态
ACCEPTED:已受理
ACCOUNTED:已记账
SUCCEED:已成功
FAILED:已失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
ACCEPTED:已受理
ACCOUNTED:已记账
SUCCEED:已成功
FAILED:已失败
     * @param Status 状态
ACCEPTED:已受理
ACCOUNTED:已记账
SUCCEED:已成功
FAILED:已失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述 
     * @return StatusDesc 状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
     * @param StatusDesc 状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 收款用户ID 
     * @return PayeeId 收款用户ID
     */
    public String getPayeeId() {
        return this.PayeeId;
    }

    /**
     * Set 收款用户ID
     * @param PayeeId 收款用户ID
     */
    public void setPayeeId(String PayeeId) {
        this.PayeeId = PayeeId;
    }

    /**
     * Get 外部用户ID 
     * @return OutUserId 外部用户ID
     */
    public String getOutUserId() {
        return this.OutUserId;
    }

    /**
     * Set 外部用户ID
     * @param OutUserId 外部用户ID
     */
    public void setOutUserId(String OutUserId) {
        this.OutUserId = OutUserId;
    }

    /**
     * Get 操作类型 
     * @return OperationType 操作类型
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型
     * @param OperationType 操作类型
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    public SettlementOrderResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SettlementOrderResult(SettlementOrderResult source) {
        if (source.IncomeType != null) {
            this.IncomeType = new String(source.IncomeType);
        }
        if (source.AmountBeforeTax != null) {
            this.AmountBeforeTax = new String(source.AmountBeforeTax);
        }
        if (source.AmountAfterTax != null) {
            this.AmountAfterTax = new String(source.AmountAfterTax);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.OutOrderId != null) {
            this.OutOrderId = new String(source.OutOrderId);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.InitiateTime != null) {
            this.InitiateTime = new String(source.InitiateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.OutUserId != null) {
            this.OutUserId = new String(source.OutUserId);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IncomeType", this.IncomeType);
        this.setParamSimple(map, prefix + "AmountBeforeTax", this.AmountBeforeTax);
        this.setParamSimple(map, prefix + "AmountAfterTax", this.AmountAfterTax);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "OutOrderId", this.OutOrderId);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "InitiateTime", this.InitiateTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "OutUserId", this.OutUserId);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);

    }
}

