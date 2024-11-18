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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunThreadRequest extends AbstractModel {

    /**
    * 会话 ID
    */
    @SerializedName("ThreadID")
    @Expose
    private String ThreadID;

    /**
    * 助手 ID
    */
    @SerializedName("AssistantID")
    @Expose
    private String AssistantID;

    /**
    * 模型名称，可选值包括 hunyuan-lite、hunyuan-standard、hunyuan-standard-256K、hunyuan-pro、 hunyuan-code、 hunyuan-role、 hunyuan-functioncall、 hunyuan-vision、 hunyuan-turbo。各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。注意：不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 附加消息
    */
    @SerializedName("AdditionalMessages")
    @Expose
    private ThreadAdditionalMessage [] AdditionalMessages;

    /**
    * 说明：1. 影响模型输出多样性，模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。2. 取值区间为 [0.0, 2.0]。较高的数值会使输出更加多样化和不可预测，而较低的数值会使其更加集中和确定。
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * 说明：1. 影响输出文本的多样性。模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。2. 取值区间为 [0.0, 1.0]。取值越大，生成文本的多样性越强。
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * 是否流式输出，当前只允许 true
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * 运行过程中可使用的 token 最大数量。
    */
    @SerializedName("MaxPromptTokens")
    @Expose
    private Long MaxPromptTokens;

    /**
    * 运行过程中可使用的完成 token 的最大数量。
    */
    @SerializedName("MaxCompletionTokens")
    @Expose
    private Long MaxCompletionTokens;

    /**
    * 可调用的工具列表，仅对 hunyuan-pro、hunyuan-turbo、hunyuan-functioncall 模型生效。
    */
    @SerializedName("Tools")
    @Expose
    private Tool [] Tools;

    /**
    * 工具使用选项，可选值包括 none、auto、custom。说明：1. 仅对 hunyuan-pro、hunyuan-turbo、hunyuan-functioncall 模型生效。2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。3. 未设置时，默认值为auto
    */
    @SerializedName("ToolChoice")
    @Expose
    private String ToolChoice;

    /**
     * Get 会话 ID 
     * @return ThreadID 会话 ID
     */
    public String getThreadID() {
        return this.ThreadID;
    }

    /**
     * Set 会话 ID
     * @param ThreadID 会话 ID
     */
    public void setThreadID(String ThreadID) {
        this.ThreadID = ThreadID;
    }

    /**
     * Get 助手 ID 
     * @return AssistantID 助手 ID
     */
    public String getAssistantID() {
        return this.AssistantID;
    }

    /**
     * Set 助手 ID
     * @param AssistantID 助手 ID
     */
    public void setAssistantID(String AssistantID) {
        this.AssistantID = AssistantID;
    }

    /**
     * Get 模型名称，可选值包括 hunyuan-lite、hunyuan-standard、hunyuan-standard-256K、hunyuan-pro、 hunyuan-code、 hunyuan-role、 hunyuan-functioncall、 hunyuan-vision、 hunyuan-turbo。各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。注意：不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。 
     * @return Model 模型名称，可选值包括 hunyuan-lite、hunyuan-standard、hunyuan-standard-256K、hunyuan-pro、 hunyuan-code、 hunyuan-role、 hunyuan-functioncall、 hunyuan-vision、 hunyuan-turbo。各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。注意：不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名称，可选值包括 hunyuan-lite、hunyuan-standard、hunyuan-standard-256K、hunyuan-pro、 hunyuan-code、 hunyuan-role、 hunyuan-functioncall、 hunyuan-vision、 hunyuan-turbo。各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。注意：不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
     * @param Model 模型名称，可选值包括 hunyuan-lite、hunyuan-standard、hunyuan-standard-256K、hunyuan-pro、 hunyuan-code、 hunyuan-role、 hunyuan-functioncall、 hunyuan-vision、 hunyuan-turbo。各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。注意：不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 附加消息 
     * @return AdditionalMessages 附加消息
     */
    public ThreadAdditionalMessage [] getAdditionalMessages() {
        return this.AdditionalMessages;
    }

    /**
     * Set 附加消息
     * @param AdditionalMessages 附加消息
     */
    public void setAdditionalMessages(ThreadAdditionalMessage [] AdditionalMessages) {
        this.AdditionalMessages = AdditionalMessages;
    }

    /**
     * Get 说明：1. 影响模型输出多样性，模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。2. 取值区间为 [0.0, 2.0]。较高的数值会使输出更加多样化和不可预测，而较低的数值会使其更加集中和确定。 
     * @return Temperature 说明：1. 影响模型输出多样性，模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。2. 取值区间为 [0.0, 2.0]。较高的数值会使输出更加多样化和不可预测，而较低的数值会使其更加集中和确定。
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 说明：1. 影响模型输出多样性，模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。2. 取值区间为 [0.0, 2.0]。较高的数值会使输出更加多样化和不可预测，而较低的数值会使其更加集中和确定。
     * @param Temperature 说明：1. 影响模型输出多样性，模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。2. 取值区间为 [0.0, 2.0]。较高的数值会使输出更加多样化和不可预测，而较低的数值会使其更加集中和确定。
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get 说明：1. 影响输出文本的多样性。模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。2. 取值区间为 [0.0, 1.0]。取值越大，生成文本的多样性越强。 
     * @return TopP 说明：1. 影响输出文本的多样性。模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。2. 取值区间为 [0.0, 1.0]。取值越大，生成文本的多样性越强。
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set 说明：1. 影响输出文本的多样性。模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。2. 取值区间为 [0.0, 1.0]。取值越大，生成文本的多样性越强。
     * @param TopP 说明：1. 影响输出文本的多样性。模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。2. 取值区间为 [0.0, 1.0]。取值越大，生成文本的多样性越强。
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get 是否流式输出，当前只允许 true 
     * @return Stream 是否流式输出，当前只允许 true
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set 是否流式输出，当前只允许 true
     * @param Stream 是否流式输出，当前只允许 true
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get 运行过程中可使用的 token 最大数量。 
     * @return MaxPromptTokens 运行过程中可使用的 token 最大数量。
     */
    public Long getMaxPromptTokens() {
        return this.MaxPromptTokens;
    }

    /**
     * Set 运行过程中可使用的 token 最大数量。
     * @param MaxPromptTokens 运行过程中可使用的 token 最大数量。
     */
    public void setMaxPromptTokens(Long MaxPromptTokens) {
        this.MaxPromptTokens = MaxPromptTokens;
    }

    /**
     * Get 运行过程中可使用的完成 token 的最大数量。 
     * @return MaxCompletionTokens 运行过程中可使用的完成 token 的最大数量。
     */
    public Long getMaxCompletionTokens() {
        return this.MaxCompletionTokens;
    }

    /**
     * Set 运行过程中可使用的完成 token 的最大数量。
     * @param MaxCompletionTokens 运行过程中可使用的完成 token 的最大数量。
     */
    public void setMaxCompletionTokens(Long MaxCompletionTokens) {
        this.MaxCompletionTokens = MaxCompletionTokens;
    }

    /**
     * Get 可调用的工具列表，仅对 hunyuan-pro、hunyuan-turbo、hunyuan-functioncall 模型生效。 
     * @return Tools 可调用的工具列表，仅对 hunyuan-pro、hunyuan-turbo、hunyuan-functioncall 模型生效。
     */
    public Tool [] getTools() {
        return this.Tools;
    }

    /**
     * Set 可调用的工具列表，仅对 hunyuan-pro、hunyuan-turbo、hunyuan-functioncall 模型生效。
     * @param Tools 可调用的工具列表，仅对 hunyuan-pro、hunyuan-turbo、hunyuan-functioncall 模型生效。
     */
    public void setTools(Tool [] Tools) {
        this.Tools = Tools;
    }

    /**
     * Get 工具使用选项，可选值包括 none、auto、custom。说明：1. 仅对 hunyuan-pro、hunyuan-turbo、hunyuan-functioncall 模型生效。2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。3. 未设置时，默认值为auto 
     * @return ToolChoice 工具使用选项，可选值包括 none、auto、custom。说明：1. 仅对 hunyuan-pro、hunyuan-turbo、hunyuan-functioncall 模型生效。2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。3. 未设置时，默认值为auto
     */
    public String getToolChoice() {
        return this.ToolChoice;
    }

    /**
     * Set 工具使用选项，可选值包括 none、auto、custom。说明：1. 仅对 hunyuan-pro、hunyuan-turbo、hunyuan-functioncall 模型生效。2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。3. 未设置时，默认值为auto
     * @param ToolChoice 工具使用选项，可选值包括 none、auto、custom。说明：1. 仅对 hunyuan-pro、hunyuan-turbo、hunyuan-functioncall 模型生效。2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。3. 未设置时，默认值为auto
     */
    public void setToolChoice(String ToolChoice) {
        this.ToolChoice = ToolChoice;
    }

    public RunThreadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunThreadRequest(RunThreadRequest source) {
        if (source.ThreadID != null) {
            this.ThreadID = new String(source.ThreadID);
        }
        if (source.AssistantID != null) {
            this.AssistantID = new String(source.AssistantID);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.AdditionalMessages != null) {
            this.AdditionalMessages = new ThreadAdditionalMessage[source.AdditionalMessages.length];
            for (int i = 0; i < source.AdditionalMessages.length; i++) {
                this.AdditionalMessages[i] = new ThreadAdditionalMessage(source.AdditionalMessages[i]);
            }
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.MaxPromptTokens != null) {
            this.MaxPromptTokens = new Long(source.MaxPromptTokens);
        }
        if (source.MaxCompletionTokens != null) {
            this.MaxCompletionTokens = new Long(source.MaxCompletionTokens);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThreadID", this.ThreadID);
        this.setParamSimple(map, prefix + "AssistantID", this.AssistantID);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "AdditionalMessages.", this.AdditionalMessages);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "MaxPromptTokens", this.MaxPromptTokens);
        this.setParamSimple(map, prefix + "MaxCompletionTokens", this.MaxCompletionTokens);
        this.setParamArrayObj(map, prefix + "Tools.", this.Tools);
        this.setParamSimple(map, prefix + "ToolChoice", this.ToolChoice);

    }
}

