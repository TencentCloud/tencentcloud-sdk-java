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

public class DescribeSecurityPoliciesResponse extends AbstractModel {

    /**
    * 下一页查询的起始令牌。

- 若返回值不为空，表示还有更多数据，可将此值作为下一次请求的 NextToken 参数继续查询。
- 若返回值为空或未返回此字段，表示已是最后一页。

    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 安全策略信息列表。包含每个安全策略的详细配置，如策略 ID、名称、TLS 版本、加密套件等。

    */
    @SerializedName("SecurityPolicies")
    @Expose
    private SecurityPolicyInfo [] SecurityPolicies;

    /**
    * 符合过滤条件的安全策略总数。

**说明：** 此值表示满足查询条件的总记录数，而非本次返回的记录数。可用于计算分页信息。

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
     * Get 下一页查询的起始令牌。

- 若返回值不为空，表示还有更多数据，可将此值作为下一次请求的 NextToken 参数继续查询。
- 若返回值为空或未返回此字段，表示已是最后一页。
 
     * @return NextToken 下一页查询的起始令牌。

- 若返回值不为空，表示还有更多数据，可将此值作为下一次请求的 NextToken 参数继续查询。
- 若返回值为空或未返回此字段，表示已是最后一页。

     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 下一页查询的起始令牌。

- 若返回值不为空，表示还有更多数据，可将此值作为下一次请求的 NextToken 参数继续查询。
- 若返回值为空或未返回此字段，表示已是最后一页。

     * @param NextToken 下一页查询的起始令牌。

- 若返回值不为空，表示还有更多数据，可将此值作为下一次请求的 NextToken 参数继续查询。
- 若返回值为空或未返回此字段，表示已是最后一页。

     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 安全策略信息列表。包含每个安全策略的详细配置，如策略 ID、名称、TLS 版本、加密套件等。
 
     * @return SecurityPolicies 安全策略信息列表。包含每个安全策略的详细配置，如策略 ID、名称、TLS 版本、加密套件等。

     */
    public SecurityPolicyInfo [] getSecurityPolicies() {
        return this.SecurityPolicies;
    }

    /**
     * Set 安全策略信息列表。包含每个安全策略的详细配置，如策略 ID、名称、TLS 版本、加密套件等。

     * @param SecurityPolicies 安全策略信息列表。包含每个安全策略的详细配置，如策略 ID、名称、TLS 版本、加密套件等。

     */
    public void setSecurityPolicies(SecurityPolicyInfo [] SecurityPolicies) {
        this.SecurityPolicies = SecurityPolicies;
    }

    /**
     * Get 符合过滤条件的安全策略总数。

**说明：** 此值表示满足查询条件的总记录数，而非本次返回的记录数。可用于计算分页信息。
 
     * @return TotalCount 符合过滤条件的安全策略总数。

**说明：** 此值表示满足查询条件的总记录数，而非本次返回的记录数。可用于计算分页信息。

     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合过滤条件的安全策略总数。

**说明：** 此值表示满足查询条件的总记录数，而非本次返回的记录数。可用于计算分页信息。

     * @param TotalCount 符合过滤条件的安全策略总数。

**说明：** 此值表示满足查询条件的总记录数，而非本次返回的记录数。可用于计算分页信息。

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

    public DescribeSecurityPoliciesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPoliciesResponse(DescribeSecurityPoliciesResponse source) {
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.SecurityPolicies != null) {
            this.SecurityPolicies = new SecurityPolicyInfo[source.SecurityPolicies.length];
            for (int i = 0; i < source.SecurityPolicies.length; i++) {
                this.SecurityPolicies[i] = new SecurityPolicyInfo(source.SecurityPolicies[i]);
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
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArrayObj(map, prefix + "SecurityPolicies.", this.SecurityPolicies);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

