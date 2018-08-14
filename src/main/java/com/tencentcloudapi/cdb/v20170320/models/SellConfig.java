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

public class SellConfig  extends AbstractModel{

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
     * 获取设备类型
     * @return Device 设备类型
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * 设置设备类型
     * @param Device 设备类型
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * 获取售卖规格描述
     * @return Type 售卖规格描述
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置售卖规格描述
     * @param Type 售卖规格描述
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取实例类型
     * @return CdbType 实例类型
     */
    public String getCdbType() {
        return this.CdbType;
    }

    /**
     * 设置实例类型
     * @param CdbType 实例类型
     */
    public void setCdbType(String CdbType) {
        this.CdbType = CdbType;
    }

    /**
     * 获取内存大小，单位为MB
     * @return Memory 内存大小，单位为MB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置内存大小，单位为MB
     * @param Memory 内存大小，单位为MB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取CPU核心数
     * @return Cpu CPU核心数
     */
    public Integer getCpu() {
        return this.Cpu;
    }

    /**
     * 设置CPU核心数
     * @param Cpu CPU核心数
     */
    public void setCpu(Integer Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取磁盘最小规格，单位为GB
     * @return VolumeMin 磁盘最小规格，单位为GB
     */
    public Integer getVolumeMin() {
        return this.VolumeMin;
    }

    /**
     * 设置磁盘最小规格，单位为GB
     * @param VolumeMin 磁盘最小规格，单位为GB
     */
    public void setVolumeMin(Integer VolumeMin) {
        this.VolumeMin = VolumeMin;
    }

    /**
     * 获取磁盘最大规格，单位为GB
     * @return VolumeMax 磁盘最大规格，单位为GB
     */
    public Integer getVolumeMax() {
        return this.VolumeMax;
    }

    /**
     * 设置磁盘最大规格，单位为GB
     * @param VolumeMax 磁盘最大规格，单位为GB
     */
    public void setVolumeMax(Integer VolumeMax) {
        this.VolumeMax = VolumeMax;
    }

    /**
     * 获取磁盘步长，单位为GB
     * @return VolumeStep 磁盘步长，单位为GB
     */
    public Integer getVolumeStep() {
        return this.VolumeStep;
    }

    /**
     * 设置磁盘步长，单位为GB
     * @param VolumeStep 磁盘步长，单位为GB
     */
    public void setVolumeStep(Integer VolumeStep) {
        this.VolumeStep = VolumeStep;
    }

    /**
     * 获取链接数
     * @return Connection 链接数
     */
    public Integer getConnection() {
        return this.Connection;
    }

    /**
     * 设置链接数
     * @param Connection 链接数
     */
    public void setConnection(Integer Connection) {
        this.Connection = Connection;
    }

    /**
     * 获取每秒查询数量
     * @return Qps 每秒查询数量
     */
    public Integer getQps() {
        return this.Qps;
    }

    /**
     * 设置每秒查询数量
     * @param Qps 每秒查询数量
     */
    public void setQps(Integer Qps) {
        this.Qps = Qps;
    }

    /**
     * 获取每秒IO数量
     * @return Iops 每秒IO数量
     */
    public Integer getIops() {
        return this.Iops;
    }

    /**
     * 设置每秒IO数量
     * @param Iops 每秒IO数量
     */
    public void setIops(Integer Iops) {
        this.Iops = Iops;
    }

    /**
     * 获取应用场景描述
     * @return Info 应用场景描述
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * 设置应用场景描述
     * @param Info 应用场景描述
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * 获取状态值
     * @return Status 状态值
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态值
     * @param Status 状态值
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
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

