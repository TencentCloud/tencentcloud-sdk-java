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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxyGroupListRequest extends AbstractModel {

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
    * 过滤条件。   
每次请求的Filter.Values的上限为5。
RealServerRegion - String - 是否必填：否 -（过滤条件）按照源站地域过滤，可参考DescribeDestRegions接口返回结果中的RegionId。
PackageType - String - 是否必填：否 - （过滤条件）通道组类型，Thunder表示标准通道组，Accelerator表示银牌加速通道组。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 标签列表，当存在该字段时，拉取对应标签下的资源列表。
最多支持5个标签，当存在两个或两个以上的标签时，满足其中任意一个标签时，该通道组会被拉取出来。
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

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
     * Get 过滤条件。   
每次请求的Filter.Values的上限为5。
RealServerRegion - String - 是否必填：否 -（过滤条件）按照源站地域过滤，可参考DescribeDestRegions接口返回结果中的RegionId。
PackageType - String - 是否必填：否 - （过滤条件）通道组类型，Thunder表示标准通道组，Accelerator表示银牌加速通道组。 
     * @return Filters 过滤条件。   
每次请求的Filter.Values的上限为5。
RealServerRegion - String - 是否必填：否 -（过滤条件）按照源站地域过滤，可参考DescribeDestRegions接口返回结果中的RegionId。
PackageType - String - 是否必填：否 - （过滤条件）通道组类型，Thunder表示标准通道组，Accelerator表示银牌加速通道组。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。   
每次请求的Filter.Values的上限为5。
RealServerRegion - String - 是否必填：否 -（过滤条件）按照源站地域过滤，可参考DescribeDestRegions接口返回结果中的RegionId。
PackageType - String - 是否必填：否 - （过滤条件）通道组类型，Thunder表示标准通道组，Accelerator表示银牌加速通道组。
     * @param Filters 过滤条件。   
每次请求的Filter.Values的上限为5。
RealServerRegion - String - 是否必填：否 -（过滤条件）按照源站地域过滤，可参考DescribeDestRegions接口返回结果中的RegionId。
PackageType - String - 是否必填：否 - （过滤条件）通道组类型，Thunder表示标准通道组，Accelerator表示银牌加速通道组。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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

    public DescribeProxyGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyGroupListRequest(DescribeProxyGroupListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

