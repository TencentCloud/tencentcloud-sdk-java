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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResidenceBookletOCRResponse extends AbstractModel{

    /**
    * 户号
    */
    @SerializedName("HouseholdNumber")
    @Expose
    private String HouseholdNumber;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 出生地
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * 民族
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * 籍贯
    */
    @SerializedName("NativePlace")
    @Expose
    private String NativePlace;

    /**
    * 出生日期
    */
    @SerializedName("BirthDate")
    @Expose
    private String BirthDate;

    /**
    * 公民身份证件编号
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 文化程度
    */
    @SerializedName("EducationDegree")
    @Expose
    private String EducationDegree;

    /**
    * 服务处所
    */
    @SerializedName("ServicePlace")
    @Expose
    private String ServicePlace;

    /**
    * 户别
    */
    @SerializedName("Household")
    @Expose
    private String Household;

    /**
    * 住址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 承办人签章文字
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * 签发日期
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * 户主页编号
    */
    @SerializedName("HomePageNumber")
    @Expose
    private String HomePageNumber;

    /**
    * 户主姓名
    */
    @SerializedName("HouseholderName")
    @Expose
    private String HouseholderName;

    /**
    * 户主或与户主关系
    */
    @SerializedName("Relationship")
    @Expose
    private String Relationship;

    /**
    * 本市（县）其他住址
    */
    @SerializedName("OtherAddresses")
    @Expose
    private String OtherAddresses;

    /**
    * 宗教信仰
    */
    @SerializedName("ReligiousBelief")
    @Expose
    private String ReligiousBelief;

    /**
    * 身高
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 血型
    */
    @SerializedName("BloodType")
    @Expose
    private String BloodType;

    /**
    * 婚姻状况
    */
    @SerializedName("MaritalStatus")
    @Expose
    private String MaritalStatus;

    /**
    * 兵役状况
    */
    @SerializedName("VeteranStatus")
    @Expose
    private String VeteranStatus;

    /**
    * 职业
    */
    @SerializedName("Profession")
    @Expose
    private String Profession;

    /**
    * 何时由何地迁来本市(县)
    */
    @SerializedName("MoveToCityInformation")
    @Expose
    private String MoveToCityInformation;

    /**
    * 何时由何地迁来本址
    */
    @SerializedName("MoveToSiteInformation")
    @Expose
    private String MoveToSiteInformation;

    /**
    * 登记日期
    */
    @SerializedName("RegistrationDate")
    @Expose
    private String RegistrationDate;

    /**
    * 曾用名
    */
    @SerializedName("FormerName")
    @Expose
    private String FormerName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 户号 
     * @return HouseholdNumber 户号
     */
    public String getHouseholdNumber() {
        return this.HouseholdNumber;
    }

    /**
     * Set 户号
     * @param HouseholdNumber 户号
     */
    public void setHouseholdNumber(String HouseholdNumber) {
        this.HouseholdNumber = HouseholdNumber;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

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
     * Get 民族 
     * @return Nation 民族
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set 民族
     * @param Nation 民族
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get 籍贯 
     * @return NativePlace 籍贯
     */
    public String getNativePlace() {
        return this.NativePlace;
    }

    /**
     * Set 籍贯
     * @param NativePlace 籍贯
     */
    public void setNativePlace(String NativePlace) {
        this.NativePlace = NativePlace;
    }

    /**
     * Get 出生日期 
     * @return BirthDate 出生日期
     */
    public String getBirthDate() {
        return this.BirthDate;
    }

    /**
     * Set 出生日期
     * @param BirthDate 出生日期
     */
    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    /**
     * Get 公民身份证件编号 
     * @return IdCardNumber 公民身份证件编号
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 公民身份证件编号
     * @param IdCardNumber 公民身份证件编号
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 文化程度 
     * @return EducationDegree 文化程度
     */
    public String getEducationDegree() {
        return this.EducationDegree;
    }

    /**
     * Set 文化程度
     * @param EducationDegree 文化程度
     */
    public void setEducationDegree(String EducationDegree) {
        this.EducationDegree = EducationDegree;
    }

    /**
     * Get 服务处所 
     * @return ServicePlace 服务处所
     */
    public String getServicePlace() {
        return this.ServicePlace;
    }

    /**
     * Set 服务处所
     * @param ServicePlace 服务处所
     */
    public void setServicePlace(String ServicePlace) {
        this.ServicePlace = ServicePlace;
    }

    /**
     * Get 户别 
     * @return Household 户别
     */
    public String getHousehold() {
        return this.Household;
    }

    /**
     * Set 户别
     * @param Household 户别
     */
    public void setHousehold(String Household) {
        this.Household = Household;
    }

    /**
     * Get 住址 
     * @return Address 住址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 住址
     * @param Address 住址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 承办人签章文字 
     * @return Signature 承办人签章文字
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set 承办人签章文字
     * @param Signature 承办人签章文字
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get 签发日期 
     * @return IssueDate 签发日期
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set 签发日期
     * @param IssueDate 签发日期
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get 户主页编号 
     * @return HomePageNumber 户主页编号
     */
    public String getHomePageNumber() {
        return this.HomePageNumber;
    }

    /**
     * Set 户主页编号
     * @param HomePageNumber 户主页编号
     */
    public void setHomePageNumber(String HomePageNumber) {
        this.HomePageNumber = HomePageNumber;
    }

    /**
     * Get 户主姓名 
     * @return HouseholderName 户主姓名
     */
    public String getHouseholderName() {
        return this.HouseholderName;
    }

    /**
     * Set 户主姓名
     * @param HouseholderName 户主姓名
     */
    public void setHouseholderName(String HouseholderName) {
        this.HouseholderName = HouseholderName;
    }

    /**
     * Get 户主或与户主关系 
     * @return Relationship 户主或与户主关系
     */
    public String getRelationship() {
        return this.Relationship;
    }

    /**
     * Set 户主或与户主关系
     * @param Relationship 户主或与户主关系
     */
    public void setRelationship(String Relationship) {
        this.Relationship = Relationship;
    }

    /**
     * Get 本市（县）其他住址 
     * @return OtherAddresses 本市（县）其他住址
     */
    public String getOtherAddresses() {
        return this.OtherAddresses;
    }

    /**
     * Set 本市（县）其他住址
     * @param OtherAddresses 本市（县）其他住址
     */
    public void setOtherAddresses(String OtherAddresses) {
        this.OtherAddresses = OtherAddresses;
    }

    /**
     * Get 宗教信仰 
     * @return ReligiousBelief 宗教信仰
     */
    public String getReligiousBelief() {
        return this.ReligiousBelief;
    }

    /**
     * Set 宗教信仰
     * @param ReligiousBelief 宗教信仰
     */
    public void setReligiousBelief(String ReligiousBelief) {
        this.ReligiousBelief = ReligiousBelief;
    }

    /**
     * Get 身高 
     * @return Height 身高
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set 身高
     * @param Height 身高
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get 血型 
     * @return BloodType 血型
     */
    public String getBloodType() {
        return this.BloodType;
    }

    /**
     * Set 血型
     * @param BloodType 血型
     */
    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    /**
     * Get 婚姻状况 
     * @return MaritalStatus 婚姻状况
     */
    public String getMaritalStatus() {
        return this.MaritalStatus;
    }

    /**
     * Set 婚姻状况
     * @param MaritalStatus 婚姻状况
     */
    public void setMaritalStatus(String MaritalStatus) {
        this.MaritalStatus = MaritalStatus;
    }

    /**
     * Get 兵役状况 
     * @return VeteranStatus 兵役状况
     */
    public String getVeteranStatus() {
        return this.VeteranStatus;
    }

    /**
     * Set 兵役状况
     * @param VeteranStatus 兵役状况
     */
    public void setVeteranStatus(String VeteranStatus) {
        this.VeteranStatus = VeteranStatus;
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
     * Get 何时由何地迁来本市(县) 
     * @return MoveToCityInformation 何时由何地迁来本市(县)
     */
    public String getMoveToCityInformation() {
        return this.MoveToCityInformation;
    }

    /**
     * Set 何时由何地迁来本市(县)
     * @param MoveToCityInformation 何时由何地迁来本市(县)
     */
    public void setMoveToCityInformation(String MoveToCityInformation) {
        this.MoveToCityInformation = MoveToCityInformation;
    }

    /**
     * Get 何时由何地迁来本址 
     * @return MoveToSiteInformation 何时由何地迁来本址
     */
    public String getMoveToSiteInformation() {
        return this.MoveToSiteInformation;
    }

    /**
     * Set 何时由何地迁来本址
     * @param MoveToSiteInformation 何时由何地迁来本址
     */
    public void setMoveToSiteInformation(String MoveToSiteInformation) {
        this.MoveToSiteInformation = MoveToSiteInformation;
    }

    /**
     * Get 登记日期 
     * @return RegistrationDate 登记日期
     */
    public String getRegistrationDate() {
        return this.RegistrationDate;
    }

    /**
     * Set 登记日期
     * @param RegistrationDate 登记日期
     */
    public void setRegistrationDate(String RegistrationDate) {
        this.RegistrationDate = RegistrationDate;
    }

    /**
     * Get 曾用名 
     * @return FormerName 曾用名
     */
    public String getFormerName() {
        return this.FormerName;
    }

    /**
     * Set 曾用名
     * @param FormerName 曾用名
     */
    public void setFormerName(String FormerName) {
        this.FormerName = FormerName;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ResidenceBookletOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResidenceBookletOCRResponse(ResidenceBookletOCRResponse source) {
        if (source.HouseholdNumber != null) {
            this.HouseholdNumber = new String(source.HouseholdNumber);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.BirthPlace != null) {
            this.BirthPlace = new String(source.BirthPlace);
        }
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.NativePlace != null) {
            this.NativePlace = new String(source.NativePlace);
        }
        if (source.BirthDate != null) {
            this.BirthDate = new String(source.BirthDate);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.EducationDegree != null) {
            this.EducationDegree = new String(source.EducationDegree);
        }
        if (source.ServicePlace != null) {
            this.ServicePlace = new String(source.ServicePlace);
        }
        if (source.Household != null) {
            this.Household = new String(source.Household);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Signature != null) {
            this.Signature = new String(source.Signature);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new String(source.IssueDate);
        }
        if (source.HomePageNumber != null) {
            this.HomePageNumber = new String(source.HomePageNumber);
        }
        if (source.HouseholderName != null) {
            this.HouseholderName = new String(source.HouseholderName);
        }
        if (source.Relationship != null) {
            this.Relationship = new String(source.Relationship);
        }
        if (source.OtherAddresses != null) {
            this.OtherAddresses = new String(source.OtherAddresses);
        }
        if (source.ReligiousBelief != null) {
            this.ReligiousBelief = new String(source.ReligiousBelief);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.BloodType != null) {
            this.BloodType = new String(source.BloodType);
        }
        if (source.MaritalStatus != null) {
            this.MaritalStatus = new String(source.MaritalStatus);
        }
        if (source.VeteranStatus != null) {
            this.VeteranStatus = new String(source.VeteranStatus);
        }
        if (source.Profession != null) {
            this.Profession = new String(source.Profession);
        }
        if (source.MoveToCityInformation != null) {
            this.MoveToCityInformation = new String(source.MoveToCityInformation);
        }
        if (source.MoveToSiteInformation != null) {
            this.MoveToSiteInformation = new String(source.MoveToSiteInformation);
        }
        if (source.RegistrationDate != null) {
            this.RegistrationDate = new String(source.RegistrationDate);
        }
        if (source.FormerName != null) {
            this.FormerName = new String(source.FormerName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HouseholdNumber", this.HouseholdNumber);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "NativePlace", this.NativePlace);
        this.setParamSimple(map, prefix + "BirthDate", this.BirthDate);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "EducationDegree", this.EducationDegree);
        this.setParamSimple(map, prefix + "ServicePlace", this.ServicePlace);
        this.setParamSimple(map, prefix + "Household", this.Household);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Signature", this.Signature);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "HomePageNumber", this.HomePageNumber);
        this.setParamSimple(map, prefix + "HouseholderName", this.HouseholderName);
        this.setParamSimple(map, prefix + "Relationship", this.Relationship);
        this.setParamSimple(map, prefix + "OtherAddresses", this.OtherAddresses);
        this.setParamSimple(map, prefix + "ReligiousBelief", this.ReligiousBelief);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "BloodType", this.BloodType);
        this.setParamSimple(map, prefix + "MaritalStatus", this.MaritalStatus);
        this.setParamSimple(map, prefix + "VeteranStatus", this.VeteranStatus);
        this.setParamSimple(map, prefix + "Profession", this.Profession);
        this.setParamSimple(map, prefix + "MoveToCityInformation", this.MoveToCityInformation);
        this.setParamSimple(map, prefix + "MoveToSiteInformation", this.MoveToSiteInformation);
        this.setParamSimple(map, prefix + "RegistrationDate", this.RegistrationDate);
        this.setParamSimple(map, prefix + "FormerName", this.FormerName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

