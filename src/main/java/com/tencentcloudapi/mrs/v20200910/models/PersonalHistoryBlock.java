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

public class PersonalHistoryBlock extends AbstractModel {

    /**
    * 出生地
    */
    @SerializedName("BirthPlace")
    @Expose
    private BirthPlaceBlock BirthPlace;

    /**
    * 居住地
    */
    @SerializedName("LivePlace")
    @Expose
    private BirthPlaceBlock LivePlace;

    /**
    * 职业
    */
    @SerializedName("Job")
    @Expose
    private BirthPlaceBlock Job;

    /**
    * 吸烟
    */
    @SerializedName("SmokeHistory")
    @Expose
    private SmokeHistoryBlock SmokeHistory;

    /**
    * 喝酒
    */
    @SerializedName("AlcoholicHistory")
    @Expose
    private SmokeHistoryBlock AlcoholicHistory;

    /**
    * 月经史
    */
    @SerializedName("MenstrualHistory")
    @Expose
    private MenstrualHistoryBlock MenstrualHistory;

    /**
    * 婚姻-生育史
    */
    @SerializedName("ObstericalHistory")
    @Expose
    private ObstetricalHistoryBlock ObstericalHistory;

    /**
    * 家族史
    */
    @SerializedName("FamilyHistory")
    @Expose
    private FamilyHistoryBlock FamilyHistory;

    /**
     * Get 出生地 
     * @return BirthPlace 出生地
     */
    public BirthPlaceBlock getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set 出生地
     * @param BirthPlace 出生地
     */
    public void setBirthPlace(BirthPlaceBlock BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * Get 居住地 
     * @return LivePlace 居住地
     */
    public BirthPlaceBlock getLivePlace() {
        return this.LivePlace;
    }

    /**
     * Set 居住地
     * @param LivePlace 居住地
     */
    public void setLivePlace(BirthPlaceBlock LivePlace) {
        this.LivePlace = LivePlace;
    }

    /**
     * Get 职业 
     * @return Job 职业
     */
    public BirthPlaceBlock getJob() {
        return this.Job;
    }

    /**
     * Set 职业
     * @param Job 职业
     */
    public void setJob(BirthPlaceBlock Job) {
        this.Job = Job;
    }

    /**
     * Get 吸烟 
     * @return SmokeHistory 吸烟
     */
    public SmokeHistoryBlock getSmokeHistory() {
        return this.SmokeHistory;
    }

    /**
     * Set 吸烟
     * @param SmokeHistory 吸烟
     */
    public void setSmokeHistory(SmokeHistoryBlock SmokeHistory) {
        this.SmokeHistory = SmokeHistory;
    }

    /**
     * Get 喝酒 
     * @return AlcoholicHistory 喝酒
     */
    public SmokeHistoryBlock getAlcoholicHistory() {
        return this.AlcoholicHistory;
    }

    /**
     * Set 喝酒
     * @param AlcoholicHistory 喝酒
     */
    public void setAlcoholicHistory(SmokeHistoryBlock AlcoholicHistory) {
        this.AlcoholicHistory = AlcoholicHistory;
    }

    /**
     * Get 月经史 
     * @return MenstrualHistory 月经史
     */
    public MenstrualHistoryBlock getMenstrualHistory() {
        return this.MenstrualHistory;
    }

    /**
     * Set 月经史
     * @param MenstrualHistory 月经史
     */
    public void setMenstrualHistory(MenstrualHistoryBlock MenstrualHistory) {
        this.MenstrualHistory = MenstrualHistory;
    }

    /**
     * Get 婚姻-生育史 
     * @return ObstericalHistory 婚姻-生育史
     */
    public ObstetricalHistoryBlock getObstericalHistory() {
        return this.ObstericalHistory;
    }

    /**
     * Set 婚姻-生育史
     * @param ObstericalHistory 婚姻-生育史
     */
    public void setObstericalHistory(ObstetricalHistoryBlock ObstericalHistory) {
        this.ObstericalHistory = ObstericalHistory;
    }

    /**
     * Get 家族史 
     * @return FamilyHistory 家族史
     */
    public FamilyHistoryBlock getFamilyHistory() {
        return this.FamilyHistory;
    }

    /**
     * Set 家族史
     * @param FamilyHistory 家族史
     */
    public void setFamilyHistory(FamilyHistoryBlock FamilyHistory) {
        this.FamilyHistory = FamilyHistory;
    }

    public PersonalHistoryBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonalHistoryBlock(PersonalHistoryBlock source) {
        if (source.BirthPlace != null) {
            this.BirthPlace = new BirthPlaceBlock(source.BirthPlace);
        }
        if (source.LivePlace != null) {
            this.LivePlace = new BirthPlaceBlock(source.LivePlace);
        }
        if (source.Job != null) {
            this.Job = new BirthPlaceBlock(source.Job);
        }
        if (source.SmokeHistory != null) {
            this.SmokeHistory = new SmokeHistoryBlock(source.SmokeHistory);
        }
        if (source.AlcoholicHistory != null) {
            this.AlcoholicHistory = new SmokeHistoryBlock(source.AlcoholicHistory);
        }
        if (source.MenstrualHistory != null) {
            this.MenstrualHistory = new MenstrualHistoryBlock(source.MenstrualHistory);
        }
        if (source.ObstericalHistory != null) {
            this.ObstericalHistory = new ObstetricalHistoryBlock(source.ObstericalHistory);
        }
        if (source.FamilyHistory != null) {
            this.FamilyHistory = new FamilyHistoryBlock(source.FamilyHistory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BirthPlace.", this.BirthPlace);
        this.setParamObj(map, prefix + "LivePlace.", this.LivePlace);
        this.setParamObj(map, prefix + "Job.", this.Job);
        this.setParamObj(map, prefix + "SmokeHistory.", this.SmokeHistory);
        this.setParamObj(map, prefix + "AlcoholicHistory.", this.AlcoholicHistory);
        this.setParamObj(map, prefix + "MenstrualHistory.", this.MenstrualHistory);
        this.setParamObj(map, prefix + "ObstericalHistory.", this.ObstericalHistory);
        this.setParamObj(map, prefix + "FamilyHistory.", this.FamilyHistory);

    }
}

