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
    * <p>驾驶证正页姓名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>性别</p>
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>国籍</p>
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * <p>住址</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>出生日期（YYYY-MM-DD）</p>
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * <p>初次领证日期（YYYY-MM-DD）</p>
    */
    @SerializedName("DateOfFirstIssue")
    @Expose
    private String DateOfFirstIssue;

    /**
    * <p>准驾车型</p>
    */
    @SerializedName("Class")
    @Expose
    private String Class;

    /**
    * <p>有效期开始时间（YYYY-MM-DD）</p>
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * <p>有效期截止时间（新版驾驶证返回 YYYY-MM-DD，老版驾驶证返回有效期限 X年；若驾驶证有效期为长期，则返回&quot;长期&quot;）</p>
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * <p>驾驶证正页证号</p>
    */
    @SerializedName("CardCode")
    @Expose
    private String CardCode;

    /**
    * <p>档案编号</p>
    */
    @SerializedName("ArchivesCode")
    @Expose
    private String ArchivesCode;

    /**
    * <p>记录</p>
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * <p>Code 告警码列表和释义：<br>-9102  复印件告警<br>-9103  翻拍件告警<br>-9104  反光告警<br>-9105  模糊告警<br>-9106  边框不完整告警<br>注：告警码可以同时存在多个</p>
    */
    @SerializedName("RecognizeWarnCode")
    @Expose
    private Long [] RecognizeWarnCode;

    /**
    * <p>告警码说明：<br>WARN_DRIVER_LICENSE_COPY_CARD 复印件告警<br>WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警<br>WARN_DRIVER_LICENSE_REFLECTION 反光告警<br>WARN_DRIVER_LICENSE_BLUR 模糊告警<br>WARN_DRIVER_LICENSE_BORDER_INCOMPLETE 边框不完整告警<br>注：告警信息可以同时存在多个</p>
    */
    @SerializedName("RecognizeWarnMsg")
    @Expose
    private String [] RecognizeWarnMsg;

    /**
    * <p>发证单位</p>
    */
    @SerializedName("IssuingAuthority")
    @Expose
    private String IssuingAuthority;

    /**
    * <p>状态（仅电子驾驶证支持返回该字段）</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>累积记分（仅电子驾驶证支持返回该字段）</p>
    */
    @SerializedName("CumulativeScore")
    @Expose
    private String CumulativeScore;

    /**
    * <p>当前时间（仅电子驾驶证支持返回该字段）</p>
    */
    @SerializedName("CurrentTime")
    @Expose
    private String CurrentTime;

    /**
    * <p>生成时间（仅电子驾驶证支持返回该字段）</p>
    */
    @SerializedName("GenerateTime")
    @Expose
    private String GenerateTime;

    /**
    * <p>驾驶证副页姓名</p>
    */
    @SerializedName("BackPageName")
    @Expose
    private String BackPageName;

    /**
    * <p>驾驶证副页证号</p>
    */
    @SerializedName("BackPageCardCode")
    @Expose
    private String BackPageCardCode;

    /**
    * <p>驾驶证类型<br>电子驾驶证：Electronic<br>普通驾驶证：Normal</p>
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
     * Get <p>驾驶证正页姓名</p> 
     * @return Name <p>驾驶证正页姓名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>驾驶证正页姓名</p>
     * @param Name <p>驾驶证正页姓名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>性别</p> 
     * @return Sex <p>性别</p>
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>性别</p>
     * @param Sex <p>性别</p>
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>国籍</p> 
     * @return Nationality <p>国籍</p>
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set <p>国籍</p>
     * @param Nationality <p>国籍</p>
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get <p>住址</p> 
     * @return Address <p>住址</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>住址</p>
     * @param Address <p>住址</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>出生日期（YYYY-MM-DD）</p> 
     * @return DateOfBirth <p>出生日期（YYYY-MM-DD）</p>
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set <p>出生日期（YYYY-MM-DD）</p>
     * @param DateOfBirth <p>出生日期（YYYY-MM-DD）</p>
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get <p>初次领证日期（YYYY-MM-DD）</p> 
     * @return DateOfFirstIssue <p>初次领证日期（YYYY-MM-DD）</p>
     */
    public String getDateOfFirstIssue() {
        return this.DateOfFirstIssue;
    }

    /**
     * Set <p>初次领证日期（YYYY-MM-DD）</p>
     * @param DateOfFirstIssue <p>初次领证日期（YYYY-MM-DD）</p>
     */
    public void setDateOfFirstIssue(String DateOfFirstIssue) {
        this.DateOfFirstIssue = DateOfFirstIssue;
    }

    /**
     * Get <p>准驾车型</p> 
     * Java getClass cannot and should not be overrided, hence we have to transfer it to a new name which should never conflict with another attribute. The underscode(_) is used as a postfix, because it is invalid in API 3.0, but can be used in Java, even it is not recommended.
     * @return Class <p>准驾车型</p>
     */
    public String getClass_() {
        return this.Class;
    }

    /**
     * Set <p>准驾车型</p>
     * @param Class <p>准驾车型</p>
     */
    public void setClass(String Class) {
        this.Class = Class;
    }

    /**
     * Get <p>有效期开始时间（YYYY-MM-DD）</p> 
     * @return StartDate <p>有效期开始时间（YYYY-MM-DD）</p>
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>有效期开始时间（YYYY-MM-DD）</p>
     * @param StartDate <p>有效期开始时间（YYYY-MM-DD）</p>
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>有效期截止时间（新版驾驶证返回 YYYY-MM-DD，老版驾驶证返回有效期限 X年；若驾驶证有效期为长期，则返回&quot;长期&quot;）</p> 
     * @return EndDate <p>有效期截止时间（新版驾驶证返回 YYYY-MM-DD，老版驾驶证返回有效期限 X年；若驾驶证有效期为长期，则返回&quot;长期&quot;）</p>
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set <p>有效期截止时间（新版驾驶证返回 YYYY-MM-DD，老版驾驶证返回有效期限 X年；若驾驶证有效期为长期，则返回&quot;长期&quot;）</p>
     * @param EndDate <p>有效期截止时间（新版驾驶证返回 YYYY-MM-DD，老版驾驶证返回有效期限 X年；若驾驶证有效期为长期，则返回&quot;长期&quot;）</p>
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get <p>驾驶证正页证号</p> 
     * @return CardCode <p>驾驶证正页证号</p>
     */
    public String getCardCode() {
        return this.CardCode;
    }

    /**
     * Set <p>驾驶证正页证号</p>
     * @param CardCode <p>驾驶证正页证号</p>
     */
    public void setCardCode(String CardCode) {
        this.CardCode = CardCode;
    }

    /**
     * Get <p>档案编号</p> 
     * @return ArchivesCode <p>档案编号</p>
     */
    public String getArchivesCode() {
        return this.ArchivesCode;
    }

    /**
     * Set <p>档案编号</p>
     * @param ArchivesCode <p>档案编号</p>
     */
    public void setArchivesCode(String ArchivesCode) {
        this.ArchivesCode = ArchivesCode;
    }

    /**
     * Get <p>记录</p> 
     * @return Record <p>记录</p>
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set <p>记录</p>
     * @param Record <p>记录</p>
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get <p>Code 告警码列表和释义：<br>-9102  复印件告警<br>-9103  翻拍件告警<br>-9104  反光告警<br>-9105  模糊告警<br>-9106  边框不完整告警<br>注：告警码可以同时存在多个</p> 
     * @return RecognizeWarnCode <p>Code 告警码列表和释义：<br>-9102  复印件告警<br>-9103  翻拍件告警<br>-9104  反光告警<br>-9105  模糊告警<br>-9106  边框不完整告警<br>注：告警码可以同时存在多个</p>
     */
    public Long [] getRecognizeWarnCode() {
        return this.RecognizeWarnCode;
    }

    /**
     * Set <p>Code 告警码列表和释义：<br>-9102  复印件告警<br>-9103  翻拍件告警<br>-9104  反光告警<br>-9105  模糊告警<br>-9106  边框不完整告警<br>注：告警码可以同时存在多个</p>
     * @param RecognizeWarnCode <p>Code 告警码列表和释义：<br>-9102  复印件告警<br>-9103  翻拍件告警<br>-9104  反光告警<br>-9105  模糊告警<br>-9106  边框不完整告警<br>注：告警码可以同时存在多个</p>
     */
    public void setRecognizeWarnCode(Long [] RecognizeWarnCode) {
        this.RecognizeWarnCode = RecognizeWarnCode;
    }

    /**
     * Get <p>告警码说明：<br>WARN_DRIVER_LICENSE_COPY_CARD 复印件告警<br>WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警<br>WARN_DRIVER_LICENSE_REFLECTION 反光告警<br>WARN_DRIVER_LICENSE_BLUR 模糊告警<br>WARN_DRIVER_LICENSE_BORDER_INCOMPLETE 边框不完整告警<br>注：告警信息可以同时存在多个</p> 
     * @return RecognizeWarnMsg <p>告警码说明：<br>WARN_DRIVER_LICENSE_COPY_CARD 复印件告警<br>WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警<br>WARN_DRIVER_LICENSE_REFLECTION 反光告警<br>WARN_DRIVER_LICENSE_BLUR 模糊告警<br>WARN_DRIVER_LICENSE_BORDER_INCOMPLETE 边框不完整告警<br>注：告警信息可以同时存在多个</p>
     */
    public String [] getRecognizeWarnMsg() {
        return this.RecognizeWarnMsg;
    }

    /**
     * Set <p>告警码说明：<br>WARN_DRIVER_LICENSE_COPY_CARD 复印件告警<br>WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警<br>WARN_DRIVER_LICENSE_REFLECTION 反光告警<br>WARN_DRIVER_LICENSE_BLUR 模糊告警<br>WARN_DRIVER_LICENSE_BORDER_INCOMPLETE 边框不完整告警<br>注：告警信息可以同时存在多个</p>
     * @param RecognizeWarnMsg <p>告警码说明：<br>WARN_DRIVER_LICENSE_COPY_CARD 复印件告警<br>WARN_DRIVER_LICENSE_SCREENED_CARD 翻拍件告警<br>WARN_DRIVER_LICENSE_REFLECTION 反光告警<br>WARN_DRIVER_LICENSE_BLUR 模糊告警<br>WARN_DRIVER_LICENSE_BORDER_INCOMPLETE 边框不完整告警<br>注：告警信息可以同时存在多个</p>
     */
    public void setRecognizeWarnMsg(String [] RecognizeWarnMsg) {
        this.RecognizeWarnMsg = RecognizeWarnMsg;
    }

    /**
     * Get <p>发证单位</p> 
     * @return IssuingAuthority <p>发证单位</p>
     */
    public String getIssuingAuthority() {
        return this.IssuingAuthority;
    }

    /**
     * Set <p>发证单位</p>
     * @param IssuingAuthority <p>发证单位</p>
     */
    public void setIssuingAuthority(String IssuingAuthority) {
        this.IssuingAuthority = IssuingAuthority;
    }

    /**
     * Get <p>状态（仅电子驾驶证支持返回该字段）</p> 
     * @return State <p>状态（仅电子驾驶证支持返回该字段）</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>状态（仅电子驾驶证支持返回该字段）</p>
     * @param State <p>状态（仅电子驾驶证支持返回该字段）</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>累积记分（仅电子驾驶证支持返回该字段）</p> 
     * @return CumulativeScore <p>累积记分（仅电子驾驶证支持返回该字段）</p>
     */
    public String getCumulativeScore() {
        return this.CumulativeScore;
    }

    /**
     * Set <p>累积记分（仅电子驾驶证支持返回该字段）</p>
     * @param CumulativeScore <p>累积记分（仅电子驾驶证支持返回该字段）</p>
     */
    public void setCumulativeScore(String CumulativeScore) {
        this.CumulativeScore = CumulativeScore;
    }

    /**
     * Get <p>当前时间（仅电子驾驶证支持返回该字段）</p> 
     * @return CurrentTime <p>当前时间（仅电子驾驶证支持返回该字段）</p>
     */
    public String getCurrentTime() {
        return this.CurrentTime;
    }

    /**
     * Set <p>当前时间（仅电子驾驶证支持返回该字段）</p>
     * @param CurrentTime <p>当前时间（仅电子驾驶证支持返回该字段）</p>
     */
    public void setCurrentTime(String CurrentTime) {
        this.CurrentTime = CurrentTime;
    }

    /**
     * Get <p>生成时间（仅电子驾驶证支持返回该字段）</p> 
     * @return GenerateTime <p>生成时间（仅电子驾驶证支持返回该字段）</p>
     */
    public String getGenerateTime() {
        return this.GenerateTime;
    }

    /**
     * Set <p>生成时间（仅电子驾驶证支持返回该字段）</p>
     * @param GenerateTime <p>生成时间（仅电子驾驶证支持返回该字段）</p>
     */
    public void setGenerateTime(String GenerateTime) {
        this.GenerateTime = GenerateTime;
    }

    /**
     * Get <p>驾驶证副页姓名</p> 
     * @return BackPageName <p>驾驶证副页姓名</p>
     */
    public String getBackPageName() {
        return this.BackPageName;
    }

    /**
     * Set <p>驾驶证副页姓名</p>
     * @param BackPageName <p>驾驶证副页姓名</p>
     */
    public void setBackPageName(String BackPageName) {
        this.BackPageName = BackPageName;
    }

    /**
     * Get <p>驾驶证副页证号</p> 
     * @return BackPageCardCode <p>驾驶证副页证号</p>
     */
    public String getBackPageCardCode() {
        return this.BackPageCardCode;
    }

    /**
     * Set <p>驾驶证副页证号</p>
     * @param BackPageCardCode <p>驾驶证副页证号</p>
     */
    public void setBackPageCardCode(String BackPageCardCode) {
        this.BackPageCardCode = BackPageCardCode;
    }

    /**
     * Get <p>驾驶证类型<br>电子驾驶证：Electronic<br>普通驾驶证：Normal</p> 
     * @return DriverLicenseType <p>驾驶证类型<br>电子驾驶证：Electronic<br>普通驾驶证：Normal</p>
     */
    public String getDriverLicenseType() {
        return this.DriverLicenseType;
    }

    /**
     * Set <p>驾驶证类型<br>电子驾驶证：Electronic<br>普通驾驶证：Normal</p>
     * @param DriverLicenseType <p>驾驶证类型<br>电子驾驶证：Electronic<br>普通驾驶证：Normal</p>
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

