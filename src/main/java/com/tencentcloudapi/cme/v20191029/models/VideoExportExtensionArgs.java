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

public class VideoExportExtensionArgs extends AbstractModel{

    /**
    * 封装格式，可选值：
<li>mp4 </li>
<li>mov </li>
不填则使用视频导出编码配置。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 视频短边尺寸，取值范围： [128, 4096]，单位：px。
视频最后的分辨率，根据短边尺寸和宽高比进行计算。
例如：项目的宽高比是 16：9 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720</li>
不填则使用视频导出编码配置。
    */
    @SerializedName("ShortEdge")
    @Expose
    private Long ShortEdge;

    /**
    * 指定码率，单位 bps。当该参数为 0 时则不强制限定码率。
不填则使用视频导出编码配置。
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * 帧率。取值范围：[15, 60]，不填默认值为 25。
    */
    @SerializedName("FrameRate")
    @Expose
    private Float FrameRate;

    /**
    * 是否去除视频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
不填则使用视频导出编码配置。
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 是否去除音频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
不填则使用视频导出编码配置。
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * 片段起始时间，单位：毫秒。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 片段结束时间，单位：毫秒。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 封装格式，可选值：
<li>mp4 </li>
<li>mov </li>
不填则使用视频导出编码配置。 
     * @return Container 封装格式，可选值：
<li>mp4 </li>
<li>mov </li>
不填则使用视频导出编码配置。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 封装格式，可选值：
<li>mp4 </li>
<li>mov </li>
不填则使用视频导出编码配置。
     * @param Container 封装格式，可选值：
<li>mp4 </li>
<li>mov </li>
不填则使用视频导出编码配置。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 视频短边尺寸，取值范围： [128, 4096]，单位：px。
视频最后的分辨率，根据短边尺寸和宽高比进行计算。
例如：项目的宽高比是 16：9 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720</li>
不填则使用视频导出编码配置。 
     * @return ShortEdge 视频短边尺寸，取值范围： [128, 4096]，单位：px。
视频最后的分辨率，根据短边尺寸和宽高比进行计算。
例如：项目的宽高比是 16：9 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720</li>
不填则使用视频导出编码配置。
     */
    public Long getShortEdge() {
        return this.ShortEdge;
    }

    /**
     * Set 视频短边尺寸，取值范围： [128, 4096]，单位：px。
视频最后的分辨率，根据短边尺寸和宽高比进行计算。
例如：项目的宽高比是 16：9 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720</li>
不填则使用视频导出编码配置。
     * @param ShortEdge 视频短边尺寸，取值范围： [128, 4096]，单位：px。
视频最后的分辨率，根据短边尺寸和宽高比进行计算。
例如：项目的宽高比是 16：9 ：
<li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li>
<li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720</li>
不填则使用视频导出编码配置。
     */
    public void setShortEdge(Long ShortEdge) {
        this.ShortEdge = ShortEdge;
    }

    /**
     * Get 指定码率，单位 bps。当该参数为 0 时则不强制限定码率。
不填则使用视频导出编码配置。 
     * @return VideoBitrate 指定码率，单位 bps。当该参数为 0 时则不强制限定码率。
不填则使用视频导出编码配置。
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set 指定码率，单位 bps。当该参数为 0 时则不强制限定码率。
不填则使用视频导出编码配置。
     * @param VideoBitrate 指定码率，单位 bps。当该参数为 0 时则不强制限定码率。
不填则使用视频导出编码配置。
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get 帧率。取值范围：[15, 60]，不填默认值为 25。 
     * @return FrameRate 帧率。取值范围：[15, 60]，不填默认值为 25。
     */
    public Float getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set 帧率。取值范围：[15, 60]，不填默认值为 25。
     * @param FrameRate 帧率。取值范围：[15, 60]，不填默认值为 25。
     */
    public void setFrameRate(Float FrameRate) {
        this.FrameRate = FrameRate;
    }

    /**
     * Get 是否去除视频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
不填则使用视频导出编码配置。 
     * @return RemoveVideo 是否去除视频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
不填则使用视频导出编码配置。
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set 是否去除视频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
不填则使用视频导出编码配置。
     * @param RemoveVideo 是否去除视频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
不填则使用视频导出编码配置。
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get 是否去除音频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
不填则使用视频导出编码配置。 
     * @return RemoveAudio 是否去除音频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
不填则使用视频导出编码配置。
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set 是否去除音频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
不填则使用视频导出编码配置。
     * @param RemoveAudio 是否去除音频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
不填则使用视频导出编码配置。
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get 片段起始时间，单位：毫秒。 
     * @return StartTime 片段起始时间，单位：毫秒。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 片段起始时间，单位：毫秒。
     * @param StartTime 片段起始时间，单位：毫秒。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 片段结束时间，单位：毫秒。 
     * @return EndTime 片段结束时间，单位：毫秒。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 片段结束时间，单位：毫秒。
     * @param EndTime 片段结束时间，单位：毫秒。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public VideoExportExtensionArgs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoExportExtensionArgs(VideoExportExtensionArgs source) {
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.ShortEdge != null) {
            this.ShortEdge = new Long(source.ShortEdge);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
        }
        if (source.FrameRate != null) {
            this.FrameRate = new Float(source.FrameRate);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "ShortEdge", this.ShortEdge);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "FrameRate", this.FrameRate);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

