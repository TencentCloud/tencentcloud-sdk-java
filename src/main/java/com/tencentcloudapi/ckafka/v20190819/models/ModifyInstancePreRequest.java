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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancePreRequest extends AbstractModel{

    /**
    * 实例名称
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 预计磁盘，根据磁盘步长，规格向上调整。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 预计带宽，根据带宽步长，规格向上调整。
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * 预计分区，根据带宽步长，规格向上调整。
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
     * Get 实例名称 
     * @return InstanceId 实例名称
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例名称
     * @param InstanceId 实例名称
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 预计磁盘，根据磁盘步长，规格向上调整。 
     * @return DiskSize 预计磁盘，根据磁盘步长，规格向上调整。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 预计磁盘，根据磁盘步长，规格向上调整。
     * @param DiskSize 预计磁盘，根据磁盘步长，规格向上调整。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 预计带宽，根据带宽步长，规格向上调整。 
     * @return BandWidth 预计带宽，根据带宽步长，规格向上调整。
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set 预计带宽，根据带宽步长，规格向上调整。
     * @param BandWidth 预计带宽，根据带宽步长，规格向上调整。
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get 预计分区，根据带宽步长，规格向上调整。 
     * @return Partition 预计分区，根据带宽步长，规格向上调整。
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 预计分区，根据带宽步长，规格向上调整。
     * @param Partition 预计分区，根据带宽步长，规格向上调整。
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    public ModifyInstancePreRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancePreRequest(ModifyInstancePreRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "Partition", this.Partition);

    }
}

