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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatBotResponse extends AbstractModel{

    /**
    * 对于当前输出回复的自信度
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 闲聊回复
    */
    @SerializedName("Reply")
    @Expose
    private String Reply;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 对于当前输出回复的自信度 
     * @return Confidence 对于当前输出回复的自信度
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 对于当前输出回复的自信度
     * @param Confidence 对于当前输出回复的自信度
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 闲聊回复 
     * @return Reply 闲聊回复
     */
    public String getReply() {
        return this.Reply;
    }

    /**
     * Set 闲聊回复
     * @param Reply 闲聊回复
     */
    public void setReply(String Reply) {
        this.Reply = Reply;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Reply", this.Reply);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

