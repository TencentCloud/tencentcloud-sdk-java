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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocumentRecognizeInfo extends AbstractModel {

    /**
    * 输入PDF文件的页码，从1开始。输入图片的话值始终为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 旋转角度

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Angle")
    @Expose
    private Long Angle;

    /**
    * AI算法识别处理后的图片高度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * AI算法识别处理后的图片宽度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 图片的原始高度，输入PDF文件则表示单页PDF转图片之后的图片高度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginHeight")
    @Expose
    private Long OriginHeight;

    /**
    * 图片的原始宽度，输入PDF文件则表示单页PDF转图片之后的图片宽度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginWidth")
    @Expose
    private Long OriginWidth;

    /**
    * 文档元素信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Elements")
    @Expose
    private DocumentElement [] Elements;

    /**
    * 旋转角度

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RotatedAngle")
    @Expose
    private Float RotatedAngle;

    /**
     * Get 输入PDF文件的页码，从1开始。输入图片的话值始终为1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNumber 输入PDF文件的页码，从1开始。输入图片的话值始终为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 输入PDF文件的页码，从1开始。输入图片的话值始终为1
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNumber 输入PDF文件的页码，从1开始。输入图片的话值始终为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 旋转角度

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Angle 旋转角度

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAngle() {
        return this.Angle;
    }

    /**
     * Set 旋转角度

注意：此字段可能返回 null，表示取不到有效值。
     * @param Angle 旋转角度

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAngle(Long Angle) {
        this.Angle = Angle;
    }

    /**
     * Get AI算法识别处理后的图片高度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height AI算法识别处理后的图片高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set AI算法识别处理后的图片高度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height AI算法识别处理后的图片高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get AI算法识别处理后的图片宽度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width AI算法识别处理后的图片宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set AI算法识别处理后的图片宽度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width AI算法识别处理后的图片宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 图片的原始高度，输入PDF文件则表示单页PDF转图片之后的图片高度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginHeight 图片的原始高度，输入PDF文件则表示单页PDF转图片之后的图片高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOriginHeight() {
        return this.OriginHeight;
    }

    /**
     * Set 图片的原始高度，输入PDF文件则表示单页PDF转图片之后的图片高度
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginHeight 图片的原始高度，输入PDF文件则表示单页PDF转图片之后的图片高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginHeight(Long OriginHeight) {
        this.OriginHeight = OriginHeight;
    }

    /**
     * Get 图片的原始宽度，输入PDF文件则表示单页PDF转图片之后的图片宽度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginWidth 图片的原始宽度，输入PDF文件则表示单页PDF转图片之后的图片宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOriginWidth() {
        return this.OriginWidth;
    }

    /**
     * Set 图片的原始宽度，输入PDF文件则表示单页PDF转图片之后的图片宽度
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginWidth 图片的原始宽度，输入PDF文件则表示单页PDF转图片之后的图片宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginWidth(Long OriginWidth) {
        this.OriginWidth = OriginWidth;
    }

    /**
     * Get 文档元素信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Elements 文档元素信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DocumentElement [] getElements() {
        return this.Elements;
    }

    /**
     * Set 文档元素信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Elements 文档元素信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElements(DocumentElement [] Elements) {
        this.Elements = Elements;
    }

    /**
     * Get 旋转角度

注意：此字段可能返回 null，表示取不到有效值。 
     * @return RotatedAngle 旋转角度

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRotatedAngle() {
        return this.RotatedAngle;
    }

    /**
     * Set 旋转角度

注意：此字段可能返回 null，表示取不到有效值。
     * @param RotatedAngle 旋转角度

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotatedAngle(Float RotatedAngle) {
        this.RotatedAngle = RotatedAngle;
    }

    public DocumentRecognizeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocumentRecognizeInfo(DocumentRecognizeInfo source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Angle != null) {
            this.Angle = new Long(source.Angle);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.OriginHeight != null) {
            this.OriginHeight = new Long(source.OriginHeight);
        }
        if (source.OriginWidth != null) {
            this.OriginWidth = new Long(source.OriginWidth);
        }
        if (source.Elements != null) {
            this.Elements = new DocumentElement[source.Elements.length];
            for (int i = 0; i < source.Elements.length; i++) {
                this.Elements[i] = new DocumentElement(source.Elements[i]);
            }
        }
        if (source.RotatedAngle != null) {
            this.RotatedAngle = new Float(source.RotatedAngle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "OriginHeight", this.OriginHeight);
        this.setParamSimple(map, prefix + "OriginWidth", this.OriginWidth);
        this.setParamArrayObj(map, prefix + "Elements.", this.Elements);
        this.setParamSimple(map, prefix + "RotatedAngle", this.RotatedAngle);

    }
}

