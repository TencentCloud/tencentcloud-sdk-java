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

public class DescribeBackupSummariesRequest extends AbstractModel{

    /**
    * 每页显示数量，取值范围为1-100，默认为返回10条。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据偏移量，从0开始。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-instance-id：按照实例ID过滤，类型为string。
db-instance-name：按照实例名过滤，类型为string。
db-instance-ip：按照实例私有网络IP地址过滤，类型为string。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段，支持TotalBackupSize,LogBackupSize,ManualBaseBackupSize,AutoBaseBackupSize。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，包括升序：asc，降序：desc。
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 每页显示数量，取值范围为1-100，默认为返回10条。 
     * @return Limit 每页显示数量，取值范围为1-100，默认为返回10条。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页显示数量，取值范围为1-100，默认为返回10条。
     * @param Limit 每页显示数量，取值范围为1-100，默认为返回10条。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 数据偏移量，从0开始。 
     * @return Offset 数据偏移量，从0开始。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，从0开始。
     * @param Offset 数据偏移量，从0开始。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-instance-id：按照实例ID过滤，类型为string。
db-instance-name：按照实例名过滤，类型为string。
db-instance-ip：按照实例私有网络IP地址过滤，类型为string。 
     * @return Filters 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-instance-id：按照实例ID过滤，类型为string。
db-instance-name：按照实例名过滤，类型为string。
db-instance-ip：按照实例私有网络IP地址过滤，类型为string。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-instance-id：按照实例ID过滤，类型为string。
db-instance-name：按照实例名过滤，类型为string。
db-instance-ip：按照实例私有网络IP地址过滤，类型为string。
     * @param Filters 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-instance-id：按照实例ID过滤，类型为string。
db-instance-name：按照实例名过滤，类型为string。
db-instance-ip：按照实例私有网络IP地址过滤，类型为string。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段，支持TotalBackupSize,LogBackupSize,ManualBaseBackupSize,AutoBaseBackupSize。 
     * @return OrderBy 排序字段，支持TotalBackupSize,LogBackupSize,ManualBaseBackupSize,AutoBaseBackupSize。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，支持TotalBackupSize,LogBackupSize,ManualBaseBackupSize,AutoBaseBackupSize。
     * @param OrderBy 排序字段，支持TotalBackupSize,LogBackupSize,ManualBaseBackupSize,AutoBaseBackupSize。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，包括升序：asc，降序：desc。 
     * @return OrderByType 排序方式，包括升序：asc，降序：desc。
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式，包括升序：asc，降序：desc。
     * @param OrderByType 排序方式，包括升序：asc，降序：desc。
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeBackupSummariesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupSummariesRequest(DescribeBackupSummariesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

