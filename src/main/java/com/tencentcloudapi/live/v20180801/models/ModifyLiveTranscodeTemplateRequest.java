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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveTranscodeTemplateRequest extends AbstractModel {

    /**
    * 模板 Id。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 视频编码：h264/h265/origin，默认origin。

origin: 保持原始编码格式
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * 音频编码：aac，默认aac。
注意：当前该参数未生效，待后续支持！
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * 音频码率，默认0。
范围：0-500。
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * 模板描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 视频码率。范围：0kbps - 8000kbps。
0为保持原始码率。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * 宽。0-3000。
数值必须是2的倍数，0是原始宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 是否保留视频，0：否，1：是。默认1。
    */
    @SerializedName("NeedVideo")
    @Expose
    private Long NeedVideo;

    /**
    * 是否保留音频，0：否，1：是。默认1。
    */
    @SerializedName("NeedAudio")
    @Expose
    private Long NeedAudio;

    /**
    * 高。0-3000。
数值必须是2的倍数，0是原始宽度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 帧率，默认0。
范围0-60
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 关键帧间隔，单位：秒。
范围2-6
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * 旋转角度，默认0。
可取值：0，90，180，270
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * 编码质量：
baseline/main/high。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * 当设置的码率>原始码率时，是否以原始码率为准。
0：否， 1：是
默认 0。
    */
    @SerializedName("BitrateToOrig")
    @Expose
    private Long BitrateToOrig;

    /**
    * 当设置的高度>原始高度时，是否以原始高度为准。
0：否， 1：是
默认 0。
    */
    @SerializedName("HeightToOrig")
    @Expose
    private Long HeightToOrig;

    /**
    * 当设置的帧率>原始帧率时，是否以原始帧率为准。
0：否， 1：是
默认 0。
    */
    @SerializedName("FpsToOrig")
    @Expose
    private Long FpsToOrig;

    /**
    * 极速高清视频码率压缩比。
极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)

取值范围：0.0到0.5
    */
    @SerializedName("AdaptBitratePercent")
    @Expose
    private Float AdaptBitratePercent;

    /**
    * 是否以短边作为高度，0：否，1：是。默认0。
    */
    @SerializedName("ShortEdgeAsHeight")
    @Expose
    private Long ShortEdgeAsHeight;

    /**
    * DRM 加密类型，可选值：fairplay、normalaes、widevine。
不传递或者为空字符串，清空之前的DRM配置。
    */
    @SerializedName("DRMType")
    @Expose
    private String DRMType;

    /**
    * DRM 加密项，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。
不传递或者为空字符串，清空之前的DRM配置。
    */
    @SerializedName("DRMTracks")
    @Expose
    private String DRMTracks;

    /**
    * 是否创建自适应码率，默认值 0。
0：否。
1：是。
    */
    @SerializedName("IsAdaptiveBitRate")
    @Expose
    private Long IsAdaptiveBitRate;

    /**
    * 自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。
    */
    @SerializedName("AdaptiveChildren")
    @Expose
    private ChildTemplateInfo [] AdaptiveChildren;

    /**
     * Get 模板 Id。 
     * @return TemplateId 模板 Id。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板 Id。
     * @param TemplateId 模板 Id。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 视频编码：h264/h265/origin，默认origin。

origin: 保持原始编码格式 
     * @return Vcodec 视频编码：h264/h265/origin，默认origin。

origin: 保持原始编码格式
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set 视频编码：h264/h265/origin，默认origin。

origin: 保持原始编码格式
     * @param Vcodec 视频编码：h264/h265/origin，默认origin。

origin: 保持原始编码格式
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get 音频编码：aac，默认aac。
注意：当前该参数未生效，待后续支持！ 
     * @return Acodec 音频编码：aac，默认aac。
注意：当前该参数未生效，待后续支持！
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set 音频编码：aac，默认aac。
注意：当前该参数未生效，待后续支持！
     * @param Acodec 音频编码：aac，默认aac。
注意：当前该参数未生效，待后续支持！
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get 音频码率，默认0。
范围：0-500。 
     * @return AudioBitrate 音频码率，默认0。
范围：0-500。
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set 音频码率，默认0。
范围：0-500。
     * @param AudioBitrate 音频码率，默认0。
范围：0-500。
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get 模板描述。 
     * @return Description 模板描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模板描述。
     * @param Description 模板描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 视频码率。范围：0kbps - 8000kbps。
0为保持原始码率。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。 
     * @return VideoBitrate 视频码率。范围：0kbps - 8000kbps。
0为保持原始码率。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set 视频码率。范围：0kbps - 8000kbps。
0为保持原始码率。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
     * @param VideoBitrate 视频码率。范围：0kbps - 8000kbps。
0为保持原始码率。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get 宽。0-3000。
数值必须是2的倍数，0是原始宽度 
     * @return Width 宽。0-3000。
数值必须是2的倍数，0是原始宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽。0-3000。
数值必须是2的倍数，0是原始宽度
     * @param Width 宽。0-3000。
数值必须是2的倍数，0是原始宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 是否保留视频，0：否，1：是。默认1。 
     * @return NeedVideo 是否保留视频，0：否，1：是。默认1。
     */
    public Long getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * Set 是否保留视频，0：否，1：是。默认1。
     * @param NeedVideo 是否保留视频，0：否，1：是。默认1。
     */
    public void setNeedVideo(Long NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * Get 是否保留音频，0：否，1：是。默认1。 
     * @return NeedAudio 是否保留音频，0：否，1：是。默认1。
     */
    public Long getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * Set 是否保留音频，0：否，1：是。默认1。
     * @param NeedAudio 是否保留音频，0：否，1：是。默认1。
     */
    public void setNeedAudio(Long NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * Get 高。0-3000。
数值必须是2的倍数，0是原始宽度 
     * @return Height 高。0-3000。
数值必须是2的倍数，0是原始宽度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高。0-3000。
数值必须是2的倍数，0是原始宽度
     * @param Height 高。0-3000。
数值必须是2的倍数，0是原始宽度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 帧率，默认0。
范围0-60 
     * @return Fps 帧率，默认0。
范围0-60
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率，默认0。
范围0-60
     * @param Fps 帧率，默认0。
范围0-60
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 关键帧间隔，单位：秒。
范围2-6 
     * @return Gop 关键帧间隔，单位：秒。
范围2-6
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set 关键帧间隔，单位：秒。
范围2-6
     * @param Gop 关键帧间隔，单位：秒。
范围2-6
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get 旋转角度，默认0。
可取值：0，90，180，270 
     * @return Rotate 旋转角度，默认0。
可取值：0，90，180，270
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set 旋转角度，默认0。
可取值：0，90，180，270
     * @param Rotate 旋转角度，默认0。
可取值：0，90，180，270
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get 编码质量：
baseline/main/high。 
     * @return Profile 编码质量：
baseline/main/high。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 编码质量：
baseline/main/high。
     * @param Profile 编码质量：
baseline/main/high。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get 当设置的码率>原始码率时，是否以原始码率为准。
0：否， 1：是
默认 0。 
     * @return BitrateToOrig 当设置的码率>原始码率时，是否以原始码率为准。
0：否， 1：是
默认 0。
     */
    public Long getBitrateToOrig() {
        return this.BitrateToOrig;
    }

    /**
     * Set 当设置的码率>原始码率时，是否以原始码率为准。
0：否， 1：是
默认 0。
     * @param BitrateToOrig 当设置的码率>原始码率时，是否以原始码率为准。
0：否， 1：是
默认 0。
     */
    public void setBitrateToOrig(Long BitrateToOrig) {
        this.BitrateToOrig = BitrateToOrig;
    }

    /**
     * Get 当设置的高度>原始高度时，是否以原始高度为准。
0：否， 1：是
默认 0。 
     * @return HeightToOrig 当设置的高度>原始高度时，是否以原始高度为准。
0：否， 1：是
默认 0。
     */
    public Long getHeightToOrig() {
        return this.HeightToOrig;
    }

    /**
     * Set 当设置的高度>原始高度时，是否以原始高度为准。
0：否， 1：是
默认 0。
     * @param HeightToOrig 当设置的高度>原始高度时，是否以原始高度为准。
0：否， 1：是
默认 0。
     */
    public void setHeightToOrig(Long HeightToOrig) {
        this.HeightToOrig = HeightToOrig;
    }

    /**
     * Get 当设置的帧率>原始帧率时，是否以原始帧率为准。
0：否， 1：是
默认 0。 
     * @return FpsToOrig 当设置的帧率>原始帧率时，是否以原始帧率为准。
0：否， 1：是
默认 0。
     */
    public Long getFpsToOrig() {
        return this.FpsToOrig;
    }

    /**
     * Set 当设置的帧率>原始帧率时，是否以原始帧率为准。
0：否， 1：是
默认 0。
     * @param FpsToOrig 当设置的帧率>原始帧率时，是否以原始帧率为准。
0：否， 1：是
默认 0。
     */
    public void setFpsToOrig(Long FpsToOrig) {
        this.FpsToOrig = FpsToOrig;
    }

    /**
     * Get 极速高清视频码率压缩比。
极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)

取值范围：0.0到0.5 
     * @return AdaptBitratePercent 极速高清视频码率压缩比。
极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)

取值范围：0.0到0.5
     */
    public Float getAdaptBitratePercent() {
        return this.AdaptBitratePercent;
    }

    /**
     * Set 极速高清视频码率压缩比。
极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)

取值范围：0.0到0.5
     * @param AdaptBitratePercent 极速高清视频码率压缩比。
极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)

取值范围：0.0到0.5
     */
    public void setAdaptBitratePercent(Float AdaptBitratePercent) {
        this.AdaptBitratePercent = AdaptBitratePercent;
    }

    /**
     * Get 是否以短边作为高度，0：否，1：是。默认0。 
     * @return ShortEdgeAsHeight 是否以短边作为高度，0：否，1：是。默认0。
     */
    public Long getShortEdgeAsHeight() {
        return this.ShortEdgeAsHeight;
    }

    /**
     * Set 是否以短边作为高度，0：否，1：是。默认0。
     * @param ShortEdgeAsHeight 是否以短边作为高度，0：否，1：是。默认0。
     */
    public void setShortEdgeAsHeight(Long ShortEdgeAsHeight) {
        this.ShortEdgeAsHeight = ShortEdgeAsHeight;
    }

    /**
     * Get DRM 加密类型，可选值：fairplay、normalaes、widevine。
不传递或者为空字符串，清空之前的DRM配置。 
     * @return DRMType DRM 加密类型，可选值：fairplay、normalaes、widevine。
不传递或者为空字符串，清空之前的DRM配置。
     */
    public String getDRMType() {
        return this.DRMType;
    }

    /**
     * Set DRM 加密类型，可选值：fairplay、normalaes、widevine。
不传递或者为空字符串，清空之前的DRM配置。
     * @param DRMType DRM 加密类型，可选值：fairplay、normalaes、widevine。
不传递或者为空字符串，清空之前的DRM配置。
     */
    public void setDRMType(String DRMType) {
        this.DRMType = DRMType;
    }

    /**
     * Get DRM 加密项，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。
不传递或者为空字符串，清空之前的DRM配置。 
     * @return DRMTracks DRM 加密项，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。
不传递或者为空字符串，清空之前的DRM配置。
     */
    public String getDRMTracks() {
        return this.DRMTracks;
    }

    /**
     * Set DRM 加密项，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。
不传递或者为空字符串，清空之前的DRM配置。
     * @param DRMTracks DRM 加密项，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。
不传递或者为空字符串，清空之前的DRM配置。
     */
    public void setDRMTracks(String DRMTracks) {
        this.DRMTracks = DRMTracks;
    }

    /**
     * Get 是否创建自适应码率，默认值 0。
0：否。
1：是。 
     * @return IsAdaptiveBitRate 是否创建自适应码率，默认值 0。
0：否。
1：是。
     */
    public Long getIsAdaptiveBitRate() {
        return this.IsAdaptiveBitRate;
    }

    /**
     * Set 是否创建自适应码率，默认值 0。
0：否。
1：是。
     * @param IsAdaptiveBitRate 是否创建自适应码率，默认值 0。
0：否。
1：是。
     */
    public void setIsAdaptiveBitRate(Long IsAdaptiveBitRate) {
        this.IsAdaptiveBitRate = IsAdaptiveBitRate;
    }

    /**
     * Get 自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。 
     * @return AdaptiveChildren 自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。
     */
    public ChildTemplateInfo [] getAdaptiveChildren() {
        return this.AdaptiveChildren;
    }

    /**
     * Set 自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。
     * @param AdaptiveChildren 自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。
     */
    public void setAdaptiveChildren(ChildTemplateInfo [] AdaptiveChildren) {
        this.AdaptiveChildren = AdaptiveChildren;
    }

    public ModifyLiveTranscodeTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveTranscodeTemplateRequest(ModifyLiveTranscodeTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Vcodec != null) {
            this.Vcodec = new String(source.Vcodec);
        }
        if (source.Acodec != null) {
            this.Acodec = new String(source.Acodec);
        }
        if (source.AudioBitrate != null) {
            this.AudioBitrate = new Long(source.AudioBitrate);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.NeedVideo != null) {
            this.NeedVideo = new Long(source.NeedVideo);
        }
        if (source.NeedAudio != null) {
            this.NeedAudio = new Long(source.NeedAudio);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
        if (source.Rotate != null) {
            this.Rotate = new Long(source.Rotate);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.BitrateToOrig != null) {
            this.BitrateToOrig = new Long(source.BitrateToOrig);
        }
        if (source.HeightToOrig != null) {
            this.HeightToOrig = new Long(source.HeightToOrig);
        }
        if (source.FpsToOrig != null) {
            this.FpsToOrig = new Long(source.FpsToOrig);
        }
        if (source.AdaptBitratePercent != null) {
            this.AdaptBitratePercent = new Float(source.AdaptBitratePercent);
        }
        if (source.ShortEdgeAsHeight != null) {
            this.ShortEdgeAsHeight = new Long(source.ShortEdgeAsHeight);
        }
        if (source.DRMType != null) {
            this.DRMType = new String(source.DRMType);
        }
        if (source.DRMTracks != null) {
            this.DRMTracks = new String(source.DRMTracks);
        }
        if (source.IsAdaptiveBitRate != null) {
            this.IsAdaptiveBitRate = new Long(source.IsAdaptiveBitRate);
        }
        if (source.AdaptiveChildren != null) {
            this.AdaptiveChildren = new ChildTemplateInfo[source.AdaptiveChildren.length];
            for (int i = 0; i < source.AdaptiveChildren.length; i++) {
                this.AdaptiveChildren[i] = new ChildTemplateInfo(source.AdaptiveChildren[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "NeedVideo", this.NeedVideo);
        this.setParamSimple(map, prefix + "NeedAudio", this.NeedAudio);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "BitrateToOrig", this.BitrateToOrig);
        this.setParamSimple(map, prefix + "HeightToOrig", this.HeightToOrig);
        this.setParamSimple(map, prefix + "FpsToOrig", this.FpsToOrig);
        this.setParamSimple(map, prefix + "AdaptBitratePercent", this.AdaptBitratePercent);
        this.setParamSimple(map, prefix + "ShortEdgeAsHeight", this.ShortEdgeAsHeight);
        this.setParamSimple(map, prefix + "DRMType", this.DRMType);
        this.setParamSimple(map, prefix + "DRMTracks", this.DRMTracks);
        this.setParamSimple(map, prefix + "IsAdaptiveBitRate", this.IsAdaptiveBitRate);
        this.setParamArrayObj(map, prefix + "AdaptiveChildren.", this.AdaptiveChildren);

    }
}

