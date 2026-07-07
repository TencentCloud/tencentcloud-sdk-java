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
    * <p>集群字符串ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户信息列表</p>
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * <p>用户主组，cvm集群为必填参数，tke集群选填</p>
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * <p>用户副组</p>
    */
    @SerializedName("Groups")
    @Expose
    private String [] Groups;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>集群字符串ID</p> 
     * @return InstanceId <p>集群字符串ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群字符串ID</p>
     * @param InstanceId <p>集群字符串ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户信息列表</p> 
     * @return Users <p>用户信息列表</p>
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set <p>用户信息列表</p>
     * @param Users <p>用户信息列表</p>
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get <p>用户主组，cvm集群为必填参数，tke集群选填</p> 
     * @return UserGroup <p>用户主组，cvm集群为必填参数，tke集群选填</p>
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set <p>用户主组，cvm集群为必填参数，tke集群选填</p>
     * @param UserGroup <p>用户主组，cvm集群为必填参数，tke集群选填</p>
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get <p>用户副组</p> 
     * @return Groups <p>用户副组</p>
     */
    public String [] getGroups() {
        return this.Groups;
    }

    /**
     * Set <p>用户副组</p>
     * @param Groups <p>用户副组</p>
     */
    public void setGroups(String [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamArraySimple(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

