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

public class DescribeBaseBackupsRequest extends AbstractModel{

    /**
    * 备份的最小结束时间，形如2018-01-01 00:00:00。默认为7天前。
    */
    @SerializedName("MinFinishTime")
    @Expose
    private String MinFinishTime;

    /**
    * 备份的最大结束时间，形如2018-01-01 00:00:00。默认为当前时间。
    */
    @SerializedName("MaxFinishTime")
    @Expose
    private String MaxFinishTime;

    /**
    * 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-instance-id：按照实例ID过滤，类型为string。
db-instance-name：按照实例名过滤，类型为string。
db-instance-ip：按照实例私有网络IP地址过滤，类型为string。
base-backup-id：按照备份集ID过滤，类型为string。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
    * 排序字段，支持StartTime,FinishTime,Size。
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
     * Get 备份的最小结束时间，形如2018-01-01 00:00:00。默认为7天前。 
     * @return MinFinishTime 备份的最小结束时间，形如2018-01-01 00:00:00。默认为7天前。
     */
    public String getMinFinishTime() {
        return this.MinFinishTime;
    }

    /**
     * Set 备份的最小结束时间，形如2018-01-01 00:00:00。默认为7天前。
     * @param MinFinishTime 备份的最小结束时间，形如2018-01-01 00:00:00。默认为7天前。
     */
    public void setMinFinishTime(String MinFinishTime) {
        this.MinFinishTime = MinFinishTime;
    }

    /**
     * Get 备份的最大结束时间，形如2018-01-01 00:00:00。默认为当前时间。 
     * @return MaxFinishTime 备份的最大结束时间，形如2018-01-01 00:00:00。默认为当前时间。
     */
    public String getMaxFinishTime() {
        return this.MaxFinishTime;
    }

    /**
     * Set 备份的最大结束时间，形如2018-01-01 00:00:00。默认为当前时间。
     * @param MaxFinishTime 备份的最大结束时间，形如2018-01-01 00:00:00。默认为当前时间。
     */
    public void setMaxFinishTime(String MaxFinishTime) {
        this.MaxFinishTime = MaxFinishTime;
    }

    /**
     * Get 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-instance-id：按照实例ID过滤，类型为string。
db-instance-name：按照实例名过滤，类型为string。
db-instance-ip：按照实例私有网络IP地址过滤，类型为string。
base-backup-id：按照备份集ID过滤，类型为string。 
     * @return Filters 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-instance-id：按照实例ID过滤，类型为string。
db-instance-name：按照实例名过滤，类型为string。
db-instance-ip：按照实例私有网络IP地址过滤，类型为string。
base-backup-id：按照备份集ID过滤，类型为string。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-instance-id：按照实例ID过滤，类型为string。
db-instance-name：按照实例名过滤，类型为string。
db-instance-ip：按照实例私有网络IP地址过滤，类型为string。
base-backup-id：按照备份集ID过滤，类型为string。
     * @param Filters 按照一个或者多个过滤条件进行查询，目前支持的过滤条件有：
db-instance-id：按照实例ID过滤，类型为string。
db-instance-name：按照实例名过滤，类型为string。
db-instance-ip：按照实例私有网络IP地址过滤，类型为string。
base-backup-id：按照备份集ID过滤，类型为string。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

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
     * Get 排序字段，支持StartTime,FinishTime,Size。 
     * @return OrderBy 排序字段，支持StartTime,FinishTime,Size。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，支持StartTime,FinishTime,Size。
     * @param OrderBy 排序字段，支持StartTime,FinishTime,Size。
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

    public DescribeBaseBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaseBackupsRequest(DescribeBaseBackupsRequest source) {
        if (source.MinFinishTime != null) {
            this.MinFinishTime = new String(source.MinFinishTime);
        }
        if (source.MaxFinishTime != null) {
            this.MaxFinishTime = new String(source.MaxFinishTime);
        }
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
        this.setParamSimple(map, prefix + "MinFinishTime", this.MinFinishTime);
        this.setParamSimple(map, prefix + "MaxFinishTime", this.MaxFinishTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

