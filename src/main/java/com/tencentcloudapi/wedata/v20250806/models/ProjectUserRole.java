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

public class ProjectUserRole extends AbstractModel {

    /**
    * 租户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 主账号id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootAccountId")
    @Expose
    private String RootAccountId;

    /**
    * 用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 显示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 用户角色对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Roles")
    @Expose
    private SystemRole [] Roles;

    /**
    * 是否创建者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCreator")
    @Expose
    private Boolean IsCreator;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否项目负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsProjectOwner")
    @Expose
    private Boolean IsProjectOwner;

    /**
    * 手机号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get 租户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 租户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootAccountId 主账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRootAccountId() {
        return this.RootAccountId;
    }

    /**
     * Set 主账号id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootAccountId 主账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootAccountId(String RootAccountId) {
        this.RootAccountId = RootAccountId;
    }

    /**
     * Get 用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUin 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUin 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 显示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 显示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 显示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 显示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 用户角色对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Roles 用户角色对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SystemRole [] getRoles() {
        return this.Roles;
    }

    /**
     * Set 用户角色对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Roles 用户角色对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoles(SystemRole [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get 是否创建者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCreator 是否创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsCreator() {
        return this.IsCreator;
    }

    /**
     * Set 是否创建者
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCreator 是否创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCreator(Boolean IsCreator) {
        this.IsCreator = IsCreator;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否项目负责人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsProjectOwner 是否项目负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsProjectOwner() {
        return this.IsProjectOwner;
    }

    /**
     * Set 是否项目负责人
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsProjectOwner 是否项目负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsProjectOwner(Boolean IsProjectOwner) {
        this.IsProjectOwner = IsProjectOwner;
    }

    /**
     * Get 手机号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneNum 手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 手机号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneNum 手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public ProjectUserRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectUserRole(ProjectUserRole source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.RootAccountId != null) {
            this.RootAccountId = new String(source.RootAccountId);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Roles != null) {
            this.Roles = new SystemRole[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new SystemRole(source.Roles[i]);
            }
        }
        if (source.IsCreator != null) {
            this.IsCreator = new Boolean(source.IsCreator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsProjectOwner != null) {
            this.IsProjectOwner = new Boolean(source.IsProjectOwner);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RootAccountId", this.RootAccountId);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "IsCreator", this.IsCreator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsProjectOwner", this.IsProjectOwner);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

