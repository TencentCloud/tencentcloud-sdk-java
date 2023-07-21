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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWafAutoDenyRulesRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 触发IP封禁的攻击次数阈值，范围为2~100次
    */
    @SerializedName("AttackThreshold")
    @Expose
    private Long AttackThreshold;

    /**
    * IP封禁统计时间，范围为1-60分钟
    */
    @SerializedName("TimeThreshold")
    @Expose
    private Long TimeThreshold;

    /**
    * 触发IP封禁后的封禁时间，范围为5~360分钟
    */
    @SerializedName("DenyTimeThreshold")
    @Expose
    private Long DenyTimeThreshold;

    /**
    * 自动封禁状态，0表示关闭，1表示打开
    */
    @SerializedName("DefenseStatus")
    @Expose
    private Long DefenseStatus;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 触发IP封禁的攻击次数阈值，范围为2~100次 
     * @return AttackThreshold 触发IP封禁的攻击次数阈值，范围为2~100次
     */
    public Long getAttackThreshold() {
        return this.AttackThreshold;
    }

    /**
     * Set 触发IP封禁的攻击次数阈值，范围为2~100次
     * @param AttackThreshold 触发IP封禁的攻击次数阈值，范围为2~100次
     */
    public void setAttackThreshold(Long AttackThreshold) {
        this.AttackThreshold = AttackThreshold;
    }

    /**
     * Get IP封禁统计时间，范围为1-60分钟 
     * @return TimeThreshold IP封禁统计时间，范围为1-60分钟
     */
    public Long getTimeThreshold() {
        return this.TimeThreshold;
    }

    /**
     * Set IP封禁统计时间，范围为1-60分钟
     * @param TimeThreshold IP封禁统计时间，范围为1-60分钟
     */
    public void setTimeThreshold(Long TimeThreshold) {
        this.TimeThreshold = TimeThreshold;
    }

    /**
     * Get 触发IP封禁后的封禁时间，范围为5~360分钟 
     * @return DenyTimeThreshold 触发IP封禁后的封禁时间，范围为5~360分钟
     */
    public Long getDenyTimeThreshold() {
        return this.DenyTimeThreshold;
    }

    /**
     * Set 触发IP封禁后的封禁时间，范围为5~360分钟
     * @param DenyTimeThreshold 触发IP封禁后的封禁时间，范围为5~360分钟
     */
    public void setDenyTimeThreshold(Long DenyTimeThreshold) {
        this.DenyTimeThreshold = DenyTimeThreshold;
    }

    /**
     * Get 自动封禁状态，0表示关闭，1表示打开 
     * @return DefenseStatus 自动封禁状态，0表示关闭，1表示打开
     */
    public Long getDefenseStatus() {
        return this.DefenseStatus;
    }

    /**
     * Set 自动封禁状态，0表示关闭，1表示打开
     * @param DefenseStatus 自动封禁状态，0表示关闭，1表示打开
     */
    public void setDefenseStatus(Long DefenseStatus) {
        this.DefenseStatus = DefenseStatus;
    }

    public ModifyWafAutoDenyRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWafAutoDenyRulesRequest(ModifyWafAutoDenyRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AttackThreshold != null) {
            this.AttackThreshold = new Long(source.AttackThreshold);
        }
        if (source.TimeThreshold != null) {
            this.TimeThreshold = new Long(source.TimeThreshold);
        }
        if (source.DenyTimeThreshold != null) {
            this.DenyTimeThreshold = new Long(source.DenyTimeThreshold);
        }
        if (source.DefenseStatus != null) {
            this.DefenseStatus = new Long(source.DefenseStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AttackThreshold", this.AttackThreshold);
        this.setParamSimple(map, prefix + "TimeThreshold", this.TimeThreshold);
        this.setParamSimple(map, prefix + "DenyTimeThreshold", this.DenyTimeThreshold);
        this.setParamSimple(map, prefix + "DefenseStatus", this.DefenseStatus);

    }
}

