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

public class PatientBaseInfo extends AbstractModel {

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 身高 单位cm
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 体重 单位kg
    */
    @SerializedName("Weight")
    @Expose
    private String Weight;

    /**
    * 患者ID
    */
    @SerializedName("PatientId")
    @Expose
    private String PatientId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 年龄
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * 出生地
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * 居住地
    */
    @SerializedName("LivePlace")
    @Expose
    private String LivePlace;

    /**
    * 出生日期和年龄必须传一个
    */
    @SerializedName("BirthDay")
    @Expose
    private String BirthDay;

    /**
     * Get 性别 
     * @return Sex 性别
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别
     * @param Sex 性别
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 身高 单位cm 
     * @return Height 身高 单位cm
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set 身高 单位cm
     * @param Height 身高 单位cm
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get 体重 单位kg 
     * @return Weight 体重 单位kg
     */
    public String getWeight() {
        return this.Weight;
    }

    /**
     * Set 体重 单位kg
     * @param Weight 体重 单位kg
     */
    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 患者ID 
     * @return PatientId 患者ID
     */
    public String getPatientId() {
        return this.PatientId;
    }

    /**
     * Set 患者ID
     * @param PatientId 患者ID
     */
    public void setPatientId(String PatientId) {
        this.PatientId = PatientId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 年龄 
     * @return Age 年龄
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set 年龄
     * @param Age 年龄
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get 出生地 
     * @return BirthPlace 出生地
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set 出生地
     * @param BirthPlace 出生地
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * Get 居住地 
     * @return LivePlace 居住地
     */
    public String getLivePlace() {
        return this.LivePlace;
    }

    /**
     * Set 居住地
     * @param LivePlace 居住地
     */
    public void setLivePlace(String LivePlace) {
        this.LivePlace = LivePlace;
    }

    /**
     * Get 出生日期和年龄必须传一个 
     * @return BirthDay 出生日期和年龄必须传一个
     */
    public String getBirthDay() {
        return this.BirthDay;
    }

    /**
     * Set 出生日期和年龄必须传一个
     * @param BirthDay 出生日期和年龄必须传一个
     */
    public void setBirthDay(String BirthDay) {
        this.BirthDay = BirthDay;
    }

    public PatientBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PatientBaseInfo(PatientBaseInfo source) {
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.Weight != null) {
            this.Weight = new String(source.Weight);
        }
        if (source.PatientId != null) {
            this.PatientId = new String(source.PatientId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.BirthPlace != null) {
            this.BirthPlace = new String(source.BirthPlace);
        }
        if (source.LivePlace != null) {
            this.LivePlace = new String(source.LivePlace);
        }
        if (source.BirthDay != null) {
            this.BirthDay = new String(source.BirthDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "PatientId", this.PatientId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "LivePlace", this.LivePlace);
        this.setParamSimple(map, prefix + "BirthDay", this.BirthDay);

    }
}

