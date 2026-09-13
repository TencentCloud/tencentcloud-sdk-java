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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFileRequest extends AbstractModel {

    /**
    * <p>工作空间 ID。来源：ListWorkspaces 接口返回的 WorkspaceId</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>文件 ID。来源：CreateFile / ListFiles 接口返回的 FileId。与 FilePath 二选一</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>文件类型。取值：FILE（普通文件/脚本）、NOTEBOOK_FILE（Notebook）、SQL_FILE（SQL文件）。对应 common/domain/entity.proto EntityType</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>是否返回文件内容。true 时 Storage.Content 返回 base64 内容，默认 false</p>
    */
    @SerializedName("IncludeContent")
    @Expose
    private Boolean IncludeContent;

    /**
    * <p>文件版本 ID。来源：ListFileVersions 接口返回的 VersionId。不传则读取最新版本</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>文件完整路径，以 / 开头，如 /etl/daily/demo.ipynb。与 FileId 二选一</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
     * Get <p>工作空间 ID。来源：ListWorkspaces 接口返回的 WorkspaceId</p> 
     * @return WorkspaceId <p>工作空间 ID。来源：ListWorkspaces 接口返回的 WorkspaceId</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间 ID。来源：ListWorkspaces 接口返回的 WorkspaceId</p>
     * @param WorkspaceId <p>工作空间 ID。来源：ListWorkspaces 接口返回的 WorkspaceId</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>文件 ID。来源：CreateFile / ListFiles 接口返回的 FileId。与 FilePath 二选一</p> 
     * @return FileId <p>文件 ID。来源：CreateFile / ListFiles 接口返回的 FileId。与 FilePath 二选一</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>文件 ID。来源：CreateFile / ListFiles 接口返回的 FileId。与 FilePath 二选一</p>
     * @param FileId <p>文件 ID。来源：CreateFile / ListFiles 接口返回的 FileId。与 FilePath 二选一</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>文件类型。取值：FILE（普通文件/脚本）、NOTEBOOK_FILE（Notebook）、SQL_FILE（SQL文件）。对应 common/domain/entity.proto EntityType</p> 
     * @return FileType <p>文件类型。取值：FILE（普通文件/脚本）、NOTEBOOK_FILE（Notebook）、SQL_FILE（SQL文件）。对应 common/domain/entity.proto EntityType</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文件类型。取值：FILE（普通文件/脚本）、NOTEBOOK_FILE（Notebook）、SQL_FILE（SQL文件）。对应 common/domain/entity.proto EntityType</p>
     * @param FileType <p>文件类型。取值：FILE（普通文件/脚本）、NOTEBOOK_FILE（Notebook）、SQL_FILE（SQL文件）。对应 common/domain/entity.proto EntityType</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>是否返回文件内容。true 时 Storage.Content 返回 base64 内容，默认 false</p> 
     * @return IncludeContent <p>是否返回文件内容。true 时 Storage.Content 返回 base64 内容，默认 false</p>
     */
    public Boolean getIncludeContent() {
        return this.IncludeContent;
    }

    /**
     * Set <p>是否返回文件内容。true 时 Storage.Content 返回 base64 内容，默认 false</p>
     * @param IncludeContent <p>是否返回文件内容。true 时 Storage.Content 返回 base64 内容，默认 false</p>
     */
    public void setIncludeContent(Boolean IncludeContent) {
        this.IncludeContent = IncludeContent;
    }

    /**
     * Get <p>文件版本 ID。来源：ListFileVersions 接口返回的 VersionId。不传则读取最新版本</p> 
     * @return VersionId <p>文件版本 ID。来源：ListFileVersions 接口返回的 VersionId。不传则读取最新版本</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>文件版本 ID。来源：ListFileVersions 接口返回的 VersionId。不传则读取最新版本</p>
     * @param VersionId <p>文件版本 ID。来源：ListFileVersions 接口返回的 VersionId。不传则读取最新版本</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>文件完整路径，以 / 开头，如 /etl/daily/demo.ipynb。与 FileId 二选一</p> 
     * @return FilePath <p>文件完整路径，以 / 开头，如 /etl/daily/demo.ipynb。与 FileId 二选一</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>文件完整路径，以 / 开头，如 /etl/daily/demo.ipynb。与 FileId 二选一</p>
     * @param FilePath <p>文件完整路径，以 / 开头，如 /etl/daily/demo.ipynb。与 FileId 二选一</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    public GetFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFileRequest(GetFileRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.IncludeContent != null) {
            this.IncludeContent = new Boolean(source.IncludeContent);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "IncludeContent", this.IncludeContent);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);

    }
}

