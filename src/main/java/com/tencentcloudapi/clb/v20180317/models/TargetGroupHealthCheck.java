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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupHealthCheck extends AbstractModel {

    /**
    * <p>是否开启健康检查。</p>
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Boolean HealthSwitch;

    /**
    * <p>健康检查方式， 其中仅V2新版目标组类型支持该参数， 支持取值 TCP | HTTP | HTTPS | PING | CUSTOM，其中:<br><ur><li>当目标组后端转发协议为TCP时， 健康检查方式支持 TCP/HTTP/CUSTOM， 默认为TCP。</li><li>当目标组后端转发协议为UDP时， 健康检查方式支持 PING/CUSTOM，默认为PING。</li><li>当目标组后端转发协议为HTTP时， 健康检查方式支持 HTTP/TCP， 默认为HTTP。</li><li>当目标组后端转发协议为HTTPS时， 健康检查方式支持 HTTPS/TCP， 默认为HTTPS。</li><li>当目标组后端转发协议为GRPC时， 健康检查方式支持GRPC/TCP， 默认为GRPC。</li></ur></p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>自定义探测相关参数。健康检查端口，默认为后端服务的端口，除非您希望指定特定端口，否则建议留空。（仅适用于TCP/UDP目标组）。</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>健康检查超时时间。 </p><p>取值范围：[2, 60]</p><p>单位：秒</p><p>默认值：2</p><p>响应超时时间要小于检查间隔时间。</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>检测间隔时间。</p><p>取值范围：[1, 600]</p><p>单位：秒</p><p>默认值：5</p>
    */
    @SerializedName("GapTime")
    @Expose
    private Long GapTime;

    /**
    * <p>检测健康阈值。</p><p>取值范围：[2, 10]</p><p>单位：次</p><p>默认值：3</p>
    */
    @SerializedName("GoodLimit")
    @Expose
    private Long GoodLimit;

    /**
    * <p>检测不健康阈值。</p><p>取值范围：[2, 10]</p><p>单位：次</p><p>默认值：3</p>
    */
    @SerializedName("BadLimit")
    @Expose
    private Long BadLimit;

    /**
    * <p>目标组下的所有rs的探测包是否开启巨帧。默认开启。仅GWLB类型目标组支持该参数。</p>
    */
    @SerializedName("JumboFrame")
    @Expose
    private Boolean JumboFrame;

    /**
    * <p>健康检查状态码（仅适用于HTTP/HTTPS目标组、TCP目标组的HTTP健康检查方式）。可选值：1~31，默认 31，其中：<url> <li>1 表示探测后返回值 1xx 代表健康。</li><li>2 表示返回 2xx 代表健康。</li><li>4 表示返回 3xx 代表健康。</li><li>8 表示返回 4xx 代表健康。</li><li>16 表示返回 5xx 代表健康。</li></url>若希望多种返回码都可代表健康，则将相应的值相加。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * <p>健康检查域名， 其中：<ur><li>仅适用于HTTP/HTTPS目标组和TCP目标组的HTTP健康检查方式。</li><li>针对HTTP/HTTPS目标组，当使用HTTP健康检查方式时，该参数为必填项。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpCheckDomain")
    @Expose
    private String HttpCheckDomain;

    /**
    * <p>健康检查路径（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * <p>健康检查方法（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式），默认值：HEAD，可选值HEAD或GET。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpCheckMethod")
    @Expose
    private String HttpCheckMethod;

    /**
    * <p>健康检查的输入格式，健康检查方式取CUSTOM时，必填此字段，可取值：HEX或TEXT，其中：<ur><li>TEXT：文本格式。</li><li>HEX：十六进制格式， SendContext和RecvContext的字符只能在0123456789ABCDEF中选取且长度必须是偶数位。</li><li>仅适用于TCP/UDP目标组。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContextType")
    @Expose
    private String ContextType;

    /**
    * <p>自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查发送的请求内容，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP目标组）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SendContext")
    @Expose
    private String SendContext;

    /**
    * <p>自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查返回的结果，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP目标组）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecvContext")
    @Expose
    private String RecvContext;

    /**
    * <p>HTTP版本, 其中：<ur><li>健康检查协议CheckType的值取HTTP时，必传此字段。</li><li>支持配置选项：HTTP/1.0, HTTP/1.1。</li><li>仅适用于TCP目标组。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpVersion")
    @Expose
    private String HttpVersion;

    /**
    * <p>GRPC健康检查状态码（仅适用于后端转发协议为GRPC的目标组）。默认值为 12，可输入值为数值、多个数值、或者范围，例如 20 或 20,25 或 0-99。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtendedCode")
    @Expose
    private String ExtendedCode;

    /**
     * Get <p>是否开启健康检查。</p> 
     * @return HealthSwitch <p>是否开启健康检查。</p>
     */
    public Boolean getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set <p>是否开启健康检查。</p>
     * @param HealthSwitch <p>是否开启健康检查。</p>
     */
    public void setHealthSwitch(Boolean HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get <p>健康检查方式， 其中仅V2新版目标组类型支持该参数， 支持取值 TCP | HTTP | HTTPS | PING | CUSTOM，其中:<br><ur><li>当目标组后端转发协议为TCP时， 健康检查方式支持 TCP/HTTP/CUSTOM， 默认为TCP。</li><li>当目标组后端转发协议为UDP时， 健康检查方式支持 PING/CUSTOM，默认为PING。</li><li>当目标组后端转发协议为HTTP时， 健康检查方式支持 HTTP/TCP， 默认为HTTP。</li><li>当目标组后端转发协议为HTTPS时， 健康检查方式支持 HTTPS/TCP， 默认为HTTPS。</li><li>当目标组后端转发协议为GRPC时， 健康检查方式支持GRPC/TCP， 默认为GRPC。</li></ur></p> 
     * @return Protocol <p>健康检查方式， 其中仅V2新版目标组类型支持该参数， 支持取值 TCP | HTTP | HTTPS | PING | CUSTOM，其中:<br><ur><li>当目标组后端转发协议为TCP时， 健康检查方式支持 TCP/HTTP/CUSTOM， 默认为TCP。</li><li>当目标组后端转发协议为UDP时， 健康检查方式支持 PING/CUSTOM，默认为PING。</li><li>当目标组后端转发协议为HTTP时， 健康检查方式支持 HTTP/TCP， 默认为HTTP。</li><li>当目标组后端转发协议为HTTPS时， 健康检查方式支持 HTTPS/TCP， 默认为HTTPS。</li><li>当目标组后端转发协议为GRPC时， 健康检查方式支持GRPC/TCP， 默认为GRPC。</li></ur></p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>健康检查方式， 其中仅V2新版目标组类型支持该参数， 支持取值 TCP | HTTP | HTTPS | PING | CUSTOM，其中:<br><ur><li>当目标组后端转发协议为TCP时， 健康检查方式支持 TCP/HTTP/CUSTOM， 默认为TCP。</li><li>当目标组后端转发协议为UDP时， 健康检查方式支持 PING/CUSTOM，默认为PING。</li><li>当目标组后端转发协议为HTTP时， 健康检查方式支持 HTTP/TCP， 默认为HTTP。</li><li>当目标组后端转发协议为HTTPS时， 健康检查方式支持 HTTPS/TCP， 默认为HTTPS。</li><li>当目标组后端转发协议为GRPC时， 健康检查方式支持GRPC/TCP， 默认为GRPC。</li></ur></p>
     * @param Protocol <p>健康检查方式， 其中仅V2新版目标组类型支持该参数， 支持取值 TCP | HTTP | HTTPS | PING | CUSTOM，其中:<br><ur><li>当目标组后端转发协议为TCP时， 健康检查方式支持 TCP/HTTP/CUSTOM， 默认为TCP。</li><li>当目标组后端转发协议为UDP时， 健康检查方式支持 PING/CUSTOM，默认为PING。</li><li>当目标组后端转发协议为HTTP时， 健康检查方式支持 HTTP/TCP， 默认为HTTP。</li><li>当目标组后端转发协议为HTTPS时， 健康检查方式支持 HTTPS/TCP， 默认为HTTPS。</li><li>当目标组后端转发协议为GRPC时， 健康检查方式支持GRPC/TCP， 默认为GRPC。</li></ur></p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>自定义探测相关参数。健康检查端口，默认为后端服务的端口，除非您希望指定特定端口，否则建议留空。（仅适用于TCP/UDP目标组）。</p> 
     * @return Port <p>自定义探测相关参数。健康检查端口，默认为后端服务的端口，除非您希望指定特定端口，否则建议留空。（仅适用于TCP/UDP目标组）。</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>自定义探测相关参数。健康检查端口，默认为后端服务的端口，除非您希望指定特定端口，否则建议留空。（仅适用于TCP/UDP目标组）。</p>
     * @param Port <p>自定义探测相关参数。健康检查端口，默认为后端服务的端口，除非您希望指定特定端口，否则建议留空。（仅适用于TCP/UDP目标组）。</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>健康检查超时时间。 </p><p>取值范围：[2, 60]</p><p>单位：秒</p><p>默认值：2</p><p>响应超时时间要小于检查间隔时间。</p> 
     * @return Timeout <p>健康检查超时时间。 </p><p>取值范围：[2, 60]</p><p>单位：秒</p><p>默认值：2</p><p>响应超时时间要小于检查间隔时间。</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>健康检查超时时间。 </p><p>取值范围：[2, 60]</p><p>单位：秒</p><p>默认值：2</p><p>响应超时时间要小于检查间隔时间。</p>
     * @param Timeout <p>健康检查超时时间。 </p><p>取值范围：[2, 60]</p><p>单位：秒</p><p>默认值：2</p><p>响应超时时间要小于检查间隔时间。</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>检测间隔时间。</p><p>取值范围：[1, 600]</p><p>单位：秒</p><p>默认值：5</p> 
     * @return GapTime <p>检测间隔时间。</p><p>取值范围：[1, 600]</p><p>单位：秒</p><p>默认值：5</p>
     */
    public Long getGapTime() {
        return this.GapTime;
    }

    /**
     * Set <p>检测间隔时间。</p><p>取值范围：[1, 600]</p><p>单位：秒</p><p>默认值：5</p>
     * @param GapTime <p>检测间隔时间。</p><p>取值范围：[1, 600]</p><p>单位：秒</p><p>默认值：5</p>
     */
    public void setGapTime(Long GapTime) {
        this.GapTime = GapTime;
    }

    /**
     * Get <p>检测健康阈值。</p><p>取值范围：[2, 10]</p><p>单位：次</p><p>默认值：3</p> 
     * @return GoodLimit <p>检测健康阈值。</p><p>取值范围：[2, 10]</p><p>单位：次</p><p>默认值：3</p>
     */
    public Long getGoodLimit() {
        return this.GoodLimit;
    }

    /**
     * Set <p>检测健康阈值。</p><p>取值范围：[2, 10]</p><p>单位：次</p><p>默认值：3</p>
     * @param GoodLimit <p>检测健康阈值。</p><p>取值范围：[2, 10]</p><p>单位：次</p><p>默认值：3</p>
     */
    public void setGoodLimit(Long GoodLimit) {
        this.GoodLimit = GoodLimit;
    }

    /**
     * Get <p>检测不健康阈值。</p><p>取值范围：[2, 10]</p><p>单位：次</p><p>默认值：3</p> 
     * @return BadLimit <p>检测不健康阈值。</p><p>取值范围：[2, 10]</p><p>单位：次</p><p>默认值：3</p>
     */
    public Long getBadLimit() {
        return this.BadLimit;
    }

    /**
     * Set <p>检测不健康阈值。</p><p>取值范围：[2, 10]</p><p>单位：次</p><p>默认值：3</p>
     * @param BadLimit <p>检测不健康阈值。</p><p>取值范围：[2, 10]</p><p>单位：次</p><p>默认值：3</p>
     */
    public void setBadLimit(Long BadLimit) {
        this.BadLimit = BadLimit;
    }

    /**
     * Get <p>目标组下的所有rs的探测包是否开启巨帧。默认开启。仅GWLB类型目标组支持该参数。</p> 
     * @return JumboFrame <p>目标组下的所有rs的探测包是否开启巨帧。默认开启。仅GWLB类型目标组支持该参数。</p>
     */
    public Boolean getJumboFrame() {
        return this.JumboFrame;
    }

    /**
     * Set <p>目标组下的所有rs的探测包是否开启巨帧。默认开启。仅GWLB类型目标组支持该参数。</p>
     * @param JumboFrame <p>目标组下的所有rs的探测包是否开启巨帧。默认开启。仅GWLB类型目标组支持该参数。</p>
     */
    public void setJumboFrame(Boolean JumboFrame) {
        this.JumboFrame = JumboFrame;
    }

    /**
     * Get <p>健康检查状态码（仅适用于HTTP/HTTPS目标组、TCP目标组的HTTP健康检查方式）。可选值：1~31，默认 31，其中：<url> <li>1 表示探测后返回值 1xx 代表健康。</li><li>2 表示返回 2xx 代表健康。</li><li>4 表示返回 3xx 代表健康。</li><li>8 表示返回 4xx 代表健康。</li><li>16 表示返回 5xx 代表健康。</li></url>若希望多种返回码都可代表健康，则将相应的值相加。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpCode <p>健康检查状态码（仅适用于HTTP/HTTPS目标组、TCP目标组的HTTP健康检查方式）。可选值：1~31，默认 31，其中：<url> <li>1 表示探测后返回值 1xx 代表健康。</li><li>2 表示返回 2xx 代表健康。</li><li>4 表示返回 3xx 代表健康。</li><li>8 表示返回 4xx 代表健康。</li><li>16 表示返回 5xx 代表健康。</li></url>若希望多种返回码都可代表健康，则将相应的值相加。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set <p>健康检查状态码（仅适用于HTTP/HTTPS目标组、TCP目标组的HTTP健康检查方式）。可选值：1~31，默认 31，其中：<url> <li>1 表示探测后返回值 1xx 代表健康。</li><li>2 表示返回 2xx 代表健康。</li><li>4 表示返回 3xx 代表健康。</li><li>8 表示返回 4xx 代表健康。</li><li>16 表示返回 5xx 代表健康。</li></url>若希望多种返回码都可代表健康，则将相应的值相加。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpCode <p>健康检查状态码（仅适用于HTTP/HTTPS目标组、TCP目标组的HTTP健康检查方式）。可选值：1~31，默认 31，其中：<url> <li>1 表示探测后返回值 1xx 代表健康。</li><li>2 表示返回 2xx 代表健康。</li><li>4 表示返回 3xx 代表健康。</li><li>8 表示返回 4xx 代表健康。</li><li>16 表示返回 5xx 代表健康。</li></url>若希望多种返回码都可代表健康，则将相应的值相加。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get <p>健康检查域名， 其中：<ur><li>仅适用于HTTP/HTTPS目标组和TCP目标组的HTTP健康检查方式。</li><li>针对HTTP/HTTPS目标组，当使用HTTP健康检查方式时，该参数为必填项。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpCheckDomain <p>健康检查域名， 其中：<ur><li>仅适用于HTTP/HTTPS目标组和TCP目标组的HTTP健康检查方式。</li><li>针对HTTP/HTTPS目标组，当使用HTTP健康检查方式时，该参数为必填项。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpCheckDomain() {
        return this.HttpCheckDomain;
    }

    /**
     * Set <p>健康检查域名， 其中：<ur><li>仅适用于HTTP/HTTPS目标组和TCP目标组的HTTP健康检查方式。</li><li>针对HTTP/HTTPS目标组，当使用HTTP健康检查方式时，该参数为必填项。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpCheckDomain <p>健康检查域名， 其中：<ur><li>仅适用于HTTP/HTTPS目标组和TCP目标组的HTTP健康检查方式。</li><li>针对HTTP/HTTPS目标组，当使用HTTP健康检查方式时，该参数为必填项。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpCheckDomain(String HttpCheckDomain) {
        this.HttpCheckDomain = HttpCheckDomain;
    }

    /**
     * Get <p>健康检查路径（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpCheckPath <p>健康检查路径（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * Set <p>健康检查路径（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpCheckPath <p>健康检查路径（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * Get <p>健康检查方法（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式），默认值：HEAD，可选值HEAD或GET。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpCheckMethod <p>健康检查方法（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式），默认值：HEAD，可选值HEAD或GET。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpCheckMethod() {
        return this.HttpCheckMethod;
    }

    /**
     * Set <p>健康检查方法（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式），默认值：HEAD，可选值HEAD或GET。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpCheckMethod <p>健康检查方法（仅适用于HTTP/HTTPS转发规则、TCP监听器的HTTP健康检查方式），默认值：HEAD，可选值HEAD或GET。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpCheckMethod(String HttpCheckMethod) {
        this.HttpCheckMethod = HttpCheckMethod;
    }

    /**
     * Get <p>健康检查的输入格式，健康检查方式取CUSTOM时，必填此字段，可取值：HEX或TEXT，其中：<ur><li>TEXT：文本格式。</li><li>HEX：十六进制格式， SendContext和RecvContext的字符只能在0123456789ABCDEF中选取且长度必须是偶数位。</li><li>仅适用于TCP/UDP目标组。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContextType <p>健康检查的输入格式，健康检查方式取CUSTOM时，必填此字段，可取值：HEX或TEXT，其中：<ur><li>TEXT：文本格式。</li><li>HEX：十六进制格式， SendContext和RecvContext的字符只能在0123456789ABCDEF中选取且长度必须是偶数位。</li><li>仅适用于TCP/UDP目标组。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContextType() {
        return this.ContextType;
    }

    /**
     * Set <p>健康检查的输入格式，健康检查方式取CUSTOM时，必填此字段，可取值：HEX或TEXT，其中：<ur><li>TEXT：文本格式。</li><li>HEX：十六进制格式， SendContext和RecvContext的字符只能在0123456789ABCDEF中选取且长度必须是偶数位。</li><li>仅适用于TCP/UDP目标组。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContextType <p>健康检查的输入格式，健康检查方式取CUSTOM时，必填此字段，可取值：HEX或TEXT，其中：<ur><li>TEXT：文本格式。</li><li>HEX：十六进制格式， SendContext和RecvContext的字符只能在0123456789ABCDEF中选取且长度必须是偶数位。</li><li>仅适用于TCP/UDP目标组。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContextType(String ContextType) {
        this.ContextType = ContextType;
    }

    /**
     * Get <p>自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查发送的请求内容，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP目标组）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SendContext <p>自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查发送的请求内容，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP目标组）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSendContext() {
        return this.SendContext;
    }

    /**
     * Set <p>自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查发送的请求内容，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP目标组）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SendContext <p>自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查发送的请求内容，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP目标组）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSendContext(String SendContext) {
        this.SendContext = SendContext;
    }

    /**
     * Get <p>自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查返回的结果，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP目标组）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecvContext <p>自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查返回的结果，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP目标组）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecvContext() {
        return this.RecvContext;
    }

    /**
     * Set <p>自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查返回的结果，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP目标组）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecvContext <p>自定义探测相关参数。健康检查协议CheckType的值取CUSTOM时，必填此字段，代表健康检查返回的结果，只允许ASCII可见字符，最大长度限制500。（仅适用于TCP/UDP目标组）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecvContext(String RecvContext) {
        this.RecvContext = RecvContext;
    }

    /**
     * Get <p>HTTP版本, 其中：<ur><li>健康检查协议CheckType的值取HTTP时，必传此字段。</li><li>支持配置选项：HTTP/1.0, HTTP/1.1。</li><li>仅适用于TCP目标组。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpVersion <p>HTTP版本, 其中：<ur><li>健康检查协议CheckType的值取HTTP时，必传此字段。</li><li>支持配置选项：HTTP/1.0, HTTP/1.1。</li><li>仅适用于TCP目标组。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpVersion() {
        return this.HttpVersion;
    }

    /**
     * Set <p>HTTP版本, 其中：<ur><li>健康检查协议CheckType的值取HTTP时，必传此字段。</li><li>支持配置选项：HTTP/1.0, HTTP/1.1。</li><li>仅适用于TCP目标组。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpVersion <p>HTTP版本, 其中：<ur><li>健康检查协议CheckType的值取HTTP时，必传此字段。</li><li>支持配置选项：HTTP/1.0, HTTP/1.1。</li><li>仅适用于TCP目标组。</li></ur></p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpVersion(String HttpVersion) {
        this.HttpVersion = HttpVersion;
    }

    /**
     * Get <p>GRPC健康检查状态码（仅适用于后端转发协议为GRPC的目标组）。默认值为 12，可输入值为数值、多个数值、或者范围，例如 20 或 20,25 或 0-99。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtendedCode <p>GRPC健康检查状态码（仅适用于后端转发协议为GRPC的目标组）。默认值为 12，可输入值为数值、多个数值、或者范围，例如 20 或 20,25 或 0-99。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtendedCode() {
        return this.ExtendedCode;
    }

    /**
     * Set <p>GRPC健康检查状态码（仅适用于后端转发协议为GRPC的目标组）。默认值为 12，可输入值为数值、多个数值、或者范围，例如 20 或 20,25 或 0-99。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtendedCode <p>GRPC健康检查状态码（仅适用于后端转发协议为GRPC的目标组）。默认值为 12，可输入值为数值、多个数值、或者范围，例如 20 或 20,25 或 0-99。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtendedCode(String ExtendedCode) {
        this.ExtendedCode = ExtendedCode;
    }

    public TargetGroupHealthCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupHealthCheck(TargetGroupHealthCheck source) {
        if (source.HealthSwitch != null) {
            this.HealthSwitch = new Boolean(source.HealthSwitch);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.GapTime != null) {
            this.GapTime = new Long(source.GapTime);
        }
        if (source.GoodLimit != null) {
            this.GoodLimit = new Long(source.GoodLimit);
        }
        if (source.BadLimit != null) {
            this.BadLimit = new Long(source.BadLimit);
        }
        if (source.JumboFrame != null) {
            this.JumboFrame = new Boolean(source.JumboFrame);
        }
        if (source.HttpCode != null) {
            this.HttpCode = new Long(source.HttpCode);
        }
        if (source.HttpCheckDomain != null) {
            this.HttpCheckDomain = new String(source.HttpCheckDomain);
        }
        if (source.HttpCheckPath != null) {
            this.HttpCheckPath = new String(source.HttpCheckPath);
        }
        if (source.HttpCheckMethod != null) {
            this.HttpCheckMethod = new String(source.HttpCheckMethod);
        }
        if (source.ContextType != null) {
            this.ContextType = new String(source.ContextType);
        }
        if (source.SendContext != null) {
            this.SendContext = new String(source.SendContext);
        }
        if (source.RecvContext != null) {
            this.RecvContext = new String(source.RecvContext);
        }
        if (source.HttpVersion != null) {
            this.HttpVersion = new String(source.HttpVersion);
        }
        if (source.ExtendedCode != null) {
            this.ExtendedCode = new String(source.ExtendedCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "GapTime", this.GapTime);
        this.setParamSimple(map, prefix + "GoodLimit", this.GoodLimit);
        this.setParamSimple(map, prefix + "BadLimit", this.BadLimit);
        this.setParamSimple(map, prefix + "JumboFrame", this.JumboFrame);
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamSimple(map, prefix + "HttpCheckDomain", this.HttpCheckDomain);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamSimple(map, prefix + "HttpCheckMethod", this.HttpCheckMethod);
        this.setParamSimple(map, prefix + "ContextType", this.ContextType);
        this.setParamSimple(map, prefix + "SendContext", this.SendContext);
        this.setParamSimple(map, prefix + "RecvContext", this.RecvContext);
        this.setParamSimple(map, prefix + "HttpVersion", this.HttpVersion);
        this.setParamSimple(map, prefix + "ExtendedCode", this.ExtendedCode);

    }
}

