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

public class DoDirectoryOperationRequest extends AbstractModel {

    /**
    * 文件系统Id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * create：创建目录  check：确认目录是否存在
    */
    @SerializedName("OpetationType")
    @Expose
    private String OpetationType;

    /**
    * 目录的绝对路径  默认递归创建（即如果目录中有子目录不存在，则先创建出对应子目录）
    */
    @SerializedName("DirectoryPath")
    @Expose
    private String DirectoryPath;

    /**
    * 创建目录的权限，若不传，默认为0755  若Operation Type为check，此值无实际意义
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get 文件系统Id 
     * @return FileSystemId 文件系统Id
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统Id
     * @param FileSystemId 文件系统Id
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get create：创建目录  check：确认目录是否存在 
     * @return OpetationType create：创建目录  check：确认目录是否存在
     */
    public String getOpetationType() {
        return this.OpetationType;
    }

    /**
     * Set create：创建目录  check：确认目录是否存在
     * @param OpetationType create：创建目录  check：确认目录是否存在
     */
    public void setOpetationType(String OpetationType) {
        this.OpetationType = OpetationType;
    }

    /**
     * Get 目录的绝对路径  默认递归创建（即如果目录中有子目录不存在，则先创建出对应子目录） 
     * @return DirectoryPath 目录的绝对路径  默认递归创建（即如果目录中有子目录不存在，则先创建出对应子目录）
     */
    public String getDirectoryPath() {
        return this.DirectoryPath;
    }

    /**
     * Set 目录的绝对路径  默认递归创建（即如果目录中有子目录不存在，则先创建出对应子目录）
     * @param DirectoryPath 目录的绝对路径  默认递归创建（即如果目录中有子目录不存在，则先创建出对应子目录）
     */
    public void setDirectoryPath(String DirectoryPath) {
        this.DirectoryPath = DirectoryPath;
    }

    /**
     * Get 创建目录的权限，若不传，默认为0755  若Operation Type为check，此值无实际意义 
     * @return Mode 创建目录的权限，若不传，默认为0755  若Operation Type为check，此值无实际意义
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 创建目录的权限，若不传，默认为0755  若Operation Type为check，此值无实际意义
     * @param Mode 创建目录的权限，若不传，默认为0755  若Operation Type为check，此值无实际意义
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public DoDirectoryOperationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DoDirectoryOperationRequest(DoDirectoryOperationRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.OpetationType != null) {
            this.OpetationType = new String(source.OpetationType);
        }
        if (source.DirectoryPath != null) {
            this.DirectoryPath = new String(source.DirectoryPath);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "OpetationType", this.OpetationType);
        this.setParamSimple(map, prefix + "DirectoryPath", this.DirectoryPath);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

