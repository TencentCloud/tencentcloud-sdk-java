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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaTrackItem extends AbstractModel{

    /**
    * 片段类型。取值有：
<li>Video：视频片段；</li>
<li>Audio：音频片段；</li>
<li>Empty：空白片段；</li>
<li>Transition：转场。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 视频片段，当 Type = Video 时有效。
    */
    @SerializedName("VideoItem")
    @Expose
    private VideoTrackItem VideoItem;

    /**
    * 音频片段，当 Type = Audio 时有效。
    */
    @SerializedName("AudioItem")
    @Expose
    private AudioTrackItem AudioItem;

    /**
    * 空白片段，当 Type = Empty 时有效。空片段用于时间轴的占位。<li>如需要两个音频片段之间有一段时间的静音，可以用 EmptyTrackItem 来进行占位。</li>
<li>使用 EmptyTrackItem 进行占位，来定位某个Item。</li>
    */
    @SerializedName("EmptyItem")
    @Expose
    private EmptyTrackItem EmptyItem;

    /**
    * 转场，当 Type = Transition 时有效。
    */
    @SerializedName("TransitionItem")
    @Expose
    private MediaTransitionItem TransitionItem;

    /**
     * Get 片段类型。取值有：
<li>Video：视频片段；</li>
<li>Audio：音频片段；</li>
<li>Empty：空白片段；</li>
<li>Transition：转场。</li> 
     * @return Type 片段类型。取值有：
<li>Video：视频片段；</li>
<li>Audio：音频片段；</li>
<li>Empty：空白片段；</li>
<li>Transition：转场。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 片段类型。取值有：
<li>Video：视频片段；</li>
<li>Audio：音频片段；</li>
<li>Empty：空白片段；</li>
<li>Transition：转场。</li>
     * @param Type 片段类型。取值有：
<li>Video：视频片段；</li>
<li>Audio：音频片段；</li>
<li>Empty：空白片段；</li>
<li>Transition：转场。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 视频片段，当 Type = Video 时有效。 
     * @return VideoItem 视频片段，当 Type = Video 时有效。
     */
    public VideoTrackItem getVideoItem() {
        return this.VideoItem;
    }

    /**
     * Set 视频片段，当 Type = Video 时有效。
     * @param VideoItem 视频片段，当 Type = Video 时有效。
     */
    public void setVideoItem(VideoTrackItem VideoItem) {
        this.VideoItem = VideoItem;
    }

    /**
     * Get 音频片段，当 Type = Audio 时有效。 
     * @return AudioItem 音频片段，当 Type = Audio 时有效。
     */
    public AudioTrackItem getAudioItem() {
        return this.AudioItem;
    }

    /**
     * Set 音频片段，当 Type = Audio 时有效。
     * @param AudioItem 音频片段，当 Type = Audio 时有效。
     */
    public void setAudioItem(AudioTrackItem AudioItem) {
        this.AudioItem = AudioItem;
    }

    /**
     * Get 空白片段，当 Type = Empty 时有效。空片段用于时间轴的占位。<li>如需要两个音频片段之间有一段时间的静音，可以用 EmptyTrackItem 来进行占位。</li>
<li>使用 EmptyTrackItem 进行占位，来定位某个Item。</li> 
     * @return EmptyItem 空白片段，当 Type = Empty 时有效。空片段用于时间轴的占位。<li>如需要两个音频片段之间有一段时间的静音，可以用 EmptyTrackItem 来进行占位。</li>
<li>使用 EmptyTrackItem 进行占位，来定位某个Item。</li>
     */
    public EmptyTrackItem getEmptyItem() {
        return this.EmptyItem;
    }

    /**
     * Set 空白片段，当 Type = Empty 时有效。空片段用于时间轴的占位。<li>如需要两个音频片段之间有一段时间的静音，可以用 EmptyTrackItem 来进行占位。</li>
<li>使用 EmptyTrackItem 进行占位，来定位某个Item。</li>
     * @param EmptyItem 空白片段，当 Type = Empty 时有效。空片段用于时间轴的占位。<li>如需要两个音频片段之间有一段时间的静音，可以用 EmptyTrackItem 来进行占位。</li>
<li>使用 EmptyTrackItem 进行占位，来定位某个Item。</li>
     */
    public void setEmptyItem(EmptyTrackItem EmptyItem) {
        this.EmptyItem = EmptyItem;
    }

    /**
     * Get 转场，当 Type = Transition 时有效。 
     * @return TransitionItem 转场，当 Type = Transition 时有效。
     */
    public MediaTransitionItem getTransitionItem() {
        return this.TransitionItem;
    }

    /**
     * Set 转场，当 Type = Transition 时有效。
     * @param TransitionItem 转场，当 Type = Transition 时有效。
     */
    public void setTransitionItem(MediaTransitionItem TransitionItem) {
        this.TransitionItem = TransitionItem;
    }

    public MediaTrackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTrackItem(MediaTrackItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VideoItem != null) {
            this.VideoItem = new VideoTrackItem(source.VideoItem);
        }
        if (source.AudioItem != null) {
            this.AudioItem = new AudioTrackItem(source.AudioItem);
        }
        if (source.EmptyItem != null) {
            this.EmptyItem = new EmptyTrackItem(source.EmptyItem);
        }
        if (source.TransitionItem != null) {
            this.TransitionItem = new MediaTransitionItem(source.TransitionItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "VideoItem.", this.VideoItem);
        this.setParamObj(map, prefix + "AudioItem.", this.AudioItem);
        this.setParamObj(map, prefix + "EmptyItem.", this.EmptyItem);
        this.setParamObj(map, prefix + "TransitionItem.", this.TransitionItem);

    }
}

