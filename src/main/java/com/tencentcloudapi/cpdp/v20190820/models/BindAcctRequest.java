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

public class BindAcctRequest extends AbstractModel{

    /**
    * 聚鑫分配的支付主MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 聚鑫计费SubAppId，代表子商户
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * 1 – 小额转账验证
2 – 短信验证
3 - 一分钱转账验证，无需再调CheckAcct验证绑卡
4 - 银行四要素验证，无需再调CheckAcct验证绑卡
每个结算账户每天只能使用一次小额转账验证
    */
    @SerializedName("BindType")
    @Expose
    private Long BindType;

    /**
    * 用于提现
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
    */
    @SerializedName("SettleAcctNo")
    @Expose
    private String SettleAcctNo;

    /**
    * 结算账户户名
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
    */
    @SerializedName("SettleAcctName")
    @Expose
    private String SettleAcctName;

    /**
    * 1 – 本行账户
2 – 他行账户
    */
    @SerializedName("SettleAcctType")
    @Expose
    private Long SettleAcctType;

    /**
    * 证件类型，见《证件类型》表
    */
    @SerializedName("IdType")
    @Expose
    private String IdType;

    /**
    * 证件号码
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
    */
    @SerializedName("IdCode")
    @Expose
    private String IdCode;

    /**
    * 开户行名称
    */
    @SerializedName("AcctBranchName")
    @Expose
    private String AcctBranchName;

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
    * 用于短信验证
BindType==2时必填
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 大小额行号，超级网银行号和大小额行号
二选一
    */
    @SerializedName("CnapsBranchId")
    @Expose
    private String CnapsBranchId;

    /**
    * 超级网银行号，超级网银行号和大小额行号
二选一
    */
    @SerializedName("EiconBankBranchId")
    @Expose
    private String EiconBankBranchId;

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
    * 经办人信息
    */
    @SerializedName("AgencyClientInfo")
    @Expose
    private AgencyClientInfo AgencyClientInfo;

    /**
     * Get 聚鑫分配的支付主MidasAppId 
     * @return MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫分配的支付主MidasAppId
     * @param MidasAppId 聚鑫分配的支付主MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 聚鑫计费SubAppId，代表子商户 
     * @return SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 聚鑫计费SubAppId，代表子商户
     * @param SubAppId 聚鑫计费SubAppId，代表子商户
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 1 – 小额转账验证
2 – 短信验证
3 - 一分钱转账验证，无需再调CheckAcct验证绑卡
4 - 银行四要素验证，无需再调CheckAcct验证绑卡
每个结算账户每天只能使用一次小额转账验证 
     * @return BindType 1 – 小额转账验证
2 – 短信验证
3 - 一分钱转账验证，无需再调CheckAcct验证绑卡
4 - 银行四要素验证，无需再调CheckAcct验证绑卡
每个结算账户每天只能使用一次小额转账验证
     */
    public Long getBindType() {
        return this.BindType;
    }

    /**
     * Set 1 – 小额转账验证
2 – 短信验证
3 - 一分钱转账验证，无需再调CheckAcct验证绑卡
4 - 银行四要素验证，无需再调CheckAcct验证绑卡
每个结算账户每天只能使用一次小额转账验证
     * @param BindType 1 – 小额转账验证
2 – 短信验证
3 - 一分钱转账验证，无需再调CheckAcct验证绑卡
4 - 银行四要素验证，无需再调CheckAcct验证绑卡
每个结算账户每天只能使用一次小额转账验证
     */
    public void setBindType(Long BindType) {
        this.BindType = BindType;
    }

    /**
     * Get 用于提现
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return SettleAcctNo 用于提现
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getSettleAcctNo() {
        return this.SettleAcctNo;
    }

    /**
     * Set 用于提现
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param SettleAcctNo 用于提现
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public void setSettleAcctNo(String SettleAcctNo) {
        this.SettleAcctNo = SettleAcctNo;
    }

    /**
     * Get 结算账户户名
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return SettleAcctName 结算账户户名
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getSettleAcctName() {
        return this.SettleAcctName;
    }

    /**
     * Set 结算账户户名
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param SettleAcctName 结算账户户名
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public void setSettleAcctName(String SettleAcctName) {
        this.SettleAcctName = SettleAcctName;
    }

    /**
     * Get 1 – 本行账户
2 – 他行账户 
     * @return SettleAcctType 1 – 本行账户
2 – 他行账户
     */
    public Long getSettleAcctType() {
        return this.SettleAcctType;
    }

    /**
     * Set 1 – 本行账户
2 – 他行账户
     * @param SettleAcctType 1 – 本行账户
2 – 他行账户
     */
    public void setSettleAcctType(Long SettleAcctType) {
        this.SettleAcctType = SettleAcctType;
    }

    /**
     * Get 证件类型，见《证件类型》表 
     * @return IdType 证件类型，见《证件类型》表
     */
    public String getIdType() {
        return this.IdType;
    }

    /**
     * Set 证件类型，见《证件类型》表
     * @param IdType 证件类型，见《证件类型》表
     */
    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    /**
     * Get 证件号码
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return IdCode 证件号码
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getIdCode() {
        return this.IdCode;
    }

    /**
     * Set 证件号码
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param IdCode 证件号码
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public void setIdCode(String IdCode) {
        this.IdCode = IdCode;
    }

    /**
     * Get 开户行名称 
     * @return AcctBranchName 开户行名称
     */
    public String getAcctBranchName() {
        return this.AcctBranchName;
    }

    /**
     * Set 开户行名称
     * @param AcctBranchName 开户行名称
     */
    public void setAcctBranchName(String AcctBranchName) {
        this.AcctBranchName = AcctBranchName;
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
     * Get 用于短信验证
BindType==2时必填
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return Mobile 用于短信验证
BindType==2时必填
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 用于短信验证
BindType==2时必填
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param Mobile 用于短信验证
BindType==2时必填
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 大小额行号，超级网银行号和大小额行号
二选一 
     * @return CnapsBranchId 大小额行号，超级网银行号和大小额行号
二选一
     */
    public String getCnapsBranchId() {
        return this.CnapsBranchId;
    }

    /**
     * Set 大小额行号，超级网银行号和大小额行号
二选一
     * @param CnapsBranchId 大小额行号，超级网银行号和大小额行号
二选一
     */
    public void setCnapsBranchId(String CnapsBranchId) {
        this.CnapsBranchId = CnapsBranchId;
    }

    /**
     * Get 超级网银行号，超级网银行号和大小额行号
二选一 
     * @return EiconBankBranchId 超级网银行号，超级网银行号和大小额行号
二选一
     */
    public String getEiconBankBranchId() {
        return this.EiconBankBranchId;
    }

    /**
     * Set 超级网银行号，超级网银行号和大小额行号
二选一
     * @param EiconBankBranchId 超级网银行号，超级网银行号和大小额行号
二选一
     */
    public void setEiconBankBranchId(String EiconBankBranchId) {
        this.EiconBankBranchId = EiconBankBranchId;
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
     * Get 经办人信息 
     * @return AgencyClientInfo 经办人信息
     */
    public AgencyClientInfo getAgencyClientInfo() {
        return this.AgencyClientInfo;
    }

    /**
     * Set 经办人信息
     * @param AgencyClientInfo 经办人信息
     */
    public void setAgencyClientInfo(AgencyClientInfo AgencyClientInfo) {
        this.AgencyClientInfo = AgencyClientInfo;
    }

    public BindAcctRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindAcctRequest(BindAcctRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.BindType != null) {
            this.BindType = new Long(source.BindType);
        }
        if (source.SettleAcctNo != null) {
            this.SettleAcctNo = new String(source.SettleAcctNo);
        }
        if (source.SettleAcctName != null) {
            this.SettleAcctName = new String(source.SettleAcctName);
        }
        if (source.SettleAcctType != null) {
            this.SettleAcctType = new Long(source.SettleAcctType);
        }
        if (source.IdType != null) {
            this.IdType = new String(source.IdType);
        }
        if (source.IdCode != null) {
            this.IdCode = new String(source.IdCode);
        }
        if (source.AcctBranchName != null) {
            this.AcctBranchName = new String(source.AcctBranchName);
        }
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.CnapsBranchId != null) {
            this.CnapsBranchId = new String(source.CnapsBranchId);
        }
        if (source.EiconBankBranchId != null) {
            this.EiconBankBranchId = new String(source.EiconBankBranchId);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
        }
        if (source.AgencyClientInfo != null) {
            this.AgencyClientInfo = new AgencyClientInfo(source.AgencyClientInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamSimple(map, prefix + "SettleAcctNo", this.SettleAcctNo);
        this.setParamSimple(map, prefix + "SettleAcctName", this.SettleAcctName);
        this.setParamSimple(map, prefix + "SettleAcctType", this.SettleAcctType);
        this.setParamSimple(map, prefix + "IdType", this.IdType);
        this.setParamSimple(map, prefix + "IdCode", this.IdCode);
        this.setParamSimple(map, prefix + "AcctBranchName", this.AcctBranchName);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "CnapsBranchId", this.CnapsBranchId);
        this.setParamSimple(map, prefix + "EiconBankBranchId", this.EiconBankBranchId);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);
        this.setParamObj(map, prefix + "AgencyClientInfo.", this.AgencyClientInfo);

    }
}

