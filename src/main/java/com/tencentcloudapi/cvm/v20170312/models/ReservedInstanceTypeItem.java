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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstanceTypeItem extends AbstractModel{

    /**
    * 实例类型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * CPU核数。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * GPU数量。
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * FPGA数量。
    */
    @SerializedName("Fpga")
    @Expose
    private Long Fpga;

    /**
    * 本地存储块数量。
    */
    @SerializedName("StorageBlock")
    @Expose
    private Long StorageBlock;

    /**
    * 网卡数。
    */
    @SerializedName("NetworkCard")
    @Expose
    private Long NetworkCard;

    /**
    * 最大带宽。
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Float MaxBandwidth;

    /**
    * 主频。
    */
    @SerializedName("Frequency")
    @Expose
    private String Frequency;

    /**
    * CPU型号名称。
    */
    @SerializedName("CpuModelName")
    @Expose
    private String CpuModelName;

    /**
    * 包转发率。
    */
    @SerializedName("Pps")
    @Expose
    private Long Pps;

    /**
    * 外部信息。
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * 备注信息。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 预留实例配置价格信息。
    */
    @SerializedName("Prices")
    @Expose
    private ReservedInstancePriceItem [] Prices;

    /**
     * Get 实例类型。 
     * @return InstanceType 实例类型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型。
     * @param InstanceType 实例类型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get CPU核数。 
     * @return Cpu CPU核数。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数。
     * @param Cpu CPU核数。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小。 
     * @return Memory 内存大小。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小。
     * @param Memory 内存大小。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get GPU数量。 
     * @return Gpu GPU数量。
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set GPU数量。
     * @param Gpu GPU数量。
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get FPGA数量。 
     * @return Fpga FPGA数量。
     */
    public Long getFpga() {
        return this.Fpga;
    }

    /**
     * Set FPGA数量。
     * @param Fpga FPGA数量。
     */
    public void setFpga(Long Fpga) {
        this.Fpga = Fpga;
    }

    /**
     * Get 本地存储块数量。 
     * @return StorageBlock 本地存储块数量。
     */
    public Long getStorageBlock() {
        return this.StorageBlock;
    }

    /**
     * Set 本地存储块数量。
     * @param StorageBlock 本地存储块数量。
     */
    public void setStorageBlock(Long StorageBlock) {
        this.StorageBlock = StorageBlock;
    }

    /**
     * Get 网卡数。 
     * @return NetworkCard 网卡数。
     */
    public Long getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * Set 网卡数。
     * @param NetworkCard 网卡数。
     */
    public void setNetworkCard(Long NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    /**
     * Get 最大带宽。 
     * @return MaxBandwidth 最大带宽。
     */
    public Float getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set 最大带宽。
     * @param MaxBandwidth 最大带宽。
     */
    public void setMaxBandwidth(Float MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get 主频。 
     * @return Frequency 主频。
     */
    public String getFrequency() {
        return this.Frequency;
    }

    /**
     * Set 主频。
     * @param Frequency 主频。
     */
    public void setFrequency(String Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Get CPU型号名称。 
     * @return CpuModelName CPU型号名称。
     */
    public String getCpuModelName() {
        return this.CpuModelName;
    }

    /**
     * Set CPU型号名称。
     * @param CpuModelName CPU型号名称。
     */
    public void setCpuModelName(String CpuModelName) {
        this.CpuModelName = CpuModelName;
    }

    /**
     * Get 包转发率。 
     * @return Pps 包转发率。
     */
    public Long getPps() {
        return this.Pps;
    }

    /**
     * Set 包转发率。
     * @param Pps 包转发率。
     */
    public void setPps(Long Pps) {
        this.Pps = Pps;
    }

    /**
     * Get 外部信息。 
     * @return Externals 外部信息。
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * Set 外部信息。
     * @param Externals 外部信息。
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * Get 备注信息。 
     * @return Remark 备注信息。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注信息。
     * @param Remark 备注信息。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 预留实例配置价格信息。 
     * @return Prices 预留实例配置价格信息。
     */
    public ReservedInstancePriceItem [] getPrices() {
        return this.Prices;
    }

    /**
     * Set 预留实例配置价格信息。
     * @param Prices 预留实例配置价格信息。
     */
    public void setPrices(ReservedInstancePriceItem [] Prices) {
        this.Prices = Prices;
    }

    public ReservedInstanceTypeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstanceTypeItem(ReservedInstanceTypeItem source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.Fpga != null) {
            this.Fpga = new Long(source.Fpga);
        }
        if (source.StorageBlock != null) {
            this.StorageBlock = new Long(source.StorageBlock);
        }
        if (source.NetworkCard != null) {
            this.NetworkCard = new Long(source.NetworkCard);
        }
        if (source.MaxBandwidth != null) {
            this.MaxBandwidth = new Float(source.MaxBandwidth);
        }
        if (source.Frequency != null) {
            this.Frequency = new String(source.Frequency);
        }
        if (source.CpuModelName != null) {
            this.CpuModelName = new String(source.CpuModelName);
        }
        if (source.Pps != null) {
            this.Pps = new Long(source.Pps);
        }
        if (source.Externals != null) {
            this.Externals = new Externals(source.Externals);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Prices != null) {
            this.Prices = new ReservedInstancePriceItem[source.Prices.length];
            for (int i = 0; i < source.Prices.length; i++) {
                this.Prices[i] = new ReservedInstancePriceItem(source.Prices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "Fpga", this.Fpga);
        this.setParamSimple(map, prefix + "StorageBlock", this.StorageBlock);
        this.setParamSimple(map, prefix + "NetworkCard", this.NetworkCard);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamSimple(map, prefix + "Frequency", this.Frequency);
        this.setParamSimple(map, prefix + "CpuModelName", this.CpuModelName);
        this.setParamSimple(map, prefix + "Pps", this.Pps);
        this.setParamObj(map, prefix + "Externals.", this.Externals);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "Prices.", this.Prices);

    }
}

