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

public class ImageEraseLogoConfig extends AbstractModel {

    /**
    * <p>能力配置开关，可选值：</p><li>ON：开启；</li><li>OFF：关闭。</li>默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>需要擦除的多个框选区域，最多开启16个区域。<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageAreaBoxes")
    @Expose
    private ImageAreaBoxInfo [] ImageAreaBoxes;

    /**
    * <p>图片框选区域类型，可选值：</p><li>logo：图标；</li><li>text：文字；</li><li>watermark：水印；</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectTypes")
    @Expose
    private String [] DetectTypes;

    /**
    * <p>水印擦除能力档位，可选值：</p><p>枚举值：</p><ul><li>low： 快速擦除档位</li><li>mid： 擦除效果和速度均衡档位</li><li>high： 进阶擦除效果档位</li></ul><p>注意：根据擦除场景复杂度选择对应擦除档位。</p>
    */
    @SerializedName("EraseStrength")
    @Expose
    private String EraseStrength;

    /**
    * <p>擦除图像水印时，选择特定水印类型，可选值：</p><p>枚举值：</p><ul><li>corner_watermark： 擦除常规定点水印</li><li>tiled_watermark： 擦除全图平铺水印</li><li>auto_detect_type： 自动识别水印类型擦除</li><li>selected_watermark： 跳过自动擦除，按指定位置进行水印擦除</li></ul>
    */
    @SerializedName("WatermarkType")
    @Expose
    private String WatermarkType;

    /**
     * Get <p>能力配置开关，可选值：</p><li>ON：开启；</li><li>OFF：关闭。</li>默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch <p>能力配置开关，可选值：</p><li>ON：开启；</li><li>OFF：关闭。</li>默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>能力配置开关，可选值：</p><li>ON：开启；</li><li>OFF：关闭。</li>默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch <p>能力配置开关，可选值：</p><li>ON：开启；</li><li>OFF：关闭。</li>默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>需要擦除的多个框选区域，最多开启16个区域。<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageAreaBoxes <p>需要擦除的多个框选区域，最多开启16个区域。<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageAreaBoxInfo [] getImageAreaBoxes() {
        return this.ImageAreaBoxes;
    }

    /**
     * Set <p>需要擦除的多个框选区域，最多开启16个区域。<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageAreaBoxes <p>需要擦除的多个框选区域，最多开启16个区域。<br>注意：此字段可能返回 null，表示取不到有效值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageAreaBoxes(ImageAreaBoxInfo [] ImageAreaBoxes) {
        this.ImageAreaBoxes = ImageAreaBoxes;
    }

    /**
     * Get <p>图片框选区域类型，可选值：</p><li>logo：图标；</li><li>text：文字；</li><li>watermark：水印；</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectTypes <p>图片框选区域类型，可选值：</p><li>logo：图标；</li><li>text：文字；</li><li>watermark：水印；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDetectTypes() {
        return this.DetectTypes;
    }

    /**
     * Set <p>图片框选区域类型，可选值：</p><li>logo：图标；</li><li>text：文字；</li><li>watermark：水印；</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectTypes <p>图片框选区域类型，可选值：</p><li>logo：图标；</li><li>text：文字；</li><li>watermark：水印；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectTypes(String [] DetectTypes) {
        this.DetectTypes = DetectTypes;
    }

    /**
     * Get <p>水印擦除能力档位，可选值：</p><p>枚举值：</p><ul><li>low： 快速擦除档位</li><li>mid： 擦除效果和速度均衡档位</li><li>high： 进阶擦除效果档位</li></ul><p>注意：根据擦除场景复杂度选择对应擦除档位。</p> 
     * @return EraseStrength <p>水印擦除能力档位，可选值：</p><p>枚举值：</p><ul><li>low： 快速擦除档位</li><li>mid： 擦除效果和速度均衡档位</li><li>high： 进阶擦除效果档位</li></ul><p>注意：根据擦除场景复杂度选择对应擦除档位。</p>
     */
    public String getEraseStrength() {
        return this.EraseStrength;
    }

    /**
     * Set <p>水印擦除能力档位，可选值：</p><p>枚举值：</p><ul><li>low： 快速擦除档位</li><li>mid： 擦除效果和速度均衡档位</li><li>high： 进阶擦除效果档位</li></ul><p>注意：根据擦除场景复杂度选择对应擦除档位。</p>
     * @param EraseStrength <p>水印擦除能力档位，可选值：</p><p>枚举值：</p><ul><li>low： 快速擦除档位</li><li>mid： 擦除效果和速度均衡档位</li><li>high： 进阶擦除效果档位</li></ul><p>注意：根据擦除场景复杂度选择对应擦除档位。</p>
     */
    public void setEraseStrength(String EraseStrength) {
        this.EraseStrength = EraseStrength;
    }

    /**
     * Get <p>擦除图像水印时，选择特定水印类型，可选值：</p><p>枚举值：</p><ul><li>corner_watermark： 擦除常规定点水印</li><li>tiled_watermark： 擦除全图平铺水印</li><li>auto_detect_type： 自动识别水印类型擦除</li><li>selected_watermark： 跳过自动擦除，按指定位置进行水印擦除</li></ul> 
     * @return WatermarkType <p>擦除图像水印时，选择特定水印类型，可选值：</p><p>枚举值：</p><ul><li>corner_watermark： 擦除常规定点水印</li><li>tiled_watermark： 擦除全图平铺水印</li><li>auto_detect_type： 自动识别水印类型擦除</li><li>selected_watermark： 跳过自动擦除，按指定位置进行水印擦除</li></ul>
     */
    public String getWatermarkType() {
        return this.WatermarkType;
    }

    /**
     * Set <p>擦除图像水印时，选择特定水印类型，可选值：</p><p>枚举值：</p><ul><li>corner_watermark： 擦除常规定点水印</li><li>tiled_watermark： 擦除全图平铺水印</li><li>auto_detect_type： 自动识别水印类型擦除</li><li>selected_watermark： 跳过自动擦除，按指定位置进行水印擦除</li></ul>
     * @param WatermarkType <p>擦除图像水印时，选择特定水印类型，可选值：</p><p>枚举值：</p><ul><li>corner_watermark： 擦除常规定点水印</li><li>tiled_watermark： 擦除全图平铺水印</li><li>auto_detect_type： 自动识别水印类型擦除</li><li>selected_watermark： 跳过自动擦除，按指定位置进行水印擦除</li></ul>
     */
    public void setWatermarkType(String WatermarkType) {
        this.WatermarkType = WatermarkType;
    }

    public ImageEraseLogoConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageEraseLogoConfig(ImageEraseLogoConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ImageAreaBoxes != null) {
            this.ImageAreaBoxes = new ImageAreaBoxInfo[source.ImageAreaBoxes.length];
            for (int i = 0; i < source.ImageAreaBoxes.length; i++) {
                this.ImageAreaBoxes[i] = new ImageAreaBoxInfo(source.ImageAreaBoxes[i]);
            }
        }
        if (source.DetectTypes != null) {
            this.DetectTypes = new String[source.DetectTypes.length];
            for (int i = 0; i < source.DetectTypes.length; i++) {
                this.DetectTypes[i] = new String(source.DetectTypes[i]);
            }
        }
        if (source.EraseStrength != null) {
            this.EraseStrength = new String(source.EraseStrength);
        }
        if (source.WatermarkType != null) {
            this.WatermarkType = new String(source.WatermarkType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "ImageAreaBoxes.", this.ImageAreaBoxes);
        this.setParamArraySimple(map, prefix + "DetectTypes.", this.DetectTypes);
        this.setParamSimple(map, prefix + "EraseStrength", this.EraseStrength);
        this.setParamSimple(map, prefix + "WatermarkType", this.WatermarkType);

    }
}

