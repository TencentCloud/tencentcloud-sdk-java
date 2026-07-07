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

public class DescribeSecurityPoliciesRequest extends AbstractModel {

    /**
    * 过滤条件列表，用于筛选符合指定条件的安全策略。多个过滤条件之间为"与"关系。

**支持的过滤条件：**
- **SecurityPolicyNames**：按安全策略名称筛选，支持模糊匹配。
- **tag:tag-key**：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 `tag:env` 表示按标签键 `env` 筛选。

**说明：** 每个过滤条件最多支持 10 个取值。

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 单次请求返回的最大结果数。用于分页查询，与 NextToken 配合使用。

**取值范围：** 1~100。

**默认值：** 20。

    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 分页查询的起始令牌。用于获取下一页结果数据。

**使用说明：**
- 首次查询时无需设置此参数。
- 如果上一次查询返回了 NextToken，表示还有更多数据，请将该值传入此参数以获取下一页。
- 若上一次查询未返回 NextToken 或返回为空，表示已是最后一页。

    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 安全策略 ID 列表，ID 格式为 tls- 后接 8 位字母数字。
    */
    @SerializedName("SecurityPolicyIds")
    @Expose
    private String [] SecurityPolicyIds;

    /**
     * Get 过滤条件列表，用于筛选符合指定条件的安全策略。多个过滤条件之间为"与"关系。

**支持的过滤条件：**
- **SecurityPolicyNames**：按安全策略名称筛选，支持模糊匹配。
- **tag:tag-key**：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 `tag:env` 表示按标签键 `env` 筛选。

**说明：** 每个过滤条件最多支持 10 个取值。
 
     * @return Filters 过滤条件列表，用于筛选符合指定条件的安全策略。多个过滤条件之间为"与"关系。

**支持的过滤条件：**
- **SecurityPolicyNames**：按安全策略名称筛选，支持模糊匹配。
- **tag:tag-key**：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 `tag:env` 表示按标签键 `env` 筛选。

**说明：** 每个过滤条件最多支持 10 个取值。

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件列表，用于筛选符合指定条件的安全策略。多个过滤条件之间为"与"关系。

**支持的过滤条件：**
- **SecurityPolicyNames**：按安全策略名称筛选，支持模糊匹配。
- **tag:tag-key**：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 `tag:env` 表示按标签键 `env` 筛选。

**说明：** 每个过滤条件最多支持 10 个取值。

     * @param Filters 过滤条件列表，用于筛选符合指定条件的安全策略。多个过滤条件之间为"与"关系。

**支持的过滤条件：**
- **SecurityPolicyNames**：按安全策略名称筛选，支持模糊匹配。
- **tag:tag-key**：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 `tag:env` 表示按标签键 `env` 筛选。

**说明：** 每个过滤条件最多支持 10 个取值。

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 单次请求返回的最大结果数。用于分页查询，与 NextToken 配合使用。

**取值范围：** 1~100。

**默认值：** 20。
 
     * @return MaxResults 单次请求返回的最大结果数。用于分页查询，与 NextToken 配合使用。

**取值范围：** 1~100。

**默认值：** 20。

     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 单次请求返回的最大结果数。用于分页查询，与 NextToken 配合使用。

**取值范围：** 1~100。

**默认值：** 20。

     * @param MaxResults 单次请求返回的最大结果数。用于分页查询，与 NextToken 配合使用。

**取值范围：** 1~100。

**默认值：** 20。

     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 分页查询的起始令牌。用于获取下一页结果数据。

**使用说明：**
- 首次查询时无需设置此参数。
- 如果上一次查询返回了 NextToken，表示还有更多数据，请将该值传入此参数以获取下一页。
- 若上一次查询未返回 NextToken 或返回为空，表示已是最后一页。
 
     * @return NextToken 分页查询的起始令牌。用于获取下一页结果数据。

**使用说明：**
- 首次查询时无需设置此参数。
- 如果上一次查询返回了 NextToken，表示还有更多数据，请将该值传入此参数以获取下一页。
- 若上一次查询未返回 NextToken 或返回为空，表示已是最后一页。

     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 分页查询的起始令牌。用于获取下一页结果数据。

**使用说明：**
- 首次查询时无需设置此参数。
- 如果上一次查询返回了 NextToken，表示还有更多数据，请将该值传入此参数以获取下一页。
- 若上一次查询未返回 NextToken 或返回为空，表示已是最后一页。

     * @param NextToken 分页查询的起始令牌。用于获取下一页结果数据。

**使用说明：**
- 首次查询时无需设置此参数。
- 如果上一次查询返回了 NextToken，表示还有更多数据，请将该值传入此参数以获取下一页。
- 若上一次查询未返回 NextToken 或返回为空，表示已是最后一页。

     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 安全策略 ID 列表，ID 格式为 tls- 后接 8 位字母数字。 
     * @return SecurityPolicyIds 安全策略 ID 列表，ID 格式为 tls- 后接 8 位字母数字。
     */
    public String [] getSecurityPolicyIds() {
        return this.SecurityPolicyIds;
    }

    /**
     * Set 安全策略 ID 列表，ID 格式为 tls- 后接 8 位字母数字。
     * @param SecurityPolicyIds 安全策略 ID 列表，ID 格式为 tls- 后接 8 位字母数字。
     */
    public void setSecurityPolicyIds(String [] SecurityPolicyIds) {
        this.SecurityPolicyIds = SecurityPolicyIds;
    }

    public DescribeSecurityPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPoliciesRequest(DescribeSecurityPoliciesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.SecurityPolicyIds != null) {
            this.SecurityPolicyIds = new String[source.SecurityPolicyIds.length];
            for (int i = 0; i < source.SecurityPolicyIds.length; i++) {
                this.SecurityPolicyIds[i] = new String(source.SecurityPolicyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArraySimple(map, prefix + "SecurityPolicyIds.", this.SecurityPolicyIds);

    }
}

