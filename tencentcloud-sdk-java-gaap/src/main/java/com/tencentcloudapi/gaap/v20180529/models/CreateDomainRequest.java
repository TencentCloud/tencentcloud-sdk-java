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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainRequest extends AbstractModel{

    /**
    * 监听器ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 需要创建的域名，一个监听器下最大支持100个域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 服务器证书，用于客户端与GAAP的HTTPS的交互。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 客户端CA证书，用于客户端与GAAP的HTTPS的交互。
仅当采用双向认证的方式时，需要设置该字段或PolyClientCertificateIds字段。
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * 客户端CA证书，用于客户端与GAAP的HTTPS的交互。
仅当采用双向认证的方式时，需要设置该字段或ClientCertificateId字段。
    */
    @SerializedName("PolyClientCertificateIds")
    @Expose
    private String [] PolyClientCertificateIds;

    /**
     * Get 监听器ID。 
     * @return ListenerId 监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID。
     * @param ListenerId 监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 需要创建的域名，一个监听器下最大支持100个域名。 
     * @return Domain 需要创建的域名，一个监听器下最大支持100个域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要创建的域名，一个监听器下最大支持100个域名。
     * @param Domain 需要创建的域名，一个监听器下最大支持100个域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 服务器证书，用于客户端与GAAP的HTTPS的交互。 
     * @return CertificateId 服务器证书，用于客户端与GAAP的HTTPS的交互。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 服务器证书，用于客户端与GAAP的HTTPS的交互。
     * @param CertificateId 服务器证书，用于客户端与GAAP的HTTPS的交互。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 客户端CA证书，用于客户端与GAAP的HTTPS的交互。
仅当采用双向认证的方式时，需要设置该字段或PolyClientCertificateIds字段。 
     * @return ClientCertificateId 客户端CA证书，用于客户端与GAAP的HTTPS的交互。
仅当采用双向认证的方式时，需要设置该字段或PolyClientCertificateIds字段。
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set 客户端CA证书，用于客户端与GAAP的HTTPS的交互。
仅当采用双向认证的方式时，需要设置该字段或PolyClientCertificateIds字段。
     * @param ClientCertificateId 客户端CA证书，用于客户端与GAAP的HTTPS的交互。
仅当采用双向认证的方式时，需要设置该字段或PolyClientCertificateIds字段。
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get 客户端CA证书，用于客户端与GAAP的HTTPS的交互。
仅当采用双向认证的方式时，需要设置该字段或ClientCertificateId字段。 
     * @return PolyClientCertificateIds 客户端CA证书，用于客户端与GAAP的HTTPS的交互。
仅当采用双向认证的方式时，需要设置该字段或ClientCertificateId字段。
     */
    public String [] getPolyClientCertificateIds() {
        return this.PolyClientCertificateIds;
    }

    /**
     * Set 客户端CA证书，用于客户端与GAAP的HTTPS的交互。
仅当采用双向认证的方式时，需要设置该字段或ClientCertificateId字段。
     * @param PolyClientCertificateIds 客户端CA证书，用于客户端与GAAP的HTTPS的交互。
仅当采用双向认证的方式时，需要设置该字段或ClientCertificateId字段。
     */
    public void setPolyClientCertificateIds(String [] PolyClientCertificateIds) {
        this.PolyClientCertificateIds = PolyClientCertificateIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamArraySimple(map, prefix + "PolyClientCertificateIds.", this.PolyClientCertificateIds);

    }
}

