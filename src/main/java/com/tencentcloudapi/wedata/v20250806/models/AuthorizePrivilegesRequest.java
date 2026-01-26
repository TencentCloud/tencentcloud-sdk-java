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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthorizePrivilegesRequest extends AbstractModel {

    /**
    * 资源数组
ResourceType：来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的ResourceType，并改为首字母大写，例如METALAKE对应Metalake
ResourceUri，取决于 ResourceType，Metalake时固定为default，其他类别采用catalog的三段式结构，例如
- Metalake，固定为default
- Catalog，取catalogName
- Schema，取catalogName.SchemaName
- Table,，取catalogName.SchemaName.TableName

    */
    @SerializedName("Resources")
    @Expose
    private PrivilegeResource [] Resources;

    /**
    * 授权主体数组，SubjectType及对应SubjectValue取值规则
- User 用户
    - 取自DescribeTenantUserList中的UserId
- Project 项目
    - 取自DescribeUserProjects中的ProjectId
- Role 角色（项目级角色）
    - 先调用DescribeUserProjects获取项目ID（ProjectId），再调用DescribeRoleList中的角色ID（RoleId），拼装为$ProjectId.$ProjectId. RoleId，例如"3085649716411588608.308335260274237440"
- GlobalRole （平台级角色）
    - AllAccountUsers 全部用户
    - 其他ID，取自DescribeTenantRole中的RoleId
    */
    @SerializedName("Subjects")
    @Expose
    private Subject [] Subjects;

    /**
    * 权限点，来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的各类Privileges中的NAME
    */
    @SerializedName("Privileges")
    @Expose
    private PrivilegeInfo [] Privileges;

    /**
     * Get 资源数组
ResourceType：来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的ResourceType，并改为首字母大写，例如METALAKE对应Metalake
ResourceUri，取决于 ResourceType，Metalake时固定为default，其他类别采用catalog的三段式结构，例如
- Metalake，固定为default
- Catalog，取catalogName
- Schema，取catalogName.SchemaName
- Table,，取catalogName.SchemaName.TableName
 
     * @return Resources 资源数组
ResourceType：来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的ResourceType，并改为首字母大写，例如METALAKE对应Metalake
ResourceUri，取决于 ResourceType，Metalake时固定为default，其他类别采用catalog的三段式结构，例如
- Metalake，固定为default
- Catalog，取catalogName
- Schema，取catalogName.SchemaName
- Table,，取catalogName.SchemaName.TableName

     */
    public PrivilegeResource [] getResources() {
        return this.Resources;
    }

    /**
     * Set 资源数组
ResourceType：来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的ResourceType，并改为首字母大写，例如METALAKE对应Metalake
ResourceUri，取决于 ResourceType，Metalake时固定为default，其他类别采用catalog的三段式结构，例如
- Metalake，固定为default
- Catalog，取catalogName
- Schema，取catalogName.SchemaName
- Table,，取catalogName.SchemaName.TableName

     * @param Resources 资源数组
ResourceType：来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的ResourceType，并改为首字母大写，例如METALAKE对应Metalake
ResourceUri，取决于 ResourceType，Metalake时固定为default，其他类别采用catalog的三段式结构，例如
- Metalake，固定为default
- Catalog，取catalogName
- Schema，取catalogName.SchemaName
- Table,，取catalogName.SchemaName.TableName

     */
    public void setResources(PrivilegeResource [] Resources) {
        this.Resources = Resources;
    }

    /**
     * Get 授权主体数组，SubjectType及对应SubjectValue取值规则
- User 用户
    - 取自DescribeTenantUserList中的UserId
- Project 项目
    - 取自DescribeUserProjects中的ProjectId
- Role 角色（项目级角色）
    - 先调用DescribeUserProjects获取项目ID（ProjectId），再调用DescribeRoleList中的角色ID（RoleId），拼装为$ProjectId.$ProjectId. RoleId，例如"3085649716411588608.308335260274237440"
- GlobalRole （平台级角色）
    - AllAccountUsers 全部用户
    - 其他ID，取自DescribeTenantRole中的RoleId 
     * @return Subjects 授权主体数组，SubjectType及对应SubjectValue取值规则
- User 用户
    - 取自DescribeTenantUserList中的UserId
- Project 项目
    - 取自DescribeUserProjects中的ProjectId
- Role 角色（项目级角色）
    - 先调用DescribeUserProjects获取项目ID（ProjectId），再调用DescribeRoleList中的角色ID（RoleId），拼装为$ProjectId.$ProjectId. RoleId，例如"3085649716411588608.308335260274237440"
- GlobalRole （平台级角色）
    - AllAccountUsers 全部用户
    - 其他ID，取自DescribeTenantRole中的RoleId
     */
    public Subject [] getSubjects() {
        return this.Subjects;
    }

    /**
     * Set 授权主体数组，SubjectType及对应SubjectValue取值规则
- User 用户
    - 取自DescribeTenantUserList中的UserId
- Project 项目
    - 取自DescribeUserProjects中的ProjectId
- Role 角色（项目级角色）
    - 先调用DescribeUserProjects获取项目ID（ProjectId），再调用DescribeRoleList中的角色ID（RoleId），拼装为$ProjectId.$ProjectId. RoleId，例如"3085649716411588608.308335260274237440"
- GlobalRole （平台级角色）
    - AllAccountUsers 全部用户
    - 其他ID，取自DescribeTenantRole中的RoleId
     * @param Subjects 授权主体数组，SubjectType及对应SubjectValue取值规则
- User 用户
    - 取自DescribeTenantUserList中的UserId
- Project 项目
    - 取自DescribeUserProjects中的ProjectId
- Role 角色（项目级角色）
    - 先调用DescribeUserProjects获取项目ID（ProjectId），再调用DescribeRoleList中的角色ID（RoleId），拼装为$ProjectId.$ProjectId. RoleId，例如"3085649716411588608.308335260274237440"
- GlobalRole （平台级角色）
    - AllAccountUsers 全部用户
    - 其他ID，取自DescribeTenantRole中的RoleId
     */
    public void setSubjects(Subject [] Subjects) {
        this.Subjects = Subjects;
    }

    /**
     * Get 权限点，来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的各类Privileges中的NAME 
     * @return Privileges 权限点，来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的各类Privileges中的NAME
     */
    public PrivilegeInfo [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set 权限点，来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的各类Privileges中的NAME
     * @param Privileges 权限点，来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的各类Privileges中的NAME
     */
    public void setPrivileges(PrivilegeInfo [] Privileges) {
        this.Privileges = Privileges;
    }

    public AuthorizePrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizePrivilegesRequest(AuthorizePrivilegesRequest source) {
        if (source.Resources != null) {
            this.Resources = new PrivilegeResource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new PrivilegeResource(source.Resources[i]);
            }
        }
        if (source.Subjects != null) {
            this.Subjects = new Subject[source.Subjects.length];
            for (int i = 0; i < source.Subjects.length; i++) {
                this.Subjects[i] = new Subject(source.Subjects[i]);
            }
        }
        if (source.Privileges != null) {
            this.Privileges = new PrivilegeInfo[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new PrivilegeInfo(source.Privileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);
        this.setParamArrayObj(map, prefix + "Subjects.", this.Subjects);
        this.setParamArrayObj(map, prefix + "Privileges.", this.Privileges);

    }
}

