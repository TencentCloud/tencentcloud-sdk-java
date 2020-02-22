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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskInfo extends AbstractModel{

    /**
    * 磁盘ID
    */
    @SerializedName("DiskTypeId")
    @Expose
    private Long DiskTypeId;

    /**
    * 磁盘的容量，单位为G
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 磁盘信息描述
    */
    @SerializedName("DiskDescription")
    @Expose
    private String DiskDescription;

    /**
     * Get 磁盘ID 
     * @return DiskTypeId 磁盘ID
     */
    public Long getDiskTypeId() {
        return this.DiskTypeId;
    }

    /**
     * Set 磁盘ID
     * @param DiskTypeId 磁盘ID
     */
    public void setDiskTypeId(Long DiskTypeId) {
        this.DiskTypeId = DiskTypeId;
    }

    /**
     * Get 磁盘的容量，单位为G 
     * @return Size 磁盘的容量，单位为G
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 磁盘的容量，单位为G
     * @param Size 磁盘的容量，单位为G
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 磁盘信息描述 
     * @return DiskDescription 磁盘信息描述
     */
    public String getDiskDescription() {
        return this.DiskDescription;
    }

    /**
     * Set 磁盘信息描述
     * @param DiskDescription 磁盘信息描述
     */
    public void setDiskDescription(String DiskDescription) {
        this.DiskDescription = DiskDescription;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskTypeId", this.DiskTypeId);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "DiskDescription", this.DiskDescription);

    }
}

