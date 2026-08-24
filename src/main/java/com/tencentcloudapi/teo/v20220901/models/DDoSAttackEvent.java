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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAttackEvent extends AbstractModel {

    /**
    * <p>事件 ID。</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>攻击类型。</p>
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * <p>攻击状态。</p><p>枚举值：</p><ul><li>0： 观察中</li><li>1： 攻击中</li><li>2： 攻击结束</li></ul>
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * <p>攻击最大带宽，单位为 bps。</p>
    */
    @SerializedName("AttackMaxBandWidth")
    @Expose
    private Long AttackMaxBandWidth;

    /**
    * <p>攻击包速率峰值，单位为 pps。</p>
    */
    @SerializedName("AttackPacketMaxRate")
    @Expose
    private Long AttackPacketMaxRate;

    /**
    * <p>攻击开始时间戳。</p><p>单位：秒</p>
    */
    @SerializedName("AttackStartTime")
    @Expose
    private Long AttackStartTime;

    /**
    * <p>攻击结束时间戳。</p><p>单位：秒</p>
    */
    @SerializedName("AttackEndTime")
    @Expose
    private Long AttackEndTime;

    /**
    * <p>DDoS 策略组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * <p>站点 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>攻击事件所属地区。</p><p>枚举值：</p><ul><li>overseas： 全球（除中国大陆地区）数据；</li><li>mainland： 中国大陆地区数据。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * <p>封禁解封信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoSBlockData")
    @Expose
    private DDoSBlockData [] DDoSBlockData;

    /**
    * <p>被 DDoS 攻击的目的 IP 列表。</p>
    */
    @SerializedName("DDoSAttackDips")
    @Expose
    private String [] DDoSAttackDips;

    /**
     * Get <p>事件 ID。</p> 
     * @return EventId <p>事件 ID。</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件 ID。</p>
     * @param EventId <p>事件 ID。</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>攻击类型。</p> 
     * @return AttackType <p>攻击类型。</p>
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set <p>攻击类型。</p>
     * @param AttackType <p>攻击类型。</p>
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get <p>攻击状态。</p><p>枚举值：</p><ul><li>0： 观察中</li><li>1： 攻击中</li><li>2： 攻击结束</li></ul> 
     * @return AttackStatus <p>攻击状态。</p><p>枚举值：</p><ul><li>0： 观察中</li><li>1： 攻击中</li><li>2： 攻击结束</li></ul>
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set <p>攻击状态。</p><p>枚举值：</p><ul><li>0： 观察中</li><li>1： 攻击中</li><li>2： 攻击结束</li></ul>
     * @param AttackStatus <p>攻击状态。</p><p>枚举值：</p><ul><li>0： 观察中</li><li>1： 攻击中</li><li>2： 攻击结束</li></ul>
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get <p>攻击最大带宽，单位为 bps。</p> 
     * @return AttackMaxBandWidth <p>攻击最大带宽，单位为 bps。</p>
     */
    public Long getAttackMaxBandWidth() {
        return this.AttackMaxBandWidth;
    }

    /**
     * Set <p>攻击最大带宽，单位为 bps。</p>
     * @param AttackMaxBandWidth <p>攻击最大带宽，单位为 bps。</p>
     */
    public void setAttackMaxBandWidth(Long AttackMaxBandWidth) {
        this.AttackMaxBandWidth = AttackMaxBandWidth;
    }

    /**
     * Get <p>攻击包速率峰值，单位为 pps。</p> 
     * @return AttackPacketMaxRate <p>攻击包速率峰值，单位为 pps。</p>
     */
    public Long getAttackPacketMaxRate() {
        return this.AttackPacketMaxRate;
    }

    /**
     * Set <p>攻击包速率峰值，单位为 pps。</p>
     * @param AttackPacketMaxRate <p>攻击包速率峰值，单位为 pps。</p>
     */
    public void setAttackPacketMaxRate(Long AttackPacketMaxRate) {
        this.AttackPacketMaxRate = AttackPacketMaxRate;
    }

    /**
     * Get <p>攻击开始时间戳。</p><p>单位：秒</p> 
     * @return AttackStartTime <p>攻击开始时间戳。</p><p>单位：秒</p>
     */
    public Long getAttackStartTime() {
        return this.AttackStartTime;
    }

    /**
     * Set <p>攻击开始时间戳。</p><p>单位：秒</p>
     * @param AttackStartTime <p>攻击开始时间戳。</p><p>单位：秒</p>
     */
    public void setAttackStartTime(Long AttackStartTime) {
        this.AttackStartTime = AttackStartTime;
    }

    /**
     * Get <p>攻击结束时间戳。</p><p>单位：秒</p> 
     * @return AttackEndTime <p>攻击结束时间戳。</p><p>单位：秒</p>
     */
    public Long getAttackEndTime() {
        return this.AttackEndTime;
    }

    /**
     * Set <p>攻击结束时间戳。</p><p>单位：秒</p>
     * @param AttackEndTime <p>攻击结束时间戳。</p><p>单位：秒</p>
     */
    public void setAttackEndTime(Long AttackEndTime) {
        this.AttackEndTime = AttackEndTime;
    }

    /**
     * Get <p>DDoS 策略组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyId <p>DDoS 策略组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>DDoS 策略组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyId <p>DDoS 策略组 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>站点 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId <p>站点 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId <p>站点 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>攻击事件所属地区。</p><p>枚举值：</p><ul><li>overseas： 全球（除中国大陆地区）数据；</li><li>mainland： 中国大陆地区数据。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area <p>攻击事件所属地区。</p><p>枚举值：</p><ul><li>overseas： 全球（除中国大陆地区）数据；</li><li>mainland： 中国大陆地区数据。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set <p>攻击事件所属地区。</p><p>枚举值：</p><ul><li>overseas： 全球（除中国大陆地区）数据；</li><li>mainland： 中国大陆地区数据。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area <p>攻击事件所属地区。</p><p>枚举值：</p><ul><li>overseas： 全球（除中国大陆地区）数据；</li><li>mainland： 中国大陆地区数据。</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get <p>封禁解封信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoSBlockData <p>封禁解封信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSBlockData [] getDDoSBlockData() {
        return this.DDoSBlockData;
    }

    /**
     * Set <p>封禁解封信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoSBlockData <p>封禁解封信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoSBlockData(DDoSBlockData [] DDoSBlockData) {
        this.DDoSBlockData = DDoSBlockData;
    }

    /**
     * Get <p>被 DDoS 攻击的目的 IP 列表。</p> 
     * @return DDoSAttackDips <p>被 DDoS 攻击的目的 IP 列表。</p>
     */
    public String [] getDDoSAttackDips() {
        return this.DDoSAttackDips;
    }

    /**
     * Set <p>被 DDoS 攻击的目的 IP 列表。</p>
     * @param DDoSAttackDips <p>被 DDoS 攻击的目的 IP 列表。</p>
     */
    public void setDDoSAttackDips(String [] DDoSAttackDips) {
        this.DDoSAttackDips = DDoSAttackDips;
    }

    public DDoSAttackEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAttackEvent(DDoSAttackEvent source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.AttackStatus != null) {
            this.AttackStatus = new Long(source.AttackStatus);
        }
        if (source.AttackMaxBandWidth != null) {
            this.AttackMaxBandWidth = new Long(source.AttackMaxBandWidth);
        }
        if (source.AttackPacketMaxRate != null) {
            this.AttackPacketMaxRate = new Long(source.AttackPacketMaxRate);
        }
        if (source.AttackStartTime != null) {
            this.AttackStartTime = new Long(source.AttackStartTime);
        }
        if (source.AttackEndTime != null) {
            this.AttackEndTime = new Long(source.AttackEndTime);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.DDoSBlockData != null) {
            this.DDoSBlockData = new DDoSBlockData[source.DDoSBlockData.length];
            for (int i = 0; i < source.DDoSBlockData.length; i++) {
                this.DDoSBlockData[i] = new DDoSBlockData(source.DDoSBlockData[i]);
            }
        }
        if (source.DDoSAttackDips != null) {
            this.DDoSAttackDips = new String[source.DDoSAttackDips.length];
            for (int i = 0; i < source.DDoSAttackDips.length; i++) {
                this.DDoSAttackDips[i] = new String(source.DDoSAttackDips[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "AttackMaxBandWidth", this.AttackMaxBandWidth);
        this.setParamSimple(map, prefix + "AttackPacketMaxRate", this.AttackPacketMaxRate);
        this.setParamSimple(map, prefix + "AttackStartTime", this.AttackStartTime);
        this.setParamSimple(map, prefix + "AttackEndTime", this.AttackEndTime);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArrayObj(map, prefix + "DDoSBlockData.", this.DDoSBlockData);
        this.setParamArraySimple(map, prefix + "DDoSAttackDips.", this.DDoSAttackDips);

    }
}

