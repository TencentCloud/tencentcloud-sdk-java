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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateOutput extends AbstractModel {

    /**
    * 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * 是否开启客户端证书验证，只在双向认证时生效。
    */
    @SerializedName("SSLVerifyClient")
    @Expose
    private String SSLVerifyClient;

    /**
    * 服务端证书的ID。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 客户端证书的 ID。
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * 多本服务器证书场景扩展的服务器证书ID。
    */
    @SerializedName("ExtCertIds")
    @Expose
    private String [] ExtCertIds;

    /**
     * Get 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证 
     * @return SSLMode 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
     * @param SSLMode 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get 是否开启客户端证书验证，只在双向认证时生效。 
     * @return SSLVerifyClient 是否开启客户端证书验证，只在双向认证时生效。
     */
    public String getSSLVerifyClient() {
        return this.SSLVerifyClient;
    }

    /**
     * Set 是否开启客户端证书验证，只在双向认证时生效。
     * @param SSLVerifyClient 是否开启客户端证书验证，只在双向认证时生效。
     */
    public void setSSLVerifyClient(String SSLVerifyClient) {
        this.SSLVerifyClient = SSLVerifyClient;
    }

    /**
     * Get 服务端证书的ID。 
     * @return CertId 服务端证书的ID。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 服务端证书的ID。
     * @param CertId 服务端证书的ID。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 客户端证书的 ID。 
     * @return CertCaId 客户端证书的 ID。
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set 客户端证书的 ID。
     * @param CertCaId 客户端证书的 ID。
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get 多本服务器证书场景扩展的服务器证书ID。 
     * @return ExtCertIds 多本服务器证书场景扩展的服务器证书ID。
     */
    public String [] getExtCertIds() {
        return this.ExtCertIds;
    }

    /**
     * Set 多本服务器证书场景扩展的服务器证书ID。
     * @param ExtCertIds 多本服务器证书场景扩展的服务器证书ID。
     */
    public void setExtCertIds(String [] ExtCertIds) {
        this.ExtCertIds = ExtCertIds;
    }

    public CertificateOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateOutput(CertificateOutput source) {
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
        if (source.SSLVerifyClient != null) {
            this.SSLVerifyClient = new String(source.SSLVerifyClient);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertCaId != null) {
            this.CertCaId = new String(source.CertCaId);
        }
        if (source.ExtCertIds != null) {
            this.ExtCertIds = new String[source.ExtCertIds.length];
            for (int i = 0; i < source.ExtCertIds.length; i++) {
                this.ExtCertIds[i] = new String(source.ExtCertIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "SSLVerifyClient", this.SSLVerifyClient);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamArraySimple(map, prefix + "ExtCertIds.", this.ExtCertIds);

    }
}

