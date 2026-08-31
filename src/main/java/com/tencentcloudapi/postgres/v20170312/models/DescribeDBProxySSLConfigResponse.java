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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBProxySSLConfigResponse extends AbstractModel {

    /**
    * <p>SSL 是否开启。true 表示已开启，false 表示未开启。</p>
    */
    @SerializedName("SSLEnabled")
    @Expose
    private Boolean SSLEnabled;

    /**
    * <p>SSL 连接的地址（VIP 或域名）。</p>
    */
    @SerializedName("ConnectAddress")
    @Expose
    private String ConnectAddress;

    /**
    * <p>CA 证书下载地址。仅在 SSL 开启时有值。</p>
    */
    @SerializedName("CAUrl")
    @Expose
    private String CAUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>SSL 是否开启。true 表示已开启，false 表示未开启。</p> 
     * @return SSLEnabled <p>SSL 是否开启。true 表示已开启，false 表示未开启。</p>
     */
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

    /**
     * Set <p>SSL 是否开启。true 表示已开启，false 表示未开启。</p>
     * @param SSLEnabled <p>SSL 是否开启。true 表示已开启，false 表示未开启。</p>
     */
    public void setSSLEnabled(Boolean SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
    }

    /**
     * Get <p>SSL 连接的地址（VIP 或域名）。</p> 
     * @return ConnectAddress <p>SSL 连接的地址（VIP 或域名）。</p>
     */
    public String getConnectAddress() {
        return this.ConnectAddress;
    }

    /**
     * Set <p>SSL 连接的地址（VIP 或域名）。</p>
     * @param ConnectAddress <p>SSL 连接的地址（VIP 或域名）。</p>
     */
    public void setConnectAddress(String ConnectAddress) {
        this.ConnectAddress = ConnectAddress;
    }

    /**
     * Get <p>CA 证书下载地址。仅在 SSL 开启时有值。</p> 
     * @return CAUrl <p>CA 证书下载地址。仅在 SSL 开启时有值。</p>
     */
    public String getCAUrl() {
        return this.CAUrl;
    }

    /**
     * Set <p>CA 证书下载地址。仅在 SSL 开启时有值。</p>
     * @param CAUrl <p>CA 证书下载地址。仅在 SSL 开启时有值。</p>
     */
    public void setCAUrl(String CAUrl) {
        this.CAUrl = CAUrl;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBProxySSLConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBProxySSLConfigResponse(DescribeDBProxySSLConfigResponse source) {
        if (source.SSLEnabled != null) {
            this.SSLEnabled = new Boolean(source.SSLEnabled);
        }
        if (source.ConnectAddress != null) {
            this.ConnectAddress = new String(source.ConnectAddress);
        }
        if (source.CAUrl != null) {
            this.CAUrl = new String(source.CAUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSLEnabled", this.SSLEnabled);
        this.setParamSimple(map, prefix + "ConnectAddress", this.ConnectAddress);
        this.setParamSimple(map, prefix + "CAUrl", this.CAUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

