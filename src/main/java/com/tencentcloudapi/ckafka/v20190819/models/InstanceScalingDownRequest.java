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

public class InstanceScalingDownRequest extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 缩容模式  1:稳定变配 
2.高速变配
    */
    @SerializedName("UpgradeStrategy")
    @Expose
    private Long UpgradeStrategy;

    /**
    * 磁盘大小 单位 GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 峰值带宽 单位 MB/s
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * 分区上限
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 缩容模式  1:稳定变配 
2.高速变配 
     * @return UpgradeStrategy 缩容模式  1:稳定变配 
2.高速变配
     */
    public Long getUpgradeStrategy() {
        return this.UpgradeStrategy;
    }

    /**
     * Set 缩容模式  1:稳定变配 
2.高速变配
     * @param UpgradeStrategy 缩容模式  1:稳定变配 
2.高速变配
     */
    public void setUpgradeStrategy(Long UpgradeStrategy) {
        this.UpgradeStrategy = UpgradeStrategy;
    }

    /**
     * Get 磁盘大小 单位 GB 
     * @return DiskSize 磁盘大小 单位 GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘大小 单位 GB
     * @param DiskSize 磁盘大小 单位 GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 峰值带宽 单位 MB/s 
     * @return BandWidth 峰值带宽 单位 MB/s
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set 峰值带宽 单位 MB/s
     * @param BandWidth 峰值带宽 单位 MB/s
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get 分区上限 
     * @return Partition 分区上限
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 分区上限
     * @param Partition 分区上限
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    public InstanceScalingDownRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceScalingDownRequest(InstanceScalingDownRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UpgradeStrategy != null) {
            this.UpgradeStrategy = new Long(source.UpgradeStrategy);
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
        this.setParamSimple(map, prefix + "UpgradeStrategy", this.UpgradeStrategy);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "Partition", this.Partition);

    }
}

