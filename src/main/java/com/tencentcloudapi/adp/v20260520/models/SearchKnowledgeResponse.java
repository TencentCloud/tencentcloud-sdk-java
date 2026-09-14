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

public class SearchKnowledgeResponse extends AbstractModel {

    /**
    * <p>检索结果列表</p>
    */
    @SerializedName("KnowledgeList")
    @Expose
    private KnowledgeResult [] KnowledgeList;

    /**
    * <p>消耗的 token 统计</p>
    */
    @SerializedName("TokenUsageList")
    @Expose
    private TokenUsage [] TokenUsageList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>检索结果列表</p> 
     * @return KnowledgeList <p>检索结果列表</p>
     */
    public KnowledgeResult [] getKnowledgeList() {
        return this.KnowledgeList;
    }

    /**
     * Set <p>检索结果列表</p>
     * @param KnowledgeList <p>检索结果列表</p>
     */
    public void setKnowledgeList(KnowledgeResult [] KnowledgeList) {
        this.KnowledgeList = KnowledgeList;
    }

    /**
     * Get <p>消耗的 token 统计</p> 
     * @return TokenUsageList <p>消耗的 token 统计</p>
     */
    public TokenUsage [] getTokenUsageList() {
        return this.TokenUsageList;
    }

    /**
     * Set <p>消耗的 token 统计</p>
     * @param TokenUsageList <p>消耗的 token 统计</p>
     */
    public void setTokenUsageList(TokenUsage [] TokenUsageList) {
        this.TokenUsageList = TokenUsageList;
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

    public SearchKnowledgeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchKnowledgeResponse(SearchKnowledgeResponse source) {
        if (source.KnowledgeList != null) {
            this.KnowledgeList = new KnowledgeResult[source.KnowledgeList.length];
            for (int i = 0; i < source.KnowledgeList.length; i++) {
                this.KnowledgeList[i] = new KnowledgeResult(source.KnowledgeList[i]);
            }
        }
        if (source.TokenUsageList != null) {
            this.TokenUsageList = new TokenUsage[source.TokenUsageList.length];
            for (int i = 0; i < source.TokenUsageList.length; i++) {
                this.TokenUsageList[i] = new TokenUsage(source.TokenUsageList[i]);
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
        this.setParamArrayObj(map, prefix + "KnowledgeList.", this.KnowledgeList);
        this.setParamArrayObj(map, prefix + "TokenUsageList.", this.TokenUsageList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

