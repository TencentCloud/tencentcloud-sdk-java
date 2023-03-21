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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassInfo extends AbstractModel{

    /**
    * 规格ID
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * CPU核数
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 内存大小，单位：MB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 该规格所支持最大存储容量，单位：GB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * 该规格所支持最小存储容量，单位：GB
    */
    @SerializedName("MinStorage")
    @Expose
    private Long MinStorage;

    /**
    * 该规格的预估QPS
    */
    @SerializedName("QPS")
    @Expose
    private Long QPS;

    /**
     * Get 规格ID 
     * @return SpecCode 规格ID
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set 规格ID
     * @param SpecCode 规格ID
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get CPU核数 
     * @return CPU CPU核数
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核数
     * @param CPU CPU核数
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存大小，单位：MB 
     * @return Memory 内存大小，单位：MB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小，单位：MB
     * @param Memory 内存大小，单位：MB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 该规格所支持最大存储容量，单位：GB 
     * @return MaxStorage 该规格所支持最大存储容量，单位：GB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set 该规格所支持最大存储容量，单位：GB
     * @param MaxStorage 该规格所支持最大存储容量，单位：GB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get 该规格所支持最小存储容量，单位：GB 
     * @return MinStorage 该规格所支持最小存储容量，单位：GB
     */
    public Long getMinStorage() {
        return this.MinStorage;
    }

    /**
     * Set 该规格所支持最小存储容量，单位：GB
     * @param MinStorage 该规格所支持最小存储容量，单位：GB
     */
    public void setMinStorage(Long MinStorage) {
        this.MinStorage = MinStorage;
    }

    /**
     * Get 该规格的预估QPS 
     * @return QPS 该规格的预估QPS
     */
    public Long getQPS() {
        return this.QPS;
    }

    /**
     * Set 该规格的预估QPS
     * @param QPS 该规格的预估QPS
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

