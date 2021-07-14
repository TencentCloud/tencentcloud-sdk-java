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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DcnDetailItem extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例IP地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 实例IPv6地址
    */
    @SerializedName("Vipv6")
    @Expose
    private String Vipv6;

    /**
    * 实例端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 实例状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 实例DCN标志，1-主，2-备
    */
    @SerializedName("DcnFlag")
    @Expose
    private Long DcnFlag;

    /**
    * 实例DCN状态，0-无，1-创建中，2-同步中，3-已断开
    */
    @SerializedName("DcnStatus")
    @Expose
    private Long DcnStatus;

    /**
    * 实例CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例内存大小，单位 GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例存储大小，单位 GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 付费模式
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例创建时间，格式为 2006-01-02 15:04:05
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例到期时间，格式为 2006-01-02 15:04:05
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例地域 
     * @return Region 实例地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例地域
     * @param Region 实例地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例可用区 
     * @return Zone 实例可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例可用区
     * @param Zone 实例可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例IP地址 
     * @return Vip 实例IP地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例IP地址
     * @param Vip 实例IP地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 实例IPv6地址 
     * @return Vipv6 实例IPv6地址
     */
    public String getVipv6() {
        return this.Vipv6;
    }

    /**
     * Set 实例IPv6地址
     * @param Vipv6 实例IPv6地址
     */
    public void setVipv6(String Vipv6) {
        this.Vipv6 = Vipv6;
    }

    /**
     * Get 实例端口 
     * @return Vport 实例端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 实例端口
     * @param Vport 实例端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 实例状态 
     * @return Status 实例状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态
     * @param Status 实例状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例状态描述 
     * @return StatusDesc 实例状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 实例状态描述
     * @param StatusDesc 实例状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 实例DCN标志，1-主，2-备 
     * @return DcnFlag 实例DCN标志，1-主，2-备
     */
    public Long getDcnFlag() {
        return this.DcnFlag;
    }

    /**
     * Set 实例DCN标志，1-主，2-备
     * @param DcnFlag 实例DCN标志，1-主，2-备
     */
    public void setDcnFlag(Long DcnFlag) {
        this.DcnFlag = DcnFlag;
    }

    /**
     * Get 实例DCN状态，0-无，1-创建中，2-同步中，3-已断开 
     * @return DcnStatus 实例DCN状态，0-无，1-创建中，2-同步中，3-已断开
     */
    public Long getDcnStatus() {
        return this.DcnStatus;
    }

    /**
     * Set 实例DCN状态，0-无，1-创建中，2-同步中，3-已断开
     * @param DcnStatus 实例DCN状态，0-无，1-创建中，2-同步中，3-已断开
     */
    public void setDcnStatus(Long DcnStatus) {
        this.DcnStatus = DcnStatus;
    }

    /**
     * Get 实例CPU核数 
     * @return Cpu 实例CPU核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例CPU核数
     * @param Cpu 实例CPU核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例内存大小，单位 GB 
     * @return Memory 实例内存大小，单位 GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存大小，单位 GB
     * @param Memory 实例内存大小，单位 GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例存储大小，单位 GB 
     * @return Storage 实例存储大小，单位 GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 实例存储大小，单位 GB
     * @param Storage 实例存储大小，单位 GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 付费模式 
     * @return PayMode 付费模式
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式
     * @param PayMode 付费模式
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例创建时间，格式为 2006-01-02 15:04:05 
     * @return CreateTime 实例创建时间，格式为 2006-01-02 15:04:05
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间，格式为 2006-01-02 15:04:05
     * @param CreateTime 实例创建时间，格式为 2006-01-02 15:04:05
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例到期时间，格式为 2006-01-02 15:04:05 
     * @return PeriodEndTime 实例到期时间，格式为 2006-01-02 15:04:05
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 实例到期时间，格式为 2006-01-02 15:04:05
     * @param PeriodEndTime 实例到期时间，格式为 2006-01-02 15:04:05
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型） 
     * @return InstanceType 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
     * @param InstanceType 1： 主实例（独享型）, 2: 主实例, 3： 灾备实例, 4： 灾备实例（独享型）
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    public DcnDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DcnDetailItem(DcnDetailItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vipv6 != null) {
            this.Vipv6 = new String(source.Vipv6);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.DcnFlag != null) {
            this.DcnFlag = new Long(source.DcnFlag);
        }
        if (source.DcnStatus != null) {
            this.DcnStatus = new Long(source.DcnStatus);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PeriodEndTime != null) {
            this.PeriodEndTime = new String(source.PeriodEndTime);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vipv6", this.Vipv6);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "DcnFlag", this.DcnFlag);
        this.setParamSimple(map, prefix + "DcnStatus", this.DcnStatus);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

