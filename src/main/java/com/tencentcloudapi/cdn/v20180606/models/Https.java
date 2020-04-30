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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Https extends AbstractModel{

    /**
    * https 配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * http2 配置开关
on：开启
off：关闭
初次启用 https 加速会默认开启 http2 配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Http2")
    @Expose
    private String Http2;

    /**
    * OCSP 配置开关
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcspStapling")
    @Expose
    private String OcspStapling;

    /**
    * 客户端证书校验功能
on：开启
off：关闭
默认为关闭状态，开启时需要上传客户端证书信息，该配置项目前在灰度中，尚未全量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyClient")
    @Expose
    private String VerifyClient;

    /**
    * 服务端证书配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertInfo")
    @Expose
    private ServerCert CertInfo;

    /**
    * 客户端证书配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientCertInfo")
    @Expose
    private ClientCert ClientCertInfo;

    /**
    * Spdy 配置开关
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spdy")
    @Expose
    private String Spdy;

    /**
    * https 证书部署状态
closed：已关闭
deploying：部署中
deployed：部署成功
failed：部署失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SslStatus")
    @Expose
    private String SslStatus;

    /**
    * TLS版本列表，支持填写以下值：
TLSv1.0, TLSv1.1, TLSv1.2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TlsVersion")
    @Expose
    private String [] TlsVersion;

    /**
    * Hsts配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hsts")
    @Expose
    private Hsts Hsts;

    /**
     * Get https 配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch https 配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set https 配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch https 配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get http2 配置开关
on：开启
off：关闭
初次启用 https 加速会默认开启 http2 配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Http2 http2 配置开关
on：开启
off：关闭
初次启用 https 加速会默认开启 http2 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttp2() {
        return this.Http2;
    }

    /**
     * Set http2 配置开关
on：开启
off：关闭
初次启用 https 加速会默认开启 http2 配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Http2 http2 配置开关
on：开启
off：关闭
初次启用 https 加速会默认开启 http2 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttp2(String Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get OCSP 配置开关
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcspStapling OCSP 配置开关
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcspStapling() {
        return this.OcspStapling;
    }

    /**
     * Set OCSP 配置开关
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcspStapling OCSP 配置开关
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcspStapling(String OcspStapling) {
        this.OcspStapling = OcspStapling;
    }

    /**
     * Get 客户端证书校验功能
on：开启
off：关闭
默认为关闭状态，开启时需要上传客户端证书信息，该配置项目前在灰度中，尚未全量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyClient 客户端证书校验功能
on：开启
off：关闭
默认为关闭状态，开启时需要上传客户端证书信息，该配置项目前在灰度中，尚未全量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyClient() {
        return this.VerifyClient;
    }

    /**
     * Set 客户端证书校验功能
on：开启
off：关闭
默认为关闭状态，开启时需要上传客户端证书信息，该配置项目前在灰度中，尚未全量
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyClient 客户端证书校验功能
on：开启
off：关闭
默认为关闭状态，开启时需要上传客户端证书信息，该配置项目前在灰度中，尚未全量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyClient(String VerifyClient) {
        this.VerifyClient = VerifyClient;
    }

    /**
     * Get 服务端证书配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertInfo 服务端证书配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerCert getCertInfo() {
        return this.CertInfo;
    }

    /**
     * Set 服务端证书配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertInfo 服务端证书配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertInfo(ServerCert CertInfo) {
        this.CertInfo = CertInfo;
    }

    /**
     * Get 客户端证书配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientCertInfo 客户端证书配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientCert getClientCertInfo() {
        return this.ClientCertInfo;
    }

    /**
     * Set 客户端证书配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientCertInfo 客户端证书配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientCertInfo(ClientCert ClientCertInfo) {
        this.ClientCertInfo = ClientCertInfo;
    }

    /**
     * Get Spdy 配置开关
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Spdy Spdy 配置开关
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpdy() {
        return this.Spdy;
    }

    /**
     * Set Spdy 配置开关
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spdy Spdy 配置开关
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpdy(String Spdy) {
        this.Spdy = Spdy;
    }

    /**
     * Get https 证书部署状态
closed：已关闭
deploying：部署中
deployed：部署成功
failed：部署失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SslStatus https 证书部署状态
closed：已关闭
deploying：部署中
deployed：部署成功
failed：部署失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSslStatus() {
        return this.SslStatus;
    }

    /**
     * Set https 证书部署状态
closed：已关闭
deploying：部署中
deployed：部署成功
failed：部署失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param SslStatus https 证书部署状态
closed：已关闭
deploying：部署中
deployed：部署成功
failed：部署失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSslStatus(String SslStatus) {
        this.SslStatus = SslStatus;
    }

    /**
     * Get TLS版本列表，支持填写以下值：
TLSv1.0, TLSv1.1, TLSv1.2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TlsVersion TLS版本列表，支持填写以下值：
TLSv1.0, TLSv1.1, TLSv1.2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTlsVersion() {
        return this.TlsVersion;
    }

    /**
     * Set TLS版本列表，支持填写以下值：
TLSv1.0, TLSv1.1, TLSv1.2
注意：此字段可能返回 null，表示取不到有效值。
     * @param TlsVersion TLS版本列表，支持填写以下值：
TLSv1.0, TLSv1.1, TLSv1.2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTlsVersion(String [] TlsVersion) {
        this.TlsVersion = TlsVersion;
    }

    /**
     * Get Hsts配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hsts Hsts配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Hsts getHsts() {
        return this.Hsts;
    }

    /**
     * Set Hsts配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hsts Hsts配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHsts(Hsts Hsts) {
        this.Hsts = Hsts;
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
        this.setParamArraySimple(map, prefix + "TlsVersion.", this.TlsVersion);
        this.setParamObj(map, prefix + "Hsts.", this.Hsts);

    }
}

