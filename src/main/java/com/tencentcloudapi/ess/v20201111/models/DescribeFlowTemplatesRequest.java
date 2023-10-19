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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowTemplatesRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 查询内容控制

<ul><li>**0**：模板列表及详情（默认）</li>
<li>**1**：仅模板列表</li></ul>
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * 搜索条件，本字段用于指定模板Id进行查询。
Key：template-id Values：需要查询的模板Id列表
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。

注：`1.offset从0开始，即第一页为0。`
`2.默认从第一页返回。`
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 指定每页返回的数据条数，和Offset参数配合使用。

注：`1.默认值为20，单页做大值为200。`
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 指定查询的应用号，指定后查询该应用号下的模板列表。

注：`1.ApplicationId为空时，查询所有应用下的模板列表。`
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 默认为false，查询SaaS模板库列表；
为true，查询第三方应用集成平台企业模板库管理列表
    */
    @SerializedName("IsChannel")
    @Expose
    private Boolean IsChannel;

    /**
    * 暂未开放
    */
    @SerializedName("Organization")
    @Expose
    private OrganizationInfo Organization;

    /**
    * 暂未开放
    */
    @SerializedName("GenerateSource")
    @Expose
    private Long GenerateSource;

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 查询内容控制

<ul><li>**0**：模板列表及详情（默认）</li>
<li>**1**：仅模板列表</li></ul> 
     * @return ContentType 查询内容控制

<ul><li>**0**：模板列表及详情（默认）</li>
<li>**1**：仅模板列表</li></ul>
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set 查询内容控制

<ul><li>**0**：模板列表及详情（默认）</li>
<li>**1**：仅模板列表</li></ul>
     * @param ContentType 查询内容控制

<ul><li>**0**：模板列表及详情（默认）</li>
<li>**1**：仅模板列表</li></ul>
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 搜索条件，本字段用于指定模板Id进行查询。
Key：template-id Values：需要查询的模板Id列表 
     * @return Filters 搜索条件，本字段用于指定模板Id进行查询。
Key：template-id Values：需要查询的模板Id列表
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 搜索条件，本字段用于指定模板Id进行查询。
Key：template-id Values：需要查询的模板Id列表
     * @param Filters 搜索条件，本字段用于指定模板Id进行查询。
Key：template-id Values：需要查询的模板Id列表
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。

注：`1.offset从0开始，即第一页为0。`
`2.默认从第一页返回。` 
     * @return Offset 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。

注：`1.offset从0开始，即第一页为0。`
`2.默认从第一页返回。`
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。

注：`1.offset从0开始，即第一页为0。`
`2.默认从第一页返回。`
     * @param Offset 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用。

注：`1.offset从0开始，即第一页为0。`
`2.默认从第一页返回。`
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 指定每页返回的数据条数，和Offset参数配合使用。

注：`1.默认值为20，单页做大值为200。` 
     * @return Limit 指定每页返回的数据条数，和Offset参数配合使用。

注：`1.默认值为20，单页做大值为200。`
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定每页返回的数据条数，和Offset参数配合使用。

注：`1.默认值为20，单页做大值为200。`
     * @param Limit 指定每页返回的数据条数，和Offset参数配合使用。

注：`1.默认值为20，单页做大值为200。`
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 指定查询的应用号，指定后查询该应用号下的模板列表。

注：`1.ApplicationId为空时，查询所有应用下的模板列表。` 
     * @return ApplicationId 指定查询的应用号，指定后查询该应用号下的模板列表。

注：`1.ApplicationId为空时，查询所有应用下的模板列表。`
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 指定查询的应用号，指定后查询该应用号下的模板列表。

注：`1.ApplicationId为空时，查询所有应用下的模板列表。`
     * @param ApplicationId 指定查询的应用号，指定后查询该应用号下的模板列表。

注：`1.ApplicationId为空时，查询所有应用下的模板列表。`
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 默认为false，查询SaaS模板库列表；
为true，查询第三方应用集成平台企业模板库管理列表 
     * @return IsChannel 默认为false，查询SaaS模板库列表；
为true，查询第三方应用集成平台企业模板库管理列表
     * @deprecated
     */
    @Deprecated
    public Boolean getIsChannel() {
        return this.IsChannel;
    }

    /**
     * Set 默认为false，查询SaaS模板库列表；
为true，查询第三方应用集成平台企业模板库管理列表
     * @param IsChannel 默认为false，查询SaaS模板库列表；
为true，查询第三方应用集成平台企业模板库管理列表
     * @deprecated
     */
    @Deprecated
    public void setIsChannel(Boolean IsChannel) {
        this.IsChannel = IsChannel;
    }

    /**
     * Get 暂未开放 
     * @return Organization 暂未开放
     * @deprecated
     */
    @Deprecated
    public OrganizationInfo getOrganization() {
        return this.Organization;
    }

    /**
     * Set 暂未开放
     * @param Organization 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOrganization(OrganizationInfo Organization) {
        this.Organization = Organization;
    }

    /**
     * Get 暂未开放 
     * @return GenerateSource 暂未开放
     * @deprecated
     */
    @Deprecated
    public Long getGenerateSource() {
        return this.GenerateSource;
    }

    /**
     * Set 暂未开放
     * @param GenerateSource 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setGenerateSource(Long GenerateSource) {
        this.GenerateSource = GenerateSource;
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
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
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
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.IsChannel != null) {
            this.IsChannel = new Boolean(source.IsChannel);
        }
        if (source.Organization != null) {
            this.Organization = new OrganizationInfo(source.Organization);
        }
        if (source.GenerateSource != null) {
            this.GenerateSource = new Long(source.GenerateSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "IsChannel", this.IsChannel);
        this.setParamObj(map, prefix + "Organization.", this.Organization);
        this.setParamSimple(map, prefix + "GenerateSource", this.GenerateSource);

    }
}

