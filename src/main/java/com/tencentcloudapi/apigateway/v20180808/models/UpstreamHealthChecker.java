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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpstreamHealthChecker extends AbstractModel{

    /**
    * 标识是否开启主动健康检查。
    */
    @SerializedName("EnableActiveCheck")
    @Expose
    private Boolean EnableActiveCheck;

    /**
    * 标识是否开启被动健康检查。
    */
    @SerializedName("EnablePassiveCheck")
    @Expose
    private Boolean EnablePassiveCheck;

    /**
    * 健康检查时，判断为成功请求的 HTTP 状态码。
    */
    @SerializedName("HealthyHttpStatus")
    @Expose
    private String HealthyHttpStatus;

    /**
    * 健康检查时，判断为失败请求的 HTTP 状态码。
    */
    @SerializedName("UnhealthyHttpStatus")
    @Expose
    private String UnhealthyHttpStatus;

    /**
    * TCP连续错误阈值。0 表示禁用 TCP 检查。取值范围：[0, 254]。
    */
    @SerializedName("TcpFailureThreshold")
    @Expose
    private Long TcpFailureThreshold;

    /**
    * 连续超时阈值。0 表示禁用超时检查。取值范围：[0, 254]。
    */
    @SerializedName("TimeoutThreshold")
    @Expose
    private Long TimeoutThreshold;

    /**
    * HTTP连续错误阈值。0 表示禁用HTTP检查。取值范围：[0, 254]。
    */
    @SerializedName("HttpFailureThreshold")
    @Expose
    private Long HttpFailureThreshold;

    /**
    * 主动健康检查时探测请求的路径。默认为"/"。
    */
    @SerializedName("ActiveCheckHttpPath")
    @Expose
    private String ActiveCheckHttpPath;

    /**
    * 主动健康检查的探测请求超时，单位秒。默认为5秒。
    */
    @SerializedName("ActiveCheckTimeout")
    @Expose
    private Long ActiveCheckTimeout;

    /**
    * 主动健康检查的时间间隔，默认5秒。
    */
    @SerializedName("ActiveCheckInterval")
    @Expose
    private Long ActiveCheckInterval;

    /**
    * 主动健康检查时探测请求的的请求头。
    */
    @SerializedName("ActiveRequestHeader")
    @Expose
    private UpstreamHealthCheckerReqHeaders [] ActiveRequestHeader;

    /**
    * 异常节点的状态自动恢复时间，单位秒。当只开启被动检查的话，必须设置为 > 0 的值，否则被动异常节点将无法恢复。默认30秒。
    */
    @SerializedName("UnhealthyTimeout")
    @Expose
    private Long UnhealthyTimeout;

    /**
     * Get 标识是否开启主动健康检查。 
     * @return EnableActiveCheck 标识是否开启主动健康检查。
     */
    public Boolean getEnableActiveCheck() {
        return this.EnableActiveCheck;
    }

    /**
     * Set 标识是否开启主动健康检查。
     * @param EnableActiveCheck 标识是否开启主动健康检查。
     */
    public void setEnableActiveCheck(Boolean EnableActiveCheck) {
        this.EnableActiveCheck = EnableActiveCheck;
    }

    /**
     * Get 标识是否开启被动健康检查。 
     * @return EnablePassiveCheck 标识是否开启被动健康检查。
     */
    public Boolean getEnablePassiveCheck() {
        return this.EnablePassiveCheck;
    }

    /**
     * Set 标识是否开启被动健康检查。
     * @param EnablePassiveCheck 标识是否开启被动健康检查。
     */
    public void setEnablePassiveCheck(Boolean EnablePassiveCheck) {
        this.EnablePassiveCheck = EnablePassiveCheck;
    }

    /**
     * Get 健康检查时，判断为成功请求的 HTTP 状态码。 
     * @return HealthyHttpStatus 健康检查时，判断为成功请求的 HTTP 状态码。
     */
    public String getHealthyHttpStatus() {
        return this.HealthyHttpStatus;
    }

    /**
     * Set 健康检查时，判断为成功请求的 HTTP 状态码。
     * @param HealthyHttpStatus 健康检查时，判断为成功请求的 HTTP 状态码。
     */
    public void setHealthyHttpStatus(String HealthyHttpStatus) {
        this.HealthyHttpStatus = HealthyHttpStatus;
    }

    /**
     * Get 健康检查时，判断为失败请求的 HTTP 状态码。 
     * @return UnhealthyHttpStatus 健康检查时，判断为失败请求的 HTTP 状态码。
     */
    public String getUnhealthyHttpStatus() {
        return this.UnhealthyHttpStatus;
    }

    /**
     * Set 健康检查时，判断为失败请求的 HTTP 状态码。
     * @param UnhealthyHttpStatus 健康检查时，判断为失败请求的 HTTP 状态码。
     */
    public void setUnhealthyHttpStatus(String UnhealthyHttpStatus) {
        this.UnhealthyHttpStatus = UnhealthyHttpStatus;
    }

    /**
     * Get TCP连续错误阈值。0 表示禁用 TCP 检查。取值范围：[0, 254]。 
     * @return TcpFailureThreshold TCP连续错误阈值。0 表示禁用 TCP 检查。取值范围：[0, 254]。
     */
    public Long getTcpFailureThreshold() {
        return this.TcpFailureThreshold;
    }

    /**
     * Set TCP连续错误阈值。0 表示禁用 TCP 检查。取值范围：[0, 254]。
     * @param TcpFailureThreshold TCP连续错误阈值。0 表示禁用 TCP 检查。取值范围：[0, 254]。
     */
    public void setTcpFailureThreshold(Long TcpFailureThreshold) {
        this.TcpFailureThreshold = TcpFailureThreshold;
    }

    /**
     * Get 连续超时阈值。0 表示禁用超时检查。取值范围：[0, 254]。 
     * @return TimeoutThreshold 连续超时阈值。0 表示禁用超时检查。取值范围：[0, 254]。
     */
    public Long getTimeoutThreshold() {
        return this.TimeoutThreshold;
    }

    /**
     * Set 连续超时阈值。0 表示禁用超时检查。取值范围：[0, 254]。
     * @param TimeoutThreshold 连续超时阈值。0 表示禁用超时检查。取值范围：[0, 254]。
     */
    public void setTimeoutThreshold(Long TimeoutThreshold) {
        this.TimeoutThreshold = TimeoutThreshold;
    }

    /**
     * Get HTTP连续错误阈值。0 表示禁用HTTP检查。取值范围：[0, 254]。 
     * @return HttpFailureThreshold HTTP连续错误阈值。0 表示禁用HTTP检查。取值范围：[0, 254]。
     */
    public Long getHttpFailureThreshold() {
        return this.HttpFailureThreshold;
    }

    /**
     * Set HTTP连续错误阈值。0 表示禁用HTTP检查。取值范围：[0, 254]。
     * @param HttpFailureThreshold HTTP连续错误阈值。0 表示禁用HTTP检查。取值范围：[0, 254]。
     */
    public void setHttpFailureThreshold(Long HttpFailureThreshold) {
        this.HttpFailureThreshold = HttpFailureThreshold;
    }

    /**
     * Get 主动健康检查时探测请求的路径。默认为"/"。 
     * @return ActiveCheckHttpPath 主动健康检查时探测请求的路径。默认为"/"。
     */
    public String getActiveCheckHttpPath() {
        return this.ActiveCheckHttpPath;
    }

    /**
     * Set 主动健康检查时探测请求的路径。默认为"/"。
     * @param ActiveCheckHttpPath 主动健康检查时探测请求的路径。默认为"/"。
     */
    public void setActiveCheckHttpPath(String ActiveCheckHttpPath) {
        this.ActiveCheckHttpPath = ActiveCheckHttpPath;
    }

    /**
     * Get 主动健康检查的探测请求超时，单位秒。默认为5秒。 
     * @return ActiveCheckTimeout 主动健康检查的探测请求超时，单位秒。默认为5秒。
     */
    public Long getActiveCheckTimeout() {
        return this.ActiveCheckTimeout;
    }

    /**
     * Set 主动健康检查的探测请求超时，单位秒。默认为5秒。
     * @param ActiveCheckTimeout 主动健康检查的探测请求超时，单位秒。默认为5秒。
     */
    public void setActiveCheckTimeout(Long ActiveCheckTimeout) {
        this.ActiveCheckTimeout = ActiveCheckTimeout;
    }

    /**
     * Get 主动健康检查的时间间隔，默认5秒。 
     * @return ActiveCheckInterval 主动健康检查的时间间隔，默认5秒。
     */
    public Long getActiveCheckInterval() {
        return this.ActiveCheckInterval;
    }

    /**
     * Set 主动健康检查的时间间隔，默认5秒。
     * @param ActiveCheckInterval 主动健康检查的时间间隔，默认5秒。
     */
    public void setActiveCheckInterval(Long ActiveCheckInterval) {
        this.ActiveCheckInterval = ActiveCheckInterval;
    }

    /**
     * Get 主动健康检查时探测请求的的请求头。 
     * @return ActiveRequestHeader 主动健康检查时探测请求的的请求头。
     */
    public UpstreamHealthCheckerReqHeaders [] getActiveRequestHeader() {
        return this.ActiveRequestHeader;
    }

    /**
     * Set 主动健康检查时探测请求的的请求头。
     * @param ActiveRequestHeader 主动健康检查时探测请求的的请求头。
     */
    public void setActiveRequestHeader(UpstreamHealthCheckerReqHeaders [] ActiveRequestHeader) {
        this.ActiveRequestHeader = ActiveRequestHeader;
    }

    /**
     * Get 异常节点的状态自动恢复时间，单位秒。当只开启被动检查的话，必须设置为 > 0 的值，否则被动异常节点将无法恢复。默认30秒。 
     * @return UnhealthyTimeout 异常节点的状态自动恢复时间，单位秒。当只开启被动检查的话，必须设置为 > 0 的值，否则被动异常节点将无法恢复。默认30秒。
     */
    public Long getUnhealthyTimeout() {
        return this.UnhealthyTimeout;
    }

    /**
     * Set 异常节点的状态自动恢复时间，单位秒。当只开启被动检查的话，必须设置为 > 0 的值，否则被动异常节点将无法恢复。默认30秒。
     * @param UnhealthyTimeout 异常节点的状态自动恢复时间，单位秒。当只开启被动检查的话，必须设置为 > 0 的值，否则被动异常节点将无法恢复。默认30秒。
     */
    public void setUnhealthyTimeout(Long UnhealthyTimeout) {
        this.UnhealthyTimeout = UnhealthyTimeout;
    }

    public UpstreamHealthChecker() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamHealthChecker(UpstreamHealthChecker source) {
        if (source.EnableActiveCheck != null) {
            this.EnableActiveCheck = new Boolean(source.EnableActiveCheck);
        }
        if (source.EnablePassiveCheck != null) {
            this.EnablePassiveCheck = new Boolean(source.EnablePassiveCheck);
        }
        if (source.HealthyHttpStatus != null) {
            this.HealthyHttpStatus = new String(source.HealthyHttpStatus);
        }
        if (source.UnhealthyHttpStatus != null) {
            this.UnhealthyHttpStatus = new String(source.UnhealthyHttpStatus);
        }
        if (source.TcpFailureThreshold != null) {
            this.TcpFailureThreshold = new Long(source.TcpFailureThreshold);
        }
        if (source.TimeoutThreshold != null) {
            this.TimeoutThreshold = new Long(source.TimeoutThreshold);
        }
        if (source.HttpFailureThreshold != null) {
            this.HttpFailureThreshold = new Long(source.HttpFailureThreshold);
        }
        if (source.ActiveCheckHttpPath != null) {
            this.ActiveCheckHttpPath = new String(source.ActiveCheckHttpPath);
        }
        if (source.ActiveCheckTimeout != null) {
            this.ActiveCheckTimeout = new Long(source.ActiveCheckTimeout);
        }
        if (source.ActiveCheckInterval != null) {
            this.ActiveCheckInterval = new Long(source.ActiveCheckInterval);
        }
        if (source.ActiveRequestHeader != null) {
            this.ActiveRequestHeader = new UpstreamHealthCheckerReqHeaders[source.ActiveRequestHeader.length];
            for (int i = 0; i < source.ActiveRequestHeader.length; i++) {
                this.ActiveRequestHeader[i] = new UpstreamHealthCheckerReqHeaders(source.ActiveRequestHeader[i]);
            }
        }
        if (source.UnhealthyTimeout != null) {
            this.UnhealthyTimeout = new Long(source.UnhealthyTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableActiveCheck", this.EnableActiveCheck);
        this.setParamSimple(map, prefix + "EnablePassiveCheck", this.EnablePassiveCheck);
        this.setParamSimple(map, prefix + "HealthyHttpStatus", this.HealthyHttpStatus);
        this.setParamSimple(map, prefix + "UnhealthyHttpStatus", this.UnhealthyHttpStatus);
        this.setParamSimple(map, prefix + "TcpFailureThreshold", this.TcpFailureThreshold);
        this.setParamSimple(map, prefix + "TimeoutThreshold", this.TimeoutThreshold);
        this.setParamSimple(map, prefix + "HttpFailureThreshold", this.HttpFailureThreshold);
        this.setParamSimple(map, prefix + "ActiveCheckHttpPath", this.ActiveCheckHttpPath);
        this.setParamSimple(map, prefix + "ActiveCheckTimeout", this.ActiveCheckTimeout);
        this.setParamSimple(map, prefix + "ActiveCheckInterval", this.ActiveCheckInterval);
        this.setParamArrayObj(map, prefix + "ActiveRequestHeader.", this.ActiveRequestHeader);
        this.setParamSimple(map, prefix + "UnhealthyTimeout", this.UnhealthyTimeout);

    }
}

