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

public class AccelerationDomainCertificate extends AbstractModel {

    /**
    * 配置服务端证书的模式，取值有： <ul><li>disable：不配置服务端证书；</li> <li>eofreecert：通过自动验证申请免费证书并部署。验证方式详见：[申请免费证书支持的验证方式](https://cloud.tencent.com/document/product/1552/90437) - 在 NS 或者 DNSPod 托管接入模式下，仅支持自动验证的方式申请免费证书。 - 当免费证书申请失败时会导致证书部署失败，您可以通过<a href = 'https://tcloud4api.woa.com/document/product/1657/927938?!preview&!document=1'>检查免费证书申请结果</a>接口获取申请失败原因。</li><li>eofreecert_manual：部署 DNS 委派验证或者文件验证申请的免费证书。在部署免费证书前，您需要触发<a href = 'https://tcloud4api.woa.com/document/product/1657/927322?!preview&!document=1'>申请免费证书</a>接口申请免费证书。在免费证书申请成功后，你可以通过该枚举值对免费证书进行部署；</li> <ul><li>注意：在对免费证书部署时，需要保证当前已存在申请成功的免费证书。您可以通过<a href = 'https://tcloud4api.woa.com/document/product/1657/927938?!preview&!document=1'>检查免费证书申请结果</a>接口检查当前是否已存在申请成功的免费证书。</li> </ul> <li>sslcert：配置 SSL 托管服务端证书。</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 服务端证书列表，相关证书部署在 EO 的入口侧。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private CertificateInfo [] List;

    /**
    * 在边缘双向认证场景下，该字段为客户端的 CA 证书，部署在 EO 节点内，用于 EO 节点认证客户端证书。
    */
    @SerializedName("ClientCertInfo")
    @Expose
    private MutualTLS ClientCertInfo;

    /**
    * 用于 EO 节点回源时携带的证书，源站启用双向认证握手时使用，用于源站认证客户端证书是否有效，确保请求来源于受信任的 EO 节点。
    */
    @SerializedName("UpstreamCertInfo")
    @Expose
    private UpstreamCertInfo UpstreamCertInfo;

    /**
     * Get 配置服务端证书的模式，取值有： <ul><li>disable：不配置服务端证书；</li> <li>eofreecert：通过自动验证申请免费证书并部署。验证方式详见：[申请免费证书支持的验证方式](https://cloud.tencent.com/document/product/1552/90437) - 在 NS 或者 DNSPod 托管接入模式下，仅支持自动验证的方式申请免费证书。 - 当免费证书申请失败时会导致证书部署失败，您可以通过<a href = 'https://tcloud4api.woa.com/document/product/1657/927938?!preview&!document=1'>检查免费证书申请结果</a>接口获取申请失败原因。</li><li>eofreecert_manual：部署 DNS 委派验证或者文件验证申请的免费证书。在部署免费证书前，您需要触发<a href = 'https://tcloud4api.woa.com/document/product/1657/927322?!preview&!document=1'>申请免费证书</a>接口申请免费证书。在免费证书申请成功后，你可以通过该枚举值对免费证书进行部署；</li> <ul><li>注意：在对免费证书部署时，需要保证当前已存在申请成功的免费证书。您可以通过<a href = 'https://tcloud4api.woa.com/document/product/1657/927938?!preview&!document=1'>检查免费证书申请结果</a>接口检查当前是否已存在申请成功的免费证书。</li> </ul> <li>sslcert：配置 SSL 托管服务端证书。</li></ul> 
     * @return Mode 配置服务端证书的模式，取值有： <ul><li>disable：不配置服务端证书；</li> <li>eofreecert：通过自动验证申请免费证书并部署。验证方式详见：[申请免费证书支持的验证方式](https://cloud.tencent.com/document/product/1552/90437) - 在 NS 或者 DNSPod 托管接入模式下，仅支持自动验证的方式申请免费证书。 - 当免费证书申请失败时会导致证书部署失败，您可以通过<a href = 'https://tcloud4api.woa.com/document/product/1657/927938?!preview&!document=1'>检查免费证书申请结果</a>接口获取申请失败原因。</li><li>eofreecert_manual：部署 DNS 委派验证或者文件验证申请的免费证书。在部署免费证书前，您需要触发<a href = 'https://tcloud4api.woa.com/document/product/1657/927322?!preview&!document=1'>申请免费证书</a>接口申请免费证书。在免费证书申请成功后，你可以通过该枚举值对免费证书进行部署；</li> <ul><li>注意：在对免费证书部署时，需要保证当前已存在申请成功的免费证书。您可以通过<a href = 'https://tcloud4api.woa.com/document/product/1657/927938?!preview&!document=1'>检查免费证书申请结果</a>接口检查当前是否已存在申请成功的免费证书。</li> </ul> <li>sslcert：配置 SSL 托管服务端证书。</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 配置服务端证书的模式，取值有： <ul><li>disable：不配置服务端证书；</li> <li>eofreecert：通过自动验证申请免费证书并部署。验证方式详见：[申请免费证书支持的验证方式](https://cloud.tencent.com/document/product/1552/90437) - 在 NS 或者 DNSPod 托管接入模式下，仅支持自动验证的方式申请免费证书。 - 当免费证书申请失败时会导致证书部署失败，您可以通过<a href = 'https://tcloud4api.woa.com/document/product/1657/927938?!preview&!document=1'>检查免费证书申请结果</a>接口获取申请失败原因。</li><li>eofreecert_manual：部署 DNS 委派验证或者文件验证申请的免费证书。在部署免费证书前，您需要触发<a href = 'https://tcloud4api.woa.com/document/product/1657/927322?!preview&!document=1'>申请免费证书</a>接口申请免费证书。在免费证书申请成功后，你可以通过该枚举值对免费证书进行部署；</li> <ul><li>注意：在对免费证书部署时，需要保证当前已存在申请成功的免费证书。您可以通过<a href = 'https://tcloud4api.woa.com/document/product/1657/927938?!preview&!document=1'>检查免费证书申请结果</a>接口检查当前是否已存在申请成功的免费证书。</li> </ul> <li>sslcert：配置 SSL 托管服务端证书。</li></ul>
     * @param Mode 配置服务端证书的模式，取值有： <ul><li>disable：不配置服务端证书；</li> <li>eofreecert：通过自动验证申请免费证书并部署。验证方式详见：[申请免费证书支持的验证方式](https://cloud.tencent.com/document/product/1552/90437) - 在 NS 或者 DNSPod 托管接入模式下，仅支持自动验证的方式申请免费证书。 - 当免费证书申请失败时会导致证书部署失败，您可以通过<a href = 'https://tcloud4api.woa.com/document/product/1657/927938?!preview&!document=1'>检查免费证书申请结果</a>接口获取申请失败原因。</li><li>eofreecert_manual：部署 DNS 委派验证或者文件验证申请的免费证书。在部署免费证书前，您需要触发<a href = 'https://tcloud4api.woa.com/document/product/1657/927322?!preview&!document=1'>申请免费证书</a>接口申请免费证书。在免费证书申请成功后，你可以通过该枚举值对免费证书进行部署；</li> <ul><li>注意：在对免费证书部署时，需要保证当前已存在申请成功的免费证书。您可以通过<a href = 'https://tcloud4api.woa.com/document/product/1657/927938?!preview&!document=1'>检查免费证书申请结果</a>接口检查当前是否已存在申请成功的免费证书。</li> </ul> <li>sslcert：配置 SSL 托管服务端证书。</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 服务端证书列表，相关证书部署在 EO 的入口侧。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 服务端证书列表，相关证书部署在 EO 的入口侧。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CertificateInfo [] getList() {
        return this.List;
    }

    /**
     * Set 服务端证书列表，相关证书部署在 EO 的入口侧。
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 服务端证书列表，相关证书部署在 EO 的入口侧。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(CertificateInfo [] List) {
        this.List = List;
    }

    /**
     * Get 在边缘双向认证场景下，该字段为客户端的 CA 证书，部署在 EO 节点内，用于 EO 节点认证客户端证书。 
     * @return ClientCertInfo 在边缘双向认证场景下，该字段为客户端的 CA 证书，部署在 EO 节点内，用于 EO 节点认证客户端证书。
     */
    public MutualTLS getClientCertInfo() {
        return this.ClientCertInfo;
    }

    /**
     * Set 在边缘双向认证场景下，该字段为客户端的 CA 证书，部署在 EO 节点内，用于 EO 节点认证客户端证书。
     * @param ClientCertInfo 在边缘双向认证场景下，该字段为客户端的 CA 证书，部署在 EO 节点内，用于 EO 节点认证客户端证书。
     */
    public void setClientCertInfo(MutualTLS ClientCertInfo) {
        this.ClientCertInfo = ClientCertInfo;
    }

    /**
     * Get 用于 EO 节点回源时携带的证书，源站启用双向认证握手时使用，用于源站认证客户端证书是否有效，确保请求来源于受信任的 EO 节点。 
     * @return UpstreamCertInfo 用于 EO 节点回源时携带的证书，源站启用双向认证握手时使用，用于源站认证客户端证书是否有效，确保请求来源于受信任的 EO 节点。
     */
    public UpstreamCertInfo getUpstreamCertInfo() {
        return this.UpstreamCertInfo;
    }

    /**
     * Set 用于 EO 节点回源时携带的证书，源站启用双向认证握手时使用，用于源站认证客户端证书是否有效，确保请求来源于受信任的 EO 节点。
     * @param UpstreamCertInfo 用于 EO 节点回源时携带的证书，源站启用双向认证握手时使用，用于源站认证客户端证书是否有效，确保请求来源于受信任的 EO 节点。
     */
    public void setUpstreamCertInfo(UpstreamCertInfo UpstreamCertInfo) {
        this.UpstreamCertInfo = UpstreamCertInfo;
    }

    public AccelerationDomainCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccelerationDomainCertificate(AccelerationDomainCertificate source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.List != null) {
            this.List = new CertificateInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new CertificateInfo(source.List[i]);
            }
        }
        if (source.ClientCertInfo != null) {
            this.ClientCertInfo = new MutualTLS(source.ClientCertInfo);
        }
        if (source.UpstreamCertInfo != null) {
            this.UpstreamCertInfo = new UpstreamCertInfo(source.UpstreamCertInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamObj(map, prefix + "ClientCertInfo.", this.ClientCertInfo);
        this.setParamObj(map, prefix + "UpstreamCertInfo.", this.UpstreamCertInfo);

    }
}

