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

public class GetCodeFileRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 代码文件ID，参数值来自CreateCodeFile接口的返回
    */
    @SerializedName("CodeFileId")
    @Expose
    private String CodeFileId;

    /**
    * true：返回文件内容+配置，false：不返回文件内容，只返回配置信息；默认为false
    */
    @SerializedName("IncludeContent")
    @Expose
    private Boolean IncludeContent;

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
     * Get 代码文件ID，参数值来自CreateCodeFile接口的返回 
     * @return CodeFileId 代码文件ID，参数值来自CreateCodeFile接口的返回
     */
    public String getCodeFileId() {
        return this.CodeFileId;
    }

    /**
     * Set 代码文件ID，参数值来自CreateCodeFile接口的返回
     * @param CodeFileId 代码文件ID，参数值来自CreateCodeFile接口的返回
     */
    public void setCodeFileId(String CodeFileId) {
        this.CodeFileId = CodeFileId;
    }

    /**
     * Get true：返回文件内容+配置，false：不返回文件内容，只返回配置信息；默认为false 
     * @return IncludeContent true：返回文件内容+配置，false：不返回文件内容，只返回配置信息；默认为false
     */
    public Boolean getIncludeContent() {
        return this.IncludeContent;
    }

    /**
     * Set true：返回文件内容+配置，false：不返回文件内容，只返回配置信息；默认为false
     * @param IncludeContent true：返回文件内容+配置，false：不返回文件内容，只返回配置信息；默认为false
     */
    public void setIncludeContent(Boolean IncludeContent) {
        this.IncludeContent = IncludeContent;
    }

    public GetCodeFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCodeFileRequest(GetCodeFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CodeFileId != null) {
            this.CodeFileId = new String(source.CodeFileId);
        }
        if (source.IncludeContent != null) {
            this.IncludeContent = new Boolean(source.IncludeContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CodeFileId", this.CodeFileId);
        this.setParamSimple(map, prefix + "IncludeContent", this.IncludeContent);

    }
}

