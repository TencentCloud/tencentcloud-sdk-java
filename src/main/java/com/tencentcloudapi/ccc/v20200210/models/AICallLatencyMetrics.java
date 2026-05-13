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

public class AICallLatencyMetrics extends AbstractModel {

    /**
    * <p>asr时延（毫秒）</p><p>-1 表示无 asr时延</p>
    */
    @SerializedName("AsrLatency")
    @Expose
    private Long AsrLatency;

    /**
    * <p>llm首token时延(毫秒)</p>
    */
    @SerializedName("LLMFirstTokenLatency")
    @Expose
    private Long LLMFirstTokenLatency;

    /**
    * <p>tts时延（毫秒）</p><p>-1 表示无 tts时延</p>
    */
    @SerializedName("TTSLatency")
    @Expose
    private Long TTSLatency;

    /**
    * <p>总时延</p>
    */
    @SerializedName("TotalLatency")
    @Expose
    private Long TotalLatency;

    /**
     * Get <p>asr时延（毫秒）</p><p>-1 表示无 asr时延</p> 
     * @return AsrLatency <p>asr时延（毫秒）</p><p>-1 表示无 asr时延</p>
     */
    public Long getAsrLatency() {
        return this.AsrLatency;
    }

    /**
     * Set <p>asr时延（毫秒）</p><p>-1 表示无 asr时延</p>
     * @param AsrLatency <p>asr时延（毫秒）</p><p>-1 表示无 asr时延</p>
     */
    public void setAsrLatency(Long AsrLatency) {
        this.AsrLatency = AsrLatency;
    }

    /**
     * Get <p>llm首token时延(毫秒)</p> 
     * @return LLMFirstTokenLatency <p>llm首token时延(毫秒)</p>
     */
    public Long getLLMFirstTokenLatency() {
        return this.LLMFirstTokenLatency;
    }

    /**
     * Set <p>llm首token时延(毫秒)</p>
     * @param LLMFirstTokenLatency <p>llm首token时延(毫秒)</p>
     */
    public void setLLMFirstTokenLatency(Long LLMFirstTokenLatency) {
        this.LLMFirstTokenLatency = LLMFirstTokenLatency;
    }

    /**
     * Get <p>tts时延（毫秒）</p><p>-1 表示无 tts时延</p> 
     * @return TTSLatency <p>tts时延（毫秒）</p><p>-1 表示无 tts时延</p>
     */
    public Long getTTSLatency() {
        return this.TTSLatency;
    }

    /**
     * Set <p>tts时延（毫秒）</p><p>-1 表示无 tts时延</p>
     * @param TTSLatency <p>tts时延（毫秒）</p><p>-1 表示无 tts时延</p>
     */
    public void setTTSLatency(Long TTSLatency) {
        this.TTSLatency = TTSLatency;
    }

    /**
     * Get <p>总时延</p> 
     * @return TotalLatency <p>总时延</p>
     */
    public Long getTotalLatency() {
        return this.TotalLatency;
    }

    /**
     * Set <p>总时延</p>
     * @param TotalLatency <p>总时延</p>
     */
    public void setTotalLatency(Long TotalLatency) {
        this.TotalLatency = TotalLatency;
    }

    public AICallLatencyMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallLatencyMetrics(AICallLatencyMetrics source) {
        if (source.AsrLatency != null) {
            this.AsrLatency = new Long(source.AsrLatency);
        }
        if (source.LLMFirstTokenLatency != null) {
            this.LLMFirstTokenLatency = new Long(source.LLMFirstTokenLatency);
        }
        if (source.TTSLatency != null) {
            this.TTSLatency = new Long(source.TTSLatency);
        }
        if (source.TotalLatency != null) {
            this.TotalLatency = new Long(source.TotalLatency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsrLatency", this.AsrLatency);
        this.setParamSimple(map, prefix + "LLMFirstTokenLatency", this.LLMFirstTokenLatency);
        this.setParamSimple(map, prefix + "TTSLatency", this.TTSLatency);
        this.setParamSimple(map, prefix + "TotalLatency", this.TotalLatency);

    }
}

