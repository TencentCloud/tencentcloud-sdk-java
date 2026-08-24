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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWUpstreamTLSConfig extends AbstractModel {

    /**
    * <p>是否校验上游服务端证书</p><p>默认值：false</p>
    */
    @SerializedName("TLSVerify")
    @Expose
    private Boolean TLSVerify;

    /**
    * <p>客户端证书 ID（mTLS 用）</p>
    */
    @SerializedName("ClientCertId")
    @Expose
    private String ClientCertId;

    /**
    * <p>信任的 CA 证书 ID 列表</p>
    */
    @SerializedName("UpstreamCACertIds")
    @Expose
    private String [] UpstreamCACertIds;

    /**
     * Get <p>是否校验上游服务端证书</p><p>默认值：false</p> 
     * @return TLSVerify <p>是否校验上游服务端证书</p><p>默认值：false</p>
     */
    public Boolean getTLSVerify() {
        return this.TLSVerify;
    }

    /**
     * Set <p>是否校验上游服务端证书</p><p>默认值：false</p>
     * @param TLSVerify <p>是否校验上游服务端证书</p><p>默认值：false</p>
     */
    public void setTLSVerify(Boolean TLSVerify) {
        this.TLSVerify = TLSVerify;
    }

    /**
     * Get <p>客户端证书 ID（mTLS 用）</p> 
     * @return ClientCertId <p>客户端证书 ID（mTLS 用）</p>
     */
    public String getClientCertId() {
        return this.ClientCertId;
    }

    /**
     * Set <p>客户端证书 ID（mTLS 用）</p>
     * @param ClientCertId <p>客户端证书 ID（mTLS 用）</p>
     */
    public void setClientCertId(String ClientCertId) {
        this.ClientCertId = ClientCertId;
    }

    /**
     * Get <p>信任的 CA 证书 ID 列表</p> 
     * @return UpstreamCACertIds <p>信任的 CA 证书 ID 列表</p>
     */
    public String [] getUpstreamCACertIds() {
        return this.UpstreamCACertIds;
    }

    /**
     * Set <p>信任的 CA 证书 ID 列表</p>
     * @param UpstreamCACertIds <p>信任的 CA 证书 ID 列表</p>
     */
    public void setUpstreamCACertIds(String [] UpstreamCACertIds) {
        this.UpstreamCACertIds = UpstreamCACertIds;
    }

    public AIGWUpstreamTLSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWUpstreamTLSConfig(AIGWUpstreamTLSConfig source) {
        if (source.TLSVerify != null) {
            this.TLSVerify = new Boolean(source.TLSVerify);
        }
        if (source.ClientCertId != null) {
            this.ClientCertId = new String(source.ClientCertId);
        }
        if (source.UpstreamCACertIds != null) {
            this.UpstreamCACertIds = new String[source.UpstreamCACertIds.length];
            for (int i = 0; i < source.UpstreamCACertIds.length; i++) {
                this.UpstreamCACertIds[i] = new String(source.UpstreamCACertIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TLSVerify", this.TLSVerify);
        this.setParamSimple(map, prefix + "ClientCertId", this.ClientCertId);
        this.setParamArraySimple(map, prefix + "UpstreamCACertIds.", this.UpstreamCACertIds);

    }
}

