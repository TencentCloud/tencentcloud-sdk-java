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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateListenerAdditionalCertificatesRequest extends AbstractModel {

    /**
    * <p>扩展证书 ID 列表。</p>
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * <p>监听器 ID，格式为 lst- 后接 8 位字母数字。</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>客户端 Token，用于保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken 只支持 ASCII 字符。<br>若您未指定，则系统自动使用 API 请求的 RequestId 作为 ClientToken 标识。每次 API 请求的 RequestId 不一样。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>是否只预检此次请求，取值：true：发送检查请求，不会为HTTPS监听器添加扩展证书。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码DryRunOperation。false（默认值）：发送正常请求，通过检查后返回HTTP2xx状态码并直接进行操作。</p>
    */
    @SerializedName("DryRun")
    @Expose
    private String DryRun;

    /**
     * Get <p>扩展证书 ID 列表。</p> 
     * @return CertificateIds <p>扩展证书 ID 列表。</p>
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set <p>扩展证书 ID 列表。</p>
     * @param CertificateIds <p>扩展证书 ID 列表。</p>
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get <p>监听器 ID，格式为 lst- 后接 8 位字母数字。</p> 
     * @return ListenerId <p>监听器 ID，格式为 lst- 后接 8 位字母数字。</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>监听器 ID，格式为 lst- 后接 8 位字母数字。</p>
     * @param ListenerId <p>监听器 ID，格式为 lst- 后接 8 位字母数字。</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。</p> 
     * @return LoadBalancerId <p>负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。</p>
     * @param LoadBalancerId <p>负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>客户端 Token，用于保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken 只支持 ASCII 字符。<br>若您未指定，则系统自动使用 API 请求的 RequestId 作为 ClientToken 标识。每次 API 请求的 RequestId 不一样。</p> 
     * @return ClientToken <p>客户端 Token，用于保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken 只支持 ASCII 字符。<br>若您未指定，则系统自动使用 API 请求的 RequestId 作为 ClientToken 标识。每次 API 请求的 RequestId 不一样。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>客户端 Token，用于保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken 只支持 ASCII 字符。<br>若您未指定，则系统自动使用 API 请求的 RequestId 作为 ClientToken 标识。每次 API 请求的 RequestId 不一样。</p>
     * @param ClientToken <p>客户端 Token，用于保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken 只支持 ASCII 字符。<br>若您未指定，则系统自动使用 API 请求的 RequestId 作为 ClientToken 标识。每次 API 请求的 RequestId 不一样。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>是否只预检此次请求，取值：true：发送检查请求，不会为HTTPS监听器添加扩展证书。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码DryRunOperation。false（默认值）：发送正常请求，通过检查后返回HTTP2xx状态码并直接进行操作。</p> 
     * @return DryRun <p>是否只预检此次请求，取值：true：发送检查请求，不会为HTTPS监听器添加扩展证书。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码DryRunOperation。false（默认值）：发送正常请求，通过检查后返回HTTP2xx状态码并直接进行操作。</p>
     */
    public String getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>是否只预检此次请求，取值：true：发送检查请求，不会为HTTPS监听器添加扩展证书。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码DryRunOperation。false（默认值）：发送正常请求，通过检查后返回HTTP2xx状态码并直接进行操作。</p>
     * @param DryRun <p>是否只预检此次请求，取值：true：发送检查请求，不会为HTTPS监听器添加扩展证书。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码DryRunOperation。false（默认值）：发送正常请求，通过检查后返回HTTP2xx状态码并直接进行操作。</p>
     */
    public void setDryRun(String DryRun) {
        this.DryRun = DryRun;
    }

    public AssociateListenerAdditionalCertificatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateListenerAdditionalCertificatesRequest(AssociateListenerAdditionalCertificatesRequest source) {
        if (source.CertificateIds != null) {
            this.CertificateIds = new String[source.CertificateIds.length];
            for (int i = 0; i < source.CertificateIds.length; i++) {
                this.CertificateIds[i] = new String(source.CertificateIds[i]);
            }
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DryRun != null) {
            this.DryRun = new String(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

