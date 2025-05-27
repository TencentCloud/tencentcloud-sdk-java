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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetatsCvmInfo extends AbstractModel {

    /**
    * setats机器cpu
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * setats机器内存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * setats worker 并行度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultParallelism")
    @Expose
    private Long DefaultParallelism;

    /**
    * setats 机器磁盘
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Disk")
    @Expose
    private SetatsDisk Disk;

    /**
     * Get setats机器cpu
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu setats机器cpu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set setats机器cpu
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu setats机器cpu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get setats机器内存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mem setats机器内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set setats机器内存
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mem setats机器内存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get setats worker 并行度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultParallelism setats worker 并行度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultParallelism() {
        return this.DefaultParallelism;
    }

    /**
     * Set setats worker 并行度
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultParallelism setats worker 并行度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultParallelism(Long DefaultParallelism) {
        this.DefaultParallelism = DefaultParallelism;
    }

    /**
     * Get setats 机器磁盘
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Disk setats 机器磁盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SetatsDisk getDisk() {
        return this.Disk;
    }

    /**
     * Set setats 机器磁盘
注意：此字段可能返回 null，表示取不到有效值。
     * @param Disk setats 机器磁盘
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisk(SetatsDisk Disk) {
        this.Disk = Disk;
    }

    public SetatsCvmInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetatsCvmInfo(SetatsCvmInfo source) {
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Float(source.Mem);
        }
        if (source.DefaultParallelism != null) {
            this.DefaultParallelism = new Long(source.DefaultParallelism);
        }
        if (source.Disk != null) {
            this.Disk = new SetatsDisk(source.Disk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "DefaultParallelism", this.DefaultParallelism);
        this.setParamObj(map, prefix + "Disk.", this.Disk);

    }
}

