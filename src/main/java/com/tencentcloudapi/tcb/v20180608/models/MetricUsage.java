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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricUsage extends AbstractModel {

    /**
    * <p>指标名称</p>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * <p>资源类型</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>原始资源用量</p>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * <p>资源点用量</p>
    */
    @SerializedName("CreditsValue")
    @Expose
    private Float CreditsValue;

    /**
    * <p>计费周期类型，取值为hourly/daily</p>
    */
    @SerializedName("BillingCycleType")
    @Expose
    private String BillingCycleType;

    /**
    * <p>原始资源用量单位</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * <p>原始资源用量明细</p>
    */
    @SerializedName("ValueDetailList")
    @Expose
    private ValueDetail [] ValueDetailList;

    /**
    * <p>资源点套餐内用量</p>
    */
    @SerializedName("DeductValue")
    @Expose
    private Float DeductValue;

    /**
    * <p>资源点资源包用量</p>
    */
    @SerializedName("PackageDeductValue")
    @Expose
    private Float PackageDeductValue;

    /**
    * <p>资源点按量用量</p>
    */
    @SerializedName("ReportValue")
    @Expose
    private Float ReportValue;

    /**
     * Get <p>指标名称</p> 
     * @return MetricName <p>指标名称</p>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set <p>指标名称</p>
     * @param MetricName <p>指标名称</p>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get <p>资源类型</p> 
     * @return ResourceType <p>资源类型</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型</p>
     * @param ResourceType <p>资源类型</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>原始资源用量</p> 
     * @return Value <p>原始资源用量</p>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set <p>原始资源用量</p>
     * @param Value <p>原始资源用量</p>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get <p>资源点用量</p> 
     * @return CreditsValue <p>资源点用量</p>
     */
    public Float getCreditsValue() {
        return this.CreditsValue;
    }

    /**
     * Set <p>资源点用量</p>
     * @param CreditsValue <p>资源点用量</p>
     */
    public void setCreditsValue(Float CreditsValue) {
        this.CreditsValue = CreditsValue;
    }

    /**
     * Get <p>计费周期类型，取值为hourly/daily</p> 
     * @return BillingCycleType <p>计费周期类型，取值为hourly/daily</p>
     */
    public String getBillingCycleType() {
        return this.BillingCycleType;
    }

    /**
     * Set <p>计费周期类型，取值为hourly/daily</p>
     * @param BillingCycleType <p>计费周期类型，取值为hourly/daily</p>
     */
    public void setBillingCycleType(String BillingCycleType) {
        this.BillingCycleType = BillingCycleType;
    }

    /**
     * Get <p>原始资源用量单位</p> 
     * @return Unit <p>原始资源用量单位</p>
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>原始资源用量单位</p>
     * @param Unit <p>原始资源用量单位</p>
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get <p>原始资源用量明细</p> 
     * @return ValueDetailList <p>原始资源用量明细</p>
     */
    public ValueDetail [] getValueDetailList() {
        return this.ValueDetailList;
    }

    /**
     * Set <p>原始资源用量明细</p>
     * @param ValueDetailList <p>原始资源用量明细</p>
     */
    public void setValueDetailList(ValueDetail [] ValueDetailList) {
        this.ValueDetailList = ValueDetailList;
    }

    /**
     * Get <p>资源点套餐内用量</p> 
     * @return DeductValue <p>资源点套餐内用量</p>
     */
    public Float getDeductValue() {
        return this.DeductValue;
    }

    /**
     * Set <p>资源点套餐内用量</p>
     * @param DeductValue <p>资源点套餐内用量</p>
     */
    public void setDeductValue(Float DeductValue) {
        this.DeductValue = DeductValue;
    }

    /**
     * Get <p>资源点资源包用量</p> 
     * @return PackageDeductValue <p>资源点资源包用量</p>
     */
    public Float getPackageDeductValue() {
        return this.PackageDeductValue;
    }

    /**
     * Set <p>资源点资源包用量</p>
     * @param PackageDeductValue <p>资源点资源包用量</p>
     */
    public void setPackageDeductValue(Float PackageDeductValue) {
        this.PackageDeductValue = PackageDeductValue;
    }

    /**
     * Get <p>资源点按量用量</p> 
     * @return ReportValue <p>资源点按量用量</p>
     */
    public Float getReportValue() {
        return this.ReportValue;
    }

    /**
     * Set <p>资源点按量用量</p>
     * @param ReportValue <p>资源点按量用量</p>
     */
    public void setReportValue(Float ReportValue) {
        this.ReportValue = ReportValue;
    }

    public MetricUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricUsage(MetricUsage source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.CreditsValue != null) {
            this.CreditsValue = new Float(source.CreditsValue);
        }
        if (source.BillingCycleType != null) {
            this.BillingCycleType = new String(source.BillingCycleType);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.ValueDetailList != null) {
            this.ValueDetailList = new ValueDetail[source.ValueDetailList.length];
            for (int i = 0; i < source.ValueDetailList.length; i++) {
                this.ValueDetailList[i] = new ValueDetail(source.ValueDetailList[i]);
            }
        }
        if (source.DeductValue != null) {
            this.DeductValue = new Float(source.DeductValue);
        }
        if (source.PackageDeductValue != null) {
            this.PackageDeductValue = new Float(source.PackageDeductValue);
        }
        if (source.ReportValue != null) {
            this.ReportValue = new Float(source.ReportValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "CreditsValue", this.CreditsValue);
        this.setParamSimple(map, prefix + "BillingCycleType", this.BillingCycleType);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamArrayObj(map, prefix + "ValueDetailList.", this.ValueDetailList);
        this.setParamSimple(map, prefix + "DeductValue", this.DeductValue);
        this.setParamSimple(map, prefix + "PackageDeductValue", this.PackageDeductValue);
        this.setParamSimple(map, prefix + "ReportValue", this.ReportValue);

    }
}

