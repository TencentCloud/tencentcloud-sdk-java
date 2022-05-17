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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedClusterInstanceType extends AbstractModel{

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 规格名称
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 网卡类型，例如：25代表25G网卡
    */
    @SerializedName("NetworkCard")
    @Expose
    private Long NetworkCard;

    /**
    * 实例的CPU核数，单位：核。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例内存容量，单位：`GB`。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例机型系列。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 机型名称。
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 本地存储块数量。
    */
    @SerializedName("StorageBlockAmount")
    @Expose
    private Long StorageBlockAmount;

    /**
    * 内网带宽，单位Gbps。
    */
    @SerializedName("InstanceBandwidth")
    @Expose
    private Float InstanceBandwidth;

    /**
    * 网络收发包能力，单位万PPS。
    */
    @SerializedName("InstancePps")
    @Expose
    private Long InstancePps;

    /**
    * 处理器型号。
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * 实例的GPU数量。
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 实例的FPGA数量。
    */
    @SerializedName("Fpga")
    @Expose
    private Long Fpga;

    /**
    * 机型描述
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 规格名称 
     * @return InstanceType 规格名称
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 规格名称
     * @param InstanceType 规格名称
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 网卡类型，例如：25代表25G网卡 
     * @return NetworkCard 网卡类型，例如：25代表25G网卡
     */
    public Long getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * Set 网卡类型，例如：25代表25G网卡
     * @param NetworkCard 网卡类型，例如：25代表25G网卡
     */
    public void setNetworkCard(Long NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    /**
     * Get 实例的CPU核数，单位：核。 
     * @return Cpu 实例的CPU核数，单位：核。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例的CPU核数，单位：核。
     * @param Cpu 实例的CPU核数，单位：核。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例内存容量，单位：`GB`。 
     * @return Memory 实例内存容量，单位：`GB`。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例内存容量，单位：`GB`。
     * @param Memory 实例内存容量，单位：`GB`。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例机型系列。 
     * @return InstanceFamily 实例机型系列。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 实例机型系列。
     * @param InstanceFamily 实例机型系列。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 机型名称。 
     * @return TypeName 机型名称。
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 机型名称。
     * @param TypeName 机型名称。
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get 本地存储块数量。 
     * @return StorageBlockAmount 本地存储块数量。
     */
    public Long getStorageBlockAmount() {
        return this.StorageBlockAmount;
    }

    /**
     * Set 本地存储块数量。
     * @param StorageBlockAmount 本地存储块数量。
     */
    public void setStorageBlockAmount(Long StorageBlockAmount) {
        this.StorageBlockAmount = StorageBlockAmount;
    }

    /**
     * Get 内网带宽，单位Gbps。 
     * @return InstanceBandwidth 内网带宽，单位Gbps。
     */
    public Float getInstanceBandwidth() {
        return this.InstanceBandwidth;
    }

    /**
     * Set 内网带宽，单位Gbps。
     * @param InstanceBandwidth 内网带宽，单位Gbps。
     */
    public void setInstanceBandwidth(Float InstanceBandwidth) {
        this.InstanceBandwidth = InstanceBandwidth;
    }

    /**
     * Get 网络收发包能力，单位万PPS。 
     * @return InstancePps 网络收发包能力，单位万PPS。
     */
    public Long getInstancePps() {
        return this.InstancePps;
    }

    /**
     * Set 网络收发包能力，单位万PPS。
     * @param InstancePps 网络收发包能力，单位万PPS。
     */
    public void setInstancePps(Long InstancePps) {
        this.InstancePps = InstancePps;
    }

    /**
     * Get 处理器型号。 
     * @return CpuType 处理器型号。
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set 处理器型号。
     * @param CpuType 处理器型号。
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get 实例的GPU数量。 
     * @return Gpu 实例的GPU数量。
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set 实例的GPU数量。
     * @param Gpu 实例的GPU数量。
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 实例的FPGA数量。 
     * @return Fpga 实例的FPGA数量。
     */
    public Long getFpga() {
        return this.Fpga;
    }

    /**
     * Set 实例的FPGA数量。
     * @param Fpga 实例的FPGA数量。
     */
    public void setFpga(Long Fpga) {
        this.Fpga = Fpga;
    }

    /**
     * Get 机型描述 
     * @return Remark 机型描述
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 机型描述
     * @param Remark 机型描述
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。 
     * @return Status 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
     * @param Status 实例是否售卖。取值范围： <br><li>SELL：表示实例可购买<br><li>SOLD_OUT：表示实例已售罄。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DedicatedClusterInstanceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedClusterInstanceType(DedicatedClusterInstanceType source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.NetworkCard != null) {
            this.NetworkCard = new Long(source.NetworkCard);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.StorageBlockAmount != null) {
            this.StorageBlockAmount = new Long(source.StorageBlockAmount);
        }
        if (source.InstanceBandwidth != null) {
            this.InstanceBandwidth = new Float(source.InstanceBandwidth);
        }
        if (source.InstancePps != null) {
            this.InstancePps = new Long(source.InstancePps);
        }
        if (source.CpuType != null) {
            this.CpuType = new String(source.CpuType);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.Fpga != null) {
            this.Fpga = new Long(source.Fpga);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "NetworkCard", this.NetworkCard);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "StorageBlockAmount", this.StorageBlockAmount);
        this.setParamSimple(map, prefix + "InstanceBandwidth", this.InstanceBandwidth);
        this.setParamSimple(map, prefix + "InstancePps", this.InstancePps);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "Fpga", this.Fpga);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

