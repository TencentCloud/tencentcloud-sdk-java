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

public class BGPInstanceUsages extends AbstractModel{

    /**
    * 已使用的防护次数，单位次
    */
    @SerializedName("ProtectCountUsage")
    @Expose
    private Long ProtectCountUsage;

    /**
    * 已防护的IP数，单位个
    */
    @SerializedName("ProtectIPNumberUsage")
    @Expose
    private Long ProtectIPNumberUsage;

    /**
    * 最近7天的攻击次数，单位次
    */
    @SerializedName("Last7DayAttackCount")
    @Expose
    private Long Last7DayAttackCount;

    /**
     * Get 已使用的防护次数，单位次 
     * @return ProtectCountUsage 已使用的防护次数，单位次
     */
    public Long getProtectCountUsage() {
        return this.ProtectCountUsage;
    }

    /**
     * Set 已使用的防护次数，单位次
     * @param ProtectCountUsage 已使用的防护次数，单位次
     */
    public void setProtectCountUsage(Long ProtectCountUsage) {
        this.ProtectCountUsage = ProtectCountUsage;
    }

    /**
     * Get 已防护的IP数，单位个 
     * @return ProtectIPNumberUsage 已防护的IP数，单位个
     */
    public Long getProtectIPNumberUsage() {
        return this.ProtectIPNumberUsage;
    }

    /**
     * Set 已防护的IP数，单位个
     * @param ProtectIPNumberUsage 已防护的IP数，单位个
     */
    public void setProtectIPNumberUsage(Long ProtectIPNumberUsage) {
        this.ProtectIPNumberUsage = ProtectIPNumberUsage;
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

    public BGPInstanceUsages() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPInstanceUsages(BGPInstanceUsages source) {
        if (source.ProtectCountUsage != null) {
            this.ProtectCountUsage = new Long(source.ProtectCountUsage);
        }
        if (source.ProtectIPNumberUsage != null) {
            this.ProtectIPNumberUsage = new Long(source.ProtectIPNumberUsage);
        }
        if (source.Last7DayAttackCount != null) {
            this.Last7DayAttackCount = new Long(source.Last7DayAttackCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectCountUsage", this.ProtectCountUsage);
        this.setParamSimple(map, prefix + "ProtectIPNumberUsage", this.ProtectIPNumberUsage);
        this.setParamSimple(map, prefix + "Last7DayAttackCount", this.Last7DayAttackCount);

    }
}

