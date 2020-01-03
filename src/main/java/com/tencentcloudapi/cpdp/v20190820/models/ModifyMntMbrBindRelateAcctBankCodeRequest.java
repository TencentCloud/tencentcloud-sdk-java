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

public class ModifyMntMbrBindRelateAcctBankCodeRequest extends AbstractModel{

    /**
    * String(22)，商户号（签约客户号）
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(50)，见证子账户的账号
    */
    @SerializedName("SubAcctNo")
    @Expose
    private String SubAcctNo;

    /**
    * STRING(50)，会员绑定账号
    */
    @SerializedName("MemberBindAcctNo")
    @Expose
    private String MemberBindAcctNo;

    /**
    * STRING(150)，开户行名称（若大小额行号不填则送超级网银号对应的银行名称，若填大小额行号则送大小额行号对应的银行名称）
    */
    @SerializedName("AcctOpenBranchName")
    @Expose
    private String AcctOpenBranchName;

    /**
    * STRING(20)，大小额行号（CnapsBranchId和EiconBankBranchId两者二选一必填）
    */
    @SerializedName("CnapsBranchId")
    @Expose
    private String CnapsBranchId;

    /**
    * STRING(20)，超级网银行号
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
     * Get STRING(50)，见证子账户的账号 
     * @return SubAcctNo STRING(50)，见证子账户的账号
     */
    public String getSubAcctNo() {
        return this.SubAcctNo;
    }

    /**
     * Set STRING(50)，见证子账户的账号
     * @param SubAcctNo STRING(50)，见证子账户的账号
     */
    public void setSubAcctNo(String SubAcctNo) {
        this.SubAcctNo = SubAcctNo;
    }

    /**
     * Get STRING(50)，会员绑定账号 
     * @return MemberBindAcctNo STRING(50)，会员绑定账号
     */
    public String getMemberBindAcctNo() {
        return this.MemberBindAcctNo;
    }

    /**
     * Set STRING(50)，会员绑定账号
     * @param MemberBindAcctNo STRING(50)，会员绑定账号
     */
    public void setMemberBindAcctNo(String MemberBindAcctNo) {
        this.MemberBindAcctNo = MemberBindAcctNo;
    }

    /**
     * Get STRING(150)，开户行名称（若大小额行号不填则送超级网银号对应的银行名称，若填大小额行号则送大小额行号对应的银行名称） 
     * @return AcctOpenBranchName STRING(150)，开户行名称（若大小额行号不填则送超级网银号对应的银行名称，若填大小额行号则送大小额行号对应的银行名称）
     */
    public String getAcctOpenBranchName() {
        return this.AcctOpenBranchName;
    }

    /**
     * Set STRING(150)，开户行名称（若大小额行号不填则送超级网银号对应的银行名称，若填大小额行号则送大小额行号对应的银行名称）
     * @param AcctOpenBranchName STRING(150)，开户行名称（若大小额行号不填则送超级网银号对应的银行名称，若填大小额行号则送大小额行号对应的银行名称）
     */
    public void setAcctOpenBranchName(String AcctOpenBranchName) {
        this.AcctOpenBranchName = AcctOpenBranchName;
    }

    /**
     * Get STRING(20)，大小额行号（CnapsBranchId和EiconBankBranchId两者二选一必填） 
     * @return CnapsBranchId STRING(20)，大小额行号（CnapsBranchId和EiconBankBranchId两者二选一必填）
     */
    public String getCnapsBranchId() {
        return this.CnapsBranchId;
    }

    /**
     * Set STRING(20)，大小额行号（CnapsBranchId和EiconBankBranchId两者二选一必填）
     * @param CnapsBranchId STRING(20)，大小额行号（CnapsBranchId和EiconBankBranchId两者二选一必填）
     */
    public void setCnapsBranchId(String CnapsBranchId) {
        this.CnapsBranchId = CnapsBranchId;
    }

    /**
     * Get STRING(20)，超级网银行号 
     * @return EiconBankBranchId STRING(20)，超级网银行号
     */
    public String getEiconBankBranchId() {
        return this.EiconBankBranchId;
    }

    /**
     * Set STRING(20)，超级网银行号
     * @param EiconBankBranchId STRING(20)，超级网银行号
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
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "MemberBindAcctNo", this.MemberBindAcctNo);
        this.setParamSimple(map, prefix + "AcctOpenBranchName", this.AcctOpenBranchName);
        this.setParamSimple(map, prefix + "CnapsBranchId", this.CnapsBranchId);
        this.setParamSimple(map, prefix + "EiconBankBranchId", this.EiconBankBranchId);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);

    }
}

