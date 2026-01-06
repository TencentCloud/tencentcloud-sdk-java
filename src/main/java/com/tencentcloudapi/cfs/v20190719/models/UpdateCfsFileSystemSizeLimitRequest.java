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

public class UpdateCfsFileSystemSizeLimitRequest extends AbstractModel {

    /**
    * 文件系统容量限制大小，输入范围0-1073741824, 单位为GB；其中输入值为0时，表示不限制文件系统容量。
    */
    @SerializedName("FsLimit")
    @Expose
    private Long FsLimit;

    /**
    * 文件系统 ID，此功能需要开白使用，请[提交工单](https://console.cloud.tencent.com/workorder/category?from=ticket-tab)进行申请。当前仅支持通用标准型文件系统设置存储容量上限。该参数通过[查询文件系统](https://cloud.tencent.com/document/product/582/38170)获取。
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
     * Get 文件系统 ID，此功能需要开白使用，请[提交工单](https://console.cloud.tencent.com/workorder/category?from=ticket-tab)进行申请。当前仅支持通用标准型文件系统设置存储容量上限。该参数通过[查询文件系统](https://cloud.tencent.com/document/product/582/38170)获取。 
     * @return FileSystemId 文件系统 ID，此功能需要开白使用，请[提交工单](https://console.cloud.tencent.com/workorder/category?from=ticket-tab)进行申请。当前仅支持通用标准型文件系统设置存储容量上限。该参数通过[查询文件系统](https://cloud.tencent.com/document/product/582/38170)获取。
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统 ID，此功能需要开白使用，请[提交工单](https://console.cloud.tencent.com/workorder/category?from=ticket-tab)进行申请。当前仅支持通用标准型文件系统设置存储容量上限。该参数通过[查询文件系统](https://cloud.tencent.com/document/product/582/38170)获取。
     * @param FileSystemId 文件系统 ID，此功能需要开白使用，请[提交工单](https://console.cloud.tencent.com/workorder/category?from=ticket-tab)进行申请。当前仅支持通用标准型文件系统设置存储容量上限。该参数通过[查询文件系统](https://cloud.tencent.com/document/product/582/38170)获取。
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    public UpdateCfsFileSystemSizeLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCfsFileSystemSizeLimitRequest(UpdateCfsFileSystemSizeLimitRequest source) {
        if (source.FsLimit != null) {
            this.FsLimit = new Long(source.FsLimit);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FsLimit", this.FsLimit);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);

    }
}

