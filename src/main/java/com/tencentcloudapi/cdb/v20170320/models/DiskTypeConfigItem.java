/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskTypeConfigItem extends AbstractModel {

    /**
    * 磁盘对应的实例类型。仅支持单节点（云盘）和云盘版。
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 可以选择的磁盘类型列表。
    */
    @SerializedName("DiskType")
    @Expose
    private String [] DiskType;

    /**
     * Get 磁盘对应的实例类型。仅支持单节点（云盘）和云盘版。 
     * @return DeviceType 磁盘对应的实例类型。仅支持单节点（云盘）和云盘版。
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 磁盘对应的实例类型。仅支持单节点（云盘）和云盘版。
     * @param DeviceType 磁盘对应的实例类型。仅支持单节点（云盘）和云盘版。
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 可以选择的磁盘类型列表。 
     * @return DiskType 可以选择的磁盘类型列表。
     */
    public String [] getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 可以选择的磁盘类型列表。
     * @param DiskType 可以选择的磁盘类型列表。
     */
    public void setDiskType(String [] DiskType) {
        this.DiskType = DiskType;
    }

    public DiskTypeConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskTypeConfigItem(DiskTypeConfigItem source) {
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String[source.DiskType.length];
            for (int i = 0; i < source.DiskType.length; i++) {
                this.DiskType[i] = new String(source.DiskType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamArraySimple(map, prefix + "DiskType.", this.DiskType);

    }
}

