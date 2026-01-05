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
    * <p>节省计划资源id</p>
    */
    @SerializedName("SpId")
    @Expose
    private String SpId;

    /**
    * <p>节省计划类型</p>
    */
    @SerializedName("SpType")
    @Expose
    private String SpType;

    /**
    * <p>节省计划状态</p>枚举值：<ul><li> 1：  生效</li><li> 2： 失效 </li><li> 3： 作废</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>累计抵扣的金额（单位：元）</p>
    */
    @SerializedName("DeductAmount")
    @Expose
    private String DeductAmount;

    /**
    * <p>累计承诺消费金额（单位：元）</p>
    */
    @SerializedName("PromiseAmount")
    @Expose
    private String PromiseAmount;

    /**
    * <p>累计净节省金额（单位：元）</p>
    */
    @SerializedName("NetSavings")
    @Expose
    private String NetSavings;

    /**
    * <p>使用率</p>
    */
    @SerializedName("UtilizationRate")
    @Expose
    private Float UtilizationRate;

    /**
    * <p>累计流失金额（单位：元）</p>
    */
    @SerializedName("LossAmount")
    @Expose
    private String LossAmount;

    /**
    * <p>累计按量计费预期金额（单位：元）</p>
    */
    @SerializedName("DosageAmount")
    @Expose
    private String DosageAmount;

    /**
    * <p>累计成本金额（单位：元）</p>
    */
    @SerializedName("CostAmount")
    @Expose
    private String CostAmount;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
     * Get <p>节省计划资源id</p> 
     * @return SpId <p>节省计划资源id</p>
     */
    public String getSpId() {
        return this.SpId;
    }

    /**
     * Set <p>节省计划资源id</p>
     * @param SpId <p>节省计划资源id</p>
     */
    public void setSpId(String SpId) {
        this.SpId = SpId;
    }

    /**
     * Get <p>节省计划类型</p> 
     * @return SpType <p>节省计划类型</p>
     */
    public String getSpType() {
        return this.SpType;
    }

    /**
     * Set <p>节省计划类型</p>
     * @param SpType <p>节省计划类型</p>
     */
    public void setSpType(String SpType) {
        this.SpType = SpType;
    }

    /**
     * Get <p>节省计划状态</p>枚举值：<ul><li> 1：  生效</li><li> 2： 失效 </li><li> 3： 作废</li></ul> 
     * @return Status <p>节省计划状态</p>枚举值：<ul><li> 1：  生效</li><li> 2： 失效 </li><li> 3： 作废</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>节省计划状态</p>枚举值：<ul><li> 1：  生效</li><li> 2： 失效 </li><li> 3： 作废</li></ul>
     * @param Status <p>节省计划状态</p>枚举值：<ul><li> 1：  生效</li><li> 2： 失效 </li><li> 3： 作废</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>累计抵扣的金额（单位：元）</p> 
     * @return DeductAmount <p>累计抵扣的金额（单位：元）</p>
     */
    public String getDeductAmount() {
        return this.DeductAmount;
    }

    /**
     * Set <p>累计抵扣的金额（单位：元）</p>
     * @param DeductAmount <p>累计抵扣的金额（单位：元）</p>
     */
    public void setDeductAmount(String DeductAmount) {
        this.DeductAmount = DeductAmount;
    }

    /**
     * Get <p>累计承诺消费金额（单位：元）</p> 
     * @return PromiseAmount <p>累计承诺消费金额（单位：元）</p>
     */
    public String getPromiseAmount() {
        return this.PromiseAmount;
    }

    /**
     * Set <p>累计承诺消费金额（单位：元）</p>
     * @param PromiseAmount <p>累计承诺消费金额（单位：元）</p>
     */
    public void setPromiseAmount(String PromiseAmount) {
        this.PromiseAmount = PromiseAmount;
    }

    /**
     * Get <p>累计净节省金额（单位：元）</p> 
     * @return NetSavings <p>累计净节省金额（单位：元）</p>
     */
    public String getNetSavings() {
        return this.NetSavings;
    }

    /**
     * Set <p>累计净节省金额（单位：元）</p>
     * @param NetSavings <p>累计净节省金额（单位：元）</p>
     */
    public void setNetSavings(String NetSavings) {
        this.NetSavings = NetSavings;
    }

    /**
     * Get <p>使用率</p> 
     * @return UtilizationRate <p>使用率</p>
     */
    public Float getUtilizationRate() {
        return this.UtilizationRate;
    }

    /**
     * Set <p>使用率</p>
     * @param UtilizationRate <p>使用率</p>
     */
    public void setUtilizationRate(Float UtilizationRate) {
        this.UtilizationRate = UtilizationRate;
    }

    /**
     * Get <p>累计流失金额（单位：元）</p> 
     * @return LossAmount <p>累计流失金额（单位：元）</p>
     */
    public String getLossAmount() {
        return this.LossAmount;
    }

    /**
     * Set <p>累计流失金额（单位：元）</p>
     * @param LossAmount <p>累计流失金额（单位：元）</p>
     */
    public void setLossAmount(String LossAmount) {
        this.LossAmount = LossAmount;
    }

    /**
     * Get <p>累计按量计费预期金额（单位：元）</p> 
     * @return DosageAmount <p>累计按量计费预期金额（单位：元）</p>
     */
    public String getDosageAmount() {
        return this.DosageAmount;
    }

    /**
     * Set <p>累计按量计费预期金额（单位：元）</p>
     * @param DosageAmount <p>累计按量计费预期金额（单位：元）</p>
     */
    public void setDosageAmount(String DosageAmount) {
        this.DosageAmount = DosageAmount;
    }

    /**
     * Get <p>累计成本金额（单位：元）</p> 
     * @return CostAmount <p>累计成本金额（单位：元）</p>
     */
    public String getCostAmount() {
        return this.CostAmount;
    }

    /**
     * Set <p>累计成本金额（单位：元）</p>
     * @param CostAmount <p>累计成本金额（单位：元）</p>
     */
    public void setCostAmount(String CostAmount) {
        this.CostAmount = CostAmount;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
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
        if (source.SpId != null) {
            this.SpId = new String(source.SpId);
        }
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
        this.setParamSimple(map, prefix + "SpId", this.SpId);
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

