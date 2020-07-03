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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRsgAsGroupsResponse extends AbstractModel{

    /**
    * 所查询的伸缩组数组
    */
    @SerializedName("RsgAsGroupSet")
    @Expose
    private RsgAsGroup [] RsgAsGroupSet;

    /**
    * 伸缩组数组总数目
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 所查询的伸缩组数组 
     * @return RsgAsGroupSet 所查询的伸缩组数组
     */
    public RsgAsGroup [] getRsgAsGroupSet() {
        return this.RsgAsGroupSet;
    }

    /**
     * Set 所查询的伸缩组数组
     * @param RsgAsGroupSet 所查询的伸缩组数组
     */
    public void setRsgAsGroupSet(RsgAsGroup [] RsgAsGroupSet) {
        this.RsgAsGroupSet = RsgAsGroupSet;
    }

    /**
     * Get 伸缩组数组总数目 
     * @return TotalCount 伸缩组数组总数目
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 伸缩组数组总数目
     * @param TotalCount 伸缩组数组总数目
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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
        this.setParamArrayObj(map, prefix + "RsgAsGroupSet.", this.RsgAsGroupSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

