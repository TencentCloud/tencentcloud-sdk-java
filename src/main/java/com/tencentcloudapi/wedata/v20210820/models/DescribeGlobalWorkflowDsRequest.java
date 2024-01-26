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

public class DescribeGlobalWorkflowDsRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 分页号
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
    * 关键字，用于对工作流名称、项目名称以及责任人模糊匹配
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 需过滤的工作流 ID 列表，可以为空
    */
    @SerializedName("IgnoreWorkflowIds")
    @Expose
    private String [] IgnoreWorkflowIds;

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
     * Get 分页号 
     * @return PageNumber 分页号
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页号
     * @param PageNumber 分页号
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 关键字，用于对工作流名称、项目名称以及责任人模糊匹配 
     * @return Keyword 关键字，用于对工作流名称、项目名称以及责任人模糊匹配
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键字，用于对工作流名称、项目名称以及责任人模糊匹配
     * @param Keyword 关键字，用于对工作流名称、项目名称以及责任人模糊匹配
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 需过滤的工作流 ID 列表，可以为空 
     * @return IgnoreWorkflowIds 需过滤的工作流 ID 列表，可以为空
     */
    public String [] getIgnoreWorkflowIds() {
        return this.IgnoreWorkflowIds;
    }

    /**
     * Set 需过滤的工作流 ID 列表，可以为空
     * @param IgnoreWorkflowIds 需过滤的工作流 ID 列表，可以为空
     */
    public void setIgnoreWorkflowIds(String [] IgnoreWorkflowIds) {
        this.IgnoreWorkflowIds = IgnoreWorkflowIds;
    }

    public DescribeGlobalWorkflowDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlobalWorkflowDsRequest(DescribeGlobalWorkflowDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new String(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.IgnoreWorkflowIds != null) {
            this.IgnoreWorkflowIds = new String[source.IgnoreWorkflowIds.length];
            for (int i = 0; i < source.IgnoreWorkflowIds.length; i++) {
                this.IgnoreWorkflowIds[i] = new String(source.IgnoreWorkflowIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "IgnoreWorkflowIds.", this.IgnoreWorkflowIds);

    }
}

