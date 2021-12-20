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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateDisksRequest extends AbstractModel{

    /**
    * 云硬盘大小, 单位: GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 云硬盘介质类型。取值: "CLOUD_PREMIUM"(高性能云盘), "CLOUD_SSD"(SSD云硬盘)。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 新购云硬盘包年包月相关参数设置。
    */
    @SerializedName("DiskChargePrepaid")
    @Expose
    private DiskChargePrepaid DiskChargePrepaid;

    /**
    * 云硬盘个数, 默认值: 1。
    */
    @SerializedName("DiskCount")
    @Expose
    private Long DiskCount;

    /**
     * Get 云硬盘大小, 单位: GB。 
     * @return DiskSize 云硬盘大小, 单位: GB。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 云硬盘大小, 单位: GB。
     * @param DiskSize 云硬盘大小, 单位: GB。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 云硬盘介质类型。取值: "CLOUD_PREMIUM"(高性能云盘), "CLOUD_SSD"(SSD云硬盘)。 
     * @return DiskType 云硬盘介质类型。取值: "CLOUD_PREMIUM"(高性能云盘), "CLOUD_SSD"(SSD云硬盘)。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 云硬盘介质类型。取值: "CLOUD_PREMIUM"(高性能云盘), "CLOUD_SSD"(SSD云硬盘)。
     * @param DiskType 云硬盘介质类型。取值: "CLOUD_PREMIUM"(高性能云盘), "CLOUD_SSD"(SSD云硬盘)。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 新购云硬盘包年包月相关参数设置。 
     * @return DiskChargePrepaid 新购云硬盘包年包月相关参数设置。
     */
    public DiskChargePrepaid getDiskChargePrepaid() {
        return this.DiskChargePrepaid;
    }

    /**
     * Set 新购云硬盘包年包月相关参数设置。
     * @param DiskChargePrepaid 新购云硬盘包年包月相关参数设置。
     */
    public void setDiskChargePrepaid(DiskChargePrepaid DiskChargePrepaid) {
        this.DiskChargePrepaid = DiskChargePrepaid;
    }

    /**
     * Get 云硬盘个数, 默认值: 1。 
     * @return DiskCount 云硬盘个数, 默认值: 1。
     */
    public Long getDiskCount() {
        return this.DiskCount;
    }

    /**
     * Set 云硬盘个数, 默认值: 1。
     * @param DiskCount 云硬盘个数, 默认值: 1。
     */
    public void setDiskCount(Long DiskCount) {
        this.DiskCount = DiskCount;
    }

    public InquirePriceCreateDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateDisksRequest(InquirePriceCreateDisksRequest source) {
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskChargePrepaid != null) {
            this.DiskChargePrepaid = new DiskChargePrepaid(source.DiskChargePrepaid);
        }
        if (source.DiskCount != null) {
            this.DiskCount = new Long(source.DiskCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamObj(map, prefix + "DiskChargePrepaid.", this.DiskChargePrepaid);
        this.setParamSimple(map, prefix + "DiskCount", this.DiskCount);

    }
}

