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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcCniPodLimitsResponse extends AbstractModel {

    /**
    * 机型数据数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 机型信息及其可支持的最大VPC-CNI模式Pod数量信息
    */
    @SerializedName("PodLimitsInstanceSet")
    @Expose
    private PodLimitsInstance [] PodLimitsInstanceSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 机型数据数量 
     * @return TotalCount 机型数据数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 机型数据数量
     * @param TotalCount 机型数据数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 机型信息及其可支持的最大VPC-CNI模式Pod数量信息 
     * @return PodLimitsInstanceSet 机型信息及其可支持的最大VPC-CNI模式Pod数量信息
     */
    public PodLimitsInstance [] getPodLimitsInstanceSet() {
        return this.PodLimitsInstanceSet;
    }

    /**
     * Set 机型信息及其可支持的最大VPC-CNI模式Pod数量信息
     * @param PodLimitsInstanceSet 机型信息及其可支持的最大VPC-CNI模式Pod数量信息
     */
    public void setPodLimitsInstanceSet(PodLimitsInstance [] PodLimitsInstanceSet) {
        this.PodLimitsInstanceSet = PodLimitsInstanceSet;
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

    public DescribeVpcCniPodLimitsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcCniPodLimitsResponse(DescribeVpcCniPodLimitsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PodLimitsInstanceSet != null) {
            this.PodLimitsInstanceSet = new PodLimitsInstance[source.PodLimitsInstanceSet.length];
            for (int i = 0; i < source.PodLimitsInstanceSet.length; i++) {
                this.PodLimitsInstanceSet[i] = new PodLimitsInstance(source.PodLimitsInstanceSet[i]);
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
        this.setParamArrayObj(map, prefix + "PodLimitsInstanceSet.", this.PodLimitsInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

