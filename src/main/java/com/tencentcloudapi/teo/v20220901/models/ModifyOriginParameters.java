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

public class ModifyOriginParameters extends AbstractModel {

    /**
    * 源站类型。取值有：
<li>IPDomain：IPV4、IPV6 或域名类型源站；</li>
<li>OriginGroup：源站组类型源站；</li>
<li>LoadBalance：负载均衡，该功能内测中，如需使用，请提工单或联系智能客服；</li>
<li>COS：腾讯云 COS 对象存储源站；</li>
<li>AWSS3：支持 AWS S3 协议的所有对象存储源站。</li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 源站地址，根据 OriginType 的取值分为以下情况：
<li>当 OriginType = IPDomain 时，该参数请填写 IPV4、IPV6 地址或域名；</li>
<li>当 OriginType = COS 时，该参数请填写 COS 桶的访问域名；</li>
<li>当 OriginType = AWSS3，该参数请填写 S3 桶的访问域名；</li>
<li>当 OriginType = OriginGroup 时，该参数请填写源站组 ID；</li>
<li>当 OriginType = LoadBalance 时，该参数请填写负载均衡实例 ID，该功能当前仅白名单开放。</li>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * 回源协议配置。当 OriginType 取值为 IPDomain、OriginGroup、LoadBalance 时该参数必填。取值有：
<li>http：使用 HTTP 协议；</li>
<li>https：使用 HTTPS 协议；</li>
<li>follow：协议跟随。</li>
    */
    @SerializedName("OriginProtocol")
    @Expose
    private String OriginProtocol;

    /**
    * HTTP 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 http 或者 follow 时该参数必填。
    */
    @SerializedName("HTTPOriginPort")
    @Expose
    private Long HTTPOriginPort;

    /**
    * HTTPS 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 https 或者 follow 时该参数必填。
    */
    @SerializedName("HTTPSOriginPort")
    @Expose
    private Long HTTPSOriginPort;

    /**
    * 指定是否允许访问私有对象存储源站，当源站类型 OriginType = COS 或 AWSS3 时该参数必填，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * 私有鉴权使用参数，该参数仅当 OriginType = AWSS3 且 PrivateAccess = on 时会生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateParameters")
    @Expose
    private OriginPrivateParameters PrivateParameters;

    /**
     * Get 源站类型。取值有：
<li>IPDomain：IPV4、IPV6 或域名类型源站；</li>
<li>OriginGroup：源站组类型源站；</li>
<li>LoadBalance：负载均衡，该功能内测中，如需使用，请提工单或联系智能客服；</li>
<li>COS：腾讯云 COS 对象存储源站；</li>
<li>AWSS3：支持 AWS S3 协议的所有对象存储源站。</li> 
     * @return OriginType 源站类型。取值有：
<li>IPDomain：IPV4、IPV6 或域名类型源站；</li>
<li>OriginGroup：源站组类型源站；</li>
<li>LoadBalance：负载均衡，该功能内测中，如需使用，请提工单或联系智能客服；</li>
<li>COS：腾讯云 COS 对象存储源站；</li>
<li>AWSS3：支持 AWS S3 协议的所有对象存储源站。</li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 源站类型。取值有：
<li>IPDomain：IPV4、IPV6 或域名类型源站；</li>
<li>OriginGroup：源站组类型源站；</li>
<li>LoadBalance：负载均衡，该功能内测中，如需使用，请提工单或联系智能客服；</li>
<li>COS：腾讯云 COS 对象存储源站；</li>
<li>AWSS3：支持 AWS S3 协议的所有对象存储源站。</li>
     * @param OriginType 源站类型。取值有：
<li>IPDomain：IPV4、IPV6 或域名类型源站；</li>
<li>OriginGroup：源站组类型源站；</li>
<li>LoadBalance：负载均衡，该功能内测中，如需使用，请提工单或联系智能客服；</li>
<li>COS：腾讯云 COS 对象存储源站；</li>
<li>AWSS3：支持 AWS S3 协议的所有对象存储源站。</li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get 源站地址，根据 OriginType 的取值分为以下情况：
<li>当 OriginType = IPDomain 时，该参数请填写 IPV4、IPV6 地址或域名；</li>
<li>当 OriginType = COS 时，该参数请填写 COS 桶的访问域名；</li>
<li>当 OriginType = AWSS3，该参数请填写 S3 桶的访问域名；</li>
<li>当 OriginType = OriginGroup 时，该参数请填写源站组 ID；</li>
<li>当 OriginType = LoadBalance 时，该参数请填写负载均衡实例 ID，该功能当前仅白名单开放。</li> 
     * @return Origin 源站地址，根据 OriginType 的取值分为以下情况：
<li>当 OriginType = IPDomain 时，该参数请填写 IPV4、IPV6 地址或域名；</li>
<li>当 OriginType = COS 时，该参数请填写 COS 桶的访问域名；</li>
<li>当 OriginType = AWSS3，该参数请填写 S3 桶的访问域名；</li>
<li>当 OriginType = OriginGroup 时，该参数请填写源站组 ID；</li>
<li>当 OriginType = LoadBalance 时，该参数请填写负载均衡实例 ID，该功能当前仅白名单开放。</li>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set 源站地址，根据 OriginType 的取值分为以下情况：
<li>当 OriginType = IPDomain 时，该参数请填写 IPV4、IPV6 地址或域名；</li>
<li>当 OriginType = COS 时，该参数请填写 COS 桶的访问域名；</li>
<li>当 OriginType = AWSS3，该参数请填写 S3 桶的访问域名；</li>
<li>当 OriginType = OriginGroup 时，该参数请填写源站组 ID；</li>
<li>当 OriginType = LoadBalance 时，该参数请填写负载均衡实例 ID，该功能当前仅白名单开放。</li>
     * @param Origin 源站地址，根据 OriginType 的取值分为以下情况：
<li>当 OriginType = IPDomain 时，该参数请填写 IPV4、IPV6 地址或域名；</li>
<li>当 OriginType = COS 时，该参数请填写 COS 桶的访问域名；</li>
<li>当 OriginType = AWSS3，该参数请填写 S3 桶的访问域名；</li>
<li>当 OriginType = OriginGroup 时，该参数请填写源站组 ID；</li>
<li>当 OriginType = LoadBalance 时，该参数请填写负载均衡实例 ID，该功能当前仅白名单开放。</li>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get 回源协议配置。当 OriginType 取值为 IPDomain、OriginGroup、LoadBalance 时该参数必填。取值有：
<li>http：使用 HTTP 协议；</li>
<li>https：使用 HTTPS 协议；</li>
<li>follow：协议跟随。</li> 
     * @return OriginProtocol 回源协议配置。当 OriginType 取值为 IPDomain、OriginGroup、LoadBalance 时该参数必填。取值有：
<li>http：使用 HTTP 协议；</li>
<li>https：使用 HTTPS 协议；</li>
<li>follow：协议跟随。</li>
     */
    public String getOriginProtocol() {
        return this.OriginProtocol;
    }

    /**
     * Set 回源协议配置。当 OriginType 取值为 IPDomain、OriginGroup、LoadBalance 时该参数必填。取值有：
<li>http：使用 HTTP 协议；</li>
<li>https：使用 HTTPS 协议；</li>
<li>follow：协议跟随。</li>
     * @param OriginProtocol 回源协议配置。当 OriginType 取值为 IPDomain、OriginGroup、LoadBalance 时该参数必填。取值有：
<li>http：使用 HTTP 协议；</li>
<li>https：使用 HTTPS 协议；</li>
<li>follow：协议跟随。</li>
     */
    public void setOriginProtocol(String OriginProtocol) {
        this.OriginProtocol = OriginProtocol;
    }

    /**
     * Get HTTP 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 http 或者 follow 时该参数必填。 
     * @return HTTPOriginPort HTTP 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 http 或者 follow 时该参数必填。
     */
    public Long getHTTPOriginPort() {
        return this.HTTPOriginPort;
    }

    /**
     * Set HTTP 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 http 或者 follow 时该参数必填。
     * @param HTTPOriginPort HTTP 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 http 或者 follow 时该参数必填。
     */
    public void setHTTPOriginPort(Long HTTPOriginPort) {
        this.HTTPOriginPort = HTTPOriginPort;
    }

    /**
     * Get HTTPS 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 https 或者 follow 时该参数必填。 
     * @return HTTPSOriginPort HTTPS 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 https 或者 follow 时该参数必填。
     */
    public Long getHTTPSOriginPort() {
        return this.HTTPSOriginPort;
    }

    /**
     * Set HTTPS 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 https 或者 follow 时该参数必填。
     * @param HTTPSOriginPort HTTPS 回源端口，取值范围 1～65535。当回源协议 OriginProtocol 为 https 或者 follow 时该参数必填。
     */
    public void setHTTPSOriginPort(Long HTTPSOriginPort) {
        this.HTTPSOriginPort = HTTPSOriginPort;
    }

    /**
     * Get 指定是否允许访问私有对象存储源站，当源站类型 OriginType = COS 或 AWSS3 时该参数必填，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li> 
     * @return PrivateAccess 指定是否允许访问私有对象存储源站，当源站类型 OriginType = COS 或 AWSS3 时该参数必填，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set 指定是否允许访问私有对象存储源站，当源站类型 OriginType = COS 或 AWSS3 时该参数必填，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
     * @param PrivateAccess 指定是否允许访问私有对象存储源站，当源站类型 OriginType = COS 或 AWSS3 时该参数必填，取值有：
<li>on：使用私有鉴权；</li>
<li>off：不使用私有鉴权。</li>
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get 私有鉴权使用参数，该参数仅当 OriginType = AWSS3 且 PrivateAccess = on 时会生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateParameters 私有鉴权使用参数，该参数仅当 OriginType = AWSS3 且 PrivateAccess = on 时会生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OriginPrivateParameters getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set 私有鉴权使用参数，该参数仅当 OriginType = AWSS3 且 PrivateAccess = on 时会生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateParameters 私有鉴权使用参数，该参数仅当 OriginType = AWSS3 且 PrivateAccess = on 时会生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateParameters(OriginPrivateParameters PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    public ModifyOriginParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOriginParameters(ModifyOriginParameters source) {
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.OriginProtocol != null) {
            this.OriginProtocol = new String(source.OriginProtocol);
        }
        if (source.HTTPOriginPort != null) {
            this.HTTPOriginPort = new Long(source.HTTPOriginPort);
        }
        if (source.HTTPSOriginPort != null) {
            this.HTTPSOriginPort = new Long(source.HTTPSOriginPort);
        }
        if (source.PrivateAccess != null) {
            this.PrivateAccess = new String(source.PrivateAccess);
        }
        if (source.PrivateParameters != null) {
            this.PrivateParameters = new OriginPrivateParameters(source.PrivateParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "OriginProtocol", this.OriginProtocol);
        this.setParamSimple(map, prefix + "HTTPOriginPort", this.HTTPOriginPort);
        this.setParamSimple(map, prefix + "HTTPSOriginPort", this.HTTPSOriginPort);
        this.setParamSimple(map, prefix + "PrivateAccess", this.PrivateAccess);
        this.setParamObj(map, prefix + "PrivateParameters.", this.PrivateParameters);

    }
}

