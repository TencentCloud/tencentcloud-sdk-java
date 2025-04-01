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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemDisk extends AbstractModel {

    /**
    * 系统盘类型。取值范围：<li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_HSSD：增强型SSD云盘</li>默认取值：当前有库存的硬盘类型。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 系统盘大小，单位：GB。默认值为 80
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 系统盘分区盘符
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
     * Get 系统盘类型。取值范围：<li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_HSSD：增强型SSD云盘</li>默认取值：当前有库存的硬盘类型。 
     * @return DiskType 系统盘类型。取值范围：<li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_HSSD：增强型SSD云盘</li>默认取值：当前有库存的硬盘类型。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 系统盘类型。取值范围：<li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_HSSD：增强型SSD云盘</li>默认取值：当前有库存的硬盘类型。
     * @param DiskType 系统盘类型。取值范围：<li>CLOUD_PREMIUM：高性能云硬盘</li><li>CLOUD_HSSD：增强型SSD云盘</li>默认取值：当前有库存的硬盘类型。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 系统盘大小，单位：GB。默认值为 80 
     * @return DiskSize 系统盘大小，单位：GB。默认值为 80
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 系统盘大小，单位：GB。默认值为 80
     * @param DiskSize 系统盘大小，单位：GB。默认值为 80
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 系统盘分区盘符 
     * @return DiskName 系统盘分区盘符
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set 系统盘分区盘符
     * @param DiskName 系统盘分区盘符
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    public SystemDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SystemDisk(SystemDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);

    }
}

