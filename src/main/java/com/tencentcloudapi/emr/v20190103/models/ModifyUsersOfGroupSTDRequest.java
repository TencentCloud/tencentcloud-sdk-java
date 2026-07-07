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
    * <p>集群名称</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户组名</p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>用户列表</p>
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * <p>用户组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>枚举类, ADD, DELETE, SYNC</p><p>枚举类说明:</p><ul><li>ADD: 新增的批量用户, 多次新增相同的用户不会报错</li><li>DELETE: 从用户组里删除的批量用户, 删除不存在的用户不会报错</li><li>SYNC: 用于同步整个用户组, 当列表为空时代表清空整个用户组<br>默认为SYNC</li></ul>
    */
    @SerializedName("OperateAction")
    @Expose
    private String OperateAction;

    /**
     * Get <p>集群名称</p> 
     * @return InstanceId <p>集群名称</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群名称</p>
     * @param InstanceId <p>集群名称</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户组名</p> 
     * @return Group <p>用户组名</p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>用户组名</p>
     * @param Group <p>用户组名</p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>用户列表</p> 
     * @return Users <p>用户列表</p>
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set <p>用户列表</p>
     * @param Users <p>用户列表</p>
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
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
     * Get <p>枚举类, ADD, DELETE, SYNC</p><p>枚举类说明:</p><ul><li>ADD: 新增的批量用户, 多次新增相同的用户不会报错</li><li>DELETE: 从用户组里删除的批量用户, 删除不存在的用户不会报错</li><li>SYNC: 用于同步整个用户组, 当列表为空时代表清空整个用户组<br>默认为SYNC</li></ul> 
     * @return OperateAction <p>枚举类, ADD, DELETE, SYNC</p><p>枚举类说明:</p><ul><li>ADD: 新增的批量用户, 多次新增相同的用户不会报错</li><li>DELETE: 从用户组里删除的批量用户, 删除不存在的用户不会报错</li><li>SYNC: 用于同步整个用户组, 当列表为空时代表清空整个用户组<br>默认为SYNC</li></ul>
     */
    public String getOperateAction() {
        return this.OperateAction;
    }

    /**
     * Set <p>枚举类, ADD, DELETE, SYNC</p><p>枚举类说明:</p><ul><li>ADD: 新增的批量用户, 多次新增相同的用户不会报错</li><li>DELETE: 从用户组里删除的批量用户, 删除不存在的用户不会报错</li><li>SYNC: 用于同步整个用户组, 当列表为空时代表清空整个用户组<br>默认为SYNC</li></ul>
     * @param OperateAction <p>枚举类, ADD, DELETE, SYNC</p><p>枚举类说明:</p><ul><li>ADD: 新增的批量用户, 多次新增相同的用户不会报错</li><li>DELETE: 从用户组里删除的批量用户, 删除不存在的用户不会报错</li><li>SYNC: 用于同步整个用户组, 当列表为空时代表清空整个用户组<br>默认为SYNC</li></ul>
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

