/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DescribeCodeTemplateDetailRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 模版Id
    */
    @SerializedName("CodeTemplateId")
    @Expose
    private String CodeTemplateId;

    /**
    * 是否需要返回脚本内容，默认false。
    */
    @SerializedName("NeedReturnScriptContent")
    @Expose
    private Boolean NeedReturnScriptContent;

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
     * Get 模版Id 
     * @return CodeTemplateId 模版Id
     */
    public String getCodeTemplateId() {
        return this.CodeTemplateId;
    }

    /**
     * Set 模版Id
     * @param CodeTemplateId 模版Id
     */
    public void setCodeTemplateId(String CodeTemplateId) {
        this.CodeTemplateId = CodeTemplateId;
    }

    /**
     * Get 是否需要返回脚本内容，默认false。 
     * @return NeedReturnScriptContent 是否需要返回脚本内容，默认false。
     */
    public Boolean getNeedReturnScriptContent() {
        return this.NeedReturnScriptContent;
    }

    /**
     * Set 是否需要返回脚本内容，默认false。
     * @param NeedReturnScriptContent 是否需要返回脚本内容，默认false。
     */
    public void setNeedReturnScriptContent(Boolean NeedReturnScriptContent) {
        this.NeedReturnScriptContent = NeedReturnScriptContent;
    }

    public DescribeCodeTemplateDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCodeTemplateDetailRequest(DescribeCodeTemplateDetailRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CodeTemplateId != null) {
            this.CodeTemplateId = new String(source.CodeTemplateId);
        }
        if (source.NeedReturnScriptContent != null) {
            this.NeedReturnScriptContent = new Boolean(source.NeedReturnScriptContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CodeTemplateId", this.CodeTemplateId);
        this.setParamSimple(map, prefix + "NeedReturnScriptContent", this.NeedReturnScriptContent);

    }
}

