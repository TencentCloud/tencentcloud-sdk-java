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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateVerifyResultRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 证书类型，此参数和GmCertType不可同时为0。 0：不检测国际标准证书 1：证书来源为自有证书 2：证书来源为托管证书
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * CertType为1时，需要填充此参数，表示自有证书的证书链
    */
    @SerializedName("Certificate")
    @Expose
    private String Certificate;

    /**
    * CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
    */
    @SerializedName("CertID")
    @Expose
    private String CertID;

    /**
    * CertType为1时，需要填充此参数，表示自有证书的私钥
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 国密证书类型，此参数和CertType不可同时为0。0：不检测国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书
    */
    @SerializedName("GmCertType")
    @Expose
    private Long GmCertType;

    /**
    * GmCertType为1时，需要填充此参数，表示自有国密证书的证书链
    */
    @SerializedName("GmCert")
    @Expose
    private String GmCert;

    /**
    * GmCertType为1时，需要填充此参数，表示自有国密证书的私钥
    */
    @SerializedName("GmPrivateKey")
    @Expose
    private String GmPrivateKey;

    /**
    * GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书
    */
    @SerializedName("GmEncCert")
    @Expose
    private String GmEncCert;

    /**
    * GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥
    */
    @SerializedName("GmEncPrivateKey")
    @Expose
    private String GmEncPrivateKey;

    /**
    * GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
    */
    @SerializedName("GmSSLId")
    @Expose
    private String GmSSLId;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 证书类型，此参数和GmCertType不可同时为0。 0：不检测国际标准证书 1：证书来源为自有证书 2：证书来源为托管证书 
     * @return CertType 证书类型，此参数和GmCertType不可同时为0。 0：不检测国际标准证书 1：证书来源为自有证书 2：证书来源为托管证书
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型，此参数和GmCertType不可同时为0。 0：不检测国际标准证书 1：证书来源为自有证书 2：证书来源为托管证书
     * @param CertType 证书类型，此参数和GmCertType不可同时为0。 0：不检测国际标准证书 1：证书来源为自有证书 2：证书来源为托管证书
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get CertType为1时，需要填充此参数，表示自有证书的证书链 
     * @return Certificate CertType为1时，需要填充此参数，表示自有证书的证书链
     */
    public String getCertificate() {
        return this.Certificate;
    }

    /**
     * Set CertType为1时，需要填充此参数，表示自有证书的证书链
     * @param Certificate CertType为1时，需要填充此参数，表示自有证书的证书链
     */
    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id 
     * @return CertID CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     */
    public String getCertID() {
        return this.CertID;
    }

    /**
     * Set CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     * @param CertID CertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     */
    public void setCertID(String CertID) {
        this.CertID = CertID;
    }

    /**
     * Get CertType为1时，需要填充此参数，表示自有证书的私钥 
     * @return PrivateKey CertType为1时，需要填充此参数，表示自有证书的私钥
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set CertType为1时，需要填充此参数，表示自有证书的私钥
     * @param PrivateKey CertType为1时，需要填充此参数，表示自有证书的私钥
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 国密证书类型，此参数和CertType不可同时为0。0：不检测国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书 
     * @return GmCertType 国密证书类型，此参数和CertType不可同时为0。0：不检测国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书
     */
    public Long getGmCertType() {
        return this.GmCertType;
    }

    /**
     * Set 国密证书类型，此参数和CertType不可同时为0。0：不检测国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书
     * @param GmCertType 国密证书类型，此参数和CertType不可同时为0。0：不检测国密证书 1：证书来源为自有国密证书 2：证书来源为托管国密证书
     */
    public void setGmCertType(Long GmCertType) {
        this.GmCertType = GmCertType;
    }

    /**
     * Get GmCertType为1时，需要填充此参数，表示自有国密证书的证书链 
     * @return GmCert GmCertType为1时，需要填充此参数，表示自有国密证书的证书链
     */
    public String getGmCert() {
        return this.GmCert;
    }

    /**
     * Set GmCertType为1时，需要填充此参数，表示自有国密证书的证书链
     * @param GmCert GmCertType为1时，需要填充此参数，表示自有国密证书的证书链
     */
    public void setGmCert(String GmCert) {
        this.GmCert = GmCert;
    }

    /**
     * Get GmCertType为1时，需要填充此参数，表示自有国密证书的私钥 
     * @return GmPrivateKey GmCertType为1时，需要填充此参数，表示自有国密证书的私钥
     */
    public String getGmPrivateKey() {
        return this.GmPrivateKey;
    }

    /**
     * Set GmCertType为1时，需要填充此参数，表示自有国密证书的私钥
     * @param GmPrivateKey GmCertType为1时，需要填充此参数，表示自有国密证书的私钥
     */
    public void setGmPrivateKey(String GmPrivateKey) {
        this.GmPrivateKey = GmPrivateKey;
    }

    /**
     * Get GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书 
     * @return GmEncCert GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书
     */
    public String getGmEncCert() {
        return this.GmEncCert;
    }

    /**
     * Set GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书
     * @param GmEncCert GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书
     */
    public void setGmEncCert(String GmEncCert) {
        this.GmEncCert = GmEncCert;
    }

    /**
     * Get GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥 
     * @return GmEncPrivateKey GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥
     */
    public String getGmEncPrivateKey() {
        return this.GmEncPrivateKey;
    }

    /**
     * Set GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥
     * @param GmEncPrivateKey GmCertType为1时，需要填充此参数，表示自有国密证书的加密证书的私钥
     */
    public void setGmEncPrivateKey(String GmEncPrivateKey) {
        this.GmEncPrivateKey = GmEncPrivateKey;
    }

    /**
     * Get GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id 
     * @return GmSSLId GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     */
    public String getGmSSLId() {
        return this.GmSSLId;
    }

    /**
     * Set GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     * @param GmSSLId GmCertType为2时，需要填充此参数，表示腾讯云SSL平台托管的证书id
     */
    public void setGmSSLId(String GmSSLId) {
        this.GmSSLId = GmSSLId;
    }

    public DescribeCertificateVerifyResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificateVerifyResultRequest(DescribeCertificateVerifyResultRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertType != null) {
            this.CertType = new Long(source.CertType);
        }
        if (source.Certificate != null) {
            this.Certificate = new String(source.Certificate);
        }
        if (source.CertID != null) {
            this.CertID = new String(source.CertID);
        }
        if (source.PrivateKey != null) {
            this.PrivateKey = new String(source.PrivateKey);
        }
        if (source.GmCertType != null) {
            this.GmCertType = new Long(source.GmCertType);
        }
        if (source.GmCert != null) {
            this.GmCert = new String(source.GmCert);
        }
        if (source.GmPrivateKey != null) {
            this.GmPrivateKey = new String(source.GmPrivateKey);
        }
        if (source.GmEncCert != null) {
            this.GmEncCert = new String(source.GmEncCert);
        }
        if (source.GmEncPrivateKey != null) {
            this.GmEncPrivateKey = new String(source.GmEncPrivateKey);
        }
        if (source.GmSSLId != null) {
            this.GmSSLId = new String(source.GmSSLId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "Certificate", this.Certificate);
        this.setParamSimple(map, prefix + "CertID", this.CertID);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "GmCertType", this.GmCertType);
        this.setParamSimple(map, prefix + "GmCert", this.GmCert);
        this.setParamSimple(map, prefix + "GmPrivateKey", this.GmPrivateKey);
        this.setParamSimple(map, prefix + "GmEncCert", this.GmEncCert);
        this.setParamSimple(map, prefix + "GmEncPrivateKey", this.GmEncPrivateKey);
        this.setParamSimple(map, prefix + "GmSSLId", this.GmSSLId);

    }
}

