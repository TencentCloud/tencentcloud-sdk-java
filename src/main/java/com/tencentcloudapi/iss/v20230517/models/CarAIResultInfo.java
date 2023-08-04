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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CarAIResultInfo extends AbstractModel{

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
    * 置信度，0 - 100
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 年份，识别不出年份时返回0
    */
    @SerializedName("Year")
    @Expose
    private Long Year;

    /**
    * 车牌信息
    */
    @SerializedName("PlateContent")
    @Expose
    private PlateContent PlateContent;

    /**
    * 截图中坐标信息
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

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
     * Get 置信度，0 - 100 
     * @return Confidence 置信度，0 - 100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度，0 - 100
     * @param Confidence 置信度，0 - 100
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 年份，识别不出年份时返回0 
     * @return Year 年份，识别不出年份时返回0
     */
    public Long getYear() {
        return this.Year;
    }

    /**
     * Set 年份，识别不出年份时返回0
     * @param Year 年份，识别不出年份时返回0
     */
    public void setYear(Long Year) {
        this.Year = Year;
    }

    /**
     * Get 车牌信息 
     * @return PlateContent 车牌信息
     */
    public PlateContent getPlateContent() {
        return this.PlateContent;
    }

    /**
     * Set 车牌信息
     * @param PlateContent 车牌信息
     */
    public void setPlateContent(PlateContent PlateContent) {
        this.PlateContent = PlateContent;
    }

    /**
     * Get 截图中坐标信息 
     * @return Location 截图中坐标信息
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set 截图中坐标信息
     * @param Location 截图中坐标信息
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    public CarAIResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CarAIResultInfo(CarAIResultInfo source) {
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
        if (source.PlateContent != null) {
            this.PlateContent = new PlateContent(source.PlateContent);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
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
        this.setParamObj(map, prefix + "PlateContent.", this.PlateContent);
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

