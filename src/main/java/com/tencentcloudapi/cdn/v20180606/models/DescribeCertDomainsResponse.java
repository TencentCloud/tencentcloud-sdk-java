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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertDomainsResponse extends AbstractModel{

    /**
    * 已接入CDN的域名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * CDN已配置证书的域名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertifiedDomains")
    @Expose
    private String [] CertifiedDomains;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 已接入CDN的域名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domains 已接入CDN的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 已接入CDN的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domains 已接入CDN的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get CDN已配置证书的域名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertifiedDomains CDN已配置证书的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCertifiedDomains() {
        return this.CertifiedDomains;
    }

    /**
     * Set CDN已配置证书的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertifiedDomains CDN已配置证书的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertifiedDomains(String [] CertifiedDomains) {
        this.CertifiedDomains = CertifiedDomains;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "CertifiedDomains.", this.CertifiedDomains);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

