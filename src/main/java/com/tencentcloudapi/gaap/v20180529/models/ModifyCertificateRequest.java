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

public class ModifyCertificateRequest  extends AbstractModel{

    /**
    * 监听器实例ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 需要修改证书的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 新的服务器证书ID。其中：
当CertificateId=default时，表示使用监听器的证书。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 新的客户端证书ID。其中：
当ClientCertificateId=default时，表示使用监听器的证书。
仅当采用双向认证方式时，需要设置该参数。
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
     * 获取监听器实例ID
     * @return ListenerId 监听器实例ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置监听器实例ID
     * @param ListenerId 监听器实例ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取需要修改证书的域名
     * @return Domain 需要修改证书的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置需要修改证书的域名
     * @param Domain 需要修改证书的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取新的服务器证书ID。其中：
当CertificateId=default时，表示使用监听器的证书。
     * @return CertificateId 新的服务器证书ID。其中：
当CertificateId=default时，表示使用监听器的证书。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * 设置新的服务器证书ID。其中：
当CertificateId=default时，表示使用监听器的证书。
     * @param CertificateId 新的服务器证书ID。其中：
当CertificateId=default时，表示使用监听器的证书。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * 获取新的客户端证书ID。其中：
当ClientCertificateId=default时，表示使用监听器的证书。
仅当采用双向认证方式时，需要设置该参数。
     * @return ClientCertificateId 新的客户端证书ID。其中：
当ClientCertificateId=default时，表示使用监听器的证书。
仅当采用双向认证方式时，需要设置该参数。
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * 设置新的客户端证书ID。其中：
当ClientCertificateId=default时，表示使用监听器的证书。
仅当采用双向认证方式时，需要设置该参数。
     * @param ClientCertificateId 新的客户端证书ID。其中：
当ClientCertificateId=default时，表示使用监听器的证书。
仅当采用双向认证方式时，需要设置该参数。
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);

    }
}

