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

public class MediaInfo  extends AbstractModel{

    /**
    * 基础信息。包括视频名称、分类、播放地址、封面图片等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicInfo")
    @Expose
    private MediaBasicInfo BasicInfo;

    /**
    * 元信息。包括大小、时长、视频流信息、音频流信息等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 转码结果信息。包括该视频转码生成的各种码率的视频的地址、规格、码率、分辨率等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeInfo")
    @Expose
    private MediaTranscodeInfo TranscodeInfo;

    /**
    * 转动图结果信息。对视频转动图（如 gif）后，动图相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnimatedGraphicsInfo")
    @Expose
    private MediaAnimatedGraphicsInfo AnimatedGraphicsInfo;

    /**
    * 采样截图信息。对视频采样截图后，相关截图信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleSnapshotInfo")
    @Expose
    private MediaSampleSnapshotInfo SampleSnapshotInfo;

    /**
    * 雪碧图信息。对视频截取雪碧图之后，雪碧的相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSpriteInfo")
    @Expose
    private MediaImageSpriteInfo ImageSpriteInfo;

    /**
    * 指定时间点截图信息。对视频依照指定时间点截图后，各个截图的信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetInfo")
    @Expose
    private MediaSnapshotByTimeOffsetInfo SnapshotByTimeOffsetInfo;

    /**
    * 视频打点信息。对视频设置的各个打点信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyFrameDescInfo")
    @Expose
    private MediaKeyFrameDescInfo KeyFrameDescInfo;

    /**
    * 转自适应码流信息。包括规格、加密类型、打包格式等相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdaptiveDynamicStreamingInfo")
    @Expose
    private MediaAdaptiveDynamicStreamingInfo AdaptiveDynamicStreamingInfo;

    /**
    * 小程序审核信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniProgramReviewInfo")
    @Expose
    private MediaMiniProgramReviewInfo MiniProgramReviewInfo;

    /**
    * 媒体文件唯一标识 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * 获取基础信息。包括视频名称、分类、播放地址、封面图片等。
注意：此字段可能返回 null，表示取不到有效值。
     * @return BasicInfo 基础信息。包括视频名称、分类、播放地址、封面图片等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaBasicInfo getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * 设置基础信息。包括视频名称、分类、播放地址、封面图片等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicInfo 基础信息。包括视频名称、分类、播放地址、封面图片等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicInfo(MediaBasicInfo BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * 获取元信息。包括大小、时长、视频流信息、音频流信息等。
注意：此字段可能返回 null，表示取不到有效值。
     * @return MetaData 元信息。包括大小、时长、视频流信息、音频流信息等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * 设置元信息。包括大小、时长、视频流信息、音频流信息等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaData 元信息。包括大小、时长、视频流信息、音频流信息等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * 获取转码结果信息。包括该视频转码生成的各种码率的视频的地址、规格、码率、分辨率等。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TranscodeInfo 转码结果信息。包括该视频转码生成的各种码率的视频的地址、规格、码率、分辨率等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaTranscodeInfo getTranscodeInfo() {
        return this.TranscodeInfo;
    }

    /**
     * 设置转码结果信息。包括该视频转码生成的各种码率的视频的地址、规格、码率、分辨率等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeInfo 转码结果信息。包括该视频转码生成的各种码率的视频的地址、规格、码率、分辨率等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeInfo(MediaTranscodeInfo TranscodeInfo) {
        this.TranscodeInfo = TranscodeInfo;
    }

    /**
     * 获取转动图结果信息。对视频转动图（如 gif）后，动图相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AnimatedGraphicsInfo 转动图结果信息。对视频转动图（如 gif）后，动图相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaAnimatedGraphicsInfo getAnimatedGraphicsInfo() {
        return this.AnimatedGraphicsInfo;
    }

    /**
     * 设置转动图结果信息。对视频转动图（如 gif）后，动图相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnimatedGraphicsInfo 转动图结果信息。对视频转动图（如 gif）后，动图相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnimatedGraphicsInfo(MediaAnimatedGraphicsInfo AnimatedGraphicsInfo) {
        this.AnimatedGraphicsInfo = AnimatedGraphicsInfo;
    }

    /**
     * 获取采样截图信息。对视频采样截图后，相关截图信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SampleSnapshotInfo 采样截图信息。对视频采样截图后，相关截图信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaSampleSnapshotInfo getSampleSnapshotInfo() {
        return this.SampleSnapshotInfo;
    }

    /**
     * 设置采样截图信息。对视频采样截图后，相关截图信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleSnapshotInfo 采样截图信息。对视频采样截图后，相关截图信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleSnapshotInfo(MediaSampleSnapshotInfo SampleSnapshotInfo) {
        this.SampleSnapshotInfo = SampleSnapshotInfo;
    }

    /**
     * 获取雪碧图信息。对视频截取雪碧图之后，雪碧的相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ImageSpriteInfo 雪碧图信息。对视频截取雪碧图之后，雪碧的相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaImageSpriteInfo getImageSpriteInfo() {
        return this.ImageSpriteInfo;
    }

    /**
     * 设置雪碧图信息。对视频截取雪碧图之后，雪碧的相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSpriteInfo 雪碧图信息。对视频截取雪碧图之后，雪碧的相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSpriteInfo(MediaImageSpriteInfo ImageSpriteInfo) {
        this.ImageSpriteInfo = ImageSpriteInfo;
    }

    /**
     * 获取指定时间点截图信息。对视频依照指定时间点截图后，各个截图的信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SnapshotByTimeOffsetInfo 指定时间点截图信息。对视频依照指定时间点截图后，各个截图的信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaSnapshotByTimeOffsetInfo getSnapshotByTimeOffsetInfo() {
        return this.SnapshotByTimeOffsetInfo;
    }

    /**
     * 设置指定时间点截图信息。对视频依照指定时间点截图后，各个截图的信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetInfo 指定时间点截图信息。对视频依照指定时间点截图后，各个截图的信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetInfo(MediaSnapshotByTimeOffsetInfo SnapshotByTimeOffsetInfo) {
        this.SnapshotByTimeOffsetInfo = SnapshotByTimeOffsetInfo;
    }

    /**
     * 获取视频打点信息。对视频设置的各个打点信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return KeyFrameDescInfo 视频打点信息。对视频设置的各个打点信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaKeyFrameDescInfo getKeyFrameDescInfo() {
        return this.KeyFrameDescInfo;
    }

    /**
     * 设置视频打点信息。对视频设置的各个打点信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyFrameDescInfo 视频打点信息。对视频设置的各个打点信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyFrameDescInfo(MediaKeyFrameDescInfo KeyFrameDescInfo) {
        this.KeyFrameDescInfo = KeyFrameDescInfo;
    }

    /**
     * 获取转自适应码流信息。包括规格、加密类型、打包格式等相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AdaptiveDynamicStreamingInfo 转自适应码流信息。包括规格、加密类型、打包格式等相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaAdaptiveDynamicStreamingInfo getAdaptiveDynamicStreamingInfo() {
        return this.AdaptiveDynamicStreamingInfo;
    }

    /**
     * 设置转自适应码流信息。包括规格、加密类型、打包格式等相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdaptiveDynamicStreamingInfo 转自适应码流信息。包括规格、加密类型、打包格式等相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdaptiveDynamicStreamingInfo(MediaAdaptiveDynamicStreamingInfo AdaptiveDynamicStreamingInfo) {
        this.AdaptiveDynamicStreamingInfo = AdaptiveDynamicStreamingInfo;
    }

    /**
     * 获取小程序审核信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return MiniProgramReviewInfo 小程序审核信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMiniProgramReviewInfo getMiniProgramReviewInfo() {
        return this.MiniProgramReviewInfo;
    }

    /**
     * 设置小程序审核信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniProgramReviewInfo 小程序审核信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniProgramReviewInfo(MediaMiniProgramReviewInfo MiniProgramReviewInfo) {
        this.MiniProgramReviewInfo = MiniProgramReviewInfo;
    }

    /**
     * 获取媒体文件唯一标识 ID。
     * @return FileId 媒体文件唯一标识 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置媒体文件唯一标识 ID。
     * @param FileId 媒体文件唯一标识 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BasicInfo.", this.BasicInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamObj(map, prefix + "TranscodeInfo.", this.TranscodeInfo);
        this.setParamObj(map, prefix + "AnimatedGraphicsInfo.", this.AnimatedGraphicsInfo);
        this.setParamObj(map, prefix + "SampleSnapshotInfo.", this.SampleSnapshotInfo);
        this.setParamObj(map, prefix + "ImageSpriteInfo.", this.ImageSpriteInfo);
        this.setParamObj(map, prefix + "SnapshotByTimeOffsetInfo.", this.SnapshotByTimeOffsetInfo);
        this.setParamObj(map, prefix + "KeyFrameDescInfo.", this.KeyFrameDescInfo);
        this.setParamObj(map, prefix + "AdaptiveDynamicStreamingInfo.", this.AdaptiveDynamicStreamingInfo);
        this.setParamObj(map, prefix + "MiniProgramReviewInfo.", this.MiniProgramReviewInfo);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

