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

public class MediaProcessTaskResult extends AbstractModel{

    /**
    * 任务的类型，可以取的值有：
<li>Transcode：转码</li>
<li>AnimatedGraphics：转动图</li>
<li>SnapshotByTimeOffset：时间点截图</li>
<li>SampleSnapshot：采样截图</li>
<li>ImageSprites：雪碧图</li>
<li>CoverBySnapshot：截图做封面</li>
<li>AdaptiveDynamicStreaming：自适应码流</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 视频转码任务的查询结果，当任务类型为 Transcode 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeTask")
    @Expose
    private MediaProcessTaskTranscodeResult TranscodeTask;

    /**
    * 视频转动图任务的查询结果，当任务类型为 AnimatedGraphics 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnimatedGraphicTask")
    @Expose
    private MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask;

    /**
    * 对视频按时间点截图任务的查询结果，当任务类型为 SnapshotByTimeOffset 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetTask")
    @Expose
    private MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask;

    /**
    * 对视频采样截图任务的查询结果，当任务类型为 SampleSnapshot 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleSnapshotTask")
    @Expose
    private MediaProcessTaskSampleSnapshotResult SampleSnapshotTask;

    /**
    * 对视频截雪碧图任务的查询结果，当任务类型为 ImageSprite 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSpriteTask")
    @Expose
    private MediaProcessTaskImageSpriteResult ImageSpriteTask;

    /**
    * 转自适应码流任务查询结果，当任务类型为 AdaptiveDynamicStreaming 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdaptiveDynamicStreamingTask")
    @Expose
    private MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask;

    /**
     * Get 任务的类型，可以取的值有：
<li>Transcode：转码</li>
<li>AnimatedGraphics：转动图</li>
<li>SnapshotByTimeOffset：时间点截图</li>
<li>SampleSnapshot：采样截图</li>
<li>ImageSprites：雪碧图</li>
<li>CoverBySnapshot：截图做封面</li>
<li>AdaptiveDynamicStreaming：自适应码流</li> 
     * @return Type 任务的类型，可以取的值有：
<li>Transcode：转码</li>
<li>AnimatedGraphics：转动图</li>
<li>SnapshotByTimeOffset：时间点截图</li>
<li>SampleSnapshot：采样截图</li>
<li>ImageSprites：雪碧图</li>
<li>CoverBySnapshot：截图做封面</li>
<li>AdaptiveDynamicStreaming：自适应码流</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务的类型，可以取的值有：
<li>Transcode：转码</li>
<li>AnimatedGraphics：转动图</li>
<li>SnapshotByTimeOffset：时间点截图</li>
<li>SampleSnapshot：采样截图</li>
<li>ImageSprites：雪碧图</li>
<li>CoverBySnapshot：截图做封面</li>
<li>AdaptiveDynamicStreaming：自适应码流</li>
     * @param Type 任务的类型，可以取的值有：
<li>Transcode：转码</li>
<li>AnimatedGraphics：转动图</li>
<li>SnapshotByTimeOffset：时间点截图</li>
<li>SampleSnapshot：采样截图</li>
<li>ImageSprites：雪碧图</li>
<li>CoverBySnapshot：截图做封面</li>
<li>AdaptiveDynamicStreaming：自适应码流</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 视频转码任务的查询结果，当任务类型为 Transcode 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeTask 视频转码任务的查询结果，当任务类型为 Transcode 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskTranscodeResult getTranscodeTask() {
        return this.TranscodeTask;
    }

    /**
     * Set 视频转码任务的查询结果，当任务类型为 Transcode 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeTask 视频转码任务的查询结果，当任务类型为 Transcode 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeTask(MediaProcessTaskTranscodeResult TranscodeTask) {
        this.TranscodeTask = TranscodeTask;
    }

    /**
     * Get 视频转动图任务的查询结果，当任务类型为 AnimatedGraphics 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnimatedGraphicTask 视频转动图任务的查询结果，当任务类型为 AnimatedGraphics 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskAnimatedGraphicResult getAnimatedGraphicTask() {
        return this.AnimatedGraphicTask;
    }

    /**
     * Set 视频转动图任务的查询结果，当任务类型为 AnimatedGraphics 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnimatedGraphicTask 视频转动图任务的查询结果，当任务类型为 AnimatedGraphics 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnimatedGraphicTask(MediaProcessTaskAnimatedGraphicResult AnimatedGraphicTask) {
        this.AnimatedGraphicTask = AnimatedGraphicTask;
    }

    /**
     * Get 对视频按时间点截图任务的查询结果，当任务类型为 SnapshotByTimeOffset 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotByTimeOffsetTask 对视频按时间点截图任务的查询结果，当任务类型为 SnapshotByTimeOffset 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskSnapshotByTimeOffsetResult getSnapshotByTimeOffsetTask() {
        return this.SnapshotByTimeOffsetTask;
    }

    /**
     * Set 对视频按时间点截图任务的查询结果，当任务类型为 SnapshotByTimeOffset 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetTask 对视频按时间点截图任务的查询结果，当任务类型为 SnapshotByTimeOffset 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetTask(MediaProcessTaskSnapshotByTimeOffsetResult SnapshotByTimeOffsetTask) {
        this.SnapshotByTimeOffsetTask = SnapshotByTimeOffsetTask;
    }

    /**
     * Get 对视频采样截图任务的查询结果，当任务类型为 SampleSnapshot 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleSnapshotTask 对视频采样截图任务的查询结果，当任务类型为 SampleSnapshot 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskSampleSnapshotResult getSampleSnapshotTask() {
        return this.SampleSnapshotTask;
    }

    /**
     * Set 对视频采样截图任务的查询结果，当任务类型为 SampleSnapshot 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleSnapshotTask 对视频采样截图任务的查询结果，当任务类型为 SampleSnapshot 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleSnapshotTask(MediaProcessTaskSampleSnapshotResult SampleSnapshotTask) {
        this.SampleSnapshotTask = SampleSnapshotTask;
    }

    /**
     * Get 对视频截雪碧图任务的查询结果，当任务类型为 ImageSprite 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageSpriteTask 对视频截雪碧图任务的查询结果，当任务类型为 ImageSprite 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskImageSpriteResult getImageSpriteTask() {
        return this.ImageSpriteTask;
    }

    /**
     * Set 对视频截雪碧图任务的查询结果，当任务类型为 ImageSprite 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSpriteTask 对视频截雪碧图任务的查询结果，当任务类型为 ImageSprite 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSpriteTask(MediaProcessTaskImageSpriteResult ImageSpriteTask) {
        this.ImageSpriteTask = ImageSpriteTask;
    }

    /**
     * Get 转自适应码流任务查询结果，当任务类型为 AdaptiveDynamicStreaming 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdaptiveDynamicStreamingTask 转自适应码流任务查询结果，当任务类型为 AdaptiveDynamicStreaming 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaProcessTaskAdaptiveDynamicStreamingResult getAdaptiveDynamicStreamingTask() {
        return this.AdaptiveDynamicStreamingTask;
    }

    /**
     * Set 转自适应码流任务查询结果，当任务类型为 AdaptiveDynamicStreaming 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdaptiveDynamicStreamingTask 转自适应码流任务查询结果，当任务类型为 AdaptiveDynamicStreaming 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdaptiveDynamicStreamingTask(MediaProcessTaskAdaptiveDynamicStreamingResult AdaptiveDynamicStreamingTask) {
        this.AdaptiveDynamicStreamingTask = AdaptiveDynamicStreamingTask;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "TranscodeTask.", this.TranscodeTask);
        this.setParamObj(map, prefix + "AnimatedGraphicTask.", this.AnimatedGraphicTask);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetTask.", this.SnapshotByTimeOffsetTask);
        this.setParamObj(map, prefix + "SampleSnapshotTask.", this.SampleSnapshotTask);
        this.setParamObj(map, prefix + "ImageSpriteTask.", this.ImageSpriteTask);
        this.setParamObj(map, prefix + "AdaptiveDynamicStreamingTask.", this.AdaptiveDynamicStreamingTask);

    }
}

