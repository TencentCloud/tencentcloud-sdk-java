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

public class RecognizeForeignPermanentResidentIdCardResponse extends AbstractModel {

    /**
    * 中文姓名。
    */
    @SerializedName("CnName")
    @Expose
    private String CnName;

    /**
    * 英文名。
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * 性别。
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 出生日期。规范格式为 XXXX年XX月XX日。
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * 国籍。
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 有效期限。
    */
    @SerializedName("PeriodOfValidity")
    @Expose
    private String PeriodOfValidity;

    /**
    * 证件号码。
    */
    @SerializedName("No")
    @Expose
    private String No;

    /**
    * 曾持证件号码。
    */
    @SerializedName("PreviousNumber")
    @Expose
    private String PreviousNumber;

    /**
    * 签发机关。
    */
    @SerializedName("IssuedAuthority")
    @Expose
    private String IssuedAuthority;

    /**
    * 头像和坐标信息。
    */
    @SerializedName("PortraitImageInfo")
    @Expose
    private PortraitImageInfo PortraitImageInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 中文姓名。 
     * @return CnName 中文姓名。
     */
    public String getCnName() {
        return this.CnName;
    }

    /**
     * Set 中文姓名。
     * @param CnName 中文姓名。
     */
    public void setCnName(String CnName) {
        this.CnName = CnName;
    }

    /**
     * Get 英文名。 
     * @return EnName 英文名。
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set 英文名。
     * @param EnName 英文名。
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get 性别。 
     * @return Sex 性别。
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别。
     * @param Sex 性别。
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 出生日期。规范格式为 XXXX年XX月XX日。 
     * @return DateOfBirth 出生日期。规范格式为 XXXX年XX月XX日。
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set 出生日期。规范格式为 XXXX年XX月XX日。
     * @param DateOfBirth 出生日期。规范格式为 XXXX年XX月XX日。
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get 国籍。 
     * @return Nationality 国籍。
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set 国籍。
     * @param Nationality 国籍。
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 有效期限。 
     * @return PeriodOfValidity 有效期限。
     */
    public String getPeriodOfValidity() {
        return this.PeriodOfValidity;
    }

    /**
     * Set 有效期限。
     * @param PeriodOfValidity 有效期限。
     */
    public void setPeriodOfValidity(String PeriodOfValidity) {
        this.PeriodOfValidity = PeriodOfValidity;
    }

    /**
     * Get 证件号码。 
     * @return No 证件号码。
     */
    public String getNo() {
        return this.No;
    }

    /**
     * Set 证件号码。
     * @param No 证件号码。
     */
    public void setNo(String No) {
        this.No = No;
    }

    /**
     * Get 曾持证件号码。 
     * @return PreviousNumber 曾持证件号码。
     */
    public String getPreviousNumber() {
        return this.PreviousNumber;
    }

    /**
     * Set 曾持证件号码。
     * @param PreviousNumber 曾持证件号码。
     */
    public void setPreviousNumber(String PreviousNumber) {
        this.PreviousNumber = PreviousNumber;
    }

    /**
     * Get 签发机关。 
     * @return IssuedAuthority 签发机关。
     */
    public String getIssuedAuthority() {
        return this.IssuedAuthority;
    }

    /**
     * Set 签发机关。
     * @param IssuedAuthority 签发机关。
     */
    public void setIssuedAuthority(String IssuedAuthority) {
        this.IssuedAuthority = IssuedAuthority;
    }

    /**
     * Get 头像和坐标信息。 
     * @return PortraitImageInfo 头像和坐标信息。
     */
    public PortraitImageInfo getPortraitImageInfo() {
        return this.PortraitImageInfo;
    }

    /**
     * Set 头像和坐标信息。
     * @param PortraitImageInfo 头像和坐标信息。
     */
    public void setPortraitImageInfo(PortraitImageInfo PortraitImageInfo) {
        this.PortraitImageInfo = PortraitImageInfo;
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

    public RecognizeForeignPermanentResidentIdCardResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeForeignPermanentResidentIdCardResponse(RecognizeForeignPermanentResidentIdCardResponse source) {
        if (source.CnName != null) {
            this.CnName = new String(source.CnName);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.DateOfBirth != null) {
            this.DateOfBirth = new String(source.DateOfBirth);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.PeriodOfValidity != null) {
            this.PeriodOfValidity = new String(source.PeriodOfValidity);
        }
        if (source.No != null) {
            this.No = new String(source.No);
        }
        if (source.PreviousNumber != null) {
            this.PreviousNumber = new String(source.PreviousNumber);
        }
        if (source.IssuedAuthority != null) {
            this.IssuedAuthority = new String(source.IssuedAuthority);
        }
        if (source.PortraitImageInfo != null) {
            this.PortraitImageInfo = new PortraitImageInfo(source.PortraitImageInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CnName", this.CnName);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "DateOfBirth", this.DateOfBirth);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "PeriodOfValidity", this.PeriodOfValidity);
        this.setParamSimple(map, prefix + "No", this.No);
        this.setParamSimple(map, prefix + "PreviousNumber", this.PreviousNumber);
        this.setParamSimple(map, prefix + "IssuedAuthority", this.IssuedAuthority);
        this.setParamObj(map, prefix + "PortraitImageInfo.", this.PortraitImageInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

