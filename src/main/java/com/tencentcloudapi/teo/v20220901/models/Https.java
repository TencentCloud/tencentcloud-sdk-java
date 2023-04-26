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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Https extends AbstractModel{

    /**
    * http2 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Http2")
    @Expose
    private String Http2;

    /**
    * OCSP 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcspStapling")
    @Expose
    private String OcspStapling;

    /**
    * Tls 版本设置，取值有：
<li>TLSv1：TLSv1版本；</li>
<li>TLSV1.1：TLSv1.1版本；</li>
<li>TLSV1.2：TLSv1.2版本；</li>
<li>TLSv1.3：TLSv1.3版本。</li>修改时必须开启连续的版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TlsVersion")
    @Expose
    private String [] TlsVersion;

    /**
    * HSTS 配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hsts")
    @Expose
    private Hsts Hsts;

    /**
    * 证书配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertInfo")
    @Expose
    private ServerCertInfo [] CertInfo;

    /**
    * 申请类型，取值有：
<li>apply：托管EdgeOne；</li>
<li>none：不托管EdgeOne。</li>不填，默认取值为none。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyType")
    @Expose
    private String ApplyType;

    /**
    * 密码套件，取值有：
<li>loose-v2023：提供最高的兼容性，安全性一般，支持 TLS 1.0-1.3 密码套件；</li>
<li>general-v2023：提供较高的兼容性，安全性中等，支持 TLS 1.2-1.3 密码套件；</li>
<li>strict-v2023：提供最高的安全性能，禁用所有含不安全隐患的加密套件，支持 TLS 1.2-1.3 密码套件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CipherSuite")
    @Expose
    private String CipherSuite;

    /**
     * Get http2 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Http2 http2 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttp2() {
        return this.Http2;
    }

    /**
     * Set http2 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Http2 http2 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttp2(String Http2) {
        this.Http2 = Http2;
    }

    /**
     * Get OCSP 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcspStapling OCSP 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcspStapling() {
        return this.OcspStapling;
    }

    /**
     * Set OCSP 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcspStapling OCSP 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcspStapling(String OcspStapling) {
        this.OcspStapling = OcspStapling;
    }

    /**
     * Get Tls 版本设置，取值有：
<li>TLSv1：TLSv1版本；</li>
<li>TLSV1.1：TLSv1.1版本；</li>
<li>TLSV1.2：TLSv1.2版本；</li>
<li>TLSv1.3：TLSv1.3版本。</li>修改时必须开启连续的版本。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TlsVersion Tls 版本设置，取值有：
<li>TLSv1：TLSv1版本；</li>
<li>TLSV1.1：TLSv1.1版本；</li>
<li>TLSV1.2：TLSv1.2版本；</li>
<li>TLSv1.3：TLSv1.3版本。</li>修改时必须开启连续的版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTlsVersion() {
        return this.TlsVersion;
    }

    /**
     * Set Tls 版本设置，取值有：
<li>TLSv1：TLSv1版本；</li>
<li>TLSV1.1：TLSv1.1版本；</li>
<li>TLSV1.2：TLSv1.2版本；</li>
<li>TLSv1.3：TLSv1.3版本。</li>修改时必须开启连续的版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TlsVersion Tls 版本设置，取值有：
<li>TLSv1：TLSv1版本；</li>
<li>TLSV1.1：TLSv1.1版本；</li>
<li>TLSV1.2：TLSv1.2版本；</li>
<li>TLSv1.3：TLSv1.3版本。</li>修改时必须开启连续的版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTlsVersion(String [] TlsVersion) {
        this.TlsVersion = TlsVersion;
    }

    /**
     * Get HSTS 配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hsts HSTS 配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Hsts getHsts() {
        return this.Hsts;
    }

    /**
     * Set HSTS 配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hsts HSTS 配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHsts(Hsts Hsts) {
        this.Hsts = Hsts;
    }

    /**
     * Get 证书配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertInfo 证书配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerCertInfo [] getCertInfo() {
        return this.CertInfo;
    }

    /**
     * Set 证书配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertInfo 证书配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertInfo(ServerCertInfo [] CertInfo) {
        this.CertInfo = CertInfo;
    }

    /**
     * Get 申请类型，取值有：
<li>apply：托管EdgeOne；</li>
<li>none：不托管EdgeOne。</li>不填，默认取值为none。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyType 申请类型，取值有：
<li>apply：托管EdgeOne；</li>
<li>none：不托管EdgeOne。</li>不填，默认取值为none。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set 申请类型，取值有：
<li>apply：托管EdgeOne；</li>
<li>none：不托管EdgeOne。</li>不填，默认取值为none。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyType 申请类型，取值有：
<li>apply：托管EdgeOne；</li>
<li>none：不托管EdgeOne。</li>不填，默认取值为none。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyType(String ApplyType) {
        this.ApplyType = ApplyType;
    }

    /**
     * Get 密码套件，取值有：
<li>loose-v2023：提供最高的兼容性，安全性一般，支持 TLS 1.0-1.3 密码套件；</li>
<li>general-v2023：提供较高的兼容性，安全性中等，支持 TLS 1.2-1.3 密码套件；</li>
<li>strict-v2023：提供最高的安全性能，禁用所有含不安全隐患的加密套件，支持 TLS 1.2-1.3 密码套件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CipherSuite 密码套件，取值有：
<li>loose-v2023：提供最高的兼容性，安全性一般，支持 TLS 1.0-1.3 密码套件；</li>
<li>general-v2023：提供较高的兼容性，安全性中等，支持 TLS 1.2-1.3 密码套件；</li>
<li>strict-v2023：提供最高的安全性能，禁用所有含不安全隐患的加密套件，支持 TLS 1.2-1.3 密码套件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCipherSuite() {
        return this.CipherSuite;
    }

    /**
     * Set 密码套件，取值有：
<li>loose-v2023：提供最高的兼容性，安全性一般，支持 TLS 1.0-1.3 密码套件；</li>
<li>general-v2023：提供较高的兼容性，安全性中等，支持 TLS 1.2-1.3 密码套件；</li>
<li>strict-v2023：提供最高的安全性能，禁用所有含不安全隐患的加密套件，支持 TLS 1.2-1.3 密码套件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CipherSuite 密码套件，取值有：
<li>loose-v2023：提供最高的兼容性，安全性一般，支持 TLS 1.0-1.3 密码套件；</li>
<li>general-v2023：提供较高的兼容性，安全性中等，支持 TLS 1.2-1.3 密码套件；</li>
<li>strict-v2023：提供最高的安全性能，禁用所有含不安全隐患的加密套件，支持 TLS 1.2-1.3 密码套件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCipherSuite(String CipherSuite) {
        this.CipherSuite = CipherSuite;
    }

    public Https() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Https(Https source) {
        if (source.Http2 != null) {
            this.Http2 = new String(source.Http2);
        }
        if (source.OcspStapling != null) {
            this.OcspStapling = new String(source.OcspStapling);
        }
        if (source.TlsVersion != null) {
            this.TlsVersion = new String[source.TlsVersion.length];
            for (int i = 0; i < source.TlsVersion.length; i++) {
                this.TlsVersion[i] = new String(source.TlsVersion[i]);
            }
        }
        if (source.Hsts != null) {
            this.Hsts = new Hsts(source.Hsts);
        }
        if (source.CertInfo != null) {
            this.CertInfo = new ServerCertInfo[source.CertInfo.length];
            for (int i = 0; i < source.CertInfo.length; i++) {
                this.CertInfo[i] = new ServerCertInfo(source.CertInfo[i]);
            }
        }
        if (source.ApplyType != null) {
            this.ApplyType = new String(source.ApplyType);
        }
        if (source.CipherSuite != null) {
            this.CipherSuite = new String(source.CipherSuite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Http2", this.Http2);
        this.setParamSimple(map, prefix + "OcspStapling", this.OcspStapling);
        this.setParamArraySimple(map, prefix + "TlsVersion.", this.TlsVersion);
        this.setParamObj(map, prefix + "Hsts.", this.Hsts);
        this.setParamArrayObj(map, prefix + "CertInfo.", this.CertInfo);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);
        this.setParamSimple(map, prefix + "CipherSuite", this.CipherSuite);

    }
}

