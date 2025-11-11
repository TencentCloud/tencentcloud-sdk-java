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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataTransformSqlDataSource extends AbstractModel {

    /**
    * 数据源类型 1:MySql;2:自建mysql;3:pgsql
    */
    @SerializedName("DataSource")
    @Expose
    private Long DataSource;

    /**
    * InstanceId所属地域。例如：ap-guangzhou
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例Id。
- 当DataSource为1时，表示云数据库Mysql 实例id，如：cdb-zxcvbnm

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * mysql访问用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 别名。数据加工语句中使用
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * mysql访问密码。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 数据源类型 1:MySql;2:自建mysql;3:pgsql 
     * @return DataSource 数据源类型 1:MySql;2:自建mysql;3:pgsql
     */
    public Long getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据源类型 1:MySql;2:自建mysql;3:pgsql
     * @param DataSource 数据源类型 1:MySql;2:自建mysql;3:pgsql
     */
    public void setDataSource(Long DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get InstanceId所属地域。例如：ap-guangzhou 
     * @return Region InstanceId所属地域。例如：ap-guangzhou
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set InstanceId所属地域。例如：ap-guangzhou
     * @param Region InstanceId所属地域。例如：ap-guangzhou
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例Id。
- 当DataSource为1时，表示云数据库Mysql 实例id，如：cdb-zxcvbnm
 
     * @return InstanceId 实例Id。
- 当DataSource为1时，表示云数据库Mysql 实例id，如：cdb-zxcvbnm

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id。
- 当DataSource为1时，表示云数据库Mysql 实例id，如：cdb-zxcvbnm

     * @param InstanceId 实例Id。
- 当DataSource为1时，表示云数据库Mysql 实例id，如：cdb-zxcvbnm

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get mysql访问用户名 
     * @return User mysql访问用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set mysql访问用户名
     * @param User mysql访问用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 别名。数据加工语句中使用 
     * @return AliasName 别名。数据加工语句中使用
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 别名。数据加工语句中使用
     * @param AliasName 别名。数据加工语句中使用
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get mysql访问密码。 
     * @return Password mysql访问密码。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set mysql访问密码。
     * @param Password mysql访问密码。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public DataTransformSqlDataSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataTransformSqlDataSource(DataTransformSqlDataSource source) {
        if (source.DataSource != null) {
            this.DataSource = new Long(source.DataSource);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

