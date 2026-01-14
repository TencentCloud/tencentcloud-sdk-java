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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebuildIndexTaskInfo extends AbstractModel {

    /**
    * 索引重建任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 索引重建任务当前状态，0:索引重建任务已创建，1:创建索引重建资源，2:索引重建资源创建完成，3:重建中，4:暂停，5:重建索引成功，6:重建成功（可检索），7:重建失败，8:撤销，9:删除元数据和索引
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 重建任务开始时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 重建任务结束时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 重投预估剩余时间，单位秒
    */
    @SerializedName("RemainTime")
    @Expose
    private Long RemainTime;

    /**
    * 重建任务创建时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 重投完成度，百分比
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 重建任务更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 附加状态描述信息（目前仅描述失败时失败原因）
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
     * Get 索引重建任务ID 
     * @return TaskId 索引重建任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 索引重建任务ID
     * @param TaskId 索引重建任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 索引重建任务当前状态，0:索引重建任务已创建，1:创建索引重建资源，2:索引重建资源创建完成，3:重建中，4:暂停，5:重建索引成功，6:重建成功（可检索），7:重建失败，8:撤销，9:删除元数据和索引 
     * @return Status 索引重建任务当前状态，0:索引重建任务已创建，1:创建索引重建资源，2:索引重建资源创建完成，3:重建中，4:暂停，5:重建索引成功，6:重建成功（可检索），7:重建失败，8:撤销，9:删除元数据和索引
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 索引重建任务当前状态，0:索引重建任务已创建，1:创建索引重建资源，2:索引重建资源创建完成，3:重建中，4:暂停，5:重建索引成功，6:重建成功（可检索），7:重建失败，8:撤销，9:删除元数据和索引
     * @param Status 索引重建任务当前状态，0:索引重建任务已创建，1:创建索引重建资源，2:索引重建资源创建完成，3:重建中，4:暂停，5:重建索引成功，6:重建成功（可检索），7:重建失败，8:撤销，9:删除元数据和索引
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 重建任务开始时间戳 
     * @return StartTime 重建任务开始时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 重建任务开始时间戳
     * @param StartTime 重建任务开始时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 重建任务结束时间戳 
     * @return EndTime 重建任务结束时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 重建任务结束时间戳
     * @param EndTime 重建任务结束时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 重投预估剩余时间，单位秒 
     * @return RemainTime 重投预估剩余时间，单位秒
     */
    public Long getRemainTime() {
        return this.RemainTime;
    }

    /**
     * Set 重投预估剩余时间，单位秒
     * @param RemainTime 重投预估剩余时间，单位秒
     */
    public void setRemainTime(Long RemainTime) {
        this.RemainTime = RemainTime;
    }

    /**
     * Get 重建任务创建时间戳 
     * @return CreateTime 重建任务创建时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 重建任务创建时间戳
     * @param CreateTime 重建任务创建时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 重投完成度，百分比 
     * @return Progress 重投完成度，百分比
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 重投完成度，百分比
     * @param Progress 重投完成度，百分比
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 重建任务更新时间 
     * @return UpdateTime 重建任务更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 重建任务更新时间
     * @param UpdateTime 重建任务更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 附加状态描述信息（目前仅描述失败时失败原因） 
     * @return StatusMessage 附加状态描述信息（目前仅描述失败时失败原因）
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set 附加状态描述信息（目前仅描述失败时失败原因）
     * @param StatusMessage 附加状态描述信息（目前仅描述失败时失败原因）
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    public RebuildIndexTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildIndexTaskInfo(RebuildIndexTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RemainTime != null) {
            this.RemainTime = new Long(source.RemainTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.StatusMessage != null) {
            this.StatusMessage = new String(source.StatusMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RemainTime", this.RemainTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);

    }
}

