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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserGroupVO extends AbstractModel {

    /**
    * 用户组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 所属用户组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 所属用户组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentName")
    @Expose
    private String ParentName;

    /**
    * 是否默认用户组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 用户组管理员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 排序位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private Long Location;

    /**
    * 用户信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserList")
    @Expose
    private UserGroupUserInfoVO [] UserList;

    /**
     * Get 用户组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 用户组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 用户组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 用户组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 用户组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 用户组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 用户组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 所属用户组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 所属用户组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 所属用户组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 所属用户组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 所属用户组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentName 所属用户组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentName() {
        return this.ParentName;
    }

    /**
     * Set 所属用户组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentName 所属用户组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentName(String ParentName) {
        this.ParentName = ParentName;
    }

    /**
     * Get 是否默认用户组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefault 是否默认用户组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否默认用户组
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefault 是否默认用户组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 用户组管理员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminUserId 用户组管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set 用户组管理员
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminUserId 用户组管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 排序位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 排序位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLocation() {
        return this.Location;
    }

    /**
     * Set 排序位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 排序位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(Long Location) {
        this.Location = Location;
    }

    /**
     * Get 用户信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserList 用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserGroupUserInfoVO [] getUserList() {
        return this.UserList;
    }

    /**
     * Set 用户信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserList 用户信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserList(UserGroupUserInfoVO [] UserList) {
        this.UserList = UserList;
    }

    public UserGroupVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupVO(UserGroupVO source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.ParentName != null) {
            this.ParentName = new String(source.ParentName);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Long(source.IsDefault);
        }
        if (source.AdminUserId != null) {
            this.AdminUserId = new String(source.AdminUserId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Location != null) {
            this.Location = new Long(source.Location);
        }
        if (source.UserList != null) {
            this.UserList = new UserGroupUserInfoVO[source.UserList.length];
            for (int i = 0; i < source.UserList.length; i++) {
                this.UserList[i] = new UserGroupUserInfoVO(source.UserList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "ParentName", this.ParentName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "AdminUserId", this.AdminUserId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArrayObj(map, prefix + "UserList.", this.UserList);

    }
}

