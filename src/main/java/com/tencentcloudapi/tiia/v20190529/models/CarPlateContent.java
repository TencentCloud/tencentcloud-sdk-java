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
    * 车牌类型，包含：0普通蓝牌，1双层黄牌，2单层黄牌，3新能源车牌，4使馆车牌，5领馆车牌，6澳门车牌，7香港车牌，8警用车牌，9教练车牌，10武警车牌，11军用车牌   -2遮挡污损模糊车牌/异常   其他无牌
注意：
此字段可能返回 null，表示取不到有效值。
此字段结果遮挡污损模糊车牌/异常：包含PlateStatus参数的“遮挡污损模糊车牌”，针对车牌异常，建议参考此字段，更全面
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
    * 判断车牌是否遮挡：“遮挡污损模糊车牌”和"正常车牌"。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlateStatus")
    @Expose
    private String PlateStatus;

    /**
    * 车牌遮挡的置信度，0-100。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlateStatusConfidence")
    @Expose
    private Long PlateStatusConfidence;

    /**
    * 车牌角度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlateAngle")
    @Expose
    private Float PlateAngle;

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
     * Get 车牌类型，包含：0普通蓝牌，1双层黄牌，2单层黄牌，3新能源车牌，4使馆车牌，5领馆车牌，6澳门车牌，7香港车牌，8警用车牌，9教练车牌，10武警车牌，11军用车牌   -2遮挡污损模糊车牌/异常   其他无牌
注意：
此字段可能返回 null，表示取不到有效值。
此字段结果遮挡污损模糊车牌/异常：包含PlateStatus参数的“遮挡污损模糊车牌”，针对车牌异常，建议参考此字段，更全面
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 车牌类型，包含：0普通蓝牌，1双层黄牌，2单层黄牌，3新能源车牌，4使馆车牌，5领馆车牌，6澳门车牌，7香港车牌，8警用车牌，9教练车牌，10武警车牌，11军用车牌   -2遮挡污损模糊车牌/异常   其他无牌
注意：
此字段可能返回 null，表示取不到有效值。
此字段结果遮挡污损模糊车牌/异常：包含PlateStatus参数的“遮挡污损模糊车牌”，针对车牌异常，建议参考此字段，更全面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 车牌类型，包含：0普通蓝牌，1双层黄牌，2单层黄牌，3新能源车牌，4使馆车牌，5领馆车牌，6澳门车牌，7香港车牌，8警用车牌，9教练车牌，10武警车牌，11军用车牌   -2遮挡污损模糊车牌/异常   其他无牌
注意：
此字段可能返回 null，表示取不到有效值。
此字段结果遮挡污损模糊车牌/异常：包含PlateStatus参数的“遮挡污损模糊车牌”，针对车牌异常，建议参考此字段，更全面
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 车牌类型，包含：0普通蓝牌，1双层黄牌，2单层黄牌，3新能源车牌，4使馆车牌，5领馆车牌，6澳门车牌，7香港车牌，8警用车牌，9教练车牌，10武警车牌，11军用车牌   -2遮挡污损模糊车牌/异常   其他无牌
注意：
此字段可能返回 null，表示取不到有效值。
此字段结果遮挡污损模糊车牌/异常：包含PlateStatus参数的“遮挡污损模糊车牌”，针对车牌异常，建议参考此字段，更全面
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

    /**
     * Get 判断车牌是否遮挡：“遮挡污损模糊车牌”和"正常车牌"。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlateStatus 判断车牌是否遮挡：“遮挡污损模糊车牌”和"正常车牌"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlateStatus() {
        return this.PlateStatus;
    }

    /**
     * Set 判断车牌是否遮挡：“遮挡污损模糊车牌”和"正常车牌"。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlateStatus 判断车牌是否遮挡：“遮挡污损模糊车牌”和"正常车牌"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlateStatus(String PlateStatus) {
        this.PlateStatus = PlateStatus;
    }

    /**
     * Get 车牌遮挡的置信度，0-100。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlateStatusConfidence 车牌遮挡的置信度，0-100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPlateStatusConfidence() {
        return this.PlateStatusConfidence;
    }

    /**
     * Set 车牌遮挡的置信度，0-100。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlateStatusConfidence 车牌遮挡的置信度，0-100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlateStatusConfidence(Long PlateStatusConfidence) {
        this.PlateStatusConfidence = PlateStatusConfidence;
    }

    /**
     * Get 车牌角度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlateAngle 车牌角度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPlateAngle() {
        return this.PlateAngle;
    }

    /**
     * Set 车牌角度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlateAngle 车牌角度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlateAngle(Float PlateAngle) {
        this.PlateAngle = PlateAngle;
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
        if (source.PlateStatus != null) {
            this.PlateStatus = new String(source.PlateStatus);
        }
        if (source.PlateStatusConfidence != null) {
            this.PlateStatusConfidence = new Long(source.PlateStatusConfidence);
        }
        if (source.PlateAngle != null) {
            this.PlateAngle = new Float(source.PlateAngle);
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
        this.setParamSimple(map, prefix + "PlateStatus", this.PlateStatus);
        this.setParamSimple(map, prefix + "PlateStatusConfidence", this.PlateStatusConfidence);
        this.setParamSimple(map, prefix + "PlateAngle", this.PlateAngle);

    }
}

