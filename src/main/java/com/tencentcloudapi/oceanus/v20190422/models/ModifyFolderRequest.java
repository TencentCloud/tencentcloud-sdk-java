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

public class ModifyFolderRequest extends AbstractModel {

    /**
    * 文件夹ID（必填）
    */
    @SerializedName("SourceFolderId")
    @Expose
    private String SourceFolderId;

    /**
    * 如需拖拽文件夹，需传入目标文件夹ID
    */
    @SerializedName("TargetFolderId")
    @Expose
    private String TargetFolderId;

    /**
    * 如需修改文件夹名，需传入FolderName字段
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 文件夹类型，0是任务文件夹，1是依赖文件夹
    */
    @SerializedName("FolderType")
    @Expose
    private Long FolderType;

    /**
    * 批量移动的作业serial id 列表
    */
    @SerializedName("SourceJobIds")
    @Expose
    private String [] SourceJobIds;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 文件夹ID（必填） 
     * @return SourceFolderId 文件夹ID（必填）
     */
    public String getSourceFolderId() {
        return this.SourceFolderId;
    }

    /**
     * Set 文件夹ID（必填）
     * @param SourceFolderId 文件夹ID（必填）
     */
    public void setSourceFolderId(String SourceFolderId) {
        this.SourceFolderId = SourceFolderId;
    }

    /**
     * Get 如需拖拽文件夹，需传入目标文件夹ID 
     * @return TargetFolderId 如需拖拽文件夹，需传入目标文件夹ID
     */
    public String getTargetFolderId() {
        return this.TargetFolderId;
    }

    /**
     * Set 如需拖拽文件夹，需传入目标文件夹ID
     * @param TargetFolderId 如需拖拽文件夹，需传入目标文件夹ID
     */
    public void setTargetFolderId(String TargetFolderId) {
        this.TargetFolderId = TargetFolderId;
    }

    /**
     * Get 如需修改文件夹名，需传入FolderName字段 
     * @return FolderName 如需修改文件夹名，需传入FolderName字段
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 如需修改文件夹名，需传入FolderName字段
     * @param FolderName 如需修改文件夹名，需传入FolderName字段
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
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
     * Get 批量移动的作业serial id 列表 
     * @return SourceJobIds 批量移动的作业serial id 列表
     */
    public String [] getSourceJobIds() {
        return this.SourceJobIds;
    }

    /**
     * Set 批量移动的作业serial id 列表
     * @param SourceJobIds 批量移动的作业serial id 列表
     */
    public void setSourceJobIds(String [] SourceJobIds) {
        this.SourceJobIds = SourceJobIds;
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

    public ModifyFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFolderRequest(ModifyFolderRequest source) {
        if (source.SourceFolderId != null) {
            this.SourceFolderId = new String(source.SourceFolderId);
        }
        if (source.TargetFolderId != null) {
            this.TargetFolderId = new String(source.TargetFolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.FolderType != null) {
            this.FolderType = new Long(source.FolderType);
        }
        if (source.SourceJobIds != null) {
            this.SourceJobIds = new String[source.SourceJobIds.length];
            for (int i = 0; i < source.SourceJobIds.length; i++) {
                this.SourceJobIds[i] = new String(source.SourceJobIds[i]);
            }
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceFolderId", this.SourceFolderId);
        this.setParamSimple(map, prefix + "TargetFolderId", this.TargetFolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "FolderType", this.FolderType);
        this.setParamArraySimple(map, prefix + "SourceJobIds.", this.SourceJobIds);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

