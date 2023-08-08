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
    * 操作人信息，UserId必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 指定每页多少条数据，单页最大200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 查询的关键字段:
Key:"RoleType",Values:["1"]查询系统角色，Values:["2"]查询自定义角色
Key:"RoleStatus",Values:["1"]查询启用角色，Values:["2"]查询禁用角色
Key:"IsGroupRole"，Values:["0"],查询非集团角色，Values:["1"]表示查询集团角色
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询结果分页返回，此处指定第几页，如果不传默认从第一页返回。页码从 0 开始，即首页为 0，最大2000
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 操作人信息，UserId必填 
     * @return Operator 操作人信息，UserId必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息，UserId必填
     * @param Operator 操作人信息，UserId必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 指定每页多少条数据，单页最大200 
     * @return Limit 指定每页多少条数据，单页最大200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定每页多少条数据，单页最大200
     * @param Limit 指定每页多少条数据，单页最大200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 查询的关键字段:
Key:"RoleType",Values:["1"]查询系统角色，Values:["2"]查询自定义角色
Key:"RoleStatus",Values:["1"]查询启用角色，Values:["2"]查询禁用角色
Key:"IsGroupRole"，Values:["0"],查询非集团角色，Values:["1"]表示查询集团角色 
     * @return Filters 查询的关键字段:
Key:"RoleType",Values:["1"]查询系统角色，Values:["2"]查询自定义角色
Key:"RoleStatus",Values:["1"]查询启用角色，Values:["2"]查询禁用角色
Key:"IsGroupRole"，Values:["0"],查询非集团角色，Values:["1"]表示查询集团角色
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询的关键字段:
Key:"RoleType",Values:["1"]查询系统角色，Values:["2"]查询自定义角色
Key:"RoleStatus",Values:["1"]查询启用角色，Values:["2"]查询禁用角色
Key:"IsGroupRole"，Values:["0"],查询非集团角色，Values:["1"]表示查询集团角色
     * @param Filters 查询的关键字段:
Key:"RoleType",Values:["1"]查询系统角色，Values:["2"]查询自定义角色
Key:"RoleStatus",Values:["1"]查询启用角色，Values:["2"]查询禁用角色
Key:"IsGroupRole"，Values:["0"],查询非集团角色，Values:["1"]表示查询集团角色
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询结果分页返回，此处指定第几页，如果不传默认从第一页返回。页码从 0 开始，即首页为 0，最大2000 
     * @return Offset 查询结果分页返回，此处指定第几页，如果不传默认从第一页返回。页码从 0 开始，即首页为 0，最大2000
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询结果分页返回，此处指定第几页，如果不传默认从第一页返回。页码从 0 开始，即首页为 0，最大2000
     * @param Offset 查询结果分页返回，此处指定第几页，如果不传默认从第一页返回。页码从 0 开始，即首页为 0，最大2000
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

