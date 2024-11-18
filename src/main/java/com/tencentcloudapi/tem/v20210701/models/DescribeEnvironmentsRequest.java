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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvironmentsRequest extends AbstractModel {

    /**
    * 分页limit，默认：20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页下标，默认：0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 来源source
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 查询过滤器
    */
    @SerializedName("Filters")
    @Expose
    private QueryFilter [] Filters;

    /**
    * 排序字段
    */
    @SerializedName("SortInfo")
    @Expose
    private SortType SortInfo;

    /**
    * 环境id
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
     * Get 分页limit，默认：20 
     * @return Limit 分页limit，默认：20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页limit，默认：20
     * @param Limit 分页limit，默认：20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页下标，默认：0 
     * @return Offset 分页下标，默认：0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页下标，默认：0
     * @param Offset 分页下标，默认：0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 来源source 
     * @return SourceChannel 来源source
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源source
     * @param SourceChannel 来源source
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get 查询过滤器 
     * @return Filters 查询过滤器
     */
    public QueryFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询过滤器
     * @param Filters 查询过滤器
     */
    public void setFilters(QueryFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段 
     * @return SortInfo 排序字段
     */
    public SortType getSortInfo() {
        return this.SortInfo;
    }

    /**
     * Set 排序字段
     * @param SortInfo 排序字段
     */
    public void setSortInfo(SortType SortInfo) {
        this.SortInfo = SortInfo;
    }

    /**
     * Get 环境id 
     * @return EnvironmentId 环境id
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境id
     * @param EnvironmentId 环境id
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    public DescribeEnvironmentsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvironmentsRequest(DescribeEnvironmentsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.Filters != null) {
            this.Filters = new QueryFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryFilter(source.Filters[i]);
            }
        }
        if (source.SortInfo != null) {
            this.SortInfo = new SortType(source.SortInfo);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "SortInfo.", this.SortInfo);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);

    }
}

