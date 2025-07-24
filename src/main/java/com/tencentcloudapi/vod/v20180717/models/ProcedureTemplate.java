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

public class ProcedureTemplate extends AbstractModel {

    /**
    * 任务流名字。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务流模板类型，取值范围：
<li>Preset：系统预置任务流模板；</li>
<li>Custom：用户自定义任务流模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * AI 智能审核类型任务参数 \*。
<font color=red>\*：该参数用于发起旧版审核，不建议使用。推荐使用 ReviewAudioVideoTask 参数发起审核。</font> 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * AI 智能内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * AI 内容识别类型任务参数。
    */
    @SerializedName("AiRecognitionTaskSet")
    @Expose
    private AiRecognitionTaskInput [] AiRecognitionTaskSet;

    /**
    * 该参数已不推荐使用，建议使用 AiRecognitionTaskSet。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * 微信小程序发布任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniProgramPublishTask")
    @Expose
    private WechatMiniProgramPublishTaskInput MiniProgramPublishTask;

    /**
    * 音视频审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReviewAudioVideoTask")
    @Expose
    private ProcedureReviewAudioVideoTaskInput ReviewAudioVideoTask;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 任务流名字。 
     * @return Name 任务流名字。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务流名字。
     * @param Name 任务流名字。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务流模板类型，取值范围：
<li>Preset：系统预置任务流模板；</li>
<li>Custom：用户自定义任务流模板。</li> 
     * @return Type 任务流模板类型，取值范围：
<li>Preset：系统预置任务流模板；</li>
<li>Custom：用户自定义任务流模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务流模板类型，取值范围：
<li>Preset：系统预置任务流模板；</li>
<li>Custom：用户自定义任务流模板。</li>
     * @param Type 任务流模板类型，取值范围：
<li>Preset：系统预置任务流模板；</li>
<li>Custom：用户自定义任务流模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaProcessTask 视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set 视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaProcessTask 视频处理类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get AI 智能审核类型任务参数 \*。
<font color=red>\*：该参数用于发起旧版审核，不建议使用。推荐使用 ReviewAudioVideoTask 参数发起审核。</font> 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiContentReviewTask AI 智能审核类型任务参数 \*。
<font color=red>\*：该参数用于发起旧版审核，不建议使用。推荐使用 ReviewAudioVideoTask 参数发起审核。</font> 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set AI 智能审核类型任务参数 \*。
<font color=red>\*：该参数用于发起旧版审核，不建议使用。推荐使用 ReviewAudioVideoTask 参数发起审核。</font> 
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiContentReviewTask AI 智能审核类型任务参数 \*。
<font color=red>\*：该参数用于发起旧版审核，不建议使用。推荐使用 ReviewAudioVideoTask 参数发起审核。</font> 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get AI 智能内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiAnalysisTask AI 智能内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set AI 智能内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiAnalysisTask AI 智能内容分析类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get AI 内容识别类型任务参数。 
     * @return AiRecognitionTaskSet AI 内容识别类型任务参数。
     */
    public AiRecognitionTaskInput [] getAiRecognitionTaskSet() {
        return this.AiRecognitionTaskSet;
    }

    /**
     * Set AI 内容识别类型任务参数。
     * @param AiRecognitionTaskSet AI 内容识别类型任务参数。
     */
    public void setAiRecognitionTaskSet(AiRecognitionTaskInput [] AiRecognitionTaskSet) {
        this.AiRecognitionTaskSet = AiRecognitionTaskSet;
    }

    /**
     * Get 该参数已不推荐使用，建议使用 AiRecognitionTaskSet。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiRecognitionTask 该参数已不推荐使用，建议使用 AiRecognitionTaskSet。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set 该参数已不推荐使用，建议使用 AiRecognitionTaskSet。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiRecognitionTask 该参数已不推荐使用，建议使用 AiRecognitionTaskSet。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get 微信小程序发布任务参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniProgramPublishTask 微信小程序发布任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WechatMiniProgramPublishTaskInput getMiniProgramPublishTask() {
        return this.MiniProgramPublishTask;
    }

    /**
     * Set 微信小程序发布任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniProgramPublishTask 微信小程序发布任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniProgramPublishTask(WechatMiniProgramPublishTaskInput MiniProgramPublishTask) {
        this.MiniProgramPublishTask = MiniProgramPublishTask;
    }

    /**
     * Get 音视频审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReviewAudioVideoTask 音视频审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProcedureReviewAudioVideoTaskInput getReviewAudioVideoTask() {
        return this.ReviewAudioVideoTask;
    }

    /**
     * Set 音视频审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReviewAudioVideoTask 音视频审核类型任务参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewAudioVideoTask(ProcedureReviewAudioVideoTaskInput ReviewAudioVideoTask) {
        this.ReviewAudioVideoTask = ReviewAudioVideoTask;
    }

    /**
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ProcedureTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcedureTemplate(ProcedureTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.AiRecognitionTaskSet != null) {
            this.AiRecognitionTaskSet = new AiRecognitionTaskInput[source.AiRecognitionTaskSet.length];
            for (int i = 0; i < source.AiRecognitionTaskSet.length; i++) {
                this.AiRecognitionTaskSet[i] = new AiRecognitionTaskInput(source.AiRecognitionTaskSet[i]);
            }
        }
        if (source.AiRecognitionTask != null) {
            this.AiRecognitionTask = new AiRecognitionTaskInput(source.AiRecognitionTask);
        }
        if (source.MiniProgramPublishTask != null) {
            this.MiniProgramPublishTask = new WechatMiniProgramPublishTaskInput(source.MiniProgramPublishTask);
        }
        if (source.ReviewAudioVideoTask != null) {
            this.ReviewAudioVideoTask = new ProcedureReviewAudioVideoTaskInput(source.ReviewAudioVideoTask);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamArrayObj(map, prefix + "AiRecognitionTaskSet.", this.AiRecognitionTaskSet);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "MiniProgramPublishTask.", this.MiniProgramPublishTask);
        this.setParamObj(map, prefix + "ReviewAudioVideoTask.", this.ReviewAudioVideoTask);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

