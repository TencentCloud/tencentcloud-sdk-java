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

public class GeneralExaminationVitalSign extends AbstractModel {

    /**
    * 生命体征总体描述
    */
    @SerializedName("Text")
    @Expose
    private ValueUnitItem Text;

    /**
    * 体温
    */
    @SerializedName("BodyTemperature")
    @Expose
    private ValueUnitItem BodyTemperature;

    /**
    * 脉率
    */
    @SerializedName("Pulse")
    @Expose
    private ValueUnitItem Pulse;

    /**
    * 心率
    */
    @SerializedName("HeartRate")
    @Expose
    private ValueUnitItem HeartRate;

    /**
    * 呼吸频率
    */
    @SerializedName("BreathingRate")
    @Expose
    private ValueUnitItem BreathingRate;

    /**
    * 身高
    */
    @SerializedName("BodyHeight")
    @Expose
    private ValueUnitItem BodyHeight;

    /**
    * 体重
    */
    @SerializedName("BodyWeight")
    @Expose
    private ValueUnitItem BodyWeight;

    /**
    * 体质指数
    */
    @SerializedName("BodyMassIndex")
    @Expose
    private ValueUnitItem BodyMassIndex;

    /**
    * 腰围
    */
    @SerializedName("Waistline")
    @Expose
    private ValueUnitItem Waistline;

    /**
    * 血压
    */
    @SerializedName("BloodPressure")
    @Expose
    private GeneralExaminationVitalSignBloodPressure BloodPressure;

    /**
     * Get 生命体征总体描述 
     * @return Text 生命体征总体描述
     */
    public ValueUnitItem getText() {
        return this.Text;
    }

    /**
     * Set 生命体征总体描述
     * @param Text 生命体征总体描述
     */
    public void setText(ValueUnitItem Text) {
        this.Text = Text;
    }

    /**
     * Get 体温 
     * @return BodyTemperature 体温
     */
    public ValueUnitItem getBodyTemperature() {
        return this.BodyTemperature;
    }

    /**
     * Set 体温
     * @param BodyTemperature 体温
     */
    public void setBodyTemperature(ValueUnitItem BodyTemperature) {
        this.BodyTemperature = BodyTemperature;
    }

    /**
     * Get 脉率 
     * @return Pulse 脉率
     */
    public ValueUnitItem getPulse() {
        return this.Pulse;
    }

    /**
     * Set 脉率
     * @param Pulse 脉率
     */
    public void setPulse(ValueUnitItem Pulse) {
        this.Pulse = Pulse;
    }

    /**
     * Get 心率 
     * @return HeartRate 心率
     */
    public ValueUnitItem getHeartRate() {
        return this.HeartRate;
    }

    /**
     * Set 心率
     * @param HeartRate 心率
     */
    public void setHeartRate(ValueUnitItem HeartRate) {
        this.HeartRate = HeartRate;
    }

    /**
     * Get 呼吸频率 
     * @return BreathingRate 呼吸频率
     */
    public ValueUnitItem getBreathingRate() {
        return this.BreathingRate;
    }

    /**
     * Set 呼吸频率
     * @param BreathingRate 呼吸频率
     */
    public void setBreathingRate(ValueUnitItem BreathingRate) {
        this.BreathingRate = BreathingRate;
    }

    /**
     * Get 身高 
     * @return BodyHeight 身高
     */
    public ValueUnitItem getBodyHeight() {
        return this.BodyHeight;
    }

    /**
     * Set 身高
     * @param BodyHeight 身高
     */
    public void setBodyHeight(ValueUnitItem BodyHeight) {
        this.BodyHeight = BodyHeight;
    }

    /**
     * Get 体重 
     * @return BodyWeight 体重
     */
    public ValueUnitItem getBodyWeight() {
        return this.BodyWeight;
    }

    /**
     * Set 体重
     * @param BodyWeight 体重
     */
    public void setBodyWeight(ValueUnitItem BodyWeight) {
        this.BodyWeight = BodyWeight;
    }

    /**
     * Get 体质指数 
     * @return BodyMassIndex 体质指数
     */
    public ValueUnitItem getBodyMassIndex() {
        return this.BodyMassIndex;
    }

    /**
     * Set 体质指数
     * @param BodyMassIndex 体质指数
     */
    public void setBodyMassIndex(ValueUnitItem BodyMassIndex) {
        this.BodyMassIndex = BodyMassIndex;
    }

    /**
     * Get 腰围 
     * @return Waistline 腰围
     */
    public ValueUnitItem getWaistline() {
        return this.Waistline;
    }

    /**
     * Set 腰围
     * @param Waistline 腰围
     */
    public void setWaistline(ValueUnitItem Waistline) {
        this.Waistline = Waistline;
    }

    /**
     * Get 血压 
     * @return BloodPressure 血压
     */
    public GeneralExaminationVitalSignBloodPressure getBloodPressure() {
        return this.BloodPressure;
    }

    /**
     * Set 血压
     * @param BloodPressure 血压
     */
    public void setBloodPressure(GeneralExaminationVitalSignBloodPressure BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public GeneralExaminationVitalSign() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralExaminationVitalSign(GeneralExaminationVitalSign source) {
        if (source.Text != null) {
            this.Text = new ValueUnitItem(source.Text);
        }
        if (source.BodyTemperature != null) {
            this.BodyTemperature = new ValueUnitItem(source.BodyTemperature);
        }
        if (source.Pulse != null) {
            this.Pulse = new ValueUnitItem(source.Pulse);
        }
        if (source.HeartRate != null) {
            this.HeartRate = new ValueUnitItem(source.HeartRate);
        }
        if (source.BreathingRate != null) {
            this.BreathingRate = new ValueUnitItem(source.BreathingRate);
        }
        if (source.BodyHeight != null) {
            this.BodyHeight = new ValueUnitItem(source.BodyHeight);
        }
        if (source.BodyWeight != null) {
            this.BodyWeight = new ValueUnitItem(source.BodyWeight);
        }
        if (source.BodyMassIndex != null) {
            this.BodyMassIndex = new ValueUnitItem(source.BodyMassIndex);
        }
        if (source.Waistline != null) {
            this.Waistline = new ValueUnitItem(source.Waistline);
        }
        if (source.BloodPressure != null) {
            this.BloodPressure = new GeneralExaminationVitalSignBloodPressure(source.BloodPressure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "BodyTemperature.", this.BodyTemperature);
        this.setParamObj(map, prefix + "Pulse.", this.Pulse);
        this.setParamObj(map, prefix + "HeartRate.", this.HeartRate);
        this.setParamObj(map, prefix + "BreathingRate.", this.BreathingRate);
        this.setParamObj(map, prefix + "BodyHeight.", this.BodyHeight);
        this.setParamObj(map, prefix + "BodyWeight.", this.BodyWeight);
        this.setParamObj(map, prefix + "BodyMassIndex.", this.BodyMassIndex);
        this.setParamObj(map, prefix + "Waistline.", this.Waistline);
        this.setParamObj(map, prefix + "BloodPressure.", this.BloodPressure);

    }
}

