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

public class CreateFolderRequest extends AbstractModel {

    /**
    * <p>工作空间名称</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>文件夹名称</p>
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * <p>文件夹类型</p><p>枚举值：</p><ul><li>FOLDER： 文件夹</li><li>GIT_FOLDER： git文件夹</li></ul>
    */
    @SerializedName("FolderType")
    @Expose
    private String FolderType;

    /**
    * <p>父节点</p>
    */
    @SerializedName("ParentFolder")
    @Expose
    private FolderLocator ParentFolder;

    /**
    * <p>git配置，FolderType=GIT_FOLDER 时必填</p>
    */
    @SerializedName("GitConfig")
    @Expose
    private GitRepoConfig GitConfig;

    /**
     * Get <p>工作空间名称</p> 
     * @return WorkspaceId <p>工作空间名称</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间名称</p>
     * @param WorkspaceId <p>工作空间名称</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>文件夹名称</p> 
     * @return FolderName <p>文件夹名称</p>
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set <p>文件夹名称</p>
     * @param FolderName <p>文件夹名称</p>
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get <p>文件夹类型</p><p>枚举值：</p><ul><li>FOLDER： 文件夹</li><li>GIT_FOLDER： git文件夹</li></ul> 
     * @return FolderType <p>文件夹类型</p><p>枚举值：</p><ul><li>FOLDER： 文件夹</li><li>GIT_FOLDER： git文件夹</li></ul>
     */
    public String getFolderType() {
        return this.FolderType;
    }

    /**
     * Set <p>文件夹类型</p><p>枚举值：</p><ul><li>FOLDER： 文件夹</li><li>GIT_FOLDER： git文件夹</li></ul>
     * @param FolderType <p>文件夹类型</p><p>枚举值：</p><ul><li>FOLDER： 文件夹</li><li>GIT_FOLDER： git文件夹</li></ul>
     */
    public void setFolderType(String FolderType) {
        this.FolderType = FolderType;
    }

    /**
     * Get <p>父节点</p> 
     * @return ParentFolder <p>父节点</p>
     */
    public FolderLocator getParentFolder() {
        return this.ParentFolder;
    }

    /**
     * Set <p>父节点</p>
     * @param ParentFolder <p>父节点</p>
     */
    public void setParentFolder(FolderLocator ParentFolder) {
        this.ParentFolder = ParentFolder;
    }

    /**
     * Get <p>git配置，FolderType=GIT_FOLDER 时必填</p> 
     * @return GitConfig <p>git配置，FolderType=GIT_FOLDER 时必填</p>
     */
    public GitRepoConfig getGitConfig() {
        return this.GitConfig;
    }

    /**
     * Set <p>git配置，FolderType=GIT_FOLDER 时必填</p>
     * @param GitConfig <p>git配置，FolderType=GIT_FOLDER 时必填</p>
     */
    public void setGitConfig(GitRepoConfig GitConfig) {
        this.GitConfig = GitConfig;
    }

    public CreateFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFolderRequest(CreateFolderRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.FolderType != null) {
            this.FolderType = new String(source.FolderType);
        }
        if (source.ParentFolder != null) {
            this.ParentFolder = new FolderLocator(source.ParentFolder);
        }
        if (source.GitConfig != null) {
            this.GitConfig = new GitRepoConfig(source.GitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "FolderType", this.FolderType);
        this.setParamObj(map, prefix + "ParentFolder.", this.ParentFolder);
        this.setParamObj(map, prefix + "GitConfig.", this.GitConfig);

    }
}

