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

public class CreateUserGroupRequest extends AbstractModel {

    /**
    * <p>组管理员</p>
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>用户组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>位置</p>
    */
    @SerializedName("Location")
    @Expose
    private Long Location;

    /**
    * <p>父用户组id</p>
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
     * Get <p>组管理员</p> 
     * @return AdminUserId <p>组管理员</p>
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set <p>组管理员</p>
     * @param AdminUserId <p>组管理员</p>
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get <p>位置</p> 
     * @return Location <p>位置</p>
     */
    public Long getLocation() {
        return this.Location;
    }

    /**
     * Set <p>位置</p>
     * @param Location <p>位置</p>
     */
    public void setLocation(Long Location) {
        this.Location = Location;
    }

    /**
     * Get <p>父用户组id</p> 
     * @return ParentId <p>父用户组id</p>
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set <p>父用户组id</p>
     * @param ParentId <p>父用户组id</p>
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    public CreateUserGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserGroupRequest(CreateUserGroupRequest source) {
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

    }
}

