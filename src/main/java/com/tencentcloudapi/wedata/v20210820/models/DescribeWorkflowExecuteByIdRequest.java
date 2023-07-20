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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWorkflowExecuteByIdRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流ID
    */
    @SerializedName("WorkFlowIdList")
    @Expose
    private String WorkFlowIdList;

    /**
    * 分页大小
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页索引
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
     * Get 工作流ID 
     * @return WorkFlowIdList 工作流ID
     */
    public String getWorkFlowIdList() {
        return this.WorkFlowIdList;
    }

    /**
     * Set 工作流ID
     * @param WorkFlowIdList 工作流ID
     */
    public void setWorkFlowIdList(String WorkFlowIdList) {
        this.WorkFlowIdList = WorkFlowIdList;
    }

    /**
     * Get 分页大小 
     * @return PageNumber 分页大小
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页大小
     * @param PageNumber 分页大小
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页索引 
     * @return PageSize 分页索引
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页索引
     * @param PageSize 分页索引
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeWorkflowExecuteByIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWorkflowExecuteByIdRequest(DescribeWorkflowExecuteByIdRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkFlowIdList != null) {
            this.WorkFlowIdList = new String(source.WorkFlowIdList);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkFlowIdList", this.WorkFlowIdList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

