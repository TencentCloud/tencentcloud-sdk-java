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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessControlSystemChildRuleInfo extends AbstractModel{

    /**
    * 子策略Id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 策略模式,  RULE_MODE_RELEASE: 放行
   RULE_MODE_ALERT: 告警
   RULE_MODE_HOLDUP:拦截
    */
    @SerializedName("RuleMode")
    @Expose
    private String RuleMode;

    /**
    * 子策略状态，true为开启，false为关闭
    */
    @SerializedName("IsEnable")
    @Expose
    private Boolean IsEnable;

    /**
    * 子策略检测的入侵行为类型
CHANGE_CRONTAB：篡改计划任务
CHANGE_SYS_BIN：篡改系统程序
CHANGE_USRCFG：篡改用户配置
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
     * Get 子策略Id 
     * @return RuleId 子策略Id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 子策略Id
     * @param RuleId 子策略Id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 策略模式,  RULE_MODE_RELEASE: 放行
   RULE_MODE_ALERT: 告警
   RULE_MODE_HOLDUP:拦截 
     * @return RuleMode 策略模式,  RULE_MODE_RELEASE: 放行
   RULE_MODE_ALERT: 告警
   RULE_MODE_HOLDUP:拦截
     */
    public String getRuleMode() {
        return this.RuleMode;
    }

    /**
     * Set 策略模式,  RULE_MODE_RELEASE: 放行
   RULE_MODE_ALERT: 告警
   RULE_MODE_HOLDUP:拦截
     * @param RuleMode 策略模式,  RULE_MODE_RELEASE: 放行
   RULE_MODE_ALERT: 告警
   RULE_MODE_HOLDUP:拦截
     */
    public void setRuleMode(String RuleMode) {
        this.RuleMode = RuleMode;
    }

    /**
     * Get 子策略状态，true为开启，false为关闭 
     * @return IsEnable 子策略状态，true为开启，false为关闭
     */
    public Boolean getIsEnable() {
        return this.IsEnable;
    }

    /**
     * Set 子策略状态，true为开启，false为关闭
     * @param IsEnable 子策略状态，true为开启，false为关闭
     */
    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    /**
     * Get 子策略检测的入侵行为类型
CHANGE_CRONTAB：篡改计划任务
CHANGE_SYS_BIN：篡改系统程序
CHANGE_USRCFG：篡改用户配置 
     * @return RuleType 子策略检测的入侵行为类型
CHANGE_CRONTAB：篡改计划任务
CHANGE_SYS_BIN：篡改系统程序
CHANGE_USRCFG：篡改用户配置
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 子策略检测的入侵行为类型
CHANGE_CRONTAB：篡改计划任务
CHANGE_SYS_BIN：篡改系统程序
CHANGE_USRCFG：篡改用户配置
     * @param RuleType 子策略检测的入侵行为类型
CHANGE_CRONTAB：篡改计划任务
CHANGE_SYS_BIN：篡改系统程序
CHANGE_USRCFG：篡改用户配置
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    public AccessControlSystemChildRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessControlSystemChildRuleInfo(AccessControlSystemChildRuleInfo source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleMode != null) {
            this.RuleMode = new String(source.RuleMode);
        }
        if (source.IsEnable != null) {
            this.IsEnable = new Boolean(source.IsEnable);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleMode", this.RuleMode);
        this.setParamSimple(map, prefix + "IsEnable", this.IsEnable);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);

    }
}

