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

public class PassportOCRResponse extends AbstractModel{

    /**
    * 国家码
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 护照号
    */
    @SerializedName("PassportNo")
    @Expose
    private String PassportNo;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 国籍
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 出生日期
    */
    @SerializedName("BirthDate")
    @Expose
    private String BirthDate;

    /**
    * 出生地点
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * 签发日期
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * 签发地点
    */
    @SerializedName("IssuePlace")
    @Expose
    private String IssuePlace;

    /**
    * 有效期
    */
    @SerializedName("ExpiryDate")
    @Expose
    private String ExpiryDate;

    /**
    * 持证人签名
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * 最下方第一行 MRZ Code 序列
    */
    @SerializedName("CodeSet")
    @Expose
    private String CodeSet;

    /**
    * 最下方第二行 MRZ Code 序列
    */
    @SerializedName("CodeCrc")
    @Expose
    private String CodeCrc;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 姓
    */
    @SerializedName("FamilyName")
    @Expose
    private String FamilyName;

    /**
    * 名
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 国家码 
     * @return Country 国家码
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家码
     * @param Country 国家码
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 护照号 
     * @return PassportNo 护照号
     */
    public String getPassportNo() {
        return this.PassportNo;
    }

    /**
     * Set 护照号
     * @param PassportNo 护照号
     */
    public void setPassportNo(String PassportNo) {
        this.PassportNo = PassportNo;
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
     * Get 签发地点 
     * @return IssuePlace 签发地点
     */
    public String getIssuePlace() {
        return this.IssuePlace;
    }

    /**
     * Set 签发地点
     * @param IssuePlace 签发地点
     */
    public void setIssuePlace(String IssuePlace) {
        this.IssuePlace = IssuePlace;
    }

    /**
     * Get 有效期 
     * @return ExpiryDate 有效期
     */
    public String getExpiryDate() {
        return this.ExpiryDate;
    }

    /**
     * Set 有效期
     * @param ExpiryDate 有效期
     */
    public void setExpiryDate(String ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    /**
     * Get 持证人签名 
     * @return Signature 持证人签名
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set 持证人签名
     * @param Signature 持证人签名
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get 最下方第一行 MRZ Code 序列 
     * @return CodeSet 最下方第一行 MRZ Code 序列
     */
    public String getCodeSet() {
        return this.CodeSet;
    }

    /**
     * Set 最下方第一行 MRZ Code 序列
     * @param CodeSet 最下方第一行 MRZ Code 序列
     */
    public void setCodeSet(String CodeSet) {
        this.CodeSet = CodeSet;
    }

    /**
     * Get 最下方第二行 MRZ Code 序列 
     * @return CodeCrc 最下方第二行 MRZ Code 序列
     */
    public String getCodeCrc() {
        return this.CodeCrc;
    }

    /**
     * Set 最下方第二行 MRZ Code 序列
     * @param CodeCrc 最下方第二行 MRZ Code 序列
     */
    public void setCodeCrc(String CodeCrc) {
        this.CodeCrc = CodeCrc;
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
     * Get 姓 
     * @return FamilyName 姓
     */
    public String getFamilyName() {
        return this.FamilyName;
    }

    /**
     * Set 姓
     * @param FamilyName 姓
     */
    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
    }

    /**
     * Get 名 
     * @return FirstName 名
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set 名
     * @param FirstName 名
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "PassportNo", this.PassportNo);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "BirthDate", this.BirthDate);
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "IssuePlace", this.IssuePlace);
        this.setParamSimple(map, prefix + "ExpiryDate", this.ExpiryDate);
        this.setParamSimple(map, prefix + "Signature", this.Signature);
        this.setParamSimple(map, prefix + "CodeSet", this.CodeSet);
        this.setParamSimple(map, prefix + "CodeCrc", this.CodeCrc);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FamilyName", this.FamilyName);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

