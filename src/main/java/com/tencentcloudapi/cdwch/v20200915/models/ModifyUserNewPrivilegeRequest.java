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

public class ModifyUserNewPrivilegeRequest extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>clickhouse逻辑集群名称，可通过连接集群执行 <code>SHOW CLUSTERS</code> 查询获得</p>
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>是否所有数据库表</p>
    */
    @SerializedName("AllDatabase")
    @Expose
    private Boolean AllDatabase;

    /**
    * <p>全局权限</p>
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * <p>数据库表权限</p>
    */
    @SerializedName("DatabasePrivilegeList")
    @Expose
    private DatabasePrivilegeInfo [] DatabasePrivilegeList;

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
     * Get <p>clickhouse逻辑集群名称，可通过连接集群执行 <code>SHOW CLUSTERS</code> 查询获得</p> 
     * @return Cluster <p>clickhouse逻辑集群名称，可通过连接集群执行 <code>SHOW CLUSTERS</code> 查询获得</p>
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set <p>clickhouse逻辑集群名称，可通过连接集群执行 <code>SHOW CLUSTERS</code> 查询获得</p>
     * @param Cluster <p>clickhouse逻辑集群名称，可通过连接集群执行 <code>SHOW CLUSTERS</code> 查询获得</p>
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>是否所有数据库表</p> 
     * @return AllDatabase <p>是否所有数据库表</p>
     */
    public Boolean getAllDatabase() {
        return this.AllDatabase;
    }

    /**
     * Set <p>是否所有数据库表</p>
     * @param AllDatabase <p>是否所有数据库表</p>
     */
    public void setAllDatabase(Boolean AllDatabase) {
        this.AllDatabase = AllDatabase;
    }

    /**
     * Get <p>全局权限</p> 
     * @return GlobalPrivileges <p>全局权限</p>
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set <p>全局权限</p>
     * @param GlobalPrivileges <p>全局权限</p>
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get <p>数据库表权限</p> 
     * @return DatabasePrivilegeList <p>数据库表权限</p>
     */
    public DatabasePrivilegeInfo [] getDatabasePrivilegeList() {
        return this.DatabasePrivilegeList;
    }

    /**
     * Set <p>数据库表权限</p>
     * @param DatabasePrivilegeList <p>数据库表权限</p>
     */
    public void setDatabasePrivilegeList(DatabasePrivilegeInfo [] DatabasePrivilegeList) {
        this.DatabasePrivilegeList = DatabasePrivilegeList;
    }

    public ModifyUserNewPrivilegeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserNewPrivilegeRequest(ModifyUserNewPrivilegeRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Cluster != null) {
            this.Cluster = new String(source.Cluster);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.AllDatabase != null) {
            this.AllDatabase = new Boolean(source.AllDatabase);
        }
        if (source.GlobalPrivileges != null) {
            this.GlobalPrivileges = new String[source.GlobalPrivileges.length];
            for (int i = 0; i < source.GlobalPrivileges.length; i++) {
                this.GlobalPrivileges[i] = new String(source.GlobalPrivileges[i]);
            }
        }
        if (source.DatabasePrivilegeList != null) {
            this.DatabasePrivilegeList = new DatabasePrivilegeInfo[source.DatabasePrivilegeList.length];
            for (int i = 0; i < source.DatabasePrivilegeList.length; i++) {
                this.DatabasePrivilegeList[i] = new DatabasePrivilegeInfo(source.DatabasePrivilegeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "AllDatabase", this.AllDatabase);
        this.setParamArraySimple(map, prefix + "GlobalPrivileges.", this.GlobalPrivileges);
        this.setParamArrayObj(map, prefix + "DatabasePrivilegeList.", this.DatabasePrivilegeList);

    }
}

