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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BuildClientNodeMountCommandRequest extends AbstractModel {

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 自定义挂载目录的绝对路径, 如果未指定, 则会使用默认值, 格式/goosefsx/${fs_id}-proxy. 比如/goosefsx/x-c60-a2b3d4-proxy
    */
    @SerializedName("CustomMountDir")
    @Expose
    private String CustomMountDir;

    /**
     * Get 文件系统ID 
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 自定义挂载目录的绝对路径, 如果未指定, 则会使用默认值, 格式/goosefsx/${fs_id}-proxy. 比如/goosefsx/x-c60-a2b3d4-proxy 
     * @return CustomMountDir 自定义挂载目录的绝对路径, 如果未指定, 则会使用默认值, 格式/goosefsx/${fs_id}-proxy. 比如/goosefsx/x-c60-a2b3d4-proxy
     */
    public String getCustomMountDir() {
        return this.CustomMountDir;
    }

    /**
     * Set 自定义挂载目录的绝对路径, 如果未指定, 则会使用默认值, 格式/goosefsx/${fs_id}-proxy. 比如/goosefsx/x-c60-a2b3d4-proxy
     * @param CustomMountDir 自定义挂载目录的绝对路径, 如果未指定, 则会使用默认值, 格式/goosefsx/${fs_id}-proxy. 比如/goosefsx/x-c60-a2b3d4-proxy
     */
    public void setCustomMountDir(String CustomMountDir) {
        this.CustomMountDir = CustomMountDir;
    }

    public BuildClientNodeMountCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildClientNodeMountCommandRequest(BuildClientNodeMountCommandRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.CustomMountDir != null) {
            this.CustomMountDir = new String(source.CustomMountDir);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "CustomMountDir", this.CustomMountDir);

    }
}

