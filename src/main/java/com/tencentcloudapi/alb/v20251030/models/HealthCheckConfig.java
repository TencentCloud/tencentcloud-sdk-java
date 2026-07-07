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

public class HealthCheckConfig extends AbstractModel {

    /**
    * 是否开启健康检查。
- **true**：开启。
- **false**：不开启。
    */
    @SerializedName("HealthCheckEnabled")
    @Expose
    private Boolean HealthCheckEnabled;

    /**
    * 健康检查状态码。取值：
- 当健康检查协议为**HTTP/HTTPS**时：
	- **http_1xx**
	- **http_2xx**（默认值）
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- 当健康检查协议为**gRPC**时：默认值为12，数值范围为0-99，输入值可为数值、多个数值或者范围以及相互组合，如：
	- **"20"**
	- **"0-99"**
> 仅当**HealthCheckProtocol**设置为**HTTP** 、**HTTPS**、**GRPC** 或者**GRPCS**时，该参数生效。
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
    * 健康检查域名。该参数不设置时默认使用后端服务的内网IP作为健康检查地址。
域名限制：
- 长度限制为 **1-255** 个字符。
- 可包含小写字母、数字、短划线（-）和半角句号（.）。
- 至少包含一个半角句号（.），半角句号（.）不能出现在开头或结尾。
- 最右侧的域标签，只能包含字母，不能包含数字或短划线（-）。
- 短划线（-）不能出现在开头或结尾。
>仅当 **HealthCheckProtocol** 设置为 **HTTP、HTTPS** 、**GRPC**、**GRPCS** 时，该参数生效。
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
    * 健康检查的转发规则路径。
长度为 1~80 个字符，只能使用字母、数字、字符`-/.%?#&=`以及扩展字符`_;~!（)*[]@$^:',+`。 URL 必须以正斜线（/）开头。
> 仅当**HealthCheckProtocol**为**HTTP**、**HTTPS** 、**GRPC**、**GRPCS**时，转发规则路径参数生效。
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
- **GRPC**：通过发送 POST 请求来检查服务器应用是否健康。
- **GRPCS**：通过发送 POST 请求来检查服务器应用是否健康。
    */
    @SerializedName("HealthCheckProtocol")
    @Expose
    private String HealthCheckProtocol;

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
     * Get 是否开启健康检查。
- **true**：开启。
- **false**：不开启。 
     * @return HealthCheckEnabled 是否开启健康检查。
- **true**：开启。
- **false**：不开启。
     */
    public Boolean getHealthCheckEnabled() {
        return this.HealthCheckEnabled;
    }

    /**
     * Set 是否开启健康检查。
- **true**：开启。
- **false**：不开启。
     * @param HealthCheckEnabled 是否开启健康检查。
- **true**：开启。
- **false**：不开启。
     */
    public void setHealthCheckEnabled(Boolean HealthCheckEnabled) {
        this.HealthCheckEnabled = HealthCheckEnabled;
    }

    /**
     * Get 健康检查状态码。取值：
- 当健康检查协议为**HTTP/HTTPS**时：
	- **http_1xx**
	- **http_2xx**（默认值）
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- 当健康检查协议为**gRPC**时：默认值为12，数值范围为0-99，输入值可为数值、多个数值或者范围以及相互组合，如：
	- **"20"**
	- **"0-99"**
> 仅当**HealthCheckProtocol**设置为**HTTP** 、**HTTPS**、**GRPC** 或者**GRPCS**时，该参数生效。 
     * @return HealthCheckCodes 健康检查状态码。取值：
- 当健康检查协议为**HTTP/HTTPS**时：
	- **http_1xx**
	- **http_2xx**（默认值）
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- 当健康检查协议为**gRPC**时：默认值为12，数值范围为0-99，输入值可为数值、多个数值或者范围以及相互组合，如：
	- **"20"**
	- **"0-99"**
> 仅当**HealthCheckProtocol**设置为**HTTP** 、**HTTPS**、**GRPC** 或者**GRPCS**时，该参数生效。
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
- 当健康检查协议为**gRPC**时：默认值为12，数值范围为0-99，输入值可为数值、多个数值或者范围以及相互组合，如：
	- **"20"**
	- **"0-99"**
> 仅当**HealthCheckProtocol**设置为**HTTP** 、**HTTPS**、**GRPC** 或者**GRPCS**时，该参数生效。
     * @param HealthCheckCodes 健康检查状态码。取值：
- 当健康检查协议为**HTTP/HTTPS**时：
	- **http_1xx**
	- **http_2xx**（默认值）
	-  **http_3xx**
	-  **http_4xx**
	-  **http_5xx**
- 当健康检查协议为**gRPC**时：默认值为12，数值范围为0-99，输入值可为数值、多个数值或者范围以及相互组合，如：
	- **"20"**
	- **"0-99"**
> 仅当**HealthCheckProtocol**设置为**HTTP** 、**HTTPS**、**GRPC** 或者**GRPCS**时，该参数生效。
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
     * Get 健康检查域名。该参数不设置时默认使用后端服务的内网IP作为健康检查地址。
域名限制：
- 长度限制为 **1-255** 个字符。
- 可包含小写字母、数字、短划线（-）和半角句号（.）。
- 至少包含一个半角句号（.），半角句号（.）不能出现在开头或结尾。
- 最右侧的域标签，只能包含字母，不能包含数字或短划线（-）。
- 短划线（-）不能出现在开头或结尾。
>仅当 **HealthCheckProtocol** 设置为 **HTTP、HTTPS** 、**GRPC**、**GRPCS** 时，该参数生效。 
     * @return HealthCheckHost 健康检查域名。该参数不设置时默认使用后端服务的内网IP作为健康检查地址。
域名限制：
- 长度限制为 **1-255** 个字符。
- 可包含小写字母、数字、短划线（-）和半角句号（.）。
- 至少包含一个半角句号（.），半角句号（.）不能出现在开头或结尾。
- 最右侧的域标签，只能包含字母，不能包含数字或短划线（-）。
- 短划线（-）不能出现在开头或结尾。
>仅当 **HealthCheckProtocol** 设置为 **HTTP、HTTPS** 、**GRPC**、**GRPCS** 时，该参数生效。
     */
    public String getHealthCheckHost() {
        return this.HealthCheckHost;
    }

    /**
     * Set 健康检查域名。该参数不设置时默认使用后端服务的内网IP作为健康检查地址。
域名限制：
- 长度限制为 **1-255** 个字符。
- 可包含小写字母、数字、短划线（-）和半角句号（.）。
- 至少包含一个半角句号（.），半角句号（.）不能出现在开头或结尾。
- 最右侧的域标签，只能包含字母，不能包含数字或短划线（-）。
- 短划线（-）不能出现在开头或结尾。
>仅当 **HealthCheckProtocol** 设置为 **HTTP、HTTPS** 、**GRPC**、**GRPCS** 时，该参数生效。
     * @param HealthCheckHost 健康检查域名。该参数不设置时默认使用后端服务的内网IP作为健康检查地址。
域名限制：
- 长度限制为 **1-255** 个字符。
- 可包含小写字母、数字、短划线（-）和半角句号（.）。
- 至少包含一个半角句号（.），半角句号（.）不能出现在开头或结尾。
- 最右侧的域标签，只能包含字母，不能包含数字或短划线（-）。
- 短划线（-）不能出现在开头或结尾。
>仅当 **HealthCheckProtocol** 设置为 **HTTP、HTTPS** 、**GRPC**、**GRPCS** 时，该参数生效。
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
     * Get 健康检查的转发规则路径。
长度为 1~80 个字符，只能使用字母、数字、字符`-/.%?#&=`以及扩展字符`_;~!（)*[]@$^:',+`。 URL 必须以正斜线（/）开头。
> 仅当**HealthCheckProtocol**为**HTTP**、**HTTPS** 、**GRPC**、**GRPCS**时，转发规则路径参数生效。 
     * @return HealthCheckPath 健康检查的转发规则路径。
长度为 1~80 个字符，只能使用字母、数字、字符`-/.%?#&=`以及扩展字符`_;~!（)*[]@$^:',+`。 URL 必须以正斜线（/）开头。
> 仅当**HealthCheckProtocol**为**HTTP**、**HTTPS** 、**GRPC**、**GRPCS**时，转发规则路径参数生效。
     */
    public String getHealthCheckPath() {
        return this.HealthCheckPath;
    }

    /**
     * Set 健康检查的转发规则路径。
长度为 1~80 个字符，只能使用字母、数字、字符`-/.%?#&=`以及扩展字符`_;~!（)*[]@$^:',+`。 URL 必须以正斜线（/）开头。
> 仅当**HealthCheckProtocol**为**HTTP**、**HTTPS** 、**GRPC**、**GRPCS**时，转发规则路径参数生效。
     * @param HealthCheckPath 健康检查的转发规则路径。
长度为 1~80 个字符，只能使用字母、数字、字符`-/.%?#&=`以及扩展字符`_;~!（)*[]@$^:',+`。 URL 必须以正斜线（/）开头。
> 仅当**HealthCheckProtocol**为**HTTP**、**HTTPS** 、**GRPC**、**GRPCS**时，转发规则路径参数生效。
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
- **GRPC**：通过发送 POST 请求来检查服务器应用是否健康。
- **GRPCS**：通过发送 POST 请求来检查服务器应用是否健康。 
     * @return HealthCheckProtocol 健康检查协议。取值：
- **HTTP**（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。
- **HTTPS**：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）
- **TCP**：通过发送 SYN 握手报文来检测服务器端口是否存活。
- **GRPC**：通过发送 POST 请求来检查服务器应用是否健康。
- **GRPCS**：通过发送 POST 请求来检查服务器应用是否健康。
     */
    public String getHealthCheckProtocol() {
        return this.HealthCheckProtocol;
    }

    /**
     * Set 健康检查协议。取值：
- **HTTP**（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。
- **HTTPS**：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）
- **TCP**：通过发送 SYN 握手报文来检测服务器端口是否存活。
- **GRPC**：通过发送 POST 请求来检查服务器应用是否健康。
- **GRPCS**：通过发送 POST 请求来检查服务器应用是否健康。
     * @param HealthCheckProtocol 健康检查协议。取值：
- **HTTP**（默认）：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。
- **HTTPS**：通过发送 HEAD 或 GET 请求模拟浏览器的访问行为来检查服务器应用是否健康。（数据加密，相比 HTTP 更安全。）
- **TCP**：通过发送 SYN 握手报文来检测服务器端口是否存活。
- **GRPC**：通过发送 POST 请求来检查服务器应用是否健康。
- **GRPCS**：通过发送 POST 请求来检查服务器应用是否健康。
     */
    public void setHealthCheckProtocol(String HealthCheckProtocol) {
        this.HealthCheckProtocol = HealthCheckProtocol;
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

    public HealthCheckConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckConfig(HealthCheckConfig source) {
        if (source.HealthCheckEnabled != null) {
            this.HealthCheckEnabled = new Boolean(source.HealthCheckEnabled);
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
        this.setParamSimple(map, prefix + "HealthCheckEnabled", this.HealthCheckEnabled);
        this.setParamArraySimple(map, prefix + "HealthCheckCodes.", this.HealthCheckCodes);
        this.setParamSimple(map, prefix + "HealthCheckHealthyThreshold", this.HealthCheckHealthyThreshold);
        this.setParamSimple(map, prefix + "HealthCheckHost", this.HealthCheckHost);
        this.setParamSimple(map, prefix + "HealthCheckHttpVersion", this.HealthCheckHttpVersion);
        this.setParamSimple(map, prefix + "HealthCheckInterval", this.HealthCheckInterval);
        this.setParamSimple(map, prefix + "HealthCheckMethod", this.HealthCheckMethod);
        this.setParamSimple(map, prefix + "HealthCheckPath", this.HealthCheckPath);
        this.setParamSimple(map, prefix + "HealthCheckPort", this.HealthCheckPort);
        this.setParamSimple(map, prefix + "HealthCheckProtocol", this.HealthCheckProtocol);
        this.setParamSimple(map, prefix + "HealthCheckTimeout", this.HealthCheckTimeout);
        this.setParamSimple(map, prefix + "HealthCheckUnhealthyThreshold", this.HealthCheckUnhealthyThreshold);

    }
}

