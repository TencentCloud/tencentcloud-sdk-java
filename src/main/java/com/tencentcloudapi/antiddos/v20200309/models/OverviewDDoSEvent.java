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

public class OverviewDDoSEvent extends AbstractModel{

    /**
    * 事件Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * ip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 攻击类型
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * 攻击状态，0：攻击中；1：攻击结束
    */
    @SerializedName("AttackStatus")
    @Expose
    private Long AttackStatus;

    /**
    * 攻击流量，单位Mbps
    */
    @SerializedName("Mbps")
    @Expose
    private Long Mbps;

    /**
    * 攻击包量，单位pps
    */
    @SerializedName("Pps")
    @Expose
    private Long Pps;

    /**
    * 业务类型，bgp-multip：高防包；bgpip：高防ip；basic：基础防护
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 高防实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 高防实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get 事件Id 
     * @return Id 事件Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 事件Id
     * @param Id 事件Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get ip 
     * @return Vip ip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set ip
     * @param Vip ip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 攻击状态，0：攻击中；1：攻击结束 
     * @return AttackStatus 攻击状态，0：攻击中；1：攻击结束
     */
    public Long getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set 攻击状态，0：攻击中；1：攻击结束
     * @param AttackStatus 攻击状态，0：攻击中；1：攻击结束
     */
    public void setAttackStatus(Long AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get 攻击流量，单位Mbps 
     * @return Mbps 攻击流量，单位Mbps
     */
    public Long getMbps() {
        return this.Mbps;
    }

    /**
     * Set 攻击流量，单位Mbps
     * @param Mbps 攻击流量，单位Mbps
     */
    public void setMbps(Long Mbps) {
        this.Mbps = Mbps;
    }

    /**
     * Get 攻击包量，单位pps 
     * @return Pps 攻击包量，单位pps
     */
    public Long getPps() {
        return this.Pps;
    }

    /**
     * Set 攻击包量，单位pps
     * @param Pps 攻击包量，单位pps
     */
    public void setPps(Long Pps) {
        this.Pps = Pps;
    }

    /**
     * Get 业务类型，bgp-multip：高防包；bgpip：高防ip；basic：基础防护 
     * @return Business 业务类型，bgp-multip：高防包；bgpip：高防ip；basic：基础防护
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 业务类型，bgp-multip：高防包；bgpip：高防ip；basic：基础防护
     * @param Business 业务类型，bgp-multip：高防包；bgpip：高防ip；basic：基础防护
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 高防实例Id 
     * @return InstanceId 高防实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 高防实例Id
     * @param InstanceId 高防实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 高防实例名称 
     * @return InstanceName 高防实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 高防实例名称
     * @param InstanceName 高防实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public OverviewDDoSEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewDDoSEvent(OverviewDDoSEvent source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.AttackStatus != null) {
            this.AttackStatus = new Long(source.AttackStatus);
        }
        if (source.Mbps != null) {
            this.Mbps = new Long(source.Mbps);
        }
        if (source.Pps != null) {
            this.Pps = new Long(source.Pps);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "Mbps", this.Mbps);
        this.setParamSimple(map, prefix + "Pps", this.Pps);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

