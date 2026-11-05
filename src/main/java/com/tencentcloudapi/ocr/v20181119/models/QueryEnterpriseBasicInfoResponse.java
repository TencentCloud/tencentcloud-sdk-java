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

public class QueryEnterpriseBasicInfoResponse extends AbstractModel {

    /**
    * <p>请求状态。<br>枚举值：<br>0：成功，计费；<br>1：系统异常，不计费；<br>2：查询无结果，不计费。</p>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * <p>统一社会信用代码。</p>
    */
    @SerializedName("CreditCode")
    @Expose
    private String CreditCode;

    /**
    * <p>企业名称。</p>
    */
    @SerializedName("EntName")
    @Expose
    private String EntName;

    /**
    * <p>主体类型。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>法人代表。</p>
    */
    @SerializedName("LrName")
    @Expose
    private String LrName;

    /**
    * <p>注册资本。</p>
    */
    @SerializedName("Capital")
    @Expose
    private String Capital;

    /**
    * <p>企业登记住所或注册地址。</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>经营范围。</p>
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * <p>登记机关。</p>
    */
    @SerializedName("RegistrationAuthority")
    @Expose
    private String RegistrationAuthority;

    /**
    * <p>经营状态（标准化），枚举值：<br>1：开业（在营）；<br>2：迁出；<br>3：注销；<br>4：吊销；<br>5：撤销；<br>6：停业；<br>7：撤销登记；<br>0：其他；/：无法查询。</p>
    */
    @SerializedName("OperatingStatus")
    @Expose
    private String OperatingStatus;

    /**
    * <p>经营状态（原始值）。</p>
    */
    @SerializedName("RawOperatingStatus")
    @Expose
    private String RawOperatingStatus;

    /**
    * <p>成立日期。</p>
    */
    @SerializedName("SetDate")
    @Expose
    private String SetDate;

    /**
    * <p>营业期限：一般包括营业开始时间和结束时间<br>参数格式：yyyy-MM-dd/yyyy-MM-dd<br>无固定期限的格式为：yyyy-MM-dd/<br>部分企业历史数据可能为空，将返回：/<br>无法查询，将返回：/</p>
    */
    @SerializedName("OperatingPeriod")
    @Expose
    private String OperatingPeriod;

    /**
    * <p>核准日期。</p>
    */
    @SerializedName("ApprovalDate")
    @Expose
    private String ApprovalDate;

    /**
    * <p>所在省份。</p>
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * <p>所在省份的行政区划代码。</p>
    */
    @SerializedName("ProvinceCode")
    @Expose
    private String ProvinceCode;

    /**
    * <p>所在城市。</p>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * <p>所在城市的行政区划代码。</p>
    */
    @SerializedName("CityCode")
    @Expose
    private String CityCode;

    /**
    * <p>所在区县。</p>
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * <p>所在区县的行政区划代码。</p>
    */
    @SerializedName("DistrictCode")
    @Expose
    private String DistrictCode;

    /**
    * <p>注册资本币种。</p>
    */
    @SerializedName("CapitalCurrency")
    @Expose
    private String CapitalCurrency;

    /**
    * <p>组织机构代码。</p>
    */
    @SerializedName("OrganizationCode")
    @Expose
    private String OrganizationCode;

    /**
    * <p>企业英文名称。</p>
    */
    @SerializedName("EnglishName")
    @Expose
    private String EnglishName;

    /**
    * <p>企业曾用名列表。</p>
    */
    @SerializedName("FormerNames")
    @Expose
    private String [] FormerNames;

    /**
    * <p>原注册号。</p>
    */
    @SerializedName("OriginalRegNum")
    @Expose
    private String OriginalRegNum;

    /**
    * <p>实收资本。</p>
    */
    @SerializedName("PaidInCapital")
    @Expose
    private String PaidInCapital;

    /**
    * <p>吊销日期。</p>
    */
    @SerializedName("RevokeDate")
    @Expose
    private String RevokeDate;

    /**
    * <p>吊销原因。</p>
    */
    @SerializedName("RevokeReason")
    @Expose
    private String RevokeReason;

    /**
    * <p>注销日期。</p>
    */
    @SerializedName("CancellationDate")
    @Expose
    private String CancellationDate;

    /**
    * <p>注销原因。</p>
    */
    @SerializedName("CancellationReason")
    @Expose
    private String CancellationReason;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>请求状态。<br>枚举值：<br>0：成功，计费；<br>1：系统异常，不计费；<br>2：查询无结果，不计费。</p> 
     * @return StatusCode <p>请求状态。<br>枚举值：<br>0：成功，计费；<br>1：系统异常，不计费；<br>2：查询无结果，不计费。</p>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set <p>请求状态。<br>枚举值：<br>0：成功，计费；<br>1：系统异常，不计费；<br>2：查询无结果，不计费。</p>
     * @param StatusCode <p>请求状态。<br>枚举值：<br>0：成功，计费；<br>1：系统异常，不计费；<br>2：查询无结果，不计费。</p>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get <p>统一社会信用代码。</p> 
     * @return CreditCode <p>统一社会信用代码。</p>
     */
    public String getCreditCode() {
        return this.CreditCode;
    }

    /**
     * Set <p>统一社会信用代码。</p>
     * @param CreditCode <p>统一社会信用代码。</p>
     */
    public void setCreditCode(String CreditCode) {
        this.CreditCode = CreditCode;
    }

    /**
     * Get <p>企业名称。</p> 
     * @return EntName <p>企业名称。</p>
     */
    public String getEntName() {
        return this.EntName;
    }

    /**
     * Set <p>企业名称。</p>
     * @param EntName <p>企业名称。</p>
     */
    public void setEntName(String EntName) {
        this.EntName = EntName;
    }

    /**
     * Get <p>主体类型。</p> 
     * @return Type <p>主体类型。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>主体类型。</p>
     * @param Type <p>主体类型。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>法人代表。</p> 
     * @return LrName <p>法人代表。</p>
     */
    public String getLrName() {
        return this.LrName;
    }

    /**
     * Set <p>法人代表。</p>
     * @param LrName <p>法人代表。</p>
     */
    public void setLrName(String LrName) {
        this.LrName = LrName;
    }

    /**
     * Get <p>注册资本。</p> 
     * @return Capital <p>注册资本。</p>
     */
    public String getCapital() {
        return this.Capital;
    }

    /**
     * Set <p>注册资本。</p>
     * @param Capital <p>注册资本。</p>
     */
    public void setCapital(String Capital) {
        this.Capital = Capital;
    }

    /**
     * Get <p>企业登记住所或注册地址。</p> 
     * @return Address <p>企业登记住所或注册地址。</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>企业登记住所或注册地址。</p>
     * @param Address <p>企业登记住所或注册地址。</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>经营范围。</p> 
     * @return Business <p>经营范围。</p>
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>经营范围。</p>
     * @param Business <p>经营范围。</p>
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get <p>登记机关。</p> 
     * @return RegistrationAuthority <p>登记机关。</p>
     */
    public String getRegistrationAuthority() {
        return this.RegistrationAuthority;
    }

    /**
     * Set <p>登记机关。</p>
     * @param RegistrationAuthority <p>登记机关。</p>
     */
    public void setRegistrationAuthority(String RegistrationAuthority) {
        this.RegistrationAuthority = RegistrationAuthority;
    }

    /**
     * Get <p>经营状态（标准化），枚举值：<br>1：开业（在营）；<br>2：迁出；<br>3：注销；<br>4：吊销；<br>5：撤销；<br>6：停业；<br>7：撤销登记；<br>0：其他；/：无法查询。</p> 
     * @return OperatingStatus <p>经营状态（标准化），枚举值：<br>1：开业（在营）；<br>2：迁出；<br>3：注销；<br>4：吊销；<br>5：撤销；<br>6：停业；<br>7：撤销登记；<br>0：其他；/：无法查询。</p>
     */
    public String getOperatingStatus() {
        return this.OperatingStatus;
    }

    /**
     * Set <p>经营状态（标准化），枚举值：<br>1：开业（在营）；<br>2：迁出；<br>3：注销；<br>4：吊销；<br>5：撤销；<br>6：停业；<br>7：撤销登记；<br>0：其他；/：无法查询。</p>
     * @param OperatingStatus <p>经营状态（标准化），枚举值：<br>1：开业（在营）；<br>2：迁出；<br>3：注销；<br>4：吊销；<br>5：撤销；<br>6：停业；<br>7：撤销登记；<br>0：其他；/：无法查询。</p>
     */
    public void setOperatingStatus(String OperatingStatus) {
        this.OperatingStatus = OperatingStatus;
    }

    /**
     * Get <p>经营状态（原始值）。</p> 
     * @return RawOperatingStatus <p>经营状态（原始值）。</p>
     */
    public String getRawOperatingStatus() {
        return this.RawOperatingStatus;
    }

    /**
     * Set <p>经营状态（原始值）。</p>
     * @param RawOperatingStatus <p>经营状态（原始值）。</p>
     */
    public void setRawOperatingStatus(String RawOperatingStatus) {
        this.RawOperatingStatus = RawOperatingStatus;
    }

    /**
     * Get <p>成立日期。</p> 
     * @return SetDate <p>成立日期。</p>
     */
    public String getSetDate() {
        return this.SetDate;
    }

    /**
     * Set <p>成立日期。</p>
     * @param SetDate <p>成立日期。</p>
     */
    public void setSetDate(String SetDate) {
        this.SetDate = SetDate;
    }

    /**
     * Get <p>营业期限：一般包括营业开始时间和结束时间<br>参数格式：yyyy-MM-dd/yyyy-MM-dd<br>无固定期限的格式为：yyyy-MM-dd/<br>部分企业历史数据可能为空，将返回：/<br>无法查询，将返回：/</p> 
     * @return OperatingPeriod <p>营业期限：一般包括营业开始时间和结束时间<br>参数格式：yyyy-MM-dd/yyyy-MM-dd<br>无固定期限的格式为：yyyy-MM-dd/<br>部分企业历史数据可能为空，将返回：/<br>无法查询，将返回：/</p>
     */
    public String getOperatingPeriod() {
        return this.OperatingPeriod;
    }

    /**
     * Set <p>营业期限：一般包括营业开始时间和结束时间<br>参数格式：yyyy-MM-dd/yyyy-MM-dd<br>无固定期限的格式为：yyyy-MM-dd/<br>部分企业历史数据可能为空，将返回：/<br>无法查询，将返回：/</p>
     * @param OperatingPeriod <p>营业期限：一般包括营业开始时间和结束时间<br>参数格式：yyyy-MM-dd/yyyy-MM-dd<br>无固定期限的格式为：yyyy-MM-dd/<br>部分企业历史数据可能为空，将返回：/<br>无法查询，将返回：/</p>
     */
    public void setOperatingPeriod(String OperatingPeriod) {
        this.OperatingPeriod = OperatingPeriod;
    }

    /**
     * Get <p>核准日期。</p> 
     * @return ApprovalDate <p>核准日期。</p>
     */
    public String getApprovalDate() {
        return this.ApprovalDate;
    }

    /**
     * Set <p>核准日期。</p>
     * @param ApprovalDate <p>核准日期。</p>
     */
    public void setApprovalDate(String ApprovalDate) {
        this.ApprovalDate = ApprovalDate;
    }

    /**
     * Get <p>所在省份。</p> 
     * @return Province <p>所在省份。</p>
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set <p>所在省份。</p>
     * @param Province <p>所在省份。</p>
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get <p>所在省份的行政区划代码。</p> 
     * @return ProvinceCode <p>所在省份的行政区划代码。</p>
     */
    public String getProvinceCode() {
        return this.ProvinceCode;
    }

    /**
     * Set <p>所在省份的行政区划代码。</p>
     * @param ProvinceCode <p>所在省份的行政区划代码。</p>
     */
    public void setProvinceCode(String ProvinceCode) {
        this.ProvinceCode = ProvinceCode;
    }

    /**
     * Get <p>所在城市。</p> 
     * @return City <p>所在城市。</p>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set <p>所在城市。</p>
     * @param City <p>所在城市。</p>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get <p>所在城市的行政区划代码。</p> 
     * @return CityCode <p>所在城市的行政区划代码。</p>
     */
    public String getCityCode() {
        return this.CityCode;
    }

    /**
     * Set <p>所在城市的行政区划代码。</p>
     * @param CityCode <p>所在城市的行政区划代码。</p>
     */
    public void setCityCode(String CityCode) {
        this.CityCode = CityCode;
    }

    /**
     * Get <p>所在区县。</p> 
     * @return District <p>所在区县。</p>
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set <p>所在区县。</p>
     * @param District <p>所在区县。</p>
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get <p>所在区县的行政区划代码。</p> 
     * @return DistrictCode <p>所在区县的行政区划代码。</p>
     */
    public String getDistrictCode() {
        return this.DistrictCode;
    }

    /**
     * Set <p>所在区县的行政区划代码。</p>
     * @param DistrictCode <p>所在区县的行政区划代码。</p>
     */
    public void setDistrictCode(String DistrictCode) {
        this.DistrictCode = DistrictCode;
    }

    /**
     * Get <p>注册资本币种。</p> 
     * @return CapitalCurrency <p>注册资本币种。</p>
     */
    public String getCapitalCurrency() {
        return this.CapitalCurrency;
    }

    /**
     * Set <p>注册资本币种。</p>
     * @param CapitalCurrency <p>注册资本币种。</p>
     */
    public void setCapitalCurrency(String CapitalCurrency) {
        this.CapitalCurrency = CapitalCurrency;
    }

    /**
     * Get <p>组织机构代码。</p> 
     * @return OrganizationCode <p>组织机构代码。</p>
     */
    public String getOrganizationCode() {
        return this.OrganizationCode;
    }

    /**
     * Set <p>组织机构代码。</p>
     * @param OrganizationCode <p>组织机构代码。</p>
     */
    public void setOrganizationCode(String OrganizationCode) {
        this.OrganizationCode = OrganizationCode;
    }

    /**
     * Get <p>企业英文名称。</p> 
     * @return EnglishName <p>企业英文名称。</p>
     */
    public String getEnglishName() {
        return this.EnglishName;
    }

    /**
     * Set <p>企业英文名称。</p>
     * @param EnglishName <p>企业英文名称。</p>
     */
    public void setEnglishName(String EnglishName) {
        this.EnglishName = EnglishName;
    }

    /**
     * Get <p>企业曾用名列表。</p> 
     * @return FormerNames <p>企业曾用名列表。</p>
     */
    public String [] getFormerNames() {
        return this.FormerNames;
    }

    /**
     * Set <p>企业曾用名列表。</p>
     * @param FormerNames <p>企业曾用名列表。</p>
     */
    public void setFormerNames(String [] FormerNames) {
        this.FormerNames = FormerNames;
    }

    /**
     * Get <p>原注册号。</p> 
     * @return OriginalRegNum <p>原注册号。</p>
     */
    public String getOriginalRegNum() {
        return this.OriginalRegNum;
    }

    /**
     * Set <p>原注册号。</p>
     * @param OriginalRegNum <p>原注册号。</p>
     */
    public void setOriginalRegNum(String OriginalRegNum) {
        this.OriginalRegNum = OriginalRegNum;
    }

    /**
     * Get <p>实收资本。</p> 
     * @return PaidInCapital <p>实收资本。</p>
     */
    public String getPaidInCapital() {
        return this.PaidInCapital;
    }

    /**
     * Set <p>实收资本。</p>
     * @param PaidInCapital <p>实收资本。</p>
     */
    public void setPaidInCapital(String PaidInCapital) {
        this.PaidInCapital = PaidInCapital;
    }

    /**
     * Get <p>吊销日期。</p> 
     * @return RevokeDate <p>吊销日期。</p>
     */
    public String getRevokeDate() {
        return this.RevokeDate;
    }

    /**
     * Set <p>吊销日期。</p>
     * @param RevokeDate <p>吊销日期。</p>
     */
    public void setRevokeDate(String RevokeDate) {
        this.RevokeDate = RevokeDate;
    }

    /**
     * Get <p>吊销原因。</p> 
     * @return RevokeReason <p>吊销原因。</p>
     */
    public String getRevokeReason() {
        return this.RevokeReason;
    }

    /**
     * Set <p>吊销原因。</p>
     * @param RevokeReason <p>吊销原因。</p>
     */
    public void setRevokeReason(String RevokeReason) {
        this.RevokeReason = RevokeReason;
    }

    /**
     * Get <p>注销日期。</p> 
     * @return CancellationDate <p>注销日期。</p>
     */
    public String getCancellationDate() {
        return this.CancellationDate;
    }

    /**
     * Set <p>注销日期。</p>
     * @param CancellationDate <p>注销日期。</p>
     */
    public void setCancellationDate(String CancellationDate) {
        this.CancellationDate = CancellationDate;
    }

    /**
     * Get <p>注销原因。</p> 
     * @return CancellationReason <p>注销原因。</p>
     */
    public String getCancellationReason() {
        return this.CancellationReason;
    }

    /**
     * Set <p>注销原因。</p>
     * @param CancellationReason <p>注销原因。</p>
     */
    public void setCancellationReason(String CancellationReason) {
        this.CancellationReason = CancellationReason;
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

    public QueryEnterpriseBasicInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryEnterpriseBasicInfoResponse(QueryEnterpriseBasicInfoResponse source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.CreditCode != null) {
            this.CreditCode = new String(source.CreditCode);
        }
        if (source.EntName != null) {
            this.EntName = new String(source.EntName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LrName != null) {
            this.LrName = new String(source.LrName);
        }
        if (source.Capital != null) {
            this.Capital = new String(source.Capital);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.RegistrationAuthority != null) {
            this.RegistrationAuthority = new String(source.RegistrationAuthority);
        }
        if (source.OperatingStatus != null) {
            this.OperatingStatus = new String(source.OperatingStatus);
        }
        if (source.RawOperatingStatus != null) {
            this.RawOperatingStatus = new String(source.RawOperatingStatus);
        }
        if (source.SetDate != null) {
            this.SetDate = new String(source.SetDate);
        }
        if (source.OperatingPeriod != null) {
            this.OperatingPeriod = new String(source.OperatingPeriod);
        }
        if (source.ApprovalDate != null) {
            this.ApprovalDate = new String(source.ApprovalDate);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.ProvinceCode != null) {
            this.ProvinceCode = new String(source.ProvinceCode);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.CityCode != null) {
            this.CityCode = new String(source.CityCode);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.DistrictCode != null) {
            this.DistrictCode = new String(source.DistrictCode);
        }
        if (source.CapitalCurrency != null) {
            this.CapitalCurrency = new String(source.CapitalCurrency);
        }
        if (source.OrganizationCode != null) {
            this.OrganizationCode = new String(source.OrganizationCode);
        }
        if (source.EnglishName != null) {
            this.EnglishName = new String(source.EnglishName);
        }
        if (source.FormerNames != null) {
            this.FormerNames = new String[source.FormerNames.length];
            for (int i = 0; i < source.FormerNames.length; i++) {
                this.FormerNames[i] = new String(source.FormerNames[i]);
            }
        }
        if (source.OriginalRegNum != null) {
            this.OriginalRegNum = new String(source.OriginalRegNum);
        }
        if (source.PaidInCapital != null) {
            this.PaidInCapital = new String(source.PaidInCapital);
        }
        if (source.RevokeDate != null) {
            this.RevokeDate = new String(source.RevokeDate);
        }
        if (source.RevokeReason != null) {
            this.RevokeReason = new String(source.RevokeReason);
        }
        if (source.CancellationDate != null) {
            this.CancellationDate = new String(source.CancellationDate);
        }
        if (source.CancellationReason != null) {
            this.CancellationReason = new String(source.CancellationReason);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "CreditCode", this.CreditCode);
        this.setParamSimple(map, prefix + "EntName", this.EntName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "LrName", this.LrName);
        this.setParamSimple(map, prefix + "Capital", this.Capital);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "RegistrationAuthority", this.RegistrationAuthority);
        this.setParamSimple(map, prefix + "OperatingStatus", this.OperatingStatus);
        this.setParamSimple(map, prefix + "RawOperatingStatus", this.RawOperatingStatus);
        this.setParamSimple(map, prefix + "SetDate", this.SetDate);
        this.setParamSimple(map, prefix + "OperatingPeriod", this.OperatingPeriod);
        this.setParamSimple(map, prefix + "ApprovalDate", this.ApprovalDate);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "ProvinceCode", this.ProvinceCode);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "CityCode", this.CityCode);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "DistrictCode", this.DistrictCode);
        this.setParamSimple(map, prefix + "CapitalCurrency", this.CapitalCurrency);
        this.setParamSimple(map, prefix + "OrganizationCode", this.OrganizationCode);
        this.setParamSimple(map, prefix + "EnglishName", this.EnglishName);
        this.setParamArraySimple(map, prefix + "FormerNames.", this.FormerNames);
        this.setParamSimple(map, prefix + "OriginalRegNum", this.OriginalRegNum);
        this.setParamSimple(map, prefix + "PaidInCapital", this.PaidInCapital);
        this.setParamSimple(map, prefix + "RevokeDate", this.RevokeDate);
        this.setParamSimple(map, prefix + "RevokeReason", this.RevokeReason);
        this.setParamSimple(map, prefix + "CancellationDate", this.CancellationDate);
        this.setParamSimple(map, prefix + "CancellationReason", this.CancellationReason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

