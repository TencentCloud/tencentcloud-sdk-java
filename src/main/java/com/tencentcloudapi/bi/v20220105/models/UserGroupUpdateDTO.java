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

public class UserGroupUpdateDTO extends AbstractModel {

    /**
    * 组管理员
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 排序位置
    */
    @SerializedName("Location")
    @Expose
    private Long Location;

    /**
    * 父节点id
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 用户组id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 父节点名称
    */
    @SerializedName("ParentName")
    @Expose
    private String ParentName;

    /**
     * Get 组管理员 
     * @return AdminUserId 组管理员
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set 组管理员
     * @param AdminUserId 组管理员
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 排序位置 
     * @return Location 排序位置
     */
    public Long getLocation() {
        return this.Location;
    }

    /**
     * Set 排序位置
     * @param Location 排序位置
     */
    public void setLocation(Long Location) {
        this.Location = Location;
    }

    /**
     * Get 父节点id 
     * @return ParentId 父节点id
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父节点id
     * @param ParentId 父节点id
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 用户组id 
     * @return Id 用户组id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 用户组id
     * @param Id 用户组id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 父节点名称 
     * @return ParentName 父节点名称
     */
    public String getParentName() {
        return this.ParentName;
    }

    /**
     * Set 父节点名称
     * @param ParentName 父节点名称
     */
    public void setParentName(String ParentName) {
        this.ParentName = ParentName;
    }

    public UserGroupUpdateDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserGroupUpdateDTO(UserGroupUpdateDTO source) {
        if (source.AdminUserId != null) {
            this.AdminUserId = new String(source.AdminUserId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Location != null) {
            this.Location = new Long(source.Location);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ParentName != null) {
            this.ParentName = new String(source.ParentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AdminUserId", this.AdminUserId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ParentName", this.ParentName);

    }
}

