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

public class ConsumptionBusinessSummaryDataItem extends AbstractModel {

    /**
    * <p>产品名称代码</p>
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * <p>产品名称</p>
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * <p>折后总价</p>
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * <p>费用趋势</p>
    */
    @SerializedName("Trend")
    @Expose
    private ConsumptionSummaryTrend Trend;

    /**
    * <p>现金</p>
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * <p>赠送金</p>
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * <p>代金券</p>
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * <p>分成金</p>
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * <p>地域名称（仅在地域汇总中展示）</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>待分摊金额</p><p>剩余待分摊的折后总金额</p>
    */
    @SerializedName("LeftRealTotalCost")
    @Expose
    private String LeftRealTotalCost;

    /**
     * Get <p>产品名称代码</p> 
     * @return BusinessCode <p>产品名称代码</p>
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set <p>产品名称代码</p>
     * @param BusinessCode <p>产品名称代码</p>
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get <p>产品名称</p> 
     * @return BusinessCodeName <p>产品名称</p>
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set <p>产品名称</p>
     * @param BusinessCodeName <p>产品名称</p>
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get <p>折后总价</p> 
     * @return RealTotalCost <p>折后总价</p>
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set <p>折后总价</p>
     * @param RealTotalCost <p>折后总价</p>
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get <p>费用趋势</p> 
     * @return Trend <p>费用趋势</p>
     */
    public ConsumptionSummaryTrend getTrend() {
        return this.Trend;
    }

    /**
     * Set <p>费用趋势</p>
     * @param Trend <p>费用趋势</p>
     */
    public void setTrend(ConsumptionSummaryTrend Trend) {
        this.Trend = Trend;
    }

    /**
     * Get <p>现金</p> 
     * @return CashPayAmount <p>现金</p>
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set <p>现金</p>
     * @param CashPayAmount <p>现金</p>
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get <p>赠送金</p> 
     * @return IncentivePayAmount <p>赠送金</p>
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set <p>赠送金</p>
     * @param IncentivePayAmount <p>赠送金</p>
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get <p>代金券</p> 
     * @return VoucherPayAmount <p>代金券</p>
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set <p>代金券</p>
     * @param VoucherPayAmount <p>代金券</p>
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get <p>分成金</p> 
     * @return TransferPayAmount <p>分成金</p>
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set <p>分成金</p>
     * @param TransferPayAmount <p>分成金</p>
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get <p>地域名称（仅在地域汇总中展示）</p> 
     * @return RegionName <p>地域名称（仅在地域汇总中展示）</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域名称（仅在地域汇总中展示）</p>
     * @param RegionName <p>地域名称（仅在地域汇总中展示）</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>待分摊金额</p><p>剩余待分摊的折后总金额</p> 
     * @return LeftRealTotalCost <p>待分摊金额</p><p>剩余待分摊的折后总金额</p>
     */
    public String getLeftRealTotalCost() {
        return this.LeftRealTotalCost;
    }

    /**
     * Set <p>待分摊金额</p><p>剩余待分摊的折后总金额</p>
     * @param LeftRealTotalCost <p>待分摊金额</p><p>剩余待分摊的折后总金额</p>
     */
    public void setLeftRealTotalCost(String LeftRealTotalCost) {
        this.LeftRealTotalCost = LeftRealTotalCost;
    }

    public ConsumptionBusinessSummaryDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionBusinessSummaryDataItem(ConsumptionBusinessSummaryDataItem source) {
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.Trend != null) {
            this.Trend = new ConsumptionSummaryTrend(source.Trend);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.LeftRealTotalCost != null) {
            this.LeftRealTotalCost = new String(source.LeftRealTotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamObj(map, prefix + "Trend.", this.Trend);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "LeftRealTotalCost", this.LeftRealTotalCost);

    }
}

