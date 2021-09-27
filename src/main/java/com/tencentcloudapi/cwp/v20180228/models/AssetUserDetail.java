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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetUserDetail extends AbstractModel{

    /**
    * 主机内网IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 主机Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 账号UID
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 账号GID
    */
    @SerializedName("Gid")
    @Expose
    private String Gid;

    /**
    * 账号状态：0-禁用；1-启用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否有root权限：0-否；1是，999为空: 仅linux
    */
    @SerializedName("IsRoot")
    @Expose
    private Long IsRoot;

    /**
    * 上次登录时间
    */
    @SerializedName("LastLoginTime")
    @Expose
    private String LastLoginTime;

    /**
    * 账号名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 账号类型：0访客用户，1标准用户，2管理员用户 ,999为空,仅windows
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * 是否域账号：0否， 1是, 999为空  仅windows
    */
    @SerializedName("IsDomain")
    @Expose
    private Long IsDomain;

    /**
    * 是否允许ssh登录，1是，0否, 999为空, 仅linux
    */
    @SerializedName("IsSshLogin")
    @Expose
    private Long IsSshLogin;

    /**
    * Home目录
    */
    @SerializedName("HomePath")
    @Expose
    private String HomePath;

    /**
    * Shell路径  仅linux
    */
    @SerializedName("Shell")
    @Expose
    private String Shell;

    /**
    * 是否shell登录性，0不是；1是 仅linux
    */
    @SerializedName("ShellLoginStatus")
    @Expose
    private Long ShellLoginStatus;

    /**
    * 密码修改时间
    */
    @SerializedName("PasswordChangeTime")
    @Expose
    private String PasswordChangeTime;

    /**
    * 密码过期时间  仅linux
    */
    @SerializedName("PasswordDueTime")
    @Expose
    private String PasswordDueTime;

    /**
    * 密码锁定时间：单位天, -1为永不锁定 999为空，仅linux
    */
    @SerializedName("PasswordLockDays")
    @Expose
    private Long PasswordLockDays;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 用户组名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 账号到期时间
    */
    @SerializedName("DisableTime")
    @Expose
    private String DisableTime;

    /**
    * 最近登录终端
    */
    @SerializedName("LastLoginTerminal")
    @Expose
    private String LastLoginTerminal;

    /**
    * 最近登录位置
    */
    @SerializedName("LastLoginLoc")
    @Expose
    private String LastLoginLoc;

    /**
    * 最近登录IP
    */
    @SerializedName("LastLoginIp")
    @Expose
    private String LastLoginIp;

    /**
    * 密码过期提醒：单位天
    */
    @SerializedName("PasswordWarnDays")
    @Expose
    private Long PasswordWarnDays;

    /**
    * 密码修改设置：0-不可修改，1-可修改
    */
    @SerializedName("PasswordChangeType")
    @Expose
    private Long PasswordChangeType;

    /**
    * 用户公钥列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keys")
    @Expose
    private AssetUserKeyInfo [] Keys;

    /**
    * 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 主机内网IP 
     * @return MachineIp 主机内网IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set 主机内网IP
     * @param MachineIp 主机内网IP
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get 主机名称 
     * @return MachineName 主机名称
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名称
     * @param MachineName 主机名称
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 主机Uuid 
     * @return Uuid 主机Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机Uuid
     * @param Uuid 主机Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机Quuid 
     * @return Quuid 主机Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
     * @param Quuid 主机Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 账号UID 
     * @return Uid 账号UID
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 账号UID
     * @param Uid 账号UID
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 账号GID 
     * @return Gid 账号GID
     */
    public String getGid() {
        return this.Gid;
    }

    /**
     * Set 账号GID
     * @param Gid 账号GID
     */
    public void setGid(String Gid) {
        this.Gid = Gid;
    }

    /**
     * Get 账号状态：0-禁用；1-启用 
     * @return Status 账号状态：0-禁用；1-启用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 账号状态：0-禁用；1-启用
     * @param Status 账号状态：0-禁用；1-启用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否有root权限：0-否；1是，999为空: 仅linux 
     * @return IsRoot 是否有root权限：0-否；1是，999为空: 仅linux
     */
    public Long getIsRoot() {
        return this.IsRoot;
    }

    /**
     * Set 是否有root权限：0-否；1是，999为空: 仅linux
     * @param IsRoot 是否有root权限：0-否；1是，999为空: 仅linux
     */
    public void setIsRoot(Long IsRoot) {
        this.IsRoot = IsRoot;
    }

    /**
     * Get 上次登录时间 
     * @return LastLoginTime 上次登录时间
     */
    public String getLastLoginTime() {
        return this.LastLoginTime;
    }

    /**
     * Set 上次登录时间
     * @param LastLoginTime 上次登录时间
     */
    public void setLastLoginTime(String LastLoginTime) {
        this.LastLoginTime = LastLoginTime;
    }

    /**
     * Get 账号名称 
     * @return Name 账号名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 账号名称
     * @param Name 账号名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 账号类型：0访客用户，1标准用户，2管理员用户 ,999为空,仅windows 
     * @return UserType 账号类型：0访客用户，1标准用户，2管理员用户 ,999为空,仅windows
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set 账号类型：0访客用户，1标准用户，2管理员用户 ,999为空,仅windows
     * @param UserType 账号类型：0访客用户，1标准用户，2管理员用户 ,999为空,仅windows
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 是否域账号：0否， 1是, 999为空  仅windows 
     * @return IsDomain 是否域账号：0否， 1是, 999为空  仅windows
     */
    public Long getIsDomain() {
        return this.IsDomain;
    }

    /**
     * Set 是否域账号：0否， 1是, 999为空  仅windows
     * @param IsDomain 是否域账号：0否， 1是, 999为空  仅windows
     */
    public void setIsDomain(Long IsDomain) {
        this.IsDomain = IsDomain;
    }

    /**
     * Get 是否允许ssh登录，1是，0否, 999为空, 仅linux 
     * @return IsSshLogin 是否允许ssh登录，1是，0否, 999为空, 仅linux
     */
    public Long getIsSshLogin() {
        return this.IsSshLogin;
    }

    /**
     * Set 是否允许ssh登录，1是，0否, 999为空, 仅linux
     * @param IsSshLogin 是否允许ssh登录，1是，0否, 999为空, 仅linux
     */
    public void setIsSshLogin(Long IsSshLogin) {
        this.IsSshLogin = IsSshLogin;
    }

    /**
     * Get Home目录 
     * @return HomePath Home目录
     */
    public String getHomePath() {
        return this.HomePath;
    }

    /**
     * Set Home目录
     * @param HomePath Home目录
     */
    public void setHomePath(String HomePath) {
        this.HomePath = HomePath;
    }

    /**
     * Get Shell路径  仅linux 
     * @return Shell Shell路径  仅linux
     */
    public String getShell() {
        return this.Shell;
    }

    /**
     * Set Shell路径  仅linux
     * @param Shell Shell路径  仅linux
     */
    public void setShell(String Shell) {
        this.Shell = Shell;
    }

    /**
     * Get 是否shell登录性，0不是；1是 仅linux 
     * @return ShellLoginStatus 是否shell登录性，0不是；1是 仅linux
     */
    public Long getShellLoginStatus() {
        return this.ShellLoginStatus;
    }

    /**
     * Set 是否shell登录性，0不是；1是 仅linux
     * @param ShellLoginStatus 是否shell登录性，0不是；1是 仅linux
     */
    public void setShellLoginStatus(Long ShellLoginStatus) {
        this.ShellLoginStatus = ShellLoginStatus;
    }

    /**
     * Get 密码修改时间 
     * @return PasswordChangeTime 密码修改时间
     */
    public String getPasswordChangeTime() {
        return this.PasswordChangeTime;
    }

    /**
     * Set 密码修改时间
     * @param PasswordChangeTime 密码修改时间
     */
    public void setPasswordChangeTime(String PasswordChangeTime) {
        this.PasswordChangeTime = PasswordChangeTime;
    }

    /**
     * Get 密码过期时间  仅linux 
     * @return PasswordDueTime 密码过期时间  仅linux
     */
    public String getPasswordDueTime() {
        return this.PasswordDueTime;
    }

    /**
     * Set 密码过期时间  仅linux
     * @param PasswordDueTime 密码过期时间  仅linux
     */
    public void setPasswordDueTime(String PasswordDueTime) {
        this.PasswordDueTime = PasswordDueTime;
    }

    /**
     * Get 密码锁定时间：单位天, -1为永不锁定 999为空，仅linux 
     * @return PasswordLockDays 密码锁定时间：单位天, -1为永不锁定 999为空，仅linux
     */
    public Long getPasswordLockDays() {
        return this.PasswordLockDays;
    }

    /**
     * Set 密码锁定时间：单位天, -1为永不锁定 999为空，仅linux
     * @param PasswordLockDays 密码锁定时间：单位天, -1为永不锁定 999为空，仅linux
     */
    public void setPasswordLockDays(Long PasswordLockDays) {
        this.PasswordLockDays = PasswordLockDays;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 用户组名 
     * @return GroupName 用户组名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 用户组名
     * @param GroupName 用户组名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 账号到期时间 
     * @return DisableTime 账号到期时间
     */
    public String getDisableTime() {
        return this.DisableTime;
    }

    /**
     * Set 账号到期时间
     * @param DisableTime 账号到期时间
     */
    public void setDisableTime(String DisableTime) {
        this.DisableTime = DisableTime;
    }

    /**
     * Get 最近登录终端 
     * @return LastLoginTerminal 最近登录终端
     */
    public String getLastLoginTerminal() {
        return this.LastLoginTerminal;
    }

    /**
     * Set 最近登录终端
     * @param LastLoginTerminal 最近登录终端
     */
    public void setLastLoginTerminal(String LastLoginTerminal) {
        this.LastLoginTerminal = LastLoginTerminal;
    }

    /**
     * Get 最近登录位置 
     * @return LastLoginLoc 最近登录位置
     */
    public String getLastLoginLoc() {
        return this.LastLoginLoc;
    }

    /**
     * Set 最近登录位置
     * @param LastLoginLoc 最近登录位置
     */
    public void setLastLoginLoc(String LastLoginLoc) {
        this.LastLoginLoc = LastLoginLoc;
    }

    /**
     * Get 最近登录IP 
     * @return LastLoginIp 最近登录IP
     */
    public String getLastLoginIp() {
        return this.LastLoginIp;
    }

    /**
     * Set 最近登录IP
     * @param LastLoginIp 最近登录IP
     */
    public void setLastLoginIp(String LastLoginIp) {
        this.LastLoginIp = LastLoginIp;
    }

    /**
     * Get 密码过期提醒：单位天 
     * @return PasswordWarnDays 密码过期提醒：单位天
     */
    public Long getPasswordWarnDays() {
        return this.PasswordWarnDays;
    }

    /**
     * Set 密码过期提醒：单位天
     * @param PasswordWarnDays 密码过期提醒：单位天
     */
    public void setPasswordWarnDays(Long PasswordWarnDays) {
        this.PasswordWarnDays = PasswordWarnDays;
    }

    /**
     * Get 密码修改设置：0-不可修改，1-可修改 
     * @return PasswordChangeType 密码修改设置：0-不可修改，1-可修改
     */
    public Long getPasswordChangeType() {
        return this.PasswordChangeType;
    }

    /**
     * Set 密码修改设置：0-不可修改，1-可修改
     * @param PasswordChangeType 密码修改设置：0-不可修改，1-可修改
     */
    public void setPasswordChangeType(Long PasswordChangeType) {
        this.PasswordChangeType = PasswordChangeType;
    }

    /**
     * Get 用户公钥列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keys 用户公钥列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetUserKeyInfo [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 用户公钥列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keys 用户公钥列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeys(AssetUserKeyInfo [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 数据更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AssetUserDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetUserDetail(AssetUserDetail source) {
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.Gid != null) {
            this.Gid = new String(source.Gid);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsRoot != null) {
            this.IsRoot = new Long(source.IsRoot);
        }
        if (source.LastLoginTime != null) {
            this.LastLoginTime = new String(source.LastLoginTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
        if (source.IsDomain != null) {
            this.IsDomain = new Long(source.IsDomain);
        }
        if (source.IsSshLogin != null) {
            this.IsSshLogin = new Long(source.IsSshLogin);
        }
        if (source.HomePath != null) {
            this.HomePath = new String(source.HomePath);
        }
        if (source.Shell != null) {
            this.Shell = new String(source.Shell);
        }
        if (source.ShellLoginStatus != null) {
            this.ShellLoginStatus = new Long(source.ShellLoginStatus);
        }
        if (source.PasswordChangeTime != null) {
            this.PasswordChangeTime = new String(source.PasswordChangeTime);
        }
        if (source.PasswordDueTime != null) {
            this.PasswordDueTime = new String(source.PasswordDueTime);
        }
        if (source.PasswordLockDays != null) {
            this.PasswordLockDays = new Long(source.PasswordLockDays);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.DisableTime != null) {
            this.DisableTime = new String(source.DisableTime);
        }
        if (source.LastLoginTerminal != null) {
            this.LastLoginTerminal = new String(source.LastLoginTerminal);
        }
        if (source.LastLoginLoc != null) {
            this.LastLoginLoc = new String(source.LastLoginLoc);
        }
        if (source.LastLoginIp != null) {
            this.LastLoginIp = new String(source.LastLoginIp);
        }
        if (source.PasswordWarnDays != null) {
            this.PasswordWarnDays = new Long(source.PasswordWarnDays);
        }
        if (source.PasswordChangeType != null) {
            this.PasswordChangeType = new Long(source.PasswordChangeType);
        }
        if (source.Keys != null) {
            this.Keys = new AssetUserKeyInfo[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new AssetUserKeyInfo(source.Keys[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Gid", this.Gid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsRoot", this.IsRoot);
        this.setParamSimple(map, prefix + "LastLoginTime", this.LastLoginTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "IsDomain", this.IsDomain);
        this.setParamSimple(map, prefix + "IsSshLogin", this.IsSshLogin);
        this.setParamSimple(map, prefix + "HomePath", this.HomePath);
        this.setParamSimple(map, prefix + "Shell", this.Shell);
        this.setParamSimple(map, prefix + "ShellLoginStatus", this.ShellLoginStatus);
        this.setParamSimple(map, prefix + "PasswordChangeTime", this.PasswordChangeTime);
        this.setParamSimple(map, prefix + "PasswordDueTime", this.PasswordDueTime);
        this.setParamSimple(map, prefix + "PasswordLockDays", this.PasswordLockDays);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "DisableTime", this.DisableTime);
        this.setParamSimple(map, prefix + "LastLoginTerminal", this.LastLoginTerminal);
        this.setParamSimple(map, prefix + "LastLoginLoc", this.LastLoginLoc);
        this.setParamSimple(map, prefix + "LastLoginIp", this.LastLoginIp);
        this.setParamSimple(map, prefix + "PasswordWarnDays", this.PasswordWarnDays);
        this.setParamSimple(map, prefix + "PasswordChangeType", this.PasswordChangeType);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

