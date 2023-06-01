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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Coordinate extends AbstractModel{

    /**
    * 宽度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 左上角纵坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cy")
    @Expose
    private Long Cy;

    /**
    * 左上角横坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cx")
    @Expose
    private Long Cx;

    /**
    * 高度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

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
     * Get 左上角纵坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cy 左上角纵坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCy() {
        return this.Cy;
    }

    /**
     * Set 左上角纵坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cy 左上角纵坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCy(Long Cy) {
        this.Cy = Cy;
    }

    /**
     * Get 左上角横坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cx 左上角横坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCx() {
        return this.Cx;
    }

    /**
     * Set 左上角横坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cx 左上角横坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCx(Long Cx) {
        this.Cx = Cx;
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

    public Coordinate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Coordinate(Coordinate source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Cy != null) {
            this.Cy = new Long(source.Cy);
        }
        if (source.Cx != null) {
            this.Cx = new Long(source.Cx);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Cy", this.Cy);
        this.setParamSimple(map, prefix + "Cx", this.Cx);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

