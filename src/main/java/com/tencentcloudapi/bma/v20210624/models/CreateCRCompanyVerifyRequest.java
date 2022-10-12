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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCRCompanyVerifyRequest extends AbstractModel{

    /**
    * 企业名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 企业证件号码
    */
    @SerializedName("CompanyID")
    @Expose
    private String CompanyID;

    /**
    * 企业法人姓名
    */
    @SerializedName("CompanyLegalName")
    @Expose
    private String CompanyLegalName;

    /**
    * 联系人姓名
    */
    @SerializedName("ManagerName")
    @Expose
    private String ManagerName;

    /**
    * 联系人手机号
    */
    @SerializedName("ManagerPhone")
    @Expose
    private String ManagerPhone;

    /**
    * 手机验证码，接口接入可以置空
    */
    @SerializedName("VerificationCode")
    @Expose
    private String VerificationCode;

    /**
    * 字段已废弃，企业认证号码类型 1：社会信用代码 2：组织机构代码 3：企业工商注册码 4：其他 默认为1
    */
    @SerializedName("CompanyIDType")
    @Expose
    private String CompanyIDType;

    /**
    * 字段已废弃，认证类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 企业名称 
     * @return CompanyName 企业名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 企业名称
     * @param CompanyName 企业名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 企业证件号码 
     * @return CompanyID 企业证件号码
     */
    public String getCompanyID() {
        return this.CompanyID;
    }

    /**
     * Set 企业证件号码
     * @param CompanyID 企业证件号码
     */
    public void setCompanyID(String CompanyID) {
        this.CompanyID = CompanyID;
    }

    /**
     * Get 企业法人姓名 
     * @return CompanyLegalName 企业法人姓名
     */
    public String getCompanyLegalName() {
        return this.CompanyLegalName;
    }

    /**
     * Set 企业法人姓名
     * @param CompanyLegalName 企业法人姓名
     */
    public void setCompanyLegalName(String CompanyLegalName) {
        this.CompanyLegalName = CompanyLegalName;
    }

    /**
     * Get 联系人姓名 
     * @return ManagerName 联系人姓名
     */
    public String getManagerName() {
        return this.ManagerName;
    }

    /**
     * Set 联系人姓名
     * @param ManagerName 联系人姓名
     */
    public void setManagerName(String ManagerName) {
        this.ManagerName = ManagerName;
    }

    /**
     * Get 联系人手机号 
     * @return ManagerPhone 联系人手机号
     */
    public String getManagerPhone() {
        return this.ManagerPhone;
    }

    /**
     * Set 联系人手机号
     * @param ManagerPhone 联系人手机号
     */
    public void setManagerPhone(String ManagerPhone) {
        this.ManagerPhone = ManagerPhone;
    }

    /**
     * Get 手机验证码，接口接入可以置空 
     * @return VerificationCode 手机验证码，接口接入可以置空
     */
    public String getVerificationCode() {
        return this.VerificationCode;
    }

    /**
     * Set 手机验证码，接口接入可以置空
     * @param VerificationCode 手机验证码，接口接入可以置空
     */
    public void setVerificationCode(String VerificationCode) {
        this.VerificationCode = VerificationCode;
    }

    /**
     * Get 字段已废弃，企业认证号码类型 1：社会信用代码 2：组织机构代码 3：企业工商注册码 4：其他 默认为1 
     * @return CompanyIDType 字段已废弃，企业认证号码类型 1：社会信用代码 2：组织机构代码 3：企业工商注册码 4：其他 默认为1
     */
    public String getCompanyIDType() {
        return this.CompanyIDType;
    }

    /**
     * Set 字段已废弃，企业认证号码类型 1：社会信用代码 2：组织机构代码 3：企业工商注册码 4：其他 默认为1
     * @param CompanyIDType 字段已废弃，企业认证号码类型 1：社会信用代码 2：组织机构代码 3：企业工商注册码 4：其他 默认为1
     */
    public void setCompanyIDType(String CompanyIDType) {
        this.CompanyIDType = CompanyIDType;
    }

    /**
     * Get 字段已废弃，认证类型 
     * @return Type 字段已废弃，认证类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段已废弃，认证类型
     * @param Type 字段已废弃，认证类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CreateCRCompanyVerifyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRCompanyVerifyRequest(CreateCRCompanyVerifyRequest source) {
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.CompanyID != null) {
            this.CompanyID = new String(source.CompanyID);
        }
        if (source.CompanyLegalName != null) {
            this.CompanyLegalName = new String(source.CompanyLegalName);
        }
        if (source.ManagerName != null) {
            this.ManagerName = new String(source.ManagerName);
        }
        if (source.ManagerPhone != null) {
            this.ManagerPhone = new String(source.ManagerPhone);
        }
        if (source.VerificationCode != null) {
            this.VerificationCode = new String(source.VerificationCode);
        }
        if (source.CompanyIDType != null) {
            this.CompanyIDType = new String(source.CompanyIDType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "CompanyID", this.CompanyID);
        this.setParamSimple(map, prefix + "CompanyLegalName", this.CompanyLegalName);
        this.setParamSimple(map, prefix + "ManagerName", this.ManagerName);
        this.setParamSimple(map, prefix + "ManagerPhone", this.ManagerPhone);
        this.setParamSimple(map, prefix + "VerificationCode", this.VerificationCode);
        this.setParamSimple(map, prefix + "CompanyIDType", this.CompanyIDType);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

