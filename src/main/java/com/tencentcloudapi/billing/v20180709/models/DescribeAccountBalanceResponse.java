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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountBalanceResponse extends AbstractModel{

    /**
    * 接口做过变更,为兼容老接口,本字段与RealBalance相同,为当前真实可用余额,单位 分
    */
    @SerializedName("Balance")
    @Expose
    private Long Balance;

    /**
    * 查询的用户Uin
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 当前真实可用余额,单位 分
    */
    @SerializedName("RealBalance")
    @Expose
    private Float RealBalance;

    /**
    * 现金账户余额,单位 分
    */
    @SerializedName("CashAccountBalance")
    @Expose
    private Float CashAccountBalance;

    /**
    * 收益转入账户余额,单位 分
    */
    @SerializedName("IncomeIntoAccountBalance")
    @Expose
    private Float IncomeIntoAccountBalance;

    /**
    * 赠送账户余额,单位 分
    */
    @SerializedName("PresentAccountBalance")
    @Expose
    private Float PresentAccountBalance;

    /**
    * 冻结金额,单位 分
    */
    @SerializedName("FreezeAmount")
    @Expose
    private Float FreezeAmount;

    /**
    * 欠费金额,单位 分
    */
    @SerializedName("OweAmount")
    @Expose
    private Float OweAmount;

    /**
    * 是否允许欠费消费
    */
    @SerializedName("IsAllowArrears")
    @Expose
    private Boolean IsAllowArrears;

    /**
    * 是否限制信用额度
    */
    @SerializedName("IsCreditLimited")
    @Expose
    private Boolean IsCreditLimited;

    /**
    * 信用额度
    */
    @SerializedName("CreditAmount")
    @Expose
    private Float CreditAmount;

    /**
    * 可用信用额度
    */
    @SerializedName("CreditBalance")
    @Expose
    private Float CreditBalance;

    /**
    * 真实可用信用额度
    */
    @SerializedName("RealCreditBalance")
    @Expose
    private Float RealCreditBalance;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 接口做过变更,为兼容老接口,本字段与RealBalance相同,为当前真实可用余额,单位 分 
     * @return Balance 接口做过变更,为兼容老接口,本字段与RealBalance相同,为当前真实可用余额,单位 分
     */
    public Long getBalance() {
        return this.Balance;
    }

    /**
     * Set 接口做过变更,为兼容老接口,本字段与RealBalance相同,为当前真实可用余额,单位 分
     * @param Balance 接口做过变更,为兼容老接口,本字段与RealBalance相同,为当前真实可用余额,单位 分
     */
    public void setBalance(Long Balance) {
        this.Balance = Balance;
    }

    /**
     * Get 查询的用户Uin 
     * @return Uin 查询的用户Uin
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set 查询的用户Uin
     * @param Uin 查询的用户Uin
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 当前真实可用余额,单位 分 
     * @return RealBalance 当前真实可用余额,单位 分
     */
    public Float getRealBalance() {
        return this.RealBalance;
    }

    /**
     * Set 当前真实可用余额,单位 分
     * @param RealBalance 当前真实可用余额,单位 分
     */
    public void setRealBalance(Float RealBalance) {
        this.RealBalance = RealBalance;
    }

    /**
     * Get 现金账户余额,单位 分 
     * @return CashAccountBalance 现金账户余额,单位 分
     */
    public Float getCashAccountBalance() {
        return this.CashAccountBalance;
    }

    /**
     * Set 现金账户余额,单位 分
     * @param CashAccountBalance 现金账户余额,单位 分
     */
    public void setCashAccountBalance(Float CashAccountBalance) {
        this.CashAccountBalance = CashAccountBalance;
    }

    /**
     * Get 收益转入账户余额,单位 分 
     * @return IncomeIntoAccountBalance 收益转入账户余额,单位 分
     */
    public Float getIncomeIntoAccountBalance() {
        return this.IncomeIntoAccountBalance;
    }

    /**
     * Set 收益转入账户余额,单位 分
     * @param IncomeIntoAccountBalance 收益转入账户余额,单位 分
     */
    public void setIncomeIntoAccountBalance(Float IncomeIntoAccountBalance) {
        this.IncomeIntoAccountBalance = IncomeIntoAccountBalance;
    }

    /**
     * Get 赠送账户余额,单位 分 
     * @return PresentAccountBalance 赠送账户余额,单位 分
     */
    public Float getPresentAccountBalance() {
        return this.PresentAccountBalance;
    }

    /**
     * Set 赠送账户余额,单位 分
     * @param PresentAccountBalance 赠送账户余额,单位 分
     */
    public void setPresentAccountBalance(Float PresentAccountBalance) {
        this.PresentAccountBalance = PresentAccountBalance;
    }

    /**
     * Get 冻结金额,单位 分 
     * @return FreezeAmount 冻结金额,单位 分
     */
    public Float getFreezeAmount() {
        return this.FreezeAmount;
    }

    /**
     * Set 冻结金额,单位 分
     * @param FreezeAmount 冻结金额,单位 分
     */
    public void setFreezeAmount(Float FreezeAmount) {
        this.FreezeAmount = FreezeAmount;
    }

    /**
     * Get 欠费金额,单位 分 
     * @return OweAmount 欠费金额,单位 分
     */
    public Float getOweAmount() {
        return this.OweAmount;
    }

    /**
     * Set 欠费金额,单位 分
     * @param OweAmount 欠费金额,单位 分
     */
    public void setOweAmount(Float OweAmount) {
        this.OweAmount = OweAmount;
    }

    /**
     * Get 是否允许欠费消费 
     * @return IsAllowArrears 是否允许欠费消费
     */
    public Boolean getIsAllowArrears() {
        return this.IsAllowArrears;
    }

    /**
     * Set 是否允许欠费消费
     * @param IsAllowArrears 是否允许欠费消费
     */
    public void setIsAllowArrears(Boolean IsAllowArrears) {
        this.IsAllowArrears = IsAllowArrears;
    }

    /**
     * Get 是否限制信用额度 
     * @return IsCreditLimited 是否限制信用额度
     */
    public Boolean getIsCreditLimited() {
        return this.IsCreditLimited;
    }

    /**
     * Set 是否限制信用额度
     * @param IsCreditLimited 是否限制信用额度
     */
    public void setIsCreditLimited(Boolean IsCreditLimited) {
        this.IsCreditLimited = IsCreditLimited;
    }

    /**
     * Get 信用额度 
     * @return CreditAmount 信用额度
     */
    public Float getCreditAmount() {
        return this.CreditAmount;
    }

    /**
     * Set 信用额度
     * @param CreditAmount 信用额度
     */
    public void setCreditAmount(Float CreditAmount) {
        this.CreditAmount = CreditAmount;
    }

    /**
     * Get 可用信用额度 
     * @return CreditBalance 可用信用额度
     */
    public Float getCreditBalance() {
        return this.CreditBalance;
    }

    /**
     * Set 可用信用额度
     * @param CreditBalance 可用信用额度
     */
    public void setCreditBalance(Float CreditBalance) {
        this.CreditBalance = CreditBalance;
    }

    /**
     * Get 真实可用信用额度 
     * @return RealCreditBalance 真实可用信用额度
     */
    public Float getRealCreditBalance() {
        return this.RealCreditBalance;
    }

    /**
     * Set 真实可用信用额度
     * @param RealCreditBalance 真实可用信用额度
     */
    public void setRealCreditBalance(Float RealCreditBalance) {
        this.RealCreditBalance = RealCreditBalance;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAccountBalanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountBalanceResponse(DescribeAccountBalanceResponse source) {
        if (source.Balance != null) {
            this.Balance = new Long(source.Balance);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.RealBalance != null) {
            this.RealBalance = new Float(source.RealBalance);
        }
        if (source.CashAccountBalance != null) {
            this.CashAccountBalance = new Float(source.CashAccountBalance);
        }
        if (source.IncomeIntoAccountBalance != null) {
            this.IncomeIntoAccountBalance = new Float(source.IncomeIntoAccountBalance);
        }
        if (source.PresentAccountBalance != null) {
            this.PresentAccountBalance = new Float(source.PresentAccountBalance);
        }
        if (source.FreezeAmount != null) {
            this.FreezeAmount = new Float(source.FreezeAmount);
        }
        if (source.OweAmount != null) {
            this.OweAmount = new Float(source.OweAmount);
        }
        if (source.IsAllowArrears != null) {
            this.IsAllowArrears = new Boolean(source.IsAllowArrears);
        }
        if (source.IsCreditLimited != null) {
            this.IsCreditLimited = new Boolean(source.IsCreditLimited);
        }
        if (source.CreditAmount != null) {
            this.CreditAmount = new Float(source.CreditAmount);
        }
        if (source.CreditBalance != null) {
            this.CreditBalance = new Float(source.CreditBalance);
        }
        if (source.RealCreditBalance != null) {
            this.RealCreditBalance = new Float(source.RealCreditBalance);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Balance", this.Balance);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RealBalance", this.RealBalance);
        this.setParamSimple(map, prefix + "CashAccountBalance", this.CashAccountBalance);
        this.setParamSimple(map, prefix + "IncomeIntoAccountBalance", this.IncomeIntoAccountBalance);
        this.setParamSimple(map, prefix + "PresentAccountBalance", this.PresentAccountBalance);
        this.setParamSimple(map, prefix + "FreezeAmount", this.FreezeAmount);
        this.setParamSimple(map, prefix + "OweAmount", this.OweAmount);
        this.setParamSimple(map, prefix + "IsAllowArrears", this.IsAllowArrears);
        this.setParamSimple(map, prefix + "IsCreditLimited", this.IsCreditLimited);
        this.setParamSimple(map, prefix + "CreditAmount", this.CreditAmount);
        this.setParamSimple(map, prefix + "CreditBalance", this.CreditBalance);
        this.setParamSimple(map, prefix + "RealCreditBalance", this.RealCreditBalance);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

