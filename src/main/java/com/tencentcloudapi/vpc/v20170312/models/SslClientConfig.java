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

public class SslClientConfig extends AbstractModel{

    /**
    * 客户端配置
    */
    @SerializedName("SslVpnClientConfiguration")
    @Expose
    private String SslVpnClientConfiguration;

    /**
    * 更证书
    */
    @SerializedName("SslVpnRootCert")
    @Expose
    private String SslVpnRootCert;

    /**
    * 客户端密钥
    */
    @SerializedName("SslVpnKey")
    @Expose
    private String SslVpnKey;

    /**
    * 客户端证书
    */
    @SerializedName("SslVpnCert")
    @Expose
    private String SslVpnCert;

    /**
    * SSL-VPN-CLIENT 实例ID。
    */
    @SerializedName("SslVpnClientId")
    @Expose
    private String SslVpnClientId;

    /**
     * Get 客户端配置 
     * @return SslVpnClientConfiguration 客户端配置
     */
    public String getSslVpnClientConfiguration() {
        return this.SslVpnClientConfiguration;
    }

    /**
     * Set 客户端配置
     * @param SslVpnClientConfiguration 客户端配置
     */
    public void setSslVpnClientConfiguration(String SslVpnClientConfiguration) {
        this.SslVpnClientConfiguration = SslVpnClientConfiguration;
    }

    /**
     * Get 更证书 
     * @return SslVpnRootCert 更证书
     */
    public String getSslVpnRootCert() {
        return this.SslVpnRootCert;
    }

    /**
     * Set 更证书
     * @param SslVpnRootCert 更证书
     */
    public void setSslVpnRootCert(String SslVpnRootCert) {
        this.SslVpnRootCert = SslVpnRootCert;
    }

    /**
     * Get 客户端密钥 
     * @return SslVpnKey 客户端密钥
     */
    public String getSslVpnKey() {
        return this.SslVpnKey;
    }

    /**
     * Set 客户端密钥
     * @param SslVpnKey 客户端密钥
     */
    public void setSslVpnKey(String SslVpnKey) {
        this.SslVpnKey = SslVpnKey;
    }

    /**
     * Get 客户端证书 
     * @return SslVpnCert 客户端证书
     */
    public String getSslVpnCert() {
        return this.SslVpnCert;
    }

    /**
     * Set 客户端证书
     * @param SslVpnCert 客户端证书
     */
    public void setSslVpnCert(String SslVpnCert) {
        this.SslVpnCert = SslVpnCert;
    }

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

    public SslClientConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SslClientConfig(SslClientConfig source) {
        if (source.SslVpnClientConfiguration != null) {
            this.SslVpnClientConfiguration = new String(source.SslVpnClientConfiguration);
        }
        if (source.SslVpnRootCert != null) {
            this.SslVpnRootCert = new String(source.SslVpnRootCert);
        }
        if (source.SslVpnKey != null) {
            this.SslVpnKey = new String(source.SslVpnKey);
        }
        if (source.SslVpnCert != null) {
            this.SslVpnCert = new String(source.SslVpnCert);
        }
        if (source.SslVpnClientId != null) {
            this.SslVpnClientId = new String(source.SslVpnClientId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SslVpnClientConfiguration", this.SslVpnClientConfiguration);
        this.setParamSimple(map, prefix + "SslVpnRootCert", this.SslVpnRootCert);
        this.setParamSimple(map, prefix + "SslVpnKey", this.SslVpnKey);
        this.setParamSimple(map, prefix + "SslVpnCert", this.SslVpnCert);
        this.setParamSimple(map, prefix + "SslVpnClientId", this.SslVpnClientId);

    }
}

