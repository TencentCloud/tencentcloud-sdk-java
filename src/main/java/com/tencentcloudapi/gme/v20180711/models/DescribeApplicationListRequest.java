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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationListRequest extends AbstractModel {

    /**
    * <p>项目ID，0表示默认项目，-1表示所有项目，如果需要查找具体项目下的应用列表，请填入具体项目ID，项目ID在项目管理中查看 https://console.cloud.tencent.com/project</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>页码ID，0表示第一页，以此后推。默认填0</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>每页展示应用数量。默认填200</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>所查找应用名称的关键字，支持模糊匹配查找。空串表示查询所有应用</p>
    */
    @SerializedName("SearchText")
    @Expose
    private String SearchText;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * <p>查找过滤关键字列表</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>是否查询GME3.0应用</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
    */
    @SerializedName("NewVersion")
    @Expose
    private Long NewVersion;

    /**
     * Get <p>项目ID，0表示默认项目，-1表示所有项目，如果需要查找具体项目下的应用列表，请填入具体项目ID，项目ID在项目管理中查看 https://console.cloud.tencent.com/project</p> 
     * @return ProjectId <p>项目ID，0表示默认项目，-1表示所有项目，如果需要查找具体项目下的应用列表，请填入具体项目ID，项目ID在项目管理中查看 https://console.cloud.tencent.com/project</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID，0表示默认项目，-1表示所有项目，如果需要查找具体项目下的应用列表，请填入具体项目ID，项目ID在项目管理中查看 https://console.cloud.tencent.com/project</p>
     * @param ProjectId <p>项目ID，0表示默认项目，-1表示所有项目，如果需要查找具体项目下的应用列表，请填入具体项目ID，项目ID在项目管理中查看 https://console.cloud.tencent.com/project</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>页码ID，0表示第一页，以此后推。默认填0</p> 
     * @return PageNo <p>页码ID，0表示第一页，以此后推。默认填0</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>页码ID，0表示第一页，以此后推。默认填0</p>
     * @param PageNo <p>页码ID，0表示第一页，以此后推。默认填0</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>每页展示应用数量。默认填200</p> 
     * @return PageSize <p>每页展示应用数量。默认填200</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页展示应用数量。默认填200</p>
     * @param PageSize <p>每页展示应用数量。默认填200</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>所查找应用名称的关键字，支持模糊匹配查找。空串表示查询所有应用</p> 
     * @return SearchText <p>所查找应用名称的关键字，支持模糊匹配查找。空串表示查询所有应用</p>
     */
    public String getSearchText() {
        return this.SearchText;
    }

    /**
     * Set <p>所查找应用名称的关键字，支持模糊匹配查找。空串表示查询所有应用</p>
     * @param SearchText <p>所查找应用名称的关键字，支持模糊匹配查找。空串表示查询所有应用</p>
     */
    public void setSearchText(String SearchText) {
        this.SearchText = SearchText;
    }

    /**
     * Get <p>标签列表</p> 
     * @return TagSet <p>标签列表</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签列表</p>
     * @param TagSet <p>标签列表</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>查找过滤关键字列表</p> 
     * @return Filters <p>查找过滤关键字列表</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>查找过滤关键字列表</p>
     * @param Filters <p>查找过滤关键字列表</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>是否查询GME3.0应用</p><p>取值范围：[0, 1]</p><p>默认值：0</p> 
     * @return NewVersion <p>是否查询GME3.0应用</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public Long getNewVersion() {
        return this.NewVersion;
    }

    /**
     * Set <p>是否查询GME3.0应用</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     * @param NewVersion <p>是否查询GME3.0应用</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public void setNewVersion(Long NewVersion) {
        this.NewVersion = NewVersion;
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
        if (source.NewVersion != null) {
            this.NewVersion = new Long(source.NewVersion);
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
        this.setParamSimple(map, prefix + "NewVersion", this.NewVersion);

    }
}

