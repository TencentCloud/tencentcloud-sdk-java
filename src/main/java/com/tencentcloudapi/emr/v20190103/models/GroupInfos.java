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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfos extends AbstractModel {

    /**
    * 用户组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 用户名称列表
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户组类型
    */
    @SerializedName("GroupType")
    @Expose
    private Long GroupType;

    /**
    * 用户组类型描述
    */
    @SerializedName("GroupTypeDesc")
    @Expose
    private String GroupTypeDesc;

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
     * Get 用户名称列表 
     * @return Users 用户名称列表
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set 用户名称列表
     * @param Users 用户名称列表
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 用户组类型 
     * @return GroupType 用户组类型
     */
    public Long getGroupType() {
        return this.GroupType;
    }

    /**
     * Set 用户组类型
     * @param GroupType 用户组类型
     */
    public void setGroupType(Long GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get 用户组类型描述 
     * @return GroupTypeDesc 用户组类型描述
     */
    public String getGroupTypeDesc() {
        return this.GroupTypeDesc;
    }

    /**
     * Set 用户组类型描述
     * @param GroupTypeDesc 用户组类型描述
     */
    public void setGroupTypeDesc(String GroupTypeDesc) {
        this.GroupTypeDesc = GroupTypeDesc;
    }

    public GroupInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfos(GroupInfos source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.GroupType != null) {
            this.GroupType = new Long(source.GroupType);
        }
        if (source.GroupTypeDesc != null) {
            this.GroupTypeDesc = new String(source.GroupTypeDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "GroupTypeDesc", this.GroupTypeDesc);

    }
}

