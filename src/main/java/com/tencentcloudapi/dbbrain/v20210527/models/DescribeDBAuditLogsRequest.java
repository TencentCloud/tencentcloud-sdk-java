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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBAuditLogsRequest extends AbstractModel {

    /**
    * <p>服务产品类型。当前  云 API 仅支持：dcdb、mariadb（cdb、cynosdb 已切至中台）。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>开始时间，格式 yyyy-MM-dd HH:mm:ss。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间，格式 yyyy-MM-dd HH:mm:ss。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>实例 ID，必填。dcdb、mariadb 场景以实例维度查询审计日志。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志类型：Proxy 代理日志，DB 数据库日志，All 全部。</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>排序字段，默认 Timestamp。</p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>排序方式：ASC 升序，DESC 降序。默认 DESC。</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>偏移量，默认 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认 20，最大 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>SQL 开始时间（毫秒级时间戳），根据 QueryId 关联查询时使用。</p>
    */
    @SerializedName("SqlStartTime")
    @Expose
    private Long SqlStartTime;

    /**
    * <p>审计日志查询过滤条件集合。</p>
    */
    @SerializedName("Filter")
    @Expose
    private AuditLogQueryFilter Filter;

    /**
    * <p>集群 ID，dcdb 产品以集群维度查询审计日志</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get <p>服务产品类型。当前  云 API 仅支持：dcdb、mariadb（cdb、cynosdb 已切至中台）。</p> 
     * @return Product <p>服务产品类型。当前  云 API 仅支持：dcdb、mariadb（cdb、cynosdb 已切至中台）。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型。当前  云 API 仅支持：dcdb、mariadb（cdb、cynosdb 已切至中台）。</p>
     * @param Product <p>服务产品类型。当前  云 API 仅支持：dcdb、mariadb（cdb、cynosdb 已切至中台）。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>开始时间，格式 yyyy-MM-dd HH:mm:ss。</p> 
     * @return StartTime <p>开始时间，格式 yyyy-MM-dd HH:mm:ss。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，格式 yyyy-MM-dd HH:mm:ss。</p>
     * @param StartTime <p>开始时间，格式 yyyy-MM-dd HH:mm:ss。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，格式 yyyy-MM-dd HH:mm:ss。</p> 
     * @return EndTime <p>结束时间，格式 yyyy-MM-dd HH:mm:ss。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，格式 yyyy-MM-dd HH:mm:ss。</p>
     * @param EndTime <p>结束时间，格式 yyyy-MM-dd HH:mm:ss。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>实例 ID，必填。dcdb、mariadb 场景以实例维度查询审计日志。</p> 
     * @return InstanceId <p>实例 ID，必填。dcdb、mariadb 场景以实例维度查询审计日志。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，必填。dcdb、mariadb 场景以实例维度查询审计日志。</p>
     * @param InstanceId <p>实例 ID，必填。dcdb、mariadb 场景以实例维度查询审计日志。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>日志类型：Proxy 代理日志，DB 数据库日志，All 全部。</p> 
     * @return LogType <p>日志类型：Proxy 代理日志，DB 数据库日志，All 全部。</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型：Proxy 代理日志，DB 数据库日志，All 全部。</p>
     * @param LogType <p>日志类型：Proxy 代理日志，DB 数据库日志，All 全部。</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>排序字段，默认 Timestamp。</p> 
     * @return SortBy <p>排序字段，默认 Timestamp。</p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序字段，默认 Timestamp。</p>
     * @param SortBy <p>排序字段，默认 Timestamp。</p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>排序方式：ASC 升序，DESC 降序。默认 DESC。</p> 
     * @return OrderBy <p>排序方式：ASC 升序，DESC 降序。默认 DESC。</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序方式：ASC 升序，DESC 降序。默认 DESC。</p>
     * @param OrderBy <p>排序方式：ASC 升序，DESC 降序。默认 DESC。</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>偏移量，默认 0。</p> 
     * @return Offset <p>偏移量，默认 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认 0。</p>
     * @param Offset <p>偏移量，默认 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认 20，最大 100。</p> 
     * @return Limit <p>返回数量，默认 20，最大 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认 20，最大 100。</p>
     * @param Limit <p>返回数量，默认 20，最大 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>SQL 开始时间（毫秒级时间戳），根据 QueryId 关联查询时使用。</p> 
     * @return SqlStartTime <p>SQL 开始时间（毫秒级时间戳），根据 QueryId 关联查询时使用。</p>
     */
    public Long getSqlStartTime() {
        return this.SqlStartTime;
    }

    /**
     * Set <p>SQL 开始时间（毫秒级时间戳），根据 QueryId 关联查询时使用。</p>
     * @param SqlStartTime <p>SQL 开始时间（毫秒级时间戳），根据 QueryId 关联查询时使用。</p>
     */
    public void setSqlStartTime(Long SqlStartTime) {
        this.SqlStartTime = SqlStartTime;
    }

    /**
     * Get <p>审计日志查询过滤条件集合。</p> 
     * @return Filter <p>审计日志查询过滤条件集合。</p>
     */
    public AuditLogQueryFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>审计日志查询过滤条件集合。</p>
     * @param Filter <p>审计日志查询过滤条件集合。</p>
     */
    public void setFilter(AuditLogQueryFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>集群 ID，dcdb 产品以集群维度查询审计日志</p> 
     * @return ClusterId <p>集群 ID，dcdb 产品以集群维度查询审计日志</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID，dcdb 产品以集群维度查询审计日志</p>
     * @param ClusterId <p>集群 ID，dcdb 产品以集群维度查询审计日志</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public DescribeDBAuditLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBAuditLogsRequest(DescribeDBAuditLogsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SqlStartTime != null) {
            this.SqlStartTime = new Long(source.SqlStartTime);
        }
        if (source.Filter != null) {
            this.Filter = new AuditLogQueryFilter(source.Filter);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SqlStartTime", this.SqlStartTime);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

