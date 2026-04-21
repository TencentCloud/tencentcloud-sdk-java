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

public class UserGroupTreeVO extends AbstractModel {

    /**
    * 当前实体ID
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
    * 父id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 父节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentName")
    @Expose
    private String ParentName;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 管理员账号id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * 用户集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserList")
    @Expose
    private UserVO [] UserList;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 排序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private Long Location;

    /**
    * 孩子节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Children")
    @Expose
    private UserGroupTreeVO [] Children;

    /**
    * 是否有孩子节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasChildren")
    @Expose
    private Boolean HasChildren;

    /**
    * 资源集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceList")
    @Expose
    private ResourceDTO [] ResourceList;

    /**
     * Get 当前实体ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 当前实体ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 当前实体ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 当前实体ID
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
     * Get 父id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 父id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 父id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 父节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentName 父节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentName() {
        return this.ParentName;
    }

    /**
     * Set 父节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentName 父节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentName(String ParentName) {
        this.ParentName = ParentName;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefault 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefault 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 管理员账号id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminUserId 管理员账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set 管理员账号id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminUserId 管理员账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
    }

    /**
     * Get 用户集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserList 用户集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserVO [] getUserList() {
        return this.UserList;
    }

    /**
     * Set 用户集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserList 用户集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserList(UserVO [] UserList) {
        this.UserList = UserList;
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
     * Get 排序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLocation() {
        return this.Location;
    }

    /**
     * Set 排序
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(Long Location) {
        this.Location = Location;
    }

    /**
     * Get 孩子节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Children 孩子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserGroupTreeVO [] getChildren() {
        return this.Children;
    }

    /**
     * Set 孩子节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Children 孩子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildren(UserGroupTreeVO [] Children) {
        this.Children = Children;
    }

    /**
     * Get 是否有孩子节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasChildren 是否有孩子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasChildren() {
        return this.HasChildren;
    }

    /**
     * Set 是否有孩子节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasChildren 是否有孩子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasChildren(Boolean HasChildren) {
        this.HasChildren = HasChildren;
    }

    /**
     * Get 资源集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceList 资源集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceDTO [] getResourceList() {
        return this.ResourceList;
    }

    /**
     * Set 资源集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceList 资源集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceList(ResourceDTO [] ResourceList) {
        this.ResourceList = ResourceList;
    }

    public UserGroupTreeVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupTreeVO(UserGroupTreeVO source) {
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
        if (source.UserList != null) {
            this.UserList = new UserVO[source.UserList.length];
            for (int i = 0; i < source.UserList.length; i++) {
                this.UserList[i] = new UserVO(source.UserList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Location != null) {
            this.Location = new Long(source.Location);
        }
        if (source.Children != null) {
            this.Children = new UserGroupTreeVO[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new UserGroupTreeVO(source.Children[i]);
            }
        }
        if (source.HasChildren != null) {
            this.HasChildren = new Boolean(source.HasChildren);
        }
        if (source.ResourceList != null) {
            this.ResourceList = new ResourceDTO[source.ResourceList.length];
            for (int i = 0; i < source.ResourceList.length; i++) {
                this.ResourceList[i] = new ResourceDTO(source.ResourceList[i]);
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
        this.setParamArrayObj(map, prefix + "UserList.", this.UserList);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "HasChildren", this.HasChildren);
        this.setParamArrayObj(map, prefix + "ResourceList.", this.ResourceList);

    }
}

