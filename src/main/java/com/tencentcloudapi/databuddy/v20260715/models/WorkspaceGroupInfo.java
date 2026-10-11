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

public class WorkspaceGroupInfo extends AbstractModel {

    /**
    * <p>用户组ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>用户组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>角色列表</p>
    */
    @SerializedName("Roles")
    @Expose
    private RoleBasicInfo [] Roles;

    /**
    * <p>创建时间，毫秒时间戳</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间，毫秒时间戳</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>用户组下用户数量</p>
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
    * <p>用户组类型。取值为枚举数值的字符串形式：&quot;0&quot;=控制台系统类型（包含全部user）、&quot;1&quot;=控制台自定义类型、&quot;2&quot;=工作空间系统类型（包含工作空间全部user）、&quot;3&quot;=工作空间自定义类型</p>
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>该组直接绑定的标签（不含继承）</p>
    */
    @SerializedName("Tags")
    @Expose
    private UserTagInfo [] Tags;

    /**
     * Get <p>用户组ID</p> 
     * @return GroupId <p>用户组ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>用户组ID</p>
     * @param GroupId <p>用户组ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>用户组名称</p> 
     * @return GroupName <p>用户组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>用户组名称</p>
     * @param GroupName <p>用户组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>角色列表</p> 
     * @return Roles <p>角色列表</p>
     */
    public RoleBasicInfo [] getRoles() {
        return this.Roles;
    }

    /**
     * Set <p>角色列表</p>
     * @param Roles <p>角色列表</p>
     */
    public void setRoles(RoleBasicInfo [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get <p>创建时间，毫秒时间戳</p> 
     * @return CreateTime <p>创建时间，毫秒时间戳</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，毫秒时间戳</p>
     * @param CreateTime <p>创建时间，毫秒时间戳</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间，毫秒时间戳</p> 
     * @return UpdateTime <p>更新时间，毫秒时间戳</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间，毫秒时间戳</p>
     * @param UpdateTime <p>更新时间，毫秒时间戳</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>用户组下用户数量</p> 
     * @return UserCount <p>用户组下用户数量</p>
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set <p>用户组下用户数量</p>
     * @param UserCount <p>用户组下用户数量</p>
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    /**
     * Get <p>用户组类型。取值为枚举数值的字符串形式：&quot;0&quot;=控制台系统类型（包含全部user）、&quot;1&quot;=控制台自定义类型、&quot;2&quot;=工作空间系统类型（包含工作空间全部user）、&quot;3&quot;=工作空间自定义类型</p> 
     * @return GroupType <p>用户组类型。取值为枚举数值的字符串形式：&quot;0&quot;=控制台系统类型（包含全部user）、&quot;1&quot;=控制台自定义类型、&quot;2&quot;=工作空间系统类型（包含工作空间全部user）、&quot;3&quot;=工作空间自定义类型</p>
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>用户组类型。取值为枚举数值的字符串形式：&quot;0&quot;=控制台系统类型（包含全部user）、&quot;1&quot;=控制台自定义类型、&quot;2&quot;=工作空间系统类型（包含工作空间全部user）、&quot;3&quot;=工作空间自定义类型</p>
     * @param GroupType <p>用户组类型。取值为枚举数值的字符串形式：&quot;0&quot;=控制台系统类型（包含全部user）、&quot;1&quot;=控制台自定义类型、&quot;2&quot;=工作空间系统类型（包含工作空间全部user）、&quot;3&quot;=工作空间自定义类型</p>
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>该组直接绑定的标签（不含继承）</p> 
     * @return Tags <p>该组直接绑定的标签（不含继承）</p>
     */
    public UserTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>该组直接绑定的标签（不含继承）</p>
     * @param Tags <p>该组直接绑定的标签（不含继承）</p>
     */
    public void setTags(UserTagInfo [] Tags) {
        this.Tags = Tags;
    }

    public WorkspaceGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceGroupInfo(WorkspaceGroupInfo source) {
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
        if (source.Tags != null) {
            this.Tags = new UserTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new UserTagInfo(source.Tags[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

