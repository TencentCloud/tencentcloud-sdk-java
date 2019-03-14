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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceLogsRequest  extends AbstractModel{

    /**
    * 集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 日志类型
    */
    @SerializedName("LogType")
    @Expose
    private Integer LogType;

    /**
    * 搜索词
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 日志开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页起始值
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 分页大小
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 时间排序方式
    */
    @SerializedName("OrderByType")
    @Expose
    private Integer OrderByType;

    /**
     * 获取集群实例ID
     * @return InstanceId 集群实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置集群实例ID
     * @param InstanceId 集群实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取日志类型
     * @return LogType 日志类型
     */
    public Integer getLogType() {
        return this.LogType;
    }

    /**
     * 设置日志类型
     * @param LogType 日志类型
     */
    public void setLogType(Integer LogType) {
        this.LogType = LogType;
    }

    /**
     * 获取搜索词
     * @return SearchKey 搜索词
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * 设置搜索词
     * @param SearchKey 搜索词
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * 获取日志开始时间
     * @return StartTime 日志开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置日志开始时间
     * @param StartTime 日志开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取日志结束时间
     * @return EndTime 日志结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置日志结束时间
     * @param EndTime 日志结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取分页起始值
     * @return Offset 分页起始值
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页起始值
     * @param Offset 分页起始值
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取分页大小
     * @return Limit 分页大小
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页大小
     * @param Limit 分页大小
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取时间排序方式
     * @return OrderByType 时间排序方式
     */
    public Integer getOrderByType() {
        return this.OrderByType;
    }

    /**
     * 设置时间排序方式
     * @param OrderByType 时间排序方式
     */
    public void setOrderByType(Integer OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

