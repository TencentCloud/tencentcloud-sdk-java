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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityPolicyRelationsResponse extends AbstractModel {

    /**
    * 安全策略关联的监听器列表。返回每个安全策略所关联的 HTTPS 监听器信息。
    */
    @SerializedName("SecurityPolicyRelations")
    @Expose
    private SecurityPolicyRelations [] SecurityPolicyRelations;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 安全策略关联的监听器列表。返回每个安全策略所关联的 HTTPS 监听器信息。 
     * @return SecurityPolicyRelations 安全策略关联的监听器列表。返回每个安全策略所关联的 HTTPS 监听器信息。
     */
    public SecurityPolicyRelations [] getSecurityPolicyRelations() {
        return this.SecurityPolicyRelations;
    }

    /**
     * Set 安全策略关联的监听器列表。返回每个安全策略所关联的 HTTPS 监听器信息。
     * @param SecurityPolicyRelations 安全策略关联的监听器列表。返回每个安全策略所关联的 HTTPS 监听器信息。
     */
    public void setSecurityPolicyRelations(SecurityPolicyRelations [] SecurityPolicyRelations) {
        this.SecurityPolicyRelations = SecurityPolicyRelations;
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

    public DescribeSecurityPolicyRelationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPolicyRelationsResponse(DescribeSecurityPolicyRelationsResponse source) {
        if (source.SecurityPolicyRelations != null) {
            this.SecurityPolicyRelations = new SecurityPolicyRelations[source.SecurityPolicyRelations.length];
            for (int i = 0; i < source.SecurityPolicyRelations.length; i++) {
                this.SecurityPolicyRelations[i] = new SecurityPolicyRelations(source.SecurityPolicyRelations[i]);
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
        this.setParamArrayObj(map, prefix + "SecurityPolicyRelations.", this.SecurityPolicyRelations);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

