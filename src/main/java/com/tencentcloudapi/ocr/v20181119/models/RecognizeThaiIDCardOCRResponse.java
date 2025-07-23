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

public class RecognizeThaiIDCardOCRResponse extends AbstractModel {

    /**
    * 身份证号码
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 泰文姓名
    */
    @SerializedName("ThaiName")
    @Expose
    private String ThaiName;

    /**
    * 英文姓名
    */
    @SerializedName("EnFirstName")
    @Expose
    private String EnFirstName;

    /**
    * 英文姓名
    */
    @SerializedName("EnLastName")
    @Expose
    private String EnLastName;

    /**
    * 泰文签发日期
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * 泰文到期日期
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * 英文签发日期
    */
    @SerializedName("EnIssueDate")
    @Expose
    private String EnIssueDate;

    /**
    * 英文到期日期
    */
    @SerializedName("EnExpirationDate")
    @Expose
    private String EnExpirationDate;

    /**
    * 泰文出生日期
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 英文出生日期
    */
    @SerializedName("EnBirthday")
    @Expose
    private String EnBirthday;

    /**
    * 宗教信仰
    */
    @SerializedName("Religion")
    @Expose
    private String Religion;

    /**
    * 序列号
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 背面号码
    */
    @SerializedName("LaserID")
    @Expose
    private String LaserID;

    /**
    * 证件人像照片抠取
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
    * 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

    /**
    * 该字段已废弃， 将固定返回"1"，不建议使用。 
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 身份证号码 
     * @return ID 身份证号码
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 身份证号码
     * @param ID 身份证号码
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 泰文姓名 
     * @return ThaiName 泰文姓名
     */
    public String getThaiName() {
        return this.ThaiName;
    }

    /**
     * Set 泰文姓名
     * @param ThaiName 泰文姓名
     */
    public void setThaiName(String ThaiName) {
        this.ThaiName = ThaiName;
    }

    /**
     * Get 英文姓名 
     * @return EnFirstName 英文姓名
     */
    public String getEnFirstName() {
        return this.EnFirstName;
    }

    /**
     * Set 英文姓名
     * @param EnFirstName 英文姓名
     */
    public void setEnFirstName(String EnFirstName) {
        this.EnFirstName = EnFirstName;
    }

    /**
     * Get 英文姓名 
     * @return EnLastName 英文姓名
     */
    public String getEnLastName() {
        return this.EnLastName;
    }

    /**
     * Set 英文姓名
     * @param EnLastName 英文姓名
     */
    public void setEnLastName(String EnLastName) {
        this.EnLastName = EnLastName;
    }

    /**
     * Get 泰文签发日期 
     * @return IssueDate 泰文签发日期
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set 泰文签发日期
     * @param IssueDate 泰文签发日期
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get 泰文到期日期 
     * @return ExpirationDate 泰文到期日期
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set 泰文到期日期
     * @param ExpirationDate 泰文到期日期
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get 英文签发日期 
     * @return EnIssueDate 英文签发日期
     */
    public String getEnIssueDate() {
        return this.EnIssueDate;
    }

    /**
     * Set 英文签发日期
     * @param EnIssueDate 英文签发日期
     */
    public void setEnIssueDate(String EnIssueDate) {
        this.EnIssueDate = EnIssueDate;
    }

    /**
     * Get 英文到期日期 
     * @return EnExpirationDate 英文到期日期
     */
    public String getEnExpirationDate() {
        return this.EnExpirationDate;
    }

    /**
     * Set 英文到期日期
     * @param EnExpirationDate 英文到期日期
     */
    public void setEnExpirationDate(String EnExpirationDate) {
        this.EnExpirationDate = EnExpirationDate;
    }

    /**
     * Get 泰文出生日期 
     * @return Birthday 泰文出生日期
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 泰文出生日期
     * @param Birthday 泰文出生日期
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get 英文出生日期 
     * @return EnBirthday 英文出生日期
     */
    public String getEnBirthday() {
        return this.EnBirthday;
    }

    /**
     * Set 英文出生日期
     * @param EnBirthday 英文出生日期
     */
    public void setEnBirthday(String EnBirthday) {
        this.EnBirthday = EnBirthday;
    }

    /**
     * Get 宗教信仰 
     * @return Religion 宗教信仰
     */
    public String getReligion() {
        return this.Religion;
    }

    /**
     * Set 宗教信仰
     * @param Religion 宗教信仰
     */
    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    /**
     * Get 序列号 
     * @return SerialNumber 序列号
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 序列号
     * @param SerialNumber 序列号
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get 地址 
     * @return Address 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
     * @param Address 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 背面号码 
     * @return LaserID 背面号码
     */
    public String getLaserID() {
        return this.LaserID;
    }

    /**
     * Set 背面号码
     * @param LaserID 背面号码
     */
    public void setLaserID(String LaserID) {
        this.LaserID = LaserID;
    }

    /**
     * Get 证件人像照片抠取 
     * @return PortraitImage 证件人像照片抠取
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set 证件人像照片抠取
     * @param PortraitImage 证件人像照片抠取
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    /**
     * Get 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通 
     * @return WarnCardInfos 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     */
    public Long [] getWarnCardInfos() {
        return this.WarnCardInfos;
    }

    /**
     * Set 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     * @param WarnCardInfos 告警码
-9101 证件边框不完整告警
-9102 证件复印件告警
-9103 证件翻拍告警
-9107 证件反光告警
-9108 证件模糊告警
-9109 告警能力未开通
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
    }

    /**
     * Get 该字段已废弃， 将固定返回"1"，不建议使用。  
     * @return AdvancedInfo 该字段已废弃， 将固定返回"1"，不建议使用。 
     * @deprecated
     */
    @Deprecated
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set 该字段已废弃， 将固定返回"1"，不建议使用。 
     * @param AdvancedInfo 该字段已废弃， 将固定返回"1"，不建议使用。 
     * @deprecated
     */
    @Deprecated
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizeThaiIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeThaiIDCardOCRResponse(RecognizeThaiIDCardOCRResponse source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.ThaiName != null) {
            this.ThaiName = new String(source.ThaiName);
        }
        if (source.EnFirstName != null) {
            this.EnFirstName = new String(source.EnFirstName);
        }
        if (source.EnLastName != null) {
            this.EnLastName = new String(source.EnLastName);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new String(source.IssueDate);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.EnIssueDate != null) {
            this.EnIssueDate = new String(source.EnIssueDate);
        }
        if (source.EnExpirationDate != null) {
            this.EnExpirationDate = new String(source.EnExpirationDate);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.EnBirthday != null) {
            this.EnBirthday = new String(source.EnBirthday);
        }
        if (source.Religion != null) {
            this.Religion = new String(source.Religion);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.LaserID != null) {
            this.LaserID = new String(source.LaserID);
        }
        if (source.PortraitImage != null) {
            this.PortraitImage = new String(source.PortraitImage);
        }
        if (source.WarnCardInfos != null) {
            this.WarnCardInfos = new Long[source.WarnCardInfos.length];
            for (int i = 0; i < source.WarnCardInfos.length; i++) {
                this.WarnCardInfos[i] = new Long(source.WarnCardInfos[i]);
            }
        }
        if (source.AdvancedInfo != null) {
            this.AdvancedInfo = new String(source.AdvancedInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ThaiName", this.ThaiName);
        this.setParamSimple(map, prefix + "EnFirstName", this.EnFirstName);
        this.setParamSimple(map, prefix + "EnLastName", this.EnLastName);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "EnIssueDate", this.EnIssueDate);
        this.setParamSimple(map, prefix + "EnExpirationDate", this.EnExpirationDate);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "EnBirthday", this.EnBirthday);
        this.setParamSimple(map, prefix + "Religion", this.Religion);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "LaserID", this.LaserID);
        this.setParamSimple(map, prefix + "PortraitImage", this.PortraitImage);
        this.setParamArraySimple(map, prefix + "WarnCardInfos.", this.WarnCardInfos);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

