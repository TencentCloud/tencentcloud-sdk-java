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

public class HealthCheckTemplate extends AbstractModel {

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 健康检查状态码。取值：
- 当健康检查协议为**HTTP/HTTPS**时：
	- **http_1xx**
	- **http_2xx**（默认值）
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- 当健康检查协议为**GRPC/GRPCS**时：默认值为**12**，数值范围为**0-99**，输入值可为数值、多个数值或者范围以及相互组合，如：
	- **"20"**
	- **"0-99"**
    */
    @SerializedName("HealthCheckCodes")
    @Expose
    private String [] HealthCheckCodes;

    /**
    * 判定后端服务健康的阈值，当健康检查连续成功多少次后，后端服务的状态由**不健康**变为**健康**。
取值范围：**2**-**10**。
默认值：**2**。
    */
    @SerializedName("HealthCheckHealthyThreshold")
    @Expose
    private Long HealthCheckHealthyThreshold;

    /**
    * 健康检查域名。
长度限制为 **1-255** 个字符。
可包含小写字母、数字、短划线（-）和半角句号（.）。

> 仅当 **HealthCheckProtocol** 设置为 **HTTP/HTTPS/GRPC/GRPCS** 时，该参数生效。
    */
    @SerializedName("HealthCheckHost")
    @Expose
    private String HealthCheckHost;

    /**
    * 健康检查 HTTP 协议版本，取值：
- **HTTP1.1**（默认）
- **HTTP1.0** 
> 仅当**HealthCheckProtocol**设置为**HTTP** 或 **HTTPS** 时，该参数生效。
    */
    @SerializedName("HealthCheckHttpVersion")
    @Expose
    private String HealthCheckHttpVersion;

    /**
    * 健康检查的时间间隔。单位：秒。
取值范围：**2**-**300**。
默认值：**5**。
    */
    @SerializedName("HealthCheckInterval")
    @Expose
    private Long HealthCheckInterval;

    /**
    * 健康检查方法，取值：
- **GET**
- **HEAD**（默认值）
> 仅当**HealthCheckProtocol**设置为**HTTP** 或 **HTTPS** 时，该参数生效。
    */
    @SerializedName("HealthCheckMethod")
    @Expose
    private String HealthCheckMethod;

    /**
    * 健康检查的转发规则路径。 长度为 **1-80** 个字符，只能使用字母、数字、字符`-/.%?#&=`以及扩展字符`_;~!（)*[]@$^:',+`。 URL 必须以正斜线（/）开头。 
> 仅当**HealthCheckProtocol**为**HTTP/HTTPS/GRPC/GRPCS**时，转发规则路径参数生效。
    */
    @SerializedName("HealthCheckPath")
    @Expose
    private String HealthCheckPath;

    /**
    * 健康检查访问后端服务器的端口。

取值范围：**0-65535**。

默认值：**0**，表示后端服务器的端口。
    */
    @SerializedName("HealthCheckPort")
    @Expose
    private Long HealthCheckPort;

    /**
    * 健康检查协议。取值：
- **HTTP**（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。
- **HTTPS**：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）
- **TCP**：通过发送 SYN 握手报文来检测服务器端口是否存活。
- **GRPC**：通过发送 POST 或 GET 请求来检查服务器应用是否健康。
- **GRPCS**：通过发送 POST 或 GET 请求来检查服务器应用是否健康。
    */
    @SerializedName("HealthCheckProtocol")
    @Expose
    private String HealthCheckProtocol;

    /**
    * 健康检查模板 ID，格式为 hct- 后接字母数字。所有接口（创建、查询、修改、删除）均使用 hct- 前缀。
    */
    @SerializedName("HealthCheckTemplateId")
    @Expose
    private String HealthCheckTemplateId;

    /**
    * 健康检查模板名称。长度为 **1-255** 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。
    */
    @SerializedName("HealthCheckTemplateName")
    @Expose
    private String HealthCheckTemplateName;

    /**
    * 健康检查的响应超时时间。单位：秒。
取值范围：**2**-**60**。
默认值：**2**。
    */
    @SerializedName("HealthCheckTimeout")
    @Expose
    private Long HealthCheckTimeout;

    /**
    * 判定后端服务不健康的阈值，当健康检查连续失败多少次后，后端服务的状态由**健康**变为**不健康**。
取值范围：**2**-**10**。
默认值：**2**。
    */
    @SerializedName("HealthCheckUnhealthyThreshold")
    @Expose
    private Long HealthCheckUnhealthyThreshold;

    /**
    * 修改时间。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 标签。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 健康检查状态码。取值：
- 当健康检查协议为**HTTP/HTTPS**时：
	- **http_1xx**
	- **http_2xx**（默认值）
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- 当健康检查协议为**GRPC/GRPCS**时：默认值为**12**，数值范围为**0-99**，输入值可为数值、多个数值或者范围以及相互组合，如：
	- **"20"**
	- **"0-99"** 
     * @return HealthCheckCodes 健康检查状态码。取值：
- 当健康检查协议为**HTTP/HTTPS**时：
	- **http_1xx**
	- **http_2xx**（默认值）
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- 当健康检查协议为**GRPC/GRPCS**时：默认值为**12**，数值范围为**0-99**，输入值可为数值、多个数值或者范围以及相互组合，如：
	- **"20"**
	- **"0-99"**
     */
    public String [] getHealthCheckCodes() {
        return this.HealthCheckCodes;
    }

    /**
     * Set 健康检查状态码。取值：
- 当健康检查协议为**HTTP/HTTPS**时：
	- **http_1xx**
	- **http_2xx**（默认值）
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- 当健康检查协议为**GRPC/GRPCS**时：默认值为**12**，数值范围为**0-99**，输入值可为数值、多个数值或者范围以及相互组合，如：
	- **"20"**
	- **"0-99"**
     * @param HealthCheckCodes 健康检查状态码。取值：
- 当健康检查协议为**HTTP/HTTPS**时：
	- **http_1xx**
	- **http_2xx**（默认值）
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- 当健康检查协议为**GRPC/GRPCS**时：默认值为**12**，数值范围为**0-99**，输入值可为数值、多个数值或者范围以及相互组合，如：
	- **"20"**
	- **"0-99"**
     */
    public void setHealthCheckCodes(String [] HealthCheckCodes) {
        this.HealthCheckCodes = HealthCheckCodes;
    }

    /**
     * Get 判定后端服务健康的阈值，当健康检查连续成功多少次后，后端服务的状态由**不健康**变为**健康**。
取值范围：**2**-**10**。
默认值：**2**。 
     * @return HealthCheckHealthyThreshold 判定后端服务健康的阈值，当健康检查连续成功多少次后，后端服务的状态由**不健康**变为**健康**。
取值范围：**2**-**10**。
默认值：**2**。
     */
    public Long getHealthCheckHealthyThreshold() {
        return this.HealthCheckHealthyThreshold;
    }

    /**
     * Set 判定后端服务健康的阈值，当健康检查连续成功多少次后，后端服务的状态由**不健康**变为**健康**。
取值范围：**2**-**10**。
默认值：**2**。
     * @param HealthCheckHealthyThreshold 判定后端服务健康的阈值，当健康检查连续成功多少次后，后端服务的状态由**不健康**变为**健康**。
取值范围：**2**-**10**。
默认值：**2**。
     */
    public void setHealthCheckHealthyThreshold(Long HealthCheckHealthyThreshold) {
        this.HealthCheckHealthyThreshold = HealthCheckHealthyThreshold;
    }

    /**
     * Get 健康检查域名。
长度限制为 **1-255** 个字符。
可包含小写字母、数字、短划线（-）和半角句号（.）。

> 仅当 **HealthCheckProtocol** 设置为 **HTTP/HTTPS/GRPC/GRPCS** 时，该参数生效。 
     * @return HealthCheckHost 健康检查域名。
长度限制为 **1-255** 个字符。
可包含小写字母、数字、短划线（-）和半角句号（.）。

> 仅当 **HealthCheckProtocol** 设置为 **HTTP/HTTPS/GRPC/GRPCS** 时，该参数生效。
     */
    public String getHealthCheckHost() {
        return this.HealthCheckHost;
    }

    /**
     * Set 健康检查域名。
长度限制为 **1-255** 个字符。
可包含小写字母、数字、短划线（-）和半角句号（.）。

> 仅当 **HealthCheckProtocol** 设置为 **HTTP/HTTPS/GRPC/GRPCS** 时，该参数生效。
     * @param HealthCheckHost 健康检查域名。
长度限制为 **1-255** 个字符。
可包含小写字母、数字、短划线（-）和半角句号（.）。

> 仅当 **HealthCheckProtocol** 设置为 **HTTP/HTTPS/GRPC/GRPCS** 时，该参数生效。
     */
    public void setHealthCheckHost(String HealthCheckHost) {
        this.HealthCheckHost = HealthCheckHost;
    }

    /**
     * Get 健康检查 HTTP 协议版本，取值：
- **HTTP1.1**（默认）
- **HTTP1.0** 
> 仅当**HealthCheckProtocol**设置为**HTTP** 或 **HTTPS** 时，该参数生效。 
     * @return HealthCheckHttpVersion 健康检查 HTTP 协议版本，取值：
- **HTTP1.1**（默认）
- **HTTP1.0** 
> 仅当**HealthCheckProtocol**设置为**HTTP** 或 **HTTPS** 时，该参数生效。
     */
    public String getHealthCheckHttpVersion() {
        return this.HealthCheckHttpVersion;
    }

    /**
     * Set 健康检查 HTTP 协议版本，取值：
- **HTTP1.1**（默认）
- **HTTP1.0** 
> 仅当**HealthCheckProtocol**设置为**HTTP** 或 **HTTPS** 时，该参数生效。
     * @param HealthCheckHttpVersion 健康检查 HTTP 协议版本，取值：
- **HTTP1.1**（默认）
- **HTTP1.0** 
> 仅当**HealthCheckProtocol**设置为**HTTP** 或 **HTTPS** 时，该参数生效。
     */
    public void setHealthCheckHttpVersion(String HealthCheckHttpVersion) {
        this.HealthCheckHttpVersion = HealthCheckHttpVersion;
    }

    /**
     * Get 健康检查的时间间隔。单位：秒。
取值范围：**2**-**300**。
默认值：**5**。 
     * @return HealthCheckInterval 健康检查的时间间隔。单位：秒。
取值范围：**2**-**300**。
默认值：**5**。
     */
    public Long getHealthCheckInterval() {
        return this.HealthCheckInterval;
    }

    /**
     * Set 健康检查的时间间隔。单位：秒。
取值范围：**2**-**300**。
默认值：**5**。
     * @param HealthCheckInterval 健康检查的时间间隔。单位：秒。
取值范围：**2**-**300**。
默认值：**5**。
     */
    public void setHealthCheckInterval(Long HealthCheckInterval) {
        this.HealthCheckInterval = HealthCheckInterval;
    }

    /**
     * Get 健康检查方法，取值：
- **GET**
- **HEAD**（默认值）
> 仅当**HealthCheckProtocol**设置为**HTTP** 或 **HTTPS** 时，该参数生效。 
     * @return HealthCheckMethod 健康检查方法，取值：
- **GET**
- **HEAD**（默认值）
> 仅当**HealthCheckProtocol**设置为**HTTP** 或 **HTTPS** 时，该参数生效。
     */
    public String getHealthCheckMethod() {
        return this.HealthCheckMethod;
    }

    /**
     * Set 健康检查方法，取值：
- **GET**
- **HEAD**（默认值）
> 仅当**HealthCheckProtocol**设置为**HTTP** 或 **HTTPS** 时，该参数生效。
     * @param HealthCheckMethod 健康检查方法，取值：
- **GET**
- **HEAD**（默认值）
> 仅当**HealthCheckProtocol**设置为**HTTP** 或 **HTTPS** 时，该参数生效。
     */
    public void setHealthCheckMethod(String HealthCheckMethod) {
        this.HealthCheckMethod = HealthCheckMethod;
    }

    /**
     * Get 健康检查的转发规则路径。 长度为 **1-80** 个字符，只能使用字母、数字、字符`-/.%?#&=`以及扩展字符`_;~!（)*[]@$^:',+`。 URL 必须以正斜线（/）开头。 
> 仅当**HealthCheckProtocol**为**HTTP/HTTPS/GRPC/GRPCS**时，转发规则路径参数生效。 
     * @return HealthCheckPath 健康检查的转发规则路径。 长度为 **1-80** 个字符，只能使用字母、数字、字符`-/.%?#&=`以及扩展字符`_;~!（)*[]@$^:',+`。 URL 必须以正斜线（/）开头。 
> 仅当**HealthCheckProtocol**为**HTTP/HTTPS/GRPC/GRPCS**时，转发规则路径参数生效。
     */
    public String getHealthCheckPath() {
        return this.HealthCheckPath;
    }

    /**
     * Set 健康检查的转发规则路径。 长度为 **1-80** 个字符，只能使用字母、数字、字符`-/.%?#&=`以及扩展字符`_;~!（)*[]@$^:',+`。 URL 必须以正斜线（/）开头。 
> 仅当**HealthCheckProtocol**为**HTTP/HTTPS/GRPC/GRPCS**时，转发规则路径参数生效。
     * @param HealthCheckPath 健康检查的转发规则路径。 长度为 **1-80** 个字符，只能使用字母、数字、字符`-/.%?#&=`以及扩展字符`_;~!（)*[]@$^:',+`。 URL 必须以正斜线（/）开头。 
> 仅当**HealthCheckProtocol**为**HTTP/HTTPS/GRPC/GRPCS**时，转发规则路径参数生效。
     */
    public void setHealthCheckPath(String HealthCheckPath) {
        this.HealthCheckPath = HealthCheckPath;
    }

    /**
     * Get 健康检查访问后端服务器的端口。

取值范围：**0-65535**。

默认值：**0**，表示后端服务器的端口。 
     * @return HealthCheckPort 健康检查访问后端服务器的端口。

取值范围：**0-65535**。

默认值：**0**，表示后端服务器的端口。
     */
    public Long getHealthCheckPort() {
        return this.HealthCheckPort;
    }

    /**
     * Set 健康检查访问后端服务器的端口。

取值范围：**0-65535**。

默认值：**0**，表示后端服务器的端口。
     * @param HealthCheckPort 健康检查访问后端服务器的端口。

取值范围：**0-65535**。

默认值：**0**，表示后端服务器的端口。
     */
    public void setHealthCheckPort(Long HealthCheckPort) {
        this.HealthCheckPort = HealthCheckPort;
    }

    /**
     * Get 健康检查协议。取值：
- **HTTP**（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。
- **HTTPS**：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）
- **TCP**：通过发送 SYN 握手报文来检测服务器端口是否存活。
- **GRPC**：通过发送 POST 或 GET 请求来检查服务器应用是否健康。
- **GRPCS**：通过发送 POST 或 GET 请求来检查服务器应用是否健康。 
     * @return HealthCheckProtocol 健康检查协议。取值：
- **HTTP**（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。
- **HTTPS**：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）
- **TCP**：通过发送 SYN 握手报文来检测服务器端口是否存活。
- **GRPC**：通过发送 POST 或 GET 请求来检查服务器应用是否健康。
- **GRPCS**：通过发送 POST 或 GET 请求来检查服务器应用是否健康。
     */
    public String getHealthCheckProtocol() {
        return this.HealthCheckProtocol;
    }

    /**
     * Set 健康检查协议。取值：
- **HTTP**（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。
- **HTTPS**：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）
- **TCP**：通过发送 SYN 握手报文来检测服务器端口是否存活。
- **GRPC**：通过发送 POST 或 GET 请求来检查服务器应用是否健康。
- **GRPCS**：通过发送 POST 或 GET 请求来检查服务器应用是否健康。
     * @param HealthCheckProtocol 健康检查协议。取值：
- **HTTP**（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。
- **HTTPS**：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）
- **TCP**：通过发送 SYN 握手报文来检测服务器端口是否存活。
- **GRPC**：通过发送 POST 或 GET 请求来检查服务器应用是否健康。
- **GRPCS**：通过发送 POST 或 GET 请求来检查服务器应用是否健康。
     */
    public void setHealthCheckProtocol(String HealthCheckProtocol) {
        this.HealthCheckProtocol = HealthCheckProtocol;
    }

    /**
     * Get 健康检查模板 ID，格式为 hct- 后接字母数字。所有接口（创建、查询、修改、删除）均使用 hct- 前缀。 
     * @return HealthCheckTemplateId 健康检查模板 ID，格式为 hct- 后接字母数字。所有接口（创建、查询、修改、删除）均使用 hct- 前缀。
     */
    public String getHealthCheckTemplateId() {
        return this.HealthCheckTemplateId;
    }

    /**
     * Set 健康检查模板 ID，格式为 hct- 后接字母数字。所有接口（创建、查询、修改、删除）均使用 hct- 前缀。
     * @param HealthCheckTemplateId 健康检查模板 ID，格式为 hct- 后接字母数字。所有接口（创建、查询、修改、删除）均使用 hct- 前缀。
     */
    public void setHealthCheckTemplateId(String HealthCheckTemplateId) {
        this.HealthCheckTemplateId = HealthCheckTemplateId;
    }

    /**
     * Get 健康检查模板名称。长度为 **1-255** 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。 
     * @return HealthCheckTemplateName 健康检查模板名称。长度为 **1-255** 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。
     */
    public String getHealthCheckTemplateName() {
        return this.HealthCheckTemplateName;
    }

    /**
     * Set 健康检查模板名称。长度为 **1-255** 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。
     * @param HealthCheckTemplateName 健康检查模板名称。长度为 **1-255** 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。
     */
    public void setHealthCheckTemplateName(String HealthCheckTemplateName) {
        this.HealthCheckTemplateName = HealthCheckTemplateName;
    }

    /**
     * Get 健康检查的响应超时时间。单位：秒。
取值范围：**2**-**60**。
默认值：**2**。 
     * @return HealthCheckTimeout 健康检查的响应超时时间。单位：秒。
取值范围：**2**-**60**。
默认值：**2**。
     */
    public Long getHealthCheckTimeout() {
        return this.HealthCheckTimeout;
    }

    /**
     * Set 健康检查的响应超时时间。单位：秒。
取值范围：**2**-**60**。
默认值：**2**。
     * @param HealthCheckTimeout 健康检查的响应超时时间。单位：秒。
取值范围：**2**-**60**。
默认值：**2**。
     */
    public void setHealthCheckTimeout(Long HealthCheckTimeout) {
        this.HealthCheckTimeout = HealthCheckTimeout;
    }

    /**
     * Get 判定后端服务不健康的阈值，当健康检查连续失败多少次后，后端服务的状态由**健康**变为**不健康**。
取值范围：**2**-**10**。
默认值：**2**。 
     * @return HealthCheckUnhealthyThreshold 判定后端服务不健康的阈值，当健康检查连续失败多少次后，后端服务的状态由**健康**变为**不健康**。
取值范围：**2**-**10**。
默认值：**2**。
     */
    public Long getHealthCheckUnhealthyThreshold() {
        return this.HealthCheckUnhealthyThreshold;
    }

    /**
     * Set 判定后端服务不健康的阈值，当健康检查连续失败多少次后，后端服务的状态由**健康**变为**不健康**。
取值范围：**2**-**10**。
默认值：**2**。
     * @param HealthCheckUnhealthyThreshold 判定后端服务不健康的阈值，当健康检查连续失败多少次后，后端服务的状态由**健康**变为**不健康**。
取值范围：**2**-**10**。
默认值：**2**。
     */
    public void setHealthCheckUnhealthyThreshold(Long HealthCheckUnhealthyThreshold) {
        this.HealthCheckUnhealthyThreshold = HealthCheckUnhealthyThreshold;
    }

    /**
     * Get 修改时间。 
     * @return ModifyTime 修改时间。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间。
     * @param ModifyTime 修改时间。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 标签。 
     * @return Tags 标签。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。
     * @param Tags 标签。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public HealthCheckTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckTemplate(HealthCheckTemplate source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        if (source.HealthCheckTemplateId != null) {
            this.HealthCheckTemplateId = new String(source.HealthCheckTemplateId);
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
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "HealthCheckCodes.", this.HealthCheckCodes);
        this.setParamSimple(map, prefix + "HealthCheckHealthyThreshold", this.HealthCheckHealthyThreshold);
        this.setParamSimple(map, prefix + "HealthCheckHost", this.HealthCheckHost);
        this.setParamSimple(map, prefix + "HealthCheckHttpVersion", this.HealthCheckHttpVersion);
        this.setParamSimple(map, prefix + "HealthCheckInterval", this.HealthCheckInterval);
        this.setParamSimple(map, prefix + "HealthCheckMethod", this.HealthCheckMethod);
        this.setParamSimple(map, prefix + "HealthCheckPath", this.HealthCheckPath);
        this.setParamSimple(map, prefix + "HealthCheckPort", this.HealthCheckPort);
        this.setParamSimple(map, prefix + "HealthCheckProtocol", this.HealthCheckProtocol);
        this.setParamSimple(map, prefix + "HealthCheckTemplateId", this.HealthCheckTemplateId);
        this.setParamSimple(map, prefix + "HealthCheckTemplateName", this.HealthCheckTemplateName);
        this.setParamSimple(map, prefix + "HealthCheckTimeout", this.HealthCheckTimeout);
        this.setParamSimple(map, prefix + "HealthCheckUnhealthyThreshold", this.HealthCheckUnhealthyThreshold);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

