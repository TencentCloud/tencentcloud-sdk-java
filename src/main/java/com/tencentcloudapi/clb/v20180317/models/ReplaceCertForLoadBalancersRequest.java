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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceCertForLoadBalancersRequest extends AbstractModel{

    /**
    * 需要被替换的证书的ID，可以是服务端证书或客户端证书
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * 新证书的内容等相关信息
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
     * Get 需要被替换的证书的ID，可以是服务端证书或客户端证书 
     * @return OldCertificateId 需要被替换的证书的ID，可以是服务端证书或客户端证书
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set 需要被替换的证书的ID，可以是服务端证书或客户端证书
     * @param OldCertificateId 需要被替换的证书的ID，可以是服务端证书或客户端证书
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get 新证书的内容等相关信息 
     * @return Certificate 新证书的内容等相关信息
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 新证书的内容等相关信息
     * @param Certificate 新证书的内容等相关信息
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);

    }
}

