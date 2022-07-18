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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEnhanceConfig extends AbstractModel{

    /**
    * 插帧帧率配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameRate")
    @Expose
    private FrameRateConfig FrameRate;

    /**
    * 超分配置。
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
    * 视频降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Denoise")
    @Expose
    private VideoDenoiseConfig Denoise;

    /**
    * 综合增强配置。
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
    * 细节增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SharpEnhance")
    @Expose
    private SharpEnhanceConfig SharpEnhance;

    /**
    * 人脸增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceEnhance")
    @Expose
    private FaceEnhanceConfig FaceEnhance;

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
    * 去伪影（毛刺）配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArtifactRepair")
    @Expose
    private ArtifactRepairConfig ArtifactRepair;

    /**
     * Get 插帧帧率配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameRate 插帧帧率配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FrameRateConfig getFrameRate() {
        return this.FrameRate;
    }

    /**
     * Set 插帧帧率配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameRate 插帧帧率配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameRate(FrameRateConfig FrameRate) {
        this.FrameRate = FrameRate;
    }

    /**
     * Get 超分配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuperResolution 超分配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SuperResolutionConfig getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set 超分配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuperResolution 超分配置。
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
     * Get 视频降噪配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Denoise 视频降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set 视频降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Denoise 视频降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDenoise(VideoDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get 综合增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageQualityEnhance 综合增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageQualityEnhanceConfig getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set 综合增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageQualityEnhance 综合增强配置。
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
     * Get 细节增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SharpEnhance 细节增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SharpEnhanceConfig getSharpEnhance() {
        return this.SharpEnhance;
    }

    /**
     * Set 细节增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SharpEnhance 细节增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSharpEnhance(SharpEnhanceConfig SharpEnhance) {
        this.SharpEnhance = SharpEnhance;
    }

    /**
     * Get 人脸增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceEnhance 人脸增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaceEnhanceConfig getFaceEnhance() {
        return this.FaceEnhance;
    }

    /**
     * Set 人脸增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceEnhance 人脸增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceEnhance(FaceEnhanceConfig FaceEnhance) {
        this.FaceEnhance = FaceEnhance;
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
     * Get 去伪影（毛刺）配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArtifactRepair 去伪影（毛刺）配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ArtifactRepairConfig getArtifactRepair() {
        return this.ArtifactRepair;
    }

    /**
     * Set 去伪影（毛刺）配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArtifactRepair 去伪影（毛刺）配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArtifactRepair(ArtifactRepairConfig ArtifactRepair) {
        this.ArtifactRepair = ArtifactRepair;
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
        if (source.SharpEnhance != null) {
            this.SharpEnhance = new SharpEnhanceConfig(source.SharpEnhance);
        }
        if (source.FaceEnhance != null) {
            this.FaceEnhance = new FaceEnhanceConfig(source.FaceEnhance);
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
        this.setParamObj(map, prefix + "SharpEnhance.", this.SharpEnhance);
        this.setParamObj(map, prefix + "FaceEnhance.", this.FaceEnhance);
        this.setParamObj(map, prefix + "LowLightEnhance.", this.LowLightEnhance);
        this.setParamObj(map, prefix + "ScratchRepair.", this.ScratchRepair);
        this.setParamObj(map, prefix + "ArtifactRepair.", this.ArtifactRepair);

    }
}

