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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuotaResourceInfo extends AbstractModel {

    /**
    * <p>沙箱工具配额或当前用量</p><p>单位：个</p>
    */
    @SerializedName("SandboxTools")
    @Expose
    private Long SandboxTools;

    /**
    * <p>沙箱实例配额或当前用量</p><p>单位：个</p>
    */
    @SerializedName("SandboxInstances")
    @Expose
    private Long SandboxInstances;

    /**
    * <p>暂停实例配额或当前用量</p><p>单位：个</p>
    */
    @SerializedName("PausedInstances")
    @Expose
    private Long PausedInstances;

    /**
    * <p>暂停实例配额或当前用量。目前只在主账号中返回</p><p>单位：核</p>
    */
    @SerializedName("CPUCores")
    @Expose
    private Float CPUCores;

    /**
    * <p>内存配额或当前用量</p><p>单位：GiB</p>
    */
    @SerializedName("MemoryGiB")
    @Expose
    private Float MemoryGiB;

    /**
     * Get <p>沙箱工具配额或当前用量</p><p>单位：个</p> 
     * @return SandboxTools <p>沙箱工具配额或当前用量</p><p>单位：个</p>
     */
    public Long getSandboxTools() {
        return this.SandboxTools;
    }

    /**
     * Set <p>沙箱工具配额或当前用量</p><p>单位：个</p>
     * @param SandboxTools <p>沙箱工具配额或当前用量</p><p>单位：个</p>
     */
    public void setSandboxTools(Long SandboxTools) {
        this.SandboxTools = SandboxTools;
    }

    /**
     * Get <p>沙箱实例配额或当前用量</p><p>单位：个</p> 
     * @return SandboxInstances <p>沙箱实例配额或当前用量</p><p>单位：个</p>
     */
    public Long getSandboxInstances() {
        return this.SandboxInstances;
    }

    /**
     * Set <p>沙箱实例配额或当前用量</p><p>单位：个</p>
     * @param SandboxInstances <p>沙箱实例配额或当前用量</p><p>单位：个</p>
     */
    public void setSandboxInstances(Long SandboxInstances) {
        this.SandboxInstances = SandboxInstances;
    }

    /**
     * Get <p>暂停实例配额或当前用量</p><p>单位：个</p> 
     * @return PausedInstances <p>暂停实例配额或当前用量</p><p>单位：个</p>
     */
    public Long getPausedInstances() {
        return this.PausedInstances;
    }

    /**
     * Set <p>暂停实例配额或当前用量</p><p>单位：个</p>
     * @param PausedInstances <p>暂停实例配额或当前用量</p><p>单位：个</p>
     */
    public void setPausedInstances(Long PausedInstances) {
        this.PausedInstances = PausedInstances;
    }

    /**
     * Get <p>暂停实例配额或当前用量。目前只在主账号中返回</p><p>单位：核</p> 
     * @return CPUCores <p>暂停实例配额或当前用量。目前只在主账号中返回</p><p>单位：核</p>
     */
    public Float getCPUCores() {
        return this.CPUCores;
    }

    /**
     * Set <p>暂停实例配额或当前用量。目前只在主账号中返回</p><p>单位：核</p>
     * @param CPUCores <p>暂停实例配额或当前用量。目前只在主账号中返回</p><p>单位：核</p>
     */
    public void setCPUCores(Float CPUCores) {
        this.CPUCores = CPUCores;
    }

    /**
     * Get <p>内存配额或当前用量</p><p>单位：GiB</p> 
     * @return MemoryGiB <p>内存配额或当前用量</p><p>单位：GiB</p>
     */
    public Float getMemoryGiB() {
        return this.MemoryGiB;
    }

    /**
     * Set <p>内存配额或当前用量</p><p>单位：GiB</p>
     * @param MemoryGiB <p>内存配额或当前用量</p><p>单位：GiB</p>
     */
    public void setMemoryGiB(Float MemoryGiB) {
        this.MemoryGiB = MemoryGiB;
    }

    public QuotaResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuotaResourceInfo(QuotaResourceInfo source) {
        if (source.SandboxTools != null) {
            this.SandboxTools = new Long(source.SandboxTools);
        }
        if (source.SandboxInstances != null) {
            this.SandboxInstances = new Long(source.SandboxInstances);
        }
        if (source.PausedInstances != null) {
            this.PausedInstances = new Long(source.PausedInstances);
        }
        if (source.CPUCores != null) {
            this.CPUCores = new Float(source.CPUCores);
        }
        if (source.MemoryGiB != null) {
            this.MemoryGiB = new Float(source.MemoryGiB);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SandboxTools", this.SandboxTools);
        this.setParamSimple(map, prefix + "SandboxInstances", this.SandboxInstances);
        this.setParamSimple(map, prefix + "PausedInstances", this.PausedInstances);
        this.setParamSimple(map, prefix + "CPUCores", this.CPUCores);
        this.setParamSimple(map, prefix + "MemoryGiB", this.MemoryGiB);

    }
}

