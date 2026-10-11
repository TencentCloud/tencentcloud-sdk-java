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

public class WorkspaceUserInfo extends AbstractModel {

    /**
    * <p>用户UIN</p>
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>昵称</p>
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * <p>角色列表</p>
    */
    @SerializedName("Roles")
    @Expose
    private RoleBasicInfo [] Roles;

    /**
    * <p>用户来源，group：用户组、user：用户</p>
    */
    @SerializedName("UserSource")
    @Expose
    private String UserSource;

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
    * <p>是否主账号</p>
    */
    @SerializedName("IsOwner")
    @Expose
    private Boolean IsOwner;

    /**
    * <p>0: 普通用户 1: entraId用户</p>
    */
    @SerializedName("UserTag")
    @Expose
    private Long UserTag;

    /**
    * <p>是否具有 admin 权限的子账号</p>
    */
    @SerializedName("IsAdmin")
    @Expose
    private Boolean IsAdmin;

    /**
    * <p>合并后标签（用户直绑 + 用户组继承）</p>
    */
    @SerializedName("Tags")
    @Expose
    private UserTagInfo [] Tags;

    /**
     * Get <p>用户UIN</p> 
     * @return UserUin <p>用户UIN</p>
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set <p>用户UIN</p>
     * @param UserUin <p>用户UIN</p>
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>昵称</p> 
     * @return Nickname <p>昵称</p>
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set <p>昵称</p>
     * @param Nickname <p>昵称</p>
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
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
     * Get <p>用户来源，group：用户组、user：用户</p> 
     * @return UserSource <p>用户来源，group：用户组、user：用户</p>
     */
    public String getUserSource() {
        return this.UserSource;
    }

    /**
     * Set <p>用户来源，group：用户组、user：用户</p>
     * @param UserSource <p>用户来源，group：用户组、user：用户</p>
     */
    public void setUserSource(String UserSource) {
        this.UserSource = UserSource;
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
     * Get <p>是否主账号</p> 
     * @return IsOwner <p>是否主账号</p>
     */
    public Boolean getIsOwner() {
        return this.IsOwner;
    }

    /**
     * Set <p>是否主账号</p>
     * @param IsOwner <p>是否主账号</p>
     */
    public void setIsOwner(Boolean IsOwner) {
        this.IsOwner = IsOwner;
    }

    /**
     * Get <p>0: 普通用户 1: entraId用户</p> 
     * @return UserTag <p>0: 普通用户 1: entraId用户</p>
     */
    public Long getUserTag() {
        return this.UserTag;
    }

    /**
     * Set <p>0: 普通用户 1: entraId用户</p>
     * @param UserTag <p>0: 普通用户 1: entraId用户</p>
     */
    public void setUserTag(Long UserTag) {
        this.UserTag = UserTag;
    }

    /**
     * Get <p>是否具有 admin 权限的子账号</p> 
     * @return IsAdmin <p>是否具有 admin 权限的子账号</p>
     */
    public Boolean getIsAdmin() {
        return this.IsAdmin;
    }

    /**
     * Set <p>是否具有 admin 权限的子账号</p>
     * @param IsAdmin <p>是否具有 admin 权限的子账号</p>
     */
    public void setIsAdmin(Boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    /**
     * Get <p>合并后标签（用户直绑 + 用户组继承）</p> 
     * @return Tags <p>合并后标签（用户直绑 + 用户组继承）</p>
     */
    public UserTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>合并后标签（用户直绑 + 用户组继承）</p>
     * @param Tags <p>合并后标签（用户直绑 + 用户组继承）</p>
     */
    public void setTags(UserTagInfo [] Tags) {
        this.Tags = Tags;
    }

    public WorkspaceUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceUserInfo(WorkspaceUserInfo source) {
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Roles != null) {
            this.Roles = new RoleBasicInfo[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new RoleBasicInfo(source.Roles[i]);
            }
        }
        if (source.UserSource != null) {
            this.UserSource = new String(source.UserSource);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsOwner != null) {
            this.IsOwner = new Boolean(source.IsOwner);
        }
        if (source.UserTag != null) {
            this.UserTag = new Long(source.UserTag);
        }
        if (source.IsAdmin != null) {
            this.IsAdmin = new Boolean(source.IsAdmin);
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
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "UserSource", this.UserSource);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsOwner", this.IsOwner);
        this.setParamSimple(map, prefix + "UserTag", this.UserTag);
        this.setParamSimple(map, prefix + "IsAdmin", this.IsAdmin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

