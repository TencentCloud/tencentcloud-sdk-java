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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SellConfig extends AbstractModel{

    /**
    * 设备类型
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * 售卖规格描述
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 实例类型
    */
    @SerializedName("CdbType")
    @Expose
    private String CdbType;

    /**
    * 内存大小，单位为MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * CPU核心数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 磁盘最小规格，单位为GB
    */
    @SerializedName("VolumeMin")
    @Expose
    private Long VolumeMin;

    /**
    * 磁盘最大规格，单位为GB
    */
    @SerializedName("VolumeMax")
    @Expose
    private Long VolumeMax;

    /**
    * 磁盘步长，单位为GB
    */
    @SerializedName("VolumeStep")
    @Expose
    private Long VolumeStep;

    /**
    * 链接数
    */
    @SerializedName("Connection")
    @Expose
    private Long Connection;

    /**
    * 每秒查询数量
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 每秒IO数量
    */
    @SerializedName("Iops")
    @Expose
    private Long Iops;

    /**
    * 应用场景描述
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 状态值
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 标签值
    */
    @SerializedName("Tag")
    @Expose
    private Long Tag;

    /**
     * Get 设备类型 
     * @return Device 设备类型
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set 设备类型
     * @param Device 设备类型
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get 售卖规格描述 
     * @return Type 售卖规格描述
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 售卖规格描述
     * @param Type 售卖规格描述
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 实例类型 
     * @return CdbType 实例类型
     */
    public String getCdbType() {
        return this.CdbType;
    }

    /**
     * Set 实例类型
     * @param CdbType 实例类型
     */
    public void setCdbType(String CdbType) {
        this.CdbType = CdbType;
    }

    /**
     * Get 内存大小，单位为MB 
     * @return Memory 内存大小，单位为MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位为MB
     * @param Memory 内存大小，单位为MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get CPU核心数 
     * @return Cpu CPU核心数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核心数
     * @param Cpu CPU核心数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 磁盘最小规格，单位为GB 
     * @return VolumeMin 磁盘最小规格，单位为GB
     */
    public Long getVolumeMin() {
        return this.VolumeMin;
    }

    /**
     * Set 磁盘最小规格，单位为GB
     * @param VolumeMin 磁盘最小规格，单位为GB
     */
    public void setVolumeMin(Long VolumeMin) {
        this.VolumeMin = VolumeMin;
    }

    /**
     * Get 磁盘最大规格，单位为GB 
     * @return VolumeMax 磁盘最大规格，单位为GB
     */
    public Long getVolumeMax() {
        return this.VolumeMax;
    }

    /**
     * Set 磁盘最大规格，单位为GB
     * @param VolumeMax 磁盘最大规格，单位为GB
     */
    public void setVolumeMax(Long VolumeMax) {
        this.VolumeMax = VolumeMax;
    }

    /**
     * Get 磁盘步长，单位为GB 
     * @return VolumeStep 磁盘步长，单位为GB
     */
    public Long getVolumeStep() {
        return this.VolumeStep;
    }

    /**
     * Set 磁盘步长，单位为GB
     * @param VolumeStep 磁盘步长，单位为GB
     */
    public void setVolumeStep(Long VolumeStep) {
        this.VolumeStep = VolumeStep;
    }

    /**
     * Get 链接数 
     * @return Connection 链接数
     */
    public Long getConnection() {
        return this.Connection;
    }

    /**
     * Set 链接数
     * @param Connection 链接数
     */
    public void setConnection(Long Connection) {
        this.Connection = Connection;
    }

    /**
     * Get 每秒查询数量 
     * @return Qps 每秒查询数量
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 每秒查询数量
     * @param Qps 每秒查询数量
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 每秒IO数量 
     * @return Iops 每秒IO数量
     */
    public Long getIops() {
        return this.Iops;
    }

    /**
     * Set 每秒IO数量
     * @param Iops 每秒IO数量
     */
    public void setIops(Long Iops) {
        this.Iops = Iops;
    }

    /**
     * Get 应用场景描述 
     * @return Info 应用场景描述
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set 应用场景描述
     * @param Info 应用场景描述
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Get 状态值 
     * @return Status 状态值
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值
     * @param Status 状态值
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 标签值 
     * @return Tag 标签值
     */
    public Long getTag() {
        return this.Tag;
    }

    /**
     * Set 标签值
     * @param Tag 标签值
     */
    public void setTag(Long Tag) {
        this.Tag = Tag;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CdbType", this.CdbType);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "VolumeMin", this.VolumeMin);
        this.setParamSimple(map, prefix + "VolumeMax", this.VolumeMax);
        this.setParamSimple(map, prefix + "VolumeStep", this.VolumeStep);
        this.setParamSimple(map, prefix + "Connection", this.Connection);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "Iops", this.Iops);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

