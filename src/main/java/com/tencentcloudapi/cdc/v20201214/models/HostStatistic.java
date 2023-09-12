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

public class HostStatistic extends AbstractModel{

    /**
    * 宿主机规格
    */
    @SerializedName("HostType")
    @Expose
    private String HostType;

    /**
    * 宿主机机型系列
    */
    @SerializedName("HostFamily")
    @Expose
    private String HostFamily;

    /**
    * 宿主机的CPU核数，单位：核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 宿主机内存大小，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 该规格宿主机的数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 平均cpu负载百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuAverage")
    @Expose
    private Float CpuAverage;

    /**
    * 平均内存使用率百分比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemAverage")
    @Expose
    private Float MemAverage;

    /**
    * 平均网络流量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetAverage")
    @Expose
    private Float NetAverage;

    /**
    * cpu详细监控数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuDetailData")
    @Expose
    private DetailData CpuDetailData;

    /**
    * 内存详细数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemDetailData")
    @Expose
    private DetailData MemDetailData;

    /**
    * 网络速率详细数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetRateDetailData")
    @Expose
    private DetailData NetRateDetailData;

    /**
    * 网速包详细数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetPacketDetailData")
    @Expose
    private DetailData NetPacketDetailData;

    /**
     * Get 宿主机规格 
     * @return HostType 宿主机规格
     */
    public String getHostType() {
        return this.HostType;
    }

    /**
     * Set 宿主机规格
     * @param HostType 宿主机规格
     */
    public void setHostType(String HostType) {
        this.HostType = HostType;
    }

    /**
     * Get 宿主机机型系列 
     * @return HostFamily 宿主机机型系列
     */
    public String getHostFamily() {
        return this.HostFamily;
    }

    /**
     * Set 宿主机机型系列
     * @param HostFamily 宿主机机型系列
     */
    public void setHostFamily(String HostFamily) {
        this.HostFamily = HostFamily;
    }

    /**
     * Get 宿主机的CPU核数，单位：核 
     * @return Cpu 宿主机的CPU核数，单位：核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 宿主机的CPU核数，单位：核
     * @param Cpu 宿主机的CPU核数，单位：核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 宿主机内存大小，单位：GB 
     * @return Memory 宿主机内存大小，单位：GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 宿主机内存大小，单位：GB
     * @param Memory 宿主机内存大小，单位：GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 该规格宿主机的数量 
     * @return Count 该规格宿主机的数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该规格宿主机的数量
     * @param Count 该规格宿主机的数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 平均cpu负载百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuAverage 平均cpu负载百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpuAverage() {
        return this.CpuAverage;
    }

    /**
     * Set 平均cpu负载百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuAverage 平均cpu负载百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuAverage(Float CpuAverage) {
        this.CpuAverage = CpuAverage;
    }

    /**
     * Get 平均内存使用率百分比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemAverage 平均内存使用率百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMemAverage() {
        return this.MemAverage;
    }

    /**
     * Set 平均内存使用率百分比
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemAverage 平均内存使用率百分比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemAverage(Float MemAverage) {
        this.MemAverage = MemAverage;
    }

    /**
     * Get 平均网络流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetAverage 平均网络流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getNetAverage() {
        return this.NetAverage;
    }

    /**
     * Set 平均网络流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetAverage 平均网络流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetAverage(Float NetAverage) {
        this.NetAverage = NetAverage;
    }

    /**
     * Get cpu详细监控数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuDetailData cpu详细监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailData getCpuDetailData() {
        return this.CpuDetailData;
    }

    /**
     * Set cpu详细监控数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuDetailData cpu详细监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuDetailData(DetailData CpuDetailData) {
        this.CpuDetailData = CpuDetailData;
    }

    /**
     * Get 内存详细数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemDetailData 内存详细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailData getMemDetailData() {
        return this.MemDetailData;
    }

    /**
     * Set 内存详细数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemDetailData 内存详细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemDetailData(DetailData MemDetailData) {
        this.MemDetailData = MemDetailData;
    }

    /**
     * Get 网络速率详细数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetRateDetailData 网络速率详细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailData getNetRateDetailData() {
        return this.NetRateDetailData;
    }

    /**
     * Set 网络速率详细数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetRateDetailData 网络速率详细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetRateDetailData(DetailData NetRateDetailData) {
        this.NetRateDetailData = NetRateDetailData;
    }

    /**
     * Get 网速包详细数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetPacketDetailData 网速包详细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailData getNetPacketDetailData() {
        return this.NetPacketDetailData;
    }

    /**
     * Set 网速包详细数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetPacketDetailData 网速包详细数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetPacketDetailData(DetailData NetPacketDetailData) {
        this.NetPacketDetailData = NetPacketDetailData;
    }

    public HostStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostStatistic(HostStatistic source) {
        if (source.HostType != null) {
            this.HostType = new String(source.HostType);
        }
        if (source.HostFamily != null) {
            this.HostFamily = new String(source.HostFamily);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CpuAverage != null) {
            this.CpuAverage = new Float(source.CpuAverage);
        }
        if (source.MemAverage != null) {
            this.MemAverage = new Float(source.MemAverage);
        }
        if (source.NetAverage != null) {
            this.NetAverage = new Float(source.NetAverage);
        }
        if (source.CpuDetailData != null) {
            this.CpuDetailData = new DetailData(source.CpuDetailData);
        }
        if (source.MemDetailData != null) {
            this.MemDetailData = new DetailData(source.MemDetailData);
        }
        if (source.NetRateDetailData != null) {
            this.NetRateDetailData = new DetailData(source.NetRateDetailData);
        }
        if (source.NetPacketDetailData != null) {
            this.NetPacketDetailData = new DetailData(source.NetPacketDetailData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "HostFamily", this.HostFamily);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "CpuAverage", this.CpuAverage);
        this.setParamSimple(map, prefix + "MemAverage", this.MemAverage);
        this.setParamSimple(map, prefix + "NetAverage", this.NetAverage);
        this.setParamObj(map, prefix + "CpuDetailData.", this.CpuDetailData);
        this.setParamObj(map, prefix + "MemDetailData.", this.MemDetailData);
        this.setParamObj(map, prefix + "NetRateDetailData.", this.NetRateDetailData);
        this.setParamObj(map, prefix + "NetPacketDetailData.", this.NetPacketDetailData);

    }
}

