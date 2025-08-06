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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageOption extends AbstractModel {

    /**
    * 文件存储类型，取值范围：
- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 文件存储可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 文件系统容量，turbo系列必填，单位为GiB。 
- turbo标准型起售40TiB，即40960GiB；扩容步长20TiB，即20480 GiB。
- turbo性能型起售20TiB，即20480 GiB；扩容步长10TiB，即10240 GiB。
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * 是否开启默认扩容，仅turbo类型文件存储支持
    */
    @SerializedName("EnableAutoScaleUp")
    @Expose
    private Boolean EnableAutoScaleUp;

    /**
    * turbo文件系统元数据属性，basic：标准型元数据；enhanced：增强型元数据
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
     * Get 文件存储类型，取值范围：
- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型 
     * @return StorageType 文件存储类型，取值范围：
- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 文件存储类型，取值范围：
- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
     * @param StorageType 文件存储类型，取值范围：
- SD：通用标准型
- HP：通用性能型
- TB：turbo标准型
- TP：turbo性能型
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 文件存储可用区。 
     * @return Zone 文件存储可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 文件存储可用区。
     * @param Zone 文件存储可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 文件系统容量，turbo系列必填，单位为GiB。 
- turbo标准型起售40TiB，即40960GiB；扩容步长20TiB，即20480 GiB。
- turbo性能型起售20TiB，即20480 GiB；扩容步长10TiB，即10240 GiB。 
     * @return Capacity 文件系统容量，turbo系列必填，单位为GiB。 
- turbo标准型起售40TiB，即40960GiB；扩容步长20TiB，即20480 GiB。
- turbo性能型起售20TiB，即20480 GiB；扩容步长10TiB，即10240 GiB。
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set 文件系统容量，turbo系列必填，单位为GiB。 
- turbo标准型起售40TiB，即40960GiB；扩容步长20TiB，即20480 GiB。
- turbo性能型起售20TiB，即20480 GiB；扩容步长10TiB，即10240 GiB。
     * @param Capacity 文件系统容量，turbo系列必填，单位为GiB。 
- turbo标准型起售40TiB，即40960GiB；扩容步长20TiB，即20480 GiB。
- turbo性能型起售20TiB，即20480 GiB；扩容步长10TiB，即10240 GiB。
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get 是否开启默认扩容，仅turbo类型文件存储支持 
     * @return EnableAutoScaleUp 是否开启默认扩容，仅turbo类型文件存储支持
     */
    public Boolean getEnableAutoScaleUp() {
        return this.EnableAutoScaleUp;
    }

    /**
     * Set 是否开启默认扩容，仅turbo类型文件存储支持
     * @param EnableAutoScaleUp 是否开启默认扩容，仅turbo类型文件存储支持
     */
    public void setEnableAutoScaleUp(Boolean EnableAutoScaleUp) {
        this.EnableAutoScaleUp = EnableAutoScaleUp;
    }

    /**
     * Get turbo文件系统元数据属性，basic：标准型元数据；enhanced：增强型元数据 
     * @return MetaType turbo文件系统元数据属性，basic：标准型元数据；enhanced：增强型元数据
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set turbo文件系统元数据属性，basic：标准型元数据；enhanced：增强型元数据
     * @param MetaType turbo文件系统元数据属性，basic：标准型元数据；enhanced：增强型元数据
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    public StorageOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageOption(StorageOption source) {
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.EnableAutoScaleUp != null) {
            this.EnableAutoScaleUp = new Boolean(source.EnableAutoScaleUp);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamSimple(map, prefix + "EnableAutoScaleUp", this.EnableAutoScaleUp);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);

    }
}

