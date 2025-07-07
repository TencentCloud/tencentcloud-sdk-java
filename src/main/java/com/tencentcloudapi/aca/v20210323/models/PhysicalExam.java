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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhysicalExam extends AbstractModel {

    /**
    * 脉搏，单位：次/分
    */
    @SerializedName("Pulse")
    @Expose
    private String Pulse;

    /**
    * 呼吸，单位：次/分
    */
    @SerializedName("Breathe")
    @Expose
    private String Breathe;

    /**
    * 体重，单位KG
    */
    @SerializedName("Weight")
    @Expose
    private String Weight;

    /**
    * 体温，单位：℃ 
    */
    @SerializedName("BodyTemperature")
    @Expose
    private String BodyTemperature;

    /**
    * 舒张压， 单位：mmHg
    */
    @SerializedName("DiastolicPressure")
    @Expose
    private String DiastolicPressure;

    /**
    * 收缩压， 单位：mmHg
    */
    @SerializedName("SystolicPressure")
    @Expose
    private String SystolicPressure;

    /**
     * Get 脉搏，单位：次/分 
     * @return Pulse 脉搏，单位：次/分
     */
    public String getPulse() {
        return this.Pulse;
    }

    /**
     * Set 脉搏，单位：次/分
     * @param Pulse 脉搏，单位：次/分
     */
    public void setPulse(String Pulse) {
        this.Pulse = Pulse;
    }

    /**
     * Get 呼吸，单位：次/分 
     * @return Breathe 呼吸，单位：次/分
     */
    public String getBreathe() {
        return this.Breathe;
    }

    /**
     * Set 呼吸，单位：次/分
     * @param Breathe 呼吸，单位：次/分
     */
    public void setBreathe(String Breathe) {
        this.Breathe = Breathe;
    }

    /**
     * Get 体重，单位KG 
     * @return Weight 体重，单位KG
     */
    public String getWeight() {
        return this.Weight;
    }

    /**
     * Set 体重，单位KG
     * @param Weight 体重，单位KG
     */
    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 体温，单位：℃  
     * @return BodyTemperature 体温，单位：℃ 
     */
    public String getBodyTemperature() {
        return this.BodyTemperature;
    }

    /**
     * Set 体温，单位：℃ 
     * @param BodyTemperature 体温，单位：℃ 
     */
    public void setBodyTemperature(String BodyTemperature) {
        this.BodyTemperature = BodyTemperature;
    }

    /**
     * Get 舒张压， 单位：mmHg 
     * @return DiastolicPressure 舒张压， 单位：mmHg
     */
    public String getDiastolicPressure() {
        return this.DiastolicPressure;
    }

    /**
     * Set 舒张压， 单位：mmHg
     * @param DiastolicPressure 舒张压， 单位：mmHg
     */
    public void setDiastolicPressure(String DiastolicPressure) {
        this.DiastolicPressure = DiastolicPressure;
    }

    /**
     * Get 收缩压， 单位：mmHg 
     * @return SystolicPressure 收缩压， 单位：mmHg
     */
    public String getSystolicPressure() {
        return this.SystolicPressure;
    }

    /**
     * Set 收缩压， 单位：mmHg
     * @param SystolicPressure 收缩压， 单位：mmHg
     */
    public void setSystolicPressure(String SystolicPressure) {
        this.SystolicPressure = SystolicPressure;
    }

    public PhysicalExam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhysicalExam(PhysicalExam source) {
        if (source.Pulse != null) {
            this.Pulse = new String(source.Pulse);
        }
        if (source.Breathe != null) {
            this.Breathe = new String(source.Breathe);
        }
        if (source.Weight != null) {
            this.Weight = new String(source.Weight);
        }
        if (source.BodyTemperature != null) {
            this.BodyTemperature = new String(source.BodyTemperature);
        }
        if (source.DiastolicPressure != null) {
            this.DiastolicPressure = new String(source.DiastolicPressure);
        }
        if (source.SystolicPressure != null) {
            this.SystolicPressure = new String(source.SystolicPressure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pulse", this.Pulse);
        this.setParamSimple(map, prefix + "Breathe", this.Breathe);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "BodyTemperature", this.BodyTemperature);
        this.setParamSimple(map, prefix + "DiastolicPressure", this.DiastolicPressure);
        this.setParamSimple(map, prefix + "SystolicPressure", this.SystolicPressure);

    }
}

