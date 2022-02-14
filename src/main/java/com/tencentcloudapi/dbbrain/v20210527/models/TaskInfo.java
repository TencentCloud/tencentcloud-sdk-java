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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfo extends AbstractModel{

    /**
    * 异步任务 ID。
    */
    @SerializedName("AsyncRequestId")
    @Expose
    private Long AsyncRequestId;

    /**
    * 当前实例所有 proxy 列表。
    */
    @SerializedName("InstProxyList")
    @Expose
    private String [] InstProxyList;

    /**
    * 当前实例所有 proxy 数量。
    */
    @SerializedName("InstProxyCount")
    @Expose
    private Long InstProxyCount;

    /**
    * 任务创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务启动时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务的状态，支持的取值包括："created" - 新建；"chosen" - 待执行； "running" - 执行中；"failed" - 失败；"finished" - 已完成。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 完成 kill 任务的 proxyId。
    */
    @SerializedName("FinishedProxyList")
    @Expose
    private String [] FinishedProxyList;

    /**
    * kill 任务实行失败的 proxyId。
    */
    @SerializedName("FailedProxyList")
    @Expose
    private String [] FailedProxyList;

    /**
    * 任务结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务执行进度。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 异步任务 ID。 
     * @return AsyncRequestId 异步任务 ID。
     */
    public Long getAsyncRequestId() {
        return this.AsyncRequestId;
    }

    /**
     * Set 异步任务 ID。
     * @param AsyncRequestId 异步任务 ID。
     */
    public void setAsyncRequestId(Long AsyncRequestId) {
        this.AsyncRequestId = AsyncRequestId;
    }

    /**
     * Get 当前实例所有 proxy 列表。 
     * @return InstProxyList 当前实例所有 proxy 列表。
     */
    public String [] getInstProxyList() {
        return this.InstProxyList;
    }

    /**
     * Set 当前实例所有 proxy 列表。
     * @param InstProxyList 当前实例所有 proxy 列表。
     */
    public void setInstProxyList(String [] InstProxyList) {
        this.InstProxyList = InstProxyList;
    }

    /**
     * Get 当前实例所有 proxy 数量。 
     * @return InstProxyCount 当前实例所有 proxy 数量。
     */
    public Long getInstProxyCount() {
        return this.InstProxyCount;
    }

    /**
     * Set 当前实例所有 proxy 数量。
     * @param InstProxyCount 当前实例所有 proxy 数量。
     */
    public void setInstProxyCount(Long InstProxyCount) {
        this.InstProxyCount = InstProxyCount;
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
     * Get 任务启动时间。 
     * @return StartTime 任务启动时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务启动时间。
     * @param StartTime 任务启动时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务的状态，支持的取值包括："created" - 新建；"chosen" - 待执行； "running" - 执行中；"failed" - 失败；"finished" - 已完成。 
     * @return TaskStatus 任务的状态，支持的取值包括："created" - 新建；"chosen" - 待执行； "running" - 执行中；"failed" - 失败；"finished" - 已完成。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务的状态，支持的取值包括："created" - 新建；"chosen" - 待执行； "running" - 执行中；"failed" - 失败；"finished" - 已完成。
     * @param TaskStatus 任务的状态，支持的取值包括："created" - 新建；"chosen" - 待执行； "running" - 执行中；"failed" - 失败；"finished" - 已完成。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 完成 kill 任务的 proxyId。 
     * @return FinishedProxyList 完成 kill 任务的 proxyId。
     */
    public String [] getFinishedProxyList() {
        return this.FinishedProxyList;
    }

    /**
     * Set 完成 kill 任务的 proxyId。
     * @param FinishedProxyList 完成 kill 任务的 proxyId。
     */
    public void setFinishedProxyList(String [] FinishedProxyList) {
        this.FinishedProxyList = FinishedProxyList;
    }

    /**
     * Get kill 任务实行失败的 proxyId。 
     * @return FailedProxyList kill 任务实行失败的 proxyId。
     */
    public String [] getFailedProxyList() {
        return this.FailedProxyList;
    }

    /**
     * Set kill 任务实行失败的 proxyId。
     * @param FailedProxyList kill 任务实行失败的 proxyId。
     */
    public void setFailedProxyList(String [] FailedProxyList) {
        this.FailedProxyList = FailedProxyList;
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
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public TaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfo(TaskInfo source) {
        if (source.AsyncRequestId != null) {
            this.AsyncRequestId = new Long(source.AsyncRequestId);
        }
        if (source.InstProxyList != null) {
            this.InstProxyList = new String[source.InstProxyList.length];
            for (int i = 0; i < source.InstProxyList.length; i++) {
                this.InstProxyList[i] = new String(source.InstProxyList[i]);
            }
        }
        if (source.InstProxyCount != null) {
            this.InstProxyCount = new Long(source.InstProxyCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.FinishedProxyList != null) {
            this.FinishedProxyList = new String[source.FinishedProxyList.length];
            for (int i = 0; i < source.FinishedProxyList.length; i++) {
                this.FinishedProxyList[i] = new String(source.FinishedProxyList[i]);
            }
        }
        if (source.FailedProxyList != null) {
            this.FailedProxyList = new String[source.FailedProxyList.length];
            for (int i = 0; i < source.FailedProxyList.length; i++) {
                this.FailedProxyList[i] = new String(source.FailedProxyList[i]);
            }
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsyncRequestId", this.AsyncRequestId);
        this.setParamArraySimple(map, prefix + "InstProxyList.", this.InstProxyList);
        this.setParamSimple(map, prefix + "InstProxyCount", this.InstProxyCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamArraySimple(map, prefix + "FinishedProxyList.", this.FinishedProxyList);
        this.setParamArraySimple(map, prefix + "FailedProxyList.", this.FailedProxyList);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

