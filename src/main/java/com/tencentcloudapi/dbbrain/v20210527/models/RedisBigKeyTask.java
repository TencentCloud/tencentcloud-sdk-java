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

public class RedisBigKeyTask extends AbstractModel {

    /**
    * 异步任务请求 ID。
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * 任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务状态。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 任务执行进度。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 任务包含的分片节点序号列表。
    */
    @SerializedName("ShardIds")
    @Expose
    private Long [] ShardIds;

    /**
     * Get 异步任务请求 ID。 
     * @return AsyncRequestId 异步任务请求 ID。
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set 异步任务请求 ID。
     * @param AsyncRequestId 异步任务请求 ID。
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get 任务创建时间。 
     * @return CreateTime 任务创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间。
     * @param CreateTime 任务创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务开始时间。 
     * @return StartTime 任务开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间。
     * @param StartTime 任务开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间。 
     * @return EndTime 任务结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间。
     * @param EndTime 任务结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务状态。 
     * @return TaskStatus 任务状态。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态。
     * @param TaskStatus 任务状态。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务执行进度。 
     * @return Progress 任务执行进度。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务执行进度。
     * @param Progress 任务执行进度。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 任务包含的分片节点序号列表。 
     * @return ShardIds 任务包含的分片节点序号列表。
     */
    public Long [] getShardIds() {
        return this.ShardIds;
    }

    /**
     * Set 任务包含的分片节点序号列表。
     * @param ShardIds 任务包含的分片节点序号列表。
     */
    public void setShardIds(Long [] ShardIds) {
        this.ShardIds = ShardIds;
    }

    public RedisBigKeyTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisBigKeyTask(RedisBigKeyTask source) {
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.ShardIds != null) {
            this.ShardIds = new Long[source.ShardIds.length];
            for (int i = 0; i < source.ShardIds.length; i++) {
                this.ShardIds[i] = new Long(source.ShardIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamArraySimple(map, prefix + "ShardIds.", this.ShardIds);

    }
}

