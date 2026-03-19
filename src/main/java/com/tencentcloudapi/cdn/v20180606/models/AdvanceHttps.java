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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvanceHttps extends AbstractModel {

    /**
    * <p>自定义Tls数据开关<br>on - 开<br>off - 关</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomTlsStatus")
    @Expose
    private String CustomTlsStatus;

    /**
    * <p>Tls版本列表，支持设置 TLSv1, TLSV1.1, TLSV1.2, TLSv1.3，修改时必须开启连续的版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TlsVersion")
    @Expose
    private String [] TlsVersion;

    /**
    * <p>自定义加密套件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cipher")
    @Expose
    private String Cipher;

    /**
    * <p>回源双向校验开启状态<br>off - 关闭校验<br>oneWay - 校验源站<br>twoWay - 双向校验</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyOriginType")
    @Expose
    private String VerifyOriginType;

    /**
    * <p>回源层证书配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertInfo")
    @Expose
    private ServerCert CertInfo;

    /**
    * <p>源站证书配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginCertInfo")
    @Expose
    private ClientCert OriginCertInfo;

    /**
     * Get <p>自定义Tls数据开关<br>on - 开<br>off - 关</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomTlsStatus <p>自定义Tls数据开关<br>on - 开<br>off - 关</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomTlsStatus() {
        return this.CustomTlsStatus;
    }

    /**
     * Set <p>自定义Tls数据开关<br>on - 开<br>off - 关</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomTlsStatus <p>自定义Tls数据开关<br>on - 开<br>off - 关</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomTlsStatus(String CustomTlsStatus) {
        this.CustomTlsStatus = CustomTlsStatus;
    }

    /**
     * Get <p>Tls版本列表，支持设置 TLSv1, TLSV1.1, TLSV1.2, TLSv1.3，修改时必须开启连续的版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TlsVersion <p>Tls版本列表，支持设置 TLSv1, TLSV1.1, TLSV1.2, TLSv1.3，修改时必须开启连续的版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTlsVersion() {
        return this.TlsVersion;
    }

    /**
     * Set <p>Tls版本列表，支持设置 TLSv1, TLSV1.1, TLSV1.2, TLSv1.3，修改时必须开启连续的版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TlsVersion <p>Tls版本列表，支持设置 TLSv1, TLSV1.1, TLSV1.2, TLSv1.3，修改时必须开启连续的版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTlsVersion(String [] TlsVersion) {
        this.TlsVersion = TlsVersion;
    }

    /**
     * Get <p>自定义加密套件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cipher <p>自定义加密套件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCipher() {
        return this.Cipher;
    }

    /**
     * Set <p>自定义加密套件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cipher <p>自定义加密套件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCipher(String Cipher) {
        this.Cipher = Cipher;
    }

    /**
     * Get <p>回源双向校验开启状态<br>off - 关闭校验<br>oneWay - 校验源站<br>twoWay - 双向校验</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyOriginType <p>回源双向校验开启状态<br>off - 关闭校验<br>oneWay - 校验源站<br>twoWay - 双向校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyOriginType() {
        return this.VerifyOriginType;
    }

    /**
     * Set <p>回源双向校验开启状态<br>off - 关闭校验<br>oneWay - 校验源站<br>twoWay - 双向校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyOriginType <p>回源双向校验开启状态<br>off - 关闭校验<br>oneWay - 校验源站<br>twoWay - 双向校验</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyOriginType(String VerifyOriginType) {
        this.VerifyOriginType = VerifyOriginType;
    }

    /**
     * Get <p>回源层证书配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertInfo <p>回源层证书配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerCert getCertInfo() {
        return this.CertInfo;
    }

    /**
     * Set <p>回源层证书配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertInfo <p>回源层证书配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertInfo(ServerCert CertInfo) {
        this.CertInfo = CertInfo;
    }

    /**
     * Get <p>源站证书配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginCertInfo <p>源站证书配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClientCert getOriginCertInfo() {
        return this.OriginCertInfo;
    }

    /**
     * Set <p>源站证书配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginCertInfo <p>源站证书配置信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginCertInfo(ClientCert OriginCertInfo) {
        this.OriginCertInfo = OriginCertInfo;
    }

    public AdvanceHttps() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvanceHttps(AdvanceHttps source) {
        if (source.CustomTlsStatus != null) {
            this.CustomTlsStatus = new String(source.CustomTlsStatus);
        }
        if (source.TlsVersion != null) {
            this.TlsVersion = new String[source.TlsVersion.length];
            for (int i = 0; i < source.TlsVersion.length; i++) {
                this.TlsVersion[i] = new String(source.TlsVersion[i]);
            }
        }
        if (source.Cipher != null) {
            this.Cipher = new String(source.Cipher);
        }
        if (source.VerifyOriginType != null) {
            this.VerifyOriginType = new String(source.VerifyOriginType);
        }
        if (source.CertInfo != null) {
            this.CertInfo = new ServerCert(source.CertInfo);
        }
        if (source.OriginCertInfo != null) {
            this.OriginCertInfo = new ClientCert(source.OriginCertInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomTlsStatus", this.CustomTlsStatus);
        this.setParamArraySimple(map, prefix + "TlsVersion.", this.TlsVersion);
        this.setParamSimple(map, prefix + "Cipher", this.Cipher);
        this.setParamSimple(map, prefix + "VerifyOriginType", this.VerifyOriginType);
        this.setParamObj(map, prefix + "CertInfo.", this.CertInfo);
        this.setParamObj(map, prefix + "OriginCertInfo.", this.OriginCertInfo);

    }
}

