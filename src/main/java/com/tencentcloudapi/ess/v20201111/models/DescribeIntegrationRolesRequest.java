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

public class DescribeIntegrationRolesRequest extends AbstractModel{

    /**
    * 执行本接口操作的员工信息。使用此接口时，必须填写UserId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 指定分页每页返回的数据条数，单页最大支持 200。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 查询的关键字段，支持Key-Value单值查询。可选键值对如下：
<ul>
  <li>Key:"RoleType"，查询角色类型，Values可选：
    <ul><li>**"1"**：查询系统角色</li><li>**"2"**：查询自定义角色</li></ul>
  </li><li>Key:"RoleStatus"，查询角色状态，Values可选：
    <ul><li>**"1"**：查询启用角色</li><li>**"2"**：查询禁用角色</li></ul>
  </li><li>Key:"IsGroupRole"，是否查询集团角色，Values可选：
    <ul><li>**"0"**：查询非集团角色</li><li>**"1"**：查询集团角色</li></ul>
  </li><li>Key:"IsReturnPermissionGroup"，是否返回角色对应权限树，Values可选：
    <ul><li>**"0"**：接口不返回角色对应的权限树字段</li><li>**"1"**：接口返回角色对应的权限树字段</li></ul>
  </li>
</ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 指定分页返回第几页的数据，如果不传默认返回第一页。页码从 0 开始，即首页为 0，最大2000。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 执行本接口操作的员工信息。使用此接口时，必须填写UserId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。 
     * @return Operator 执行本接口操作的员工信息。使用此接口时，必须填写UserId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。使用此接口时，必须填写UserId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     * @param Operator 执行本接口操作的员工信息。使用此接口时，必须填写UserId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 指定分页每页返回的数据条数，单页最大支持 200。 
     * @return Limit 指定分页每页返回的数据条数，单页最大支持 200。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定分页每页返回的数据条数，单页最大支持 200。
     * @param Limit 指定分页每页返回的数据条数，单页最大支持 200。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get 查询的关键字段，支持Key-Value单值查询。可选键值对如下：
<ul>
  <li>Key:"RoleType"，查询角色类型，Values可选：
    <ul><li>**"1"**：查询系统角色</li><li>**"2"**：查询自定义角色</li></ul>
  </li><li>Key:"RoleStatus"，查询角色状态，Values可选：
    <ul><li>**"1"**：查询启用角色</li><li>**"2"**：查询禁用角色</li></ul>
  </li><li>Key:"IsGroupRole"，是否查询集团角色，Values可选：
    <ul><li>**"0"**：查询非集团角色</li><li>**"1"**：查询集团角色</li></ul>
  </li><li>Key:"IsReturnPermissionGroup"，是否返回角色对应权限树，Values可选：
    <ul><li>**"0"**：接口不返回角色对应的权限树字段</li><li>**"1"**：接口返回角色对应的权限树字段</li></ul>
  </li>
</ul> 
     * @return Filters 查询的关键字段，支持Key-Value单值查询。可选键值对如下：
<ul>
  <li>Key:"RoleType"，查询角色类型，Values可选：
    <ul><li>**"1"**：查询系统角色</li><li>**"2"**：查询自定义角色</li></ul>
  </li><li>Key:"RoleStatus"，查询角色状态，Values可选：
    <ul><li>**"1"**：查询启用角色</li><li>**"2"**：查询禁用角色</li></ul>
  </li><li>Key:"IsGroupRole"，是否查询集团角色，Values可选：
    <ul><li>**"0"**：查询非集团角色</li><li>**"1"**：查询集团角色</li></ul>
  </li><li>Key:"IsReturnPermissionGroup"，是否返回角色对应权限树，Values可选：
    <ul><li>**"0"**：接口不返回角色对应的权限树字段</li><li>**"1"**：接口返回角色对应的权限树字段</li></ul>
  </li>
</ul>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询的关键字段，支持Key-Value单值查询。可选键值对如下：
<ul>
  <li>Key:"RoleType"，查询角色类型，Values可选：
    <ul><li>**"1"**：查询系统角色</li><li>**"2"**：查询自定义角色</li></ul>
  </li><li>Key:"RoleStatus"，查询角色状态，Values可选：
    <ul><li>**"1"**：查询启用角色</li><li>**"2"**：查询禁用角色</li></ul>
  </li><li>Key:"IsGroupRole"，是否查询集团角色，Values可选：
    <ul><li>**"0"**：查询非集团角色</li><li>**"1"**：查询集团角色</li></ul>
  </li><li>Key:"IsReturnPermissionGroup"，是否返回角色对应权限树，Values可选：
    <ul><li>**"0"**：接口不返回角色对应的权限树字段</li><li>**"1"**：接口返回角色对应的权限树字段</li></ul>
  </li>
</ul>
     * @param Filters 查询的关键字段，支持Key-Value单值查询。可选键值对如下：
<ul>
  <li>Key:"RoleType"，查询角色类型，Values可选：
    <ul><li>**"1"**：查询系统角色</li><li>**"2"**：查询自定义角色</li></ul>
  </li><li>Key:"RoleStatus"，查询角色状态，Values可选：
    <ul><li>**"1"**：查询启用角色</li><li>**"2"**：查询禁用角色</li></ul>
  </li><li>Key:"IsGroupRole"，是否查询集团角色，Values可选：
    <ul><li>**"0"**：查询非集团角色</li><li>**"1"**：查询集团角色</li></ul>
  </li><li>Key:"IsReturnPermissionGroup"，是否返回角色对应权限树，Values可选：
    <ul><li>**"0"**：接口不返回角色对应的权限树字段</li><li>**"1"**：接口返回角色对应的权限树字段</li></ul>
  </li>
</ul>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 指定分页返回第几页的数据，如果不传默认返回第一页。页码从 0 开始，即首页为 0，最大2000。 
     * @return Offset 指定分页返回第几页的数据，如果不传默认返回第一页。页码从 0 开始，即首页为 0，最大2000。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 指定分页返回第几页的数据，如果不传默认返回第一页。页码从 0 开始，即首页为 0，最大2000。
     * @param Offset 指定分页返回第几页的数据，如果不传默认返回第一页。页码从 0 开始，即首页为 0，最大2000。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeIntegrationRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationRolesRequest(DescribeIntegrationRolesRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

