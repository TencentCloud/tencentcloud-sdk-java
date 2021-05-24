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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel{

    /**
    * 账号备注信息
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * 账号的域名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 账号的名称
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 账号信息修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 修改密码的时间
    */
    @SerializedName("ModifyPasswordTime")
    @Expose
    private String ModifyPasswordTime;

    /**
    * 该值已废弃
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 用户最大可用实例连接数
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
     * Get 账号备注信息 
     * @return Notes 账号备注信息
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set 账号备注信息
     * @param Notes 账号备注信息
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get 账号的域名 
     * @return Host 账号的域名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 账号的域名
     * @param Host 账号的域名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 账号的名称 
     * @return User 账号的名称
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 账号的名称
     * @param User 账号的名称
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 账号信息修改时间 
     * @return ModifyTime 账号信息修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 账号信息修改时间
     * @param ModifyTime 账号信息修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 修改密码的时间 
     * @return ModifyPasswordTime 修改密码的时间
     */
    public String getModifyPasswordTime() {
        return this.ModifyPasswordTime;
    }

    /**
     * Set 修改密码的时间
     * @param ModifyPasswordTime 修改密码的时间
     */
    public void setModifyPasswordTime(String ModifyPasswordTime) {
        this.ModifyPasswordTime = ModifyPasswordTime;
    }

    /**
     * Get 该值已废弃 
     * @return CreateTime 该值已废弃
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 该值已废弃
     * @param CreateTime 该值已废弃
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 用户最大可用实例连接数 
     * @return MaxUserConnections 用户最大可用实例连接数
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set 用户最大可用实例连接数
     * @param MaxUserConnections 用户最大可用实例连接数
     */
    public void setMaxUserConnections(Long MaxUserConnections) {
        this.MaxUserConnections = MaxUserConnections;
    }

    public AccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountInfo(AccountInfo source) {
        if (source.Notes != null) {
            this.Notes = new String(source.Notes);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ModifyPasswordTime != null) {
            this.ModifyPasswordTime = new String(source.ModifyPasswordTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MaxUserConnections != null) {
            this.MaxUserConnections = new Long(source.MaxUserConnections);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Notes", this.Notes);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ModifyPasswordTime", this.ModifyPasswordTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MaxUserConnections", this.MaxUserConnections);

    }
}

