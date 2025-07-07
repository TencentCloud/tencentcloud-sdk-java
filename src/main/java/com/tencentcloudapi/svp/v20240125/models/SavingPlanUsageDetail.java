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
package com.tencentcloudapi.svp.v20240125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SavingPlanUsageDetail extends AbstractModel {

    /**
    * 节省计划类型
    */
    @SerializedName("SpType")
    @Expose
    private String SpType;

    /**
    * 节省计划状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 累计抵扣的金额（单位：元）
    */
    @SerializedName("DeductAmount")
    @Expose
    private String DeductAmount;

    /**
    * 累计承诺消费金额（单位：元）
    */
    @SerializedName("PromiseAmount")
    @Expose
    private String PromiseAmount;

    /**
    * 累计净节省金额（单位：元）
    */
    @SerializedName("NetSavings")
    @Expose
    private String NetSavings;

    /**
    * 使用率
    */
    @SerializedName("UtilizationRate")
    @Expose
    private Float UtilizationRate;

    /**
    * 累计流失金额（单位：元）
    */
    @SerializedName("LossAmount")
    @Expose
    private String LossAmount;

    /**
    * 累计按量计费预期金额（单位：元）
    */
    @SerializedName("DosageAmount")
    @Expose
    private String DosageAmount;

    /**
    * 累计成本金额（单位：元）
    */
    @SerializedName("CostAmount")
    @Expose
    private String CostAmount;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
     * Get 节省计划类型 
     * @return SpType 节省计划类型
     */
    public String getSpType() {
        return this.SpType;
    }

    /**
     * Set 节省计划类型
     * @param SpType 节省计划类型
     */
    public void setSpType(String SpType) {
        this.SpType = SpType;
    }

    /**
     * Get 节省计划状态 
     * @return Status 节省计划状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 节省计划状态
     * @param Status 节省计划状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 累计抵扣的金额（单位：元） 
     * @return DeductAmount 累计抵扣的金额（单位：元）
     */
    public String getDeductAmount() {
        return this.DeductAmount;
    }

    /**
     * Set 累计抵扣的金额（单位：元）
     * @param DeductAmount 累计抵扣的金额（单位：元）
     */
    public void setDeductAmount(String DeductAmount) {
        this.DeductAmount = DeductAmount;
    }

    /**
     * Get 累计承诺消费金额（单位：元） 
     * @return PromiseAmount 累计承诺消费金额（单位：元）
     */
    public String getPromiseAmount() {
        return this.PromiseAmount;
    }

    /**
     * Set 累计承诺消费金额（单位：元）
     * @param PromiseAmount 累计承诺消费金额（单位：元）
     */
    public void setPromiseAmount(String PromiseAmount) {
        this.PromiseAmount = PromiseAmount;
    }

    /**
     * Get 累计净节省金额（单位：元） 
     * @return NetSavings 累计净节省金额（单位：元）
     */
    public String getNetSavings() {
        return this.NetSavings;
    }

    /**
     * Set 累计净节省金额（单位：元）
     * @param NetSavings 累计净节省金额（单位：元）
     */
    public void setNetSavings(String NetSavings) {
        this.NetSavings = NetSavings;
    }

    /**
     * Get 使用率 
     * @return UtilizationRate 使用率
     */
    public Float getUtilizationRate() {
        return this.UtilizationRate;
    }

    /**
     * Set 使用率
     * @param UtilizationRate 使用率
     */
    public void setUtilizationRate(Float UtilizationRate) {
        this.UtilizationRate = UtilizationRate;
    }

    /**
     * Get 累计流失金额（单位：元） 
     * @return LossAmount 累计流失金额（单位：元）
     */
    public String getLossAmount() {
        return this.LossAmount;
    }

    /**
     * Set 累计流失金额（单位：元）
     * @param LossAmount 累计流失金额（单位：元）
     */
    public void setLossAmount(String LossAmount) {
        this.LossAmount = LossAmount;
    }

    /**
     * Get 累计按量计费预期金额（单位：元） 
     * @return DosageAmount 累计按量计费预期金额（单位：元）
     */
    public String getDosageAmount() {
        return this.DosageAmount;
    }

    /**
     * Set 累计按量计费预期金额（单位：元）
     * @param DosageAmount 累计按量计费预期金额（单位：元）
     */
    public void setDosageAmount(String DosageAmount) {
        this.DosageAmount = DosageAmount;
    }

    /**
     * Get 累计成本金额（单位：元） 
     * @return CostAmount 累计成本金额（单位：元）
     */
    public String getCostAmount() {
        return this.CostAmount;
    }

    /**
     * Set 累计成本金额（单位：元）
     * @param CostAmount 累计成本金额（单位：元）
     */
    public void setCostAmount(String CostAmount) {
        this.CostAmount = CostAmount;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    public SavingPlanUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SavingPlanUsageDetail(SavingPlanUsageDetail source) {
        if (source.SpType != null) {
            this.SpType = new String(source.SpType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DeductAmount != null) {
            this.DeductAmount = new String(source.DeductAmount);
        }
        if (source.PromiseAmount != null) {
            this.PromiseAmount = new String(source.PromiseAmount);
        }
        if (source.NetSavings != null) {
            this.NetSavings = new String(source.NetSavings);
        }
        if (source.UtilizationRate != null) {
            this.UtilizationRate = new Float(source.UtilizationRate);
        }
        if (source.LossAmount != null) {
            this.LossAmount = new String(source.LossAmount);
        }
        if (source.DosageAmount != null) {
            this.DosageAmount = new String(source.DosageAmount);
        }
        if (source.CostAmount != null) {
            this.CostAmount = new String(source.CostAmount);
        }
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpType", this.SpType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DeductAmount", this.DeductAmount);
        this.setParamSimple(map, prefix + "PromiseAmount", this.PromiseAmount);
        this.setParamSimple(map, prefix + "NetSavings", this.NetSavings);
        this.setParamSimple(map, prefix + "UtilizationRate", this.UtilizationRate);
        this.setParamSimple(map, prefix + "LossAmount", this.LossAmount);
        this.setParamSimple(map, prefix + "DosageAmount", this.DosageAmount);
        this.setParamSimple(map, prefix + "CostAmount", this.CostAmount);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);

    }
}

