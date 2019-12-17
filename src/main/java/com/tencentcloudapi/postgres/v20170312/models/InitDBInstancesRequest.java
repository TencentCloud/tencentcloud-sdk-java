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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InitDBInstancesRequest extends AbstractModel{

    /**
    * 实例ID集合。
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * 实例根账号用户名。
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * 实例根账号用户名对应的密码。
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * 实例字符集，目前只支持：UTF8、LATIN1。
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
     * Get 实例ID集合。 
     * @return DBInstanceIdSet 实例ID集合。
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set 实例ID集合。
     * @param DBInstanceIdSet 实例ID集合。
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * Get 实例根账号用户名。 
     * @return AdminName 实例根账号用户名。
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set 实例根账号用户名。
     * @param AdminName 实例根账号用户名。
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get 实例根账号用户名对应的密码。 
     * @return AdminPassword 实例根账号用户名对应的密码。
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set 实例根账号用户名对应的密码。
     * @param AdminPassword 实例根账号用户名对应的密码。
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get 实例字符集，目前只支持：UTF8、LATIN1。 
     * @return Charset 实例字符集，目前只支持：UTF8、LATIN1。
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set 实例字符集，目前只支持：UTF8、LATIN1。
     * @param Charset 实例字符集，目前只支持：UTF8、LATIN1。
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "Charset", this.Charset);

    }
}

