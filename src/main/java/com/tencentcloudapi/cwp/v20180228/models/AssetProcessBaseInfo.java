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

public class AssetProcessBaseInfo extends AbstractModel{

    /**
    * 主机内网IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机外网IP
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 操作系统信息
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * 主机业务组ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 主机标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * 进程名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 进程说明
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 进程路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 进程ID
    */
    @SerializedName("Pid")
    @Expose
    private String Pid;

    /**
    * 运行用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 启动时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 启动参数
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * 进程TTY
    */
    @SerializedName("Tty")
    @Expose
    private String Tty;

    /**
    * 进程版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 进程用户组
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 进程MD5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 父进程ID
    */
    @SerializedName("Ppid")
    @Expose
    private String Ppid;

    /**
    * 父进程名称
    */
    @SerializedName("ParentProcessName")
    @Expose
    private String ParentProcessName;

    /**
    * 进程状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 数字签名:0无，1有， 999 空，仅windows
    */
    @SerializedName("HasSign")
    @Expose
    private Long HasSign;

    /**
    * 是否通过安装包安装：:0否，1是， 999 空，仅linux
    */
    @SerializedName("InstallByPackage")
    @Expose
    private Long InstallByPackage;

    /**
    * 软件包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 主机名称
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

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
     * Get 主机外网IP 
     * @return MachineWanIp 主机外网IP
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 主机外网IP
     * @param MachineWanIp 主机外网IP
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
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
     * Get 操作系统信息 
     * @return OsInfo 操作系统信息
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set 操作系统信息
     * @param OsInfo 操作系统信息
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get 主机业务组ID 
     * @return ProjectId 主机业务组ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 主机业务组ID
     * @param ProjectId 主机业务组ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 主机标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 主机标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 主机标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 主机标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 进程名称 
     * @return Name 进程名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 进程名称
     * @param Name 进程名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 进程说明 
     * @return Desc 进程说明
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 进程说明
     * @param Desc 进程说明
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 进程路径 
     * @return Path 进程路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 进程路径
     * @param Path 进程路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 进程ID 
     * @return Pid 进程ID
     */
    public String getPid() {
        return this.Pid;
    }

    /**
     * Set 进程ID
     * @param Pid 进程ID
     */
    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    /**
     * Get 运行用户 
     * @return User 运行用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 运行用户
     * @param User 运行用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 启动时间 
     * @return StartTime 启动时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 启动时间
     * @param StartTime 启动时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 启动参数 
     * @return Param 启动参数
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set 启动参数
     * @param Param 启动参数
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get 进程TTY 
     * @return Tty 进程TTY
     */
    public String getTty() {
        return this.Tty;
    }

    /**
     * Set 进程TTY
     * @param Tty 进程TTY
     */
    public void setTty(String Tty) {
        this.Tty = Tty;
    }

    /**
     * Get 进程版本 
     * @return Version 进程版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 进程版本
     * @param Version 进程版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 进程用户组 
     * @return GroupName 进程用户组
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 进程用户组
     * @param GroupName 进程用户组
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 进程MD5 
     * @return Md5 进程MD5
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 进程MD5
     * @param Md5 进程MD5
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 父进程ID 
     * @return Ppid 父进程ID
     */
    public String getPpid() {
        return this.Ppid;
    }

    /**
     * Set 父进程ID
     * @param Ppid 父进程ID
     */
    public void setPpid(String Ppid) {
        this.Ppid = Ppid;
    }

    /**
     * Get 父进程名称 
     * @return ParentProcessName 父进程名称
     */
    public String getParentProcessName() {
        return this.ParentProcessName;
    }

    /**
     * Set 父进程名称
     * @param ParentProcessName 父进程名称
     */
    public void setParentProcessName(String ParentProcessName) {
        this.ParentProcessName = ParentProcessName;
    }

    /**
     * Get 进程状态 
     * @return Status 进程状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 进程状态
     * @param Status 进程状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 数字签名:0无，1有， 999 空，仅windows 
     * @return HasSign 数字签名:0无，1有， 999 空，仅windows
     */
    public Long getHasSign() {
        return this.HasSign;
    }

    /**
     * Set 数字签名:0无，1有， 999 空，仅windows
     * @param HasSign 数字签名:0无，1有， 999 空，仅windows
     */
    public void setHasSign(Long HasSign) {
        this.HasSign = HasSign;
    }

    /**
     * Get 是否通过安装包安装：:0否，1是， 999 空，仅linux 
     * @return InstallByPackage 是否通过安装包安装：:0否，1是， 999 空，仅linux
     */
    public Long getInstallByPackage() {
        return this.InstallByPackage;
    }

    /**
     * Set 是否通过安装包安装：:0否，1是， 999 空，仅linux
     * @param InstallByPackage 是否通过安装包安装：:0否，1是， 999 空，仅linux
     */
    public void setInstallByPackage(Long InstallByPackage) {
        this.InstallByPackage = InstallByPackage;
    }

    /**
     * Get 软件包名 
     * @return PackageName 软件包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 软件包名
     * @param PackageName 软件包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
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

    public AssetProcessBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetProcessBaseInfo(AssetProcessBaseInfo source) {
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Tag != null) {
            this.Tag = new MachineTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new MachineTag(source.Tag[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Pid != null) {
            this.Pid = new String(source.Pid);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Param != null) {
            this.Param = new String(source.Param);
        }
        if (source.Tty != null) {
            this.Tty = new String(source.Tty);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Ppid != null) {
            this.Ppid = new String(source.Ppid);
        }
        if (source.ParentProcessName != null) {
            this.ParentProcessName = new String(source.ParentProcessName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.HasSign != null) {
            this.HasSign = new Long(source.HasSign);
        }
        if (source.InstallByPackage != null) {
            this.InstallByPackage = new Long(source.InstallByPackage);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
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
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Tty", this.Tty);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Ppid", this.Ppid);
        this.setParamSimple(map, prefix + "ParentProcessName", this.ParentProcessName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "HasSign", this.HasSign);
        this.setParamSimple(map, prefix + "InstallByPackage", this.InstallByPackage);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

