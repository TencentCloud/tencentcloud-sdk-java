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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogsRequest extends AbstractModel {

    /**
    * <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志检索的起始时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 00:00:00。返回结果中仅包含该时间点及之后的日志。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>日志检索的结束时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 23:59:59。返回结果中仅包含该时间点及之前的日志。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("LogFilter")
    @Expose
    private LogFilter [] LogFilter;

    /**
    * <p>每页返回的日志列表大小。</p><ul><li>默认值：20。</li><li>取值范围：[1,100]。</li></ul>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页的起始偏移量。</p><ul><li>默认：0。</li><li>取值：Limit 整数倍。计算公式：offset=limit*(页码-1)。</li></ul>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>日志排序方式，默认值为 DESC。取值如下：</p><ul><li>ASC：按时间升序排列，最早的日志在前。</li><li>DESC：按时间降序排列，最新的日志在前。</li></ul>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序字段，指定按哪个字段对日志进行排序。</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>日志检索的起始时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 00:00:00。返回结果中仅包含该时间点及之后的日志。</p> 
     * @return StartTime <p>日志检索的起始时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 00:00:00。返回结果中仅包含该时间点及之后的日志。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>日志检索的起始时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 00:00:00。返回结果中仅包含该时间点及之后的日志。</p>
     * @param StartTime <p>日志检索的起始时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 00:00:00。返回结果中仅包含该时间点及之后的日志。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>日志检索的结束时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 23:59:59。返回结果中仅包含该时间点及之前的日志。</p> 
     * @return EndTime <p>日志检索的结束时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 23:59:59。返回结果中仅包含该时间点及之前的日志。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>日志检索的结束时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 23:59:59。返回结果中仅包含该时间点及之前的日志。</p>
     * @param EndTime <p>日志检索的结束时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 23:59:59。返回结果中仅包含该时间点及之前的日志。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul> 
     * @return LogType <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     * @param LogType <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return LogFilter <p>过滤条件</p>
     */
    public LogFilter [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set <p>过滤条件</p>
     * @param LogFilter <p>过滤条件</p>
     */
    public void setLogFilter(LogFilter [] LogFilter) {
        this.LogFilter = LogFilter;
    }

    /**
     * Get <p>每页返回的日志列表大小。</p><ul><li>默认值：20。</li><li>取值范围：[1,100]。</li></ul> 
     * @return Limit <p>每页返回的日志列表大小。</p><ul><li>默认值：20。</li><li>取值范围：[1,100]。</li></ul>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页返回的日志列表大小。</p><ul><li>默认值：20。</li><li>取值范围：[1,100]。</li></ul>
     * @param Limit <p>每页返回的日志列表大小。</p><ul><li>默认值：20。</li><li>取值范围：[1,100]。</li></ul>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页的起始偏移量。</p><ul><li>默认：0。</li><li>取值：Limit 整数倍。计算公式：offset=limit*(页码-1)。</li></ul> 
     * @return Offset <p>分页的起始偏移量。</p><ul><li>默认：0。</li><li>取值：Limit 整数倍。计算公式：offset=limit*(页码-1)。</li></ul>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页的起始偏移量。</p><ul><li>默认：0。</li><li>取值：Limit 整数倍。计算公式：offset=limit*(页码-1)。</li></ul>
     * @param Offset <p>分页的起始偏移量。</p><ul><li>默认：0。</li><li>取值：Limit 整数倍。计算公式：offset=limit*(页码-1)。</li></ul>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>日志排序方式，默认值为 DESC。取值如下：</p><ul><li>ASC：按时间升序排列，最早的日志在前。</li><li>DESC：按时间降序排列，最新的日志在前。</li></ul> 
     * @return Order <p>日志排序方式，默认值为 DESC。取值如下：</p><ul><li>ASC：按时间升序排列，最早的日志在前。</li><li>DESC：按时间降序排列，最新的日志在前。</li></ul>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>日志排序方式，默认值为 DESC。取值如下：</p><ul><li>ASC：按时间升序排列，最早的日志在前。</li><li>DESC：按时间降序排列，最新的日志在前。</li></ul>
     * @param Order <p>日志排序方式，默认值为 DESC。取值如下：</p><ul><li>ASC：按时间升序排列，最早的日志在前。</li><li>DESC：按时间降序排列，最新的日志在前。</li></ul>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序字段，指定按哪个字段对日志进行排序。</p> 
     * @return OrderBy <p>排序字段，指定按哪个字段对日志进行排序。</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段，指定按哪个字段对日志进行排序。</p>
     * @param OrderBy <p>排序字段，指定按哪个字段对日志进行排序。</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogsRequest(DescribeLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.LogFilter != null) {
            this.LogFilter = new LogFilter[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new LogFilter(source.LogFilter[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamArrayObj(map, prefix + "LogFilter.", this.LogFilter);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

