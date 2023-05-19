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
    * SSL-VPN-CLIENT 实例ID。不可以和SslVpnClientIds同时使用。
    */
    @SerializedName("SslVpnClientId")
    @Expose
    private String SslVpnClientId;

    /**
    * SAML Token（SAML令牌）。
    */
    @SerializedName("SamlToken")
    @Expose
    private String SamlToken;

    /**
    * VPN门户网站使用。默认False
    */
    @SerializedName("IsVpnPortal")
    @Expose
    private Boolean IsVpnPortal;

    /**
    * SSL-VPN-CLIENT 实例ID列表。批量下载时使用。不可以和SslVpnClientId同时使用。
    */
    @SerializedName("SslVpnClientIds")
    @Expose
    private String [] SslVpnClientIds;

    /**
     * Get SSL-VPN-CLIENT 实例ID。不可以和SslVpnClientIds同时使用。 
     * @return SslVpnClientId SSL-VPN-CLIENT 实例ID。不可以和SslVpnClientIds同时使用。
     */
    public String getSslVpnClientId() {
        return this.SslVpnClientId;
    }

    /**
     * Set SSL-VPN-CLIENT 实例ID。不可以和SslVpnClientIds同时使用。
     * @param SslVpnClientId SSL-VPN-CLIENT 实例ID。不可以和SslVpnClientIds同时使用。
     */
    public void setSslVpnClientId(String SslVpnClientId) {
        this.SslVpnClientId = SslVpnClientId;
    }

    /**
     * Get SAML Token（SAML令牌）。 
     * @return SamlToken SAML Token（SAML令牌）。
     */
    public String getSamlToken() {
        return this.SamlToken;
    }

    /**
     * Set SAML Token（SAML令牌）。
     * @param SamlToken SAML Token（SAML令牌）。
     */
    public void setSamlToken(String SamlToken) {
        this.SamlToken = SamlToken;
    }

    /**
     * Get VPN门户网站使用。默认False 
     * @return IsVpnPortal VPN门户网站使用。默认False
     */
    public Boolean getIsVpnPortal() {
        return this.IsVpnPortal;
    }

    /**
     * Set VPN门户网站使用。默认False
     * @param IsVpnPortal VPN门户网站使用。默认False
     */
    public void setIsVpnPortal(Boolean IsVpnPortal) {
        this.IsVpnPortal = IsVpnPortal;
    }

    /**
     * Get SSL-VPN-CLIENT 实例ID列表。批量下载时使用。不可以和SslVpnClientId同时使用。 
     * @return SslVpnClientIds SSL-VPN-CLIENT 实例ID列表。批量下载时使用。不可以和SslVpnClientId同时使用。
     */
    public String [] getSslVpnClientIds() {
        return this.SslVpnClientIds;
    }

    /**
     * Set SSL-VPN-CLIENT 实例ID列表。批量下载时使用。不可以和SslVpnClientId同时使用。
     * @param SslVpnClientIds SSL-VPN-CLIENT 实例ID列表。批量下载时使用。不可以和SslVpnClientId同时使用。
     */
    public void setSslVpnClientIds(String [] SslVpnClientIds) {
        this.SslVpnClientIds = SslVpnClientIds;
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
        if (source.SslVpnClientIds != null) {
            this.SslVpnClientIds = new String[source.SslVpnClientIds.length];
            for (int i = 0; i < source.SslVpnClientIds.length; i++) {
                this.SslVpnClientIds[i] = new String(source.SslVpnClientIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SslVpnClientId", this.SslVpnClientId);
        this.setParamSimple(map, prefix + "SamlToken", this.SamlToken);
        this.setParamSimple(map, prefix + "IsVpnPortal", this.IsVpnPortal);
        this.setParamArraySimple(map, prefix + "SslVpnClientIds.", this.SslVpnClientIds);

    }
}

