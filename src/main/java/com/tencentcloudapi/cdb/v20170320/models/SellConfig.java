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
    private Integer Memory;

    /**
    * CPU核心数
    */
    @SerializedName("Cpu")
    @Expose
    private Integer Cpu;

    /**
    * 磁盘最小规格，单位为GB
    */
    @SerializedName("VolumeMin")
    @Expose
    private Integer VolumeMin;

    /**
    * 磁盘最大规格，单位为GB
    */
    @SerializedName("VolumeMax")
    @Expose
    private Integer VolumeMax;

    /**
    * 磁盘步长，单位为GB
    */
    @SerializedName("VolumeStep")
    @Expose
    private Integer VolumeStep;

    /**
    * 链接数
    */
    @SerializedName("Connection")
    @Expose
    private Integer Connection;

    /**
    * 每秒查询数量
    */
    @SerializedName("Qps")
    @Expose
    private Integer Qps;

    /**
    * 每秒IO数量
    */
    @SerializedName("Iops")
    @Expose
    private Integer Iops;

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
    private Integer Status;

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
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位为MB
     * @param Memory 内存大小，单位为MB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * Get CPU核心数 
     * @return Cpu CPU核心数
     */
    public Integer getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核心数
     * @param Cpu CPU核心数
     */
    public void setCpu(Integer Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 磁盘最小规格，单位为GB 
     * @return VolumeMin 磁盘最小规格，单位为GB
     */
    public Integer getVolumeMin() {
        return this.VolumeMin;
    }

    /**
     * Set 磁盘最小规格，单位为GB
     * @param VolumeMin 磁盘最小规格，单位为GB
     */
    public void setVolumeMin(Integer VolumeMin) {
        this.VolumeMin = VolumeMin;
    }

    /**
     * Get 磁盘最大规格，单位为GB 
     * @return VolumeMax 磁盘最大规格，单位为GB
     */
    public Integer getVolumeMax() {
        return this.VolumeMax;
    }

    /**
     * Set 磁盘最大规格，单位为GB
     * @param VolumeMax 磁盘最大规格，单位为GB
     */
    public void setVolumeMax(Integer VolumeMax) {
        this.VolumeMax = VolumeMax;
    }

    /**
     * Get 磁盘步长，单位为GB 
     * @return VolumeStep 磁盘步长，单位为GB
     */
    public Integer getVolumeStep() {
        return this.VolumeStep;
    }

    /**
     * Set 磁盘步长，单位为GB
     * @param VolumeStep 磁盘步长，单位为GB
     */
    public void setVolumeStep(Integer VolumeStep) {
        this.VolumeStep = VolumeStep;
    }

    /**
     * Get 链接数 
     * @return Connection 链接数
     */
    public Integer getConnection() {
        return this.Connection;
    }

    /**
     * Set 链接数
     * @param Connection 链接数
     */
    public void setConnection(Integer Connection) {
        this.Connection = Connection;
    }

    /**
     * Get 每秒查询数量 
     * @return Qps 每秒查询数量
     */
    public Integer getQps() {
        return this.Qps;
    }

    /**
     * Set 每秒查询数量
     * @param Qps 每秒查询数量
     */
    public void setQps(Integer Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 每秒IO数量 
     * @return Iops 每秒IO数量
     */
    public Integer getIops() {
        return this.Iops;
    }

    /**
     * Set 每秒IO数量
     * @param Iops 每秒IO数量
     */
    public void setIops(Integer Iops) {
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
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * Set 状态值
     * @param Status 状态值
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
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

    }
}

