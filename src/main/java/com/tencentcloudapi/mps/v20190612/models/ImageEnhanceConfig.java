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
    private SuperResolutionConfig SuperResolution;

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

    public ImageEnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageEnhanceConfig(ImageEnhanceConfig source) {
        if (source.SuperResolution != null) {
            this.SuperResolution = new SuperResolutionConfig(source.SuperResolution);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SuperResolution.", this.SuperResolution);
        this.setParamObj(map, prefix + "ImageQualityEnhance.", this.ImageQualityEnhance);
        this.setParamObj(map, prefix + "ColorEnhance.", this.ColorEnhance);
        this.setParamObj(map, prefix + "SharpEnhance.", this.SharpEnhance);
        this.setParamObj(map, prefix + "FaceEnhance.", this.FaceEnhance);

    }
}

