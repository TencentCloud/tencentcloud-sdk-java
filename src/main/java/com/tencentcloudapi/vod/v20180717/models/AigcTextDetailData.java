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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcTextDetailData extends AbstractModel {

    /**
    * <p>请求开始时间(RFC3339)</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * <p>网关层请求 ID</p>
    */
    @SerializedName("ReqId")
    @Expose
    private String ReqId;

    /**
    * <p>后端模型返回的对话 ID</p>
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * <p>返回给客户端的 HTTP 状态码</p>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * <p>模型名</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>脱敏后的 api_key:前 8 位 + ****(长度 ≤ 8 时原样返回)</p>
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * <p>是否流式返回</p>
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * <p>输入 token 数</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>输出 token 数</p>
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * <p>命中 prompt 缓存的 token 数</p>
    */
    @SerializedName("CacheInputTokens")
    @Expose
    private Long CacheInputTokens;

    /**
    * <p>总 token 数</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * <p>生成阶段的tokens/秒</p>
    */
    @SerializedName("TPS")
    @Expose
    private Float TPS;

    /**
    * <p>首字延迟(Time To First Token)</p><p>单位：秒</p>
    */
    @SerializedName("TTFT")
    @Expose
    private Float TTFT;

    /**
    * <p>端到端总耗时</p><p>单位：秒</p>
    */
    @SerializedName("Total")
    @Expose
    private Float Total;

    /**
    * <p>入口协议:completions / responses / anthropic</p>
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
     * Get <p>请求开始时间(RFC3339)</p> 
     * @return Timestamp <p>请求开始时间(RFC3339)</p>
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>请求开始时间(RFC3339)</p>
     * @param Timestamp <p>请求开始时间(RFC3339)</p>
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>网关层请求 ID</p> 
     * @return ReqId <p>网关层请求 ID</p>
     */
    public String getReqId() {
        return this.ReqId;
    }

    /**
     * Set <p>网关层请求 ID</p>
     * @param ReqId <p>网关层请求 ID</p>
     */
    public void setReqId(String ReqId) {
        this.ReqId = ReqId;
    }

    /**
     * Get <p>后端模型返回的对话 ID</p> 
     * @return ChatId <p>后端模型返回的对话 ID</p>
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set <p>后端模型返回的对话 ID</p>
     * @param ChatId <p>后端模型返回的对话 ID</p>
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get <p>返回给客户端的 HTTP 状态码</p> 
     * @return StatusCode <p>返回给客户端的 HTTP 状态码</p>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set <p>返回给客户端的 HTTP 状态码</p>
     * @param StatusCode <p>返回给客户端的 HTTP 状态码</p>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get <p>模型名</p> 
     * @return Model <p>模型名</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名</p>
     * @param Model <p>模型名</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>应用ID</p> 
     * @return SubAppId <p>应用ID</p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param SubAppId <p>应用ID</p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>脱敏后的 api_key:前 8 位 + ****(长度 ≤ 8 时原样返回)</p> 
     * @return ApiKey <p>脱敏后的 api_key:前 8 位 + ****(长度 ≤ 8 时原样返回)</p>
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set <p>脱敏后的 api_key:前 8 位 + ****(长度 ≤ 8 时原样返回)</p>
     * @param ApiKey <p>脱敏后的 api_key:前 8 位 + ****(长度 ≤ 8 时原样返回)</p>
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get <p>是否流式返回</p> 
     * @return Stream <p>是否流式返回</p>
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set <p>是否流式返回</p>
     * @param Stream <p>是否流式返回</p>
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get <p>输入 token 数</p> 
     * @return InputTokens <p>输入 token 数</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>输入 token 数</p>
     * @param InputTokens <p>输入 token 数</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>输出 token 数</p> 
     * @return OutputTokens <p>输出 token 数</p>
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>输出 token 数</p>
     * @param OutputTokens <p>输出 token 数</p>
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>命中 prompt 缓存的 token 数</p> 
     * @return CacheInputTokens <p>命中 prompt 缓存的 token 数</p>
     */
    public Long getCacheInputTokens() {
        return this.CacheInputTokens;
    }

    /**
     * Set <p>命中 prompt 缓存的 token 数</p>
     * @param CacheInputTokens <p>命中 prompt 缓存的 token 数</p>
     */
    public void setCacheInputTokens(Long CacheInputTokens) {
        this.CacheInputTokens = CacheInputTokens;
    }

    /**
     * Get <p>总 token 数</p> 
     * @return TotalTokens <p>总 token 数</p>
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>总 token 数</p>
     * @param TotalTokens <p>总 token 数</p>
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get <p>生成阶段的tokens/秒</p> 
     * @return TPS <p>生成阶段的tokens/秒</p>
     */
    public Float getTPS() {
        return this.TPS;
    }

    /**
     * Set <p>生成阶段的tokens/秒</p>
     * @param TPS <p>生成阶段的tokens/秒</p>
     */
    public void setTPS(Float TPS) {
        this.TPS = TPS;
    }

    /**
     * Get <p>首字延迟(Time To First Token)</p><p>单位：秒</p> 
     * @return TTFT <p>首字延迟(Time To First Token)</p><p>单位：秒</p>
     */
    public Float getTTFT() {
        return this.TTFT;
    }

    /**
     * Set <p>首字延迟(Time To First Token)</p><p>单位：秒</p>
     * @param TTFT <p>首字延迟(Time To First Token)</p><p>单位：秒</p>
     */
    public void setTTFT(Float TTFT) {
        this.TTFT = TTFT;
    }

    /**
     * Get <p>端到端总耗时</p><p>单位：秒</p> 
     * @return Total <p>端到端总耗时</p><p>单位：秒</p>
     */
    public Float getTotal() {
        return this.Total;
    }

    /**
     * Set <p>端到端总耗时</p><p>单位：秒</p>
     * @param Total <p>端到端总耗时</p><p>单位：秒</p>
     */
    public void setTotal(Float Total) {
        this.Total = Total;
    }

    /**
     * Get <p>入口协议:completions / responses / anthropic</p> 
     * @return ApiType <p>入口协议:completions / responses / anthropic</p>
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set <p>入口协议:completions / responses / anthropic</p>
     * @param ApiType <p>入口协议:completions / responses / anthropic</p>
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    public AigcTextDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcTextDetailData(AigcTextDetailData source) {
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.ReqId != null) {
            this.ReqId = new String(source.ReqId);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.CacheInputTokens != null) {
            this.CacheInputTokens = new Long(source.CacheInputTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.TPS != null) {
            this.TPS = new Float(source.TPS);
        }
        if (source.TTFT != null) {
            this.TTFT = new Float(source.TTFT);
        }
        if (source.Total != null) {
            this.Total = new Float(source.Total);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "ReqId", this.ReqId);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "CacheInputTokens", this.CacheInputTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "TPS", this.TPS);
        this.setParamSimple(map, prefix + "TTFT", this.TTFT);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);

    }
}

