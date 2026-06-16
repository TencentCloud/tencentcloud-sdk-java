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

public class EnvPkgCreditsUsage extends AbstractModel {

    /**
    * <p>环境id</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>模块</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>module总资源点用量</p>
    */
    @SerializedName("CreditsValue")
    @Expose
    private Float CreditsValue;

    /**
    * <p>指标用量明细</p>
    */
    @SerializedName("MetricUsageDetail")
    @Expose
    private MetricUsage [] MetricUsageDetail;

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
     * Get <p>环境id</p> 
     * @return EnvId <p>环境id</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境id</p>
     * @param EnvId <p>环境id</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>模块</p> 
     * @return Module <p>模块</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>模块</p>
     * @param Module <p>模块</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>module总资源点用量</p> 
     * @return CreditsValue <p>module总资源点用量</p>
     */
    public Float getCreditsValue() {
        return this.CreditsValue;
    }

    /**
     * Set <p>module总资源点用量</p>
     * @param CreditsValue <p>module总资源点用量</p>
     */
    public void setCreditsValue(Float CreditsValue) {
        this.CreditsValue = CreditsValue;
    }

    /**
     * Get <p>指标用量明细</p> 
     * @return MetricUsageDetail <p>指标用量明细</p>
     */
    public MetricUsage [] getMetricUsageDetail() {
        return this.MetricUsageDetail;
    }

    /**
     * Set <p>指标用量明细</p>
     * @param MetricUsageDetail <p>指标用量明细</p>
     */
    public void setMetricUsageDetail(MetricUsage [] MetricUsageDetail) {
        this.MetricUsageDetail = MetricUsageDetail;
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

    public EnvPkgCreditsUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnvPkgCreditsUsage(EnvPkgCreditsUsage source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.CreditsValue != null) {
            this.CreditsValue = new Float(source.CreditsValue);
        }
        if (source.MetricUsageDetail != null) {
            this.MetricUsageDetail = new MetricUsage[source.MetricUsageDetail.length];
            for (int i = 0; i < source.MetricUsageDetail.length; i++) {
                this.MetricUsageDetail[i] = new MetricUsage(source.MetricUsageDetail[i]);
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
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "CreditsValue", this.CreditsValue);
        this.setParamArrayObj(map, prefix + "MetricUsageDetail.", this.MetricUsageDetail);
        this.setParamSimple(map, prefix + "DeductValue", this.DeductValue);
        this.setParamSimple(map, prefix + "PackageDeductValue", this.PackageDeductValue);
        this.setParamSimple(map, prefix + "ReportValue", this.ReportValue);

    }
}

