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

public class RecognizePhilippinesDrivingLicenseOCRResponse extends AbstractModel{

    /**
    * 人像照片Base64后的结果
    */
    @SerializedName("HeadPortrait")
    @Expose
    private TextDetectionResult HeadPortrait;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private TextDetectionResult Name;

    /**
    * 姓氏
    */
    @SerializedName("LastName")
    @Expose
    private TextDetectionResult LastName;

    /**
    * 首姓名
    */
    @SerializedName("FirstName")
    @Expose
    private TextDetectionResult FirstName;

    /**
    * 中间姓名
    */
    @SerializedName("MiddleName")
    @Expose
    private TextDetectionResult MiddleName;

    /**
    * 国籍
    */
    @SerializedName("Nationality")
    @Expose
    private TextDetectionResult Nationality;

    /**
    * 性别
    */
    @SerializedName("Sex")
    @Expose
    private TextDetectionResult Sex;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private TextDetectionResult Address;

    /**
    * 证号
    */
    @SerializedName("LicenseNo")
    @Expose
    private TextDetectionResult LicenseNo;

    /**
    * 有效期
    */
    @SerializedName("ExpiresDate")
    @Expose
    private TextDetectionResult ExpiresDate;

    /**
    * 机构代码
    */
    @SerializedName("AgencyCode")
    @Expose
    private TextDetectionResult AgencyCode;

    /**
    * 出生日期
    */
    @SerializedName("Birthday")
    @Expose
    private TextDetectionResult Birthday;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人像照片Base64后的结果 
     * @return HeadPortrait 人像照片Base64后的结果
     */
    public TextDetectionResult getHeadPortrait() {
        return this.HeadPortrait;
    }

    /**
     * Set 人像照片Base64后的结果
     * @param HeadPortrait 人像照片Base64后的结果
     */
    public void setHeadPortrait(TextDetectionResult HeadPortrait) {
        this.HeadPortrait = HeadPortrait;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public TextDetectionResult getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(TextDetectionResult Name) {
        this.Name = Name;
    }

    /**
     * Get 姓氏 
     * @return LastName 姓氏
     */
    public TextDetectionResult getLastName() {
        return this.LastName;
    }

    /**
     * Set 姓氏
     * @param LastName 姓氏
     */
    public void setLastName(TextDetectionResult LastName) {
        this.LastName = LastName;
    }

    /**
     * Get 首姓名 
     * @return FirstName 首姓名
     */
    public TextDetectionResult getFirstName() {
        return this.FirstName;
    }

    /**
     * Set 首姓名
     * @param FirstName 首姓名
     */
    public void setFirstName(TextDetectionResult FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get 中间姓名 
     * @return MiddleName 中间姓名
     */
    public TextDetectionResult getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set 中间姓名
     * @param MiddleName 中间姓名
     */
    public void setMiddleName(TextDetectionResult MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * Get 国籍 
     * @return Nationality 国籍
     */
    public TextDetectionResult getNationality() {
        return this.Nationality;
    }

    /**
     * Set 国籍
     * @param Nationality 国籍
     */
    public void setNationality(TextDetectionResult Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 性别 
     * @return Sex 性别
     */
    public TextDetectionResult getSex() {
        return this.Sex;
    }

    /**
     * Set 性别
     * @param Sex 性别
     */
    public void setSex(TextDetectionResult Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 地址 
     * @return Address 地址
     */
    public TextDetectionResult getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
     * @param Address 地址
     */
    public void setAddress(TextDetectionResult Address) {
        this.Address = Address;
    }

    /**
     * Get 证号 
     * @return LicenseNo 证号
     */
    public TextDetectionResult getLicenseNo() {
        return this.LicenseNo;
    }

    /**
     * Set 证号
     * @param LicenseNo 证号
     */
    public void setLicenseNo(TextDetectionResult LicenseNo) {
        this.LicenseNo = LicenseNo;
    }

    /**
     * Get 有效期 
     * @return ExpiresDate 有效期
     */
    public TextDetectionResult getExpiresDate() {
        return this.ExpiresDate;
    }

    /**
     * Set 有效期
     * @param ExpiresDate 有效期
     */
    public void setExpiresDate(TextDetectionResult ExpiresDate) {
        this.ExpiresDate = ExpiresDate;
    }

    /**
     * Get 机构代码 
     * @return AgencyCode 机构代码
     */
    public TextDetectionResult getAgencyCode() {
        return this.AgencyCode;
    }

    /**
     * Set 机构代码
     * @param AgencyCode 机构代码
     */
    public void setAgencyCode(TextDetectionResult AgencyCode) {
        this.AgencyCode = AgencyCode;
    }

    /**
     * Get 出生日期 
     * @return Birthday 出生日期
     */
    public TextDetectionResult getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 出生日期
     * @param Birthday 出生日期
     */
    public void setBirthday(TextDetectionResult Birthday) {
        this.Birthday = Birthday;
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

    public RecognizePhilippinesDrivingLicenseOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizePhilippinesDrivingLicenseOCRResponse(RecognizePhilippinesDrivingLicenseOCRResponse source) {
        if (source.HeadPortrait != null) {
            this.HeadPortrait = new TextDetectionResult(source.HeadPortrait);
        }
        if (source.Name != null) {
            this.Name = new TextDetectionResult(source.Name);
        }
        if (source.LastName != null) {
            this.LastName = new TextDetectionResult(source.LastName);
        }
        if (source.FirstName != null) {
            this.FirstName = new TextDetectionResult(source.FirstName);
        }
        if (source.MiddleName != null) {
            this.MiddleName = new TextDetectionResult(source.MiddleName);
        }
        if (source.Nationality != null) {
            this.Nationality = new TextDetectionResult(source.Nationality);
        }
        if (source.Sex != null) {
            this.Sex = new TextDetectionResult(source.Sex);
        }
        if (source.Address != null) {
            this.Address = new TextDetectionResult(source.Address);
        }
        if (source.LicenseNo != null) {
            this.LicenseNo = new TextDetectionResult(source.LicenseNo);
        }
        if (source.ExpiresDate != null) {
            this.ExpiresDate = new TextDetectionResult(source.ExpiresDate);
        }
        if (source.AgencyCode != null) {
            this.AgencyCode = new TextDetectionResult(source.AgencyCode);
        }
        if (source.Birthday != null) {
            this.Birthday = new TextDetectionResult(source.Birthday);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HeadPortrait.", this.HeadPortrait);
        this.setParamObj(map, prefix + "Name.", this.Name);
        this.setParamObj(map, prefix + "LastName.", this.LastName);
        this.setParamObj(map, prefix + "FirstName.", this.FirstName);
        this.setParamObj(map, prefix + "MiddleName.", this.MiddleName);
        this.setParamObj(map, prefix + "Nationality.", this.Nationality);
        this.setParamObj(map, prefix + "Sex.", this.Sex);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "LicenseNo.", this.LicenseNo);
        this.setParamObj(map, prefix + "ExpiresDate.", this.ExpiresDate);
        this.setParamObj(map, prefix + "AgencyCode.", this.AgencyCode);
        this.setParamObj(map, prefix + "Birthday.", this.Birthday);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

