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

public class ModifyHTTPSListenerAttributeRequest extends AbstractModel{

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 通道ID， 若为单通道监听器，此项必须填写
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 修改后的监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器后端转发与源站之间的协议类型
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * 修改后的监听器服务器证书ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 修改后的监听器客户端证书ID，不支持多客户端证书，多客户端证书新采用PolyClientCertificateIds字段
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * 新字段,修改后的监听器客户端证书ID
    */
    @SerializedName("PolyClientCertificateIds")
    @Expose
    private String [] PolyClientCertificateIds;

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 通道ID， 若为单通道监听器，此项必须填写 
     * @return ProxyId 通道ID， 若为单通道监听器，此项必须填写
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 通道ID， 若为单通道监听器，此项必须填写
     * @param ProxyId 通道ID， 若为单通道监听器，此项必须填写
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 修改后的监听器名称 
     * @return ListenerName 修改后的监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 修改后的监听器名称
     * @param ListenerName 修改后的监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器后端转发与源站之间的协议类型 
     * @return ForwardProtocol 监听器后端转发与源站之间的协议类型
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set 监听器后端转发与源站之间的协议类型
     * @param ForwardProtocol 监听器后端转发与源站之间的协议类型
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get 修改后的监听器服务器证书ID 
     * @return CertificateId 修改后的监听器服务器证书ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 修改后的监听器服务器证书ID
     * @param CertificateId 修改后的监听器服务器证书ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 修改后的监听器客户端证书ID，不支持多客户端证书，多客户端证书新采用PolyClientCertificateIds字段 
     * @return ClientCertificateId 修改后的监听器客户端证书ID，不支持多客户端证书，多客户端证书新采用PolyClientCertificateIds字段
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set 修改后的监听器客户端证书ID，不支持多客户端证书，多客户端证书新采用PolyClientCertificateIds字段
     * @param ClientCertificateId 修改后的监听器客户端证书ID，不支持多客户端证书，多客户端证书新采用PolyClientCertificateIds字段
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get 新字段,修改后的监听器客户端证书ID 
     * @return PolyClientCertificateIds 新字段,修改后的监听器客户端证书ID
     */
    public String [] getPolyClientCertificateIds() {
        return this.PolyClientCertificateIds;
    }

    /**
     * Set 新字段,修改后的监听器客户端证书ID
     * @param PolyClientCertificateIds 新字段,修改后的监听器客户端证书ID
     */
    public void setPolyClientCertificateIds(String [] PolyClientCertificateIds) {
        this.PolyClientCertificateIds = PolyClientCertificateIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamArraySimple(map, prefix + "PolyClientCertificateIds.", this.PolyClientCertificateIds);

    }
}

