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

public class MysqlConnection extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>JDBC连接地址</p>
    */
    @SerializedName("JDBCUrl")
    @Expose
    private String JDBCUrl;

    /**
    * <p>账号</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>网络信息</p>
    */
    @SerializedName("NetWork")
    @Expose
    private NetWork NetWork;

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
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>JDBC连接地址</p> 
     * @return JDBCUrl <p>JDBC连接地址</p>
     */
    public String getJDBCUrl() {
        return this.JDBCUrl;
    }

    /**
     * Set <p>JDBC连接地址</p>
     * @param JDBCUrl <p>JDBC连接地址</p>
     */
    public void setJDBCUrl(String JDBCUrl) {
        this.JDBCUrl = JDBCUrl;
    }

    /**
     * Get <p>账号</p> 
     * @return User <p>账号</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>账号</p>
     * @param User <p>账号</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>密码</p> 
     * @return Password <p>密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>密码</p>
     * @param Password <p>密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>网络信息</p> 
     * @return NetWork <p>网络信息</p>
     */
    public NetWork getNetWork() {
        return this.NetWork;
    }

    /**
     * Set <p>网络信息</p>
     * @param NetWork <p>网络信息</p>
     */
    public void setNetWork(NetWork NetWork) {
        this.NetWork = NetWork;
    }

    public MysqlConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MysqlConnection(MysqlConnection source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.JDBCUrl != null) {
            this.JDBCUrl = new String(source.JDBCUrl);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.NetWork != null) {
            this.NetWork = new NetWork(source.NetWork);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "JDBCUrl", this.JDBCUrl);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "NetWork.", this.NetWork);

    }
}

