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

public class CertificateInput extends AbstractModel{

    /**
    * 认证类型，UNIDIRECTIONAL：单向认证，MUTUAL：双向认证
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * 服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent，CertKey，CertName。
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
    * 上传客户端 CA 证书的名称，如果 SSLMode=mutual，如果没有 CertCaId，则此项必传。
    */
    @SerializedName("CertCaName")
    @Expose
    private String CertCaName;

    /**
    * 上传客户端证书的内容，如果 SSLMode=mutual，如果没有 CertCaId，则此项必传。
    */
    @SerializedName("CertCaContent")
    @Expose
    private String CertCaContent;

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
     * Get 服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent，CertKey，CertName。 
     * @return CertId 服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent，CertKey，CertName。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent，CertKey，CertName。
     * @param CertId 服务端证书的 ID，如果不填写此项则必须上传证书，包括 CertContent，CertKey，CertName。
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
     * Get 上传客户端 CA 证书的名称，如果 SSLMode=mutual，如果没有 CertCaId，则此项必传。 
     * @return CertCaName 上传客户端 CA 证书的名称，如果 SSLMode=mutual，如果没有 CertCaId，则此项必传。
     */
    public String getCertCaName() {
        return this.CertCaName;
    }

    /**
     * Set 上传客户端 CA 证书的名称，如果 SSLMode=mutual，如果没有 CertCaId，则此项必传。
     * @param CertCaName 上传客户端 CA 证书的名称，如果 SSLMode=mutual，如果没有 CertCaId，则此项必传。
     */
    public void setCertCaName(String CertCaName) {
        this.CertCaName = CertCaName;
    }

    /**
     * Get 上传客户端证书的内容，如果 SSLMode=mutual，如果没有 CertCaId，则此项必传。 
     * @return CertCaContent 上传客户端证书的内容，如果 SSLMode=mutual，如果没有 CertCaId，则此项必传。
     */
    public String getCertCaContent() {
        return this.CertCaContent;
    }

    /**
     * Set 上传客户端证书的内容，如果 SSLMode=mutual，如果没有 CertCaId，则此项必传。
     * @param CertCaContent 上传客户端证书的内容，如果 SSLMode=mutual，如果没有 CertCaId，则此项必传。
     */
    public void setCertCaContent(String CertCaContent) {
        this.CertCaContent = CertCaContent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertKey", this.CertKey);
        this.setParamSimple(map, prefix + "CertContent", this.CertContent);
        this.setParamSimple(map, prefix + "CertCaName", this.CertCaName);
        this.setParamSimple(map, prefix + "CertCaContent", this.CertCaContent);

    }
}

