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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEnterpriseRequest extends AbstractModel {

    /**
    * 企业ID
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 上一级企业
    */
    @SerializedName("ParentEnterpriseUid")
    @Expose
    private String ParentEnterpriseUid;

    /**
    * 统一社会信用代码
    */
    @SerializedName("CreditCode")
    @Expose
    private String CreditCode;

    /**
    * 企业状态:存续、已注销
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 注册资本（单位:元）
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
    * 子公司ID
    */
    @SerializedName("EnterpriseUid")
    @Expose
    private String EnterpriseUid;

    /**
     * Get 企业ID 
     * @return CustomerId 企业ID
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业ID
     * @param CustomerId 企业ID
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 上一级企业 
     * @return ParentEnterpriseUid 上一级企业
     */
    public String getParentEnterpriseUid() {
        return this.ParentEnterpriseUid;
    }

    /**
     * Set 上一级企业
     * @param ParentEnterpriseUid 上一级企业
     */
    public void setParentEnterpriseUid(String ParentEnterpriseUid) {
        this.ParentEnterpriseUid = ParentEnterpriseUid;
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
     * Get 企业状态:存续、已注销 
     * @return Status 企业状态:存续、已注销
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 企业状态:存续、已注销
     * @param Status 企业状态:存续、已注销
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 注册资本（单位:元） 
     * @return RegisteredCapital 注册资本（单位:元）
     */
    public String getRegisteredCapital() {
        return this.RegisteredCapital;
    }

    /**
     * Set 注册资本（单位:元）
     * @param RegisteredCapital 注册资本（单位:元）
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
     * Get 子公司ID 
     * @return EnterpriseUid 子公司ID
     */
    public String getEnterpriseUid() {
        return this.EnterpriseUid;
    }

    /**
     * Set 子公司ID
     * @param EnterpriseUid 子公司ID
     */
    public void setEnterpriseUid(String EnterpriseUid) {
        this.EnterpriseUid = EnterpriseUid;
    }

    public CreateEnterpriseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEnterpriseRequest(CreateEnterpriseRequest source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentEnterpriseUid != null) {
            this.ParentEnterpriseUid = new String(source.ParentEnterpriseUid);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentEnterpriseUid", this.ParentEnterpriseUid);
        this.setParamSimple(map, prefix + "CreditCode", this.CreditCode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RegisteredCapital", this.RegisteredCapital);
        this.setParamSimple(map, prefix + "ShareholdingRatio", this.ShareholdingRatio);
        this.setParamSimple(map, prefix + "LegalPerson", this.LegalPerson);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Industry", this.Industry);
        this.setParamSimple(map, prefix + "EnterpriseUid", this.EnterpriseUid);

    }
}

