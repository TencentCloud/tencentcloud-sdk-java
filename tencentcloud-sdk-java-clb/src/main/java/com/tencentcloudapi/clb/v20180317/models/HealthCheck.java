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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheck extends AbstractModel{

    /**
    * 是否开启健康检查：1（开启）、0（关闭）。
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * 健康检查的响应超时时间（仅适用于四层监听器），可选值：2~60，默认值：2，单位：秒。响应超时时间要小于检查间隔时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * 健康检查探测间隔时间，默认值：5，可选值：5~300，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2~10，单位：次。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发异常，可选值：2~10，单位：次。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnHealthNum")
    @Expose
    private Long UnHealthNum;

    /**
    * 健康检查状态码（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。可选值：1~31，默认 31。
1 表示探测后返回值 1xx 代表健康，2 表示返回 2xx 代表健康，4 表示返回 3xx 代表健康，8 表示返回 4xx 代表健康，16 表示返回 5xx 代表健康。若希望多种返回码都可代表健康，则将相应的值相加。注意：TCP监听器的HTTP健康检查方式，只支持指定一种健康检查状态码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * 健康检查路径（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * 健康检查域名（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * 健康检查方法（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式），默认值：HEAD，可选值HEAD或GET。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpCheckMethod")
    @Expose
    private String HttpCheckMethod;

    /**
    * 自定义探测相关参数。健康检查端口，默认为后端服务的端口，除非您希望指定特定端口，否则建议留空。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckPort")
    @Expose
    private Long CheckPort;

    /**
    * 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查的输入格式，可取值：HEX或TEXT；取值为HEX时，SendContext和RecvContext的字符只能在0123456789ABCDEF中选取且长度必须是偶数位。（仅适用于TCP/UDP监听器）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查发送的请求内容，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查返回的结果，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
    * 自定义探测相关参数。健康检查使用的协议：TCP | HTTP | CUSTOM（仅适用于TCP/UDP监听器，其中UDP监听器只支持CUSTOM；如果使用自定义健康检查功能，则必传）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckType")
    @Expose
    private String CheckType;

    /**
    * 自定义探测相关参数。健康检查协议CheckType的值取HTTP时，必传此字段，代表后端服务的HTTP版本：HTTP/1.0、HTTP/1.1；（仅适用于TCP监听器）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
     * Get 是否开启健康检查：1（开启）、0（关闭）。 
     * @return HealthSwitch 是否开启健康检查：1（开启）、0（关闭）。
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set 是否开启健康检查：1（开启）、0（关闭）。
     * @param HealthSwitch 是否开启健康检查：1（开启）、0（关闭）。
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get 健康检查的响应超时时间（仅适用于四层监听器），可选值：2~60，默认值：2，单位：秒。响应超时时间要小于检查间隔时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeOut 健康检查的响应超时时间（仅适用于四层监听器），可选值：2~60，默认值：2，单位：秒。响应超时时间要小于检查间隔时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set 健康检查的响应超时时间（仅适用于四层监听器），可选值：2~60，默认值：2，单位：秒。响应超时时间要小于检查间隔时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeOut 健康检查的响应超时时间（仅适用于四层监听器），可选值：2~60，默认值：2，单位：秒。响应超时时间要小于检查间隔时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get 健康检查探测间隔时间，默认值：5，可选值：5~300，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntervalTime 健康检查探测间隔时间，默认值：5，可选值：5~300，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 健康检查探测间隔时间，默认值：5，可选值：5~300，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntervalTime 健康检查探测间隔时间，默认值：5，可选值：5~300，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2~10，单位：次。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthNum 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2~10，单位：次。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2~10，单位：次。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthNum 健康阈值，默认值：3，表示当连续探测三次健康则表示该转发正常，可选值：2~10，单位：次。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发异常，可选值：2~10，单位：次。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnHealthNum 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发异常，可选值：2~10，单位：次。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnHealthNum() {
        return this.UnHealthNum;
    }

    /**
     * Set 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发异常，可选值：2~10，单位：次。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnHealthNum 不健康阈值，默认值：3，表示当连续探测三次不健康则表示该转发异常，可选值：2~10，单位：次。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnHealthNum(Long UnHealthNum) {
        this.UnHealthNum = UnHealthNum;
    }

    /**
     * Get 健康检查状态码（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。可选值：1~31，默认 31。
1 表示探测后返回值 1xx 代表健康，2 表示返回 2xx 代表健康，4 表示返回 3xx 代表健康，8 表示返回 4xx 代表健康，16 表示返回 5xx 代表健康。若希望多种返回码都可代表健康，则将相应的值相加。注意：TCP监听器的HTTP健康检查方式，只支持指定一种健康检查状态码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpCode 健康检查状态码（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。可选值：1~31，默认 31。
1 表示探测后返回值 1xx 代表健康，2 表示返回 2xx 代表健康，4 表示返回 3xx 代表健康，8 表示返回 4xx 代表健康，16 表示返回 5xx 代表健康。若希望多种返回码都可代表健康，则将相应的值相加。注意：TCP监听器的HTTP健康检查方式，只支持指定一种健康检查状态码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set 健康检查状态码（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。可选值：1~31，默认 31。
1 表示探测后返回值 1xx 代表健康，2 表示返回 2xx 代表健康，4 表示返回 3xx 代表健康，8 表示返回 4xx 代表健康，16 表示返回 5xx 代表健康。若希望多种返回码都可代表健康，则将相应的值相加。注意：TCP监听器的HTTP健康检查方式，只支持指定一种健康检查状态码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpCode 健康检查状态码（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。可选值：1~31，默认 31。
1 表示探测后返回值 1xx 代表健康，2 表示返回 2xx 代表健康，4 表示返回 3xx 代表健康，8 表示返回 4xx 代表健康，16 表示返回 5xx 代表健康。若希望多种返回码都可代表健康，则将相应的值相加。注意：TCP监听器的HTTP健康检查方式，只支持指定一种健康检查状态码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get 健康检查路径（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpCheckPath 健康检查路径（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * Set 健康检查路径（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpCheckPath 健康检查路径（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * Get 健康检查域名（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpCheckDomain 健康检查域名（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * Set 健康检查域名（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpCheckDomain 健康检查域名（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
    }

    /**
     * Get 健康检查方法（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式），默认值：HEAD，可选值HEAD或GET。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpCheckMethod 健康检查方法（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式），默认值：HEAD，可选值HEAD或GET。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpCheckMethod() {
        return this.HttpCheckMethod;
    }

    /**
     * Set 健康检查方法（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式），默认值：HEAD，可选值HEAD或GET。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpCheckMethod 健康检查方法（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式），默认值：HEAD，可选值HEAD或GET。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpCheckMethod(String HttpCheckMethod) {
        this.HttpCheckMethod = HttpCheckMethod;
    }

    /**
     * Get 自定义探测相关参数。健康检查端口，默认为后端服务的端口，除非您希望指定特定端口，否则建议留空。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckPort 自定义探测相关参数。健康检查端口，默认为后端服务的端口，除非您希望指定特定端口，否则建议留空。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckPort() {
        return this.CheckPort;
    }

    /**
     * Set 自定义探测相关参数。健康检查端口，默认为后端服务的端口，除非您希望指定特定端口，否则建议留空。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckPort 自定义探测相关参数。健康检查端口，默认为后端服务的端口，除非您希望指定特定端口，否则建议留空。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckPort(Long CheckPort) {
        this.CheckPort = CheckPort;
    }

    /**
     * Get 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查的输入格式，可取值：HEX或TEXT；取值为HEX时，SendContext和RecvContext的字符只能在0123456789ABCDEF中选取且长度必须是偶数位。（仅适用于TCP/UDP监听器）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContextType 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查的输入格式，可取值：HEX或TEXT；取值为HEX时，SendContext和RecvContext的字符只能在0123456789ABCDEF中选取且长度必须是偶数位。（仅适用于TCP/UDP监听器）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查的输入格式，可取值：HEX或TEXT；取值为HEX时，SendContext和RecvContext的字符只能在0123456789ABCDEF中选取且长度必须是偶数位。（仅适用于TCP/UDP监听器）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContextType 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查的输入格式，可取值：HEX或TEXT；取值为HEX时，SendContext和RecvContext的字符只能在0123456789ABCDEF中选取且长度必须是偶数位。（仅适用于TCP/UDP监听器）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查发送的请求内容，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendContext 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查发送的请求内容，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查发送的请求内容，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendContext 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查发送的请求内容，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查返回的结果，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecvContext 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查返回的结果，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查返回的结果，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecvContext 自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查返回的结果，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP监听器）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    /**
     * Get 自定义探测相关参数。健康检查使用的协议：TCP | HTTP | CUSTOM（仅适用于TCP/UDP监听器，其中UDP监听器只支持CUSTOM；如果使用自定义健康检查功能，则必传）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckType 自定义探测相关参数。健康检查使用的协议：TCP | HTTP | CUSTOM（仅适用于TCP/UDP监听器，其中UDP监听器只支持CUSTOM；如果使用自定义健康检查功能，则必传）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCheckType() {
        return this.CheckType;
    }

    /**
     * Set 自定义探测相关参数。健康检查使用的协议：TCP | HTTP | CUSTOM（仅适用于TCP/UDP监听器，其中UDP监听器只支持CUSTOM；如果使用自定义健康检查功能，则必传）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckType 自定义探测相关参数。健康检查使用的协议：TCP | HTTP | CUSTOM（仅适用于TCP/UDP监听器，其中UDP监听器只支持CUSTOM；如果使用自定义健康检查功能，则必传）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckType(String CheckType) {
        this.CheckType = CheckType;
    }

    /**
     * Get 自定义探测相关参数。健康检查协议CheckType的值取HTTP时，必传此字段，代表后端服务的HTTP版本：HTTP/1.0、HTTP/1.1；（仅适用于TCP监听器）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpVersion 自定义探测相关参数。健康检查协议CheckType的值取HTTP时，必传此字段，代表后端服务的HTTP版本：HTTP/1.0、HTTP/1.1；（仅适用于TCP监听器）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set 自定义探测相关参数。健康检查协议CheckType的值取HTTP时，必传此字段，代表后端服务的HTTP版本：HTTP/1.0、HTTP/1.1；（仅适用于TCP监听器）
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpVersion 自定义探测相关参数。健康检查协议CheckType的值取HTTP时，必传此字段，代表后端服务的HTTP版本：HTTP/1.0、HTTP/1.1；（仅适用于TCP监听器）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnHealthNum", this.UnHealthNum);
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamSimple(map, prefix + "HttpCheckDomain", this.HttpCheckDomain);
        this.setParamSimple(map, prefix + "HttpCheckMethod", this.HttpCheckMethod);
        this.setParamSimple(map, prefix + "CheckPort", this.CheckPort);
        this.setParamSimple(map, prefix + "ContextType", this.ContextType);
        this.setParamSimple(map, prefix + "SendContext", this.SendContext);
        this.setParamSimple(map, prefix + "RecvContext", this.RecvContext);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);

    }
}

