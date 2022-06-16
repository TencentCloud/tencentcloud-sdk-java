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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDosAttackEventDetailData extends AbstractModel{

    /**
    * 攻击状态
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * 攻击类型
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 最大带宽
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * 最大包速率
    */
    @SerializedName("PacketMaxRate")
    @Expose
    private Long PacketMaxRate;

    /**
    * 事件Id
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * ddos 策略组id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
     * Get 攻击状态 
     * @return AttackStatus 攻击状态
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set 攻击状态
     * @param AttackStatus 攻击状态
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get 攻击类型 
     * @return AttackType 攻击类型
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 攻击类型
     * @param AttackType 攻击类型
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 最大带宽 
     * @return MaxBandWidth 最大带宽
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set 最大带宽
     * @param MaxBandWidth 最大带宽
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get 最大包速率 
     * @return PacketMaxRate 最大包速率
     */
    public Long getPacketMaxRate() {
        return this.PacketMaxRate;
    }

    /**
     * Set 最大包速率
     * @param PacketMaxRate 最大包速率
     */
    public void setPacketMaxRate(Long PacketMaxRate) {
        this.PacketMaxRate = PacketMaxRate;
    }

    /**
     * Get 事件Id 
     * @return EventId 事件Id
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件Id
     * @param EventId 事件Id
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get ddos 策略组id 
     * @return PolicyId ddos 策略组id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set ddos 策略组id
     * @param PolicyId ddos 策略组id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    public DDosAttackEventDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDosAttackEventDetailData(DDosAttackEventDetailData source) {
        if (source.AttackStatus != null) {
            this.AttackStatus = new Long(source.AttackStatus);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.PacketMaxRate != null) {
            this.PacketMaxRate = new Long(source.PacketMaxRate);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "PacketMaxRate", this.PacketMaxRate);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

