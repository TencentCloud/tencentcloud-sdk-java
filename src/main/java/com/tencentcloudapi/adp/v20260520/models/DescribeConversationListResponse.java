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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConversationListResponse extends AbstractModel {

    /**
    * <p>会话列表</p>
    */
    @SerializedName("ConversationList")
    @Expose
    private Conversation [] ConversationList;

    /**
    * <p>会话列表</p>
    */
    @SerializedName("Conversations")
    @Expose
    private Conversation [] Conversations;

    /**
    * <p>总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private String TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>会话列表</p> 
     * @return ConversationList <p>会话列表</p>
     */
    public Conversation [] getConversationList() {
        return this.ConversationList;
    }

    /**
     * Set <p>会话列表</p>
     * @param ConversationList <p>会话列表</p>
     */
    public void setConversationList(Conversation [] ConversationList) {
        this.ConversationList = ConversationList;
    }

    /**
     * Get <p>会话列表</p> 
     * @return Conversations <p>会话列表</p>
     */
    public Conversation [] getConversations() {
        return this.Conversations;
    }

    /**
     * Set <p>会话列表</p>
     * @param Conversations <p>会话列表</p>
     */
    public void setConversations(Conversation [] Conversations) {
        this.Conversations = Conversations;
    }

    /**
     * Get <p>总数</p> 
     * @return TotalCount <p>总数</p>
     */
    public String getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总数</p>
     * @param TotalCount <p>总数</p>
     */
    public void setTotalCount(String TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeConversationListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConversationListResponse(DescribeConversationListResponse source) {
        if (source.ConversationList != null) {
            this.ConversationList = new Conversation[source.ConversationList.length];
            for (int i = 0; i < source.ConversationList.length; i++) {
                this.ConversationList[i] = new Conversation(source.ConversationList[i]);
            }
        }
        if (source.Conversations != null) {
            this.Conversations = new Conversation[source.Conversations.length];
            for (int i = 0; i < source.Conversations.length; i++) {
                this.Conversations[i] = new Conversation(source.Conversations[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new String(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ConversationList.", this.ConversationList);
        this.setParamArrayObj(map, prefix + "Conversations.", this.Conversations);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

