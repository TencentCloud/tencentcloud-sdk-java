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

public class TemplateInfo extends AbstractModel {

    /**
    * 视频编码：h264/h265/origin，默认h264。

origin: 保持原始编码格式
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * 视频码率。范围：0kbps - 8000kbps。
0为保持原始码率。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * 音频编码：aac，默认aac。
注意：当前该参数未生效，待后续支持！
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * 音频码率。取值范围：0kbps - 500kbps。
默认0。
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * 宽，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始宽度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 帧率，默认0。
范围0-60fps
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 关键帧间隔，单位：秒。
默认原始的间隔
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
baseline/main/high。默认baseline
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
    * 是否保留视频。0：否，1：是。
    */
    @SerializedName("NeedVideo")
    @Expose
    private Long NeedVideo;

    /**
    * 是否保留音频。0：否，1：是。
    */
    @SerializedName("NeedAudio")
    @Expose
    private Long NeedAudio;

    /**
    * 模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 模板名称。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 模板描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否是极速高清模板，0：否，1：是。默认0。
    */
    @SerializedName("AiTransCode")
    @Expose
    private Long AiTransCode;

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShortEdgeAsHeight")
    @Expose
    private Long ShortEdgeAsHeight;

    /**
    * DRM 加密类型，可选值：fairplay、normalaes、widevine。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DRMType")
    @Expose
    private String DRMType;

    /**
    * DRM 加密项，多个用|分割，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DRMTracks")
    @Expose
    private String DRMTracks;

    /**
    * 是否创建自适应码率，默认值 0。
0：否。
1：是。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAdaptiveBitRate")
    @Expose
    private Long IsAdaptiveBitRate;

    /**
    * 自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdaptiveChildren")
    @Expose
    private ChildTemplateInfo [] AdaptiveChildren;

    /**
     * Get 视频编码：h264/h265/origin，默认h264。

origin: 保持原始编码格式 
     * @return Vcodec 视频编码：h264/h265/origin，默认h264。

origin: 保持原始编码格式
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set 视频编码：h264/h265/origin，默认h264。

origin: 保持原始编码格式
     * @param Vcodec 视频编码：h264/h265/origin，默认h264。

origin: 保持原始编码格式
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
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
     * Get 音频码率。取值范围：0kbps - 500kbps。
默认0。 
     * @return AudioBitrate 音频码率。取值范围：0kbps - 500kbps。
默认0。
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set 音频码率。取值范围：0kbps - 500kbps。
默认0。
     * @param AudioBitrate 音频码率。取值范围：0kbps - 500kbps。
默认0。
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get 宽，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始宽度 
     * @return Width 宽，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始宽度
     * @param Width 宽，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始宽度 
     * @return Height 高，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始宽度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始宽度
     * @param Height 高，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始宽度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 帧率，默认0。
范围0-60fps 
     * @return Fps 帧率，默认0。
范围0-60fps
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率，默认0。
范围0-60fps
     * @param Fps 帧率，默认0。
范围0-60fps
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 关键帧间隔，单位：秒。
默认原始的间隔
范围2-6 
     * @return Gop 关键帧间隔，单位：秒。
默认原始的间隔
范围2-6
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set 关键帧间隔，单位：秒。
默认原始的间隔
范围2-6
     * @param Gop 关键帧间隔，单位：秒。
默认原始的间隔
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
baseline/main/high。默认baseline 
     * @return Profile 编码质量：
baseline/main/high。默认baseline
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 编码质量：
baseline/main/high。默认baseline
     * @param Profile 编码质量：
baseline/main/high。默认baseline
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
     * Get 是否保留视频。0：否，1：是。 
     * @return NeedVideo 是否保留视频。0：否，1：是。
     */
    public Long getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * Set 是否保留视频。0：否，1：是。
     * @param NeedVideo 是否保留视频。0：否，1：是。
     */
    public void setNeedVideo(Long NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * Get 是否保留音频。0：否，1：是。 
     * @return NeedAudio 是否保留音频。0：否，1：是。
     */
    public Long getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * Set 是否保留音频。0：否，1：是。
     * @param NeedAudio 是否保留音频。0：否，1：是。
     */
    public void setNeedAudio(Long NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * Get 模板 ID。 
     * @return TemplateId 模板 ID。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板 ID。
     * @param TemplateId 模板 ID。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板名称。 
     * @return TemplateName 模板名称。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名称。
     * @param TemplateName 模板名称。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
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
     * Get 是否是极速高清模板，0：否，1：是。默认0。 
     * @return AiTransCode 是否是极速高清模板，0：否，1：是。默认0。
     */
    public Long getAiTransCode() {
        return this.AiTransCode;
    }

    /**
     * Set 是否是极速高清模板，0：否，1：是。默认0。
     * @param AiTransCode 是否是极速高清模板，0：否，1：是。默认0。
     */
    public void setAiTransCode(Long AiTransCode) {
        this.AiTransCode = AiTransCode;
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShortEdgeAsHeight 是否以短边作为高度，0：否，1：是。默认0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShortEdgeAsHeight() {
        return this.ShortEdgeAsHeight;
    }

    /**
     * Set 是否以短边作为高度，0：否，1：是。默认0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShortEdgeAsHeight 是否以短边作为高度，0：否，1：是。默认0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShortEdgeAsHeight(Long ShortEdgeAsHeight) {
        this.ShortEdgeAsHeight = ShortEdgeAsHeight;
    }

    /**
     * Get DRM 加密类型，可选值：fairplay、normalaes、widevine。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DRMType DRM 加密类型，可选值：fairplay、normalaes、widevine。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDRMType() {
        return this.DRMType;
    }

    /**
     * Set DRM 加密类型，可选值：fairplay、normalaes、widevine。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DRMType DRM 加密类型，可选值：fairplay、normalaes、widevine。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDRMType(String DRMType) {
        this.DRMType = DRMType;
    }

    /**
     * Get DRM 加密项，多个用|分割，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DRMTracks DRM 加密项，多个用|分割，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDRMTracks() {
        return this.DRMTracks;
    }

    /**
     * Set DRM 加密项，多个用|分割，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DRMTracks DRM 加密项，多个用|分割，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDRMTracks(String DRMTracks) {
        this.DRMTracks = DRMTracks;
    }

    /**
     * Get 是否创建自适应码率，默认值 0。
0：否。
1：是。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAdaptiveBitRate 是否创建自适应码率，默认值 0。
0：否。
1：是。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAdaptiveBitRate() {
        return this.IsAdaptiveBitRate;
    }

    /**
     * Set 是否创建自适应码率，默认值 0。
0：否。
1：是。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAdaptiveBitRate 是否创建自适应码率，默认值 0。
0：否。
1：是。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAdaptiveBitRate(Long IsAdaptiveBitRate) {
        this.IsAdaptiveBitRate = IsAdaptiveBitRate;
    }

    /**
     * Get 自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdaptiveChildren 自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChildTemplateInfo [] getAdaptiveChildren() {
        return this.AdaptiveChildren;
    }

    /**
     * Set 自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdaptiveChildren 自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdaptiveChildren(ChildTemplateInfo [] AdaptiveChildren) {
        this.AdaptiveChildren = AdaptiveChildren;
    }

    public TemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateInfo(TemplateInfo source) {
        if (source.Vcodec != null) {
            this.Vcodec = new String(source.Vcodec);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
        }
        if (source.Acodec != null) {
            this.Acodec = new String(source.Acodec);
        }
        if (source.AudioBitrate != null) {
            this.AudioBitrate = new Long(source.AudioBitrate);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
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
        if (source.NeedVideo != null) {
            this.NeedVideo = new Long(source.NeedVideo);
        }
        if (source.NeedAudio != null) {
            this.NeedAudio = new Long(source.NeedAudio);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AiTransCode != null) {
            this.AiTransCode = new Long(source.AiTransCode);
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
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "BitrateToOrig", this.BitrateToOrig);
        this.setParamSimple(map, prefix + "HeightToOrig", this.HeightToOrig);
        this.setParamSimple(map, prefix + "FpsToOrig", this.FpsToOrig);
        this.setParamSimple(map, prefix + "NeedVideo", this.NeedVideo);
        this.setParamSimple(map, prefix + "NeedAudio", this.NeedAudio);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AiTransCode", this.AiTransCode);
        this.setParamSimple(map, prefix + "AdaptBitratePercent", this.AdaptBitratePercent);
        this.setParamSimple(map, prefix + "ShortEdgeAsHeight", this.ShortEdgeAsHeight);
        this.setParamSimple(map, prefix + "DRMType", this.DRMType);
        this.setParamSimple(map, prefix + "DRMTracks", this.DRMTracks);
        this.setParamSimple(map, prefix + "IsAdaptiveBitRate", this.IsAdaptiveBitRate);
        this.setParamArrayObj(map, prefix + "AdaptiveChildren.", this.AdaptiveChildren);

    }
}

