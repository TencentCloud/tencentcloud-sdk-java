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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumptionRegionSummaryDataItem extends AbstractModel {

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 折后总价
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * 趋势
    */
    @SerializedName("Trend")
    @Expose
    private ConsumptionSummaryTrend Trend;

    /**
    * 产品消费详情
    */
    @SerializedName("Business")
    @Expose
    private ConsumptionBusinessSummaryDataItem [] Business;

    /**
    * 现金
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 代金券
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * 赠送金
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * 分成金
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域名称 
     * @return RegionName 地域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
     * @param RegionName 地域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 折后总价 
     * @return RealTotalCost 折后总价
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 折后总价
     * @param RealTotalCost 折后总价
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 趋势 
     * @return Trend 趋势
     */
    public ConsumptionSummaryTrend getTrend() {
        return this.Trend;
    }

    /**
     * Set 趋势
     * @param Trend 趋势
     */
    public void setTrend(ConsumptionSummaryTrend Trend) {
        this.Trend = Trend;
    }

    /**
     * Get 产品消费详情 
     * @return Business 产品消费详情
     */
    public ConsumptionBusinessSummaryDataItem [] getBusiness() {
        return this.Business;
    }

    /**
     * Set 产品消费详情
     * @param Business 产品消费详情
     */
    public void setBusiness(ConsumptionBusinessSummaryDataItem [] Business) {
        this.Business = Business;
    }

    /**
     * Get 现金 
     * @return CashPayAmount 现金
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set 现金
     * @param CashPayAmount 现金
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get 代金券 
     * @return VoucherPayAmount 代金券
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set 代金券
     * @param VoucherPayAmount 代金券
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get 赠送金 
     * @return IncentivePayAmount 赠送金
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set 赠送金
     * @param IncentivePayAmount 赠送金
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get 分成金 
     * @return TransferPayAmount 分成金
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set 分成金
     * @param TransferPayAmount 分成金
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    public ConsumptionRegionSummaryDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionRegionSummaryDataItem(ConsumptionRegionSummaryDataItem source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.Trend != null) {
            this.Trend = new ConsumptionSummaryTrend(source.Trend);
        }
        if (source.Business != null) {
            this.Business = new ConsumptionBusinessSummaryDataItem[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new ConsumptionBusinessSummaryDataItem(source.Business[i]);
            }
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamObj(map, prefix + "Trend.", this.Trend);
        this.setParamArrayObj(map, prefix + "Business.", this.Business);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);

    }
}

