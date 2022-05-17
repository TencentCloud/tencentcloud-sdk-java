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

    }
}

