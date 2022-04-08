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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetResourcesRequest extends AbstractModel{

    /**
    * 资源六段式列表。腾讯云使用资源六段式描述一个资源。
例如：ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}。
如果传入了此参数会返回所有匹配的资源列表，指定的MaxResults会失效。
N取值范围：0~9
    */
    @SerializedName("ResourceList")
    @Expose
    private String [] ResourceList;

    /**
    * 标签键和标签值。
指定多个标签，会查询同时绑定了该多个标签的资源。
N取值范围：0~5。
每个TagFilters中的TagValue最多支持10个
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
    */
    @SerializedName("PaginationToken")
    @Expose
    private String PaginationToken;

    /**
    * 每一页返回的数据最大条数，最大200。
缺省值：50。
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
     * Get 资源六段式列表。腾讯云使用资源六段式描述一个资源。
例如：ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}。
如果传入了此参数会返回所有匹配的资源列表，指定的MaxResults会失效。
N取值范围：0~9 
     * @return ResourceList 资源六段式列表。腾讯云使用资源六段式描述一个资源。
例如：ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}。
如果传入了此参数会返回所有匹配的资源列表，指定的MaxResults会失效。
N取值范围：0~9
     */
    public String [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set 资源六段式列表。腾讯云使用资源六段式描述一个资源。
例如：ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}。
如果传入了此参数会返回所有匹配的资源列表，指定的MaxResults会失效。
N取值范围：0~9
     * @param ResourceList 资源六段式列表。腾讯云使用资源六段式描述一个资源。
例如：ResourceList.1 = qcs::${ServiceType}:${Region}:${Account}:${ResourcePreifx}/${ResourceId}。
如果传入了此参数会返回所有匹配的资源列表，指定的MaxResults会失效。
N取值范围：0~9
     */
    public void setResourceList(String [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    /**
     * Get 标签键和标签值。
指定多个标签，会查询同时绑定了该多个标签的资源。
N取值范围：0~5。
每个TagFilters中的TagValue最多支持10个 
     * @return TagFilters 标签键和标签值。
指定多个标签，会查询同时绑定了该多个标签的资源。
N取值范围：0~5。
每个TagFilters中的TagValue最多支持10个
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签键和标签值。
指定多个标签，会查询同时绑定了该多个标签的资源。
N取值范围：0~5。
每个TagFilters中的TagValue最多支持10个
     * @param TagFilters 标签键和标签值。
指定多个标签，会查询同时绑定了该多个标签的资源。
N取值范围：0~5。
每个TagFilters中的TagValue最多支持10个
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。 
     * @return PaginationToken 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
     */
    public String getPaginationToken() {
        return this.PaginationToken;
    }

    /**
     * Set 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
     * @param PaginationToken 从上一页的响应中获取的下一页的Token值。
如果是第一次请求，设置为空。
     */
    public void setPaginationToken(String PaginationToken) {
        this.PaginationToken = PaginationToken;
    }

    /**
     * Get 每一页返回的数据最大条数，最大200。
缺省值：50。 
     * @return MaxResults 每一页返回的数据最大条数，最大200。
缺省值：50。
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 每一页返回的数据最大条数，最大200。
缺省值：50。
     * @param MaxResults 每一页返回的数据最大条数，最大200。
缺省值：50。
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    public GetResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetResourcesRequest(GetResourcesRequest source) {
        if (source.ResourceList != null) {
            this.ResourceList = new String[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new String(source.ResourceList[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.PaginationToken != null) {
            this.PaginationToken = new String(source.PaginationToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ResourceList.", this.ResourceList);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "PaginationToken", this.PaginationToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);

    }
}

