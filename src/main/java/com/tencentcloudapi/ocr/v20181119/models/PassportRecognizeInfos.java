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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PassportRecognizeInfos extends AbstractModel {

    /**
    * <p>证件类型（护照信息页识别结果）</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>发行国家（护照信息页识别结果）</p>
    */
    @SerializedName("IssuingCountry")
    @Expose
    private String IssuingCountry;

    /**
    * <p>护照号码（护照信息页识别结果）</p>
    */
    @SerializedName("PassportID")
    @Expose
    private String PassportID;

    /**
    * <p>姓（护照信息页识别结果）</p>
    */
    @SerializedName("Surname")
    @Expose
    private String Surname;

    /**
    * <p>名（护照信息页识别结果）</p>
    */
    @SerializedName("GivenName")
    @Expose
    private String GivenName;

    /**
    * <p>姓名（护照信息页识别结果）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>国籍信息（护照信息页识别结果）</p>
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * <p>出生日期（护照信息页识别结果）</p>
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * <p>性别（护照信息页识别结果）</p>
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>发行日期（护照信息页识别结果）</p>
    */
    @SerializedName("DateOfIssuance")
    @Expose
    private String DateOfIssuance;

    /**
    * <p>截止日期（护照信息页识别结果）</p>
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * <p>持证人签名（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * <p>签发地点（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
    */
    @SerializedName("IssuePlace")
    @Expose
    private String IssuePlace;

    /**
    * <p>签发机关（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
    */
    @SerializedName("IssuingAuthority")
    @Expose
    private String IssuingAuthority;

    /**
    * <p>出生地（护照信息页识别结果）</p>
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
     * Get <p>证件类型（护照信息页识别结果）</p> 
     * @return Type <p>证件类型（护照信息页识别结果）</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>证件类型（护照信息页识别结果）</p>
     * @param Type <p>证件类型（护照信息页识别结果）</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>发行国家（护照信息页识别结果）</p> 
     * @return IssuingCountry <p>发行国家（护照信息页识别结果）</p>
     */
    public String getIssuingCountry() {
        return this.IssuingCountry;
    }

    /**
     * Set <p>发行国家（护照信息页识别结果）</p>
     * @param IssuingCountry <p>发行国家（护照信息页识别结果）</p>
     */
    public void setIssuingCountry(String IssuingCountry) {
        this.IssuingCountry = IssuingCountry;
    }

    /**
     * Get <p>护照号码（护照信息页识别结果）</p> 
     * @return PassportID <p>护照号码（护照信息页识别结果）</p>
     */
    public String getPassportID() {
        return this.PassportID;
    }

    /**
     * Set <p>护照号码（护照信息页识别结果）</p>
     * @param PassportID <p>护照号码（护照信息页识别结果）</p>
     */
    public void setPassportID(String PassportID) {
        this.PassportID = PassportID;
    }

    /**
     * Get <p>姓（护照信息页识别结果）</p> 
     * @return Surname <p>姓（护照信息页识别结果）</p>
     */
    public String getSurname() {
        return this.Surname;
    }

    /**
     * Set <p>姓（护照信息页识别结果）</p>
     * @param Surname <p>姓（护照信息页识别结果）</p>
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Get <p>名（护照信息页识别结果）</p> 
     * @return GivenName <p>名（护照信息页识别结果）</p>
     */
    public String getGivenName() {
        return this.GivenName;
    }

    /**
     * Set <p>名（护照信息页识别结果）</p>
     * @param GivenName <p>名（护照信息页识别结果）</p>
     */
    public void setGivenName(String GivenName) {
        this.GivenName = GivenName;
    }

    /**
     * Get <p>姓名（护照信息页识别结果）</p> 
     * @return Name <p>姓名（护照信息页识别结果）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>姓名（护照信息页识别结果）</p>
     * @param Name <p>姓名（护照信息页识别结果）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>国籍信息（护照信息页识别结果）</p> 
     * @return Nationality <p>国籍信息（护照信息页识别结果）</p>
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set <p>国籍信息（护照信息页识别结果）</p>
     * @param Nationality <p>国籍信息（护照信息页识别结果）</p>
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get <p>出生日期（护照信息页识别结果）</p> 
     * @return DateOfBirth <p>出生日期（护照信息页识别结果）</p>
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set <p>出生日期（护照信息页识别结果）</p>
     * @param DateOfBirth <p>出生日期（护照信息页识别结果）</p>
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get <p>性别（护照信息页识别结果）</p> 
     * @return Sex <p>性别（护照信息页识别结果）</p>
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>性别（护照信息页识别结果）</p>
     * @param Sex <p>性别（护照信息页识别结果）</p>
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>发行日期（护照信息页识别结果）</p> 
     * @return DateOfIssuance <p>发行日期（护照信息页识别结果）</p>
     */
    public String getDateOfIssuance() {
        return this.DateOfIssuance;
    }

    /**
     * Set <p>发行日期（护照信息页识别结果）</p>
     * @param DateOfIssuance <p>发行日期（护照信息页识别结果）</p>
     */
    public void setDateOfIssuance(String DateOfIssuance) {
        this.DateOfIssuance = DateOfIssuance;
    }

    /**
     * Get <p>截止日期（护照信息页识别结果）</p> 
     * @return DateOfExpiration <p>截止日期（护照信息页识别结果）</p>
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set <p>截止日期（护照信息页识别结果）</p>
     * @param DateOfExpiration <p>截止日期（护照信息页识别结果）</p>
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get <p>持证人签名（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p> 
     * @return Signature <p>持证人签名（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set <p>持证人签名（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
     * @param Signature <p>持证人签名（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get <p>签发地点（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p> 
     * @return IssuePlace <p>签发地点（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
     */
    public String getIssuePlace() {
        return this.IssuePlace;
    }

    /**
     * Set <p>签发地点（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
     * @param IssuePlace <p>签发地点（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
     */
    public void setIssuePlace(String IssuePlace) {
        this.IssuePlace = IssuePlace;
    }

    /**
     * Get <p>签发机关（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p> 
     * @return IssuingAuthority <p>签发机关（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
     */
    public String getIssuingAuthority() {
        return this.IssuingAuthority;
    }

    /**
     * Set <p>签发机关（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
     * @param IssuingAuthority <p>签发机关（护照信息页识别结果）</p><p>仅中国大陆护照支持返回此字段，港澳台及境外护照不支持</p>
     */
    public void setIssuingAuthority(String IssuingAuthority) {
        this.IssuingAuthority = IssuingAuthority;
    }

    /**
     * Get <p>出生地（护照信息页识别结果）</p> 
     * @return BirthPlace <p>出生地（护照信息页识别结果）</p>
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set <p>出生地（护照信息页识别结果）</p>
     * @param BirthPlace <p>出生地（护照信息页识别结果）</p>
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    public PassportRecognizeInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PassportRecognizeInfos(PassportRecognizeInfos source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IssuingCountry != null) {
            this.IssuingCountry = new String(source.IssuingCountry);
        }
        if (source.PassportID != null) {
            this.PassportID = new String(source.PassportID);
        }
        if (source.Surname != null) {
            this.Surname = new String(source.Surname);
        }
        if (source.GivenName != null) {
            this.GivenName = new String(source.GivenName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.DateOfBirth != null) {
            this.DateOfBirth = new String(source.DateOfBirth);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.DateOfIssuance != null) {
            this.DateOfIssuance = new String(source.DateOfIssuance);
        }
        if (source.DateOfExpiration != null) {
            this.DateOfExpiration = new String(source.DateOfExpiration);
        }
        if (source.Signature != null) {
            this.Signature = new String(source.Signature);
        }
        if (source.IssuePlace != null) {
            this.IssuePlace = new String(source.IssuePlace);
        }
        if (source.IssuingAuthority != null) {
            this.IssuingAuthority = new String(source.IssuingAuthority);
        }
        if (source.BirthPlace != null) {
            this.BirthPlace = new String(source.BirthPlace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IssuingCountry", this.IssuingCountry);
        this.setParamSimple(map, prefix + "PassportID", this.PassportID);
        this.setParamSimple(map, prefix + "Surname", this.Surname);
        this.setParamSimple(map, prefix + "GivenName", this.GivenName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "DateOfBirth", this.DateOfBirth);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "DateOfIssuance", this.DateOfIssuance);
        this.setParamSimple(map, prefix + "DateOfExpiration", this.DateOfExpiration);
        this.setParamSimple(map, prefix + "Signature", this.Signature);
        this.setParamSimple(map, prefix + "IssuePlace", this.IssuePlace);
        this.setParamSimple(map, prefix + "IssuingAuthority", this.IssuingAuthority);
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);

    }
}

