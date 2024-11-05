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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLocalAccountsData extends AbstractModel {

    /**
    * uid，数据库中唯一
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 账号，登录账号
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 账号id，同Id字段
    */
    @SerializedName("AccountId")
    @Expose
    private Long AccountId;

    /**
    * 账号所在的分组id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 账号所在的分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 账号所在的分组名称路径，用英文.分割
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * 账号来源,0表示本地账号(只支持32位)
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 账号状态,0禁用，1启用(只支持32位)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 账号的创建时间
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * 账号的最后更新时间
    */
    @SerializedName("Utime")
    @Expose
    private String Utime;

    /**
    * 账号的扩展信息，包含邮箱、手机号、身份证、职位等信息
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * 用户风险等级，枚举：none, low, middle, high
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 所属组
    */
    @SerializedName("AccountGroups")
    @Expose
    private DescribeLocalAccountAccountGroupsData [] AccountGroups;

    /**
    * 绑定手机端设备数
    */
    @SerializedName("MobileBindNum")
    @Expose
    private Long MobileBindNum;

    /**
    * 绑定Pc端设备数
    */
    @SerializedName("PcBindNum")
    @Expose
    private Long PcBindNum;

    /**
    * 账号在线状态 1：在线 2：离线
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * 账号活跃状态 1：活跃 2：非活跃
    */
    @SerializedName("ActiveStatus")
    @Expose
    private Long ActiveStatus;

    /**
    * 账号登录时间
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
    * 账号登出时间
    */
    @SerializedName("LogoutTime")
    @Expose
    private String LogoutTime;

    /**
     * Get uid，数据库中唯一 
     * @return Id uid，数据库中唯一
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set uid，数据库中唯一
     * @param Id uid，数据库中唯一
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 账号，登录账号 
     * @return UserId 账号，登录账号
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 账号，登录账号
     * @param UserId 账号，登录账号
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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
     * Get 账号id，同Id字段 
     * @return AccountId 账号id，同Id字段
     */
    public Long getAccountId() {
        return this.AccountId;
    }

    /**
     * Set 账号id，同Id字段
     * @param AccountId 账号id，同Id字段
     */
    public void setAccountId(Long AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 账号所在的分组id 
     * @return GroupId 账号所在的分组id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 账号所在的分组id
     * @param GroupId 账号所在的分组id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 账号所在的分组名称 
     * @return GroupName 账号所在的分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 账号所在的分组名称
     * @param GroupName 账号所在的分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 账号所在的分组名称路径，用英文.分割 
     * @return NamePath 账号所在的分组名称路径，用英文.分割
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set 账号所在的分组名称路径，用英文.分割
     * @param NamePath 账号所在的分组名称路径，用英文.分割
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get 账号来源,0表示本地账号(只支持32位) 
     * @return Source 账号来源,0表示本地账号(只支持32位)
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 账号来源,0表示本地账号(只支持32位)
     * @param Source 账号来源,0表示本地账号(只支持32位)
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 账号状态,0禁用，1启用(只支持32位) 
     * @return Status 账号状态,0禁用，1启用(只支持32位)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 账号状态,0禁用，1启用(只支持32位)
     * @param Status 账号状态,0禁用，1启用(只支持32位)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 账号的创建时间 
     * @return Itime 账号的创建时间
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set 账号的创建时间
     * @param Itime 账号的创建时间
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
    }

    /**
     * Get 账号的最后更新时间 
     * @return Utime 账号的最后更新时间
     */
    public String getUtime() {
        return this.Utime;
    }

    /**
     * Set 账号的最后更新时间
     * @param Utime 账号的最后更新时间
     */
    public void setUtime(String Utime) {
        this.Utime = Utime;
    }

    /**
     * Get 账号的扩展信息，包含邮箱、手机号、身份证、职位等信息 
     * @return ExtraInfo 账号的扩展信息，包含邮箱、手机号、身份证、职位等信息
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 账号的扩展信息，包含邮箱、手机号、身份证、职位等信息
     * @param ExtraInfo 账号的扩展信息，包含邮箱、手机号、身份证、职位等信息
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 用户风险等级，枚举：none, low, middle, high 
     * @return RiskLevel 用户风险等级，枚举：none, low, middle, high
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 用户风险等级，枚举：none, low, middle, high
     * @param RiskLevel 用户风险等级，枚举：none, low, middle, high
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 所属组 
     * @return AccountGroups 所属组
     */
    public DescribeLocalAccountAccountGroupsData [] getAccountGroups() {
        return this.AccountGroups;
    }

    /**
     * Set 所属组
     * @param AccountGroups 所属组
     */
    public void setAccountGroups(DescribeLocalAccountAccountGroupsData [] AccountGroups) {
        this.AccountGroups = AccountGroups;
    }

    /**
     * Get 绑定手机端设备数 
     * @return MobileBindNum 绑定手机端设备数
     */
    public Long getMobileBindNum() {
        return this.MobileBindNum;
    }

    /**
     * Set 绑定手机端设备数
     * @param MobileBindNum 绑定手机端设备数
     */
    public void setMobileBindNum(Long MobileBindNum) {
        this.MobileBindNum = MobileBindNum;
    }

    /**
     * Get 绑定Pc端设备数 
     * @return PcBindNum 绑定Pc端设备数
     */
    public Long getPcBindNum() {
        return this.PcBindNum;
    }

    /**
     * Set 绑定Pc端设备数
     * @param PcBindNum 绑定Pc端设备数
     */
    public void setPcBindNum(Long PcBindNum) {
        this.PcBindNum = PcBindNum;
    }

    /**
     * Get 账号在线状态 1：在线 2：离线 
     * @return OnlineStatus 账号在线状态 1：在线 2：离线
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set 账号在线状态 1：在线 2：离线
     * @param OnlineStatus 账号在线状态 1：在线 2：离线
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get 账号活跃状态 1：活跃 2：非活跃 
     * @return ActiveStatus 账号活跃状态 1：活跃 2：非活跃
     */
    public Long getActiveStatus() {
        return this.ActiveStatus;
    }

    /**
     * Set 账号活跃状态 1：活跃 2：非活跃
     * @param ActiveStatus 账号活跃状态 1：活跃 2：非活跃
     */
    public void setActiveStatus(Long ActiveStatus) {
        this.ActiveStatus = ActiveStatus;
    }

    /**
     * Get 账号登录时间 
     * @return LoginTime 账号登录时间
     */
    public String getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set 账号登录时间
     * @param LoginTime 账号登录时间
     */
    public void setLoginTime(String LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get 账号登出时间 
     * @return LogoutTime 账号登出时间
     */
    public String getLogoutTime() {
        return this.LogoutTime;
    }

    /**
     * Set 账号登出时间
     * @param LogoutTime 账号登出时间
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

