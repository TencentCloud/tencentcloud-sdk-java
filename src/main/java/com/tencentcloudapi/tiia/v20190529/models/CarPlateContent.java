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

public class CarPlateContent extends AbstractModel{

    /**
    * 车牌信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Plate")
    @Expose
    private String Plate;

    /**
    * 车牌颜色。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * 车牌类型；渣土车车牌遮挡时,该值为枚举值“异常”。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 车牌在图片中的坐标信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlateLocation")
    @Expose
    private Coord [] PlateLocation;

    /**
     * Get 车牌信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Plate 车牌信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlate() {
        return this.Plate;
    }

    /**
     * Set 车牌信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Plate 车牌信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlate(String Plate) {
        this.Plate = Plate;
    }

    /**
     * Get 车牌颜色。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Color 车牌颜色。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 车牌颜色。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Color 车牌颜色。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get 车牌类型；渣土车车牌遮挡时,该值为枚举值“异常”。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 车牌类型；渣土车车牌遮挡时,该值为枚举值“异常”。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 车牌类型；渣土车车牌遮挡时,该值为枚举值“异常”。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 车牌类型；渣土车车牌遮挡时,该值为枚举值“异常”。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 车牌在图片中的坐标信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlateLocation 车牌在图片中的坐标信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Coord [] getPlateLocation() {
        return this.PlateLocation;
    }

    /**
     * Set 车牌在图片中的坐标信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlateLocation 车牌在图片中的坐标信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlateLocation(Coord [] PlateLocation) {
        this.PlateLocation = PlateLocation;
    }

    public CarPlateContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CarPlateContent(CarPlateContent source) {
        if (source.Plate != null) {
            this.Plate = new String(source.Plate);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PlateLocation != null) {
            this.PlateLocation = new Coord[source.PlateLocation.length];
            for (int i = 0; i < source.PlateLocation.length; i++) {
                this.PlateLocation[i] = new Coord(source.PlateLocation[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Plate", this.Plate);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "PlateLocation.", this.PlateLocation);

    }
}

