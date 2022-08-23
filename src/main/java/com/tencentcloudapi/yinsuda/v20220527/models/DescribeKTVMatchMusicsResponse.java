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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKTVMatchMusicsResponse extends AbstractModel{

    /**
    * 匹配到的歌曲列表。
    */
    @SerializedName("MatchMusicSet")
    @Expose
    private KTVMatchMusic [] MatchMusicSet;

    /**
    * 未匹配的规则列表。
    */
    @SerializedName("NotMatchRuleSet")
    @Expose
    private KTVMatchRule [] NotMatchRuleSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 匹配到的歌曲列表。 
     * @return MatchMusicSet 匹配到的歌曲列表。
     */
    public KTVMatchMusic [] getMatchMusicSet() {
        return this.MatchMusicSet;
    }

    /**
     * Set 匹配到的歌曲列表。
     * @param MatchMusicSet 匹配到的歌曲列表。
     */
    public void setMatchMusicSet(KTVMatchMusic [] MatchMusicSet) {
        this.MatchMusicSet = MatchMusicSet;
    }

    /**
     * Get 未匹配的规则列表。 
     * @return NotMatchRuleSet 未匹配的规则列表。
     */
    public KTVMatchRule [] getNotMatchRuleSet() {
        return this.NotMatchRuleSet;
    }

    /**
     * Set 未匹配的规则列表。
     * @param NotMatchRuleSet 未匹配的规则列表。
     */
    public void setNotMatchRuleSet(KTVMatchRule [] NotMatchRuleSet) {
        this.NotMatchRuleSet = NotMatchRuleSet;
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

    public DescribeKTVMatchMusicsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVMatchMusicsResponse(DescribeKTVMatchMusicsResponse source) {
        if (source.MatchMusicSet != null) {
            this.MatchMusicSet = new KTVMatchMusic[source.MatchMusicSet.length];
            for (int i = 0; i < source.MatchMusicSet.length; i++) {
                this.MatchMusicSet[i] = new KTVMatchMusic(source.MatchMusicSet[i]);
            }
        }
        if (source.NotMatchRuleSet != null) {
            this.NotMatchRuleSet = new KTVMatchRule[source.NotMatchRuleSet.length];
            for (int i = 0; i < source.NotMatchRuleSet.length; i++) {
                this.NotMatchRuleSet[i] = new KTVMatchRule(source.NotMatchRuleSet[i]);
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
        this.setParamArrayObj(map, prefix + "MatchMusicSet.", this.MatchMusicSet);
        this.setParamArrayObj(map, prefix + "NotMatchRuleSet.", this.NotMatchRuleSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

