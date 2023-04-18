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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppDimensionMetricsRequest extends AbstractModel{

    /**
    * app 项目ID
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 查询的表名
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 查询指标 fields
    */
    @SerializedName("Fields")
    @Expose
    private String Fields;

    /**
    * 查询的过滤条件
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 查询简单过滤条件
    */
    @SerializedName("FilterSimple")
    @Expose
    private String FilterSimple;

    /**
    * group by 条件
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * order by 条件
    */
    @SerializedName("OrderBy")
    @Expose
    private String [] OrderBy;

    /**
    * limit 参数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * offset 参数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 业务上下文参数
    */
    @SerializedName("BusinessContext")
    @Expose
    private String BusinessContext;

    /**
     * Get app 项目ID 
     * @return ProjectID app 项目ID
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set app 项目ID
     * @param ProjectID app 项目ID
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get 查询的表名 
     * @return From 查询的表名
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 查询的表名
     * @param From 查询的表名
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 查询指标 fields 
     * @return Fields 查询指标 fields
     */
    public String getFields() {
        return this.Fields;
    }

    /**
     * Set 查询指标 fields
     * @param Fields 查询指标 fields
     */
    public void setFields(String Fields) {
        this.Fields = Fields;
    }

    /**
     * Get 查询的过滤条件 
     * @return Filter 查询的过滤条件
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 查询的过滤条件
     * @param Filter 查询的过滤条件
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 查询简单过滤条件 
     * @return FilterSimple 查询简单过滤条件
     */
    public String getFilterSimple() {
        return this.FilterSimple;
    }

    /**
     * Set 查询简单过滤条件
     * @param FilterSimple 查询简单过滤条件
     */
    public void setFilterSimple(String FilterSimple) {
        this.FilterSimple = FilterSimple;
    }

    /**
     * Get group by 条件 
     * @return GroupBy group by 条件
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set group by 条件
     * @param GroupBy group by 条件
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get order by 条件 
     * @return OrderBy order by 条件
     */
    public String [] getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set order by 条件
     * @param OrderBy order by 条件
     */
    public void setOrderBy(String [] OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get limit 参数 
     * @return Limit limit 参数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set limit 参数
     * @param Limit limit 参数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get offset 参数 
     * @return Offset offset 参数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set offset 参数
     * @param Offset offset 参数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 业务上下文参数 
     * @return BusinessContext 业务上下文参数
     */
    public String getBusinessContext() {
        return this.BusinessContext;
    }

    /**
     * Set 业务上下文参数
     * @param BusinessContext 业务上下文参数
     */
    public void setBusinessContext(String BusinessContext) {
        this.BusinessContext = BusinessContext;
    }

    public DescribeAppDimensionMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppDimensionMetricsRequest(DescribeAppDimensionMetricsRequest source) {
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Fields != null) {
            this.Fields = new String(source.Fields);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.FilterSimple != null) {
            this.FilterSimple = new String(source.FilterSimple);
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String[source.OrderBy.length];
            for (int i = 0; i < source.OrderBy.length; i++) {
                this.OrderBy[i] = new String(source.OrderBy[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.BusinessContext != null) {
            this.BusinessContext = new String(source.BusinessContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Fields", this.Fields);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "FilterSimple", this.FilterSimple);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamArraySimple(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BusinessContext", this.BusinessContext);

    }
}

