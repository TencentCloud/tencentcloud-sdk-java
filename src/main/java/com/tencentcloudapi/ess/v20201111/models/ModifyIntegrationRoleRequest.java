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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIntegrationRoleRequest extends AbstractModel {

    /**
    * <p>角色Id，可通过接口 DescribeIntegrationRoles 查询获取</p>
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * <p>角色名称，最大长度为20个字符，仅限中文、字母、数字和下划线组成。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。<br>支持填入集团子公司经办人 userId 代发合同。</p><p>注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>角色描述，最大长度为50个字符</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>权限树</p>
    */
    @SerializedName("PermissionGroups")
    @Expose
    private PermissionGroup [] PermissionGroups;

    /**
    * <p>集团角色的话，需要传递集团子企业列表，如果是全选，则传1</p>
    */
    @SerializedName("SubOrganizationIds")
    @Expose
    private String [] SubOrganizationIds;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get <p>角色Id，可通过接口 DescribeIntegrationRoles 查询获取</p> 
     * @return RoleId <p>角色Id，可通过接口 DescribeIntegrationRoles 查询获取</p>
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set <p>角色Id，可通过接口 DescribeIntegrationRoles 查询获取</p>
     * @param RoleId <p>角色Id，可通过接口 DescribeIntegrationRoles 查询获取</p>
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get <p>角色名称，最大长度为20个字符，仅限中文、字母、数字和下划线组成。</p> 
     * @return Name <p>角色名称，最大长度为20个字符，仅限中文、字母、数字和下划线组成。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>角色名称，最大长度为20个字符，仅限中文、字母、数字和下划线组成。</p>
     * @param Name <p>角色名称，最大长度为20个字符，仅限中文、字母、数字和下划线组成。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。<br>支持填入集团子公司经办人 userId 代发合同。</p><p>注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p> 
     * @return Operator <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。<br>支持填入集团子公司经办人 userId 代发合同。</p><p>注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。<br>支持填入集团子公司经办人 userId 代发合同。</p><p>注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
     * @param Operator <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。<br>支持填入集团子公司经办人 userId 代发合同。</p><p>注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>角色描述，最大长度为50个字符</p> 
     * @return Description <p>角色描述，最大长度为50个字符</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>角色描述，最大长度为50个字符</p>
     * @param Description <p>角色描述，最大长度为50个字符</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>权限树</p> 
     * @return PermissionGroups <p>权限树</p>
     */
    public PermissionGroup [] getPermissionGroups() {
        return this.PermissionGroups;
    }

    /**
     * Set <p>权限树</p>
     * @param PermissionGroups <p>权限树</p>
     */
    public void setPermissionGroups(PermissionGroup [] PermissionGroups) {
        this.PermissionGroups = PermissionGroups;
    }

    /**
     * Get <p>集团角色的话，需要传递集团子企业列表，如果是全选，则传1</p> 
     * @return SubOrganizationIds <p>集团角色的话，需要传递集团子企业列表，如果是全选，则传1</p>
     */
    public String [] getSubOrganizationIds() {
        return this.SubOrganizationIds;
    }

    /**
     * Set <p>集团角色的话，需要传递集团子企业列表，如果是全选，则传1</p>
     * @param SubOrganizationIds <p>集团角色的话，需要传递集团子企业列表，如果是全选，则传1</p>
     */
    public void setSubOrganizationIds(String [] SubOrganizationIds) {
        this.SubOrganizationIds = SubOrganizationIds;
    }

    /**
     * Get <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public ModifyIntegrationRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIntegrationRoleRequest(ModifyIntegrationRoleRequest source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
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
        if (source.SubOrganizationIds != null) {
            this.SubOrganizationIds = new String[source.SubOrganizationIds.length];
            for (int i = 0; i < source.SubOrganizationIds.length; i++) {
                this.SubOrganizationIds[i] = new String(source.SubOrganizationIds[i]);
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
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "PermissionGroups.", this.PermissionGroups);
        this.setParamArraySimple(map, prefix + "SubOrganizationIds.", this.SubOrganizationIds);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

