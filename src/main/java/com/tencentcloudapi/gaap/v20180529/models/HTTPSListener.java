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

public class HTTPSListener extends AbstractModel{

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 监听器协议， 值为：HTTP
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器状态，其中：
0表示运行中；
1表示创建中；
2表示销毁中；
3表示源站调整中；
4表示配置变更中。
    */
    @SerializedName("ListenerStatus")
    @Expose
    private Long ListenerStatus;

    /**
    * 监听器服务器SSL证书ID
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 监听器后端转发源站协议
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * 监听器创建时间，Unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 服务器SSL证书的别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
    * 监听器客户端CA证书ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientCertificateId")
    @Expose
    private String ClientCertificateId;

    /**
    * 监听器认证方式。其中，
0，单向认证；
1，双向认证。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 客户端CA证书别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientCertificateAlias")
    @Expose
    private String ClientCertificateAlias;

    /**
    * 多客户端CA证书别名信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolyClientCertificateAliasInfo")
    @Expose
    private CertificateAliasInfo [] PolyClientCertificateAliasInfo;

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
     * Get 监听器名称 
     * @return ListenerName 监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称
     * @param ListenerName 监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器端口 
     * @return Port 监听器端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 监听器端口
     * @param Port 监听器端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 监听器协议， 值为：HTTP 
     * @return Protocol 监听器协议， 值为：HTTP
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议， 值为：HTTP
     * @param Protocol 监听器协议， 值为：HTTP
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器状态，其中：
0表示运行中；
1表示创建中；
2表示销毁中；
3表示源站调整中；
4表示配置变更中。 
     * @return ListenerStatus 监听器状态，其中：
0表示运行中；
1表示创建中；
2表示销毁中；
3表示源站调整中；
4表示配置变更中。
     */
    public Long getListenerStatus() {
        return this.ListenerStatus;
    }

    /**
     * Set 监听器状态，其中：
0表示运行中；
1表示创建中；
2表示销毁中；
3表示源站调整中；
4表示配置变更中。
     * @param ListenerStatus 监听器状态，其中：
0表示运行中；
1表示创建中；
2表示销毁中；
3表示源站调整中；
4表示配置变更中。
     */
    public void setListenerStatus(Long ListenerStatus) {
        this.ListenerStatus = ListenerStatus;
    }

    /**
     * Get 监听器服务器SSL证书ID 
     * @return CertificateId 监听器服务器SSL证书ID
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 监听器服务器SSL证书ID
     * @param CertificateId 监听器服务器SSL证书ID
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 监听器后端转发源站协议 
     * @return ForwardProtocol 监听器后端转发源站协议
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set 监听器后端转发源站协议
     * @param ForwardProtocol 监听器后端转发源站协议
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get 监听器创建时间，Unix时间戳 
     * @return CreateTime 监听器创建时间，Unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 监听器创建时间，Unix时间戳
     * @param CreateTime 监听器创建时间，Unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 服务器SSL证书的别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertificateAlias 服务器SSL证书的别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set 服务器SSL证书的别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertificateAlias 服务器SSL证书的别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    /**
     * Get 监听器客户端CA证书ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientCertificateId 监听器客户端CA证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientCertificateId() {
        return this.ClientCertificateId;
    }

    /**
     * Set 监听器客户端CA证书ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientCertificateId 监听器客户端CA证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientCertificateId(String ClientCertificateId) {
        this.ClientCertificateId = ClientCertificateId;
    }

    /**
     * Get 监听器认证方式。其中，
0，单向认证；
1，双向认证。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthType 监听器认证方式。其中，
0，单向认证；
1，双向认证。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 监听器认证方式。其中，
0，单向认证；
1，双向认证。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthType 监听器认证方式。其中，
0，单向认证；
1，双向认证。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 客户端CA证书别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientCertificateAlias 客户端CA证书别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientCertificateAlias() {
        return this.ClientCertificateAlias;
    }

    /**
     * Set 客户端CA证书别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientCertificateAlias 客户端CA证书别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientCertificateAlias(String ClientCertificateAlias) {
        this.ClientCertificateAlias = ClientCertificateAlias;
    }

    /**
     * Get 多客户端CA证书别名信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolyClientCertificateAliasInfo 多客户端CA证书别名信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CertificateAliasInfo [] getPolyClientCertificateAliasInfo() {
        return this.PolyClientCertificateAliasInfo;
    }

    /**
     * Set 多客户端CA证书别名信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolyClientCertificateAliasInfo 多客户端CA证书别名信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolyClientCertificateAliasInfo(CertificateAliasInfo [] PolyClientCertificateAliasInfo) {
        this.PolyClientCertificateAliasInfo = PolyClientCertificateAliasInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "ListenerStatus", this.ListenerStatus);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);
        this.setParamSimple(map, prefix + "ClientCertificateId", this.ClientCertificateId);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "ClientCertificateAlias", this.ClientCertificateAlias);
        this.setParamArrayObj(map, prefix + "PolyClientCertificateAliasInfo.", this.PolyClientCertificateAliasInfo);

    }
}

