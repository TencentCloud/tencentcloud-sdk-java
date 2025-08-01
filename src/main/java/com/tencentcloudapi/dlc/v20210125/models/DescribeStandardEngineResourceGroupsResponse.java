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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStandardEngineResourceGroupsResponse extends AbstractModel {

    /**
    * 标准引擎资源组信息
    */
    @SerializedName("UserEngineResourceGroupInfos")
    @Expose
    private StandardEngineResourceGroupInfo [] UserEngineResourceGroupInfos;

    /**
    * 资源组总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 标准引擎资源组信息 
     * @return UserEngineResourceGroupInfos 标准引擎资源组信息
     */
    public StandardEngineResourceGroupInfo [] getUserEngineResourceGroupInfos() {
        return this.UserEngineResourceGroupInfos;
    }

    /**
     * Set 标准引擎资源组信息
     * @param UserEngineResourceGroupInfos 标准引擎资源组信息
     */
    public void setUserEngineResourceGroupInfos(StandardEngineResourceGroupInfo [] UserEngineResourceGroupInfos) {
        this.UserEngineResourceGroupInfos = UserEngineResourceGroupInfos;
    }

    /**
     * Get 资源组总数 
     * @return Total 资源组总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 资源组总数
     * @param Total 资源组总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeStandardEngineResourceGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStandardEngineResourceGroupsResponse(DescribeStandardEngineResourceGroupsResponse source) {
        if (source.UserEngineResourceGroupInfos != null) {
            this.UserEngineResourceGroupInfos = new StandardEngineResourceGroupInfo[source.UserEngineResourceGroupInfos.length];
            for (int i = 0; i < source.UserEngineResourceGroupInfos.length; i++) {
                this.UserEngineResourceGroupInfos[i] = new StandardEngineResourceGroupInfo(source.UserEngineResourceGroupInfos[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UserEngineResourceGroupInfos.", this.UserEngineResourceGroupInfos);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

