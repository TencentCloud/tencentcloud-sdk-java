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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleUpFileSystemRequest extends AbstractModel {

    /**
    * 文件系统Id,该参数通过查询文件系统列表接口获取
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 扩容的目标容量（单位GiB）
    */
    @SerializedName("TargetCapacity")
    @Expose
    private Long TargetCapacity;

    /**
     * Get 文件系统Id,该参数通过查询文件系统列表接口获取 
     * @return FileSystemId 文件系统Id,该参数通过查询文件系统列表接口获取
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统Id,该参数通过查询文件系统列表接口获取
     * @param FileSystemId 文件系统Id,该参数通过查询文件系统列表接口获取
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 扩容的目标容量（单位GiB） 
     * @return TargetCapacity 扩容的目标容量（单位GiB）
     */
    public Long getTargetCapacity() {
        return this.TargetCapacity;
    }

    /**
     * Set 扩容的目标容量（单位GiB）
     * @param TargetCapacity 扩容的目标容量（单位GiB）
     */
    public void setTargetCapacity(Long TargetCapacity) {
        this.TargetCapacity = TargetCapacity;
    }

    public ScaleUpFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleUpFileSystemRequest(ScaleUpFileSystemRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.TargetCapacity != null) {
            this.TargetCapacity = new Long(source.TargetCapacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "TargetCapacity", this.TargetCapacity);

    }
}

