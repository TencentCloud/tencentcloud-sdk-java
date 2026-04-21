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
    * 用户组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 位置
    */
    @SerializedName("Location")
    @Expose
    private Long Location;

    /**
    * 父用户组id
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

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
     * Get 位置 
     * @return Location 位置
     */
    public Long getLocation() {
        return this.Location;
    }

    /**
     * Set 位置
     * @param Location 位置
     */
    public void setLocation(Long Location) {
        this.Location = Location;
    }

    /**
     * Get 父用户组id 
     * @return ParentId 父用户组id
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父用户组id
     * @param ParentId 父用户组id
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
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);

    }
}

