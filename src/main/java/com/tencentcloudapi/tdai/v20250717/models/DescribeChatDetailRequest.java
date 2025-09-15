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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeChatDetailRequest extends AbstractModel {

    /**
    * 智能体ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 会话Id
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * 最后一条流式TokenID
    */
    @SerializedName("LastStreamingTokenId")
    @Expose
    private Long LastStreamingTokenId;

    /**
     * Get 智能体ID 
     * @return InstanceId 智能体ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 智能体ID
     * @param InstanceId 智能体ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 会话Id 
     * @return ChatId 会话Id
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set 会话Id
     * @param ChatId 会话Id
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get 最后一条流式TokenID 
     * @return LastStreamingTokenId 最后一条流式TokenID
     */
    public Long getLastStreamingTokenId() {
        return this.LastStreamingTokenId;
    }

    /**
     * Set 最后一条流式TokenID
     * @param LastStreamingTokenId 最后一条流式TokenID
     */
    public void setLastStreamingTokenId(Long LastStreamingTokenId) {
        this.LastStreamingTokenId = LastStreamingTokenId;
    }

    public DescribeChatDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChatDetailRequest(DescribeChatDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.LastStreamingTokenId != null) {
            this.LastStreamingTokenId = new Long(source.LastStreamingTokenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "LastStreamingTokenId", this.LastStreamingTokenId);

    }
}

