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

public class CreateIntegrationUserRolesRequest extends AbstractModel{

    /**
    * 操作人信息，UserId必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 绑定角色的用户id列表，不能重复，不能大于 100 个
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 绑定角色的角色id列表，不能重复，不能大于 100，可以通过DescribeIntegrationRoles接口获取
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

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
     * Get 绑定角色的用户id列表，不能重复，不能大于 100 个 
     * @return UserIds 绑定角色的用户id列表，不能重复，不能大于 100 个
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 绑定角色的用户id列表，不能重复，不能大于 100 个
     * @param UserIds 绑定角色的用户id列表，不能重复，不能大于 100 个
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 绑定角色的角色id列表，不能重复，不能大于 100，可以通过DescribeIntegrationRoles接口获取 
     * @return RoleIds 绑定角色的角色id列表，不能重复，不能大于 100，可以通过DescribeIntegrationRoles接口获取
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set 绑定角色的角色id列表，不能重复，不能大于 100，可以通过DescribeIntegrationRoles接口获取
     * @param RoleIds 绑定角色的角色id列表，不能重复，不能大于 100，可以通过DescribeIntegrationRoles接口获取
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
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

    public CreateIntegrationUserRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIntegrationUserRolesRequest(CreateIntegrationUserRolesRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
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
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

