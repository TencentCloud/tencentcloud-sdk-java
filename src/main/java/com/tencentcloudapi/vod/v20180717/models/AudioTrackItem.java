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

public class AudioTrackItem extends AbstractModel {

    /**
    * 音频片段的媒体素材来源，可以是：
<li>点播的媒体文件 ID；</li>
<li>其他媒体文件的下载 URL。</li>
注意：当使用其他媒体文件的下载 URL 作为素材来源，且开启了访问控制（如防盗链）时，需要在 URL 携带访问控制参数（如防盗链签名）。
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
    */
    @SerializedName("SourceMediaStartTime")
    @Expose
    private Float SourceMediaStartTime;

    /**
    * 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 音频片段目标时长，单位为秒。
<li>当 TargetDuration 不填或填0时，表示目标时长和 Duration 一致；</li>
<li>当 TargetDuration 取大于0的值时，将对音频片段做快进或慢放等处理，使得输出片段的时长等于 TargetDuration。</li>
    */
    @SerializedName("TargetDuration")
    @Expose
    private Float TargetDuration;

    /**
    * 对音频片段进行的操作，如音量调节等。
    */
    @SerializedName("AudioOperations")
    @Expose
    private AudioTransform [] AudioOperations;

    /**
     * Get 音频片段的媒体素材来源，可以是：
<li>点播的媒体文件 ID；</li>
<li>其他媒体文件的下载 URL。</li>
注意：当使用其他媒体文件的下载 URL 作为素材来源，且开启了访问控制（如防盗链）时，需要在 URL 携带访问控制参数（如防盗链签名）。 
     * @return SourceMedia 音频片段的媒体素材来源，可以是：
<li>点播的媒体文件 ID；</li>
<li>其他媒体文件的下载 URL。</li>
注意：当使用其他媒体文件的下载 URL 作为素材来源，且开启了访问控制（如防盗链）时，需要在 URL 携带访问控制参数（如防盗链签名）。
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set 音频片段的媒体素材来源，可以是：
<li>点播的媒体文件 ID；</li>
<li>其他媒体文件的下载 URL。</li>
注意：当使用其他媒体文件的下载 URL 作为素材来源，且开启了访问控制（如防盗链）时，需要在 URL 携带访问控制参数（如防盗链签名）。
     * @param SourceMedia 音频片段的媒体素材来源，可以是：
<li>点播的媒体文件 ID；</li>
<li>其他媒体文件的下载 URL。</li>
注意：当使用其他媒体文件的下载 URL 作为素材来源，且开启了访问控制（如防盗链）时，需要在 URL 携带访问控制参数（如防盗链签名）。
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。 
     * @return SourceMediaStartTime 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
     */
    public Float getSourceMediaStartTime() {
        return this.SourceMediaStartTime;
    }

    /**
     * Set 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
     * @param SourceMediaStartTime 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
     */
    public void setSourceMediaStartTime(Float SourceMediaStartTime) {
        this.SourceMediaStartTime = SourceMediaStartTime;
    }

    /**
     * Get 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。 
     * @return Duration 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
     * @param Duration 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 音频片段目标时长，单位为秒。
<li>当 TargetDuration 不填或填0时，表示目标时长和 Duration 一致；</li>
<li>当 TargetDuration 取大于0的值时，将对音频片段做快进或慢放等处理，使得输出片段的时长等于 TargetDuration。</li> 
     * @return TargetDuration 音频片段目标时长，单位为秒。
<li>当 TargetDuration 不填或填0时，表示目标时长和 Duration 一致；</li>
<li>当 TargetDuration 取大于0的值时，将对音频片段做快进或慢放等处理，使得输出片段的时长等于 TargetDuration。</li>
     */
    public Float getTargetDuration() {
        return this.TargetDuration;
    }

    /**
     * Set 音频片段目标时长，单位为秒。
<li>当 TargetDuration 不填或填0时，表示目标时长和 Duration 一致；</li>
<li>当 TargetDuration 取大于0的值时，将对音频片段做快进或慢放等处理，使得输出片段的时长等于 TargetDuration。</li>
     * @param TargetDuration 音频片段目标时长，单位为秒。
<li>当 TargetDuration 不填或填0时，表示目标时长和 Duration 一致；</li>
<li>当 TargetDuration 取大于0的值时，将对音频片段做快进或慢放等处理，使得输出片段的时长等于 TargetDuration。</li>
     */
    public void setTargetDuration(Float TargetDuration) {
        this.TargetDuration = TargetDuration;
    }

    /**
     * Get 对音频片段进行的操作，如音量调节等。 
     * @return AudioOperations 对音频片段进行的操作，如音量调节等。
     */
    public AudioTransform [] getAudioOperations() {
        return this.AudioOperations;
    }

    /**
     * Set 对音频片段进行的操作，如音量调节等。
     * @param AudioOperations 对音频片段进行的操作，如音量调节等。
     */
    public void setAudioOperations(AudioTransform [] AudioOperations) {
        this.AudioOperations = AudioOperations;
    }

    public AudioTrackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTrackItem(AudioTrackItem source) {
        if (source.SourceMedia != null) {
            this.SourceMedia = new String(source.SourceMedia);
        }
        if (source.SourceMediaStartTime != null) {
            this.SourceMediaStartTime = new Float(source.SourceMediaStartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.TargetDuration != null) {
            this.TargetDuration = new Float(source.TargetDuration);
        }
        if (source.AudioOperations != null) {
            this.AudioOperations = new AudioTransform[source.AudioOperations.length];
            for (int i = 0; i < source.AudioOperations.length; i++) {
                this.AudioOperations[i] = new AudioTransform(source.AudioOperations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceMedia", this.SourceMedia);
        this.setParamSimple(map, prefix + "SourceMediaStartTime", this.SourceMediaStartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "TargetDuration", this.TargetDuration);
        this.setParamArrayObj(map, prefix + "AudioOperations.", this.AudioOperations);

    }
}

