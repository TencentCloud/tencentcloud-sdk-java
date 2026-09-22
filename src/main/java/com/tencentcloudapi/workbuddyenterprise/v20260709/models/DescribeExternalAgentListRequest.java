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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExternalAgentListRequest extends AbstractModel {

    /**
    * Agent 业务 ID（必填：绑定状态的归属主体）
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * 标准过滤条件，支持的 Name：Bound（BOUND=仅已绑定 / UNBOUND=仅未绑定 / ALL=全部，缺省 ALL）
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，从 0 开始，默认 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量，默认 20，最大 200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 外部 Agent 列表查询关键字
    */
    @SerializedName("DescribeExternalAgentList")
    @Expose
    private String DescribeExternalAgentList;

    /**
    * 版本 ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get Agent 业务 ID（必填：绑定状态的归属主体） 
     * @return AgentId Agent 业务 ID（必填：绑定状态的归属主体）
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set Agent 业务 ID（必填：绑定状态的归属主体）
     * @param AgentId Agent 业务 ID（必填：绑定状态的归属主体）
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get 标准过滤条件，支持的 Name：Bound（BOUND=仅已绑定 / UNBOUND=仅未绑定 / ALL=全部，缺省 ALL） 
     * @return Filters 标准过滤条件，支持的 Name：Bound（BOUND=仅已绑定 / UNBOUND=仅未绑定 / ALL=全部，缺省 ALL）
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 标准过滤条件，支持的 Name：Bound（BOUND=仅已绑定 / UNBOUND=仅未绑定 / ALL=全部，缺省 ALL）
     * @param Filters 标准过滤条件，支持的 Name：Bound（BOUND=仅已绑定 / UNBOUND=仅未绑定 / ALL=全部，缺省 ALL）
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，从 0 开始，默认 0 
     * @return Offset 偏移量，从 0 开始，默认 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，从 0 开始，默认 0
     * @param Offset 偏移量，从 0 开始，默认 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量，默认 20，最大 200 
     * @return Limit 每页数量，默认 20，最大 200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，默认 20，最大 200
     * @param Limit 每页数量，默认 20，最大 200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 外部 Agent 列表查询关键字 
     * @return DescribeExternalAgentList 外部 Agent 列表查询关键字
     */
    public String getDescribeExternalAgentList() {
        return this.DescribeExternalAgentList;
    }

    /**
     * Set 外部 Agent 列表查询关键字
     * @param DescribeExternalAgentList 外部 Agent 列表查询关键字
     */
    public void setDescribeExternalAgentList(String DescribeExternalAgentList) {
        this.DescribeExternalAgentList = DescribeExternalAgentList;
    }

    /**
     * Get 版本 ID 
     * @return VersionId 版本 ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本 ID
     * @param VersionId 版本 ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    public DescribeExternalAgentListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExternalAgentListRequest(DescribeExternalAgentListRequest source) {
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DescribeExternalAgentList != null) {
            this.DescribeExternalAgentList = new String(source.DescribeExternalAgentList);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DescribeExternalAgentList", this.DescribeExternalAgentList);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}

