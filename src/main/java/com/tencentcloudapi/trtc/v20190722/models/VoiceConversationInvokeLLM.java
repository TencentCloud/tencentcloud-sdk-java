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

public class VoiceConversationInvokeLLM extends AbstractModel {

    /**
    * <p>注入的内容。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>优先级。如果不处于对话中则将注入的内容送给LLM，否则由优先级决定。</p><p>枚举值：</p><ul><li>0： 高优先级，打断当前对话，并清空等待队列将注入的内容送给LLM。</li><li>1： 中优先级，不会打断当前对话，清空等待队列将注入的内容排队。如果不处于对话中则将注入的内容排队。</li><li>2： 低优先级，丢弃注入的内容。</li></ul><p>默认值：0</p><p>InvokeLLM和InvokeTTS的任务队列是同一队列，最多支持一个Invoke事件排队。</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get <p>注入的内容。</p> 
     * @return Content <p>注入的内容。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>注入的内容。</p>
     * @param Content <p>注入的内容。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>优先级。如果不处于对话中则将注入的内容送给LLM，否则由优先级决定。</p><p>枚举值：</p><ul><li>0： 高优先级，打断当前对话，并清空等待队列将注入的内容送给LLM。</li><li>1： 中优先级，不会打断当前对话，清空等待队列将注入的内容排队。如果不处于对话中则将注入的内容排队。</li><li>2： 低优先级，丢弃注入的内容。</li></ul><p>默认值：0</p><p>InvokeLLM和InvokeTTS的任务队列是同一队列，最多支持一个Invoke事件排队。</p> 
     * @return Priority <p>优先级。如果不处于对话中则将注入的内容送给LLM，否则由优先级决定。</p><p>枚举值：</p><ul><li>0： 高优先级，打断当前对话，并清空等待队列将注入的内容送给LLM。</li><li>1： 中优先级，不会打断当前对话，清空等待队列将注入的内容排队。如果不处于对话中则将注入的内容排队。</li><li>2： 低优先级，丢弃注入的内容。</li></ul><p>默认值：0</p><p>InvokeLLM和InvokeTTS的任务队列是同一队列，最多支持一个Invoke事件排队。</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>优先级。如果不处于对话中则将注入的内容送给LLM，否则由优先级决定。</p><p>枚举值：</p><ul><li>0： 高优先级，打断当前对话，并清空等待队列将注入的内容送给LLM。</li><li>1： 中优先级，不会打断当前对话，清空等待队列将注入的内容排队。如果不处于对话中则将注入的内容排队。</li><li>2： 低优先级，丢弃注入的内容。</li></ul><p>默认值：0</p><p>InvokeLLM和InvokeTTS的任务队列是同一队列，最多支持一个Invoke事件排队。</p>
     * @param Priority <p>优先级。如果不处于对话中则将注入的内容送给LLM，否则由优先级决定。</p><p>枚举值：</p><ul><li>0： 高优先级，打断当前对话，并清空等待队列将注入的内容送给LLM。</li><li>1： 中优先级，不会打断当前对话，清空等待队列将注入的内容排队。如果不处于对话中则将注入的内容排队。</li><li>2： 低优先级，丢弃注入的内容。</li></ul><p>默认值：0</p><p>InvokeLLM和InvokeTTS的任务队列是同一队列，最多支持一个Invoke事件排队。</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public VoiceConversationInvokeLLM() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationInvokeLLM(VoiceConversationInvokeLLM source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

