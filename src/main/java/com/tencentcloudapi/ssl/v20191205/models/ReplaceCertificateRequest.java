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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceCertificateRequest extends AbstractModel {

    /**
    * 证书 ID。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 验证类型：DNS_AUTO = 自动DNS验证（仅支持在腾讯云解析且解析状态正常的域名使用该验证类型），DNS = 手动DNS验证，FILE = 文件验证。
    */
    @SerializedName("ValidType")
    @Expose
    private String ValidType;

    /**
    * 类型，默认 original。可选项：original = 原证书 CSR，upload = 手动上传，online = 在线生成。
    */
    @SerializedName("CsrType")
    @Expose
    private String CsrType;

    /**
    * CSR 内容，手动上传的时候需要。
    */
    @SerializedName("CsrContent")
    @Expose
    private String CsrContent;

    /**
    * KEY 密码。
    */
    @SerializedName("CsrkeyPassword")
    @Expose
    private String CsrkeyPassword;

    /**
    * 重颁发原因。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * CSR加密方式，可选：RSA、ECC、SM2
（CsrType为Online才可选）， 默认为RSA
    */
    @SerializedName("CertCSREncryptAlgo")
    @Expose
    private String CertCSREncryptAlgo;

    /**
    * CSR加密参数，CsrEncryptAlgo为RSA时， 可选2048、4096等默认为2048；CsrEncryptAlgo为ECC时，可选prime256v1，secp384r1等，默认为prime256v1; 
    */
    @SerializedName("CertCSRKeyParameter")
    @Expose
    private String CertCSRKeyParameter;

    /**
    * 签名算法
    */
    @SerializedName("SignAlgo")
    @Expose
    private String SignAlgo;

    /**
    * 是否使用交叉根证书，默认为true
    */
    @SerializedName("UseCrossSignRoot")
    @Expose
    private Boolean UseCrossSignRoot;

    /**
     * Get 证书 ID。 
     * @return CertificateId 证书 ID。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书 ID。
     * @param CertificateId 证书 ID。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 验证类型：DNS_AUTO = 自动DNS验证（仅支持在腾讯云解析且解析状态正常的域名使用该验证类型），DNS = 手动DNS验证，FILE = 文件验证。 
     * @return ValidType 验证类型：DNS_AUTO = 自动DNS验证（仅支持在腾讯云解析且解析状态正常的域名使用该验证类型），DNS = 手动DNS验证，FILE = 文件验证。
     */
    public String getValidType() {
        return this.ValidType;
    }

    /**
     * Set 验证类型：DNS_AUTO = 自动DNS验证（仅支持在腾讯云解析且解析状态正常的域名使用该验证类型），DNS = 手动DNS验证，FILE = 文件验证。
     * @param ValidType 验证类型：DNS_AUTO = 自动DNS验证（仅支持在腾讯云解析且解析状态正常的域名使用该验证类型），DNS = 手动DNS验证，FILE = 文件验证。
     */
    public void setValidType(String ValidType) {
        this.ValidType = ValidType;
    }

    /**
     * Get 类型，默认 original。可选项：original = 原证书 CSR，upload = 手动上传，online = 在线生成。 
     * @return CsrType 类型，默认 original。可选项：original = 原证书 CSR，upload = 手动上传，online = 在线生成。
     */
    public String getCsrType() {
        return this.CsrType;
    }

    /**
     * Set 类型，默认 original。可选项：original = 原证书 CSR，upload = 手动上传，online = 在线生成。
     * @param CsrType 类型，默认 original。可选项：original = 原证书 CSR，upload = 手动上传，online = 在线生成。
     */
    public void setCsrType(String CsrType) {
        this.CsrType = CsrType;
    }

    /**
     * Get CSR 内容，手动上传的时候需要。 
     * @return CsrContent CSR 内容，手动上传的时候需要。
     */
    public String getCsrContent() {
        return this.CsrContent;
    }

    /**
     * Set CSR 内容，手动上传的时候需要。
     * @param CsrContent CSR 内容，手动上传的时候需要。
     */
    public void setCsrContent(String CsrContent) {
        this.CsrContent = CsrContent;
    }

    /**
     * Get KEY 密码。 
     * @return CsrkeyPassword KEY 密码。
     */
    public String getCsrkeyPassword() {
        return this.CsrkeyPassword;
    }

    /**
     * Set KEY 密码。
     * @param CsrkeyPassword KEY 密码。
     */
    public void setCsrkeyPassword(String CsrkeyPassword) {
        this.CsrkeyPassword = CsrkeyPassword;
    }

    /**
     * Get 重颁发原因。 
     * @return Reason 重颁发原因。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 重颁发原因。
     * @param Reason 重颁发原因。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get CSR加密方式，可选：RSA、ECC、SM2
（CsrType为Online才可选）， 默认为RSA 
     * @return CertCSREncryptAlgo CSR加密方式，可选：RSA、ECC、SM2
（CsrType为Online才可选）， 默认为RSA
     */
    public String getCertCSREncryptAlgo() {
        return this.CertCSREncryptAlgo;
    }

    /**
     * Set CSR加密方式，可选：RSA、ECC、SM2
（CsrType为Online才可选）， 默认为RSA
     * @param CertCSREncryptAlgo CSR加密方式，可选：RSA、ECC、SM2
（CsrType为Online才可选）， 默认为RSA
     */
    public void setCertCSREncryptAlgo(String CertCSREncryptAlgo) {
        this.CertCSREncryptAlgo = CertCSREncryptAlgo;
    }

    /**
     * Get CSR加密参数，CsrEncryptAlgo为RSA时， 可选2048、4096等默认为2048；CsrEncryptAlgo为ECC时，可选prime256v1，secp384r1等，默认为prime256v1;  
     * @return CertCSRKeyParameter CSR加密参数，CsrEncryptAlgo为RSA时， 可选2048、4096等默认为2048；CsrEncryptAlgo为ECC时，可选prime256v1，secp384r1等，默认为prime256v1; 
     */
    public String getCertCSRKeyParameter() {
        return this.CertCSRKeyParameter;
    }

    /**
     * Set CSR加密参数，CsrEncryptAlgo为RSA时， 可选2048、4096等默认为2048；CsrEncryptAlgo为ECC时，可选prime256v1，secp384r1等，默认为prime256v1; 
     * @param CertCSRKeyParameter CSR加密参数，CsrEncryptAlgo为RSA时， 可选2048、4096等默认为2048；CsrEncryptAlgo为ECC时，可选prime256v1，secp384r1等，默认为prime256v1; 
     */
    public void setCertCSRKeyParameter(String CertCSRKeyParameter) {
        this.CertCSRKeyParameter = CertCSRKeyParameter;
    }

    /**
     * Get 签名算法 
     * @return SignAlgo 签名算法
     */
    public String getSignAlgo() {
        return this.SignAlgo;
    }

    /**
     * Set 签名算法
     * @param SignAlgo 签名算法
     */
    public void setSignAlgo(String SignAlgo) {
        this.SignAlgo = SignAlgo;
    }

    /**
     * Get 是否使用交叉根证书，默认为true 
     * @return UseCrossSignRoot 是否使用交叉根证书，默认为true
     */
    public Boolean getUseCrossSignRoot() {
        return this.UseCrossSignRoot;
    }

    /**
     * Set 是否使用交叉根证书，默认为true
     * @param UseCrossSignRoot 是否使用交叉根证书，默认为true
     */
    public void setUseCrossSignRoot(Boolean UseCrossSignRoot) {
        this.UseCrossSignRoot = UseCrossSignRoot;
    }

    public ReplaceCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceCertificateRequest(ReplaceCertificateRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.ValidType != null) {
            this.ValidType = new String(source.ValidType);
        }
        if (source.CsrType != null) {
            this.CsrType = new String(source.CsrType);
        }
        if (source.CsrContent != null) {
            this.CsrContent = new String(source.CsrContent);
        }
        if (source.CsrkeyPassword != null) {
            this.CsrkeyPassword = new String(source.CsrkeyPassword);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.CertCSREncryptAlgo != null) {
            this.CertCSREncryptAlgo = new String(source.CertCSREncryptAlgo);
        }
        if (source.CertCSRKeyParameter != null) {
            this.CertCSRKeyParameter = new String(source.CertCSRKeyParameter);
        }
        if (source.SignAlgo != null) {
            this.SignAlgo = new String(source.SignAlgo);
        }
        if (source.UseCrossSignRoot != null) {
            this.UseCrossSignRoot = new Boolean(source.UseCrossSignRoot);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ValidType", this.ValidType);
        this.setParamSimple(map, prefix + "CsrType", this.CsrType);
        this.setParamSimple(map, prefix + "CsrContent", this.CsrContent);
        this.setParamSimple(map, prefix + "CsrkeyPassword", this.CsrkeyPassword);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "CertCSREncryptAlgo", this.CertCSREncryptAlgo);
        this.setParamSimple(map, prefix + "CertCSRKeyParameter", this.CertCSRKeyParameter);
        this.setParamSimple(map, prefix + "SignAlgo", this.SignAlgo);
        this.setParamSimple(map, prefix + "UseCrossSignRoot", this.UseCrossSignRoot);

    }
}

