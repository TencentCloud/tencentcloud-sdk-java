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

public class DescribeMigrationDatabasesRequest extends AbstractModel {

    /**
    * 迁移源实例的ID，格式如：mssql-si2823jyl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 迁移源实例用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 迁移源实例密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 迁移源实例的ID，格式如：mssql-si2823jyl 
     * @return InstanceId 迁移源实例的ID，格式如：mssql-si2823jyl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 迁移源实例的ID，格式如：mssql-si2823jyl
     * @param InstanceId 迁移源实例的ID，格式如：mssql-si2823jyl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 迁移源实例用户名 
     * @return UserName 迁移源实例用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 迁移源实例用户名
     * @param UserName 迁移源实例用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 迁移源实例密码 
     * @return Password 迁移源实例密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 迁移源实例密码
     * @param Password 迁移源实例密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public DescribeMigrationDatabasesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigrationDatabasesRequest(DescribeMigrationDatabasesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

