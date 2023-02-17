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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebuildMediaRequest extends AbstractModel{

    /**
    * 媒体文件 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 起始偏移时间，单位：秒，不填表示从视频开始截取。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 结束偏移时间，单位：秒，不填表示截取到视频末尾。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 画质修复控制参数。
    */
    @SerializedName("RepairInfo")
    @Expose
    private RepairInfo RepairInfo;

    /**
    * 智能插帧控制参数。
    */
    @SerializedName("VideoFrameInterpolationInfo")
    @Expose
    private VideoFrameInterpolationInfo VideoFrameInterpolationInfo;

    /**
    * 画面超分控制参数。
    */
    @SerializedName("SuperResolutionInfo")
    @Expose
    private SuperResolutionInfo SuperResolutionInfo;

    /**
    * 高动态范围类型控制参数。
    */
    @SerializedName("HDRInfo")
    @Expose
    private HDRInfo HDRInfo;

    /**
    * 视频降噪控制参数。
    */
    @SerializedName("VideoDenoiseInfo")
    @Expose
    private VideoDenoiseInfo VideoDenoiseInfo;

    /**
    * 音频降噪控制参数。
    */
    @SerializedName("AudioDenoiseInfo")
    @Expose
    private AudioDenoiseInfo AudioDenoiseInfo;

    /**
    * 色彩增强控制参数。
    */
    @SerializedName("ColorInfo")
    @Expose
    private ColorEnhanceInfo ColorInfo;

    /**
    * 细节增强控制参数。
    */
    @SerializedName("SharpInfo")
    @Expose
    private SharpEnhanceInfo SharpInfo;

    /**
    * 人脸增强控制参数。
    */
    @SerializedName("FaceInfo")
    @Expose
    private FaceEnhanceInfo FaceInfo;

    /**
    * 低光照控制参数。
    */
    @SerializedName("LowLightInfo")
    @Expose
    private LowLightEnhanceInfo LowLightInfo;

    /**
    * 去划痕控制参数。
    */
    @SerializedName("ScratchRepairInfo")
    @Expose
    private ScratchRepairInfo ScratchRepairInfo;

    /**
    * 去伪影（毛刺）控制参数。
    */
    @SerializedName("ArtifactRepairInfo")
    @Expose
    private ArtifactRepairInfo ArtifactRepairInfo;

    /**
    * 音画质重生输出目标参数。
    */
    @SerializedName("TargetInfo")
    @Expose
    private RebuildMediaTargetInfo TargetInfo;

    /**
    * 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * 保留字段，特殊用途时使用。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get 媒体文件 ID。 
     * @return FileId 媒体文件 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体文件 ID。
     * @param FileId 媒体文件 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b> 
     * @return SubAppId <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     * @param SubAppId <b>点播 [子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 起始偏移时间，单位：秒，不填表示从视频开始截取。 
     * @return StartTimeOffset 起始偏移时间，单位：秒，不填表示从视频开始截取。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 起始偏移时间，单位：秒，不填表示从视频开始截取。
     * @param StartTimeOffset 起始偏移时间，单位：秒，不填表示从视频开始截取。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 结束偏移时间，单位：秒，不填表示截取到视频末尾。 
     * @return EndTimeOffset 结束偏移时间，单位：秒，不填表示截取到视频末尾。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 结束偏移时间，单位：秒，不填表示截取到视频末尾。
     * @param EndTimeOffset 结束偏移时间，单位：秒，不填表示截取到视频末尾。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 画质修复控制参数。 
     * @return RepairInfo 画质修复控制参数。
     */
    public RepairInfo getRepairInfo() {
        return this.RepairInfo;
    }

    /**
     * Set 画质修复控制参数。
     * @param RepairInfo 画质修复控制参数。
     */
    public void setRepairInfo(RepairInfo RepairInfo) {
        this.RepairInfo = RepairInfo;
    }

    /**
     * Get 智能插帧控制参数。 
     * @return VideoFrameInterpolationInfo 智能插帧控制参数。
     */
    public VideoFrameInterpolationInfo getVideoFrameInterpolationInfo() {
        return this.VideoFrameInterpolationInfo;
    }

    /**
     * Set 智能插帧控制参数。
     * @param VideoFrameInterpolationInfo 智能插帧控制参数。
     */
    public void setVideoFrameInterpolationInfo(VideoFrameInterpolationInfo VideoFrameInterpolationInfo) {
        this.VideoFrameInterpolationInfo = VideoFrameInterpolationInfo;
    }

    /**
     * Get 画面超分控制参数。 
     * @return SuperResolutionInfo 画面超分控制参数。
     */
    public SuperResolutionInfo getSuperResolutionInfo() {
        return this.SuperResolutionInfo;
    }

    /**
     * Set 画面超分控制参数。
     * @param SuperResolutionInfo 画面超分控制参数。
     */
    public void setSuperResolutionInfo(SuperResolutionInfo SuperResolutionInfo) {
        this.SuperResolutionInfo = SuperResolutionInfo;
    }

    /**
     * Get 高动态范围类型控制参数。 
     * @return HDRInfo 高动态范围类型控制参数。
     */
    public HDRInfo getHDRInfo() {
        return this.HDRInfo;
    }

    /**
     * Set 高动态范围类型控制参数。
     * @param HDRInfo 高动态范围类型控制参数。
     */
    public void setHDRInfo(HDRInfo HDRInfo) {
        this.HDRInfo = HDRInfo;
    }

    /**
     * Get 视频降噪控制参数。 
     * @return VideoDenoiseInfo 视频降噪控制参数。
     */
    public VideoDenoiseInfo getVideoDenoiseInfo() {
        return this.VideoDenoiseInfo;
    }

    /**
     * Set 视频降噪控制参数。
     * @param VideoDenoiseInfo 视频降噪控制参数。
     */
    public void setVideoDenoiseInfo(VideoDenoiseInfo VideoDenoiseInfo) {
        this.VideoDenoiseInfo = VideoDenoiseInfo;
    }

    /**
     * Get 音频降噪控制参数。 
     * @return AudioDenoiseInfo 音频降噪控制参数。
     */
    public AudioDenoiseInfo getAudioDenoiseInfo() {
        return this.AudioDenoiseInfo;
    }

    /**
     * Set 音频降噪控制参数。
     * @param AudioDenoiseInfo 音频降噪控制参数。
     */
    public void setAudioDenoiseInfo(AudioDenoiseInfo AudioDenoiseInfo) {
        this.AudioDenoiseInfo = AudioDenoiseInfo;
    }

    /**
     * Get 色彩增强控制参数。 
     * @return ColorInfo 色彩增强控制参数。
     */
    public ColorEnhanceInfo getColorInfo() {
        return this.ColorInfo;
    }

    /**
     * Set 色彩增强控制参数。
     * @param ColorInfo 色彩增强控制参数。
     */
    public void setColorInfo(ColorEnhanceInfo ColorInfo) {
        this.ColorInfo = ColorInfo;
    }

    /**
     * Get 细节增强控制参数。 
     * @return SharpInfo 细节增强控制参数。
     */
    public SharpEnhanceInfo getSharpInfo() {
        return this.SharpInfo;
    }

    /**
     * Set 细节增强控制参数。
     * @param SharpInfo 细节增强控制参数。
     */
    public void setSharpInfo(SharpEnhanceInfo SharpInfo) {
        this.SharpInfo = SharpInfo;
    }

    /**
     * Get 人脸增强控制参数。 
     * @return FaceInfo 人脸增强控制参数。
     */
    public FaceEnhanceInfo getFaceInfo() {
        return this.FaceInfo;
    }

    /**
     * Set 人脸增强控制参数。
     * @param FaceInfo 人脸增强控制参数。
     */
    public void setFaceInfo(FaceEnhanceInfo FaceInfo) {
        this.FaceInfo = FaceInfo;
    }

    /**
     * Get 低光照控制参数。 
     * @return LowLightInfo 低光照控制参数。
     */
    public LowLightEnhanceInfo getLowLightInfo() {
        return this.LowLightInfo;
    }

    /**
     * Set 低光照控制参数。
     * @param LowLightInfo 低光照控制参数。
     */
    public void setLowLightInfo(LowLightEnhanceInfo LowLightInfo) {
        this.LowLightInfo = LowLightInfo;
    }

    /**
     * Get 去划痕控制参数。 
     * @return ScratchRepairInfo 去划痕控制参数。
     */
    public ScratchRepairInfo getScratchRepairInfo() {
        return this.ScratchRepairInfo;
    }

    /**
     * Set 去划痕控制参数。
     * @param ScratchRepairInfo 去划痕控制参数。
     */
    public void setScratchRepairInfo(ScratchRepairInfo ScratchRepairInfo) {
        this.ScratchRepairInfo = ScratchRepairInfo;
    }

    /**
     * Get 去伪影（毛刺）控制参数。 
     * @return ArtifactRepairInfo 去伪影（毛刺）控制参数。
     */
    public ArtifactRepairInfo getArtifactRepairInfo() {
        return this.ArtifactRepairInfo;
    }

    /**
     * Set 去伪影（毛刺）控制参数。
     * @param ArtifactRepairInfo 去伪影（毛刺）控制参数。
     */
    public void setArtifactRepairInfo(ArtifactRepairInfo ArtifactRepairInfo) {
        this.ArtifactRepairInfo = ArtifactRepairInfo;
    }

    /**
     * Get 音画质重生输出目标参数。 
     * @return TargetInfo 音画质重生输出目标参数。
     */
    public RebuildMediaTargetInfo getTargetInfo() {
        return this.TargetInfo;
    }

    /**
     * Set 音画质重生输出目标参数。
     * @param TargetInfo 音画质重生输出目标参数。
     */
    public void setTargetInfo(RebuildMediaTargetInfo TargetInfo) {
        this.TargetInfo = TargetInfo;
    }

    /**
     * Get 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。 
     * @return SessionId 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。 
     * @return SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     * @param SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。 
     * @return TasksPriority 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     * @param TasksPriority 任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get 保留字段，特殊用途时使用。 
     * @return ExtInfo 保留字段，特殊用途时使用。
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 保留字段，特殊用途时使用。
     * @param ExtInfo 保留字段，特殊用途时使用。
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public RebuildMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaRequest(RebuildMediaRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.RepairInfo != null) {
            this.RepairInfo = new RepairInfo(source.RepairInfo);
        }
        if (source.VideoFrameInterpolationInfo != null) {
            this.VideoFrameInterpolationInfo = new VideoFrameInterpolationInfo(source.VideoFrameInterpolationInfo);
        }
        if (source.SuperResolutionInfo != null) {
            this.SuperResolutionInfo = new SuperResolutionInfo(source.SuperResolutionInfo);
        }
        if (source.HDRInfo != null) {
            this.HDRInfo = new HDRInfo(source.HDRInfo);
        }
        if (source.VideoDenoiseInfo != null) {
            this.VideoDenoiseInfo = new VideoDenoiseInfo(source.VideoDenoiseInfo);
        }
        if (source.AudioDenoiseInfo != null) {
            this.AudioDenoiseInfo = new AudioDenoiseInfo(source.AudioDenoiseInfo);
        }
        if (source.ColorInfo != null) {
            this.ColorInfo = new ColorEnhanceInfo(source.ColorInfo);
        }
        if (source.SharpInfo != null) {
            this.SharpInfo = new SharpEnhanceInfo(source.SharpInfo);
        }
        if (source.FaceInfo != null) {
            this.FaceInfo = new FaceEnhanceInfo(source.FaceInfo);
        }
        if (source.LowLightInfo != null) {
            this.LowLightInfo = new LowLightEnhanceInfo(source.LowLightInfo);
        }
        if (source.ScratchRepairInfo != null) {
            this.ScratchRepairInfo = new ScratchRepairInfo(source.ScratchRepairInfo);
        }
        if (source.ArtifactRepairInfo != null) {
            this.ArtifactRepairInfo = new ArtifactRepairInfo(source.ArtifactRepairInfo);
        }
        if (source.TargetInfo != null) {
            this.TargetInfo = new RebuildMediaTargetInfo(source.TargetInfo);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamObj(map, prefix + "RepairInfo.", this.RepairInfo);
        this.setParamObj(map, prefix + "VideoFrameInterpolationInfo.", this.VideoFrameInterpolationInfo);
        this.setParamObj(map, prefix + "SuperResolutionInfo.", this.SuperResolutionInfo);
        this.setParamObj(map, prefix + "HDRInfo.", this.HDRInfo);
        this.setParamObj(map, prefix + "VideoDenoiseInfo.", this.VideoDenoiseInfo);
        this.setParamObj(map, prefix + "AudioDenoiseInfo.", this.AudioDenoiseInfo);
        this.setParamObj(map, prefix + "ColorInfo.", this.ColorInfo);
        this.setParamObj(map, prefix + "SharpInfo.", this.SharpInfo);
        this.setParamObj(map, prefix + "FaceInfo.", this.FaceInfo);
        this.setParamObj(map, prefix + "LowLightInfo.", this.LowLightInfo);
        this.setParamObj(map, prefix + "ScratchRepairInfo.", this.ScratchRepairInfo);
        this.setParamObj(map, prefix + "ArtifactRepairInfo.", this.ArtifactRepairInfo);
        this.setParamObj(map, prefix + "TargetInfo.", this.TargetInfo);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

