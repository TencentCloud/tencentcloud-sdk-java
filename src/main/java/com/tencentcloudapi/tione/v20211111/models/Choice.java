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

public class Choice extends AbstractModel {

    /**
    * 对话结果
    */
    @SerializedName("Message")
    @Expose
    private Message Message;

    /**
    * 结束理由: stop, length, content_filter, null
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * 序号
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get 对话结果 
     * @return Message 对话结果
     */
    public Message getMessage() {
        return this.Message;
    }

    /**
     * Set 对话结果
     * @param Message 对话结果
     */
    public void setMessage(Message Message) {
        this.Message = Message;
    }

    /**
     * Get 结束理由: stop, length, content_filter, null 
     * @return FinishReason 结束理由: stop, length, content_filter, null
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set 结束理由: stop, length, content_filter, null
     * @param FinishReason 结束理由: stop, length, content_filter, null
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get 序号 
     * @return Index 序号
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 序号
     * @param Index 序号
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
        if (source.Message != null) {
            this.Message = new Message(source.Message);
        }
        if (source.FinishReason != null) {
            this.FinishReason = new String(source.FinishReason);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Message.", this.Message);
        this.setParamSimple(map, prefix + "FinishReason", this.FinishReason);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

