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
    * 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 需要擦除的多个框选区域，最多开启16个区域。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageAreaBoxes")
    @Expose
    private ImageAreaBoxInfo [] ImageAreaBoxes;

    /**
    * 图片框选区域类型，可选值：
<li>logo：图标；</li>
<li>text：文字；</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectTypes")
    @Expose
    private String [] DetectTypes;

    /**
     * Get 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 需要擦除的多个框选区域，最多开启16个区域。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageAreaBoxes 需要擦除的多个框选区域，最多开启16个区域。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageAreaBoxInfo [] getImageAreaBoxes() {
        return this.ImageAreaBoxes;
    }

    /**
     * Set 需要擦除的多个框选区域，最多开启16个区域。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageAreaBoxes 需要擦除的多个框选区域，最多开启16个区域。
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageAreaBoxes(ImageAreaBoxInfo [] ImageAreaBoxes) {
        this.ImageAreaBoxes = ImageAreaBoxes;
    }

    /**
     * Get 图片框选区域类型，可选值：
<li>logo：图标；</li>
<li>text：文字；</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectTypes 图片框选区域类型，可选值：
<li>logo：图标；</li>
<li>text：文字；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDetectTypes() {
        return this.DetectTypes;
    }

    /**
     * Set 图片框选区域类型，可选值：
<li>logo：图标；</li>
<li>text：文字；</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectTypes 图片框选区域类型，可选值：
<li>logo：图标；</li>
<li>text：文字；</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectTypes(String [] DetectTypes) {
        this.DetectTypes = DetectTypes;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "ImageAreaBoxes.", this.ImageAreaBoxes);
        this.setParamArraySimple(map, prefix + "DetectTypes.", this.DetectTypes);

    }
}

