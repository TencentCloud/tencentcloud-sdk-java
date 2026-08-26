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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserManagerUserBriefInfo extends AbstractModel {

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>用户所属的组</p>
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * <p>Manager表示管理员、NormalUser表示普通用户</p>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * <p>用户创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>是否可以下载用户对应的keytab文件，对开启kerberos的集群才有意义</p>
    */
    @SerializedName("SupportDownLoadKeyTab")
    @Expose
    private Boolean SupportDownLoadKeyTab;

    /**
    * <p>keytab文件的下载地址</p>
    */
    @SerializedName("DownLoadKeyTabUrl")
    @Expose
    private String DownLoadKeyTabUrl;

    /**
    * <p>用户组</p>
    */
    @SerializedName("Groups")
    @Expose
    private String [] Groups;

    /**
    * <p>客户UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>用户状态</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>是否展示密码更新时间</p>
    */
    @SerializedName("DisplayPasswdUpdateTime")
    @Expose
    private Boolean DisplayPasswdUpdateTime;

    /**
    * <p>密码最近更新时间</p>
    */
    @SerializedName("PasswdUpdateTime")
    @Expose
    private String PasswdUpdateTime;

    /**
    * <p>已经使用的天数</p><p>单位：天</p>
    */
    @SerializedName("PasswdUsedDay")
    @Expose
    private Long PasswdUsedDay;

    /**
    * <p>已经使用的小时数</p><p>单位：时</p>
    */
    @SerializedName("PasswdUsedHour")
    @Expose
    private Long PasswdUsedHour;

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
     * Get <p>用户所属的组</p> 
     * @return UserGroup <p>用户所属的组</p>
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set <p>用户所属的组</p>
     * @param UserGroup <p>用户所属的组</p>
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get <p>Manager表示管理员、NormalUser表示普通用户</p> 
     * @return UserType <p>Manager表示管理员、NormalUser表示普通用户</p>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>Manager表示管理员、NormalUser表示普通用户</p>
     * @param UserType <p>Manager表示管理员、NormalUser表示普通用户</p>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get <p>用户创建时间</p> 
     * @return CreateTime <p>用户创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>用户创建时间</p>
     * @param CreateTime <p>用户创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>是否可以下载用户对应的keytab文件，对开启kerberos的集群才有意义</p> 
     * @return SupportDownLoadKeyTab <p>是否可以下载用户对应的keytab文件，对开启kerberos的集群才有意义</p>
     */
    public Boolean getSupportDownLoadKeyTab() {
        return this.SupportDownLoadKeyTab;
    }

    /**
     * Set <p>是否可以下载用户对应的keytab文件，对开启kerberos的集群才有意义</p>
     * @param SupportDownLoadKeyTab <p>是否可以下载用户对应的keytab文件，对开启kerberos的集群才有意义</p>
     */
    public void setSupportDownLoadKeyTab(Boolean SupportDownLoadKeyTab) {
        this.SupportDownLoadKeyTab = SupportDownLoadKeyTab;
    }

    /**
     * Get <p>keytab文件的下载地址</p> 
     * @return DownLoadKeyTabUrl <p>keytab文件的下载地址</p>
     */
    public String getDownLoadKeyTabUrl() {
        return this.DownLoadKeyTabUrl;
    }

    /**
     * Set <p>keytab文件的下载地址</p>
     * @param DownLoadKeyTabUrl <p>keytab文件的下载地址</p>
     */
    public void setDownLoadKeyTabUrl(String DownLoadKeyTabUrl) {
        this.DownLoadKeyTabUrl = DownLoadKeyTabUrl;
    }

    /**
     * Get <p>用户组</p> 
     * @return Groups <p>用户组</p>
     */
    public String [] getGroups() {
        return this.Groups;
    }

    /**
     * Set <p>用户组</p>
     * @param Groups <p>用户组</p>
     */
    public void setGroups(String [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get <p>客户UIN</p> 
     * @return Uin <p>客户UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>客户UIN</p>
     * @param Uin <p>客户UIN</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>用户状态</p> 
     * @return State <p>用户状态</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>用户状态</p>
     * @param State <p>用户状态</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>是否展示密码更新时间</p> 
     * @return DisplayPasswdUpdateTime <p>是否展示密码更新时间</p>
     */
    public Boolean getDisplayPasswdUpdateTime() {
        return this.DisplayPasswdUpdateTime;
    }

    /**
     * Set <p>是否展示密码更新时间</p>
     * @param DisplayPasswdUpdateTime <p>是否展示密码更新时间</p>
     */
    public void setDisplayPasswdUpdateTime(Boolean DisplayPasswdUpdateTime) {
        this.DisplayPasswdUpdateTime = DisplayPasswdUpdateTime;
    }

    /**
     * Get <p>密码最近更新时间</p> 
     * @return PasswdUpdateTime <p>密码最近更新时间</p>
     */
    public String getPasswdUpdateTime() {
        return this.PasswdUpdateTime;
    }

    /**
     * Set <p>密码最近更新时间</p>
     * @param PasswdUpdateTime <p>密码最近更新时间</p>
     */
    public void setPasswdUpdateTime(String PasswdUpdateTime) {
        this.PasswdUpdateTime = PasswdUpdateTime;
    }

    /**
     * Get <p>已经使用的天数</p><p>单位：天</p> 
     * @return PasswdUsedDay <p>已经使用的天数</p><p>单位：天</p>
     */
    public Long getPasswdUsedDay() {
        return this.PasswdUsedDay;
    }

    /**
     * Set <p>已经使用的天数</p><p>单位：天</p>
     * @param PasswdUsedDay <p>已经使用的天数</p><p>单位：天</p>
     */
    public void setPasswdUsedDay(Long PasswdUsedDay) {
        this.PasswdUsedDay = PasswdUsedDay;
    }

    /**
     * Get <p>已经使用的小时数</p><p>单位：时</p> 
     * @return PasswdUsedHour <p>已经使用的小时数</p><p>单位：时</p>
     */
    public Long getPasswdUsedHour() {
        return this.PasswdUsedHour;
    }

    /**
     * Set <p>已经使用的小时数</p><p>单位：时</p>
     * @param PasswdUsedHour <p>已经使用的小时数</p><p>单位：时</p>
     */
    public void setPasswdUsedHour(Long PasswdUsedHour) {
        this.PasswdUsedHour = PasswdUsedHour;
    }

    public UserManagerUserBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserManagerUserBriefInfo(UserManagerUserBriefInfo source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SupportDownLoadKeyTab != null) {
            this.SupportDownLoadKeyTab = new Boolean(source.SupportDownLoadKeyTab);
        }
        if (source.DownLoadKeyTabUrl != null) {
            this.DownLoadKeyTabUrl = new String(source.DownLoadKeyTabUrl);
        }
        if (source.Groups != null) {
            this.Groups = new String[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new String(source.Groups[i]);
            }
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.DisplayPasswdUpdateTime != null) {
            this.DisplayPasswdUpdateTime = new Boolean(source.DisplayPasswdUpdateTime);
        }
        if (source.PasswdUpdateTime != null) {
            this.PasswdUpdateTime = new String(source.PasswdUpdateTime);
        }
        if (source.PasswdUsedDay != null) {
            this.PasswdUsedDay = new Long(source.PasswdUsedDay);
        }
        if (source.PasswdUsedHour != null) {
            this.PasswdUsedHour = new Long(source.PasswdUsedHour);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SupportDownLoadKeyTab", this.SupportDownLoadKeyTab);
        this.setParamSimple(map, prefix + "DownLoadKeyTabUrl", this.DownLoadKeyTabUrl);
        this.setParamArraySimple(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "DisplayPasswdUpdateTime", this.DisplayPasswdUpdateTime);
        this.setParamSimple(map, prefix + "PasswdUpdateTime", this.PasswdUpdateTime);
        this.setParamSimple(map, prefix + "PasswdUsedDay", this.PasswdUsedDay);
        this.setParamSimple(map, prefix + "PasswdUsedHour", this.PasswdUsedHour);

    }
}

