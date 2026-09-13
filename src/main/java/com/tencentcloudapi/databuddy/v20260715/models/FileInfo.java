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

public class FileInfo extends AbstractModel {

    /**
    * <p>主账号 AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>工作空间 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>文件 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>文件名，含后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件类型。取值：FILE（普通文件/脚本）、NOTEBOOK_FILE（Notebook）、SQL_FILE（SQL文件）。对应 common/domain/entity.proto EntityType</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>文件在工作空间中的完整路径，以 / 开头，如 /etl/daily/demo.ipynb</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>文件运行配置</p>
    */
    @SerializedName("FileConfig")
    @Expose
    private FileConfig FileConfig;

    /**
    * <p>绑定的 BundleId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>绑定的 BundleInfo，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * <p>文件状态。active=正常，deleted=已删除</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>文件负责人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserName")
    @Expose
    private String OwnerUserName;

    /**
    * <p>创建人子账号 Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>最近更新人子账号 Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * <p>创建时间，毫秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近更新时间，毫秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>文件存储信息。仅当请求 IncludeContent=true 时返回内容</p>
    */
    @SerializedName("Storage")
    @Expose
    private FileStorage Storage;

    /**
    * <p>当前调用方对该文件的权限点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permissions")
    @Expose
    private String Permissions;

    /**
    * <p>是否已发布</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private Boolean ReleaseStatus;

    /**
    * <p>资源模式。1=分布式，2=单节点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceMode")
    @Expose
    private Long ResourceMode;

    /**
    * ZIP 异步创建时透传 Workspace 作业信息；普通同步创建或其他复用该返回结构的接口不设置该字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsyncOperation")
    @Expose
    private AsyncOperation AsyncOperation;

    /**
     * Get <p>主账号 AppId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>主账号 AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>主账号 AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>主账号 AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>工作空间 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceId <p>工作空间 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceId <p>工作空间 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>文件 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileId <p>文件 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>文件 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId <p>文件 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>文件名，含后缀</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName <p>文件名，含后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名，含后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName <p>文件名，含后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件类型。取值：FILE（普通文件/脚本）、NOTEBOOK_FILE（Notebook）、SQL_FILE（SQL文件）。对应 common/domain/entity.proto EntityType</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileType <p>文件类型。取值：FILE（普通文件/脚本）、NOTEBOOK_FILE（Notebook）、SQL_FILE（SQL文件）。对应 common/domain/entity.proto EntityType</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>文件类型。取值：FILE（普通文件/脚本）、NOTEBOOK_FILE（Notebook）、SQL_FILE（SQL文件）。对应 common/domain/entity.proto EntityType</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType <p>文件类型。取值：FILE（普通文件/脚本）、NOTEBOOK_FILE（Notebook）、SQL_FILE（SQL文件）。对应 common/domain/entity.proto EntityType</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>文件在工作空间中的完整路径，以 / 开头，如 /etl/daily/demo.ipynb</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path <p>文件在工作空间中的完整路径，以 / 开头，如 /etl/daily/demo.ipynb</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>文件在工作空间中的完整路径，以 / 开头，如 /etl/daily/demo.ipynb</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path <p>文件在工作空间中的完整路径，以 / 开头，如 /etl/daily/demo.ipynb</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>文件运行配置</p> 
     * @return FileConfig <p>文件运行配置</p>
     */
    public FileConfig getFileConfig() {
        return this.FileConfig;
    }

    /**
     * Set <p>文件运行配置</p>
     * @param FileConfig <p>文件运行配置</p>
     */
    public void setFileConfig(FileConfig FileConfig) {
        this.FileConfig = FileConfig;
    }

    /**
     * Get <p>绑定的 BundleId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId <p>绑定的 BundleId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>绑定的 BundleId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId <p>绑定的 BundleId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>绑定的 BundleInfo，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleInfo <p>绑定的 BundleInfo，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set <p>绑定的 BundleInfo，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleInfo <p>绑定的 BundleInfo，JSON 字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get <p>文件状态。active=正常，deleted=已删除</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>文件状态。active=正常，deleted=已删除</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>文件状态。active=正常，deleted=已删除</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>文件状态。active=正常，deleted=已删除</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>文件负责人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserName <p>文件负责人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUserName() {
        return this.OwnerUserName;
    }

    /**
     * Set <p>文件负责人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserName <p>文件负责人用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserName(String OwnerUserName) {
        this.OwnerUserName = OwnerUserName;
    }

    /**
     * Get <p>创建人子账号 Uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin <p>创建人子账号 Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>创建人子账号 Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin <p>创建人子账号 Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>最近更新人子账号 Uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserUin <p>最近更新人子账号 Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set <p>最近更新人子账号 Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserUin <p>最近更新人子账号 Uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get <p>创建时间，毫秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间，毫秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，毫秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间，毫秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近更新时间，毫秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>最近更新时间，毫秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最近更新时间，毫秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>最近更新时间，毫秒级时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>文件存储信息。仅当请求 IncludeContent=true 时返回内容</p> 
     * @return Storage <p>文件存储信息。仅当请求 IncludeContent=true 时返回内容</p>
     */
    public FileStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>文件存储信息。仅当请求 IncludeContent=true 时返回内容</p>
     * @param Storage <p>文件存储信息。仅当请求 IncludeContent=true 时返回内容</p>
     */
    public void setStorage(FileStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>当前调用方对该文件的权限点列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permissions <p>当前调用方对该文件的权限点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPermissions() {
        return this.Permissions;
    }

    /**
     * Set <p>当前调用方对该文件的权限点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permissions <p>当前调用方对该文件的权限点列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissions(String Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get <p>是否已发布</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseStatus <p>是否已发布</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set <p>是否已发布</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseStatus <p>是否已发布</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseStatus(Boolean ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    /**
     * Get <p>资源模式。1=分布式，2=单节点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceMode <p>资源模式。1=分布式，2=单节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceMode() {
        return this.ResourceMode;
    }

    /**
     * Set <p>资源模式。1=分布式，2=单节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceMode <p>资源模式。1=分布式，2=单节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceMode(Long ResourceMode) {
        this.ResourceMode = ResourceMode;
    }

    /**
     * Get ZIP 异步创建时透传 Workspace 作业信息；普通同步创建或其他复用该返回结构的接口不设置该字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsyncOperation ZIP 异步创建时透传 Workspace 作业信息；普通同步创建或其他复用该返回结构的接口不设置该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsyncOperation getAsyncOperation() {
        return this.AsyncOperation;
    }

    /**
     * Set ZIP 异步创建时透传 Workspace 作业信息；普通同步创建或其他复用该返回结构的接口不设置该字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsyncOperation ZIP 异步创建时透传 Workspace 作业信息；普通同步创建或其他复用该返回结构的接口不设置该字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsyncOperation(AsyncOperation AsyncOperation) {
        this.AsyncOperation = AsyncOperation;
    }

    public FileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfo(FileInfo source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.FileConfig != null) {
            this.FileConfig = new FileConfig(source.FileConfig);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OwnerUserName != null) {
            this.OwnerUserName = new String(source.OwnerUserName);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Storage != null) {
            this.Storage = new FileStorage(source.Storage);
        }
        if (source.Permissions != null) {
            this.Permissions = new String(source.Permissions);
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new Boolean(source.ReleaseStatus);
        }
        if (source.ResourceMode != null) {
            this.ResourceMode = new Long(source.ResourceMode);
        }
        if (source.AsyncOperation != null) {
            this.AsyncOperation = new AsyncOperation(source.AsyncOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "FileConfig.", this.FileConfig);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerUserName", this.OwnerUserName);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamSimple(map, prefix + "Permissions", this.Permissions);
        this.setParamSimple(map, prefix + "ReleaseStatus", this.ReleaseStatus);
        this.setParamSimple(map, prefix + "ResourceMode", this.ResourceMode);
        this.setParamObj(map, prefix + "AsyncOperation.", this.AsyncOperation);

    }
}

