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
    * 置信度，0-100
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
     * Get 置信度，0-100 
     * @return Confidence 置信度，0-100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度，0-100
     * @param Confidence 置信度，0-100
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

    }
}

