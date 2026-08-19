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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCHousePInfo extends AbstractModel {

    /**
    * <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>JdbcUrl</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JdbcUrl")
    @Expose
    private String JdbcUrl;

    /**
    * <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>密码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private DatasourceConnectionLocation Location;

    /**
    * <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>地址信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessInfo")
    @Expose
    private String AccessInfo;

    /**
     * Get <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName <p>实例名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>JdbcUrl</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JdbcUrl <p>JdbcUrl</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJdbcUrl() {
        return this.JdbcUrl;
    }

    /**
     * Set <p>JdbcUrl</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JdbcUrl <p>JdbcUrl</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJdbcUrl(String JdbcUrl) {
        this.JdbcUrl = JdbcUrl;
    }

    /**
     * Get <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param User <p>用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>密码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password <p>密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password <p>密码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location <p>地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatasourceConnectionLocation getLocation() {
        return this.Location;
    }

    /**
     * Set <p>地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location <p>地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(DatasourceConnectionLocation Location) {
        this.Location = Location;
    }

    /**
     * Get <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbName <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbName <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>地址信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessInfo <p>地址信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set <p>地址信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessInfo <p>地址信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessInfo(String AccessInfo) {
        this.AccessInfo = AccessInfo;
    }

    public TCHousePInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCHousePInfo(TCHousePInfo source) {
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
        if (source.AccessInfo != null) {
            this.AccessInfo = new String(source.AccessInfo);
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
        this.setParamSimple(map, prefix + "AccessInfo", this.AccessInfo);

    }
}

