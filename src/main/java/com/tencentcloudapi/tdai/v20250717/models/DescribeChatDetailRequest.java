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
    * 流ID
    */
    @SerializedName("StreamingId")
    @Expose
    private String StreamingId;

    /**
    * 开始拉取的流式TokenID。0表示从该流最早的TokenID开始获取
    */
    @SerializedName("BeginStreamingTokenId")
    @Expose
    private Long BeginStreamingTokenId;

    /**
    * 单次获取的token数量，默认2000
    */
    @SerializedName("TokenLimit")
    @Expose
    private Long TokenLimit;

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
     * Get 流ID 
     * @return StreamingId 流ID
     */
    public String getStreamingId() {
        return this.StreamingId;
    }

    /**
     * Set 流ID
     * @param StreamingId 流ID
     */
    public void setStreamingId(String StreamingId) {
        this.StreamingId = StreamingId;
    }

    /**
     * Get 开始拉取的流式TokenID。0表示从该流最早的TokenID开始获取 
     * @return BeginStreamingTokenId 开始拉取的流式TokenID。0表示从该流最早的TokenID开始获取
     */
    public Long getBeginStreamingTokenId() {
        return this.BeginStreamingTokenId;
    }

    /**
     * Set 开始拉取的流式TokenID。0表示从该流最早的TokenID开始获取
     * @param BeginStreamingTokenId 开始拉取的流式TokenID。0表示从该流最早的TokenID开始获取
     */
    public void setBeginStreamingTokenId(Long BeginStreamingTokenId) {
        this.BeginStreamingTokenId = BeginStreamingTokenId;
    }

    /**
     * Get 单次获取的token数量，默认2000 
     * @return TokenLimit 单次获取的token数量，默认2000
     */
    public Long getTokenLimit() {
        return this.TokenLimit;
    }

    /**
     * Set 单次获取的token数量，默认2000
     * @param TokenLimit 单次获取的token数量，默认2000
     */
    public void setTokenLimit(Long TokenLimit) {
        this.TokenLimit = TokenLimit;
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
        if (source.StreamingId != null) {
            this.StreamingId = new String(source.StreamingId);
        }
        if (source.BeginStreamingTokenId != null) {
            this.BeginStreamingTokenId = new Long(source.BeginStreamingTokenId);
        }
        if (source.TokenLimit != null) {
            this.TokenLimit = new Long(source.TokenLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "StreamingId", this.StreamingId);
        this.setParamSimple(map, prefix + "BeginStreamingTokenId", this.BeginStreamingTokenId);
        this.setParamSimple(map, prefix + "TokenLimit", this.TokenLimit);

    }
}

