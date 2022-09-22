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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rectf extends AbstractModel{

    /**
    * 矩形框左上角水平座标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("X")
    @Expose
    private Float X;

    /**
    * 矩形框左上角竖直座标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Y")
    @Expose
    private Float Y;

    /**
    * 矩形框宽度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Float Width;

    /**
    * 矩形框长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Float Height;

    /**
     * Get 矩形框左上角水平座标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return X 矩形框左上角水平座标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getX() {
        return this.X;
    }

    /**
     * Set 矩形框左上角水平座标
注意：此字段可能返回 null，表示取不到有效值。
     * @param X 矩形框左上角水平座标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setX(Float X) {
        this.X = X;
    }

    /**
     * Get 矩形框左上角竖直座标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Y 矩形框左上角竖直座标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getY() {
        return this.Y;
    }

    /**
     * Set 矩形框左上角竖直座标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Y 矩形框左上角竖直座标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setY(Float Y) {
        this.Y = Y;
    }

    /**
     * Get 矩形框宽度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 矩形框宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getWidth() {
        return this.Width;
    }

    /**
     * Set 矩形框宽度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 矩形框宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Float Width) {
        this.Width = Width;
    }

    /**
     * Get 矩形框长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 矩形框长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getHeight() {
        return this.Height;
    }

    /**
     * Set 矩形框长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 矩形框长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Float Height) {
        this.Height = Height;
    }

    public Rectf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rectf(Rectf source) {
        if (source.X != null) {
            this.X = new Float(source.X);
        }
        if (source.Y != null) {
            this.Y = new Float(source.Y);
        }
        if (source.Width != null) {
            this.Width = new Float(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Float(source.Height);
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

    }
}

