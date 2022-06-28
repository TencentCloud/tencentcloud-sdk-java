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

public class Coordinate extends AbstractModel{

    /**
    * 左上角x坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("X")
    @Expose
    private Long X;

    /**
    * 左上角y坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Y")
    @Expose
    private Long Y;

    /**
    * 宽度，单位像素
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 高度，单位像素
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 左上角x坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return X 左上角x坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getX() {
        return this.X;
    }

    /**
     * Set 左上角x坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param X 左上角x坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setX(Long X) {
        this.X = X;
    }

    /**
     * Get 左上角y坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Y 左上角y坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getY() {
        return this.Y;
    }

    /**
     * Set 左上角y坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Y 左上角y坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setY(Long Y) {
        this.Y = Y;
    }

    /**
     * Get 宽度，单位像素
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 宽度，单位像素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 宽度，单位像素
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 宽度，单位像素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 高度，单位像素
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 高度，单位像素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 高度，单位像素
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 高度，单位像素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public Coordinate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Coordinate(Coordinate source) {
        if (source.X != null) {
            this.X = new Long(source.X);
        }
        if (source.Y != null) {
            this.Y = new Long(source.Y);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
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

