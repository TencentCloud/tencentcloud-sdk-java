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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * 用集群id搜索
    */
    @SerializedName("SearchInstanceId")
    @Expose
    private String SearchInstanceId;

    /**
    * 用集群名字搜索
    */
    @SerializedName("SearchInstanceName")
    @Expose
    private String SearchInstanceName;

    /**
    * 分页参数，第一页为0，第二页为10
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数，分页步长，默认为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索标签列表
    */
    @SerializedName("SearchTags")
    @Expose
    private SearchTags [] SearchTags;

    /**
     * Get 用集群id搜索 
     * @return SearchInstanceId 用集群id搜索
     */
    public String getSearchInstanceId() {
        return this.SearchInstanceId;
    }

    /**
     * Set 用集群id搜索
     * @param SearchInstanceId 用集群id搜索
     */
    public void setSearchInstanceId(String SearchInstanceId) {
        this.SearchInstanceId = SearchInstanceId;
    }

    /**
     * Get 用集群名字搜索 
     * @return SearchInstanceName 用集群名字搜索
     */
    public String getSearchInstanceName() {
        return this.SearchInstanceName;
    }

    /**
     * Set 用集群名字搜索
     * @param SearchInstanceName 用集群名字搜索
     */
    public void setSearchInstanceName(String SearchInstanceName) {
        this.SearchInstanceName = SearchInstanceName;
    }

    /**
     * Get 分页参数，第一页为0，第二页为10 
     * @return Offset 分页参数，第一页为0，第二页为10
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，第一页为0，第二页为10
     * @param Offset 分页参数，第一页为0，第二页为10
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数，分页步长，默认为10 
     * @return Limit 分页参数，分页步长，默认为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，分页步长，默认为10
     * @param Limit 分页参数，分页步长，默认为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索标签列表 
     * @return SearchTags 搜索标签列表
     */
    public SearchTags [] getSearchTags() {
        return this.SearchTags;
    }

    /**
     * Set 搜索标签列表
     * @param SearchTags 搜索标签列表
     */
    public void setSearchTags(SearchTags [] SearchTags) {
        this.SearchTags = SearchTags;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.SearchInstanceId != null) {
            this.SearchInstanceId = new String(source.SearchInstanceId);
        }
        if (source.SearchInstanceName != null) {
            this.SearchInstanceName = new String(source.SearchInstanceName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchTags != null) {
            this.SearchTags = new SearchTags[source.SearchTags.length];
            for (int i = 0; i < source.SearchTags.length; i++) {
                this.SearchTags[i] = new SearchTags(source.SearchTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchInstanceId", this.SearchInstanceId);
        this.setParamSimple(map, prefix + "SearchInstanceName", this.SearchInstanceName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "SearchTags.", this.SearchTags);

    }
}

