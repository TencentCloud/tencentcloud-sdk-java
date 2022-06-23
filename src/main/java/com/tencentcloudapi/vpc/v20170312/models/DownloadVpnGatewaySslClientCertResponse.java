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

public class DownloadVpnGatewaySslClientCertResponse extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("SslClientConfigsSet")
    @Expose
    private String SslClientConfigsSet;

    /**
    * SSL-VPN client配置
    */
    @SerializedName("SslClientConfig")
    @Expose
    private SslClientConfig [] SslClientConfig;

    /**
    * 是否鉴权成功 只有传入SamlToken 才生效
    */
    @SerializedName("Authenticated")
    @Expose
    private Long Authenticated;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 无 
     * @return SslClientConfigsSet 无
     */
    public String getSslClientConfigsSet() {
        return this.SslClientConfigsSet;
    }

    /**
     * Set 无
     * @param SslClientConfigsSet 无
     */
    public void setSslClientConfigsSet(String SslClientConfigsSet) {
        this.SslClientConfigsSet = SslClientConfigsSet;
    }

    /**
     * Get SSL-VPN client配置 
     * @return SslClientConfig SSL-VPN client配置
     */
    public SslClientConfig [] getSslClientConfig() {
        return this.SslClientConfig;
    }

    /**
     * Set SSL-VPN client配置
     * @param SslClientConfig SSL-VPN client配置
     */
    public void setSslClientConfig(SslClientConfig [] SslClientConfig) {
        this.SslClientConfig = SslClientConfig;
    }

    /**
     * Get 是否鉴权成功 只有传入SamlToken 才生效 
     * @return Authenticated 是否鉴权成功 只有传入SamlToken 才生效
     */
    public Long getAuthenticated() {
        return this.Authenticated;
    }

    /**
     * Set 是否鉴权成功 只有传入SamlToken 才生效
     * @param Authenticated 是否鉴权成功 只有传入SamlToken 才生效
     */
    public void setAuthenticated(Long Authenticated) {
        this.Authenticated = Authenticated;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DownloadVpnGatewaySslClientCertResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadVpnGatewaySslClientCertResponse(DownloadVpnGatewaySslClientCertResponse source) {
        if (source.SslClientConfigsSet != null) {
            this.SslClientConfigsSet = new String(source.SslClientConfigsSet);
        }
        if (source.SslClientConfig != null) {
            this.SslClientConfig = new SslClientConfig[source.SslClientConfig.length];
            for (int i = 0; i < source.SslClientConfig.length; i++) {
                this.SslClientConfig[i] = new SslClientConfig(source.SslClientConfig[i]);
            }
        }
        if (source.Authenticated != null) {
            this.Authenticated = new Long(source.Authenticated);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SslClientConfigsSet", this.SslClientConfigsSet);
        this.setParamArrayObj(map, prefix + "SslClientConfig.", this.SslClientConfig);
        this.setParamSimple(map, prefix + "Authenticated", this.Authenticated);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

