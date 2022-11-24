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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationListRequest extends AbstractModel{

    /**
    * 项目ID，0表示默认项目，-1表示所有项目，如果需要查找具体项目下的应用列表，请填入具体项目ID，项目ID在项目管理中查看 https://console.cloud.tencent.com/project
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 页码ID，0表示第一页，以此后推。默认填0
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 每页展示应用数量。默认填200
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 所查找应用名称的关键字，支持模糊匹配查找。空串表示查询所有应用
    */
    @SerializedName("SearchText")
    @Expose
    private String SearchText;

    /**
    * 标签列表
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 查找过滤关键字列表
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 项目ID，0表示默认项目，-1表示所有项目，如果需要查找具体项目下的应用列表，请填入具体项目ID，项目ID在项目管理中查看 https://console.cloud.tencent.com/project 
     * @return ProjectId 项目ID，0表示默认项目，-1表示所有项目，如果需要查找具体项目下的应用列表，请填入具体项目ID，项目ID在项目管理中查看 https://console.cloud.tencent.com/project
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，0表示默认项目，-1表示所有项目，如果需要查找具体项目下的应用列表，请填入具体项目ID，项目ID在项目管理中查看 https://console.cloud.tencent.com/project
     * @param ProjectId 项目ID，0表示默认项目，-1表示所有项目，如果需要查找具体项目下的应用列表，请填入具体项目ID，项目ID在项目管理中查看 https://console.cloud.tencent.com/project
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 页码ID，0表示第一页，以此后推。默认填0 
     * @return PageNo 页码ID，0表示第一页，以此后推。默认填0
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码ID，0表示第一页，以此后推。默认填0
     * @param PageNo 页码ID，0表示第一页，以此后推。默认填0
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 每页展示应用数量。默认填200 
     * @return PageSize 每页展示应用数量。默认填200
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页展示应用数量。默认填200
     * @param PageSize 每页展示应用数量。默认填200
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 所查找应用名称的关键字，支持模糊匹配查找。空串表示查询所有应用 
     * @return SearchText 所查找应用名称的关键字，支持模糊匹配查找。空串表示查询所有应用
     */
    public String getSearchText() {
        return this.SearchText;
    }

    /**
     * Set 所查找应用名称的关键字，支持模糊匹配查找。空串表示查询所有应用
     * @param SearchText 所查找应用名称的关键字，支持模糊匹配查找。空串表示查询所有应用
     */
    public void setSearchText(String SearchText) {
        this.SearchText = SearchText;
    }

    /**
     * Get 标签列表 
     * @return TagSet 标签列表
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表
     * @param TagSet 标签列表
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 查找过滤关键字列表 
     * @return Filters 查找过滤关键字列表
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查找过滤关键字列表
     * @param Filters 查找过滤关键字列表
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeApplicationListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationListRequest(DescribeApplicationListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SearchText != null) {
            this.SearchText = new String(source.SearchText);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "SearchText", this.SearchText);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

