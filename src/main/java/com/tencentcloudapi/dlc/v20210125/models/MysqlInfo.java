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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MysqlInfo extends AbstractModel{

    /**
    * 连接mysql的jdbc url
    */
    @SerializedName("JdbcUrl")
    @Expose
    private String JdbcUrl;

    /**
    * 用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * mysql密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * mysql数据源的网络信息
    */
    @SerializedName("Location")
    @Expose
    private DatasourceConnectionLocation Location;

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 数据库实例ID，和数据库侧保持一致
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库实例名称，和数据库侧保持一致
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get 连接mysql的jdbc url 
     * @return JdbcUrl 连接mysql的jdbc url
     */
    public String getJdbcUrl() {
        return this.JdbcUrl;
    }

    /**
     * Set 连接mysql的jdbc url
     * @param JdbcUrl 连接mysql的jdbc url
     */
    public void setJdbcUrl(String JdbcUrl) {
        this.JdbcUrl = JdbcUrl;
    }

    /**
     * Get 用户名 
     * @return User 用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名
     * @param User 用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get mysql密码 
     * @return Password mysql密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set mysql密码
     * @param Password mysql密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get mysql数据源的网络信息 
     * @return Location mysql数据源的网络信息
     */
    public DatasourceConnectionLocation getLocation() {
        return this.Location;
    }

    /**
     * Set mysql数据源的网络信息
     * @param Location mysql数据源的网络信息
     */
    public void setLocation(DatasourceConnectionLocation Location) {
        this.Location = Location;
    }

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 数据库实例ID，和数据库侧保持一致
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 数据库实例ID，和数据库侧保持一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据库实例ID，和数据库侧保持一致
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 数据库实例ID，和数据库侧保持一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库实例名称，和数据库侧保持一致
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 数据库实例名称，和数据库侧保持一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 数据库实例名称，和数据库侧保持一致
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 数据库实例名称，和数据库侧保持一致
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public MysqlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MysqlInfo(MysqlInfo source) {
        if (source.JdbcUrl != null) {
            this.JdbcUrl = new String(source.JdbcUrl);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Location != null) {
            this.Location = new DatasourceConnectionLocation(source.Location);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JdbcUrl", this.JdbcUrl);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

