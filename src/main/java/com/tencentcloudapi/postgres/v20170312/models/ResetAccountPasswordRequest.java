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

public class ResetAccountPasswordRequest extends AbstractModel {

    /**
    * 实例ID，形如postgres-4wdeb0zv
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例账户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * UserName账户对应的新密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 实例ID，形如postgres-4wdeb0zv 
     * @return DBInstanceId 实例ID，形如postgres-4wdeb0zv
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID，形如postgres-4wdeb0zv
     * @param DBInstanceId 实例ID，形如postgres-4wdeb0zv
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 实例账户名 
     * @return UserName 实例账户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 实例账户名
     * @param UserName 实例账户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get UserName账户对应的新密码 
     * @return Password UserName账户对应的新密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set UserName账户对应的新密码
     * @param Password UserName账户对应的新密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ResetAccountPasswordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetAccountPasswordRequest(ResetAccountPasswordRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
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
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

