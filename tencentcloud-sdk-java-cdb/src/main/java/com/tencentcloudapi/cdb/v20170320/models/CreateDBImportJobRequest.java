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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBImportJobRequest extends AbstractModel{

    /**
    * 实例的 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 文件名称。该文件是指用户已上传到腾讯云的文件。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 云数据库的用户名。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 云数据库实例 User 账号的密码。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 导入的目标数据库名，不传表示不指定数据库。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
     * Get 实例的 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例的 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例的 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例的 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 文件名称。该文件是指用户已上传到腾讯云的文件。 
     * @return FileName 文件名称。该文件是指用户已上传到腾讯云的文件。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称。该文件是指用户已上传到腾讯云的文件。
     * @param FileName 文件名称。该文件是指用户已上传到腾讯云的文件。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 云数据库的用户名。 
     * @return User 云数据库的用户名。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 云数据库的用户名。
     * @param User 云数据库的用户名。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 云数据库实例 User 账号的密码。 
     * @return Password 云数据库实例 User 账号的密码。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 云数据库实例 User 账号的密码。
     * @param Password 云数据库实例 User 账号的密码。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 导入的目标数据库名，不传表示不指定数据库。 
     * @return DbName 导入的目标数据库名，不传表示不指定数据库。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 导入的目标数据库名，不传表示不指定数据库。
     * @param DbName 导入的目标数据库名，不传表示不指定数据库。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "DbName", this.DbName);

    }
}

