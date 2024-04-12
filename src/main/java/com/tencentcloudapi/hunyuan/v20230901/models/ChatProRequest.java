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

public class ChatProRequest extends AbstractModel {

    /**
    * 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message 的 Role 当前可选值：system、user、assistant。其中，system 角色是可选的，如果存在，必须位于列表的最开始。此外，user 和 assistant 需交替出现（一问一答），以 user 提问开始和结束，且 Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。
3. Messages 中 Content 总长度不超过 16000 Token，超过则会截断最前面的内容，只保留尾部内容。建议不超过 4000 Token。
    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
    * 说明：
1. 影响输出文本的多样性，取值越大，生成文本的多样性越强。
2. 默认 1.0，取值区间为 [0.0, 1.0]。
3. 非必要不建议使用，不合理的取值会影响效果。
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * 说明：
1. 较高的数值会使输出更加随机，而较低的数值会使其更加集中和确定。
2. 默认 1.0，取值区间为 [0.0，2.0]。
3. 非必要不建议使用，不合理的取值会影响效果。
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * 流式调用开关。
说明：
1. 未传值时默认为流式调用。
2. 流式调用时以 SSE 协议增量返回结果。
3. 非流式调用时接口响应耗时较长，非必要不建议使用。
4. 非流式调用时只返回一次最终结果，调用方式与普通 HTTP 请求无异。
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * 流式输出审核开关。
说明：
1. 当 Stream 字段值为 true 时，该字段有效。
2. 未传值时默认不使用流式输出审核。
3. 如果值为 true，将对输出内容进行分段审核，审核通过的内容流式输出返回。如果出现审核不过，响应中的 finish_reason 值为 sensitive。
4. 如果值为 false，则需要审核完所有输出内容后再返回结果。

注意：
当选择流式输出审核时，可能会出现部分内容已输出，但中间某一段响应中的 finish_reason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。
    */
    @SerializedName("StreamModeration")
    @Expose
    private Boolean StreamModeration;

    /**
     * Get 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message 的 Role 当前可选值：system、user、assistant。其中，system 角色是可选的，如果存在，必须位于列表的最开始。此外，user 和 assistant 需交替出现（一问一答），以 user 提问开始和结束，且 Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。
3. Messages 中 Content 总长度不超过 16000 Token，超过则会截断最前面的内容，只保留尾部内容。建议不超过 4000 Token。 
     * @return Messages 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message 的 Role 当前可选值：system、user、assistant。其中，system 角色是可选的，如果存在，必须位于列表的最开始。此外，user 和 assistant 需交替出现（一问一答），以 user 提问开始和结束，且 Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。
3. Messages 中 Content 总长度不超过 16000 Token，超过则会截断最前面的内容，只保留尾部内容。建议不超过 4000 Token。
     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message 的 Role 当前可选值：system、user、assistant。其中，system 角色是可选的，如果存在，必须位于列表的最开始。此外，user 和 assistant 需交替出现（一问一答），以 user 提问开始和结束，且 Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。
3. Messages 中 Content 总长度不超过 16000 Token，超过则会截断最前面的内容，只保留尾部内容。建议不超过 4000 Token。
     * @param Messages 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message 的 Role 当前可选值：system、user、assistant。其中，system 角色是可选的，如果存在，必须位于列表的最开始。此外，user 和 assistant 需交替出现（一问一答），以 user 提问开始和结束，且 Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。
3. Messages 中 Content 总长度不超过 16000 Token，超过则会截断最前面的内容，只保留尾部内容。建议不超过 4000 Token。
     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get 说明：
1. 影响输出文本的多样性，取值越大，生成文本的多样性越强。
2. 默认 1.0，取值区间为 [0.0, 1.0]。
3. 非必要不建议使用，不合理的取值会影响效果。 
     * @return TopP 说明：
1. 影响输出文本的多样性，取值越大，生成文本的多样性越强。
2. 默认 1.0，取值区间为 [0.0, 1.0]。
3. 非必要不建议使用，不合理的取值会影响效果。
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set 说明：
1. 影响输出文本的多样性，取值越大，生成文本的多样性越强。
2. 默认 1.0，取值区间为 [0.0, 1.0]。
3. 非必要不建议使用，不合理的取值会影响效果。
     * @param TopP 说明：
1. 影响输出文本的多样性，取值越大，生成文本的多样性越强。
2. 默认 1.0，取值区间为 [0.0, 1.0]。
3. 非必要不建议使用，不合理的取值会影响效果。
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get 说明：
1. 较高的数值会使输出更加随机，而较低的数值会使其更加集中和确定。
2. 默认 1.0，取值区间为 [0.0，2.0]。
3. 非必要不建议使用，不合理的取值会影响效果。 
     * @return Temperature 说明：
1. 较高的数值会使输出更加随机，而较低的数值会使其更加集中和确定。
2. 默认 1.0，取值区间为 [0.0，2.0]。
3. 非必要不建议使用，不合理的取值会影响效果。
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 说明：
1. 较高的数值会使输出更加随机，而较低的数值会使其更加集中和确定。
2. 默认 1.0，取值区间为 [0.0，2.0]。
3. 非必要不建议使用，不合理的取值会影响效果。
     * @param Temperature 说明：
1. 较高的数值会使输出更加随机，而较低的数值会使其更加集中和确定。
2. 默认 1.0，取值区间为 [0.0，2.0]。
3. 非必要不建议使用，不合理的取值会影响效果。
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get 流式调用开关。
说明：
1. 未传值时默认为流式调用。
2. 流式调用时以 SSE 协议增量返回结果。
3. 非流式调用时接口响应耗时较长，非必要不建议使用。
4. 非流式调用时只返回一次最终结果，调用方式与普通 HTTP 请求无异。 
     * @return Stream 流式调用开关。
说明：
1. 未传值时默认为流式调用。
2. 流式调用时以 SSE 协议增量返回结果。
3. 非流式调用时接口响应耗时较长，非必要不建议使用。
4. 非流式调用时只返回一次最终结果，调用方式与普通 HTTP 请求无异。
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set 流式调用开关。
说明：
1. 未传值时默认为流式调用。
2. 流式调用时以 SSE 协议增量返回结果。
3. 非流式调用时接口响应耗时较长，非必要不建议使用。
4. 非流式调用时只返回一次最终结果，调用方式与普通 HTTP 请求无异。
     * @param Stream 流式调用开关。
说明：
1. 未传值时默认为流式调用。
2. 流式调用时以 SSE 协议增量返回结果。
3. 非流式调用时接口响应耗时较长，非必要不建议使用。
4. 非流式调用时只返回一次最终结果，调用方式与普通 HTTP 请求无异。
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get 流式输出审核开关。
说明：
1. 当 Stream 字段值为 true 时，该字段有效。
2. 未传值时默认不使用流式输出审核。
3. 如果值为 true，将对输出内容进行分段审核，审核通过的内容流式输出返回。如果出现审核不过，响应中的 finish_reason 值为 sensitive。
4. 如果值为 false，则需要审核完所有输出内容后再返回结果。

注意：
当选择流式输出审核时，可能会出现部分内容已输出，但中间某一段响应中的 finish_reason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。 
     * @return StreamModeration 流式输出审核开关。
说明：
1. 当 Stream 字段值为 true 时，该字段有效。
2. 未传值时默认不使用流式输出审核。
3. 如果值为 true，将对输出内容进行分段审核，审核通过的内容流式输出返回。如果出现审核不过，响应中的 finish_reason 值为 sensitive。
4. 如果值为 false，则需要审核完所有输出内容后再返回结果。

注意：
当选择流式输出审核时，可能会出现部分内容已输出，但中间某一段响应中的 finish_reason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。
     */
    public Boolean getStreamModeration() {
        return this.StreamModeration;
    }

    /**
     * Set 流式输出审核开关。
说明：
1. 当 Stream 字段值为 true 时，该字段有效。
2. 未传值时默认不使用流式输出审核。
3. 如果值为 true，将对输出内容进行分段审核，审核通过的内容流式输出返回。如果出现审核不过，响应中的 finish_reason 值为 sensitive。
4. 如果值为 false，则需要审核完所有输出内容后再返回结果。

注意：
当选择流式输出审核时，可能会出现部分内容已输出，但中间某一段响应中的 finish_reason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。
     * @param StreamModeration 流式输出审核开关。
说明：
1. 当 Stream 字段值为 true 时，该字段有效。
2. 未传值时默认不使用流式输出审核。
3. 如果值为 true，将对输出内容进行分段审核，审核通过的内容流式输出返回。如果出现审核不过，响应中的 finish_reason 值为 sensitive。
4. 如果值为 false，则需要审核完所有输出内容后再返回结果。

注意：
当选择流式输出审核时，可能会出现部分内容已输出，但中间某一段响应中的 finish_reason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。
     */
    public void setStreamModeration(Boolean StreamModeration) {
        this.StreamModeration = StreamModeration;
    }

    public ChatProRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatProRequest(ChatProRequest source) {
        if (source.Messages != null) {
            this.Messages = new Message[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new Message(source.Messages[i]);
            }
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.StreamModeration != null) {
            this.StreamModeration = new Boolean(source.StreamModeration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "StreamModeration", this.StreamModeration);

    }
}

