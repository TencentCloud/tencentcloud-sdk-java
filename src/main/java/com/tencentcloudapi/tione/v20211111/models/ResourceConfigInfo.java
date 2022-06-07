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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceConfigInfo extends AbstractModel{

    /**
    * 角色，eg：PS、WORKER、DRIVER、EXECUTOR
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * cpu核数，1000=1核
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存，单位为MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * gpu卡类型
    */
    @SerializedName("GpuType")
    @Expose
    private String GpuType;

    /**
    * gpu数
    */
    @SerializedName("Gpu")
    @Expose
    private Long Gpu;

    /**
    * 算力规格ID
计算规格 (for后付费)，可选值如下：
TI.S.LARGE.POST: 4C8G 
TI.S.2XLARGE16.POST:  8C16G 
TI.S.2XLARGE32.POST:  8C32G 
TI.S.4XLARGE32.POST:  16C32G
TI.S.4XLARGE64.POST:  16C64G
TI.S.6XLARGE48.POST:  24C48G
TI.S.6XLARGE96.POST:  24C96G
TI.S.8XLARGE64.POST:  32C64G
TI.S.8XLARGE128.POST : 32C128G
TI.GN10.2XLARGE40.POST: 8C40G V100*1 
TI.GN10.5XLARGE80.POST:  18C80G V100*2 
TI.GN10.10XLARGE160.POST :  32C160G V100*4
TI.GN10.20XLARGE320.POST :  72C320G V100*8
TI.GN7.8XLARGE128.POST: 32C128G T4*1 
TI.GN7.10XLARGE160.POST: 40C160G T4*2 
TI.GN7.20XLARGE320.POST: 80C32
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 计算节点数
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 算力规格名称
计算规格 (for后付费)，可选值如下：
4C8G 
8C16G 
8C32G 
16C32G
6C64G
24C48G
24C96G
32C64G
32C128G
8C40G V100*1 
8C80G V100*2 
32C160G V100*4
72C320G V100*8
32C128G T4*1 
40C160G T4*2 
80C32
    */
    @SerializedName("InstanceTypeAlias")
    @Expose
    private String InstanceTypeAlias;

    /**
     * Get 角色，eg：PS、WORKER、DRIVER、EXECUTOR 
     * @return Role 角色，eg：PS、WORKER、DRIVER、EXECUTOR
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色，eg：PS、WORKER、DRIVER、EXECUTOR
     * @param Role 角色，eg：PS、WORKER、DRIVER、EXECUTOR
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get cpu核数，1000=1核 
     * @return Cpu cpu核数，1000=1核
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu核数，1000=1核
     * @param Cpu cpu核数，1000=1核
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存，单位为MB 
     * @return Memory 内存，单位为MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存，单位为MB
     * @param Memory 内存，单位为MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get gpu卡类型 
     * @return GpuType gpu卡类型
     */
    public String getGpuType() {
        return this.GpuType;
    }

    /**
     * Set gpu卡类型
     * @param GpuType gpu卡类型
     */
    public void setGpuType(String GpuType) {
        this.GpuType = GpuType;
    }

    /**
     * Get gpu数 
     * @return Gpu gpu数
     */
    public Long getGpu() {
        return this.Gpu;
    }

    /**
     * Set gpu数
     * @param Gpu gpu数
     */
    public void setGpu(Long Gpu) {
        this.Gpu = Gpu;
    }

    /**
     * Get 算力规格ID
计算规格 (for后付费)，可选值如下：
TI.S.LARGE.POST: 4C8G 
TI.S.2XLARGE16.POST:  8C16G 
TI.S.2XLARGE32.POST:  8C32G 
TI.S.4XLARGE32.POST:  16C32G
TI.S.4XLARGE64.POST:  16C64G
TI.S.6XLARGE48.POST:  24C48G
TI.S.6XLARGE96.POST:  24C96G
TI.S.8XLARGE64.POST:  32C64G
TI.S.8XLARGE128.POST : 32C128G
TI.GN10.2XLARGE40.POST: 8C40G V100*1 
TI.GN10.5XLARGE80.POST:  18C80G V100*2 
TI.GN10.10XLARGE160.POST :  32C160G V100*4
TI.GN10.20XLARGE320.POST :  72C320G V100*8
TI.GN7.8XLARGE128.POST: 32C128G T4*1 
TI.GN7.10XLARGE160.POST: 40C160G T4*2 
TI.GN7.20XLARGE320.POST: 80C32 
     * @return InstanceType 算力规格ID
计算规格 (for后付费)，可选值如下：
TI.S.LARGE.POST: 4C8G 
TI.S.2XLARGE16.POST:  8C16G 
TI.S.2XLARGE32.POST:  8C32G 
TI.S.4XLARGE32.POST:  16C32G
TI.S.4XLARGE64.POST:  16C64G
TI.S.6XLARGE48.POST:  24C48G
TI.S.6XLARGE96.POST:  24C96G
TI.S.8XLARGE64.POST:  32C64G
TI.S.8XLARGE128.POST : 32C128G
TI.GN10.2XLARGE40.POST: 8C40G V100*1 
TI.GN10.5XLARGE80.POST:  18C80G V100*2 
TI.GN10.10XLARGE160.POST :  32C160G V100*4
TI.GN10.20XLARGE320.POST :  72C320G V100*8
TI.GN7.8XLARGE128.POST: 32C128G T4*1 
TI.GN7.10XLARGE160.POST: 40C160G T4*2 
TI.GN7.20XLARGE320.POST: 80C32
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 算力规格ID
计算规格 (for后付费)，可选值如下：
TI.S.LARGE.POST: 4C8G 
TI.S.2XLARGE16.POST:  8C16G 
TI.S.2XLARGE32.POST:  8C32G 
TI.S.4XLARGE32.POST:  16C32G
TI.S.4XLARGE64.POST:  16C64G
TI.S.6XLARGE48.POST:  24C48G
TI.S.6XLARGE96.POST:  24C96G
TI.S.8XLARGE64.POST:  32C64G
TI.S.8XLARGE128.POST : 32C128G
TI.GN10.2XLARGE40.POST: 8C40G V100*1 
TI.GN10.5XLARGE80.POST:  18C80G V100*2 
TI.GN10.10XLARGE160.POST :  32C160G V100*4
TI.GN10.20XLARGE320.POST :  72C320G V100*8
TI.GN7.8XLARGE128.POST: 32C128G T4*1 
TI.GN7.10XLARGE160.POST: 40C160G T4*2 
TI.GN7.20XLARGE320.POST: 80C32
     * @param InstanceType 算力规格ID
计算规格 (for后付费)，可选值如下：
TI.S.LARGE.POST: 4C8G 
TI.S.2XLARGE16.POST:  8C16G 
TI.S.2XLARGE32.POST:  8C32G 
TI.S.4XLARGE32.POST:  16C32G
TI.S.4XLARGE64.POST:  16C64G
TI.S.6XLARGE48.POST:  24C48G
TI.S.6XLARGE96.POST:  24C96G
TI.S.8XLARGE64.POST:  32C64G
TI.S.8XLARGE128.POST : 32C128G
TI.GN10.2XLARGE40.POST: 8C40G V100*1 
TI.GN10.5XLARGE80.POST:  18C80G V100*2 
TI.GN10.10XLARGE160.POST :  32C160G V100*4
TI.GN10.20XLARGE320.POST :  72C320G V100*8
TI.GN7.8XLARGE128.POST: 32C128G T4*1 
TI.GN7.10XLARGE160.POST: 40C160G T4*2 
TI.GN7.20XLARGE320.POST: 80C32
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 计算节点数 
     * @return InstanceNum 计算节点数
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 计算节点数
     * @param InstanceNum 计算节点数
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get 算力规格名称
计算规格 (for后付费)，可选值如下：
4C8G 
8C16G 
8C32G 
16C32G
6C64G
24C48G
24C96G
32C64G
32C128G
8C40G V100*1 
8C80G V100*2 
32C160G V100*4
72C320G V100*8
32C128G T4*1 
40C160G T4*2 
80C32 
     * @return InstanceTypeAlias 算力规格名称
计算规格 (for后付费)，可选值如下：
4C8G 
8C16G 
8C32G 
16C32G
6C64G
24C48G
24C96G
32C64G
32C128G
8C40G V100*1 
8C80G V100*2 
32C160G V100*4
72C320G V100*8
32C128G T4*1 
40C160G T4*2 
80C32
     */
    public String getInstanceTypeAlias() {
        return this.InstanceTypeAlias;
    }

    /**
     * Set 算力规格名称
计算规格 (for后付费)，可选值如下：
4C8G 
8C16G 
8C32G 
16C32G
6C64G
24C48G
24C96G
32C64G
32C128G
8C40G V100*1 
8C80G V100*2 
32C160G V100*4
72C320G V100*8
32C128G T4*1 
40C160G T4*2 
80C32
     * @param InstanceTypeAlias 算力规格名称
计算规格 (for后付费)，可选值如下：
4C8G 
8C16G 
8C32G 
16C32G
6C64G
24C48G
24C96G
32C64G
32C128G
8C40G V100*1 
8C80G V100*2 
32C160G V100*4
72C320G V100*8
32C128G T4*1 
40C160G T4*2 
80C32
     */
    public void setInstanceTypeAlias(String InstanceTypeAlias) {
        this.InstanceTypeAlias = InstanceTypeAlias;
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

    }
}

