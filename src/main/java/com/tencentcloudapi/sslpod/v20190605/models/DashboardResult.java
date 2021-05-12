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
package com.tencentcloudapi.sslpod.v20190605.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DashboardResult extends AbstractModel{

    /**
    * 安全等级图表
    */
    @SerializedName("SecurityLevelPie")
    @Expose
    private ChartNameValue [] SecurityLevelPie;

    /**
    * 证书品牌图表
    */
    @SerializedName("CertBrandsPie")
    @Expose
    private ChartNameValue [] CertBrandsPie;

    /**
    * 证书有效时间图表
    */
    @SerializedName("CertValidTimePie")
    @Expose
    private ChartNameValue [] CertValidTimePie;

    /**
    * 证书类型图表
    */
    @SerializedName("CertTypePie")
    @Expose
    private ChartNameValue [] CertTypePie;

    /**
    * ssl bugs图表
    */
    @SerializedName("SSLBugsLoopholeHistogram")
    @Expose
    private ChartHistogram [] SSLBugsLoopholeHistogram;

    /**
    * 合规图表
    */
    @SerializedName("ComplianceHistogram")
    @Expose
    private ChartHistogram [] ComplianceHistogram;

    /**
     * Get 安全等级图表 
     * @return SecurityLevelPie 安全等级图表
     */
    public ChartNameValue [] getSecurityLevelPie() {
        return this.SecurityLevelPie;
    }

    /**
     * Set 安全等级图表
     * @param SecurityLevelPie 安全等级图表
     */
    public void setSecurityLevelPie(ChartNameValue [] SecurityLevelPie) {
        this.SecurityLevelPie = SecurityLevelPie;
    }

    /**
     * Get 证书品牌图表 
     * @return CertBrandsPie 证书品牌图表
     */
    public ChartNameValue [] getCertBrandsPie() {
        return this.CertBrandsPie;
    }

    /**
     * Set 证书品牌图表
     * @param CertBrandsPie 证书品牌图表
     */
    public void setCertBrandsPie(ChartNameValue [] CertBrandsPie) {
        this.CertBrandsPie = CertBrandsPie;
    }

    /**
     * Get 证书有效时间图表 
     * @return CertValidTimePie 证书有效时间图表
     */
    public ChartNameValue [] getCertValidTimePie() {
        return this.CertValidTimePie;
    }

    /**
     * Set 证书有效时间图表
     * @param CertValidTimePie 证书有效时间图表
     */
    public void setCertValidTimePie(ChartNameValue [] CertValidTimePie) {
        this.CertValidTimePie = CertValidTimePie;
    }

    /**
     * Get 证书类型图表 
     * @return CertTypePie 证书类型图表
     */
    public ChartNameValue [] getCertTypePie() {
        return this.CertTypePie;
    }

    /**
     * Set 证书类型图表
     * @param CertTypePie 证书类型图表
     */
    public void setCertTypePie(ChartNameValue [] CertTypePie) {
        this.CertTypePie = CertTypePie;
    }

    /**
     * Get ssl bugs图表 
     * @return SSLBugsLoopholeHistogram ssl bugs图表
     */
    public ChartHistogram [] getSSLBugsLoopholeHistogram() {
        return this.SSLBugsLoopholeHistogram;
    }

    /**
     * Set ssl bugs图表
     * @param SSLBugsLoopholeHistogram ssl bugs图表
     */
    public void setSSLBugsLoopholeHistogram(ChartHistogram [] SSLBugsLoopholeHistogram) {
        this.SSLBugsLoopholeHistogram = SSLBugsLoopholeHistogram;
    }

    /**
     * Get 合规图表 
     * @return ComplianceHistogram 合规图表
     */
    public ChartHistogram [] getComplianceHistogram() {
        return this.ComplianceHistogram;
    }

    /**
     * Set 合规图表
     * @param ComplianceHistogram 合规图表
     */
    public void setComplianceHistogram(ChartHistogram [] ComplianceHistogram) {
        this.ComplianceHistogram = ComplianceHistogram;
    }

    public DashboardResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashboardResult(DashboardResult source) {
        if (source.SecurityLevelPie != null) {
            this.SecurityLevelPie = new ChartNameValue[source.SecurityLevelPie.length];
            for (int i = 0; i < source.SecurityLevelPie.length; i++) {
                this.SecurityLevelPie[i] = new ChartNameValue(source.SecurityLevelPie[i]);
            }
        }
        if (source.CertBrandsPie != null) {
            this.CertBrandsPie = new ChartNameValue[source.CertBrandsPie.length];
            for (int i = 0; i < source.CertBrandsPie.length; i++) {
                this.CertBrandsPie[i] = new ChartNameValue(source.CertBrandsPie[i]);
            }
        }
        if (source.CertValidTimePie != null) {
            this.CertValidTimePie = new ChartNameValue[source.CertValidTimePie.length];
            for (int i = 0; i < source.CertValidTimePie.length; i++) {
                this.CertValidTimePie[i] = new ChartNameValue(source.CertValidTimePie[i]);
            }
        }
        if (source.CertTypePie != null) {
            this.CertTypePie = new ChartNameValue[source.CertTypePie.length];
            for (int i = 0; i < source.CertTypePie.length; i++) {
                this.CertTypePie[i] = new ChartNameValue(source.CertTypePie[i]);
            }
        }
        if (source.SSLBugsLoopholeHistogram != null) {
            this.SSLBugsLoopholeHistogram = new ChartHistogram[source.SSLBugsLoopholeHistogram.length];
            for (int i = 0; i < source.SSLBugsLoopholeHistogram.length; i++) {
                this.SSLBugsLoopholeHistogram[i] = new ChartHistogram(source.SSLBugsLoopholeHistogram[i]);
            }
        }
        if (source.ComplianceHistogram != null) {
            this.ComplianceHistogram = new ChartHistogram[source.ComplianceHistogram.length];
            for (int i = 0; i < source.ComplianceHistogram.length; i++) {
                this.ComplianceHistogram[i] = new ChartHistogram(source.ComplianceHistogram[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SecurityLevelPie.", this.SecurityLevelPie);
        this.setParamArrayObj(map, prefix + "CertBrandsPie.", this.CertBrandsPie);
        this.setParamArrayObj(map, prefix + "CertValidTimePie.", this.CertValidTimePie);
        this.setParamArrayObj(map, prefix + "CertTypePie.", this.CertTypePie);
        this.setParamArrayObj(map, prefix + "SSLBugsLoopholeHistogram.", this.SSLBugsLoopholeHistogram);
        this.setParamArrayObj(map, prefix + "ComplianceHistogram.", this.ComplianceHistogram);

    }
}

