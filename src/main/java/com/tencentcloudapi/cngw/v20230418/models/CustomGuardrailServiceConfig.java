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

public class CustomGuardrailServiceConfig extends AbstractModel {

    /**
    * <p>审核服务地址来源：manual 手动填写完整 URL，service 引用本网关服务管理中的 Kong Service。二者互斥；创建时按接口要求显式传入。</p>
    */
    @SerializedName("AddressMode")
    @Expose
    private String AddressMode;

    /**
    * <p>AddressMode=service 时必填。填写审核引擎对应的 Kong Service ID，不是被审核的模型 API、MCP Server 或 Agent API ID。按该服务的 protocol、host、port、path 拼出审核 URL；直接请求该 URL，不是经过该服务的网关 Route，也不会自动继承其 Route 插件或业务鉴权。manual 模式不得填写。</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>AddressMode=manual 时必填，审核引擎接受 POST 的 HTTP/HTTPS 完整 URL，例如 https://audit.example.com/v2/audit；路径以实际引擎为准，不会自动补 /v2/audit。service 模式不得填写。请填写 URL 原文，不要粘贴 Markdown 链接。</p>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * <p>是否校验审核引擎 HTTPS 证书，创建默认 true；仅影响审核 HTTP 调用，不是客户端访问网关的 TLS 设置。</p>
    */
    @SerializedName("SSLVerify")
    @Expose
    private Boolean SSLVerify;

    /**
    * <p>是否把原业务请求的完整 Query 字符串写入送审包，创建默认 false。开启可能把 Query 中的凭据或个人信息传给审核服务，须确认接收方可信；不是审核服务 URL 自身的 Query 开关。</p>
    */
    @SerializedName("QueryPassthroughEnabled")
    @Expose
    private Boolean QueryPassthroughEnabled;

    /**
    * <p>允许额外写入送审包的原始 HTTP Header 名称，最多 64 项，每项最长 128 字节；名称不区分大小写，默认 []。内置保留 content-type、accept、mcp-protocol-version、a2a-version；Authorization、Cookie、API Key、MCP 会话标识和内部 Relay 等受限头不会因加入本列表而放行。审核服务自身的鉴权请使用 AuthConfig。</p>
    */
    @SerializedName("HeaderAllowList")
    @Expose
    private String [] HeaderAllowList;

    /**
     * Get <p>审核服务地址来源：manual 手动填写完整 URL，service 引用本网关服务管理中的 Kong Service。二者互斥；创建时按接口要求显式传入。</p> 
     * @return AddressMode <p>审核服务地址来源：manual 手动填写完整 URL，service 引用本网关服务管理中的 Kong Service。二者互斥；创建时按接口要求显式传入。</p>
     */
    public String getAddressMode() {
        return this.AddressMode;
    }

    /**
     * Set <p>审核服务地址来源：manual 手动填写完整 URL，service 引用本网关服务管理中的 Kong Service。二者互斥；创建时按接口要求显式传入。</p>
     * @param AddressMode <p>审核服务地址来源：manual 手动填写完整 URL，service 引用本网关服务管理中的 Kong Service。二者互斥；创建时按接口要求显式传入。</p>
     */
    public void setAddressMode(String AddressMode) {
        this.AddressMode = AddressMode;
    }

    /**
     * Get <p>AddressMode=service 时必填。填写审核引擎对应的 Kong Service ID，不是被审核的模型 API、MCP Server 或 Agent API ID。按该服务的 protocol、host、port、path 拼出审核 URL；直接请求该 URL，不是经过该服务的网关 Route，也不会自动继承其 Route 插件或业务鉴权。manual 模式不得填写。</p> 
     * @return ServiceId <p>AddressMode=service 时必填。填写审核引擎对应的 Kong Service ID，不是被审核的模型 API、MCP Server 或 Agent API ID。按该服务的 protocol、host、port、path 拼出审核 URL；直接请求该 URL，不是经过该服务的网关 Route，也不会自动继承其 Route 插件或业务鉴权。manual 模式不得填写。</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>AddressMode=service 时必填。填写审核引擎对应的 Kong Service ID，不是被审核的模型 API、MCP Server 或 Agent API ID。按该服务的 protocol、host、port、path 拼出审核 URL；直接请求该 URL，不是经过该服务的网关 Route，也不会自动继承其 Route 插件或业务鉴权。manual 模式不得填写。</p>
     * @param ServiceId <p>AddressMode=service 时必填。填写审核引擎对应的 Kong Service ID，不是被审核的模型 API、MCP Server 或 Agent API ID。按该服务的 protocol、host、port、path 拼出审核 URL；直接请求该 URL，不是经过该服务的网关 Route，也不会自动继承其 Route 插件或业务鉴权。manual 模式不得填写。</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>AddressMode=manual 时必填，审核引擎接受 POST 的 HTTP/HTTPS 完整 URL，例如 https://audit.example.com/v2/audit；路径以实际引擎为准，不会自动补 /v2/audit。service 模式不得填写。请填写 URL 原文，不要粘贴 Markdown 链接。</p> 
     * @return Endpoint <p>AddressMode=manual 时必填，审核引擎接受 POST 的 HTTP/HTTPS 完整 URL，例如 https://audit.example.com/v2/audit；路径以实际引擎为准，不会自动补 /v2/audit。service 模式不得填写。请填写 URL 原文，不要粘贴 Markdown 链接。</p>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set <p>AddressMode=manual 时必填，审核引擎接受 POST 的 HTTP/HTTPS 完整 URL，例如 https://audit.example.com/v2/audit；路径以实际引擎为准，不会自动补 /v2/audit。service 模式不得填写。请填写 URL 原文，不要粘贴 Markdown 链接。</p>
     * @param Endpoint <p>AddressMode=manual 时必填，审核引擎接受 POST 的 HTTP/HTTPS 完整 URL，例如 https://audit.example.com/v2/audit；路径以实际引擎为准，不会自动补 /v2/audit。service 模式不得填写。请填写 URL 原文，不要粘贴 Markdown 链接。</p>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get <p>是否校验审核引擎 HTTPS 证书，创建默认 true；仅影响审核 HTTP 调用，不是客户端访问网关的 TLS 设置。</p> 
     * @return SSLVerify <p>是否校验审核引擎 HTTPS 证书，创建默认 true；仅影响审核 HTTP 调用，不是客户端访问网关的 TLS 设置。</p>
     */
    public Boolean getSSLVerify() {
        return this.SSLVerify;
    }

    /**
     * Set <p>是否校验审核引擎 HTTPS 证书，创建默认 true；仅影响审核 HTTP 调用，不是客户端访问网关的 TLS 设置。</p>
     * @param SSLVerify <p>是否校验审核引擎 HTTPS 证书，创建默认 true；仅影响审核 HTTP 调用，不是客户端访问网关的 TLS 设置。</p>
     */
    public void setSSLVerify(Boolean SSLVerify) {
        this.SSLVerify = SSLVerify;
    }

    /**
     * Get <p>是否把原业务请求的完整 Query 字符串写入送审包，创建默认 false。开启可能把 Query 中的凭据或个人信息传给审核服务，须确认接收方可信；不是审核服务 URL 自身的 Query 开关。</p> 
     * @return QueryPassthroughEnabled <p>是否把原业务请求的完整 Query 字符串写入送审包，创建默认 false。开启可能把 Query 中的凭据或个人信息传给审核服务，须确认接收方可信；不是审核服务 URL 自身的 Query 开关。</p>
     */
    public Boolean getQueryPassthroughEnabled() {
        return this.QueryPassthroughEnabled;
    }

    /**
     * Set <p>是否把原业务请求的完整 Query 字符串写入送审包，创建默认 false。开启可能把 Query 中的凭据或个人信息传给审核服务，须确认接收方可信；不是审核服务 URL 自身的 Query 开关。</p>
     * @param QueryPassthroughEnabled <p>是否把原业务请求的完整 Query 字符串写入送审包，创建默认 false。开启可能把 Query 中的凭据或个人信息传给审核服务，须确认接收方可信；不是审核服务 URL 自身的 Query 开关。</p>
     */
    public void setQueryPassthroughEnabled(Boolean QueryPassthroughEnabled) {
        this.QueryPassthroughEnabled = QueryPassthroughEnabled;
    }

    /**
     * Get <p>允许额外写入送审包的原始 HTTP Header 名称，最多 64 项，每项最长 128 字节；名称不区分大小写，默认 []。内置保留 content-type、accept、mcp-protocol-version、a2a-version；Authorization、Cookie、API Key、MCP 会话标识和内部 Relay 等受限头不会因加入本列表而放行。审核服务自身的鉴权请使用 AuthConfig。</p> 
     * @return HeaderAllowList <p>允许额外写入送审包的原始 HTTP Header 名称，最多 64 项，每项最长 128 字节；名称不区分大小写，默认 []。内置保留 content-type、accept、mcp-protocol-version、a2a-version；Authorization、Cookie、API Key、MCP 会话标识和内部 Relay 等受限头不会因加入本列表而放行。审核服务自身的鉴权请使用 AuthConfig。</p>
     */
    public String [] getHeaderAllowList() {
        return this.HeaderAllowList;
    }

    /**
     * Set <p>允许额外写入送审包的原始 HTTP Header 名称，最多 64 项，每项最长 128 字节；名称不区分大小写，默认 []。内置保留 content-type、accept、mcp-protocol-version、a2a-version；Authorization、Cookie、API Key、MCP 会话标识和内部 Relay 等受限头不会因加入本列表而放行。审核服务自身的鉴权请使用 AuthConfig。</p>
     * @param HeaderAllowList <p>允许额外写入送审包的原始 HTTP Header 名称，最多 64 项，每项最长 128 字节；名称不区分大小写，默认 []。内置保留 content-type、accept、mcp-protocol-version、a2a-version；Authorization、Cookie、API Key、MCP 会话标识和内部 Relay 等受限头不会因加入本列表而放行。审核服务自身的鉴权请使用 AuthConfig。</p>
     */
    public void setHeaderAllowList(String [] HeaderAllowList) {
        this.HeaderAllowList = HeaderAllowList;
    }

    public CustomGuardrailServiceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailServiceConfig(CustomGuardrailServiceConfig source) {
        if (source.AddressMode != null) {
            this.AddressMode = new String(source.AddressMode);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.SSLVerify != null) {
            this.SSLVerify = new Boolean(source.SSLVerify);
        }
        if (source.QueryPassthroughEnabled != null) {
            this.QueryPassthroughEnabled = new Boolean(source.QueryPassthroughEnabled);
        }
        if (source.HeaderAllowList != null) {
            this.HeaderAllowList = new String[source.HeaderAllowList.length];
            for (int i = 0; i < source.HeaderAllowList.length; i++) {
                this.HeaderAllowList[i] = new String(source.HeaderAllowList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressMode", this.AddressMode);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "SSLVerify", this.SSLVerify);
        this.setParamSimple(map, prefix + "QueryPassthroughEnabled", this.QueryPassthroughEnabled);
        this.setParamArraySimple(map, prefix + "HeaderAllowList.", this.HeaderAllowList);

    }
}

