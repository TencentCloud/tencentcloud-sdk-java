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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskSpec extends AbstractModel{

    /**
    * 磁盘类型，例如“CLOUD_SSD", "LOCAL_SSD"等
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 磁盘类型说明，例如"云SSD", "本地SSD"等
    */
    @SerializedName("DiskDesc")
    @Expose
    private String DiskDesc;

    /**
    * 磁盘最小规格大小，单位G
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * 磁盘最大规格大小，单位G
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * 磁盘数目
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
     * Get 磁盘类型，例如“CLOUD_SSD", "LOCAL_SSD"等 
     * @return DiskType 磁盘类型，例如“CLOUD_SSD", "LOCAL_SSD"等
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型，例如“CLOUD_SSD", "LOCAL_SSD"等
     * @param DiskType 磁盘类型，例如“CLOUD_SSD", "LOCAL_SSD"等
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 磁盘类型说明，例如"云SSD", "本地SSD"等 
     * @return DiskDesc 磁盘类型说明，例如"云SSD", "本地SSD"等
     */
    public String getDiskDesc() {
        return this.DiskDesc;
    }

    /**
     * Set 磁盘类型说明，例如"云SSD", "本地SSD"等
     * @param DiskDesc 磁盘类型说明，例如"云SSD", "本地SSD"等
     */
    public void setDiskDesc(String DiskDesc) {
        this.DiskDesc = DiskDesc;
    }

    /**
     * Get 磁盘最小规格大小，单位G 
     * @return MinDiskSize 磁盘最小规格大小，单位G
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set 磁盘最小规格大小，单位G
     * @param MinDiskSize 磁盘最小规格大小，单位G
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get 磁盘最大规格大小，单位G 
     * @return MaxDiskSize 磁盘最大规格大小，单位G
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set 磁盘最大规格大小，单位G
     * @param MaxDiskSize 磁盘最大规格大小，单位G
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get 磁盘数目 
     * @return DiskCount 磁盘数目
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 磁盘数目
     * @param DiskCount 磁盘数目
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    public DiskSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskSpec(DiskSpec source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskDesc != null) {
            this.DiskDesc = new String(source.DiskDesc);
        }
        if (source.MinDiskSize != null) {
            this.MinDiskSize = new Long(source.MinDiskSize);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskDesc", this.DiskDesc);
        this.setParamSimple(map, prefix + "MinDiskSize", this.MinDiskSize);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);

    }
}

