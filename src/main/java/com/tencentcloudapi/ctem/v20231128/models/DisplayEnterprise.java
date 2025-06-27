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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayEnterprise extends AbstractModel {

    /**
    * 主键Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公共字段
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * 子公司上级
    */
    @SerializedName("ParentEnterpriseUid")
    @Expose
    private String ParentEnterpriseUid;

    /**
    * 企业名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 公司简称
    */
    @SerializedName("Abbreviation")
    @Expose
    private String Abbreviation;

    /**
    * 统一社会信用代码
    */
    @SerializedName("CreditCode")
    @Expose
    private String CreditCode;

    /**
    * 企业状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 注册资本
    */
    @SerializedName("RegisteredCapital")
    @Expose
    private String RegisteredCapital;

    /**
    * 持股比例
    */
    @SerializedName("ShareholdingRatio")
    @Expose
    private String ShareholdingRatio;

    /**
    * 法人代表
    */
    @SerializedName("LegalPerson")
    @Expose
    private String LegalPerson;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 行业类型
    */
    @SerializedName("Industry")
    @Expose
    private String Industry;

    /**
    * 子公司唯一uid
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

    /**
    * 主域名数量
    */
    @SerializedName("DomainCount")
    @Expose
    private Long DomainCount;

    /**
    * 子域名数量
    */
    @SerializedName("SubDomainCount")
    @Expose
    private Long SubDomainCount;

    /**
    * 网站数量
    */
    @SerializedName("HttpCount")
    @Expose
    private Long HttpCount;

    /**
    * 漏洞数量
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
     * Get 主键Id 
     * @return Id 主键Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键Id
     * @param Id 主键Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公共字段 
     * @return DisplayToolCommon 公共字段
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set 公共字段
     * @param DisplayToolCommon 公共字段
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get 子公司上级 
     * @return ParentEnterpriseUid 子公司上级
     */
    public String getParentEnterpriseUid() {
        return this.ParentEnterpriseUid;
    }

    /**
     * Set 子公司上级
     * @param ParentEnterpriseUid 子公司上级
     */
    public void setParentEnterpriseUid(String ParentEnterpriseUid) {
        this.ParentEnterpriseUid = ParentEnterpriseUid;
    }

    /**
     * Get 企业名称 
     * @return Name 企业名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 企业名称
     * @param Name 企业名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 公司简称 
     * @return Abbreviation 公司简称
     */
    public String getAbbreviation() {
        return this.Abbreviation;
    }

    /**
     * Set 公司简称
     * @param Abbreviation 公司简称
     */
    public void setAbbreviation(String Abbreviation) {
        this.Abbreviation = Abbreviation;
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
     * Get 企业状态 
     * @return Status 企业状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 企业状态
     * @param Status 企业状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 注册资本 
     * @return RegisteredCapital 注册资本
     */
    public String getRegisteredCapital() {
        return this.RegisteredCapital;
    }

    /**
     * Set 注册资本
     * @param RegisteredCapital 注册资本
     */
    public void setRegisteredCapital(String RegisteredCapital) {
        this.RegisteredCapital = RegisteredCapital;
    }

    /**
     * Get 持股比例 
     * @return ShareholdingRatio 持股比例
     */
    public String getShareholdingRatio() {
        return this.ShareholdingRatio;
    }

    /**
     * Set 持股比例
     * @param ShareholdingRatio 持股比例
     */
    public void setShareholdingRatio(String ShareholdingRatio) {
        this.ShareholdingRatio = ShareholdingRatio;
    }

    /**
     * Get 法人代表 
     * @return LegalPerson 法人代表
     */
    public String getLegalPerson() {
        return this.LegalPerson;
    }

    /**
     * Set 法人代表
     * @param LegalPerson 法人代表
     */
    public void setLegalPerson(String LegalPerson) {
        this.LegalPerson = LegalPerson;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 行业类型 
     * @return Industry 行业类型
     */
    public String getIndustry() {
        return this.Industry;
    }

    /**
     * Set 行业类型
     * @param Industry 行业类型
     */
    public void setIndustry(String Industry) {
        this.Industry = Industry;
    }

    /**
     * Get 子公司唯一uid 
     * @return EnterpriseUid 子公司唯一uid
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set 子公司唯一uid
     * @param EnterpriseUid 子公司唯一uid
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
    }

    /**
     * Get 主域名数量 
     * @return DomainCount 主域名数量
     */
    public Long getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set 主域名数量
     * @param DomainCount 主域名数量
     */
    public void setDomainCount(Long DomainCount) {
        this.DomainCount = DomainCount;
    }

    /**
     * Get 子域名数量 
     * @return SubDomainCount 子域名数量
     */
    public Long getSubDomainCount() {
        return this.SubDomainCount;
    }

    /**
     * Set 子域名数量
     * @param SubDomainCount 子域名数量
     */
    public void setSubDomainCount(Long SubDomainCount) {
        this.SubDomainCount = SubDomainCount;
    }

    /**
     * Get 网站数量 
     * @return HttpCount 网站数量
     */
    public Long getHttpCount() {
        return this.HttpCount;
    }

    /**
     * Set 网站数量
     * @param HttpCount 网站数量
     */
    public void setHttpCount(Long HttpCount) {
        this.HttpCount = HttpCount;
    }

    /**
     * Get 漏洞数量 
     * @return VulCount 漏洞数量
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set 漏洞数量
     * @param VulCount 漏洞数量
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    public DisplayEnterprise() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayEnterprise(DisplayEnterprise source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.ParentEnterpriseUid != null) {
            this.ParentEnterpriseUid = new String(source.ParentEnterpriseUid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Abbreviation != null) {
            this.Abbreviation = new String(source.Abbreviation);
        }
        if (source.CreditCode != null) {
            this.CreditCode = new String(source.CreditCode);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RegisteredCapital != null) {
            this.RegisteredCapital = new String(source.RegisteredCapital);
        }
        if (source.ShareholdingRatio != null) {
            this.ShareholdingRatio = new String(source.ShareholdingRatio);
        }
        if (source.LegalPerson != null) {
            this.LegalPerson = new String(source.LegalPerson);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Industry != null) {
            this.Industry = new String(source.Industry);
        }
        if (source.EnterpriseUid != null) {
            this.EnterpriseUid = new String(source.EnterpriseUid);
        }
        if (source.DomainCount != null) {
            this.DomainCount = new Long(source.DomainCount);
        }
        if (source.SubDomainCount != null) {
            this.SubDomainCount = new Long(source.SubDomainCount);
        }
        if (source.HttpCount != null) {
            this.HttpCount = new Long(source.HttpCount);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "ParentEnterpriseUid", this.ParentEnterpriseUid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Abbreviation", this.Abbreviation);
        this.setParamSimple(map, prefix + "CreditCode", this.CreditCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RegisteredCapital", this.RegisteredCapital);
        this.setParamSimple(map, prefix + "ShareholdingRatio", this.ShareholdingRatio);
        this.setParamSimple(map, prefix + "LegalPerson", this.LegalPerson);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Industry", this.Industry);
        this.setParamSimple(map, prefix + "EnterpriseUid", this.EnterpriseUid);
        this.setParamSimple(map, prefix + "DomainCount", this.DomainCount);
        this.setParamSimple(map, prefix + "SubDomainCount", this.SubDomainCount);
        this.setParamSimple(map, prefix + "HttpCount", this.HttpCount);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);

    }
}

