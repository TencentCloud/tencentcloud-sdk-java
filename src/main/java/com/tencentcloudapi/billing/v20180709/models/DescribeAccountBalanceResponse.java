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

public class DescribeAccountBalanceResponse extends AbstractModel {

    /**
    * <p>接口做过变更,为兼容老接口,本字段与RealBalance相同,为当前真实可用余额,单位 分</p>
    */
    @SerializedName("Balance")
    @Expose
    private Long Balance;

    /**
    * <p>查询的用户Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>当前真实可用余额,单位 分。RealBalance=CashAccountBalance+IncomeIntoAccountBalance+PresentAccountBalance-FreezeAmount-OweAmount</p><p>单位：分</p>
    */
    @SerializedName("RealBalance")
    @Expose
    private Float RealBalance;

    /**
    * <p>现金账户余额,单位 分</p>
    */
    @SerializedName("CashAccountBalance")
    @Expose
    private Float CashAccountBalance;

    /**
    * <p>收益转入账户余额,单位 分</p>
    */
    @SerializedName("IncomeIntoAccountBalance")
    @Expose
    private Float IncomeIntoAccountBalance;

    /**
    * <p>赠送账户余额,单位 分</p>
    */
    @SerializedName("PresentAccountBalance")
    @Expose
    private Float PresentAccountBalance;

    /**
    * <p>冻结金额,单位 分</p>
    */
    @SerializedName("FreezeAmount")
    @Expose
    private Float FreezeAmount;

    /**
    * <p>欠费金额,单位 分</p>
    */
    @SerializedName("OweAmount")
    @Expose
    private Float OweAmount;

    /**
    * <p>是否允许欠费消费</p>
    */
    @SerializedName("IsAllowArrears")
    @Expose
    private Boolean IsAllowArrears;

    /**
    * <p>是否限制信用额度</p>
    */
    @SerializedName("IsCreditLimited")
    @Expose
    private Boolean IsCreditLimited;

    /**
    * <p>信用额度,单位 分</p>
    */
    @SerializedName("CreditAmount")
    @Expose
    private Float CreditAmount;

    /**
    * <p>可用信用额度,单位 分。CreditBalance=CashAccountBalance+IncomeIntoAccountBalance+PresentAccountBalance+CreditAmount-OweAmount</p><p>单位：分</p>
    */
    @SerializedName("CreditBalance")
    @Expose
    private Float CreditBalance;

    /**
    * <p>真实可用信用额度,单位 分。RealCreditBalance=CreditBalance-FreezeAmount</p><p>单位：分</p>
    */
    @SerializedName("RealCreditBalance")
    @Expose
    private Float RealCreditBalance;

    /**
    * <p>临时额度，单位 分</p>
    */
    @SerializedName("TempCredit")
    @Expose
    private Float TempCredit;

    /**
    * <p>临时额度详情</p>
    */
    @SerializedName("TempAmountInfoList")
    @Expose
    private UinTempAmountModel [] TempAmountInfoList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>接口做过变更,为兼容老接口,本字段与RealBalance相同,为当前真实可用余额,单位 分</p> 
     * @return Balance <p>接口做过变更,为兼容老接口,本字段与RealBalance相同,为当前真实可用余额,单位 分</p>
     */
    public Long getBalance() {
        return this.Balance;
    }

    /**
     * Set <p>接口做过变更,为兼容老接口,本字段与RealBalance相同,为当前真实可用余额,单位 分</p>
     * @param Balance <p>接口做过变更,为兼容老接口,本字段与RealBalance相同,为当前真实可用余额,单位 分</p>
     */
    public void setBalance(Long Balance) {
        this.Balance = Balance;
    }

    /**
     * Get <p>查询的用户Uin</p> 
     * @return Uin <p>查询的用户Uin</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>查询的用户Uin</p>
     * @param Uin <p>查询的用户Uin</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>当前真实可用余额,单位 分。RealBalance=CashAccountBalance+IncomeIntoAccountBalance+PresentAccountBalance-FreezeAmount-OweAmount</p><p>单位：分</p> 
     * @return RealBalance <p>当前真实可用余额,单位 分。RealBalance=CashAccountBalance+IncomeIntoAccountBalance+PresentAccountBalance-FreezeAmount-OweAmount</p><p>单位：分</p>
     */
    public Float getRealBalance() {
        return this.RealBalance;
    }

    /**
     * Set <p>当前真实可用余额,单位 分。RealBalance=CashAccountBalance+IncomeIntoAccountBalance+PresentAccountBalance-FreezeAmount-OweAmount</p><p>单位：分</p>
     * @param RealBalance <p>当前真实可用余额,单位 分。RealBalance=CashAccountBalance+IncomeIntoAccountBalance+PresentAccountBalance-FreezeAmount-OweAmount</p><p>单位：分</p>
     */
    public void setRealBalance(Float RealBalance) {
        this.RealBalance = RealBalance;
    }

    /**
     * Get <p>现金账户余额,单位 分</p> 
     * @return CashAccountBalance <p>现金账户余额,单位 分</p>
     */
    public Float getCashAccountBalance() {
        return this.CashAccountBalance;
    }

    /**
     * Set <p>现金账户余额,单位 分</p>
     * @param CashAccountBalance <p>现金账户余额,单位 分</p>
     */
    public void setCashAccountBalance(Float CashAccountBalance) {
        this.CashAccountBalance = CashAccountBalance;
    }

    /**
     * Get <p>收益转入账户余额,单位 分</p> 
     * @return IncomeIntoAccountBalance <p>收益转入账户余额,单位 分</p>
     */
    public Float getIncomeIntoAccountBalance() {
        return this.IncomeIntoAccountBalance;
    }

    /**
     * Set <p>收益转入账户余额,单位 分</p>
     * @param IncomeIntoAccountBalance <p>收益转入账户余额,单位 分</p>
     */
    public void setIncomeIntoAccountBalance(Float IncomeIntoAccountBalance) {
        this.IncomeIntoAccountBalance = IncomeIntoAccountBalance;
    }

    /**
     * Get <p>赠送账户余额,单位 分</p> 
     * @return PresentAccountBalance <p>赠送账户余额,单位 分</p>
     */
    public Float getPresentAccountBalance() {
        return this.PresentAccountBalance;
    }

    /**
     * Set <p>赠送账户余额,单位 分</p>
     * @param PresentAccountBalance <p>赠送账户余额,单位 分</p>
     */
    public void setPresentAccountBalance(Float PresentAccountBalance) {
        this.PresentAccountBalance = PresentAccountBalance;
    }

    /**
     * Get <p>冻结金额,单位 分</p> 
     * @return FreezeAmount <p>冻结金额,单位 分</p>
     */
    public Float getFreezeAmount() {
        return this.FreezeAmount;
    }

    /**
     * Set <p>冻结金额,单位 分</p>
     * @param FreezeAmount <p>冻结金额,单位 分</p>
     */
    public void setFreezeAmount(Float FreezeAmount) {
        this.FreezeAmount = FreezeAmount;
    }

    /**
     * Get <p>欠费金额,单位 分</p> 
     * @return OweAmount <p>欠费金额,单位 分</p>
     */
    public Float getOweAmount() {
        return this.OweAmount;
    }

    /**
     * Set <p>欠费金额,单位 分</p>
     * @param OweAmount <p>欠费金额,单位 分</p>
     */
    public void setOweAmount(Float OweAmount) {
        this.OweAmount = OweAmount;
    }

    /**
     * Get <p>是否允许欠费消费</p> 
     * @return IsAllowArrears <p>是否允许欠费消费</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getIsAllowArrears() {
        return this.IsAllowArrears;
    }

    /**
     * Set <p>是否允许欠费消费</p>
     * @param IsAllowArrears <p>是否允许欠费消费</p>
     * @deprecated
     */
    @Deprecated
    public void setIsAllowArrears(Boolean IsAllowArrears) {
        this.IsAllowArrears = IsAllowArrears;
    }

    /**
     * Get <p>是否限制信用额度</p> 
     * @return IsCreditLimited <p>是否限制信用额度</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getIsCreditLimited() {
        return this.IsCreditLimited;
    }

    /**
     * Set <p>是否限制信用额度</p>
     * @param IsCreditLimited <p>是否限制信用额度</p>
     * @deprecated
     */
    @Deprecated
    public void setIsCreditLimited(Boolean IsCreditLimited) {
        this.IsCreditLimited = IsCreditLimited;
    }

    /**
     * Get <p>信用额度,单位 分</p> 
     * @return CreditAmount <p>信用额度,单位 分</p>
     */
    public Float getCreditAmount() {
        return this.CreditAmount;
    }

    /**
     * Set <p>信用额度,单位 分</p>
     * @param CreditAmount <p>信用额度,单位 分</p>
     */
    public void setCreditAmount(Float CreditAmount) {
        this.CreditAmount = CreditAmount;
    }

    /**
     * Get <p>可用信用额度,单位 分。CreditBalance=CashAccountBalance+IncomeIntoAccountBalance+PresentAccountBalance+CreditAmount-OweAmount</p><p>单位：分</p> 
     * @return CreditBalance <p>可用信用额度,单位 分。CreditBalance=CashAccountBalance+IncomeIntoAccountBalance+PresentAccountBalance+CreditAmount-OweAmount</p><p>单位：分</p>
     */
    public Float getCreditBalance() {
        return this.CreditBalance;
    }

    /**
     * Set <p>可用信用额度,单位 分。CreditBalance=CashAccountBalance+IncomeIntoAccountBalance+PresentAccountBalance+CreditAmount-OweAmount</p><p>单位：分</p>
     * @param CreditBalance <p>可用信用额度,单位 分。CreditBalance=CashAccountBalance+IncomeIntoAccountBalance+PresentAccountBalance+CreditAmount-OweAmount</p><p>单位：分</p>
     */
    public void setCreditBalance(Float CreditBalance) {
        this.CreditBalance = CreditBalance;
    }

    /**
     * Get <p>真实可用信用额度,单位 分。RealCreditBalance=CreditBalance-FreezeAmount</p><p>单位：分</p> 
     * @return RealCreditBalance <p>真实可用信用额度,单位 分。RealCreditBalance=CreditBalance-FreezeAmount</p><p>单位：分</p>
     */
    public Float getRealCreditBalance() {
        return this.RealCreditBalance;
    }

    /**
     * Set <p>真实可用信用额度,单位 分。RealCreditBalance=CreditBalance-FreezeAmount</p><p>单位：分</p>
     * @param RealCreditBalance <p>真实可用信用额度,单位 分。RealCreditBalance=CreditBalance-FreezeAmount</p><p>单位：分</p>
     */
    public void setRealCreditBalance(Float RealCreditBalance) {
        this.RealCreditBalance = RealCreditBalance;
    }

    /**
     * Get <p>临时额度，单位 分</p> 
     * @return TempCredit <p>临时额度，单位 分</p>
     */
    public Float getTempCredit() {
        return this.TempCredit;
    }

    /**
     * Set <p>临时额度，单位 分</p>
     * @param TempCredit <p>临时额度，单位 分</p>
     */
    public void setTempCredit(Float TempCredit) {
        this.TempCredit = TempCredit;
    }

    /**
     * Get <p>临时额度详情</p> 
     * @return TempAmountInfoList <p>临时额度详情</p>
     */
    public UinTempAmountModel [] getTempAmountInfoList() {
        return this.TempAmountInfoList;
    }

    /**
     * Set <p>临时额度详情</p>
     * @param TempAmountInfoList <p>临时额度详情</p>
     */
    public void setTempAmountInfoList(UinTempAmountModel [] TempAmountInfoList) {
        this.TempAmountInfoList = TempAmountInfoList;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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
        if (source.TempCredit != null) {
            this.TempCredit = new Float(source.TempCredit);
        }
        if (source.TempAmountInfoList != null) {
            this.TempAmountInfoList = new UinTempAmountModel[source.TempAmountInfoList.length];
            for (int i = 0; i < source.TempAmountInfoList.length; i++) {
                this.TempAmountInfoList[i] = new UinTempAmountModel(source.TempAmountInfoList[i]);
            }
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
        this.setParamSimple(map, prefix + "TempCredit", this.TempCredit);
        this.setParamArrayObj(map, prefix + "TempAmountInfoList.", this.TempAmountInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

