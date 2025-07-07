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

public class ComposeMediaItem extends AbstractModel {

    /**
    * 元素类型。取值有：
<li>Video：视频元素。</li>
<li>Audio：音频元素。</li>
<li>Image：图片元素。</li>
<li>Transition：转场元素。</li>
<li>Subtitle：字幕元素。</li>
<li>Empty：空白元素。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 视频元素，当 Type = Video 时有效。
    */
    @SerializedName("Video")
    @Expose
    private ComposeVideoItem Video;

    /**
    * 音频元素，当 Type = Audio 时有效。
    */
    @SerializedName("Audio")
    @Expose
    private ComposeAudioItem Audio;

    /**
    * 图片元素，当 Type = Image 时有效。
    */
    @SerializedName("Image")
    @Expose
    private ComposeImageItem Image;

    /**
    * 转场元素，当 Type = Transition 时有效。
    */
    @SerializedName("Transition")
    @Expose
    private ComposeTransitionItem Transition;

    /**
    * 字幕元素，当 Type = Subtitle 是有效。
    */
    @SerializedName("Subtitle")
    @Expose
    private ComposeSubtitleItem Subtitle;

    /**
    * 空白元素，当 Type = Empty 时有效。用于时间轴的占位。
    */
    @SerializedName("Empty")
    @Expose
    private ComposeEmptyItem Empty;

    /**
     * Get 元素类型。取值有：
<li>Video：视频元素。</li>
<li>Audio：音频元素。</li>
<li>Image：图片元素。</li>
<li>Transition：转场元素。</li>
<li>Subtitle：字幕元素。</li>
<li>Empty：空白元素。</li> 
     * @return Type 元素类型。取值有：
<li>Video：视频元素。</li>
<li>Audio：音频元素。</li>
<li>Image：图片元素。</li>
<li>Transition：转场元素。</li>
<li>Subtitle：字幕元素。</li>
<li>Empty：空白元素。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 元素类型。取值有：
<li>Video：视频元素。</li>
<li>Audio：音频元素。</li>
<li>Image：图片元素。</li>
<li>Transition：转场元素。</li>
<li>Subtitle：字幕元素。</li>
<li>Empty：空白元素。</li>
     * @param Type 元素类型。取值有：
<li>Video：视频元素。</li>
<li>Audio：音频元素。</li>
<li>Image：图片元素。</li>
<li>Transition：转场元素。</li>
<li>Subtitle：字幕元素。</li>
<li>Empty：空白元素。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 视频元素，当 Type = Video 时有效。 
     * @return Video 视频元素，当 Type = Video 时有效。
     */
    public ComposeVideoItem getVideo() {
        return this.Video;
    }

    /**
     * Set 视频元素，当 Type = Video 时有效。
     * @param Video 视频元素，当 Type = Video 时有效。
     */
    public void setVideo(ComposeVideoItem Video) {
        this.Video = Video;
    }

    /**
     * Get 音频元素，当 Type = Audio 时有效。 
     * @return Audio 音频元素，当 Type = Audio 时有效。
     */
    public ComposeAudioItem getAudio() {
        return this.Audio;
    }

    /**
     * Set 音频元素，当 Type = Audio 时有效。
     * @param Audio 音频元素，当 Type = Audio 时有效。
     */
    public void setAudio(ComposeAudioItem Audio) {
        this.Audio = Audio;
    }

    /**
     * Get 图片元素，当 Type = Image 时有效。 
     * @return Image 图片元素，当 Type = Image 时有效。
     */
    public ComposeImageItem getImage() {
        return this.Image;
    }

    /**
     * Set 图片元素，当 Type = Image 时有效。
     * @param Image 图片元素，当 Type = Image 时有效。
     */
    public void setImage(ComposeImageItem Image) {
        this.Image = Image;
    }

    /**
     * Get 转场元素，当 Type = Transition 时有效。 
     * @return Transition 转场元素，当 Type = Transition 时有效。
     */
    public ComposeTransitionItem getTransition() {
        return this.Transition;
    }

    /**
     * Set 转场元素，当 Type = Transition 时有效。
     * @param Transition 转场元素，当 Type = Transition 时有效。
     */
    public void setTransition(ComposeTransitionItem Transition) {
        this.Transition = Transition;
    }

    /**
     * Get 字幕元素，当 Type = Subtitle 是有效。 
     * @return Subtitle 字幕元素，当 Type = Subtitle 是有效。
     */
    public ComposeSubtitleItem getSubtitle() {
        return this.Subtitle;
    }

    /**
     * Set 字幕元素，当 Type = Subtitle 是有效。
     * @param Subtitle 字幕元素，当 Type = Subtitle 是有效。
     */
    public void setSubtitle(ComposeSubtitleItem Subtitle) {
        this.Subtitle = Subtitle;
    }

    /**
     * Get 空白元素，当 Type = Empty 时有效。用于时间轴的占位。 
     * @return Empty 空白元素，当 Type = Empty 时有效。用于时间轴的占位。
     */
    public ComposeEmptyItem getEmpty() {
        return this.Empty;
    }

    /**
     * Set 空白元素，当 Type = Empty 时有效。用于时间轴的占位。
     * @param Empty 空白元素，当 Type = Empty 时有效。用于时间轴的占位。
     */
    public void setEmpty(ComposeEmptyItem Empty) {
        this.Empty = Empty;
    }

    public ComposeMediaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeMediaItem(ComposeMediaItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Video != null) {
            this.Video = new ComposeVideoItem(source.Video);
        }
        if (source.Audio != null) {
            this.Audio = new ComposeAudioItem(source.Audio);
        }
        if (source.Image != null) {
            this.Image = new ComposeImageItem(source.Image);
        }
        if (source.Transition != null) {
            this.Transition = new ComposeTransitionItem(source.Transition);
        }
        if (source.Subtitle != null) {
            this.Subtitle = new ComposeSubtitleItem(source.Subtitle);
        }
        if (source.Empty != null) {
            this.Empty = new ComposeEmptyItem(source.Empty);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Video.", this.Video);
        this.setParamObj(map, prefix + "Audio.", this.Audio);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamObj(map, prefix + "Transition.", this.Transition);
        this.setParamObj(map, prefix + "Subtitle.", this.Subtitle);
        this.setParamObj(map, prefix + "Empty.", this.Empty);

    }
}

