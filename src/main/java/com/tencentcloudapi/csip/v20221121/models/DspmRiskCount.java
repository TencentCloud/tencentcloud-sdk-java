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

public class DspmRiskCount extends AbstractModel {

    /**
    * <p>待处理风险个数</p>
    */
    @SerializedName("UnprocessedRisk")
    @Expose
    private Long UnprocessedRisk;

    /**
    * <p>配置风险个数</p>
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * <p>基线风险个数</p>
    */
    @SerializedName("BaselineDeviation")
    @Expose
    private Long BaselineDeviation;

    /**
    * <p>泄露风险个数</p>
    */
    @SerializedName("LeakDetection")
    @Expose
    private Long LeakDetection;

    /**
    * <p>SQL行为异常风险个数</p>
    */
    @SerializedName("SQLBehaviorAnomaly")
    @Expose
    private Long SQLBehaviorAnomaly;

    /**
    * <p>权限异常风险个数</p>
    */
    @SerializedName("PermissionAnomaly")
    @Expose
    private Long PermissionAnomaly;

    /**
    * <p>登录行为异常风险个数</p>
    */
    @SerializedName("LoginBehaviorAnomaly")
    @Expose
    private Long LoginBehaviorAnomaly;

    /**
    * <p>攻击面风险个数</p>
    */
    @SerializedName("AttackSurfaceRisk")
    @Expose
    private Long AttackSurfaceRisk;

    /**
    * <p>账号敏感操作个数</p>
    */
    @SerializedName("AccountSensitiveOperation")
    @Expose
    private Long AccountSensitiveOperation;

    /**
    * <p>待处理告警个数</p>
    */
    @SerializedName("UnprocessedAlarm")
    @Expose
    private Long UnprocessedAlarm;

    /**
    * <p>新增事件告警</p>
    */
    @SerializedName("NumOfNewAlarmEvent")
    @Expose
    private Long NumOfNewAlarmEvent;

    /**
    * <p>新增配置风险</p>
    */
    @SerializedName("NumOfNewConfigRisk")
    @Expose
    private Long NumOfNewConfigRisk;

    /**
    * <p>账号风险条数</p>
    */
    @SerializedName("AccountRisk")
    @Expose
    private Long AccountRisk;

    /**
    * <p>配置风险条数</p>
    */
    @SerializedName("ConfigRisk")
    @Expose
    private Long ConfigRisk;

    /**
     * Get <p>待处理风险个数</p> 
     * @return UnprocessedRisk <p>待处理风险个数</p>
     */
    public Long getUnprocessedRisk() {
        return this.UnprocessedRisk;
    }

    /**
     * Set <p>待处理风险个数</p>
     * @param UnprocessedRisk <p>待处理风险个数</p>
     */
    public void setUnprocessedRisk(Long UnprocessedRisk) {
        this.UnprocessedRisk = UnprocessedRisk;
    }

    /**
     * Get <p>配置风险个数</p> 
     * @return ConfigurationRisk <p>配置风险个数</p>
     * @deprecated
     */
    @Deprecated
    public Long getConfigurationRisk() {
        return this.ConfigurationRisk;
    }

    /**
     * Set <p>配置风险个数</p>
     * @param ConfigurationRisk <p>配置风险个数</p>
     * @deprecated
     */
    @Deprecated
    public void setConfigurationRisk(Long ConfigurationRisk) {
        this.ConfigurationRisk = ConfigurationRisk;
    }

    /**
     * Get <p>基线风险个数</p> 
     * @return BaselineDeviation <p>基线风险个数</p>
     * @deprecated
     */
    @Deprecated
    public Long getBaselineDeviation() {
        return this.BaselineDeviation;
    }

    /**
     * Set <p>基线风险个数</p>
     * @param BaselineDeviation <p>基线风险个数</p>
     * @deprecated
     */
    @Deprecated
    public void setBaselineDeviation(Long BaselineDeviation) {
        this.BaselineDeviation = BaselineDeviation;
    }

    /**
     * Get <p>泄露风险个数</p> 
     * @return LeakDetection <p>泄露风险个数</p>
     * @deprecated
     */
    @Deprecated
    public Long getLeakDetection() {
        return this.LeakDetection;
    }

    /**
     * Set <p>泄露风险个数</p>
     * @param LeakDetection <p>泄露风险个数</p>
     * @deprecated
     */
    @Deprecated
    public void setLeakDetection(Long LeakDetection) {
        this.LeakDetection = LeakDetection;
    }

    /**
     * Get <p>SQL行为异常风险个数</p> 
     * @return SQLBehaviorAnomaly <p>SQL行为异常风险个数</p>
     */
    public Long getSQLBehaviorAnomaly() {
        return this.SQLBehaviorAnomaly;
    }

    /**
     * Set <p>SQL行为异常风险个数</p>
     * @param SQLBehaviorAnomaly <p>SQL行为异常风险个数</p>
     */
    public void setSQLBehaviorAnomaly(Long SQLBehaviorAnomaly) {
        this.SQLBehaviorAnomaly = SQLBehaviorAnomaly;
    }

    /**
     * Get <p>权限异常风险个数</p> 
     * @return PermissionAnomaly <p>权限异常风险个数</p>
     */
    public Long getPermissionAnomaly() {
        return this.PermissionAnomaly;
    }

    /**
     * Set <p>权限异常风险个数</p>
     * @param PermissionAnomaly <p>权限异常风险个数</p>
     */
    public void setPermissionAnomaly(Long PermissionAnomaly) {
        this.PermissionAnomaly = PermissionAnomaly;
    }

    /**
     * Get <p>登录行为异常风险个数</p> 
     * @return LoginBehaviorAnomaly <p>登录行为异常风险个数</p>
     */
    public Long getLoginBehaviorAnomaly() {
        return this.LoginBehaviorAnomaly;
    }

    /**
     * Set <p>登录行为异常风险个数</p>
     * @param LoginBehaviorAnomaly <p>登录行为异常风险个数</p>
     */
    public void setLoginBehaviorAnomaly(Long LoginBehaviorAnomaly) {
        this.LoginBehaviorAnomaly = LoginBehaviorAnomaly;
    }

    /**
     * Get <p>攻击面风险个数</p> 
     * @return AttackSurfaceRisk <p>攻击面风险个数</p>
     */
    public Long getAttackSurfaceRisk() {
        return this.AttackSurfaceRisk;
    }

    /**
     * Set <p>攻击面风险个数</p>
     * @param AttackSurfaceRisk <p>攻击面风险个数</p>
     */
    public void setAttackSurfaceRisk(Long AttackSurfaceRisk) {
        this.AttackSurfaceRisk = AttackSurfaceRisk;
    }

    /**
     * Get <p>账号敏感操作个数</p> 
     * @return AccountSensitiveOperation <p>账号敏感操作个数</p>
     */
    public Long getAccountSensitiveOperation() {
        return this.AccountSensitiveOperation;
    }

    /**
     * Set <p>账号敏感操作个数</p>
     * @param AccountSensitiveOperation <p>账号敏感操作个数</p>
     */
    public void setAccountSensitiveOperation(Long AccountSensitiveOperation) {
        this.AccountSensitiveOperation = AccountSensitiveOperation;
    }

    /**
     * Get <p>待处理告警个数</p> 
     * @return UnprocessedAlarm <p>待处理告警个数</p>
     */
    public Long getUnprocessedAlarm() {
        return this.UnprocessedAlarm;
    }

    /**
     * Set <p>待处理告警个数</p>
     * @param UnprocessedAlarm <p>待处理告警个数</p>
     */
    public void setUnprocessedAlarm(Long UnprocessedAlarm) {
        this.UnprocessedAlarm = UnprocessedAlarm;
    }

    /**
     * Get <p>新增事件告警</p> 
     * @return NumOfNewAlarmEvent <p>新增事件告警</p>
     */
    public Long getNumOfNewAlarmEvent() {
        return this.NumOfNewAlarmEvent;
    }

    /**
     * Set <p>新增事件告警</p>
     * @param NumOfNewAlarmEvent <p>新增事件告警</p>
     */
    public void setNumOfNewAlarmEvent(Long NumOfNewAlarmEvent) {
        this.NumOfNewAlarmEvent = NumOfNewAlarmEvent;
    }

    /**
     * Get <p>新增配置风险</p> 
     * @return NumOfNewConfigRisk <p>新增配置风险</p>
     */
    public Long getNumOfNewConfigRisk() {
        return this.NumOfNewConfigRisk;
    }

    /**
     * Set <p>新增配置风险</p>
     * @param NumOfNewConfigRisk <p>新增配置风险</p>
     */
    public void setNumOfNewConfigRisk(Long NumOfNewConfigRisk) {
        this.NumOfNewConfigRisk = NumOfNewConfigRisk;
    }

    /**
     * Get <p>账号风险条数</p> 
     * @return AccountRisk <p>账号风险条数</p>
     */
    public Long getAccountRisk() {
        return this.AccountRisk;
    }

    /**
     * Set <p>账号风险条数</p>
     * @param AccountRisk <p>账号风险条数</p>
     */
    public void setAccountRisk(Long AccountRisk) {
        this.AccountRisk = AccountRisk;
    }

    /**
     * Get <p>配置风险条数</p> 
     * @return ConfigRisk <p>配置风险条数</p>
     */
    public Long getConfigRisk() {
        return this.ConfigRisk;
    }

    /**
     * Set <p>配置风险条数</p>
     * @param ConfigRisk <p>配置风险条数</p>
     */
    public void setConfigRisk(Long ConfigRisk) {
        this.ConfigRisk = ConfigRisk;
    }

    public DspmRiskCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmRiskCount(DspmRiskCount source) {
        if (source.UnprocessedRisk != null) {
            this.UnprocessedRisk = new Long(source.UnprocessedRisk);
        }
        if (source.ConfigurationRisk != null) {
            this.ConfigurationRisk = new Long(source.ConfigurationRisk);
        }
        if (source.BaselineDeviation != null) {
            this.BaselineDeviation = new Long(source.BaselineDeviation);
        }
        if (source.LeakDetection != null) {
            this.LeakDetection = new Long(source.LeakDetection);
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
        if (source.UnprocessedAlarm != null) {
            this.UnprocessedAlarm = new Long(source.UnprocessedAlarm);
        }
        if (source.NumOfNewAlarmEvent != null) {
            this.NumOfNewAlarmEvent = new Long(source.NumOfNewAlarmEvent);
        }
        if (source.NumOfNewConfigRisk != null) {
            this.NumOfNewConfigRisk = new Long(source.NumOfNewConfigRisk);
        }
        if (source.AccountRisk != null) {
            this.AccountRisk = new Long(source.AccountRisk);
        }
        if (source.ConfigRisk != null) {
            this.ConfigRisk = new Long(source.ConfigRisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnprocessedRisk", this.UnprocessedRisk);
        this.setParamSimple(map, prefix + "ConfigurationRisk", this.ConfigurationRisk);
        this.setParamSimple(map, prefix + "BaselineDeviation", this.BaselineDeviation);
        this.setParamSimple(map, prefix + "LeakDetection", this.LeakDetection);
        this.setParamSimple(map, prefix + "SQLBehaviorAnomaly", this.SQLBehaviorAnomaly);
        this.setParamSimple(map, prefix + "PermissionAnomaly", this.PermissionAnomaly);
        this.setParamSimple(map, prefix + "LoginBehaviorAnomaly", this.LoginBehaviorAnomaly);
        this.setParamSimple(map, prefix + "AttackSurfaceRisk", this.AttackSurfaceRisk);
        this.setParamSimple(map, prefix + "AccountSensitiveOperation", this.AccountSensitiveOperation);
        this.setParamSimple(map, prefix + "UnprocessedAlarm", this.UnprocessedAlarm);
        this.setParamSimple(map, prefix + "NumOfNewAlarmEvent", this.NumOfNewAlarmEvent);
        this.setParamSimple(map, prefix + "NumOfNewConfigRisk", this.NumOfNewConfigRisk);
        this.setParamSimple(map, prefix + "AccountRisk", this.AccountRisk);
        this.setParamSimple(map, prefix + "ConfigRisk", this.ConfigRisk);

    }
}

