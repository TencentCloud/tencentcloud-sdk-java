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

public class DataBasePrivilegeModifyInfo extends AbstractModel {

    /**
    * 数据库名称
    */
    @SerializedName("DataBaseName")
    @Expose
    private String DataBaseName;

    /**
    * 数据库权限变更信息
    */
    @SerializedName("AccountPrivileges")
    @Expose
    private AccountPrivilege [] AccountPrivileges;

    /**
     * Get 数据库名称 
     * @return DataBaseName 数据库名称
     */
    public String getDataBaseName() {
        return this.DataBaseName;
    }

    /**
     * Set 数据库名称
     * @param DataBaseName 数据库名称
     */
    public void setDataBaseName(String DataBaseName) {
        this.DataBaseName = DataBaseName;
    }

    /**
     * Get 数据库权限变更信息 
     * @return AccountPrivileges 数据库权限变更信息
     */
    public AccountPrivilege [] getAccountPrivileges() {
        return this.AccountPrivileges;
    }

    /**
     * Set 数据库权限变更信息
     * @param AccountPrivileges 数据库权限变更信息
     */
    public void setAccountPrivileges(AccountPrivilege [] AccountPrivileges) {
        this.AccountPrivileges = AccountPrivileges;
    }

    public DataBasePrivilegeModifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataBasePrivilegeModifyInfo(DataBasePrivilegeModifyInfo source) {
        if (source.DataBaseName != null) {
            this.DataBaseName = new String(source.DataBaseName);
        }
        if (source.AccountPrivileges != null) {
            this.AccountPrivileges = new AccountPrivilege[source.AccountPrivileges.length];
            for (int i = 0; i < source.AccountPrivileges.length; i++) {
                this.AccountPrivileges[i] = new AccountPrivilege(source.AccountPrivileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataBaseName", this.DataBaseName);
        this.setParamArrayObj(map, prefix + "AccountPrivileges.", this.AccountPrivileges);

    }
}

