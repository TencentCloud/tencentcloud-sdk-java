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

public class ComposeAudioItem extends AbstractModel{

    /**
    * 元素对应媒体信息。
    */
    @SerializedName("SourceMedia")
    @Expose
    private ComposeSourceMedia SourceMedia;

    /**
    * 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。
    */
    @SerializedName("TrackTime")
    @Expose
    private ComposeTrackTime TrackTime;

    /**
    * 对音频进行操作，如静音等。
    */
    @SerializedName("AudioOperations")
    @Expose
    private ComposeAudioOperation [] AudioOperations;

    /**
     * Get 元素对应媒体信息。 
     * @return SourceMedia 元素对应媒体信息。
     */
    public ComposeSourceMedia getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set 元素对应媒体信息。
     * @param SourceMedia 元素对应媒体信息。
     */
    public void setSourceMedia(ComposeSourceMedia SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。 
     * @return TrackTime 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。
     */
    public ComposeTrackTime getTrackTime() {
        return this.TrackTime;
    }

    /**
     * Set 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。
     * @param TrackTime 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。
     */
    public void setTrackTime(ComposeTrackTime TrackTime) {
        this.TrackTime = TrackTime;
    }

    /**
     * Get 对音频进行操作，如静音等。 
     * @return AudioOperations 对音频进行操作，如静音等。
     */
    public ComposeAudioOperation [] getAudioOperations() {
        return this.AudioOperations;
    }

    /**
     * Set 对音频进行操作，如静音等。
     * @param AudioOperations 对音频进行操作，如静音等。
     */
    public void setAudioOperations(ComposeAudioOperation [] AudioOperations) {
        this.AudioOperations = AudioOperations;
    }

    public ComposeAudioItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeAudioItem(ComposeAudioItem source) {
        if (source.SourceMedia != null) {
            this.SourceMedia = new ComposeSourceMedia(source.SourceMedia);
        }
        if (source.TrackTime != null) {
            this.TrackTime = new ComposeTrackTime(source.TrackTime);
        }
        if (source.AudioOperations != null) {
            this.AudioOperations = new ComposeAudioOperation[source.AudioOperations.length];
            for (int i = 0; i < source.AudioOperations.length; i++) {
                this.AudioOperations[i] = new ComposeAudioOperation(source.AudioOperations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SourceMedia.", this.SourceMedia);
        this.setParamObj(map, prefix + "TrackTime.", this.TrackTime);
        this.setParamArrayObj(map, prefix + "AudioOperations.", this.AudioOperations);

    }
}

