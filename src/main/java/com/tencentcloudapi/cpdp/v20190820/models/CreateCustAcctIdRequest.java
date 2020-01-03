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

public class CreateCustAcctIdRequest extends AbstractModel{

    /**
    * STRING(2)，功能标志（1: 开户; 3: 销户）
    */
    @SerializedName("FunctionFlag")
    @Expose
    private String FunctionFlag;

    /**
    * STRING(50)，资金汇总账号（即收单资金归集入账的账号）
    */
    @SerializedName("FundSummaryAcctNo")
    @Expose
    private String FundSummaryAcctNo;

    /**
    * STRING(32)，交易网会员代码（平台端的用户ID，需要保证唯一性，可数字字母混合，如HY_120）
    */
    @SerializedName("TranNetMemberCode")
    @Expose
    private String TranNetMemberCode;

    /**
    * STRING(10)，会员属性（00-普通子账户(默认); SH-商户子账户）
    */
    @SerializedName("MemberProperty")
    @Expose
    private String MemberProperty;

    /**
    * STRING(30)，手机号码
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
    * String(2)，是否为自营业务（0位非自营，1为自营）
    */
    @SerializedName("SelfBusiness")
    @Expose
    private Boolean SelfBusiness;

    /**
    * String(64)，联系人
    */
    @SerializedName("ContactName")
    @Expose
    private String ContactName;

    /**
    * String(64)，子账户名称
    */
    @SerializedName("SubAcctName")
    @Expose
    private String SubAcctName;

    /**
    * String(64)，子账户简称
    */
    @SerializedName("SubAcctShortName")
    @Expose
    private String SubAcctShortName;

    /**
    * String(4)，子账户类型（0: 个人子账户; 1: 企业子账户）
    */
    @SerializedName("SubAcctType")
    @Expose
    private Long SubAcctType;

    /**
    * STRING(150)，用户昵称
    */
    @SerializedName("UserNickname")
    @Expose
    private String UserNickname;

    /**
    * STRING(150)，邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * STRING(1027)，保留域
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

    /**
     * Get STRING(2)，功能标志（1: 开户; 3: 销户） 
     * @return FunctionFlag STRING(2)，功能标志（1: 开户; 3: 销户）
     */
    public String getFunctionFlag() {
        return this.FunctionFlag;
    }

    /**
     * Set STRING(2)，功能标志（1: 开户; 3: 销户）
     * @param FunctionFlag STRING(2)，功能标志（1: 开户; 3: 销户）
     */
    public void setFunctionFlag(String FunctionFlag) {
        this.FunctionFlag = FunctionFlag;
    }

    /**
     * Get STRING(50)，资金汇总账号（即收单资金归集入账的账号） 
     * @return FundSummaryAcctNo STRING(50)，资金汇总账号（即收单资金归集入账的账号）
     */
    public String getFundSummaryAcctNo() {
        return this.FundSummaryAcctNo;
    }

    /**
     * Set STRING(50)，资金汇总账号（即收单资金归集入账的账号）
     * @param FundSummaryAcctNo STRING(50)，资金汇总账号（即收单资金归集入账的账号）
     */
    public void setFundSummaryAcctNo(String FundSummaryAcctNo) {
        this.FundSummaryAcctNo = FundSummaryAcctNo;
    }

    /**
     * Get STRING(32)，交易网会员代码（平台端的用户ID，需要保证唯一性，可数字字母混合，如HY_120） 
     * @return TranNetMemberCode STRING(32)，交易网会员代码（平台端的用户ID，需要保证唯一性，可数字字母混合，如HY_120）
     */
    public String getTranNetMemberCode() {
        return this.TranNetMemberCode;
    }

    /**
     * Set STRING(32)，交易网会员代码（平台端的用户ID，需要保证唯一性，可数字字母混合，如HY_120）
     * @param TranNetMemberCode STRING(32)，交易网会员代码（平台端的用户ID，需要保证唯一性，可数字字母混合，如HY_120）
     */
    public void setTranNetMemberCode(String TranNetMemberCode) {
        this.TranNetMemberCode = TranNetMemberCode;
    }

    /**
     * Get STRING(10)，会员属性（00-普通子账户(默认); SH-商户子账户） 
     * @return MemberProperty STRING(10)，会员属性（00-普通子账户(默认); SH-商户子账户）
     */
    public String getMemberProperty() {
        return this.MemberProperty;
    }

    /**
     * Set STRING(10)，会员属性（00-普通子账户(默认); SH-商户子账户）
     * @param MemberProperty STRING(10)，会员属性（00-普通子账户(默认); SH-商户子账户）
     */
    public void setMemberProperty(String MemberProperty) {
        this.MemberProperty = MemberProperty;
    }

    /**
     * Get STRING(30)，手机号码 
     * @return Mobile STRING(30)，手机号码
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set STRING(30)，手机号码
     * @param Mobile STRING(30)，手机号码
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
     * Get String(2)，是否为自营业务（0位非自营，1为自营） 
     * @return SelfBusiness String(2)，是否为自营业务（0位非自营，1为自营）
     */
    public Boolean getSelfBusiness() {
        return this.SelfBusiness;
    }

    /**
     * Set String(2)，是否为自营业务（0位非自营，1为自营）
     * @param SelfBusiness String(2)，是否为自营业务（0位非自营，1为自营）
     */
    public void setSelfBusiness(Boolean SelfBusiness) {
        this.SelfBusiness = SelfBusiness;
    }

    /**
     * Get String(64)，联系人 
     * @return ContactName String(64)，联系人
     */
    public String getContactName() {
        return this.ContactName;
    }

    /**
     * Set String(64)，联系人
     * @param ContactName String(64)，联系人
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * Get String(64)，子账户名称 
     * @return SubAcctName String(64)，子账户名称
     */
    public String getSubAcctName() {
        return this.SubAcctName;
    }

    /**
     * Set String(64)，子账户名称
     * @param SubAcctName String(64)，子账户名称
     */
    public void setSubAcctName(String SubAcctName) {
        this.SubAcctName = SubAcctName;
    }

    /**
     * Get String(64)，子账户简称 
     * @return SubAcctShortName String(64)，子账户简称
     */
    public String getSubAcctShortName() {
        return this.SubAcctShortName;
    }

    /**
     * Set String(64)，子账户简称
     * @param SubAcctShortName String(64)，子账户简称
     */
    public void setSubAcctShortName(String SubAcctShortName) {
        this.SubAcctShortName = SubAcctShortName;
    }

    /**
     * Get String(4)，子账户类型（0: 个人子账户; 1: 企业子账户） 
     * @return SubAcctType String(4)，子账户类型（0: 个人子账户; 1: 企业子账户）
     */
    public Long getSubAcctType() {
        return this.SubAcctType;
    }

    /**
     * Set String(4)，子账户类型（0: 个人子账户; 1: 企业子账户）
     * @param SubAcctType String(4)，子账户类型（0: 个人子账户; 1: 企业子账户）
     */
    public void setSubAcctType(Long SubAcctType) {
        this.SubAcctType = SubAcctType;
    }

    /**
     * Get STRING(150)，用户昵称 
     * @return UserNickname STRING(150)，用户昵称
     */
    public String getUserNickname() {
        return this.UserNickname;
    }

    /**
     * Set STRING(150)，用户昵称
     * @param UserNickname STRING(150)，用户昵称
     */
    public void setUserNickname(String UserNickname) {
        this.UserNickname = UserNickname;
    }

    /**
     * Get STRING(150)，邮箱 
     * @return Email STRING(150)，邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set STRING(150)，邮箱
     * @param Email STRING(150)，邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
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
        this.setParamSimple(map, prefix + "FunctionFlag", this.FunctionFlag);
        this.setParamSimple(map, prefix + "FundSummaryAcctNo", this.FundSummaryAcctNo);
        this.setParamSimple(map, prefix + "TranNetMemberCode", this.TranNetMemberCode);
        this.setParamSimple(map, prefix + "MemberProperty", this.MemberProperty);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "SelfBusiness", this.SelfBusiness);
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);
        this.setParamSimple(map, prefix + "SubAcctName", this.SubAcctName);
        this.setParamSimple(map, prefix + "SubAcctShortName", this.SubAcctShortName);
        this.setParamSimple(map, prefix + "SubAcctType", this.SubAcctType);
        this.setParamSimple(map, prefix + "UserNickname", this.UserNickname);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);

    }
}

