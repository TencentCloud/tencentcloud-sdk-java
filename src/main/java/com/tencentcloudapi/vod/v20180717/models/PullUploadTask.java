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

public class PullUploadTask extends AbstractModel {

    /**
    * <p>拉取上传任务 ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误码，0 表示成功，其他值表示失败：</p><li>40000：输入参数不合法，请检查输入参数；</li><li>60000：源文件错误（如视频数据损坏），请确认源文件是否正常；</li><li>70000：内部服务错误，建议重试。</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * <p>错误信息。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>拉取上传完成后生成的视频 ID。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>拉取上传完成后生成的媒体文件基础信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaBasicInfo")
    @Expose
    private MediaBasicInfo MediaBasicInfo;

    /**
    * <p>输出视频的元信息。</p>
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * <p>拉取上传完成后生成的播放地址。</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * <p>任务类型为 Procedure 的任务 ID。若<a href="https://cloud.tencent.com/document/api/266/35575">拉取上传</a>时指定了媒体后续任务操作(Procedure)，当该任务流模板指定了 MediaProcessTask、AiAnalysisTask、AiRecognitionTask 中的一个或多个时发起该任务。</p>
    */
    @SerializedName("ProcedureTaskId")
    @Expose
    private String ProcedureTaskId;

    /**
    * <p>任务类型为 ReviewAudioVideo 的任务 ID。若<a href="https://cloud.tencent.com/document/api/266/35575">拉取上传</a>时指定了媒体后续任务操作(Procedure)，当该任务流模板指定了 ReviewAudioVideoTask 时，发起该任务。</p>
    */
    @SerializedName("ReviewAudioVideoTaskId")
    @Expose
    private String ReviewAudioVideoTaskId;

    /**
    * <p>来源上下文，用于透传用户请求信息，<a href="https://cloud.tencent.com/document/product/266/7831">URL 拉取视频上传完成</a>将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>拉取上传进度，取值范围 [0-100] 。</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
     * Get <p>拉取上传任务 ID。</p> 
     * @return TaskId <p>拉取上传任务 ID。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>拉取上传任务 ID。</p>
     * @param TaskId <p>拉取上传任务 ID。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li> 
     * @return Status <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     * @param Status <p>任务流状态，取值：</p><li>PROCESSING：处理中；</li><li>FINISH：已完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误码，0 表示成功，其他值表示失败：</p><li>40000：输入参数不合法，请检查输入参数；</li><li>60000：源文件错误（如视频数据损坏），请确认源文件是否正常；</li><li>70000：内部服务错误，建议重试。</li> 
     * @return ErrCode <p>错误码，0 表示成功，其他值表示失败：</p><li>40000：输入参数不合法，请检查输入参数；</li><li>60000：源文件错误（如视频数据损坏），请确认源文件是否正常；</li><li>70000：内部服务错误，建议重试。</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set <p>错误码，0 表示成功，其他值表示失败：</p><li>40000：输入参数不合法，请检查输入参数；</li><li>60000：源文件错误（如视频数据损坏），请确认源文件是否正常；</li><li>70000：内部服务错误，建议重试。</li>
     * @param ErrCode <p>错误码，0 表示成功，其他值表示失败：</p><li>40000：输入参数不合法，请检查输入参数；</li><li>60000：源文件错误（如视频数据损坏），请确认源文件是否正常；</li><li>70000：内部服务错误，建议重试。</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get <p>错误信息。</p> 
     * @return Message <p>错误信息。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>错误信息。</p>
     * @param Message <p>错误信息。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>拉取上传完成后生成的视频 ID。</p> 
     * @return FileId <p>拉取上传完成后生成的视频 ID。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>拉取上传完成后生成的视频 ID。</p>
     * @param FileId <p>拉取上传完成后生成的视频 ID。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>拉取上传完成后生成的媒体文件基础信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaBasicInfo <p>拉取上传完成后生成的媒体文件基础信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaBasicInfo getMediaBasicInfo() {
        return this.MediaBasicInfo;
    }

    /**
     * Set <p>拉取上传完成后生成的媒体文件基础信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaBasicInfo <p>拉取上传完成后生成的媒体文件基础信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaBasicInfo(MediaBasicInfo MediaBasicInfo) {
        this.MediaBasicInfo = MediaBasicInfo;
    }

    /**
     * Get <p>输出视频的元信息。</p> 
     * @return MetaData <p>输出视频的元信息。</p>
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set <p>输出视频的元信息。</p>
     * @param MetaData <p>输出视频的元信息。</p>
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get <p>拉取上传完成后生成的播放地址。</p> 
     * @return FileUrl <p>拉取上传完成后生成的播放地址。</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>拉取上传完成后生成的播放地址。</p>
     * @param FileUrl <p>拉取上传完成后生成的播放地址。</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get <p>任务类型为 Procedure 的任务 ID。若<a href="https://cloud.tencent.com/document/api/266/35575">拉取上传</a>时指定了媒体后续任务操作(Procedure)，当该任务流模板指定了 MediaProcessTask、AiAnalysisTask、AiRecognitionTask 中的一个或多个时发起该任务。</p> 
     * @return ProcedureTaskId <p>任务类型为 Procedure 的任务 ID。若<a href="https://cloud.tencent.com/document/api/266/35575">拉取上传</a>时指定了媒体后续任务操作(Procedure)，当该任务流模板指定了 MediaProcessTask、AiAnalysisTask、AiRecognitionTask 中的一个或多个时发起该任务。</p>
     */
    public String getProcedureTaskId() {
        return this.ProcedureTaskId;
    }

    /**
     * Set <p>任务类型为 Procedure 的任务 ID。若<a href="https://cloud.tencent.com/document/api/266/35575">拉取上传</a>时指定了媒体后续任务操作(Procedure)，当该任务流模板指定了 MediaProcessTask、AiAnalysisTask、AiRecognitionTask 中的一个或多个时发起该任务。</p>
     * @param ProcedureTaskId <p>任务类型为 Procedure 的任务 ID。若<a href="https://cloud.tencent.com/document/api/266/35575">拉取上传</a>时指定了媒体后续任务操作(Procedure)，当该任务流模板指定了 MediaProcessTask、AiAnalysisTask、AiRecognitionTask 中的一个或多个时发起该任务。</p>
     */
    public void setProcedureTaskId(String ProcedureTaskId) {
        this.ProcedureTaskId = ProcedureTaskId;
    }

    /**
     * Get <p>任务类型为 ReviewAudioVideo 的任务 ID。若<a href="https://cloud.tencent.com/document/api/266/35575">拉取上传</a>时指定了媒体后续任务操作(Procedure)，当该任务流模板指定了 ReviewAudioVideoTask 时，发起该任务。</p> 
     * @return ReviewAudioVideoTaskId <p>任务类型为 ReviewAudioVideo 的任务 ID。若<a href="https://cloud.tencent.com/document/api/266/35575">拉取上传</a>时指定了媒体后续任务操作(Procedure)，当该任务流模板指定了 ReviewAudioVideoTask 时，发起该任务。</p>
     */
    public String getReviewAudioVideoTaskId() {
        return this.ReviewAudioVideoTaskId;
    }

    /**
     * Set <p>任务类型为 ReviewAudioVideo 的任务 ID。若<a href="https://cloud.tencent.com/document/api/266/35575">拉取上传</a>时指定了媒体后续任务操作(Procedure)，当该任务流模板指定了 ReviewAudioVideoTask 时，发起该任务。</p>
     * @param ReviewAudioVideoTaskId <p>任务类型为 ReviewAudioVideo 的任务 ID。若<a href="https://cloud.tencent.com/document/api/266/35575">拉取上传</a>时指定了媒体后续任务操作(Procedure)，当该任务流模板指定了 ReviewAudioVideoTask 时，发起该任务。</p>
     */
    public void setReviewAudioVideoTaskId(String ReviewAudioVideoTaskId) {
        this.ReviewAudioVideoTaskId = ReviewAudioVideoTaskId;
    }

    /**
     * Get <p>来源上下文，用于透传用户请求信息，<a href="https://cloud.tencent.com/document/product/266/7831">URL 拉取视频上传完成</a>将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>来源上下文，用于透传用户请求信息，<a href="https://cloud.tencent.com/document/product/266/7831">URL 拉取视频上传完成</a>将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，<a href="https://cloud.tencent.com/document/product/266/7831">URL 拉取视频上传完成</a>将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>来源上下文，用于透传用户请求信息，<a href="https://cloud.tencent.com/document/product/266/7831">URL 拉取视频上传完成</a>将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p> 
     * @return SessionId <p>用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     * @param SessionId <p>用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>拉取上传进度，取值范围 [0-100] 。</p> 
     * @return Progress <p>拉取上传进度，取值范围 [0-100] 。</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>拉取上传进度，取值范围 [0-100] 。</p>
     * @param Progress <p>拉取上传进度，取值范围 [0-100] 。</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    public PullUploadTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullUploadTask(PullUploadTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MediaBasicInfo != null) {
            this.MediaBasicInfo = new MediaBasicInfo(source.MediaBasicInfo);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.ProcedureTaskId != null) {
            this.ProcedureTaskId = new String(source.ProcedureTaskId);
        }
        if (source.ReviewAudioVideoTaskId != null) {
            this.ReviewAudioVideoTaskId = new String(source.ReviewAudioVideoTaskId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "MediaBasicInfo.", this.MediaBasicInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "ProcedureTaskId", this.ProcedureTaskId);
        this.setParamSimple(map, prefix + "ReviewAudioVideoTaskId", this.ReviewAudioVideoTaskId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);

    }
}

