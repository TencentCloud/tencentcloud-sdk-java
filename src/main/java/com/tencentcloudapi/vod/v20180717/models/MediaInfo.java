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

public class MediaInfo extends AbstractModel {

    /**
    * <p>基础信息。包括视频名称、分类、播放地址、封面图片等。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BasicInfo")
    @Expose
    private MediaBasicInfo BasicInfo;

    /**
    * <p>元信息。包括大小、时长、视频流信息、音频流信息等。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * <p>转码结果信息。包括该视频转码生成的各种码率的视频的地址、规格、码率、分辨率等。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranscodeInfo")
    @Expose
    private MediaTranscodeInfo TranscodeInfo;

    /**
    * <p>转动图结果信息。对视频转动图（如 gif）后，动图相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnimatedGraphicsInfo")
    @Expose
    private MediaAnimatedGraphicsInfo AnimatedGraphicsInfo;

    /**
    * <p>采样截图信息。对视频采样截图后，相关截图信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleSnapshotInfo")
    @Expose
    private MediaSampleSnapshotInfo SampleSnapshotInfo;

    /**
    * <p>雪碧图信息。对视频截取雪碧图之后，雪碧的相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSpriteInfo")
    @Expose
    private MediaImageSpriteInfo ImageSpriteInfo;

    /**
    * <p>指定时间点截图信息。对视频依照指定时间点截图后，各个截图的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotByTimeOffsetInfo")
    @Expose
    private MediaSnapshotByTimeOffsetInfo SnapshotByTimeOffsetInfo;

    /**
    * <p>视频打点信息。对视频设置的各个打点信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyFrameDescInfo")
    @Expose
    private MediaKeyFrameDescInfo KeyFrameDescInfo;

    /**
    * <p>转自适应码流信息。包括规格、加密类型、打包格式等相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdaptiveDynamicStreamingInfo")
    @Expose
    private MediaAdaptiveDynamicStreamingInfo AdaptiveDynamicStreamingInfo;

    /**
    * <p>小程序审核信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniProgramReviewInfo")
    @Expose
    private MediaMiniProgramReviewInfo MiniProgramReviewInfo;

    /**
    * <p>字幕信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleInfo")
    @Expose
    private MediaSubtitleInfo SubtitleInfo;

    /**
    * <p>媒体文件唯一标识 ID。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>审核信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReviewInfo")
    @Expose
    private FileReviewInfo ReviewInfo;

    /**
    * <p>MPS智能媒资信息</p>
    */
    @SerializedName("MPSAiMediaInfo")
    @Expose
    private MPSAiMediaInfo MPSAiMediaInfo;

    /**
    * <p>图片理解信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUnderstandingInfo")
    @Expose
    private ImageUnderstandingInfo ImageUnderstandingInfo;

    /**
    * <p>智能知识库信息。</p>
    */
    @SerializedName("KnowledgeBasesInfo")
    @Expose
    private KnowledgeBasesInfo KnowledgeBasesInfo;

    /**
    * <p>人脸识别信息。</p>
    */
    @SerializedName("FaceRecognitionInfo")
    @Expose
    private FaceRecognitionInfo FaceRecognitionInfo;

    /**
     * Get <p>基础信息。包括视频名称、分类、播放地址、封面图片等。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BasicInfo <p>基础信息。包括视频名称、分类、播放地址、封面图片等。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaBasicInfo getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set <p>基础信息。包括视频名称、分类、播放地址、封面图片等。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BasicInfo <p>基础信息。包括视频名称、分类、播放地址、封面图片等。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBasicInfo(MediaBasicInfo BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * Get <p>元信息。包括大小、时长、视频流信息、音频流信息等。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaData <p>元信息。包括大小、时长、视频流信息、音频流信息等。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set <p>元信息。包括大小、时长、视频流信息、音频流信息等。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaData <p>元信息。包括大小、时长、视频流信息、音频流信息等。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get <p>转码结果信息。包括该视频转码生成的各种码率的视频的地址、规格、码率、分辨率等。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranscodeInfo <p>转码结果信息。包括该视频转码生成的各种码率的视频的地址、规格、码率、分辨率等。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaTranscodeInfo getTranscodeInfo() {
        return this.TranscodeInfo;
    }

    /**
     * Set <p>转码结果信息。包括该视频转码生成的各种码率的视频的地址、规格、码率、分辨率等。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranscodeInfo <p>转码结果信息。包括该视频转码生成的各种码率的视频的地址、规格、码率、分辨率等。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscodeInfo(MediaTranscodeInfo TranscodeInfo) {
        this.TranscodeInfo = TranscodeInfo;
    }

    /**
     * Get <p>转动图结果信息。对视频转动图（如 gif）后，动图相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnimatedGraphicsInfo <p>转动图结果信息。对视频转动图（如 gif）后，动图相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaAnimatedGraphicsInfo getAnimatedGraphicsInfo() {
        return this.AnimatedGraphicsInfo;
    }

    /**
     * Set <p>转动图结果信息。对视频转动图（如 gif）后，动图相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnimatedGraphicsInfo <p>转动图结果信息。对视频转动图（如 gif）后，动图相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnimatedGraphicsInfo(MediaAnimatedGraphicsInfo AnimatedGraphicsInfo) {
        this.AnimatedGraphicsInfo = AnimatedGraphicsInfo;
    }

    /**
     * Get <p>采样截图信息。对视频采样截图后，相关截图信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleSnapshotInfo <p>采样截图信息。对视频采样截图后，相关截图信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaSampleSnapshotInfo getSampleSnapshotInfo() {
        return this.SampleSnapshotInfo;
    }

    /**
     * Set <p>采样截图信息。对视频采样截图后，相关截图信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleSnapshotInfo <p>采样截图信息。对视频采样截图后，相关截图信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleSnapshotInfo(MediaSampleSnapshotInfo SampleSnapshotInfo) {
        this.SampleSnapshotInfo = SampleSnapshotInfo;
    }

    /**
     * Get <p>雪碧图信息。对视频截取雪碧图之后，雪碧的相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageSpriteInfo <p>雪碧图信息。对视频截取雪碧图之后，雪碧的相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaImageSpriteInfo getImageSpriteInfo() {
        return this.ImageSpriteInfo;
    }

    /**
     * Set <p>雪碧图信息。对视频截取雪碧图之后，雪碧的相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSpriteInfo <p>雪碧图信息。对视频截取雪碧图之后，雪碧的相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSpriteInfo(MediaImageSpriteInfo ImageSpriteInfo) {
        this.ImageSpriteInfo = ImageSpriteInfo;
    }

    /**
     * Get <p>指定时间点截图信息。对视频依照指定时间点截图后，各个截图的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotByTimeOffsetInfo <p>指定时间点截图信息。对视频依照指定时间点截图后，各个截图的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaSnapshotByTimeOffsetInfo getSnapshotByTimeOffsetInfo() {
        return this.SnapshotByTimeOffsetInfo;
    }

    /**
     * Set <p>指定时间点截图信息。对视频依照指定时间点截图后，各个截图的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotByTimeOffsetInfo <p>指定时间点截图信息。对视频依照指定时间点截图后，各个截图的信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotByTimeOffsetInfo(MediaSnapshotByTimeOffsetInfo SnapshotByTimeOffsetInfo) {
        this.SnapshotByTimeOffsetInfo = SnapshotByTimeOffsetInfo;
    }

    /**
     * Get <p>视频打点信息。对视频设置的各个打点信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyFrameDescInfo <p>视频打点信息。对视频设置的各个打点信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaKeyFrameDescInfo getKeyFrameDescInfo() {
        return this.KeyFrameDescInfo;
    }

    /**
     * Set <p>视频打点信息。对视频设置的各个打点信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyFrameDescInfo <p>视频打点信息。对视频设置的各个打点信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyFrameDescInfo(MediaKeyFrameDescInfo KeyFrameDescInfo) {
        this.KeyFrameDescInfo = KeyFrameDescInfo;
    }

    /**
     * Get <p>转自适应码流信息。包括规格、加密类型、打包格式等相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdaptiveDynamicStreamingInfo <p>转自适应码流信息。包括规格、加密类型、打包格式等相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaAdaptiveDynamicStreamingInfo getAdaptiveDynamicStreamingInfo() {
        return this.AdaptiveDynamicStreamingInfo;
    }

    /**
     * Set <p>转自适应码流信息。包括规格、加密类型、打包格式等相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdaptiveDynamicStreamingInfo <p>转自适应码流信息。包括规格、加密类型、打包格式等相关信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdaptiveDynamicStreamingInfo(MediaAdaptiveDynamicStreamingInfo AdaptiveDynamicStreamingInfo) {
        this.AdaptiveDynamicStreamingInfo = AdaptiveDynamicStreamingInfo;
    }

    /**
     * Get <p>小程序审核信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniProgramReviewInfo <p>小程序审核信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMiniProgramReviewInfo getMiniProgramReviewInfo() {
        return this.MiniProgramReviewInfo;
    }

    /**
     * Set <p>小程序审核信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniProgramReviewInfo <p>小程序审核信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniProgramReviewInfo(MediaMiniProgramReviewInfo MiniProgramReviewInfo) {
        this.MiniProgramReviewInfo = MiniProgramReviewInfo;
    }

    /**
     * Get <p>字幕信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleInfo <p>字幕信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaSubtitleInfo getSubtitleInfo() {
        return this.SubtitleInfo;
    }

    /**
     * Set <p>字幕信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleInfo <p>字幕信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleInfo(MediaSubtitleInfo SubtitleInfo) {
        this.SubtitleInfo = SubtitleInfo;
    }

    /**
     * Get <p>媒体文件唯一标识 ID。</p> 
     * @return FileId <p>媒体文件唯一标识 ID。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>媒体文件唯一标识 ID。</p>
     * @param FileId <p>媒体文件唯一标识 ID。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>审核信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReviewInfo <p>审核信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FileReviewInfo getReviewInfo() {
        return this.ReviewInfo;
    }

    /**
     * Set <p>审核信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReviewInfo <p>审核信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReviewInfo(FileReviewInfo ReviewInfo) {
        this.ReviewInfo = ReviewInfo;
    }

    /**
     * Get <p>MPS智能媒资信息</p> 
     * @return MPSAiMediaInfo <p>MPS智能媒资信息</p>
     */
    public MPSAiMediaInfo getMPSAiMediaInfo() {
        return this.MPSAiMediaInfo;
    }

    /**
     * Set <p>MPS智能媒资信息</p>
     * @param MPSAiMediaInfo <p>MPS智能媒资信息</p>
     */
    public void setMPSAiMediaInfo(MPSAiMediaInfo MPSAiMediaInfo) {
        this.MPSAiMediaInfo = MPSAiMediaInfo;
    }

    /**
     * Get <p>图片理解信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageUnderstandingInfo <p>图片理解信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageUnderstandingInfo getImageUnderstandingInfo() {
        return this.ImageUnderstandingInfo;
    }

    /**
     * Set <p>图片理解信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUnderstandingInfo <p>图片理解信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUnderstandingInfo(ImageUnderstandingInfo ImageUnderstandingInfo) {
        this.ImageUnderstandingInfo = ImageUnderstandingInfo;
    }

    /**
     * Get <p>智能知识库信息。</p> 
     * @return KnowledgeBasesInfo <p>智能知识库信息。</p>
     */
    public KnowledgeBasesInfo getKnowledgeBasesInfo() {
        return this.KnowledgeBasesInfo;
    }

    /**
     * Set <p>智能知识库信息。</p>
     * @param KnowledgeBasesInfo <p>智能知识库信息。</p>
     */
    public void setKnowledgeBasesInfo(KnowledgeBasesInfo KnowledgeBasesInfo) {
        this.KnowledgeBasesInfo = KnowledgeBasesInfo;
    }

    /**
     * Get <p>人脸识别信息。</p> 
     * @return FaceRecognitionInfo <p>人脸识别信息。</p>
     */
    public FaceRecognitionInfo getFaceRecognitionInfo() {
        return this.FaceRecognitionInfo;
    }

    /**
     * Set <p>人脸识别信息。</p>
     * @param FaceRecognitionInfo <p>人脸识别信息。</p>
     */
    public void setFaceRecognitionInfo(FaceRecognitionInfo FaceRecognitionInfo) {
        this.FaceRecognitionInfo = FaceRecognitionInfo;
    }

    public MediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaInfo(MediaInfo source) {
        if (source.BasicInfo != null) {
            this.BasicInfo = new MediaBasicInfo(source.BasicInfo);
        }
        if (source.MetaData != null) {
            this.MetaData = new MediaMetaData(source.MetaData);
        }
        if (source.TranscodeInfo != null) {
            this.TranscodeInfo = new MediaTranscodeInfo(source.TranscodeInfo);
        }
        if (source.AnimatedGraphicsInfo != null) {
            this.AnimatedGraphicsInfo = new MediaAnimatedGraphicsInfo(source.AnimatedGraphicsInfo);
        }
        if (source.SampleSnapshotInfo != null) {
            this.SampleSnapshotInfo = new MediaSampleSnapshotInfo(source.SampleSnapshotInfo);
        }
        if (source.ImageSpriteInfo != null) {
            this.ImageSpriteInfo = new MediaImageSpriteInfo(source.ImageSpriteInfo);
        }
        if (source.SnapshotByTimeOffsetInfo != null) {
            this.SnapshotByTimeOffsetInfo = new MediaSnapshotByTimeOffsetInfo(source.SnapshotByTimeOffsetInfo);
        }
        if (source.KeyFrameDescInfo != null) {
            this.KeyFrameDescInfo = new MediaKeyFrameDescInfo(source.KeyFrameDescInfo);
        }
        if (source.AdaptiveDynamicStreamingInfo != null) {
            this.AdaptiveDynamicStreamingInfo = new MediaAdaptiveDynamicStreamingInfo(source.AdaptiveDynamicStreamingInfo);
        }
        if (source.MiniProgramReviewInfo != null) {
            this.MiniProgramReviewInfo = new MediaMiniProgramReviewInfo(source.MiniProgramReviewInfo);
        }
        if (source.SubtitleInfo != null) {
            this.SubtitleInfo = new MediaSubtitleInfo(source.SubtitleInfo);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.ReviewInfo != null) {
            this.ReviewInfo = new FileReviewInfo(source.ReviewInfo);
        }
        if (source.MPSAiMediaInfo != null) {
            this.MPSAiMediaInfo = new MPSAiMediaInfo(source.MPSAiMediaInfo);
        }
        if (source.ImageUnderstandingInfo != null) {
            this.ImageUnderstandingInfo = new ImageUnderstandingInfo(source.ImageUnderstandingInfo);
        }
        if (source.KnowledgeBasesInfo != null) {
            this.KnowledgeBasesInfo = new KnowledgeBasesInfo(source.KnowledgeBasesInfo);
        }
        if (source.FaceRecognitionInfo != null) {
            this.FaceRecognitionInfo = new FaceRecognitionInfo(source.FaceRecognitionInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamObj(map, prefix + "SubtitleInfo.", this.SubtitleInfo);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamObj(map, prefix + "ReviewInfo.", this.ReviewInfo);
        this.setParamObj(map, prefix + "MPSAiMediaInfo.", this.MPSAiMediaInfo);
        this.setParamObj(map, prefix + "ImageUnderstandingInfo.", this.ImageUnderstandingInfo);
        this.setParamObj(map, prefix + "KnowledgeBasesInfo.", this.KnowledgeBasesInfo);
        this.setParamObj(map, prefix + "FaceRecognitionInfo.", this.FaceRecognitionInfo);

    }
}

