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

public class DriverLicenseOCRResponse extends AbstractModel {

    /**
    * 驾驶证正页姓名
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
    * 出生日期（YYYY-MM-DD）
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * 初次领证日期（YYYY-MM-DD）
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
    * 有效期开始时间（YYYY-MM-DD）
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 有效期截止时间（新版驾驶证返回 YYYY-MM-DD，
老版驾驶证返回有效期限 X年）
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 驾驶证正页证号
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
-9104  反光告警
-9105  模糊告警
-9106  边框不完整告警
注：告警码可以同时存在多个
    */
    @SerializedName("RecognizeWarnCode")
    @Expose
    private Long [] RecognizeWarnCode;

    /**
    * 告警码说明：
WARN_DRIVER_LICENSE_COPY_CARD 复印件告警
WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警
WARN_DRIVER_LICENSE_REFLECTION 反光告警
WARN_DRIVER_LICENSE_BLUR 模糊告警
WARN_DRIVER_LICENSE_BORDER_INCOMPLETE 边框不完整告警
注：告警信息可以同时存在多个
    */
    @SerializedName("RecognizeWarnMsg")
    @Expose
    private String [] RecognizeWarnMsg;

    /**
    * 发证单位
    */
    @SerializedName("IssuingAuthority")
    @Expose
    private String IssuingAuthority;

    /**
    * 状态（仅电子驾驶证支持返回该字段）
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 累积记分（仅电子驾驶证支持返回该字段）
    */
    @SerializedName("CumulativeScore")
    @Expose
    private String CumulativeScore;

    /**
    * 当前时间（仅电子驾驶证支持返回该字段）
    */
    @SerializedName("CurrentTime")
    @Expose
    private String CurrentTime;

    /**
    * 生成时间（仅电子驾驶证支持返回该字段）
    */
    @SerializedName("GenerateTime")
    @Expose
    private String GenerateTime;

    /**
    * 驾驶证副页姓名
    */
    @SerializedName("BackPageName")
    @Expose
    private String BackPageName;

    /**
    * 驾驶证副页证号
    */
    @SerializedName("BackPageCardCode")
    @Expose
    private String BackPageCardCode;

    /**
    * 驾驶证类型
电子驾驶证：Electronic
普通驾驶证：Normal
    */
    @SerializedName("DriverLicenseType")
    @Expose
    private String DriverLicenseType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 驾驶证正页姓名 
     * @return Name 驾驶证正页姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 驾驶证正页姓名
     * @param Name 驾驶证正页姓名
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
     * Get 出生日期（YYYY-MM-DD） 
     * @return DateOfBirth 出生日期（YYYY-MM-DD）
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set 出生日期（YYYY-MM-DD）
     * @param DateOfBirth 出生日期（YYYY-MM-DD）
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get 初次领证日期（YYYY-MM-DD） 
     * @return DateOfFirstIssue 初次领证日期（YYYY-MM-DD）
     */
    public String getDateOfFirstIssue() {
        return this.DateOfFirstIssue;
    }

    /**
     * Set 初次领证日期（YYYY-MM-DD）
     * @param DateOfFirstIssue 初次领证日期（YYYY-MM-DD）
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
     * Get 有效期开始时间（YYYY-MM-DD） 
     * @return StartDate 有效期开始时间（YYYY-MM-DD）
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 有效期开始时间（YYYY-MM-DD）
     * @param StartDate 有效期开始时间（YYYY-MM-DD）
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 有效期截止时间（新版驾驶证返回 YYYY-MM-DD，
老版驾驶证返回有效期限 X年） 
     * @return EndDate 有效期截止时间（新版驾驶证返回 YYYY-MM-DD，
老版驾驶证返回有效期限 X年）
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 有效期截止时间（新版驾驶证返回 YYYY-MM-DD，
老版驾驶证返回有效期限 X年）
     * @param EndDate 有效期截止时间（新版驾驶证返回 YYYY-MM-DD，
老版驾驶证返回有效期限 X年）
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 驾驶证正页证号 
     * @return CardCode 驾驶证正页证号
     */
    public String getCardCode() {
        return this.CardCode;
    }

    /**
     * Set 驾驶证正页证号
     * @param CardCode 驾驶证正页证号
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
-9104  反光告警
-9105  模糊告警
-9106  边框不完整告警
注：告警码可以同时存在多个 
     * @return RecognizeWarnCode Code 告警码列表和释义：
-9102  复印件告警
-9103  翻拍件告警
-9104  反光告警
-9105  模糊告警
-9106  边框不完整告警
注：告警码可以同时存在多个
     */
    public Long [] getRecognizeWarnCode() {
        return this.RecognizeWarnCode;
    }

    /**
     * Set Code 告警码列表和释义：
-9102  复印件告警
-9103  翻拍件告警
-9104  反光告警
-9105  模糊告警
-9106  边框不完整告警
注：告警码可以同时存在多个
     * @param RecognizeWarnCode Code 告警码列表和释义：
-9102  复印件告警
-9103  翻拍件告警
-9104  反光告警
-9105  模糊告警
-9106  边框不完整告警
注：告警码可以同时存在多个
     */
    public void setRecognizeWarnCode(Long [] RecognizeWarnCode) {
        this.RecognizeWarnCode = RecognizeWarnCode;
    }

    /**
     * Get 告警码说明：
WARN_DRIVER_LICENSE_COPY_CARD 复印件告警
WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警
WARN_DRIVER_LICENSE_REFLECTION 反光告警
WARN_DRIVER_LICENSE_BLUR 模糊告警
WARN_DRIVER_LICENSE_BORDER_INCOMPLETE 边框不完整告警
注：告警信息可以同时存在多个 
     * @return RecognizeWarnMsg 告警码说明：
WARN_DRIVER_LICENSE_COPY_CARD 复印件告警
WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警
WARN_DRIVER_LICENSE_REFLECTION 反光告警
WARN_DRIVER_LICENSE_BLUR 模糊告警
WARN_DRIVER_LICENSE_BORDER_INCOMPLETE 边框不完整告警
注：告警信息可以同时存在多个
     */
    public String [] getRecognizeWarnMsg() {
        return this.RecognizeWarnMsg;
    }

    /**
     * Set 告警码说明：
WARN_DRIVER_LICENSE_COPY_CARD 复印件告警
WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警
WARN_DRIVER_LICENSE_REFLECTION 反光告警
WARN_DRIVER_LICENSE_BLUR 模糊告警
WARN_DRIVER_LICENSE_BORDER_INCOMPLETE 边框不完整告警
注：告警信息可以同时存在多个
     * @param RecognizeWarnMsg 告警码说明：
WARN_DRIVER_LICENSE_COPY_CARD 复印件告警
WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警
WARN_DRIVER_LICENSE_REFLECTION 反光告警
WARN_DRIVER_LICENSE_BLUR 模糊告警
WARN_DRIVER_LICENSE_BORDER_INCOMPLETE 边框不完整告警
注：告警信息可以同时存在多个
     */
    public void setRecognizeWarnMsg(String [] RecognizeWarnMsg) {
        this.RecognizeWarnMsg = RecognizeWarnMsg;
    }

    /**
     * Get 发证单位 
     * @return IssuingAuthority 发证单位
     */
    public String getIssuingAuthority() {
        return this.IssuingAuthority;
    }

    /**
     * Set 发证单位
     * @param IssuingAuthority 发证单位
     */
    public void setIssuingAuthority(String IssuingAuthority) {
        this.IssuingAuthority = IssuingAuthority;
    }

    /**
     * Get 状态（仅电子驾驶证支持返回该字段） 
     * @return State 状态（仅电子驾驶证支持返回该字段）
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态（仅电子驾驶证支持返回该字段）
     * @param State 状态（仅电子驾驶证支持返回该字段）
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 累积记分（仅电子驾驶证支持返回该字段） 
     * @return CumulativeScore 累积记分（仅电子驾驶证支持返回该字段）
     */
    public String getCumulativeScore() {
        return this.CumulativeScore;
    }

    /**
     * Set 累积记分（仅电子驾驶证支持返回该字段）
     * @param CumulativeScore 累积记分（仅电子驾驶证支持返回该字段）
     */
    public void setCumulativeScore(String CumulativeScore) {
        this.CumulativeScore = CumulativeScore;
    }

    /**
     * Get 当前时间（仅电子驾驶证支持返回该字段） 
     * @return CurrentTime 当前时间（仅电子驾驶证支持返回该字段）
     */
    public String getCurrentTime() {
        return this.CurrentTime;
    }

    /**
     * Set 当前时间（仅电子驾驶证支持返回该字段）
     * @param CurrentTime 当前时间（仅电子驾驶证支持返回该字段）
     */
    public void setCurrentTime(String CurrentTime) {
        this.CurrentTime = CurrentTime;
    }

    /**
     * Get 生成时间（仅电子驾驶证支持返回该字段） 
     * @return GenerateTime 生成时间（仅电子驾驶证支持返回该字段）
     */
    public String getGenerateTime() {
        return this.GenerateTime;
    }

    /**
     * Set 生成时间（仅电子驾驶证支持返回该字段）
     * @param GenerateTime 生成时间（仅电子驾驶证支持返回该字段）
     */
    public void setGenerateTime(String GenerateTime) {
        this.GenerateTime = GenerateTime;
    }

    /**
     * Get 驾驶证副页姓名 
     * @return BackPageName 驾驶证副页姓名
     */
    public String getBackPageName() {
        return this.BackPageName;
    }

    /**
     * Set 驾驶证副页姓名
     * @param BackPageName 驾驶证副页姓名
     */
    public void setBackPageName(String BackPageName) {
        this.BackPageName = BackPageName;
    }

    /**
     * Get 驾驶证副页证号 
     * @return BackPageCardCode 驾驶证副页证号
     */
    public String getBackPageCardCode() {
        return this.BackPageCardCode;
    }

    /**
     * Set 驾驶证副页证号
     * @param BackPageCardCode 驾驶证副页证号
     */
    public void setBackPageCardCode(String BackPageCardCode) {
        this.BackPageCardCode = BackPageCardCode;
    }

    /**
     * Get 驾驶证类型
电子驾驶证：Electronic
普通驾驶证：Normal 
     * @return DriverLicenseType 驾驶证类型
电子驾驶证：Electronic
普通驾驶证：Normal
     */
    public String getDriverLicenseType() {
        return this.DriverLicenseType;
    }

    /**
     * Set 驾驶证类型
电子驾驶证：Electronic
普通驾驶证：Normal
     * @param DriverLicenseType 驾驶证类型
电子驾驶证：Electronic
普通驾驶证：Normal
     */
    public void setDriverLicenseType(String DriverLicenseType) {
        this.DriverLicenseType = DriverLicenseType;
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

    public DriverLicenseOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DriverLicenseOCRResponse(DriverLicenseOCRResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.DateOfBirth != null) {
            this.DateOfBirth = new String(source.DateOfBirth);
        }
        if (source.DateOfFirstIssue != null) {
            this.DateOfFirstIssue = new String(source.DateOfFirstIssue);
        }
        if (source.Class != null) {
            this.Class = new String(source.Class);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.CardCode != null) {
            this.CardCode = new String(source.CardCode);
        }
        if (source.ArchivesCode != null) {
            this.ArchivesCode = new String(source.ArchivesCode);
        }
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.RecognizeWarnCode != null) {
            this.RecognizeWarnCode = new Long[source.RecognizeWarnCode.length];
            for (int i = 0; i < source.RecognizeWarnCode.length; i++) {
                this.RecognizeWarnCode[i] = new Long(source.RecognizeWarnCode[i]);
            }
        }
        if (source.RecognizeWarnMsg != null) {
            this.RecognizeWarnMsg = new String[source.RecognizeWarnMsg.length];
            for (int i = 0; i < source.RecognizeWarnMsg.length; i++) {
                this.RecognizeWarnMsg[i] = new String(source.RecognizeWarnMsg[i]);
            }
        }
        if (source.IssuingAuthority != null) {
            this.IssuingAuthority = new String(source.IssuingAuthority);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CumulativeScore != null) {
            this.CumulativeScore = new String(source.CumulativeScore);
        }
        if (source.CurrentTime != null) {
            this.CurrentTime = new String(source.CurrentTime);
        }
        if (source.GenerateTime != null) {
            this.GenerateTime = new String(source.GenerateTime);
        }
        if (source.BackPageName != null) {
            this.BackPageName = new String(source.BackPageName);
        }
        if (source.BackPageCardCode != null) {
            this.BackPageCardCode = new String(source.BackPageCardCode);
        }
        if (source.DriverLicenseType != null) {
            this.DriverLicenseType = new String(source.DriverLicenseType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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
        this.setParamSimple(map, prefix + "IssuingAuthority", this.IssuingAuthority);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CumulativeScore", this.CumulativeScore);
        this.setParamSimple(map, prefix + "CurrentTime", this.CurrentTime);
        this.setParamSimple(map, prefix + "GenerateTime", this.GenerateTime);
        this.setParamSimple(map, prefix + "BackPageName", this.BackPageName);
        this.setParamSimple(map, prefix + "BackPageCardCode", this.BackPageCardCode);
        this.setParamSimple(map, prefix + "DriverLicenseType", this.DriverLicenseType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

