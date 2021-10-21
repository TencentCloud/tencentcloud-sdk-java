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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAttackBandwidthData extends AbstractModel{

    /**
    * ddos攻击类型，当值为all的时候表示所有的攻击类型的总带宽峰值
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * ddos攻击带宽大小
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
    * 攻击时间点
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get ddos攻击类型，当值为all的时候表示所有的攻击类型的总带宽峰值 
     * @return AttackType ddos攻击类型，当值为all的时候表示所有的攻击类型的总带宽峰值
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set ddos攻击类型，当值为all的时候表示所有的攻击类型的总带宽峰值
     * @param AttackType ddos攻击类型，当值为all的时候表示所有的攻击类型的总带宽峰值
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get ddos攻击带宽大小 
     * @return Value ddos攻击带宽大小
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set ddos攻击带宽大小
     * @param Value ddos攻击带宽大小
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    /**
     * Get 攻击时间点 
     * @return Time 攻击时间点
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 攻击时间点
     * @param Time 攻击时间点
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    public DDoSAttackBandwidthData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAttackBandwidthData(DDoSAttackBandwidthData source) {
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

