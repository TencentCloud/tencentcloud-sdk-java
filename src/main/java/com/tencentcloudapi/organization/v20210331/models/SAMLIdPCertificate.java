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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SAMLIdPCertificate extends AbstractModel {

    /**
    * 证书序列号。
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 证书颁发者。
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 证书版本。
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * 证书ID。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * PEM 格式的公钥证书（Base64 编码）。
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * 证书的签名算法。
    */
    @SerializedName("SignatureAlgorithm")
    @Expose
    private String SignatureAlgorithm;

    /**
    * 证书的过期时间。
    */
    @SerializedName("NotAfter")
    @Expose
    private String NotAfter;

    /**
    * 证书的创建时间。
    */
    @SerializedName("NotBefore")
    @Expose
    private String NotBefore;

    /**
    * 证书的主体。
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * PEM 格式的 X509 证书。
    */
    @SerializedName("X509Certificate")
    @Expose
    private String X509Certificate;

    /**
     * Get 证书序列号。 
     * @return SerialNumber 证书序列号。
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 证书序列号。
     * @param SerialNumber 证书序列号。
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get 证书颁发者。 
     * @return Issuer 证书颁发者。
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set 证书颁发者。
     * @param Issuer 证书颁发者。
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get 证书版本。 
     * @return Version 证书版本。
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set 证书版本。
     * @param Version 证书版本。
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get 证书ID。 
     * @return CertificateId 证书ID。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书ID。
     * @param CertificateId 证书ID。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get PEM 格式的公钥证书（Base64 编码）。 
     * @return PublicKey PEM 格式的公钥证书（Base64 编码）。
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set PEM 格式的公钥证书（Base64 编码）。
     * @param PublicKey PEM 格式的公钥证书（Base64 编码）。
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get 证书的签名算法。 
     * @return SignatureAlgorithm 证书的签名算法。
     */
    public String getSignatureAlgorithm() {
        return this.SignatureAlgorithm;
    }

    /**
     * Set 证书的签名算法。
     * @param SignatureAlgorithm 证书的签名算法。
     */
    public void setSignatureAlgorithm(String SignatureAlgorithm) {
        this.SignatureAlgorithm = SignatureAlgorithm;
    }

    /**
     * Get 证书的过期时间。 
     * @return NotAfter 证书的过期时间。
     */
    public String getNotAfter() {
        return this.NotAfter;
    }

    /**
     * Set 证书的过期时间。
     * @param NotAfter 证书的过期时间。
     */
    public void setNotAfter(String NotAfter) {
        this.NotAfter = NotAfter;
    }

    /**
     * Get 证书的创建时间。 
     * @return NotBefore 证书的创建时间。
     */
    public String getNotBefore() {
        return this.NotBefore;
    }

    /**
     * Set 证书的创建时间。
     * @param NotBefore 证书的创建时间。
     */
    public void setNotBefore(String NotBefore) {
        this.NotBefore = NotBefore;
    }

    /**
     * Get 证书的主体。 
     * @return Subject 证书的主体。
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set 证书的主体。
     * @param Subject 证书的主体。
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get PEM 格式的 X509 证书。 
     * @return X509Certificate PEM 格式的 X509 证书。
     */
    public String getX509Certificate() {
        return this.X509Certificate;
    }

    /**
     * Set PEM 格式的 X509 证书。
     * @param X509Certificate PEM 格式的 X509 证书。
     */
    public void setX509Certificate(String X509Certificate) {
        this.X509Certificate = X509Certificate;
    }

    public SAMLIdPCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SAMLIdPCertificate(SAMLIdPCertificate source) {
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.SignatureAlgorithm != null) {
            this.SignatureAlgorithm = new String(source.SignatureAlgorithm);
        }
        if (source.NotAfter != null) {
            this.NotAfter = new String(source.NotAfter);
        }
        if (source.NotBefore != null) {
            this.NotBefore = new String(source.NotBefore);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.X509Certificate != null) {
            this.X509Certificate = new String(source.X509Certificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "SignatureAlgorithm", this.SignatureAlgorithm);
        this.setParamSimple(map, prefix + "NotAfter", this.NotAfter);
        this.setParamSimple(map, prefix + "NotBefore", this.NotBefore);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "X509Certificate", this.X509Certificate);

    }
}

