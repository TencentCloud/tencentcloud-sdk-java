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

public class DriverLicenseOCRResponse extends AbstractModel{

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
    * 国籍
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 住址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 出生日期
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * 初次领证日期
    */
    @SerializedName("DateOfFirstIssue")
    @Expose
    private String DateOfFirstIssue;

    /**
    * 准驾车型
    */
    @SerializedName("Class")
    @Expose
    private String Class;

    /**
    * 有效期开始时间
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 有效期截止时间
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 证号
    */
    @SerializedName("CardCode")
    @Expose
    private String CardCode;

    /**
    * 档案编号
    */
    @SerializedName("ArchivesCode")
    @Expose
    private String ArchivesCode;

    /**
    * 记录
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * Code 告警码列表和释义：
-9102  复印件告警
-9103  翻拍件告警
-9106  ps告警
注：告警码可以同时存在多个
    */
    @SerializedName("RecognizeWarnCode")
    @Expose
    private Long [] RecognizeWarnCode;

    /**
    * 告警码说明：
WARN_DRIVER_LICENSE_COPY_CARD 复印件告警
WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警
WARN_DRIVER_LICENSE_PS_CARD ps告警
注：告警信息可以同时存在多个
    */
    @SerializedName("RecognizeWarnMsg")
    @Expose
    private String [] RecognizeWarnMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 出生日期 
     * @return DateOfBirth 出生日期
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set 出生日期
     * @param DateOfBirth 出生日期
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get 初次领证日期 
     * @return DateOfFirstIssue 初次领证日期
     */
    public String getDateOfFirstIssue() {
        return this.DateOfFirstIssue;
    }

    /**
     * Set 初次领证日期
     * @param DateOfFirstIssue 初次领证日期
     */
    public void setDateOfFirstIssue(String DateOfFirstIssue) {
        this.DateOfFirstIssue = DateOfFirstIssue;
    }

    /**
     * Get 准驾车型 
     * Java getClass cannot and should not be overrided, hence we have to transfer it to a new name which should never conflict with another attribute. The underscode(_) is used as a postfix, because it is invalid in API 3.0, but can be used in Java, even it is not recommended.
     * @return Class 准驾车型
     */
    public String getClass_() {
        return this.Class;
    }

    /**
     * Set 准驾车型
     * @param Class 准驾车型
     */
    public void setClass(String Class) {
        this.Class = Class;
    }

    /**
     * Get 有效期开始时间 
     * @return StartDate 有效期开始时间
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 有效期开始时间
     * @param StartDate 有效期开始时间
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 有效期截止时间 
     * @return EndDate 有效期截止时间
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 有效期截止时间
     * @param EndDate 有效期截止时间
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 证号 
     * @return CardCode 证号
     */
    public String getCardCode() {
        return this.CardCode;
    }

    /**
     * Set 证号
     * @param CardCode 证号
     */
    public void setCardCode(String CardCode) {
        this.CardCode = CardCode;
    }

    /**
     * Get 档案编号 
     * @return ArchivesCode 档案编号
     */
    public String getArchivesCode() {
        return this.ArchivesCode;
    }

    /**
     * Set 档案编号
     * @param ArchivesCode 档案编号
     */
    public void setArchivesCode(String ArchivesCode) {
        this.ArchivesCode = ArchivesCode;
    }

    /**
     * Get 记录 
     * @return Record 记录
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set 记录
     * @param Record 记录
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get Code 告警码列表和释义：
-9102  复印件告警
-9103  翻拍件告警
-9106  ps告警
注：告警码可以同时存在多个 
     * @return RecognizeWarnCode Code 告警码列表和释义：
-9102  复印件告警
-9103  翻拍件告警
-9106  ps告警
注：告警码可以同时存在多个
     */
    public Long [] getRecognizeWarnCode() {
        return this.RecognizeWarnCode;
    }

    /**
     * Set Code 告警码列表和释义：
-9102  复印件告警
-9103  翻拍件告警
-9106  ps告警
注：告警码可以同时存在多个
     * @param RecognizeWarnCode Code 告警码列表和释义：
-9102  复印件告警
-9103  翻拍件告警
-9106  ps告警
注：告警码可以同时存在多个
     */
    public void setRecognizeWarnCode(Long [] RecognizeWarnCode) {
        this.RecognizeWarnCode = RecognizeWarnCode;
    }

    /**
     * Get 告警码说明：
WARN_DRIVER_LICENSE_COPY_CARD 复印件告警
WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警
WARN_DRIVER_LICENSE_PS_CARD ps告警
注：告警信息可以同时存在多个 
     * @return RecognizeWarnMsg 告警码说明：
WARN_DRIVER_LICENSE_COPY_CARD 复印件告警
WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警
WARN_DRIVER_LICENSE_PS_CARD ps告警
注：告警信息可以同时存在多个
     */
    public String [] getRecognizeWarnMsg() {
        return this.RecognizeWarnMsg;
    }

    /**
     * Set 告警码说明：
WARN_DRIVER_LICENSE_COPY_CARD 复印件告警
WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警
WARN_DRIVER_LICENSE_PS_CARD ps告警
注：告警信息可以同时存在多个
     * @param RecognizeWarnMsg 告警码说明：
WARN_DRIVER_LICENSE_COPY_CARD 复印件告警
WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警
WARN_DRIVER_LICENSE_PS_CARD ps告警
注：告警信息可以同时存在多个
     */
    public void setRecognizeWarnMsg(String [] RecognizeWarnMsg) {
        this.RecognizeWarnMsg = RecognizeWarnMsg;
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "DateOfBirth", this.DateOfBirth);
        this.setParamSimple(map, prefix + "DateOfFirstIssue", this.DateOfFirstIssue);
        this.setParamSimple(map, prefix + "Class", this.Class);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "CardCode", this.CardCode);
        this.setParamSimple(map, prefix + "ArchivesCode", this.ArchivesCode);
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamArraySimple(map, prefix + "RecognizeWarnCode.", this.RecognizeWarnCode);
        this.setParamArraySimple(map, prefix + "RecognizeWarnMsg.", this.RecognizeWarnMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

