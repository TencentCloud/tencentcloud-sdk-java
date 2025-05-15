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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskLogsRequest extends AbstractModel {

    /**
    * 作业ID。JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
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
    * 任务实例集合；与Offset不能同时指定。
    */
    @SerializedName("TaskInstanceIndexes")
    @Expose
    private Long [] TaskInstanceIndexes;

    /**
    * 起始任务实例。与TaskInstanceIndexes参数不能同时指定。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大任务实例数；默认值为5， 最大值为10。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 作业ID。JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。 
     * @return JobId 作业ID。JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID。JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
     * @param JobId 作业ID。JobId详见[作业列表](https://cloud.tencent.com/document/product/599/15909)。
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
     * Get 任务实例集合；与Offset不能同时指定。 
     * @return TaskInstanceIndexes 任务实例集合；与Offset不能同时指定。
     */
    public Long [] getTaskInstanceIndexes() {
        return this.TaskInstanceIndexes;
    }

    /**
     * Set 任务实例集合；与Offset不能同时指定。
     * @param TaskInstanceIndexes 任务实例集合；与Offset不能同时指定。
     */
    public void setTaskInstanceIndexes(Long [] TaskInstanceIndexes) {
        this.TaskInstanceIndexes = TaskInstanceIndexes;
    }

    /**
     * Get 起始任务实例。与TaskInstanceIndexes参数不能同时指定。 
     * @return Offset 起始任务实例。与TaskInstanceIndexes参数不能同时指定。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始任务实例。与TaskInstanceIndexes参数不能同时指定。
     * @param Offset 起始任务实例。与TaskInstanceIndexes参数不能同时指定。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大任务实例数；默认值为5， 最大值为10。 
     * @return Limit 最大任务实例数；默认值为5， 最大值为10。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大任务实例数；默认值为5， 最大值为10。
     * @param Limit 最大任务实例数；默认值为5， 最大值为10。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTaskLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskLogsRequest(DescribeTaskLogsRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskInstanceIndexes != null) {
            this.TaskInstanceIndexes = new Long[source.TaskInstanceIndexes.length];
            for (int i = 0; i < source.TaskInstanceIndexes.length; i++) {
                this.TaskInstanceIndexes[i] = new Long(source.TaskInstanceIndexes[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamArraySimple(map, prefix + "TaskInstanceIndexes.", this.TaskInstanceIndexes);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

