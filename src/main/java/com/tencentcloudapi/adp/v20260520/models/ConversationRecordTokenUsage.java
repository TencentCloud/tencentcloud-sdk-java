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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationRecordTokenUsage extends AbstractModel {

    /**
    * <p>输入 token 总数</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private String InputTokens;

    /**
    * <p>输出 token 总数</p>
    */
    @SerializedName("OutputTokens")
    @Expose
    private String OutputTokens;

    /**
    * <p>消耗 token 总数</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private String TotalTokens;

    /**
    * <p>缓存命中 token 总数</p>
    */
    @SerializedName("CachedTokens")
    @Expose
    private String CachedTokens;

    /**
    * <p>推理 token 总数</p>
    */
    @SerializedName("ReasoningTokens")
    @Expose
    private String ReasoningTokens;

    /**
     * Get <p>输入 token 总数</p> 
     * @return InputTokens <p>输入 token 总数</p>
     */
    public String getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>输入 token 总数</p>
     * @param InputTokens <p>输入 token 总数</p>
     */
    public void setInputTokens(String InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>输出 token 总数</p> 
     * @return OutputTokens <p>输出 token 总数</p>
     */
    public String getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set <p>输出 token 总数</p>
     * @param OutputTokens <p>输出 token 总数</p>
     */
    public void setOutputTokens(String OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get <p>消耗 token 总数</p> 
     * @return TotalTokens <p>消耗 token 总数</p>
     */
    public String getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>消耗 token 总数</p>
     * @param TotalTokens <p>消耗 token 总数</p>
     */
    public void setTotalTokens(String TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get <p>缓存命中 token 总数</p> 
     * @return CachedTokens <p>缓存命中 token 总数</p>
     */
    public String getCachedTokens() {
        return this.CachedTokens;
    }

    /**
     * Set <p>缓存命中 token 总数</p>
     * @param CachedTokens <p>缓存命中 token 总数</p>
     */
    public void setCachedTokens(String CachedTokens) {
        this.CachedTokens = CachedTokens;
    }

    /**
     * Get <p>推理 token 总数</p> 
     * @return ReasoningTokens <p>推理 token 总数</p>
     */
    public String getReasoningTokens() {
        return this.ReasoningTokens;
    }

    /**
     * Set <p>推理 token 总数</p>
     * @param ReasoningTokens <p>推理 token 总数</p>
     */
    public void setReasoningTokens(String ReasoningTokens) {
        this.ReasoningTokens = ReasoningTokens;
    }

    public ConversationRecordTokenUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationRecordTokenUsage(ConversationRecordTokenUsage source) {
        if (source.InputTokens != null) {
            this.InputTokens = new String(source.InputTokens);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new String(source.OutputTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new String(source.TotalTokens);
        }
        if (source.CachedTokens != null) {
            this.CachedTokens = new String(source.CachedTokens);
        }
        if (source.ReasoningTokens != null) {
            this.ReasoningTokens = new String(source.ReasoningTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "CachedTokens", this.CachedTokens);
        this.setParamSimple(map, prefix + "ReasoningTokens", this.ReasoningTokens);

    }
}

