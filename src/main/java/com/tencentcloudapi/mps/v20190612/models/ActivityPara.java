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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivityPara extends AbstractModel{

    /**
    * 视频转码任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeTask")
    @Expose
    private TranscodeTaskInput TranscodeTask;

    /**
    * 视频转动图任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private AnimatedGraphicTaskInput AnimatedGraphicTask;

    /**
    * 视频按时间点截图任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private SnapshotByTimeOffsetTaskInput SnapshotByTimeOffsetTask;

    /**
    * 视频采样截图任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private SampleSnapshotTaskInput SampleSnapshotTask;

    /**
    * 视频截雪碧图任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private ImageSpriteTaskInput ImageSpriteTask;

    /**
    * 转自适应码流任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private AdaptiveDynamicStreamingTaskInput AdaptiveDynamicStreamingTask;

    /**
    * 视频内容审核类型任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * 视频内容分析类型任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * 视频内容识别类型任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
     * Get 视频转码任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeTask 视频转码任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TranscodeTaskInput getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set 视频转码任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeTask 视频转码任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeTask(TranscodeTaskInput TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get 视频转动图任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnimatedGraphicTask 视频转动图任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnimatedGraphicTaskInput getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set 视频转动图任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnimatedGraphicTask 视频转动图任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnimatedGraphicTask(AnimatedGraphicTaskInput AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get 视频按时间点截图任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotByTimeOffsetTask 视频按时间点截图任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SnapshotByTimeOffsetTaskInput getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set 视频按时间点截图任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetTask 视频按时间点截图任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetTask(SnapshotByTimeOffsetTaskInput SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get 视频采样截图任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleSnapshotTask 视频采样截图任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SampleSnapshotTaskInput getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set 视频采样截图任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleSnapshotTask 视频采样截图任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleSnapshotTask(SampleSnapshotTaskInput SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get 视频截雪碧图任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageSpriteTask 视频截雪碧图任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageSpriteTaskInput getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set 视频截雪碧图任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSpriteTask 视频截雪碧图任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSpriteTask(ImageSpriteTaskInput ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get 转自适应码流任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdaptiveDynamicStreamingTask 转自适应码流任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdaptiveDynamicStreamingTaskInput getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set 转自适应码流任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdaptiveDynamicStreamingTask 转自适应码流任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdaptiveDynamicStreamingTask(AdaptiveDynamicStreamingTaskInput AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    /**
     * Get 视频内容审核类型任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiContentReviewTask 视频内容审核类型任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set 视频内容审核类型任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiContentReviewTask 视频内容审核类型任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get 视频内容分析类型任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiAnalysisTask 视频内容分析类型任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set 视频内容分析类型任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiAnalysisTask 视频内容分析类型任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get 视频内容识别类型任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiRecognitionTask 视频内容识别类型任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set 视频内容识别类型任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiRecognitionTask 视频内容识别类型任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    public ActivityPara() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityPara(ActivityPara source) {
        if (source.TranscodeTask != null) {
            this.TranscodeTask = new TranscodeTaskInput(source.TranscodeTask);
        }
        if (source.AnimatedGraphicTask != null) {
            this.AnimatedGraphicTask = new AnimatedGraphicTaskInput(source.AnimatedGraphicTask);
        }
        if (source.SnapshotByTimeOffsetTask != null) {
            this.SnapshotByTimeOffsetTask = new SnapshotByTimeOffsetTaskInput(source.SnapshotByTimeOffsetTask);
        }
        if (source.SampleSnapshotTask != null) {
            this.SampleSnapshotTask = new SampleSnapshotTaskInput(source.SampleSnapshotTask);
        }
        if (source.ImageSpriteTask != null) {
            this.ImageSpriteTask = new ImageSpriteTaskInput(source.ImageSpriteTask);
        }
        if (source.AdaptiveDynamicStreamingTask != null) {
            this.AdaptiveDynamicStreamingTask = new AdaptiveDynamicStreamingTaskInput(source.AdaptiveDynamicStreamingTask);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TranscodeTask.", this.TranscodeTask);
        this.setParamObj(map, prefix + "AnimatedGraphicTask.", this.AnimatedGraphicTask);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetTask.", this.SnapshotByTimeOffsetTask);
        this.setParamObj(map, prefix + "SampleSnapshotTask.", this.SampleSnapshotTask);
        this.setParamObj(map, prefix + "ImageSpriteTask.", this.ImageSpriteTask);
        this.setParamObj(map, prefix + "AdaptiveDynamicStreamingTask.", this.AdaptiveDynamicStreamingTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);

    }
}

