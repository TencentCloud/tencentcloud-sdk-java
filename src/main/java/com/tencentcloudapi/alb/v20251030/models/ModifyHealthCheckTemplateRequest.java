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

public class ModifyHealthCheckTemplateRequest extends AbstractModel {

    /**
    * <p>健康检查模板 ID，格式为 hct- 后接字母数字。</p>
    */
    @SerializedName("HealthCheckTemplateId")
    @Expose
    private String HealthCheckTemplateId;

    /**
    * <p>是否预览此次请求。</p><ul><li><strong>false</strong>（默认）：发送普通请求，直接修改健康检查模板。</li><li><strong>true</strong>：发送预览请求，检查修改健康检查模板的参数、格式、业务限制等是否符合要求。</li></ul>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>健康检查状态码。取值：</p><ul><li>当健康检查协议为<strong>HTTP/HTTPS</strong>时：<ul><li><strong>http_1xx</strong></li><li><strong>http_2xx</strong>（默认值）</li><li><strong>http_3xx</strong></li><li><strong>http_4xx</strong></li><li><strong>http_5xx</strong></li></ul></li><li>当健康检查协议为<strong>GRPC/GRPCS</strong>时：默认值为<strong>12</strong>，数值范围为<strong>0-99</strong>，输入值可为数值、多个数值或者范围以及相互组合，如：<ul><li><strong>&quot;20&quot;</strong></li><li><strong>&quot;0-99&quot;</strong></li></ul></li></ul>
    */
    @SerializedName("HealthCheckCodes")
    @Expose
    private String [] HealthCheckCodes;

    /**
    * <p>判定后端服务健康的阈值，当健康检查连续成功多少次后，后端服务的状态由<strong>不健康</strong>变为<strong>健康</strong>。<br>取值范围：<strong>2</strong>-<strong>10</strong>。<br>默认值：<strong>2</strong>。</p>
    */
    @SerializedName("HealthCheckHealthyThreshold")
    @Expose
    private Long HealthCheckHealthyThreshold;

    /**
    * <p>健康检查域名。<br>长度限制为 <strong>1-255</strong> 个字符。<br>可包含小写字母、数字、短划线（-）和半角句号（.）。</p><blockquote><p>仅当 <strong>HealthCheckProtocol</strong> 设置为 <strong>HTTP/HTTPS/GRPC/GRPCS</strong> 时，该参数生效。</p></blockquote>
    */
    @SerializedName("HealthCheckHost")
    @Expose
    private String HealthCheckHost;

    /**
    * <p>健康检查 HTTP 协议版本，取值：</p><ul><li><strong>HTTP1.1</strong>（默认）</li><li><strong>HTTP1.0</strong> <blockquote><p>仅当<strong>HealthCheckProtocol</strong>设置为<strong>HTTP</strong> 或 <strong>HTTPS</strong> 时，该参数生效。</p></blockquote></li></ul>
    */
    @SerializedName("HealthCheckHttpVersion")
    @Expose
    private String HealthCheckHttpVersion;

    /**
    * <p>健康检查的时间间隔。单位：秒。 取值范围：<strong>2</strong>-<strong>300</strong>。 默认值：<strong>5</strong>。</p>
    */
    @SerializedName("HealthCheckInterval")
    @Expose
    private Long HealthCheckInterval;

    /**
    * <p>健康检查方法，取值： - <strong>GET</strong> - <strong>HEAD</strong>（默认值） </p><blockquote><p>仅当<strong>HealthCheckProtocol</strong>设置为<strong>HTTP</strong> 或 <strong>HTTPS</strong> 时，该参数生效。</p></blockquote>
    */
    @SerializedName("HealthCheckMethod")
    @Expose
    private String HealthCheckMethod;

    /**
    * <p>健康检查的转发规则路径。 长度为 <strong>1-80</strong> 个字符，只能使用字母、数字、字符<code>-/.%?#&amp;=</code>以及扩展字符<code>_;~!（)*[]@$^:&#39;,+</code>。 URL 必须以正斜线（/）开头。 </p><blockquote><p>仅当<strong>HealthCheckProtocol</strong>为<strong>HTTP/HTTPS/GRPC/GRPCS</strong>时，转发规则路径参数生效。</p></blockquote>
    */
    @SerializedName("HealthCheckPath")
    @Expose
    private String HealthCheckPath;

    /**
    * <p>健康检查访问后端服务器的端口。  取值范围：<strong>0-65535</strong>。  默认值：<strong>0</strong>，表示后端服务器的端口。</p>
    */
    @SerializedName("HealthCheckPort")
    @Expose
    private Long HealthCheckPort;

    /**
    * <p>健康检查协议。取值：</p><ul><li><strong>HTTP</strong>（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。</li><li><strong>HTTPS</strong>：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）</li><li><strong>TCP</strong>：通过发送 SYN 握手报文来检测服务器端口是否存活。</li><li><strong>GRPC</strong>：通过发送 POST 或 GET 请求来检查服务器应用是否健康。</li><li><strong>GRPCS</strong>：通过发送 POST 或 GET 请求来检查服务器应用是否健康。</li></ul>
    */
    @SerializedName("HealthCheckProtocol")
    @Expose
    private String HealthCheckProtocol;

    /**
    * <p>健康检查模板名称。长度为 <strong>1-255</strong> 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。</p>
    */
    @SerializedName("HealthCheckTemplateName")
    @Expose
    private String HealthCheckTemplateName;

    /**
    * <p>健康检查的响应超时时间。单位：秒。<br>取值范围：<strong>2</strong>-<strong>60</strong>。<br>默认值：<strong>2</strong>。</p>
    */
    @SerializedName("HealthCheckTimeout")
    @Expose
    private Long HealthCheckTimeout;

    /**
    * <p>判定后端服务不健康的阈值，当健康检查连续失败多少次后，后端服务的状态由<strong>健康</strong>变为<strong>不健康</strong>。<br>取值范围：<strong>2</strong>-<strong>10</strong>。<br>默认值：<strong>2</strong>。</p>
    */
    @SerializedName("HealthCheckUnhealthyThreshold")
    @Expose
    private Long HealthCheckUnhealthyThreshold;

    /**
     * Get <p>健康检查模板 ID，格式为 hct- 后接字母数字。</p> 
     * @return HealthCheckTemplateId <p>健康检查模板 ID，格式为 hct- 后接字母数字。</p>
     */
    public String getHealthCheckTemplateId() {
        return this.HealthCheckTemplateId;
    }

    /**
     * Set <p>健康检查模板 ID，格式为 hct- 后接字母数字。</p>
     * @param HealthCheckTemplateId <p>健康检查模板 ID，格式为 hct- 后接字母数字。</p>
     */
    public void setHealthCheckTemplateId(String HealthCheckTemplateId) {
        this.HealthCheckTemplateId = HealthCheckTemplateId;
    }

    /**
     * Get <p>是否预览此次请求。</p><ul><li><strong>false</strong>（默认）：发送普通请求，直接修改健康检查模板。</li><li><strong>true</strong>：发送预览请求，检查修改健康检查模板的参数、格式、业务限制等是否符合要求。</li></ul> 
     * @return DryRun <p>是否预览此次请求。</p><ul><li><strong>false</strong>（默认）：发送普通请求，直接修改健康检查模板。</li><li><strong>true</strong>：发送预览请求，检查修改健康检查模板的参数、格式、业务限制等是否符合要求。</li></ul>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>是否预览此次请求。</p><ul><li><strong>false</strong>（默认）：发送普通请求，直接修改健康检查模板。</li><li><strong>true</strong>：发送预览请求，检查修改健康检查模板的参数、格式、业务限制等是否符合要求。</li></ul>
     * @param DryRun <p>是否预览此次请求。</p><ul><li><strong>false</strong>（默认）：发送普通请求，直接修改健康检查模板。</li><li><strong>true</strong>：发送预览请求，检查修改健康检查模板的参数、格式、业务限制等是否符合要求。</li></ul>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>健康检查状态码。取值：</p><ul><li>当健康检查协议为<strong>HTTP/HTTPS</strong>时：<ul><li><strong>http_1xx</strong></li><li><strong>http_2xx</strong>（默认值）</li><li><strong>http_3xx</strong></li><li><strong>http_4xx</strong></li><li><strong>http_5xx</strong></li></ul></li><li>当健康检查协议为<strong>GRPC/GRPCS</strong>时：默认值为<strong>12</strong>，数值范围为<strong>0-99</strong>，输入值可为数值、多个数值或者范围以及相互组合，如：<ul><li><strong>&quot;20&quot;</strong></li><li><strong>&quot;0-99&quot;</strong></li></ul></li></ul> 
     * @return HealthCheckCodes <p>健康检查状态码。取值：</p><ul><li>当健康检查协议为<strong>HTTP/HTTPS</strong>时：<ul><li><strong>http_1xx</strong></li><li><strong>http_2xx</strong>（默认值）</li><li><strong>http_3xx</strong></li><li><strong>http_4xx</strong></li><li><strong>http_5xx</strong></li></ul></li><li>当健康检查协议为<strong>GRPC/GRPCS</strong>时：默认值为<strong>12</strong>，数值范围为<strong>0-99</strong>，输入值可为数值、多个数值或者范围以及相互组合，如：<ul><li><strong>&quot;20&quot;</strong></li><li><strong>&quot;0-99&quot;</strong></li></ul></li></ul>
     */
    public String [] getHealthCheckCodes() {
        return this.HealthCheckCodes;
    }

    /**
     * Set <p>健康检查状态码。取值：</p><ul><li>当健康检查协议为<strong>HTTP/HTTPS</strong>时：<ul><li><strong>http_1xx</strong></li><li><strong>http_2xx</strong>（默认值）</li><li><strong>http_3xx</strong></li><li><strong>http_4xx</strong></li><li><strong>http_5xx</strong></li></ul></li><li>当健康检查协议为<strong>GRPC/GRPCS</strong>时：默认值为<strong>12</strong>，数值范围为<strong>0-99</strong>，输入值可为数值、多个数值或者范围以及相互组合，如：<ul><li><strong>&quot;20&quot;</strong></li><li><strong>&quot;0-99&quot;</strong></li></ul></li></ul>
     * @param HealthCheckCodes <p>健康检查状态码。取值：</p><ul><li>当健康检查协议为<strong>HTTP/HTTPS</strong>时：<ul><li><strong>http_1xx</strong></li><li><strong>http_2xx</strong>（默认值）</li><li><strong>http_3xx</strong></li><li><strong>http_4xx</strong></li><li><strong>http_5xx</strong></li></ul></li><li>当健康检查协议为<strong>GRPC/GRPCS</strong>时：默认值为<strong>12</strong>，数值范围为<strong>0-99</strong>，输入值可为数值、多个数值或者范围以及相互组合，如：<ul><li><strong>&quot;20&quot;</strong></li><li><strong>&quot;0-99&quot;</strong></li></ul></li></ul>
     */
    public void setHealthCheckCodes(String [] HealthCheckCodes) {
        this.HealthCheckCodes = HealthCheckCodes;
    }

    /**
     * Get <p>判定后端服务健康的阈值，当健康检查连续成功多少次后，后端服务的状态由<strong>不健康</strong>变为<strong>健康</strong>。<br>取值范围：<strong>2</strong>-<strong>10</strong>。<br>默认值：<strong>2</strong>。</p> 
     * @return HealthCheckHealthyThreshold <p>判定后端服务健康的阈值，当健康检查连续成功多少次后，后端服务的状态由<strong>不健康</strong>变为<strong>健康</strong>。<br>取值范围：<strong>2</strong>-<strong>10</strong>。<br>默认值：<strong>2</strong>。</p>
     */
    public Long getHealthCheckHealthyThreshold() {
        return this.HealthCheckHealthyThreshold;
    }

    /**
     * Set <p>判定后端服务健康的阈值，当健康检查连续成功多少次后，后端服务的状态由<strong>不健康</strong>变为<strong>健康</strong>。<br>取值范围：<strong>2</strong>-<strong>10</strong>。<br>默认值：<strong>2</strong>。</p>
     * @param HealthCheckHealthyThreshold <p>判定后端服务健康的阈值，当健康检查连续成功多少次后，后端服务的状态由<strong>不健康</strong>变为<strong>健康</strong>。<br>取值范围：<strong>2</strong>-<strong>10</strong>。<br>默认值：<strong>2</strong>。</p>
     */
    public void setHealthCheckHealthyThreshold(Long HealthCheckHealthyThreshold) {
        this.HealthCheckHealthyThreshold = HealthCheckHealthyThreshold;
    }

    /**
     * Get <p>健康检查域名。<br>长度限制为 <strong>1-255</strong> 个字符。<br>可包含小写字母、数字、短划线（-）和半角句号（.）。</p><blockquote><p>仅当 <strong>HealthCheckProtocol</strong> 设置为 <strong>HTTP/HTTPS/GRPC/GRPCS</strong> 时，该参数生效。</p></blockquote> 
     * @return HealthCheckHost <p>健康检查域名。<br>长度限制为 <strong>1-255</strong> 个字符。<br>可包含小写字母、数字、短划线（-）和半角句号（.）。</p><blockquote><p>仅当 <strong>HealthCheckProtocol</strong> 设置为 <strong>HTTP/HTTPS/GRPC/GRPCS</strong> 时，该参数生效。</p></blockquote>
     */
    public String getHealthCheckHost() {
        return this.HealthCheckHost;
    }

    /**
     * Set <p>健康检查域名。<br>长度限制为 <strong>1-255</strong> 个字符。<br>可包含小写字母、数字、短划线（-）和半角句号（.）。</p><blockquote><p>仅当 <strong>HealthCheckProtocol</strong> 设置为 <strong>HTTP/HTTPS/GRPC/GRPCS</strong> 时，该参数生效。</p></blockquote>
     * @param HealthCheckHost <p>健康检查域名。<br>长度限制为 <strong>1-255</strong> 个字符。<br>可包含小写字母、数字、短划线（-）和半角句号（.）。</p><blockquote><p>仅当 <strong>HealthCheckProtocol</strong> 设置为 <strong>HTTP/HTTPS/GRPC/GRPCS</strong> 时，该参数生效。</p></blockquote>
     */
    public void setHealthCheckHost(String HealthCheckHost) {
        this.HealthCheckHost = HealthCheckHost;
    }

    /**
     * Get <p>健康检查 HTTP 协议版本，取值：</p><ul><li><strong>HTTP1.1</strong>（默认）</li><li><strong>HTTP1.0</strong> <blockquote><p>仅当<strong>HealthCheckProtocol</strong>设置为<strong>HTTP</strong> 或 <strong>HTTPS</strong> 时，该参数生效。</p></blockquote></li></ul> 
     * @return HealthCheckHttpVersion <p>健康检查 HTTP 协议版本，取值：</p><ul><li><strong>HTTP1.1</strong>（默认）</li><li><strong>HTTP1.0</strong> <blockquote><p>仅当<strong>HealthCheckProtocol</strong>设置为<strong>HTTP</strong> 或 <strong>HTTPS</strong> 时，该参数生效。</p></blockquote></li></ul>
     */
    public String getHealthCheckHttpVersion() {
        return this.HealthCheckHttpVersion;
    }

    /**
     * Set <p>健康检查 HTTP 协议版本，取值：</p><ul><li><strong>HTTP1.1</strong>（默认）</li><li><strong>HTTP1.0</strong> <blockquote><p>仅当<strong>HealthCheckProtocol</strong>设置为<strong>HTTP</strong> 或 <strong>HTTPS</strong> 时，该参数生效。</p></blockquote></li></ul>
     * @param HealthCheckHttpVersion <p>健康检查 HTTP 协议版本，取值：</p><ul><li><strong>HTTP1.1</strong>（默认）</li><li><strong>HTTP1.0</strong> <blockquote><p>仅当<strong>HealthCheckProtocol</strong>设置为<strong>HTTP</strong> 或 <strong>HTTPS</strong> 时，该参数生效。</p></blockquote></li></ul>
     */
    public void setHealthCheckHttpVersion(String HealthCheckHttpVersion) {
        this.HealthCheckHttpVersion = HealthCheckHttpVersion;
    }

    /**
     * Get <p>健康检查的时间间隔。单位：秒。 取值范围：<strong>2</strong>-<strong>300</strong>。 默认值：<strong>5</strong>。</p> 
     * @return HealthCheckInterval <p>健康检查的时间间隔。单位：秒。 取值范围：<strong>2</strong>-<strong>300</strong>。 默认值：<strong>5</strong>。</p>
     */
    public Long getHealthCheckInterval() {
        return this.HealthCheckInterval;
    }

    /**
     * Set <p>健康检查的时间间隔。单位：秒。 取值范围：<strong>2</strong>-<strong>300</strong>。 默认值：<strong>5</strong>。</p>
     * @param HealthCheckInterval <p>健康检查的时间间隔。单位：秒。 取值范围：<strong>2</strong>-<strong>300</strong>。 默认值：<strong>5</strong>。</p>
     */
    public void setHealthCheckInterval(Long HealthCheckInterval) {
        this.HealthCheckInterval = HealthCheckInterval;
    }

    /**
     * Get <p>健康检查方法，取值： - <strong>GET</strong> - <strong>HEAD</strong>（默认值） </p><blockquote><p>仅当<strong>HealthCheckProtocol</strong>设置为<strong>HTTP</strong> 或 <strong>HTTPS</strong> 时，该参数生效。</p></blockquote> 
     * @return HealthCheckMethod <p>健康检查方法，取值： - <strong>GET</strong> - <strong>HEAD</strong>（默认值） </p><blockquote><p>仅当<strong>HealthCheckProtocol</strong>设置为<strong>HTTP</strong> 或 <strong>HTTPS</strong> 时，该参数生效。</p></blockquote>
     */
    public String getHealthCheckMethod() {
        return this.HealthCheckMethod;
    }

    /**
     * Set <p>健康检查方法，取值： - <strong>GET</strong> - <strong>HEAD</strong>（默认值） </p><blockquote><p>仅当<strong>HealthCheckProtocol</strong>设置为<strong>HTTP</strong> 或 <strong>HTTPS</strong> 时，该参数生效。</p></blockquote>
     * @param HealthCheckMethod <p>健康检查方法，取值： - <strong>GET</strong> - <strong>HEAD</strong>（默认值） </p><blockquote><p>仅当<strong>HealthCheckProtocol</strong>设置为<strong>HTTP</strong> 或 <strong>HTTPS</strong> 时，该参数生效。</p></blockquote>
     */
    public void setHealthCheckMethod(String HealthCheckMethod) {
        this.HealthCheckMethod = HealthCheckMethod;
    }

    /**
     * Get <p>健康检查的转发规则路径。 长度为 <strong>1-80</strong> 个字符，只能使用字母、数字、字符<code>-/.%?#&amp;=</code>以及扩展字符<code>_;~!（)*[]@$^:&#39;,+</code>。 URL 必须以正斜线（/）开头。 </p><blockquote><p>仅当<strong>HealthCheckProtocol</strong>为<strong>HTTP/HTTPS/GRPC/GRPCS</strong>时，转发规则路径参数生效。</p></blockquote> 
     * @return HealthCheckPath <p>健康检查的转发规则路径。 长度为 <strong>1-80</strong> 个字符，只能使用字母、数字、字符<code>-/.%?#&amp;=</code>以及扩展字符<code>_;~!（)*[]@$^:&#39;,+</code>。 URL 必须以正斜线（/）开头。 </p><blockquote><p>仅当<strong>HealthCheckProtocol</strong>为<strong>HTTP/HTTPS/GRPC/GRPCS</strong>时，转发规则路径参数生效。</p></blockquote>
     */
    public String getHealthCheckPath() {
        return this.HealthCheckPath;
    }

    /**
     * Set <p>健康检查的转发规则路径。 长度为 <strong>1-80</strong> 个字符，只能使用字母、数字、字符<code>-/.%?#&amp;=</code>以及扩展字符<code>_;~!（)*[]@$^:&#39;,+</code>。 URL 必须以正斜线（/）开头。 </p><blockquote><p>仅当<strong>HealthCheckProtocol</strong>为<strong>HTTP/HTTPS/GRPC/GRPCS</strong>时，转发规则路径参数生效。</p></blockquote>
     * @param HealthCheckPath <p>健康检查的转发规则路径。 长度为 <strong>1-80</strong> 个字符，只能使用字母、数字、字符<code>-/.%?#&amp;=</code>以及扩展字符<code>_;~!（)*[]@$^:&#39;,+</code>。 URL 必须以正斜线（/）开头。 </p><blockquote><p>仅当<strong>HealthCheckProtocol</strong>为<strong>HTTP/HTTPS/GRPC/GRPCS</strong>时，转发规则路径参数生效。</p></blockquote>
     */
    public void setHealthCheckPath(String HealthCheckPath) {
        this.HealthCheckPath = HealthCheckPath;
    }

    /**
     * Get <p>健康检查访问后端服务器的端口。  取值范围：<strong>0-65535</strong>。  默认值：<strong>0</strong>，表示后端服务器的端口。</p> 
     * @return HealthCheckPort <p>健康检查访问后端服务器的端口。  取值范围：<strong>0-65535</strong>。  默认值：<strong>0</strong>，表示后端服务器的端口。</p>
     */
    public Long getHealthCheckPort() {
        return this.HealthCheckPort;
    }

    /**
     * Set <p>健康检查访问后端服务器的端口。  取值范围：<strong>0-65535</strong>。  默认值：<strong>0</strong>，表示后端服务器的端口。</p>
     * @param HealthCheckPort <p>健康检查访问后端服务器的端口。  取值范围：<strong>0-65535</strong>。  默认值：<strong>0</strong>，表示后端服务器的端口。</p>
     */
    public void setHealthCheckPort(Long HealthCheckPort) {
        this.HealthCheckPort = HealthCheckPort;
    }

    /**
     * Get <p>健康检查协议。取值：</p><ul><li><strong>HTTP</strong>（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。</li><li><strong>HTTPS</strong>：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）</li><li><strong>TCP</strong>：通过发送 SYN 握手报文来检测服务器端口是否存活。</li><li><strong>GRPC</strong>：通过发送 POST 或 GET 请求来检查服务器应用是否健康。</li><li><strong>GRPCS</strong>：通过发送 POST 或 GET 请求来检查服务器应用是否健康。</li></ul> 
     * @return HealthCheckProtocol <p>健康检查协议。取值：</p><ul><li><strong>HTTP</strong>（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。</li><li><strong>HTTPS</strong>：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）</li><li><strong>TCP</strong>：通过发送 SYN 握手报文来检测服务器端口是否存活。</li><li><strong>GRPC</strong>：通过发送 POST 或 GET 请求来检查服务器应用是否健康。</li><li><strong>GRPCS</strong>：通过发送 POST 或 GET 请求来检查服务器应用是否健康。</li></ul>
     */
    public String getHealthCheckProtocol() {
        return this.HealthCheckProtocol;
    }

    /**
     * Set <p>健康检查协议。取值：</p><ul><li><strong>HTTP</strong>（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。</li><li><strong>HTTPS</strong>：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）</li><li><strong>TCP</strong>：通过发送 SYN 握手报文来检测服务器端口是否存活。</li><li><strong>GRPC</strong>：通过发送 POST 或 GET 请求来检查服务器应用是否健康。</li><li><strong>GRPCS</strong>：通过发送 POST 或 GET 请求来检查服务器应用是否健康。</li></ul>
     * @param HealthCheckProtocol <p>健康检查协议。取值：</p><ul><li><strong>HTTP</strong>（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。</li><li><strong>HTTPS</strong>：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）</li><li><strong>TCP</strong>：通过发送 SYN 握手报文来检测服务器端口是否存活。</li><li><strong>GRPC</strong>：通过发送 POST 或 GET 请求来检查服务器应用是否健康。</li><li><strong>GRPCS</strong>：通过发送 POST 或 GET 请求来检查服务器应用是否健康。</li></ul>
     */
    public void setHealthCheckProtocol(String HealthCheckProtocol) {
        this.HealthCheckProtocol = HealthCheckProtocol;
    }

    /**
     * Get <p>健康检查模板名称。长度为 <strong>1-255</strong> 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。</p> 
     * @return HealthCheckTemplateName <p>健康检查模板名称。长度为 <strong>1-255</strong> 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。</p>
     */
    public String getHealthCheckTemplateName() {
        return this.HealthCheckTemplateName;
    }

    /**
     * Set <p>健康检查模板名称。长度为 <strong>1-255</strong> 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。</p>
     * @param HealthCheckTemplateName <p>健康检查模板名称。长度为 <strong>1-255</strong> 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。</p>
     */
    public void setHealthCheckTemplateName(String HealthCheckTemplateName) {
        this.HealthCheckTemplateName = HealthCheckTemplateName;
    }

    /**
     * Get <p>健康检查的响应超时时间。单位：秒。<br>取值范围：<strong>2</strong>-<strong>60</strong>。<br>默认值：<strong>2</strong>。</p> 
     * @return HealthCheckTimeout <p>健康检查的响应超时时间。单位：秒。<br>取值范围：<strong>2</strong>-<strong>60</strong>。<br>默认值：<strong>2</strong>。</p>
     */
    public Long getHealthCheckTimeout() {
        return this.HealthCheckTimeout;
    }

    /**
     * Set <p>健康检查的响应超时时间。单位：秒。<br>取值范围：<strong>2</strong>-<strong>60</strong>。<br>默认值：<strong>2</strong>。</p>
     * @param HealthCheckTimeout <p>健康检查的响应超时时间。单位：秒。<br>取值范围：<strong>2</strong>-<strong>60</strong>。<br>默认值：<strong>2</strong>。</p>
     */
    public void setHealthCheckTimeout(Long HealthCheckTimeout) {
        this.HealthCheckTimeout = HealthCheckTimeout;
    }

    /**
     * Get <p>判定后端服务不健康的阈值，当健康检查连续失败多少次后，后端服务的状态由<strong>健康</strong>变为<strong>不健康</strong>。<br>取值范围：<strong>2</strong>-<strong>10</strong>。<br>默认值：<strong>2</strong>。</p> 
     * @return HealthCheckUnhealthyThreshold <p>判定后端服务不健康的阈值，当健康检查连续失败多少次后，后端服务的状态由<strong>健康</strong>变为<strong>不健康</strong>。<br>取值范围：<strong>2</strong>-<strong>10</strong>。<br>默认值：<strong>2</strong>。</p>
     */
    public Long getHealthCheckUnhealthyThreshold() {
        return this.HealthCheckUnhealthyThreshold;
    }

    /**
     * Set <p>判定后端服务不健康的阈值，当健康检查连续失败多少次后，后端服务的状态由<strong>健康</strong>变为<strong>不健康</strong>。<br>取值范围：<strong>2</strong>-<strong>10</strong>。<br>默认值：<strong>2</strong>。</p>
     * @param HealthCheckUnhealthyThreshold <p>判定后端服务不健康的阈值，当健康检查连续失败多少次后，后端服务的状态由<strong>健康</strong>变为<strong>不健康</strong>。<br>取值范围：<strong>2</strong>-<strong>10</strong>。<br>默认值：<strong>2</strong>。</p>
     */
    public void setHealthCheckUnhealthyThreshold(Long HealthCheckUnhealthyThreshold) {
        this.HealthCheckUnhealthyThreshold = HealthCheckUnhealthyThreshold;
    }

    public ModifyHealthCheckTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHealthCheckTemplateRequest(ModifyHealthCheckTemplateRequest source) {
        if (source.HealthCheckTemplateId != null) {
            this.HealthCheckTemplateId = new String(source.HealthCheckTemplateId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.HealthCheckCodes != null) {
            this.HealthCheckCodes = new String[source.HealthCheckCodes.length];
            for (int i = 0; i < source.HealthCheckCodes.length; i++) {
                this.HealthCheckCodes[i] = new String(source.HealthCheckCodes[i]);
            }
        }
        if (source.HealthCheckHealthyThreshold != null) {
            this.HealthCheckHealthyThreshold = new Long(source.HealthCheckHealthyThreshold);
        }
        if (source.HealthCheckHost != null) {
            this.HealthCheckHost = new String(source.HealthCheckHost);
        }
        if (source.HealthCheckHttpVersion != null) {
            this.HealthCheckHttpVersion = new String(source.HealthCheckHttpVersion);
        }
        if (source.HealthCheckInterval != null) {
            this.HealthCheckInterval = new Long(source.HealthCheckInterval);
        }
        if (source.HealthCheckMethod != null) {
            this.HealthCheckMethod = new String(source.HealthCheckMethod);
        }
        if (source.HealthCheckPath != null) {
            this.HealthCheckPath = new String(source.HealthCheckPath);
        }
        if (source.HealthCheckPort != null) {
            this.HealthCheckPort = new Long(source.HealthCheckPort);
        }
        if (source.HealthCheckProtocol != null) {
            this.HealthCheckProtocol = new String(source.HealthCheckProtocol);
        }
        if (source.HealthCheckTemplateName != null) {
            this.HealthCheckTemplateName = new String(source.HealthCheckTemplateName);
        }
        if (source.HealthCheckTimeout != null) {
            this.HealthCheckTimeout = new Long(source.HealthCheckTimeout);
        }
        if (source.HealthCheckUnhealthyThreshold != null) {
            this.HealthCheckUnhealthyThreshold = new Long(source.HealthCheckUnhealthyThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthCheckTemplateId", this.HealthCheckTemplateId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamArraySimple(map, prefix + "HealthCheckCodes.", this.HealthCheckCodes);
        this.setParamSimple(map, prefix + "HealthCheckHealthyThreshold", this.HealthCheckHealthyThreshold);
        this.setParamSimple(map, prefix + "HealthCheckHost", this.HealthCheckHost);
        this.setParamSimple(map, prefix + "HealthCheckHttpVersion", this.HealthCheckHttpVersion);
        this.setParamSimple(map, prefix + "HealthCheckInterval", this.HealthCheckInterval);
        this.setParamSimple(map, prefix + "HealthCheckMethod", this.HealthCheckMethod);
        this.setParamSimple(map, prefix + "HealthCheckPath", this.HealthCheckPath);
        this.setParamSimple(map, prefix + "HealthCheckPort", this.HealthCheckPort);
        this.setParamSimple(map, prefix + "HealthCheckProtocol", this.HealthCheckProtocol);
        this.setParamSimple(map, prefix + "HealthCheckTemplateName", this.HealthCheckTemplateName);
        this.setParamSimple(map, prefix + "HealthCheckTimeout", this.HealthCheckTimeout);
        this.setParamSimple(map, prefix + "HealthCheckUnhealthyThreshold", this.HealthCheckUnhealthyThreshold);

    }
}

