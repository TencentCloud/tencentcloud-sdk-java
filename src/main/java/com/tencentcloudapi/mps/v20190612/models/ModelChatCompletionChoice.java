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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelChatCompletionChoice extends AbstractModel {

    /**
    * <p>候选回复在候选数组中的索引</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * <p>结束原因</p>
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * <p>模型回复消息体</p>
    */
    @SerializedName("Message")
    @Expose
    private ModelChatResponseMessage Message;

    /**
     * Get <p>候选回复在候选数组中的索引</p> 
     * @return Index <p>候选回复在候选数组中的索引</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>候选回复在候选数组中的索引</p>
     * @param Index <p>候选回复在候选数组中的索引</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get <p>结束原因</p> 
     * @return FinishReason <p>结束原因</p>
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set <p>结束原因</p>
     * @param FinishReason <p>结束原因</p>
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get <p>模型回复消息体</p> 
     * @return Message <p>模型回复消息体</p>
     */
    public ModelChatResponseMessage getMessage() {
        return this.Message;
    }

    /**
     * Set <p>模型回复消息体</p>
     * @param Message <p>模型回复消息体</p>
     */
    public void setMessage(ModelChatResponseMessage Message) {
        this.Message = Message;
    }

    public ModelChatCompletionChoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelChatCompletionChoice(ModelChatCompletionChoice source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.FinishReason != null) {
            this.FinishReason = new String(source.FinishReason);
        }
        if (source.Message != null) {
            this.Message = new ModelChatResponseMessage(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "FinishReason", this.FinishReason);
        this.setParamObj(map, prefix + "Message.", this.Message);

    }
}

