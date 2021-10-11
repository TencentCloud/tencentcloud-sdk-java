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

public class FenceAlarmPoint extends AbstractModel{

    /**
    * 围栏告警时间
    */
    @SerializedName("AlarmTime")
    @Expose
    private Long AlarmTime;

    /**
    * 围栏告警位置的经度
    */
    @SerializedName("Longitude")
    @Expose
    private Float Longitude;

    /**
    * 围栏告警位置的纬度
    */
    @SerializedName("Latitude")
    @Expose
    private Float Latitude;

    /**
     * Get 围栏告警时间 
     * @return AlarmTime 围栏告警时间
     */
    public Long getAlarmTime() {
        return this.AlarmTime;
    }

    /**
     * Set 围栏告警时间
     * @param AlarmTime 围栏告警时间
     */
    public void setAlarmTime(Long AlarmTime) {
        this.AlarmTime = AlarmTime;
    }

    /**
     * Get 围栏告警位置的经度 
     * @return Longitude 围栏告警位置的经度
     */
    public Float getLongitude() {
        return this.Longitude;
    }

    /**
     * Set 围栏告警位置的经度
     * @param Longitude 围栏告警位置的经度
     */
    public void setLongitude(Float Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get 围栏告警位置的纬度 
     * @return Latitude 围栏告警位置的纬度
     */
    public Float getLatitude() {
        return this.Latitude;
    }

    /**
     * Set 围栏告警位置的纬度
     * @param Latitude 围栏告警位置的纬度
     */
    public void setLatitude(Float Latitude) {
        this.Latitude = Latitude;
    }

    public FenceAlarmPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FenceAlarmPoint(FenceAlarmPoint source) {
        if (source.AlarmTime != null) {
            this.AlarmTime = new Long(source.AlarmTime);
        }
        if (source.Longitude != null) {
            this.Longitude = new Float(source.Longitude);
        }
        if (source.Latitude != null) {
            this.Latitude = new Float(source.Latitude);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmTime", this.AlarmTime);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);

    }
}

