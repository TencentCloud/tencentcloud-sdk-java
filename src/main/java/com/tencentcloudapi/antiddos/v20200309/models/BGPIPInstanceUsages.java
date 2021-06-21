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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BGPIPInstanceUsages extends AbstractModel{

    /**
    * 已使用的端口规则数，单位条
    */
    @SerializedName("PortRulesUsage")
    @Expose
    private Long PortRulesUsage;

    /**
    * 已使用的域名规则数，单位条
    */
    @SerializedName("DomainRulesUsage")
    @Expose
    private Long DomainRulesUsage;

    /**
    * 最近7天的攻击次数，单位次
    */
    @SerializedName("Last7DayAttackCount")
    @Expose
    private Long Last7DayAttackCount;

    /**
     * Get 已使用的端口规则数，单位条 
     * @return PortRulesUsage 已使用的端口规则数，单位条
     */
    public Long getPortRulesUsage() {
        return this.PortRulesUsage;
    }

    /**
     * Set 已使用的端口规则数，单位条
     * @param PortRulesUsage 已使用的端口规则数，单位条
     */
    public void setPortRulesUsage(Long PortRulesUsage) {
        this.PortRulesUsage = PortRulesUsage;
    }

    /**
     * Get 已使用的域名规则数，单位条 
     * @return DomainRulesUsage 已使用的域名规则数，单位条
     */
    public Long getDomainRulesUsage() {
        return this.DomainRulesUsage;
    }

    /**
     * Set 已使用的域名规则数，单位条
     * @param DomainRulesUsage 已使用的域名规则数，单位条
     */
    public void setDomainRulesUsage(Long DomainRulesUsage) {
        this.DomainRulesUsage = DomainRulesUsage;
    }

    /**
     * Get 最近7天的攻击次数，单位次 
     * @return Last7DayAttackCount 最近7天的攻击次数，单位次
     */
    public Long getLast7DayAttackCount() {
        return this.Last7DayAttackCount;
    }

    /**
     * Set 最近7天的攻击次数，单位次
     * @param Last7DayAttackCount 最近7天的攻击次数，单位次
     */
    public void setLast7DayAttackCount(Long Last7DayAttackCount) {
        this.Last7DayAttackCount = Last7DayAttackCount;
    }

    public BGPIPInstanceUsages() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPIPInstanceUsages(BGPIPInstanceUsages source) {
        if (source.PortRulesUsage != null) {
            this.PortRulesUsage = new Long(source.PortRulesUsage);
        }
        if (source.DomainRulesUsage != null) {
            this.DomainRulesUsage = new Long(source.DomainRulesUsage);
        }
        if (source.Last7DayAttackCount != null) {
            this.Last7DayAttackCount = new Long(source.Last7DayAttackCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PortRulesUsage", this.PortRulesUsage);
        this.setParamSimple(map, prefix + "DomainRulesUsage", this.DomainRulesUsage);
        this.setParamSimple(map, prefix + "Last7DayAttackCount", this.Last7DayAttackCount);

    }
}

