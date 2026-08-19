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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DedicatedClusterDiskStatistic extends AbstractModel {

    /**
    * <p>硬盘介质类型。取值范围：<br>&lt;li&gt;CLOUD_BASIC：表示普通云硬盘<br>&lt;li&gt;CLOUD_PREMIUM：表示高性能云硬盘<br>&lt;li&gt;CLOUD_SSD：表示SSD云硬盘<br>&lt;li&gt;CLOUD_HSSD：表示增强型SSD云硬盘<br>&lt;li&gt;CLOUD_TSSD：表示极速型SSD云硬盘。</p>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>云硬盘总容量。</p><p>单位：GiB</p>
    */
    @SerializedName("TotalDiskSize")
    @Expose
    private Long TotalDiskSize;

    /**
    * <p>已使用的云硬盘容量。</p><p>单位：GiB</p>
    */
    @SerializedName("UsedDiskSize")
    @Expose
    private Long UsedDiskSize;

    /**
    * <p>可用的云硬盘容量。</p><p>单位：GiB</p>
    */
    @SerializedName("AvailableDiskSize")
    @Expose
    private Long AvailableDiskSize;

    /**
     * Get <p>硬盘介质类型。取值范围：<br>&lt;li&gt;CLOUD_BASIC：表示普通云硬盘<br>&lt;li&gt;CLOUD_PREMIUM：表示高性能云硬盘<br>&lt;li&gt;CLOUD_SSD：表示SSD云硬盘<br>&lt;li&gt;CLOUD_HSSD：表示增强型SSD云硬盘<br>&lt;li&gt;CLOUD_TSSD：表示极速型SSD云硬盘。</p> 
     * @return DiskType <p>硬盘介质类型。取值范围：<br>&lt;li&gt;CLOUD_BASIC：表示普通云硬盘<br>&lt;li&gt;CLOUD_PREMIUM：表示高性能云硬盘<br>&lt;li&gt;CLOUD_SSD：表示SSD云硬盘<br>&lt;li&gt;CLOUD_HSSD：表示增强型SSD云硬盘<br>&lt;li&gt;CLOUD_TSSD：表示极速型SSD云硬盘。</p>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>硬盘介质类型。取值范围：<br>&lt;li&gt;CLOUD_BASIC：表示普通云硬盘<br>&lt;li&gt;CLOUD_PREMIUM：表示高性能云硬盘<br>&lt;li&gt;CLOUD_SSD：表示SSD云硬盘<br>&lt;li&gt;CLOUD_HSSD：表示增强型SSD云硬盘<br>&lt;li&gt;CLOUD_TSSD：表示极速型SSD云硬盘。</p>
     * @param DiskType <p>硬盘介质类型。取值范围：<br>&lt;li&gt;CLOUD_BASIC：表示普通云硬盘<br>&lt;li&gt;CLOUD_PREMIUM：表示高性能云硬盘<br>&lt;li&gt;CLOUD_SSD：表示SSD云硬盘<br>&lt;li&gt;CLOUD_HSSD：表示增强型SSD云硬盘<br>&lt;li&gt;CLOUD_TSSD：表示极速型SSD云硬盘。</p>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>云硬盘总容量。</p><p>单位：GiB</p> 
     * @return TotalDiskSize <p>云硬盘总容量。</p><p>单位：GiB</p>
     */
    public Long getTotalDiskSize() {
        return this.TotalDiskSize;
    }

    /**
     * Set <p>云硬盘总容量。</p><p>单位：GiB</p>
     * @param TotalDiskSize <p>云硬盘总容量。</p><p>单位：GiB</p>
     */
    public void setTotalDiskSize(Long TotalDiskSize) {
        this.TotalDiskSize = TotalDiskSize;
    }

    /**
     * Get <p>已使用的云硬盘容量。</p><p>单位：GiB</p> 
     * @return UsedDiskSize <p>已使用的云硬盘容量。</p><p>单位：GiB</p>
     */
    public Long getUsedDiskSize() {
        return this.UsedDiskSize;
    }

    /**
     * Set <p>已使用的云硬盘容量。</p><p>单位：GiB</p>
     * @param UsedDiskSize <p>已使用的云硬盘容量。</p><p>单位：GiB</p>
     */
    public void setUsedDiskSize(Long UsedDiskSize) {
        this.UsedDiskSize = UsedDiskSize;
    }

    /**
     * Get <p>可用的云硬盘容量。</p><p>单位：GiB</p> 
     * @return AvailableDiskSize <p>可用的云硬盘容量。</p><p>单位：GiB</p>
     */
    public Long getAvailableDiskSize() {
        return this.AvailableDiskSize;
    }

    /**
     * Set <p>可用的云硬盘容量。</p><p>单位：GiB</p>
     * @param AvailableDiskSize <p>可用的云硬盘容量。</p><p>单位：GiB</p>
     */
    public void setAvailableDiskSize(Long AvailableDiskSize) {
        this.AvailableDiskSize = AvailableDiskSize;
    }

    public DedicatedClusterDiskStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DedicatedClusterDiskStatistic(DedicatedClusterDiskStatistic source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.TotalDiskSize != null) {
            this.TotalDiskSize = new Long(source.TotalDiskSize);
        }
        if (source.UsedDiskSize != null) {
            this.UsedDiskSize = new Long(source.UsedDiskSize);
        }
        if (source.AvailableDiskSize != null) {
            this.AvailableDiskSize = new Long(source.AvailableDiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "TotalDiskSize", this.TotalDiskSize);
        this.setParamSimple(map, prefix + "UsedDiskSize", this.UsedDiskSize);
        this.setParamSimple(map, prefix + "AvailableDiskSize", this.AvailableDiskSize);

    }
}

