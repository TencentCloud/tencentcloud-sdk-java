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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertDomainsResponse extends AbstractModel {

    /**
    * 已接入CDN的域名列表
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 已配置证书的CDN域名列表
    */
    @SerializedName("CertifiedDomains")
    @Expose
    private String [] CertifiedDomains;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 已接入CDN的域名列表 
     * @return Domains 已接入CDN的域名列表
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 已接入CDN的域名列表
     * @param Domains 已接入CDN的域名列表
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 已配置证书的CDN域名列表 
     * @return CertifiedDomains 已配置证书的CDN域名列表
     */
    public String [] getCertifiedDomains() {
        return this.CertifiedDomains;
    }

    /**
     * Set 已配置证书的CDN域名列表
     * @param CertifiedDomains 已配置证书的CDN域名列表
     */
    public void setCertifiedDomains(String [] CertifiedDomains) {
        this.CertifiedDomains = CertifiedDomains;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCertDomainsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertDomainsResponse(DescribeCertDomainsResponse source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.CertifiedDomains != null) {
            this.CertifiedDomains = new String[source.CertifiedDomains.length];
            for (int i = 0; i < source.CertifiedDomains.length; i++) {
                this.CertifiedDomains[i] = new String(source.CertifiedDomains[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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

