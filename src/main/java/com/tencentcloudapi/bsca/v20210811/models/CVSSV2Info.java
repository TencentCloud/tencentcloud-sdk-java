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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CVSSV2Info extends AbstractModel{

    /**
    * CVE评分。
    */
    @SerializedName("CVSS")
    @Expose
    private Float CVSS;

    /**
    * AccessVector 攻击途径。
取值范围：
<li>NETWORK 远程</li>
<li>ADJACENT_NETWORK 近邻</li>
<li>LOCAL 本地</li>
    */
    @SerializedName("AccessVector")
    @Expose
    private String AccessVector;

    /**
    * AccessComplexity 攻击复杂度。
取值范围：
<li>HIGH 高</li>
<li>MEDIUM 中</li>
<li>LOW 低</li>
    */
    @SerializedName("AccessComplexity")
    @Expose
    private String AccessComplexity;

    /**
    * Authentication 身份验证。
取值范围：
<li>MULTIPLE 多系统认证</li>
<li>SINGLE 单系统认证</li>
<li>NONE 无</li>
    */
    @SerializedName("Authentication")
    @Expose
    private String Authentication;

    /**
    * ConfidentialityImpact 机密性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
    */
    @SerializedName("ConImpact")
    @Expose
    private String ConImpact;

    /**
    * IntegrityImpact 完整性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
    */
    @SerializedName("IntegrityImpact")
    @Expose
    private String IntegrityImpact;

    /**
    * AvailabilityImpact 可用性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
    */
    @SerializedName("AvailabilityImpact")
    @Expose
    private String AvailabilityImpact;

    /**
     * Get CVE评分。 
     * @return CVSS CVE评分。
     */
    public Float getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVE评分。
     * @param CVSS CVE评分。
     */
    public void setCVSS(Float CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get AccessVector 攻击途径。
取值范围：
<li>NETWORK 远程</li>
<li>ADJACENT_NETWORK 近邻</li>
<li>LOCAL 本地</li> 
     * @return AccessVector AccessVector 攻击途径。
取值范围：
<li>NETWORK 远程</li>
<li>ADJACENT_NETWORK 近邻</li>
<li>LOCAL 本地</li>
     */
    public String getAccessVector() {
        return this.AccessVector;
    }

    /**
     * Set AccessVector 攻击途径。
取值范围：
<li>NETWORK 远程</li>
<li>ADJACENT_NETWORK 近邻</li>
<li>LOCAL 本地</li>
     * @param AccessVector AccessVector 攻击途径。
取值范围：
<li>NETWORK 远程</li>
<li>ADJACENT_NETWORK 近邻</li>
<li>LOCAL 本地</li>
     */
    public void setAccessVector(String AccessVector) {
        this.AccessVector = AccessVector;
    }

    /**
     * Get AccessComplexity 攻击复杂度。
取值范围：
<li>HIGH 高</li>
<li>MEDIUM 中</li>
<li>LOW 低</li> 
     * @return AccessComplexity AccessComplexity 攻击复杂度。
取值范围：
<li>HIGH 高</li>
<li>MEDIUM 中</li>
<li>LOW 低</li>
     */
    public String getAccessComplexity() {
        return this.AccessComplexity;
    }

    /**
     * Set AccessComplexity 攻击复杂度。
取值范围：
<li>HIGH 高</li>
<li>MEDIUM 中</li>
<li>LOW 低</li>
     * @param AccessComplexity AccessComplexity 攻击复杂度。
取值范围：
<li>HIGH 高</li>
<li>MEDIUM 中</li>
<li>LOW 低</li>
     */
    public void setAccessComplexity(String AccessComplexity) {
        this.AccessComplexity = AccessComplexity;
    }

    /**
     * Get Authentication 身份验证。
取值范围：
<li>MULTIPLE 多系统认证</li>
<li>SINGLE 单系统认证</li>
<li>NONE 无</li> 
     * @return Authentication Authentication 身份验证。
取值范围：
<li>MULTIPLE 多系统认证</li>
<li>SINGLE 单系统认证</li>
<li>NONE 无</li>
     */
    public String getAuthentication() {
        return this.Authentication;
    }

    /**
     * Set Authentication 身份验证。
取值范围：
<li>MULTIPLE 多系统认证</li>
<li>SINGLE 单系统认证</li>
<li>NONE 无</li>
     * @param Authentication Authentication 身份验证。
取值范围：
<li>MULTIPLE 多系统认证</li>
<li>SINGLE 单系统认证</li>
<li>NONE 无</li>
     */
    public void setAuthentication(String Authentication) {
        this.Authentication = Authentication;
    }

    /**
     * Get ConfidentialityImpact 机密性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li> 
     * @return ConImpact ConfidentialityImpact 机密性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
     */
    public String getConImpact() {
        return this.ConImpact;
    }

    /**
     * Set ConfidentialityImpact 机密性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
     * @param ConImpact ConfidentialityImpact 机密性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
     */
    public void setConImpact(String ConImpact) {
        this.ConImpact = ConImpact;
    }

    /**
     * Get IntegrityImpact 完整性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li> 
     * @return IntegrityImpact IntegrityImpact 完整性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
     */
    public String getIntegrityImpact() {
        return this.IntegrityImpact;
    }

    /**
     * Set IntegrityImpact 完整性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
     * @param IntegrityImpact IntegrityImpact 完整性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
     */
    public void setIntegrityImpact(String IntegrityImpact) {
        this.IntegrityImpact = IntegrityImpact;
    }

    /**
     * Get AvailabilityImpact 可用性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li> 
     * @return AvailabilityImpact AvailabilityImpact 可用性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
     */
    public String getAvailabilityImpact() {
        return this.AvailabilityImpact;
    }

    /**
     * Set AvailabilityImpact 可用性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
     * @param AvailabilityImpact AvailabilityImpact 可用性影响。
取值范围：
<li>NONE 无</li>
<li>PARTIAL 部分</li>
<li>COMPLETE 完整</li>
     */
    public void setAvailabilityImpact(String AvailabilityImpact) {
        this.AvailabilityImpact = AvailabilityImpact;
    }

    public CVSSV2Info() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CVSSV2Info(CVSSV2Info source) {
        if (source.CVSS != null) {
            this.CVSS = new Float(source.CVSS);
        }
        if (source.AccessVector != null) {
            this.AccessVector = new String(source.AccessVector);
        }
        if (source.AccessComplexity != null) {
            this.AccessComplexity = new String(source.AccessComplexity);
        }
        if (source.Authentication != null) {
            this.Authentication = new String(source.Authentication);
        }
        if (source.ConImpact != null) {
            this.ConImpact = new String(source.ConImpact);
        }
        if (source.IntegrityImpact != null) {
            this.IntegrityImpact = new String(source.IntegrityImpact);
        }
        if (source.AvailabilityImpact != null) {
            this.AvailabilityImpact = new String(source.AvailabilityImpact);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "AccessVector", this.AccessVector);
        this.setParamSimple(map, prefix + "AccessComplexity", this.AccessComplexity);
        this.setParamSimple(map, prefix + "Authentication", this.Authentication);
        this.setParamSimple(map, prefix + "ConImpact", this.ConImpact);
        this.setParamSimple(map, prefix + "IntegrityImpact", this.IntegrityImpact);
        this.setParamSimple(map, prefix + "AvailabilityImpact", this.AvailabilityImpact);

    }
}

