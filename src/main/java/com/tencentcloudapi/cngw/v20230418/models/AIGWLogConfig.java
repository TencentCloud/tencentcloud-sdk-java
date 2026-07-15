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

public class AIGWLogConfig extends AbstractModel {

    /**
    * <p>是否开启请求 payload 记录日志</p>
    */
    @SerializedName("EnableRequestLogPayloads")
    @Expose
    private Boolean EnableRequestLogPayloads;

    /**
    * <p>是否开启响应 payload 记录日志</p>
    */
    @SerializedName("EnableResponseLogPayloads")
    @Expose
    private Boolean EnableResponseLogPayloads;

    /**
    * <p>日志记录的请求body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableRequestLogPayloads 为true时必填</p>
    */
    @SerializedName("RequestLogPayloadMaxSize")
    @Expose
    private Long RequestLogPayloadMaxSize;

    /**
    * <p>日志记录的响应body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableResponseLogPayloads 为true时必填</p>
    */
    @SerializedName("ResponseLogPayloadMaxSize")
    @Expose
    private Long ResponseLogPayloadMaxSize;

    /**
    * <p>请求 payload access log 输出模式</p><p>枚举值：</p><ul><li>raw： access log 中 body 记录客户端原始请求</li><li>processed： access log 中 body 记录 AI 网关协议适配、改写、归一化后的 OpenAI-compatible 内容</li></ul>
    */
    @SerializedName("RequestLogPayloadMode")
    @Expose
    private String RequestLogPayloadMode;

    /**
    * <p>上游原始 payload access log 输出模式</p><p>枚举值：</p><ul><li>raw： access log 中 body 记录客户端原始上游响应</li><li>processed： access log 中 body 记录 AI 网关协议适配、改写、归一化后的 OpenAI-compatible 内容</li></ul>
    */
    @SerializedName("ResponseLogPayloadMode")
    @Expose
    private String ResponseLogPayloadMode;

    /**
     * Get <p>是否开启请求 payload 记录日志</p> 
     * @return EnableRequestLogPayloads <p>是否开启请求 payload 记录日志</p>
     */
    public Boolean getEnableRequestLogPayloads() {
        return this.EnableRequestLogPayloads;
    }

    /**
     * Set <p>是否开启请求 payload 记录日志</p>
     * @param EnableRequestLogPayloads <p>是否开启请求 payload 记录日志</p>
     */
    public void setEnableRequestLogPayloads(Boolean EnableRequestLogPayloads) {
        this.EnableRequestLogPayloads = EnableRequestLogPayloads;
    }

    /**
     * Get <p>是否开启响应 payload 记录日志</p> 
     * @return EnableResponseLogPayloads <p>是否开启响应 payload 记录日志</p>
     */
    public Boolean getEnableResponseLogPayloads() {
        return this.EnableResponseLogPayloads;
    }

    /**
     * Set <p>是否开启响应 payload 记录日志</p>
     * @param EnableResponseLogPayloads <p>是否开启响应 payload 记录日志</p>
     */
    public void setEnableResponseLogPayloads(Boolean EnableResponseLogPayloads) {
        this.EnableResponseLogPayloads = EnableResponseLogPayloads;
    }

    /**
     * Get <p>日志记录的请求body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableRequestLogPayloads 为true时必填</p> 
     * @return RequestLogPayloadMaxSize <p>日志记录的请求body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableRequestLogPayloads 为true时必填</p>
     */
    public Long getRequestLogPayloadMaxSize() {
        return this.RequestLogPayloadMaxSize;
    }

    /**
     * Set <p>日志记录的请求body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableRequestLogPayloads 为true时必填</p>
     * @param RequestLogPayloadMaxSize <p>日志记录的请求body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableRequestLogPayloads 为true时必填</p>
     */
    public void setRequestLogPayloadMaxSize(Long RequestLogPayloadMaxSize) {
        this.RequestLogPayloadMaxSize = RequestLogPayloadMaxSize;
    }

    /**
     * Get <p>日志记录的响应body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableResponseLogPayloads 为true时必填</p> 
     * @return ResponseLogPayloadMaxSize <p>日志记录的响应body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableResponseLogPayloads 为true时必填</p>
     */
    public Long getResponseLogPayloadMaxSize() {
        return this.ResponseLogPayloadMaxSize;
    }

    /**
     * Set <p>日志记录的响应body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableResponseLogPayloads 为true时必填</p>
     * @param ResponseLogPayloadMaxSize <p>日志记录的响应body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableResponseLogPayloads 为true时必填</p>
     */
    public void setResponseLogPayloadMaxSize(Long ResponseLogPayloadMaxSize) {
        this.ResponseLogPayloadMaxSize = ResponseLogPayloadMaxSize;
    }

    /**
     * Get <p>请求 payload access log 输出模式</p><p>枚举值：</p><ul><li>raw： access log 中 body 记录客户端原始请求</li><li>processed： access log 中 body 记录 AI 网关协议适配、改写、归一化后的 OpenAI-compatible 内容</li></ul> 
     * @return RequestLogPayloadMode <p>请求 payload access log 输出模式</p><p>枚举值：</p><ul><li>raw： access log 中 body 记录客户端原始请求</li><li>processed： access log 中 body 记录 AI 网关协议适配、改写、归一化后的 OpenAI-compatible 内容</li></ul>
     */
    public String getRequestLogPayloadMode() {
        return this.RequestLogPayloadMode;
    }

    /**
     * Set <p>请求 payload access log 输出模式</p><p>枚举值：</p><ul><li>raw： access log 中 body 记录客户端原始请求</li><li>processed： access log 中 body 记录 AI 网关协议适配、改写、归一化后的 OpenAI-compatible 内容</li></ul>
     * @param RequestLogPayloadMode <p>请求 payload access log 输出模式</p><p>枚举值：</p><ul><li>raw： access log 中 body 记录客户端原始请求</li><li>processed： access log 中 body 记录 AI 网关协议适配、改写、归一化后的 OpenAI-compatible 内容</li></ul>
     */
    public void setRequestLogPayloadMode(String RequestLogPayloadMode) {
        this.RequestLogPayloadMode = RequestLogPayloadMode;
    }

    /**
     * Get <p>上游原始 payload access log 输出模式</p><p>枚举值：</p><ul><li>raw： access log 中 body 记录客户端原始上游响应</li><li>processed： access log 中 body 记录 AI 网关协议适配、改写、归一化后的 OpenAI-compatible 内容</li></ul> 
     * @return ResponseLogPayloadMode <p>上游原始 payload access log 输出模式</p><p>枚举值：</p><ul><li>raw： access log 中 body 记录客户端原始上游响应</li><li>processed： access log 中 body 记录 AI 网关协议适配、改写、归一化后的 OpenAI-compatible 内容</li></ul>
     */
    public String getResponseLogPayloadMode() {
        return this.ResponseLogPayloadMode;
    }

    /**
     * Set <p>上游原始 payload access log 输出模式</p><p>枚举值：</p><ul><li>raw： access log 中 body 记录客户端原始上游响应</li><li>processed： access log 中 body 记录 AI 网关协议适配、改写、归一化后的 OpenAI-compatible 内容</li></ul>
     * @param ResponseLogPayloadMode <p>上游原始 payload access log 输出模式</p><p>枚举值：</p><ul><li>raw： access log 中 body 记录客户端原始上游响应</li><li>processed： access log 中 body 记录 AI 网关协议适配、改写、归一化后的 OpenAI-compatible 内容</li></ul>
     */
    public void setResponseLogPayloadMode(String ResponseLogPayloadMode) {
        this.ResponseLogPayloadMode = ResponseLogPayloadMode;
    }

    public AIGWLogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLogConfig(AIGWLogConfig source) {
        if (source.EnableRequestLogPayloads != null) {
            this.EnableRequestLogPayloads = new Boolean(source.EnableRequestLogPayloads);
        }
        if (source.EnableResponseLogPayloads != null) {
            this.EnableResponseLogPayloads = new Boolean(source.EnableResponseLogPayloads);
        }
        if (source.RequestLogPayloadMaxSize != null) {
            this.RequestLogPayloadMaxSize = new Long(source.RequestLogPayloadMaxSize);
        }
        if (source.ResponseLogPayloadMaxSize != null) {
            this.ResponseLogPayloadMaxSize = new Long(source.ResponseLogPayloadMaxSize);
        }
        if (source.RequestLogPayloadMode != null) {
            this.RequestLogPayloadMode = new String(source.RequestLogPayloadMode);
        }
        if (source.ResponseLogPayloadMode != null) {
            this.ResponseLogPayloadMode = new String(source.ResponseLogPayloadMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableRequestLogPayloads", this.EnableRequestLogPayloads);
        this.setParamSimple(map, prefix + "EnableResponseLogPayloads", this.EnableResponseLogPayloads);
        this.setParamSimple(map, prefix + "RequestLogPayloadMaxSize", this.RequestLogPayloadMaxSize);
        this.setParamSimple(map, prefix + "ResponseLogPayloadMaxSize", this.ResponseLogPayloadMaxSize);
        this.setParamSimple(map, prefix + "RequestLogPayloadMode", this.RequestLogPayloadMode);
        this.setParamSimple(map, prefix + "ResponseLogPayloadMode", this.ResponseLogPayloadMode);

    }
}

