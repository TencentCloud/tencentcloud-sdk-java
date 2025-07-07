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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcEndPointServiceWhiteListResponse extends AbstractModel {

    /**
    * 白名单对象数组。已废弃
    */
    @SerializedName("VpcEndpointServiceUserSet")
    @Expose
    private VpcEndPointServiceUser [] VpcEndpointServiceUserSet;

    /**
    * 白名单对象数组。
    */
    @SerializedName("VpcEndPointServiceUserSet")
    @Expose
    private VpcEndPointServiceUser [] VpcEndPointServiceUserSet;

    /**
    * 符合条件的白名单个数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 白名单对象数组。已废弃 
     * @return VpcEndpointServiceUserSet 白名单对象数组。已废弃
     */
    public VpcEndPointServiceUser [] getVpcEndpointServiceUserSet() {
        return this.VpcEndpointServiceUserSet;
    }

    /**
     * Set 白名单对象数组。已废弃
     * @param VpcEndpointServiceUserSet 白名单对象数组。已废弃
     */
    public void setVpcEndpointServiceUserSet(VpcEndPointServiceUser [] VpcEndpointServiceUserSet) {
        this.VpcEndpointServiceUserSet = VpcEndpointServiceUserSet;
    }

    /**
     * Get 白名单对象数组。 
     * @return VpcEndPointServiceUserSet 白名单对象数组。
     */
    public VpcEndPointServiceUser [] getVpcEndPointServiceUserSet() {
        return this.VpcEndPointServiceUserSet;
    }

    /**
     * Set 白名单对象数组。
     * @param VpcEndPointServiceUserSet 白名单对象数组。
     */
    public void setVpcEndPointServiceUserSet(VpcEndPointServiceUser [] VpcEndPointServiceUserSet) {
        this.VpcEndPointServiceUserSet = VpcEndPointServiceUserSet;
    }

    /**
     * Get 符合条件的白名单个数。 
     * @return TotalCount 符合条件的白名单个数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的白名单个数。
     * @param TotalCount 符合条件的白名单个数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeVpcEndPointServiceWhiteListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcEndPointServiceWhiteListResponse(DescribeVpcEndPointServiceWhiteListResponse source) {
        if (source.VpcEndpointServiceUserSet != null) {
            this.VpcEndpointServiceUserSet = new VpcEndPointServiceUser[source.VpcEndpointServiceUserSet.length];
            for (int i = 0; i < source.VpcEndpointServiceUserSet.length; i++) {
                this.VpcEndpointServiceUserSet[i] = new VpcEndPointServiceUser(source.VpcEndpointServiceUserSet[i]);
            }
        }
        if (source.VpcEndPointServiceUserSet != null) {
            this.VpcEndPointServiceUserSet = new VpcEndPointServiceUser[source.VpcEndPointServiceUserSet.length];
            for (int i = 0; i < source.VpcEndPointServiceUserSet.length; i++) {
                this.VpcEndPointServiceUserSet[i] = new VpcEndPointServiceUser(source.VpcEndPointServiceUserSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VpcEndpointServiceUserSet.", this.VpcEndpointServiceUserSet);
        this.setParamArrayObj(map, prefix + "VpcEndPointServiceUserSet.", this.VpcEndPointServiceUserSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

