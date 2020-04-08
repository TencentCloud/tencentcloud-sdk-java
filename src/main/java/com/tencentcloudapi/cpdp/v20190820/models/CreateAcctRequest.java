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

public class CreateAcctRequest extends AbstractModel{

    /**
    * 聚鑫平台分配的支付MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 业务平台的子商户ID，唯一
    */
    @SerializedName("SubMchId")
    @Expose
    private String SubMchId;

    /**
    * 子商户名称
    */
    @SerializedName("SubMchName")
    @Expose
    private String SubMchName;

    /**
    * 子商户地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 子商户联系人
<敏感信息>加密详见《商户端接口敏感信息加密说明》
    */
    @SerializedName("Contact")
    @Expose
    private String Contact;

    /**
    * 联系人手机号
<敏感信息>加密详见《商户端接口敏感信息加密说明》
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 邮箱 
<敏感信息>加密详见《商户端接口敏感信息加密说明》
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 聚鑫分配的安全ID
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 按照聚鑫安全密钥计算的签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
    * 子商户类型：
个人: personal
企业：enterprise
缺省： enterprise
    */
    @SerializedName("SubMchType")
    @Expose
    private String SubMchType;

    /**
    * 不填则默认子商户名称
    */
    @SerializedName("ShortName")
    @Expose
    private String ShortName;

    /**
    * 子商户会员类型：
general:普通子账户
merchant:商户子账户
缺省： general
    */
    @SerializedName("SubMerchantMemberType")
    @Expose
    private String SubMerchantMemberType;

    /**
     * Get 聚鑫平台分配的支付MidasAppId 
     * @return MidasAppId 聚鑫平台分配的支付MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫平台分配的支付MidasAppId
     * @param MidasAppId 聚鑫平台分配的支付MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 业务平台的子商户ID，唯一 
     * @return SubMchId 业务平台的子商户ID，唯一
     */
    public String getSubMchId() {
        return this.SubMchId;
    }

    /**
     * Set 业务平台的子商户ID，唯一
     * @param SubMchId 业务平台的子商户ID，唯一
     */
    public void setSubMchId(String SubMchId) {
        this.SubMchId = SubMchId;
    }

    /**
     * Get 子商户名称 
     * @return SubMchName 子商户名称
     */
    public String getSubMchName() {
        return this.SubMchName;
    }

    /**
     * Set 子商户名称
     * @param SubMchName 子商户名称
     */
    public void setSubMchName(String SubMchName) {
        this.SubMchName = SubMchName;
    }

    /**
     * Get 子商户地址 
     * @return Address 子商户地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 子商户地址
     * @param Address 子商户地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 子商户联系人
<敏感信息>加密详见《商户端接口敏感信息加密说明》 
     * @return Contact 子商户联系人
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public String getContact() {
        return this.Contact;
    }

    /**
     * Set 子商户联系人
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     * @param Contact 子商户联系人
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    /**
     * Get 联系人手机号
<敏感信息>加密详见《商户端接口敏感信息加密说明》 
     * @return Mobile 联系人手机号
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 联系人手机号
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     * @param Mobile 联系人手机号
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 邮箱 
<敏感信息>加密详见《商户端接口敏感信息加密说明》 
     * @return Email 邮箱 
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱 
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     * @param Email 邮箱 
<敏感信息>加密详见《商户端接口敏感信息加密说明》
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 聚鑫分配的安全ID 
     * @return MidasSecretId 聚鑫分配的安全ID
     */
    public String getMidasSecretId() {
        return this.MidasSecretId;
    }

    /**
     * Set 聚鑫分配的安全ID
     * @param MidasSecretId 聚鑫分配的安全ID
     */
    public void setMidasSecretId(String MidasSecretId) {
        this.MidasSecretId = MidasSecretId;
    }

    /**
     * Get 按照聚鑫安全密钥计算的签名 
     * @return MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 按照聚鑫安全密钥计算的签名
     * @param MidasSignature 按照聚鑫安全密钥计算的签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Get 子商户类型：
个人: personal
企业：enterprise
缺省： enterprise 
     * @return SubMchType 子商户类型：
个人: personal
企业：enterprise
缺省： enterprise
     */
    public String getSubMchType() {
        return this.SubMchType;
    }

    /**
     * Set 子商户类型：
个人: personal
企业：enterprise
缺省： enterprise
     * @param SubMchType 子商户类型：
个人: personal
企业：enterprise
缺省： enterprise
     */
    public void setSubMchType(String SubMchType) {
        this.SubMchType = SubMchType;
    }

    /**
     * Get 不填则默认子商户名称 
     * @return ShortName 不填则默认子商户名称
     */
    public String getShortName() {
        return this.ShortName;
    }

    /**
     * Set 不填则默认子商户名称
     * @param ShortName 不填则默认子商户名称
     */
    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }

    /**
     * Get 子商户会员类型：
general:普通子账户
merchant:商户子账户
缺省： general 
     * @return SubMerchantMemberType 子商户会员类型：
general:普通子账户
merchant:商户子账户
缺省： general
     */
    public String getSubMerchantMemberType() {
        return this.SubMerchantMemberType;
    }

    /**
     * Set 子商户会员类型：
general:普通子账户
merchant:商户子账户
缺省： general
     * @param SubMerchantMemberType 子商户会员类型：
general:普通子账户
merchant:商户子账户
缺省： general
     */
    public void setSubMerchantMemberType(String SubMerchantMemberType) {
        this.SubMerchantMemberType = SubMerchantMemberType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "SubMchId", this.SubMchId);
        this.setParamSimple(map, prefix + "SubMchName", this.SubMchName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Contact", this.Contact);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "SubMchType", this.SubMchType);
        this.setParamSimple(map, prefix + "ShortName", this.ShortName);
        this.setParamSimple(map, prefix + "SubMerchantMemberType", this.SubMerchantMemberType);

    }
}

