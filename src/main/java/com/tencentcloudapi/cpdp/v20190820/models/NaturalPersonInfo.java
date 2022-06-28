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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NaturalPersonInfo extends AbstractModel{

    /**
    * 自然人类型 
2：商户负责人 
3：授权经办人
4：业务联系人 
5：实际控制人 
6：控股股东 
7：受益人 
8：结算人
注意：HELIPAY渠道必传业务联系人
    */
    @SerializedName("PersonType")
    @Expose
    private String PersonType;

    /**
    * 证件类型 
IDCARD：身份证 
PASSPORT：护照 SOLDIERSCERTIFICATE：士兵证 OFFICERSCERTIFICATE：军官证 GATXCERTIFICATE：香港居民来往内地通行证 TWNDCERTIFICATE：台湾同胞来往内地通行证 MACAOCERTIFICATE：澳门来往内地通行证
    */
    @SerializedName("IdType")
    @Expose
    private String IdType;

    /**
    * 证件号码
    */
    @SerializedName("IdNumber")
    @Expose
    private String IdNumber;

    /**
    * 姓名
    */
    @SerializedName("PersonName")
    @Expose
    private String PersonName;

    /**
    * 证件有效期类型 
LONGTERM：长期有效 
OTHER：非长期有效
    */
    @SerializedName("IdValidityType")
    @Expose
    private String IdValidityType;

    /**
    * 证件生效日期，yyyy-MM-dd
    */
    @SerializedName("IdEffectiveDate")
    @Expose
    private String IdEffectiveDate;

    /**
    * 证件失效日期，yyyy-MM-dd
    */
    @SerializedName("IdExpireDate")
    @Expose
    private String IdExpireDate;

    /**
    * 联系电话，HELIPAY渠道业务联系人必传
    */
    @SerializedName("ContactPhone")
    @Expose
    private String ContactPhone;

    /**
    * 联系地址
    */
    @SerializedName("ContactAddress")
    @Expose
    private String ContactAddress;

    /**
    * 邮箱地址
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
     * Get 自然人类型 
2：商户负责人 
3：授权经办人
4：业务联系人 
5：实际控制人 
6：控股股东 
7：受益人 
8：结算人
注意：HELIPAY渠道必传业务联系人 
     * @return PersonType 自然人类型 
2：商户负责人 
3：授权经办人
4：业务联系人 
5：实际控制人 
6：控股股东 
7：受益人 
8：结算人
注意：HELIPAY渠道必传业务联系人
     */
    public String getPersonType() {
        return this.PersonType;
    }

    /**
     * Set 自然人类型 
2：商户负责人 
3：授权经办人
4：业务联系人 
5：实际控制人 
6：控股股东 
7：受益人 
8：结算人
注意：HELIPAY渠道必传业务联系人
     * @param PersonType 自然人类型 
2：商户负责人 
3：授权经办人
4：业务联系人 
5：实际控制人 
6：控股股东 
7：受益人 
8：结算人
注意：HELIPAY渠道必传业务联系人
     */
    public void setPersonType(String PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * Get 证件类型 
IDCARD：身份证 
PASSPORT：护照 SOLDIERSCERTIFICATE：士兵证 OFFICERSCERTIFICATE：军官证 GATXCERTIFICATE：香港居民来往内地通行证 TWNDCERTIFICATE：台湾同胞来往内地通行证 MACAOCERTIFICATE：澳门来往内地通行证 
     * @return IdType 证件类型 
IDCARD：身份证 
PASSPORT：护照 SOLDIERSCERTIFICATE：士兵证 OFFICERSCERTIFICATE：军官证 GATXCERTIFICATE：香港居民来往内地通行证 TWNDCERTIFICATE：台湾同胞来往内地通行证 MACAOCERTIFICATE：澳门来往内地通行证
     */
    public String getIdType() {
        return this.IdType;
    }

    /**
     * Set 证件类型 
IDCARD：身份证 
PASSPORT：护照 SOLDIERSCERTIFICATE：士兵证 OFFICERSCERTIFICATE：军官证 GATXCERTIFICATE：香港居民来往内地通行证 TWNDCERTIFICATE：台湾同胞来往内地通行证 MACAOCERTIFICATE：澳门来往内地通行证
     * @param IdType 证件类型 
IDCARD：身份证 
PASSPORT：护照 SOLDIERSCERTIFICATE：士兵证 OFFICERSCERTIFICATE：军官证 GATXCERTIFICATE：香港居民来往内地通行证 TWNDCERTIFICATE：台湾同胞来往内地通行证 MACAOCERTIFICATE：澳门来往内地通行证
     */
    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    /**
     * Get 证件号码 
     * @return IdNumber 证件号码
     */
    public String getIdNumber() {
        return this.IdNumber;
    }

    /**
     * Set 证件号码
     * @param IdNumber 证件号码
     */
    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

    /**
     * Get 姓名 
     * @return PersonName 姓名
     */
    public String getPersonName() {
        return this.PersonName;
    }

    /**
     * Set 姓名
     * @param PersonName 姓名
     */
    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    /**
     * Get 证件有效期类型 
LONGTERM：长期有效 
OTHER：非长期有效 
     * @return IdValidityType 证件有效期类型 
LONGTERM：长期有效 
OTHER：非长期有效
     */
    public String getIdValidityType() {
        return this.IdValidityType;
    }

    /**
     * Set 证件有效期类型 
LONGTERM：长期有效 
OTHER：非长期有效
     * @param IdValidityType 证件有效期类型 
LONGTERM：长期有效 
OTHER：非长期有效
     */
    public void setIdValidityType(String IdValidityType) {
        this.IdValidityType = IdValidityType;
    }

    /**
     * Get 证件生效日期，yyyy-MM-dd 
     * @return IdEffectiveDate 证件生效日期，yyyy-MM-dd
     */
    public String getIdEffectiveDate() {
        return this.IdEffectiveDate;
    }

    /**
     * Set 证件生效日期，yyyy-MM-dd
     * @param IdEffectiveDate 证件生效日期，yyyy-MM-dd
     */
    public void setIdEffectiveDate(String IdEffectiveDate) {
        this.IdEffectiveDate = IdEffectiveDate;
    }

    /**
     * Get 证件失效日期，yyyy-MM-dd 
     * @return IdExpireDate 证件失效日期，yyyy-MM-dd
     */
    public String getIdExpireDate() {
        return this.IdExpireDate;
    }

    /**
     * Set 证件失效日期，yyyy-MM-dd
     * @param IdExpireDate 证件失效日期，yyyy-MM-dd
     */
    public void setIdExpireDate(String IdExpireDate) {
        this.IdExpireDate = IdExpireDate;
    }

    /**
     * Get 联系电话，HELIPAY渠道业务联系人必传 
     * @return ContactPhone 联系电话，HELIPAY渠道业务联系人必传
     */
    public String getContactPhone() {
        return this.ContactPhone;
    }

    /**
     * Set 联系电话，HELIPAY渠道业务联系人必传
     * @param ContactPhone 联系电话，HELIPAY渠道业务联系人必传
     */
    public void setContactPhone(String ContactPhone) {
        this.ContactPhone = ContactPhone;
    }

    /**
     * Get 联系地址 
     * @return ContactAddress 联系地址
     */
    public String getContactAddress() {
        return this.ContactAddress;
    }

    /**
     * Set 联系地址
     * @param ContactAddress 联系地址
     */
    public void setContactAddress(String ContactAddress) {
        this.ContactAddress = ContactAddress;
    }

    /**
     * Get 邮箱地址 
     * @return EmailAddress 邮箱地址
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 邮箱地址
     * @param EmailAddress 邮箱地址
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public NaturalPersonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NaturalPersonInfo(NaturalPersonInfo source) {
        if (source.PersonType != null) {
            this.PersonType = new String(source.PersonType);
        }
        if (source.IdType != null) {
            this.IdType = new String(source.IdType);
        }
        if (source.IdNumber != null) {
            this.IdNumber = new String(source.IdNumber);
        }
        if (source.PersonName != null) {
            this.PersonName = new String(source.PersonName);
        }
        if (source.IdValidityType != null) {
            this.IdValidityType = new String(source.IdValidityType);
        }
        if (source.IdEffectiveDate != null) {
            this.IdEffectiveDate = new String(source.IdEffectiveDate);
        }
        if (source.IdExpireDate != null) {
            this.IdExpireDate = new String(source.IdExpireDate);
        }
        if (source.ContactPhone != null) {
            this.ContactPhone = new String(source.ContactPhone);
        }
        if (source.ContactAddress != null) {
            this.ContactAddress = new String(source.ContactAddress);
        }
        if (source.EmailAddress != null) {
            this.EmailAddress = new String(source.EmailAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "IdNumber", this.IdNumber);
        this.setParamSimple(map, prefix + "PersonName", this.PersonName);
        this.setParamSimple(map, prefix + "IdValidityType", this.IdValidityType);
        this.setParamSimple(map, prefix + "IdEffectiveDate", this.IdEffectiveDate);
        this.setParamSimple(map, prefix + "IdExpireDate", this.IdExpireDate);
        this.setParamSimple(map, prefix + "ContactPhone", this.ContactPhone);
        this.setParamSimple(map, prefix + "ContactAddress", this.ContactAddress);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);

    }
}

