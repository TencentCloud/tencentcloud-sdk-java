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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Certificate extends AbstractModel {

    /**
    * 证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 证书绑定的域名
    */
    @SerializedName("DnsNames")
    @Expose
    private String [] DnsNames;

    /**
    * 根证书ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * 证书认证模式：UNIDIRECTIONAL单向认证，MUTUAL双向认证
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
     * Get 证书ID 
     * @return CertId 证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书ID
     * @param CertId 证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 证书绑定的域名 
     * @return DnsNames 证书绑定的域名
     */
    public String [] getDnsNames() {
        return this.DnsNames;
    }

    /**
     * Set 证书绑定的域名
     * @param DnsNames 证书绑定的域名
     */
    public void setDnsNames(String [] DnsNames) {
        this.DnsNames = DnsNames;
    }

    /**
     * Get 根证书ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertCaId 根证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set 根证书ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertCaId 根证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get 证书认证模式：UNIDIRECTIONAL单向认证，MUTUAL双向认证
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SSLMode 证书认证模式：UNIDIRECTIONAL单向认证，MUTUAL双向认证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set 证书认证模式：UNIDIRECTIONAL单向认证，MUTUAL双向认证
注意：此字段可能返回 null，表示取不到有效值。
     * @param SSLMode 证书认证模式：UNIDIRECTIONAL单向认证，MUTUAL双向认证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    public Certificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Certificate(Certificate source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.DnsNames != null) {
            this.DnsNames = new String[source.DnsNames.length];
            for (int i = 0; i < source.DnsNames.length; i++) {
                this.DnsNames[i] = new String(source.DnsNames[i]);
            }
        }
        if (source.CertCaId != null) {
            this.CertCaId = new String(source.CertCaId);
        }
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamArraySimple(map, prefix + "DnsNames.", this.DnsNames);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);

    }
}

