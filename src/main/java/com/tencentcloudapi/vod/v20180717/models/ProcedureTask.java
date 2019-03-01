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
    * 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Integer ErrCode;

    /**
    * 错误信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 媒体文件 ID
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 FileId；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Id。</li>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 媒体文件名称
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 BasicInfo.Name；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Name。</li>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 媒体文件地址
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 BasicInfo.MediaUrl；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Url。</li>
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
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private MediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * 视频内容审核任务的执行状态与结果。
    */
    @SerializedName("AiContentReviewResultSet")
    @Expose
    private AiContentReviewResult [] AiContentReviewResultSet;

    /**
    * 视频内容分析任务的执行状态与结果。
    */
    @SerializedName("AiAnalysisResultSet")
    @Expose
    private AiAnalysisResult [] AiAnalysisResultSet;

    /**
    * 任务流的优先级，取值范围为 [-10, 10]。
    */
    @SerializedName("TasksPriority")
    @Expose
    private Integer TasksPriority;

    /**
    * 任务流状态变更通知模式。
<li>Finish：只有当任务流全部执行完毕时，才发起一次事件通知；</li>
<li>Change：只要任务流中每个子任务的状态发生变化，都进行事件通知；</li>
<li>None：不接受该任务流回调。</li>
    */
    @SerializedName("TasksNotifyMode")
    @Expose
    private String TasksNotifyMode;

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
     * 获取错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     * @return ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public Integer getErrCode() {
        return this.ErrCode;
    }

    /**
     * 设置错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     * @param ErrCode 错误码
<li>0：成功；</li>
<li>其他值：失败。</li>
     */
    public void setErrCode(Integer ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * 获取错误信息。
     * @return Message 错误信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置错误信息。
     * @param Message 错误信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取媒体文件 ID
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 FileId；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Id。</li>
     * @return FileId 媒体文件 ID
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 FileId；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Id。</li>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置媒体文件 ID
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 FileId；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Id。</li>
     * @param FileId 媒体文件 ID
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 FileId；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Id。</li>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取媒体文件名称
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 BasicInfo.Name；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Name。</li>
     * @return FileName 媒体文件名称
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 BasicInfo.Name；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Name。</li>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * 设置媒体文件名称
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 BasicInfo.Name；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Name。</li>
     * @param FileName 媒体文件名称
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 BasicInfo.Name；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Name。</li>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * 获取媒体文件地址
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 BasicInfo.MediaUrl；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Url。</li>
     * @return FileUrl 媒体文件地址
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 BasicInfo.MediaUrl；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Url。</li>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * 设置媒体文件地址
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 BasicInfo.MediaUrl；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Url。</li>
     * @param FileUrl 媒体文件地址
<li>若流程由 [ProcessMedia](http://139.199.214.26/document/product/266/30248) 发起，该字段表示 [MediaInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInfo) 的 BasicInfo.MediaUrl；</li>
<li>若流程由 [ProcessMediaByUrl](http://139.199.214.26/document/product/266/31058?!document=1&!preview) 发起，该字段表示 [MediaInputInfo](http://139.199.214.26/document/product/266/16694?!preview&preview_docmenu=1&lang=cn&!document=1#MediaInputInfo) 的 Url。</li>
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
     * @return MediaProcessResultSet 视频处理任务的执行状态与结果。
     */
    public MediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * 设置视频处理任务的执行状态与结果。
     * @param MediaProcessResultSet 视频处理任务的执行状态与结果。
     */
    public void setMediaProcessResultSet(MediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * 获取视频内容审核任务的执行状态与结果。
     * @return AiContentReviewResultSet 视频内容审核任务的执行状态与结果。
     */
    public AiContentReviewResult [] getAiContentReviewResultSet() {
        return this.AiContentReviewResultSet;
    }

    /**
     * 设置视频内容审核任务的执行状态与结果。
     * @param AiContentReviewResultSet 视频内容审核任务的执行状态与结果。
     */
    public void setAiContentReviewResultSet(AiContentReviewResult [] AiContentReviewResultSet) {
        this.AiContentReviewResultSet = AiContentReviewResultSet;
    }

    /**
     * 获取视频内容分析任务的执行状态与结果。
     * @return AiAnalysisResultSet 视频内容分析任务的执行状态与结果。
     */
    public AiAnalysisResult [] getAiAnalysisResultSet() {
        return this.AiAnalysisResultSet;
    }

    /**
     * 设置视频内容分析任务的执行状态与结果。
     * @param AiAnalysisResultSet 视频内容分析任务的执行状态与结果。
     */
    public void setAiAnalysisResultSet(AiAnalysisResult [] AiAnalysisResultSet) {
        this.AiAnalysisResultSet = AiAnalysisResultSet;
    }

    /**
     * 获取任务流的优先级，取值范围为 [-10, 10]。
     * @return TasksPriority 任务流的优先级，取值范围为 [-10, 10]。
     */
    public Integer getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * 设置任务流的优先级，取值范围为 [-10, 10]。
     * @param TasksPriority 任务流的优先级，取值范围为 [-10, 10]。
     */
    public void setTasksPriority(Integer TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * 获取任务流状态变更通知模式。
<li>Finish：只有当任务流全部执行完毕时，才发起一次事件通知；</li>
<li>Change：只要任务流中每个子任务的状态发生变化，都进行事件通知；</li>
<li>None：不接受该任务流回调。</li>
     * @return TasksNotifyMode 任务流状态变更通知模式。
<li>Finish：只有当任务流全部执行完毕时，才发起一次事件通知；</li>
<li>Change：只要任务流中每个子任务的状态发生变化，都进行事件通知；</li>
<li>None：不接受该任务流回调。</li>
     */
    public String getTasksNotifyMode() {
        return this.TasksNotifyMode;
    }

    /**
     * 设置任务流状态变更通知模式。
<li>Finish：只有当任务流全部执行完毕时，才发起一次事件通知；</li>
<li>Change：只要任务流中每个子任务的状态发生变化，都进行事件通知；</li>
<li>None：不接受该任务流回调。</li>
     * @param TasksNotifyMode 任务流状态变更通知模式。
<li>Finish：只有当任务流全部执行完毕时，才发起一次事件通知；</li>
<li>Change：只要任务流中每个子任务的状态发生变化，都进行事件通知；</li>
<li>None：不接受该任务流回调。</li>
     */
    public void setTasksNotifyMode(String TasksNotifyMode) {
        this.TasksNotifyMode = TasksNotifyMode;
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
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "TasksNotifyMode", this.TasksNotifyMode);

    }
}

