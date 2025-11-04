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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEnhanceConfig extends AbstractModel {

    /**
    * 插帧帧率配置（旧）。新用户建议使用FrameRateWithDen配置插帧帧率，支持分数，且效果更好。注意，FrameRate 与FrameRateWithDen 只能二选一，同时配置可能导致任务失败。源帧率大于等于目标帧率时能力不会生效。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameRate")
    @Expose
    private FrameRateConfig FrameRate;

    /**
    * 超分配置。源分辨率高于目标分辨率时不对视频做处理。注意与大模型增强不可同时开启。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionConfig SuperResolution;

    /**
    * HDR配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hdr")
    @Expose
    private HdrConfig Hdr;

    /**
    * 视频降噪配置。注意与大模型增强不可同时开启。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Denoise")
    @Expose
    private VideoDenoiseConfig Denoise;

    /**
    * 综合增强配置。注意大模型、综合增强、去毛刺三项里最多配置一项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageQualityEnhance")
    @Expose
    private ImageQualityEnhanceConfig ImageQualityEnhance;

    /**
    * 色彩增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhanceConfig ColorEnhance;

    /**
    * 低光照增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LowLightEnhance")
    @Expose
    private LowLightEnhanceConfig LowLightEnhance;

    /**
    * 去划痕配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScratchRepair")
    @Expose
    private ScratchRepairConfig ScratchRepair;

    /**
    * 去伪影（毛刺）配置。注意大模型、综合增强、去毛刺三项里最多配置一项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArtifactRepair")
    @Expose
    private ArtifactRepairConfig ArtifactRepair;

    /**
    * 增强场景配置，可选值：
<li>common（通用），通用增强参数，适用于各种视频类型的基础优化参数，提升整体画质。</li>
<li>AIGC，整体分辨率提升，利用AI技术提升视频整体分辨率，增强画面清晰度。</li>
<li>short_play（短剧），增强面部与字幕细节，突出人物面部表情细节和字幕清晰度，提升观剧体验。</li>
<li>short_video（短视频），优化复杂多样的画质问题，针对短视频的复杂场景，优化画质，解决多种视觉问题。</li>
<li>game（游戏视频），修复运动模糊，提升细节，重点提升游戏细节清晰度，恢复运动模糊区域，使游戏画面内容更清晰，更丰富。</li>
<li>HD_movie_series（超高清影视剧），获得超高清流畅效果，针对广电/OTT超高清视频的诉求，生成4K 60fps HDR的超高清标准视频。支持广电场景格式标准要求。</li>
<li>LQ_material（低清素材/老片修复），整体分辨率提升，针对老旧视频由于拍摄年代较久存在的分辨率不足、模糊失真、划痕损伤和色温等问题进行专门优化。</li>
<li>lecture（秀场/电商/大会/讲座），美化提升面部效果，针对秀场/电商/大会/讲座等存在人物进行讲解的场景，进行人脸区域、噪声消除、毛刺处理的专门优化。</li>
<li>填空字符串代表不使用增强场景</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnhanceSceneType")
    @Expose
    private String EnhanceSceneType;

    /**
    * 大模型增强配置。注意大模型、综合增强、去毛刺三项里最多配置一项。且不可与超分、降噪同时开启。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiffusionEnhance")
    @Expose
    private DiffusionEnhanceConfig DiffusionEnhance;

    /**
    * 新插帧帧率配置，支持分数。注意与FrameRate二选一。源帧率大于等于目标帧率时能力不会生效。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameRateWithDen")
    @Expose
    private FrameRateWithDenConfig FrameRateWithDen;

    /**
     * Get 插帧帧率配置（旧）。新用户建议使用FrameRateWithDen配置插帧帧率，支持分数，且效果更好。注意，FrameRate 与FrameRateWithDen 只能二选一，同时配置可能导致任务失败。源帧率大于等于目标帧率时能力不会生效。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameRate 插帧帧率配置（旧）。新用户建议使用FrameRateWithDen配置插帧帧率，支持分数，且效果更好。注意，FrameRate 与FrameRateWithDen 只能二选一，同时配置可能导致任务失败。源帧率大于等于目标帧率时能力不会生效。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public FrameRateConfig getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set 插帧帧率配置（旧）。新用户建议使用FrameRateWithDen配置插帧帧率，支持分数，且效果更好。注意，FrameRate 与FrameRateWithDen 只能二选一，同时配置可能导致任务失败。源帧率大于等于目标帧率时能力不会生效。

注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameRate 插帧帧率配置（旧）。新用户建议使用FrameRateWithDen配置插帧帧率，支持分数，且效果更好。注意，FrameRate 与FrameRateWithDen 只能二选一，同时配置可能导致任务失败。源帧率大于等于目标帧率时能力不会生效。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameRate(FrameRateConfig FrameRate) {
        this.FrameRate = FrameRate;
    }

    /**
     * Get 超分配置。源分辨率高于目标分辨率时不对视频做处理。注意与大模型增强不可同时开启。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuperResolution 超分配置。源分辨率高于目标分辨率时不对视频做处理。注意与大模型增强不可同时开启。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public SuperResolutionConfig getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set 超分配置。源分辨率高于目标分辨率时不对视频做处理。注意与大模型增强不可同时开启。

注意：此字段可能返回 null，表示取不到有效值。
     * @param SuperResolution 超分配置。源分辨率高于目标分辨率时不对视频做处理。注意与大模型增强不可同时开启。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuperResolution(SuperResolutionConfig SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get HDR配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hdr HDR配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HdrConfig getHdr() {
        return this.Hdr;
    }

    /**
     * Set HDR配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hdr HDR配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHdr(HdrConfig Hdr) {
        this.Hdr = Hdr;
    }

    /**
     * Get 视频降噪配置。注意与大模型增强不可同时开启。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Denoise 视频降噪配置。注意与大模型增强不可同时开启。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set 视频降噪配置。注意与大模型增强不可同时开启。

注意：此字段可能返回 null，表示取不到有效值。
     * @param Denoise 视频降噪配置。注意与大模型增强不可同时开启。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDenoise(VideoDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get 综合增强配置。注意大模型、综合增强、去毛刺三项里最多配置一项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageQualityEnhance 综合增强配置。注意大模型、综合增强、去毛刺三项里最多配置一项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageQualityEnhanceConfig getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set 综合增强配置。注意大模型、综合增强、去毛刺三项里最多配置一项
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageQualityEnhance 综合增强配置。注意大模型、综合增强、去毛刺三项里最多配置一项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageQualityEnhance(ImageQualityEnhanceConfig ImageQualityEnhance) {
        this.ImageQualityEnhance = ImageQualityEnhance;
    }

    /**
     * Get 色彩增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColorEnhance 色彩增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ColorEnhanceConfig getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set 色彩增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColorEnhance 色彩增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColorEnhance(ColorEnhanceConfig ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get 低光照增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LowLightEnhance 低光照增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LowLightEnhanceConfig getLowLightEnhance() {
        return this.LowLightEnhance;
    }

    /**
     * Set 低光照增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LowLightEnhance 低光照增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLowLightEnhance(LowLightEnhanceConfig LowLightEnhance) {
        this.LowLightEnhance = LowLightEnhance;
    }

    /**
     * Get 去划痕配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScratchRepair 去划痕配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScratchRepairConfig getScratchRepair() {
        return this.ScratchRepair;
    }

    /**
     * Set 去划痕配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScratchRepair 去划痕配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScratchRepair(ScratchRepairConfig ScratchRepair) {
        this.ScratchRepair = ScratchRepair;
    }

    /**
     * Get 去伪影（毛刺）配置。注意大模型、综合增强、去毛刺三项里最多配置一项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArtifactRepair 去伪影（毛刺）配置。注意大模型、综合增强、去毛刺三项里最多配置一项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ArtifactRepairConfig getArtifactRepair() {
        return this.ArtifactRepair;
    }

    /**
     * Set 去伪影（毛刺）配置。注意大模型、综合增强、去毛刺三项里最多配置一项
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArtifactRepair 去伪影（毛刺）配置。注意大模型、综合增强、去毛刺三项里最多配置一项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArtifactRepair(ArtifactRepairConfig ArtifactRepair) {
        this.ArtifactRepair = ArtifactRepair;
    }

    /**
     * Get 增强场景配置，可选值：
<li>common（通用），通用增强参数，适用于各种视频类型的基础优化参数，提升整体画质。</li>
<li>AIGC，整体分辨率提升，利用AI技术提升视频整体分辨率，增强画面清晰度。</li>
<li>short_play（短剧），增强面部与字幕细节，突出人物面部表情细节和字幕清晰度，提升观剧体验。</li>
<li>short_video（短视频），优化复杂多样的画质问题，针对短视频的复杂场景，优化画质，解决多种视觉问题。</li>
<li>game（游戏视频），修复运动模糊，提升细节，重点提升游戏细节清晰度，恢复运动模糊区域，使游戏画面内容更清晰，更丰富。</li>
<li>HD_movie_series（超高清影视剧），获得超高清流畅效果，针对广电/OTT超高清视频的诉求，生成4K 60fps HDR的超高清标准视频。支持广电场景格式标准要求。</li>
<li>LQ_material（低清素材/老片修复），整体分辨率提升，针对老旧视频由于拍摄年代较久存在的分辨率不足、模糊失真、划痕损伤和色温等问题进行专门优化。</li>
<li>lecture（秀场/电商/大会/讲座），美化提升面部效果，针对秀场/电商/大会/讲座等存在人物进行讲解的场景，进行人脸区域、噪声消除、毛刺处理的专门优化。</li>
<li>填空字符串代表不使用增强场景</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnhanceSceneType 增强场景配置，可选值：
<li>common（通用），通用增强参数，适用于各种视频类型的基础优化参数，提升整体画质。</li>
<li>AIGC，整体分辨率提升，利用AI技术提升视频整体分辨率，增强画面清晰度。</li>
<li>short_play（短剧），增强面部与字幕细节，突出人物面部表情细节和字幕清晰度，提升观剧体验。</li>
<li>short_video（短视频），优化复杂多样的画质问题，针对短视频的复杂场景，优化画质，解决多种视觉问题。</li>
<li>game（游戏视频），修复运动模糊，提升细节，重点提升游戏细节清晰度，恢复运动模糊区域，使游戏画面内容更清晰，更丰富。</li>
<li>HD_movie_series（超高清影视剧），获得超高清流畅效果，针对广电/OTT超高清视频的诉求，生成4K 60fps HDR的超高清标准视频。支持广电场景格式标准要求。</li>
<li>LQ_material（低清素材/老片修复），整体分辨率提升，针对老旧视频由于拍摄年代较久存在的分辨率不足、模糊失真、划痕损伤和色温等问题进行专门优化。</li>
<li>lecture（秀场/电商/大会/讲座），美化提升面部效果，针对秀场/电商/大会/讲座等存在人物进行讲解的场景，进行人脸区域、噪声消除、毛刺处理的专门优化。</li>
<li>填空字符串代表不使用增强场景</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnhanceSceneType() {
        return this.EnhanceSceneType;
    }

    /**
     * Set 增强场景配置，可选值：
<li>common（通用），通用增强参数，适用于各种视频类型的基础优化参数，提升整体画质。</li>
<li>AIGC，整体分辨率提升，利用AI技术提升视频整体分辨率，增强画面清晰度。</li>
<li>short_play（短剧），增强面部与字幕细节，突出人物面部表情细节和字幕清晰度，提升观剧体验。</li>
<li>short_video（短视频），优化复杂多样的画质问题，针对短视频的复杂场景，优化画质，解决多种视觉问题。</li>
<li>game（游戏视频），修复运动模糊，提升细节，重点提升游戏细节清晰度，恢复运动模糊区域，使游戏画面内容更清晰，更丰富。</li>
<li>HD_movie_series（超高清影视剧），获得超高清流畅效果，针对广电/OTT超高清视频的诉求，生成4K 60fps HDR的超高清标准视频。支持广电场景格式标准要求。</li>
<li>LQ_material（低清素材/老片修复），整体分辨率提升，针对老旧视频由于拍摄年代较久存在的分辨率不足、模糊失真、划痕损伤和色温等问题进行专门优化。</li>
<li>lecture（秀场/电商/大会/讲座），美化提升面部效果，针对秀场/电商/大会/讲座等存在人物进行讲解的场景，进行人脸区域、噪声消除、毛刺处理的专门优化。</li>
<li>填空字符串代表不使用增强场景</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnhanceSceneType 增强场景配置，可选值：
<li>common（通用），通用增强参数，适用于各种视频类型的基础优化参数，提升整体画质。</li>
<li>AIGC，整体分辨率提升，利用AI技术提升视频整体分辨率，增强画面清晰度。</li>
<li>short_play（短剧），增强面部与字幕细节，突出人物面部表情细节和字幕清晰度，提升观剧体验。</li>
<li>short_video（短视频），优化复杂多样的画质问题，针对短视频的复杂场景，优化画质，解决多种视觉问题。</li>
<li>game（游戏视频），修复运动模糊，提升细节，重点提升游戏细节清晰度，恢复运动模糊区域，使游戏画面内容更清晰，更丰富。</li>
<li>HD_movie_series（超高清影视剧），获得超高清流畅效果，针对广电/OTT超高清视频的诉求，生成4K 60fps HDR的超高清标准视频。支持广电场景格式标准要求。</li>
<li>LQ_material（低清素材/老片修复），整体分辨率提升，针对老旧视频由于拍摄年代较久存在的分辨率不足、模糊失真、划痕损伤和色温等问题进行专门优化。</li>
<li>lecture（秀场/电商/大会/讲座），美化提升面部效果，针对秀场/电商/大会/讲座等存在人物进行讲解的场景，进行人脸区域、噪声消除、毛刺处理的专门优化。</li>
<li>填空字符串代表不使用增强场景</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnhanceSceneType(String EnhanceSceneType) {
        this.EnhanceSceneType = EnhanceSceneType;
    }

    /**
     * Get 大模型增强配置。注意大模型、综合增强、去毛刺三项里最多配置一项。且不可与超分、降噪同时开启。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiffusionEnhance 大模型增强配置。注意大模型、综合增强、去毛刺三项里最多配置一项。且不可与超分、降噪同时开启。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiffusionEnhanceConfig getDiffusionEnhance() {
        return this.DiffusionEnhance;
    }

    /**
     * Set 大模型增强配置。注意大模型、综合增强、去毛刺三项里最多配置一项。且不可与超分、降噪同时开启。

注意：此字段可能返回 null，表示取不到有效值。
     * @param DiffusionEnhance 大模型增强配置。注意大模型、综合增强、去毛刺三项里最多配置一项。且不可与超分、降噪同时开启。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiffusionEnhance(DiffusionEnhanceConfig DiffusionEnhance) {
        this.DiffusionEnhance = DiffusionEnhance;
    }

    /**
     * Get 新插帧帧率配置，支持分数。注意与FrameRate二选一。源帧率大于等于目标帧率时能力不会生效。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameRateWithDen 新插帧帧率配置，支持分数。注意与FrameRate二选一。源帧率大于等于目标帧率时能力不会生效。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public FrameRateWithDenConfig getFrameRateWithDen() {
        return this.FrameRateWithDen;
    }

    /**
     * Set 新插帧帧率配置，支持分数。注意与FrameRate二选一。源帧率大于等于目标帧率时能力不会生效。

注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameRateWithDen 新插帧帧率配置，支持分数。注意与FrameRate二选一。源帧率大于等于目标帧率时能力不会生效。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameRateWithDen(FrameRateWithDenConfig FrameRateWithDen) {
        this.FrameRateWithDen = FrameRateWithDen;
    }

    public VideoEnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEnhanceConfig(VideoEnhanceConfig source) {
        if (source.FrameRate != null) {
            this.FrameRate = new FrameRateConfig(source.FrameRate);
        }
        if (source.SuperResolution != null) {
            this.SuperResolution = new SuperResolutionConfig(source.SuperResolution);
        }
        if (source.Hdr != null) {
            this.Hdr = new HdrConfig(source.Hdr);
        }
        if (source.Denoise != null) {
            this.Denoise = new VideoDenoiseConfig(source.Denoise);
        }
        if (source.ImageQualityEnhance != null) {
            this.ImageQualityEnhance = new ImageQualityEnhanceConfig(source.ImageQualityEnhance);
        }
        if (source.ColorEnhance != null) {
            this.ColorEnhance = new ColorEnhanceConfig(source.ColorEnhance);
        }
        if (source.LowLightEnhance != null) {
            this.LowLightEnhance = new LowLightEnhanceConfig(source.LowLightEnhance);
        }
        if (source.ScratchRepair != null) {
            this.ScratchRepair = new ScratchRepairConfig(source.ScratchRepair);
        }
        if (source.ArtifactRepair != null) {
            this.ArtifactRepair = new ArtifactRepairConfig(source.ArtifactRepair);
        }
        if (source.EnhanceSceneType != null) {
            this.EnhanceSceneType = new String(source.EnhanceSceneType);
        }
        if (source.DiffusionEnhance != null) {
            this.DiffusionEnhance = new DiffusionEnhanceConfig(source.DiffusionEnhance);
        }
        if (source.FrameRateWithDen != null) {
            this.FrameRateWithDen = new FrameRateWithDenConfig(source.FrameRateWithDen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FrameRate.", this.FrameRate);
        this.setParamObj(map, prefix + "SuperResolution.", this.SuperResolution);
        this.setParamObj(map, prefix + "Hdr.", this.Hdr);
        this.setParamObj(map, prefix + "Denoise.", this.Denoise);
        this.setParamObj(map, prefix + "ImageQualityEnhance.", this.ImageQualityEnhance);
        this.setParamObj(map, prefix + "ColorEnhance.", this.ColorEnhance);
        this.setParamObj(map, prefix + "LowLightEnhance.", this.LowLightEnhance);
        this.setParamObj(map, prefix + "ScratchRepair.", this.ScratchRepair);
        this.setParamObj(map, prefix + "ArtifactRepair.", this.ArtifactRepair);
        this.setParamSimple(map, prefix + "EnhanceSceneType", this.EnhanceSceneType);
        this.setParamObj(map, prefix + "DiffusionEnhance.", this.DiffusionEnhance);
        this.setParamObj(map, prefix + "FrameRateWithDen.", this.FrameRateWithDen);

    }
}

