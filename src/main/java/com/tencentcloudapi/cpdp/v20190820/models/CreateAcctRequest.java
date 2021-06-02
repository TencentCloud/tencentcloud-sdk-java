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
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
    */
    @SerializedName("Contact")
    @Expose
    private String Contact;

    /**
    * 联系人手机号
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 邮箱 
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
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
企业: enterprise
个体工商户: individual
缺省: enterprise
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
general: 普通子账户
merchant: 商户子账户
缺省: general
    */
    @SerializedName("SubMerchantMemberType")
    @Expose
    private String SubMerchantMemberType;

    /**
    * 子商户密钥
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
    */
    @SerializedName("SubMerchantKey")
    @Expose
    private String SubMerchantKey;

    /**
    * 子商户私钥
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
    */
    @SerializedName("SubMerchantPrivateKey")
    @Expose
    private String SubMerchantPrivateKey;

    /**
    * 敏感信息加密类型:
RSA: rsa非对称加密，使用RSA-PKCS1-v1_5
AES: aes对称加密，使用AES256-CBC-PCKS7padding
缺省: RSA
    */
    @SerializedName("EncryptType")
    @Expose
    private String EncryptType;

    /**
    * 银行生成的子商户账户，已开户的场景需要录入
    */
    @SerializedName("SubAcctNo")
    @Expose
    private String SubAcctNo;

    /**
    * 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
    */
    @SerializedName("MidasEnvironment")
    @Expose
    private String MidasEnvironment;

    /**
    * 店铺名称
企业、个体工商户必输
    */
    @SerializedName("SubMerchantStoreName")
    @Expose
    private String SubMerchantStoreName;

    /**
    * 公司信息
    */
    @SerializedName("OrganizationInfo")
    @Expose
    private OrganizationInfo OrganizationInfo;

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
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return Contact 子商户联系人
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getContact() {
        return this.Contact;
    }

    /**
     * Set 子商户联系人
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param Contact 子商户联系人
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    /**
     * Get 联系人手机号
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return Mobile 联系人手机号
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 联系人手机号
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param Mobile 联系人手机号
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 邮箱 
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return Email 邮箱 
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱 
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param Email 邮箱 
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
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
企业: enterprise
个体工商户: individual
缺省: enterprise 
     * @return SubMchType 子商户类型：
个人: personal
企业: enterprise
个体工商户: individual
缺省: enterprise
     */
    public String getSubMchType() {
        return this.SubMchType;
    }

    /**
     * Set 子商户类型：
个人: personal
企业: enterprise
个体工商户: individual
缺省: enterprise
     * @param SubMchType 子商户类型：
个人: personal
企业: enterprise
个体工商户: individual
缺省: enterprise
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
general: 普通子账户
merchant: 商户子账户
缺省: general 
     * @return SubMerchantMemberType 子商户会员类型：
general: 普通子账户
merchant: 商户子账户
缺省: general
     */
    public String getSubMerchantMemberType() {
        return this.SubMerchantMemberType;
    }

    /**
     * Set 子商户会员类型：
general: 普通子账户
merchant: 商户子账户
缺省: general
     * @param SubMerchantMemberType 子商户会员类型：
general: 普通子账户
merchant: 商户子账户
缺省: general
     */
    public void setSubMerchantMemberType(String SubMerchantMemberType) {
        this.SubMerchantMemberType = SubMerchantMemberType;
    }

    /**
     * Get 子商户密钥
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return SubMerchantKey 子商户密钥
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getSubMerchantKey() {
        return this.SubMerchantKey;
    }

    /**
     * Set 子商户密钥
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param SubMerchantKey 子商户密钥
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public void setSubMerchantKey(String SubMerchantKey) {
        this.SubMerchantKey = SubMerchantKey;
    }

    /**
     * Get 子商户私钥
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return SubMerchantPrivateKey 子商户私钥
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getSubMerchantPrivateKey() {
        return this.SubMerchantPrivateKey;
    }

    /**
     * Set 子商户私钥
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param SubMerchantPrivateKey 子商户私钥
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public void setSubMerchantPrivateKey(String SubMerchantPrivateKey) {
        this.SubMerchantPrivateKey = SubMerchantPrivateKey;
    }

    /**
     * Get 敏感信息加密类型:
RSA: rsa非对称加密，使用RSA-PKCS1-v1_5
AES: aes对称加密，使用AES256-CBC-PCKS7padding
缺省: RSA 
     * @return EncryptType 敏感信息加密类型:
RSA: rsa非对称加密，使用RSA-PKCS1-v1_5
AES: aes对称加密，使用AES256-CBC-PCKS7padding
缺省: RSA
     */
    public String getEncryptType() {
        return this.EncryptType;
    }

    /**
     * Set 敏感信息加密类型:
RSA: rsa非对称加密，使用RSA-PKCS1-v1_5
AES: aes对称加密，使用AES256-CBC-PCKS7padding
缺省: RSA
     * @param EncryptType 敏感信息加密类型:
RSA: rsa非对称加密，使用RSA-PKCS1-v1_5
AES: aes对称加密，使用AES256-CBC-PCKS7padding
缺省: RSA
     */
    public void setEncryptType(String EncryptType) {
        this.EncryptType = EncryptType;
    }

    /**
     * Get 银行生成的子商户账户，已开户的场景需要录入 
     * @return SubAcctNo 银行生成的子商户账户，已开户的场景需要录入
     */
    public String getSubAcctNo() {
        return this.SubAcctNo;
    }

    /**
     * Set 银行生成的子商户账户，已开户的场景需要录入
     * @param SubAcctNo 银行生成的子商户账户，已开户的场景需要录入
     */
    public void setSubAcctNo(String SubAcctNo) {
        this.SubAcctNo = SubAcctNo;
    }

    /**
     * Get 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release 
     * @return MidasEnvironment 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public String getMidasEnvironment() {
        return this.MidasEnvironment;
    }

    /**
     * Set 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     * @param MidasEnvironment 环境名:
release: 现网环境
sandbox: 沙箱环境
development: 开发环境
缺省: release
     */
    public void setMidasEnvironment(String MidasEnvironment) {
        this.MidasEnvironment = MidasEnvironment;
    }

    /**
     * Get 店铺名称
企业、个体工商户必输 
     * @return SubMerchantStoreName 店铺名称
企业、个体工商户必输
     */
    public String getSubMerchantStoreName() {
        return this.SubMerchantStoreName;
    }

    /**
     * Set 店铺名称
企业、个体工商户必输
     * @param SubMerchantStoreName 店铺名称
企业、个体工商户必输
     */
    public void setSubMerchantStoreName(String SubMerchantStoreName) {
        this.SubMerchantStoreName = SubMerchantStoreName;
    }

    /**
     * Get 公司信息 
     * @return OrganizationInfo 公司信息
     */
    public OrganizationInfo getOrganizationInfo() {
        return this.OrganizationInfo;
    }

    /**
     * Set 公司信息
     * @param OrganizationInfo 公司信息
     */
    public void setOrganizationInfo(OrganizationInfo OrganizationInfo) {
        this.OrganizationInfo = OrganizationInfo;
    }

    public CreateAcctRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAcctRequest(CreateAcctRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.SubMchId != null) {
            this.SubMchId = new String(source.SubMchId);
        }
        if (source.SubMchName != null) {
            this.SubMchName = new String(source.SubMchName);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Contact != null) {
            this.Contact = new String(source.Contact);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.SubMchType != null) {
            this.SubMchType = new String(source.SubMchType);
        }
        if (source.ShortName != null) {
            this.ShortName = new String(source.ShortName);
        }
        if (source.SubMerchantMemberType != null) {
            this.SubMerchantMemberType = new String(source.SubMerchantMemberType);
        }
        if (source.SubMerchantKey != null) {
            this.SubMerchantKey = new String(source.SubMerchantKey);
        }
        if (source.SubMerchantPrivateKey != null) {
            this.SubMerchantPrivateKey = new String(source.SubMerchantPrivateKey);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
        }
        if (source.SubAcctNo != null) {
            this.SubAcctNo = new String(source.SubAcctNo);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.SubMerchantStoreName != null) {
            this.SubMerchantStoreName = new String(source.SubMerchantStoreName);
        }
        if (source.OrganizationInfo != null) {
            this.OrganizationInfo = new OrganizationInfo(source.OrganizationInfo);
        }
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
        this.setParamSimple(map, prefix + "SubMerchantKey", this.SubMerchantKey);
        this.setParamSimple(map, prefix + "SubMerchantPrivateKey", this.SubMerchantPrivateKey);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "SubAcctNo", this.SubAcctNo);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamSimple(map, prefix + "SubMerchantStoreName", this.SubMerchantStoreName);
        this.setParamObj(map, prefix + "OrganizationInfo.", this.OrganizationInfo);

    }
}

