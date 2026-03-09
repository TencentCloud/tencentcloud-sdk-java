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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancePreRequest extends AbstractModel {

    /**
    * <p>ckafka集群实例Id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>磁盘大小 单位 GB     最大值为500000,步长100可以通过以下链接查看规格限制：https://cloud.tencent.com/document/product/597/122562</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>峰值带宽 单位 MB/s可以通过以下链接查看规格限制及对应步长: https://cloud.tencent.com/document/product/597/11745</p>
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * <p>分区上限 最大值: 40000, 步长: 100可以通过以下链接查看规格限制: https://cloud.tencent.com/document/product/597/122563</p>
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
     * Get <p>ckafka集群实例Id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p> 
     * @return InstanceId <p>ckafka集群实例Id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka集群实例Id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     * @param InstanceId <p>ckafka集群实例Id,可通过<a href="https://cloud.tencent.com/document/product/597/40835">DescribeInstances</a>接口获取</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>磁盘大小 单位 GB     最大值为500000,步长100可以通过以下链接查看规格限制：https://cloud.tencent.com/document/product/597/122562</p> 
     * @return DiskSize <p>磁盘大小 单位 GB     最大值为500000,步长100可以通过以下链接查看规格限制：https://cloud.tencent.com/document/product/597/122562</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>磁盘大小 单位 GB     最大值为500000,步长100可以通过以下链接查看规格限制：https://cloud.tencent.com/document/product/597/122562</p>
     * @param DiskSize <p>磁盘大小 单位 GB     最大值为500000,步长100可以通过以下链接查看规格限制：https://cloud.tencent.com/document/product/597/122562</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>峰值带宽 单位 MB/s可以通过以下链接查看规格限制及对应步长: https://cloud.tencent.com/document/product/597/11745</p> 
     * @return BandWidth <p>峰值带宽 单位 MB/s可以通过以下链接查看规格限制及对应步长: https://cloud.tencent.com/document/product/597/11745</p>
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set <p>峰值带宽 单位 MB/s可以通过以下链接查看规格限制及对应步长: https://cloud.tencent.com/document/product/597/11745</p>
     * @param BandWidth <p>峰值带宽 单位 MB/s可以通过以下链接查看规格限制及对应步长: https://cloud.tencent.com/document/product/597/11745</p>
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get <p>分区上限 最大值: 40000, 步长: 100可以通过以下链接查看规格限制: https://cloud.tencent.com/document/product/597/122563</p> 
     * @return Partition <p>分区上限 最大值: 40000, 步长: 100可以通过以下链接查看规格限制: https://cloud.tencent.com/document/product/597/122563</p>
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>分区上限 最大值: 40000, 步长: 100可以通过以下链接查看规格限制: https://cloud.tencent.com/document/product/597/122563</p>
     * @param Partition <p>分区上限 最大值: 40000, 步长: 100可以通过以下链接查看规格限制: https://cloud.tencent.com/document/product/597/122563</p>
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

