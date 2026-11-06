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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlVoiceConversationRequest extends AbstractModel {

    /**
    * <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和对话的房间所对应的SdkAppId相同。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>对话任务的唯一Id，在启动对话成功后会返回。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>控制指令。</p><p>枚举值：</p><ul><li>&quot;Interrupt&quot;： 强制打断</li><li>&quot;invokellm&quot;： 文本注入 LLM：向当前对话上下文注入一段文本，触发一轮 LLM 回复。<code>S2S</code>模式不支持该指令</li><li>invoketts： 文本注入TTS：向当前TTS注入文本，触发TTS播报。<code>S2S</code>模式不支持该指令</li></ul>
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * <p>注入LLM的配置，<code>Command=invokellm</code> 时必填</p>
    */
    @SerializedName("InvokeLLM")
    @Expose
    private VoiceConversationInvokeLLM InvokeLLM;

    /**
    * <p>注入TTS的配置，<code>Command=invoketts</code> 时必填</p>
    */
    @SerializedName("InvokeTTS")
    @Expose
    private VoiceConversationInvokeTTS InvokeTTS;

    /**
     * Get <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和对话的房间所对应的SdkAppId相同。</p> 
     * @return SdkAppId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和对话的房间所对应的SdkAppId相同。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和对话的房间所对应的SdkAppId相同。</p>
     * @param SdkAppId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和对话的房间所对应的SdkAppId相同。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>对话任务的唯一Id，在启动对话成功后会返回。</p> 
     * @return TaskId <p>对话任务的唯一Id，在启动对话成功后会返回。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>对话任务的唯一Id，在启动对话成功后会返回。</p>
     * @param TaskId <p>对话任务的唯一Id，在启动对话成功后会返回。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>控制指令。</p><p>枚举值：</p><ul><li>&quot;Interrupt&quot;： 强制打断</li><li>&quot;invokellm&quot;： 文本注入 LLM：向当前对话上下文注入一段文本，触发一轮 LLM 回复。<code>S2S</code>模式不支持该指令</li><li>invoketts： 文本注入TTS：向当前TTS注入文本，触发TTS播报。<code>S2S</code>模式不支持该指令</li></ul> 
     * @return Command <p>控制指令。</p><p>枚举值：</p><ul><li>&quot;Interrupt&quot;： 强制打断</li><li>&quot;invokellm&quot;： 文本注入 LLM：向当前对话上下文注入一段文本，触发一轮 LLM 回复。<code>S2S</code>模式不支持该指令</li><li>invoketts： 文本注入TTS：向当前TTS注入文本，触发TTS播报。<code>S2S</code>模式不支持该指令</li></ul>
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set <p>控制指令。</p><p>枚举值：</p><ul><li>&quot;Interrupt&quot;： 强制打断</li><li>&quot;invokellm&quot;： 文本注入 LLM：向当前对话上下文注入一段文本，触发一轮 LLM 回复。<code>S2S</code>模式不支持该指令</li><li>invoketts： 文本注入TTS：向当前TTS注入文本，触发TTS播报。<code>S2S</code>模式不支持该指令</li></ul>
     * @param Command <p>控制指令。</p><p>枚举值：</p><ul><li>&quot;Interrupt&quot;： 强制打断</li><li>&quot;invokellm&quot;： 文本注入 LLM：向当前对话上下文注入一段文本，触发一轮 LLM 回复。<code>S2S</code>模式不支持该指令</li><li>invoketts： 文本注入TTS：向当前TTS注入文本，触发TTS播报。<code>S2S</code>模式不支持该指令</li></ul>
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get <p>注入LLM的配置，<code>Command=invokellm</code> 时必填</p> 
     * @return InvokeLLM <p>注入LLM的配置，<code>Command=invokellm</code> 时必填</p>
     */
    public VoiceConversationInvokeLLM getInvokeLLM() {
        return this.InvokeLLM;
    }

    /**
     * Set <p>注入LLM的配置，<code>Command=invokellm</code> 时必填</p>
     * @param InvokeLLM <p>注入LLM的配置，<code>Command=invokellm</code> 时必填</p>
     */
    public void setInvokeLLM(VoiceConversationInvokeLLM InvokeLLM) {
        this.InvokeLLM = InvokeLLM;
    }

    /**
     * Get <p>注入TTS的配置，<code>Command=invoketts</code> 时必填</p> 
     * @return InvokeTTS <p>注入TTS的配置，<code>Command=invoketts</code> 时必填</p>
     */
    public VoiceConversationInvokeTTS getInvokeTTS() {
        return this.InvokeTTS;
    }

    /**
     * Set <p>注入TTS的配置，<code>Command=invoketts</code> 时必填</p>
     * @param InvokeTTS <p>注入TTS的配置，<code>Command=invoketts</code> 时必填</p>
     */
    public void setInvokeTTS(VoiceConversationInvokeTTS InvokeTTS) {
        this.InvokeTTS = InvokeTTS;
    }

    public ControlVoiceConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlVoiceConversationRequest(ControlVoiceConversationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.InvokeLLM != null) {
            this.InvokeLLM = new VoiceConversationInvokeLLM(source.InvokeLLM);
        }
        if (source.InvokeTTS != null) {
            this.InvokeTTS = new VoiceConversationInvokeTTS(source.InvokeTTS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamObj(map, prefix + "InvokeLLM.", this.InvokeLLM);
        this.setParamObj(map, prefix + "InvokeTTS.", this.InvokeTTS);

    }
}

