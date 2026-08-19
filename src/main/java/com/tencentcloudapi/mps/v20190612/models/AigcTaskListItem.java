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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcTaskListItem extends AbstractModel {

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务类型</p><p>枚举值：</p><ul><li>VideoRedraw： 转绘任务</li><li>AIDrama： AI漫剧任务</li></ul>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>任务状态</p><p>枚举值：</p><ul><li>PENDING： 任务等待调度</li><li>RUNNING： 任务运行中</li><li>FINISHED： 任务执行成功</li><li>STOP： 任务被中止</li><li>FAILED： 任务失败</li><li>TIMEOUT： 任务超时</li></ul>
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * <p>任务创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>任务开始调度时间</p>
    */
    @SerializedName("ScheduledTime")
    @Expose
    private String ScheduledTime;

    /**
    * <p>任务结束时间</p>
    */
    @SerializedName("FinishedTime")
    @Expose
    private String FinishedTime;

    /**
    * <p>任务结果Url</p>
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * <p>任务执行错误码</p>
    */
    @SerializedName("TaskResultCode")
    @Expose
    private Long TaskResultCode;

    /**
    * <p>任务执行错误信息</p>
    */
    @SerializedName("TaskResultMsg")
    @Expose
    private String TaskResultMsg;

    /**
    * <p>输出视频的分辨率</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>输出视频的宽高比</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ratio")
    @Expose
    private String Ratio;

    /**
    * <p>任务请求包</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestBody")
    @Expose
    private String RequestBody;

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务类型</p><p>枚举值：</p><ul><li>VideoRedraw： 转绘任务</li><li>AIDrama： AI漫剧任务</li></ul> 
     * @return TaskType <p>任务类型</p><p>枚举值：</p><ul><li>VideoRedraw： 转绘任务</li><li>AIDrama： AI漫剧任务</li></ul>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型</p><p>枚举值：</p><ul><li>VideoRedraw： 转绘任务</li><li>AIDrama： AI漫剧任务</li></ul>
     * @param TaskType <p>任务类型</p><p>枚举值：</p><ul><li>VideoRedraw： 转绘任务</li><li>AIDrama： AI漫剧任务</li></ul>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>任务状态</p><p>枚举值：</p><ul><li>PENDING： 任务等待调度</li><li>RUNNING： 任务运行中</li><li>FINISHED： 任务执行成功</li><li>STOP： 任务被中止</li><li>FAILED： 任务失败</li><li>TIMEOUT： 任务超时</li></ul> 
     * @return TaskStatus <p>任务状态</p><p>枚举值：</p><ul><li>PENDING： 任务等待调度</li><li>RUNNING： 任务运行中</li><li>FINISHED： 任务执行成功</li><li>STOP： 任务被中止</li><li>FAILED： 任务失败</li><li>TIMEOUT： 任务超时</li></ul>
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>任务状态</p><p>枚举值：</p><ul><li>PENDING： 任务等待调度</li><li>RUNNING： 任务运行中</li><li>FINISHED： 任务执行成功</li><li>STOP： 任务被中止</li><li>FAILED： 任务失败</li><li>TIMEOUT： 任务超时</li></ul>
     * @param TaskStatus <p>任务状态</p><p>枚举值：</p><ul><li>PENDING： 任务等待调度</li><li>RUNNING： 任务运行中</li><li>FINISHED： 任务执行成功</li><li>STOP： 任务被中止</li><li>FAILED： 任务失败</li><li>TIMEOUT： 任务超时</li></ul>
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>任务创建时间</p> 
     * @return CreateTime <p>任务创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>任务创建时间</p>
     * @param CreateTime <p>任务创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>任务开始调度时间</p> 
     * @return ScheduledTime <p>任务开始调度时间</p>
     */
    public String getScheduledTime() {
        return this.ScheduledTime;
    }

    /**
     * Set <p>任务开始调度时间</p>
     * @param ScheduledTime <p>任务开始调度时间</p>
     */
    public void setScheduledTime(String ScheduledTime) {
        this.ScheduledTime = ScheduledTime;
    }

    /**
     * Get <p>任务结束时间</p> 
     * @return FinishedTime <p>任务结束时间</p>
     */
    public String getFinishedTime() {
        return this.FinishedTime;
    }

    /**
     * Set <p>任务结束时间</p>
     * @param FinishedTime <p>任务结束时间</p>
     */
    public void setFinishedTime(String FinishedTime) {
        this.FinishedTime = FinishedTime;
    }

    /**
     * Get <p>任务结果Url</p> 
     * @return Urls <p>任务结果Url</p>
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set <p>任务结果Url</p>
     * @param Urls <p>任务结果Url</p>
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get <p>任务执行错误码</p> 
     * @return TaskResultCode <p>任务执行错误码</p>
     */
    public Long getTaskResultCode() {
        return this.TaskResultCode;
    }

    /**
     * Set <p>任务执行错误码</p>
     * @param TaskResultCode <p>任务执行错误码</p>
     */
    public void setTaskResultCode(Long TaskResultCode) {
        this.TaskResultCode = TaskResultCode;
    }

    /**
     * Get <p>任务执行错误信息</p> 
     * @return TaskResultMsg <p>任务执行错误信息</p>
     */
    public String getTaskResultMsg() {
        return this.TaskResultMsg;
    }

    /**
     * Set <p>任务执行错误信息</p>
     * @param TaskResultMsg <p>任务执行错误信息</p>
     */
    public void setTaskResultMsg(String TaskResultMsg) {
        this.TaskResultMsg = TaskResultMsg;
    }

    /**
     * Get <p>输出视频的分辨率</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resolution <p>输出视频的分辨率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>输出视频的分辨率</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resolution <p>输出视频的分辨率</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>输出视频的宽高比</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ratio <p>输出视频的宽高比</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>输出视频的宽高比</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ratio <p>输出视频的宽高比</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRatio(String Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get <p>任务请求包</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestBody <p>任务请求包</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestBody() {
        return this.RequestBody;
    }

    /**
     * Set <p>任务请求包</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestBody <p>任务请求包</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestBody(String RequestBody) {
        this.RequestBody = RequestBody;
    }

    public AigcTaskListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcTaskListItem(AigcTaskListItem source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ScheduledTime != null) {
            this.ScheduledTime = new String(source.ScheduledTime);
        }
        if (source.FinishedTime != null) {
            this.FinishedTime = new String(source.FinishedTime);
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.TaskResultCode != null) {
            this.TaskResultCode = new Long(source.TaskResultCode);
        }
        if (source.TaskResultMsg != null) {
            this.TaskResultMsg = new String(source.TaskResultMsg);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.Ratio != null) {
            this.Ratio = new String(source.Ratio);
        }
        if (source.RequestBody != null) {
            this.RequestBody = new String(source.RequestBody);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ScheduledTime", this.ScheduledTime);
        this.setParamSimple(map, prefix + "FinishedTime", this.FinishedTime);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "TaskResultCode", this.TaskResultCode);
        this.setParamSimple(map, prefix + "TaskResultMsg", this.TaskResultMsg);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "RequestBody", this.RequestBody);

    }
}

