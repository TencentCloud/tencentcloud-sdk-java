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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsoleGroupInfo extends AbstractModel {

    /**
    * 用户组 ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 用户组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 角色列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Roles")
    @Expose
    private RoleBasicInfo [] Roles;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 用户组下用户数量
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * 用户组类型。取值为枚举数值的字符串形式："0"=控制台系统类型（包含全部user）、"1"=控制台自定义类型、"2"=工作空间系统类型、"3"=工作空间自定义类型
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
     * Get 用户组 ID 
     * @return GroupId 用户组 ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 用户组 ID
     * @param GroupId 用户组 ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 用户组名称 
     * @return GroupName 用户组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 用户组名称
     * @param GroupName 用户组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 角色列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Roles 角色列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoleBasicInfo [] getRoles() {
        return this.Roles;
    }

    /**
     * Set 角色列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Roles 角色列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoles(RoleBasicInfo [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 用户组下用户数量 
     * @return UserCount 用户组下用户数量
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set 用户组下用户数量
     * @param UserCount 用户组下用户数量
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get 用户组类型。取值为枚举数值的字符串形式："0"=控制台系统类型（包含全部user）、"1"=控制台自定义类型、"2"=工作空间系统类型、"3"=工作空间自定义类型 
     * @return GroupType 用户组类型。取值为枚举数值的字符串形式："0"=控制台系统类型（包含全部user）、"1"=控制台自定义类型、"2"=工作空间系统类型、"3"=工作空间自定义类型
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 用户组类型。取值为枚举数值的字符串形式："0"=控制台系统类型（包含全部user）、"1"=控制台自定义类型、"2"=工作空间系统类型、"3"=工作空间自定义类型
     * @param GroupType 用户组类型。取值为枚举数值的字符串形式："0"=控制台系统类型（包含全部user）、"1"=控制台自定义类型、"2"=工作空间系统类型、"3"=工作空间自定义类型
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    public ConsoleGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsoleGroupInfo(ConsoleGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Roles != null) {
            this.Roles = new RoleBasicInfo[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new RoleBasicInfo(source.Roles[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UserCount != null) {
            this.UserCount = new Long(source.UserCount);
        }
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);

    }
}

