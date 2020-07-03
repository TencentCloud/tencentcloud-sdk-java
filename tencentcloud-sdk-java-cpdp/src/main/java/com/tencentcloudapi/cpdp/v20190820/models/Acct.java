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

public class Acct extends AbstractModel{

    /**
    * STRING(50)，见证子账户的账号（可重复）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAcctNo")
    @Expose
    private String SubAcctNo;

    /**
    * STRING(10)，见证子账户的属性（可重复。1: 普通会员子账号; 2: 挂账子账号; 3: 手续费子账号; 4: 利息子账号; 5: 平台担保子账号）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAcctProperty")
    @Expose
    private String SubAcctProperty;

    /**
    * STRING(32)，交易网会员代码（可重复）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranNetMemberCode")
    @Expose
    private String TranNetMemberCode;

    /**
    * STRING(150)，见证子账户的名称（可重复）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAcctName")
    @Expose
    private String SubAcctName;

    /**
    * STRING(20)，见证子账户可用余额（可重复）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AcctAvailBal")
    @Expose
    private String AcctAvailBal;

    /**
    * STRING(20)，见证子账户可提现金额（可重复。开户日期或修改日期）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CashAmt")
    @Expose
    private String CashAmt;

    /**
    * STRING(8)，维护日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaintenanceDate")
    @Expose
    private String MaintenanceDate;

    /**
     * Get STRING(50)，见证子账户的账号（可重复）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAcctNo STRING(50)，见证子账户的账号（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAcctNo() {
        return this.SubAcctNo;
    }

    /**
     * Set STRING(50)，见证子账户的账号（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAcctNo STRING(50)，见证子账户的账号（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAcctNo(String SubAcctNo) {
        this.SubAcctNo = SubAcctNo;
    }

    /**
     * Get STRING(10)，见证子账户的属性（可重复。1: 普通会员子账号; 2: 挂账子账号; 3: 手续费子账号; 4: 利息子账号; 5: 平台担保子账号）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAcctProperty STRING(10)，见证子账户的属性（可重复。1: 普通会员子账号; 2: 挂账子账号; 3: 手续费子账号; 4: 利息子账号; 5: 平台担保子账号）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAcctProperty() {
        return this.SubAcctProperty;
    }

    /**
     * Set STRING(10)，见证子账户的属性（可重复。1: 普通会员子账号; 2: 挂账子账号; 3: 手续费子账号; 4: 利息子账号; 5: 平台担保子账号）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAcctProperty STRING(10)，见证子账户的属性（可重复。1: 普通会员子账号; 2: 挂账子账号; 3: 手续费子账号; 4: 利息子账号; 5: 平台担保子账号）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAcctProperty(String SubAcctProperty) {
        this.SubAcctProperty = SubAcctProperty;
    }

    /**
     * Get STRING(32)，交易网会员代码（可重复）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranNetMemberCode STRING(32)，交易网会员代码（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranNetMemberCode() {
        return this.TranNetMemberCode;
    }

    /**
     * Set STRING(32)，交易网会员代码（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranNetMemberCode STRING(32)，交易网会员代码（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranNetMemberCode(String TranNetMemberCode) {
        this.TranNetMemberCode = TranNetMemberCode;
    }

    /**
     * Get STRING(150)，见证子账户的名称（可重复）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAcctName STRING(150)，见证子账户的名称（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAcctName() {
        return this.SubAcctName;
    }

    /**
     * Set STRING(150)，见证子账户的名称（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAcctName STRING(150)，见证子账户的名称（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAcctName(String SubAcctName) {
        this.SubAcctName = SubAcctName;
    }

    /**
     * Get STRING(20)，见证子账户可用余额（可重复）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AcctAvailBal STRING(20)，见证子账户可用余额（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAcctAvailBal() {
        return this.AcctAvailBal;
    }

    /**
     * Set STRING(20)，见证子账户可用余额（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AcctAvailBal STRING(20)，见证子账户可用余额（可重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAcctAvailBal(String AcctAvailBal) {
        this.AcctAvailBal = AcctAvailBal;
    }

    /**
     * Get STRING(20)，见证子账户可提现金额（可重复。开户日期或修改日期）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CashAmt STRING(20)，见证子账户可提现金额（可重复。开户日期或修改日期）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCashAmt() {
        return this.CashAmt;
    }

    /**
     * Set STRING(20)，见证子账户可提现金额（可重复。开户日期或修改日期）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CashAmt STRING(20)，见证子账户可提现金额（可重复。开户日期或修改日期）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCashAmt(String CashAmt) {
        this.CashAmt = CashAmt;
    }

    /**
     * Get STRING(8)，维护日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaintenanceDate STRING(8)，维护日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaintenanceDate() {
        return this.MaintenanceDate;
    }

    /**
     * Set STRING(8)，维护日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaintenanceDate STRING(8)，维护日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaintenanceDate(String MaintenanceDate) {
        this.MaintenanceDate = MaintenanceDate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "SubAcctProperty", this.SubAcctProperty);
        this.setParamSimple(map, prefix + "TranNetMemberCode", this.TranNetMemberCode);
        this.setParamSimple(map, prefix + "SubAcctName", this.SubAcctName);
        this.setParamSimple(map, prefix + "AcctAvailBal", this.AcctAvailBal);
        this.setParamSimple(map, prefix + "CashAmt", this.CashAmt);
        this.setParamSimple(map, prefix + "MaintenanceDate", this.MaintenanceDate);

    }
}

