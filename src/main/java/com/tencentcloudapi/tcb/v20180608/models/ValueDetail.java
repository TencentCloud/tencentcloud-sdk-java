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

public class ValueDetail extends AbstractModel {

    /**
    * <p>时间</p>
    */
    @SerializedName("CalcTime")
    @Expose
    private String CalcTime;

    /**
    * <p>原始资源用量</p>
    */
    @SerializedName("RawValue")
    @Expose
    private Long RawValue;

    /**
    * <p>资源点用量</p>
    */
    @SerializedName("CreditsValue")
    @Expose
    private Float CreditsValue;

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
     * Get <p>时间</p> 
     * @return CalcTime <p>时间</p>
     */
    public String getCalcTime() {
        return this.CalcTime;
    }

    /**
     * Set <p>时间</p>
     * @param CalcTime <p>时间</p>
     */
    public void setCalcTime(String CalcTime) {
        this.CalcTime = CalcTime;
    }

    /**
     * Get <p>原始资源用量</p> 
     * @return RawValue <p>原始资源用量</p>
     */
    public Long getRawValue() {
        return this.RawValue;
    }

    /**
     * Set <p>原始资源用量</p>
     * @param RawValue <p>原始资源用量</p>
     */
    public void setRawValue(Long RawValue) {
        this.RawValue = RawValue;
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

    public ValueDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueDetail(ValueDetail source) {
        if (source.CalcTime != null) {
            this.CalcTime = new String(source.CalcTime);
        }
        if (source.RawValue != null) {
            this.RawValue = new Long(source.RawValue);
        }
        if (source.CreditsValue != null) {
            this.CreditsValue = new Float(source.CreditsValue);
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
        this.setParamSimple(map, prefix + "CalcTime", this.CalcTime);
        this.setParamSimple(map, prefix + "RawValue", this.RawValue);
        this.setParamSimple(map, prefix + "CreditsValue", this.CreditsValue);
        this.setParamSimple(map, prefix + "DeductValue", this.DeductValue);
        this.setParamSimple(map, prefix + "PackageDeductValue", this.PackageDeductValue);
        this.setParamSimple(map, prefix + "ReportValue", this.ReportValue);

    }
}

