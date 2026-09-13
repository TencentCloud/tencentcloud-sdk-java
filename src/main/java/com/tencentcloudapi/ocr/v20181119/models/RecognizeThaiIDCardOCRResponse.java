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
    * <p>身份证号码</p>
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>泰文姓名</p>
    */
    @SerializedName("ThaiName")
    @Expose
    private String ThaiName;

    /**
    * <p>英文姓名</p>
    */
    @SerializedName("EnFirstName")
    @Expose
    private String EnFirstName;

    /**
    * <p>英文姓名</p>
    */
    @SerializedName("EnLastName")
    @Expose
    private String EnLastName;

    /**
    * <p>泰文签发日期</p>
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * <p>泰文到期日期</p>
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * <p>英文签发日期</p>
    */
    @SerializedName("EnIssueDate")
    @Expose
    private String EnIssueDate;

    /**
    * <p>英文到期日期</p>
    */
    @SerializedName("EnExpirationDate")
    @Expose
    private String EnExpirationDate;

    /**
    * <p>泰文出生日期</p>
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * <p>英文出生日期</p>
    */
    @SerializedName("EnBirthday")
    @Expose
    private String EnBirthday;

    /**
    * <p>宗教信仰</p>
    */
    @SerializedName("Religion")
    @Expose
    private String Religion;

    /**
    * <p>序列号</p>
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * <p>地址</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>背面号码</p>
    */
    @SerializedName("LaserID")
    @Expose
    private String LaserID;

    /**
    * <p>证件人像照片抠取</p>
    */
    @SerializedName("PortraitImage")
    @Expose
    private String PortraitImage;

    /**
    * <p>告警码<br>-9101 证件边框不完整告警<br>-9102 证件复印件告警<br>-9103 证件翻拍告警<br>-9104 证件PS告警<br>-9107 证件反光告警<br>-9108 证件模糊告警<br>-9109 告警能力未开通</p>
    */
    @SerializedName("WarnCardInfos")
    @Expose
    private Long [] WarnCardInfos;

    /**
    * <p>该字段已废弃， 将固定返回&quot;1&quot;，不建议使用。</p>
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * <p>卡证正面图片中，证件主体的数量（仅请求曼谷地域[ap-bangkok]返回）</p>
    */
    @SerializedName("CardCount")
    @Expose
    private Long CardCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>身份证号码</p> 
     * @return ID <p>身份证号码</p>
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>身份证号码</p>
     * @param ID <p>身份证号码</p>
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>泰文姓名</p> 
     * @return ThaiName <p>泰文姓名</p>
     */
    public String getThaiName() {
        return this.ThaiName;
    }

    /**
     * Set <p>泰文姓名</p>
     * @param ThaiName <p>泰文姓名</p>
     */
    public void setThaiName(String ThaiName) {
        this.ThaiName = ThaiName;
    }

    /**
     * Get <p>英文姓名</p> 
     * @return EnFirstName <p>英文姓名</p>
     */
    public String getEnFirstName() {
        return this.EnFirstName;
    }

    /**
     * Set <p>英文姓名</p>
     * @param EnFirstName <p>英文姓名</p>
     */
    public void setEnFirstName(String EnFirstName) {
        this.EnFirstName = EnFirstName;
    }

    /**
     * Get <p>英文姓名</p> 
     * @return EnLastName <p>英文姓名</p>
     */
    public String getEnLastName() {
        return this.EnLastName;
    }

    /**
     * Set <p>英文姓名</p>
     * @param EnLastName <p>英文姓名</p>
     */
    public void setEnLastName(String EnLastName) {
        this.EnLastName = EnLastName;
    }

    /**
     * Get <p>泰文签发日期</p> 
     * @return IssueDate <p>泰文签发日期</p>
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set <p>泰文签发日期</p>
     * @param IssueDate <p>泰文签发日期</p>
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get <p>泰文到期日期</p> 
     * @return ExpirationDate <p>泰文到期日期</p>
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set <p>泰文到期日期</p>
     * @param ExpirationDate <p>泰文到期日期</p>
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get <p>英文签发日期</p> 
     * @return EnIssueDate <p>英文签发日期</p>
     */
    public String getEnIssueDate() {
        return this.EnIssueDate;
    }

    /**
     * Set <p>英文签发日期</p>
     * @param EnIssueDate <p>英文签发日期</p>
     */
    public void setEnIssueDate(String EnIssueDate) {
        this.EnIssueDate = EnIssueDate;
    }

    /**
     * Get <p>英文到期日期</p> 
     * @return EnExpirationDate <p>英文到期日期</p>
     */
    public String getEnExpirationDate() {
        return this.EnExpirationDate;
    }

    /**
     * Set <p>英文到期日期</p>
     * @param EnExpirationDate <p>英文到期日期</p>
     */
    public void setEnExpirationDate(String EnExpirationDate) {
        this.EnExpirationDate = EnExpirationDate;
    }

    /**
     * Get <p>泰文出生日期</p> 
     * @return Birthday <p>泰文出生日期</p>
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set <p>泰文出生日期</p>
     * @param Birthday <p>泰文出生日期</p>
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get <p>英文出生日期</p> 
     * @return EnBirthday <p>英文出生日期</p>
     */
    public String getEnBirthday() {
        return this.EnBirthday;
    }

    /**
     * Set <p>英文出生日期</p>
     * @param EnBirthday <p>英文出生日期</p>
     */
    public void setEnBirthday(String EnBirthday) {
        this.EnBirthday = EnBirthday;
    }

    /**
     * Get <p>宗教信仰</p> 
     * @return Religion <p>宗教信仰</p>
     */
    public String getReligion() {
        return this.Religion;
    }

    /**
     * Set <p>宗教信仰</p>
     * @param Religion <p>宗教信仰</p>
     */
    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    /**
     * Get <p>序列号</p> 
     * @return SerialNumber <p>序列号</p>
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set <p>序列号</p>
     * @param SerialNumber <p>序列号</p>
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get <p>地址</p> 
     * @return Address <p>地址</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>地址</p>
     * @param Address <p>地址</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>背面号码</p> 
     * @return LaserID <p>背面号码</p>
     */
    public String getLaserID() {
        return this.LaserID;
    }

    /**
     * Set <p>背面号码</p>
     * @param LaserID <p>背面号码</p>
     */
    public void setLaserID(String LaserID) {
        this.LaserID = LaserID;
    }

    /**
     * Get <p>证件人像照片抠取</p> 
     * @return PortraitImage <p>证件人像照片抠取</p>
     */
    public String getPortraitImage() {
        return this.PortraitImage;
    }

    /**
     * Set <p>证件人像照片抠取</p>
     * @param PortraitImage <p>证件人像照片抠取</p>
     */
    public void setPortraitImage(String PortraitImage) {
        this.PortraitImage = PortraitImage;
    }

    /**
     * Get <p>告警码<br>-9101 证件边框不完整告警<br>-9102 证件复印件告警<br>-9103 证件翻拍告警<br>-9104 证件PS告警<br>-9107 证件反光告警<br>-9108 证件模糊告警<br>-9109 告警能力未开通</p> 
     * @return WarnCardInfos <p>告警码<br>-9101 证件边框不完整告警<br>-9102 证件复印件告警<br>-9103 证件翻拍告警<br>-9104 证件PS告警<br>-9107 证件反光告警<br>-9108 证件模糊告警<br>-9109 告警能力未开通</p>
     */
    public Long [] getWarnCardInfos() {
        return this.WarnCardInfos;
    }

    /**
     * Set <p>告警码<br>-9101 证件边框不完整告警<br>-9102 证件复印件告警<br>-9103 证件翻拍告警<br>-9104 证件PS告警<br>-9107 证件反光告警<br>-9108 证件模糊告警<br>-9109 告警能力未开通</p>
     * @param WarnCardInfos <p>告警码<br>-9101 证件边框不完整告警<br>-9102 证件复印件告警<br>-9103 证件翻拍告警<br>-9104 证件PS告警<br>-9107 证件反光告警<br>-9108 证件模糊告警<br>-9109 告警能力未开通</p>
     */
    public void setWarnCardInfos(Long [] WarnCardInfos) {
        this.WarnCardInfos = WarnCardInfos;
    }

    /**
     * Get <p>该字段已废弃， 将固定返回&quot;1&quot;，不建议使用。</p> 
     * @return AdvancedInfo <p>该字段已废弃， 将固定返回&quot;1&quot;，不建议使用。</p>
     * @deprecated
     */
    @Deprecated
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set <p>该字段已废弃， 将固定返回&quot;1&quot;，不建议使用。</p>
     * @param AdvancedInfo <p>该字段已废弃， 将固定返回&quot;1&quot;，不建议使用。</p>
     * @deprecated
     */
    @Deprecated
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get <p>卡证正面图片中，证件主体的数量（仅请求曼谷地域[ap-bangkok]返回）</p> 
     * @return CardCount <p>卡证正面图片中，证件主体的数量（仅请求曼谷地域[ap-bangkok]返回）</p>
     */
    public Long getCardCount() {
        return this.CardCount;
    }

    /**
     * Set <p>卡证正面图片中，证件主体的数量（仅请求曼谷地域[ap-bangkok]返回）</p>
     * @param CardCount <p>卡证正面图片中，证件主体的数量（仅请求曼谷地域[ap-bangkok]返回）</p>
     */
    public void setCardCount(Long CardCount) {
        this.CardCount = CardCount;
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
        if (source.CardCount != null) {
            this.CardCount = new Long(source.CardCount);
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
        this.setParamSimple(map, prefix + "CardCount", this.CardCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

