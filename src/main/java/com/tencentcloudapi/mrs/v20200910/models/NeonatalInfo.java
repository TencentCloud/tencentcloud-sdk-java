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

public class NeonatalInfo extends AbstractModel {

    /**
    * 新生儿名字
    */
    @SerializedName("NeonatalName")
    @Expose
    private String NeonatalName;

    /**
    * 新生儿性别
    */
    @SerializedName("NeonatalGender")
    @Expose
    private String NeonatalGender;

    /**
    * 出生身长
    */
    @SerializedName("BirthLength")
    @Expose
    private String BirthLength;

    /**
    * 出生体重
    */
    @SerializedName("BirthWeight")
    @Expose
    private String BirthWeight;

    /**
    * 出生孕周
    */
    @SerializedName("GestationalAge")
    @Expose
    private String GestationalAge;

    /**
    * 出生时间
    */
    @SerializedName("BirthTime")
    @Expose
    private String BirthTime;

    /**
    * 出生地点
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * 医疗机构
    */
    @SerializedName("MedicalInstitutions")
    @Expose
    private String MedicalInstitutions;

    /**
     * Get 新生儿名字 
     * @return NeonatalName 新生儿名字
     */
    public String getNeonatalName() {
        return this.NeonatalName;
    }

    /**
     * Set 新生儿名字
     * @param NeonatalName 新生儿名字
     */
    public void setNeonatalName(String NeonatalName) {
        this.NeonatalName = NeonatalName;
    }

    /**
     * Get 新生儿性别 
     * @return NeonatalGender 新生儿性别
     */
    public String getNeonatalGender() {
        return this.NeonatalGender;
    }

    /**
     * Set 新生儿性别
     * @param NeonatalGender 新生儿性别
     */
    public void setNeonatalGender(String NeonatalGender) {
        this.NeonatalGender = NeonatalGender;
    }

    /**
     * Get 出生身长 
     * @return BirthLength 出生身长
     */
    public String getBirthLength() {
        return this.BirthLength;
    }

    /**
     * Set 出生身长
     * @param BirthLength 出生身长
     */
    public void setBirthLength(String BirthLength) {
        this.BirthLength = BirthLength;
    }

    /**
     * Get 出生体重 
     * @return BirthWeight 出生体重
     */
    public String getBirthWeight() {
        return this.BirthWeight;
    }

    /**
     * Set 出生体重
     * @param BirthWeight 出生体重
     */
    public void setBirthWeight(String BirthWeight) {
        this.BirthWeight = BirthWeight;
    }

    /**
     * Get 出生孕周 
     * @return GestationalAge 出生孕周
     */
    public String getGestationalAge() {
        return this.GestationalAge;
    }

    /**
     * Set 出生孕周
     * @param GestationalAge 出生孕周
     */
    public void setGestationalAge(String GestationalAge) {
        this.GestationalAge = GestationalAge;
    }

    /**
     * Get 出生时间 
     * @return BirthTime 出生时间
     */
    public String getBirthTime() {
        return this.BirthTime;
    }

    /**
     * Set 出生时间
     * @param BirthTime 出生时间
     */
    public void setBirthTime(String BirthTime) {
        this.BirthTime = BirthTime;
    }

    /**
     * Get 出生地点 
     * @return BirthPlace 出生地点
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set 出生地点
     * @param BirthPlace 出生地点
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * Get 医疗机构 
     * @return MedicalInstitutions 医疗机构
     */
    public String getMedicalInstitutions() {
        return this.MedicalInstitutions;
    }

    /**
     * Set 医疗机构
     * @param MedicalInstitutions 医疗机构
     */
    public void setMedicalInstitutions(String MedicalInstitutions) {
        this.MedicalInstitutions = MedicalInstitutions;
    }

    public NeonatalInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NeonatalInfo(NeonatalInfo source) {
        if (source.NeonatalName != null) {
            this.NeonatalName = new String(source.NeonatalName);
        }
        if (source.NeonatalGender != null) {
            this.NeonatalGender = new String(source.NeonatalGender);
        }
        if (source.BirthLength != null) {
            this.BirthLength = new String(source.BirthLength);
        }
        if (source.BirthWeight != null) {
            this.BirthWeight = new String(source.BirthWeight);
        }
        if (source.GestationalAge != null) {
            this.GestationalAge = new String(source.GestationalAge);
        }
        if (source.BirthTime != null) {
            this.BirthTime = new String(source.BirthTime);
        }
        if (source.BirthPlace != null) {
            this.BirthPlace = new String(source.BirthPlace);
        }
        if (source.MedicalInstitutions != null) {
            this.MedicalInstitutions = new String(source.MedicalInstitutions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NeonatalName", this.NeonatalName);
        this.setParamSimple(map, prefix + "NeonatalGender", this.NeonatalGender);
        this.setParamSimple(map, prefix + "BirthLength", this.BirthLength);
        this.setParamSimple(map, prefix + "BirthWeight", this.BirthWeight);
        this.setParamSimple(map, prefix + "GestationalAge", this.GestationalAge);
        this.setParamSimple(map, prefix + "BirthTime", this.BirthTime);
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "MedicalInstitutions", this.MedicalInstitutions);

    }
}

