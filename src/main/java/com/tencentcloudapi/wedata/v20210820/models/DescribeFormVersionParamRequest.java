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

public class DescribeFormVersionParamRequest extends AbstractModel {

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
    * 脚本中的参数
    */
    @SerializedName("OriginalParams")
    @Expose
    private String [] OriginalParams;

    /**
    * 页码
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 页号
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

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
     * Get 脚本中的参数 
     * @return OriginalParams 脚本中的参数
     */
    public String [] getOriginalParams() {
        return this.OriginalParams;
    }

    /**
     * Set 脚本中的参数
     * @param OriginalParams 脚本中的参数
     */
    public void setOriginalParams(String [] OriginalParams) {
        this.OriginalParams = OriginalParams;
    }

    /**
     * Get 页码 
     * @return Page 页码
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码
     * @param Page 页码
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 页号 
     * @return Size 页号
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 页号
     * @param Size 页号
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public DescribeFormVersionParamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFormVersionParamRequest(DescribeFormVersionParamRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CodeTemplateId != null) {
            this.CodeTemplateId = new String(source.CodeTemplateId);
        }
        if (source.OriginalParams != null) {
            this.OriginalParams = new String[source.OriginalParams.length];
            for (int i = 0; i < source.OriginalParams.length; i++) {
                this.OriginalParams[i] = new String(source.OriginalParams[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CodeTemplateId", this.CodeTemplateId);
        this.setParamArraySimple(map, prefix + "OriginalParams.", this.OriginalParams);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

