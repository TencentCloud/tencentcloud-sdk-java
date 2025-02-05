/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * 会话列表
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
    * 最大生成的token数量
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

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
     * Get 会话列表 
     * @return Messages 会话列表
     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set 会话列表
     * @param Messages 会话列表
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
     * Get 最大生成的token数量 
     * @return MaxTokens 最大生成的token数量
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set 最大生成的token数量
     * @param MaxTokens 最大生成的token数量
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
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

    }
}

