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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdbInfo extends AbstractModel {

    /**
    * 数据库实例
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 数据库IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 数据库端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 数据库内存规格
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 数据库磁盘规格
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 服务标识
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 申请时间
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * 付费类型
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * 过期标识
    */
    @SerializedName("ExpireFlag")
    @Expose
    private Boolean ExpireFlag;

    /**
    * 数据库状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 续费标识
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Long IsAutoRenew;

    /**
    * 数据库字符串
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * ZoneId
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * RegionId
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 数据库实例 
     * @return InstanceName 数据库实例
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 数据库实例
     * @param InstanceName 数据库实例
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 数据库IP 
     * @return Ip 数据库IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 数据库IP
     * @param Ip 数据库IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 数据库端口 
     * @return Port 数据库端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 数据库端口
     * @param Port 数据库端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 数据库内存规格 
     * @return MemSize 数据库内存规格
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 数据库内存规格
     * @param MemSize 数据库内存规格
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 数据库磁盘规格 
     * @return Volume 数据库磁盘规格
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 数据库磁盘规格
     * @param Volume 数据库磁盘规格
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 服务标识 
     * @return Service 服务标识
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务标识
     * @param Service 服务标识
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 申请时间 
     * @return ApplyTime 申请时间
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set 申请时间
     * @param ApplyTime 申请时间
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get 付费类型 
     * @return PayType 付费类型
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set 付费类型
     * @param PayType 付费类型
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 过期标识 
     * @return ExpireFlag 过期标识
     */
    public Boolean getExpireFlag() {
        return this.ExpireFlag;
    }

    /**
     * Set 过期标识
     * @param ExpireFlag 过期标识
     */
    public void setExpireFlag(Boolean ExpireFlag) {
        this.ExpireFlag = ExpireFlag;
    }

    /**
     * Get 数据库状态 
     * @return Status 数据库状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 数据库状态
     * @param Status 数据库状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 续费标识 
     * @return IsAutoRenew 续费标识
     */
    public Long getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set 续费标识
     * @param IsAutoRenew 续费标识
     */
    public void setIsAutoRenew(Long IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get 数据库字符串 
     * @return SerialNo 数据库字符串
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 数据库字符串
     * @param SerialNo 数据库字符串
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get ZoneId 
     * @return ZoneId ZoneId
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ZoneId
     * @param ZoneId ZoneId
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get RegionId 
     * @return RegionId RegionId
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set RegionId
     * @param RegionId RegionId
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public CdbInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdbInfo(CdbInfo source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ApplyTime != null) {
            this.ApplyTime = new String(source.ApplyTime);
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.ExpireFlag != null) {
            this.ExpireFlag = new Boolean(source.ExpireFlag);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsAutoRenew != null) {
            this.IsAutoRenew = new Long(source.IsAutoRenew);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ApplyTime", this.ApplyTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "ExpireFlag", this.ExpireFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsAutoRenew", this.IsAutoRenew);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

