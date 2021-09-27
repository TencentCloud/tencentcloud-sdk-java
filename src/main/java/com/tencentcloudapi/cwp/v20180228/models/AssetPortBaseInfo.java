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

public class AssetPortBaseInfo extends AbstractModel{

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
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 进程版本
    */
    @SerializedName("ProcessVersion")
    @Expose
    private String ProcessVersion;

    /**
    * 进程路径
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

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
    @SerializedName("Teletype")
    @Expose
    private String Teletype;

    /**
    * 端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 所属用户组
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
    * 端口协议
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * 绑定IP
    */
    @SerializedName("BindIp")
    @Expose
    private String BindIp;

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
     * @return ProcessName 进程名称
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名称
     * @param ProcessName 进程名称
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 进程版本 
     * @return ProcessVersion 进程版本
     */
    public String getProcessVersion() {
        return this.ProcessVersion;
    }

    /**
     * Set 进程版本
     * @param ProcessVersion 进程版本
     */
    public void setProcessVersion(String ProcessVersion) {
        this.ProcessVersion = ProcessVersion;
    }

    /**
     * Get 进程路径 
     * @return ProcessPath 进程路径
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 进程路径
     * @param ProcessPath 进程路径
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
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
     * @return Teletype 进程TTY
     */
    public String getTeletype() {
        return this.Teletype;
    }

    /**
     * Set 进程TTY
     * @param Teletype 进程TTY
     */
    public void setTeletype(String Teletype) {
        this.Teletype = Teletype;
    }

    /**
     * Get 端口 
     * @return Port 端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口
     * @param Port 端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 所属用户组 
     * @return GroupName 所属用户组
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 所属用户组
     * @param GroupName 所属用户组
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
     * Get 端口协议 
     * @return Proto 端口协议
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set 端口协议
     * @param Proto 端口协议
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    /**
     * Get 绑定IP 
     * @return BindIp 绑定IP
     */
    public String getBindIp() {
        return this.BindIp;
    }

    /**
     * Set 绑定IP
     * @param BindIp 绑定IP
     */
    public void setBindIp(String BindIp) {
        this.BindIp = BindIp;
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

    public AssetPortBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetPortBaseInfo(AssetPortBaseInfo source) {
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
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ProcessVersion != null) {
            this.ProcessVersion = new String(source.ProcessVersion);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
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
        if (source.Teletype != null) {
            this.Teletype = new String(source.Teletype);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
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
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.BindIp != null) {
            this.BindIp = new String(source.BindIp);
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
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "ProcessVersion", this.ProcessVersion);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Teletype", this.Teletype);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Ppid", this.Ppid);
        this.setParamSimple(map, prefix + "ParentProcessName", this.ParentProcessName);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamSimple(map, prefix + "BindIp", this.BindIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

