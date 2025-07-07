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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserGroupRequest extends AbstractModel {

    /**
    * 用户信息列表
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * 用户主组，cvm集群为必填参数，tke集群选填
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * 用户副组
    */
    @SerializedName("Groups")
    @Expose
    private String [] Groups;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 用户信息列表 
     * @return Users 用户信息列表
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set 用户信息列表
     * @param Users 用户信息列表
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get 用户主组，cvm集群为必填参数，tke集群选填 
     * @return UserGroup 用户主组，cvm集群为必填参数，tke集群选填
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set 用户主组，cvm集群为必填参数，tke集群选填
     * @param UserGroup 用户主组，cvm集群为必填参数，tke集群选填
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get 用户副组 
     * @return Groups 用户副组
     */
    public String [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 用户副组
     * @param Groups 用户副组
     */
    public void setGroups(String [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyUserGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserGroupRequest(ModifyUserGroupRequest source) {
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.Groups != null) {
            this.Groups = new String[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new String(source.Groups[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamArraySimple(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

