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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Account extends AbstractModel {

    /**
    * <p>数据库账号名</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>主机</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>数据库账号描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>用户最大连接数</p>
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
    * <p>是否开启密码轮转(0:关闭;1:开启)</p>
    */
    @SerializedName("PasswordRotation")
    @Expose
    private Long PasswordRotation;

    /**
     * Get <p>数据库账号名</p> 
     * @return AccountName <p>数据库账号名</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>数据库账号名</p>
     * @param AccountName <p>数据库账号名</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>主机</p> 
     * @return Host <p>主机</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>主机</p>
     * @param Host <p>主机</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>数据库账号描述</p> 
     * @return Description <p>数据库账号描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>数据库账号描述</p>
     * @param Description <p>数据库账号描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>用户最大连接数</p> 
     * @return MaxUserConnections <p>用户最大连接数</p>
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set <p>用户最大连接数</p>
     * @param MaxUserConnections <p>用户最大连接数</p>
     */
    public void setMaxUserConnections(Long MaxUserConnections) {
        this.MaxUserConnections = MaxUserConnections;
    }

    /**
     * Get <p>是否开启密码轮转(0:关闭;1:开启)</p> 
     * @return PasswordRotation <p>是否开启密码轮转(0:关闭;1:开启)</p>
     */
    public Long getPasswordRotation() {
        return this.PasswordRotation;
    }

    /**
     * Set <p>是否开启密码轮转(0:关闭;1:开启)</p>
     * @param PasswordRotation <p>是否开启密码轮转(0:关闭;1:开启)</p>
     */
    public void setPasswordRotation(Long PasswordRotation) {
        this.PasswordRotation = PasswordRotation;
    }

    public Account() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Account(Account source) {
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.MaxUserConnections != null) {
            this.MaxUserConnections = new Long(source.MaxUserConnections);
        }
        if (source.PasswordRotation != null) {
            this.PasswordRotation = new Long(source.PasswordRotation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "MaxUserConnections", this.MaxUserConnections);
        this.setParamSimple(map, prefix + "PasswordRotation", this.PasswordRotation);

    }
}

