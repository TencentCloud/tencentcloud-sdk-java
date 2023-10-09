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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificateVerifyResultRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 证书类型
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * 证书公钥
    */
    @SerializedName("Certificate")
    @Expose
    private String Certificate;

    /**
    * 证书ID
    */
    @SerializedName("CertID")
    @Expose
    private String CertID;

    /**
    * 私钥信息
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

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
     * Get 证书类型 
     * @return CertType 证书类型
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * Set 证书类型
     * @param CertType 证书类型
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * Get 证书公钥 
     * @return Certificate 证书公钥
     */
    public String getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 证书公钥
     * @param Certificate 证书公钥
     */
    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 证书ID 
     * @return CertID 证书ID
     */
    public String getCertID() {
        return this.CertID;
    }

    /**
     * Set 证书ID
     * @param CertID 证书ID
     */
    public void setCertID(String CertID) {
        this.CertID = CertID;
    }

    /**
     * Get 私钥信息 
     * @return PrivateKey 私钥信息
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 私钥信息
     * @param PrivateKey 私钥信息
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
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

    }
}

