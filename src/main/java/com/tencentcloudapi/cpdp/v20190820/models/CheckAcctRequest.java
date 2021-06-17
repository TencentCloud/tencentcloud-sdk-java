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

public class CheckAcctRequest extends AbstractModel{

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
每个结算账户每天只能使用一次小额转账验证
    */
    @SerializedName("BindType")
    @Expose
    private Long BindType;

    /**
    * 结算账户账号
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
    */
    @SerializedName("SettleAcctNo")
    @Expose
    private String SettleAcctNo;

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
    * 短信验证码或指令号
BindType==2必填，平安渠道必填
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 币种 RMB
BindType==1必填
    */
    @SerializedName("CurrencyType")
    @Expose
    private String CurrencyType;

    /**
    * 单位
1：元，2：角，3：分
BindType==1必填
    */
    @SerializedName("CurrencyUnit")
    @Expose
    private Long CurrencyUnit;

    /**
    * 金额
BindType==1必填
    */
    @SerializedName("CurrencyAmt")
    @Expose
    private String CurrencyAmt;

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
每个结算账户每天只能使用一次小额转账验证 
     * @return BindType 1 – 小额转账验证
2 – 短信验证
每个结算账户每天只能使用一次小额转账验证
     */
    public Long getBindType() {
        return this.BindType;
    }

    /**
     * Set 1 – 小额转账验证
2 – 短信验证
每个结算账户每天只能使用一次小额转账验证
     * @param BindType 1 – 小额转账验证
2 – 短信验证
每个结算账户每天只能使用一次小额转账验证
     */
    public void setBindType(Long BindType) {
        this.BindType = BindType;
    }

    /**
     * Get 结算账户账号
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a> 
     * @return SettleAcctNo 结算账户账号
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public String getSettleAcctNo() {
        return this.SettleAcctNo;
    }

    /**
     * Set 结算账户账号
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     * @param SettleAcctNo 结算账户账号
<敏感信息>加密详见<a href="https://cloud.tencent.com/document/product/1122/48979" target="_blank">《商户端接口敏感信息加密说明》</a>
     */
    public void setSettleAcctNo(String SettleAcctNo) {
        this.SettleAcctNo = SettleAcctNo;
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
     * Get 短信验证码或指令号
BindType==2必填，平安渠道必填 
     * @return CheckCode 短信验证码或指令号
BindType==2必填，平安渠道必填
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set 短信验证码或指令号
BindType==2必填，平安渠道必填
     * @param CheckCode 短信验证码或指令号
BindType==2必填，平安渠道必填
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get 币种 RMB
BindType==1必填 
     * @return CurrencyType 币种 RMB
BindType==1必填
     */
    public String getCurrencyType() {
        return this.CurrencyType;
    }

    /**
     * Set 币种 RMB
BindType==1必填
     * @param CurrencyType 币种 RMB
BindType==1必填
     */
    public void setCurrencyType(String CurrencyType) {
        this.CurrencyType = CurrencyType;
    }

    /**
     * Get 单位
1：元，2：角，3：分
BindType==1必填 
     * @return CurrencyUnit 单位
1：元，2：角，3：分
BindType==1必填
     */
    public Long getCurrencyUnit() {
        return this.CurrencyUnit;
    }

    /**
     * Set 单位
1：元，2：角，3：分
BindType==1必填
     * @param CurrencyUnit 单位
1：元，2：角，3：分
BindType==1必填
     */
    public void setCurrencyUnit(Long CurrencyUnit) {
        this.CurrencyUnit = CurrencyUnit;
    }

    /**
     * Get 金额
BindType==1必填 
     * @return CurrencyAmt 金额
BindType==1必填
     */
    public String getCurrencyAmt() {
        return this.CurrencyAmt;
    }

    /**
     * Set 金额
BindType==1必填
     * @param CurrencyAmt 金额
BindType==1必填
     */
    public void setCurrencyAmt(String CurrencyAmt) {
        this.CurrencyAmt = CurrencyAmt;
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

    public CheckAcctRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckAcctRequest(CheckAcctRequest source) {
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
        if (source.MidasSecretId != null) {
            this.MidasSecretId = new String(source.MidasSecretId);
        }
        if (source.MidasSignature != null) {
            this.MidasSignature = new String(source.MidasSignature);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.CurrencyType != null) {
            this.CurrencyType = new String(source.CurrencyType);
        }
        if (source.CurrencyUnit != null) {
            this.CurrencyUnit = new Long(source.CurrencyUnit);
        }
        if (source.CurrencyAmt != null) {
            this.CurrencyAmt = new String(source.CurrencyAmt);
        }
        if (source.EncryptType != null) {
            this.EncryptType = new String(source.EncryptType);
        }
        if (source.MidasEnvironment != null) {
            this.MidasEnvironment = new String(source.MidasEnvironment);
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
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "CurrencyType", this.CurrencyType);
        this.setParamSimple(map, prefix + "CurrencyUnit", this.CurrencyUnit);
        this.setParamSimple(map, prefix + "CurrencyAmt", this.CurrencyAmt);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);

    }
}

