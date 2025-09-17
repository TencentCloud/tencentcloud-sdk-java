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

public class AiAnalysisResult extends AbstractModel {

    /**
    * 任务的类型，可以取的值有：
<li>Classification：智能分类</li>
<li>Cover：智能封面</li>
<li>Tag：智能标签</li>
<li>FrameTag：智能按帧标签</li>
<li>Highlight：智能精彩集锦</li>
<li>DeLogo：智能擦除</li>
<li>Description：大模型摘要</li>
<li>Dubbing：智能译制</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 视频内容分析智能分类任务的查询结果，当任务类型为 Classification 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassificationTask")
    @Expose
    private AiAnalysisTaskClassificationResult ClassificationTask;

    /**
    * 视频内容分析智能封面任务的查询结果，当任务类型为 Cover 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverTask")
    @Expose
    private AiAnalysisTaskCoverResult CoverTask;

    /**
    * 视频内容分析智能标签任务的查询结果，当任务类型为 Tag 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagTask")
    @Expose
    private AiAnalysisTaskTagResult TagTask;

    /**
    * 视频内容分析智能按帧标签任务的查询结果，当任务类型为 FrameTag 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameTagTask")
    @Expose
    private AiAnalysisTaskFrameTagResult FrameTagTask;

    /**
    * 视频内容分析集锦任务的查询结果，当任务类型为 Highlight时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighlightTask")
    @Expose
    private AiAnalysisTaskHighlightResult HighlightTask;

    /**
    * 视频内容分析智能擦除任务的查询结果，当任务类型为 DeLogo 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeLogoTask")
    @Expose
    private AiAnalysisTaskDelLogoResult DeLogoTask;

    /**
    * 视频内容分析拆条任务的查询结果，当任务类型为 SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentTask")
    @Expose
    private AiAnalysisTaskSegmentResult SegmentTask;

    /**
    * 视频内容分析片头片尾任务的查询结果，当任务类型为 HeadTailRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadTailTask")
    @Expose
    private AiAnalysisTaskHeadTailResult HeadTailTask;

    /**
    * 视频内容分析摘要任务的查询结果，当任务类型为 Description 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DescriptionTask")
    @Expose
    private AiAnalysisTaskDescriptionResult DescriptionTask;

    /**
    * 视频内容分析横转竖任务的查询结果，当任务类型为 HorizontalToVertical 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HorizontalToVerticalTask")
    @Expose
    private AiAnalysisTaskHorizontalToVerticalResult HorizontalToVerticalTask;

    /**
    * 视频内容分析译制任务的查询结果，当任务类型为 Dubbing 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DubbingTask")
    @Expose
    private AiAnalysisTaskDubbingResult DubbingTask;

    /**
     * Get 任务的类型，可以取的值有：
<li>Classification：智能分类</li>
<li>Cover：智能封面</li>
<li>Tag：智能标签</li>
<li>FrameTag：智能按帧标签</li>
<li>Highlight：智能精彩集锦</li>
<li>DeLogo：智能擦除</li>
<li>Description：大模型摘要</li>
<li>Dubbing：智能译制</li> 
     * @return Type 任务的类型，可以取的值有：
<li>Classification：智能分类</li>
<li>Cover：智能封面</li>
<li>Tag：智能标签</li>
<li>FrameTag：智能按帧标签</li>
<li>Highlight：智能精彩集锦</li>
<li>DeLogo：智能擦除</li>
<li>Description：大模型摘要</li>
<li>Dubbing：智能译制</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务的类型，可以取的值有：
<li>Classification：智能分类</li>
<li>Cover：智能封面</li>
<li>Tag：智能标签</li>
<li>FrameTag：智能按帧标签</li>
<li>Highlight：智能精彩集锦</li>
<li>DeLogo：智能擦除</li>
<li>Description：大模型摘要</li>
<li>Dubbing：智能译制</li>
     * @param Type 任务的类型，可以取的值有：
<li>Classification：智能分类</li>
<li>Cover：智能封面</li>
<li>Tag：智能标签</li>
<li>FrameTag：智能按帧标签</li>
<li>Highlight：智能精彩集锦</li>
<li>DeLogo：智能擦除</li>
<li>Description：大模型摘要</li>
<li>Dubbing：智能译制</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 视频内容分析智能分类任务的查询结果，当任务类型为 Classification 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassificationTask 视频内容分析智能分类任务的查询结果，当任务类型为 Classification 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskClassificationResult getClassificationTask() {
        return this.ClassificationTask;
    }

    /**
     * Set 视频内容分析智能分类任务的查询结果，当任务类型为 Classification 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassificationTask 视频内容分析智能分类任务的查询结果，当任务类型为 Classification 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassificationTask(AiAnalysisTaskClassificationResult ClassificationTask) {
        this.ClassificationTask = ClassificationTask;
    }

    /**
     * Get 视频内容分析智能封面任务的查询结果，当任务类型为 Cover 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverTask 视频内容分析智能封面任务的查询结果，当任务类型为 Cover 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskCoverResult getCoverTask() {
        return this.CoverTask;
    }

    /**
     * Set 视频内容分析智能封面任务的查询结果，当任务类型为 Cover 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverTask 视频内容分析智能封面任务的查询结果，当任务类型为 Cover 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverTask(AiAnalysisTaskCoverResult CoverTask) {
        this.CoverTask = CoverTask;
    }

    /**
     * Get 视频内容分析智能标签任务的查询结果，当任务类型为 Tag 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagTask 视频内容分析智能标签任务的查询结果，当任务类型为 Tag 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskTagResult getTagTask() {
        return this.TagTask;
    }

    /**
     * Set 视频内容分析智能标签任务的查询结果，当任务类型为 Tag 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagTask 视频内容分析智能标签任务的查询结果，当任务类型为 Tag 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagTask(AiAnalysisTaskTagResult TagTask) {
        this.TagTask = TagTask;
    }

    /**
     * Get 视频内容分析智能按帧标签任务的查询结果，当任务类型为 FrameTag 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameTagTask 视频内容分析智能按帧标签任务的查询结果，当任务类型为 FrameTag 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskFrameTagResult getFrameTagTask() {
        return this.FrameTagTask;
    }

    /**
     * Set 视频内容分析智能按帧标签任务的查询结果，当任务类型为 FrameTag 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameTagTask 视频内容分析智能按帧标签任务的查询结果，当任务类型为 FrameTag 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameTagTask(AiAnalysisTaskFrameTagResult FrameTagTask) {
        this.FrameTagTask = FrameTagTask;
    }

    /**
     * Get 视频内容分析集锦任务的查询结果，当任务类型为 Highlight时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighlightTask 视频内容分析集锦任务的查询结果，当任务类型为 Highlight时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskHighlightResult getHighlightTask() {
        return this.HighlightTask;
    }

    /**
     * Set 视频内容分析集锦任务的查询结果，当任务类型为 Highlight时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighlightTask 视频内容分析集锦任务的查询结果，当任务类型为 Highlight时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighlightTask(AiAnalysisTaskHighlightResult HighlightTask) {
        this.HighlightTask = HighlightTask;
    }

    /**
     * Get 视频内容分析智能擦除任务的查询结果，当任务类型为 DeLogo 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeLogoTask 视频内容分析智能擦除任务的查询结果，当任务类型为 DeLogo 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskDelLogoResult getDeLogoTask() {
        return this.DeLogoTask;
    }

    /**
     * Set 视频内容分析智能擦除任务的查询结果，当任务类型为 DeLogo 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeLogoTask 视频内容分析智能擦除任务的查询结果，当任务类型为 DeLogo 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeLogoTask(AiAnalysisTaskDelLogoResult DeLogoTask) {
        this.DeLogoTask = DeLogoTask;
    }

    /**
     * Get 视频内容分析拆条任务的查询结果，当任务类型为 SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentTask 视频内容分析拆条任务的查询结果，当任务类型为 SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskSegmentResult getSegmentTask() {
        return this.SegmentTask;
    }

    /**
     * Set 视频内容分析拆条任务的查询结果，当任务类型为 SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentTask 视频内容分析拆条任务的查询结果，当任务类型为 SegmentRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentTask(AiAnalysisTaskSegmentResult SegmentTask) {
        this.SegmentTask = SegmentTask;
    }

    /**
     * Get 视频内容分析片头片尾任务的查询结果，当任务类型为 HeadTailRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadTailTask 视频内容分析片头片尾任务的查询结果，当任务类型为 HeadTailRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskHeadTailResult getHeadTailTask() {
        return this.HeadTailTask;
    }

    /**
     * Set 视频内容分析片头片尾任务的查询结果，当任务类型为 HeadTailRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadTailTask 视频内容分析片头片尾任务的查询结果，当任务类型为 HeadTailRecognition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadTailTask(AiAnalysisTaskHeadTailResult HeadTailTask) {
        this.HeadTailTask = HeadTailTask;
    }

    /**
     * Get 视频内容分析摘要任务的查询结果，当任务类型为 Description 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DescriptionTask 视频内容分析摘要任务的查询结果，当任务类型为 Description 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskDescriptionResult getDescriptionTask() {
        return this.DescriptionTask;
    }

    /**
     * Set 视频内容分析摘要任务的查询结果，当任务类型为 Description 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DescriptionTask 视频内容分析摘要任务的查询结果，当任务类型为 Description 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescriptionTask(AiAnalysisTaskDescriptionResult DescriptionTask) {
        this.DescriptionTask = DescriptionTask;
    }

    /**
     * Get 视频内容分析横转竖任务的查询结果，当任务类型为 HorizontalToVertical 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HorizontalToVerticalTask 视频内容分析横转竖任务的查询结果，当任务类型为 HorizontalToVertical 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskHorizontalToVerticalResult getHorizontalToVerticalTask() {
        return this.HorizontalToVerticalTask;
    }

    /**
     * Set 视频内容分析横转竖任务的查询结果，当任务类型为 HorizontalToVertical 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HorizontalToVerticalTask 视频内容分析横转竖任务的查询结果，当任务类型为 HorizontalToVertical 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHorizontalToVerticalTask(AiAnalysisTaskHorizontalToVerticalResult HorizontalToVerticalTask) {
        this.HorizontalToVerticalTask = HorizontalToVerticalTask;
    }

    /**
     * Get 视频内容分析译制任务的查询结果，当任务类型为 Dubbing 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DubbingTask 视频内容分析译制任务的查询结果，当任务类型为 Dubbing 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskDubbingResult getDubbingTask() {
        return this.DubbingTask;
    }

    /**
     * Set 视频内容分析译制任务的查询结果，当任务类型为 Dubbing 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DubbingTask 视频内容分析译制任务的查询结果，当任务类型为 Dubbing 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDubbingTask(AiAnalysisTaskDubbingResult DubbingTask) {
        this.DubbingTask = DubbingTask;
    }

    public AiAnalysisResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisResult(AiAnalysisResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClassificationTask != null) {
            this.ClassificationTask = new AiAnalysisTaskClassificationResult(source.ClassificationTask);
        }
        if (source.CoverTask != null) {
            this.CoverTask = new AiAnalysisTaskCoverResult(source.CoverTask);
        }
        if (source.TagTask != null) {
            this.TagTask = new AiAnalysisTaskTagResult(source.TagTask);
        }
        if (source.FrameTagTask != null) {
            this.FrameTagTask = new AiAnalysisTaskFrameTagResult(source.FrameTagTask);
        }
        if (source.HighlightTask != null) {
            this.HighlightTask = new AiAnalysisTaskHighlightResult(source.HighlightTask);
        }
        if (source.DeLogoTask != null) {
            this.DeLogoTask = new AiAnalysisTaskDelLogoResult(source.DeLogoTask);
        }
        if (source.SegmentTask != null) {
            this.SegmentTask = new AiAnalysisTaskSegmentResult(source.SegmentTask);
        }
        if (source.HeadTailTask != null) {
            this.HeadTailTask = new AiAnalysisTaskHeadTailResult(source.HeadTailTask);
        }
        if (source.DescriptionTask != null) {
            this.DescriptionTask = new AiAnalysisTaskDescriptionResult(source.DescriptionTask);
        }
        if (source.HorizontalToVerticalTask != null) {
            this.HorizontalToVerticalTask = new AiAnalysisTaskHorizontalToVerticalResult(source.HorizontalToVerticalTask);
        }
        if (source.DubbingTask != null) {
            this.DubbingTask = new AiAnalysisTaskDubbingResult(source.DubbingTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "ClassificationTask.", this.ClassificationTask);
        this.setParamObj(map, prefix + "CoverTask.", this.CoverTask);
        this.setParamObj(map, prefix + "TagTask.", this.TagTask);
        this.setParamObj(map, prefix + "FrameTagTask.", this.FrameTagTask);
        this.setParamObj(map, prefix + "HighlightTask.", this.HighlightTask);
        this.setParamObj(map, prefix + "DeLogoTask.", this.DeLogoTask);
        this.setParamObj(map, prefix + "SegmentTask.", this.SegmentTask);
        this.setParamObj(map, prefix + "HeadTailTask.", this.HeadTailTask);
        this.setParamObj(map, prefix + "DescriptionTask.", this.DescriptionTask);
        this.setParamObj(map, prefix + "HorizontalToVerticalTask.", this.HorizontalToVerticalTask);
        this.setParamObj(map, prefix + "DubbingTask.", this.DubbingTask);

    }
}

