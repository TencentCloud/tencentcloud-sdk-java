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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotOperationLogsRequest extends AbstractModel{

    /**
    * 过滤条件。支持以下条件：
<li>snapshot-id - Array of String - 是否必填：是 - 按快照ID过滤，每个请求最多可指定10个快照ID。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 要查询的操作日志的起始时间，例如：“2019-11-22 00:00:00"
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 要查询的操作日志的截止时间，例如：“2019-11-22 23:59:59"
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 过滤条件。支持以下条件：
<li>snapshot-id - Array of String - 是否必填：是 - 按快照ID过滤，每个请求最多可指定10个快照ID。 
     * @return Filters 过滤条件。支持以下条件：
<li>snapshot-id - Array of String - 是否必填：是 - 按快照ID过滤，每个请求最多可指定10个快照ID。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。支持以下条件：
<li>snapshot-id - Array of String - 是否必填：是 - 按快照ID过滤，每个请求最多可指定10个快照ID。
     * @param Filters 过滤条件。支持以下条件：
<li>snapshot-id - Array of String - 是否必填：是 - 按快照ID过滤，每个请求最多可指定10个快照ID。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 要查询的操作日志的起始时间，例如：“2019-11-22 00:00:00" 
     * @return BeginTime 要查询的操作日志的起始时间，例如：“2019-11-22 00:00:00"
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 要查询的操作日志的起始时间，例如：“2019-11-22 00:00:00"
     * @param BeginTime 要查询的操作日志的起始时间，例如：“2019-11-22 00:00:00"
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 要查询的操作日志的截止时间，例如：“2019-11-22 23:59:59" 
     * @return EndTime 要查询的操作日志的截止时间，例如：“2019-11-22 23:59:59"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 要查询的操作日志的截止时间，例如：“2019-11-22 23:59:59"
     * @param EndTime 要查询的操作日志的截止时间，例如：“2019-11-22 23:59:59"
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

