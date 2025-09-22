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

public class CreateCodeFileRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 代码文件名称
    */
    @SerializedName("CodeFileName")
    @Expose
    private String CodeFileName;

    /**
    * 父文件夹path，例如/aaa/bbb/ccc，路径头需带斜杠，根目录传/
    */
    @SerializedName("ParentFolderPath")
    @Expose
    private String ParentFolderPath;

    /**
    * 代码文件配置
    */
    @SerializedName("CodeFileConfig")
    @Expose
    private CodeFileConfig CodeFileConfig;

    /**
    * 代码文件内容
    */
    @SerializedName("CodeFileContent")
    @Expose
    private String CodeFileContent;

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
     * Get 代码文件名称 
     * @return CodeFileName 代码文件名称
     */
    public String getCodeFileName() {
        return this.CodeFileName;
    }

    /**
     * Set 代码文件名称
     * @param CodeFileName 代码文件名称
     */
    public void setCodeFileName(String CodeFileName) {
        this.CodeFileName = CodeFileName;
    }

    /**
     * Get 父文件夹path，例如/aaa/bbb/ccc，路径头需带斜杠，根目录传/ 
     * @return ParentFolderPath 父文件夹path，例如/aaa/bbb/ccc，路径头需带斜杠，根目录传/
     */
    public String getParentFolderPath() {
        return this.ParentFolderPath;
    }

    /**
     * Set 父文件夹path，例如/aaa/bbb/ccc，路径头需带斜杠，根目录传/
     * @param ParentFolderPath 父文件夹path，例如/aaa/bbb/ccc，路径头需带斜杠，根目录传/
     */
    public void setParentFolderPath(String ParentFolderPath) {
        this.ParentFolderPath = ParentFolderPath;
    }

    /**
     * Get 代码文件配置 
     * @return CodeFileConfig 代码文件配置
     */
    public CodeFileConfig getCodeFileConfig() {
        return this.CodeFileConfig;
    }

    /**
     * Set 代码文件配置
     * @param CodeFileConfig 代码文件配置
     */
    public void setCodeFileConfig(CodeFileConfig CodeFileConfig) {
        this.CodeFileConfig = CodeFileConfig;
    }

    /**
     * Get 代码文件内容 
     * @return CodeFileContent 代码文件内容
     */
    public String getCodeFileContent() {
        return this.CodeFileContent;
    }

    /**
     * Set 代码文件内容
     * @param CodeFileContent 代码文件内容
     */
    public void setCodeFileContent(String CodeFileContent) {
        this.CodeFileContent = CodeFileContent;
    }

    public CreateCodeFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCodeFileRequest(CreateCodeFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CodeFileName != null) {
            this.CodeFileName = new String(source.CodeFileName);
        }
        if (source.ParentFolderPath != null) {
            this.ParentFolderPath = new String(source.ParentFolderPath);
        }
        if (source.CodeFileConfig != null) {
            this.CodeFileConfig = new CodeFileConfig(source.CodeFileConfig);
        }
        if (source.CodeFileContent != null) {
            this.CodeFileContent = new String(source.CodeFileContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CodeFileName", this.CodeFileName);
        this.setParamSimple(map, prefix + "ParentFolderPath", this.ParentFolderPath);
        this.setParamObj(map, prefix + "CodeFileConfig.", this.CodeFileConfig);
        this.setParamSimple(map, prefix + "CodeFileContent", this.CodeFileContent);

    }
}

