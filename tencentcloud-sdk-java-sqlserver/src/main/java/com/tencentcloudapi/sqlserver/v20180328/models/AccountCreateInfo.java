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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountCreateInfo extends AbstractModel{

    /**
    * 实例用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 实例密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * DB权限列表
    */
    @SerializedName("DBPrivileges")
    @Expose
    private DBPrivilege [] DBPrivileges;

    /**
    * 账号备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否为管理员账户，默认为否
    */
    @SerializedName("IsAdmin")
    @Expose
    private Boolean IsAdmin;

    /**
     * Get 实例用户名 
     * @return UserName 实例用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 实例用户名
     * @param UserName 实例用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 实例密码 
     * @return Password 实例密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 实例密码
     * @param Password 实例密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get DB权限列表 
     * @return DBPrivileges DB权限列表
     */
    public DBPrivilege [] getDBPrivileges() {
        return this.DBPrivileges;
    }

    /**
     * Set DB权限列表
     * @param DBPrivileges DB权限列表
     */
    public void setDBPrivileges(DBPrivilege [] DBPrivileges) {
        this.DBPrivileges = DBPrivileges;
    }

    /**
     * Get 账号备注信息 
     * @return Remark 账号备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 账号备注信息
     * @param Remark 账号备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否为管理员账户，默认为否 
     * @return IsAdmin 是否为管理员账户，默认为否
     */
    public Boolean getIsAdmin() {
        return this.IsAdmin;
    }

    /**
     * Set 是否为管理员账户，默认为否
     * @param IsAdmin 是否为管理员账户，默认为否
     */
    public void setIsAdmin(Boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "DBPrivileges.", this.DBPrivileges);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsAdmin", this.IsAdmin);

    }
}

