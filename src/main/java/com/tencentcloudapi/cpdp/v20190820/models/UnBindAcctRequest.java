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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnBindAcctRequest extends AbstractModel {

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
    * 用于提现
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

    public UnBindAcctRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnBindAcctRequest(UnBindAcctRequest source) {
        if (source.MidasAppId != null) {
            this.MidasAppId = new String(source.MidasAppId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
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
        this.setParamSimple(map, prefix + "SettleAcctNo", this.SettleAcctNo);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);
        this.setParamSimple(map, prefix + "EncryptType", this.EncryptType);
        this.setParamSimple(map, prefix + "MidasEnvironment", this.MidasEnvironment);

    }
}

