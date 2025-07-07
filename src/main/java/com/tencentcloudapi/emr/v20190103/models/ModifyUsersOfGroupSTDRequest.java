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

public class ModifyUsersOfGroupSTDRequest extends AbstractModel {

    /**
    * 集群名称
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户组名
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 用户列表
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * 用户组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 枚举类, ADD, DELETE, SYNC


枚举类说明:
- ADD: 新增的批量用户, 多次新增相同的用户不会报错
- DELETE: 从用户组里删除的批量用户, 删除不存在的用户不会报错
- SYNC: 用于同步整个用户组, 当列表为空时代表清空整个用户组
默认为SYNC

    */
    @SerializedName("OperateAction")
    @Expose
    private String OperateAction;

    /**
     * Get 集群名称 
     * @return InstanceId 集群名称
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群名称
     * @param InstanceId 集群名称
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 用户组名 
     * @return Group 用户组名
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 用户组名
     * @param Group 用户组名
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 用户列表 
     * @return Users 用户列表
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set 用户列表
     * @param Users 用户列表
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get 用户组描述 
     * @return Description 用户组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户组描述
     * @param Description 用户组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 枚举类, ADD, DELETE, SYNC


枚举类说明:
- ADD: 新增的批量用户, 多次新增相同的用户不会报错
- DELETE: 从用户组里删除的批量用户, 删除不存在的用户不会报错
- SYNC: 用于同步整个用户组, 当列表为空时代表清空整个用户组
默认为SYNC
 
     * @return OperateAction 枚举类, ADD, DELETE, SYNC


枚举类说明:
- ADD: 新增的批量用户, 多次新增相同的用户不会报错
- DELETE: 从用户组里删除的批量用户, 删除不存在的用户不会报错
- SYNC: 用于同步整个用户组, 当列表为空时代表清空整个用户组
默认为SYNC

     */
    public String getOperateAction() {
        return this.OperateAction;
    }

    /**
     * Set 枚举类, ADD, DELETE, SYNC


枚举类说明:
- ADD: 新增的批量用户, 多次新增相同的用户不会报错
- DELETE: 从用户组里删除的批量用户, 删除不存在的用户不会报错
- SYNC: 用于同步整个用户组, 当列表为空时代表清空整个用户组
默认为SYNC

     * @param OperateAction 枚举类, ADD, DELETE, SYNC


枚举类说明:
- ADD: 新增的批量用户, 多次新增相同的用户不会报错
- DELETE: 从用户组里删除的批量用户, 删除不存在的用户不会报错
- SYNC: 用于同步整个用户组, 当列表为空时代表清空整个用户组
默认为SYNC

     */
    public void setOperateAction(String OperateAction) {
        this.OperateAction = OperateAction;
    }

    public ModifyUsersOfGroupSTDRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUsersOfGroupSTDRequest(ModifyUsersOfGroupSTDRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
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
        if (source.OperateAction != null) {
            this.OperateAction = new String(source.OperateAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OperateAction", this.OperateAction);

    }
}

