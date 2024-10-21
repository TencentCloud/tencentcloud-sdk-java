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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectUserRole extends AbstractModel {

    /**
    * 用户角色对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Roles")
    @Expose
    private SystemRole [] Roles;

    /**
    * mc
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否创建者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private Boolean Creator;

    /**
    * 显示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 是否项目管理员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsProjectAdmin")
    @Expose
    private Boolean IsProjectAdmin;

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
     * Get mc
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName mc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set mc
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName mc
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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
     * Get 是否创建者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 是否创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCreator() {
        return this.Creator;
    }

    /**
     * Set 是否创建者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 是否创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(Boolean Creator) {
        this.Creator = Creator;
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
     * Get 是否项目管理员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsProjectAdmin 是否项目管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsProjectAdmin() {
        return this.IsProjectAdmin;
    }

    /**
     * Set 是否项目管理员
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsProjectAdmin 是否项目管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsProjectAdmin(Boolean IsProjectAdmin) {
        this.IsProjectAdmin = IsProjectAdmin;
    }

    public ProjectUserRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectUserRole(ProjectUserRole source) {
        if (source.Roles != null) {
            this.Roles = new SystemRole[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new SystemRole(source.Roles[i]);
            }
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new Boolean(source.Creator);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.IsProjectAdmin != null) {
            this.IsProjectAdmin = new Boolean(source.IsProjectAdmin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "IsProjectAdmin", this.IsProjectAdmin);

    }
}

