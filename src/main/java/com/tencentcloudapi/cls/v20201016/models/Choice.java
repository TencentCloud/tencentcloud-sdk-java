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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Choice extends AbstractModel {

    /**
    * <p>结束标志位，可能为 stop、 sensitive或者tool_calls。<br>stop 表示输出正常结束。<br>sensitive 表示安全审核未通过。<br>tool_calls 标识函数调用。</p><p>注意：<br>可能会出现部分内容已输出，但中间某一段响应中的 FinishReason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。</p>
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * <p>增量返回值，流式调用时使用该字段。</p>
    */
    @SerializedName("Delta")
    @Expose
    private Delta Delta;

    /**
    * <p>返回值，非流式调用时使用该字段。</p>
    */
    @SerializedName("Message")
    @Expose
    private Message Message;

    /**
    * <p>索引值，流式调用时使用该字段。</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get <p>结束标志位，可能为 stop、 sensitive或者tool_calls。<br>stop 表示输出正常结束。<br>sensitive 表示安全审核未通过。<br>tool_calls 标识函数调用。</p><p>注意：<br>可能会出现部分内容已输出，但中间某一段响应中的 FinishReason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。</p> 
     * @return FinishReason <p>结束标志位，可能为 stop、 sensitive或者tool_calls。<br>stop 表示输出正常结束。<br>sensitive 表示安全审核未通过。<br>tool_calls 标识函数调用。</p><p>注意：<br>可能会出现部分内容已输出，但中间某一段响应中的 FinishReason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。</p>
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set <p>结束标志位，可能为 stop、 sensitive或者tool_calls。<br>stop 表示输出正常结束。<br>sensitive 表示安全审核未通过。<br>tool_calls 标识函数调用。</p><p>注意：<br>可能会出现部分内容已输出，但中间某一段响应中的 FinishReason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。</p>
     * @param FinishReason <p>结束标志位，可能为 stop、 sensitive或者tool_calls。<br>stop 表示输出正常结束。<br>sensitive 表示安全审核未通过。<br>tool_calls 标识函数调用。</p><p>注意：<br>可能会出现部分内容已输出，但中间某一段响应中的 FinishReason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。</p>
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get <p>增量返回值，流式调用时使用该字段。</p> 
     * @return Delta <p>增量返回值，流式调用时使用该字段。</p>
     */
    public Delta getDelta() {
        return this.Delta;
    }

    /**
     * Set <p>增量返回值，流式调用时使用该字段。</p>
     * @param Delta <p>增量返回值，流式调用时使用该字段。</p>
     */
    public void setDelta(Delta Delta) {
        this.Delta = Delta;
    }

    /**
     * Get <p>返回值，非流式调用时使用该字段。</p> 
     * @return Message <p>返回值，非流式调用时使用该字段。</p>
     */
    public Message getMessage() {
        return this.Message;
    }

    /**
     * Set <p>返回值，非流式调用时使用该字段。</p>
     * @param Message <p>返回值，非流式调用时使用该字段。</p>
     */
    public void setMessage(Message Message) {
        this.Message = Message;
    }

    /**
     * Get <p>索引值，流式调用时使用该字段。</p> 
     * @return Index <p>索引值，流式调用时使用该字段。</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>索引值，流式调用时使用该字段。</p>
     * @param Index <p>索引值，流式调用时使用该字段。</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public Choice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Choice(Choice source) {
        if (source.FinishReason != null) {
            this.FinishReason = new String(source.FinishReason);
        }
        if (source.Delta != null) {
            this.Delta = new Delta(source.Delta);
        }
        if (source.Message != null) {
            this.Message = new Message(source.Message);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinishReason", this.FinishReason);
        this.setParamObj(map, prefix + "Delta.", this.Delta);
        this.setParamObj(map, prefix + "Message.", this.Message);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

