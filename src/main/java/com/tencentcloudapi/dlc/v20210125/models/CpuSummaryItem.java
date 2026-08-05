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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CpuSummaryItem extends AbstractModel {

    /**
    * <p>CPU 总核数（headCpu + cpu × replicas 的总和）</p>
    */
    @SerializedName("TotalCpuCores")
    @Expose
    private Long TotalCpuCores;

    /**
    * <p>内存总量（headMem + mem × replicas 的总和，单位 GB）</p>
    */
    @SerializedName("TotalMemoryGB")
    @Expose
    private Long TotalMemoryGB;

    /**
    * <p>运行中的副本总数</p>
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
     * Get <p>CPU 总核数（headCpu + cpu × replicas 的总和）</p> 
     * @return TotalCpuCores <p>CPU 总核数（headCpu + cpu × replicas 的总和）</p>
     */
    public Long getTotalCpuCores() {
        return this.TotalCpuCores;
    }

    /**
     * Set <p>CPU 总核数（headCpu + cpu × replicas 的总和）</p>
     * @param TotalCpuCores <p>CPU 总核数（headCpu + cpu × replicas 的总和）</p>
     */
    public void setTotalCpuCores(Long TotalCpuCores) {
        this.TotalCpuCores = TotalCpuCores;
    }

    /**
     * Get <p>内存总量（headMem + mem × replicas 的总和，单位 GB）</p> 
     * @return TotalMemoryGB <p>内存总量（headMem + mem × replicas 的总和，单位 GB）</p>
     */
    public Long getTotalMemoryGB() {
        return this.TotalMemoryGB;
    }

    /**
     * Set <p>内存总量（headMem + mem × replicas 的总和，单位 GB）</p>
     * @param TotalMemoryGB <p>内存总量（headMem + mem × replicas 的总和，单位 GB）</p>
     */
    public void setTotalMemoryGB(Long TotalMemoryGB) {
        this.TotalMemoryGB = TotalMemoryGB;
    }

    /**
     * Get <p>运行中的副本总数</p> 
     * @return Replicas <p>运行中的副本总数</p>
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set <p>运行中的副本总数</p>
     * @param Replicas <p>运行中的副本总数</p>
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    public CpuSummaryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CpuSummaryItem(CpuSummaryItem source) {
        if (source.TotalCpuCores != null) {
            this.TotalCpuCores = new Long(source.TotalCpuCores);
        }
        if (source.TotalMemoryGB != null) {
            this.TotalMemoryGB = new Long(source.TotalMemoryGB);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCpuCores", this.TotalCpuCores);
        this.setParamSimple(map, prefix + "TotalMemoryGB", this.TotalMemoryGB);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);

    }
}

