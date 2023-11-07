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

public class DeleteIntegrationRoleUsersRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 角色id，可以通过DescribeIntegrationRoles接口获取角色信息
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 用户信息,最多 200 个用户，并且 UserId 和 OpenId 二选一，其他字段不需要传
    */
    @SerializedName("Users")
    @Expose
    private UserInfo [] Users;

    /**
    * 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。 
     * @return Operator 执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     * @param Operator 执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 角色id，可以通过DescribeIntegrationRoles接口获取角色信息 
     * @return RoleId 角色id，可以通过DescribeIntegrationRoles接口获取角色信息
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色id，可以通过DescribeIntegrationRoles接口获取角色信息
     * @param RoleId 角色id，可以通过DescribeIntegrationRoles接口获取角色信息
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 用户信息,最多 200 个用户，并且 UserId 和 OpenId 二选一，其他字段不需要传 
     * @return Users 用户信息,最多 200 个用户，并且 UserId 和 OpenId 二选一，其他字段不需要传
     */
    public UserInfo [] getUsers() {
        return this.Users;
    }

    /**
     * Set 用户信息,最多 200 个用户，并且 UserId 和 OpenId 二选一，其他字段不需要传
     * @param Users 用户信息,最多 200 个用户，并且 UserId 和 OpenId 二选一，其他字段不需要传
     */
    public void setUsers(UserInfo [] Users) {
        this.Users = Users;
    }

    /**
     * Get 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public DeleteIntegrationRoleUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIntegrationRoleUsersRequest(DeleteIntegrationRoleUsersRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.Users != null) {
            this.Users = new UserInfo[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new UserInfo(source.Users[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamArrayObj(map, prefix + "Users.", this.Users);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

