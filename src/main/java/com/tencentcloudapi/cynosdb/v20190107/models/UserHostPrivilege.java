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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserHostPrivilege extends AbstractModel {

    /**
    * <p>授权用户</p>
    */
    @SerializedName("DbUserName")
    @Expose
    private String DbUserName;

    /**
    * <p>客户端ip</p>
    */
    @SerializedName("DbHost")
    @Expose
    private String DbHost;

    /**
    * <p>用户权限</p>
    */
    @SerializedName("DbPrivilege")
    @Expose
    private String DbPrivilege;

    /**
    * <p>权限明细列表</p>
    */
    @SerializedName("PrivilegeList")
    @Expose
    private String [] PrivilegeList;

    /**
     * Get <p>授权用户</p> 
     * @return DbUserName <p>授权用户</p>
     */
    public String getDbUserName() {
        return this.DbUserName;
    }

    /**
     * Set <p>授权用户</p>
     * @param DbUserName <p>授权用户</p>
     */
    public void setDbUserName(String DbUserName) {
        this.DbUserName = DbUserName;
    }

    /**
     * Get <p>客户端ip</p> 
     * @return DbHost <p>客户端ip</p>
     */
    public String getDbHost() {
        return this.DbHost;
    }

    /**
     * Set <p>客户端ip</p>
     * @param DbHost <p>客户端ip</p>
     */
    public void setDbHost(String DbHost) {
        this.DbHost = DbHost;
    }

    /**
     * Get <p>用户权限</p> 
     * @return DbPrivilege <p>用户权限</p>
     */
    public String getDbPrivilege() {
        return this.DbPrivilege;
    }

    /**
     * Set <p>用户权限</p>
     * @param DbPrivilege <p>用户权限</p>
     */
    public void setDbPrivilege(String DbPrivilege) {
        this.DbPrivilege = DbPrivilege;
    }

    /**
     * Get <p>权限明细列表</p> 
     * @return PrivilegeList <p>权限明细列表</p>
     */
    public String [] getPrivilegeList() {
        return this.PrivilegeList;
    }

    /**
     * Set <p>权限明细列表</p>
     * @param PrivilegeList <p>权限明细列表</p>
     */
    public void setPrivilegeList(String [] PrivilegeList) {
        this.PrivilegeList = PrivilegeList;
    }

    public UserHostPrivilege() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserHostPrivilege(UserHostPrivilege source) {
        if (source.DbUserName != null) {
            this.DbUserName = new String(source.DbUserName);
        }
        if (source.DbHost != null) {
            this.DbHost = new String(source.DbHost);
        }
        if (source.DbPrivilege != null) {
            this.DbPrivilege = new String(source.DbPrivilege);
        }
        if (source.PrivilegeList != null) {
            this.PrivilegeList = new String[source.PrivilegeList.length];
            for (int i = 0; i < source.PrivilegeList.length; i++) {
                this.PrivilegeList[i] = new String(source.PrivilegeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbUserName", this.DbUserName);
        this.setParamSimple(map, prefix + "DbHost", this.DbHost);
        this.setParamSimple(map, prefix + "DbPrivilege", this.DbPrivilege);
        this.setParamArraySimple(map, prefix + "PrivilegeList.", this.PrivilegeList);

    }
}

