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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdbInfo extends AbstractModel{

    /**
    * 数据库实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 数据库IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 数据库端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 数据库内存规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * 数据库磁盘规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 服务标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 申请时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyTime")
    @Expose
    private String ApplyTime;

    /**
    * 付费类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * 过期标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireFlag")
    @Expose
    private Boolean ExpireFlag;

    /**
    * 数据库状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 续费标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAutoRenew")
    @Expose
    private Long IsAutoRenew;

    /**
    * 数据库字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * ZoneId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * RegionId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 数据库实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 数据库实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 数据库实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 数据库实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 数据库IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 数据库IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 数据库IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 数据库IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 数据库端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 数据库端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 数据库端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 数据库端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 数据库内存规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemSize 数据库内存规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 数据库内存规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemSize 数据库内存规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 数据库磁盘规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Volume 数据库磁盘规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 数据库磁盘规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Volume 数据库磁盘规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 服务标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Service 服务标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Service 服务标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 申请时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplyTime() {
        return this.ApplyTime;
    }

    /**
     * Set 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyTime(String ApplyTime) {
        this.ApplyTime = ApplyTime;
    }

    /**
     * Get 付费类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayType 付费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set 付费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayType 付费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 过期标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireFlag 过期标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getExpireFlag() {
        return this.ExpireFlag;
    }

    /**
     * Set 过期标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireFlag 过期标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireFlag(Boolean ExpireFlag) {
        this.ExpireFlag = ExpireFlag;
    }

    /**
     * Get 数据库状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 数据库状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 数据库状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 数据库状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 续费标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAutoRenew 续费标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAutoRenew() {
        return this.IsAutoRenew;
    }

    /**
     * Set 续费标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAutoRenew 续费标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAutoRenew(Long IsAutoRenew) {
        this.IsAutoRenew = IsAutoRenew;
    }

    /**
     * Get 数据库字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialNo 数据库字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set 数据库字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialNo 数据库字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get ZoneId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId ZoneId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ZoneId
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId ZoneId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get RegionId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId RegionId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set RegionId
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId RegionId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
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

