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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiDisk extends AbstractModel{

    /**
    * 云盘类型("CLOUD_PREMIUM","CLOUD_SSD","CLOUD_BASIC")的一种
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 云盘大小
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 该类型云盘个数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 云盘类型("CLOUD_PREMIUM","CLOUD_SSD","CLOUD_BASIC")的一种 
     * @return DiskType 云盘类型("CLOUD_PREMIUM","CLOUD_SSD","CLOUD_BASIC")的一种
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 云盘类型("CLOUD_PREMIUM","CLOUD_SSD","CLOUD_BASIC")的一种
     * @param DiskType 云盘类型("CLOUD_PREMIUM","CLOUD_SSD","CLOUD_BASIC")的一种
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 云盘大小 
     * @return Volume 云盘大小
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 云盘大小
     * @param Volume 云盘大小
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 该类型云盘个数 
     * @return Count 该类型云盘个数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该类型云盘个数
     * @param Count 该类型云盘个数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

