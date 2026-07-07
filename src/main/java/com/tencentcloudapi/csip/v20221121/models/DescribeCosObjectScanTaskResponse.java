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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCosObjectScanTaskResponse extends AbstractModel {

    /**
    * <p>存储桶任务详情</p>
    */
    @SerializedName("BucketTaskIdSet")
    @Expose
    private CosBucketTaskInfo [] BucketTaskIdSet;

    /**
    * <p>appid维度任务列表</p>
    */
    @SerializedName("MemberTaskIdSet")
    @Expose
    private CosAssetSyncTaskInfo [] MemberTaskIdSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>存储桶任务详情</p> 
     * @return BucketTaskIdSet <p>存储桶任务详情</p>
     */
    public CosBucketTaskInfo [] getBucketTaskIdSet() {
        return this.BucketTaskIdSet;
    }

    /**
     * Set <p>存储桶任务详情</p>
     * @param BucketTaskIdSet <p>存储桶任务详情</p>
     */
    public void setBucketTaskIdSet(CosBucketTaskInfo [] BucketTaskIdSet) {
        this.BucketTaskIdSet = BucketTaskIdSet;
    }

    /**
     * Get <p>appid维度任务列表</p> 
     * @return MemberTaskIdSet <p>appid维度任务列表</p>
     */
    public CosAssetSyncTaskInfo [] getMemberTaskIdSet() {
        return this.MemberTaskIdSet;
    }

    /**
     * Set <p>appid维度任务列表</p>
     * @param MemberTaskIdSet <p>appid维度任务列表</p>
     */
    public void setMemberTaskIdSet(CosAssetSyncTaskInfo [] MemberTaskIdSet) {
        this.MemberTaskIdSet = MemberTaskIdSet;
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

    public DescribeCosObjectScanTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosObjectScanTaskResponse(DescribeCosObjectScanTaskResponse source) {
        if (source.BucketTaskIdSet != null) {
            this.BucketTaskIdSet = new CosBucketTaskInfo[source.BucketTaskIdSet.length];
            for (int i = 0; i < source.BucketTaskIdSet.length; i++) {
                this.BucketTaskIdSet[i] = new CosBucketTaskInfo(source.BucketTaskIdSet[i]);
            }
        }
        if (source.MemberTaskIdSet != null) {
            this.MemberTaskIdSet = new CosAssetSyncTaskInfo[source.MemberTaskIdSet.length];
            for (int i = 0; i < source.MemberTaskIdSet.length; i++) {
                this.MemberTaskIdSet[i] = new CosAssetSyncTaskInfo(source.MemberTaskIdSet[i]);
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
        this.setParamArrayObj(map, prefix + "BucketTaskIdSet.", this.BucketTaskIdSet);
        this.setParamArrayObj(map, prefix + "MemberTaskIdSet.", this.MemberTaskIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

