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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDataSaEventPub extends AbstractModel{

    /**
    * 时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 安全事件1级分类
    */
    @SerializedName("EventType1")
    @Expose
    private Long EventType1;

    /**
    * 安全事件2级分类
    */
    @SerializedName("EventType2")
    @Expose
    private Long EventType2;

    /**
    * 安全事件名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 风险等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 安全事件状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 攻击源ip
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * 攻击目标ip
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 攻击目标端口
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * 受影响资产
    */
    @SerializedName("Asset")
    @Expose
    private String Asset;

    /**
    * 私有字段和公有字段映射的原始采集数据唯一标识的MD5值
    */
    @SerializedName("OldIdMd5")
    @Expose
    private String OldIdMd5;

    /**
     * Get 时间 
     * @return Time 时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间
     * @param Time 时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 安全事件1级分类 
     * @return EventType1 安全事件1级分类
     */
    public Long getEventType1() {
        return this.EventType1;
    }

    /**
     * Set 安全事件1级分类
     * @param EventType1 安全事件1级分类
     */
    public void setEventType1(Long EventType1) {
        this.EventType1 = EventType1;
    }

    /**
     * Get 安全事件2级分类 
     * @return EventType2 安全事件2级分类
     */
    public Long getEventType2() {
        return this.EventType2;
    }

    /**
     * Set 安全事件2级分类
     * @param EventType2 安全事件2级分类
     */
    public void setEventType2(Long EventType2) {
        this.EventType2 = EventType2;
    }

    /**
     * Get 安全事件名称 
     * @return EventName 安全事件名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 安全事件名称
     * @param EventName 安全事件名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 风险等级 
     * @return Level 风险等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 安全事件状态 
     * @return Status 安全事件状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 安全事件状态
     * @param Status 安全事件状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 攻击源ip 
     * @return SrcIp 攻击源ip
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 攻击源ip
     * @param SrcIp 攻击源ip
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 攻击目标ip 
     * @return DstIp 攻击目标ip
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 攻击目标ip
     * @param DstIp 攻击目标ip
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 攻击目标端口 
     * @return DstPort 攻击目标端口
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 攻击目标端口
     * @param DstPort 攻击目标端口
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 受影响资产 
     * @return Asset 受影响资产
     */
    public String getAsset() {
        return this.Asset;
    }

    /**
     * Set 受影响资产
     * @param Asset 受影响资产
     */
    public void setAsset(String Asset) {
        this.Asset = Asset;
    }

    /**
     * Get 私有字段和公有字段映射的原始采集数据唯一标识的MD5值 
     * @return OldIdMd5 私有字段和公有字段映射的原始采集数据唯一标识的MD5值
     */
    public String getOldIdMd5() {
        return this.OldIdMd5;
    }

    /**
     * Set 私有字段和公有字段映射的原始采集数据唯一标识的MD5值
     * @param OldIdMd5 私有字段和公有字段映射的原始采集数据唯一标识的MD5值
     */
    public void setOldIdMd5(String OldIdMd5) {
        this.OldIdMd5 = OldIdMd5;
    }

    public ListDataSaEventPub() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDataSaEventPub(ListDataSaEventPub source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.EventType1 != null) {
            this.EventType1 = new Long(source.EventType1);
        }
        if (source.EventType2 != null) {
            this.EventType2 = new Long(source.EventType2);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.Asset != null) {
            this.Asset = new String(source.Asset);
        }
        if (source.OldIdMd5 != null) {
            this.OldIdMd5 = new String(source.OldIdMd5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "EventType1", this.EventType1);
        this.setParamSimple(map, prefix + "EventType2", this.EventType2);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "Asset", this.Asset);
        this.setParamSimple(map, prefix + "OldIdMd5", this.OldIdMd5);

    }
}

