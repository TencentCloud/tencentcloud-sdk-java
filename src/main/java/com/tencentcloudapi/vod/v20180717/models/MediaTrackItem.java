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

public class MediaTrackItem extends AbstractModel{

    /**
    * 片段类型。取值有：
<li>Video：视频片段。</li>
<li>Audio：音频片段。</li>
<li>Sticker：贴图片段。</li>
<li>Transition：转场。</li>
<li>Empty：空白片段。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 视频片段，当 Type = Video 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoItem")
    @Expose
    private VideoTrackItem VideoItem;

    /**
    * 音频片段，当 Type = Audio 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioItem")
    @Expose
    private AudioTrackItem AudioItem;

    /**
    * 贴图片段，当 Type = Sticker 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StickerItem")
    @Expose
    private StickerTrackItem StickerItem;

    /**
    * 转场，当 Type = Transition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransitionItem")
    @Expose
    private MediaTransitionItem TransitionItem;

    /**
    * 空白片段，当 Type = Empty 时有效。空片段用于时间轴的占位。<li>如需要两个音频片段之间有一段时间的静音，可以用 EmptyTrackItem 来进行占位。</li>
<li>使用 EmptyTrackItem 进行占位，来定位某个Item。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmptyItem")
    @Expose
    private EmptyTrackItem EmptyItem;

    /**
     * Get 片段类型。取值有：
<li>Video：视频片段。</li>
<li>Audio：音频片段。</li>
<li>Sticker：贴图片段。</li>
<li>Transition：转场。</li>
<li>Empty：空白片段。</li> 
     * @return Type 片段类型。取值有：
<li>Video：视频片段。</li>
<li>Audio：音频片段。</li>
<li>Sticker：贴图片段。</li>
<li>Transition：转场。</li>
<li>Empty：空白片段。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 片段类型。取值有：
<li>Video：视频片段。</li>
<li>Audio：音频片段。</li>
<li>Sticker：贴图片段。</li>
<li>Transition：转场。</li>
<li>Empty：空白片段。</li>
     * @param Type 片段类型。取值有：
<li>Video：视频片段。</li>
<li>Audio：音频片段。</li>
<li>Sticker：贴图片段。</li>
<li>Transition：转场。</li>
<li>Empty：空白片段。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 视频片段，当 Type = Video 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoItem 视频片段，当 Type = Video 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoTrackItem getVideoItem() {
        return this.VideoItem;
    }

    /**
     * Set 视频片段，当 Type = Video 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoItem 视频片段，当 Type = Video 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoItem(VideoTrackItem VideoItem) {
        this.VideoItem = VideoItem;
    }

    /**
     * Get 音频片段，当 Type = Audio 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioItem 音频片段，当 Type = Audio 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioTrackItem getAudioItem() {
        return this.AudioItem;
    }

    /**
     * Set 音频片段，当 Type = Audio 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioItem 音频片段，当 Type = Audio 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioItem(AudioTrackItem AudioItem) {
        this.AudioItem = AudioItem;
    }

    /**
     * Get 贴图片段，当 Type = Sticker 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StickerItem 贴图片段，当 Type = Sticker 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StickerTrackItem getStickerItem() {
        return this.StickerItem;
    }

    /**
     * Set 贴图片段，当 Type = Sticker 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StickerItem 贴图片段，当 Type = Sticker 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStickerItem(StickerTrackItem StickerItem) {
        this.StickerItem = StickerItem;
    }

    /**
     * Get 转场，当 Type = Transition 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransitionItem 转场，当 Type = Transition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaTransitionItem getTransitionItem() {
        return this.TransitionItem;
    }

    /**
     * Set 转场，当 Type = Transition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransitionItem 转场，当 Type = Transition 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransitionItem(MediaTransitionItem TransitionItem) {
        this.TransitionItem = TransitionItem;
    }

    /**
     * Get 空白片段，当 Type = Empty 时有效。空片段用于时间轴的占位。<li>如需要两个音频片段之间有一段时间的静音，可以用 EmptyTrackItem 来进行占位。</li>
<li>使用 EmptyTrackItem 进行占位，来定位某个Item。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmptyItem 空白片段，当 Type = Empty 时有效。空片段用于时间轴的占位。<li>如需要两个音频片段之间有一段时间的静音，可以用 EmptyTrackItem 来进行占位。</li>
<li>使用 EmptyTrackItem 进行占位，来定位某个Item。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmptyTrackItem getEmptyItem() {
        return this.EmptyItem;
    }

    /**
     * Set 空白片段，当 Type = Empty 时有效。空片段用于时间轴的占位。<li>如需要两个音频片段之间有一段时间的静音，可以用 EmptyTrackItem 来进行占位。</li>
<li>使用 EmptyTrackItem 进行占位，来定位某个Item。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmptyItem 空白片段，当 Type = Empty 时有效。空片段用于时间轴的占位。<li>如需要两个音频片段之间有一段时间的静音，可以用 EmptyTrackItem 来进行占位。</li>
<li>使用 EmptyTrackItem 进行占位，来定位某个Item。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmptyItem(EmptyTrackItem EmptyItem) {
        this.EmptyItem = EmptyItem;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "VideoItem.", this.VideoItem);
        this.setParamObj(map, prefix + "AudioItem.", this.AudioItem);
        this.setParamObj(map, prefix + "StickerItem.", this.StickerItem);
        this.setParamObj(map, prefix + "TransitionItem.", this.TransitionItem);
        this.setParamObj(map, prefix + "EmptyItem.", this.EmptyItem);

    }
}

