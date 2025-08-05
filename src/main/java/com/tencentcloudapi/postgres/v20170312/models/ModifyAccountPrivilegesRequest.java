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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountPrivilegesRequest extends AbstractModel {

    /**
    * 实例ID。	可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 修改此账号对某数据库对象的权限。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 修改的权限信息，支持批量修改，一次最高修改50条。
    */
    @SerializedName("ModifyPrivilegeSet")
    @Expose
    private ModifyPrivilege [] ModifyPrivilegeSet;

    /**
     * Get 实例ID。	可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取 
     * @return DBInstanceId 实例ID。	可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。	可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     * @param DBInstanceId 实例ID。	可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 修改此账号对某数据库对象的权限。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取 
     * @return UserName 修改此账号对某数据库对象的权限。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 修改此账号对某数据库对象的权限。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     * @param UserName 修改此账号对某数据库对象的权限。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 修改的权限信息，支持批量修改，一次最高修改50条。 
     * @return ModifyPrivilegeSet 修改的权限信息，支持批量修改，一次最高修改50条。
     */
    public ModifyPrivilege [] getModifyPrivilegeSet() {
        return this.ModifyPrivilegeSet;
    }

    /**
     * Set 修改的权限信息，支持批量修改，一次最高修改50条。
     * @param ModifyPrivilegeSet 修改的权限信息，支持批量修改，一次最高修改50条。
     */
    public void setModifyPrivilegeSet(ModifyPrivilege [] ModifyPrivilegeSet) {
        this.ModifyPrivilegeSet = ModifyPrivilegeSet;
    }

    public ModifyAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountPrivilegesRequest(ModifyAccountPrivilegesRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ModifyPrivilegeSet != null) {
            this.ModifyPrivilegeSet = new ModifyPrivilege[source.ModifyPrivilegeSet.length];
            for (int i = 0; i < source.ModifyPrivilegeSet.length; i++) {
                this.ModifyPrivilegeSet[i] = new ModifyPrivilege(source.ModifyPrivilegeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "ModifyPrivilegeSet.", this.ModifyPrivilegeSet);

    }
}

