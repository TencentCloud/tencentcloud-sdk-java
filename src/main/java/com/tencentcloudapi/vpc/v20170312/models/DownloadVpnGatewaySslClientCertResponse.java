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
    * SSL-VPN-CLIENT 证书配置
    */
    @SerializedName("SslClientConfigsSet")
    @Expose
    private String SslClientConfigsSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SSL-VPN-CLIENT 证书配置 
     * @return SslClientConfigsSet SSL-VPN-CLIENT 证书配置
     */
    public String getSslClientConfigsSet() {
        return this.SslClientConfigsSet;
    }

    /**
     * Set SSL-VPN-CLIENT 证书配置
     * @param SslClientConfigsSet SSL-VPN-CLIENT 证书配置
     */
    public void setSslClientConfigsSet(String SslClientConfigsSet) {
        this.SslClientConfigsSet = SslClientConfigsSet;
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SslClientConfigsSet", this.SslClientConfigsSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

