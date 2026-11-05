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

public class DescribeAIGWCustomGuardrailCapabilitiesResult extends AbstractModel {

    /**
    * <p>支持该能力的最低网关版本，当前为 3.9.6</p>
    */
    @SerializedName("MinGatewayVersion")
    @Expose
    private String MinGatewayVersion;

    /**
    * <p>支持绑定的业务资源类型</p>
    */
    @SerializedName("SupportedResourceTypes")
    @Expose
    private String [] SupportedResourceTypes;

    /**
    * <p>当前控制面允许绑定的协议分类，以返回值为准；不表示每种协议变体均可用。目前不开放 Dify、Custom Agent、Legacy SSE MCP。</p>
    */
    @SerializedName("SupportedProtocols")
    @Expose
    private String [] SupportedProtocols;

    /**
    * <p>当前允许配置的审核方向，仅 input（仅输入）和 both（输入加输出）。</p>
    */
    @SerializedName("SupportedDirections")
    @Expose
    private String [] SupportedDirections;

    /**
    * <p>是否支持流式请求与响应审核</p>
    */
    @SerializedName("SupportsStreaming")
    @Expose
    private Boolean SupportsStreaming;

    /**
    * <p>是否支持自定义审核响应字段映射</p>
    */
    @SerializedName("SupportsFieldMapping")
    @Expose
    private Boolean SupportsFieldMapping;

    /**
    * <p>系统默认拦截提示</p>
    */
    @SerializedName("DefaultBlockMessage")
    @Expose
    private String DefaultBlockMessage;

    /**
    * <p>拦截提示最大字符数</p>
    */
    @SerializedName("MaxBlockMessageLength")
    @Expose
    private Long MaxBlockMessageLength;

    /**
    * <p>控制面公布的能力限制/默认值，不是当前请求可修改的配置对象，也不是逐个 DP 实时读取值。窗口大小、并发审核数等未作为策略 API 入参开放。</p>
    */
    @SerializedName("Limits")
    @Expose
    private CustomGuardrailCapabilityLimits Limits;

    /**
     * Get <p>支持该能力的最低网关版本，当前为 3.9.6</p> 
     * @return MinGatewayVersion <p>支持该能力的最低网关版本，当前为 3.9.6</p>
     */
    public String getMinGatewayVersion() {
        return this.MinGatewayVersion;
    }

    /**
     * Set <p>支持该能力的最低网关版本，当前为 3.9.6</p>
     * @param MinGatewayVersion <p>支持该能力的最低网关版本，当前为 3.9.6</p>
     */
    public void setMinGatewayVersion(String MinGatewayVersion) {
        this.MinGatewayVersion = MinGatewayVersion;
    }

    /**
     * Get <p>支持绑定的业务资源类型</p> 
     * @return SupportedResourceTypes <p>支持绑定的业务资源类型</p>
     */
    public String [] getSupportedResourceTypes() {
        return this.SupportedResourceTypes;
    }

    /**
     * Set <p>支持绑定的业务资源类型</p>
     * @param SupportedResourceTypes <p>支持绑定的业务资源类型</p>
     */
    public void setSupportedResourceTypes(String [] SupportedResourceTypes) {
        this.SupportedResourceTypes = SupportedResourceTypes;
    }

    /**
     * Get <p>当前控制面允许绑定的协议分类，以返回值为准；不表示每种协议变体均可用。目前不开放 Dify、Custom Agent、Legacy SSE MCP。</p> 
     * @return SupportedProtocols <p>当前控制面允许绑定的协议分类，以返回值为准；不表示每种协议变体均可用。目前不开放 Dify、Custom Agent、Legacy SSE MCP。</p>
     */
    public String [] getSupportedProtocols() {
        return this.SupportedProtocols;
    }

    /**
     * Set <p>当前控制面允许绑定的协议分类，以返回值为准；不表示每种协议变体均可用。目前不开放 Dify、Custom Agent、Legacy SSE MCP。</p>
     * @param SupportedProtocols <p>当前控制面允许绑定的协议分类，以返回值为准；不表示每种协议变体均可用。目前不开放 Dify、Custom Agent、Legacy SSE MCP。</p>
     */
    public void setSupportedProtocols(String [] SupportedProtocols) {
        this.SupportedProtocols = SupportedProtocols;
    }

    /**
     * Get <p>当前允许配置的审核方向，仅 input（仅输入）和 both（输入加输出）。</p> 
     * @return SupportedDirections <p>当前允许配置的审核方向，仅 input（仅输入）和 both（输入加输出）。</p>
     */
    public String [] getSupportedDirections() {
        return this.SupportedDirections;
    }

    /**
     * Set <p>当前允许配置的审核方向，仅 input（仅输入）和 both（输入加输出）。</p>
     * @param SupportedDirections <p>当前允许配置的审核方向，仅 input（仅输入）和 both（输入加输出）。</p>
     */
    public void setSupportedDirections(String [] SupportedDirections) {
        this.SupportedDirections = SupportedDirections;
    }

    /**
     * Get <p>是否支持流式请求与响应审核</p> 
     * @return SupportsStreaming <p>是否支持流式请求与响应审核</p>
     */
    public Boolean getSupportsStreaming() {
        return this.SupportsStreaming;
    }

    /**
     * Set <p>是否支持流式请求与响应审核</p>
     * @param SupportsStreaming <p>是否支持流式请求与响应审核</p>
     */
    public void setSupportsStreaming(Boolean SupportsStreaming) {
        this.SupportsStreaming = SupportsStreaming;
    }

    /**
     * Get <p>是否支持自定义审核响应字段映射</p> 
     * @return SupportsFieldMapping <p>是否支持自定义审核响应字段映射</p>
     */
    public Boolean getSupportsFieldMapping() {
        return this.SupportsFieldMapping;
    }

    /**
     * Set <p>是否支持自定义审核响应字段映射</p>
     * @param SupportsFieldMapping <p>是否支持自定义审核响应字段映射</p>
     */
    public void setSupportsFieldMapping(Boolean SupportsFieldMapping) {
        this.SupportsFieldMapping = SupportsFieldMapping;
    }

    /**
     * Get <p>系统默认拦截提示</p> 
     * @return DefaultBlockMessage <p>系统默认拦截提示</p>
     */
    public String getDefaultBlockMessage() {
        return this.DefaultBlockMessage;
    }

    /**
     * Set <p>系统默认拦截提示</p>
     * @param DefaultBlockMessage <p>系统默认拦截提示</p>
     */
    public void setDefaultBlockMessage(String DefaultBlockMessage) {
        this.DefaultBlockMessage = DefaultBlockMessage;
    }

    /**
     * Get <p>拦截提示最大字符数</p> 
     * @return MaxBlockMessageLength <p>拦截提示最大字符数</p>
     */
    public Long getMaxBlockMessageLength() {
        return this.MaxBlockMessageLength;
    }

    /**
     * Set <p>拦截提示最大字符数</p>
     * @param MaxBlockMessageLength <p>拦截提示最大字符数</p>
     */
    public void setMaxBlockMessageLength(Long MaxBlockMessageLength) {
        this.MaxBlockMessageLength = MaxBlockMessageLength;
    }

    /**
     * Get <p>控制面公布的能力限制/默认值，不是当前请求可修改的配置对象，也不是逐个 DP 实时读取值。窗口大小、并发审核数等未作为策略 API 入参开放。</p> 
     * @return Limits <p>控制面公布的能力限制/默认值，不是当前请求可修改的配置对象，也不是逐个 DP 实时读取值。窗口大小、并发审核数等未作为策略 API 入参开放。</p>
     */
    public CustomGuardrailCapabilityLimits getLimits() {
        return this.Limits;
    }

    /**
     * Set <p>控制面公布的能力限制/默认值，不是当前请求可修改的配置对象，也不是逐个 DP 实时读取值。窗口大小、并发审核数等未作为策略 API 入参开放。</p>
     * @param Limits <p>控制面公布的能力限制/默认值，不是当前请求可修改的配置对象，也不是逐个 DP 实时读取值。窗口大小、并发审核数等未作为策略 API 入参开放。</p>
     */
    public void setLimits(CustomGuardrailCapabilityLimits Limits) {
        this.Limits = Limits;
    }

    public DescribeAIGWCustomGuardrailCapabilitiesResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIGWCustomGuardrailCapabilitiesResult(DescribeAIGWCustomGuardrailCapabilitiesResult source) {
        if (source.MinGatewayVersion != null) {
            this.MinGatewayVersion = new String(source.MinGatewayVersion);
        }
        if (source.SupportedResourceTypes != null) {
            this.SupportedResourceTypes = new String[source.SupportedResourceTypes.length];
            for (int i = 0; i < source.SupportedResourceTypes.length; i++) {
                this.SupportedResourceTypes[i] = new String(source.SupportedResourceTypes[i]);
            }
        }
        if (source.SupportedProtocols != null) {
            this.SupportedProtocols = new String[source.SupportedProtocols.length];
            for (int i = 0; i < source.SupportedProtocols.length; i++) {
                this.SupportedProtocols[i] = new String(source.SupportedProtocols[i]);
            }
        }
        if (source.SupportedDirections != null) {
            this.SupportedDirections = new String[source.SupportedDirections.length];
            for (int i = 0; i < source.SupportedDirections.length; i++) {
                this.SupportedDirections[i] = new String(source.SupportedDirections[i]);
            }
        }
        if (source.SupportsStreaming != null) {
            this.SupportsStreaming = new Boolean(source.SupportsStreaming);
        }
        if (source.SupportsFieldMapping != null) {
            this.SupportsFieldMapping = new Boolean(source.SupportsFieldMapping);
        }
        if (source.DefaultBlockMessage != null) {
            this.DefaultBlockMessage = new String(source.DefaultBlockMessage);
        }
        if (source.MaxBlockMessageLength != null) {
            this.MaxBlockMessageLength = new Long(source.MaxBlockMessageLength);
        }
        if (source.Limits != null) {
            this.Limits = new CustomGuardrailCapabilityLimits(source.Limits);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinGatewayVersion", this.MinGatewayVersion);
        this.setParamArraySimple(map, prefix + "SupportedResourceTypes.", this.SupportedResourceTypes);
        this.setParamArraySimple(map, prefix + "SupportedProtocols.", this.SupportedProtocols);
        this.setParamArraySimple(map, prefix + "SupportedDirections.", this.SupportedDirections);
        this.setParamSimple(map, prefix + "SupportsStreaming", this.SupportsStreaming);
        this.setParamSimple(map, prefix + "SupportsFieldMapping", this.SupportsFieldMapping);
        this.setParamSimple(map, prefix + "DefaultBlockMessage", this.DefaultBlockMessage);
        this.setParamSimple(map, prefix + "MaxBlockMessageLength", this.MaxBlockMessageLength);
        this.setParamObj(map, prefix + "Limits.", this.Limits);

    }
}

