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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateLLMSecAnswerRequest extends AbstractModel {

    /**
    * <p>消息结构体内容</p>
    */
    @SerializedName("Message")
    @Expose
    private SSEClientMessage Message;

    /**
    * <p>消息id，传入 要回答的MsgID ，用于匹配自定义回答模板，最终可得到优化的代答结果</p>
    */
    @SerializedName("MsgID")
    @Expose
    private String MsgID;

    /**
     * Get <p>消息结构体内容</p> 
     * @return Message <p>消息结构体内容</p>
     */
    public SSEClientMessage getMessage() {
        return this.Message;
    }

    /**
     * Set <p>消息结构体内容</p>
     * @param Message <p>消息结构体内容</p>
     */
    public void setMessage(SSEClientMessage Message) {
        this.Message = Message;
    }

    /**
     * Get <p>消息id，传入 要回答的MsgID ，用于匹配自定义回答模板，最终可得到优化的代答结果</p> 
     * @return MsgID <p>消息id，传入 要回答的MsgID ，用于匹配自定义回答模板，最终可得到优化的代答结果</p>
     */
    public String getMsgID() {
        return this.MsgID;
    }

    /**
     * Set <p>消息id，传入 要回答的MsgID ，用于匹配自定义回答模板，最终可得到优化的代答结果</p>
     * @param MsgID <p>消息id，传入 要回答的MsgID ，用于匹配自定义回答模板，最终可得到优化的代答结果</p>
     */
    public void setMsgID(String MsgID) {
        this.MsgID = MsgID;
    }

    public GenerateLLMSecAnswerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateLLMSecAnswerRequest(GenerateLLMSecAnswerRequest source) {
        if (source.Message != null) {
            this.Message = new SSEClientMessage(source.Message);
        }
        if (source.MsgID != null) {
            this.MsgID = new String(source.MsgID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Message.", this.Message);
        this.setParamSimple(map, prefix + "MsgID", this.MsgID);

    }
}

