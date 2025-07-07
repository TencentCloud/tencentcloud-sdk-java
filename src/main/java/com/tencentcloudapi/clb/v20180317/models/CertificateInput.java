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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateInput extends AbstractModel {

    /**
    * 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证。
默认为 UNIDIRECTIONAL。
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * 双向认证时，是否开启客户端认证，ON:开启，OPTIONAL:自适应，默认ON。
    */
    @SerializedName("SSLVerifyClient")
    @Expose
    private String SSLVerifyClient;

    /**
    * 服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent（服务端证书内容），CertKey（服务端证书密钥），CertName（服务端证书名称）。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 客户端证书的 ID，当监听器采用双向认证，即 SSLMode=MUTUAL 时，如果不填写此项则必须上传客户端证书，包括 CertCaContent，CertCaName。
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * 上传服务端证书的名称，如果没有 CertId，则此项必传。
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * 上传服务端证书的 key，如果没有 CertId，则此项必传。
    */
    @SerializedName("CertKey")
    @Expose
    private String CertKey;

    /**
    * 上传服务端证书的内容，如果没有 CertId，则此项必传。
    */
    @SerializedName("CertContent")
    @Expose
    private String CertContent;

    /**
    * 上传客户端 CA 证书的名称，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。
    */
    @SerializedName("CertCaName")
    @Expose
    private String CertCaName;

    /**
    * 上传客户端证书的内容，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。
    */
    @SerializedName("CertCaContent")
    @Expose
    private String CertCaContent;

    /**
     * Get 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证。
默认为 UNIDIRECTIONAL。 
     * @return SSLMode 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证。
默认为 UNIDIRECTIONAL。
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证。
默认为 UNIDIRECTIONAL。
     * @param SSLMode 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证。
默认为 UNIDIRECTIONAL。
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get 双向认证时，是否开启客户端认证，ON:开启，OPTIONAL:自适应，默认ON。 
     * @return SSLVerifyClient 双向认证时，是否开启客户端认证，ON:开启，OPTIONAL:自适应，默认ON。
     */
    public String getSSLVerifyClient() {
        return this.SSLVerifyClient;
    }

    /**
     * Set 双向认证时，是否开启客户端认证，ON:开启，OPTIONAL:自适应，默认ON。
     * @param SSLVerifyClient 双向认证时，是否开启客户端认证，ON:开启，OPTIONAL:自适应，默认ON。
     */
    public void setSSLVerifyClient(String SSLVerifyClient) {
        this.SSLVerifyClient = SSLVerifyClient;
    }

    /**
     * Get 服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent（服务端证书内容），CertKey（服务端证书密钥），CertName（服务端证书名称）。 
     * @return CertId 服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent（服务端证书内容），CertKey（服务端证书密钥），CertName（服务端证书名称）。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent（服务端证书内容），CertKey（服务端证书密钥），CertName（服务端证书名称）。
     * @param CertId 服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent（服务端证书内容），CertKey（服务端证书密钥），CertName（服务端证书名称）。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 客户端证书的 ID，当监听器采用双向认证，即 SSLMode=MUTUAL 时，如果不填写此项则必须上传客户端证书，包括 CertCaContent，CertCaName。 
     * @return CertCaId 客户端证书的 ID，当监听器采用双向认证，即 SSLMode=MUTUAL 时，如果不填写此项则必须上传客户端证书，包括 CertCaContent，CertCaName。
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set 客户端证书的 ID，当监听器采用双向认证，即 SSLMode=MUTUAL 时，如果不填写此项则必须上传客户端证书，包括 CertCaContent，CertCaName。
     * @param CertCaId 客户端证书的 ID，当监听器采用双向认证，即 SSLMode=MUTUAL 时，如果不填写此项则必须上传客户端证书，包括 CertCaContent，CertCaName。
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get 上传服务端证书的名称，如果没有 CertId，则此项必传。 
     * @return CertName 上传服务端证书的名称，如果没有 CertId，则此项必传。
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set 上传服务端证书的名称，如果没有 CertId，则此项必传。
     * @param CertName 上传服务端证书的名称，如果没有 CertId，则此项必传。
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get 上传服务端证书的 key，如果没有 CertId，则此项必传。 
     * @return CertKey 上传服务端证书的 key，如果没有 CertId，则此项必传。
     */
    public String getCertKey() {
        return this.CertKey;
    }

    /**
     * Set 上传服务端证书的 key，如果没有 CertId，则此项必传。
     * @param CertKey 上传服务端证书的 key，如果没有 CertId，则此项必传。
     */
    public void setCertKey(String CertKey) {
        this.CertKey = CertKey;
    }

    /**
     * Get 上传服务端证书的内容，如果没有 CertId，则此项必传。 
     * @return CertContent 上传服务端证书的内容，如果没有 CertId，则此项必传。
     */
    public String getCertContent() {
        return this.CertContent;
    }

    /**
     * Set 上传服务端证书的内容，如果没有 CertId，则此项必传。
     * @param CertContent 上传服务端证书的内容，如果没有 CertId，则此项必传。
     */
    public void setCertContent(String CertContent) {
        this.CertContent = CertContent;
    }

    /**
     * Get 上传客户端 CA 证书的名称，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。 
     * @return CertCaName 上传客户端 CA 证书的名称，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。
     */
    public String getCertCaName() {
        return this.CertCaName;
    }

    /**
     * Set 上传客户端 CA 证书的名称，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。
     * @param CertCaName 上传客户端 CA 证书的名称，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。
     */
    public void setCertCaName(String CertCaName) {
        this.CertCaName = CertCaName;
    }

    /**
     * Get 上传客户端证书的内容，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。 
     * @return CertCaContent 上传客户端证书的内容，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。
     */
    public String getCertCaContent() {
        return this.CertCaContent;
    }

    /**
     * Set 上传客户端证书的内容，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。
     * @param CertCaContent 上传客户端证书的内容，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。
     */
    public void setCertCaContent(String CertCaContent) {
        this.CertCaContent = CertCaContent;
    }

    public CertificateInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateInput(CertificateInput source) {
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
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.CertKey != null) {
            this.CertKey = new String(source.CertKey);
        }
        if (source.CertContent != null) {
            this.CertContent = new String(source.CertContent);
        }
        if (source.CertCaName != null) {
            this.CertCaName = new String(source.CertCaName);
        }
        if (source.CertCaContent != null) {
            this.CertCaContent = new String(source.CertCaContent);
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
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertKey", this.CertKey);
        this.setParamSimple(map, prefix + "CertContent", this.CertContent);
        this.setParamSimple(map, prefix + "CertCaName", this.CertCaName);
        this.setParamSimple(map, prefix + "CertCaContent", this.CertCaContent);

    }
}

