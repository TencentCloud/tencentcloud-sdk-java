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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskRequest extends AbstractModel {

    /**
    * 作业ID；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量。默认取值100，最大取值1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，详情如下：
task-instance-state     - String - 是否必填： 否 - 按照任务实例状态进行过滤（

- SUBMITTED：已提交；
- PENDING：等待中；
- RUNNABLE：可运行；
- STARTING：启动中；
- RUNNING：运行中；
- SUCCEED：成功；
- FAILED：失败；
- FAILED_INTERRUPTED：失败后保留实例）。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 作业ID；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909) 
     * @return JobId 作业ID；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)
     * @param JobId 作业ID；JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量。默认取值100，最大取值1000。 
     * @return Limit 返回数量。默认取值100，最大取值1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量。默认取值100，最大取值1000。
     * @param Limit 返回数量。默认取值100，最大取值1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，详情如下：
task-instance-state     - String - 是否必填： 否 - 按照任务实例状态进行过滤（

- SUBMITTED：已提交；
- PENDING：等待中；
- RUNNABLE：可运行；
- STARTING：启动中；
- RUNNING：运行中；
- SUCCEED：成功；
- FAILED：失败；
- FAILED_INTERRUPTED：失败后保留实例）。 
     * @return Filters 过滤条件，详情如下：
task-instance-state     - String - 是否必填： 否 - 按照任务实例状态进行过滤（

- SUBMITTED：已提交；
- PENDING：等待中；
- RUNNABLE：可运行；
- STARTING：启动中；
- RUNNING：运行中；
- SUCCEED：成功；
- FAILED：失败；
- FAILED_INTERRUPTED：失败后保留实例）。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，详情如下：
task-instance-state     - String - 是否必填： 否 - 按照任务实例状态进行过滤（

- SUBMITTED：已提交；
- PENDING：等待中；
- RUNNABLE：可运行；
- STARTING：启动中；
- RUNNING：运行中；
- SUCCEED：成功；
- FAILED：失败；
- FAILED_INTERRUPTED：失败后保留实例）。
     * @param Filters 过滤条件，详情如下：
task-instance-state     - String - 是否必填： 否 - 按照任务实例状态进行过滤（

- SUBMITTED：已提交；
- PENDING：等待中；
- RUNNABLE：可运行；
- STARTING：启动中；
- RUNNING：运行中；
- SUCCEED：成功；
- FAILED：失败；
- FAILED_INTERRUPTED：失败后保留实例）。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskRequest(DescribeTaskRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

