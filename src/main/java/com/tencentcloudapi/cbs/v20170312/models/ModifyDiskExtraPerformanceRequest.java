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

public class ModifyDiskExtraPerformanceRequest extends AbstractModel {

    /**
    * 额外购买的云硬盘性能值，单位MiB/s。
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
    * 需要购买额外性能值的云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。仅大小超过460GiB的增强型SSD（CLOUD_HSSD）和极速型SSD（CLOUD_TSSD）云硬盘才支持购买额外性能。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
     * Get 额外购买的云硬盘性能值，单位MiB/s。 
     * @return ThroughputPerformance 额外购买的云硬盘性能值，单位MiB/s。
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set 额外购买的云硬盘性能值，单位MiB/s。
     * @param ThroughputPerformance 额外购买的云硬盘性能值，单位MiB/s。
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    /**
     * Get 需要购买额外性能值的云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。仅大小超过460GiB的增强型SSD（CLOUD_HSSD）和极速型SSD（CLOUD_TSSD）云硬盘才支持购买额外性能。 
     * @return DiskId 需要购买额外性能值的云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。仅大小超过460GiB的增强型SSD（CLOUD_HSSD）和极速型SSD（CLOUD_TSSD）云硬盘才支持购买额外性能。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 需要购买额外性能值的云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。仅大小超过460GiB的增强型SSD（CLOUD_HSSD）和极速型SSD（CLOUD_TSSD）云硬盘才支持购买额外性能。
     * @param DiskId 需要购买额外性能值的云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。仅大小超过460GiB的增强型SSD（CLOUD_HSSD）和极速型SSD（CLOUD_TSSD）云硬盘才支持购买额外性能。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    public ModifyDiskExtraPerformanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDiskExtraPerformanceRequest(ModifyDiskExtraPerformanceRequest source) {
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);

    }
}

