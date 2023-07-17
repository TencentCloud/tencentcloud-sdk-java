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

public class AccountPrivilegeModifyInfo extends AbstractModel{

    /**
    * 数据库用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 账号权限变更信息
    */
    @SerializedName("DBPrivileges")
    @Expose
    private DBPrivilegeModifyInfo [] DBPrivileges;

    /**
    * 表示是否为管理员账户，当值为true，表示是 管理员。若实例 是 单节点，则管理员所在的 账号类型为超级权限账号 ，即AccountType=L0；若实例 是 双节点，则管理员所在的 账号类型为高级权限账号，即AccountType=L1；当值为false，表示 不是管理员，则账号类型为普通账号，即AccountType=L3
    */
    @SerializedName("IsAdmin")
    @Expose
    private Boolean IsAdmin;

    /**
    * 账号类型，IsAdmin字段的扩展字段。 L0-超级权限(基础版独有),L1-高级权限,L2-特殊权限,L3-普通权限，默认L3
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
     * Get 数据库用户名 
     * @return UserName 数据库用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 数据库用户名
     * @param UserName 数据库用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 账号权限变更信息 
     * @return DBPrivileges 账号权限变更信息
     */
    public DBPrivilegeModifyInfo [] getDBPrivileges() {
        return this.DBPrivileges;
    }

    /**
     * Set 账号权限变更信息
     * @param DBPrivileges 账号权限变更信息
     */
    public void setDBPrivileges(DBPrivilegeModifyInfo [] DBPrivileges) {
        this.DBPrivileges = DBPrivileges;
    }

    /**
     * Get 表示是否为管理员账户，当值为true，表示是 管理员。若实例 是 单节点，则管理员所在的 账号类型为超级权限账号 ，即AccountType=L0；若实例 是 双节点，则管理员所在的 账号类型为高级权限账号，即AccountType=L1；当值为false，表示 不是管理员，则账号类型为普通账号，即AccountType=L3 
     * @return IsAdmin 表示是否为管理员账户，当值为true，表示是 管理员。若实例 是 单节点，则管理员所在的 账号类型为超级权限账号 ，即AccountType=L0；若实例 是 双节点，则管理员所在的 账号类型为高级权限账号，即AccountType=L1；当值为false，表示 不是管理员，则账号类型为普通账号，即AccountType=L3
     */
    public Boolean getIsAdmin() {
        return this.IsAdmin;
    }

    /**
     * Set 表示是否为管理员账户，当值为true，表示是 管理员。若实例 是 单节点，则管理员所在的 账号类型为超级权限账号 ，即AccountType=L0；若实例 是 双节点，则管理员所在的 账号类型为高级权限账号，即AccountType=L1；当值为false，表示 不是管理员，则账号类型为普通账号，即AccountType=L3
     * @param IsAdmin 表示是否为管理员账户，当值为true，表示是 管理员。若实例 是 单节点，则管理员所在的 账号类型为超级权限账号 ，即AccountType=L0；若实例 是 双节点，则管理员所在的 账号类型为高级权限账号，即AccountType=L1；当值为false，表示 不是管理员，则账号类型为普通账号，即AccountType=L3
     */
    public void setIsAdmin(Boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    /**
     * Get 账号类型，IsAdmin字段的扩展字段。 L0-超级权限(基础版独有),L1-高级权限,L2-特殊权限,L3-普通权限，默认L3 
     * @return AccountType 账号类型，IsAdmin字段的扩展字段。 L0-超级权限(基础版独有),L1-高级权限,L2-特殊权限,L3-普通权限，默认L3
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 账号类型，IsAdmin字段的扩展字段。 L0-超级权限(基础版独有),L1-高级权限,L2-特殊权限,L3-普通权限，默认L3
     * @param AccountType 账号类型，IsAdmin字段的扩展字段。 L0-超级权限(基础版独有),L1-高级权限,L2-特殊权限,L3-普通权限，默认L3
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    public AccountPrivilegeModifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountPrivilegeModifyInfo(AccountPrivilegeModifyInfo source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DBPrivileges != null) {
            this.DBPrivileges = new DBPrivilegeModifyInfo[source.DBPrivileges.length];
            for (int i = 0; i < source.DBPrivileges.length; i++) {
                this.DBPrivileges[i] = new DBPrivilegeModifyInfo(source.DBPrivileges[i]);
            }
        }
        if (source.IsAdmin != null) {
            this.IsAdmin = new Boolean(source.IsAdmin);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "DBPrivileges.", this.DBPrivileges);
        this.setParamSimple(map, prefix + "IsAdmin", this.IsAdmin);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);

    }
}

