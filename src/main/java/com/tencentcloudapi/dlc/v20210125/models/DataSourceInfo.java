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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceInfo extends AbstractModel {

    /**
    * 数据源实例的唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据源的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 数据源的JDBC访问链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JdbcUrl")
    @Expose
    private String JdbcUrl;

    /**
    * 用于访问数据源的用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 数据源访问密码，需要base64编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 数据源的VPC和子网信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private DatasourceConnectionLocation Location;

    /**
    * 默认数据库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
     * Get 数据源实例的唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 数据源实例的唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据源实例的唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 数据源实例的唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据源的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 数据源的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 数据源的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 数据源的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 数据源的JDBC访问链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JdbcUrl 数据源的JDBC访问链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJdbcUrl() {
        return this.JdbcUrl;
    }

    /**
     * Set 数据源的JDBC访问链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param JdbcUrl 数据源的JDBC访问链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJdbcUrl(String JdbcUrl) {
        this.JdbcUrl = JdbcUrl;
    }

    /**
     * Get 用于访问数据源的用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 用于访问数据源的用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用于访问数据源的用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 用于访问数据源的用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 数据源访问密码，需要base64编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 数据源访问密码，需要base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 数据源访问密码，需要base64编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 数据源访问密码，需要base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 数据源的VPC和子网信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 数据源的VPC和子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatasourceConnectionLocation getLocation() {
        return this.Location;
    }

    /**
     * Set 数据源的VPC和子网信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 数据源的VPC和子网信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(DatasourceConnectionLocation Location) {
        this.Location = Location;
    }

    /**
     * Get 默认数据库名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbName 默认数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 默认数据库名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbName 默认数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    public DataSourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceInfo(DataSourceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "JdbcUrl", this.JdbcUrl);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "DbName", this.DbName);

    }
}

