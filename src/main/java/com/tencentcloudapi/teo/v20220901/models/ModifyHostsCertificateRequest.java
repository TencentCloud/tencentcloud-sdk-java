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

public class ModifyHostsCertificateRequest extends AbstractModel{

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 需要修改证书配置的加速域名。
    */
    @SerializedName("Hosts")
    @Expose
    private String [] Hosts;

    /**
    * 配置证书的模式，取值有：
<li>disable：不配置证书；</li>
<li>eofreecert：配置 EdgeOne 免费证书；</li>
<li>sslcert：配置 SSL 证书。</li>不填时默认取值为 disable。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * SSL 证书配置，本参数仅在 mode = sslcert 时生效，传入对应证书的 CertId 即可。您可以前往 [SSL 证书列表](https://console.cloud.tencent.com/certoverview) 查看 CertId。
    */
    @SerializedName("ServerCertInfo")
    @Expose
    private ServerCertInfo [] ServerCertInfo;

    /**
    * 托管类型，取值有：
<li>none：不托管EO；</li>
<li>apply：托管EO</li>
不填，默认取值为none。
    */
    @SerializedName("ApplyType")
    @Expose
    private String ApplyType;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 需要修改证书配置的加速域名。 
     * @return Hosts 需要修改证书配置的加速域名。
     */
    public String [] getHosts() {
        return this.Hosts;
    }

    /**
     * Set 需要修改证书配置的加速域名。
     * @param Hosts 需要修改证书配置的加速域名。
     */
    public void setHosts(String [] Hosts) {
        this.Hosts = Hosts;
    }

    /**
     * Get 配置证书的模式，取值有：
<li>disable：不配置证书；</li>
<li>eofreecert：配置 EdgeOne 免费证书；</li>
<li>sslcert：配置 SSL 证书。</li>不填时默认取值为 disable。 
     * @return Mode 配置证书的模式，取值有：
<li>disable：不配置证书；</li>
<li>eofreecert：配置 EdgeOne 免费证书；</li>
<li>sslcert：配置 SSL 证书。</li>不填时默认取值为 disable。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 配置证书的模式，取值有：
<li>disable：不配置证书；</li>
<li>eofreecert：配置 EdgeOne 免费证书；</li>
<li>sslcert：配置 SSL 证书。</li>不填时默认取值为 disable。
     * @param Mode 配置证书的模式，取值有：
<li>disable：不配置证书；</li>
<li>eofreecert：配置 EdgeOne 免费证书；</li>
<li>sslcert：配置 SSL 证书。</li>不填时默认取值为 disable。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get SSL 证书配置，本参数仅在 mode = sslcert 时生效，传入对应证书的 CertId 即可。您可以前往 [SSL 证书列表](https://console.cloud.tencent.com/certoverview) 查看 CertId。 
     * @return ServerCertInfo SSL 证书配置，本参数仅在 mode = sslcert 时生效，传入对应证书的 CertId 即可。您可以前往 [SSL 证书列表](https://console.cloud.tencent.com/certoverview) 查看 CertId。
     */
    public ServerCertInfo [] getServerCertInfo() {
        return this.ServerCertInfo;
    }

    /**
     * Set SSL 证书配置，本参数仅在 mode = sslcert 时生效，传入对应证书的 CertId 即可。您可以前往 [SSL 证书列表](https://console.cloud.tencent.com/certoverview) 查看 CertId。
     * @param ServerCertInfo SSL 证书配置，本参数仅在 mode = sslcert 时生效，传入对应证书的 CertId 即可。您可以前往 [SSL 证书列表](https://console.cloud.tencent.com/certoverview) 查看 CertId。
     */
    public void setServerCertInfo(ServerCertInfo [] ServerCertInfo) {
        this.ServerCertInfo = ServerCertInfo;
    }

    /**
     * Get 托管类型，取值有：
<li>none：不托管EO；</li>
<li>apply：托管EO</li>
不填，默认取值为none。 
     * @return ApplyType 托管类型，取值有：
<li>none：不托管EO；</li>
<li>apply：托管EO</li>
不填，默认取值为none。
     * @deprecated
     */
    @Deprecated
    public String getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set 托管类型，取值有：
<li>none：不托管EO；</li>
<li>apply：托管EO</li>
不填，默认取值为none。
     * @param ApplyType 托管类型，取值有：
<li>none：不托管EO；</li>
<li>apply：托管EO</li>
不填，默认取值为none。
     * @deprecated
     */
    @Deprecated
    public void setApplyType(String ApplyType) {
        this.ApplyType = ApplyType;
    }

    public ModifyHostsCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHostsCertificateRequest(ModifyHostsCertificateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Hosts != null) {
            this.Hosts = new String[source.Hosts.length];
            for (int i = 0; i < source.Hosts.length; i++) {
                this.Hosts[i] = new String(source.Hosts[i]);
            }
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ServerCertInfo != null) {
            this.ServerCertInfo = new ServerCertInfo[source.ServerCertInfo.length];
            for (int i = 0; i < source.ServerCertInfo.length; i++) {
                this.ServerCertInfo[i] = new ServerCertInfo(source.ServerCertInfo[i]);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Hosts.", this.Hosts);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "ServerCertInfo.", this.ServerCertInfo);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);

    }
}

