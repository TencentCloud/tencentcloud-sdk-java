/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceInfo extends AbstractModel {

    /**
    * <p>处理器资源, 单位为1/1000核</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存资源, 单位为1M</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Gpu卡个数资源, 单位为0.01单位的GpuType.<br>Gpu=100表示使用了“一张”gpu卡, 但此处的“一张”卡有可能是虚拟化后的1/4卡, 也有可能是整张卡. 取决于实例的机型<br>例1 实例的机型带有1张虚拟gpu卡, 每张虚拟gpu卡对应1/4张实际T4卡, 则此时 GpuType=T4, Gpu=100, RealGpu=25.<br>例2 实例的机型带有4张gpu整卡, 每张卡对应1张实际T4卡, 则 此时 GpuType=T4, Gpu=400, RealGpu=400.</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * <p>Gpu卡型号 T4或者V100。仅展示当前 GPU 卡型号，若存在多类型同时使用，则参考 RealGpuDetailSet 的值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * <p>创建或更新时无需填写，仅展示需要关注<br>后付费非整卡实例对应的实际的Gpu卡资源, 表示gpu资源对应实际的gpu卡个数.<br>RealGpu=100表示实际使用了一张gpu卡, 对应实际的实例机型, 有可能代表带有1/4卡的实例4个, 或者带有1/2卡的实例2个, 或者带有1卡的实力1个.</p>
    */
    @SerializedName("RealGpu")
    @Expose
    private Long RealGpu;

    /**
    * <p>创建或更新时无需填写，仅展示需要关注。详细的GPU使用信息。</p>
    */
    @SerializedName("RealGpuDetailSet")
    @Expose
    private GpuDetail [] RealGpuDetailSet;

    /**
    * <p>是否开启rdma</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableRDMA")
    @Expose
    private Boolean EnableRDMA;

    /**
    * <p>rdma number</p>
    */
    @SerializedName("RdmaNumber")
    @Expose
    private Long RdmaNumber;

    /**
    * <p>root disk size(GB)</p>
    */
    @SerializedName("RootDisk")
    @Expose
    private Long RootDisk;

    /**
    * <p>data disk size(GB)</p>
    */
    @SerializedName("DataDisk")
    @Expose
    private Long DataDisk;

    /**
    * <p>rdma</p><p>取值范围：[0, 99]</p>
    */
    @SerializedName("Rdma")
    @Expose
    private Long Rdma;

    /**
     * Get <p>处理器资源, 单位为1/1000核</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu <p>处理器资源, 单位为1/1000核</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>处理器资源, 单位为1/1000核</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu <p>处理器资源, 单位为1/1000核</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存资源, 单位为1M</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory <p>内存资源, 单位为1M</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存资源, 单位为1M</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory <p>内存资源, 单位为1M</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Gpu卡个数资源, 单位为0.01单位的GpuType.<br>Gpu=100表示使用了“一张”gpu卡, 但此处的“一张”卡有可能是虚拟化后的1/4卡, 也有可能是整张卡. 取决于实例的机型<br>例1 实例的机型带有1张虚拟gpu卡, 每张虚拟gpu卡对应1/4张实际T4卡, 则此时 GpuType=T4, Gpu=100, RealGpu=25.<br>例2 实例的机型带有4张gpu整卡, 每张卡对应1张实际T4卡, 则 此时 GpuType=T4, Gpu=400, RealGpu=400.</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gpu <p>Gpu卡个数资源, 单位为0.01单位的GpuType.<br>Gpu=100表示使用了“一张”gpu卡, 但此处的“一张”卡有可能是虚拟化后的1/4卡, 也有可能是整张卡. 取决于实例的机型<br>例1 实例的机型带有1张虚拟gpu卡, 每张虚拟gpu卡对应1/4张实际T4卡, 则此时 GpuType=T4, Gpu=100, RealGpu=25.<br>例2 实例的机型带有4张gpu整卡, 每张卡对应1张实际T4卡, 则 此时 GpuType=T4, Gpu=400, RealGpu=400.</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set <p>Gpu卡个数资源, 单位为0.01单位的GpuType.<br>Gpu=100表示使用了“一张”gpu卡, 但此处的“一张”卡有可能是虚拟化后的1/4卡, 也有可能是整张卡. 取决于实例的机型<br>例1 实例的机型带有1张虚拟gpu卡, 每张虚拟gpu卡对应1/4张实际T4卡, 则此时 GpuType=T4, Gpu=100, RealGpu=25.<br>例2 实例的机型带有4张gpu整卡, 每张卡对应1张实际T4卡, 则 此时 GpuType=T4, Gpu=400, RealGpu=400.</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gpu <p>Gpu卡个数资源, 单位为0.01单位的GpuType.<br>Gpu=100表示使用了“一张”gpu卡, 但此处的“一张”卡有可能是虚拟化后的1/4卡, 也有可能是整张卡. 取决于实例的机型<br>例1 实例的机型带有1张虚拟gpu卡, 每张虚拟gpu卡对应1/4张实际T4卡, 则此时 GpuType=T4, Gpu=100, RealGpu=25.<br>例2 实例的机型带有4张gpu整卡, 每张卡对应1张实际T4卡, 则 此时 GpuType=T4, Gpu=400, RealGpu=400.</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get <p>Gpu卡型号 T4或者V100。仅展示当前 GPU 卡型号，若存在多类型同时使用，则参考 RealGpuDetailSet 的值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuType <p>Gpu卡型号 T4或者V100。仅展示当前 GPU 卡型号，若存在多类型同时使用，则参考 RealGpuDetailSet 的值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set <p>Gpu卡型号 T4或者V100。仅展示当前 GPU 卡型号，若存在多类型同时使用，则参考 RealGpuDetailSet 的值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuType <p>Gpu卡型号 T4或者V100。仅展示当前 GPU 卡型号，若存在多类型同时使用，则参考 RealGpuDetailSet 的值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get <p>创建或更新时无需填写，仅展示需要关注<br>后付费非整卡实例对应的实际的Gpu卡资源, 表示gpu资源对应实际的gpu卡个数.<br>RealGpu=100表示实际使用了一张gpu卡, 对应实际的实例机型, 有可能代表带有1/4卡的实例4个, 或者带有1/2卡的实例2个, 或者带有1卡的实力1个.</p> 
     * @return RealGpu <p>创建或更新时无需填写，仅展示需要关注<br>后付费非整卡实例对应的实际的Gpu卡资源, 表示gpu资源对应实际的gpu卡个数.<br>RealGpu=100表示实际使用了一张gpu卡, 对应实际的实例机型, 有可能代表带有1/4卡的实例4个, 或者带有1/2卡的实例2个, 或者带有1卡的实力1个.</p>
     */
    public Long getRealGpu() {
        return this.RealGpu;
    }

    /**
     * Set <p>创建或更新时无需填写，仅展示需要关注<br>后付费非整卡实例对应的实际的Gpu卡资源, 表示gpu资源对应实际的gpu卡个数.<br>RealGpu=100表示实际使用了一张gpu卡, 对应实际的实例机型, 有可能代表带有1/4卡的实例4个, 或者带有1/2卡的实例2个, 或者带有1卡的实力1个.</p>
     * @param RealGpu <p>创建或更新时无需填写，仅展示需要关注<br>后付费非整卡实例对应的实际的Gpu卡资源, 表示gpu资源对应实际的gpu卡个数.<br>RealGpu=100表示实际使用了一张gpu卡, 对应实际的实例机型, 有可能代表带有1/4卡的实例4个, 或者带有1/2卡的实例2个, 或者带有1卡的实力1个.</p>
     */
    public void setRealGpu(Long RealGpu) {
        this.RealGpu = RealGpu;
    }

    /**
     * Get <p>创建或更新时无需填写，仅展示需要关注。详细的GPU使用信息。</p> 
     * @return RealGpuDetailSet <p>创建或更新时无需填写，仅展示需要关注。详细的GPU使用信息。</p>
     */
    public GpuDetail [] getRealGpuDetailSet() {
        return this.RealGpuDetailSet;
    }

    /**
     * Set <p>创建或更新时无需填写，仅展示需要关注。详细的GPU使用信息。</p>
     * @param RealGpuDetailSet <p>创建或更新时无需填写，仅展示需要关注。详细的GPU使用信息。</p>
     */
    public void setRealGpuDetailSet(GpuDetail [] RealGpuDetailSet) {
        this.RealGpuDetailSet = RealGpuDetailSet;
    }

    /**
     * Get <p>是否开启rdma</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableRDMA <p>是否开启rdma</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableRDMA() {
        return this.EnableRDMA;
    }

    /**
     * Set <p>是否开启rdma</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableRDMA <p>是否开启rdma</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableRDMA(Boolean EnableRDMA) {
        this.EnableRDMA = EnableRDMA;
    }

    /**
     * Get <p>rdma number</p> 
     * @return RdmaNumber <p>rdma number</p>
     */
    public Long getRdmaNumber() {
        return this.RdmaNumber;
    }

    /**
     * Set <p>rdma number</p>
     * @param RdmaNumber <p>rdma number</p>
     */
    public void setRdmaNumber(Long RdmaNumber) {
        this.RdmaNumber = RdmaNumber;
    }

    /**
     * Get <p>root disk size(GB)</p> 
     * @return RootDisk <p>root disk size(GB)</p>
     */
    public Long getRootDisk() {
        return this.RootDisk;
    }

    /**
     * Set <p>root disk size(GB)</p>
     * @param RootDisk <p>root disk size(GB)</p>
     */
    public void setRootDisk(Long RootDisk) {
        this.RootDisk = RootDisk;
    }

    /**
     * Get <p>data disk size(GB)</p> 
     * @return DataDisk <p>data disk size(GB)</p>
     */
    public Long getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set <p>data disk size(GB)</p>
     * @param DataDisk <p>data disk size(GB)</p>
     */
    public void setDataDisk(Long DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get <p>rdma</p><p>取值范围：[0, 99]</p> 
     * @return Rdma <p>rdma</p><p>取值范围：[0, 99]</p>
     */
    public Long getRdma() {
        return this.Rdma;
    }

    /**
     * Set <p>rdma</p><p>取值范围：[0, 99]</p>
     * @param Rdma <p>rdma</p><p>取值范围：[0, 99]</p>
     */
    public void setRdma(Long Rdma) {
        this.Rdma = Rdma;
    }

    public ResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceInfo(ResourceInfo source) {
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.RealGpu != null) {
            this.RealGpu = new Long(source.RealGpu);
        }
        if (source.RealGpuDetailSet != null) {
            this.RealGpuDetailSet = new GpuDetail[source.RealGpuDetailSet.length];
            for (int i = 0; i < source.RealGpuDetailSet.length; i++) {
                this.RealGpuDetailSet[i] = new GpuDetail(source.RealGpuDetailSet[i]);
            }
        }
        if (source.EnableRDMA != null) {
            this.EnableRDMA = new Boolean(source.EnableRDMA);
        }
        if (source.RdmaNumber != null) {
            this.RdmaNumber = new Long(source.RdmaNumber);
        }
        if (source.RootDisk != null) {
            this.RootDisk = new Long(source.RootDisk);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new Long(source.DataDisk);
        }
        if (source.Rdma != null) {
            this.Rdma = new Long(source.Rdma);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "RealGpu", this.RealGpu);
        this.setParamArrayObj(map, prefix + "RealGpuDetailSet.", this.RealGpuDetailSet);
        this.setParamSimple(map, prefix + "EnableRDMA", this.EnableRDMA);
        this.setParamSimple(map, prefix + "RdmaNumber", this.RdmaNumber);
        this.setParamSimple(map, prefix + "RootDisk", this.RootDisk);
        this.setParamSimple(map, prefix + "DataDisk", this.DataDisk);
        this.setParamSimple(map, prefix + "Rdma", this.Rdma);

    }
}

