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

public class MediaProcessTaskInput  extends AbstractModel{

    /**
    * 视频转码任务列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeTaskSet")
    @Expose
    private TranscodeTaskInput [] TranscodeTaskSet;

    /**
    * 视频转动图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnimatedGraphicTaskSet")
    @Expose
    private AnimatedGraphicTaskInput [] AnimatedGraphicTaskSet;

    /**
    * 对视频按时间点截图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetTaskSet")
    @Expose
    private SnapshotByTimeOffsetTaskInput [] SnapshotByTimeOffsetTaskSet;

    /**
    * 对视频采样截图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleSnapshotTaskSet")
    @Expose
    private SampleSnapshotTaskInput [] SampleSnapshotTaskSet;

    /**
    * 对视频截雪碧图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSpriteTaskSet")
    @Expose
    private ImageSpriteTaskInput [] ImageSpriteTaskSet;

    /**
    * 对视频截图做封面任务列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverBySnapshotTaskSet")
    @Expose
    private CoverBySnapshotTaskInput [] CoverBySnapshotTaskSet;

    /**
    * 对视频转自适应码流任务列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdaptiveDynamicStreamingTaskSet")
    @Expose
    private AdaptiveDynamicStreamingTaskInput [] AdaptiveDynamicStreamingTaskSet;

    /**
     * 获取视频转码任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TranscodeTaskSet 视频转码任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TranscodeTaskInput [] getTranscodeTaskSet() {
        return this.TranscodeTaskSet;
    }

    /**
     * 设置视频转码任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeTaskSet 视频转码任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeTaskSet(TranscodeTaskInput [] TranscodeTaskSet) {
        this.TranscodeTaskSet = TranscodeTaskSet;
    }

    /**
     * 获取视频转动图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AnimatedGraphicTaskSet 视频转动图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnimatedGraphicTaskInput [] getAnimatedGraphicTaskSet() {
        return this.AnimatedGraphicTaskSet;
    }

    /**
     * 设置视频转动图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnimatedGraphicTaskSet 视频转动图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnimatedGraphicTaskSet(AnimatedGraphicTaskInput [] AnimatedGraphicTaskSet) {
        this.AnimatedGraphicTaskSet = AnimatedGraphicTaskSet;
    }

    /**
     * 获取对视频按时间点截图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SnapshotByTimeOffsetTaskSet 对视频按时间点截图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SnapshotByTimeOffsetTaskInput [] getSnapshotByTimeOffsetTaskSet() {
        return this.SnapshotByTimeOffsetTaskSet;
    }

    /**
     * 设置对视频按时间点截图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetTaskSet 对视频按时间点截图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetTaskSet(SnapshotByTimeOffsetTaskInput [] SnapshotByTimeOffsetTaskSet) {
        this.SnapshotByTimeOffsetTaskSet = SnapshotByTimeOffsetTaskSet;
    }

    /**
     * 获取对视频采样截图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SampleSnapshotTaskSet 对视频采样截图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SampleSnapshotTaskInput [] getSampleSnapshotTaskSet() {
        return this.SampleSnapshotTaskSet;
    }

    /**
     * 设置对视频采样截图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleSnapshotTaskSet 对视频采样截图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleSnapshotTaskSet(SampleSnapshotTaskInput [] SampleSnapshotTaskSet) {
        this.SampleSnapshotTaskSet = SampleSnapshotTaskSet;
    }

    /**
     * 获取对视频截雪碧图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ImageSpriteTaskSet 对视频截雪碧图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageSpriteTaskInput [] getImageSpriteTaskSet() {
        return this.ImageSpriteTaskSet;
    }

    /**
     * 设置对视频截雪碧图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSpriteTaskSet 对视频截雪碧图任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSpriteTaskSet(ImageSpriteTaskInput [] ImageSpriteTaskSet) {
        this.ImageSpriteTaskSet = ImageSpriteTaskSet;
    }

    /**
     * 获取对视频截图做封面任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return CoverBySnapshotTaskSet 对视频截图做封面任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CoverBySnapshotTaskInput [] getCoverBySnapshotTaskSet() {
        return this.CoverBySnapshotTaskSet;
    }

    /**
     * 设置对视频截图做封面任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverBySnapshotTaskSet 对视频截图做封面任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverBySnapshotTaskSet(CoverBySnapshotTaskInput [] CoverBySnapshotTaskSet) {
        this.CoverBySnapshotTaskSet = CoverBySnapshotTaskSet;
    }

    /**
     * 获取对视频转自适应码流任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AdaptiveDynamicStreamingTaskSet 对视频转自适应码流任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdaptiveDynamicStreamingTaskInput [] getAdaptiveDynamicStreamingTaskSet() {
        return this.AdaptiveDynamicStreamingTaskSet;
    }

    /**
     * 设置对视频转自适应码流任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdaptiveDynamicStreamingTaskSet 对视频转自适应码流任务列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdaptiveDynamicStreamingTaskSet(AdaptiveDynamicStreamingTaskInput [] AdaptiveDynamicStreamingTaskSet) {
        this.AdaptiveDynamicStreamingTaskSet = AdaptiveDynamicStreamingTaskSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TranscodeTaskSet.", this.TranscodeTaskSet);
        this.setParamArrayObj(map, prefix + "AnimatedGraphicTaskSet.", this.AnimatedGraphicTaskSet);
        this.setParamArrayObj(map, prefix + "SnapshotByTimeOffsetTaskSet.", this.SnapshotByTimeOffsetTaskSet);
        this.setParamArrayObj(map, prefix + "SampleSnapshotTaskSet.", this.SampleSnapshotTaskSet);
        this.setParamArrayObj(map, prefix + "ImageSpriteTaskSet.", this.ImageSpriteTaskSet);
        this.setParamArrayObj(map, prefix + "CoverBySnapshotTaskSet.", this.CoverBySnapshotTaskSet);
        this.setParamArrayObj(map, prefix + "AdaptiveDynamicStreamingTaskSet.", this.AdaptiveDynamicStreamingTaskSet);

    }
}

