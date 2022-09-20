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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSMajorAttackEvent extends AbstractModel{

    /**
    * ddos 策略组id。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 攻击最大带宽。
    */
    @SerializedName("AttackMaxBandWidth")
    @Expose
    private Long AttackMaxBandWidth;

    /**
    * 攻击请求时间，采用unix秒级时间戳。
    */
    @SerializedName("AttackTime")
    @Expose
    private Long AttackTime;

    /**
     * Get ddos 策略组id。 
     * @return PolicyId ddos 策略组id。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set ddos 策略组id。
     * @param PolicyId ddos 策略组id。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 攻击最大带宽。 
     * @return AttackMaxBandWidth 攻击最大带宽。
     */
    public Long getAttackMaxBandWidth() {
        return this.AttackMaxBandWidth;
    }

    /**
     * Set 攻击最大带宽。
     * @param AttackMaxBandWidth 攻击最大带宽。
     */
    public void setAttackMaxBandWidth(Long AttackMaxBandWidth) {
        this.AttackMaxBandWidth = AttackMaxBandWidth;
    }

    /**
     * Get 攻击请求时间，采用unix秒级时间戳。 
     * @return AttackTime 攻击请求时间，采用unix秒级时间戳。
     */
    public Long getAttackTime() {
        return this.AttackTime;
    }

    /**
     * Set 攻击请求时间，采用unix秒级时间戳。
     * @param AttackTime 攻击请求时间，采用unix秒级时间戳。
     */
    public void setAttackTime(Long AttackTime) {
        this.AttackTime = AttackTime;
    }

    public DDoSMajorAttackEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSMajorAttackEvent(DDoSMajorAttackEvent source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.AttackMaxBandWidth != null) {
            this.AttackMaxBandWidth = new Long(source.AttackMaxBandWidth);
        }
        if (source.AttackTime != null) {
            this.AttackTime = new Long(source.AttackTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "AttackMaxBandWidth", this.AttackMaxBandWidth);
        this.setParamSimple(map, prefix + "AttackTime", this.AttackTime);

    }
}

