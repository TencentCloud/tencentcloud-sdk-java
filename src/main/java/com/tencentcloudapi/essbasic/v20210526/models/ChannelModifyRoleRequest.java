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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelModifyRoleRequest extends AbstractModel{

    /**
    * 代理企业和员工的信息。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 角色名称，最大长度为20个字符，仅限中文、字母、数字和下划线组成。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 角色Id，可通过接口 ChannelDescribeRoles 查询获取
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 角色描述，最大长度为50个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 权限树，权限树内容 PermissionGroups 可参考接口 DescribeIntegrationRoles 的输出
    */
    @SerializedName("PermissionGroups")
    @Expose
    private PermissionGroup [] PermissionGroups;

    /**
     * Get 代理企业和员工的信息。 
     * @return Agent 代理企业和员工的信息。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
     * @param Agent 代理企业和员工的信息。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 角色名称，最大长度为20个字符，仅限中文、字母、数字和下划线组成。 
     * @return Name 角色名称，最大长度为20个字符，仅限中文、字母、数字和下划线组成。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 角色名称，最大长度为20个字符，仅限中文、字母、数字和下划线组成。
     * @param Name 角色名称，最大长度为20个字符，仅限中文、字母、数字和下划线组成。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 角色Id，可通过接口 ChannelDescribeRoles 查询获取 
     * @return RoleId 角色Id，可通过接口 ChannelDescribeRoles 查询获取
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色Id，可通过接口 ChannelDescribeRoles 查询获取
     * @param RoleId 角色Id，可通过接口 ChannelDescribeRoles 查询获取
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 角色描述，最大长度为50个字符 
     * @return Description 角色描述，最大长度为50个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 角色描述，最大长度为50个字符
     * @param Description 角色描述，最大长度为50个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 权限树，权限树内容 PermissionGroups 可参考接口 DescribeIntegrationRoles 的输出 
     * @return PermissionGroups 权限树，权限树内容 PermissionGroups 可参考接口 DescribeIntegrationRoles 的输出
     */
    public PermissionGroup [] getPermissionGroups() {
        return this.PermissionGroups;
    }

    /**
     * Set 权限树，权限树内容 PermissionGroups 可参考接口 DescribeIntegrationRoles 的输出
     * @param PermissionGroups 权限树，权限树内容 PermissionGroups 可参考接口 DescribeIntegrationRoles 的输出
     */
    public void setPermissionGroups(PermissionGroup [] PermissionGroups) {
        this.PermissionGroups = PermissionGroups;
    }

    public ChannelModifyRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelModifyRoleRequest(ChannelModifyRoleRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PermissionGroups != null) {
            this.PermissionGroups = new PermissionGroup[source.PermissionGroups.length];
            for (int i = 0; i < source.PermissionGroups.length; i++) {
                this.PermissionGroups[i] = new PermissionGroup(source.PermissionGroups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "PermissionGroups.", this.PermissionGroups);

    }
}

