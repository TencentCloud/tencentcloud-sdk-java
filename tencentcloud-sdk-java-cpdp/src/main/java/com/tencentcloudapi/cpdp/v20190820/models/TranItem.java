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

public class TranItem extends AbstractModel{

    /**
    * STRING(50)，资金汇总账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FundSummaryAcctNo")
    @Expose
    private String FundSummaryAcctNo;

    /**
    * STRING(50)，见证子账户的账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAcctNo")
    @Expose
    private String SubAcctNo;

    /**
    * STRING(32)，交易网会员代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranNetMemberCode")
    @Expose
    private String TranNetMemberCode;

    /**
    * STRING(150)，会员名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
    * STRING(5)，会员证件类型（详情见“常见问题”）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberGlobalType")
    @Expose
    private String MemberGlobalType;

    /**
    * STRING(32)，会员证件号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberGlobalId")
    @Expose
    private String MemberGlobalId;

    /**
    * STRING(50)，会员绑定账户的账号（提现的银行卡）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberAcctNo")
    @Expose
    private String MemberAcctNo;

    /**
    * STRING(10)，会员绑定账户的本他行类型（1: 本行; 2: 他行）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BankType")
    @Expose
    private String BankType;

    /**
    * STRING(150)，会员绑定账户的开户行名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AcctOpenBranchName")
    @Expose
    private String AcctOpenBranchName;

    /**
    * STRING(20)，会员绑定账户的开户行的联行号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CnapsBranchId")
    @Expose
    private String CnapsBranchId;

    /**
    * STRING(20)，会员绑定账户的开户行的超级网银行号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EiconBankBranchId")
    @Expose
    private String EiconBankBranchId;

    /**
    * STRING(30)，会员的手机号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
     * Get STRING(50)，资金汇总账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FundSummaryAcctNo STRING(50)，资金汇总账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFundSummaryAcctNo() {
        return this.FundSummaryAcctNo;
    }

    /**
     * Set STRING(50)，资金汇总账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param FundSummaryAcctNo STRING(50)，资金汇总账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFundSummaryAcctNo(String FundSummaryAcctNo) {
        this.FundSummaryAcctNo = FundSummaryAcctNo;
    }

    /**
     * Get STRING(50)，见证子账户的账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAcctNo STRING(50)，见证子账户的账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAcctNo() {
        return this.SubAcctNo;
    }

    /**
     * Set STRING(50)，见证子账户的账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAcctNo STRING(50)，见证子账户的账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAcctNo(String SubAcctNo) {
        this.SubAcctNo = SubAcctNo;
    }

    /**
     * Get STRING(32)，交易网会员代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranNetMemberCode STRING(32)，交易网会员代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranNetMemberCode() {
        return this.TranNetMemberCode;
    }

    /**
     * Set STRING(32)，交易网会员代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranNetMemberCode STRING(32)，交易网会员代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranNetMemberCode(String TranNetMemberCode) {
        this.TranNetMemberCode = TranNetMemberCode;
    }

    /**
     * Get STRING(150)，会员名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberName STRING(150)，会员名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set STRING(150)，会员名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberName STRING(150)，会员名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    /**
     * Get STRING(5)，会员证件类型（详情见“常见问题”）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberGlobalType STRING(5)，会员证件类型（详情见“常见问题”）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberGlobalType() {
        return this.MemberGlobalType;
    }

    /**
     * Set STRING(5)，会员证件类型（详情见“常见问题”）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberGlobalType STRING(5)，会员证件类型（详情见“常见问题”）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberGlobalType(String MemberGlobalType) {
        this.MemberGlobalType = MemberGlobalType;
    }

    /**
     * Get STRING(32)，会员证件号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberGlobalId STRING(32)，会员证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberGlobalId() {
        return this.MemberGlobalId;
    }

    /**
     * Set STRING(32)，会员证件号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberGlobalId STRING(32)，会员证件号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberGlobalId(String MemberGlobalId) {
        this.MemberGlobalId = MemberGlobalId;
    }

    /**
     * Get STRING(50)，会员绑定账户的账号（提现的银行卡）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberAcctNo STRING(50)，会员绑定账户的账号（提现的银行卡）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberAcctNo() {
        return this.MemberAcctNo;
    }

    /**
     * Set STRING(50)，会员绑定账户的账号（提现的银行卡）
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberAcctNo STRING(50)，会员绑定账户的账号（提现的银行卡）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberAcctNo(String MemberAcctNo) {
        this.MemberAcctNo = MemberAcctNo;
    }

    /**
     * Get STRING(10)，会员绑定账户的本他行类型（1: 本行; 2: 他行）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BankType STRING(10)，会员绑定账户的本他行类型（1: 本行; 2: 他行）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBankType() {
        return this.BankType;
    }

    /**
     * Set STRING(10)，会员绑定账户的本他行类型（1: 本行; 2: 他行）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BankType STRING(10)，会员绑定账户的本他行类型（1: 本行; 2: 他行）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBankType(String BankType) {
        this.BankType = BankType;
    }

    /**
     * Get STRING(150)，会员绑定账户的开户行名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AcctOpenBranchName STRING(150)，会员绑定账户的开户行名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAcctOpenBranchName() {
        return this.AcctOpenBranchName;
    }

    /**
     * Set STRING(150)，会员绑定账户的开户行名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AcctOpenBranchName STRING(150)，会员绑定账户的开户行名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAcctOpenBranchName(String AcctOpenBranchName) {
        this.AcctOpenBranchName = AcctOpenBranchName;
    }

    /**
     * Get STRING(20)，会员绑定账户的开户行的联行号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CnapsBranchId STRING(20)，会员绑定账户的开户行的联行号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCnapsBranchId() {
        return this.CnapsBranchId;
    }

    /**
     * Set STRING(20)，会员绑定账户的开户行的联行号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CnapsBranchId STRING(20)，会员绑定账户的开户行的联行号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCnapsBranchId(String CnapsBranchId) {
        this.CnapsBranchId = CnapsBranchId;
    }

    /**
     * Get STRING(20)，会员绑定账户的开户行的超级网银行号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EiconBankBranchId STRING(20)，会员绑定账户的开户行的超级网银行号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEiconBankBranchId() {
        return this.EiconBankBranchId;
    }

    /**
     * Set STRING(20)，会员绑定账户的开户行的超级网银行号
注意：此字段可能返回 null，表示取不到有效值。
     * @param EiconBankBranchId STRING(20)，会员绑定账户的开户行的超级网银行号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEiconBankBranchId(String EiconBankBranchId) {
        this.EiconBankBranchId = EiconBankBranchId;
    }

    /**
     * Get STRING(30)，会员的手机号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mobile STRING(30)，会员的手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set STRING(30)，会员的手机号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mobile STRING(30)，会员的手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FundSummaryAcctNo", this.FundSummaryAcctNo);
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "TranNetMemberCode", this.TranNetMemberCode);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);
        this.setParamSimple(map, prefix + "MemberGlobalType", this.MemberGlobalType);
        this.setParamSimple(map, prefix + "MemberGlobalId", this.MemberGlobalId);
        this.setParamSimple(map, prefix + "MemberAcctNo", this.MemberAcctNo);
        this.setParamSimple(map, prefix + "BankType", this.BankType);
        this.setParamSimple(map, prefix + "AcctOpenBranchName", this.AcctOpenBranchName);
        this.setParamSimple(map, prefix + "CnapsBranchId", this.CnapsBranchId);
        this.setParamSimple(map, prefix + "EiconBankBranchId", this.EiconBankBranchId);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);

    }
}

