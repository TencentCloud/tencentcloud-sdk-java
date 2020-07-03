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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MountDataDisk extends AbstractModel{

    /**
    * 挂载点，Linux系统合法路径，或Windows系统盘符,比如"H:\\"
    */
    @SerializedName("LocalPath")
    @Expose
    private String LocalPath;

    /**
    * 文件系统类型，Linux系统下支持"EXT3"和"EXT4"两种，默认"EXT3"；Windows系统下仅支持"NTFS"
    */
    @SerializedName("FileSystemType")
    @Expose
    private String FileSystemType;

    /**
     * Get 挂载点，Linux系统合法路径，或Windows系统盘符,比如"H:\\" 
     * @return LocalPath 挂载点，Linux系统合法路径，或Windows系统盘符,比如"H:\\"
     */
    public String getLocalPath() {
        return this.LocalPath;
    }

    /**
     * Set 挂载点，Linux系统合法路径，或Windows系统盘符,比如"H:\\"
     * @param LocalPath 挂载点，Linux系统合法路径，或Windows系统盘符,比如"H:\\"
     */
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * Get 文件系统类型，Linux系统下支持"EXT3"和"EXT4"两种，默认"EXT3"；Windows系统下仅支持"NTFS" 
     * @return FileSystemType 文件系统类型，Linux系统下支持"EXT3"和"EXT4"两种，默认"EXT3"；Windows系统下仅支持"NTFS"
     */
    public String getFileSystemType() {
        return this.FileSystemType;
    }

    /**
     * Set 文件系统类型，Linux系统下支持"EXT3"和"EXT4"两种，默认"EXT3"；Windows系统下仅支持"NTFS"
     * @param FileSystemType 文件系统类型，Linux系统下支持"EXT3"和"EXT4"两种，默认"EXT3"；Windows系统下仅支持"NTFS"
     */
    public void setFileSystemType(String FileSystemType) {
        this.FileSystemType = FileSystemType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalPath", this.LocalPath);
        this.setParamSimple(map, prefix + "FileSystemType", this.FileSystemType);

    }
}

