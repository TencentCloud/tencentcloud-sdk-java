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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageEnhanceConfig extends AbstractModel {

    /**
    * 超分配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuperResolution")
    @Expose
    private SuperResolutionInfo SuperResolution;

    /**
    * 高级超分配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedSuperResolution")
    @Expose
    private AdvancedSuperResolutionConfig AdvancedSuperResolution;

    /**
    * 降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Denoise")
    @Expose
    private ImageDenoiseConfig Denoise;

    /**
    * 综合增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageQualityEnhance")
    @Expose
    private ImageQualityEnhanceInfo ImageQualityEnhance;

    /**
    * 色彩增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColorEnhance")
    @Expose
    private ColorEnhanceInfo ColorEnhance;

    /**
    * 细节增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SharpEnhance")
    @Expose
    private SharpEnhanceInfo SharpEnhance;

    /**
    * 人脸增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceEnhance")
    @Expose
    private FaceEnhanceInfo FaceEnhance;

    /**
    * 低光照增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LowLightEnhance")
    @Expose
    private LowLightEnhanceInfo LowLightEnhance;

    /**
     * Get 超分配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuperResolution 超分配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SuperResolutionInfo getSuperResolution() {
        return this.SuperResolution;
    }

    /**
     * Set 超分配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuperResolution 超分配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuperResolution(SuperResolutionInfo SuperResolution) {
        this.SuperResolution = SuperResolution;
    }

    /**
     * Get 高级超分配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedSuperResolution 高级超分配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedSuperResolutionConfig getAdvancedSuperResolution() {
        return this.AdvancedSuperResolution;
    }

    /**
     * Set 高级超分配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedSuperResolution 高级超分配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedSuperResolution(AdvancedSuperResolutionConfig AdvancedSuperResolution) {
        this.AdvancedSuperResolution = AdvancedSuperResolution;
    }

    /**
     * Get 降噪配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Denoise 降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageDenoiseConfig getDenoise() {
        return this.Denoise;
    }

    /**
     * Set 降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Denoise 降噪配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDenoise(ImageDenoiseConfig Denoise) {
        this.Denoise = Denoise;
    }

    /**
     * Get 综合增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageQualityEnhance 综合增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageQualityEnhanceInfo getImageQualityEnhance() {
        return this.ImageQualityEnhance;
    }

    /**
     * Set 综合增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageQualityEnhance 综合增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageQualityEnhance(ImageQualityEnhanceInfo ImageQualityEnhance) {
        this.ImageQualityEnhance = ImageQualityEnhance;
    }

    /**
     * Get 色彩增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColorEnhance 色彩增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ColorEnhanceInfo getColorEnhance() {
        return this.ColorEnhance;
    }

    /**
     * Set 色彩增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColorEnhance 色彩增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColorEnhance(ColorEnhanceInfo ColorEnhance) {
        this.ColorEnhance = ColorEnhance;
    }

    /**
     * Get 细节增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SharpEnhance 细节增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SharpEnhanceInfo getSharpEnhance() {
        return this.SharpEnhance;
    }

    /**
     * Set 细节增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SharpEnhance 细节增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSharpEnhance(SharpEnhanceInfo SharpEnhance) {
        this.SharpEnhance = SharpEnhance;
    }

    /**
     * Get 人脸增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaceEnhance 人脸增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaceEnhanceInfo getFaceEnhance() {
        return this.FaceEnhance;
    }

    /**
     * Set 人脸增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceEnhance 人脸增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceEnhance(FaceEnhanceInfo FaceEnhance) {
        this.FaceEnhance = FaceEnhance;
    }

    /**
     * Get 低光照增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LowLightEnhance 低光照增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LowLightEnhanceInfo getLowLightEnhance() {
        return this.LowLightEnhance;
    }

    /**
     * Set 低光照增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LowLightEnhance 低光照增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLowLightEnhance(LowLightEnhanceInfo LowLightEnhance) {
        this.LowLightEnhance = LowLightEnhance;
    }

    public ImageEnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageEnhanceConfig(ImageEnhanceConfig source) {
        if (source.SuperResolution != null) {
            this.SuperResolution = new SuperResolutionInfo(source.SuperResolution);
        }
        if (source.AdvancedSuperResolution != null) {
            this.AdvancedSuperResolution = new AdvancedSuperResolutionConfig(source.AdvancedSuperResolution);
        }
        if (source.Denoise != null) {
            this.Denoise = new ImageDenoiseConfig(source.Denoise);
        }
        if (source.ImageQualityEnhance != null) {
            this.ImageQualityEnhance = new ImageQualityEnhanceInfo(source.ImageQualityEnhance);
        }
        if (source.ColorEnhance != null) {
            this.ColorEnhance = new ColorEnhanceInfo(source.ColorEnhance);
        }
        if (source.SharpEnhance != null) {
            this.SharpEnhance = new SharpEnhanceInfo(source.SharpEnhance);
        }
        if (source.FaceEnhance != null) {
            this.FaceEnhance = new FaceEnhanceInfo(source.FaceEnhance);
        }
        if (source.LowLightEnhance != null) {
            this.LowLightEnhance = new LowLightEnhanceInfo(source.LowLightEnhance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SuperResolution.", this.SuperResolution);
        this.setParamObj(map, prefix + "AdvancedSuperResolution.", this.AdvancedSuperResolution);
        this.setParamObj(map, prefix + "Denoise.", this.Denoise);
        this.setParamObj(map, prefix + "ImageQualityEnhance.", this.ImageQualityEnhance);
        this.setParamObj(map, prefix + "ColorEnhance.", this.ColorEnhance);
        this.setParamObj(map, prefix + "SharpEnhance.", this.SharpEnhance);
        this.setParamObj(map, prefix + "FaceEnhance.", this.FaceEnhance);
        this.setParamObj(map, prefix + "LowLightEnhance.", this.LowLightEnhance);

    }
}

