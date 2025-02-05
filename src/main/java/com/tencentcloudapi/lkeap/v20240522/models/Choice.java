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

public class Choice extends AbstractModel {

    /**
    * 结束标志位，可能为 stop、 sensitive或者tool_calls。
stop 表示输出正常结束。
sensitive 只在开启流式输出审核时会出现，表示安全审核未通过。
tool_calls 标识函数调用。
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * 增量返回值，流式调用时使用该字段。
    */
    @SerializedName("Delta")
    @Expose
    private Delta Delta;

    /**
    * 返回值，非流式调用时使用该字段。
    */
    @SerializedName("Message")
    @Expose
    private Message Message;

    /**
    * 索引值，流式调用时使用该字段。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get 结束标志位，可能为 stop、 sensitive或者tool_calls。
stop 表示输出正常结束。
sensitive 只在开启流式输出审核时会出现，表示安全审核未通过。
tool_calls 标识函数调用。 
     * @return FinishReason 结束标志位，可能为 stop、 sensitive或者tool_calls。
stop 表示输出正常结束。
sensitive 只在开启流式输出审核时会出现，表示安全审核未通过。
tool_calls 标识函数调用。
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set 结束标志位，可能为 stop、 sensitive或者tool_calls。
stop 表示输出正常结束。
sensitive 只在开启流式输出审核时会出现，表示安全审核未通过。
tool_calls 标识函数调用。
     * @param FinishReason 结束标志位，可能为 stop、 sensitive或者tool_calls。
stop 表示输出正常结束。
sensitive 只在开启流式输出审核时会出现，表示安全审核未通过。
tool_calls 标识函数调用。
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get 增量返回值，流式调用时使用该字段。 
     * @return Delta 增量返回值，流式调用时使用该字段。
     */
    public Delta getDelta() {
        return this.Delta;
    }

    /**
     * Set 增量返回值，流式调用时使用该字段。
     * @param Delta 增量返回值，流式调用时使用该字段。
     */
    public void setDelta(Delta Delta) {
        this.Delta = Delta;
    }

    /**
     * Get 返回值，非流式调用时使用该字段。 
     * @return Message 返回值，非流式调用时使用该字段。
     */
    public Message getMessage() {
        return this.Message;
    }

    /**
     * Set 返回值，非流式调用时使用该字段。
     * @param Message 返回值，非流式调用时使用该字段。
     */
    public void setMessage(Message Message) {
        this.Message = Message;
    }

    /**
     * Get 索引值，流式调用时使用该字段。 
     * @return Index 索引值，流式调用时使用该字段。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 索引值，流式调用时使用该字段。
     * @param Index 索引值，流式调用时使用该字段。
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

