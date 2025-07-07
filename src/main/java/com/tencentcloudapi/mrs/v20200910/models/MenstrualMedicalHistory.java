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

public class MenstrualMedicalHistory extends AbstractModel {

    /**
    * 末次月经时间
    */
    @SerializedName("LastMenstrualPeriod")
    @Expose
    private String LastMenstrualPeriod;

    /**
    * 经量
    */
    @SerializedName("MenstrualFlow")
    @Expose
    private String MenstrualFlow;

    /**
    * 月经初潮年龄
    */
    @SerializedName("MenarcheAge")
    @Expose
    private String MenarcheAge;

    /**
    * 是否来月经
    */
    @SerializedName("MenstruationOrNot")
    @Expose
    private String MenstruationOrNot;

    /**
    * 月经周期
    */
    @SerializedName("MenstrualCycles")
    @Expose
    private String MenstrualCycles;

    /**
    * 月经持续天数
    */
    @SerializedName("MenstrualPeriod")
    @Expose
    private String MenstrualPeriod;

    /**
     * Get 末次月经时间 
     * @return LastMenstrualPeriod 末次月经时间
     */
    public String getLastMenstrualPeriod() {
        return this.LastMenstrualPeriod;
    }

    /**
     * Set 末次月经时间
     * @param LastMenstrualPeriod 末次月经时间
     */
    public void setLastMenstrualPeriod(String LastMenstrualPeriod) {
        this.LastMenstrualPeriod = LastMenstrualPeriod;
    }

    /**
     * Get 经量 
     * @return MenstrualFlow 经量
     */
    public String getMenstrualFlow() {
        return this.MenstrualFlow;
    }

    /**
     * Set 经量
     * @param MenstrualFlow 经量
     */
    public void setMenstrualFlow(String MenstrualFlow) {
        this.MenstrualFlow = MenstrualFlow;
    }

    /**
     * Get 月经初潮年龄 
     * @return MenarcheAge 月经初潮年龄
     */
    public String getMenarcheAge() {
        return this.MenarcheAge;
    }

    /**
     * Set 月经初潮年龄
     * @param MenarcheAge 月经初潮年龄
     */
    public void setMenarcheAge(String MenarcheAge) {
        this.MenarcheAge = MenarcheAge;
    }

    /**
     * Get 是否来月经 
     * @return MenstruationOrNot 是否来月经
     */
    public String getMenstruationOrNot() {
        return this.MenstruationOrNot;
    }

    /**
     * Set 是否来月经
     * @param MenstruationOrNot 是否来月经
     */
    public void setMenstruationOrNot(String MenstruationOrNot) {
        this.MenstruationOrNot = MenstruationOrNot;
    }

    /**
     * Get 月经周期 
     * @return MenstrualCycles 月经周期
     */
    public String getMenstrualCycles() {
        return this.MenstrualCycles;
    }

    /**
     * Set 月经周期
     * @param MenstrualCycles 月经周期
     */
    public void setMenstrualCycles(String MenstrualCycles) {
        this.MenstrualCycles = MenstrualCycles;
    }

    /**
     * Get 月经持续天数 
     * @return MenstrualPeriod 月经持续天数
     */
    public String getMenstrualPeriod() {
        return this.MenstrualPeriod;
    }

    /**
     * Set 月经持续天数
     * @param MenstrualPeriod 月经持续天数
     */
    public void setMenstrualPeriod(String MenstrualPeriod) {
        this.MenstrualPeriod = MenstrualPeriod;
    }

    public MenstrualMedicalHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MenstrualMedicalHistory(MenstrualMedicalHistory source) {
        if (source.LastMenstrualPeriod != null) {
            this.LastMenstrualPeriod = new String(source.LastMenstrualPeriod);
        }
        if (source.MenstrualFlow != null) {
            this.MenstrualFlow = new String(source.MenstrualFlow);
        }
        if (source.MenarcheAge != null) {
            this.MenarcheAge = new String(source.MenarcheAge);
        }
        if (source.MenstruationOrNot != null) {
            this.MenstruationOrNot = new String(source.MenstruationOrNot);
        }
        if (source.MenstrualCycles != null) {
            this.MenstrualCycles = new String(source.MenstrualCycles);
        }
        if (source.MenstrualPeriod != null) {
            this.MenstrualPeriod = new String(source.MenstrualPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LastMenstrualPeriod", this.LastMenstrualPeriod);
        this.setParamSimple(map, prefix + "MenstrualFlow", this.MenstrualFlow);
        this.setParamSimple(map, prefix + "MenarcheAge", this.MenarcheAge);
        this.setParamSimple(map, prefix + "MenstruationOrNot", this.MenstruationOrNot);
        this.setParamSimple(map, prefix + "MenstrualCycles", this.MenstrualCycles);
        this.setParamSimple(map, prefix + "MenstrualPeriod", this.MenstrualPeriod);

    }
}

