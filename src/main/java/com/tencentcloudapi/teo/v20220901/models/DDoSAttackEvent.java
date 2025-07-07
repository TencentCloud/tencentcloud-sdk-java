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
    * 事件ID。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * 攻击类型(对应交互事件名称)。
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * 攻击状态。
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * 攻击最大带宽。
    */
    @SerializedName("AttackMaxBandWidth")
    @Expose
    private Long AttackMaxBandWidth;

    /**
    * 攻击包速率峰值。
    */
    @SerializedName("AttackPacketMaxRate")
    @Expose
    private Long AttackPacketMaxRate;

    /**
    * 攻击开始时间，单位为s。
    */
    @SerializedName("AttackStartTime")
    @Expose
    private Long AttackStartTime;

    /**
    * 攻击结束时间，单位为s。
    */
    @SerializedName("AttackEndTime")
    @Expose
    private Long AttackEndTime;

    /**
    * DDoS策略组ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 攻击事件所属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 封禁解封信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DDoSBlockData")
    @Expose
    private DDoSBlockData [] DDoSBlockData;

    /**
     * Get 事件ID。 
     * @return EventId 事件ID。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件ID。
     * @param EventId 事件ID。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 攻击类型(对应交互事件名称)。 
     * @return AttackType 攻击类型(对应交互事件名称)。
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 攻击类型(对应交互事件名称)。
     * @param AttackType 攻击类型(对应交互事件名称)。
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get 攻击状态。 
     * @return AttackStatus 攻击状态。
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set 攻击状态。
     * @param AttackStatus 攻击状态。
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
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
     * Get 攻击包速率峰值。 
     * @return AttackPacketMaxRate 攻击包速率峰值。
     */
    public Long getAttackPacketMaxRate() {
        return this.AttackPacketMaxRate;
    }

    /**
     * Set 攻击包速率峰值。
     * @param AttackPacketMaxRate 攻击包速率峰值。
     */
    public void setAttackPacketMaxRate(Long AttackPacketMaxRate) {
        this.AttackPacketMaxRate = AttackPacketMaxRate;
    }

    /**
     * Get 攻击开始时间，单位为s。 
     * @return AttackStartTime 攻击开始时间，单位为s。
     */
    public Long getAttackStartTime() {
        return this.AttackStartTime;
    }

    /**
     * Set 攻击开始时间，单位为s。
     * @param AttackStartTime 攻击开始时间，单位为s。
     */
    public void setAttackStartTime(Long AttackStartTime) {
        this.AttackStartTime = AttackStartTime;
    }

    /**
     * Get 攻击结束时间，单位为s。 
     * @return AttackEndTime 攻击结束时间，单位为s。
     */
    public Long getAttackEndTime() {
        return this.AttackEndTime;
    }

    /**
     * Set 攻击结束时间，单位为s。
     * @param AttackEndTime 攻击结束时间，单位为s。
     */
    public void setAttackEndTime(Long AttackEndTime) {
        this.AttackEndTime = AttackEndTime;
    }

    /**
     * Get DDoS策略组ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyId DDoS策略组ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set DDoS策略组ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyId DDoS策略组ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 站点ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 攻击事件所属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Area 攻击事件所属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 攻击事件所属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Area 攻击事件所属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 封禁解封信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DDoSBlockData 封禁解封信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DDoSBlockData [] getDDoSBlockData() {
        return this.DDoSBlockData;
    }

    /**
     * Set 封禁解封信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DDoSBlockData 封禁解封信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDDoSBlockData(DDoSBlockData [] DDoSBlockData) {
        this.DDoSBlockData = DDoSBlockData;
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

    }
}

