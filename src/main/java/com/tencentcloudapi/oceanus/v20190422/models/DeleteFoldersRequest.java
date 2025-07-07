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

public class DeleteFoldersRequest extends AbstractModel {

    /**
    * 需删除的文件夹唯一ID
    */
    @SerializedName("FolderIds")
    @Expose
    private String [] FolderIds;

    /**
    * 文件夹类型，0是任务文件夹，1是依赖文件夹
    */
    @SerializedName("FolderType")
    @Expose
    private Long FolderType;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 需删除的文件夹唯一ID 
     * @return FolderIds 需删除的文件夹唯一ID
     */
    public String [] getFolderIds() {
        return this.FolderIds;
    }

    /**
     * Set 需删除的文件夹唯一ID
     * @param FolderIds 需删除的文件夹唯一ID
     */
    public void setFolderIds(String [] FolderIds) {
        this.FolderIds = FolderIds;
    }

    /**
     * Get 文件夹类型，0是任务文件夹，1是依赖文件夹 
     * @return FolderType 文件夹类型，0是任务文件夹，1是依赖文件夹
     */
    public Long getFolderType() {
        return this.FolderType;
    }

    /**
     * Set 文件夹类型，0是任务文件夹，1是依赖文件夹
     * @param FolderType 文件夹类型，0是任务文件夹，1是依赖文件夹
     */
    public void setFolderType(Long FolderType) {
        this.FolderType = FolderType;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public DeleteFoldersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFoldersRequest(DeleteFoldersRequest source) {
        if (source.FolderIds != null) {
            this.FolderIds = new String[source.FolderIds.length];
            for (int i = 0; i < source.FolderIds.length; i++) {
                this.FolderIds[i] = new String(source.FolderIds[i]);
            }
        }
        if (source.FolderType != null) {
            this.FolderType = new Long(source.FolderType);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FolderIds.", this.FolderIds);
        this.setParamSimple(map, prefix + "FolderType", this.FolderType);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

