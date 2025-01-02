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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomDomainRequest extends AbstractModel {

    /**
    * 域名，不支持泛域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 协议，取值范围：HTTP, HTTPS, HTTP&HTTPS
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 路由配置
    */
    @SerializedName("EndpointsConfig")
    @Expose
    private EndpointsConf [] EndpointsConfig;

    /**
    * 证书配置信息，有使用HTTPS协议时候必须传
    */
    @SerializedName("CertConfig")
    @Expose
    private CertConf CertConfig;

    /**
    * web 应用防火墙配置
    */
    @SerializedName("WafConfig")
    @Expose
    private WafConf WafConfig;

    /**
     * Get 域名，不支持泛域名 
     * @return Domain 域名，不支持泛域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名，不支持泛域名
     * @param Domain 域名，不支持泛域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 协议，取值范围：HTTP, HTTPS, HTTP&HTTPS 
     * @return Protocol 协议，取值范围：HTTP, HTTPS, HTTP&HTTPS
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，取值范围：HTTP, HTTPS, HTTP&HTTPS
     * @param Protocol 协议，取值范围：HTTP, HTTPS, HTTP&HTTPS
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 路由配置 
     * @return EndpointsConfig 路由配置
     */
    public EndpointsConf [] getEndpointsConfig() {
        return this.EndpointsConfig;
    }

    /**
     * Set 路由配置
     * @param EndpointsConfig 路由配置
     */
    public void setEndpointsConfig(EndpointsConf [] EndpointsConfig) {
        this.EndpointsConfig = EndpointsConfig;
    }

    /**
     * Get 证书配置信息，有使用HTTPS协议时候必须传 
     * @return CertConfig 证书配置信息，有使用HTTPS协议时候必须传
     */
    public CertConf getCertConfig() {
        return this.CertConfig;
    }

    /**
     * Set 证书配置信息，有使用HTTPS协议时候必须传
     * @param CertConfig 证书配置信息，有使用HTTPS协议时候必须传
     */
    public void setCertConfig(CertConf CertConfig) {
        this.CertConfig = CertConfig;
    }

    /**
     * Get web 应用防火墙配置 
     * @return WafConfig web 应用防火墙配置
     */
    public WafConf getWafConfig() {
        return this.WafConfig;
    }

    /**
     * Set web 应用防火墙配置
     * @param WafConfig web 应用防火墙配置
     */
    public void setWafConfig(WafConf WafConfig) {
        this.WafConfig = WafConfig;
    }

    public CreateCustomDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomDomainRequest(CreateCustomDomainRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.EndpointsConfig != null) {
            this.EndpointsConfig = new EndpointsConf[source.EndpointsConfig.length];
            for (int i = 0; i < source.EndpointsConfig.length; i++) {
                this.EndpointsConfig[i] = new EndpointsConf(source.EndpointsConfig[i]);
            }
        }
        if (source.CertConfig != null) {
            this.CertConfig = new CertConf(source.CertConfig);
        }
        if (source.WafConfig != null) {
            this.WafConfig = new WafConf(source.WafConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamArrayObj(map, prefix + "EndpointsConfig.", this.EndpointsConfig);
        this.setParamObj(map, prefix + "CertConfig.", this.CertConfig);
        this.setParamObj(map, prefix + "WafConfig.", this.WafConfig);

    }
}

