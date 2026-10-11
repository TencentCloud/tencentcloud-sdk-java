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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSandboxSnapshotListResponse extends AbstractModel {

    /**
    * <p>查询到的沙箱快照列表</p>
    */
    @SerializedName("SnapshotSet")
    @Expose
    private SandboxSnapshot [] SnapshotSet;

    /**
    * <p>查询到的沙箱快照数量</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>分页偏移 token，可用于下一次查询</p>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>查询到的沙箱快照列表</p> 
     * @return SnapshotSet <p>查询到的沙箱快照列表</p>
     */
    public SandboxSnapshot [] getSnapshotSet() {
        return this.SnapshotSet;
    }

    /**
     * Set <p>查询到的沙箱快照列表</p>
     * @param SnapshotSet <p>查询到的沙箱快照列表</p>
     */
    public void setSnapshotSet(SandboxSnapshot [] SnapshotSet) {
        this.SnapshotSet = SnapshotSet;
    }

    /**
     * Get <p>查询到的沙箱快照数量</p> 
     * @return TotalCount <p>查询到的沙箱快照数量</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>查询到的沙箱快照数量</p>
     * @param TotalCount <p>查询到的沙箱快照数量</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>分页偏移 token，可用于下一次查询</p> 
     * @return NextToken <p>分页偏移 token，可用于下一次查询</p>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>分页偏移 token，可用于下一次查询</p>
     * @param NextToken <p>分页偏移 token，可用于下一次查询</p>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
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

    public DescribeSandboxSnapshotListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSandboxSnapshotListResponse(DescribeSandboxSnapshotListResponse source) {
        if (source.SnapshotSet != null) {
            this.SnapshotSet = new SandboxSnapshot[source.SnapshotSet.length];
            for (int i = 0; i < source.SnapshotSet.length; i++) {
                this.SnapshotSet[i] = new SandboxSnapshot(source.SnapshotSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SnapshotSet.", this.SnapshotSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

