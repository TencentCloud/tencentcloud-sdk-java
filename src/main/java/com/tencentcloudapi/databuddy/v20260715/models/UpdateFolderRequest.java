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

public class UpdateFolderRequest extends AbstractModel {

    /**
    * <p>工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>待更新文件夹</p>
    */
    @SerializedName("Folder")
    @Expose
    private FolderLocator Folder;

    /**
    * <p>操作类型</p><p>枚举值：</p><ul><li>1： 重命名</li><li>2： 移动</li></ul>
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * <p>重命名后的文件名，OperationType = 1时生效</p>
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * <p>移动的目的文件夹，OperationType = 2时生效</p>
    */
    @SerializedName("TargetParent")
    @Expose
    private FolderLocator TargetParent;

    /**
     * Get <p>工作空间ID</p> 
     * @return WorkspaceId <p>工作空间ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID</p>
     * @param WorkspaceId <p>工作空间ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>待更新文件夹</p> 
     * @return Folder <p>待更新文件夹</p>
     */
    public FolderLocator getFolder() {
        return this.Folder;
    }

    /**
     * Set <p>待更新文件夹</p>
     * @param Folder <p>待更新文件夹</p>
     */
    public void setFolder(FolderLocator Folder) {
        this.Folder = Folder;
    }

    /**
     * Get <p>操作类型</p><p>枚举值：</p><ul><li>1： 重命名</li><li>2： 移动</li></ul> 
     * @return OperationType <p>操作类型</p><p>枚举值：</p><ul><li>1： 重命名</li><li>2： 移动</li></ul>
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set <p>操作类型</p><p>枚举值：</p><ul><li>1： 重命名</li><li>2： 移动</li></ul>
     * @param OperationType <p>操作类型</p><p>枚举值：</p><ul><li>1： 重命名</li><li>2： 移动</li></ul>
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get <p>重命名后的文件名，OperationType = 1时生效</p> 
     * @return FolderName <p>重命名后的文件名，OperationType = 1时生效</p>
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set <p>重命名后的文件名，OperationType = 1时生效</p>
     * @param FolderName <p>重命名后的文件名，OperationType = 1时生效</p>
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get <p>移动的目的文件夹，OperationType = 2时生效</p> 
     * @return TargetParent <p>移动的目的文件夹，OperationType = 2时生效</p>
     */
    public FolderLocator getTargetParent() {
        return this.TargetParent;
    }

    /**
     * Set <p>移动的目的文件夹，OperationType = 2时生效</p>
     * @param TargetParent <p>移动的目的文件夹，OperationType = 2时生效</p>
     */
    public void setTargetParent(FolderLocator TargetParent) {
        this.TargetParent = TargetParent;
    }

    public UpdateFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFolderRequest(UpdateFolderRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Folder != null) {
            this.Folder = new FolderLocator(source.Folder);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.TargetParent != null) {
            this.TargetParent = new FolderLocator(source.TargetParent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamObj(map, prefix + "Folder.", this.Folder);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamObj(map, prefix + "TargetParent.", this.TargetParent);

    }
}

