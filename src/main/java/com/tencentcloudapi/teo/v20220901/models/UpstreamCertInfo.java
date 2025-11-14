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

public class UpstreamCertInfo extends AbstractModel {

    /**
    * 在回源双向认证场景下，该字段为 EO 节点回源时携带的证书（包含公钥、私钥即可），部署在 EO 节点，用于源站对 EO 节点进行认证。在作为入参使用时，不填写表示保持原有配置。
    */
    @SerializedName("UpstreamMutualTLS")
    @Expose
    private MutualTLS UpstreamMutualTLS;

    /**
    * 在源站证书校验场景下，该字段为 EO 节点回源时用于验证的 CA 证书，部署在 EO 节点，用于 EO 节点对服务端证书进行认证。在作为入参使用时，不填写表示保持原有配置。
    */
    @SerializedName("UpstreamCertificateVerify")
    @Expose
    private OriginCertificateVerify UpstreamCertificateVerify;

    /**
     * Get 在回源双向认证场景下，该字段为 EO 节点回源时携带的证书（包含公钥、私钥即可），部署在 EO 节点，用于源站对 EO 节点进行认证。在作为入参使用时，不填写表示保持原有配置。 
     * @return UpstreamMutualTLS 在回源双向认证场景下，该字段为 EO 节点回源时携带的证书（包含公钥、私钥即可），部署在 EO 节点，用于源站对 EO 节点进行认证。在作为入参使用时，不填写表示保持原有配置。
     */
    public MutualTLS getUpstreamMutualTLS() {
        return this.UpstreamMutualTLS;
    }

    /**
     * Set 在回源双向认证场景下，该字段为 EO 节点回源时携带的证书（包含公钥、私钥即可），部署在 EO 节点，用于源站对 EO 节点进行认证。在作为入参使用时，不填写表示保持原有配置。
     * @param UpstreamMutualTLS 在回源双向认证场景下，该字段为 EO 节点回源时携带的证书（包含公钥、私钥即可），部署在 EO 节点，用于源站对 EO 节点进行认证。在作为入参使用时，不填写表示保持原有配置。
     */
    public void setUpstreamMutualTLS(MutualTLS UpstreamMutualTLS) {
        this.UpstreamMutualTLS = UpstreamMutualTLS;
    }

    /**
     * Get 在源站证书校验场景下，该字段为 EO 节点回源时用于验证的 CA 证书，部署在 EO 节点，用于 EO 节点对服务端证书进行认证。在作为入参使用时，不填写表示保持原有配置。 
     * @return UpstreamCertificateVerify 在源站证书校验场景下，该字段为 EO 节点回源时用于验证的 CA 证书，部署在 EO 节点，用于 EO 节点对服务端证书进行认证。在作为入参使用时，不填写表示保持原有配置。
     */
    public OriginCertificateVerify getUpstreamCertificateVerify() {
        return this.UpstreamCertificateVerify;
    }

    /**
     * Set 在源站证书校验场景下，该字段为 EO 节点回源时用于验证的 CA 证书，部署在 EO 节点，用于 EO 节点对服务端证书进行认证。在作为入参使用时，不填写表示保持原有配置。
     * @param UpstreamCertificateVerify 在源站证书校验场景下，该字段为 EO 节点回源时用于验证的 CA 证书，部署在 EO 节点，用于 EO 节点对服务端证书进行认证。在作为入参使用时，不填写表示保持原有配置。
     */
    public void setUpstreamCertificateVerify(OriginCertificateVerify UpstreamCertificateVerify) {
        this.UpstreamCertificateVerify = UpstreamCertificateVerify;
    }

    public UpstreamCertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamCertInfo(UpstreamCertInfo source) {
        if (source.UpstreamMutualTLS != null) {
            this.UpstreamMutualTLS = new MutualTLS(source.UpstreamMutualTLS);
        }
        if (source.UpstreamCertificateVerify != null) {
            this.UpstreamCertificateVerify = new OriginCertificateVerify(source.UpstreamCertificateVerify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UpstreamMutualTLS.", this.UpstreamMutualTLS);
        this.setParamObj(map, prefix + "UpstreamCertificateVerify.", this.UpstreamCertificateVerify);

    }
}

