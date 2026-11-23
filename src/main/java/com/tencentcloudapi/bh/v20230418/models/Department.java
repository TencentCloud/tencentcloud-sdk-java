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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Department extends AbstractModel {

    /**
    * <p>部门ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>部门名称，1 - 256个字符</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>部门管理员账号ID</p>
    */
    @SerializedName("Managers")
    @Expose
    private String [] Managers;

    /**
    * <p>管理员用户</p>
    */
    @SerializedName("ManagerUsers")
    @Expose
    private DepartmentManagerUser [] ManagerUsers;

    /**
     * Get <p>部门ID</p> 
     * @return Id <p>部门ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>部门ID</p>
     * @param Id <p>部门ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>部门名称，1 - 256个字符</p> 
     * @return Name <p>部门名称，1 - 256个字符</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>部门名称，1 - 256个字符</p>
     * @param Name <p>部门名称，1 - 256个字符</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>部门管理员账号ID</p> 
     * @return Managers <p>部门管理员账号ID</p>
     */
    public String [] getManagers() {
        return this.Managers;
    }

    /**
     * Set <p>部门管理员账号ID</p>
     * @param Managers <p>部门管理员账号ID</p>
     */
    public void setManagers(String [] Managers) {
        this.Managers = Managers;
    }

    /**
     * Get <p>管理员用户</p> 
     * @return ManagerUsers <p>管理员用户</p>
     */
    public DepartmentManagerUser [] getManagerUsers() {
        return this.ManagerUsers;
    }

    /**
     * Set <p>管理员用户</p>
     * @param ManagerUsers <p>管理员用户</p>
     */
    public void setManagerUsers(DepartmentManagerUser [] ManagerUsers) {
        this.ManagerUsers = ManagerUsers;
    }

    public Department() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Department(Department source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Managers != null) {
            this.Managers = new String[source.Managers.length];
            for (int i = 0; i < source.Managers.length; i++) {
                this.Managers[i] = new String(source.Managers[i]);
            }
        }
        if (source.ManagerUsers != null) {
            this.ManagerUsers = new DepartmentManagerUser[source.ManagerUsers.length];
            for (int i = 0; i < source.ManagerUsers.length; i++) {
                this.ManagerUsers[i] = new DepartmentManagerUser(source.ManagerUsers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Managers.", this.Managers);
        this.setParamArrayObj(map, prefix + "ManagerUsers.", this.ManagerUsers);

    }
}

