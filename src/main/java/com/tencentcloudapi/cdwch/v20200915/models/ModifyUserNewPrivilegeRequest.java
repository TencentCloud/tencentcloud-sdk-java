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
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * cluster名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 是否所有数据库表
    */
    @SerializedName("AllDatabase")
    @Expose
    private Boolean AllDatabase;

    /**
    * 全局权限
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * 数据库表权限
    */
    @SerializedName("DatabasePrivilegeList")
    @Expose
    private DatabasePrivilegeInfo [] DatabasePrivilegeList;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get cluster名称 
     * @return Cluster cluster名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set cluster名称
     * @param Cluster cluster名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 是否所有数据库表 
     * @return AllDatabase 是否所有数据库表
     */
    public Boolean getAllDatabase() {
        return this.AllDatabase;
    }

    /**
     * Set 是否所有数据库表
     * @param AllDatabase 是否所有数据库表
     */
    public void setAllDatabase(Boolean AllDatabase) {
        this.AllDatabase = AllDatabase;
    }

    /**
     * Get 全局权限 
     * @return GlobalPrivileges 全局权限
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set 全局权限
     * @param GlobalPrivileges 全局权限
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get 数据库表权限 
     * @return DatabasePrivilegeList 数据库表权限
     */
    public DatabasePrivilegeInfo [] getDatabasePrivilegeList() {
        return this.DatabasePrivilegeList;
    }

    /**
     * Set 数据库表权限
     * @param DatabasePrivilegeList 数据库表权限
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

