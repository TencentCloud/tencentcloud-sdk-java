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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Process  extends AbstractModel{

    /**
    * 唯一ID。
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 云镜客户端唯一UUID。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 主机内网IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机名。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 进程Pid。
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

    /**
    * 进程Ppid。
    */
    @SerializedName("Ppid")
    @Expose
    private Integer Ppid;

    /**
    * 进程名。
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 进程用户名。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 所属平台。
<li>WIN32：windows32位</li>
<li>WIN64：windows64位</li>
<li>LINUX32：Linux32位</li>
<li>LINUX64：Linux64位</li>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 进程路径。
    */
    @SerializedName("FullPath")
    @Expose
    private String FullPath;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * 获取唯一ID。
     * @return Id 唯一ID。
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置唯一ID。
     * @param Id 唯一ID。
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取云镜客户端唯一UUID。
     * @return Uuid 云镜客户端唯一UUID。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置云镜客户端唯一UUID。
     * @param Uuid 云镜客户端唯一UUID。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取主机内网IP。
     * @return MachineIp 主机内网IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * 设置主机内网IP。
     * @param MachineIp 主机内网IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * 获取主机名。
     * @return MachineName 主机名。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * 设置主机名。
     * @param MachineName 主机名。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * 获取进程Pid。
     * @return Pid 进程Pid。
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * 设置进程Pid。
     * @param Pid 进程Pid。
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 获取进程Ppid。
     * @return Ppid 进程Ppid。
     */
    public Integer getPpid() {
        return this.Ppid;
    }

    /**
     * 设置进程Ppid。
     * @param Ppid 进程Ppid。
     */
    public void setPpid(Integer Ppid) {
        this.Ppid = Ppid;
    }

    /**
     * 获取进程名。
     * @return ProcessName 进程名。
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * 设置进程名。
     * @param ProcessName 进程名。
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * 获取进程用户名。
     * @return Username 进程用户名。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * 设置进程用户名。
     * @param Username 进程用户名。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * 获取所属平台。
<li>WIN32：windows32位</li>
<li>WIN64：windows64位</li>
<li>LINUX32：Linux32位</li>
<li>LINUX64：Linux64位</li>
     * @return Platform 所属平台。
<li>WIN32：windows32位</li>
<li>WIN64：windows64位</li>
<li>LINUX32：Linux32位</li>
<li>LINUX64：Linux64位</li>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * 设置所属平台。
<li>WIN32：windows32位</li>
<li>WIN64：windows64位</li>
<li>LINUX32：Linux32位</li>
<li>LINUX64：Linux64位</li>
     * @param Platform 所属平台。
<li>WIN32：windows32位</li>
<li>WIN64：windows64位</li>
<li>LINUX32：Linux32位</li>
<li>LINUX64：Linux64位</li>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * 获取进程路径。
     * @return FullPath 进程路径。
     */
    public String getFullPath() {
        return this.FullPath;
    }

    /**
     * 设置进程路径。
     * @param FullPath 进程路径。
     */
    public void setFullPath(String FullPath) {
        this.FullPath = FullPath;
    }

    /**
     * 获取创建时间。
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Ppid", this.Ppid);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "FullPath", this.FullPath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

