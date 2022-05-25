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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PositionItem extends AbstractModel{

    /**
    * 位置点的时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 位置点的经度
    */
    @SerializedName("Longitude")
    @Expose
    private Float Longitude;

    /**
    * 位置点的纬度
    */
    @SerializedName("Latitude")
    @Expose
    private Float Latitude;

    /**
    * 位置点的定位类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocationType")
    @Expose
    private String LocationType;

    /**
    * 位置点的精度预估，单位为米
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Accuracy")
    @Expose
    private Float Accuracy;

    /**
     * Get 位置点的时间 
     * @return CreateTime 位置点的时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 位置点的时间
     * @param CreateTime 位置点的时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 位置点的经度 
     * @return Longitude 位置点的经度
     */
    public Float getLongitude() {
        return this.Longitude;
    }

    /**
     * Set 位置点的经度
     * @param Longitude 位置点的经度
     */
    public void setLongitude(Float Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get 位置点的纬度 
     * @return Latitude 位置点的纬度
     */
    public Float getLatitude() {
        return this.Latitude;
    }

    /**
     * Set 位置点的纬度
     * @param Latitude 位置点的纬度
     */
    public void setLatitude(Float Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get 位置点的定位类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocationType 位置点的定位类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocationType() {
        return this.LocationType;
    }

    /**
     * Set 位置点的定位类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocationType 位置点的定位类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocationType(String LocationType) {
        this.LocationType = LocationType;
    }

    /**
     * Get 位置点的精度预估，单位为米
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Accuracy 位置点的精度预估，单位为米
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAccuracy() {
        return this.Accuracy;
    }

    /**
     * Set 位置点的精度预估，单位为米
注意：此字段可能返回 null，表示取不到有效值。
     * @param Accuracy 位置点的精度预估，单位为米
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccuracy(Float Accuracy) {
        this.Accuracy = Accuracy;
    }

    public PositionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PositionItem(PositionItem source) {
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Longitude != null) {
            this.Longitude = new Float(source.Longitude);
        }
        if (source.Latitude != null) {
            this.Latitude = new Float(source.Latitude);
        }
        if (source.LocationType != null) {
            this.LocationType = new String(source.LocationType);
        }
        if (source.Accuracy != null) {
            this.Accuracy = new Float(source.Accuracy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "LocationType", this.LocationType);
        this.setParamSimple(map, prefix + "Accuracy", this.Accuracy);

    }
}

