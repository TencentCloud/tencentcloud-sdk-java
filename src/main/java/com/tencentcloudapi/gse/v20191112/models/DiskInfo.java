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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskInfo extends AbstractModel{

    /**
    * 磁盘类型，支持：高性能云硬盘（CLOUD_PREMIUM）、SSD云硬盘（CLOUD_SSD）
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 系统盘：可选硬盘容量，50-500GB，数字以1为单位，数据盘：可选硬盘容量：10-32000GB，数字以10为单位；当磁盘类型为SSD云硬盘（CLOUD_SSD）最小大小为 100GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get 磁盘类型，支持：高性能云硬盘（CLOUD_PREMIUM）、SSD云硬盘（CLOUD_SSD） 
     * @return DiskType 磁盘类型，支持：高性能云硬盘（CLOUD_PREMIUM）、SSD云硬盘（CLOUD_SSD）
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 磁盘类型，支持：高性能云硬盘（CLOUD_PREMIUM）、SSD云硬盘（CLOUD_SSD）
     * @param DiskType 磁盘类型，支持：高性能云硬盘（CLOUD_PREMIUM）、SSD云硬盘（CLOUD_SSD）
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 系统盘：可选硬盘容量，50-500GB，数字以1为单位，数据盘：可选硬盘容量：10-32000GB，数字以10为单位；当磁盘类型为SSD云硬盘（CLOUD_SSD）最小大小为 100GB 
     * @return DiskSize 系统盘：可选硬盘容量，50-500GB，数字以1为单位，数据盘：可选硬盘容量：10-32000GB，数字以10为单位；当磁盘类型为SSD云硬盘（CLOUD_SSD）最小大小为 100GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 系统盘：可选硬盘容量，50-500GB，数字以1为单位，数据盘：可选硬盘容量：10-32000GB，数字以10为单位；当磁盘类型为SSD云硬盘（CLOUD_SSD）最小大小为 100GB
     * @param DiskSize 系统盘：可选硬盘容量，50-500GB，数字以1为单位，数据盘：可选硬盘容量：10-32000GB，数字以10为单位；当磁盘类型为SSD云硬盘（CLOUD_SSD）最小大小为 100GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public DiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskInfo(DiskInfo source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

