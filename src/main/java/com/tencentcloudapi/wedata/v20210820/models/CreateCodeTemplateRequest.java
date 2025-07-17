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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCodeTemplateRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 模版名
    */
    @SerializedName("CodeTemplateName")
    @Expose
    private String CodeTemplateName;

    /**
    * 30Python，32DLC，50 DLC-PySpark
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 模版描述
    */
    @SerializedName("CodeTemplateDesc")
    @Expose
    private String CodeTemplateDesc;

    /**
    * 文件夹ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * Base64转化的脚本内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 代码模板类型
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 模版名 
     * @return CodeTemplateName 模版名
     */
    public String getCodeTemplateName() {
        return this.CodeTemplateName;
    }

    /**
     * Set 模版名
     * @param CodeTemplateName 模版名
     */
    public void setCodeTemplateName(String CodeTemplateName) {
        this.CodeTemplateName = CodeTemplateName;
    }

    /**
     * Get 30Python，32DLC，50 DLC-PySpark 
     * @return TaskType 30Python，32DLC，50 DLC-PySpark
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 30Python，32DLC，50 DLC-PySpark
     * @param TaskType 30Python，32DLC，50 DLC-PySpark
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 模版描述 
     * @return CodeTemplateDesc 模版描述
     */
    public String getCodeTemplateDesc() {
        return this.CodeTemplateDesc;
    }

    /**
     * Set 模版描述
     * @param CodeTemplateDesc 模版描述
     */
    public void setCodeTemplateDesc(String CodeTemplateDesc) {
        this.CodeTemplateDesc = CodeTemplateDesc;
    }

    /**
     * Get 文件夹ID 
     * @return FolderId 文件夹ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹ID
     * @param FolderId 文件夹ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get Base64转化的脚本内容 
     * @return Content Base64转化的脚本内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Base64转化的脚本内容
     * @param Content Base64转化的脚本内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 代码模板类型 
     * @return ProductName 代码模板类型
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 代码模板类型
     * @param ProductName 代码模板类型
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public CreateCodeTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCodeTemplateRequest(CreateCodeTemplateRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CodeTemplateName != null) {
            this.CodeTemplateName = new String(source.CodeTemplateName);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.CodeTemplateDesc != null) {
            this.CodeTemplateDesc = new String(source.CodeTemplateDesc);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CodeTemplateName", this.CodeTemplateName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "CodeTemplateDesc", this.CodeTemplateDesc);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);

    }
}

