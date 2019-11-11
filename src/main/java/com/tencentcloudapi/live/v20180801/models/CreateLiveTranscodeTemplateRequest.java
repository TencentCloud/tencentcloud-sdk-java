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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveTranscodeTemplateRequest  extends AbstractModel{

    /**
    * 模板名称，例：900 900p 仅支持字母和数字的组合。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 视频码率。范围：100-8000。
    */
    @SerializedName("VideoBitrate")
    @Expose
    private Integer VideoBitrate;

    /**
    * 视频编码：h264/h265，默认h264。
    */
    @SerializedName("Vcodec")
    @Expose
    private String Vcodec;

    /**
    * 音频编码：aac，默认原始音频格式。
注意：当前该参数未生效，待后续支持！
    */
    @SerializedName("Acodec")
    @Expose
    private String Acodec;

    /**
    * 音频码率：默认0。0-500。
    */
    @SerializedName("AudioBitrate")
    @Expose
    private Integer AudioBitrate;

    /**
    * 模板描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 宽，默认0。
    */
    @SerializedName("Width")
    @Expose
    private Integer Width;

    /**
    * 是否保留视频，0：否，1：是。默认1。
    */
    @SerializedName("NeedVideo")
    @Expose
    private Integer NeedVideo;

    /**
    * 是否保留音频，0：否，1：是。默认1。
    */
    @SerializedName("NeedAudio")
    @Expose
    private Integer NeedAudio;

    /**
    * 高，默认0。
    */
    @SerializedName("Height")
    @Expose
    private Integer Height;

    /**
    * 帧率，默认0。
    */
    @SerializedName("Fps")
    @Expose
    private Integer Fps;

    /**
    * 关键帧间隔，单位：秒。默认原始的间隔
    */
    @SerializedName("Gop")
    @Expose
    private Integer Gop;

    /**
    * 是否旋转，0：否，1：是。默认0。
    */
    @SerializedName("Rotate")
    @Expose
    private Integer Rotate;

    /**
    * 编码质量：
baseline/main/high。默认baseline
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * 是否不超过原始码率，0：否，1：是。默认0。
    */
    @SerializedName("BitrateToOrig")
    @Expose
    private Integer BitrateToOrig;

    /**
    * 是否不超过原始高，0：否，1：是。默认0。
    */
    @SerializedName("HeightToOrig")
    @Expose
    private Integer HeightToOrig;

    /**
    * 是否不超过原始帧率，0：否，1：是。默认0。
    */
    @SerializedName("FpsToOrig")
    @Expose
    private Integer FpsToOrig;

    /**
    * 是否是急速高清模板，0：否，1：是。默认0。
    */
    @SerializedName("AiTransCode")
    @Expose
    private Integer AiTransCode;

    /**
    * 急速高清相比VideoBitrate少多少码率，0.1到0.5
    */
    @SerializedName("AdaptBitratePercent")
    @Expose
    private Float AdaptBitratePercent;

    /**
     * 获取模板名称，例：900 900p 仅支持字母和数字的组合。
     * @return TemplateName 模板名称，例：900 900p 仅支持字母和数字的组合。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * 设置模板名称，例：900 900p 仅支持字母和数字的组合。
     * @param TemplateName 模板名称，例：900 900p 仅支持字母和数字的组合。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * 获取视频码率。范围：100-8000。
     * @return VideoBitrate 视频码率。范围：100-8000。
     */
    public Integer getVideoBitrate() {
        return this.VideoBitrate;
    }

    /**
     * 设置视频码率。范围：100-8000。
     * @param VideoBitrate 视频码率。范围：100-8000。
     */
    public void setVideoBitrate(Integer VideoBitrate) {
        this.VideoBitrate = VideoBitrate;
    }

    /**
     * 获取视频编码：h264/h265，默认h264。
     * @return Vcodec 视频编码：h264/h265，默认h264。
     */
    public String getVcodec() {
        return this.Vcodec;
    }

    /**
     * 设置视频编码：h264/h265，默认h264。
     * @param Vcodec 视频编码：h264/h265，默认h264。
     */
    public void setVcodec(String Vcodec) {
        this.Vcodec = Vcodec;
    }

    /**
     * 获取音频编码：aac，默认原始音频格式。
注意：当前该参数未生效，待后续支持！
     * @return Acodec 音频编码：aac，默认原始音频格式。
注意：当前该参数未生效，待后续支持！
     */
    public String getAcodec() {
        return this.Acodec;
    }

    /**
     * 设置音频编码：aac，默认原始音频格式。
注意：当前该参数未生效，待后续支持！
     * @param Acodec 音频编码：aac，默认原始音频格式。
注意：当前该参数未生效，待后续支持！
     */
    public void setAcodec(String Acodec) {
        this.Acodec = Acodec;
    }

    /**
     * 获取音频码率：默认0。0-500。
     * @return AudioBitrate 音频码率：默认0。0-500。
     */
    public Integer getAudioBitrate() {
        return this.AudioBitrate;
    }

    /**
     * 设置音频码率：默认0。0-500。
     * @param AudioBitrate 音频码率：默认0。0-500。
     */
    public void setAudioBitrate(Integer AudioBitrate) {
        this.AudioBitrate = AudioBitrate;
    }

    /**
     * 获取模板描述。
     * @return Description 模板描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置模板描述。
     * @param Description 模板描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取宽，默认0。
     * @return Width 宽，默认0。
     */
    public Integer getWidth() {
        return this.Width;
    }

    /**
     * 设置宽，默认0。
     * @param Width 宽，默认0。
     */
    public void setWidth(Integer Width) {
        this.Width = Width;
    }

    /**
     * 获取是否保留视频，0：否，1：是。默认1。
     * @return NeedVideo 是否保留视频，0：否，1：是。默认1。
     */
    public Integer getNeedVideo() {
        return this.NeedVideo;
    }

    /**
     * 设置是否保留视频，0：否，1：是。默认1。
     * @param NeedVideo 是否保留视频，0：否，1：是。默认1。
     */
    public void setNeedVideo(Integer NeedVideo) {
        this.NeedVideo = NeedVideo;
    }

    /**
     * 获取是否保留音频，0：否，1：是。默认1。
     * @return NeedAudio 是否保留音频，0：否，1：是。默认1。
     */
    public Integer getNeedAudio() {
        return this.NeedAudio;
    }

    /**
     * 设置是否保留音频，0：否，1：是。默认1。
     * @param NeedAudio 是否保留音频，0：否，1：是。默认1。
     */
    public void setNeedAudio(Integer NeedAudio) {
        this.NeedAudio = NeedAudio;
    }

    /**
     * 获取高，默认0。
     * @return Height 高，默认0。
     */
    public Integer getHeight() {
        return this.Height;
    }

    /**
     * 设置高，默认0。
     * @param Height 高，默认0。
     */
    public void setHeight(Integer Height) {
        this.Height = Height;
    }

    /**
     * 获取帧率，默认0。
     * @return Fps 帧率，默认0。
     */
    public Integer getFps() {
        return this.Fps;
    }

    /**
     * 设置帧率，默认0。
     * @param Fps 帧率，默认0。
     */
    public void setFps(Integer Fps) {
        this.Fps = Fps;
    }

    /**
     * 获取关键帧间隔，单位：秒。默认原始的间隔
     * @return Gop 关键帧间隔，单位：秒。默认原始的间隔
     */
    public Integer getGop() {
        return this.Gop;
    }

    /**
     * 设置关键帧间隔，单位：秒。默认原始的间隔
     * @param Gop 关键帧间隔，单位：秒。默认原始的间隔
     */
    public void setGop(Integer Gop) {
        this.Gop = Gop;
    }

    /**
     * 获取是否旋转，0：否，1：是。默认0。
     * @return Rotate 是否旋转，0：否，1：是。默认0。
     */
    public Integer getRotate() {
        return this.Rotate;
    }

    /**
     * 设置是否旋转，0：否，1：是。默认0。
     * @param Rotate 是否旋转，0：否，1：是。默认0。
     */
    public void setRotate(Integer Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * 获取编码质量：
baseline/main/high。默认baseline
     * @return Profile 编码质量：
baseline/main/high。默认baseline
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * 设置编码质量：
baseline/main/high。默认baseline
     * @param Profile 编码质量：
baseline/main/high。默认baseline
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * 获取是否不超过原始码率，0：否，1：是。默认0。
     * @return BitrateToOrig 是否不超过原始码率，0：否，1：是。默认0。
     */
    public Integer getBitrateToOrig() {
        return this.BitrateToOrig;
    }

    /**
     * 设置是否不超过原始码率，0：否，1：是。默认0。
     * @param BitrateToOrig 是否不超过原始码率，0：否，1：是。默认0。
     */
    public void setBitrateToOrig(Integer BitrateToOrig) {
        this.BitrateToOrig = BitrateToOrig;
    }

    /**
     * 获取是否不超过原始高，0：否，1：是。默认0。
     * @return HeightToOrig 是否不超过原始高，0：否，1：是。默认0。
     */
    public Integer getHeightToOrig() {
        return this.HeightToOrig;
    }

    /**
     * 设置是否不超过原始高，0：否，1：是。默认0。
     * @param HeightToOrig 是否不超过原始高，0：否，1：是。默认0。
     */
    public void setHeightToOrig(Integer HeightToOrig) {
        this.HeightToOrig = HeightToOrig;
    }

    /**
     * 获取是否不超过原始帧率，0：否，1：是。默认0。
     * @return FpsToOrig 是否不超过原始帧率，0：否，1：是。默认0。
     */
    public Integer getFpsToOrig() {
        return this.FpsToOrig;
    }

    /**
     * 设置是否不超过原始帧率，0：否，1：是。默认0。
     * @param FpsToOrig 是否不超过原始帧率，0：否，1：是。默认0。
     */
    public void setFpsToOrig(Integer FpsToOrig) {
        this.FpsToOrig = FpsToOrig;
    }

    /**
     * 获取是否是急速高清模板，0：否，1：是。默认0。
     * @return AiTransCode 是否是急速高清模板，0：否，1：是。默认0。
     */
    public Integer getAiTransCode() {
        return this.AiTransCode;
    }

    /**
     * 设置是否是急速高清模板，0：否，1：是。默认0。
     * @param AiTransCode 是否是急速高清模板，0：否，1：是。默认0。
     */
    public void setAiTransCode(Integer AiTransCode) {
        this.AiTransCode = AiTransCode;
    }

    /**
     * 获取急速高清相比VideoBitrate少多少码率，0.1到0.5
     * @return AdaptBitratePercent 急速高清相比VideoBitrate少多少码率，0.1到0.5
     */
    public Float getAdaptBitratePercent() {
        return this.AdaptBitratePercent;
    }

    /**
     * 设置急速高清相比VideoBitrate少多少码率，0.1到0.5
     * @param AdaptBitratePercent 急速高清相比VideoBitrate少多少码率，0.1到0.5
     */
    public void setAdaptBitratePercent(Float AdaptBitratePercent) {
        this.AdaptBitratePercent = AdaptBitratePercent;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "VideoBitrate", this.VideoBitrate);
        this.setParamSimple(map, prefix + "Vcodec", this.Vcodec);
        this.setParamSimple(map, prefix + "Acodec", this.Acodec);
        this.setParamSimple(map, prefix + "AudioBitrate", this.AudioBitrate);
        this.setParamSimple(map, prefix + "Description", this.Description);
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
        this.setParamSimple(map, prefix + "AiTransCode", this.AiTransCode);
        this.setParamSimple(map, prefix + "AdaptBitratePercent", this.AdaptBitratePercent);

    }
}

