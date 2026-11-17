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
    * <p>认证类型，取值：<code>UNIDIRECTIONAL</code>：单向认证；<code>MUTUAL</code>：双向认证。 此参数是否必填取决于调用场景： - 创建监听器或转发规则：需要通过 Certificate 配置证书时，此参数必填；复用已有域名证书的转发规则无需传入。 - 修改监听器或域名属性：通过 Certificate 更新证书时，此参数必填；不修改证书时，无需传入整个 Certificate。 - 批量替换证书（ReplaceCertForLoadBalancers）：此参数无需传入，接口仅替换证书，不修改认证类型。</p><p>枚举值：</p><ul><li>UNIDIRECTIONAL： 单向认证</li><li>MUTUAL： 双向认证</li></ul>
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * <p>双向认证时，是否开启客户端认证，ON:开启，OPTIONAL:自适应，默认ON。</p>
    */
    @SerializedName("SSLVerifyClient")
    @Expose
    private String SSLVerifyClient;

    /**
    * <p>服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent（服务端证书内容），CertKey（服务端证书密钥），CertName（服务端证书名称）。</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>客户端证书的 ID，当监听器采用双向认证，即 SSLMode=MUTUAL 时，如果不填写此项则必须上传客户端证书，包括 CertCaContent，CertCaName。</p>
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * <p>上传服务端证书的名称，如果没有 CertId，则此项必传。</p>
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * <p>上传服务端证书的 key，如果没有 CertId，则此项必传。</p>
    */
    @SerializedName("CertKey")
    @Expose
    private String CertKey;

    /**
    * <p>上传服务端证书的内容，如果没有 CertId，则此项必传。</p>
    */
    @SerializedName("CertContent")
    @Expose
    private String CertContent;

    /**
    * <p>上传客户端 CA 证书的名称，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。</p>
    */
    @SerializedName("CertCaName")
    @Expose
    private String CertCaName;

    /**
    * <p>上传客户端证书的内容，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。</p>
    */
    @SerializedName("CertCaContent")
    @Expose
    private String CertCaContent;

    /**
     * Get <p>认证类型，取值：<code>UNIDIRECTIONAL</code>：单向认证；<code>MUTUAL</code>：双向认证。 此参数是否必填取决于调用场景： - 创建监听器或转发规则：需要通过 Certificate 配置证书时，此参数必填；复用已有域名证书的转发规则无需传入。 - 修改监听器或域名属性：通过 Certificate 更新证书时，此参数必填；不修改证书时，无需传入整个 Certificate。 - 批量替换证书（ReplaceCertForLoadBalancers）：此参数无需传入，接口仅替换证书，不修改认证类型。</p><p>枚举值：</p><ul><li>UNIDIRECTIONAL： 单向认证</li><li>MUTUAL： 双向认证</li></ul> 
     * @return SSLMode <p>认证类型，取值：<code>UNIDIRECTIONAL</code>：单向认证；<code>MUTUAL</code>：双向认证。 此参数是否必填取决于调用场景： - 创建监听器或转发规则：需要通过 Certificate 配置证书时，此参数必填；复用已有域名证书的转发规则无需传入。 - 修改监听器或域名属性：通过 Certificate 更新证书时，此参数必填；不修改证书时，无需传入整个 Certificate。 - 批量替换证书（ReplaceCertForLoadBalancers）：此参数无需传入，接口仅替换证书，不修改认证类型。</p><p>枚举值：</p><ul><li>UNIDIRECTIONAL： 单向认证</li><li>MUTUAL： 双向认证</li></ul>
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set <p>认证类型，取值：<code>UNIDIRECTIONAL</code>：单向认证；<code>MUTUAL</code>：双向认证。 此参数是否必填取决于调用场景： - 创建监听器或转发规则：需要通过 Certificate 配置证书时，此参数必填；复用已有域名证书的转发规则无需传入。 - 修改监听器或域名属性：通过 Certificate 更新证书时，此参数必填；不修改证书时，无需传入整个 Certificate。 - 批量替换证书（ReplaceCertForLoadBalancers）：此参数无需传入，接口仅替换证书，不修改认证类型。</p><p>枚举值：</p><ul><li>UNIDIRECTIONAL： 单向认证</li><li>MUTUAL： 双向认证</li></ul>
     * @param SSLMode <p>认证类型，取值：<code>UNIDIRECTIONAL</code>：单向认证；<code>MUTUAL</code>：双向认证。 此参数是否必填取决于调用场景： - 创建监听器或转发规则：需要通过 Certificate 配置证书时，此参数必填；复用已有域名证书的转发规则无需传入。 - 修改监听器或域名属性：通过 Certificate 更新证书时，此参数必填；不修改证书时，无需传入整个 Certificate。 - 批量替换证书（ReplaceCertForLoadBalancers）：此参数无需传入，接口仅替换证书，不修改认证类型。</p><p>枚举值：</p><ul><li>UNIDIRECTIONAL： 单向认证</li><li>MUTUAL： 双向认证</li></ul>
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get <p>双向认证时，是否开启客户端认证，ON:开启，OPTIONAL:自适应，默认ON。</p> 
     * @return SSLVerifyClient <p>双向认证时，是否开启客户端认证，ON:开启，OPTIONAL:自适应，默认ON。</p>
     */
    public String getSSLVerifyClient() {
        return this.SSLVerifyClient;
    }

    /**
     * Set <p>双向认证时，是否开启客户端认证，ON:开启，OPTIONAL:自适应，默认ON。</p>
     * @param SSLVerifyClient <p>双向认证时，是否开启客户端认证，ON:开启，OPTIONAL:自适应，默认ON。</p>
     */
    public void setSSLVerifyClient(String SSLVerifyClient) {
        this.SSLVerifyClient = SSLVerifyClient;
    }

    /**
     * Get <p>服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent（服务端证书内容），CertKey（服务端证书密钥），CertName（服务端证书名称）。</p> 
     * @return CertId <p>服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent（服务端证书内容），CertKey（服务端证书密钥），CertName（服务端证书名称）。</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent（服务端证书内容），CertKey（服务端证书密钥），CertName（服务端证书名称）。</p>
     * @param CertId <p>服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent（服务端证书内容），CertKey（服务端证书密钥），CertName（服务端证书名称）。</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>客户端证书的 ID，当监听器采用双向认证，即 SSLMode=MUTUAL 时，如果不填写此项则必须上传客户端证书，包括 CertCaContent，CertCaName。</p> 
     * @return CertCaId <p>客户端证书的 ID，当监听器采用双向认证，即 SSLMode=MUTUAL 时，如果不填写此项则必须上传客户端证书，包括 CertCaContent，CertCaName。</p>
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set <p>客户端证书的 ID，当监听器采用双向认证，即 SSLMode=MUTUAL 时，如果不填写此项则必须上传客户端证书，包括 CertCaContent，CertCaName。</p>
     * @param CertCaId <p>客户端证书的 ID，当监听器采用双向认证，即 SSLMode=MUTUAL 时，如果不填写此项则必须上传客户端证书，包括 CertCaContent，CertCaName。</p>
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get <p>上传服务端证书的名称，如果没有 CertId，则此项必传。</p> 
     * @return CertName <p>上传服务端证书的名称，如果没有 CertId，则此项必传。</p>
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set <p>上传服务端证书的名称，如果没有 CertId，则此项必传。</p>
     * @param CertName <p>上传服务端证书的名称，如果没有 CertId，则此项必传。</p>
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get <p>上传服务端证书的 key，如果没有 CertId，则此项必传。</p> 
     * @return CertKey <p>上传服务端证书的 key，如果没有 CertId，则此项必传。</p>
     */
    public String getCertKey() {
        return this.CertKey;
    }

    /**
     * Set <p>上传服务端证书的 key，如果没有 CertId，则此项必传。</p>
     * @param CertKey <p>上传服务端证书的 key，如果没有 CertId，则此项必传。</p>
     */
    public void setCertKey(String CertKey) {
        this.CertKey = CertKey;
    }

    /**
     * Get <p>上传服务端证书的内容，如果没有 CertId，则此项必传。</p> 
     * @return CertContent <p>上传服务端证书的内容，如果没有 CertId，则此项必传。</p>
     */
    public String getCertContent() {
        return this.CertContent;
    }

    /**
     * Set <p>上传服务端证书的内容，如果没有 CertId，则此项必传。</p>
     * @param CertContent <p>上传服务端证书的内容，如果没有 CertId，则此项必传。</p>
     */
    public void setCertContent(String CertContent) {
        this.CertContent = CertContent;
    }

    /**
     * Get <p>上传客户端 CA 证书的名称，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。</p> 
     * @return CertCaName <p>上传客户端 CA 证书的名称，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。</p>
     */
    public String getCertCaName() {
        return this.CertCaName;
    }

    /**
     * Set <p>上传客户端 CA 证书的名称，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。</p>
     * @param CertCaName <p>上传客户端 CA 证书的名称，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。</p>
     */
    public void setCertCaName(String CertCaName) {
        this.CertCaName = CertCaName;
    }

    /**
     * Get <p>上传客户端证书的内容，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。</p> 
     * @return CertCaContent <p>上传客户端证书的内容，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。</p>
     */
    public String getCertCaContent() {
        return this.CertCaContent;
    }

    /**
     * Set <p>上传客户端证书的内容，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。</p>
     * @param CertCaContent <p>上传客户端证书的内容，如果 SSLMode=MUTUAL，如果没有 CertCaId，则此项必传。</p>
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

