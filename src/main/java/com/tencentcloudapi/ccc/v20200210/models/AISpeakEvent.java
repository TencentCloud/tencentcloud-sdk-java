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

public class AISpeakEvent extends AbstractModel {

    /**
    * <p>本次话术是否允许被用户VAD打断</p>
    */
    @SerializedName("CanBeInterrupted")
    @Expose
    private Boolean CanBeInterrupted;

    /**
    * <p>智能体播报的话术文本内容</p>
    */
    @SerializedName("SpokenText")
    @Expose
    private String SpokenText;

    /**
    * <p>智能体发言类型</p><p>枚举值：</p><ul><li>Script： 智能体话术</li><li>KnowledgeBase： 知识库</li><li>LLMFallback： 大模型兜底</li><li>NoResponseTip： 无响应提示</li><li>智能追问： SmartFollowUp</li><li>FAQ： FAQ</li><li>转人工 - 排队等待音： TransferWaitingPrompt</li><li>无响应挂断前放音： PlayNoResponseEndPrompt</li><li>转人工 - 排队前放音： PlayQueuePrompt</li><li>转人工 - 接待前放音： PlayPromptBeforeReception</li><li>转人工 - 排队超时放音： PlayQueueTimeoutPrompt</li><li>转人工 - 转人工失败放音： PlayTransferFailPrompt</li><li>DTMF收号（按键用户输入）： Dtmf</li><li>按键节点 - 播放提示音： PlayDtmfPrompt</li><li>按键节点 - 输入错误提示音： PlayInvalidDtmfPrompt</li><li>按键节点 - 超时提示音： PlayDtmfTimeoutPrompt</li><li>其他类型： Other</li></ul>
    */
    @SerializedName("SpokenType")
    @Expose
    private String SpokenType;

    /**
    * <p>本次响应生成的时延结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatencyMetrics")
    @Expose
    private AICallLatencyMetrics LatencyMetrics;

    /**
     * Get <p>本次话术是否允许被用户VAD打断</p> 
     * @return CanBeInterrupted <p>本次话术是否允许被用户VAD打断</p>
     */
    public Boolean getCanBeInterrupted() {
        return this.CanBeInterrupted;
    }

    /**
     * Set <p>本次话术是否允许被用户VAD打断</p>
     * @param CanBeInterrupted <p>本次话术是否允许被用户VAD打断</p>
     */
    public void setCanBeInterrupted(Boolean CanBeInterrupted) {
        this.CanBeInterrupted = CanBeInterrupted;
    }

    /**
     * Get <p>智能体播报的话术文本内容</p> 
     * @return SpokenText <p>智能体播报的话术文本内容</p>
     */
    public String getSpokenText() {
        return this.SpokenText;
    }

    /**
     * Set <p>智能体播报的话术文本内容</p>
     * @param SpokenText <p>智能体播报的话术文本内容</p>
     */
    public void setSpokenText(String SpokenText) {
        this.SpokenText = SpokenText;
    }

    /**
     * Get <p>智能体发言类型</p><p>枚举值：</p><ul><li>Script： 智能体话术</li><li>KnowledgeBase： 知识库</li><li>LLMFallback： 大模型兜底</li><li>NoResponseTip： 无响应提示</li><li>智能追问： SmartFollowUp</li><li>FAQ： FAQ</li><li>转人工 - 排队等待音： TransferWaitingPrompt</li><li>无响应挂断前放音： PlayNoResponseEndPrompt</li><li>转人工 - 排队前放音： PlayQueuePrompt</li><li>转人工 - 接待前放音： PlayPromptBeforeReception</li><li>转人工 - 排队超时放音： PlayQueueTimeoutPrompt</li><li>转人工 - 转人工失败放音： PlayTransferFailPrompt</li><li>DTMF收号（按键用户输入）： Dtmf</li><li>按键节点 - 播放提示音： PlayDtmfPrompt</li><li>按键节点 - 输入错误提示音： PlayInvalidDtmfPrompt</li><li>按键节点 - 超时提示音： PlayDtmfTimeoutPrompt</li><li>其他类型： Other</li></ul> 
     * @return SpokenType <p>智能体发言类型</p><p>枚举值：</p><ul><li>Script： 智能体话术</li><li>KnowledgeBase： 知识库</li><li>LLMFallback： 大模型兜底</li><li>NoResponseTip： 无响应提示</li><li>智能追问： SmartFollowUp</li><li>FAQ： FAQ</li><li>转人工 - 排队等待音： TransferWaitingPrompt</li><li>无响应挂断前放音： PlayNoResponseEndPrompt</li><li>转人工 - 排队前放音： PlayQueuePrompt</li><li>转人工 - 接待前放音： PlayPromptBeforeReception</li><li>转人工 - 排队超时放音： PlayQueueTimeoutPrompt</li><li>转人工 - 转人工失败放音： PlayTransferFailPrompt</li><li>DTMF收号（按键用户输入）： Dtmf</li><li>按键节点 - 播放提示音： PlayDtmfPrompt</li><li>按键节点 - 输入错误提示音： PlayInvalidDtmfPrompt</li><li>按键节点 - 超时提示音： PlayDtmfTimeoutPrompt</li><li>其他类型： Other</li></ul>
     */
    public String getSpokenType() {
        return this.SpokenType;
    }

    /**
     * Set <p>智能体发言类型</p><p>枚举值：</p><ul><li>Script： 智能体话术</li><li>KnowledgeBase： 知识库</li><li>LLMFallback： 大模型兜底</li><li>NoResponseTip： 无响应提示</li><li>智能追问： SmartFollowUp</li><li>FAQ： FAQ</li><li>转人工 - 排队等待音： TransferWaitingPrompt</li><li>无响应挂断前放音： PlayNoResponseEndPrompt</li><li>转人工 - 排队前放音： PlayQueuePrompt</li><li>转人工 - 接待前放音： PlayPromptBeforeReception</li><li>转人工 - 排队超时放音： PlayQueueTimeoutPrompt</li><li>转人工 - 转人工失败放音： PlayTransferFailPrompt</li><li>DTMF收号（按键用户输入）： Dtmf</li><li>按键节点 - 播放提示音： PlayDtmfPrompt</li><li>按键节点 - 输入错误提示音： PlayInvalidDtmfPrompt</li><li>按键节点 - 超时提示音： PlayDtmfTimeoutPrompt</li><li>其他类型： Other</li></ul>
     * @param SpokenType <p>智能体发言类型</p><p>枚举值：</p><ul><li>Script： 智能体话术</li><li>KnowledgeBase： 知识库</li><li>LLMFallback： 大模型兜底</li><li>NoResponseTip： 无响应提示</li><li>智能追问： SmartFollowUp</li><li>FAQ： FAQ</li><li>转人工 - 排队等待音： TransferWaitingPrompt</li><li>无响应挂断前放音： PlayNoResponseEndPrompt</li><li>转人工 - 排队前放音： PlayQueuePrompt</li><li>转人工 - 接待前放音： PlayPromptBeforeReception</li><li>转人工 - 排队超时放音： PlayQueueTimeoutPrompt</li><li>转人工 - 转人工失败放音： PlayTransferFailPrompt</li><li>DTMF收号（按键用户输入）： Dtmf</li><li>按键节点 - 播放提示音： PlayDtmfPrompt</li><li>按键节点 - 输入错误提示音： PlayInvalidDtmfPrompt</li><li>按键节点 - 超时提示音： PlayDtmfTimeoutPrompt</li><li>其他类型： Other</li></ul>
     */
    public void setSpokenType(String SpokenType) {
        this.SpokenType = SpokenType;
    }

    /**
     * Get <p>本次响应生成的时延结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatencyMetrics <p>本次响应生成的时延结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AICallLatencyMetrics getLatencyMetrics() {
        return this.LatencyMetrics;
    }

    /**
     * Set <p>本次响应生成的时延结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatencyMetrics <p>本次响应生成的时延结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatencyMetrics(AICallLatencyMetrics LatencyMetrics) {
        this.LatencyMetrics = LatencyMetrics;
    }

    public AISpeakEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AISpeakEvent(AISpeakEvent source) {
        if (source.CanBeInterrupted != null) {
            this.CanBeInterrupted = new Boolean(source.CanBeInterrupted);
        }
        if (source.SpokenText != null) {
            this.SpokenText = new String(source.SpokenText);
        }
        if (source.SpokenType != null) {
            this.SpokenType = new String(source.SpokenType);
        }
        if (source.LatencyMetrics != null) {
            this.LatencyMetrics = new AICallLatencyMetrics(source.LatencyMetrics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanBeInterrupted", this.CanBeInterrupted);
        this.setParamSimple(map, prefix + "SpokenText", this.SpokenText);
        this.setParamSimple(map, prefix + "SpokenType", this.SpokenType);
        this.setParamObj(map, prefix + "LatencyMetrics.", this.LatencyMetrics);

    }
}

