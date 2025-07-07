/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElementCoordinates extends AbstractModel {

    /**
    * 经度
    */
    @SerializedName("Longitude")
    @Expose
    private Float Longitude;

    /**
    * 纬度
    */
    @SerializedName("Latitude")
    @Expose
    private Float Latitude;

    /**
    * 高程
    */
    @SerializedName("Altitude")
    @Expose
    private Float Altitude;

    /**
     * Get 经度 
     * @return Longitude 经度
     */
    public Float getLongitude() {
        return this.Longitude;
    }

    /**
     * Set 经度
     * @param Longitude 经度
     */
    public void setLongitude(Float Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get 纬度 
     * @return Latitude 纬度
     */
    public Float getLatitude() {
        return this.Latitude;
    }

    /**
     * Set 纬度
     * @param Latitude 纬度
     */
    public void setLatitude(Float Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get 高程 
     * @return Altitude 高程
     */
    public Float getAltitude() {
        return this.Altitude;
    }

    /**
     * Set 高程
     * @param Altitude 高程
     */
    public void setAltitude(Float Altitude) {
        this.Altitude = Altitude;
    }

    public ElementCoordinates() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElementCoordinates(ElementCoordinates source) {
        if (source.Longitude != null) {
            this.Longitude = new Float(source.Longitude);
        }
        if (source.Latitude != null) {
            this.Latitude = new Float(source.Latitude);
        }
        if (source.Altitude != null) {
            this.Altitude = new Float(source.Altitude);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "Altitude", this.Altitude);

    }
}

