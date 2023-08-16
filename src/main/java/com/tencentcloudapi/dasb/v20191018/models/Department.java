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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Department extends AbstractModel{

    /**
    * 部门ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 部门名称，1 - 256个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 部门管理员账号ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Managers")
    @Expose
    private String [] Managers;

    /**
    * 管理员用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManagerUsers")
    @Expose
    private DepartmentManagerUser [] ManagerUsers;

    /**
     * Get 部门ID 
     * @return Id 部门ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 部门ID
     * @param Id 部门ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 部门名称，1 - 256个字符 
     * @return Name 部门名称，1 - 256个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 部门名称，1 - 256个字符
     * @param Name 部门名称，1 - 256个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 部门管理员账号ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Managers 部门管理员账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getManagers() {
        return this.Managers;
    }

    /**
     * Set 部门管理员账号ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Managers 部门管理员账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManagers(String [] Managers) {
        this.Managers = Managers;
    }

    /**
     * Get 管理员用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManagerUsers 管理员用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DepartmentManagerUser [] getManagerUsers() {
        return this.ManagerUsers;
    }

    /**
     * Set 管理员用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManagerUsers 管理员用户
注意：此字段可能返回 null，表示取不到有效值。
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

