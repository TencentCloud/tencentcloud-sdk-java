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

public class ReverseShell extends AbstractModel{

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 云镜UUID
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
    * 目标IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 目标端口
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

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
    * 命令详情
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * 执行用户
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 执行用户组
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * 父进程名
    */
    @SerializedName("ParentProcName")
    @Expose
    private String ParentProcName;

    /**
    * 父进程用户
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
    * 处理状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 产生时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 主机名
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 进程树
    */
    @SerializedName("ProcTree")
    @Expose
    private String ProcTree;

    /**
     * Get ID 
     * @return Id ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 云镜UUID 
     * @return Uuid 云镜UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 云镜UUID
     * @param Uuid 云镜UUID
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
     * Get 目标IP 
     * @return DstIp 目标IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 目标IP
     * @param DstIp 目标IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 目标端口 
     * @return DstPort 目标端口
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 目标端口
     * @param DstPort 目标端口
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
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
     * Get 命令详情 
     * @return CmdLine 命令详情
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set 命令详情
     * @param CmdLine 命令详情
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get 执行用户 
     * @return UserName 执行用户
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 执行用户
     * @param UserName 执行用户
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 执行用户组 
     * @return UserGroup 执行用户组
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set 执行用户组
     * @param UserGroup 执行用户组
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
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
     * Get 父进程用户 
     * @return ParentProcUser 父进程用户
     */
    public String getParentProcUser() {
        return this.ParentProcUser;
    }

    /**
     * Set 父进程用户
     * @param ParentProcUser 父进程用户
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
     * Get 处理状态 
     * @return Status 处理状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态
     * @param Status 处理状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 产生时间 
     * @return CreateTime 产生时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 产生时间
     * @param CreateTime 产生时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 主机名 
     * @return MachineName 主机名
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set 主机名
     * @param MachineName 主机名
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "FullPath", this.FullPath);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "ParentProcName", this.ParentProcName);
        this.setParamSimple(map, prefix + "ParentProcUser", this.ParentProcUser);
        this.setParamSimple(map, prefix + "ParentProcGroup", this.ParentProcGroup);
        this.setParamSimple(map, prefix + "ParentProcPath", this.ParentProcPath);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "ProcTree", this.ProcTree);

    }
}

