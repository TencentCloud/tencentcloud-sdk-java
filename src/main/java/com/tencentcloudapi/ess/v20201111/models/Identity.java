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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Identity extends AbstractModel {

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
    * 营业执照注册编号
    */
    @SerializedName("RegNo")
    @Expose
    private String RegNo;

    /**
    * 企业名称
    */
    @SerializedName("EntName")
    @Expose
    private String EntName;

    /**
    * 修改人法人代表姓名
    */
    @SerializedName("LegalRepName")
    @Expose
    private String LegalRepName;

    /**
    * 渠道经营状态
    */
    @SerializedName("OpState")
    @Expose
    private String OpState;

    /**
    * 经营期限自(格式YYYY-MM-DD)
    */
    @SerializedName("OpFromDate")
    @Expose
    private String OpFromDate;

    /**
    * 经营期限至
    */
    @SerializedName("OpToDate")
    @Expose
    private String OpToDate;

    /**
    * 成立日期(格式YYYY-MM-DD)
    */
    @SerializedName("EstabDate")
    @Expose
    private String EstabDate;

    /**
    * 核准日期(格式YYYY-MM-DD)
    */
    @SerializedName("ApprDate")
    @Expose
    private String ApprDate;

    /**
    * 吊销日期(格式YYYY-MM-DD)
    */
    @SerializedName("RevoDate")
    @Expose
    private String RevoDate;

    /**
    * 注销日期(格式YYYY-MM-DD)
    */
    @SerializedName("CancelDate")
    @Expose
    private String CancelDate;

    /**
    * 登记机关
    */
    @SerializedName("RegOrg")
    @Expose
    private String RegOrg;

    /**
    * 企业类型编码
    */
    @SerializedName("EntTypeCode")
    @Expose
    private String EntTypeCode;

    /**
    * 企业类型
    */
    @SerializedName("EntType")
    @Expose
    private String EntType;

    /**
    * 经营业务范围
    */
    @SerializedName("BizScope")
    @Expose
    private String BizScope;

    /**
    * 许可经营项目
    */
    @SerializedName("LicenseBizItem")
    @Expose
    private String LicenseBizItem;

    /**
    * 注册地址行政编号
    */
    @SerializedName("RegAreaCode")
    @Expose
    private String RegAreaCode;

    /**
    * 注册地址
    */
    @SerializedName("RegAddress")
    @Expose
    private String RegAddress;

    /**
    * 注册资本币种
    */
    @SerializedName("RegCapitalCurtype")
    @Expose
    private String RegCapitalCurtype;

    /**
    * 注册资本（万元）
    */
    @SerializedName("RegCapital")
    @Expose
    private String RegCapital;

    /**
    * 实收资本（万元）
    */
    @SerializedName("PaidCapital")
    @Expose
    private String PaidCapital;

    /**
    * 原注册号
    */
    @SerializedName("OriRegNo")
    @Expose
    private String OriRegNo;

    /**
    * 企业英文名称
    */
    @SerializedName("EntNameEng")
    @Expose
    private String EntNameEng;

    /**
    * 曾用名
    */
    @SerializedName("OriEntName")
    @Expose
    private String OriEntName;

    /**
    * 企业经营状态枚举。常见值如下：
未定义的状态 = 0
正常  = 1
注销 = 2
吊销 = 3
吊销后注销 = 4
撤销 = 5
其他 = 99
    */
    @SerializedName("OpStateCode")
    @Expose
    private Long OpStateCode;

    /**
    * 查询日期(格式YYYY-MM-DD)
    */
    @SerializedName("SearchDate")
    @Expose
    private String SearchDate;

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
     * Get 营业执照注册编号 
     * @return RegNo 营业执照注册编号
     */
    public String getRegNo() {
        return this.RegNo;
    }

    /**
     * Set 营业执照注册编号
     * @param RegNo 营业执照注册编号
     */
    public void setRegNo(String RegNo) {
        this.RegNo = RegNo;
    }

    /**
     * Get 企业名称 
     * @return EntName 企业名称
     */
    public String getEntName() {
        return this.EntName;
    }

    /**
     * Set 企业名称
     * @param EntName 企业名称
     */
    public void setEntName(String EntName) {
        this.EntName = EntName;
    }

    /**
     * Get 修改人法人代表姓名 
     * @return LegalRepName 修改人法人代表姓名
     */
    public String getLegalRepName() {
        return this.LegalRepName;
    }

    /**
     * Set 修改人法人代表姓名
     * @param LegalRepName 修改人法人代表姓名
     */
    public void setLegalRepName(String LegalRepName) {
        this.LegalRepName = LegalRepName;
    }

    /**
     * Get 渠道经营状态 
     * @return OpState 渠道经营状态
     */
    public String getOpState() {
        return this.OpState;
    }

    /**
     * Set 渠道经营状态
     * @param OpState 渠道经营状态
     */
    public void setOpState(String OpState) {
        this.OpState = OpState;
    }

    /**
     * Get 经营期限自(格式YYYY-MM-DD) 
     * @return OpFromDate 经营期限自(格式YYYY-MM-DD)
     */
    public String getOpFromDate() {
        return this.OpFromDate;
    }

    /**
     * Set 经营期限自(格式YYYY-MM-DD)
     * @param OpFromDate 经营期限自(格式YYYY-MM-DD)
     */
    public void setOpFromDate(String OpFromDate) {
        this.OpFromDate = OpFromDate;
    }

    /**
     * Get 经营期限至 
     * @return OpToDate 经营期限至
     */
    public String getOpToDate() {
        return this.OpToDate;
    }

    /**
     * Set 经营期限至
     * @param OpToDate 经营期限至
     */
    public void setOpToDate(String OpToDate) {
        this.OpToDate = OpToDate;
    }

    /**
     * Get 成立日期(格式YYYY-MM-DD) 
     * @return EstabDate 成立日期(格式YYYY-MM-DD)
     */
    public String getEstabDate() {
        return this.EstabDate;
    }

    /**
     * Set 成立日期(格式YYYY-MM-DD)
     * @param EstabDate 成立日期(格式YYYY-MM-DD)
     */
    public void setEstabDate(String EstabDate) {
        this.EstabDate = EstabDate;
    }

    /**
     * Get 核准日期(格式YYYY-MM-DD) 
     * @return ApprDate 核准日期(格式YYYY-MM-DD)
     */
    public String getApprDate() {
        return this.ApprDate;
    }

    /**
     * Set 核准日期(格式YYYY-MM-DD)
     * @param ApprDate 核准日期(格式YYYY-MM-DD)
     */
    public void setApprDate(String ApprDate) {
        this.ApprDate = ApprDate;
    }

    /**
     * Get 吊销日期(格式YYYY-MM-DD) 
     * @return RevoDate 吊销日期(格式YYYY-MM-DD)
     */
    public String getRevoDate() {
        return this.RevoDate;
    }

    /**
     * Set 吊销日期(格式YYYY-MM-DD)
     * @param RevoDate 吊销日期(格式YYYY-MM-DD)
     */
    public void setRevoDate(String RevoDate) {
        this.RevoDate = RevoDate;
    }

    /**
     * Get 注销日期(格式YYYY-MM-DD) 
     * @return CancelDate 注销日期(格式YYYY-MM-DD)
     */
    public String getCancelDate() {
        return this.CancelDate;
    }

    /**
     * Set 注销日期(格式YYYY-MM-DD)
     * @param CancelDate 注销日期(格式YYYY-MM-DD)
     */
    public void setCancelDate(String CancelDate) {
        this.CancelDate = CancelDate;
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
     * Get 企业类型编码 
     * @return EntTypeCode 企业类型编码
     */
    public String getEntTypeCode() {
        return this.EntTypeCode;
    }

    /**
     * Set 企业类型编码
     * @param EntTypeCode 企业类型编码
     */
    public void setEntTypeCode(String EntTypeCode) {
        this.EntTypeCode = EntTypeCode;
    }

    /**
     * Get 企业类型 
     * @return EntType 企业类型
     */
    public String getEntType() {
        return this.EntType;
    }

    /**
     * Set 企业类型
     * @param EntType 企业类型
     */
    public void setEntType(String EntType) {
        this.EntType = EntType;
    }

    /**
     * Get 经营业务范围 
     * @return BizScope 经营业务范围
     */
    public String getBizScope() {
        return this.BizScope;
    }

    /**
     * Set 经营业务范围
     * @param BizScope 经营业务范围
     */
    public void setBizScope(String BizScope) {
        this.BizScope = BizScope;
    }

    /**
     * Get 许可经营项目 
     * @return LicenseBizItem 许可经营项目
     */
    public String getLicenseBizItem() {
        return this.LicenseBizItem;
    }

    /**
     * Set 许可经营项目
     * @param LicenseBizItem 许可经营项目
     */
    public void setLicenseBizItem(String LicenseBizItem) {
        this.LicenseBizItem = LicenseBizItem;
    }

    /**
     * Get 注册地址行政编号 
     * @return RegAreaCode 注册地址行政编号
     */
    public String getRegAreaCode() {
        return this.RegAreaCode;
    }

    /**
     * Set 注册地址行政编号
     * @param RegAreaCode 注册地址行政编号
     */
    public void setRegAreaCode(String RegAreaCode) {
        this.RegAreaCode = RegAreaCode;
    }

    /**
     * Get 注册地址 
     * @return RegAddress 注册地址
     */
    public String getRegAddress() {
        return this.RegAddress;
    }

    /**
     * Set 注册地址
     * @param RegAddress 注册地址
     */
    public void setRegAddress(String RegAddress) {
        this.RegAddress = RegAddress;
    }

    /**
     * Get 注册资本币种 
     * @return RegCapitalCurtype 注册资本币种
     */
    public String getRegCapitalCurtype() {
        return this.RegCapitalCurtype;
    }

    /**
     * Set 注册资本币种
     * @param RegCapitalCurtype 注册资本币种
     */
    public void setRegCapitalCurtype(String RegCapitalCurtype) {
        this.RegCapitalCurtype = RegCapitalCurtype;
    }

    /**
     * Get 注册资本（万元） 
     * @return RegCapital 注册资本（万元）
     */
    public String getRegCapital() {
        return this.RegCapital;
    }

    /**
     * Set 注册资本（万元）
     * @param RegCapital 注册资本（万元）
     */
    public void setRegCapital(String RegCapital) {
        this.RegCapital = RegCapital;
    }

    /**
     * Get 实收资本（万元） 
     * @return PaidCapital 实收资本（万元）
     */
    public String getPaidCapital() {
        return this.PaidCapital;
    }

    /**
     * Set 实收资本（万元）
     * @param PaidCapital 实收资本（万元）
     */
    public void setPaidCapital(String PaidCapital) {
        this.PaidCapital = PaidCapital;
    }

    /**
     * Get 原注册号 
     * @return OriRegNo 原注册号
     */
    public String getOriRegNo() {
        return this.OriRegNo;
    }

    /**
     * Set 原注册号
     * @param OriRegNo 原注册号
     */
    public void setOriRegNo(String OriRegNo) {
        this.OriRegNo = OriRegNo;
    }

    /**
     * Get 企业英文名称 
     * @return EntNameEng 企业英文名称
     */
    public String getEntNameEng() {
        return this.EntNameEng;
    }

    /**
     * Set 企业英文名称
     * @param EntNameEng 企业英文名称
     */
    public void setEntNameEng(String EntNameEng) {
        this.EntNameEng = EntNameEng;
    }

    /**
     * Get 曾用名 
     * @return OriEntName 曾用名
     */
    public String getOriEntName() {
        return this.OriEntName;
    }

    /**
     * Set 曾用名
     * @param OriEntName 曾用名
     */
    public void setOriEntName(String OriEntName) {
        this.OriEntName = OriEntName;
    }

    /**
     * Get 企业经营状态枚举。常见值如下：
未定义的状态 = 0
正常  = 1
注销 = 2
吊销 = 3
吊销后注销 = 4
撤销 = 5
其他 = 99 
     * @return OpStateCode 企业经营状态枚举。常见值如下：
未定义的状态 = 0
正常  = 1
注销 = 2
吊销 = 3
吊销后注销 = 4
撤销 = 5
其他 = 99
     */
    public Long getOpStateCode() {
        return this.OpStateCode;
    }

    /**
     * Set 企业经营状态枚举。常见值如下：
未定义的状态 = 0
正常  = 1
注销 = 2
吊销 = 3
吊销后注销 = 4
撤销 = 5
其他 = 99
     * @param OpStateCode 企业经营状态枚举。常见值如下：
未定义的状态 = 0
正常  = 1
注销 = 2
吊销 = 3
吊销后注销 = 4
撤销 = 5
其他 = 99
     */
    public void setOpStateCode(Long OpStateCode) {
        this.OpStateCode = OpStateCode;
    }

    /**
     * Get 查询日期(格式YYYY-MM-DD) 
     * @return SearchDate 查询日期(格式YYYY-MM-DD)
     */
    public String getSearchDate() {
        return this.SearchDate;
    }

    /**
     * Set 查询日期(格式YYYY-MM-DD)
     * @param SearchDate 查询日期(格式YYYY-MM-DD)
     */
    public void setSearchDate(String SearchDate) {
        this.SearchDate = SearchDate;
    }

    public Identity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Identity(Identity source) {
        if (source.CreditCode != null) {
            this.CreditCode = new String(source.CreditCode);
        }
        if (source.OrgCode != null) {
            this.OrgCode = new String(source.OrgCode);
        }
        if (source.RegNo != null) {
            this.RegNo = new String(source.RegNo);
        }
        if (source.EntName != null) {
            this.EntName = new String(source.EntName);
        }
        if (source.LegalRepName != null) {
            this.LegalRepName = new String(source.LegalRepName);
        }
        if (source.OpState != null) {
            this.OpState = new String(source.OpState);
        }
        if (source.OpFromDate != null) {
            this.OpFromDate = new String(source.OpFromDate);
        }
        if (source.OpToDate != null) {
            this.OpToDate = new String(source.OpToDate);
        }
        if (source.EstabDate != null) {
            this.EstabDate = new String(source.EstabDate);
        }
        if (source.ApprDate != null) {
            this.ApprDate = new String(source.ApprDate);
        }
        if (source.RevoDate != null) {
            this.RevoDate = new String(source.RevoDate);
        }
        if (source.CancelDate != null) {
            this.CancelDate = new String(source.CancelDate);
        }
        if (source.RegOrg != null) {
            this.RegOrg = new String(source.RegOrg);
        }
        if (source.EntTypeCode != null) {
            this.EntTypeCode = new String(source.EntTypeCode);
        }
        if (source.EntType != null) {
            this.EntType = new String(source.EntType);
        }
        if (source.BizScope != null) {
            this.BizScope = new String(source.BizScope);
        }
        if (source.LicenseBizItem != null) {
            this.LicenseBizItem = new String(source.LicenseBizItem);
        }
        if (source.RegAreaCode != null) {
            this.RegAreaCode = new String(source.RegAreaCode);
        }
        if (source.RegAddress != null) {
            this.RegAddress = new String(source.RegAddress);
        }
        if (source.RegCapitalCurtype != null) {
            this.RegCapitalCurtype = new String(source.RegCapitalCurtype);
        }
        if (source.RegCapital != null) {
            this.RegCapital = new String(source.RegCapital);
        }
        if (source.PaidCapital != null) {
            this.PaidCapital = new String(source.PaidCapital);
        }
        if (source.OriRegNo != null) {
            this.OriRegNo = new String(source.OriRegNo);
        }
        if (source.EntNameEng != null) {
            this.EntNameEng = new String(source.EntNameEng);
        }
        if (source.OriEntName != null) {
            this.OriEntName = new String(source.OriEntName);
        }
        if (source.OpStateCode != null) {
            this.OpStateCode = new Long(source.OpStateCode);
        }
        if (source.SearchDate != null) {
            this.SearchDate = new String(source.SearchDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreditCode", this.CreditCode);
        this.setParamSimple(map, prefix + "OrgCode", this.OrgCode);
        this.setParamSimple(map, prefix + "RegNo", this.RegNo);
        this.setParamSimple(map, prefix + "EntName", this.EntName);
        this.setParamSimple(map, prefix + "LegalRepName", this.LegalRepName);
        this.setParamSimple(map, prefix + "OpState", this.OpState);
        this.setParamSimple(map, prefix + "OpFromDate", this.OpFromDate);
        this.setParamSimple(map, prefix + "OpToDate", this.OpToDate);
        this.setParamSimple(map, prefix + "EstabDate", this.EstabDate);
        this.setParamSimple(map, prefix + "ApprDate", this.ApprDate);
        this.setParamSimple(map, prefix + "RevoDate", this.RevoDate);
        this.setParamSimple(map, prefix + "CancelDate", this.CancelDate);
        this.setParamSimple(map, prefix + "RegOrg", this.RegOrg);
        this.setParamSimple(map, prefix + "EntTypeCode", this.EntTypeCode);
        this.setParamSimple(map, prefix + "EntType", this.EntType);
        this.setParamSimple(map, prefix + "BizScope", this.BizScope);
        this.setParamSimple(map, prefix + "LicenseBizItem", this.LicenseBizItem);
        this.setParamSimple(map, prefix + "RegAreaCode", this.RegAreaCode);
        this.setParamSimple(map, prefix + "RegAddress", this.RegAddress);
        this.setParamSimple(map, prefix + "RegCapitalCurtype", this.RegCapitalCurtype);
        this.setParamSimple(map, prefix + "RegCapital", this.RegCapital);
        this.setParamSimple(map, prefix + "PaidCapital", this.PaidCapital);
        this.setParamSimple(map, prefix + "OriRegNo", this.OriRegNo);
        this.setParamSimple(map, prefix + "EntNameEng", this.EntNameEng);
        this.setParamSimple(map, prefix + "OriEntName", this.OriEntName);
        this.setParamSimple(map, prefix + "OpStateCode", this.OpStateCode);
        this.setParamSimple(map, prefix + "SearchDate", this.SearchDate);

    }
}

