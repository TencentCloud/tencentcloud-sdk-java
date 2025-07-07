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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionRequest extends AbstractModel {

    /**
    * 对话的目标模型ID。
自行部署的开源大模型聊天：部署的模型服务组ID，形如ms-q7pfr29p。
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 输入对话历史。旧的对话在前，数组中最后一项应该为这次的问题。
    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
    * 仅当模型为自行部署的开源大模型时生效。采样随机值，默认值为0.7，取值范围[0,2]。较高的值(如0.8)将使输出更加随机，而较低的值(如0.2)将使输出更加确定。建议仅修改此参数或TopP，但不建议两者都修改。
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * 仅当模型为自行部署的开源大模型时生效。核采样，默认值为1，取值范围[0,1]。指的是预先设置一个概率界限 p，然后将所有可能生成的token，根据概率大小从高到低排列，依次选取。当这些选取的token的累积概率大于或等于 p 值时停止，然后从已经选取的token中进行采样，生成下一个token。例如top_p为0.1时意味着模型只考虑累积概率为10%的token。建议仅修改此参数或Temperature，不建议两者都修改。
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * 仅当模型为自行部署的开源大模型时生效。默认 512，模型可生成内容的最长 token 数量，最大不能超过模型支持的上下文长度。
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
     * Get 对话的目标模型ID。
自行部署的开源大模型聊天：部署的模型服务组ID，形如ms-q7pfr29p。 
     * @return Model 对话的目标模型ID。
自行部署的开源大模型聊天：部署的模型服务组ID，形如ms-q7pfr29p。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 对话的目标模型ID。
自行部署的开源大模型聊天：部署的模型服务组ID，形如ms-q7pfr29p。
     * @param Model 对话的目标模型ID。
自行部署的开源大模型聊天：部署的模型服务组ID，形如ms-q7pfr29p。
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 输入对话历史。旧的对话在前，数组中最后一项应该为这次的问题。 
     * @return Messages 输入对话历史。旧的对话在前，数组中最后一项应该为这次的问题。
     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set 输入对话历史。旧的对话在前，数组中最后一项应该为这次的问题。
     * @param Messages 输入对话历史。旧的对话在前，数组中最后一项应该为这次的问题。
     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get 仅当模型为自行部署的开源大模型时生效。采样随机值，默认值为0.7，取值范围[0,2]。较高的值(如0.8)将使输出更加随机，而较低的值(如0.2)将使输出更加确定。建议仅修改此参数或TopP，但不建议两者都修改。 
     * @return Temperature 仅当模型为自行部署的开源大模型时生效。采样随机值，默认值为0.7，取值范围[0,2]。较高的值(如0.8)将使输出更加随机，而较低的值(如0.2)将使输出更加确定。建议仅修改此参数或TopP，但不建议两者都修改。
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 仅当模型为自行部署的开源大模型时生效。采样随机值，默认值为0.7，取值范围[0,2]。较高的值(如0.8)将使输出更加随机，而较低的值(如0.2)将使输出更加确定。建议仅修改此参数或TopP，但不建议两者都修改。
     * @param Temperature 仅当模型为自行部署的开源大模型时生效。采样随机值，默认值为0.7，取值范围[0,2]。较高的值(如0.8)将使输出更加随机，而较低的值(如0.2)将使输出更加确定。建议仅修改此参数或TopP，但不建议两者都修改。
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get 仅当模型为自行部署的开源大模型时生效。核采样，默认值为1，取值范围[0,1]。指的是预先设置一个概率界限 p，然后将所有可能生成的token，根据概率大小从高到低排列，依次选取。当这些选取的token的累积概率大于或等于 p 值时停止，然后从已经选取的token中进行采样，生成下一个token。例如top_p为0.1时意味着模型只考虑累积概率为10%的token。建议仅修改此参数或Temperature，不建议两者都修改。 
     * @return TopP 仅当模型为自行部署的开源大模型时生效。核采样，默认值为1，取值范围[0,1]。指的是预先设置一个概率界限 p，然后将所有可能生成的token，根据概率大小从高到低排列，依次选取。当这些选取的token的累积概率大于或等于 p 值时停止，然后从已经选取的token中进行采样，生成下一个token。例如top_p为0.1时意味着模型只考虑累积概率为10%的token。建议仅修改此参数或Temperature，不建议两者都修改。
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set 仅当模型为自行部署的开源大模型时生效。核采样，默认值为1，取值范围[0,1]。指的是预先设置一个概率界限 p，然后将所有可能生成的token，根据概率大小从高到低排列，依次选取。当这些选取的token的累积概率大于或等于 p 值时停止，然后从已经选取的token中进行采样，生成下一个token。例如top_p为0.1时意味着模型只考虑累积概率为10%的token。建议仅修改此参数或Temperature，不建议两者都修改。
     * @param TopP 仅当模型为自行部署的开源大模型时生效。核采样，默认值为1，取值范围[0,1]。指的是预先设置一个概率界限 p，然后将所有可能生成的token，根据概率大小从高到低排列，依次选取。当这些选取的token的累积概率大于或等于 p 值时停止，然后从已经选取的token中进行采样，生成下一个token。例如top_p为0.1时意味着模型只考虑累积概率为10%的token。建议仅修改此参数或Temperature，不建议两者都修改。
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get 仅当模型为自行部署的开源大模型时生效。默认 512，模型可生成内容的最长 token 数量，最大不能超过模型支持的上下文长度。 
     * @return MaxTokens 仅当模型为自行部署的开源大模型时生效。默认 512，模型可生成内容的最长 token 数量，最大不能超过模型支持的上下文长度。
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set 仅当模型为自行部署的开源大模型时生效。默认 512，模型可生成内容的最长 token 数量，最大不能超过模型支持的上下文长度。
     * @param MaxTokens 仅当模型为自行部署的开源大模型时生效。默认 512，模型可生成内容的最长 token 数量，最大不能超过模型支持的上下文长度。
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    public ChatCompletionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatCompletionRequest(ChatCompletionRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Messages != null) {
            this.Messages = new Message[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new Message(source.Messages[i]);
            }
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new Long(source.MaxTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "MaxTokens", this.MaxTokens);

    }
}

