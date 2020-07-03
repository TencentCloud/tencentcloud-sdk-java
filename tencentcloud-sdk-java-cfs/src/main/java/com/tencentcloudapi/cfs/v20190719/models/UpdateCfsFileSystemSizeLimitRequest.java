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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCfsFileSystemSizeLimitRequest extends AbstractModel{

    /**
    * 文件系统容量限制大小，输入范围0-1073741824, 单位为GB；其中输入值为0时，表示不限制文件系统容量。
    */
    @SerializedName("FsLimit")
    @Expose
    private Long FsLimit;

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
     * Get 文件系统容量限制大小，输入范围0-1073741824, 单位为GB；其中输入值为0时，表示不限制文件系统容量。 
     * @return FsLimit 文件系统容量限制大小，输入范围0-1073741824, 单位为GB；其中输入值为0时，表示不限制文件系统容量。
     */
    public Long getFsLimit() {
        return this.FsLimit;
    }

    /**
     * Set 文件系统容量限制大小，输入范围0-1073741824, 单位为GB；其中输入值为0时，表示不限制文件系统容量。
     * @param FsLimit 文件系统容量限制大小，输入范围0-1073741824, 单位为GB；其中输入值为0时，表示不限制文件系统容量。
     */
    public void setFsLimit(Long FsLimit) {
        this.FsLimit = FsLimit;
    }

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FsLimit", this.FsLimit);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);

    }
}

