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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WatermarkConfig extends AbstractModel{

    /**
    * 水印图片的url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 水印宽。为比例值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Float Width;

    /**
    * 水印高。为比例值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Float Height;

    /**
    * 水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocationX")
    @Expose
    private Float LocationX;

    /**
    * 水印Y偏移, 取值:0-100, 表示区域Y方向的百分比。比如50，则表示位于Y轴中间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocationY")
    @Expose
    private Float LocationY;

    /**
     * Get 水印图片的url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 水印图片的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 水印图片的url
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 水印图片的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 水印宽。为比例值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 水印宽。为比例值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getWidth() {
        return this.Width;
    }

    /**
     * Set 水印宽。为比例值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 水印宽。为比例值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Float Width) {
        this.Width = Width;
    }

    /**
     * Get 水印高。为比例值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 水印高。为比例值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getHeight() {
        return this.Height;
    }

    /**
     * Set 水印高。为比例值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 水印高。为比例值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Float Height) {
        this.Height = Height;
    }

    /**
     * Get 水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocationX 水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLocationX() {
        return this.LocationX;
    }

    /**
     * Set 水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocationX 水印X偏移, 取值:0-100, 表示区域X方向的百分比。比如50，则表示位于X轴中间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocationX(Float LocationX) {
        this.LocationX = LocationX;
    }

    /**
     * Get 水印Y偏移, 取值:0-100, 表示区域Y方向的百分比。比如50，则表示位于Y轴中间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocationY 水印Y偏移, 取值:0-100, 表示区域Y方向的百分比。比如50，则表示位于Y轴中间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLocationY() {
        return this.LocationY;
    }

    /**
     * Set 水印Y偏移, 取值:0-100, 表示区域Y方向的百分比。比如50，则表示位于Y轴中间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocationY 水印Y偏移, 取值:0-100, 表示区域Y方向的百分比。比如50，则表示位于Y轴中间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocationY(Float LocationY) {
        this.LocationY = LocationY;
    }

    public WatermarkConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkConfig(WatermarkConfig source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Width != null) {
            this.Width = new Float(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Float(source.Height);
        }
        if (source.LocationX != null) {
            this.LocationX = new Float(source.LocationX);
        }
        if (source.LocationY != null) {
            this.LocationY = new Float(source.LocationY);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "LocationX", this.LocationX);
        this.setParamSimple(map, prefix + "LocationY", this.LocationY);

    }
}

