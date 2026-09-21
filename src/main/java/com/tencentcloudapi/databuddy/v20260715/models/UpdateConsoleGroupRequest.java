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

public class UpdateConsoleGroupRequest extends AbstractModel {

    /**
    * <p>用户组 ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>修改标识：USER_GROUP_OPER_TYPE_ADD_USER(1)=添加成员、USER_GROUP_OPER_TYPE_DELETE_USER(2)=删除成员、USER_GROUP_OPER_TYPE_BASIC_INFO(3)=基础信息（别名和描述）</p>
    */
    @SerializedName("OperType")
    @Expose
    private Long OperType;

    /**
    * <p>用户组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>用户组别名</p>
    */
    @SerializedName("GroupNickname")
    @Expose
    private String GroupNickname;

    /**
    * <p>用户组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>成员 UIN 列表（OperType 为添加/删除成员时使用）</p>
    */
    @SerializedName("UserUins")
    @Expose
    private String [] UserUins;

    /**
     * Get <p>用户组 ID</p> 
     * @return GroupId <p>用户组 ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>用户组 ID</p>
     * @param GroupId <p>用户组 ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>修改标识：USER_GROUP_OPER_TYPE_ADD_USER(1)=添加成员、USER_GROUP_OPER_TYPE_DELETE_USER(2)=删除成员、USER_GROUP_OPER_TYPE_BASIC_INFO(3)=基础信息（别名和描述）</p> 
     * @return OperType <p>修改标识：USER_GROUP_OPER_TYPE_ADD_USER(1)=添加成员、USER_GROUP_OPER_TYPE_DELETE_USER(2)=删除成员、USER_GROUP_OPER_TYPE_BASIC_INFO(3)=基础信息（别名和描述）</p>
     */
    public Long getOperType() {
        return this.OperType;
    }

    /**
     * Set <p>修改标识：USER_GROUP_OPER_TYPE_ADD_USER(1)=添加成员、USER_GROUP_OPER_TYPE_DELETE_USER(2)=删除成员、USER_GROUP_OPER_TYPE_BASIC_INFO(3)=基础信息（别名和描述）</p>
     * @param OperType <p>修改标识：USER_GROUP_OPER_TYPE_ADD_USER(1)=添加成员、USER_GROUP_OPER_TYPE_DELETE_USER(2)=删除成员、USER_GROUP_OPER_TYPE_BASIC_INFO(3)=基础信息（别名和描述）</p>
     */
    public void setOperType(Long OperType) {
        this.OperType = OperType;
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
     * Get <p>用户组别名</p> 
     * @return GroupNickname <p>用户组别名</p>
     */
    public String getGroupNickname() {
        return this.GroupNickname;
    }

    /**
     * Set <p>用户组别名</p>
     * @param GroupNickname <p>用户组别名</p>
     */
    public void setGroupNickname(String GroupNickname) {
        this.GroupNickname = GroupNickname;
    }

    /**
     * Get <p>用户组描述</p> 
     * @return Description <p>用户组描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>用户组描述</p>
     * @param Description <p>用户组描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>成员 UIN 列表（OperType 为添加/删除成员时使用）</p> 
     * @return UserUins <p>成员 UIN 列表（OperType 为添加/删除成员时使用）</p>
     */
    public String [] getUserUins() {
        return this.UserUins;
    }

    /**
     * Set <p>成员 UIN 列表（OperType 为添加/删除成员时使用）</p>
     * @param UserUins <p>成员 UIN 列表（OperType 为添加/删除成员时使用）</p>
     */
    public void setUserUins(String [] UserUins) {
        this.UserUins = UserUins;
    }

    public UpdateConsoleGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateConsoleGroupRequest(UpdateConsoleGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.OperType != null) {
            this.OperType = new Long(source.OperType);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupNickname != null) {
            this.GroupNickname = new String(source.GroupNickname);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UserUins != null) {
            this.UserUins = new String[source.UserUins.length];
            for (int i = 0; i < source.UserUins.length; i++) {
                this.UserUins[i] = new String(source.UserUins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "OperType", this.OperType);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupNickname", this.GroupNickname);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "UserUins.", this.UserUins);

    }
}

