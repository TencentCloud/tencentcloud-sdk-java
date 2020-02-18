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
package com.tencentcloudapi.tia.v20180226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryLogsRequest extends AbstractModel{

    /**
    * 任务的名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 任务所在集群的名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 查询日志的开始时间，格式：2019-01-01 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询日志的结束时间，格式：2019-01-01 00:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 单次要返回的日志条数上限
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 加载更多日志时使用，透传上次返回的 Context 值，获取后续的日志内容；使用 Context 翻页最多能获取 10000 条日志
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get 任务的名称 
     * @return JobName 任务的名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 任务的名称
     * @param JobName 任务的名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 任务所在集群的名称 
     * @return Cluster 任务所在集群的名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 任务所在集群的名称
     * @param Cluster 任务所在集群的名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 查询日志的开始时间，格式：2019-01-01 00:00:00 
     * @return StartTime 查询日志的开始时间，格式：2019-01-01 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询日志的开始时间，格式：2019-01-01 00:00:00
     * @param StartTime 查询日志的开始时间，格式：2019-01-01 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询日志的结束时间，格式：2019-01-01 00:00:00 
     * @return EndTime 查询日志的结束时间，格式：2019-01-01 00:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询日志的结束时间，格式：2019-01-01 00:00:00
     * @param EndTime 查询日志的结束时间，格式：2019-01-01 00:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 单次要返回的日志条数上限 
     * @return Limit 单次要返回的日志条数上限
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次要返回的日志条数上限
     * @param Limit 单次要返回的日志条数上限
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 加载更多日志时使用，透传上次返回的 Context 值，获取后续的日志内容；使用 Context 翻页最多能获取 10000 条日志 
     * @return Context 加载更多日志时使用，透传上次返回的 Context 值，获取后续的日志内容；使用 Context 翻页最多能获取 10000 条日志
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 加载更多日志时使用，透传上次返回的 Context 值，获取后续的日志内容；使用 Context 翻页最多能获取 10000 条日志
     * @param Context 加载更多日志时使用，透传上次返回的 Context 值，获取后续的日志内容；使用 Context 翻页最多能获取 10000 条日志
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

