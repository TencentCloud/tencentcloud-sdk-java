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

public class DescribeProxyGroupListRequest extends AbstractModel{

    /**
    * 偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认值为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 项目ID。取值范围：
-1，该用户下所有项目
0，默认项目
其他值，指定的项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，该通道组会被拉取出来。
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * 过滤条件。   
每次请求的Filter.Values的上限为5。
RealServerRegion - String - 是否必填：否 -（过滤条件）按照源站地域过滤，可参考DescribeDestRegions接口返回结果中的RegionId。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 偏移量，默认值为0。 
     * @return Offset 偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为0。
     * @param Offset 偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认值为20，最大值为100。 
     * @return Limit 返回数量，默认值为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认值为20，最大值为100。
     * @param Limit 返回数量，默认值为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 项目ID。取值范围：
-1，该用户下所有项目
0，默认项目
其他值，指定的项目 
     * @return ProjectId 项目ID。取值范围：
-1，该用户下所有项目
0，默认项目
其他值，指定的项目
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。取值范围：
-1，该用户下所有项目
0，默认项目
其他值，指定的项目
     * @param ProjectId 项目ID。取值范围：
-1，该用户下所有项目
0，默认项目
其他值，指定的项目
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，该通道组会被拉取出来。 
     * @return TagSet 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，该通道组会被拉取出来。
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，该通道组会被拉取出来。
     * @param TagSet 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，该通道组会被拉取出来。
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 过滤条件。   
每次请求的Filter.Values的上限为5。
RealServerRegion - String - 是否必填：否 -（过滤条件）按照源站地域过滤，可参考DescribeDestRegions接口返回结果中的RegionId。 
     * @return Filters 过滤条件。   
每次请求的Filter.Values的上限为5。
RealServerRegion - String - 是否必填：否 -（过滤条件）按照源站地域过滤，可参考DescribeDestRegions接口返回结果中的RegionId。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。   
每次请求的Filter.Values的上限为5。
RealServerRegion - String - 是否必填：否 -（过滤条件）按照源站地域过滤，可参考DescribeDestRegions接口返回结果中的RegionId。
     * @param Filters 过滤条件。   
每次请求的Filter.Values的上限为5。
RealServerRegion - String - 是否必填：否 -（过滤条件）按照源站地域过滤，可参考DescribeDestRegions接口返回结果中的RegionId。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

