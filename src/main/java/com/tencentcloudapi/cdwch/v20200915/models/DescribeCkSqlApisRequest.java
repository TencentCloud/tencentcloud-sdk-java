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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCkSqlApisRequest extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>api接口名称,GetClusters:获取集群cluster列表<br>GetSystemUsers:获取系统用户列表<br>CheckNodeCluster: 检查节点是否隶属一个cluster<br>GetClusterDatabases: 获取一个cluster下的数据库列表<br>GetClusterTables: 获取一个cluster下的数据库表列表<br>GetPrivilegeUsers: 获取授权的用户列表<br>GET_USER_CLUSTER_PRIVILEGES:获取用户cluster下的权限<br>GetUserClusterNewPrivileges:获取用户cluster下的权限 (新版）<br>RevokeClusterUser:解绑cluster用户<br>DeleteSystemUser:删除系统用户 —— 必须所有cluster先解绑<br>GetUserOptionMessages:获取用户配置备注信息<br>GET_USER_CONFIGS:获取用户配置列表  QUOTA、PROFILE、POLICY</p>
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * <p>clickhouse逻辑集群名称，可通过连接集群执行 <code>SHOW CLUSTERS</code> 查询获得。当 ApiType 取值为 GET_SYSTEM_USERS、GET_PRIVILEGE_USERS、GET_CLUSTER_DATABASES或GET_CLUSTER_TABLES 时，本参数必填。</p>
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * <p>用户名称，api与user相关的必填</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>账户的类型</p>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>api接口名称,GetClusters:获取集群cluster列表<br>GetSystemUsers:获取系统用户列表<br>CheckNodeCluster: 检查节点是否隶属一个cluster<br>GetClusterDatabases: 获取一个cluster下的数据库列表<br>GetClusterTables: 获取一个cluster下的数据库表列表<br>GetPrivilegeUsers: 获取授权的用户列表<br>GET_USER_CLUSTER_PRIVILEGES:获取用户cluster下的权限<br>GetUserClusterNewPrivileges:获取用户cluster下的权限 (新版）<br>RevokeClusterUser:解绑cluster用户<br>DeleteSystemUser:删除系统用户 —— 必须所有cluster先解绑<br>GetUserOptionMessages:获取用户配置备注信息<br>GET_USER_CONFIGS:获取用户配置列表  QUOTA、PROFILE、POLICY</p> 
     * @return ApiType <p>api接口名称,GetClusters:获取集群cluster列表<br>GetSystemUsers:获取系统用户列表<br>CheckNodeCluster: 检查节点是否隶属一个cluster<br>GetClusterDatabases: 获取一个cluster下的数据库列表<br>GetClusterTables: 获取一个cluster下的数据库表列表<br>GetPrivilegeUsers: 获取授权的用户列表<br>GET_USER_CLUSTER_PRIVILEGES:获取用户cluster下的权限<br>GetUserClusterNewPrivileges:获取用户cluster下的权限 (新版）<br>RevokeClusterUser:解绑cluster用户<br>DeleteSystemUser:删除系统用户 —— 必须所有cluster先解绑<br>GetUserOptionMessages:获取用户配置备注信息<br>GET_USER_CONFIGS:获取用户配置列表  QUOTA、PROFILE、POLICY</p>
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set <p>api接口名称,GetClusters:获取集群cluster列表<br>GetSystemUsers:获取系统用户列表<br>CheckNodeCluster: 检查节点是否隶属一个cluster<br>GetClusterDatabases: 获取一个cluster下的数据库列表<br>GetClusterTables: 获取一个cluster下的数据库表列表<br>GetPrivilegeUsers: 获取授权的用户列表<br>GET_USER_CLUSTER_PRIVILEGES:获取用户cluster下的权限<br>GetUserClusterNewPrivileges:获取用户cluster下的权限 (新版）<br>RevokeClusterUser:解绑cluster用户<br>DeleteSystemUser:删除系统用户 —— 必须所有cluster先解绑<br>GetUserOptionMessages:获取用户配置备注信息<br>GET_USER_CONFIGS:获取用户配置列表  QUOTA、PROFILE、POLICY</p>
     * @param ApiType <p>api接口名称,GetClusters:获取集群cluster列表<br>GetSystemUsers:获取系统用户列表<br>CheckNodeCluster: 检查节点是否隶属一个cluster<br>GetClusterDatabases: 获取一个cluster下的数据库列表<br>GetClusterTables: 获取一个cluster下的数据库表列表<br>GetPrivilegeUsers: 获取授权的用户列表<br>GET_USER_CLUSTER_PRIVILEGES:获取用户cluster下的权限<br>GetUserClusterNewPrivileges:获取用户cluster下的权限 (新版）<br>RevokeClusterUser:解绑cluster用户<br>DeleteSystemUser:删除系统用户 —— 必须所有cluster先解绑<br>GetUserOptionMessages:获取用户配置备注信息<br>GET_USER_CONFIGS:获取用户配置列表  QUOTA、PROFILE、POLICY</p>
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get <p>clickhouse逻辑集群名称，可通过连接集群执行 <code>SHOW CLUSTERS</code> 查询获得。当 ApiType 取值为 GET_SYSTEM_USERS、GET_PRIVILEGE_USERS、GET_CLUSTER_DATABASES或GET_CLUSTER_TABLES 时，本参数必填。</p> 
     * @return Cluster <p>clickhouse逻辑集群名称，可通过连接集群执行 <code>SHOW CLUSTERS</code> 查询获得。当 ApiType 取值为 GET_SYSTEM_USERS、GET_PRIVILEGE_USERS、GET_CLUSTER_DATABASES或GET_CLUSTER_TABLES 时，本参数必填。</p>
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set <p>clickhouse逻辑集群名称，可通过连接集群执行 <code>SHOW CLUSTERS</code> 查询获得。当 ApiType 取值为 GET_SYSTEM_USERS、GET_PRIVILEGE_USERS、GET_CLUSTER_DATABASES或GET_CLUSTER_TABLES 时，本参数必填。</p>
     * @param Cluster <p>clickhouse逻辑集群名称，可通过连接集群执行 <code>SHOW CLUSTERS</code> 查询获得。当 ApiType 取值为 GET_SYSTEM_USERS、GET_PRIVILEGE_USERS、GET_CLUSTER_DATABASES或GET_CLUSTER_TABLES 时，本参数必填。</p>
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get <p>用户名称，api与user相关的必填</p> 
     * @return UserName <p>用户名称，api与user相关的必填</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名称，api与user相关的必填</p>
     * @param UserName <p>用户名称，api与user相关的必填</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>账户的类型</p> 
     * @return UserType <p>账户的类型</p>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>账户的类型</p>
     * @param UserType <p>账户的类型</p>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public DescribeCkSqlApisRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCkSqlApisRequest(DescribeCkSqlApisRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.Cluster != null) {
            this.Cluster = new String(source.Cluster);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

