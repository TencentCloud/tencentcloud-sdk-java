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

public class PrivilegeEventInfo extends AbstractModel{

    /**
    * 数据ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 云镜ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机内网IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 进程名
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 进程路径
    */
    @SerializedName("FullPath")
    @Expose
    private String FullPath;

    /**
    * 执行命令
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户组
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * 进程文件权限
    */
    @SerializedName("ProcFilePrivilege")
    @Expose
    private String ProcFilePrivilege;

    /**
    * 父进程名
    */
    @SerializedName("ParentProcName")
    @Expose
    private String ParentProcName;

    /**
    * 父进程用户名
    */
    @SerializedName("ParentProcUser")
    @Expose
    private String ParentProcUser;

    /**
    * 父进程用户组
    */
    @SerializedName("ParentProcGroup")
    @Expose
    private String ParentProcGroup;

    /**
    * 父进程路径
    */
    @SerializedName("ParentProcPath")
    @Expose
    private String ParentProcPath;

    /**
    * 进程树 json  pid:进程id，exe:文件路径 ，account:进程所属用组和用户 ,cmdline:执行命令，ssh_service: SSH服务ip, ssh_soure:登录源
    */
    @SerializedName("PsTree")
    @Expose
    private String PsTree;

    /**
    * 处理状态：0-待处理 2-白名单 3-已处理 4-已忽略
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 发生时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 机器名
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 建议方案
    */
    @SerializedName("SuggestScheme")
    @Expose
    private String SuggestScheme;

    /**
    * 危害描述信息
    */
    @SerializedName("HarmDescribe")
    @Expose
    private String HarmDescribe;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 参考链接
    */
    @SerializedName("References")
    @Expose
    private String [] References;

    /**
    * 主机外网ip
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * 权限列表|隔开
    */
    @SerializedName("NewCaps")
    @Expose
    private String NewCaps;

    /**
    * 主机在线状态 OFFLINE  ONLINE
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * 处理时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 数据ID 
     * @return Id 数据ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 数据ID
     * @param Id 数据ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 云镜ID 
     * @return Uuid 云镜ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 云镜ID
     * @param Uuid 云镜ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 主机ID 
     * @return Quuid 主机ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机ID
     * @param Quuid 主机ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机内网IP 
     * @return HostIp 主机内网IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机内网IP
     * @param HostIp 主机内网IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 进程名 
     * @return ProcessName 进程名
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名
     * @param ProcessName 进程名
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 进程路径 
     * @return FullPath 进程路径
     */
    public String getFullPath() {
        return this.FullPath;
    }

    /**
     * Set 进程路径
     * @param FullPath 进程路径
     */
    public void setFullPath(String FullPath) {
        this.FullPath = FullPath;
    }

    /**
     * Get 执行命令 
     * @return CmdLine 执行命令
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set 执行命令
     * @param CmdLine 执行命令
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
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
     * Get 用户组 
     * @return UserGroup 用户组
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set 用户组
     * @param UserGroup 用户组
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get 进程文件权限 
     * @return ProcFilePrivilege 进程文件权限
     */
    public String getProcFilePrivilege() {
        return this.ProcFilePrivilege;
    }

    /**
     * Set 进程文件权限
     * @param ProcFilePrivilege 进程文件权限
     */
    public void setProcFilePrivilege(String ProcFilePrivilege) {
        this.ProcFilePrivilege = ProcFilePrivilege;
    }

    /**
     * Get 父进程名 
     * @return ParentProcName 父进程名
     */
    public String getParentProcName() {
        return this.ParentProcName;
    }

    /**
     * Set 父进程名
     * @param ParentProcName 父进程名
     */
    public void setParentProcName(String ParentProcName) {
        this.ParentProcName = ParentProcName;
    }

    /**
     * Get 父进程用户名 
     * @return ParentProcUser 父进程用户名
     */
    public String getParentProcUser() {
        return this.ParentProcUser;
    }

    /**
     * Set 父进程用户名
     * @param ParentProcUser 父进程用户名
     */
    public void setParentProcUser(String ParentProcUser) {
        this.ParentProcUser = ParentProcUser;
    }

    /**
     * Get 父进程用户组 
     * @return ParentProcGroup 父进程用户组
     */
    public String getParentProcGroup() {
        return this.ParentProcGroup;
    }

    /**
     * Set 父进程用户组
     * @param ParentProcGroup 父进程用户组
     */
    public void setParentProcGroup(String ParentProcGroup) {
        this.ParentProcGroup = ParentProcGroup;
    }

    /**
     * Get 父进程路径 
     * @return ParentProcPath 父进程路径
     */
    public String getParentProcPath() {
        return this.ParentProcPath;
    }

    /**
     * Set 父进程路径
     * @param ParentProcPath 父进程路径
     */
    public void setParentProcPath(String ParentProcPath) {
        this.ParentProcPath = ParentProcPath;
    }

    /**
     * Get 进程树 json  pid:进程id，exe:文件路径 ，account:进程所属用组和用户 ,cmdline:执行命令，ssh_service: SSH服务ip, ssh_soure:登录源 
     * @return PsTree 进程树 json  pid:进程id，exe:文件路径 ，account:进程所属用组和用户 ,cmdline:执行命令，ssh_service: SSH服务ip, ssh_soure:登录源
     */
    public String getPsTree() {
        return this.PsTree;
    }

    /**
     * Set 进程树 json  pid:进程id，exe:文件路径 ，account:进程所属用组和用户 ,cmdline:执行命令，ssh_service: SSH服务ip, ssh_soure:登录源
     * @param PsTree 进程树 json  pid:进程id，exe:文件路径 ，account:进程所属用组和用户 ,cmdline:执行命令，ssh_service: SSH服务ip, ssh_soure:登录源
     */
    public void setPsTree(String PsTree) {
        this.PsTree = PsTree;
    }

    /**
     * Get 处理状态：0-待处理 2-白名单 3-已处理 4-已忽略 
     * @return Status 处理状态：0-待处理 2-白名单 3-已处理 4-已忽略
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态：0-待处理 2-白名单 3-已处理 4-已忽略
     * @param Status 处理状态：0-待处理 2-白名单 3-已处理 4-已忽略
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 发生时间 
     * @return CreateTime 发生时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 发生时间
     * @param CreateTime 发生时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 机器名 
     * @return MachineName 机器名
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 机器名
     * @param MachineName 机器名
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get 建议方案 
     * @return SuggestScheme 建议方案
     */
    public String getSuggestScheme() {
        return this.SuggestScheme;
    }

    /**
     * Set 建议方案
     * @param SuggestScheme 建议方案
     */
    public void setSuggestScheme(String SuggestScheme) {
        this.SuggestScheme = SuggestScheme;
    }

    /**
     * Get 危害描述信息 
     * @return HarmDescribe 危害描述信息
     */
    public String getHarmDescribe() {
        return this.HarmDescribe;
    }

    /**
     * Set 危害描述信息
     * @param HarmDescribe 危害描述信息
     */
    public void setHarmDescribe(String HarmDescribe) {
        this.HarmDescribe = HarmDescribe;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 参考链接 
     * @return References 参考链接
     */
    public String [] getReferences() {
        return this.References;
    }

    /**
     * Set 参考链接
     * @param References 参考链接
     */
    public void setReferences(String [] References) {
        this.References = References;
    }

    /**
     * Get 主机外网ip 
     * @return MachineWanIp 主机外网ip
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set 主机外网ip
     * @param MachineWanIp 主机外网ip
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get 权限列表|隔开 
     * @return NewCaps 权限列表|隔开
     */
    public String getNewCaps() {
        return this.NewCaps;
    }

    /**
     * Set 权限列表|隔开
     * @param NewCaps 权限列表|隔开
     */
    public void setNewCaps(String NewCaps) {
        this.NewCaps = NewCaps;
    }

    /**
     * Get 主机在线状态 OFFLINE  ONLINE 
     * @return MachineStatus 主机在线状态 OFFLINE  ONLINE
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set 主机在线状态 OFFLINE  ONLINE
     * @param MachineStatus 主机在线状态 OFFLINE  ONLINE
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get 处理时间 
     * @return ModifyTime 处理时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 处理时间
     * @param ModifyTime 处理时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public PrivilegeEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivilegeEventInfo(PrivilegeEventInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.FullPath != null) {
            this.FullPath = new String(source.FullPath);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
        }
        if (source.ProcFilePrivilege != null) {
            this.ProcFilePrivilege = new String(source.ProcFilePrivilege);
        }
        if (source.ParentProcName != null) {
            this.ParentProcName = new String(source.ParentProcName);
        }
        if (source.ParentProcUser != null) {
            this.ParentProcUser = new String(source.ParentProcUser);
        }
        if (source.ParentProcGroup != null) {
            this.ParentProcGroup = new String(source.ParentProcGroup);
        }
        if (source.ParentProcPath != null) {
            this.ParentProcPath = new String(source.ParentProcPath);
        }
        if (source.PsTree != null) {
            this.PsTree = new String(source.PsTree);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.SuggestScheme != null) {
            this.SuggestScheme = new String(source.SuggestScheme);
        }
        if (source.HarmDescribe != null) {
            this.HarmDescribe = new String(source.HarmDescribe);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.References != null) {
            this.References = new String[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new String(source.References[i]);
            }
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.NewCaps != null) {
            this.NewCaps = new String(source.NewCaps);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "FullPath", this.FullPath);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "ProcFilePrivilege", this.ProcFilePrivilege);
        this.setParamSimple(map, prefix + "ParentProcName", this.ParentProcName);
        this.setParamSimple(map, prefix + "ParentProcUser", this.ParentProcUser);
        this.setParamSimple(map, prefix + "ParentProcGroup", this.ParentProcGroup);
        this.setParamSimple(map, prefix + "ParentProcPath", this.ParentProcPath);
        this.setParamSimple(map, prefix + "PsTree", this.PsTree);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "SuggestScheme", this.SuggestScheme);
        this.setParamSimple(map, prefix + "HarmDescribe", this.HarmDescribe);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "NewCaps", this.NewCaps);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

