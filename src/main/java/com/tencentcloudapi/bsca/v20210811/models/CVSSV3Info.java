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

public class CVSSV3Info extends AbstractModel{

    /**
    * CVE评分。
    */
    @SerializedName("CVSS")
    @Expose
    private Float CVSS;

    /**
    * AttackVector 攻击途径。
取值范围：
<li>NETWORK 远程</li>
<li>ADJACENT_NETWORK 近邻</li>
<li>LOCAL 本地</li>
<li>PHYSICAL 物理</li>
    */
    @SerializedName("AttackVector")
    @Expose
    private String AttackVector;

    /**
    * AttackComplexity 攻击复杂度。
取值范围：
<li>HIGH 高</li>
<li>LOW 低</li>
    */
    @SerializedName("AttackComplexity")
    @Expose
    private String AttackComplexity;

    /**
    * PrivilegesRequired 触发特权。
取值范围：
<li>HIGH 高</li>
<li>LOW 低</li>
<li>NONE 无</li>
    */
    @SerializedName("PrivilegesRequired")
    @Expose
    private String PrivilegesRequired;

    /**
    * UserInteraction 交互必要性。
取值范围：
<li>NONE 无</li>
<li>REQUIRED 需要</li>
    */
    @SerializedName("UserInteraction")
    @Expose
    private String UserInteraction;

    /**
    * Scope 绕过安全边界。
取值范围：
<li>UNCHANGED 否</li>
<li>CHANGED 能</li>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * ConfidentialityImpact 机密性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
    */
    @SerializedName("ConImpact")
    @Expose
    private String ConImpact;

    /**
    * IntegrityImpact 完整性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
    */
    @SerializedName("IntegrityImpact")
    @Expose
    private String IntegrityImpact;

    /**
    * AvailabilityImpact 可用性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
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
     * Get AttackVector 攻击途径。
取值范围：
<li>NETWORK 远程</li>
<li>ADJACENT_NETWORK 近邻</li>
<li>LOCAL 本地</li>
<li>PHYSICAL 物理</li> 
     * @return AttackVector AttackVector 攻击途径。
取值范围：
<li>NETWORK 远程</li>
<li>ADJACENT_NETWORK 近邻</li>
<li>LOCAL 本地</li>
<li>PHYSICAL 物理</li>
     */
    public String getAttackVector() {
        return this.AttackVector;
    }

    /**
     * Set AttackVector 攻击途径。
取值范围：
<li>NETWORK 远程</li>
<li>ADJACENT_NETWORK 近邻</li>
<li>LOCAL 本地</li>
<li>PHYSICAL 物理</li>
     * @param AttackVector AttackVector 攻击途径。
取值范围：
<li>NETWORK 远程</li>
<li>ADJACENT_NETWORK 近邻</li>
<li>LOCAL 本地</li>
<li>PHYSICAL 物理</li>
     */
    public void setAttackVector(String AttackVector) {
        this.AttackVector = AttackVector;
    }

    /**
     * Get AttackComplexity 攻击复杂度。
取值范围：
<li>HIGH 高</li>
<li>LOW 低</li> 
     * @return AttackComplexity AttackComplexity 攻击复杂度。
取值范围：
<li>HIGH 高</li>
<li>LOW 低</li>
     */
    public String getAttackComplexity() {
        return this.AttackComplexity;
    }

    /**
     * Set AttackComplexity 攻击复杂度。
取值范围：
<li>HIGH 高</li>
<li>LOW 低</li>
     * @param AttackComplexity AttackComplexity 攻击复杂度。
取值范围：
<li>HIGH 高</li>
<li>LOW 低</li>
     */
    public void setAttackComplexity(String AttackComplexity) {
        this.AttackComplexity = AttackComplexity;
    }

    /**
     * Get PrivilegesRequired 触发特权。
取值范围：
<li>HIGH 高</li>
<li>LOW 低</li>
<li>NONE 无</li> 
     * @return PrivilegesRequired PrivilegesRequired 触发特权。
取值范围：
<li>HIGH 高</li>
<li>LOW 低</li>
<li>NONE 无</li>
     */
    public String getPrivilegesRequired() {
        return this.PrivilegesRequired;
    }

    /**
     * Set PrivilegesRequired 触发特权。
取值范围：
<li>HIGH 高</li>
<li>LOW 低</li>
<li>NONE 无</li>
     * @param PrivilegesRequired PrivilegesRequired 触发特权。
取值范围：
<li>HIGH 高</li>
<li>LOW 低</li>
<li>NONE 无</li>
     */
    public void setPrivilegesRequired(String PrivilegesRequired) {
        this.PrivilegesRequired = PrivilegesRequired;
    }

    /**
     * Get UserInteraction 交互必要性。
取值范围：
<li>NONE 无</li>
<li>REQUIRED 需要</li> 
     * @return UserInteraction UserInteraction 交互必要性。
取值范围：
<li>NONE 无</li>
<li>REQUIRED 需要</li>
     */
    public String getUserInteraction() {
        return this.UserInteraction;
    }

    /**
     * Set UserInteraction 交互必要性。
取值范围：
<li>NONE 无</li>
<li>REQUIRED 需要</li>
     * @param UserInteraction UserInteraction 交互必要性。
取值范围：
<li>NONE 无</li>
<li>REQUIRED 需要</li>
     */
    public void setUserInteraction(String UserInteraction) {
        this.UserInteraction = UserInteraction;
    }

    /**
     * Get Scope 绕过安全边界。
取值范围：
<li>UNCHANGED 否</li>
<li>CHANGED 能</li> 
     * @return Scope Scope 绕过安全边界。
取值范围：
<li>UNCHANGED 否</li>
<li>CHANGED 能</li>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set Scope 绕过安全边界。
取值范围：
<li>UNCHANGED 否</li>
<li>CHANGED 能</li>
     * @param Scope Scope 绕过安全边界。
取值范围：
<li>UNCHANGED 否</li>
<li>CHANGED 能</li>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get ConfidentialityImpact 机密性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li> 
     * @return ConImpact ConfidentialityImpact 机密性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
     */
    public String getConImpact() {
        return this.ConImpact;
    }

    /**
     * Set ConfidentialityImpact 机密性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
     * @param ConImpact ConfidentialityImpact 机密性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
     */
    public void setConImpact(String ConImpact) {
        this.ConImpact = ConImpact;
    }

    /**
     * Get IntegrityImpact 完整性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li> 
     * @return IntegrityImpact IntegrityImpact 完整性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
     */
    public String getIntegrityImpact() {
        return this.IntegrityImpact;
    }

    /**
     * Set IntegrityImpact 完整性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
     * @param IntegrityImpact IntegrityImpact 完整性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
     */
    public void setIntegrityImpact(String IntegrityImpact) {
        this.IntegrityImpact = IntegrityImpact;
    }

    /**
     * Get AvailabilityImpact 可用性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li> 
     * @return AvailabilityImpact AvailabilityImpact 可用性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
     */
    public String getAvailabilityImpact() {
        return this.AvailabilityImpact;
    }

    /**
     * Set AvailabilityImpact 可用性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
     * @param AvailabilityImpact AvailabilityImpact 可用性影响。
取值范围：
<li>NONE 无</li>
<li>LOW 低</li>
<li>HIGH 高</li>
     */
    public void setAvailabilityImpact(String AvailabilityImpact) {
        this.AvailabilityImpact = AvailabilityImpact;
    }

    public CVSSV3Info() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CVSSV3Info(CVSSV3Info source) {
        if (source.CVSS != null) {
            this.CVSS = new Float(source.CVSS);
        }
        if (source.AttackVector != null) {
            this.AttackVector = new String(source.AttackVector);
        }
        if (source.AttackComplexity != null) {
            this.AttackComplexity = new String(source.AttackComplexity);
        }
        if (source.PrivilegesRequired != null) {
            this.PrivilegesRequired = new String(source.PrivilegesRequired);
        }
        if (source.UserInteraction != null) {
            this.UserInteraction = new String(source.UserInteraction);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
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
        this.setParamSimple(map, prefix + "AttackVector", this.AttackVector);
        this.setParamSimple(map, prefix + "AttackComplexity", this.AttackComplexity);
        this.setParamSimple(map, prefix + "PrivilegesRequired", this.PrivilegesRequired);
        this.setParamSimple(map, prefix + "UserInteraction", this.UserInteraction);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "ConImpact", this.ConImpact);
        this.setParamSimple(map, prefix + "IntegrityImpact", this.IntegrityImpact);
        this.setParamSimple(map, prefix + "AvailabilityImpact", this.AvailabilityImpact);

    }
}

