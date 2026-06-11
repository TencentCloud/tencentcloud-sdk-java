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

public class ImageTaskInput extends AbstractModel {

    /**
    * <p>图片编码配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EncodeConfig")
    @Expose
    private ImageEncodeConfig EncodeConfig;

    /**
    * <p>图片增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private ImageEnhanceConfig EnhanceConfig;

    /**
    * <p>图片擦除配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EraseConfig")
    @Expose
    private ImageEraseConfig EraseConfig;

    /**
    * <p>盲水印配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlindWatermarkConfig")
    @Expose
    private BlindWatermarkConfig BlindWatermarkConfig;

    /**
    * <p>美颜配置。</p>
    */
    @SerializedName("BeautyConfig")
    @Expose
    private BeautyConfig BeautyConfig;

    /**
    * <p>图片基础转换能力。</p>
    */
    @SerializedName("TransformConfig")
    @Expose
    private ImageTransformConfig TransformConfig;

    /**
    * <p>Ai 换装配置。</p>
    */
    @SerializedName("AiTryOnConfig")
    @Expose
    private AiTryOnConfig AiTryOnConfig;

    /**
     * Get <p>图片编码配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EncodeConfig <p>图片编码配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageEncodeConfig getEncodeConfig() {
        return this.EncodeConfig;
    }

    /**
     * Set <p>图片编码配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EncodeConfig <p>图片编码配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncodeConfig(ImageEncodeConfig EncodeConfig) {
        this.EncodeConfig = EncodeConfig;
    }

    /**
     * Get <p>图片增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnhanceConfig <p>图片增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageEnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set <p>图片增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnhanceConfig <p>图片增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnhanceConfig(ImageEnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    /**
     * Get <p>图片擦除配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EraseConfig <p>图片擦除配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageEraseConfig getEraseConfig() {
        return this.EraseConfig;
    }

    /**
     * Set <p>图片擦除配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EraseConfig <p>图片擦除配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEraseConfig(ImageEraseConfig EraseConfig) {
        this.EraseConfig = EraseConfig;
    }

    /**
     * Get <p>盲水印配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlindWatermarkConfig <p>盲水印配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlindWatermarkConfig getBlindWatermarkConfig() {
        return this.BlindWatermarkConfig;
    }

    /**
     * Set <p>盲水印配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlindWatermarkConfig <p>盲水印配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlindWatermarkConfig(BlindWatermarkConfig BlindWatermarkConfig) {
        this.BlindWatermarkConfig = BlindWatermarkConfig;
    }

    /**
     * Get <p>美颜配置。</p> 
     * @return BeautyConfig <p>美颜配置。</p>
     */
    public BeautyConfig getBeautyConfig() {
        return this.BeautyConfig;
    }

    /**
     * Set <p>美颜配置。</p>
     * @param BeautyConfig <p>美颜配置。</p>
     */
    public void setBeautyConfig(BeautyConfig BeautyConfig) {
        this.BeautyConfig = BeautyConfig;
    }

    /**
     * Get <p>图片基础转换能力。</p> 
     * @return TransformConfig <p>图片基础转换能力。</p>
     */
    public ImageTransformConfig getTransformConfig() {
        return this.TransformConfig;
    }

    /**
     * Set <p>图片基础转换能力。</p>
     * @param TransformConfig <p>图片基础转换能力。</p>
     */
    public void setTransformConfig(ImageTransformConfig TransformConfig) {
        this.TransformConfig = TransformConfig;
    }

    /**
     * Get <p>Ai 换装配置。</p> 
     * @return AiTryOnConfig <p>Ai 换装配置。</p>
     */
    public AiTryOnConfig getAiTryOnConfig() {
        return this.AiTryOnConfig;
    }

    /**
     * Set <p>Ai 换装配置。</p>
     * @param AiTryOnConfig <p>Ai 换装配置。</p>
     */
    public void setAiTryOnConfig(AiTryOnConfig AiTryOnConfig) {
        this.AiTryOnConfig = AiTryOnConfig;
    }

    public ImageTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageTaskInput(ImageTaskInput source) {
        if (source.EncodeConfig != null) {
            this.EncodeConfig = new ImageEncodeConfig(source.EncodeConfig);
        }
        if (source.EnhanceConfig != null) {
            this.EnhanceConfig = new ImageEnhanceConfig(source.EnhanceConfig);
        }
        if (source.EraseConfig != null) {
            this.EraseConfig = new ImageEraseConfig(source.EraseConfig);
        }
        if (source.BlindWatermarkConfig != null) {
            this.BlindWatermarkConfig = new BlindWatermarkConfig(source.BlindWatermarkConfig);
        }
        if (source.BeautyConfig != null) {
            this.BeautyConfig = new BeautyConfig(source.BeautyConfig);
        }
        if (source.TransformConfig != null) {
            this.TransformConfig = new ImageTransformConfig(source.TransformConfig);
        }
        if (source.AiTryOnConfig != null) {
            this.AiTryOnConfig = new AiTryOnConfig(source.AiTryOnConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "EncodeConfig.", this.EncodeConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);
        this.setParamObj(map, prefix + "EraseConfig.", this.EraseConfig);
        this.setParamObj(map, prefix + "BlindWatermarkConfig.", this.BlindWatermarkConfig);
        this.setParamObj(map, prefix + "BeautyConfig.", this.BeautyConfig);
        this.setParamObj(map, prefix + "TransformConfig.", this.TransformConfig);
        this.setParamObj(map, prefix + "AiTryOnConfig.", this.AiTryOnConfig);

    }
}

