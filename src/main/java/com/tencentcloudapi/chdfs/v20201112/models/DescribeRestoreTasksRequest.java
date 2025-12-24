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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRestoreTasksRequest extends AbstractModel {

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 起始回热任务ID标记
    */
    @SerializedName("RestoreTaskIdMarker")
    @Expose
    private Long RestoreTaskIdMarker;

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
     * Get 起始回热任务ID标记 
     * @return RestoreTaskIdMarker 起始回热任务ID标记
     */
    public Long getRestoreTaskIdMarker() {
        return this.RestoreTaskIdMarker;
    }

    /**
     * Set 起始回热任务ID标记
     * @param RestoreTaskIdMarker 起始回热任务ID标记
     */
    public void setRestoreTaskIdMarker(Long RestoreTaskIdMarker) {
        this.RestoreTaskIdMarker = RestoreTaskIdMarker;
    }

    public DescribeRestoreTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRestoreTasksRequest(DescribeRestoreTasksRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.RestoreTaskIdMarker != null) {
            this.RestoreTaskIdMarker = new Long(source.RestoreTaskIdMarker);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "RestoreTaskIdMarker", this.RestoreTaskIdMarker);

    }
}

