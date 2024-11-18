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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivilegeEscalationProcess extends AbstractModel {

    /**
    * 数据ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 主机安全ID
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
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

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
    * 进程树
    */
    @SerializedName("ProcTree")
    @Expose
    private String ProcTree;

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
    * 附加信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * 进程id
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

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
     * Get 主机安全ID 
     * @return Uuid 主机安全ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 主机安全ID
     * @param Uuid 主机安全ID
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
     * @return Hostip 主机内网IP
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * Set 主机内网IP
     * @param Hostip 主机内网IP
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
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
     * Get 进程树 
     * @return ProcTree 进程树
     */
    public String getProcTree() {
        return this.ProcTree;
    }

    /**
     * Set 进程树
     * @param ProcTree 进程树
     */
    public void setProcTree(String ProcTree) {
        this.ProcTree = ProcTree;
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
     * Get 附加信息 
     * @return MachineExtraInfo 附加信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 附加信息
     * @param MachineExtraInfo 附加信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get 进程id 
     * @return Pid 进程id
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 进程id
     * @param Pid 进程id
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    public PrivilegeEscalationProcess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivilegeEscalationProcess(PrivilegeEscalationProcess source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Hostip != null) {
            this.Hostip = new String(source.Hostip);
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
        if (source.ProcTree != null) {
            this.ProcTree = new String(source.ProcTree);
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
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);
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
        this.setParamSimple(map, prefix + "ProcTree", this.ProcTree);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Pid", this.Pid);

    }
}

