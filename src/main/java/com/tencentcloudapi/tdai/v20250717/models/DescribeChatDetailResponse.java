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

public class DescribeChatDetailResponse extends AbstractModel {

    /**
    * 主账号ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 主账号Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子账号Uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 智能体实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 会话ID
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
    * Streaming数量
    */
    @SerializedName("StreamingCount")
    @Expose
    private Long StreamingCount;

    /**
    * 对话流列表
    */
    @SerializedName("Streamings")
    @Expose
    private ChatDetail [] Streamings;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 主账号ID 
     * @return AppId 主账号ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 主账号ID
     * @param AppId 主账号ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号Uin 
     * @return Uin 主账号Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号Uin
     * @param Uin 主账号Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子账号Uin 
     * @return OwnerUin 子账号Uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 子账号Uin
     * @param OwnerUin 子账号Uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 智能体实例ID 
     * @return InstanceId 智能体实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 智能体实例ID
     * @param InstanceId 智能体实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 会话ID 
     * @return ChatId 会话ID
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set 会话ID
     * @param ChatId 会话ID
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

    /**
     * Get Streaming数量 
     * @return StreamingCount Streaming数量
     */
    public Long getStreamingCount() {
        return this.StreamingCount;
    }

    /**
     * Set Streaming数量
     * @param StreamingCount Streaming数量
     */
    public void setStreamingCount(Long StreamingCount) {
        this.StreamingCount = StreamingCount;
    }

    /**
     * Get 对话流列表 
     * @return Streamings 对话流列表
     */
    public ChatDetail [] getStreamings() {
        return this.Streamings;
    }

    /**
     * Set 对话流列表
     * @param Streamings 对话流列表
     */
    public void setStreamings(ChatDetail [] Streamings) {
        this.Streamings = Streamings;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeChatDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChatDetailResponse(DescribeChatDetailResponse source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.LastStreamingTokenId != null) {
            this.LastStreamingTokenId = new Long(source.LastStreamingTokenId);
        }
        if (source.StreamingCount != null) {
            this.StreamingCount = new Long(source.StreamingCount);
        }
        if (source.Streamings != null) {
            this.Streamings = new ChatDetail[source.Streamings.length];
            for (int i = 0; i < source.Streamings.length; i++) {
                this.Streamings[i] = new ChatDetail(source.Streamings[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "LastStreamingTokenId", this.LastStreamingTokenId);
        this.setParamSimple(map, prefix + "StreamingCount", this.StreamingCount);
        this.setParamArrayObj(map, prefix + "Streamings.", this.Streamings);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

