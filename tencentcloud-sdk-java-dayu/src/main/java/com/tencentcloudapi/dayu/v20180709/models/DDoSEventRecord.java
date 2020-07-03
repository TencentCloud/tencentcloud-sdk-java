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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSEventRecord extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资源的IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 攻击开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 攻击结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 攻击最大带宽
    */
    @SerializedName("Mbps")
    @Expose
    private Long Mbps;

    /**
    * 攻击最大包速率
    */
    @SerializedName("Pps")
    @Expose
    private Long Pps;

    /**
    * 攻击类型
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * 是否被封堵，取值[1（是），0（否），2（无效值）]
    */
    @SerializedName("BlockFlag")
    @Expose
    private Long BlockFlag;

    /**
    * 是否超过弹性防护峰值，取值取值[yes(是)，no(否)，空字符串（未知值）]
    */
    @SerializedName("OverLoad")
    @Expose
    private String OverLoad;

    /**
    * 攻击状态，取值[0（攻击中）, 1（攻击结束）]
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * 资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 攻击事件Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
     * Get 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护） 
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版；basic表示DDoS基础防护）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 资源ID 
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 资源的IP 
     * @return Vip 资源的IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 资源的IP
     * @param Vip 资源的IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 攻击开始时间 
     * @return StartTime 攻击开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 攻击开始时间
     * @param StartTime 攻击开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 攻击结束时间 
     * @return EndTime 攻击结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 攻击结束时间
     * @param EndTime 攻击结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 攻击最大带宽 
     * @return Mbps 攻击最大带宽
     */
    public Long getMbps() {
        return this.Mbps;
    }

    /**
     * Set 攻击最大带宽
     * @param Mbps 攻击最大带宽
     */
    public void setMbps(Long Mbps) {
        this.Mbps = Mbps;
    }

    /**
     * Get 攻击最大包速率 
     * @return Pps 攻击最大包速率
     */
    public Long getPps() {
        return this.Pps;
    }

    /**
     * Set 攻击最大包速率
     * @param Pps 攻击最大包速率
     */
    public void setPps(Long Pps) {
        this.Pps = Pps;
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
     * Get 是否被封堵，取值[1（是），0（否），2（无效值）] 
     * @return BlockFlag 是否被封堵，取值[1（是），0（否），2（无效值）]
     */
    public Long getBlockFlag() {
        return this.BlockFlag;
    }

    /**
     * Set 是否被封堵，取值[1（是），0（否），2（无效值）]
     * @param BlockFlag 是否被封堵，取值[1（是），0（否），2（无效值）]
     */
    public void setBlockFlag(Long BlockFlag) {
        this.BlockFlag = BlockFlag;
    }

    /**
     * Get 是否超过弹性防护峰值，取值取值[yes(是)，no(否)，空字符串（未知值）] 
     * @return OverLoad 是否超过弹性防护峰值，取值取值[yes(是)，no(否)，空字符串（未知值）]
     */
    public String getOverLoad() {
        return this.OverLoad;
    }

    /**
     * Set 是否超过弹性防护峰值，取值取值[yes(是)，no(否)，空字符串（未知值）]
     * @param OverLoad 是否超过弹性防护峰值，取值取值[yes(是)，no(否)，空字符串（未知值）]
     */
    public void setOverLoad(String OverLoad) {
        this.OverLoad = OverLoad;
    }

    /**
     * Get 攻击状态，取值[0（攻击中）, 1（攻击结束）] 
     * @return AttackStatus 攻击状态，取值[0（攻击中）, 1（攻击结束）]
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set 攻击状态，取值[0（攻击中）, 1（攻击结束）]
     * @param AttackStatus 攻击状态，取值[0（攻击中）, 1（攻击结束）]
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get 资源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 攻击事件Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventId 攻击事件Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set 攻击事件Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventId 攻击事件Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Mbps", this.Mbps);
        this.setParamSimple(map, prefix + "Pps", this.Pps);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "BlockFlag", this.BlockFlag);
        this.setParamSimple(map, prefix + "OverLoad", this.OverLoad);
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}

