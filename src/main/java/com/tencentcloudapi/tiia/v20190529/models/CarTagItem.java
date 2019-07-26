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

public class CarTagItem  extends AbstractModel{

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
     * 获取车系
     * @return Serial 车系
     */
    public String getSerial() {
        return this.Serial;
    }

    /**
     * 设置车系
     * @param Serial 车系
     */
    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    /**
     * 获取车辆品牌
     * @return Brand 车辆品牌
     */
    public String getBrand() {
        return this.Brand;
    }

    /**
     * 设置车辆品牌
     * @param Brand 车辆品牌
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * 获取车辆类型
     * @return Type 车辆类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置车辆类型
     * @param Type 车辆类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取车辆颜色
     * @return Color 车辆颜色
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * 设置车辆颜色
     * @param Color 车辆颜色
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * 获取置信度，0-100
     * @return Confidence 置信度，0-100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置置信度，0-100
     * @param Confidence 置信度，0-100
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取年份，没识别出年份的时候返回0
     * @return Year 年份，没识别出年份的时候返回0
     */
    public Long getYear() {
        return this.Year;
    }

    /**
     * 设置年份，没识别出年份的时候返回0
     * @param Year 年份，没识别出年份的时候返回0
     */
    public void setYear(Long Year) {
        this.Year = Year;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Serial", this.Serial);
        this.setParamSimple(map, prefix + "Brand", this.Brand);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Year", this.Year);

    }
}

