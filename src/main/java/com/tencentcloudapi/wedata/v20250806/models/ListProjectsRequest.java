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

public class ListProjectsRequest extends AbstractModel {

    /**
    * 项目id列表
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * 项目名或项目唯一标识名，支持模糊搜索
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目状态，可选值：0（禁用）、1（正常）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 项目模式，可选值：SIMPLE、STANDARD
    */
    @SerializedName("ProjectModel")
    @Expose
    private String ProjectModel;

    /**
    * 请求的数据页数，用于翻页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页显示的条数，默认为 10 条
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 项目id列表 
     * @return ProjectIds 项目id列表
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目id列表
     * @param ProjectIds 项目id列表
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 项目名或项目唯一标识名，支持模糊搜索 
     * @return ProjectName 项目名或项目唯一标识名，支持模糊搜索
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名或项目唯一标识名，支持模糊搜索
     * @param ProjectName 项目名或项目唯一标识名，支持模糊搜索
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目状态，可选值：0（禁用）、1（正常） 
     * @return Status 项目状态，可选值：0（禁用）、1（正常）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 项目状态，可选值：0（禁用）、1（正常）
     * @param Status 项目状态，可选值：0（禁用）、1（正常）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 项目模式，可选值：SIMPLE、STANDARD 
     * @return ProjectModel 项目模式，可选值：SIMPLE、STANDARD
     */
    public String getProjectModel() {
        return this.ProjectModel;
    }

    /**
     * Set 项目模式，可选值：SIMPLE、STANDARD
     * @param ProjectModel 项目模式，可选值：SIMPLE、STANDARD
     */
    public void setProjectModel(String ProjectModel) {
        this.ProjectModel = ProjectModel;
    }

    /**
     * Get 请求的数据页数，用于翻页 
     * @return PageNumber 请求的数据页数，用于翻页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 请求的数据页数，用于翻页
     * @param PageNumber 请求的数据页数，用于翻页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页显示的条数，默认为 10 条 
     * @return PageSize 每页显示的条数，默认为 10 条
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示的条数，默认为 10 条
     * @param PageSize 每页显示的条数，默认为 10 条
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListProjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListProjectsRequest(ListProjectsRequest source) {
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProjectModel != null) {
            this.ProjectModel = new String(source.ProjectModel);
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
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProjectModel", this.ProjectModel);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

