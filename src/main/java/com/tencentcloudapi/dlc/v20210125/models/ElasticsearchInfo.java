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

public class ElasticsearchInfo extends AbstractModel {

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 密码，需要base64编码
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
    * 默认数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 访问Elasticsearch的ip、端口信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceInfo")
    @Expose
    private IpPortPair [] ServiceInfo;

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return User 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param User 用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 密码，需要base64编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 密码，需要base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码，需要base64编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 密码，需要base64编码
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
     * Get 默认数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbName 默认数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 默认数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbName 默认数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 访问Elasticsearch的ip、端口信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceInfo 访问Elasticsearch的ip、端口信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpPortPair [] getServiceInfo() {
        return this.ServiceInfo;
    }

    /**
     * Set 访问Elasticsearch的ip、端口信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceInfo 访问Elasticsearch的ip、端口信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceInfo(IpPortPair [] ServiceInfo) {
        this.ServiceInfo = ServiceInfo;
    }

    public ElasticsearchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElasticsearchInfo(ElasticsearchInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
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
        if (source.ServiceInfo != null) {
            this.ServiceInfo = new IpPortPair[source.ServiceInfo.length];
            for (int i = 0; i < source.ServiceInfo.length; i++) {
                this.ServiceInfo[i] = new IpPortPair(source.ServiceInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamArrayObj(map, prefix + "ServiceInfo.", this.ServiceInfo);

    }
}

