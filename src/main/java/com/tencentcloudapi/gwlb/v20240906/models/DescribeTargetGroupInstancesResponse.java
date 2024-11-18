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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupInstancesResponse extends AbstractModel {

    /**
    * 本次查询的结果数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 绑定的服务器信息。
    */
    @SerializedName("TargetGroupInstanceSet")
    @Expose
    private TargetGroupBackend [] TargetGroupInstanceSet;

    /**
    * 实际统计数量，不受Limit、Offset、CAM的影响。
    */
    @SerializedName("RealCount")
    @Expose
    private Long RealCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本次查询的结果数量。 
     * @return TotalCount 本次查询的结果数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 本次查询的结果数量。
     * @param TotalCount 本次查询的结果数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 绑定的服务器信息。 
     * @return TargetGroupInstanceSet 绑定的服务器信息。
     */
    public TargetGroupBackend [] getTargetGroupInstanceSet() {
        return this.TargetGroupInstanceSet;
    }

    /**
     * Set 绑定的服务器信息。
     * @param TargetGroupInstanceSet 绑定的服务器信息。
     */
    public void setTargetGroupInstanceSet(TargetGroupBackend [] TargetGroupInstanceSet) {
        this.TargetGroupInstanceSet = TargetGroupInstanceSet;
    }

    /**
     * Get 实际统计数量，不受Limit、Offset、CAM的影响。 
     * @return RealCount 实际统计数量，不受Limit、Offset、CAM的影响。
     */
    public Long getRealCount() {
        return this.RealCount;
    }

    /**
     * Set 实际统计数量，不受Limit、Offset、CAM的影响。
     * @param RealCount 实际统计数量，不受Limit、Offset、CAM的影响。
     */
    public void setRealCount(Long RealCount) {
        this.RealCount = RealCount;
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

    public DescribeTargetGroupInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupInstancesResponse(DescribeTargetGroupInstancesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TargetGroupInstanceSet != null) {
            this.TargetGroupInstanceSet = new TargetGroupBackend[source.TargetGroupInstanceSet.length];
            for (int i = 0; i < source.TargetGroupInstanceSet.length; i++) {
                this.TargetGroupInstanceSet[i] = new TargetGroupBackend(source.TargetGroupInstanceSet[i]);
            }
        }
        if (source.RealCount != null) {
            this.RealCount = new Long(source.RealCount);
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
        this.setParamArrayObj(map, prefix + "TargetGroupInstanceSet.", this.TargetGroupInstanceSet);
        this.setParamSimple(map, prefix + "RealCount", this.RealCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

