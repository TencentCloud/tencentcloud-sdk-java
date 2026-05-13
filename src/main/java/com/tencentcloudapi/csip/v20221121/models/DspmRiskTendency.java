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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmRiskTendency extends AbstractModel {

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 未管控账号个数
    */
    @SerializedName("UncontrolledAccount")
    @Expose
    private Long UncontrolledAccount;

    /**
    * 配置风险个数
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * 基线风险个数
    */
    @SerializedName("BaselineRisk")
    @Expose
    private Long BaselineRisk;

    /**
    * 泄露风险个数
    */
    @SerializedName("LeakDetectionRisk")
    @Expose
    private Long LeakDetectionRisk;

    /**
    * SQL行为异常风险个数
    */
    @SerializedName("SQLBehaviorAnomaly")
    @Expose
    private Long SQLBehaviorAnomaly;

    /**
    * 权限异常风险个数
    */
    @SerializedName("PermissionAnomaly")
    @Expose
    private Long PermissionAnomaly;

    /**
    * 登录行为异常风险个数
    */
    @SerializedName("LoginBehaviorAnomaly")
    @Expose
    private Long LoginBehaviorAnomaly;

    /**
    * 攻击面风险风险个数
    */
    @SerializedName("AttackSurfaceRisk")
    @Expose
    private Long AttackSurfaceRisk;

    /**
    * 账号敏感操作个数
    */
    @SerializedName("AccountSensitiveOperation")
    @Expose
    private Long AccountSensitiveOperation;

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 未管控账号个数 
     * @return UncontrolledAccount 未管控账号个数
     */
    public Long getUncontrolledAccount() {
        return this.UncontrolledAccount;
    }

    /**
     * Set 未管控账号个数
     * @param UncontrolledAccount 未管控账号个数
     */
    public void setUncontrolledAccount(Long UncontrolledAccount) {
        this.UncontrolledAccount = UncontrolledAccount;
    }

    /**
     * Get 配置风险个数 
     * @return ConfigurationRisk 配置风险个数
     * @deprecated
     */
    @Deprecated
    public Long getConfigurationRisk() {
        return this.ConfigurationRisk;
    }

    /**
     * Set 配置风险个数
     * @param ConfigurationRisk 配置风险个数
     * @deprecated
     */
    @Deprecated
    public void setConfigurationRisk(Long ConfigurationRisk) {
        this.ConfigurationRisk = ConfigurationRisk;
    }

    /**
     * Get 基线风险个数 
     * @return BaselineRisk 基线风险个数
     * @deprecated
     */
    @Deprecated
    public Long getBaselineRisk() {
        return this.BaselineRisk;
    }

    /**
     * Set 基线风险个数
     * @param BaselineRisk 基线风险个数
     * @deprecated
     */
    @Deprecated
    public void setBaselineRisk(Long BaselineRisk) {
        this.BaselineRisk = BaselineRisk;
    }

    /**
     * Get 泄露风险个数 
     * @return LeakDetectionRisk 泄露风险个数
     * @deprecated
     */
    @Deprecated
    public Long getLeakDetectionRisk() {
        return this.LeakDetectionRisk;
    }

    /**
     * Set 泄露风险个数
     * @param LeakDetectionRisk 泄露风险个数
     * @deprecated
     */
    @Deprecated
    public void setLeakDetectionRisk(Long LeakDetectionRisk) {
        this.LeakDetectionRisk = LeakDetectionRisk;
    }

    /**
     * Get SQL行为异常风险个数 
     * @return SQLBehaviorAnomaly SQL行为异常风险个数
     */
    public Long getSQLBehaviorAnomaly() {
        return this.SQLBehaviorAnomaly;
    }

    /**
     * Set SQL行为异常风险个数
     * @param SQLBehaviorAnomaly SQL行为异常风险个数
     */
    public void setSQLBehaviorAnomaly(Long SQLBehaviorAnomaly) {
        this.SQLBehaviorAnomaly = SQLBehaviorAnomaly;
    }

    /**
     * Get 权限异常风险个数 
     * @return PermissionAnomaly 权限异常风险个数
     */
    public Long getPermissionAnomaly() {
        return this.PermissionAnomaly;
    }

    /**
     * Set 权限异常风险个数
     * @param PermissionAnomaly 权限异常风险个数
     */
    public void setPermissionAnomaly(Long PermissionAnomaly) {
        this.PermissionAnomaly = PermissionAnomaly;
    }

    /**
     * Get 登录行为异常风险个数 
     * @return LoginBehaviorAnomaly 登录行为异常风险个数
     */
    public Long getLoginBehaviorAnomaly() {
        return this.LoginBehaviorAnomaly;
    }

    /**
     * Set 登录行为异常风险个数
     * @param LoginBehaviorAnomaly 登录行为异常风险个数
     */
    public void setLoginBehaviorAnomaly(Long LoginBehaviorAnomaly) {
        this.LoginBehaviorAnomaly = LoginBehaviorAnomaly;
    }

    /**
     * Get 攻击面风险风险个数 
     * @return AttackSurfaceRisk 攻击面风险风险个数
     */
    public Long getAttackSurfaceRisk() {
        return this.AttackSurfaceRisk;
    }

    /**
     * Set 攻击面风险风险个数
     * @param AttackSurfaceRisk 攻击面风险风险个数
     */
    public void setAttackSurfaceRisk(Long AttackSurfaceRisk) {
        this.AttackSurfaceRisk = AttackSurfaceRisk;
    }

    /**
     * Get 账号敏感操作个数 
     * @return AccountSensitiveOperation 账号敏感操作个数
     */
    public Long getAccountSensitiveOperation() {
        return this.AccountSensitiveOperation;
    }

    /**
     * Set 账号敏感操作个数
     * @param AccountSensitiveOperation 账号敏感操作个数
     */
    public void setAccountSensitiveOperation(Long AccountSensitiveOperation) {
        this.AccountSensitiveOperation = AccountSensitiveOperation;
    }

    public DspmRiskTendency() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmRiskTendency(DspmRiskTendency source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.UncontrolledAccount != null) {
            this.UncontrolledAccount = new Long(source.UncontrolledAccount);
        }
        if (source.ConfigurationRisk != null) {
            this.ConfigurationRisk = new Long(source.ConfigurationRisk);
        }
        if (source.BaselineRisk != null) {
            this.BaselineRisk = new Long(source.BaselineRisk);
        }
        if (source.LeakDetectionRisk != null) {
            this.LeakDetectionRisk = new Long(source.LeakDetectionRisk);
        }
        if (source.SQLBehaviorAnomaly != null) {
            this.SQLBehaviorAnomaly = new Long(source.SQLBehaviorAnomaly);
        }
        if (source.PermissionAnomaly != null) {
            this.PermissionAnomaly = new Long(source.PermissionAnomaly);
        }
        if (source.LoginBehaviorAnomaly != null) {
            this.LoginBehaviorAnomaly = new Long(source.LoginBehaviorAnomaly);
        }
        if (source.AttackSurfaceRisk != null) {
            this.AttackSurfaceRisk = new Long(source.AttackSurfaceRisk);
        }
        if (source.AccountSensitiveOperation != null) {
            this.AccountSensitiveOperation = new Long(source.AccountSensitiveOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "UncontrolledAccount", this.UncontrolledAccount);
        this.setParamSimple(map, prefix + "ConfigurationRisk", this.ConfigurationRisk);
        this.setParamSimple(map, prefix + "BaselineRisk", this.BaselineRisk);
        this.setParamSimple(map, prefix + "LeakDetectionRisk", this.LeakDetectionRisk);
        this.setParamSimple(map, prefix + "SQLBehaviorAnomaly", this.SQLBehaviorAnomaly);
        this.setParamSimple(map, prefix + "PermissionAnomaly", this.PermissionAnomaly);
        this.setParamSimple(map, prefix + "LoginBehaviorAnomaly", this.LoginBehaviorAnomaly);
        this.setParamSimple(map, prefix + "AttackSurfaceRisk", this.AttackSurfaceRisk);
        this.setParamSimple(map, prefix + "AccountSensitiveOperation", this.AccountSensitiveOperation);

    }
}

