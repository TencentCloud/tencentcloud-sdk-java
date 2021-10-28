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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQClustersRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 按照集群ID关键字搜索
    */
    @SerializedName("IdKeyword")
    @Expose
    private String IdKeyword;

    /**
    * 按照集群名称关键字搜索
    */
    @SerializedName("NameKeyword")
    @Expose
    private String NameKeyword;

    /**
    * 集群ID列表过滤
    */
    @SerializedName("ClusterIdList")
    @Expose
    private String [] ClusterIdList;

    /**
    * 标签过滤查找时，需要设置为true
    */
    @SerializedName("IsTagFilter")
    @Expose
    private Boolean IsTagFilter;

    /**
    * 过滤器。目前支持标签过滤。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目 
     * @return Limit 限制数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 按照集群ID关键字搜索 
     * @return IdKeyword 按照集群ID关键字搜索
     */
    public String getIdKeyword() {
        return this.IdKeyword;
    }

    /**
     * Set 按照集群ID关键字搜索
     * @param IdKeyword 按照集群ID关键字搜索
     */
    public void setIdKeyword(String IdKeyword) {
        this.IdKeyword = IdKeyword;
    }

    /**
     * Get 按照集群名称关键字搜索 
     * @return NameKeyword 按照集群名称关键字搜索
     */
    public String getNameKeyword() {
        return this.NameKeyword;
    }

    /**
     * Set 按照集群名称关键字搜索
     * @param NameKeyword 按照集群名称关键字搜索
     */
    public void setNameKeyword(String NameKeyword) {
        this.NameKeyword = NameKeyword;
    }

    /**
     * Get 集群ID列表过滤 
     * @return ClusterIdList 集群ID列表过滤
     */
    public String [] getClusterIdList() {
        return this.ClusterIdList;
    }

    /**
     * Set 集群ID列表过滤
     * @param ClusterIdList 集群ID列表过滤
     */
    public void setClusterIdList(String [] ClusterIdList) {
        this.ClusterIdList = ClusterIdList;
    }

    /**
     * Get 标签过滤查找时，需要设置为true 
     * @return IsTagFilter 标签过滤查找时，需要设置为true
     */
    public Boolean getIsTagFilter() {
        return this.IsTagFilter;
    }

    /**
     * Set 标签过滤查找时，需要设置为true
     * @param IsTagFilter 标签过滤查找时，需要设置为true
     */
    public void setIsTagFilter(Boolean IsTagFilter) {
        this.IsTagFilter = IsTagFilter;
    }

    /**
     * Get 过滤器。目前支持标签过滤。 
     * @return Filters 过滤器。目前支持标签过滤。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器。目前支持标签过滤。
     * @param Filters 过滤器。目前支持标签过滤。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRocketMQClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQClustersRequest(DescribeRocketMQClustersRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.IdKeyword != null) {
            this.IdKeyword = new String(source.IdKeyword);
        }
        if (source.NameKeyword != null) {
            this.NameKeyword = new String(source.NameKeyword);
        }
        if (source.ClusterIdList != null) {
            this.ClusterIdList = new String[source.ClusterIdList.length];
            for (int i = 0; i < source.ClusterIdList.length; i++) {
                this.ClusterIdList[i] = new String(source.ClusterIdList[i]);
            }
        }
        if (source.IsTagFilter != null) {
            this.IsTagFilter = new Boolean(source.IsTagFilter);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "IdKeyword", this.IdKeyword);
        this.setParamSimple(map, prefix + "NameKeyword", this.NameKeyword);
        this.setParamArraySimple(map, prefix + "ClusterIdList.", this.ClusterIdList);
        this.setParamSimple(map, prefix + "IsTagFilter", this.IsTagFilter);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

