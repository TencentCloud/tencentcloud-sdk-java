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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLocalAccountsData extends AbstractModel {

    /**
    * <p>uid，数据库中唯一</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>账号，登录账号</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>账号id，同Id字段</p>
    */
    @SerializedName("AccountId")
    @Expose
    private Long AccountId;

    /**
    * <p>账号所在的分组id</p>
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>账号所在的分组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>账号所在的分组名称路径，用英文.分割</p>
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * <p>账号来源,0表示本地账号(只支持32位)</p>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>账号状态,0禁用，1启用(只支持32位)</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>账号的创建时间</p>
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * <p>账号的最后更新时间</p>
    */
    @SerializedName("Utime")
    @Expose
    private String Utime;

    /**
    * <p>账号的扩展信息，包含邮箱、手机号、身份证、职位等信息</p>
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * <p>用户风险等级，枚举：none, low, middle, high</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>所属组</p>
    */
    @SerializedName("AccountGroups")
    @Expose
    private DescribeLocalAccountAccountGroupsData [] AccountGroups;

    /**
    * <p>绑定手机端设备数</p>
    */
    @SerializedName("MobileBindNum")
    @Expose
    private Long MobileBindNum;

    /**
    * <p>绑定Pc端设备数</p>
    */
    @SerializedName("PcBindNum")
    @Expose
    private Long PcBindNum;

    /**
    * <p>账号在线状态 1：在线 2：离线</p>
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * <p>账号活跃状态 1：活跃 2：非活跃</p>
    */
    @SerializedName("ActiveStatus")
    @Expose
    private Long ActiveStatus;

    /**
    * <p>账号登录时间</p>
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
    * <p>账号登出时间</p>
    */
    @SerializedName("LogoutTime")
    @Expose
    private String LogoutTime;

    /**
     * Get <p>uid，数据库中唯一</p> 
     * @return Id <p>uid，数据库中唯一</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>uid，数据库中唯一</p>
     * @param Id <p>uid，数据库中唯一</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>账号，登录账号</p> 
     * @return UserId <p>账号，登录账号</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>账号，登录账号</p>
     * @param UserId <p>账号，登录账号</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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
     * Get <p>账号id，同Id字段</p> 
     * @return AccountId <p>账号id，同Id字段</p>
     */
    public Long getAccountId() {
        return this.AccountId;
    }

    /**
     * Set <p>账号id，同Id字段</p>
     * @param AccountId <p>账号id，同Id字段</p>
     */
    public void setAccountId(Long AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get <p>账号所在的分组id</p> 
     * @return GroupId <p>账号所在的分组id</p>
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>账号所在的分组id</p>
     * @param GroupId <p>账号所在的分组id</p>
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>账号所在的分组名称</p> 
     * @return GroupName <p>账号所在的分组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>账号所在的分组名称</p>
     * @param GroupName <p>账号所在的分组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>账号所在的分组名称路径，用英文.分割</p> 
     * @return NamePath <p>账号所在的分组名称路径，用英文.分割</p>
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set <p>账号所在的分组名称路径，用英文.分割</p>
     * @param NamePath <p>账号所在的分组名称路径，用英文.分割</p>
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get <p>账号来源,0表示本地账号(只支持32位)</p> 
     * @return Source <p>账号来源,0表示本地账号(只支持32位)</p>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <p>账号来源,0表示本地账号(只支持32位)</p>
     * @param Source <p>账号来源,0表示本地账号(只支持32位)</p>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>账号状态,0禁用，1启用(只支持32位)</p> 
     * @return Status <p>账号状态,0禁用，1启用(只支持32位)</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>账号状态,0禁用，1启用(只支持32位)</p>
     * @param Status <p>账号状态,0禁用，1启用(只支持32位)</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>账号的创建时间</p> 
     * @return Itime <p>账号的创建时间</p>
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set <p>账号的创建时间</p>
     * @param Itime <p>账号的创建时间</p>
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
    }

    /**
     * Get <p>账号的最后更新时间</p> 
     * @return Utime <p>账号的最后更新时间</p>
     */
    public String getUtime() {
        return this.Utime;
    }

    /**
     * Set <p>账号的最后更新时间</p>
     * @param Utime <p>账号的最后更新时间</p>
     */
    public void setUtime(String Utime) {
        this.Utime = Utime;
    }

    /**
     * Get <p>账号的扩展信息，包含邮箱、手机号、身份证、职位等信息</p> 
     * @return ExtraInfo <p>账号的扩展信息，包含邮箱、手机号、身份证、职位等信息</p>
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set <p>账号的扩展信息，包含邮箱、手机号、身份证、职位等信息</p>
     * @param ExtraInfo <p>账号的扩展信息，包含邮箱、手机号、身份证、职位等信息</p>
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get <p>用户风险等级，枚举：none, low, middle, high</p> 
     * @return RiskLevel <p>用户风险等级，枚举：none, low, middle, high</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>用户风险等级，枚举：none, low, middle, high</p>
     * @param RiskLevel <p>用户风险等级，枚举：none, low, middle, high</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>所属组</p> 
     * @return AccountGroups <p>所属组</p>
     */
    public DescribeLocalAccountAccountGroupsData [] getAccountGroups() {
        return this.AccountGroups;
    }

    /**
     * Set <p>所属组</p>
     * @param AccountGroups <p>所属组</p>
     */
    public void setAccountGroups(DescribeLocalAccountAccountGroupsData [] AccountGroups) {
        this.AccountGroups = AccountGroups;
    }

    /**
     * Get <p>绑定手机端设备数</p> 
     * @return MobileBindNum <p>绑定手机端设备数</p>
     */
    public Long getMobileBindNum() {
        return this.MobileBindNum;
    }

    /**
     * Set <p>绑定手机端设备数</p>
     * @param MobileBindNum <p>绑定手机端设备数</p>
     */
    public void setMobileBindNum(Long MobileBindNum) {
        this.MobileBindNum = MobileBindNum;
    }

    /**
     * Get <p>绑定Pc端设备数</p> 
     * @return PcBindNum <p>绑定Pc端设备数</p>
     */
    public Long getPcBindNum() {
        return this.PcBindNum;
    }

    /**
     * Set <p>绑定Pc端设备数</p>
     * @param PcBindNum <p>绑定Pc端设备数</p>
     */
    public void setPcBindNum(Long PcBindNum) {
        this.PcBindNum = PcBindNum;
    }

    /**
     * Get <p>账号在线状态 1：在线 2：离线</p> 
     * @return OnlineStatus <p>账号在线状态 1：在线 2：离线</p>
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set <p>账号在线状态 1：在线 2：离线</p>
     * @param OnlineStatus <p>账号在线状态 1：在线 2：离线</p>
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get <p>账号活跃状态 1：活跃 2：非活跃</p> 
     * @return ActiveStatus <p>账号活跃状态 1：活跃 2：非活跃</p>
     */
    public Long getActiveStatus() {
        return this.ActiveStatus;
    }

    /**
     * Set <p>账号活跃状态 1：活跃 2：非活跃</p>
     * @param ActiveStatus <p>账号活跃状态 1：活跃 2：非活跃</p>
     */
    public void setActiveStatus(Long ActiveStatus) {
        this.ActiveStatus = ActiveStatus;
    }

    /**
     * Get <p>账号登录时间</p> 
     * @return LoginTime <p>账号登录时间</p>
     */
    public String getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set <p>账号登录时间</p>
     * @param LoginTime <p>账号登录时间</p>
     */
    public void setLoginTime(String LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get <p>账号登出时间</p> 
     * @return LogoutTime <p>账号登出时间</p>
     */
    public String getLogoutTime() {
        return this.LogoutTime;
    }

    /**
     * Set <p>账号登出时间</p>
     * @param LogoutTime <p>账号登出时间</p>
     */
    public void setLogoutTime(String LogoutTime) {
        this.LogoutTime = LogoutTime;
    }

    public DescribeLocalAccountsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLocalAccountsData(DescribeLocalAccountsData source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.AccountId != null) {
            this.AccountId = new Long(source.AccountId);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.NamePath != null) {
            this.NamePath = new String(source.NamePath);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Itime != null) {
            this.Itime = new String(source.Itime);
        }
        if (source.Utime != null) {
            this.Utime = new String(source.Utime);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.AccountGroups != null) {
            this.AccountGroups = new DescribeLocalAccountAccountGroupsData[source.AccountGroups.length];
            for (int i = 0; i < source.AccountGroups.length; i++) {
                this.AccountGroups[i] = new DescribeLocalAccountAccountGroupsData(source.AccountGroups[i]);
            }
        }
        if (source.MobileBindNum != null) {
            this.MobileBindNum = new Long(source.MobileBindNum);
        }
        if (source.PcBindNum != null) {
            this.PcBindNum = new Long(source.PcBindNum);
        }
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
        if (source.ActiveStatus != null) {
            this.ActiveStatus = new Long(source.ActiveStatus);
        }
        if (source.LoginTime != null) {
            this.LoginTime = new String(source.LoginTime);
        }
        if (source.LogoutTime != null) {
            this.LogoutTime = new String(source.LogoutTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "NamePath", this.NamePath);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Itime", this.Itime);
        this.setParamSimple(map, prefix + "Utime", this.Utime);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArrayObj(map, prefix + "AccountGroups.", this.AccountGroups);
        this.setParamSimple(map, prefix + "MobileBindNum", this.MobileBindNum);
        this.setParamSimple(map, prefix + "PcBindNum", this.PcBindNum);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);
        this.setParamSimple(map, prefix + "ActiveStatus", this.ActiveStatus);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "LogoutTime", this.LogoutTime);

    }
}

