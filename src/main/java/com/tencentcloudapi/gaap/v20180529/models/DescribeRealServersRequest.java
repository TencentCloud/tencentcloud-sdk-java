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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealServersRequest extends AbstractModel{

    /**
    * 查询源站的所属项目ID，-1表示所有项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 需要查询的源站IP或域名，支持模糊匹配
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * 偏移量，默认值是0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20个，最大值为50个
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，源站会被拉取出来。
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * 过滤条件。filter的name取值(RealServerName,RealServerIP)
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 查询源站的所属项目ID，-1表示所有项目 
     * @return ProjectId 查询源站的所属项目ID，-1表示所有项目
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 查询源站的所属项目ID，-1表示所有项目
     * @param ProjectId 查询源站的所属项目ID，-1表示所有项目
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 需要查询的源站IP或域名，支持模糊匹配 
     * @return SearchValue 需要查询的源站IP或域名，支持模糊匹配
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 需要查询的源站IP或域名，支持模糊匹配
     * @param SearchValue 需要查询的源站IP或域名，支持模糊匹配
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get 偏移量，默认值是0 
     * @return Offset 偏移量，默认值是0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值是0
     * @param Offset 偏移量，默认值是0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20个，最大值为50个 
     * @return Limit 返回数量，默认为20个，最大值为50个
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20个，最大值为50个
     * @param Limit 返回数量，默认为20个，最大值为50个
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，源站会被拉取出来。 
     * @return TagSet 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，源站会被拉取出来。
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，源站会被拉取出来。
     * @param TagSet 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，源站会被拉取出来。
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 过滤条件。filter的name取值(RealServerName,RealServerIP) 
     * @return Filters 过滤条件。filter的name取值(RealServerName,RealServerIP)
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。filter的name取值(RealServerName,RealServerIP)
     * @param Filters 过滤条件。filter的name取值(RealServerName,RealServerIP)
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

