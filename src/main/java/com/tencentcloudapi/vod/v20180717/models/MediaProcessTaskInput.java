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

public class MediaProcessTaskInput extends AbstractModel {

    /**
    * 视频转码任务列表。
    */
    @SerializedName("TranscodeTaskSet")
    @Expose
    private TranscodeTaskInput [] TranscodeTaskSet;

    /**
    * 视频转动图任务列表。
    */
    @SerializedName("AnimatedGraphicTaskSet")
    @Expose
    private AnimatedGraphicTaskInput [] AnimatedGraphicTaskSet;

    /**
    * 对视频按时间点截图任务列表。
    */
    @SerializedName("SnapshotByTimeOffsetTaskSet")
    @Expose
    private SnapshotByTimeOffsetTaskInput [] SnapshotByTimeOffsetTaskSet;

    /**
    * 对视频采样截图任务列表。
    */
    @SerializedName("SampleSnapshotTaskSet")
    @Expose
    private SampleSnapshotTaskInput [] SampleSnapshotTaskSet;

    /**
    * 对视频截雪碧图任务列表。
    */
    @SerializedName("ImageSpriteTaskSet")
    @Expose
    private ImageSpriteTaskInput [] ImageSpriteTaskSet;

    /**
    * 对视频截图做封面任务列表。
    */
    @SerializedName("CoverBySnapshotTaskSet")
    @Expose
    private CoverBySnapshotTaskInput [] CoverBySnapshotTaskSet;

    /**
    * 对视频转自适应码流任务列表。
    */
    @SerializedName("AdaptiveDynamicStreamingTaskSet")
    @Expose
    private AdaptiveDynamicStreamingTaskInput [] AdaptiveDynamicStreamingTaskSet;

    /**
     * Get 视频转码任务列表。 
     * @return TranscodeTaskSet 视频转码任务列表。
     */
    public TranscodeTaskInput [] getTranscodeTaskSet() {
        return this.TranscodeTaskSet;
    }

    /**
     * Set 视频转码任务列表。
     * @param TranscodeTaskSet 视频转码任务列表。
     */
    public void setTranscodeTaskSet(TranscodeTaskInput [] TranscodeTaskSet) {
        this.TranscodeTaskSet = TranscodeTaskSet;
    }

    /**
     * Get 视频转动图任务列表。 
     * @return AnimatedGraphicTaskSet 视频转动图任务列表。
     */
    public AnimatedGraphicTaskInput [] getAnimatedGraphicTaskSet() {
        return this.AnimatedGraphicTaskSet;
    }

    /**
     * Set 视频转动图任务列表。
     * @param AnimatedGraphicTaskSet 视频转动图任务列表。
     */
    public void setAnimatedGraphicTaskSet(AnimatedGraphicTaskInput [] AnimatedGraphicTaskSet) {
        this.AnimatedGraphicTaskSet = AnimatedGraphicTaskSet;
    }

    /**
     * Get 对视频按时间点截图任务列表。 
     * @return SnapshotByTimeOffsetTaskSet 对视频按时间点截图任务列表。
     */
    public SnapshotByTimeOffsetTaskInput [] getSnapshotByTimeOffsetTaskSet() {
        return this.SnapshotByTimeOffsetTaskSet;
    }

    /**
     * Set 对视频按时间点截图任务列表。
     * @param SnapshotByTimeOffsetTaskSet 对视频按时间点截图任务列表。
     */
    public void setSnapshotByTimeOffsetTaskSet(SnapshotByTimeOffsetTaskInput [] SnapshotByTimeOffsetTaskSet) {
        this.SnapshotByTimeOffsetTaskSet = SnapshotByTimeOffsetTaskSet;
    }

    /**
     * Get 对视频采样截图任务列表。 
     * @return SampleSnapshotTaskSet 对视频采样截图任务列表。
     */
    public SampleSnapshotTaskInput [] getSampleSnapshotTaskSet() {
        return this.SampleSnapshotTaskSet;
    }

    /**
     * Set 对视频采样截图任务列表。
     * @param SampleSnapshotTaskSet 对视频采样截图任务列表。
     */
    public void setSampleSnapshotTaskSet(SampleSnapshotTaskInput [] SampleSnapshotTaskSet) {
        this.SampleSnapshotTaskSet = SampleSnapshotTaskSet;
    }

    /**
     * Get 对视频截雪碧图任务列表。 
     * @return ImageSpriteTaskSet 对视频截雪碧图任务列表。
     */
    public ImageSpriteTaskInput [] getImageSpriteTaskSet() {
        return this.ImageSpriteTaskSet;
    }

    /**
     * Set 对视频截雪碧图任务列表。
     * @param ImageSpriteTaskSet 对视频截雪碧图任务列表。
     */
    public void setImageSpriteTaskSet(ImageSpriteTaskInput [] ImageSpriteTaskSet) {
        this.ImageSpriteTaskSet = ImageSpriteTaskSet;
    }

    /**
     * Get 对视频截图做封面任务列表。 
     * @return CoverBySnapshotTaskSet 对视频截图做封面任务列表。
     */
    public CoverBySnapshotTaskInput [] getCoverBySnapshotTaskSet() {
        return this.CoverBySnapshotTaskSet;
    }

    /**
     * Set 对视频截图做封面任务列表。
     * @param CoverBySnapshotTaskSet 对视频截图做封面任务列表。
     */
    public void setCoverBySnapshotTaskSet(CoverBySnapshotTaskInput [] CoverBySnapshotTaskSet) {
        this.CoverBySnapshotTaskSet = CoverBySnapshotTaskSet;
    }

    /**
     * Get 对视频转自适应码流任务列表。 
     * @return AdaptiveDynamicStreamingTaskSet 对视频转自适应码流任务列表。
     */
    public AdaptiveDynamicStreamingTaskInput [] getAdaptiveDynamicStreamingTaskSet() {
        return this.AdaptiveDynamicStreamingTaskSet;
    }

    /**
     * Set 对视频转自适应码流任务列表。
     * @param AdaptiveDynamicStreamingTaskSet 对视频转自适应码流任务列表。
     */
    public void setAdaptiveDynamicStreamingTaskSet(AdaptiveDynamicStreamingTaskInput [] AdaptiveDynamicStreamingTaskSet) {
        this.AdaptiveDynamicStreamingTaskSet = AdaptiveDynamicStreamingTaskSet;
    }

    public MediaProcessTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaProcessTaskInput(MediaProcessTaskInput source) {
        if (source.TranscodeTaskSet != null) {
            this.TranscodeTaskSet = new TranscodeTaskInput[source.TranscodeTaskSet.length];
            for (int i = 0; i < source.TranscodeTaskSet.length; i++) {
                this.TranscodeTaskSet[i] = new TranscodeTaskInput(source.TranscodeTaskSet[i]);
            }
        }
        if (source.AnimatedGraphicTaskSet != null) {
            this.AnimatedGraphicTaskSet = new AnimatedGraphicTaskInput[source.AnimatedGraphicTaskSet.length];
            for (int i = 0; i < source.AnimatedGraphicTaskSet.length; i++) {
                this.AnimatedGraphicTaskSet[i] = new AnimatedGraphicTaskInput(source.AnimatedGraphicTaskSet[i]);
            }
        }
        if (source.SnapshotByTimeOffsetTaskSet != null) {
            this.SnapshotByTimeOffsetTaskSet = new SnapshotByTimeOffsetTaskInput[source.SnapshotByTimeOffsetTaskSet.length];
            for (int i = 0; i < source.SnapshotByTimeOffsetTaskSet.length; i++) {
                this.SnapshotByTimeOffsetTaskSet[i] = new SnapshotByTimeOffsetTaskInput(source.SnapshotByTimeOffsetTaskSet[i]);
            }
        }
        if (source.SampleSnapshotTaskSet != null) {
            this.SampleSnapshotTaskSet = new SampleSnapshotTaskInput[source.SampleSnapshotTaskSet.length];
            for (int i = 0; i < source.SampleSnapshotTaskSet.length; i++) {
                this.SampleSnapshotTaskSet[i] = new SampleSnapshotTaskInput(source.SampleSnapshotTaskSet[i]);
            }
        }
        if (source.ImageSpriteTaskSet != null) {
            this.ImageSpriteTaskSet = new ImageSpriteTaskInput[source.ImageSpriteTaskSet.length];
            for (int i = 0; i < source.ImageSpriteTaskSet.length; i++) {
                this.ImageSpriteTaskSet[i] = new ImageSpriteTaskInput(source.ImageSpriteTaskSet[i]);
            }
        }
        if (source.CoverBySnapshotTaskSet != null) {
            this.CoverBySnapshotTaskSet = new CoverBySnapshotTaskInput[source.CoverBySnapshotTaskSet.length];
            for (int i = 0; i < source.CoverBySnapshotTaskSet.length; i++) {
                this.CoverBySnapshotTaskSet[i] = new CoverBySnapshotTaskInput(source.CoverBySnapshotTaskSet[i]);
            }
        }
        if (source.AdaptiveDynamicStreamingTaskSet != null) {
            this.AdaptiveDynamicStreamingTaskSet = new AdaptiveDynamicStreamingTaskInput[source.AdaptiveDynamicStreamingTaskSet.length];
            for (int i = 0; i < source.AdaptiveDynamicStreamingTaskSet.length; i++) {
                this.AdaptiveDynamicStreamingTaskSet[i] = new AdaptiveDynamicStreamingTaskInput(source.AdaptiveDynamicStreamingTaskSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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

