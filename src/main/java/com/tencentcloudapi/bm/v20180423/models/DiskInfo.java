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

public class DiskInfo  extends AbstractModel{

    /**
    * 磁盘ID
    */
    @SerializedName("DiskTypeId")
    @Expose
    private Integer DiskTypeId;

    /**
    * 磁盘的容量，单位为G
    */
    @SerializedName("Size")
    @Expose
    private Integer Size;

    /**
    * 磁盘信息描述
    */
    @SerializedName("DiskDescription")
    @Expose
    private String DiskDescription;

    /**
     * 获取磁盘ID
     * @return DiskTypeId 磁盘ID
     */
    public Integer getDiskTypeId() {
        return this.DiskTypeId;
    }

    /**
     * 设置磁盘ID
     * @param DiskTypeId 磁盘ID
     */
    public void setDiskTypeId(Integer DiskTypeId) {
        this.DiskTypeId = DiskTypeId;
    }

    /**
     * 获取磁盘的容量，单位为G
     * @return Size 磁盘的容量，单位为G
     */
    public Integer getSize() {
        return this.Size;
    }

    /**
     * 设置磁盘的容量，单位为G
     * @param Size 磁盘的容量，单位为G
     */
    public void setSize(Integer Size) {
        this.Size = Size;
    }

    /**
     * 获取磁盘信息描述
     * @return DiskDescription 磁盘信息描述
     */
    public String getDiskDescription() {
        return this.DiskDescription;
    }

    /**
     * 设置磁盘信息描述
     * @param DiskDescription 磁盘信息描述
     */
    public void setDiskDescription(String DiskDescription) {
        this.DiskDescription = DiskDescription;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskTypeId", this.DiskTypeId);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "DiskDescription", this.DiskDescription);

    }
}

