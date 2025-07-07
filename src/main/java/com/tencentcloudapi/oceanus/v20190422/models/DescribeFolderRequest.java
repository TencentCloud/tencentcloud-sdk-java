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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFolderRequest extends AbstractModel {

    /**
    * folder id
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * workspace id
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * 1:资源文件夹
其他:作业文件夹
    */
    @SerializedName("FolderType")
    @Expose
    private Long FolderType;

    /**
     * Get folder id 
     * @return FolderId folder id
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set folder id
     * @param FolderId folder id
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get workspace id 
     * @return WorkSpaceId workspace id
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set workspace id
     * @param WorkSpaceId workspace id
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get 1:资源文件夹
其他:作业文件夹 
     * @return FolderType 1:资源文件夹
其他:作业文件夹
     */
    public Long getFolderType() {
        return this.FolderType;
    }

    /**
     * Set 1:资源文件夹
其他:作业文件夹
     * @param FolderType 1:资源文件夹
其他:作业文件夹
     */
    public void setFolderType(Long FolderType) {
        this.FolderType = FolderType;
    }

    public DescribeFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFolderRequest(DescribeFolderRequest source) {
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.FolderType != null) {
            this.FolderType = new Long(source.FolderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "FolderType", this.FolderType);

    }
}

