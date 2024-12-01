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

public class PatientInfo extends AbstractModel {

    /**
    * 患者姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 患者性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 患者年龄
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * 患者手机号码
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 患者地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 患者身份证
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 健康卡号
    */
    @SerializedName("HealthCardNo")
    @Expose
    private String HealthCardNo;

    /**
    * 社保卡号
    */
    @SerializedName("SocialSecurityCardNo")
    @Expose
    private String SocialSecurityCardNo;

    /**
    * 出生日期
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 民族
    */
    @SerializedName("Ethnicity")
    @Expose
    private String Ethnicity;

    /**
    * 婚姻状况
    */
    @SerializedName("Married")
    @Expose
    private String Married;

    /**
    * 职业
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * 教育程度
    */
    @SerializedName("EducationBackground")
    @Expose
    private String EducationBackground;

    /**
    * 国籍
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 籍贯
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * 医保类型
    */
    @SerializedName("MedicalInsuranceType")
    @Expose
    private String MedicalInsuranceType;

    /**
    * 标准化年龄
    */
    @SerializedName("AgeNorm")
    @Expose
    private String AgeNorm;

    /**
    * 民族。该字段已不再使用，请从Ethnicity取值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * 婚姻代码
    */
    @SerializedName("MarriedCode")
    @Expose
    private String MarriedCode;

    /**
    * 职业代码
    */
    @SerializedName("ProfessionCode")
    @Expose
    private String ProfessionCode;

    /**
    * 居民医保代码
    */
    @SerializedName("MedicalInsuranceTypeCode")
    @Expose
    private String MedicalInsuranceTypeCode;

    /**
    * 床号
    */
    @SerializedName("BedNo")
    @Expose
    private String BedNo;

    /**
     * Get 患者姓名 
     * @return Name 患者姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 患者姓名
     * @param Name 患者姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 患者性别 
     * @return Sex 患者性别
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 患者性别
     * @param Sex 患者性别
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 患者年龄 
     * @return Age 患者年龄
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set 患者年龄
     * @param Age 患者年龄
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get 患者手机号码 
     * @return Phone 患者手机号码
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 患者手机号码
     * @param Phone 患者手机号码
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 患者地址 
     * @return Address 患者地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 患者地址
     * @param Address 患者地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 患者身份证 
     * @return IdCard 患者身份证
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 患者身份证
     * @param IdCard 患者身份证
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 健康卡号 
     * @return HealthCardNo 健康卡号
     */
    public String getHealthCardNo() {
        return this.HealthCardNo;
    }

    /**
     * Set 健康卡号
     * @param HealthCardNo 健康卡号
     */
    public void setHealthCardNo(String HealthCardNo) {
        this.HealthCardNo = HealthCardNo;
    }

    /**
     * Get 社保卡号 
     * @return SocialSecurityCardNo 社保卡号
     */
    public String getSocialSecurityCardNo() {
        return this.SocialSecurityCardNo;
    }

    /**
     * Set 社保卡号
     * @param SocialSecurityCardNo 社保卡号
     */
    public void setSocialSecurityCardNo(String SocialSecurityCardNo) {
        this.SocialSecurityCardNo = SocialSecurityCardNo;
    }

    /**
     * Get 出生日期 
     * @return Birthday 出生日期
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 出生日期
     * @param Birthday 出生日期
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get 民族 
     * @return Ethnicity 民族
     */
    public String getEthnicity() {
        return this.Ethnicity;
    }

    /**
     * Set 民族
     * @param Ethnicity 民族
     */
    public void setEthnicity(String Ethnicity) {
        this.Ethnicity = Ethnicity;
    }

    /**
     * Get 婚姻状况 
     * @return Married 婚姻状况
     */
    public String getMarried() {
        return this.Married;
    }

    /**
     * Set 婚姻状况
     * @param Married 婚姻状况
     */
    public void setMarried(String Married) {
        this.Married = Married;
    }

    /**
     * Get 职业 
     * @return Profession 职业
     */
    public String getProfession() {
        return this.Profession;
    }

    /**
     * Set 职业
     * @param Profession 职业
     */
    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    /**
     * Get 教育程度 
     * @return EducationBackground 教育程度
     */
    public String getEducationBackground() {
        return this.EducationBackground;
    }

    /**
     * Set 教育程度
     * @param EducationBackground 教育程度
     */
    public void setEducationBackground(String EducationBackground) {
        this.EducationBackground = EducationBackground;
    }

    /**
     * Get 国籍 
     * @return Nationality 国籍
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set 国籍
     * @param Nationality 国籍
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 籍贯 
     * @return BirthPlace 籍贯
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set 籍贯
     * @param BirthPlace 籍贯
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * Get 医保类型 
     * @return MedicalInsuranceType 医保类型
     */
    public String getMedicalInsuranceType() {
        return this.MedicalInsuranceType;
    }

    /**
     * Set 医保类型
     * @param MedicalInsuranceType 医保类型
     */
    public void setMedicalInsuranceType(String MedicalInsuranceType) {
        this.MedicalInsuranceType = MedicalInsuranceType;
    }

    /**
     * Get 标准化年龄 
     * @return AgeNorm 标准化年龄
     */
    public String getAgeNorm() {
        return this.AgeNorm;
    }

    /**
     * Set 标准化年龄
     * @param AgeNorm 标准化年龄
     */
    public void setAgeNorm(String AgeNorm) {
        this.AgeNorm = AgeNorm;
    }

    /**
     * Get 民族。该字段已不再使用，请从Ethnicity取值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nation 民族。该字段已不再使用，请从Ethnicity取值
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set 民族。该字段已不再使用，请从Ethnicity取值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nation 民族。该字段已不再使用，请从Ethnicity取值
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get 婚姻代码 
     * @return MarriedCode 婚姻代码
     */
    public String getMarriedCode() {
        return this.MarriedCode;
    }

    /**
     * Set 婚姻代码
     * @param MarriedCode 婚姻代码
     */
    public void setMarriedCode(String MarriedCode) {
        this.MarriedCode = MarriedCode;
    }

    /**
     * Get 职业代码 
     * @return ProfessionCode 职业代码
     */
    public String getProfessionCode() {
        return this.ProfessionCode;
    }

    /**
     * Set 职业代码
     * @param ProfessionCode 职业代码
     */
    public void setProfessionCode(String ProfessionCode) {
        this.ProfessionCode = ProfessionCode;
    }

    /**
     * Get 居民医保代码 
     * @return MedicalInsuranceTypeCode 居民医保代码
     */
    public String getMedicalInsuranceTypeCode() {
        return this.MedicalInsuranceTypeCode;
    }

    /**
     * Set 居民医保代码
     * @param MedicalInsuranceTypeCode 居民医保代码
     */
    public void setMedicalInsuranceTypeCode(String MedicalInsuranceTypeCode) {
        this.MedicalInsuranceTypeCode = MedicalInsuranceTypeCode;
    }

    /**
     * Get 床号 
     * @return BedNo 床号
     */
    public String getBedNo() {
        return this.BedNo;
    }

    /**
     * Set 床号
     * @param BedNo 床号
     */
    public void setBedNo(String BedNo) {
        this.BedNo = BedNo;
    }

    public PatientInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PatientInfo(PatientInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.HealthCardNo != null) {
            this.HealthCardNo = new String(source.HealthCardNo);
        }
        if (source.SocialSecurityCardNo != null) {
            this.SocialSecurityCardNo = new String(source.SocialSecurityCardNo);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Ethnicity != null) {
            this.Ethnicity = new String(source.Ethnicity);
        }
        if (source.Married != null) {
            this.Married = new String(source.Married);
        }
        if (source.Profession != null) {
            this.Profession = new String(source.Profession);
        }
        if (source.EducationBackground != null) {
            this.EducationBackground = new String(source.EducationBackground);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.BirthPlace != null) {
            this.BirthPlace = new String(source.BirthPlace);
        }
        if (source.MedicalInsuranceType != null) {
            this.MedicalInsuranceType = new String(source.MedicalInsuranceType);
        }
        if (source.AgeNorm != null) {
            this.AgeNorm = new String(source.AgeNorm);
        }
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.MarriedCode != null) {
            this.MarriedCode = new String(source.MarriedCode);
        }
        if (source.ProfessionCode != null) {
            this.ProfessionCode = new String(source.ProfessionCode);
        }
        if (source.MedicalInsuranceTypeCode != null) {
            this.MedicalInsuranceTypeCode = new String(source.MedicalInsuranceTypeCode);
        }
        if (source.BedNo != null) {
            this.BedNo = new String(source.BedNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "HealthCardNo", this.HealthCardNo);
        this.setParamSimple(map, prefix + "SocialSecurityCardNo", this.SocialSecurityCardNo);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Ethnicity", this.Ethnicity);
        this.setParamSimple(map, prefix + "Married", this.Married);
        this.setParamSimple(map, prefix + "Profession", this.Profession);
        this.setParamSimple(map, prefix + "EducationBackground", this.EducationBackground);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "MedicalInsuranceType", this.MedicalInsuranceType);
        this.setParamSimple(map, prefix + "AgeNorm", this.AgeNorm);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "MarriedCode", this.MarriedCode);
        this.setParamSimple(map, prefix + "ProfessionCode", this.ProfessionCode);
        this.setParamSimple(map, prefix + "MedicalInsuranceTypeCode", this.MedicalInsuranceTypeCode);
        this.setParamSimple(map, prefix + "BedNo", this.BedNo);

    }
}

