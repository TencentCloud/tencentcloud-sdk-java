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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralExaminationVitalSignBloodPressure extends AbstractModel {

    /**
    * 血压
    */
    @SerializedName("Text")
    @Expose
    private BloodPressureItem Text;

    /**
    * 收缩压/舒张压
    */
    @SerializedName("SystolicDiastolicPressure")
    @Expose
    private BloodPressureItem [] SystolicDiastolicPressure;

    /**
    * 收缩压
    */
    @SerializedName("SystolicPressure")
    @Expose
    private BloodPressureItem [] SystolicPressure;

    /**
    * 舒张压
    */
    @SerializedName("DiastolicPressure")
    @Expose
    private BloodPressureItem [] DiastolicPressure;

    /**
     * Get 血压 
     * @return Text 血压
     */
    public BloodPressureItem getText() {
        return this.Text;
    }

    /**
     * Set 血压
     * @param Text 血压
     */
    public void setText(BloodPressureItem Text) {
        this.Text = Text;
    }

    /**
     * Get 收缩压/舒张压 
     * @return SystolicDiastolicPressure 收缩压/舒张压
     */
    public BloodPressureItem [] getSystolicDiastolicPressure() {
        return this.SystolicDiastolicPressure;
    }

    /**
     * Set 收缩压/舒张压
     * @param SystolicDiastolicPressure 收缩压/舒张压
     */
    public void setSystolicDiastolicPressure(BloodPressureItem [] SystolicDiastolicPressure) {
        this.SystolicDiastolicPressure = SystolicDiastolicPressure;
    }

    /**
     * Get 收缩压 
     * @return SystolicPressure 收缩压
     */
    public BloodPressureItem [] getSystolicPressure() {
        return this.SystolicPressure;
    }

    /**
     * Set 收缩压
     * @param SystolicPressure 收缩压
     */
    public void setSystolicPressure(BloodPressureItem [] SystolicPressure) {
        this.SystolicPressure = SystolicPressure;
    }

    /**
     * Get 舒张压 
     * @return DiastolicPressure 舒张压
     */
    public BloodPressureItem [] getDiastolicPressure() {
        return this.DiastolicPressure;
    }

    /**
     * Set 舒张压
     * @param DiastolicPressure 舒张压
     */
    public void setDiastolicPressure(BloodPressureItem [] DiastolicPressure) {
        this.DiastolicPressure = DiastolicPressure;
    }

    public GeneralExaminationVitalSignBloodPressure() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralExaminationVitalSignBloodPressure(GeneralExaminationVitalSignBloodPressure source) {
        if (source.Text != null) {
            this.Text = new BloodPressureItem(source.Text);
        }
        if (source.SystolicDiastolicPressure != null) {
            this.SystolicDiastolicPressure = new BloodPressureItem[source.SystolicDiastolicPressure.length];
            for (int i = 0; i < source.SystolicDiastolicPressure.length; i++) {
                this.SystolicDiastolicPressure[i] = new BloodPressureItem(source.SystolicDiastolicPressure[i]);
            }
        }
        if (source.SystolicPressure != null) {
            this.SystolicPressure = new BloodPressureItem[source.SystolicPressure.length];
            for (int i = 0; i < source.SystolicPressure.length; i++) {
                this.SystolicPressure[i] = new BloodPressureItem(source.SystolicPressure[i]);
            }
        }
        if (source.DiastolicPressure != null) {
            this.DiastolicPressure = new BloodPressureItem[source.DiastolicPressure.length];
            for (int i = 0; i < source.DiastolicPressure.length; i++) {
                this.DiastolicPressure[i] = new BloodPressureItem(source.DiastolicPressure[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamArrayObj(map, prefix + "SystolicDiastolicPressure.", this.SystolicDiastolicPressure);
        this.setParamArrayObj(map, prefix + "SystolicPressure.", this.SystolicPressure);
        this.setParamArrayObj(map, prefix + "DiastolicPressure.", this.DiastolicPressure);

    }
}

