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

public class CreateProcedureTemplateRequest extends AbstractModel{

    /**
    * 任务流名字（支持中文，不超过20个字）。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 视频处理类型任务参数。
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * AI 内容审核类型任务参数 \*。
<font color=red>\*：该参数用于发起旧版审核，不建议使用。推荐使用 ReviewAudioVideoTask 参数发起审核。</font> 
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * AI 内容分析类型任务参数。
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * AI 内容识别类型任务参数。
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * 音视频审核类型任务参数。
    */
    @SerializedName("ReviewAudioVideoTask")
    @Expose
    private ProcedureReviewAudioVideoTaskInput ReviewAudioVideoTask;

    /**
     * Get 任务流名字（支持中文，不超过20个字）。 
     * @return Name 任务流名字（支持中文，不超过20个字）。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务流名字（支持中文，不超过20个字）。
     * @param Name 任务流名字（支持中文，不超过20个字）。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b> 
     * @return SubAppId <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     * @param SubAppId <b>点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 模板描述信息，长度限制：256 个字符。 
     * @return Comment 模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制：256 个字符。
     * @param Comment 模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 视频处理类型任务参数。 
     * @return MediaProcessTask 视频处理类型任务参数。
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set 视频处理类型任务参数。
     * @param MediaProcessTask 视频处理类型任务参数。
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get AI 内容审核类型任务参数 \*。
<font color=red>\*：该参数用于发起旧版审核，不建议使用。推荐使用 ReviewAudioVideoTask 参数发起审核。</font>  
     * @return AiContentReviewTask AI 内容审核类型任务参数 \*。
<font color=red>\*：该参数用于发起旧版审核，不建议使用。推荐使用 ReviewAudioVideoTask 参数发起审核。</font> 
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set AI 内容审核类型任务参数 \*。
<font color=red>\*：该参数用于发起旧版审核，不建议使用。推荐使用 ReviewAudioVideoTask 参数发起审核。</font> 
     * @param AiContentReviewTask AI 内容审核类型任务参数 \*。
<font color=red>\*：该参数用于发起旧版审核，不建议使用。推荐使用 ReviewAudioVideoTask 参数发起审核。</font> 
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get AI 内容分析类型任务参数。 
     * @return AiAnalysisTask AI 内容分析类型任务参数。
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set AI 内容分析类型任务参数。
     * @param AiAnalysisTask AI 内容分析类型任务参数。
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get AI 内容识别类型任务参数。 
     * @return AiRecognitionTask AI 内容识别类型任务参数。
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set AI 内容识别类型任务参数。
     * @param AiRecognitionTask AI 内容识别类型任务参数。
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get 音视频审核类型任务参数。 
     * @return ReviewAudioVideoTask 音视频审核类型任务参数。
     */
    public ProcedureReviewAudioVideoTaskInput getReviewAudioVideoTask() {
        return this.ReviewAudioVideoTask;
    }

    /**
     * Set 音视频审核类型任务参数。
     * @param ReviewAudioVideoTask 音视频审核类型任务参数。
     */
    public void setReviewAudioVideoTask(ProcedureReviewAudioVideoTaskInput ReviewAudioVideoTask) {
        this.ReviewAudioVideoTask = ReviewAudioVideoTask;
    }

    public CreateProcedureTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProcedureTemplateRequest(CreateProcedureTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
        if (source.ReviewAudioVideoTask != null) {
            this.ReviewAudioVideoTask = new ProcedureReviewAudioVideoTaskInput(source.ReviewAudioVideoTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "ReviewAudioVideoTask.", this.ReviewAudioVideoTask);

    }
}

