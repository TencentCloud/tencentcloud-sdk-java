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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectsRequest extends AbstractModel{

    /**
    * 页码
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 页面大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 过滤规则
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 部门范围过滤
    */
    @SerializedName("Filters")
    @Expose
    private Filters Filters;

    /**
    * 项目状态, 0:编辑中 1:运营中 2:已下线 3:已删除 4:审批中
    */
    @SerializedName("ProjectStatus")
    @Expose
    private Long ProjectStatus;

    /**
     * Get 页码 
     * @return PageNo 页码
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码
     * @param PageNo 页码
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 页面大小 
     * @return PageSize 页面大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页面大小
     * @param PageSize 页面大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 过滤规则 
     * @return SearchWord 过滤规则
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 过滤规则
     * @param SearchWord 过滤规则
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 部门范围过滤 
     * @return Filters 部门范围过滤
     */
    public Filters getFilters() {
        return this.Filters;
    }

    /**
     * Set 部门范围过滤
     * @param Filters 部门范围过滤
     */
    public void setFilters(Filters Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 项目状态, 0:编辑中 1:运营中 2:已下线 3:已删除 4:审批中 
     * @return ProjectStatus 项目状态, 0:编辑中 1:运营中 2:已下线 3:已删除 4:审批中
     */
    public Long getProjectStatus() {
        return this.ProjectStatus;
    }

    /**
     * Set 项目状态, 0:编辑中 1:运营中 2:已下线 3:已删除 4:审批中
     * @param ProjectStatus 项目状态, 0:编辑中 1:运营中 2:已下线 3:已删除 4:审批中
     */
    public void setProjectStatus(Long ProjectStatus) {
        this.ProjectStatus = ProjectStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ProjectStatus", this.ProjectStatus);

    }
}

