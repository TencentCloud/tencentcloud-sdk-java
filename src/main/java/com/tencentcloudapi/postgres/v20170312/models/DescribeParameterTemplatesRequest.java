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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeParameterTemplatesRequest extends AbstractModel{

    /**
    * 过滤条件，目前支持的过滤条件有：TemplateName, TemplateId，DBMajorVersion，DBEngine
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 每页显示数量，[0，100]，默认 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序指标，枚举值，支持：CreateTime，TemplateName，DBMajorVersion
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，枚举值，支持：asc（升序） ，desc（降序）
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 过滤条件，目前支持的过滤条件有：TemplateName, TemplateId，DBMajorVersion，DBEngine 
     * @return Filters 过滤条件，目前支持的过滤条件有：TemplateName, TemplateId，DBMajorVersion，DBEngine
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，目前支持的过滤条件有：TemplateName, TemplateId，DBMajorVersion，DBEngine
     * @param Filters 过滤条件，目前支持的过滤条件有：TemplateName, TemplateId，DBMajorVersion，DBEngine
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 每页显示数量，[0，100]，默认 20 
     * @return Limit 每页显示数量，[0，100]，默认 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页显示数量，[0，100]，默认 20
     * @param Limit 每页显示数量，[0，100]，默认 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 数据偏移量 
     * @return Offset 数据偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量
     * @param Offset 数据偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序指标，枚举值，支持：CreateTime，TemplateName，DBMajorVersion 
     * @return OrderBy 排序指标，枚举值，支持：CreateTime，TemplateName，DBMajorVersion
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序指标，枚举值，支持：CreateTime，TemplateName，DBMajorVersion
     * @param OrderBy 排序指标，枚举值，支持：CreateTime，TemplateName，DBMajorVersion
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，枚举值，支持：asc（升序） ，desc（降序） 
     * @return OrderByType 排序方式，枚举值，支持：asc（升序） ，desc（降序）
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式，枚举值，支持：asc（升序） ，desc（降序）
     * @param OrderByType 排序方式，枚举值，支持：asc（升序） ，desc（降序）
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeParameterTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeParameterTemplatesRequest(DescribeParameterTemplatesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

