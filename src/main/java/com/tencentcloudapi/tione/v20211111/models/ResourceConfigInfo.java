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

public class ResourceConfigInfo extends AbstractModel {

    /**
    * <p>角色，eg：PS、WORKER、DRIVER、EXECUTOR</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>cpu核数，使用资源组时需配置。单位：1/1000，即1000=1核</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>内存，使用资源组时需配置。单位为MB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>gpu卡类型，使用资源组时需配置</p>
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * <p>gpu卡数，使用资源组时需配置。单位：1/100，即100=1卡</p>
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * <p>算力规格ID<br>计算规格 (for后付费)，可选值如下：<br>TI.S.LARGE.POST: 4C8G<br>TI.S.2XLARGE16.POST:  8C16G<br>TI.S.2XLARGE32.POST:  8C32G<br>TI.S.4XLARGE32.POST:  16C32G<br>TI.S.4XLARGE64.POST:  16C64G<br>TI.S.6XLARGE48.POST:  24C48G<br>TI.S.6XLARGE96.POST:  24C96G<br>TI.S.8XLARGE64.POST:  32C64G<br>TI.S.8XLARGE128.POST : 32C128G<br>TI.GN10.2XLARGE40.POST: 8C40G V100<em>1<br>TI.GN10.5XLARGE80.POST:  18C80G V100</em>2<br>TI.GN10.10XLARGE160.POST :  32C160G V100<em>4<br>TI.GN10.20XLARGE320.POST :  72C320G V100</em>8<br>TI.GN7.8XLARGE128.POST: 32C128G T4<em>1<br>TI.GN7.10XLARGE160.POST: 40C160G T4</em>2<br>TI.GN7.20XLARGE320.POST: 80C32</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>计算节点数</p>
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * <p>算力规格名称<br>计算规格 (for后付费)，可选值如下：<br>4C8G<br>8C16G<br>8C32G<br>16C32G<br>6C64G<br>24C48G<br>24C96G<br>32C64G<br>32C128G<br>8C40G V100<em>1<br>8C80G V100</em>2<br>32C160G V100<em>4<br>72C320G V100</em>8<br>32C128G T4<em>1<br>40C160G T4</em>2<br>80C32</p>
    */
    @SerializedName("InstanceTypeAlias")
    @Expose
    private String InstanceTypeAlias;

    /**
    * <p>RDMA配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RDMAConfig")
    @Expose
    private RDMAConfig RDMAConfig;

    /**
     * Get <p>角色，eg：PS、WORKER、DRIVER、EXECUTOR</p> 
     * @return Role <p>角色，eg：PS、WORKER、DRIVER、EXECUTOR</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>角色，eg：PS、WORKER、DRIVER、EXECUTOR</p>
     * @param Role <p>角色，eg：PS、WORKER、DRIVER、EXECUTOR</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>cpu核数，使用资源组时需配置。单位：1/1000，即1000=1核</p> 
     * @return Cpu <p>cpu核数，使用资源组时需配置。单位：1/1000，即1000=1核</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>cpu核数，使用资源组时需配置。单位：1/1000，即1000=1核</p>
     * @param Cpu <p>cpu核数，使用资源组时需配置。单位：1/1000，即1000=1核</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>内存，使用资源组时需配置。单位为MB</p> 
     * @return Memory <p>内存，使用资源组时需配置。单位为MB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存，使用资源组时需配置。单位为MB</p>
     * @param Memory <p>内存，使用资源组时需配置。单位为MB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>gpu卡类型，使用资源组时需配置</p> 
     * @return GpuType <p>gpu卡类型，使用资源组时需配置</p>
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set <p>gpu卡类型，使用资源组时需配置</p>
     * @param GpuType <p>gpu卡类型，使用资源组时需配置</p>
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get <p>gpu卡数，使用资源组时需配置。单位：1/100，即100=1卡</p> 
     * @return Gpu <p>gpu卡数，使用资源组时需配置。单位：1/100，即100=1卡</p>
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set <p>gpu卡数，使用资源组时需配置。单位：1/100，即100=1卡</p>
     * @param Gpu <p>gpu卡数，使用资源组时需配置。单位：1/100，即100=1卡</p>
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get <p>算力规格ID<br>计算规格 (for后付费)，可选值如下：<br>TI.S.LARGE.POST: 4C8G<br>TI.S.2XLARGE16.POST:  8C16G<br>TI.S.2XLARGE32.POST:  8C32G<br>TI.S.4XLARGE32.POST:  16C32G<br>TI.S.4XLARGE64.POST:  16C64G<br>TI.S.6XLARGE48.POST:  24C48G<br>TI.S.6XLARGE96.POST:  24C96G<br>TI.S.8XLARGE64.POST:  32C64G<br>TI.S.8XLARGE128.POST : 32C128G<br>TI.GN10.2XLARGE40.POST: 8C40G V100<em>1<br>TI.GN10.5XLARGE80.POST:  18C80G V100</em>2<br>TI.GN10.10XLARGE160.POST :  32C160G V100<em>4<br>TI.GN10.20XLARGE320.POST :  72C320G V100</em>8<br>TI.GN7.8XLARGE128.POST: 32C128G T4<em>1<br>TI.GN7.10XLARGE160.POST: 40C160G T4</em>2<br>TI.GN7.20XLARGE320.POST: 80C32</p> 
     * @return InstanceType <p>算力规格ID<br>计算规格 (for后付费)，可选值如下：<br>TI.S.LARGE.POST: 4C8G<br>TI.S.2XLARGE16.POST:  8C16G<br>TI.S.2XLARGE32.POST:  8C32G<br>TI.S.4XLARGE32.POST:  16C32G<br>TI.S.4XLARGE64.POST:  16C64G<br>TI.S.6XLARGE48.POST:  24C48G<br>TI.S.6XLARGE96.POST:  24C96G<br>TI.S.8XLARGE64.POST:  32C64G<br>TI.S.8XLARGE128.POST : 32C128G<br>TI.GN10.2XLARGE40.POST: 8C40G V100<em>1<br>TI.GN10.5XLARGE80.POST:  18C80G V100</em>2<br>TI.GN10.10XLARGE160.POST :  32C160G V100<em>4<br>TI.GN10.20XLARGE320.POST :  72C320G V100</em>8<br>TI.GN7.8XLARGE128.POST: 32C128G T4<em>1<br>TI.GN7.10XLARGE160.POST: 40C160G T4</em>2<br>TI.GN7.20XLARGE320.POST: 80C32</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>算力规格ID<br>计算规格 (for后付费)，可选值如下：<br>TI.S.LARGE.POST: 4C8G<br>TI.S.2XLARGE16.POST:  8C16G<br>TI.S.2XLARGE32.POST:  8C32G<br>TI.S.4XLARGE32.POST:  16C32G<br>TI.S.4XLARGE64.POST:  16C64G<br>TI.S.6XLARGE48.POST:  24C48G<br>TI.S.6XLARGE96.POST:  24C96G<br>TI.S.8XLARGE64.POST:  32C64G<br>TI.S.8XLARGE128.POST : 32C128G<br>TI.GN10.2XLARGE40.POST: 8C40G V100<em>1<br>TI.GN10.5XLARGE80.POST:  18C80G V100</em>2<br>TI.GN10.10XLARGE160.POST :  32C160G V100<em>4<br>TI.GN10.20XLARGE320.POST :  72C320G V100</em>8<br>TI.GN7.8XLARGE128.POST: 32C128G T4<em>1<br>TI.GN7.10XLARGE160.POST: 40C160G T4</em>2<br>TI.GN7.20XLARGE320.POST: 80C32</p>
     * @param InstanceType <p>算力规格ID<br>计算规格 (for后付费)，可选值如下：<br>TI.S.LARGE.POST: 4C8G<br>TI.S.2XLARGE16.POST:  8C16G<br>TI.S.2XLARGE32.POST:  8C32G<br>TI.S.4XLARGE32.POST:  16C32G<br>TI.S.4XLARGE64.POST:  16C64G<br>TI.S.6XLARGE48.POST:  24C48G<br>TI.S.6XLARGE96.POST:  24C96G<br>TI.S.8XLARGE64.POST:  32C64G<br>TI.S.8XLARGE128.POST : 32C128G<br>TI.GN10.2XLARGE40.POST: 8C40G V100<em>1<br>TI.GN10.5XLARGE80.POST:  18C80G V100</em>2<br>TI.GN10.10XLARGE160.POST :  32C160G V100<em>4<br>TI.GN10.20XLARGE320.POST :  72C320G V100</em>8<br>TI.GN7.8XLARGE128.POST: 32C128G T4<em>1<br>TI.GN7.10XLARGE160.POST: 40C160G T4</em>2<br>TI.GN7.20XLARGE320.POST: 80C32</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>计算节点数</p> 
     * @return InstanceNum <p>计算节点数</p>
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set <p>计算节点数</p>
     * @param InstanceNum <p>计算节点数</p>
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get <p>算力规格名称<br>计算规格 (for后付费)，可选值如下：<br>4C8G<br>8C16G<br>8C32G<br>16C32G<br>6C64G<br>24C48G<br>24C96G<br>32C64G<br>32C128G<br>8C40G V100<em>1<br>8C80G V100</em>2<br>32C160G V100<em>4<br>72C320G V100</em>8<br>32C128G T4<em>1<br>40C160G T4</em>2<br>80C32</p> 
     * @return InstanceTypeAlias <p>算力规格名称<br>计算规格 (for后付费)，可选值如下：<br>4C8G<br>8C16G<br>8C32G<br>16C32G<br>6C64G<br>24C48G<br>24C96G<br>32C64G<br>32C128G<br>8C40G V100<em>1<br>8C80G V100</em>2<br>32C160G V100<em>4<br>72C320G V100</em>8<br>32C128G T4<em>1<br>40C160G T4</em>2<br>80C32</p>
     */
    public String getInstanceTypeAlias() {
        return this.InstanceTypeAlias;
    }

    /**
     * Set <p>算力规格名称<br>计算规格 (for后付费)，可选值如下：<br>4C8G<br>8C16G<br>8C32G<br>16C32G<br>6C64G<br>24C48G<br>24C96G<br>32C64G<br>32C128G<br>8C40G V100<em>1<br>8C80G V100</em>2<br>32C160G V100<em>4<br>72C320G V100</em>8<br>32C128G T4<em>1<br>40C160G T4</em>2<br>80C32</p>
     * @param InstanceTypeAlias <p>算力规格名称<br>计算规格 (for后付费)，可选值如下：<br>4C8G<br>8C16G<br>8C32G<br>16C32G<br>6C64G<br>24C48G<br>24C96G<br>32C64G<br>32C128G<br>8C40G V100<em>1<br>8C80G V100</em>2<br>32C160G V100<em>4<br>72C320G V100</em>8<br>32C128G T4<em>1<br>40C160G T4</em>2<br>80C32</p>
     */
    public void setInstanceTypeAlias(String InstanceTypeAlias) {
        this.InstanceTypeAlias = InstanceTypeAlias;
    }

    /**
     * Get <p>RDMA配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RDMAConfig <p>RDMA配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RDMAConfig getRDMAConfig() {
        return this.RDMAConfig;
    }

    /**
     * Set <p>RDMA配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RDMAConfig <p>RDMA配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRDMAConfig(RDMAConfig RDMAConfig) {
        this.RDMAConfig = RDMAConfig;
    }

    public ResourceConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceConfigInfo(ResourceConfigInfo source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.GpuType != null) {
            this.GpuType = new String(source.GpuType);
        }
        if (source.Gpu != null) {
            this.Gpu = new Long(source.Gpu);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.InstanceTypeAlias != null) {
            this.InstanceTypeAlias = new String(source.InstanceTypeAlias);
        }
        if (source.RDMAConfig != null) {
            this.RDMAConfig = new RDMAConfig(source.RDMAConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "GpuType", this.GpuType);
        this.setParamSimple(map, prefix + "Gpu", this.Gpu);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "InstanceTypeAlias", this.InstanceTypeAlias);
        this.setParamObj(map, prefix + "RDMAConfig.", this.RDMAConfig);

    }
}

