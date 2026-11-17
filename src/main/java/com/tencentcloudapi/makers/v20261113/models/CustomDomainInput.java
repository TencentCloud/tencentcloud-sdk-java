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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomDomainInput extends AbstractModel {

    /**
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>证书 ID</p>
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * <p>校验状态。Verify、Pass、Fail</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否不申请证书</p>
    */
    @SerializedName("NoCertificate")
    @Expose
    private Boolean NoCertificate;

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>证书 ID</p> 
     * @return CertificateId <p>证书 ID</p>
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set <p>证书 ID</p>
     * @param CertificateId <p>证书 ID</p>
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get <p>校验状态。Verify、Pass、Fail</p> 
     * @return Status <p>校验状态。Verify、Pass、Fail</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>校验状态。Verify、Pass、Fail</p>
     * @param Status <p>校验状态。Verify、Pass、Fail</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否不申请证书</p> 
     * @return NoCertificate <p>是否不申请证书</p>
     */
    public Boolean getNoCertificate() {
        return this.NoCertificate;
    }

    /**
     * Set <p>是否不申请证书</p>
     * @param NoCertificate <p>是否不申请证书</p>
     */
    public void setNoCertificate(Boolean NoCertificate) {
        this.NoCertificate = NoCertificate;
    }

    public CustomDomainInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomDomainInput(CustomDomainInput source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.NoCertificate != null) {
            this.NoCertificate = new Boolean(source.NoCertificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NoCertificate", this.NoCertificate);

    }
}

