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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsrHotwordsListResponse extends AbstractModel {

    /**
    * 总热词库数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认返回所有热词库
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 热词库列表
    */
    @SerializedName("AsrHotwordsSet")
    @Expose
    private AsrHotwordsSet [] AsrHotwordsSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总热词库数量 
     * @return TotalCount 总热词库数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总热词库数量
     * @param TotalCount 总热词库数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 分页偏移量，默认值：0。 
     * @return Offset 分页偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。
     * @param Offset 分页偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认返回所有热词库 
     * @return Limit 返回记录条数，默认返回所有热词库
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认返回所有热词库
     * @param Limit 返回记录条数，默认返回所有热词库
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 热词库列表 
     * @return AsrHotwordsSet 热词库列表
     */
    public AsrHotwordsSet [] getAsrHotwordsSet() {
        return this.AsrHotwordsSet;
    }

    /**
     * Set 热词库列表
     * @param AsrHotwordsSet 热词库列表
     */
    public void setAsrHotwordsSet(AsrHotwordsSet [] AsrHotwordsSet) {
        this.AsrHotwordsSet = AsrHotwordsSet;
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

    public DescribeAsrHotwordsListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsrHotwordsListResponse(DescribeAsrHotwordsListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AsrHotwordsSet != null) {
            this.AsrHotwordsSet = new AsrHotwordsSet[source.AsrHotwordsSet.length];
            for (int i = 0; i < source.AsrHotwordsSet.length; i++) {
                this.AsrHotwordsSet[i] = new AsrHotwordsSet(source.AsrHotwordsSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "AsrHotwordsSet.", this.AsrHotwordsSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

