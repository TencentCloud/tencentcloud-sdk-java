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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealTimeSpeechStatisticsItem extends AbstractModel{

    /**
    * 大陆地区DAU
    */
    @SerializedName("MainLandDau")
    @Expose
    private Long MainLandDau;

    /**
    * 大陆地区PCU
    */
    @SerializedName("MainLandPcu")
    @Expose
    private Long MainLandPcu;

    /**
    * 大陆地区总使用时长，单位为min
    */
    @SerializedName("MainLandDuration")
    @Expose
    private Long MainLandDuration;

    /**
    * 海外地区DAU
    */
    @SerializedName("OverseaDau")
    @Expose
    private Long OverseaDau;

    /**
    * 海外地区PCU
    */
    @SerializedName("OverseaPcu")
    @Expose
    private Long OverseaPcu;

    /**
    * 海外地区总使用时长，单位为min
    */
    @SerializedName("OverseaDuration")
    @Expose
    private Long OverseaDuration;

    /**
     * Get 大陆地区DAU 
     * @return MainLandDau 大陆地区DAU
     */
    public Long getMainLandDau() {
        return this.MainLandDau;
    }

    /**
     * Set 大陆地区DAU
     * @param MainLandDau 大陆地区DAU
     */
    public void setMainLandDau(Long MainLandDau) {
        this.MainLandDau = MainLandDau;
    }

    /**
     * Get 大陆地区PCU 
     * @return MainLandPcu 大陆地区PCU
     */
    public Long getMainLandPcu() {
        return this.MainLandPcu;
    }

    /**
     * Set 大陆地区PCU
     * @param MainLandPcu 大陆地区PCU
     */
    public void setMainLandPcu(Long MainLandPcu) {
        this.MainLandPcu = MainLandPcu;
    }

    /**
     * Get 大陆地区总使用时长，单位为min 
     * @return MainLandDuration 大陆地区总使用时长，单位为min
     */
    public Long getMainLandDuration() {
        return this.MainLandDuration;
    }

    /**
     * Set 大陆地区总使用时长，单位为min
     * @param MainLandDuration 大陆地区总使用时长，单位为min
     */
    public void setMainLandDuration(Long MainLandDuration) {
        this.MainLandDuration = MainLandDuration;
    }

    /**
     * Get 海外地区DAU 
     * @return OverseaDau 海外地区DAU
     */
    public Long getOverseaDau() {
        return this.OverseaDau;
    }

    /**
     * Set 海外地区DAU
     * @param OverseaDau 海外地区DAU
     */
    public void setOverseaDau(Long OverseaDau) {
        this.OverseaDau = OverseaDau;
    }

    /**
     * Get 海外地区PCU 
     * @return OverseaPcu 海外地区PCU
     */
    public Long getOverseaPcu() {
        return this.OverseaPcu;
    }

    /**
     * Set 海外地区PCU
     * @param OverseaPcu 海外地区PCU
     */
    public void setOverseaPcu(Long OverseaPcu) {
        this.OverseaPcu = OverseaPcu;
    }

    /**
     * Get 海外地区总使用时长，单位为min 
     * @return OverseaDuration 海外地区总使用时长，单位为min
     */
    public Long getOverseaDuration() {
        return this.OverseaDuration;
    }

    /**
     * Set 海外地区总使用时长，单位为min
     * @param OverseaDuration 海外地区总使用时长，单位为min
     */
    public void setOverseaDuration(Long OverseaDuration) {
        this.OverseaDuration = OverseaDuration;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainLandDau", this.MainLandDau);
        this.setParamSimple(map, prefix + "MainLandPcu", this.MainLandPcu);
        this.setParamSimple(map, prefix + "MainLandDuration", this.MainLandDuration);
        this.setParamSimple(map, prefix + "OverseaDau", this.OverseaDau);
        this.setParamSimple(map, prefix + "OverseaPcu", this.OverseaPcu);
        this.setParamSimple(map, prefix + "OverseaDuration", this.OverseaDuration);

    }
}

