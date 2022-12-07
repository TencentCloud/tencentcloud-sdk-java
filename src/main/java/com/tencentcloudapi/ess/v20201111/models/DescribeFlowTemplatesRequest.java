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
    * 调用方用户信息，userId 必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 企业组织相关信息
    */
    @SerializedName("Organization")
    @Expose
    private OrganizationInfo Organization;

    /**
    * 应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 查询偏移位置，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询个数，默认20，最大200
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
    * 这个参数跟下面的IsChannel参数配合使用。
IsChannel=false时，ApplicationId参数不起任何作用。
IsChannel=true时，ApplicationId为空，查询所有渠道模板列表；ApplicationId不为空，查询指定渠道下的模板列表
ApplicationId为空，查询渠道模板列表
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 默认为false，查询SaaS模板库列表；
为true，查询渠道模板库管理列表
    */
    @SerializedName("IsChannel")
    @Expose
    private Boolean IsChannel;

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
     * Get 调用方用户信息，userId 必填 
     * @return Operator 调用方用户信息，userId 必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填
     * @param Operator 调用方用户信息，userId 必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 企业组织相关信息 
     * @return Organization 企业组织相关信息
     */
    public OrganizationInfo getOrganization() {
        return this.Organization;
    }

    /**
     * Set 企业组织相关信息
     * @param Organization 企业组织相关信息
     */
    public void setOrganization(OrganizationInfo Organization) {
        this.Organization = Organization;
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
     * Get 查询个数，默认20，最大200 
     * @return Limit 查询个数，默认20，最大200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询个数，默认20，最大200
     * @param Limit 查询个数，默认20，最大200
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
     * Get 这个参数跟下面的IsChannel参数配合使用。
IsChannel=false时，ApplicationId参数不起任何作用。
IsChannel=true时，ApplicationId为空，查询所有渠道模板列表；ApplicationId不为空，查询指定渠道下的模板列表
ApplicationId为空，查询渠道模板列表 
     * @return ApplicationId 这个参数跟下面的IsChannel参数配合使用。
IsChannel=false时，ApplicationId参数不起任何作用。
IsChannel=true时，ApplicationId为空，查询所有渠道模板列表；ApplicationId不为空，查询指定渠道下的模板列表
ApplicationId为空，查询渠道模板列表
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 这个参数跟下面的IsChannel参数配合使用。
IsChannel=false时，ApplicationId参数不起任何作用。
IsChannel=true时，ApplicationId为空，查询所有渠道模板列表；ApplicationId不为空，查询指定渠道下的模板列表
ApplicationId为空，查询渠道模板列表
     * @param ApplicationId 这个参数跟下面的IsChannel参数配合使用。
IsChannel=false时，ApplicationId参数不起任何作用。
IsChannel=true时，ApplicationId为空，查询所有渠道模板列表；ApplicationId不为空，查询指定渠道下的模板列表
ApplicationId为空，查询渠道模板列表
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 默认为false，查询SaaS模板库列表；
为true，查询渠道模板库管理列表 
     * @return IsChannel 默认为false，查询SaaS模板库列表；
为true，查询渠道模板库管理列表
     */
    public Boolean getIsChannel() {
        return this.IsChannel;
    }

    /**
     * Set 默认为false，查询SaaS模板库列表；
为true，查询渠道模板库管理列表
     * @param IsChannel 默认为false，查询SaaS模板库列表；
为true，查询渠道模板库管理列表
     */
    public void setIsChannel(Boolean IsChannel) {
        this.IsChannel = IsChannel;
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
        if (source.Organization != null) {
            this.Organization = new OrganizationInfo(source.Organization);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
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
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.IsChannel != null) {
            this.IsChannel = new Boolean(source.IsChannel);
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
        this.setParamObj(map, prefix + "Organization.", this.Organization);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "IsChannel", this.IsChannel);
        this.setParamSimple(map, prefix + "GenerateSource", this.GenerateSource);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);

    }
}

