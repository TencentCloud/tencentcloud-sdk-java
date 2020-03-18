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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Https extends AbstractModel{

    /**
    * https配置开关，on或off。开启https配置的域名在部署中状态，开关保持off。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 是否开启http2，on或off。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Http2")
    @Expose
    private String Http2;

    /**
    * 是否开启OCSP功能，on或off。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcspStapling")
    @Expose
    private String OcspStapling;

    /**
    * 是否开启客户端证书校验功能，on或off，开启时必选上传客户端证书信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyClient")
    @Expose
    private String VerifyClient;

    /**
    * 服务器证书配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertInfo")
    @Expose
    private ServerCert CertInfo;

    /**
    * 客户端证书配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientCertInfo")
    @Expose
    private ClientCert ClientCertInfo;

    /**
    * 是否开启Spdy，on或off。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spdy")
    @Expose
    private String Spdy;

    /**
    * https证书部署状态，closed，deploying，deployed，failed分别表示已关闭，部署中，部署成功，部署失败。不可作为入参使用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SslStatus")
    @Expose
    private String SslStatus;

    /**
     * Get https配置开关，on或off。开启https配置的域名在部署中状态，开关保持off。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch https配置开关，on或off。开启https配置的域名在部署中状态，开关保持off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set https配置开关，on或off。开启https配置的域名在部署中状态，开关保持off。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch https配置开关，on或off。开启https配置的域名在部署中状态，开关保持off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 是否开启http2，on或off。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Http2 是否开启http2，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttp2() {
        return this.Http2;
    }

    /**
     * Set 是否开启http2，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Http2 是否开启http2，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttp2(String Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get 是否开启OCSP功能，on或off。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcspStapling 是否开启OCSP功能，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcspStapling() {
        return this.OcspStapling;
    }

    /**
     * Set 是否开启OCSP功能，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcspStapling 是否开启OCSP功能，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcspStapling(String OcspStapling) {
        this.OcspStapling = OcspStapling;
    }

    /**
     * Get 是否开启客户端证书校验功能，on或off，开启时必选上传客户端证书信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyClient 是否开启客户端证书校验功能，on或off，开启时必选上传客户端证书信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyClient() {
        return this.VerifyClient;
    }

    /**
     * Set 是否开启客户端证书校验功能，on或off，开启时必选上传客户端证书信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyClient 是否开启客户端证书校验功能，on或off，开启时必选上传客户端证书信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyClient(String VerifyClient) {
        this.VerifyClient = VerifyClient;
    }

    /**
     * Get 服务器证书配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertInfo 服务器证书配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerCert getCertInfo() {
        return this.CertInfo;
    }

    /**
     * Set 服务器证书配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertInfo 服务器证书配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertInfo(ServerCert CertInfo) {
        this.CertInfo = CertInfo;
    }

    /**
     * Get 客户端证书配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientCertInfo 客户端证书配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientCert getClientCertInfo() {
        return this.ClientCertInfo;
    }

    /**
     * Set 客户端证书配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientCertInfo 客户端证书配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientCertInfo(ClientCert ClientCertInfo) {
        this.ClientCertInfo = ClientCertInfo;
    }

    /**
     * Get 是否开启Spdy，on或off。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Spdy 是否开启Spdy，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpdy() {
        return this.Spdy;
    }

    /**
     * Set 是否开启Spdy，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spdy 是否开启Spdy，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpdy(String Spdy) {
        this.Spdy = Spdy;
    }

    /**
     * Get https证书部署状态，closed，deploying，deployed，failed分别表示已关闭，部署中，部署成功，部署失败。不可作为入参使用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SslStatus https证书部署状态，closed，deploying，deployed，failed分别表示已关闭，部署中，部署成功，部署失败。不可作为入参使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSslStatus() {
        return this.SslStatus;
    }

    /**
     * Set https证书部署状态，closed，deploying，deployed，failed分别表示已关闭，部署中，部署成功，部署失败。不可作为入参使用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SslStatus https证书部署状态，closed，deploying，deployed，failed分别表示已关闭，部署中，部署成功，部署失败。不可作为入参使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSslStatus(String SslStatus) {
        this.SslStatus = SslStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "OcspStapling", this.OcspStapling);
        this.setParamSimple(map, prefix + "VerifyClient", this.VerifyClient);
        this.setParamObj(map, prefix + "CertInfo.", this.CertInfo);
        this.setParamObj(map, prefix + "ClientCertInfo.", this.ClientCertInfo);
        this.setParamSimple(map, prefix + "Spdy", this.Spdy);
        this.setParamSimple(map, prefix + "SslStatus", this.SslStatus);

    }
}

