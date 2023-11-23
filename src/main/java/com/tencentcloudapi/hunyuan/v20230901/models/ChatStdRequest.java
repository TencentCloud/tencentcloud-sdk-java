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

public class ChatStdRequest extends AbstractModel {

    /**
    * 聊天上下文信息。
说明：
1.长度最多为40, 按对话时间从旧到新在数组中排列。
2.Message的Role当前可选值：user、assistant，其中，user和assistant需要交替出现(一问一答)，最后一个为user提问, 且Content不能为空。
3.Messages中Content总长度不超过16000token，超过则会截断最前面的内容，只保留尾部内容。建议不超过4000token。
    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
    * 说明：
1.影响输出文本的多样性，取值越大，生成文本的多样性越强。
2.默认1.0，取值区间为[0.0, 1.0]。
3.非必要不建议使用, 不合理的取值会影响效果。
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * 说明：
1.较高的数值会使输出更加随机，而较低的数值会使其更加集中和确定。
2.默认1.0，取值区间为[0.0，2.0]。
3.非必要不建议使用,不合理的取值会影响效果。
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
     * Get 聊天上下文信息。
说明：
1.长度最多为40, 按对话时间从旧到新在数组中排列。
2.Message的Role当前可选值：user、assistant，其中，user和assistant需要交替出现(一问一答)，最后一个为user提问, 且Content不能为空。
3.Messages中Content总长度不超过16000token，超过则会截断最前面的内容，只保留尾部内容。建议不超过4000token。 
     * @return Messages 聊天上下文信息。
说明：
1.长度最多为40, 按对话时间从旧到新在数组中排列。
2.Message的Role当前可选值：user、assistant，其中，user和assistant需要交替出现(一问一答)，最后一个为user提问, 且Content不能为空。
3.Messages中Content总长度不超过16000token，超过则会截断最前面的内容，只保留尾部内容。建议不超过4000token。
     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set 聊天上下文信息。
说明：
1.长度最多为40, 按对话时间从旧到新在数组中排列。
2.Message的Role当前可选值：user、assistant，其中，user和assistant需要交替出现(一问一答)，最后一个为user提问, 且Content不能为空。
3.Messages中Content总长度不超过16000token，超过则会截断最前面的内容，只保留尾部内容。建议不超过4000token。
     * @param Messages 聊天上下文信息。
说明：
1.长度最多为40, 按对话时间从旧到新在数组中排列。
2.Message的Role当前可选值：user、assistant，其中，user和assistant需要交替出现(一问一答)，最后一个为user提问, 且Content不能为空。
3.Messages中Content总长度不超过16000token，超过则会截断最前面的内容，只保留尾部内容。建议不超过4000token。
     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get 说明：
1.影响输出文本的多样性，取值越大，生成文本的多样性越强。
2.默认1.0，取值区间为[0.0, 1.0]。
3.非必要不建议使用, 不合理的取值会影响效果。 
     * @return TopP 说明：
1.影响输出文本的多样性，取值越大，生成文本的多样性越强。
2.默认1.0，取值区间为[0.0, 1.0]。
3.非必要不建议使用, 不合理的取值会影响效果。
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set 说明：
1.影响输出文本的多样性，取值越大，生成文本的多样性越强。
2.默认1.0，取值区间为[0.0, 1.0]。
3.非必要不建议使用, 不合理的取值会影响效果。
     * @param TopP 说明：
1.影响输出文本的多样性，取值越大，生成文本的多样性越强。
2.默认1.0，取值区间为[0.0, 1.0]。
3.非必要不建议使用, 不合理的取值会影响效果。
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get 说明：
1.较高的数值会使输出更加随机，而较低的数值会使其更加集中和确定。
2.默认1.0，取值区间为[0.0，2.0]。
3.非必要不建议使用,不合理的取值会影响效果。 
     * @return Temperature 说明：
1.较高的数值会使输出更加随机，而较低的数值会使其更加集中和确定。
2.默认1.0，取值区间为[0.0，2.0]。
3.非必要不建议使用,不合理的取值会影响效果。
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 说明：
1.较高的数值会使输出更加随机，而较低的数值会使其更加集中和确定。
2.默认1.0，取值区间为[0.0，2.0]。
3.非必要不建议使用,不合理的取值会影响效果。
     * @param Temperature 说明：
1.较高的数值会使输出更加随机，而较低的数值会使其更加集中和确定。
2.默认1.0，取值区间为[0.0，2.0]。
3.非必要不建议使用,不合理的取值会影响效果。
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    public ChatStdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatStdRequest(ChatStdRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);

    }
}

