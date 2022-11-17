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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCredentialCptRankResponse extends AbstractModel{

    /**
    * Rank集合
    */
    @SerializedName("RankIssueResult")
    @Expose
    private CptIssueRank [] RankIssueResult;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Rank集合 
     * @return RankIssueResult Rank集合
     */
    public CptIssueRank [] getRankIssueResult() {
        return this.RankIssueResult;
    }

    /**
     * Set Rank集合
     * @param RankIssueResult Rank集合
     */
    public void setRankIssueResult(CptIssueRank [] RankIssueResult) {
        this.RankIssueResult = RankIssueResult;
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

    public GetCredentialCptRankResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCredentialCptRankResponse(GetCredentialCptRankResponse source) {
        if (source.RankIssueResult != null) {
            this.RankIssueResult = new CptIssueRank[source.RankIssueResult.length];
            for (int i = 0; i < source.RankIssueResult.length; i++) {
                this.RankIssueResult[i] = new CptIssueRank(source.RankIssueResult[i]);
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
        this.setParamArrayObj(map, prefix + "RankIssueResult.", this.RankIssueResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

