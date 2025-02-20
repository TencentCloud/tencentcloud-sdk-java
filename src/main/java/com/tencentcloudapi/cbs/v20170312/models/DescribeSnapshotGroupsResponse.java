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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotGroupsResponse extends AbstractModel {

    /**
    * 符合条件的总数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 快照组列表详情。
    */
    @SerializedName("SnapshotGroupSet")
    @Expose
    private SnapshotGroup [] SnapshotGroupSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的总数量。 
     * @return TotalCount 符合条件的总数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的总数量。
     * @param TotalCount 符合条件的总数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 快照组列表详情。 
     * @return SnapshotGroupSet 快照组列表详情。
     */
    public SnapshotGroup [] getSnapshotGroupSet() {
        return this.SnapshotGroupSet;
    }

    /**
     * Set 快照组列表详情。
     * @param SnapshotGroupSet 快照组列表详情。
     */
    public void setSnapshotGroupSet(SnapshotGroup [] SnapshotGroupSet) {
        this.SnapshotGroupSet = SnapshotGroupSet;
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

    public DescribeSnapshotGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotGroupsResponse(DescribeSnapshotGroupsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SnapshotGroupSet != null) {
            this.SnapshotGroupSet = new SnapshotGroup[source.SnapshotGroupSet.length];
            for (int i = 0; i < source.SnapshotGroupSet.length; i++) {
                this.SnapshotGroupSet[i] = new SnapshotGroup(source.SnapshotGroupSet[i]);
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
        this.setParamArrayObj(map, prefix + "SnapshotGroupSet.", this.SnapshotGroupSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

