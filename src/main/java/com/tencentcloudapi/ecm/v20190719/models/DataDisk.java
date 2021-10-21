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

public class DataDisk extends AbstractModel{

    /**
    * 数据盘大小。单位GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 数据盘类型，取值范围：
- LOCAL_BASIC：本地硬盘
- CLOUD_PREMIUM：高性能云硬盘

默认取值： LOCAL_BASIC。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
     * Get 数据盘大小。单位GB。 
     * @return DiskSize 数据盘大小。单位GB。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 数据盘大小。单位GB。
     * @param DiskSize 数据盘大小。单位GB。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 数据盘类型，取值范围：
- LOCAL_BASIC：本地硬盘
- CLOUD_PREMIUM：高性能云硬盘

默认取值： LOCAL_BASIC。 
     * @return DiskType 数据盘类型，取值范围：
- LOCAL_BASIC：本地硬盘
- CLOUD_PREMIUM：高性能云硬盘

默认取值： LOCAL_BASIC。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 数据盘类型，取值范围：
- LOCAL_BASIC：本地硬盘
- CLOUD_PREMIUM：高性能云硬盘

默认取值： LOCAL_BASIC。
     * @param DiskType 数据盘类型，取值范围：
- LOCAL_BASIC：本地硬盘
- CLOUD_PREMIUM：高性能云硬盘

默认取值： LOCAL_BASIC。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    public DataDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataDisk(DataDisk source) {
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);

    }
}

