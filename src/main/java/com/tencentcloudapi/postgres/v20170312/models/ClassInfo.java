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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassInfo extends AbstractModel {

    /**
    * <p>规格ID</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>CPU核数</p>
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * <p>内存大小，单位：MB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>该规格所支持最大存储容量，单位：GB</p>
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * <p>该规格所支持最小存储容量，单位：GB</p>
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * <p>该规格的预估QPS</p>
    */
    @SerializedName("QPS")
    @Expose
    private Long QPS;

    /**
     * Get <p>规格ID</p> 
     * @return SpecCode <p>规格ID</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>规格ID</p>
     * @param SpecCode <p>规格ID</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>CPU核数</p> 
     * @return CPU <p>CPU核数</p>
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set <p>CPU核数</p>
     * @param CPU <p>CPU核数</p>
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get <p>内存大小，单位：MB</p> 
     * @return Memory <p>内存大小，单位：MB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存大小，单位：MB</p>
     * @param Memory <p>内存大小，单位：MB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>该规格所支持最大存储容量，单位：GB</p> 
     * @return MaxStorage <p>该规格所支持最大存储容量，单位：GB</p>
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set <p>该规格所支持最大存储容量，单位：GB</p>
     * @param MaxStorage <p>该规格所支持最大存储容量，单位：GB</p>
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get <p>该规格所支持最小存储容量，单位：GB</p> 
     * @return MinStorage <p>该规格所支持最小存储容量，单位：GB</p>
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set <p>该规格所支持最小存储容量，单位：GB</p>
     * @param MinStorage <p>该规格所支持最小存储容量，单位：GB</p>
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get <p>该规格的预估QPS</p> 
     * @return QPS <p>该规格的预估QPS</p>
     */
    public Long getQPS() {
        return this.QPS;
    }

    /**
     * Set <p>该规格的预估QPS</p>
     * @param QPS <p>该规格的预估QPS</p>
     */
    public void setQPS(Long QPS) {
        this.QPS = QPS;
    }

    public ClassInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassInfo(ClassInfo source) {
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.MinStorage != null) {
            this.MinStorage = new Long(source.MinStorage);
        }
        if (source.QPS != null) {
            this.QPS = new Long(source.QPS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "MinStorage", this.MinStorage);
        this.setParamSimple(map, prefix + "QPS", this.QPS);

    }
}

