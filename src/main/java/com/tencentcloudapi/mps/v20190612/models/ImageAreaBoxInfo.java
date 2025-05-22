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

public class ImageAreaBoxInfo extends AbstractModel {

    /**
    * 图片框选区域类型，可选值：
<li>logo：图标；</li>
<li>text：文字；</li>
默认值：logo。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 图片框选区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
示例值：[101, 85, 111, 95]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * 图片框选区域坐标，[x1, y1, x2, y2]，即左上角坐标、右下角坐标， 当AreaCoordSet未指定时生效。
- [0.1, 0.1, 0.3, 0.3] :  表示比例 （数值小于1）
- [50, 50, 350, 280] : 表示像素 （数值大于等于1）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BoundingBox")
    @Expose
    private Float [] BoundingBox;

    /**
     * Get 图片框选区域类型，可选值：
<li>logo：图标；</li>
<li>text：文字；</li>
默认值：logo。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 图片框选区域类型，可选值：
<li>logo：图标；</li>
<li>text：文字；</li>
默认值：logo。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 图片框选区域类型，可选值：
<li>logo：图标；</li>
<li>text：文字；</li>
默认值：logo。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 图片框选区域类型，可选值：
<li>logo：图标；</li>
<li>text：文字；</li>
默认值：logo。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 图片框选区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
示例值：[101, 85, 111, 95]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaCoordSet 图片框选区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
示例值：[101, 85, 111, 95]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set 图片框选区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
示例值：[101, 85, 111, 95]
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaCoordSet 图片框选区域坐标 (像素级)，[x1, y1, x2, y2]，即左上角坐标、右下角坐标。
示例值：[101, 85, 111, 95]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get 图片框选区域坐标，[x1, y1, x2, y2]，即左上角坐标、右下角坐标， 当AreaCoordSet未指定时生效。
- [0.1, 0.1, 0.3, 0.3] :  表示比例 （数值小于1）
- [50, 50, 350, 280] : 表示像素 （数值大于等于1）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BoundingBox 图片框选区域坐标，[x1, y1, x2, y2]，即左上角坐标、右下角坐标， 当AreaCoordSet未指定时生效。
- [0.1, 0.1, 0.3, 0.3] :  表示比例 （数值小于1）
- [50, 50, 350, 280] : 表示像素 （数值大于等于1）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getBoundingBox() {
        return this.BoundingBox;
    }

    /**
     * Set 图片框选区域坐标，[x1, y1, x2, y2]，即左上角坐标、右下角坐标， 当AreaCoordSet未指定时生效。
- [0.1, 0.1, 0.3, 0.3] :  表示比例 （数值小于1）
- [50, 50, 350, 280] : 表示像素 （数值大于等于1）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BoundingBox 图片框选区域坐标，[x1, y1, x2, y2]，即左上角坐标、右下角坐标， 当AreaCoordSet未指定时生效。
- [0.1, 0.1, 0.3, 0.3] :  表示比例 （数值小于1）
- [50, 50, 350, 280] : 表示像素 （数值大于等于1）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBoundingBox(Float [] BoundingBox) {
        this.BoundingBox = BoundingBox;
    }

    public ImageAreaBoxInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageAreaBoxInfo(ImageAreaBoxInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
        if (source.BoundingBox != null) {
            this.BoundingBox = new Float[source.BoundingBox.length];
            for (int i = 0; i < source.BoundingBox.length; i++) {
                this.BoundingBox[i] = new Float(source.BoundingBox[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamArraySimple(map, prefix + "BoundingBox.", this.BoundingBox);

    }
}

