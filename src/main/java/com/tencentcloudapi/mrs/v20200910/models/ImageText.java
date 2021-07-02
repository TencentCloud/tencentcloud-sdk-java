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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageText extends AbstractModel{

    /**
    * 文字内容可信度，0-100评分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 图片文本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 文本旋转角度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RotateAngle")
    @Expose
    private Float RotateAngle;

    /**
     * Get 文字内容可信度，0-100评分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Confidence 文字内容可信度，0-100评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 文字内容可信度，0-100评分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Confidence 文字内容可信度，0-100评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 图片文本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 图片文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 图片文本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 图片文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 文本旋转角度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RotateAngle 文本旋转角度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRotateAngle() {
        return this.RotateAngle;
    }

    /**
     * Set 文本旋转角度
注意：此字段可能返回 null，表示取不到有效值。
     * @param RotateAngle 文本旋转角度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotateAngle(Float RotateAngle) {
        this.RotateAngle = RotateAngle;
    }

    public ImageText() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageText(ImageText source) {
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.RotateAngle != null) {
            this.RotateAngle = new Float(source.RotateAngle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "RotateAngle", this.RotateAngle);

    }
}

