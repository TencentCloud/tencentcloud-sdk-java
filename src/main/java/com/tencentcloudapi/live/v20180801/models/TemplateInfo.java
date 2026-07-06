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
    * <p>视频编码：h264/h265/origin，默认h264。</p><p>origin: 保持原始编码格式</p>
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * <p>视频码率。范围：0kbps - 8000kbps。<br>0为保持原始码率。<br>注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。</p>
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * <p>音频编码：aac，默认aac。<br>注意：当前该参数未生效，待后续支持！</p>
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * <p>音频码率。取值范围：0kbps - 500kbps。<br>默认0。</p>
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Long AudioBitrate;

    /**
    * <p>宽，默认0。<br>范围[0-3000]<br>数值必须是2的倍数，0是原始宽度</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>高，默认0。<br>范围[0-3000]<br>数值必须是2的倍数，0是原始宽度</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>帧率，默认0。<br>范围0-60fps</p>
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * <p>关键帧间隔，单位：秒。<br>默认原始的间隔<br>范围2-6</p>
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * <p>旋转角度，默认0。<br>可取值：0，90，180，270</p>
    */
    @SerializedName("Rotate")
    @Expose
    private Long Rotate;

    /**
    * <p>编码质量：<br>baseline/main/high。默认baseline</p>
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * <p>当设置的码率&gt;原始码率时，是否以原始码率为准。<br>0：否， 1：是<br>默认 0。</p>
    */
    @SerializedName("BitrateToOrig")
    @Expose
    private Long BitrateToOrig;

    /**
    * <p>当设置的高度&gt;原始高度时，是否以原始高度为准。<br>0：否， 1：是<br>默认 0。</p>
    */
    @SerializedName("HeightToOrig")
    @Expose
    private Long HeightToOrig;

    /**
    * <p>当设置的帧率&gt;原始帧率时，是否以原始帧率为准。<br>0：否， 1：是<br>默认 0。</p>
    */
    @SerializedName("FpsToOrig")
    @Expose
    private Long FpsToOrig;

    /**
    * <p>是否保留视频。0：否，1：是。</p>
    */
    @SerializedName("NeedVideo")
    @Expose
    private Long NeedVideo;

    /**
    * <p>是否保留音频。0：否，1：是。</p>
    */
    @SerializedName("NeedAudio")
    @Expose
    private Long NeedAudio;

    /**
    * <p>模板 ID。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * <p>模板名称。</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>模板描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>是否是极速高清模板，0：否，1：是。默认0。</p>
    */
    @SerializedName("AiTransCode")
    @Expose
    private Long AiTransCode;

    /**
    * <p>极速高清视频码率压缩比。<br>极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)</p><p>取值范围：0.0到0.5</p>
    */
    @SerializedName("AdaptBitratePercent")
    @Expose
    private Float AdaptBitratePercent;

    /**
    * <p>是否以短边作为高度，0：否，1：是。默认0。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShortEdgeAsHeight")
    @Expose
    private Long ShortEdgeAsHeight;

    /**
    * <p>DRM 加密类型，可选值：fairplay、normalaes、widevine。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DRMType")
    @Expose
    private String DRMType;

    /**
    * <p>DRM 加密项，多个用|分割，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DRMTracks")
    @Expose
    private String DRMTracks;

    /**
    * <p>是否创建自适应码率，默认值 0。<br>0：否。<br>1：是。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAdaptiveBitRate")
    @Expose
    private Long IsAdaptiveBitRate;

    /**
    * <p>自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdaptiveChildren")
    @Expose
    private ChildTemplateInfo [] AdaptiveChildren;

    /**
    * <p>是否按需转码，0 否，1 是。</p>
    */
    @SerializedName("AudienceDrivenTranscode")
    @Expose
    private Long AudienceDrivenTranscode;

    /**
    * <p>按需转码人数阈值。</p>
    */
    @SerializedName("AudienceThreshold")
    @Expose
    private Long AudienceThreshold;

    /**
     * Get <p>视频编码：h264/h265/origin，默认h264。</p><p>origin: 保持原始编码格式</p> 
     * @return Vcodec <p>视频编码：h264/h265/origin，默认h264。</p><p>origin: 保持原始编码格式</p>
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set <p>视频编码：h264/h265/origin，默认h264。</p><p>origin: 保持原始编码格式</p>
     * @param Vcodec <p>视频编码：h264/h265/origin，默认h264。</p><p>origin: 保持原始编码格式</p>
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get <p>视频码率。范围：0kbps - 8000kbps。<br>0为保持原始码率。<br>注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。</p> 
     * @return VideoBitrate <p>视频码率。范围：0kbps - 8000kbps。<br>0为保持原始码率。<br>注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。</p>
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set <p>视频码率。范围：0kbps - 8000kbps。<br>0为保持原始码率。<br>注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。</p>
     * @param VideoBitrate <p>视频码率。范围：0kbps - 8000kbps。<br>0为保持原始码率。<br>注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。</p>
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get <p>音频编码：aac，默认aac。<br>注意：当前该参数未生效，待后续支持！</p> 
     * @return Acodec <p>音频编码：aac，默认aac。<br>注意：当前该参数未生效，待后续支持！</p>
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * Set <p>音频编码：aac，默认aac。<br>注意：当前该参数未生效，待后续支持！</p>
     * @param Acodec <p>音频编码：aac，默认aac。<br>注意：当前该参数未生效，待后续支持！</p>
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * Get <p>音频码率。取值范围：0kbps - 500kbps。<br>默认0。</p> 
     * @return AudioBitrate <p>音频码率。取值范围：0kbps - 500kbps。<br>默认0。</p>
     */
    public Long getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * Set <p>音频码率。取值范围：0kbps - 500kbps。<br>默认0。</p>
     * @param AudioBitrate <p>音频码率。取值范围：0kbps - 500kbps。<br>默认0。</p>
     */
    public void setAudioBitrate(Long AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * Get <p>宽，默认0。<br>范围[0-3000]<br>数值必须是2的倍数，0是原始宽度</p> 
     * @return Width <p>宽，默认0。<br>范围[0-3000]<br>数值必须是2的倍数，0是原始宽度</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>宽，默认0。<br>范围[0-3000]<br>数值必须是2的倍数，0是原始宽度</p>
     * @param Width <p>宽，默认0。<br>范围[0-3000]<br>数值必须是2的倍数，0是原始宽度</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>高，默认0。<br>范围[0-3000]<br>数值必须是2的倍数，0是原始宽度</p> 
     * @return Height <p>高，默认0。<br>范围[0-3000]<br>数值必须是2的倍数，0是原始宽度</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>高，默认0。<br>范围[0-3000]<br>数值必须是2的倍数，0是原始宽度</p>
     * @param Height <p>高，默认0。<br>范围[0-3000]<br>数值必须是2的倍数，0是原始宽度</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>帧率，默认0。<br>范围0-60fps</p> 
     * @return Fps <p>帧率，默认0。<br>范围0-60fps</p>
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set <p>帧率，默认0。<br>范围0-60fps</p>
     * @param Fps <p>帧率，默认0。<br>范围0-60fps</p>
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get <p>关键帧间隔，单位：秒。<br>默认原始的间隔<br>范围2-6</p> 
     * @return Gop <p>关键帧间隔，单位：秒。<br>默认原始的间隔<br>范围2-6</p>
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set <p>关键帧间隔，单位：秒。<br>默认原始的间隔<br>范围2-6</p>
     * @param Gop <p>关键帧间隔，单位：秒。<br>默认原始的间隔<br>范围2-6</p>
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get <p>旋转角度，默认0。<br>可取值：0，90，180，270</p> 
     * @return Rotate <p>旋转角度，默认0。<br>可取值：0，90，180，270</p>
     */
    public Long getRotate() {
        return this.Rotate;
    }

    /**
     * Set <p>旋转角度，默认0。<br>可取值：0，90，180，270</p>
     * @param Rotate <p>旋转角度，默认0。<br>可取值：0，90，180，270</p>
     */
    public void setRotate(Long Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get <p>编码质量：<br>baseline/main/high。默认baseline</p> 
     * @return Profile <p>编码质量：<br>baseline/main/high。默认baseline</p>
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set <p>编码质量：<br>baseline/main/high。默认baseline</p>
     * @param Profile <p>编码质量：<br>baseline/main/high。默认baseline</p>
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get <p>当设置的码率&gt;原始码率时，是否以原始码率为准。<br>0：否， 1：是<br>默认 0。</p> 
     * @return BitrateToOrig <p>当设置的码率&gt;原始码率时，是否以原始码率为准。<br>0：否， 1：是<br>默认 0。</p>
     */
    public Long getBitrateToOrig() {
        return this.BitrateToOrig;
    }

    /**
     * Set <p>当设置的码率&gt;原始码率时，是否以原始码率为准。<br>0：否， 1：是<br>默认 0。</p>
     * @param BitrateToOrig <p>当设置的码率&gt;原始码率时，是否以原始码率为准。<br>0：否， 1：是<br>默认 0。</p>
     */
    public void setBitrateToOrig(Long BitrateToOrig) {
        this.BitrateToOrig = BitrateToOrig;
    }

    /**
     * Get <p>当设置的高度&gt;原始高度时，是否以原始高度为准。<br>0：否， 1：是<br>默认 0。</p> 
     * @return HeightToOrig <p>当设置的高度&gt;原始高度时，是否以原始高度为准。<br>0：否， 1：是<br>默认 0。</p>
     */
    public Long getHeightToOrig() {
        return this.HeightToOrig;
    }

    /**
     * Set <p>当设置的高度&gt;原始高度时，是否以原始高度为准。<br>0：否， 1：是<br>默认 0。</p>
     * @param HeightToOrig <p>当设置的高度&gt;原始高度时，是否以原始高度为准。<br>0：否， 1：是<br>默认 0。</p>
     */
    public void setHeightToOrig(Long HeightToOrig) {
        this.HeightToOrig = HeightToOrig;
    }

    /**
     * Get <p>当设置的帧率&gt;原始帧率时，是否以原始帧率为准。<br>0：否， 1：是<br>默认 0。</p> 
     * @return FpsToOrig <p>当设置的帧率&gt;原始帧率时，是否以原始帧率为准。<br>0：否， 1：是<br>默认 0。</p>
     */
    public Long getFpsToOrig() {
        return this.FpsToOrig;
    }

    /**
     * Set <p>当设置的帧率&gt;原始帧率时，是否以原始帧率为准。<br>0：否， 1：是<br>默认 0。</p>
     * @param FpsToOrig <p>当设置的帧率&gt;原始帧率时，是否以原始帧率为准。<br>0：否， 1：是<br>默认 0。</p>
     */
    public void setFpsToOrig(Long FpsToOrig) {
        this.FpsToOrig = FpsToOrig;
    }

    /**
     * Get <p>是否保留视频。0：否，1：是。</p> 
     * @return NeedVideo <p>是否保留视频。0：否，1：是。</p>
     */
    public Long getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * Set <p>是否保留视频。0：否，1：是。</p>
     * @param NeedVideo <p>是否保留视频。0：否，1：是。</p>
     */
    public void setNeedVideo(Long NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * Get <p>是否保留音频。0：否，1：是。</p> 
     * @return NeedAudio <p>是否保留音频。0：否，1：是。</p>
     */
    public Long getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * Set <p>是否保留音频。0：否，1：是。</p>
     * @param NeedAudio <p>是否保留音频。0：否，1：是。</p>
     */
    public void setNeedAudio(Long NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * Get <p>模板 ID。</p> 
     * @return TemplateId <p>模板 ID。</p>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>模板 ID。</p>
     * @param TemplateId <p>模板 ID。</p>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>模板名称。</p> 
     * @return TemplateName <p>模板名称。</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名称。</p>
     * @param TemplateName <p>模板名称。</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>模板描述。</p> 
     * @return Description <p>模板描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>模板描述。</p>
     * @param Description <p>模板描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>是否是极速高清模板，0：否，1：是。默认0。</p> 
     * @return AiTransCode <p>是否是极速高清模板，0：否，1：是。默认0。</p>
     */
    public Long getAiTransCode() {
        return this.AiTransCode;
    }

    /**
     * Set <p>是否是极速高清模板，0：否，1：是。默认0。</p>
     * @param AiTransCode <p>是否是极速高清模板，0：否，1：是。默认0。</p>
     */
    public void setAiTransCode(Long AiTransCode) {
        this.AiTransCode = AiTransCode;
    }

    /**
     * Get <p>极速高清视频码率压缩比。<br>极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)</p><p>取值范围：0.0到0.5</p> 
     * @return AdaptBitratePercent <p>极速高清视频码率压缩比。<br>极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)</p><p>取值范围：0.0到0.5</p>
     */
    public Float getAdaptBitratePercent() {
        return this.AdaptBitratePercent;
    }

    /**
     * Set <p>极速高清视频码率压缩比。<br>极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)</p><p>取值范围：0.0到0.5</p>
     * @param AdaptBitratePercent <p>极速高清视频码率压缩比。<br>极速高清目标码率=VideoBitrate * (1-AdaptBitratePercent)</p><p>取值范围：0.0到0.5</p>
     */
    public void setAdaptBitratePercent(Float AdaptBitratePercent) {
        this.AdaptBitratePercent = AdaptBitratePercent;
    }

    /**
     * Get <p>是否以短边作为高度，0：否，1：是。默认0。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShortEdgeAsHeight <p>是否以短边作为高度，0：否，1：是。默认0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShortEdgeAsHeight() {
        return this.ShortEdgeAsHeight;
    }

    /**
     * Set <p>是否以短边作为高度，0：否，1：是。默认0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShortEdgeAsHeight <p>是否以短边作为高度，0：否，1：是。默认0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShortEdgeAsHeight(Long ShortEdgeAsHeight) {
        this.ShortEdgeAsHeight = ShortEdgeAsHeight;
    }

    /**
     * Get <p>DRM 加密类型，可选值：fairplay、normalaes、widevine。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DRMType <p>DRM 加密类型，可选值：fairplay、normalaes、widevine。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDRMType() {
        return this.DRMType;
    }

    /**
     * Set <p>DRM 加密类型，可选值：fairplay、normalaes、widevine。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DRMType <p>DRM 加密类型，可选值：fairplay、normalaes、widevine。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDRMType(String DRMType) {
        this.DRMType = DRMType;
    }

    /**
     * Get <p>DRM 加密项，多个用|分割，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DRMTracks <p>DRM 加密项，多个用|分割，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDRMTracks() {
        return this.DRMTracks;
    }

    /**
     * Set <p>DRM 加密项，多个用|分割，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DRMTracks <p>DRM 加密项，多个用|分割，可选值：AUDIO、SD、HD、UHD1、UHD2，后四个为一组，同组中的内容只能选一个。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDRMTracks(String DRMTracks) {
        this.DRMTracks = DRMTracks;
    }

    /**
     * Get <p>是否创建自适应码率，默认值 0。<br>0：否。<br>1：是。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAdaptiveBitRate <p>是否创建自适应码率，默认值 0。<br>0：否。<br>1：是。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsAdaptiveBitRate() {
        return this.IsAdaptiveBitRate;
    }

    /**
     * Set <p>是否创建自适应码率，默认值 0。<br>0：否。<br>1：是。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAdaptiveBitRate <p>是否创建自适应码率，默认值 0。<br>0：否。<br>1：是。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAdaptiveBitRate(Long IsAdaptiveBitRate) {
        this.IsAdaptiveBitRate = IsAdaptiveBitRate;
    }

    /**
     * Get <p>自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdaptiveChildren <p>自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChildTemplateInfo [] getAdaptiveChildren() {
        return this.AdaptiveChildren;
    }

    /**
     * Set <p>自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdaptiveChildren <p>自适应码率，子转码模板信息，当 IsAdaptiveBitRate 为 1 时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdaptiveChildren(ChildTemplateInfo [] AdaptiveChildren) {
        this.AdaptiveChildren = AdaptiveChildren;
    }

    /**
     * Get <p>是否按需转码，0 否，1 是。</p> 
     * @return AudienceDrivenTranscode <p>是否按需转码，0 否，1 是。</p>
     */
    public Long getAudienceDrivenTranscode() {
        return this.AudienceDrivenTranscode;
    }

    /**
     * Set <p>是否按需转码，0 否，1 是。</p>
     * @param AudienceDrivenTranscode <p>是否按需转码，0 否，1 是。</p>
     */
    public void setAudienceDrivenTranscode(Long AudienceDrivenTranscode) {
        this.AudienceDrivenTranscode = AudienceDrivenTranscode;
    }

    /**
     * Get <p>按需转码人数阈值。</p> 
     * @return AudienceThreshold <p>按需转码人数阈值。</p>
     */
    public Long getAudienceThreshold() {
        return this.AudienceThreshold;
    }

    /**
     * Set <p>按需转码人数阈值。</p>
     * @param AudienceThreshold <p>按需转码人数阈值。</p>
     */
    public void setAudienceThreshold(Long AudienceThreshold) {
        this.AudienceThreshold = AudienceThreshold;
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
        if (source.AudienceDrivenTranscode != null) {
            this.AudienceDrivenTranscode = new Long(source.AudienceDrivenTranscode);
        }
        if (source.AudienceThreshold != null) {
            this.AudienceThreshold = new Long(source.AudienceThreshold);
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
        this.setParamSimple(map, prefix + "AudienceDrivenTranscode", this.AudienceDrivenTranscode);
        this.setParamSimple(map, prefix + "AudienceThreshold", this.AudienceThreshold);

    }
}

