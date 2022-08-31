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

public class CarTagItem extends AbstractModel{

    /**
    * 车系
    */
    @SerializedName("Serial")
    @Expose
    private String Serial;

    /**
    * 车辆品牌
    */
    @SerializedName("Brand")
    @Expose
    private String Brand;

    /**
    * 车辆类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 车辆颜色
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * 车系置信度，0-100
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 年份，没识别出年份的时候返回0
    */
    @SerializedName("Year")
    @Expose
    private Long Year;

    /**
    * 车辆在图片中的坐标信息
    */
    @SerializedName("CarLocation")
    @Expose
    private Coord [] CarLocation;

    /**
    * 车牌信息，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlateContent")
    @Expose
    private CarPlateContent PlateContent;

    /**
    * 车牌信息置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlateConfidence")
    @Expose
    private Long PlateConfidence;

    /**
    * 车辆类型置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeConfidence")
    @Expose
    private Long TypeConfidence;

    /**
    * 车辆颜色置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColorConfidence")
    @Expose
    private Long ColorConfidence;

    /**
    * 车辆朝向，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Orientation")
    @Expose
    private String Orientation;

    /**
    * 车辆朝向置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrientationConfidence")
    @Expose
    private Long OrientationConfidence;

    /**
     * Get 车系 
     * @return Serial 车系
     */
    public String getSerial() {
        return this.Serial;
    }

    /**
     * Set 车系
     * @param Serial 车系
     */
    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    /**
     * Get 车辆品牌 
     * @return Brand 车辆品牌
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * Set 车辆品牌
     * @param Brand 车辆品牌
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * Get 车辆类型 
     * @return Type 车辆类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 车辆类型
     * @param Type 车辆类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 车辆颜色 
     * @return Color 车辆颜色
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 车辆颜色
     * @param Color 车辆颜色
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get 车系置信度，0-100 
     * @return Confidence 车系置信度，0-100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 车系置信度，0-100
     * @param Confidence 车系置信度，0-100
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 年份，没识别出年份的时候返回0 
     * @return Year 年份，没识别出年份的时候返回0
     */
    public Long getYear() {
        return this.Year;
    }

    /**
     * Set 年份，没识别出年份的时候返回0
     * @param Year 年份，没识别出年份的时候返回0
     */
    public void setYear(Long Year) {
        this.Year = Year;
    }

    /**
     * Get 车辆在图片中的坐标信息 
     * @return CarLocation 车辆在图片中的坐标信息
     */
    public Coord [] getCarLocation() {
        return this.CarLocation;
    }

    /**
     * Set 车辆在图片中的坐标信息
     * @param CarLocation 车辆在图片中的坐标信息
     */
    public void setCarLocation(Coord [] CarLocation) {
        this.CarLocation = CarLocation;
    }

    /**
     * Get 车牌信息，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlateContent 车牌信息，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CarPlateContent getPlateContent() {
        return this.PlateContent;
    }

    /**
     * Set 车牌信息，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlateContent 车牌信息，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlateContent(CarPlateContent PlateContent) {
        this.PlateContent = PlateContent;
    }

    /**
     * Get 车牌信息置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlateConfidence 车牌信息置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPlateConfidence() {
        return this.PlateConfidence;
    }

    /**
     * Set 车牌信息置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlateConfidence 车牌信息置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlateConfidence(Long PlateConfidence) {
        this.PlateConfidence = PlateConfidence;
    }

    /**
     * Get 车辆类型置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeConfidence 车辆类型置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTypeConfidence() {
        return this.TypeConfidence;
    }

    /**
     * Set 车辆类型置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeConfidence 车辆类型置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeConfidence(Long TypeConfidence) {
        this.TypeConfidence = TypeConfidence;
    }

    /**
     * Get 车辆颜色置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColorConfidence 车辆颜色置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColorConfidence() {
        return this.ColorConfidence;
    }

    /**
     * Set 车辆颜色置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColorConfidence 车辆颜色置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColorConfidence(Long ColorConfidence) {
        this.ColorConfidence = ColorConfidence;
    }

    /**
     * Get 车辆朝向，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Orientation 车辆朝向，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrientation() {
        return this.Orientation;
    }

    /**
     * Set 车辆朝向，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param Orientation 车辆朝向，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrientation(String Orientation) {
        this.Orientation = Orientation;
    }

    /**
     * Get 车辆朝向置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrientationConfidence 车辆朝向置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrientationConfidence() {
        return this.OrientationConfidence;
    }

    /**
     * Set 车辆朝向置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrientationConfidence 车辆朝向置信度，0-100，仅车辆识别（增强版）支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrientationConfidence(Long OrientationConfidence) {
        this.OrientationConfidence = OrientationConfidence;
    }

    public CarTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CarTagItem(CarTagItem source) {
        if (source.Serial != null) {
            this.Serial = new String(source.Serial);
        }
        if (source.Brand != null) {
            this.Brand = new String(source.Brand);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Year != null) {
            this.Year = new Long(source.Year);
        }
        if (source.CarLocation != null) {
            this.CarLocation = new Coord[source.CarLocation.length];
            for (int i = 0; i < source.CarLocation.length; i++) {
                this.CarLocation[i] = new Coord(source.CarLocation[i]);
            }
        }
        if (source.PlateContent != null) {
            this.PlateContent = new CarPlateContent(source.PlateContent);
        }
        if (source.PlateConfidence != null) {
            this.PlateConfidence = new Long(source.PlateConfidence);
        }
        if (source.TypeConfidence != null) {
            this.TypeConfidence = new Long(source.TypeConfidence);
        }
        if (source.ColorConfidence != null) {
            this.ColorConfidence = new Long(source.ColorConfidence);
        }
        if (source.Orientation != null) {
            this.Orientation = new String(source.Orientation);
        }
        if (source.OrientationConfidence != null) {
            this.OrientationConfidence = new Long(source.OrientationConfidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Serial", this.Serial);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Year", this.Year);
        this.setParamArrayObj(map, prefix + "CarLocation.", this.CarLocation);
        this.setParamObj(map, prefix + "PlateContent.", this.PlateContent);
        this.setParamSimple(map, prefix + "PlateConfidence", this.PlateConfidence);
        this.setParamSimple(map, prefix + "TypeConfidence", this.TypeConfidence);
        this.setParamSimple(map, prefix + "ColorConfidence", this.ColorConfidence);
        this.setParamSimple(map, prefix + "Orientation", this.Orientation);
        this.setParamSimple(map, prefix + "OrientationConfidence", this.OrientationConfidence);

    }
}

