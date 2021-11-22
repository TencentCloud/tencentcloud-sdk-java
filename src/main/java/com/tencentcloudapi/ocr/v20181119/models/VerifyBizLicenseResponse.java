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

public class VerifyBizLicenseResponse extends AbstractModel{

    /**
    * 状态码
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 统一社会信用代码
    */
    @SerializedName("CreditCode")
    @Expose
    private String CreditCode;

    /**
    * 组织机构代码
    */
    @SerializedName("OrgCode")
    @Expose
    private String OrgCode;

    /**
    * 经营期限自（YYYY-MM-DD）
    */
    @SerializedName("OpenFrom")
    @Expose
    private String OpenFrom;

    /**
    * 经营期限至（YYYY-MM-DD）
    */
    @SerializedName("OpenTo")
    @Expose
    private String OpenTo;

    /**
    * 法人姓名
    */
    @SerializedName("FrName")
    @Expose
    private String FrName;

    /**
    * 经营状态，包括：成立、筹建、存续、在营、开业、在册、正常经营、开业登记中、登记成立、撤销、撤销登记、非正常户、告解、个体暂时吊销、个体转企业、吊销（未注销）、拟注销、已注销、（待）迁入、（待）迁出、停业、歇业、清算等。
    */
    @SerializedName("EnterpriseStatus")
    @Expose
    private String EnterpriseStatus;

    /**
    * 经营（业务）范围及方式
    */
    @SerializedName("OperateScopeAndForm")
    @Expose
    private String OperateScopeAndForm;

    /**
    * 注册资金（单位:万元）
    */
    @SerializedName("RegCap")
    @Expose
    private String RegCap;

    /**
    * 注册币种
    */
    @SerializedName("RegCapCur")
    @Expose
    private String RegCapCur;

    /**
    * 登记机关
    */
    @SerializedName("RegOrg")
    @Expose
    private String RegOrg;

    /**
    * 开业日期（YYYY-MM-DD）
    */
    @SerializedName("EsDate")
    @Expose
    private String EsDate;

    /**
    * 企业（机构）类型
    */
    @SerializedName("EnterpriseType")
    @Expose
    private String EnterpriseType;

    /**
    * 注销日期
    */
    @SerializedName("CancelDate")
    @Expose
    private String CancelDate;

    /**
    * 吊销日期
    */
    @SerializedName("RevokeDate")
    @Expose
    private String RevokeDate;

    /**
    * 许可经营项目
    */
    @SerializedName("AbuItem")
    @Expose
    private String AbuItem;

    /**
    * 一般经营项目
    */
    @SerializedName("CbuItem")
    @Expose
    private String CbuItem;

    /**
    * 核准时间
    */
    @SerializedName("ApprDate")
    @Expose
    private String ApprDate;

    /**
    * 省（返回空值）
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 地级市（返回空值）
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 区\县（返回空值）
    */
    @SerializedName("County")
    @Expose
    private String County;

    /**
    * 住所所在行政区划代码（返回空值）
    */
    @SerializedName("AreaCode")
    @Expose
    private String AreaCode;

    /**
    * 行业门类代码（返回空值）
    */
    @SerializedName("IndustryPhyCode")
    @Expose
    private String IndustryPhyCode;

    /**
    * 行业门类名称（返回空值）
    */
    @SerializedName("IndustryPhyName")
    @Expose
    private String IndustryPhyName;

    /**
    * 国民经济行业代码（返回空值）
    */
    @SerializedName("IndustryCode")
    @Expose
    private String IndustryCode;

    /**
    * 国民经济行业名称（返回空值）
    */
    @SerializedName("IndustryName")
    @Expose
    private String IndustryName;

    /**
    * 经营（业务）范围
    */
    @SerializedName("OperateScope")
    @Expose
    private String OperateScope;

    /**
    * 要核验的工商注册号
    */
    @SerializedName("VerifyRegNo")
    @Expose
    private String VerifyRegNo;

    /**
    * 工商注册号
    */
    @SerializedName("RegNo")
    @Expose
    private String RegNo;

    /**
    * 要核验的企业名称
    */
    @SerializedName("VerifyEnterpriseName")
    @Expose
    private String VerifyEnterpriseName;

    /**
    * 企业名称
    */
    @SerializedName("EnterpriseName")
    @Expose
    private String EnterpriseName;

    /**
    * 要核验的注册地址
    */
    @SerializedName("VerifyAddress")
    @Expose
    private String VerifyAddress;

    /**
    * 注册地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 验证结果
    */
    @SerializedName("RegNumResult")
    @Expose
    private BizLicenseVerifyResult RegNumResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 状态码 
     * @return ErrorCode 状态码
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 状态码
     * @param ErrorCode 状态码
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 统一社会信用代码 
     * @return CreditCode 统一社会信用代码
     */
    public String getCreditCode() {
        return this.CreditCode;
    }

    /**
     * Set 统一社会信用代码
     * @param CreditCode 统一社会信用代码
     */
    public void setCreditCode(String CreditCode) {
        this.CreditCode = CreditCode;
    }

    /**
     * Get 组织机构代码 
     * @return OrgCode 组织机构代码
     */
    public String getOrgCode() {
        return this.OrgCode;
    }

    /**
     * Set 组织机构代码
     * @param OrgCode 组织机构代码
     */
    public void setOrgCode(String OrgCode) {
        this.OrgCode = OrgCode;
    }

    /**
     * Get 经营期限自（YYYY-MM-DD） 
     * @return OpenFrom 经营期限自（YYYY-MM-DD）
     */
    public String getOpenFrom() {
        return this.OpenFrom;
    }

    /**
     * Set 经营期限自（YYYY-MM-DD）
     * @param OpenFrom 经营期限自（YYYY-MM-DD）
     */
    public void setOpenFrom(String OpenFrom) {
        this.OpenFrom = OpenFrom;
    }

    /**
     * Get 经营期限至（YYYY-MM-DD） 
     * @return OpenTo 经营期限至（YYYY-MM-DD）
     */
    public String getOpenTo() {
        return this.OpenTo;
    }

    /**
     * Set 经营期限至（YYYY-MM-DD）
     * @param OpenTo 经营期限至（YYYY-MM-DD）
     */
    public void setOpenTo(String OpenTo) {
        this.OpenTo = OpenTo;
    }

    /**
     * Get 法人姓名 
     * @return FrName 法人姓名
     */
    public String getFrName() {
        return this.FrName;
    }

    /**
     * Set 法人姓名
     * @param FrName 法人姓名
     */
    public void setFrName(String FrName) {
        this.FrName = FrName;
    }

    /**
     * Get 经营状态，包括：成立、筹建、存续、在营、开业、在册、正常经营、开业登记中、登记成立、撤销、撤销登记、非正常户、告解、个体暂时吊销、个体转企业、吊销（未注销）、拟注销、已注销、（待）迁入、（待）迁出、停业、歇业、清算等。 
     * @return EnterpriseStatus 经营状态，包括：成立、筹建、存续、在营、开业、在册、正常经营、开业登记中、登记成立、撤销、撤销登记、非正常户、告解、个体暂时吊销、个体转企业、吊销（未注销）、拟注销、已注销、（待）迁入、（待）迁出、停业、歇业、清算等。
     */
    public String getEnterpriseStatus() {
        return this.EnterpriseStatus;
    }

    /**
     * Set 经营状态，包括：成立、筹建、存续、在营、开业、在册、正常经营、开业登记中、登记成立、撤销、撤销登记、非正常户、告解、个体暂时吊销、个体转企业、吊销（未注销）、拟注销、已注销、（待）迁入、（待）迁出、停业、歇业、清算等。
     * @param EnterpriseStatus 经营状态，包括：成立、筹建、存续、在营、开业、在册、正常经营、开业登记中、登记成立、撤销、撤销登记、非正常户、告解、个体暂时吊销、个体转企业、吊销（未注销）、拟注销、已注销、（待）迁入、（待）迁出、停业、歇业、清算等。
     */
    public void setEnterpriseStatus(String EnterpriseStatus) {
        this.EnterpriseStatus = EnterpriseStatus;
    }

    /**
     * Get 经营（业务）范围及方式 
     * @return OperateScopeAndForm 经营（业务）范围及方式
     */
    public String getOperateScopeAndForm() {
        return this.OperateScopeAndForm;
    }

    /**
     * Set 经营（业务）范围及方式
     * @param OperateScopeAndForm 经营（业务）范围及方式
     */
    public void setOperateScopeAndForm(String OperateScopeAndForm) {
        this.OperateScopeAndForm = OperateScopeAndForm;
    }

    /**
     * Get 注册资金（单位:万元） 
     * @return RegCap 注册资金（单位:万元）
     */
    public String getRegCap() {
        return this.RegCap;
    }

    /**
     * Set 注册资金（单位:万元）
     * @param RegCap 注册资金（单位:万元）
     */
    public void setRegCap(String RegCap) {
        this.RegCap = RegCap;
    }

    /**
     * Get 注册币种 
     * @return RegCapCur 注册币种
     */
    public String getRegCapCur() {
        return this.RegCapCur;
    }

    /**
     * Set 注册币种
     * @param RegCapCur 注册币种
     */
    public void setRegCapCur(String RegCapCur) {
        this.RegCapCur = RegCapCur;
    }

    /**
     * Get 登记机关 
     * @return RegOrg 登记机关
     */
    public String getRegOrg() {
        return this.RegOrg;
    }

    /**
     * Set 登记机关
     * @param RegOrg 登记机关
     */
    public void setRegOrg(String RegOrg) {
        this.RegOrg = RegOrg;
    }

    /**
     * Get 开业日期（YYYY-MM-DD） 
     * @return EsDate 开业日期（YYYY-MM-DD）
     */
    public String getEsDate() {
        return this.EsDate;
    }

    /**
     * Set 开业日期（YYYY-MM-DD）
     * @param EsDate 开业日期（YYYY-MM-DD）
     */
    public void setEsDate(String EsDate) {
        this.EsDate = EsDate;
    }

    /**
     * Get 企业（机构）类型 
     * @return EnterpriseType 企业（机构）类型
     */
    public String getEnterpriseType() {
        return this.EnterpriseType;
    }

    /**
     * Set 企业（机构）类型
     * @param EnterpriseType 企业（机构）类型
     */
    public void setEnterpriseType(String EnterpriseType) {
        this.EnterpriseType = EnterpriseType;
    }

    /**
     * Get 注销日期 
     * @return CancelDate 注销日期
     */
    public String getCancelDate() {
        return this.CancelDate;
    }

    /**
     * Set 注销日期
     * @param CancelDate 注销日期
     */
    public void setCancelDate(String CancelDate) {
        this.CancelDate = CancelDate;
    }

    /**
     * Get 吊销日期 
     * @return RevokeDate 吊销日期
     */
    public String getRevokeDate() {
        return this.RevokeDate;
    }

    /**
     * Set 吊销日期
     * @param RevokeDate 吊销日期
     */
    public void setRevokeDate(String RevokeDate) {
        this.RevokeDate = RevokeDate;
    }

    /**
     * Get 许可经营项目 
     * @return AbuItem 许可经营项目
     */
    public String getAbuItem() {
        return this.AbuItem;
    }

    /**
     * Set 许可经营项目
     * @param AbuItem 许可经营项目
     */
    public void setAbuItem(String AbuItem) {
        this.AbuItem = AbuItem;
    }

    /**
     * Get 一般经营项目 
     * @return CbuItem 一般经营项目
     */
    public String getCbuItem() {
        return this.CbuItem;
    }

    /**
     * Set 一般经营项目
     * @param CbuItem 一般经营项目
     */
    public void setCbuItem(String CbuItem) {
        this.CbuItem = CbuItem;
    }

    /**
     * Get 核准时间 
     * @return ApprDate 核准时间
     */
    public String getApprDate() {
        return this.ApprDate;
    }

    /**
     * Set 核准时间
     * @param ApprDate 核准时间
     */
    public void setApprDate(String ApprDate) {
        this.ApprDate = ApprDate;
    }

    /**
     * Get 省（返回空值） 
     * @return Province 省（返回空值）
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省（返回空值）
     * @param Province 省（返回空值）
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 地级市（返回空值） 
     * @return City 地级市（返回空值）
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 地级市（返回空值）
     * @param City 地级市（返回空值）
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 区\县（返回空值） 
     * @return County 区\县（返回空值）
     */
    public String getCounty() {
        return this.County;
    }

    /**
     * Set 区\县（返回空值）
     * @param County 区\县（返回空值）
     */
    public void setCounty(String County) {
        this.County = County;
    }

    /**
     * Get 住所所在行政区划代码（返回空值） 
     * @return AreaCode 住所所在行政区划代码（返回空值）
     */
    public String getAreaCode() {
        return this.AreaCode;
    }

    /**
     * Set 住所所在行政区划代码（返回空值）
     * @param AreaCode 住所所在行政区划代码（返回空值）
     */
    public void setAreaCode(String AreaCode) {
        this.AreaCode = AreaCode;
    }

    /**
     * Get 行业门类代码（返回空值） 
     * @return IndustryPhyCode 行业门类代码（返回空值）
     */
    public String getIndustryPhyCode() {
        return this.IndustryPhyCode;
    }

    /**
     * Set 行业门类代码（返回空值）
     * @param IndustryPhyCode 行业门类代码（返回空值）
     */
    public void setIndustryPhyCode(String IndustryPhyCode) {
        this.IndustryPhyCode = IndustryPhyCode;
    }

    /**
     * Get 行业门类名称（返回空值） 
     * @return IndustryPhyName 行业门类名称（返回空值）
     */
    public String getIndustryPhyName() {
        return this.IndustryPhyName;
    }

    /**
     * Set 行业门类名称（返回空值）
     * @param IndustryPhyName 行业门类名称（返回空值）
     */
    public void setIndustryPhyName(String IndustryPhyName) {
        this.IndustryPhyName = IndustryPhyName;
    }

    /**
     * Get 国民经济行业代码（返回空值） 
     * @return IndustryCode 国民经济行业代码（返回空值）
     */
    public String getIndustryCode() {
        return this.IndustryCode;
    }

    /**
     * Set 国民经济行业代码（返回空值）
     * @param IndustryCode 国民经济行业代码（返回空值）
     */
    public void setIndustryCode(String IndustryCode) {
        this.IndustryCode = IndustryCode;
    }

    /**
     * Get 国民经济行业名称（返回空值） 
     * @return IndustryName 国民经济行业名称（返回空值）
     */
    public String getIndustryName() {
        return this.IndustryName;
    }

    /**
     * Set 国民经济行业名称（返回空值）
     * @param IndustryName 国民经济行业名称（返回空值）
     */
    public void setIndustryName(String IndustryName) {
        this.IndustryName = IndustryName;
    }

    /**
     * Get 经营（业务）范围 
     * @return OperateScope 经营（业务）范围
     */
    public String getOperateScope() {
        return this.OperateScope;
    }

    /**
     * Set 经营（业务）范围
     * @param OperateScope 经营（业务）范围
     */
    public void setOperateScope(String OperateScope) {
        this.OperateScope = OperateScope;
    }

    /**
     * Get 要核验的工商注册号 
     * @return VerifyRegNo 要核验的工商注册号
     */
    public String getVerifyRegNo() {
        return this.VerifyRegNo;
    }

    /**
     * Set 要核验的工商注册号
     * @param VerifyRegNo 要核验的工商注册号
     */
    public void setVerifyRegNo(String VerifyRegNo) {
        this.VerifyRegNo = VerifyRegNo;
    }

    /**
     * Get 工商注册号 
     * @return RegNo 工商注册号
     */
    public String getRegNo() {
        return this.RegNo;
    }

    /**
     * Set 工商注册号
     * @param RegNo 工商注册号
     */
    public void setRegNo(String RegNo) {
        this.RegNo = RegNo;
    }

    /**
     * Get 要核验的企业名称 
     * @return VerifyEnterpriseName 要核验的企业名称
     */
    public String getVerifyEnterpriseName() {
        return this.VerifyEnterpriseName;
    }

    /**
     * Set 要核验的企业名称
     * @param VerifyEnterpriseName 要核验的企业名称
     */
    public void setVerifyEnterpriseName(String VerifyEnterpriseName) {
        this.VerifyEnterpriseName = VerifyEnterpriseName;
    }

    /**
     * Get 企业名称 
     * @return EnterpriseName 企业名称
     */
    public String getEnterpriseName() {
        return this.EnterpriseName;
    }

    /**
     * Set 企业名称
     * @param EnterpriseName 企业名称
     */
    public void setEnterpriseName(String EnterpriseName) {
        this.EnterpriseName = EnterpriseName;
    }

    /**
     * Get 要核验的注册地址 
     * @return VerifyAddress 要核验的注册地址
     */
    public String getVerifyAddress() {
        return this.VerifyAddress;
    }

    /**
     * Set 要核验的注册地址
     * @param VerifyAddress 要核验的注册地址
     */
    public void setVerifyAddress(String VerifyAddress) {
        this.VerifyAddress = VerifyAddress;
    }

    /**
     * Get 注册地址 
     * @return Address 注册地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 注册地址
     * @param Address 注册地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 验证结果 
     * @return RegNumResult 验证结果
     */
    public BizLicenseVerifyResult getRegNumResult() {
        return this.RegNumResult;
    }

    /**
     * Set 验证结果
     * @param RegNumResult 验证结果
     */
    public void setRegNumResult(BizLicenseVerifyResult RegNumResult) {
        this.RegNumResult = RegNumResult;
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

    public VerifyBizLicenseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyBizLicenseResponse(VerifyBizLicenseResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.CreditCode != null) {
            this.CreditCode = new String(source.CreditCode);
        }
        if (source.OrgCode != null) {
            this.OrgCode = new String(source.OrgCode);
        }
        if (source.OpenFrom != null) {
            this.OpenFrom = new String(source.OpenFrom);
        }
        if (source.OpenTo != null) {
            this.OpenTo = new String(source.OpenTo);
        }
        if (source.FrName != null) {
            this.FrName = new String(source.FrName);
        }
        if (source.EnterpriseStatus != null) {
            this.EnterpriseStatus = new String(source.EnterpriseStatus);
        }
        if (source.OperateScopeAndForm != null) {
            this.OperateScopeAndForm = new String(source.OperateScopeAndForm);
        }
        if (source.RegCap != null) {
            this.RegCap = new String(source.RegCap);
        }
        if (source.RegCapCur != null) {
            this.RegCapCur = new String(source.RegCapCur);
        }
        if (source.RegOrg != null) {
            this.RegOrg = new String(source.RegOrg);
        }
        if (source.EsDate != null) {
            this.EsDate = new String(source.EsDate);
        }
        if (source.EnterpriseType != null) {
            this.EnterpriseType = new String(source.EnterpriseType);
        }
        if (source.CancelDate != null) {
            this.CancelDate = new String(source.CancelDate);
        }
        if (source.RevokeDate != null) {
            this.RevokeDate = new String(source.RevokeDate);
        }
        if (source.AbuItem != null) {
            this.AbuItem = new String(source.AbuItem);
        }
        if (source.CbuItem != null) {
            this.CbuItem = new String(source.CbuItem);
        }
        if (source.ApprDate != null) {
            this.ApprDate = new String(source.ApprDate);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.County != null) {
            this.County = new String(source.County);
        }
        if (source.AreaCode != null) {
            this.AreaCode = new String(source.AreaCode);
        }
        if (source.IndustryPhyCode != null) {
            this.IndustryPhyCode = new String(source.IndustryPhyCode);
        }
        if (source.IndustryPhyName != null) {
            this.IndustryPhyName = new String(source.IndustryPhyName);
        }
        if (source.IndustryCode != null) {
            this.IndustryCode = new String(source.IndustryCode);
        }
        if (source.IndustryName != null) {
            this.IndustryName = new String(source.IndustryName);
        }
        if (source.OperateScope != null) {
            this.OperateScope = new String(source.OperateScope);
        }
        if (source.VerifyRegNo != null) {
            this.VerifyRegNo = new String(source.VerifyRegNo);
        }
        if (source.RegNo != null) {
            this.RegNo = new String(source.RegNo);
        }
        if (source.VerifyEnterpriseName != null) {
            this.VerifyEnterpriseName = new String(source.VerifyEnterpriseName);
        }
        if (source.EnterpriseName != null) {
            this.EnterpriseName = new String(source.EnterpriseName);
        }
        if (source.VerifyAddress != null) {
            this.VerifyAddress = new String(source.VerifyAddress);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.RegNumResult != null) {
            this.RegNumResult = new BizLicenseVerifyResult(source.RegNumResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "CreditCode", this.CreditCode);
        this.setParamSimple(map, prefix + "OrgCode", this.OrgCode);
        this.setParamSimple(map, prefix + "OpenFrom", this.OpenFrom);
        this.setParamSimple(map, prefix + "OpenTo", this.OpenTo);
        this.setParamSimple(map, prefix + "FrName", this.FrName);
        this.setParamSimple(map, prefix + "EnterpriseStatus", this.EnterpriseStatus);
        this.setParamSimple(map, prefix + "OperateScopeAndForm", this.OperateScopeAndForm);
        this.setParamSimple(map, prefix + "RegCap", this.RegCap);
        this.setParamSimple(map, prefix + "RegCapCur", this.RegCapCur);
        this.setParamSimple(map, prefix + "RegOrg", this.RegOrg);
        this.setParamSimple(map, prefix + "EsDate", this.EsDate);
        this.setParamSimple(map, prefix + "EnterpriseType", this.EnterpriseType);
        this.setParamSimple(map, prefix + "CancelDate", this.CancelDate);
        this.setParamSimple(map, prefix + "RevokeDate", this.RevokeDate);
        this.setParamSimple(map, prefix + "AbuItem", this.AbuItem);
        this.setParamSimple(map, prefix + "CbuItem", this.CbuItem);
        this.setParamSimple(map, prefix + "ApprDate", this.ApprDate);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "County", this.County);
        this.setParamSimple(map, prefix + "AreaCode", this.AreaCode);
        this.setParamSimple(map, prefix + "IndustryPhyCode", this.IndustryPhyCode);
        this.setParamSimple(map, prefix + "IndustryPhyName", this.IndustryPhyName);
        this.setParamSimple(map, prefix + "IndustryCode", this.IndustryCode);
        this.setParamSimple(map, prefix + "IndustryName", this.IndustryName);
        this.setParamSimple(map, prefix + "OperateScope", this.OperateScope);
        this.setParamSimple(map, prefix + "VerifyRegNo", this.VerifyRegNo);
        this.setParamSimple(map, prefix + "RegNo", this.RegNo);
        this.setParamSimple(map, prefix + "VerifyEnterpriseName", this.VerifyEnterpriseName);
        this.setParamSimple(map, prefix + "EnterpriseName", this.EnterpriseName);
        this.setParamSimple(map, prefix + "VerifyAddress", this.VerifyAddress);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamObj(map, prefix + "RegNumResult.", this.RegNumResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

