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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceHardwareSpecification extends AbstractModel {

    /**
    * 规格标识。
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * 规格名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * CPU 核数。
    */
    @SerializedName("CPUNum")
    @Expose
    private Float CPUNum;

    /**
    * 内存大小。单位为 MB。
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * GPU 卡数。
    */
    @SerializedName("GPUNum")
    @Expose
    private Float GPUNum;

    /**
    * 显存大小。单位为 MB。
    */
    @SerializedName("GPUMemSize")
    @Expose
    private Long GPUMemSize;

    /**
     * Get 规格标识。 
     * @return Spec 规格标识。
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set 规格标识。
     * @param Spec 规格标识。
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get 规格名称。 
     * @return Name 规格名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规格名称。
     * @param Name 规格名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get CPU 核数。 
     * @return CPUNum CPU 核数。
     */
    public Float getCPUNum() {
        return this.CPUNum;
    }

    /**
     * Set CPU 核数。
     * @param CPUNum CPU 核数。
     */
    public void setCPUNum(Float CPUNum) {
        this.CPUNum = CPUNum;
    }

    /**
     * Get 内存大小。单位为 MB。 
     * @return MemSize 内存大小。单位为 MB。
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set 内存大小。单位为 MB。
     * @param MemSize 内存大小。单位为 MB。
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get GPU 卡数。 
     * @return GPUNum GPU 卡数。
     */
    public Float getGPUNum() {
        return this.GPUNum;
    }

    /**
     * Set GPU 卡数。
     * @param GPUNum GPU 卡数。
     */
    public void setGPUNum(Float GPUNum) {
        this.GPUNum = GPUNum;
    }

    /**
     * Get 显存大小。单位为 MB。 
     * @return GPUMemSize 显存大小。单位为 MB。
     */
    public Long getGPUMemSize() {
        return this.GPUMemSize;
    }

    /**
     * Set 显存大小。单位为 MB。
     * @param GPUMemSize 显存大小。单位为 MB。
     */
    public void setGPUMemSize(Long GPUMemSize) {
        this.GPUMemSize = GPUMemSize;
    }

    public InferenceHardwareSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceHardwareSpecification(InferenceHardwareSpecification source) {
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CPUNum != null) {
            this.CPUNum = new Float(source.CPUNum);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.GPUNum != null) {
            this.GPUNum = new Float(source.GPUNum);
        }
        if (source.GPUMemSize != null) {
            this.GPUMemSize = new Long(source.GPUMemSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CPUNum", this.CPUNum);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "GPUNum", this.GPUNum);
        this.setParamSimple(map, prefix + "GPUMemSize", this.GPUMemSize);

    }
}

