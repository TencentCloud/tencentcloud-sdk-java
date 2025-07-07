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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelDescribeRolesRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 指定每页返回的数据条数，和Offset参数配合使用，单页最大200。

注: `因为历史原因, 此字段为字符串类型`
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * 查询的关键字段:
Key:"**RoleType**",Values:["**1**"]查询系统角色，
Key:"**RoleType**",Values:["**2**"]查询自定义角色
Key:"**RoleStatus**",Values:["**1**"]查询启用角色
Key:"**RoleStatus**",Values:["**2**"]查询禁用角色
Key:"**IsReturnPermissionGroup**"，Values:["**0**"]表示接口不返回角色对应的权限树字段
Key:"**IsReturnPermissionGroup**"，Values:["**1**"]表示接口返回角色对应的权限树字段

注: `同名字的Key的过滤条件会冲突, 只能填写一个`

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用，最大2000条。

注：
1.`offset从0开始，即第一页为0。`
2.`默认从第一页返回。`
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 指定每页返回的数据条数，和Offset参数配合使用，单页最大200。

注: `因为历史原因, 此字段为字符串类型` 
     * @return Limit 指定每页返回的数据条数，和Offset参数配合使用，单页最大200。

注: `因为历史原因, 此字段为字符串类型`
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定每页返回的数据条数，和Offset参数配合使用，单页最大200。

注: `因为历史原因, 此字段为字符串类型`
     * @param Limit 指定每页返回的数据条数，和Offset参数配合使用，单页最大200。

注: `因为历史原因, 此字段为字符串类型`
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询的关键字段:
Key:"**RoleType**",Values:["**1**"]查询系统角色，
Key:"**RoleType**",Values:["**2**"]查询自定义角色
Key:"**RoleStatus**",Values:["**1**"]查询启用角色
Key:"**RoleStatus**",Values:["**2**"]查询禁用角色
Key:"**IsReturnPermissionGroup**"，Values:["**0**"]表示接口不返回角色对应的权限树字段
Key:"**IsReturnPermissionGroup**"，Values:["**1**"]表示接口返回角色对应的权限树字段

注: `同名字的Key的过滤条件会冲突, 只能填写一个`
 
     * @return Filters 查询的关键字段:
Key:"**RoleType**",Values:["**1**"]查询系统角色，
Key:"**RoleType**",Values:["**2**"]查询自定义角色
Key:"**RoleStatus**",Values:["**1**"]查询启用角色
Key:"**RoleStatus**",Values:["**2**"]查询禁用角色
Key:"**IsReturnPermissionGroup**"，Values:["**0**"]表示接口不返回角色对应的权限树字段
Key:"**IsReturnPermissionGroup**"，Values:["**1**"]表示接口返回角色对应的权限树字段

注: `同名字的Key的过滤条件会冲突, 只能填写一个`

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询的关键字段:
Key:"**RoleType**",Values:["**1**"]查询系统角色，
Key:"**RoleType**",Values:["**2**"]查询自定义角色
Key:"**RoleStatus**",Values:["**1**"]查询启用角色
Key:"**RoleStatus**",Values:["**2**"]查询禁用角色
Key:"**IsReturnPermissionGroup**"，Values:["**0**"]表示接口不返回角色对应的权限树字段
Key:"**IsReturnPermissionGroup**"，Values:["**1**"]表示接口返回角色对应的权限树字段

注: `同名字的Key的过滤条件会冲突, 只能填写一个`

     * @param Filters 查询的关键字段:
Key:"**RoleType**",Values:["**1**"]查询系统角色，
Key:"**RoleType**",Values:["**2**"]查询自定义角色
Key:"**RoleStatus**",Values:["**1**"]查询启用角色
Key:"**RoleStatus**",Values:["**2**"]查询禁用角色
Key:"**IsReturnPermissionGroup**"，Values:["**0**"]表示接口不返回角色对应的权限树字段
Key:"**IsReturnPermissionGroup**"，Values:["**1**"]表示接口返回角色对应的权限树字段

注: `同名字的Key的过滤条件会冲突, 只能填写一个`

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用，最大2000条。

注：
1.`offset从0开始，即第一页为0。`
2.`默认从第一页返回。` 
     * @return Offset 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用，最大2000条。

注：
1.`offset从0开始，即第一页为0。`
2.`默认从第一页返回。`
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用，最大2000条。

注：
1.`offset从0开始，即第一页为0。`
2.`默认从第一页返回。`
     * @param Offset 查询结果分页返回，指定从第几页返回数据，和Limit参数配合使用，最大2000条。

注：
1.`offset从0开始，即第一页为0。`
2.`默认从第一页返回。`
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelDescribeRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDescribeRolesRequest(ChannelDescribeRolesRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
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
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

