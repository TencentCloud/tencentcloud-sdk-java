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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttributesForBody extends AbstractModel{

    /**
    * 人体框。当不开启人体检测时，内部参数默认为0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rect")
    @Expose
    private ImageRect Rect;

    /**
    * 人体检测置信度。取值0-1之间，当不开启人体检测开关时默认为0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectConfidence")
    @Expose
    private Float DetectConfidence;

    /**
    * 属性信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attributes")
    @Expose
    private BodyAttributes [] Attributes;

    /**
     * Get 人体框。当不开启人体检测时，内部参数默认为0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rect 人体框。当不开启人体检测时，内部参数默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageRect getRect() {
        return this.Rect;
    }

    /**
     * Set 人体框。当不开启人体检测时，内部参数默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rect 人体框。当不开启人体检测时，内部参数默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRect(ImageRect Rect) {
        this.Rect = Rect;
    }

    /**
     * Get 人体检测置信度。取值0-1之间，当不开启人体检测开关时默认为0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectConfidence 人体检测置信度。取值0-1之间，当不开启人体检测开关时默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDetectConfidence() {
        return this.DetectConfidence;
    }

    /**
     * Set 人体检测置信度。取值0-1之间，当不开启人体检测开关时默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectConfidence 人体检测置信度。取值0-1之间，当不开启人体检测开关时默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectConfidence(Float DetectConfidence) {
        this.DetectConfidence = DetectConfidence;
    }

    /**
     * Get 属性信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Attributes 属性信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BodyAttributes [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set 属性信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attributes 属性信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttributes(BodyAttributes [] Attributes) {
        this.Attributes = Attributes;
    }

    public AttributesForBody() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttributesForBody(AttributesForBody source) {
        if (source.Rect != null) {
            this.Rect = new ImageRect(source.Rect);
        }
        if (source.DetectConfidence != null) {
            this.DetectConfidence = new Float(source.DetectConfidence);
        }
        if (source.Attributes != null) {
            this.Attributes = new BodyAttributes[source.Attributes.length];
            for (int i = 0; i < source.Attributes.length; i++) {
                this.Attributes[i] = new BodyAttributes(source.Attributes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Rect.", this.Rect);
        this.setParamSimple(map, prefix + "DetectConfidence", this.DetectConfidence);
        this.setParamArrayObj(map, prefix + "Attributes.", this.Attributes);

    }
}

