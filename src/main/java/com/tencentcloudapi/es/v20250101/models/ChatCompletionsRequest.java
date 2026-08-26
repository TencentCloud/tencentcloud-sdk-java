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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionsRequest extends AbstractModel {

    /**
    * <p>会话内容，按对话时间从旧到新在数组中排列，长度受模型窗口大小限制。</p>
    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
    * <p>模型名称，可选模型列表：hunyuan-turbo，hunyuan-large，hunyuan-large-longcontext，hunyuan-standard，hunyuan-standard-256K，deepseek-r1，deepseek-v3，deepseek-r1-distill-qwen-32b。</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>是否以流式接口的形式返回数据，默认true。</p>
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * <p>取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果 。</p>
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * <p>取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果 。</p>
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * <p>是否开启联网搜索。默认为 false。</p>
    */
    @SerializedName("OnlineSearch")
    @Expose
    private Boolean OnlineSearch;

    /**
    * <p>当 OnlineSearch 为 true 时，指定的搜索引擎，默认为 bing。</p>
    */
    @SerializedName("OnlineSearchOptions")
    @Expose
    private OnlineSearchOptions OnlineSearchOptions;

    /**
    * <p>可调用的工具列表，当前支持模型：hunyuan-turbo, deepseek-v3。</p>
    */
    @SerializedName("Tools")
    @Expose
    private Tool [] Tools;

    /**
    * <p>工具使用选项，可选值包括 none、auto、custom。说明：1. 仅对 hunyuan-turbo、deepseek-v3 模型生效。2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。3. 未设置时，默认值为auto</p>
    */
    @SerializedName("ToolChoice")
    @Expose
    private String ToolChoice;

    /**
    * <p>强制模型调用指定的工具，当参数ToolChoice为custom时，此参数为必填</p>
    */
    @SerializedName("CustomTool")
    @Expose
    private Tool CustomTool;

    /**
     * Get <p>会话内容，按对话时间从旧到新在数组中排列，长度受模型窗口大小限制。</p> 
     * @return Messages <p>会话内容，按对话时间从旧到新在数组中排列，长度受模型窗口大小限制。</p>
     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set <p>会话内容，按对话时间从旧到新在数组中排列，长度受模型窗口大小限制。</p>
     * @param Messages <p>会话内容，按对话时间从旧到新在数组中排列，长度受模型窗口大小限制。</p>
     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get <p>模型名称，可选模型列表：hunyuan-turbo，hunyuan-large，hunyuan-large-longcontext，hunyuan-standard，hunyuan-standard-256K，deepseek-r1，deepseek-v3，deepseek-r1-distill-qwen-32b。</p> 
     * @return ModelName <p>模型名称，可选模型列表：hunyuan-turbo，hunyuan-large，hunyuan-large-longcontext，hunyuan-standard，hunyuan-standard-256K，deepseek-r1，deepseek-v3，deepseek-r1-distill-qwen-32b。</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名称，可选模型列表：hunyuan-turbo，hunyuan-large，hunyuan-large-longcontext，hunyuan-standard，hunyuan-standard-256K，deepseek-r1，deepseek-v3，deepseek-r1-distill-qwen-32b。</p>
     * @param ModelName <p>模型名称，可选模型列表：hunyuan-turbo，hunyuan-large，hunyuan-large-longcontext，hunyuan-standard，hunyuan-standard-256K，deepseek-r1，deepseek-v3，deepseek-r1-distill-qwen-32b。</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>是否以流式接口的形式返回数据，默认true。</p> 
     * @return Stream <p>是否以流式接口的形式返回数据，默认true。</p>
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set <p>是否以流式接口的形式返回数据，默认true。</p>
     * @param Stream <p>是否以流式接口的形式返回数据，默认true。</p>
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get <p>取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果 。</p> 
     * @return TopP <p>取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果 。</p>
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set <p>取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果 。</p>
     * @param TopP <p>取值区间为[0.0, 1.0], 非必要不建议使用, 不合理的取值会影响效果 。</p>
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get <p>取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果 。</p> 
     * @return Temperature <p>取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果 。</p>
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set <p>取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果 。</p>
     * @param Temperature <p>取值区间为[0.0, 2.0], 非必要不建议使用, 不合理的取值会影响效果 。</p>
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get <p>是否开启联网搜索。默认为 false。</p> 
     * @return OnlineSearch <p>是否开启联网搜索。默认为 false。</p>
     */
    public Boolean getOnlineSearch() {
        return this.OnlineSearch;
    }

    /**
     * Set <p>是否开启联网搜索。默认为 false。</p>
     * @param OnlineSearch <p>是否开启联网搜索。默认为 false。</p>
     */
    public void setOnlineSearch(Boolean OnlineSearch) {
        this.OnlineSearch = OnlineSearch;
    }

    /**
     * Get <p>当 OnlineSearch 为 true 时，指定的搜索引擎，默认为 bing。</p> 
     * @return OnlineSearchOptions <p>当 OnlineSearch 为 true 时，指定的搜索引擎，默认为 bing。</p>
     */
    public OnlineSearchOptions getOnlineSearchOptions() {
        return this.OnlineSearchOptions;
    }

    /**
     * Set <p>当 OnlineSearch 为 true 时，指定的搜索引擎，默认为 bing。</p>
     * @param OnlineSearchOptions <p>当 OnlineSearch 为 true 时，指定的搜索引擎，默认为 bing。</p>
     */
    public void setOnlineSearchOptions(OnlineSearchOptions OnlineSearchOptions) {
        this.OnlineSearchOptions = OnlineSearchOptions;
    }

    /**
     * Get <p>可调用的工具列表，当前支持模型：hunyuan-turbo, deepseek-v3。</p> 
     * @return Tools <p>可调用的工具列表，当前支持模型：hunyuan-turbo, deepseek-v3。</p>
     */
    public Tool [] getTools() {
        return this.Tools;
    }

    /**
     * Set <p>可调用的工具列表，当前支持模型：hunyuan-turbo, deepseek-v3。</p>
     * @param Tools <p>可调用的工具列表，当前支持模型：hunyuan-turbo, deepseek-v3。</p>
     */
    public void setTools(Tool [] Tools) {
        this.Tools = Tools;
    }

    /**
     * Get <p>工具使用选项，可选值包括 none、auto、custom。说明：1. 仅对 hunyuan-turbo、deepseek-v3 模型生效。2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。3. 未设置时，默认值为auto</p> 
     * @return ToolChoice <p>工具使用选项，可选值包括 none、auto、custom。说明：1. 仅对 hunyuan-turbo、deepseek-v3 模型生效。2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。3. 未设置时，默认值为auto</p>
     */
    public String getToolChoice() {
        return this.ToolChoice;
    }

    /**
     * Set <p>工具使用选项，可选值包括 none、auto、custom。说明：1. 仅对 hunyuan-turbo、deepseek-v3 模型生效。2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。3. 未设置时，默认值为auto</p>
     * @param ToolChoice <p>工具使用选项，可选值包括 none、auto、custom。说明：1. 仅对 hunyuan-turbo、deepseek-v3 模型生效。2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。3. 未设置时，默认值为auto</p>
     */
    public void setToolChoice(String ToolChoice) {
        this.ToolChoice = ToolChoice;
    }

    /**
     * Get <p>强制模型调用指定的工具，当参数ToolChoice为custom时，此参数为必填</p> 
     * @return CustomTool <p>强制模型调用指定的工具，当参数ToolChoice为custom时，此参数为必填</p>
     */
    public Tool getCustomTool() {
        return this.CustomTool;
    }

    /**
     * Set <p>强制模型调用指定的工具，当参数ToolChoice为custom时，此参数为必填</p>
     * @param CustomTool <p>强制模型调用指定的工具，当参数ToolChoice为custom时，此参数为必填</p>
     */
    public void setCustomTool(Tool CustomTool) {
        this.CustomTool = CustomTool;
    }

    public ChatCompletionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatCompletionsRequest(ChatCompletionsRequest source) {
        if (source.Messages != null) {
            this.Messages = new Message[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new Message(source.Messages[i]);
            }
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.OnlineSearch != null) {
            this.OnlineSearch = new Boolean(source.OnlineSearch);
        }
        if (source.OnlineSearchOptions != null) {
            this.OnlineSearchOptions = new OnlineSearchOptions(source.OnlineSearchOptions);
        }
        if (source.Tools != null) {
            this.Tools = new Tool[source.Tools.length];
            for (int i = 0; i < source.Tools.length; i++) {
                this.Tools[i] = new Tool(source.Tools[i]);
            }
        }
        if (source.ToolChoice != null) {
            this.ToolChoice = new String(source.ToolChoice);
        }
        if (source.CustomTool != null) {
            this.CustomTool = new Tool(source.CustomTool);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "OnlineSearch", this.OnlineSearch);
        this.setParamObj(map, prefix + "OnlineSearchOptions.", this.OnlineSearchOptions);
        this.setParamArrayObj(map, prefix + "Tools.", this.Tools);
        this.setParamSimple(map, prefix + "ToolChoice", this.ToolChoice);
        this.setParamObj(map, prefix + "CustomTool.", this.CustomTool);

    }
}

