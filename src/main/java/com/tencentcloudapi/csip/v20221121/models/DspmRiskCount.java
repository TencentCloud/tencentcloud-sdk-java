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
    * 待处理风险个数
    */
    @SerializedName("UnprocessedRisk")
    @Expose
    private Long UnprocessedRisk;

    /**
    * 配置风险个数
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * 基线风险个数
    */
    @SerializedName("BaselineDeviation")
    @Expose
    private Long BaselineDeviation;

    /**
    * 泄露风险个数
    */
    @SerializedName("LeakDetection")
    @Expose
    private Long LeakDetection;

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
    * 攻击面风险个数
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
    * 待处理告警个数
    */
    @SerializedName("UnprocessedAlarm")
    @Expose
    private Long UnprocessedAlarm;

    /**
    * 新增事件告警
    */
    @SerializedName("NumOfNewAlarmEvent")
    @Expose
    private Long NumOfNewAlarmEvent;

    /**
    * 新增配置风险
    */
    @SerializedName("NumOfNewConfigRisk")
    @Expose
    private Long NumOfNewConfigRisk;

    /**
     * Get 待处理风险个数 
     * @return UnprocessedRisk 待处理风险个数
     */
    public Long getUnprocessedRisk() {
        return this.UnprocessedRisk;
    }

    /**
     * Set 待处理风险个数
     * @param UnprocessedRisk 待处理风险个数
     */
    public void setUnprocessedRisk(Long UnprocessedRisk) {
        this.UnprocessedRisk = UnprocessedRisk;
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
     * @return BaselineDeviation 基线风险个数
     * @deprecated
     */
    @Deprecated
    public Long getBaselineDeviation() {
        return this.BaselineDeviation;
    }

    /**
     * Set 基线风险个数
     * @param BaselineDeviation 基线风险个数
     * @deprecated
     */
    @Deprecated
    public void setBaselineDeviation(Long BaselineDeviation) {
        this.BaselineDeviation = BaselineDeviation;
    }

    /**
     * Get 泄露风险个数 
     * @return LeakDetection 泄露风险个数
     * @deprecated
     */
    @Deprecated
    public Long getLeakDetection() {
        return this.LeakDetection;
    }

    /**
     * Set 泄露风险个数
     * @param LeakDetection 泄露风险个数
     * @deprecated
     */
    @Deprecated
    public void setLeakDetection(Long LeakDetection) {
        this.LeakDetection = LeakDetection;
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
     * Get 攻击面风险个数 
     * @return AttackSurfaceRisk 攻击面风险个数
     */
    public Long getAttackSurfaceRisk() {
        return this.AttackSurfaceRisk;
    }

    /**
     * Set 攻击面风险个数
     * @param AttackSurfaceRisk 攻击面风险个数
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

    /**
     * Get 待处理告警个数 
     * @return UnprocessedAlarm 待处理告警个数
     */
    public Long getUnprocessedAlarm() {
        return this.UnprocessedAlarm;
    }

    /**
     * Set 待处理告警个数
     * @param UnprocessedAlarm 待处理告警个数
     */
    public void setUnprocessedAlarm(Long UnprocessedAlarm) {
        this.UnprocessedAlarm = UnprocessedAlarm;
    }

    /**
     * Get 新增事件告警 
     * @return NumOfNewAlarmEvent 新增事件告警
     */
    public Long getNumOfNewAlarmEvent() {
        return this.NumOfNewAlarmEvent;
    }

    /**
     * Set 新增事件告警
     * @param NumOfNewAlarmEvent 新增事件告警
     */
    public void setNumOfNewAlarmEvent(Long NumOfNewAlarmEvent) {
        this.NumOfNewAlarmEvent = NumOfNewAlarmEvent;
    }

    /**
     * Get 新增配置风险 
     * @return NumOfNewConfigRisk 新增配置风险
     */
    public Long getNumOfNewConfigRisk() {
        return this.NumOfNewConfigRisk;
    }

    /**
     * Set 新增配置风险
     * @param NumOfNewConfigRisk 新增配置风险
     */
    public void setNumOfNewConfigRisk(Long NumOfNewConfigRisk) {
        this.NumOfNewConfigRisk = NumOfNewConfigRisk;
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

    }
}

