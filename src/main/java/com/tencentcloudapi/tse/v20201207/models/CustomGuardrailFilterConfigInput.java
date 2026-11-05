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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailFilterConfigInput extends AbstractModel {

    /**
    * <p>请求方向的流式筛选：all 全部（创建默认）、streaming 流式、non_streaming 非流式。依据请求的流式意图/协议识别；无法可靠判别时保守保留送审资格，不应依赖该字段实现强隔离。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestStreamMode")
    @Expose
    private String RequestStreamMode;

    /**
    * <p>响应方向的流式筛选：all 全部（创建默认）、streaming 仅流式、non_streaming 仅非流式。开启输出审核并选择 streaming 可用于 SSE 响应审核。此字段不设置窗口大小或分片步长。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseStreamMode")
    @Expose
    private String ResponseStreamMode;

    /**
    * <p>请求送审触发关键词；最多 64 项，每项非空且最长 128 字符。默认 [] 不按关键词过滤；非空时按 KeywordMatchMode 满足条件才送审，不是本地违禁词阻断列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestKeywords")
    @Expose
    private String [] RequestKeywords;

    /**
    * <p>响应送审触发关键词；最多 64 项，每项非空且最长 128 字符。默认 [] 不按关键词过滤。流式审核按增量审核单元执行筛选，不代表等待完整响应后统一判断。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseKeywords")
    @Expose
    private String [] ResponseKeywords;

    /**
    * <p>关键词匹配方式：any 任一关键词命中（创建默认）；all 所有关键词命中。按文本字面子串匹配，不是正则表达式。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeywordMatchMode")
    @Expose
    private String KeywordMatchMode;

    /**
    * <p>关键词匹配是否区分大小写，创建默认 false。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeywordCaseSensitive")
    @Expose
    private Boolean KeywordCaseSensitive;

    /**
    * <p>是否启用送审采样，创建默认 false（不按采样率跳过）。采样与方向、流式、关键词过滤叠加；开启低比例采样会使未抽中的内容不送审。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SamplingEnabled")
    @Expose
    private Boolean SamplingEnabled;

    /**
    * <p>请求送审采样比例，范围 0～1，创建默认 1；SamplingEnabled=true 时使用。0 不抽取，1 全量，0.1 表示 10%，不是填写整数 10。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestSamplingRate")
    @Expose
    private Float RequestSamplingRate;

    /**
    * <p>响应送审采样比例，范围 0～1，创建默认 1；SamplingEnabled=true 时使用。同一请求响应流保持一致的采样选择，不是对每个 SSE 网络 chunk 独立抽样。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseSamplingRate")
    @Expose
    private Float ResponseSamplingRate;

    /**
     * Get <p>请求方向的流式筛选：all 全部（创建默认）、streaming 流式、non_streaming 非流式。依据请求的流式意图/协议识别；无法可靠判别时保守保留送审资格，不应依赖该字段实现强隔离。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestStreamMode <p>请求方向的流式筛选：all 全部（创建默认）、streaming 流式、non_streaming 非流式。依据请求的流式意图/协议识别；无法可靠判别时保守保留送审资格，不应依赖该字段实现强隔离。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestStreamMode() {
        return this.RequestStreamMode;
    }

    /**
     * Set <p>请求方向的流式筛选：all 全部（创建默认）、streaming 流式、non_streaming 非流式。依据请求的流式意图/协议识别；无法可靠判别时保守保留送审资格，不应依赖该字段实现强隔离。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestStreamMode <p>请求方向的流式筛选：all 全部（创建默认）、streaming 流式、non_streaming 非流式。依据请求的流式意图/协议识别；无法可靠判别时保守保留送审资格，不应依赖该字段实现强隔离。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestStreamMode(String RequestStreamMode) {
        this.RequestStreamMode = RequestStreamMode;
    }

    /**
     * Get <p>响应方向的流式筛选：all 全部（创建默认）、streaming 仅流式、non_streaming 仅非流式。开启输出审核并选择 streaming 可用于 SSE 响应审核。此字段不设置窗口大小或分片步长。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseStreamMode <p>响应方向的流式筛选：all 全部（创建默认）、streaming 仅流式、non_streaming 仅非流式。开启输出审核并选择 streaming 可用于 SSE 响应审核。此字段不设置窗口大小或分片步长。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResponseStreamMode() {
        return this.ResponseStreamMode;
    }

    /**
     * Set <p>响应方向的流式筛选：all 全部（创建默认）、streaming 仅流式、non_streaming 仅非流式。开启输出审核并选择 streaming 可用于 SSE 响应审核。此字段不设置窗口大小或分片步长。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseStreamMode <p>响应方向的流式筛选：all 全部（创建默认）、streaming 仅流式、non_streaming 仅非流式。开启输出审核并选择 streaming 可用于 SSE 响应审核。此字段不设置窗口大小或分片步长。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseStreamMode(String ResponseStreamMode) {
        this.ResponseStreamMode = ResponseStreamMode;
    }

    /**
     * Get <p>请求送审触发关键词；最多 64 项，每项非空且最长 128 字符。默认 [] 不按关键词过滤；非空时按 KeywordMatchMode 满足条件才送审，不是本地违禁词阻断列表。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestKeywords <p>请求送审触发关键词；最多 64 项，每项非空且最长 128 字符。默认 [] 不按关键词过滤；非空时按 KeywordMatchMode 满足条件才送审，不是本地违禁词阻断列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRequestKeywords() {
        return this.RequestKeywords;
    }

    /**
     * Set <p>请求送审触发关键词；最多 64 项，每项非空且最长 128 字符。默认 [] 不按关键词过滤；非空时按 KeywordMatchMode 满足条件才送审，不是本地违禁词阻断列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestKeywords <p>请求送审触发关键词；最多 64 项，每项非空且最长 128 字符。默认 [] 不按关键词过滤；非空时按 KeywordMatchMode 满足条件才送审，不是本地违禁词阻断列表。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestKeywords(String [] RequestKeywords) {
        this.RequestKeywords = RequestKeywords;
    }

    /**
     * Get <p>响应送审触发关键词；最多 64 项，每项非空且最长 128 字符。默认 [] 不按关键词过滤。流式审核按增量审核单元执行筛选，不代表等待完整响应后统一判断。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseKeywords <p>响应送审触发关键词；最多 64 项，每项非空且最长 128 字符。默认 [] 不按关键词过滤。流式审核按增量审核单元执行筛选，不代表等待完整响应后统一判断。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getResponseKeywords() {
        return this.ResponseKeywords;
    }

    /**
     * Set <p>响应送审触发关键词；最多 64 项，每项非空且最长 128 字符。默认 [] 不按关键词过滤。流式审核按增量审核单元执行筛选，不代表等待完整响应后统一判断。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseKeywords <p>响应送审触发关键词；最多 64 项，每项非空且最长 128 字符。默认 [] 不按关键词过滤。流式审核按增量审核单元执行筛选，不代表等待完整响应后统一判断。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseKeywords(String [] ResponseKeywords) {
        this.ResponseKeywords = ResponseKeywords;
    }

    /**
     * Get <p>关键词匹配方式：any 任一关键词命中（创建默认）；all 所有关键词命中。按文本字面子串匹配，不是正则表达式。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeywordMatchMode <p>关键词匹配方式：any 任一关键词命中（创建默认）；all 所有关键词命中。按文本字面子串匹配，不是正则表达式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeywordMatchMode() {
        return this.KeywordMatchMode;
    }

    /**
     * Set <p>关键词匹配方式：any 任一关键词命中（创建默认）；all 所有关键词命中。按文本字面子串匹配，不是正则表达式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeywordMatchMode <p>关键词匹配方式：any 任一关键词命中（创建默认）；all 所有关键词命中。按文本字面子串匹配，不是正则表达式。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeywordMatchMode(String KeywordMatchMode) {
        this.KeywordMatchMode = KeywordMatchMode;
    }

    /**
     * Get <p>关键词匹配是否区分大小写，创建默认 false。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeywordCaseSensitive <p>关键词匹配是否区分大小写，创建默认 false。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getKeywordCaseSensitive() {
        return this.KeywordCaseSensitive;
    }

    /**
     * Set <p>关键词匹配是否区分大小写，创建默认 false。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeywordCaseSensitive <p>关键词匹配是否区分大小写，创建默认 false。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeywordCaseSensitive(Boolean KeywordCaseSensitive) {
        this.KeywordCaseSensitive = KeywordCaseSensitive;
    }

    /**
     * Get <p>是否启用送审采样，创建默认 false（不按采样率跳过）。采样与方向、流式、关键词过滤叠加；开启低比例采样会使未抽中的内容不送审。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SamplingEnabled <p>是否启用送审采样，创建默认 false（不按采样率跳过）。采样与方向、流式、关键词过滤叠加；开启低比例采样会使未抽中的内容不送审。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSamplingEnabled() {
        return this.SamplingEnabled;
    }

    /**
     * Set <p>是否启用送审采样，创建默认 false（不按采样率跳过）。采样与方向、流式、关键词过滤叠加；开启低比例采样会使未抽中的内容不送审。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SamplingEnabled <p>是否启用送审采样，创建默认 false（不按采样率跳过）。采样与方向、流式、关键词过滤叠加；开启低比例采样会使未抽中的内容不送审。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSamplingEnabled(Boolean SamplingEnabled) {
        this.SamplingEnabled = SamplingEnabled;
    }

    /**
     * Get <p>请求送审采样比例，范围 0～1，创建默认 1；SamplingEnabled=true 时使用。0 不抽取，1 全量，0.1 表示 10%，不是填写整数 10。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestSamplingRate <p>请求送审采样比例，范围 0～1，创建默认 1；SamplingEnabled=true 时使用。0 不抽取，1 全量，0.1 表示 10%，不是填写整数 10。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRequestSamplingRate() {
        return this.RequestSamplingRate;
    }

    /**
     * Set <p>请求送审采样比例，范围 0～1，创建默认 1；SamplingEnabled=true 时使用。0 不抽取，1 全量，0.1 表示 10%，不是填写整数 10。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestSamplingRate <p>请求送审采样比例，范围 0～1，创建默认 1；SamplingEnabled=true 时使用。0 不抽取，1 全量，0.1 表示 10%，不是填写整数 10。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestSamplingRate(Float RequestSamplingRate) {
        this.RequestSamplingRate = RequestSamplingRate;
    }

    /**
     * Get <p>响应送审采样比例，范围 0～1，创建默认 1；SamplingEnabled=true 时使用。同一请求响应流保持一致的采样选择，不是对每个 SSE 网络 chunk 独立抽样。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResponseSamplingRate <p>响应送审采样比例，范围 0～1，创建默认 1；SamplingEnabled=true 时使用。同一请求响应流保持一致的采样选择，不是对每个 SSE 网络 chunk 独立抽样。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getResponseSamplingRate() {
        return this.ResponseSamplingRate;
    }

    /**
     * Set <p>响应送审采样比例，范围 0～1，创建默认 1；SamplingEnabled=true 时使用。同一请求响应流保持一致的采样选择，不是对每个 SSE 网络 chunk 独立抽样。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseSamplingRate <p>响应送审采样比例，范围 0～1，创建默认 1；SamplingEnabled=true 时使用。同一请求响应流保持一致的采样选择，不是对每个 SSE 网络 chunk 独立抽样。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseSamplingRate(Float ResponseSamplingRate) {
        this.ResponseSamplingRate = ResponseSamplingRate;
    }

    public CustomGuardrailFilterConfigInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailFilterConfigInput(CustomGuardrailFilterConfigInput source) {
        if (source.RequestStreamMode != null) {
            this.RequestStreamMode = new String(source.RequestStreamMode);
        }
        if (source.ResponseStreamMode != null) {
            this.ResponseStreamMode = new String(source.ResponseStreamMode);
        }
        if (source.RequestKeywords != null) {
            this.RequestKeywords = new String[source.RequestKeywords.length];
            for (int i = 0; i < source.RequestKeywords.length; i++) {
                this.RequestKeywords[i] = new String(source.RequestKeywords[i]);
            }
        }
        if (source.ResponseKeywords != null) {
            this.ResponseKeywords = new String[source.ResponseKeywords.length];
            for (int i = 0; i < source.ResponseKeywords.length; i++) {
                this.ResponseKeywords[i] = new String(source.ResponseKeywords[i]);
            }
        }
        if (source.KeywordMatchMode != null) {
            this.KeywordMatchMode = new String(source.KeywordMatchMode);
        }
        if (source.KeywordCaseSensitive != null) {
            this.KeywordCaseSensitive = new Boolean(source.KeywordCaseSensitive);
        }
        if (source.SamplingEnabled != null) {
            this.SamplingEnabled = new Boolean(source.SamplingEnabled);
        }
        if (source.RequestSamplingRate != null) {
            this.RequestSamplingRate = new Float(source.RequestSamplingRate);
        }
        if (source.ResponseSamplingRate != null) {
            this.ResponseSamplingRate = new Float(source.ResponseSamplingRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestStreamMode", this.RequestStreamMode);
        this.setParamSimple(map, prefix + "ResponseStreamMode", this.ResponseStreamMode);
        this.setParamArraySimple(map, prefix + "RequestKeywords.", this.RequestKeywords);
        this.setParamArraySimple(map, prefix + "ResponseKeywords.", this.ResponseKeywords);
        this.setParamSimple(map, prefix + "KeywordMatchMode", this.KeywordMatchMode);
        this.setParamSimple(map, prefix + "KeywordCaseSensitive", this.KeywordCaseSensitive);
        this.setParamSimple(map, prefix + "SamplingEnabled", this.SamplingEnabled);
        this.setParamSimple(map, prefix + "RequestSamplingRate", this.RequestSamplingRate);
        this.setParamSimple(map, prefix + "ResponseSamplingRate", this.ResponseSamplingRate);

    }
}

