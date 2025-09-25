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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionsRequest extends AbstractModel {

    /**
    * 模型名称
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message.Role 可选值：system、user、assistant。
其中，system 角色可选，如存在则必须位于列表的最开始。user 和 assistant 需交替出现，以 user 提问开始，user 提问结束，Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。

    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
    * 是否流式输出
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * 控制生成的随机性，较高的值会产生更多样化的输出。
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * 模型最大输出长度（单位 token），不包含思维链内容。
默认为4096，取值范围：各个模型不同，参考各个模型最大输出长度（示例：4k，即4096）。
输出 token 的总长度受模型的上下文长度限制。
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
    * 是否启用联网搜索
    */
    @SerializedName("EnableSearch")
    @Expose
    private Boolean EnableSearch;

    /**
    * 思维链开关，本参数仅在deepseek v3.1时生效
    */
    @SerializedName("Thinking")
    @Expose
    private Thinking Thinking;

    /**
     * Get 模型名称 
     * @return Model 模型名称
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名称
     * @param Model 模型名称
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message.Role 可选值：system、user、assistant。
其中，system 角色可选，如存在则必须位于列表的最开始。user 和 assistant 需交替出现，以 user 提问开始，user 提问结束，Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。
 
     * @return Messages 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message.Role 可选值：system、user、assistant。
其中，system 角色可选，如存在则必须位于列表的最开始。user 和 assistant 需交替出现，以 user 提问开始，user 提问结束，Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。

     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message.Role 可选值：system、user、assistant。
其中，system 角色可选，如存在则必须位于列表的最开始。user 和 assistant 需交替出现，以 user 提问开始，user 提问结束，Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。

     * @param Messages 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message.Role 可选值：system、user、assistant。
其中，system 角色可选，如存在则必须位于列表的最开始。user 和 assistant 需交替出现，以 user 提问开始，user 提问结束，Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。

     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get 是否流式输出 
     * @return Stream 是否流式输出
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set 是否流式输出
     * @param Stream 是否流式输出
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get 控制生成的随机性，较高的值会产生更多样化的输出。 
     * @return Temperature 控制生成的随机性，较高的值会产生更多样化的输出。
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 控制生成的随机性，较高的值会产生更多样化的输出。
     * @param Temperature 控制生成的随机性，较高的值会产生更多样化的输出。
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get 模型最大输出长度（单位 token），不包含思维链内容。
默认为4096，取值范围：各个模型不同，参考各个模型最大输出长度（示例：4k，即4096）。
输出 token 的总长度受模型的上下文长度限制。 
     * @return MaxTokens 模型最大输出长度（单位 token），不包含思维链内容。
默认为4096，取值范围：各个模型不同，参考各个模型最大输出长度（示例：4k，即4096）。
输出 token 的总长度受模型的上下文长度限制。
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set 模型最大输出长度（单位 token），不包含思维链内容。
默认为4096，取值范围：各个模型不同，参考各个模型最大输出长度（示例：4k，即4096）。
输出 token 的总长度受模型的上下文长度限制。
     * @param MaxTokens 模型最大输出长度（单位 token），不包含思维链内容。
默认为4096，取值范围：各个模型不同，参考各个模型最大输出长度（示例：4k，即4096）。
输出 token 的总长度受模型的上下文长度限制。
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get 是否启用联网搜索 
     * @return EnableSearch 是否启用联网搜索
     */
    public Boolean getEnableSearch() {
        return this.EnableSearch;
    }

    /**
     * Set 是否启用联网搜索
     * @param EnableSearch 是否启用联网搜索
     */
    public void setEnableSearch(Boolean EnableSearch) {
        this.EnableSearch = EnableSearch;
    }

    /**
     * Get 思维链开关，本参数仅在deepseek v3.1时生效 
     * @return Thinking 思维链开关，本参数仅在deepseek v3.1时生效
     */
    public Thinking getThinking() {
        return this.Thinking;
    }

    /**
     * Set 思维链开关，本参数仅在deepseek v3.1时生效
     * @param Thinking 思维链开关，本参数仅在deepseek v3.1时生效
     */
    public void setThinking(Thinking Thinking) {
        this.Thinking = Thinking;
    }

    public ChatCompletionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatCompletionsRequest(ChatCompletionsRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Messages != null) {
            this.Messages = new Message[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new Message(source.Messages[i]);
            }
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new Long(source.MaxTokens);
        }
        if (source.EnableSearch != null) {
            this.EnableSearch = new Boolean(source.EnableSearch);
        }
        if (source.Thinking != null) {
            this.Thinking = new Thinking(source.Thinking);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "MaxTokens", this.MaxTokens);
        this.setParamSimple(map, prefix + "EnableSearch", this.EnableSearch);
        this.setParamObj(map, prefix + "Thinking.", this.Thinking);

    }
}

