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

public class DeviceDiskSizeInfo  extends AbstractModel{

    /**
    * 硬盘名称
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * 硬盘大小（单位GiB）
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;

    /**
     * 获取硬盘名称
     * @return DiskName 硬盘名称
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * 设置硬盘名称
     * @param DiskName 硬盘名称
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * 获取硬盘大小（单位GiB）
     * @return DiskSize 硬盘大小（单位GiB）
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * 设置硬盘大小（单位GiB）
     * @param DiskSize 硬盘大小（单位GiB）
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

