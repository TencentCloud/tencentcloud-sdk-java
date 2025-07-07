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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskAssociatedAutoSnapshotPolicyResponse extends AbstractModel {

    /**
    * 云盘绑定的定期快照数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 云盘绑定的定期快照列表。
    */
    @SerializedName("AutoSnapshotPolicySet")
    @Expose
    private AutoSnapshotPolicy [] AutoSnapshotPolicySet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云盘绑定的定期快照数量。 
     * @return TotalCount 云盘绑定的定期快照数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 云盘绑定的定期快照数量。
     * @param TotalCount 云盘绑定的定期快照数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 云盘绑定的定期快照列表。 
     * @return AutoSnapshotPolicySet 云盘绑定的定期快照列表。
     */
    public AutoSnapshotPolicy [] getAutoSnapshotPolicySet() {
        return this.AutoSnapshotPolicySet;
    }

    /**
     * Set 云盘绑定的定期快照列表。
     * @param AutoSnapshotPolicySet 云盘绑定的定期快照列表。
     */
    public void setAutoSnapshotPolicySet(AutoSnapshotPolicy [] AutoSnapshotPolicySet) {
        this.AutoSnapshotPolicySet = AutoSnapshotPolicySet;
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

    public DescribeDiskAssociatedAutoSnapshotPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskAssociatedAutoSnapshotPolicyResponse(DescribeDiskAssociatedAutoSnapshotPolicyResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AutoSnapshotPolicySet != null) {
            this.AutoSnapshotPolicySet = new AutoSnapshotPolicy[source.AutoSnapshotPolicySet.length];
            for (int i = 0; i < source.AutoSnapshotPolicySet.length; i++) {
                this.AutoSnapshotPolicySet[i] = new AutoSnapshotPolicy(source.AutoSnapshotPolicySet[i]);
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
        this.setParamArrayObj(map, prefix + "AutoSnapshotPolicySet.", this.AutoSnapshotPolicySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

