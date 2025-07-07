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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDefaultDistributionConfigResponse extends AbstractModel {

    /**
    * 分发配置的域名(已废弃）。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 分发配置的域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 分发配置的协议，为 HTTP 或 HTTPS。
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * 播放密钥，由大小写字母（a - Z）或者数字（0 - 9）组成，长度在8 - 20个字符之间。
    */
    @SerializedName("PlayKey")
    @Expose
    private String PlayKey;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分发配置的域名(已废弃）。 
     * @return DomainName 分发配置的域名(已废弃）。
     * @deprecated
     */
    @Deprecated
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 分发配置的域名(已废弃）。
     * @param DomainName 分发配置的域名(已废弃）。
     * @deprecated
     */
    @Deprecated
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 分发配置的域名。 
     * @return Domain 分发配置的域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 分发配置的域名。
     * @param Domain 分发配置的域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 分发配置的协议，为 HTTP 或 HTTPS。 
     * @return Scheme 分发配置的协议，为 HTTP 或 HTTPS。
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 分发配置的协议，为 HTTP 或 HTTPS。
     * @param Scheme 分发配置的协议，为 HTTP 或 HTTPS。
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get 播放密钥，由大小写字母（a - Z）或者数字（0 - 9）组成，长度在8 - 20个字符之间。 
     * @return PlayKey 播放密钥，由大小写字母（a - Z）或者数字（0 - 9）组成，长度在8 - 20个字符之间。
     */
    public String getPlayKey() {
        return this.PlayKey;
    }

    /**
     * Set 播放密钥，由大小写字母（a - Z）或者数字（0 - 9）组成，长度在8 - 20个字符之间。
     * @param PlayKey 播放密钥，由大小写字母（a - Z）或者数字（0 - 9）组成，长度在8 - 20个字符之间。
     */
    public void setPlayKey(String PlayKey) {
        this.PlayKey = PlayKey;
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

    public DescribeDefaultDistributionConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDefaultDistributionConfigResponse(DescribeDefaultDistributionConfigResponse source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.PlayKey != null) {
            this.PlayKey = new String(source.PlayKey);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "PlayKey", this.PlayKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

