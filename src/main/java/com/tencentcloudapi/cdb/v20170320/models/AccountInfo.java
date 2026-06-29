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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel {

    /**
    * <p>账号备注信息</p>
    */
    @SerializedName("Notes")
    @Expose
    private String Notes;

    /**
    * <p>账号的域名</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>账号的名称</p>
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * <p>账号信息修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>修改密码的时间</p>
    */
    @SerializedName("ModifyPasswordTime")
    @Expose
    private String ModifyPasswordTime;

    /**
    * <p>该值已废弃</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>用户最大可用实例连接数</p>
    */
    @SerializedName("MaxUserConnections")
    @Expose
    private Long MaxUserConnections;

    /**
    * <p>用户账号是否开启了密码轮转</p>
    */
    @SerializedName("OpenCam")
    @Expose
    private Boolean OpenCam;

    /**
     * Get <p>账号备注信息</p> 
     * @return Notes <p>账号备注信息</p>
     */
    public String getNotes() {
        return this.Notes;
    }

    /**
     * Set <p>账号备注信息</p>
     * @param Notes <p>账号备注信息</p>
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * Get <p>账号的域名</p> 
     * @return Host <p>账号的域名</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>账号的域名</p>
     * @param Host <p>账号的域名</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>账号的名称</p> 
     * @return User <p>账号的名称</p>
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set <p>账号的名称</p>
     * @param User <p>账号的名称</p>
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get <p>账号信息修改时间</p> 
     * @return ModifyTime <p>账号信息修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>账号信息修改时间</p>
     * @param ModifyTime <p>账号信息修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>修改密码的时间</p> 
     * @return ModifyPasswordTime <p>修改密码的时间</p>
     */
    public String getModifyPasswordTime() {
        return this.ModifyPasswordTime;
    }

    /**
     * Set <p>修改密码的时间</p>
     * @param ModifyPasswordTime <p>修改密码的时间</p>
     */
    public void setModifyPasswordTime(String ModifyPasswordTime) {
        this.ModifyPasswordTime = ModifyPasswordTime;
    }

    /**
     * Get <p>该值已废弃</p> 
     * @return CreateTime <p>该值已废弃</p>
     * @deprecated
     */
    @Deprecated
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>该值已废弃</p>
     * @param CreateTime <p>该值已废弃</p>
     * @deprecated
     */
    @Deprecated
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>用户最大可用实例连接数</p> 
     * @return MaxUserConnections <p>用户最大可用实例连接数</p>
     */
    public Long getMaxUserConnections() {
        return this.MaxUserConnections;
    }

    /**
     * Set <p>用户最大可用实例连接数</p>
     * @param MaxUserConnections <p>用户最大可用实例连接数</p>
     */
    public void setMaxUserConnections(Long MaxUserConnections) {
        this.MaxUserConnections = MaxUserConnections;
    }

    /**
     * Get <p>用户账号是否开启了密码轮转</p> 
     * @return OpenCam <p>用户账号是否开启了密码轮转</p>
     */
    public Boolean getOpenCam() {
        return this.OpenCam;
    }

    /**
     * Set <p>用户账号是否开启了密码轮转</p>
     * @param OpenCam <p>用户账号是否开启了密码轮转</p>
     */
    public void setOpenCam(Boolean OpenCam) {
        this.OpenCam = OpenCam;
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
        if (source.OpenCam != null) {
            this.OpenCam = new Boolean(source.OpenCam);
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
        this.setParamSimple(map, prefix + "OpenCam", this.OpenCam);

    }
}

