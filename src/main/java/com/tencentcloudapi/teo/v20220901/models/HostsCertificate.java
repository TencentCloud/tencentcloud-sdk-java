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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostsCertificate extends AbstractModel {

    /**
    * 域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 配置证书的模式，取值有：
<li>disable：不配置证书；</li>
<li>eofreecert：配置 EdgeOne 免费证书；</li> 
<li>sslcert：配置 SSL 证书；</li> 
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 服务端证书配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostCertInfo")
    @Expose
    private HostCertInfo [] HostCertInfo;

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
     * Get 域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host 域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host 域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 配置证书的模式，取值有：
<li>disable：不配置证书；</li>
<li>eofreecert：配置 EdgeOne 免费证书；</li> 
<li>sslcert：配置 SSL 证书；</li>  
     * @return Mode 配置证书的模式，取值有：
<li>disable：不配置证书；</li>
<li>eofreecert：配置 EdgeOne 免费证书；</li> 
<li>sslcert：配置 SSL 证书；</li> 
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 配置证书的模式，取值有：
<li>disable：不配置证书；</li>
<li>eofreecert：配置 EdgeOne 免费证书；</li> 
<li>sslcert：配置 SSL 证书；</li> 
     * @param Mode 配置证书的模式，取值有：
<li>disable：不配置证书；</li>
<li>eofreecert：配置 EdgeOne 免费证书；</li> 
<li>sslcert：配置 SSL 证书；</li> 
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 服务端证书配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostCertInfo 服务端证书配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HostCertInfo [] getHostCertInfo() {
        return this.HostCertInfo;
    }

    /**
     * Set 服务端证书配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostCertInfo 服务端证书配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostCertInfo(HostCertInfo [] HostCertInfo) {
        this.HostCertInfo = HostCertInfo;
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
     * @deprecated
     */
    @Deprecated
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
     * @deprecated
     */
    @Deprecated
    public void setApplyType(String ApplyType) {
        this.ApplyType = ApplyType;
    }

    public HostsCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostsCertificate(HostsCertificate source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.HostCertInfo != null) {
            this.HostCertInfo = new HostCertInfo[source.HostCertInfo.length];
            for (int i = 0; i < source.HostCertInfo.length; i++) {
                this.HostCertInfo[i] = new HostCertInfo(source.HostCertInfo[i]);
            }
        }
        if (source.ApplyType != null) {
            this.ApplyType = new String(source.ApplyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "HostCertInfo.", this.HostCertInfo);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);

    }
}

