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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BodyExaminationBlock extends AbstractModel {

    /**
    * 体温
    */
    @SerializedName("BodyTemperature")
    @Expose
    private BodyTemperatureBlock BodyTemperature;

    /**
    * 脉搏
    */
    @SerializedName("Pulse")
    @Expose
    private BodyTemperatureBlock Pulse;

    /**
    * 呼吸
    */
    @SerializedName("Breathe")
    @Expose
    private BodyTemperatureBlock Breathe;

    /**
    * 血压
    */
    @SerializedName("BloodPressure")
    @Expose
    private BloodPressureBlock BloodPressure;

    /**
     * Get 体温 
     * @return BodyTemperature 体温
     */
    public BodyTemperatureBlock getBodyTemperature() {
        return this.BodyTemperature;
    }

    /**
     * Set 体温
     * @param BodyTemperature 体温
     */
    public void setBodyTemperature(BodyTemperatureBlock BodyTemperature) {
        this.BodyTemperature = BodyTemperature;
    }

    /**
     * Get 脉搏 
     * @return Pulse 脉搏
     */
    public BodyTemperatureBlock getPulse() {
        return this.Pulse;
    }

    /**
     * Set 脉搏
     * @param Pulse 脉搏
     */
    public void setPulse(BodyTemperatureBlock Pulse) {
        this.Pulse = Pulse;
    }

    /**
     * Get 呼吸 
     * @return Breathe 呼吸
     */
    public BodyTemperatureBlock getBreathe() {
        return this.Breathe;
    }

    /**
     * Set 呼吸
     * @param Breathe 呼吸
     */
    public void setBreathe(BodyTemperatureBlock Breathe) {
        this.Breathe = Breathe;
    }

    /**
     * Get 血压 
     * @return BloodPressure 血压
     */
    public BloodPressureBlock getBloodPressure() {
        return this.BloodPressure;
    }

    /**
     * Set 血压
     * @param BloodPressure 血压
     */
    public void setBloodPressure(BloodPressureBlock BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public BodyExaminationBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BodyExaminationBlock(BodyExaminationBlock source) {
        if (source.BodyTemperature != null) {
            this.BodyTemperature = new BodyTemperatureBlock(source.BodyTemperature);
        }
        if (source.Pulse != null) {
            this.Pulse = new BodyTemperatureBlock(source.Pulse);
        }
        if (source.Breathe != null) {
            this.Breathe = new BodyTemperatureBlock(source.Breathe);
        }
        if (source.BloodPressure != null) {
            this.BloodPressure = new BloodPressureBlock(source.BloodPressure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BodyTemperature.", this.BodyTemperature);
        this.setParamObj(map, prefix + "Pulse.", this.Pulse);
        this.setParamObj(map, prefix + "Breathe.", this.Breathe);
        this.setParamObj(map, prefix + "BloodPressure.", this.BloodPressure);

    }
}

