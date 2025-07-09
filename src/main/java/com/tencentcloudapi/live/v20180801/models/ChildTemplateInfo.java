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

public class ChildTemplateInfo extends AbstractModel {

    /**
    * 自适应码率转码模板，子模板Id。
入参时候，填写此字段，表示更新子模板，否则是新增子模板。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 子模板名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 视频编码：h264/h265/origin，默认origin。

origin: 保持原始编码格式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * 视频码率。范围：0kbps - 8000kbps。
0为保持原始码率。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Long VideoBitrate;

    /**
    * 宽，默认0。
范围[0-3000]。
数值必须是2的倍数，0是原始宽度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始高度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 帧率，默认0。
范围0-60fps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 关键帧间隔，单位：秒。
默认原始的间隔。
范围2-6。
同一个父模板下面的所有子模板，gop必须相等且存在。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * 是否保留视频，0：否，1：是。默认1。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeedVideo")
    @Expose
    private Long NeedVideo;

    /**
    * 是否保留音频，0：否，1：是。默认1。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeedAudio")
    @Expose
    private Long NeedAudio;

    /**
    * 当设置的码率>原始码率时，是否以原始码率为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BitrateToOrig")
    @Expose
    private Long BitrateToOrig;

    /**
    * 当设置的高度>原始高度时，是否以原始高度为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeightToOrig")
    @Expose
    private Long HeightToOrig;

    /**
    * 当设置的帧率>原始帧率时，是否以原始帧率为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FpsToOrig")
    @Expose
    private Long FpsToOrig;

    /**
    * 是否以短边作为高度，0：否，1：是。默认0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShortEdgeAsHeight")
    @Expose
    private Long ShortEdgeAsHeight;

    /**
    * HLS 分片类型。
可选值：ts、fmp4。
注：编码方式为 H.265 时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HlsContainerFormat")
    @Expose
    private String HlsContainerFormat;

    /**
    * 编码标签。
可选值：hvc1、hev1。
注：HLS 分片类型选择 fmp4 时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HlsMp4VideoCodecTag")
    @Expose
    private String HlsMp4VideoCodecTag;

    /**
     * Get 自适应码率转码模板，子模板Id。
入参时候，填写此字段，表示更新子模板，否则是新增子模板。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 自适应码率转码模板，子模板Id。
入参时候，填写此字段，表示更新子模板，否则是新增子模板。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 自适应码率转码模板，子模板Id。
入参时候，填写此字段，表示更新子模板，否则是新增子模板。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 自适应码率转码模板，子模板Id。
入参时候，填写此字段，表示更新子模板，否则是新增子模板。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 子模板名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateName 子模板名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 子模板名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateName 子模板名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 视频编码：h264/h265/origin，默认origin。

origin: 保持原始编码格式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vcodec 视频编码：h264/h265/origin，默认origin。

origin: 保持原始编码格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * Set 视频编码：h264/h265/origin，默认origin。

origin: 保持原始编码格式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vcodec 视频编码：h264/h265/origin，默认origin。

origin: 保持原始编码格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * Get 视频码率。范围：0kbps - 8000kbps。
0为保持原始码率。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoBitrate 视频码率。范围：0kbps - 8000kbps。
0为保持原始码率。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * Set 视频码率。范围：0kbps - 8000kbps。
0为保持原始码率。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoBitrate 视频码率。范围：0kbps - 8000kbps。
0为保持原始码率。
注: 转码模板有码率唯一要求，最终保存的码率可能与输入码率有所差别。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoBitrate(Long VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * Get 宽，默认0。
范围[0-3000]。
数值必须是2的倍数，0是原始宽度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 宽，默认0。
范围[0-3000]。
数值必须是2的倍数，0是原始宽度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽，默认0。
范围[0-3000]。
数值必须是2的倍数，0是原始宽度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 宽，默认0。
范围[0-3000]。
数值必须是2的倍数，0是原始宽度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始高度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 高，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始高度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始高度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 高，默认0。
范围[0-3000]
数值必须是2的倍数，0是原始高度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 帧率，默认0。
范围0-60fps。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fps 帧率，默认0。
范围0-60fps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率，默认0。
范围0-60fps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fps 帧率，默认0。
范围0-60fps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 关键帧间隔，单位：秒。
默认原始的间隔。
范围2-6。
同一个父模板下面的所有子模板，gop必须相等且存在。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gop 关键帧间隔，单位：秒。
默认原始的间隔。
范围2-6。
同一个父模板下面的所有子模板，gop必须相等且存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set 关键帧间隔，单位：秒。
默认原始的间隔。
范围2-6。
同一个父模板下面的所有子模板，gop必须相等且存在。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gop 关键帧间隔，单位：秒。
默认原始的间隔。
范围2-6。
同一个父模板下面的所有子模板，gop必须相等且存在。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get 是否保留视频，0：否，1：是。默认1。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeedVideo 是否保留视频，0：否，1：是。默认1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * Set 是否保留视频，0：否，1：是。默认1。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeedVideo 是否保留视频，0：否，1：是。默认1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeedVideo(Long NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * Get 是否保留音频，0：否，1：是。默认1。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeedAudio 是否保留音频，0：否，1：是。默认1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * Set 是否保留音频，0：否，1：是。默认1。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeedAudio 是否保留音频，0：否，1：是。默认1。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeedAudio(Long NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * Get 当设置的码率>原始码率时，是否以原始码率为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BitrateToOrig 当设置的码率>原始码率时，是否以原始码率为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitrateToOrig() {
        return this.BitrateToOrig;
    }

    /**
     * Set 当设置的码率>原始码率时，是否以原始码率为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BitrateToOrig 当设置的码率>原始码率时，是否以原始码率为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitrateToOrig(Long BitrateToOrig) {
        this.BitrateToOrig = BitrateToOrig;
    }

    /**
     * Get 当设置的高度>原始高度时，是否以原始高度为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeightToOrig 当设置的高度>原始高度时，是否以原始高度为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeightToOrig() {
        return this.HeightToOrig;
    }

    /**
     * Set 当设置的高度>原始高度时，是否以原始高度为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeightToOrig 当设置的高度>原始高度时，是否以原始高度为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeightToOrig(Long HeightToOrig) {
        this.HeightToOrig = HeightToOrig;
    }

    /**
     * Get 当设置的帧率>原始帧率时，是否以原始帧率为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FpsToOrig 当设置的帧率>原始帧率时，是否以原始帧率为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFpsToOrig() {
        return this.FpsToOrig;
    }

    /**
     * Set 当设置的帧率>原始帧率时，是否以原始帧率为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FpsToOrig 当设置的帧率>原始帧率时，是否以原始帧率为准。
0：否， 1：是
默认 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFpsToOrig(Long FpsToOrig) {
        this.FpsToOrig = FpsToOrig;
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
     * Get HLS 分片类型。
可选值：ts、fmp4。
注：编码方式为 H.265 时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HlsContainerFormat HLS 分片类型。
可选值：ts、fmp4。
注：编码方式为 H.265 时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHlsContainerFormat() {
        return this.HlsContainerFormat;
    }

    /**
     * Set HLS 分片类型。
可选值：ts、fmp4。
注：编码方式为 H.265 时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HlsContainerFormat HLS 分片类型。
可选值：ts、fmp4。
注：编码方式为 H.265 时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHlsContainerFormat(String HlsContainerFormat) {
        this.HlsContainerFormat = HlsContainerFormat;
    }

    /**
     * Get 编码标签。
可选值：hvc1、hev1。
注：HLS 分片类型选择 fmp4 时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HlsMp4VideoCodecTag 编码标签。
可选值：hvc1、hev1。
注：HLS 分片类型选择 fmp4 时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHlsMp4VideoCodecTag() {
        return this.HlsMp4VideoCodecTag;
    }

    /**
     * Set 编码标签。
可选值：hvc1、hev1。
注：HLS 分片类型选择 fmp4 时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HlsMp4VideoCodecTag 编码标签。
可选值：hvc1、hev1。
注：HLS 分片类型选择 fmp4 时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHlsMp4VideoCodecTag(String HlsMp4VideoCodecTag) {
        this.HlsMp4VideoCodecTag = HlsMp4VideoCodecTag;
    }

    public ChildTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChildTemplateInfo(ChildTemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Vcodec != null) {
            this.Vcodec = new String(source.Vcodec);
        }
        if (source.VideoBitrate != null) {
            this.VideoBitrate = new Long(source.VideoBitrate);
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
        if (source.NeedVideo != null) {
            this.NeedVideo = new Long(source.NeedVideo);
        }
        if (source.NeedAudio != null) {
            this.NeedAudio = new Long(source.NeedAudio);
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
        if (source.ShortEdgeAsHeight != null) {
            this.ShortEdgeAsHeight = new Long(source.ShortEdgeAsHeight);
        }
        if (source.HlsContainerFormat != null) {
            this.HlsContainerFormat = new String(source.HlsContainerFormat);
        }
        if (source.HlsMp4VideoCodecTag != null) {
            this.HlsMp4VideoCodecTag = new String(source.HlsMp4VideoCodecTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "NeedVideo", this.NeedVideo);
        this.setParamSimple(map, prefix + "NeedAudio", this.NeedAudio);
        this.setParamSimple(map, prefix + "BitrateToOrig", this.BitrateToOrig);
        this.setParamSimple(map, prefix + "HeightToOrig", this.HeightToOrig);
        this.setParamSimple(map, prefix + "FpsToOrig", this.FpsToOrig);
        this.setParamSimple(map, prefix + "ShortEdgeAsHeight", this.ShortEdgeAsHeight);
        this.setParamSimple(map, prefix + "HlsContainerFormat", this.HlsContainerFormat);
        this.setParamSimple(map, prefix + "HlsMp4VideoCodecTag", this.HlsMp4VideoCodecTag);

    }
}

