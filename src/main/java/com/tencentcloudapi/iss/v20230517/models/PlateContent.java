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

public class PlateContent extends AbstractModel{

    /**
    * 车牌号信息
    */
    @SerializedName("Plate")
    @Expose
    private String Plate;

    /**
    * 车牌的颜色
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * 车牌的种类，例如普通蓝牌
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 截图中坐标信息
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
     * Get 车牌号信息 
     * @return Plate 车牌号信息
     */
    public String getPlate() {
        return this.Plate;
    }

    /**
     * Set 车牌号信息
     * @param Plate 车牌号信息
     */
    public void setPlate(String Plate) {
        this.Plate = Plate;
    }

    /**
     * Get 车牌的颜色 
     * @return Color 车牌的颜色
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 车牌的颜色
     * @param Color 车牌的颜色
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get 车牌的种类，例如普通蓝牌 
     * @return Type 车牌的种类，例如普通蓝牌
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 车牌的种类，例如普通蓝牌
     * @param Type 车牌的种类，例如普通蓝牌
     */
    public void setType(String Type) {
        this.Type = Type;
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

    public PlateContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlateContent(PlateContent source) {
        if (source.Plate != null) {
            this.Plate = new String(source.Plate);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Plate", this.Plate);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

