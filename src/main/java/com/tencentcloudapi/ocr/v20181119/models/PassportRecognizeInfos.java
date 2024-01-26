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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PassportRecognizeInfos extends AbstractModel {

    /**
    * 证件类型（护照信息页识别结果）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 发行国家（护照信息页识别结果）
    */
    @SerializedName("IssuingCountry")
    @Expose
    private String IssuingCountry;

    /**
    * 护照号码（护照信息页识别结果）
    */
    @SerializedName("PassportID")
    @Expose
    private String PassportID;

    /**
    * 姓（护照信息页识别结果）
    */
    @SerializedName("Surname")
    @Expose
    private String Surname;

    /**
    * 名（护照信息页识别结果）
    */
    @SerializedName("GivenName")
    @Expose
    private String GivenName;

    /**
    * 姓名（护照信息页识别结果）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 国籍信息（护照信息页识别结果）
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 出生日期（护照信息页识别结果）
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * 性别（护照信息页识别结果）
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 发行日期（护照信息页识别结果）
    */
    @SerializedName("DateOfIssuance")
    @Expose
    private String DateOfIssuance;

    /**
    * 截止日期（护照信息页识别结果）
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * 持证人签名（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * 签发地点（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
    */
    @SerializedName("IssuePlace")
    @Expose
    private String IssuePlace;

    /**
    * 签发机关（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
    */
    @SerializedName("IssuingAuthority")
    @Expose
    private String IssuingAuthority;

    /**
     * Get 证件类型（护照信息页识别结果） 
     * @return Type 证件类型（护照信息页识别结果）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 证件类型（护照信息页识别结果）
     * @param Type 证件类型（护照信息页识别结果）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 发行国家（护照信息页识别结果） 
     * @return IssuingCountry 发行国家（护照信息页识别结果）
     */
    public String getIssuingCountry() {
        return this.IssuingCountry;
    }

    /**
     * Set 发行国家（护照信息页识别结果）
     * @param IssuingCountry 发行国家（护照信息页识别结果）
     */
    public void setIssuingCountry(String IssuingCountry) {
        this.IssuingCountry = IssuingCountry;
    }

    /**
     * Get 护照号码（护照信息页识别结果） 
     * @return PassportID 护照号码（护照信息页识别结果）
     */
    public String getPassportID() {
        return this.PassportID;
    }

    /**
     * Set 护照号码（护照信息页识别结果）
     * @param PassportID 护照号码（护照信息页识别结果）
     */
    public void setPassportID(String PassportID) {
        this.PassportID = PassportID;
    }

    /**
     * Get 姓（护照信息页识别结果） 
     * @return Surname 姓（护照信息页识别结果）
     */
    public String getSurname() {
        return this.Surname;
    }

    /**
     * Set 姓（护照信息页识别结果）
     * @param Surname 姓（护照信息页识别结果）
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Get 名（护照信息页识别结果） 
     * @return GivenName 名（护照信息页识别结果）
     */
    public String getGivenName() {
        return this.GivenName;
    }

    /**
     * Set 名（护照信息页识别结果）
     * @param GivenName 名（护照信息页识别结果）
     */
    public void setGivenName(String GivenName) {
        this.GivenName = GivenName;
    }

    /**
     * Get 姓名（护照信息页识别结果） 
     * @return Name 姓名（护照信息页识别结果）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名（护照信息页识别结果）
     * @param Name 姓名（护照信息页识别结果）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 国籍信息（护照信息页识别结果） 
     * @return Nationality 国籍信息（护照信息页识别结果）
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set 国籍信息（护照信息页识别结果）
     * @param Nationality 国籍信息（护照信息页识别结果）
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 出生日期（护照信息页识别结果） 
     * @return DateOfBirth 出生日期（护照信息页识别结果）
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set 出生日期（护照信息页识别结果）
     * @param DateOfBirth 出生日期（护照信息页识别结果）
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get 性别（护照信息页识别结果） 
     * @return Sex 性别（护照信息页识别结果）
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别（护照信息页识别结果）
     * @param Sex 性别（护照信息页识别结果）
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 发行日期（护照信息页识别结果） 
     * @return DateOfIssuance 发行日期（护照信息页识别结果）
     */
    public String getDateOfIssuance() {
        return this.DateOfIssuance;
    }

    /**
     * Set 发行日期（护照信息页识别结果）
     * @param DateOfIssuance 发行日期（护照信息页识别结果）
     */
    public void setDateOfIssuance(String DateOfIssuance) {
        this.DateOfIssuance = DateOfIssuance;
    }

    /**
     * Get 截止日期（护照信息页识别结果） 
     * @return DateOfExpiration 截止日期（护照信息页识别结果）
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set 截止日期（护照信息页识别结果）
     * @param DateOfExpiration 截止日期（护照信息页识别结果）
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get 持证人签名（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持 
     * @return Signature 持证人签名（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set 持证人签名（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
     * @param Signature 持证人签名（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get 签发地点（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持 
     * @return IssuePlace 签发地点（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
     */
    public String getIssuePlace() {
        return this.IssuePlace;
    }

    /**
     * Set 签发地点（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
     * @param IssuePlace 签发地点（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
     */
    public void setIssuePlace(String IssuePlace) {
        this.IssuePlace = IssuePlace;
    }

    /**
     * Get 签发机关（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持 
     * @return IssuingAuthority 签发机关（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
     */
    public String getIssuingAuthority() {
        return this.IssuingAuthority;
    }

    /**
     * Set 签发机关（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
     * @param IssuingAuthority 签发机关（护照信息页识别结果）

仅中国大陆护照支持返回此字段，港澳台及境外护照不支持
     */
    public void setIssuingAuthority(String IssuingAuthority) {
        this.IssuingAuthority = IssuingAuthority;
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

    }
}

