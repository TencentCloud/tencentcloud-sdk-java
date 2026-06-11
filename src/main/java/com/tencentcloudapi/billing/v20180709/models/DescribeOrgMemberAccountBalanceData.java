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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrgMemberAccountBalanceData extends AbstractModel {

    /**
    * <p>成员账号Uin</p>
    */
    @SerializedName("MemberUin")
    @Expose
    private String MemberUin;

    /**
    * <p>成员名称</p>
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
    * <p>是否为信用账户</p>
    */
    @SerializedName("IsCreditAccount")
    @Expose
    private Boolean IsCreditAccount;

    /**
    * <p>当前真实可用余额</p><p>单位：分</p>
    */
    @SerializedName("RealBalance")
    @Expose
    private Float RealBalance;

    /**
    * <p>现金账户余额</p><p>单位：分</p>
    */
    @SerializedName("CashAccountBalance")
    @Expose
    private Float CashAccountBalance;

    /**
    * <p>信用额度</p><p>单位：分</p><p>信用额度 = 基础信用额度 + 临时信用额度</p>
    */
    @SerializedName("CreditAmount")
    @Expose
    private Float CreditAmount;

    /**
    * <p>临时信用额度</p><p>单位：分</p>
    */
    @SerializedName("TempCredit")
    @Expose
    private Float TempCredit;

    /**
    * <p>基础信用额度</p><p>单位：分</p>
    */
    @SerializedName("BasicCreditAmount")
    @Expose
    private Float BasicCreditAmount;

    /**
    * <p>欠费金额</p><p>单位：分</p>
    */
    @SerializedName("OweAmount")
    @Expose
    private Float OweAmount;

    /**
     * Get <p>成员账号Uin</p> 
     * @return MemberUin <p>成员账号Uin</p>
     */
    public String getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set <p>成员账号Uin</p>
     * @param MemberUin <p>成员账号Uin</p>
     */
    public void setMemberUin(String MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get <p>成员名称</p> 
     * @return MemberName <p>成员名称</p>
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set <p>成员名称</p>
     * @param MemberName <p>成员名称</p>
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    /**
     * Get <p>是否为信用账户</p> 
     * @return IsCreditAccount <p>是否为信用账户</p>
     */
    public Boolean getIsCreditAccount() {
        return this.IsCreditAccount;
    }

    /**
     * Set <p>是否为信用账户</p>
     * @param IsCreditAccount <p>是否为信用账户</p>
     */
    public void setIsCreditAccount(Boolean IsCreditAccount) {
        this.IsCreditAccount = IsCreditAccount;
    }

    /**
     * Get <p>当前真实可用余额</p><p>单位：分</p> 
     * @return RealBalance <p>当前真实可用余额</p><p>单位：分</p>
     */
    public Float getRealBalance() {
        return this.RealBalance;
    }

    /**
     * Set <p>当前真实可用余额</p><p>单位：分</p>
     * @param RealBalance <p>当前真实可用余额</p><p>单位：分</p>
     */
    public void setRealBalance(Float RealBalance) {
        this.RealBalance = RealBalance;
    }

    /**
     * Get <p>现金账户余额</p><p>单位：分</p> 
     * @return CashAccountBalance <p>现金账户余额</p><p>单位：分</p>
     */
    public Float getCashAccountBalance() {
        return this.CashAccountBalance;
    }

    /**
     * Set <p>现金账户余额</p><p>单位：分</p>
     * @param CashAccountBalance <p>现金账户余额</p><p>单位：分</p>
     */
    public void setCashAccountBalance(Float CashAccountBalance) {
        this.CashAccountBalance = CashAccountBalance;
    }

    /**
     * Get <p>信用额度</p><p>单位：分</p><p>信用额度 = 基础信用额度 + 临时信用额度</p> 
     * @return CreditAmount <p>信用额度</p><p>单位：分</p><p>信用额度 = 基础信用额度 + 临时信用额度</p>
     */
    public Float getCreditAmount() {
        return this.CreditAmount;
    }

    /**
     * Set <p>信用额度</p><p>单位：分</p><p>信用额度 = 基础信用额度 + 临时信用额度</p>
     * @param CreditAmount <p>信用额度</p><p>单位：分</p><p>信用额度 = 基础信用额度 + 临时信用额度</p>
     */
    public void setCreditAmount(Float CreditAmount) {
        this.CreditAmount = CreditAmount;
    }

    /**
     * Get <p>临时信用额度</p><p>单位：分</p> 
     * @return TempCredit <p>临时信用额度</p><p>单位：分</p>
     */
    public Float getTempCredit() {
        return this.TempCredit;
    }

    /**
     * Set <p>临时信用额度</p><p>单位：分</p>
     * @param TempCredit <p>临时信用额度</p><p>单位：分</p>
     */
    public void setTempCredit(Float TempCredit) {
        this.TempCredit = TempCredit;
    }

    /**
     * Get <p>基础信用额度</p><p>单位：分</p> 
     * @return BasicCreditAmount <p>基础信用额度</p><p>单位：分</p>
     */
    public Float getBasicCreditAmount() {
        return this.BasicCreditAmount;
    }

    /**
     * Set <p>基础信用额度</p><p>单位：分</p>
     * @param BasicCreditAmount <p>基础信用额度</p><p>单位：分</p>
     */
    public void setBasicCreditAmount(Float BasicCreditAmount) {
        this.BasicCreditAmount = BasicCreditAmount;
    }

    /**
     * Get <p>欠费金额</p><p>单位：分</p> 
     * @return OweAmount <p>欠费金额</p><p>单位：分</p>
     */
    public Float getOweAmount() {
        return this.OweAmount;
    }

    /**
     * Set <p>欠费金额</p><p>单位：分</p>
     * @param OweAmount <p>欠费金额</p><p>单位：分</p>
     */
    public void setOweAmount(Float OweAmount) {
        this.OweAmount = OweAmount;
    }

    public DescribeOrgMemberAccountBalanceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrgMemberAccountBalanceData(DescribeOrgMemberAccountBalanceData source) {
        if (source.MemberUin != null) {
            this.MemberUin = new String(source.MemberUin);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
        if (source.IsCreditAccount != null) {
            this.IsCreditAccount = new Boolean(source.IsCreditAccount);
        }
        if (source.RealBalance != null) {
            this.RealBalance = new Float(source.RealBalance);
        }
        if (source.CashAccountBalance != null) {
            this.CashAccountBalance = new Float(source.CashAccountBalance);
        }
        if (source.CreditAmount != null) {
            this.CreditAmount = new Float(source.CreditAmount);
        }
        if (source.TempCredit != null) {
            this.TempCredit = new Float(source.TempCredit);
        }
        if (source.BasicCreditAmount != null) {
            this.BasicCreditAmount = new Float(source.BasicCreditAmount);
        }
        if (source.OweAmount != null) {
            this.OweAmount = new Float(source.OweAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);
        this.setParamSimple(map, prefix + "IsCreditAccount", this.IsCreditAccount);
        this.setParamSimple(map, prefix + "RealBalance", this.RealBalance);
        this.setParamSimple(map, prefix + "CashAccountBalance", this.CashAccountBalance);
        this.setParamSimple(map, prefix + "CreditAmount", this.CreditAmount);
        this.setParamSimple(map, prefix + "TempCredit", this.TempCredit);
        this.setParamSimple(map, prefix + "BasicCreditAmount", this.BasicCreditAmount);
        this.setParamSimple(map, prefix + "OweAmount", this.OweAmount);

    }
}

