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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskSpecInfo extends AbstractModel {

    /**
    * 磁盘数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 系统盘类型 取值范围：
<li>CLOUD_SSD：表示云SSD。</li>
<li>CLOUD_PREMIUM：表示高效云盘。</li>
<li>CLOUD_BASIC：表示云硬盘。</li>
<li>LOCAL_BASIC：表示本地盘。</li>
<li>LOCAL_SSD：表示本地SSD。</li>

数据盘类型 取值范围：
<li>CLOUD_SSD：表示云SSD。</li>
<li>CLOUD_PREMIUM：表示高效云盘。</li>
<li>CLOUD_BASIC：表示云硬盘。</li>
<li>LOCAL_BASIC：表示本地盘。</li>
<li>LOCAL_SSD：表示本地SSD。</li>
<li>CLOUD_HSSD：表示增强型SSD云硬盘。</li>
<li>CLOUD_THROUGHPUT：表示吞吐型云硬盘。</li>
<li>CLOUD_TSSD：表示极速型SSD云硬盘。</li>
<li>CLOUD_BIGDATA：表示大数据型云硬盘。</li>
<li>CLOUD_HIGHIO：表示高IO型云硬盘。</li>
<li>CLOUD_BSSD：表示通用型SSD云硬盘。</li>
<li>REMOTE_SSD：表示远端SSD盘。</li>

    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 数据容量，单位为GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 额外性能
    */
    @SerializedName("ExtraPerformance")
    @Expose
    private Long ExtraPerformance;

    /**
     * Get 磁盘数量 
     * @return Count 磁盘数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 磁盘数量
     * @param Count 磁盘数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 系统盘类型 取值范围：
<li>CLOUD_SSD：表示云SSD。</li>
<li>CLOUD_PREMIUM：表示高效云盘。</li>
<li>CLOUD_BASIC：表示云硬盘。</li>
<li>LOCAL_BASIC：表示本地盘。</li>
<li>LOCAL_SSD：表示本地SSD。</li>

数据盘类型 取值范围：
<li>CLOUD_SSD：表示云SSD。</li>
<li>CLOUD_PREMIUM：表示高效云盘。</li>
<li>CLOUD_BASIC：表示云硬盘。</li>
<li>LOCAL_BASIC：表示本地盘。</li>
<li>LOCAL_SSD：表示本地SSD。</li>
<li>CLOUD_HSSD：表示增强型SSD云硬盘。</li>
<li>CLOUD_THROUGHPUT：表示吞吐型云硬盘。</li>
<li>CLOUD_TSSD：表示极速型SSD云硬盘。</li>
<li>CLOUD_BIGDATA：表示大数据型云硬盘。</li>
<li>CLOUD_HIGHIO：表示高IO型云硬盘。</li>
<li>CLOUD_BSSD：表示通用型SSD云硬盘。</li>
<li>REMOTE_SSD：表示远端SSD盘。</li>
 
     * @return DiskType 系统盘类型 取值范围：
<li>CLOUD_SSD：表示云SSD。</li>
<li>CLOUD_PREMIUM：表示高效云盘。</li>
<li>CLOUD_BASIC：表示云硬盘。</li>
<li>LOCAL_BASIC：表示本地盘。</li>
<li>LOCAL_SSD：表示本地SSD。</li>

数据盘类型 取值范围：
<li>CLOUD_SSD：表示云SSD。</li>
<li>CLOUD_PREMIUM：表示高效云盘。</li>
<li>CLOUD_BASIC：表示云硬盘。</li>
<li>LOCAL_BASIC：表示本地盘。</li>
<li>LOCAL_SSD：表示本地SSD。</li>
<li>CLOUD_HSSD：表示增强型SSD云硬盘。</li>
<li>CLOUD_THROUGHPUT：表示吞吐型云硬盘。</li>
<li>CLOUD_TSSD：表示极速型SSD云硬盘。</li>
<li>CLOUD_BIGDATA：表示大数据型云硬盘。</li>
<li>CLOUD_HIGHIO：表示高IO型云硬盘。</li>
<li>CLOUD_BSSD：表示通用型SSD云硬盘。</li>
<li>REMOTE_SSD：表示远端SSD盘。</li>

     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 系统盘类型 取值范围：
<li>CLOUD_SSD：表示云SSD。</li>
<li>CLOUD_PREMIUM：表示高效云盘。</li>
<li>CLOUD_BASIC：表示云硬盘。</li>
<li>LOCAL_BASIC：表示本地盘。</li>
<li>LOCAL_SSD：表示本地SSD。</li>

数据盘类型 取值范围：
<li>CLOUD_SSD：表示云SSD。</li>
<li>CLOUD_PREMIUM：表示高效云盘。</li>
<li>CLOUD_BASIC：表示云硬盘。</li>
<li>LOCAL_BASIC：表示本地盘。</li>
<li>LOCAL_SSD：表示本地SSD。</li>
<li>CLOUD_HSSD：表示增强型SSD云硬盘。</li>
<li>CLOUD_THROUGHPUT：表示吞吐型云硬盘。</li>
<li>CLOUD_TSSD：表示极速型SSD云硬盘。</li>
<li>CLOUD_BIGDATA：表示大数据型云硬盘。</li>
<li>CLOUD_HIGHIO：表示高IO型云硬盘。</li>
<li>CLOUD_BSSD：表示通用型SSD云硬盘。</li>
<li>REMOTE_SSD：表示远端SSD盘。</li>

     * @param DiskType 系统盘类型 取值范围：
<li>CLOUD_SSD：表示云SSD。</li>
<li>CLOUD_PREMIUM：表示高效云盘。</li>
<li>CLOUD_BASIC：表示云硬盘。</li>
<li>LOCAL_BASIC：表示本地盘。</li>
<li>LOCAL_SSD：表示本地SSD。</li>

数据盘类型 取值范围：
<li>CLOUD_SSD：表示云SSD。</li>
<li>CLOUD_PREMIUM：表示高效云盘。</li>
<li>CLOUD_BASIC：表示云硬盘。</li>
<li>LOCAL_BASIC：表示本地盘。</li>
<li>LOCAL_SSD：表示本地SSD。</li>
<li>CLOUD_HSSD：表示增强型SSD云硬盘。</li>
<li>CLOUD_THROUGHPUT：表示吞吐型云硬盘。</li>
<li>CLOUD_TSSD：表示极速型SSD云硬盘。</li>
<li>CLOUD_BIGDATA：表示大数据型云硬盘。</li>
<li>CLOUD_HIGHIO：表示高IO型云硬盘。</li>
<li>CLOUD_BSSD：表示通用型SSD云硬盘。</li>
<li>REMOTE_SSD：表示远端SSD盘。</li>

     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 数据容量，单位为GB 
     * @return DiskSize 数据容量，单位为GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 数据容量，单位为GB
     * @param DiskSize 数据容量，单位为GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 额外性能 
     * @return ExtraPerformance 额外性能
     */
    public Long getExtraPerformance() {
        return this.ExtraPerformance;
    }

    /**
     * Set 额外性能
     * @param ExtraPerformance 额外性能
     */
    public void setExtraPerformance(Long ExtraPerformance) {
        this.ExtraPerformance = ExtraPerformance;
    }

    public DiskSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskSpecInfo(DiskSpecInfo source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.ExtraPerformance != null) {
            this.ExtraPerformance = new Long(source.ExtraPerformance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "ExtraPerformance", this.ExtraPerformance);

    }
}

