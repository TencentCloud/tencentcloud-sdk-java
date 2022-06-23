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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadVpnGatewaySslClientCertRequest extends AbstractModel{

    /**
    * SSL-VPN-CLIENT 实例ID。
    */
    @SerializedName("SslVpnClientId")
    @Expose
    private String SslVpnClientId;

    /**
    * SAML-TOKEN
    */
    @SerializedName("SamlToken")
    @Expose
    private String SamlToken;

    /**
    * VPN门户网站使用。默认Flase
    */
    @SerializedName("IsVpnPortal")
    @Expose
    private Boolean IsVpnPortal;

    /**
     * Get SSL-VPN-CLIENT 实例ID。 
     * @return SslVpnClientId SSL-VPN-CLIENT 实例ID。
     */
    public String getSslVpnClientId() {
        return this.SslVpnClientId;
    }

    /**
     * Set SSL-VPN-CLIENT 实例ID。
     * @param SslVpnClientId SSL-VPN-CLIENT 实例ID。
     */
    public void setSslVpnClientId(String SslVpnClientId) {
        this.SslVpnClientId = SslVpnClientId;
    }

    /**
     * Get SAML-TOKEN 
     * @return SamlToken SAML-TOKEN
     */
    public String getSamlToken() {
        return this.SamlToken;
    }

    /**
     * Set SAML-TOKEN
     * @param SamlToken SAML-TOKEN
     */
    public void setSamlToken(String SamlToken) {
        this.SamlToken = SamlToken;
    }

    /**
     * Get VPN门户网站使用。默认Flase 
     * @return IsVpnPortal VPN门户网站使用。默认Flase
     */
    public Boolean getIsVpnPortal() {
        return this.IsVpnPortal;
    }

    /**
     * Set VPN门户网站使用。默认Flase
     * @param IsVpnPortal VPN门户网站使用。默认Flase
     */
    public void setIsVpnPortal(Boolean IsVpnPortal) {
        this.IsVpnPortal = IsVpnPortal;
    }

    public DownloadVpnGatewaySslClientCertRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadVpnGatewaySslClientCertRequest(DownloadVpnGatewaySslClientCertRequest source) {
        if (source.SslVpnClientId != null) {
            this.SslVpnClientId = new String(source.SslVpnClientId);
        }
        if (source.SamlToken != null) {
            this.SamlToken = new String(source.SamlToken);
        }
        if (source.IsVpnPortal != null) {
            this.IsVpnPortal = new Boolean(source.IsVpnPortal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SslVpnClientId", this.SslVpnClientId);
        this.setParamSimple(map, prefix + "SamlToken", this.SamlToken);
        this.setParamSimple(map, prefix + "IsVpnPortal", this.IsVpnPortal);

    }
}

