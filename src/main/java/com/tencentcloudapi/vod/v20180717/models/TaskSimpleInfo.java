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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskSimpleInfo extends AbstractModel {

    /**
    * 任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态。取值：WAITING（等待中）、PROCESSING（处理中）、FINISH（已完成）、ABORTED（已终止）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 视频 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 任务类型，取值：
<li>Procedure：视频处理任务；</li>
<li>EditMedia：视频编辑任务；</li>
<li>ReduceMediaBitrate：降码率任务；</li>
<li>WechatDistribute：微信发布任务；</li>
<li>ReviewAudioVideo：音视频审核任务。</li>
兼容 2017 版的任务类型：
<li>Transcode：视频转码任务；</li>
<li>SnapshotByTimeOffset：视频截图任务；</li>
<li>Concat：视频拼接任务；</li>
<li>Clip：视频剪辑任务；</li>
<li>ImageSprites：截取雪碧图任务。</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务开始执行时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。若任务尚未开始，该字段为空。
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * 任务结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。若任务尚未完成，该字段为空。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 用于去重的识别码，如果七天内曾有过相同的识别码的请求。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 来源上下文，用于透传用户请求信息。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
     * Get 任务 ID。 
     * @return TaskId 任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID。
     * @param TaskId 任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态。取值：WAITING（等待中）、PROCESSING（处理中）、FINISH（已完成）、ABORTED（已终止）。 
     * @return Status 任务状态。取值：WAITING（等待中）、PROCESSING（处理中）、FINISH（已完成）、ABORTED（已终止）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。取值：WAITING（等待中）、PROCESSING（处理中）、FINISH（已完成）、ABORTED（已终止）。
     * @param Status 任务状态。取值：WAITING（等待中）、PROCESSING（处理中）、FINISH（已完成）、ABORTED（已终止）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 视频 ID。 
     * @return FileId 视频 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 视频 ID。
     * @param FileId 视频 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 任务类型，取值：
<li>Procedure：视频处理任务；</li>
<li>EditMedia：视频编辑任务；</li>
<li>ReduceMediaBitrate：降码率任务；</li>
<li>WechatDistribute：微信发布任务；</li>
<li>ReviewAudioVideo：音视频审核任务。</li>
兼容 2017 版的任务类型：
<li>Transcode：视频转码任务；</li>
<li>SnapshotByTimeOffset：视频截图任务；</li>
<li>Concat：视频拼接任务；</li>
<li>Clip：视频剪辑任务；</li>
<li>ImageSprites：截取雪碧图任务。</li> 
     * @return TaskType 任务类型，取值：
<li>Procedure：视频处理任务；</li>
<li>EditMedia：视频编辑任务；</li>
<li>ReduceMediaBitrate：降码率任务；</li>
<li>WechatDistribute：微信发布任务；</li>
<li>ReviewAudioVideo：音视频审核任务。</li>
兼容 2017 版的任务类型：
<li>Transcode：视频转码任务；</li>
<li>SnapshotByTimeOffset：视频截图任务；</li>
<li>Concat：视频拼接任务；</li>
<li>Clip：视频剪辑任务；</li>
<li>ImageSprites：截取雪碧图任务。</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，取值：
<li>Procedure：视频处理任务；</li>
<li>EditMedia：视频编辑任务；</li>
<li>ReduceMediaBitrate：降码率任务；</li>
<li>WechatDistribute：微信发布任务；</li>
<li>ReviewAudioVideo：音视频审核任务。</li>
兼容 2017 版的任务类型：
<li>Transcode：视频转码任务；</li>
<li>SnapshotByTimeOffset：视频截图任务；</li>
<li>Concat：视频拼接任务；</li>
<li>Clip：视频剪辑任务；</li>
<li>ImageSprites：截取雪碧图任务。</li>
     * @param TaskType 任务类型，取值：
<li>Procedure：视频处理任务；</li>
<li>EditMedia：视频编辑任务；</li>
<li>ReduceMediaBitrate：降码率任务；</li>
<li>WechatDistribute：微信发布任务；</li>
<li>ReviewAudioVideo：音视频审核任务。</li>
兼容 2017 版的任务类型：
<li>Transcode：视频转码任务；</li>
<li>SnapshotByTimeOffset：视频截图任务；</li>
<li>Concat：视频拼接任务；</li>
<li>Clip：视频剪辑任务；</li>
<li>ImageSprites：截取雪碧图任务。</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 任务创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 任务创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务开始执行时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。若任务尚未开始，该字段为空。 
     * @return BeginProcessTime 任务开始执行时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。若任务尚未开始，该字段为空。
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set 任务开始执行时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。若任务尚未开始，该字段为空。
     * @param BeginProcessTime 任务开始执行时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。若任务尚未开始，该字段为空。
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get 任务结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。若任务尚未完成，该字段为空。 
     * @return FinishTime 任务结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。若任务尚未完成，该字段为空。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 任务结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。若任务尚未完成，该字段为空。
     * @param FinishTime 任务结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。若任务尚未完成，该字段为空。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 用于去重的识别码，如果七天内曾有过相同的识别码的请求。 
     * @return SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 用于去重的识别码，如果七天内曾有过相同的识别码的请求。
     * @param SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 来源上下文，用于透传用户请求信息。 
     * @return SessionContext 来源上下文，用于透传用户请求信息。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 来源上下文，用于透传用户请求信息。
     * @param SessionContext 来源上下文，用于透传用户请求信息。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    public TaskSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskSimpleInfo(TaskSimpleInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BeginProcessTime != null) {
            this.BeginProcessTime = new String(source.BeginProcessTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);

    }
}

