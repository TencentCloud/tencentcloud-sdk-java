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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskDiscountRequest extends AbstractModel {

    /**
    * 云硬盘类型, 取值范围: CLOUD_PREMIUM: 高性能云硬盘，CLOUD_SSD: SSD云硬盘
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 云硬盘大小, 单位: GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 指定云硬盘备份点配额，不传时默认为不带备份点配额。目前只支持不带或设置[0 - 500]个云硬盘备份点配额。
    */
    @SerializedName("DiskBackupQuota")
    @Expose
    private Long DiskBackupQuota;

    /**
     * Get 云硬盘类型, 取值范围: CLOUD_PREMIUM: 高性能云硬盘，CLOUD_SSD: SSD云硬盘 
     * @return DiskType 云硬盘类型, 取值范围: CLOUD_PREMIUM: 高性能云硬盘，CLOUD_SSD: SSD云硬盘
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 云硬盘类型, 取值范围: CLOUD_PREMIUM: 高性能云硬盘，CLOUD_SSD: SSD云硬盘
     * @param DiskType 云硬盘类型, 取值范围: CLOUD_PREMIUM: 高性能云硬盘，CLOUD_SSD: SSD云硬盘
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

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
     * Get 指定云硬盘备份点配额，不传时默认为不带备份点配额。目前只支持不带或设置[0 - 500]个云硬盘备份点配额。 
     * @return DiskBackupQuota 指定云硬盘备份点配额，不传时默认为不带备份点配额。目前只支持不带或设置[0 - 500]个云硬盘备份点配额。
     */
    public Long getDiskBackupQuota() {
        return this.DiskBackupQuota;
    }

    /**
     * Set 指定云硬盘备份点配额，不传时默认为不带备份点配额。目前只支持不带或设置[0 - 500]个云硬盘备份点配额。
     * @param DiskBackupQuota 指定云硬盘备份点配额，不传时默认为不带备份点配额。目前只支持不带或设置[0 - 500]个云硬盘备份点配额。
     */
    public void setDiskBackupQuota(Long DiskBackupQuota) {
        this.DiskBackupQuota = DiskBackupQuota;
    }

    public DescribeDiskDiscountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskDiscountRequest(DescribeDiskDiscountRequest source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskBackupQuota != null) {
            this.DiskBackupQuota = new Long(source.DiskBackupQuota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskBackupQuota", this.DiskBackupQuota);

    }
}

