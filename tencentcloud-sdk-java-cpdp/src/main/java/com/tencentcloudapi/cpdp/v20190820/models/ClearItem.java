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

public class ClearItem extends AbstractModel{

    /**
    * STRING(8)，日期（格式: 20190101）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * STRING(40)，子账号类型（子帐号类型。1: 普通会员子账号; 2: 挂账子账号; 3: 手续费子账号; 4: 利息子账号; 5: 平台担保子账号; 7: 在途; 8: 理财购买子帐号; 9: 理财赎回子帐号; 10: 平台子拥有结算子帐号）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAcctType")
    @Expose
    private String SubAcctType;

    /**
    * STRING(3)，对账状态（0: 成功; 1: 失败）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReconcileStatus")
    @Expose
    private String ReconcileStatus;

    /**
    * STRING(300)，对账返回信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReconcileReturnMsg")
    @Expose
    private String ReconcileReturnMsg;

    /**
    * STRING(20)，清算状态（0: 成功; 1: 失败; 2: 异常; 3: 待处理）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClearingStatus")
    @Expose
    private String ClearingStatus;

    /**
    * STRING(2)，清算返回信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClearingReturnMsg")
    @Expose
    private String ClearingReturnMsg;

    /**
    * STRING(300)，待清算总金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalAmt")
    @Expose
    private String TotalAmt;

    /**
     * Get STRING(8)，日期（格式: 20190101）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date STRING(8)，日期（格式: 20190101）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set STRING(8)，日期（格式: 20190101）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date STRING(8)，日期（格式: 20190101）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get STRING(40)，子账号类型（子帐号类型。1: 普通会员子账号; 2: 挂账子账号; 3: 手续费子账号; 4: 利息子账号; 5: 平台担保子账号; 7: 在途; 8: 理财购买子帐号; 9: 理财赎回子帐号; 10: 平台子拥有结算子帐号）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAcctType STRING(40)，子账号类型（子帐号类型。1: 普通会员子账号; 2: 挂账子账号; 3: 手续费子账号; 4: 利息子账号; 5: 平台担保子账号; 7: 在途; 8: 理财购买子帐号; 9: 理财赎回子帐号; 10: 平台子拥有结算子帐号）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAcctType() {
        return this.SubAcctType;
    }

    /**
     * Set STRING(40)，子账号类型（子帐号类型。1: 普通会员子账号; 2: 挂账子账号; 3: 手续费子账号; 4: 利息子账号; 5: 平台担保子账号; 7: 在途; 8: 理财购买子帐号; 9: 理财赎回子帐号; 10: 平台子拥有结算子帐号）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAcctType STRING(40)，子账号类型（子帐号类型。1: 普通会员子账号; 2: 挂账子账号; 3: 手续费子账号; 4: 利息子账号; 5: 平台担保子账号; 7: 在途; 8: 理财购买子帐号; 9: 理财赎回子帐号; 10: 平台子拥有结算子帐号）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAcctType(String SubAcctType) {
        this.SubAcctType = SubAcctType;
    }

    /**
     * Get STRING(3)，对账状态（0: 成功; 1: 失败）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReconcileStatus STRING(3)，对账状态（0: 成功; 1: 失败）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReconcileStatus() {
        return this.ReconcileStatus;
    }

    /**
     * Set STRING(3)，对账状态（0: 成功; 1: 失败）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReconcileStatus STRING(3)，对账状态（0: 成功; 1: 失败）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReconcileStatus(String ReconcileStatus) {
        this.ReconcileStatus = ReconcileStatus;
    }

    /**
     * Get STRING(300)，对账返回信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReconcileReturnMsg STRING(300)，对账返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReconcileReturnMsg() {
        return this.ReconcileReturnMsg;
    }

    /**
     * Set STRING(300)，对账返回信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReconcileReturnMsg STRING(300)，对账返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReconcileReturnMsg(String ReconcileReturnMsg) {
        this.ReconcileReturnMsg = ReconcileReturnMsg;
    }

    /**
     * Get STRING(20)，清算状态（0: 成功; 1: 失败; 2: 异常; 3: 待处理）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClearingStatus STRING(20)，清算状态（0: 成功; 1: 失败; 2: 异常; 3: 待处理）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClearingStatus() {
        return this.ClearingStatus;
    }

    /**
     * Set STRING(20)，清算状态（0: 成功; 1: 失败; 2: 异常; 3: 待处理）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClearingStatus STRING(20)，清算状态（0: 成功; 1: 失败; 2: 异常; 3: 待处理）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClearingStatus(String ClearingStatus) {
        this.ClearingStatus = ClearingStatus;
    }

    /**
     * Get STRING(2)，清算返回信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClearingReturnMsg STRING(2)，清算返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClearingReturnMsg() {
        return this.ClearingReturnMsg;
    }

    /**
     * Set STRING(2)，清算返回信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClearingReturnMsg STRING(2)，清算返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClearingReturnMsg(String ClearingReturnMsg) {
        this.ClearingReturnMsg = ClearingReturnMsg;
    }

    /**
     * Get STRING(300)，待清算总金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalAmt STRING(300)，待清算总金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalAmt() {
        return this.TotalAmt;
    }

    /**
     * Set STRING(300)，待清算总金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalAmt STRING(300)，待清算总金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalAmt(String TotalAmt) {
        this.TotalAmt = TotalAmt;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "SubAcctType", this.SubAcctType);
        this.setParamSimple(map, prefix + "ReconcileStatus", this.ReconcileStatus);
        this.setParamSimple(map, prefix + "ReconcileReturnMsg", this.ReconcileReturnMsg);
        this.setParamSimple(map, prefix + "ClearingStatus", this.ClearingStatus);
        this.setParamSimple(map, prefix + "ClearingReturnMsg", this.ClearingReturnMsg);
        this.setParamSimple(map, prefix + "TotalAmt", this.TotalAmt);

    }
}

