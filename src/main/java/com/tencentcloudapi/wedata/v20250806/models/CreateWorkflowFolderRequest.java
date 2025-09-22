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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkflowFolderRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 父文件夹绝对路径，如/abc/de，如果是根目录则传/
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * 要创建的文件夹名字
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 父文件夹绝对路径，如/abc/de，如果是根目录则传/ 
     * @return ParentFolderPath 父文件夹绝对路径，如/abc/de，如果是根目录则传/
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set 父文件夹绝对路径，如/abc/de，如果是根目录则传/
     * @param ParentFolderPath 父文件夹绝对路径，如/abc/de，如果是根目录则传/
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get 要创建的文件夹名字 
     * @return FolderName 要创建的文件夹名字
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 要创建的文件夹名字
     * @param FolderName 要创建的文件夹名字
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    public CreateWorkflowFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkflowFolderRequest(CreateWorkflowFolderRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);

    }
}

