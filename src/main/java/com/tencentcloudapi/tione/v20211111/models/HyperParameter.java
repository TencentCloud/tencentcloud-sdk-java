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

public class HyperParameter extends AbstractModel{

    /**
    * 最大nnz数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxNNZ")
    @Expose
    private String MaxNNZ;

    /**
    * slot数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlotNum")
    @Expose
    private String SlotNum;

    /**
    * gpu cache 使用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuCachePercentage")
    @Expose
    private String CpuCachePercentage;

    /**
    * cpu cache 使用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GpuCachePercentage")
    @Expose
    private String GpuCachePercentage;

    /**
    * 是否开启分布式模式(true/false)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableDistributed")
    @Expose
    private String EnableDistributed;

    /**
    * TORCH_SCRIPT、MMDETECTION、DETECTRON2、HUGGINGFACE格式在进行优化时切分子图的最小算子数目，一般无需进行改动，默认为3
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinBlockSizePt")
    @Expose
    private String MinBlockSizePt;

    /**
    * FROZEN_GRAPH、SAVED_MODEL格式在进行优化时切分子图的最小算子数目，一般无需进行改动，默认为10
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinBlockSizeTf")
    @Expose
    private String MinBlockSizeTf;

    /**
     * Get 最大nnz数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxNNZ 最大nnz数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxNNZ() {
        return this.MaxNNZ;
    }

    /**
     * Set 最大nnz数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxNNZ 最大nnz数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxNNZ(String MaxNNZ) {
        this.MaxNNZ = MaxNNZ;
    }

    /**
     * Get slot数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlotNum slot数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSlotNum() {
        return this.SlotNum;
    }

    /**
     * Set slot数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlotNum slot数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlotNum(String SlotNum) {
        this.SlotNum = SlotNum;
    }

    /**
     * Get gpu cache 使用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuCachePercentage gpu cache 使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuCachePercentage() {
        return this.CpuCachePercentage;
    }

    /**
     * Set gpu cache 使用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuCachePercentage gpu cache 使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuCachePercentage(String CpuCachePercentage) {
        this.CpuCachePercentage = CpuCachePercentage;
    }

    /**
     * Get cpu cache 使用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GpuCachePercentage cpu cache 使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGpuCachePercentage() {
        return this.GpuCachePercentage;
    }

    /**
     * Set cpu cache 使用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param GpuCachePercentage cpu cache 使用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGpuCachePercentage(String GpuCachePercentage) {
        this.GpuCachePercentage = GpuCachePercentage;
    }

    /**
     * Get 是否开启分布式模式(true/false)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableDistributed 是否开启分布式模式(true/false)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnableDistributed() {
        return this.EnableDistributed;
    }

    /**
     * Set 是否开启分布式模式(true/false)
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableDistributed 是否开启分布式模式(true/false)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableDistributed(String EnableDistributed) {
        this.EnableDistributed = EnableDistributed;
    }

    /**
     * Get TORCH_SCRIPT、MMDETECTION、DETECTRON2、HUGGINGFACE格式在进行优化时切分子图的最小算子数目，一般无需进行改动，默认为3
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinBlockSizePt TORCH_SCRIPT、MMDETECTION、DETECTRON2、HUGGINGFACE格式在进行优化时切分子图的最小算子数目，一般无需进行改动，默认为3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMinBlockSizePt() {
        return this.MinBlockSizePt;
    }

    /**
     * Set TORCH_SCRIPT、MMDETECTION、DETECTRON2、HUGGINGFACE格式在进行优化时切分子图的最小算子数目，一般无需进行改动，默认为3
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinBlockSizePt TORCH_SCRIPT、MMDETECTION、DETECTRON2、HUGGINGFACE格式在进行优化时切分子图的最小算子数目，一般无需进行改动，默认为3
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinBlockSizePt(String MinBlockSizePt) {
        this.MinBlockSizePt = MinBlockSizePt;
    }

    /**
     * Get FROZEN_GRAPH、SAVED_MODEL格式在进行优化时切分子图的最小算子数目，一般无需进行改动，默认为10
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinBlockSizeTf FROZEN_GRAPH、SAVED_MODEL格式在进行优化时切分子图的最小算子数目，一般无需进行改动，默认为10
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMinBlockSizeTf() {
        return this.MinBlockSizeTf;
    }

    /**
     * Set FROZEN_GRAPH、SAVED_MODEL格式在进行优化时切分子图的最小算子数目，一般无需进行改动，默认为10
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinBlockSizeTf FROZEN_GRAPH、SAVED_MODEL格式在进行优化时切分子图的最小算子数目，一般无需进行改动，默认为10
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinBlockSizeTf(String MinBlockSizeTf) {
        this.MinBlockSizeTf = MinBlockSizeTf;
    }

    public HyperParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HyperParameter(HyperParameter source) {
        if (source.MaxNNZ != null) {
            this.MaxNNZ = new String(source.MaxNNZ);
        }
        if (source.SlotNum != null) {
            this.SlotNum = new String(source.SlotNum);
        }
        if (source.CpuCachePercentage != null) {
            this.CpuCachePercentage = new String(source.CpuCachePercentage);
        }
        if (source.GpuCachePercentage != null) {
            this.GpuCachePercentage = new String(source.GpuCachePercentage);
        }
        if (source.EnableDistributed != null) {
            this.EnableDistributed = new String(source.EnableDistributed);
        }
        if (source.MinBlockSizePt != null) {
            this.MinBlockSizePt = new String(source.MinBlockSizePt);
        }
        if (source.MinBlockSizeTf != null) {
            this.MinBlockSizeTf = new String(source.MinBlockSizeTf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxNNZ", this.MaxNNZ);
        this.setParamSimple(map, prefix + "SlotNum", this.SlotNum);
        this.setParamSimple(map, prefix + "CpuCachePercentage", this.CpuCachePercentage);
        this.setParamSimple(map, prefix + "GpuCachePercentage", this.GpuCachePercentage);
        this.setParamSimple(map, prefix + "EnableDistributed", this.EnableDistributed);
        this.setParamSimple(map, prefix + "MinBlockSizePt", this.MinBlockSizePt);
        this.setParamSimple(map, prefix + "MinBlockSizeTf", this.MinBlockSizeTf);

    }
}

