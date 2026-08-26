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

public class CreateAIAgentCallRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>AI智能体ID</p>
    */
    @SerializedName("AIAgentId")
    @Expose
    private Long AIAgentId;

    /**
    * <p>被叫号码</p>
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * <p>主叫号码列表</p>
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * <p>提示词变量</p>
    */
    @SerializedName("PromptVariables")
    @Expose
    private Variable [] PromptVariables;

    /**
    * <p>通用变量： <p>提示词变量</p> <p>欢迎语变量</p> <p> 欢迎语延迟播放(秒级)：welcome-message-delay</p>  <p> dify变量</p>  </p><ol><li>dify-inputs-xxx 为dify的inputs变量</li><li>dify-inputs-user 为dify的user值</li><li>dify-inputs-conversation_id 为dify的conversation_id值</li></ol>
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
    * <p>最大振铃时长，达到时长阈值自动挂断。 仅自携号码支持当前参数</p>
    */
    @SerializedName("MaxRingTimeoutSecond")
    @Expose
    private Long MaxRingTimeoutSecond;

    /**
    * <p>智能体并发不足时，排队等待超时时间，单位秒</p><p>取值范围：[0, 5]</p><p>默认值：5</p>
    */
    @SerializedName("AcquireTimeoutSecond")
    @Expose
    private Long AcquireTimeoutSecond;

    /**
     * Get <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p> 
     * @return SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     * @param SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>AI智能体ID</p> 
     * @return AIAgentId <p>AI智能体ID</p>
     */
    public Long getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * Set <p>AI智能体ID</p>
     * @param AIAgentId <p>AI智能体ID</p>
     */
    public void setAIAgentId(Long AIAgentId) {
        this.AIAgentId = AIAgentId;
    }

    /**
     * Get <p>被叫号码</p> 
     * @return Callee <p>被叫号码</p>
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set <p>被叫号码</p>
     * @param Callee <p>被叫号码</p>
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get <p>主叫号码列表</p> 
     * @return Callers <p>主叫号码列表</p>
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set <p>主叫号码列表</p>
     * @param Callers <p>主叫号码列表</p>
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get <p>提示词变量</p> 
     * @return PromptVariables <p>提示词变量</p>
     * @deprecated
     */
    @Deprecated
    public Variable [] getPromptVariables() {
        return this.PromptVariables;
    }

    /**
     * Set <p>提示词变量</p>
     * @param PromptVariables <p>提示词变量</p>
     * @deprecated
     */
    @Deprecated
    public void setPromptVariables(Variable [] PromptVariables) {
        this.PromptVariables = PromptVariables;
    }

    /**
     * Get <p>通用变量： <p>提示词变量</p> <p>欢迎语变量</p> <p> 欢迎语延迟播放(秒级)：welcome-message-delay</p>  <p> dify变量</p>  </p><ol><li>dify-inputs-xxx 为dify的inputs变量</li><li>dify-inputs-user 为dify的user值</li><li>dify-inputs-conversation_id 为dify的conversation_id值</li></ol> 
     * @return Variables <p>通用变量： <p>提示词变量</p> <p>欢迎语变量</p> <p> 欢迎语延迟播放(秒级)：welcome-message-delay</p>  <p> dify变量</p>  </p><ol><li>dify-inputs-xxx 为dify的inputs变量</li><li>dify-inputs-user 为dify的user值</li><li>dify-inputs-conversation_id 为dify的conversation_id值</li></ol>
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * Set <p>通用变量： <p>提示词变量</p> <p>欢迎语变量</p> <p> 欢迎语延迟播放(秒级)：welcome-message-delay</p>  <p> dify变量</p>  </p><ol><li>dify-inputs-xxx 为dify的inputs变量</li><li>dify-inputs-user 为dify的user值</li><li>dify-inputs-conversation_id 为dify的conversation_id值</li></ol>
     * @param Variables <p>通用变量： <p>提示词变量</p> <p>欢迎语变量</p> <p> 欢迎语延迟播放(秒级)：welcome-message-delay</p>  <p> dify变量</p>  </p><ol><li>dify-inputs-xxx 为dify的inputs变量</li><li>dify-inputs-user 为dify的user值</li><li>dify-inputs-conversation_id 为dify的conversation_id值</li></ol>
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    /**
     * Get <p>最大振铃时长，达到时长阈值自动挂断。 仅自携号码支持当前参数</p> 
     * @return MaxRingTimeoutSecond <p>最大振铃时长，达到时长阈值自动挂断。 仅自携号码支持当前参数</p>
     */
    public Long getMaxRingTimeoutSecond() {
        return this.MaxRingTimeoutSecond;
    }

    /**
     * Set <p>最大振铃时长，达到时长阈值自动挂断。 仅自携号码支持当前参数</p>
     * @param MaxRingTimeoutSecond <p>最大振铃时长，达到时长阈值自动挂断。 仅自携号码支持当前参数</p>
     */
    public void setMaxRingTimeoutSecond(Long MaxRingTimeoutSecond) {
        this.MaxRingTimeoutSecond = MaxRingTimeoutSecond;
    }

    /**
     * Get <p>智能体并发不足时，排队等待超时时间，单位秒</p><p>取值范围：[0, 5]</p><p>默认值：5</p> 
     * @return AcquireTimeoutSecond <p>智能体并发不足时，排队等待超时时间，单位秒</p><p>取值范围：[0, 5]</p><p>默认值：5</p>
     */
    public Long getAcquireTimeoutSecond() {
        return this.AcquireTimeoutSecond;
    }

    /**
     * Set <p>智能体并发不足时，排队等待超时时间，单位秒</p><p>取值范围：[0, 5]</p><p>默认值：5</p>
     * @param AcquireTimeoutSecond <p>智能体并发不足时，排队等待超时时间，单位秒</p><p>取值范围：[0, 5]</p><p>默认值：5</p>
     */
    public void setAcquireTimeoutSecond(Long AcquireTimeoutSecond) {
        this.AcquireTimeoutSecond = AcquireTimeoutSecond;
    }

    public CreateAIAgentCallRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIAgentCallRequest(CreateAIAgentCallRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AIAgentId != null) {
            this.AIAgentId = new Long(source.AIAgentId);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.PromptVariables != null) {
            this.PromptVariables = new Variable[source.PromptVariables.length];
            for (int i = 0; i < source.PromptVariables.length; i++) {
                this.PromptVariables[i] = new Variable(source.PromptVariables[i]);
            }
        }
        if (source.Variables != null) {
            this.Variables = new Variable[source.Variables.length];
            for (int i = 0; i < source.Variables.length; i++) {
                this.Variables[i] = new Variable(source.Variables[i]);
            }
        }
        if (source.MaxRingTimeoutSecond != null) {
            this.MaxRingTimeoutSecond = new Long(source.MaxRingTimeoutSecond);
        }
        if (source.AcquireTimeoutSecond != null) {
            this.AcquireTimeoutSecond = new Long(source.AcquireTimeoutSecond);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "AIAgentId", this.AIAgentId);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamArrayObj(map, prefix + "PromptVariables.", this.PromptVariables);
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);
        this.setParamSimple(map, prefix + "MaxRingTimeoutSecond", this.MaxRingTimeoutSecond);
        this.setParamSimple(map, prefix + "AcquireTimeoutSecond", this.AcquireTimeoutSecond);

    }
}

