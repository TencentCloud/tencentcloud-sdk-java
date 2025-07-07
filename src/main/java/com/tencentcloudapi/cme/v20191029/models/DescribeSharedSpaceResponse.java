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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSharedSpaceResponse extends AbstractModel {

    /**
    * 查询到的共享空间总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 各个共享空间对应的授权者信息。
    */
    @SerializedName("AuthorizerSet")
    @Expose
    private Authorizer [] AuthorizerSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询到的共享空间总数。 
     * @return TotalCount 查询到的共享空间总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询到的共享空间总数。
     * @param TotalCount 查询到的共享空间总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 各个共享空间对应的授权者信息。 
     * @return AuthorizerSet 各个共享空间对应的授权者信息。
     */
    public Authorizer [] getAuthorizerSet() {
        return this.AuthorizerSet;
    }

    /**
     * Set 各个共享空间对应的授权者信息。
     * @param AuthorizerSet 各个共享空间对应的授权者信息。
     */
    public void setAuthorizerSet(Authorizer [] AuthorizerSet) {
        this.AuthorizerSet = AuthorizerSet;
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

    public DescribeSharedSpaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSharedSpaceResponse(DescribeSharedSpaceResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AuthorizerSet != null) {
            this.AuthorizerSet = new Authorizer[source.AuthorizerSet.length];
            for (int i = 0; i < source.AuthorizerSet.length; i++) {
                this.AuthorizerSet[i] = new Authorizer(source.AuthorizerSet[i]);
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
        this.setParamArrayObj(map, prefix + "AuthorizerSet.", this.AuthorizerSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

