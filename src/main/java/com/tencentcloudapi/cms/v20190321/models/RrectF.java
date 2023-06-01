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

public class RrectF extends AbstractModel{

    /**
    * logo图标宽度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Float Width;

    /**
    * logo纵坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cy")
    @Expose
    private Float Cy;

    /**
    * logo横坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cx")
    @Expose
    private Float Cx;

    /**
    * logo图标中心旋转度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rotate")
    @Expose
    private Float Rotate;

    /**
    * logo图标高度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Float Height;

    /**
     * Get logo图标宽度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width logo图标宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getWidth() {
        return this.Width;
    }

    /**
     * Set logo图标宽度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width logo图标宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Float Width) {
        this.Width = Width;
    }

    /**
     * Get logo纵坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cy logo纵坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCy() {
        return this.Cy;
    }

    /**
     * Set logo纵坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cy logo纵坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCy(Float Cy) {
        this.Cy = Cy;
    }

    /**
     * Get logo横坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cx logo横坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCx() {
        return this.Cx;
    }

    /**
     * Set logo横坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cx logo横坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCx(Float Cx) {
        this.Cx = Cx;
    }

    /**
     * Get logo图标中心旋转度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rotate logo图标中心旋转度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRotate() {
        return this.Rotate;
    }

    /**
     * Set logo图标中心旋转度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rotate logo图标中心旋转度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotate(Float Rotate) {
        this.Rotate = Rotate;
    }

    /**
     * Get logo图标高度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height logo图标高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getHeight() {
        return this.Height;
    }

    /**
     * Set logo图标高度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height logo图标高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Float Height) {
        this.Height = Height;
    }

    public RrectF() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RrectF(RrectF source) {
        if (source.Width != null) {
            this.Width = new Float(source.Width);
        }
        if (source.Cy != null) {
            this.Cy = new Float(source.Cy);
        }
        if (source.Cx != null) {
            this.Cx = new Float(source.Cx);
        }
        if (source.Rotate != null) {
            this.Rotate = new Float(source.Rotate);
        }
        if (source.Height != null) {
            this.Height = new Float(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Cy", this.Cy);
        this.setParamSimple(map, prefix + "Cx", this.Cx);
        this.setParamSimple(map, prefix + "Rotate", this.Rotate);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

