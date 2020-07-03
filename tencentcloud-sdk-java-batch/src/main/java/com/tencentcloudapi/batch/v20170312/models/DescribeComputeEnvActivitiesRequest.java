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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComputeEnvActivitiesRequest extends AbstractModel{

    /**
    * 计算环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件
<li> compute-node-id - String - 是否必填：否 -（过滤条件）按照计算节点ID过滤。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
     * Get 计算环境ID 
     * @return EnvId 计算环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 计算环境ID
     * @param EnvId 计算环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量 
     * @return Limit 返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量
     * @param Limit 返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件
<li> compute-node-id - String - 是否必填：否 -（过滤条件）按照计算节点ID过滤。</li> 
     * @return Filters 过滤条件
<li> compute-node-id - String - 是否必填：否 -（过滤条件）按照计算节点ID过滤。</li>
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
<li> compute-node-id - String - 是否必填：否 -（过滤条件）按照计算节点ID过滤。</li>
     * @param Filters 过滤条件
<li> compute-node-id - String - 是否必填：否 -（过滤条件）按照计算节点ID过滤。</li>
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "Filters.", this.Filters);

    }
}

