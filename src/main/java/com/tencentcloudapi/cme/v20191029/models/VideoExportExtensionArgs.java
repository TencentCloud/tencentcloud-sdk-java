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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoExportExtensionArgs extends AbstractModel {

    /**
    * <p>封装格式，可选值：</p><li>mp4 </li><li>mov </li>不填则使用视频导出编码配置。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>视频短边尺寸，取值范围： [128, 4096]，单位：px。<br>视频最后的分辨率，根据短边尺寸和宽高比进行计算。<br>例如：项目的宽高比是 16：9 ：</p><li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li><li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720</li>不填则使用视频导出编码配置。
    */
    @SerializedName("ShortEdge")
    @Expose
    private Long ShortEdge;

    /**
    * <p>指定码率，单位 bps。当该参数为 0 时则不强制限定码率。<br>不填则使用视频导出编码配置。</p>
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * <p>帧率。取值范围：[15, 60]，不填默认值为 25。</p><p>单位：帧</p>
    */
    @SerializedName("FrameRate")
    @Expose
    private Float FrameRate;

    /**
    * <p>是否去除视频数据，可选值：</p><li>0：保留；</li><li>1：去除。</li>不填则使用视频导出编码配置。
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * <p>是否去除音频数据，可选值：</p><li>0：保留；</li><li>1：去除。</li>不填则使用视频导出编码配置。
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * <p>片段起始时间，单位：毫秒。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>片段结束时间，单位：毫秒。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get <p>封装格式，可选值：</p><li>mp4 </li><li>mov </li>不填则使用视频导出编码配置。 
     * @return Container <p>封装格式，可选值：</p><li>mp4 </li><li>mov </li>不填则使用视频导出编码配置。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>封装格式，可选值：</p><li>mp4 </li><li>mov </li>不填则使用视频导出编码配置。
     * @param Container <p>封装格式，可选值：</p><li>mp4 </li><li>mov </li>不填则使用视频导出编码配置。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p>视频短边尺寸，取值范围： [128, 4096]，单位：px。<br>视频最后的分辨率，根据短边尺寸和宽高比进行计算。<br>例如：项目的宽高比是 16：9 ：</p><li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li><li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720</li>不填则使用视频导出编码配置。 
     * @return ShortEdge <p>视频短边尺寸，取值范围： [128, 4096]，单位：px。<br>视频最后的分辨率，根据短边尺寸和宽高比进行计算。<br>例如：项目的宽高比是 16：9 ：</p><li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li><li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720</li>不填则使用视频导出编码配置。
     */
    public Long getShortEdge() {
        return this.ShortEdge;
    }

    /**
     * Set <p>视频短边尺寸，取值范围： [128, 4096]，单位：px。<br>视频最后的分辨率，根据短边尺寸和宽高比进行计算。<br>例如：项目的宽高比是 16：9 ：</p><li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li><li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720</li>不填则使用视频导出编码配置。
     * @param ShortEdge <p>视频短边尺寸，取值范围： [128, 4096]，单位：px。<br>视频最后的分辨率，根据短边尺寸和宽高比进行计算。<br>例如：项目的宽高比是 16：9 ：</p><li>短边尺寸为 1080，则导出视频的分辨率为 1920 * 1080。</li><li>短边尺寸为 720，则导出视频的分辨率为 1280 * 720</li>不填则使用视频导出编码配置。
     */
    public void setShortEdge(Long ShortEdge) {
        this.ShortEdge = ShortEdge;
    }

    /**
     * Get <p>指定码率，单位 bps。当该参数为 0 时则不强制限定码率。<br>不填则使用视频导出编码配置。</p> 
     * @return VideoBitrate <p>指定码率，单位 bps。当该参数为 0 时则不强制限定码率。<br>不填则使用视频导出编码配置。</p>
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set <p>指定码率，单位 bps。当该参数为 0 时则不强制限定码率。<br>不填则使用视频导出编码配置。</p>
     * @param VideoBitrate <p>指定码率，单位 bps。当该参数为 0 时则不强制限定码率。<br>不填则使用视频导出编码配置。</p>
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get <p>帧率。取值范围：[15, 60]，不填默认值为 25。</p><p>单位：帧</p> 
     * @return FrameRate <p>帧率。取值范围：[15, 60]，不填默认值为 25。</p><p>单位：帧</p>
     */
    public Float getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set <p>帧率。取值范围：[15, 60]，不填默认值为 25。</p><p>单位：帧</p>
     * @param FrameRate <p>帧率。取值范围：[15, 60]，不填默认值为 25。</p><p>单位：帧</p>
     */
    public void setFrameRate(Float FrameRate) {
        this.FrameRate = FrameRate;
    }

    /**
     * Get <p>是否去除视频数据，可选值：</p><li>0：保留；</li><li>1：去除。</li>不填则使用视频导出编码配置。 
     * @return RemoveVideo <p>是否去除视频数据，可选值：</p><li>0：保留；</li><li>1：去除。</li>不填则使用视频导出编码配置。
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set <p>是否去除视频数据，可选值：</p><li>0：保留；</li><li>1：去除。</li>不填则使用视频导出编码配置。
     * @param RemoveVideo <p>是否去除视频数据，可选值：</p><li>0：保留；</li><li>1：去除。</li>不填则使用视频导出编码配置。
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get <p>是否去除音频数据，可选值：</p><li>0：保留；</li><li>1：去除。</li>不填则使用视频导出编码配置。 
     * @return RemoveAudio <p>是否去除音频数据，可选值：</p><li>0：保留；</li><li>1：去除。</li>不填则使用视频导出编码配置。
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set <p>是否去除音频数据，可选值：</p><li>0：保留；</li><li>1：去除。</li>不填则使用视频导出编码配置。
     * @param RemoveAudio <p>是否去除音频数据，可选值：</p><li>0：保留；</li><li>1：去除。</li>不填则使用视频导出编码配置。
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get <p>片段起始时间，单位：毫秒。</p> 
     * @return StartTime <p>片段起始时间，单位：毫秒。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>片段起始时间，单位：毫秒。</p>
     * @param StartTime <p>片段起始时间，单位：毫秒。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>片段结束时间，单位：毫秒。</p> 
     * @return EndTime <p>片段结束时间，单位：毫秒。</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>片段结束时间，单位：毫秒。</p>
     * @param EndTime <p>片段结束时间，单位：毫秒。</p>
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

