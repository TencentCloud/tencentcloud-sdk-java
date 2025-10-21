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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceLogsRequest extends AbstractModel {

    /**
    * 集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志类型，默认值为1
<li>1, 主日志</li>
<li>2, 搜索慢日志</li>
<li>3, 索引慢日志</li>
<li>4, GC日志</li>
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * 搜索词，支持LUCENE语法，如 level:WARN、ip:1.1.1.1、message:test-index等
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 日志开始时间，格式为YYYY-MM-DD HH:MM:SS, 如2019-01-22 20:15:53
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志结束时间，格式为YYYY-MM-DD HH:MM:SS, 如2019-01-22 20:15:53
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页起始值, 默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，默认值为100，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 时间排序方式，默认值为0
<li>0, 降序</li>
<li>1, 升序</li>
    */
    @SerializedName("OrderByType")
    @Expose
    private Long OrderByType;

    /**
    * 日志级别
    */
    @SerializedName("LogLevels")
    @Expose
    private String [] LogLevels;

    /**
    * 节点ID
    */
    @SerializedName("NodeIds")
    @Expose
    private String [] NodeIds;

    /**
    * 慢日志索引名
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * 慢日志索引分片
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * 慢日志查询耗时
    */
    @SerializedName("QueryCost")
    @Expose
    private Long QueryCost;

    /**
     * Get 集群实例ID 
     * @return InstanceId 集群实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID
     * @param InstanceId 集群实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 日志类型，默认值为1
<li>1, 主日志</li>
<li>2, 搜索慢日志</li>
<li>3, 索引慢日志</li>
<li>4, GC日志</li> 
     * @return LogType 日志类型，默认值为1
<li>1, 主日志</li>
<li>2, 搜索慢日志</li>
<li>3, 索引慢日志</li>
<li>4, GC日志</li>
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型，默认值为1
<li>1, 主日志</li>
<li>2, 搜索慢日志</li>
<li>3, 索引慢日志</li>
<li>4, GC日志</li>
     * @param LogType 日志类型，默认值为1
<li>1, 主日志</li>
<li>2, 搜索慢日志</li>
<li>3, 索引慢日志</li>
<li>4, GC日志</li>
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 搜索词，支持LUCENE语法，如 level:WARN、ip:1.1.1.1、message:test-index等 
     * @return SearchKey 搜索词，支持LUCENE语法，如 level:WARN、ip:1.1.1.1、message:test-index等
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索词，支持LUCENE语法，如 level:WARN、ip:1.1.1.1、message:test-index等
     * @param SearchKey 搜索词，支持LUCENE语法，如 level:WARN、ip:1.1.1.1、message:test-index等
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 日志开始时间，格式为YYYY-MM-DD HH:MM:SS, 如2019-01-22 20:15:53 
     * @return StartTime 日志开始时间，格式为YYYY-MM-DD HH:MM:SS, 如2019-01-22 20:15:53
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志开始时间，格式为YYYY-MM-DD HH:MM:SS, 如2019-01-22 20:15:53
     * @param StartTime 日志开始时间，格式为YYYY-MM-DD HH:MM:SS, 如2019-01-22 20:15:53
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志结束时间，格式为YYYY-MM-DD HH:MM:SS, 如2019-01-22 20:15:53 
     * @return EndTime 日志结束时间，格式为YYYY-MM-DD HH:MM:SS, 如2019-01-22 20:15:53
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志结束时间，格式为YYYY-MM-DD HH:MM:SS, 如2019-01-22 20:15:53
     * @param EndTime 日志结束时间，格式为YYYY-MM-DD HH:MM:SS, 如2019-01-22 20:15:53
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页起始值, 默认值为0 
     * @return Offset 分页起始值, 默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始值, 默认值为0
     * @param Offset 分页起始值, 默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，默认值为100，最大值100 
     * @return Limit 分页大小，默认值为100，最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，默认值为100，最大值100
     * @param Limit 分页大小，默认值为100，最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 时间排序方式，默认值为0
<li>0, 降序</li>
<li>1, 升序</li> 
     * @return OrderByType 时间排序方式，默认值为0
<li>0, 降序</li>
<li>1, 升序</li>
     */
    public Long getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 时间排序方式，默认值为0
<li>0, 降序</li>
<li>1, 升序</li>
     * @param OrderByType 时间排序方式，默认值为0
<li>0, 降序</li>
<li>1, 升序</li>
     */
    public void setOrderByType(Long OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 日志级别 
     * @return LogLevels 日志级别
     */
    public String [] getLogLevels() {
        return this.LogLevels;
    }

    /**
     * Set 日志级别
     * @param LogLevels 日志级别
     */
    public void setLogLevels(String [] LogLevels) {
        this.LogLevels = LogLevels;
    }

    /**
     * Get 节点ID 
     * @return NodeIds 节点ID
     */
    public String [] getNodeIds() {
        return this.NodeIds;
    }

    /**
     * Set 节点ID
     * @param NodeIds 节点ID
     */
    public void setNodeIds(String [] NodeIds) {
        this.NodeIds = NodeIds;
    }

    /**
     * Get 慢日志索引名 
     * @return IndexName 慢日志索引名
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set 慢日志索引名
     * @param IndexName 慢日志索引名
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get 慢日志索引分片 
     * @return ShardId 慢日志索引分片
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set 慢日志索引分片
     * @param ShardId 慢日志索引分片
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get 慢日志查询耗时 
     * @return QueryCost 慢日志查询耗时
     */
    public Long getQueryCost() {
        return this.QueryCost;
    }

    /**
     * Set 慢日志查询耗时
     * @param QueryCost 慢日志查询耗时
     */
    public void setQueryCost(Long QueryCost) {
        this.QueryCost = QueryCost;
    }

    public DescribeInstanceLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceLogsRequest(DescribeInstanceLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new Long(source.OrderByType);
        }
        if (source.LogLevels != null) {
            this.LogLevels = new String[source.LogLevels.length];
            for (int i = 0; i < source.LogLevels.length; i++) {
                this.LogLevels[i] = new String(source.LogLevels[i]);
            }
        }
        if (source.NodeIds != null) {
            this.NodeIds = new String[source.NodeIds.length];
            for (int i = 0; i < source.NodeIds.length; i++) {
                this.NodeIds[i] = new String(source.NodeIds[i]);
            }
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.ShardId != null) {
            this.ShardId = new String(source.ShardId);
        }
        if (source.QueryCost != null) {
            this.QueryCost = new Long(source.QueryCost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArraySimple(map, prefix + "LogLevels.", this.LogLevels);
        this.setParamArraySimple(map, prefix + "NodeIds.", this.NodeIds);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "QueryCost", this.QueryCost);

    }
}

