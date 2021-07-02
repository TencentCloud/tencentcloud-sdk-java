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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonalInfo extends AbstractModel{

    /**
    * 姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 性别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * 年龄
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * 身份证号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IDCard")
    @Expose
    private String IDCard;

    /**
    * 健康卡号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCardNum")
    @Expose
    private String HealthCardNum;

    /**
    * 社保号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SocialSecurityCardNum")
    @Expose
    private String SocialSecurityCardNum;

    /**
    * 出生日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 民族
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ethnicity")
    @Expose
    private String Ethnicity;

    /**
    * 国籍
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 婚姻状况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Married")
    @Expose
    private String Married;

    /**
    * 职业
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * 教育程度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EducationBackground")
    @Expose
    private String EducationBackground;

    /**
    * 籍贯
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * 医保卡类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MedicalInsuranceType")
    @Expose
    private String MedicalInsuranceType;

    /**
    * 联系电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkPhone")
    @Expose
    private String LinkPhone;

    /**
    * 联系地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkAddress")
    @Expose
    private String LinkAddress;

    /**
    * 家属姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KinsfolkName")
    @Expose
    private String KinsfolkName;

    /**
    * 家属关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KinsfolkRelation")
    @Expose
    private String KinsfolkRelation;

    /**
    * 家属联系电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KinsfolkPhone")
    @Expose
    private String KinsfolkPhone;

    /**
     * Get 姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 性别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gender 性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set 性别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gender 性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 年龄
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Age 年龄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set 年龄
注意：此字段可能返回 null，表示取不到有效值。
     * @param Age 年龄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get 身份证号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IDCard 身份证号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIDCard() {
        return this.IDCard;
    }

    /**
     * Set 身份证号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param IDCard 身份证号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    /**
     * Get 健康卡号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCardNum 健康卡号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHealthCardNum() {
        return this.HealthCardNum;
    }

    /**
     * Set 健康卡号
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCardNum 健康卡号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCardNum(String HealthCardNum) {
        this.HealthCardNum = HealthCardNum;
    }

    /**
     * Get 社保号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SocialSecurityCardNum 社保号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSocialSecurityCardNum() {
        return this.SocialSecurityCardNum;
    }

    /**
     * Set 社保号
注意：此字段可能返回 null，表示取不到有效值。
     * @param SocialSecurityCardNum 社保号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSocialSecurityCardNum(String SocialSecurityCardNum) {
        this.SocialSecurityCardNum = SocialSecurityCardNum;
    }

    /**
     * Get 出生日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Birthday 出生日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 出生日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Birthday 出生日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get 民族
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ethnicity 民族
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEthnicity() {
        return this.Ethnicity;
    }

    /**
     * Set 民族
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ethnicity 民族
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEthnicity(String Ethnicity) {
        this.Ethnicity = Ethnicity;
    }

    /**
     * Get 国籍
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nationality 国籍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set 国籍
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nationality 国籍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 婚姻状况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Married 婚姻状况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMarried() {
        return this.Married;
    }

    /**
     * Set 婚姻状况
注意：此字段可能返回 null，表示取不到有效值。
     * @param Married 婚姻状况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarried(String Married) {
        this.Married = Married;
    }

    /**
     * Get 职业
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Profession 职业
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProfession() {
        return this.Profession;
    }

    /**
     * Set 职业
注意：此字段可能返回 null，表示取不到有效值。
     * @param Profession 职业
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProfession(String Profession) {
        this.Profession = Profession;
    }

    /**
     * Get 教育程度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EducationBackground 教育程度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEducationBackground() {
        return this.EducationBackground;
    }

    /**
     * Set 教育程度
注意：此字段可能返回 null，表示取不到有效值。
     * @param EducationBackground 教育程度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEducationBackground(String EducationBackground) {
        this.EducationBackground = EducationBackground;
    }

    /**
     * Get 籍贯
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BirthPlace 籍贯
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set 籍贯
注意：此字段可能返回 null，表示取不到有效值。
     * @param BirthPlace 籍贯
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * Get 医保卡类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MedicalInsuranceType 医保卡类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMedicalInsuranceType() {
        return this.MedicalInsuranceType;
    }

    /**
     * Set 医保卡类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MedicalInsuranceType 医保卡类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMedicalInsuranceType(String MedicalInsuranceType) {
        this.MedicalInsuranceType = MedicalInsuranceType;
    }

    /**
     * Get 联系电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkPhone 联系电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkPhone() {
        return this.LinkPhone;
    }

    /**
     * Set 联系电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkPhone 联系电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkPhone(String LinkPhone) {
        this.LinkPhone = LinkPhone;
    }

    /**
     * Get 联系地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkAddress 联系地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkAddress() {
        return this.LinkAddress;
    }

    /**
     * Set 联系地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkAddress 联系地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkAddress(String LinkAddress) {
        this.LinkAddress = LinkAddress;
    }

    /**
     * Get 家属姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KinsfolkName 家属姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKinsfolkName() {
        return this.KinsfolkName;
    }

    /**
     * Set 家属姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param KinsfolkName 家属姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKinsfolkName(String KinsfolkName) {
        this.KinsfolkName = KinsfolkName;
    }

    /**
     * Get 家属关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KinsfolkRelation 家属关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKinsfolkRelation() {
        return this.KinsfolkRelation;
    }

    /**
     * Set 家属关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param KinsfolkRelation 家属关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKinsfolkRelation(String KinsfolkRelation) {
        this.KinsfolkRelation = KinsfolkRelation;
    }

    /**
     * Get 家属联系电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KinsfolkPhone 家属联系电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKinsfolkPhone() {
        return this.KinsfolkPhone;
    }

    /**
     * Set 家属联系电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param KinsfolkPhone 家属联系电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKinsfolkPhone(String KinsfolkPhone) {
        this.KinsfolkPhone = KinsfolkPhone;
    }

    public PersonalInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PersonalInfo(PersonalInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.IDCard != null) {
            this.IDCard = new String(source.IDCard);
        }
        if (source.HealthCardNum != null) {
            this.HealthCardNum = new String(source.HealthCardNum);
        }
        if (source.SocialSecurityCardNum != null) {
            this.SocialSecurityCardNum = new String(source.SocialSecurityCardNum);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Ethnicity != null) {
            this.Ethnicity = new String(source.Ethnicity);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
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
        if (source.BirthPlace != null) {
            this.BirthPlace = new String(source.BirthPlace);
        }
        if (source.MedicalInsuranceType != null) {
            this.MedicalInsuranceType = new String(source.MedicalInsuranceType);
        }
        if (source.LinkPhone != null) {
            this.LinkPhone = new String(source.LinkPhone);
        }
        if (source.LinkAddress != null) {
            this.LinkAddress = new String(source.LinkAddress);
        }
        if (source.KinsfolkName != null) {
            this.KinsfolkName = new String(source.KinsfolkName);
        }
        if (source.KinsfolkRelation != null) {
            this.KinsfolkRelation = new String(source.KinsfolkRelation);
        }
        if (source.KinsfolkPhone != null) {
            this.KinsfolkPhone = new String(source.KinsfolkPhone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "IDCard", this.IDCard);
        this.setParamSimple(map, prefix + "HealthCardNum", this.HealthCardNum);
        this.setParamSimple(map, prefix + "SocialSecurityCardNum", this.SocialSecurityCardNum);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Ethnicity", this.Ethnicity);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "Married", this.Married);
        this.setParamSimple(map, prefix + "Profession", this.Profession);
        this.setParamSimple(map, prefix + "EducationBackground", this.EducationBackground);
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "MedicalInsuranceType", this.MedicalInsuranceType);
        this.setParamSimple(map, prefix + "LinkPhone", this.LinkPhone);
        this.setParamSimple(map, prefix + "LinkAddress", this.LinkAddress);
        this.setParamSimple(map, prefix + "KinsfolkName", this.KinsfolkName);
        this.setParamSimple(map, prefix + "KinsfolkRelation", this.KinsfolkRelation);
        this.setParamSimple(map, prefix + "KinsfolkPhone", this.KinsfolkPhone);

    }
}

