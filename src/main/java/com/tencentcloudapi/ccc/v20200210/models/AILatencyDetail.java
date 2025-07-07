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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AILatencyDetail extends AbstractModel {

    /**
    * 对话ID
    */
    @SerializedName("RoundId")
    @Expose
    private String RoundId;

    /**
    * asr时延（毫秒）
    */
    @SerializedName("ASRLatency")
    @Expose
    private Long ASRLatency;

    /**
    * tts时延（毫秒）
    */
    @SerializedName("TTSLatency")
    @Expose
    private Long TTSLatency;

    /**
    * llm时延（毫秒）
    */
    @SerializedName("LLMLatency")
    @Expose
    private Long LLMLatency;

    /**
    * llm首token时延(毫秒)
    */
    @SerializedName("LLMFirstTokenLatency")
    @Expose
    private Long LLMFirstTokenLatency;

    /**
    * 端到端时延（毫秒）
    */
    @SerializedName("ETELatency")
    @Expose
    private Long ETELatency;

    /**
     * Get 对话ID 
     * @return RoundId 对话ID
     */
    public String getRoundId() {
        return this.RoundId;
    }

    /**
     * Set 对话ID
     * @param RoundId 对话ID
     */
    public void setRoundId(String RoundId) {
        this.RoundId = RoundId;
    }

    /**
     * Get asr时延（毫秒） 
     * @return ASRLatency asr时延（毫秒）
     */
    public Long getASRLatency() {
        return this.ASRLatency;
    }

    /**
     * Set asr时延（毫秒）
     * @param ASRLatency asr时延（毫秒）
     */
    public void setASRLatency(Long ASRLatency) {
        this.ASRLatency = ASRLatency;
    }

    /**
     * Get tts时延（毫秒） 
     * @return TTSLatency tts时延（毫秒）
     */
    public Long getTTSLatency() {
        return this.TTSLatency;
    }

    /**
     * Set tts时延（毫秒）
     * @param TTSLatency tts时延（毫秒）
     */
    public void setTTSLatency(Long TTSLatency) {
        this.TTSLatency = TTSLatency;
    }

    /**
     * Get llm时延（毫秒） 
     * @return LLMLatency llm时延（毫秒）
     */
    public Long getLLMLatency() {
        return this.LLMLatency;
    }

    /**
     * Set llm时延（毫秒）
     * @param LLMLatency llm时延（毫秒）
     */
    public void setLLMLatency(Long LLMLatency) {
        this.LLMLatency = LLMLatency;
    }

    /**
     * Get llm首token时延(毫秒) 
     * @return LLMFirstTokenLatency llm首token时延(毫秒)
     */
    public Long getLLMFirstTokenLatency() {
        return this.LLMFirstTokenLatency;
    }

    /**
     * Set llm首token时延(毫秒)
     * @param LLMFirstTokenLatency llm首token时延(毫秒)
     */
    public void setLLMFirstTokenLatency(Long LLMFirstTokenLatency) {
        this.LLMFirstTokenLatency = LLMFirstTokenLatency;
    }

    /**
     * Get 端到端时延（毫秒） 
     * @return ETELatency 端到端时延（毫秒）
     */
    public Long getETELatency() {
        return this.ETELatency;
    }

    /**
     * Set 端到端时延（毫秒）
     * @param ETELatency 端到端时延（毫秒）
     */
    public void setETELatency(Long ETELatency) {
        this.ETELatency = ETELatency;
    }

    public AILatencyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AILatencyDetail(AILatencyDetail source) {
        if (source.RoundId != null) {
            this.RoundId = new String(source.RoundId);
        }
        if (source.ASRLatency != null) {
            this.ASRLatency = new Long(source.ASRLatency);
        }
        if (source.TTSLatency != null) {
            this.TTSLatency = new Long(source.TTSLatency);
        }
        if (source.LLMLatency != null) {
            this.LLMLatency = new Long(source.LLMLatency);
        }
        if (source.LLMFirstTokenLatency != null) {
            this.LLMFirstTokenLatency = new Long(source.LLMFirstTokenLatency);
        }
        if (source.ETELatency != null) {
            this.ETELatency = new Long(source.ETELatency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoundId", this.RoundId);
        this.setParamSimple(map, prefix + "ASRLatency", this.ASRLatency);
        this.setParamSimple(map, prefix + "TTSLatency", this.TTSLatency);
        this.setParamSimple(map, prefix + "LLMLatency", this.LLMLatency);
        this.setParamSimple(map, prefix + "LLMFirstTokenLatency", this.LLMFirstTokenLatency);
        this.setParamSimple(map, prefix + "ETELatency", this.ETELatency);

    }
}

