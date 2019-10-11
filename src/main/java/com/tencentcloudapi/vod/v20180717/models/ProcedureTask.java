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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcedureTask  extends AbstractModel{

    /**
    * 视频处理任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 已弃用，请使用各个具体任务的 ErrCode。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 已弃用，请使用各个具体任务的 Message。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 媒体文件 ID
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 FileId；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Id。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 媒体文件名称
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 BasicInfo.Name；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Name。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 媒体文件地址
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 BasicInfo.MediaUrl；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Url。</li>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 原始视频的元信息。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 视频处理任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private MediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * 视频内容审核任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiContentReviewResultSet")
    @Expose
    private AiContentReviewResult [] AiContentReviewResultSet;

    /**
    * 视频内容分析任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiAnalysisResultSet")
    @Expose
    private AiAnalysisResult [] AiAnalysisResultSet;

    /**
    * 视频内容识别任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiRecognitionResultSet")
    @Expose
    private AiRecognitionResult [] AiRecognitionResultSet;

    /**
    * 任务流的优先级，取值范围为 [-10, 10]。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * 任务流状态变更通知模式。
<li>Finish：只有当任务流全部执行完毕时，才发起一次事件通知；</li>
<li>Change：只要任务流中每个子任务的状态发生变化，都进行事件通知；</li>
<li>None：不接受该任务流回调。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TasksNotifyMode")
    @Expose
    private String TasksNotifyMode;

    /**
    * 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * 获取视频处理任务 ID。
     * @return TaskId 视频处理任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置视频处理任务 ID。
     * @param TaskId 视频处理任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     * @return Status 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     * @param Status 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取已弃用，请使用各个具体任务的 ErrCode。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ErrCode 已弃用，请使用各个具体任务的 ErrCode。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * 设置已弃用，请使用各个具体任务的 ErrCode。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode 已弃用，请使用各个具体任务的 ErrCode。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * 获取已弃用，请使用各个具体任务的 Message。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Message 已弃用，请使用各个具体任务的 Message。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置已弃用，请使用各个具体任务的 Message。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 已弃用，请使用各个具体任务的 Message。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取媒体文件 ID
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 FileId；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Id。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileId 媒体文件 ID
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 FileId；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Id。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置媒体文件 ID
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 FileId；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Id。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileId 媒体文件 ID
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 FileId；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Id。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取媒体文件名称
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 BasicInfo.Name；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Name。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @return FileName 媒体文件名称
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 BasicInfo.Name；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Name。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * 设置媒体文件名称
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 BasicInfo.Name；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Name。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 媒体文件名称
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 BasicInfo.Name；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Name。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * 获取媒体文件地址
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 BasicInfo.MediaUrl；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Url。</li>
     * @return FileUrl 媒体文件地址
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 BasicInfo.MediaUrl；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Url。</li>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * 设置媒体文件地址
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 BasicInfo.MediaUrl；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Url。</li>
     * @param FileUrl 媒体文件地址
<li>若流程由 [ProcessMedia](https://cloud.tencent.com/document/product/266/33427) 发起，该字段表示 [MediaInfo](https://cloud.tencent.com/document/product/266/31773#MediaInfo) 的 BasicInfo.MediaUrl；</li>
<li>若流程由 [ProcessMediaByUrl](https://cloud.tencent.com/document/product/266/33426) 发起，该字段表示 [MediaInputInfo](https://cloud.tencent.com/document/product/266/31773#MediaInputInfo) 的 Url。</li>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * 获取原始视频的元信息。
     * @return MetaData 原始视频的元信息。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * 设置原始视频的元信息。
     * @param MetaData 原始视频的元信息。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * 获取视频处理任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @return MediaProcessResultSet 视频处理任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * 设置视频处理任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaProcessResultSet 视频处理任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaProcessResultSet(MediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * 获取视频内容审核任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AiContentReviewResultSet 视频内容审核任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiContentReviewResult [] getAiContentReviewResultSet() {
        return this.AiContentReviewResultSet;
    }

    /**
     * 设置视频内容审核任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiContentReviewResultSet 视频内容审核任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiContentReviewResultSet(AiContentReviewResult [] AiContentReviewResultSet) {
        this.AiContentReviewResultSet = AiContentReviewResultSet;
    }

    /**
     * 获取视频内容分析任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AiAnalysisResultSet 视频内容分析任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisResult [] getAiAnalysisResultSet() {
        return this.AiAnalysisResultSet;
    }

    /**
     * 设置视频内容分析任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiAnalysisResultSet 视频内容分析任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiAnalysisResultSet(AiAnalysisResult [] AiAnalysisResultSet) {
        this.AiAnalysisResultSet = AiAnalysisResultSet;
    }

    /**
     * 获取视频内容识别任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AiRecognitionResultSet 视频内容识别任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionResult [] getAiRecognitionResultSet() {
        return this.AiRecognitionResultSet;
    }

    /**
     * 设置视频内容识别任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiRecognitionResultSet 视频内容识别任务的执行状态与结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiRecognitionResultSet(AiRecognitionResult [] AiRecognitionResultSet) {
        this.AiRecognitionResultSet = AiRecognitionResultSet;
    }

    /**
     * 获取任务流的优先级，取值范围为 [-10, 10]。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TasksPriority 任务流的优先级，取值范围为 [-10, 10]。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * 设置任务流的优先级，取值范围为 [-10, 10]。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TasksPriority 任务流的优先级，取值范围为 [-10, 10]。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * 获取任务流状态变更通知模式。
<li>Finish：只有当任务流全部执行完毕时，才发起一次事件通知；</li>
<li>Change：只要任务流中每个子任务的状态发生变化，都进行事件通知；</li>
<li>None：不接受该任务流回调。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @return TasksNotifyMode 任务流状态变更通知模式。
<li>Finish：只有当任务流全部执行完毕时，才发起一次事件通知；</li>
<li>Change：只要任务流中每个子任务的状态发生变化，都进行事件通知；</li>
<li>None：不接受该任务流回调。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTasksNotifyMode() {
        return this.TasksNotifyMode;
    }

    /**
     * 设置任务流状态变更通知模式。
<li>Finish：只有当任务流全部执行完毕时，才发起一次事件通知；</li>
<li>Change：只要任务流中每个子任务的状态发生变化，都进行事件通知；</li>
<li>None：不接受该任务流回调。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TasksNotifyMode 任务流状态变更通知模式。
<li>Finish：只有当任务流全部执行完毕时，才发起一次事件通知；</li>
<li>Change：只要任务流中每个子任务的状态发生变化，都进行事件通知；</li>
<li>None：不接受该任务流回调。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasksNotifyMode(String TasksNotifyMode) {
        this.TasksNotifyMode = TasksNotifyMode;
    }

    /**
     * 获取来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * 设置来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * 获取用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId 用于去重的识别码，如果七天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamArrayObj(map, prefix + "MediaProcessResultSet.", this.MediaProcessResultSet);
        this.setParamArrayObj(map, prefix + "AiContentReviewResultSet.", this.AiContentReviewResultSet);
        this.setParamArrayObj(map, prefix + "AiAnalysisResultSet.", this.AiAnalysisResultSet);
        this.setParamArrayObj(map, prefix + "AiRecognitionResultSet.", this.AiRecognitionResultSet);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "TasksNotifyMode", this.TasksNotifyMode);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

