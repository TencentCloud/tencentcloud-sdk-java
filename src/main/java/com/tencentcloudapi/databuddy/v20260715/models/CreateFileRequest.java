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

public class CreateFileRequest extends AbstractModel {

    /**
    * <p>工作空间 ID。来源：ListWorkspaces 接口返回的 WorkspaceId</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>文件名，含后缀，最长 255 字节。不能以 . 或 .. 开头/结尾，不能含空格与控制字符</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>父文件夹路径，以 / 开头、末尾不带 /，根目录传 /。来源：ListFiles 接口返回的 Path</p>
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * <p>文件类型。取值：FILE（普通文件/脚本）、NOTEBOOK_FILE（Notebook）、SQL_FILE（SQL文件）。对应 common/domain/entity.proto EntityType</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>文件运行配置</p>
    */
    @SerializedName("FileConfig")
    @Expose
    private FileConfig FileConfig;

    /**
    * <p>绑定的 BundleId。来源：ListBundles 接口返回的 BundleId</p>
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * <p>绑定的 BundleInfo，JSON 字符串</p>
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
    * <p>文件初始内容。不传则按FileType 生成默认内容</p>
    */
    @SerializedName("Storage")
    @Expose
    private FileStorage Storage;

    /**
    * 是否将 Storage 中的 ZIP 文件异步解压创建，默认 false。true 时异步作业由 Workspace 负责全生命周期，响应仅通过 AsyncOperation 返回作业信息（FileId 为空）；作业进度查询由基础平台 WS 接口实现，不在本协议中定义。
    */
    @SerializedName("ExtractArchive")
    @Expose
    private Boolean ExtractArchive;

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
     * Get <p>文件名，含后缀，最长 255 字节。不能以 . 或 .. 开头/结尾，不能含空格与控制字符</p> 
     * @return FileName <p>文件名，含后缀，最长 255 字节。不能以 . 或 .. 开头/结尾，不能含空格与控制字符</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名，含后缀，最长 255 字节。不能以 . 或 .. 开头/结尾，不能含空格与控制字符</p>
     * @param FileName <p>文件名，含后缀，最长 255 字节。不能以 . 或 .. 开头/结尾，不能含空格与控制字符</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>父文件夹路径，以 / 开头、末尾不带 /，根目录传 /。来源：ListFiles 接口返回的 Path</p> 
     * @return ParentFolderPath <p>父文件夹路径，以 / 开头、末尾不带 /，根目录传 /。来源：ListFiles 接口返回的 Path</p>
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set <p>父文件夹路径，以 / 开头、末尾不带 /，根目录传 /。来源：ListFiles 接口返回的 Path</p>
     * @param ParentFolderPath <p>父文件夹路径，以 / 开头、末尾不带 /，根目录传 /。来源：ListFiles 接口返回的 Path</p>
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
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
     * Get <p>绑定的 BundleId。来源：ListBundles 接口返回的 BundleId</p> 
     * @return BundleId <p>绑定的 BundleId。来源：ListBundles 接口返回的 BundleId</p>
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set <p>绑定的 BundleId。来源：ListBundles 接口返回的 BundleId</p>
     * @param BundleId <p>绑定的 BundleId。来源：ListBundles 接口返回的 BundleId</p>
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get <p>绑定的 BundleInfo，JSON 字符串</p> 
     * @return BundleInfo <p>绑定的 BundleInfo，JSON 字符串</p>
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set <p>绑定的 BundleInfo，JSON 字符串</p>
     * @param BundleInfo <p>绑定的 BundleInfo，JSON 字符串</p>
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    /**
     * Get <p>文件初始内容。不传则按FileType 生成默认内容</p> 
     * @return Storage <p>文件初始内容。不传则按FileType 生成默认内容</p>
     */
    public FileStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>文件初始内容。不传则按FileType 生成默认内容</p>
     * @param Storage <p>文件初始内容。不传则按FileType 生成默认内容</p>
     */
    public void setStorage(FileStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 是否将 Storage 中的 ZIP 文件异步解压创建，默认 false。true 时异步作业由 Workspace 负责全生命周期，响应仅通过 AsyncOperation 返回作业信息（FileId 为空）；作业进度查询由基础平台 WS 接口实现，不在本协议中定义。 
     * @return ExtractArchive 是否将 Storage 中的 ZIP 文件异步解压创建，默认 false。true 时异步作业由 Workspace 负责全生命周期，响应仅通过 AsyncOperation 返回作业信息（FileId 为空）；作业进度查询由基础平台 WS 接口实现，不在本协议中定义。
     */
    public Boolean getExtractArchive() {
        return this.ExtractArchive;
    }

    /**
     * Set 是否将 Storage 中的 ZIP 文件异步解压创建，默认 false。true 时异步作业由 Workspace 负责全生命周期，响应仅通过 AsyncOperation 返回作业信息（FileId 为空）；作业进度查询由基础平台 WS 接口实现，不在本协议中定义。
     * @param ExtractArchive 是否将 Storage 中的 ZIP 文件异步解压创建，默认 false。true 时异步作业由 Workspace 负责全生命周期，响应仅通过 AsyncOperation 返回作业信息（FileId 为空）；作业进度查询由基础平台 WS 接口实现，不在本协议中定义。
     */
    public void setExtractArchive(Boolean ExtractArchive) {
        this.ExtractArchive = ExtractArchive;
    }

    public CreateFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileRequest(CreateFileRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
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
        if (source.Storage != null) {
            this.Storage = new FileStorage(source.Storage);
        }
        if (source.ExtractArchive != null) {
            this.ExtractArchive = new Boolean(source.ExtractArchive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamObj(map, prefix + "FileConfig.", this.FileConfig);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamSimple(map, prefix + "ExtractArchive", this.ExtractArchive);

    }
}

