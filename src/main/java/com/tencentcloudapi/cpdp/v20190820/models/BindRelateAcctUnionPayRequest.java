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

public class BindRelateAcctUnionPayRequest extends AbstractModel{

    /**
    * STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”（右侧）进行分隔）
    */
    @SerializedName("TranNetMemberCode")
    @Expose
    private String TranNetMemberCode;

    /**
    * STRING(150)，见证子账户的户名（首次绑定的情况下，此字段即为待绑定的提现账户的户名。非首次绑定的情况下，须注意带绑定的提现账户的户名须与留存在后台系统的会员户名一致）
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
    * STRING(5)，会员证件类型（详情见“常见问题”）
    */
    @SerializedName("MemberGlobalType")
    @Expose
    private String MemberGlobalType;

    /**
    * STRING(32)，会员证件号码
    */
    @SerializedName("MemberGlobalId")
    @Expose
    private String MemberGlobalId;

    /**
    * STRING(50)，会员的待绑定账户的账号（提现的银行卡）
    */
    @SerializedName("MemberAcctNo")
    @Expose
    private String MemberAcctNo;

    /**
    * STRING(10)，会员的待绑定账户的本他行类型（1: 本行; 2: 他行）
    */
    @SerializedName("BankType")
    @Expose
    private String BankType;

    /**
    * STRING(150)，会员的待绑定账户的开户行名称（若大小额行号不填则送超级网银号对应的银行名称，若填大小额行号则送大小额行号对应的银行名称）
    */
    @SerializedName("AcctOpenBranchName")
    @Expose
    private String AcctOpenBranchName;

    /**
    * STRING(30)，会员的手机号（手机号须由长度为11位的数字构成）
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * String(22)，商户号（签约客户号）
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(20)，会员的待绑定账户的开户行的联行号（本他行类型为他行的情况下，此字段和下一个字段至少一个不为空）
    */
    @SerializedName("CnapsBranchId")
    @Expose
    private String CnapsBranchId;

    /**
    * STRING(20)，会员的待绑定账户的开户行的超级网银行号（本他行类型为他行的情况下，此字段和上一个字段至少一个不为空）
    */
    @SerializedName("EiconBankBranchId")
    @Expose
    private String EiconBankBranchId;

    /**
    * STRING(1027)，保留域
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

    /**
     * Get STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”（右侧）进行分隔） 
     * @return TranNetMemberCode STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”（右侧）进行分隔）
     */
    public String getTranNetMemberCode() {
        return this.TranNetMemberCode;
    }

    /**
     * Set STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”（右侧）进行分隔）
     * @param TranNetMemberCode STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”（右侧）进行分隔）
     */
    public void setTranNetMemberCode(String TranNetMemberCode) {
        this.TranNetMemberCode = TranNetMemberCode;
    }

    /**
     * Get STRING(150)，见证子账户的户名（首次绑定的情况下，此字段即为待绑定的提现账户的户名。非首次绑定的情况下，须注意带绑定的提现账户的户名须与留存在后台系统的会员户名一致） 
     * @return MemberName STRING(150)，见证子账户的户名（首次绑定的情况下，此字段即为待绑定的提现账户的户名。非首次绑定的情况下，须注意带绑定的提现账户的户名须与留存在后台系统的会员户名一致）
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set STRING(150)，见证子账户的户名（首次绑定的情况下，此字段即为待绑定的提现账户的户名。非首次绑定的情况下，须注意带绑定的提现账户的户名须与留存在后台系统的会员户名一致）
     * @param MemberName STRING(150)，见证子账户的户名（首次绑定的情况下，此字段即为待绑定的提现账户的户名。非首次绑定的情况下，须注意带绑定的提现账户的户名须与留存在后台系统的会员户名一致）
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    /**
     * Get STRING(5)，会员证件类型（详情见“常见问题”） 
     * @return MemberGlobalType STRING(5)，会员证件类型（详情见“常见问题”）
     */
    public String getMemberGlobalType() {
        return this.MemberGlobalType;
    }

    /**
     * Set STRING(5)，会员证件类型（详情见“常见问题”）
     * @param MemberGlobalType STRING(5)，会员证件类型（详情见“常见问题”）
     */
    public void setMemberGlobalType(String MemberGlobalType) {
        this.MemberGlobalType = MemberGlobalType;
    }

    /**
     * Get STRING(32)，会员证件号码 
     * @return MemberGlobalId STRING(32)，会员证件号码
     */
    public String getMemberGlobalId() {
        return this.MemberGlobalId;
    }

    /**
     * Set STRING(32)，会员证件号码
     * @param MemberGlobalId STRING(32)，会员证件号码
     */
    public void setMemberGlobalId(String MemberGlobalId) {
        this.MemberGlobalId = MemberGlobalId;
    }

    /**
     * Get STRING(50)，会员的待绑定账户的账号（提现的银行卡） 
     * @return MemberAcctNo STRING(50)，会员的待绑定账户的账号（提现的银行卡）
     */
    public String getMemberAcctNo() {
        return this.MemberAcctNo;
    }

    /**
     * Set STRING(50)，会员的待绑定账户的账号（提现的银行卡）
     * @param MemberAcctNo STRING(50)，会员的待绑定账户的账号（提现的银行卡）
     */
    public void setMemberAcctNo(String MemberAcctNo) {
        this.MemberAcctNo = MemberAcctNo;
    }

    /**
     * Get STRING(10)，会员的待绑定账户的本他行类型（1: 本行; 2: 他行） 
     * @return BankType STRING(10)，会员的待绑定账户的本他行类型（1: 本行; 2: 他行）
     */
    public String getBankType() {
        return this.BankType;
    }

    /**
     * Set STRING(10)，会员的待绑定账户的本他行类型（1: 本行; 2: 他行）
     * @param BankType STRING(10)，会员的待绑定账户的本他行类型（1: 本行; 2: 他行）
     */
    public void setBankType(String BankType) {
        this.BankType = BankType;
    }

    /**
     * Get STRING(150)，会员的待绑定账户的开户行名称（若大小额行号不填则送超级网银号对应的银行名称，若填大小额行号则送大小额行号对应的银行名称） 
     * @return AcctOpenBranchName STRING(150)，会员的待绑定账户的开户行名称（若大小额行号不填则送超级网银号对应的银行名称，若填大小额行号则送大小额行号对应的银行名称）
     */
    public String getAcctOpenBranchName() {
        return this.AcctOpenBranchName;
    }

    /**
     * Set STRING(150)，会员的待绑定账户的开户行名称（若大小额行号不填则送超级网银号对应的银行名称，若填大小额行号则送大小额行号对应的银行名称）
     * @param AcctOpenBranchName STRING(150)，会员的待绑定账户的开户行名称（若大小额行号不填则送超级网银号对应的银行名称，若填大小额行号则送大小额行号对应的银行名称）
     */
    public void setAcctOpenBranchName(String AcctOpenBranchName) {
        this.AcctOpenBranchName = AcctOpenBranchName;
    }

    /**
     * Get STRING(30)，会员的手机号（手机号须由长度为11位的数字构成） 
     * @return Mobile STRING(30)，会员的手机号（手机号须由长度为11位的数字构成）
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set STRING(30)，会员的手机号（手机号须由长度为11位的数字构成）
     * @param Mobile STRING(30)，会员的手机号（手机号须由长度为11位的数字构成）
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get String(22)，商户号（签约客户号） 
     * @return MrchCode String(22)，商户号（签约客户号）
     */
    public String getMrchCode() {
        return this.MrchCode;
    }

    /**
     * Set String(22)，商户号（签约客户号）
     * @param MrchCode String(22)，商户号（签约客户号）
     */
    public void setMrchCode(String MrchCode) {
        this.MrchCode = MrchCode;
    }

    /**
     * Get STRING(20)，会员的待绑定账户的开户行的联行号（本他行类型为他行的情况下，此字段和下一个字段至少一个不为空） 
     * @return CnapsBranchId STRING(20)，会员的待绑定账户的开户行的联行号（本他行类型为他行的情况下，此字段和下一个字段至少一个不为空）
     */
    public String getCnapsBranchId() {
        return this.CnapsBranchId;
    }

    /**
     * Set STRING(20)，会员的待绑定账户的开户行的联行号（本他行类型为他行的情况下，此字段和下一个字段至少一个不为空）
     * @param CnapsBranchId STRING(20)，会员的待绑定账户的开户行的联行号（本他行类型为他行的情况下，此字段和下一个字段至少一个不为空）
     */
    public void setCnapsBranchId(String CnapsBranchId) {
        this.CnapsBranchId = CnapsBranchId;
    }

    /**
     * Get STRING(20)，会员的待绑定账户的开户行的超级网银行号（本他行类型为他行的情况下，此字段和上一个字段至少一个不为空） 
     * @return EiconBankBranchId STRING(20)，会员的待绑定账户的开户行的超级网银行号（本他行类型为他行的情况下，此字段和上一个字段至少一个不为空）
     */
    public String getEiconBankBranchId() {
        return this.EiconBankBranchId;
    }

    /**
     * Set STRING(20)，会员的待绑定账户的开户行的超级网银行号（本他行类型为他行的情况下，此字段和上一个字段至少一个不为空）
     * @param EiconBankBranchId STRING(20)，会员的待绑定账户的开户行的超级网银行号（本他行类型为他行的情况下，此字段和上一个字段至少一个不为空）
     */
    public void setEiconBankBranchId(String EiconBankBranchId) {
        this.EiconBankBranchId = EiconBankBranchId;
    }

    /**
     * Get STRING(1027)，保留域 
     * @return ReservedMsg STRING(1027)，保留域
     */
    public String getReservedMsg() {
        return this.ReservedMsg;
    }

    /**
     * Set STRING(1027)，保留域
     * @param ReservedMsg STRING(1027)，保留域
     */
    public void setReservedMsg(String ReservedMsg) {
        this.ReservedMsg = ReservedMsg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TranNetMemberCode", this.TranNetMemberCode);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);
        this.setParamSimple(map, prefix + "MemberGlobalType", this.MemberGlobalType);
        this.setParamSimple(map, prefix + "MemberGlobalId", this.MemberGlobalId);
        this.setParamSimple(map, prefix + "MemberAcctNo", this.MemberAcctNo);
        this.setParamSimple(map, prefix + "BankType", this.BankType);
        this.setParamSimple(map, prefix + "AcctOpenBranchName", this.AcctOpenBranchName);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "CnapsBranchId", this.CnapsBranchId);
        this.setParamSimple(map, prefix + "EiconBankBranchId", this.EiconBankBranchId);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);

    }
}

