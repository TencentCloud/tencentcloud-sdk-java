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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCNInstancesRequest extends AbstractModel {

    /**
    * 搜索的集群id名称
    */
    @SerializedName("SearchInstanceID")
    @Expose
    private String SearchInstanceID;

    /**
    * 搜索的集群name
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
    * 集群类型，弹性版或自研数仓版
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 组件名称列表
    */
    @SerializedName("Components")
    @Expose
    private String [] Components;

    /**
     * Get 搜索的集群id名称 
     * @return SearchInstanceID 搜索的集群id名称
     */
    public String getSearchInstanceID() {
        return this.SearchInstanceID;
    }

    /**
     * Set 搜索的集群id名称
     * @param SearchInstanceID 搜索的集群id名称
     */
    public void setSearchInstanceID(String SearchInstanceID) {
        this.SearchInstanceID = SearchInstanceID;
    }

    /**
     * Get 搜索的集群name 
     * @return SearchInstanceName 搜索的集群name
     */
    public String getSearchInstanceName() {
        return this.SearchInstanceName;
    }

    /**
     * Set 搜索的集群name
     * @param SearchInstanceName 搜索的集群name
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

    /**
     * Get 集群类型，弹性版或自研数仓版 
     * @return InstanceType 集群类型，弹性版或自研数仓版
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 集群类型，弹性版或自研数仓版
     * @param InstanceType 集群类型，弹性版或自研数仓版
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 组件名称列表 
     * @return Components 组件名称列表
     */
    public String [] getComponents() {
        return this.Components;
    }

    /**
     * Set 组件名称列表
     * @param Components 组件名称列表
     */
    public void setComponents(String [] Components) {
        this.Components = Components;
    }

    public DescribeCNInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCNInstancesRequest(DescribeCNInstancesRequest source) {
        if (source.SearchInstanceID != null) {
            this.SearchInstanceID = new String(source.SearchInstanceID);
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
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Components != null) {
            this.Components = new String[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new String(source.Components[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchInstanceID", this.SearchInstanceID);
        this.setParamSimple(map, prefix + "SearchInstanceName", this.SearchInstanceName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "SearchTags.", this.SearchTags);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamArraySimple(map, prefix + "Components.", this.Components);

    }
}

