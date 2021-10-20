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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SystemDisk extends AbstractModel{

    /**
    * 硬盘类型。取值范围：
- LOCAL_BASIC：本地硬盘；
- CLOUD_PREMIUM：高性能云硬盘；
默认取值：CLOUD_BASIC。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 硬盘ID。此参数暂不可用。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 硬盘容量大小。单位GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get 硬盘类型。取值范围：
- LOCAL_BASIC：本地硬盘；
- CLOUD_PREMIUM：高性能云硬盘；
默认取值：CLOUD_BASIC。 
     * @return DiskType 硬盘类型。取值范围：
- LOCAL_BASIC：本地硬盘；
- CLOUD_PREMIUM：高性能云硬盘；
默认取值：CLOUD_BASIC。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 硬盘类型。取值范围：
- LOCAL_BASIC：本地硬盘；
- CLOUD_PREMIUM：高性能云硬盘；
默认取值：CLOUD_BASIC。
     * @param DiskType 硬盘类型。取值范围：
- LOCAL_BASIC：本地硬盘；
- CLOUD_PREMIUM：高性能云硬盘；
默认取值：CLOUD_BASIC。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 硬盘ID。此参数暂不可用。 
     * @return DiskId 硬盘ID。此参数暂不可用。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 硬盘ID。此参数暂不可用。
     * @param DiskId 硬盘ID。此参数暂不可用。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 硬盘容量大小。单位GB。 
     * @return DiskSize 硬盘容量大小。单位GB。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 硬盘容量大小。单位GB。
     * @param DiskSize 硬盘容量大小。单位GB。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
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
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
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
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

