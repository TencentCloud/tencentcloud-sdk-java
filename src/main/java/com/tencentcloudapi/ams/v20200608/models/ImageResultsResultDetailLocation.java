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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageResultsResultDetailLocation extends AbstractModel{

    /**
    * x坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("X")
    @Expose
    private Float X;

    /**
    * y坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Y")
    @Expose
    private Float Y;

    /**
    * 宽度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 旋转角度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rotate")
    @Expose
    private Float Rotate;

    /**
     * Get x坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return X x坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getX() {
        return this.X;
    }

    /**
     * Set x坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param X x坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setX(Float X) {
        this.X = X;
    }

    /**
     * Get y坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Y y坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getY() {
        return this.Y;
    }

    /**
     * Set y坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Y y坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setY(Float Y) {
        this.Y = Y;
    }

    /**
     * Get 宽度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 旋转角度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rotate 旋转角度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRotate() {
        return this.Rotate;
    }

    /**
     * Set 旋转角度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rotate 旋转角度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotate(Float Rotate) {
        this.Rotate = Rotate;
    }

    public ImageResultsResultDetailLocation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageResultsResultDetailLocation(ImageResultsResultDetailLocation source) {
        if (source.X != null) {
            this.X = new Float(source.X);
        }
        if (source.Y != null) {
            this.Y = new Float(source.Y);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Rotate != null) {
            this.Rotate = new Float(source.Rotate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);

    }
}

