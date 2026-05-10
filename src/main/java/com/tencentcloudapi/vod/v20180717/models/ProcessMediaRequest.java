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

public class ProcessMediaRequest extends AbstractModel {

    /**
    * <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。<br>FileId和MediaStoragePath必须提供其中一个。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>媒体的存储路径。<br>只有<a href="https://cloud.tencent.com/document/product/266/126825">FileID + Path 模式</a>的子应用可以通过MediaStoragePath发起任务。<br>FileId和MediaStoragePath必须提供其中一个。</p>
    */
    @SerializedName("MediaStoragePath")
    @Expose
    private String MediaStoragePath;

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>视频处理类型任务参数。</p>
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * <p>音视频内容审核类型任务参数 *。<br><font color="red">* 不建议使用</font>，推荐使用 <a href="https://cloud.tencent.com/document/api/266/80283">音视频审核(ReviewAudioVideo)</a> 或 <a href="https://cloud.tencent.com/document/api/266/73217">图片审核(ReviewImage)</a>。</p>
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * <p>音视频内容分析类型任务参数。</p>
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * <p>音视频内容识别类型任务参数。</p>
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * <p>任务流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * <p>任务流状态变更通知模式，可取值有 Finish，Change 和 None，不填代表 Finish。</p>
    */
    @SerializedName("TasksNotifyMode")
    @Expose
    private String TasksNotifyMode;

    /**
    * <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>保留字段，特殊用途时使用。</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * <p>FileID为空时有效，拉取Url生成新媒资产生新FileID，媒体处理产物将作为新媒资的附属产物。</p><p>注意：新媒资会产生存储费用</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。<br>FileId和MediaStoragePath必须提供其中一个。</p> 
     * @return FileId <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。<br>FileId和MediaStoragePath必须提供其中一个。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。<br>FileId和MediaStoragePath必须提供其中一个。</p>
     * @param FileId <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。<br>FileId和MediaStoragePath必须提供其中一个。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>媒体的存储路径。<br>只有<a href="https://cloud.tencent.com/document/product/266/126825">FileID + Path 模式</a>的子应用可以通过MediaStoragePath发起任务。<br>FileId和MediaStoragePath必须提供其中一个。</p> 
     * @return MediaStoragePath <p>媒体的存储路径。<br>只有<a href="https://cloud.tencent.com/document/product/266/126825">FileID + Path 模式</a>的子应用可以通过MediaStoragePath发起任务。<br>FileId和MediaStoragePath必须提供其中一个。</p>
     */
    public String getMediaStoragePath() {
        return this.MediaStoragePath;
    }

    /**
     * Set <p>媒体的存储路径。<br>只有<a href="https://cloud.tencent.com/document/product/266/126825">FileID + Path 模式</a>的子应用可以通过MediaStoragePath发起任务。<br>FileId和MediaStoragePath必须提供其中一个。</p>
     * @param MediaStoragePath <p>媒体的存储路径。<br>只有<a href="https://cloud.tencent.com/document/product/266/126825">FileID + Path 模式</a>的子应用可以通过MediaStoragePath发起任务。<br>FileId和MediaStoragePath必须提供其中一个。</p>
     */
    public void setMediaStoragePath(String MediaStoragePath) {
        this.MediaStoragePath = MediaStoragePath;
    }

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>视频处理类型任务参数。</p> 
     * @return MediaProcessTask <p>视频处理类型任务参数。</p>
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set <p>视频处理类型任务参数。</p>
     * @param MediaProcessTask <p>视频处理类型任务参数。</p>
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get <p>音视频内容审核类型任务参数 *。<br><font color="red">* 不建议使用</font>，推荐使用 <a href="https://cloud.tencent.com/document/api/266/80283">音视频审核(ReviewAudioVideo)</a> 或 <a href="https://cloud.tencent.com/document/api/266/73217">图片审核(ReviewImage)</a>。</p> 
     * @return AiContentReviewTask <p>音视频内容审核类型任务参数 *。<br><font color="red">* 不建议使用</font>，推荐使用 <a href="https://cloud.tencent.com/document/api/266/80283">音视频审核(ReviewAudioVideo)</a> 或 <a href="https://cloud.tencent.com/document/api/266/73217">图片审核(ReviewImage)</a>。</p>
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set <p>音视频内容审核类型任务参数 *。<br><font color="red">* 不建议使用</font>，推荐使用 <a href="https://cloud.tencent.com/document/api/266/80283">音视频审核(ReviewAudioVideo)</a> 或 <a href="https://cloud.tencent.com/document/api/266/73217">图片审核(ReviewImage)</a>。</p>
     * @param AiContentReviewTask <p>音视频内容审核类型任务参数 *。<br><font color="red">* 不建议使用</font>，推荐使用 <a href="https://cloud.tencent.com/document/api/266/80283">音视频审核(ReviewAudioVideo)</a> 或 <a href="https://cloud.tencent.com/document/api/266/73217">图片审核(ReviewImage)</a>。</p>
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get <p>音视频内容分析类型任务参数。</p> 
     * @return AiAnalysisTask <p>音视频内容分析类型任务参数。</p>
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set <p>音视频内容分析类型任务参数。</p>
     * @param AiAnalysisTask <p>音视频内容分析类型任务参数。</p>
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get <p>音视频内容识别类型任务参数。</p> 
     * @return AiRecognitionTask <p>音视频内容识别类型任务参数。</p>
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set <p>音视频内容识别类型任务参数。</p>
     * @param AiRecognitionTask <p>音视频内容识别类型任务参数。</p>
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get <p>任务流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p> 
     * @return TasksPriority <p>任务流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>任务流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     * @param TasksPriority <p>任务流的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get <p>任务流状态变更通知模式，可取值有 Finish，Change 和 None，不填代表 Finish。</p> 
     * @return TasksNotifyMode <p>任务流状态变更通知模式，可取值有 Finish，Change 和 None，不填代表 Finish。</p>
     */
    public String getTasksNotifyMode() {
        return this.TasksNotifyMode;
    }

    /**
     * Set <p>任务流状态变更通知模式，可取值有 Finish，Change 和 None，不填代表 Finish。</p>
     * @param TasksNotifyMode <p>任务流状态变更通知模式，可取值有 Finish，Change 和 None，不填代表 Finish。</p>
     */
    public void setTasksNotifyMode(String TasksNotifyMode) {
        this.TasksNotifyMode = TasksNotifyMode;
    }

    /**
     * Get <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p> 
     * @return SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     * @param SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>保留字段，特殊用途时使用。</p> 
     * @return ExtInfo <p>保留字段，特殊用途时使用。</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>保留字段，特殊用途时使用。</p>
     * @param ExtInfo <p>保留字段，特殊用途时使用。</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get <p>FileID为空时有效，拉取Url生成新媒资产生新FileID，媒体处理产物将作为新媒资的附属产物。</p><p>注意：新媒资会产生存储费用</p> 
     * @return Url <p>FileID为空时有效，拉取Url生成新媒资产生新FileID，媒体处理产物将作为新媒资的附属产物。</p><p>注意：新媒资会产生存储费用</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>FileID为空时有效，拉取Url生成新媒资产生新FileID，媒体处理产物将作为新媒资的附属产物。</p><p>注意：新媒资会产生存储费用</p>
     * @param Url <p>FileID为空时有效，拉取Url生成新媒资产生新FileID，媒体处理产物将作为新媒资的附属产物。</p><p>注意：新媒资会产生存储费用</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public ProcessMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMediaRequest(ProcessMediaRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.MediaStoragePath != null) {
            this.MediaStoragePath = new String(source.MediaStoragePath);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.MediaProcessTask != null) {
            this.MediaProcessTask = new MediaProcessTaskInput(source.MediaProcessTask);
        }
        if (source.AiContentReviewTask != null) {
            this.AiContentReviewTask = new AiContentReviewTaskInput(source.AiContentReviewTask);
        }
        if (source.AiAnalysisTask != null) {
            this.AiAnalysisTask = new AiAnalysisTaskInput(source.AiAnalysisTask);
        }
        if (source.AiRecognitionTask != null) {
            this.AiRecognitionTask = new AiRecognitionTaskInput(source.AiRecognitionTask);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.TasksNotifyMode != null) {
            this.TasksNotifyMode = new String(source.TasksNotifyMode);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "MediaStoragePath", this.MediaStoragePath);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "TasksNotifyMode", this.TasksNotifyMode);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

