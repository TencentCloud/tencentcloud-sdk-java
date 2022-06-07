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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowTemplatesRequest extends AbstractModel{

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 查询偏移位置，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询个数，默认20，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索条件，具体参考Filter结构体。本接口取值：template-id：按照【 **模板唯一标识** 】进行过滤
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 暂未开放
    */
    @SerializedName("GenerateSource")
    @Expose
    private Long GenerateSource;

    /**
    * 查询内容：0-模板列表及详情（默认），1-仅模板列表
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 查询偏移位置，默认0 
     * @return Offset 查询偏移位置，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移位置，默认0
     * @param Offset 查询偏移位置，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询个数，默认20，最大100 
     * @return Limit 查询个数，默认20，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询个数，默认20，最大100
     * @param Limit 查询个数，默认20，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索条件，具体参考Filter结构体。本接口取值：template-id：按照【 **模板唯一标识** 】进行过滤 
     * @return Filters 搜索条件，具体参考Filter结构体。本接口取值：template-id：按照【 **模板唯一标识** 】进行过滤
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 搜索条件，具体参考Filter结构体。本接口取值：template-id：按照【 **模板唯一标识** 】进行过滤
     * @param Filters 搜索条件，具体参考Filter结构体。本接口取值：template-id：按照【 **模板唯一标识** 】进行过滤
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 应用相关信息 
     * @return Agent 应用相关信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息
     * @param Agent 应用相关信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 暂未开放 
     * @return GenerateSource 暂未开放
     */
    public Long getGenerateSource() {
        return this.GenerateSource;
    }

    /**
     * Set 暂未开放
     * @param GenerateSource 暂未开放
     */
    public void setGenerateSource(Long GenerateSource) {
        this.GenerateSource = GenerateSource;
    }

    /**
     * Get 查询内容：0-模板列表及详情（默认），1-仅模板列表 
     * @return ContentType 查询内容：0-模板列表及详情（默认），1-仅模板列表
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set 查询内容：0-模板列表及详情（默认），1-仅模板列表
     * @param ContentType 查询内容：0-模板列表及详情（默认），1-仅模板列表
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    public DescribeFlowTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowTemplatesRequest(DescribeFlowTemplatesRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.GenerateSource != null) {
            this.GenerateSource = new Long(source.GenerateSource);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "GenerateSource", this.GenerateSource);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);

    }
}

