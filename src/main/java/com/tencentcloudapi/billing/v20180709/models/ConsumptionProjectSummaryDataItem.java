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

public class ConsumptionProjectSummaryDataItem extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>项目名称</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>折后总价</p>
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * <p>趋势</p>
    */
    @SerializedName("Trend")
    @Expose
    private ConsumptionSummaryTrend Trend;

    /**
    * <p>产品消耗详情</p>
    */
    @SerializedName("Business")
    @Expose
    private ConsumptionBusinessSummaryDataItem [] Business;

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
    * <p>待分摊金额</p><p>剩余待分摊的折后总金额</p>
    */
    @SerializedName("LeftRealTotalCost")
    @Expose
    private String LeftRealTotalCost;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>项目名称</p> 
     * @return ProjectName <p>项目名称</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称</p>
     * @param ProjectName <p>项目名称</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
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
     * Get <p>趋势</p> 
     * @return Trend <p>趋势</p>
     */
    public ConsumptionSummaryTrend getTrend() {
        return this.Trend;
    }

    /**
     * Set <p>趋势</p>
     * @param Trend <p>趋势</p>
     */
    public void setTrend(ConsumptionSummaryTrend Trend) {
        this.Trend = Trend;
    }

    /**
     * Get <p>产品消耗详情</p> 
     * @return Business <p>产品消耗详情</p>
     */
    public ConsumptionBusinessSummaryDataItem [] getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>产品消耗详情</p>
     * @param Business <p>产品消耗详情</p>
     */
    public void setBusiness(ConsumptionBusinessSummaryDataItem [] Business) {
        this.Business = Business;
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

    public ConsumptionProjectSummaryDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionProjectSummaryDataItem(ConsumptionProjectSummaryDataItem source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
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
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
        }
        if (source.LeftRealTotalCost != null) {
            this.LeftRealTotalCost = new String(source.LeftRealTotalCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamObj(map, prefix + "Trend.", this.Trend);
        this.setParamArrayObj(map, prefix + "Business.", this.Business);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "LeftRealTotalCost", this.LeftRealTotalCost);

    }
}

