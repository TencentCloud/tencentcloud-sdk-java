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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoundPlaysResponse extends AbstractModel {

    /**
    * <p>符合过滤条件的轮播播单总数。已经废弃，分批次查询请请使用 ScrollToken 参数。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>轮播播单详情列表。</p>
    */
    @SerializedName("RoundPlaySet")
    @Expose
    private RoundPlayInfo [] RoundPlaySet;

    /**
    * <p>翻页标识，当请求未返回所有数据，该字段表示下一条记录的 ID。当该字段为空，说明已无更多数据。</p>
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>符合过滤条件的轮播播单总数。已经废弃，分批次查询请请使用 ScrollToken 参数。</p> 
     * @return TotalCount <p>符合过滤条件的轮播播单总数。已经废弃，分批次查询请请使用 ScrollToken 参数。</p>
     * @deprecated
     */
    @Deprecated
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>符合过滤条件的轮播播单总数。已经废弃，分批次查询请请使用 ScrollToken 参数。</p>
     * @param TotalCount <p>符合过滤条件的轮播播单总数。已经废弃，分批次查询请请使用 ScrollToken 参数。</p>
     * @deprecated
     */
    @Deprecated
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>轮播播单详情列表。</p> 
     * @return RoundPlaySet <p>轮播播单详情列表。</p>
     */
    public RoundPlayInfo [] getRoundPlaySet() {
        return this.RoundPlaySet;
    }

    /**
     * Set <p>轮播播单详情列表。</p>
     * @param RoundPlaySet <p>轮播播单详情列表。</p>
     */
    public void setRoundPlaySet(RoundPlayInfo [] RoundPlaySet) {
        this.RoundPlaySet = RoundPlaySet;
    }

    /**
     * Get <p>翻页标识，当请求未返回所有数据，该字段表示下一条记录的 ID。当该字段为空，说明已无更多数据。</p> 
     * @return ScrollToken <p>翻页标识，当请求未返回所有数据，该字段表示下一条记录的 ID。当该字段为空，说明已无更多数据。</p>
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set <p>翻页标识，当请求未返回所有数据，该字段表示下一条记录的 ID。当该字段为空，说明已无更多数据。</p>
     * @param ScrollToken <p>翻页标识，当请求未返回所有数据，该字段表示下一条记录的 ID。当该字段为空，说明已无更多数据。</p>
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
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

    public DescribeRoundPlaysResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoundPlaysResponse(DescribeRoundPlaysResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RoundPlaySet != null) {
            this.RoundPlaySet = new RoundPlayInfo[source.RoundPlaySet.length];
            for (int i = 0; i < source.RoundPlaySet.length; i++) {
                this.RoundPlaySet[i] = new RoundPlayInfo(source.RoundPlaySet[i]);
            }
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RoundPlaySet.", this.RoundPlaySet);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

