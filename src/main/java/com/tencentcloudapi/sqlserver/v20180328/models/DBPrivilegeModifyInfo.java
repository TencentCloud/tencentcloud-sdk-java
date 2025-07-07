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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBPrivilegeModifyInfo extends AbstractModel {

    /**
    * 数据库名
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * 权限变更信息。ReadWrite表示可读写，ReadOnly表示只读，Delete表示删除账号对该DB的权限，DBOwner所有者
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
     * Get 数据库名 
     * @return DBName 数据库名
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set 数据库名
     * @param DBName 数据库名
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get 权限变更信息。ReadWrite表示可读写，ReadOnly表示只读，Delete表示删除账号对该DB的权限，DBOwner所有者 
     * @return Privilege 权限变更信息。ReadWrite表示可读写，ReadOnly表示只读，Delete表示删除账号对该DB的权限，DBOwner所有者
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 权限变更信息。ReadWrite表示可读写，ReadOnly表示只读，Delete表示删除账号对该DB的权限，DBOwner所有者
     * @param Privilege 权限变更信息。ReadWrite表示可读写，ReadOnly表示只读，Delete表示删除账号对该DB的权限，DBOwner所有者
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    public DBPrivilegeModifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBPrivilegeModifyInfo(DBPrivilegeModifyInfo source) {
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);

    }
}

