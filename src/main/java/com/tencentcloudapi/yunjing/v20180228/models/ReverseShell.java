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

public class ReverseShell  extends AbstractModel{

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

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
    private Integer DstPort;

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
    private Integer Status;

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
     * 获取ID
     * @return Id ID
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置ID
     * @param Id ID
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取云镜UUID
     * @return Uuid 云镜UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置云镜UUID
     * @param Uuid 云镜UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取主机ID
     * @return Quuid 主机ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * 设置主机ID
     * @param Quuid 主机ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * 获取主机内网IP
     * @return Hostip 主机内网IP
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * 设置主机内网IP
     * @param Hostip 主机内网IP
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    /**
     * 获取目标IP
     * @return DstIp 目标IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * 设置目标IP
     * @param DstIp 目标IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * 获取目标端口
     * @return DstPort 目标端口
     */
    public Integer getDstPort() {
        return this.DstPort;
    }

    /**
     * 设置目标端口
     * @param DstPort 目标端口
     */
    public void setDstPort(Integer DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * 获取进程名
     * @return ProcessName 进程名
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * 设置进程名
     * @param ProcessName 进程名
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * 获取进程路径
     * @return FullPath 进程路径
     */
    public String getFullPath() {
        return this.FullPath;
    }

    /**
     * 设置进程路径
     * @param FullPath 进程路径
     */
    public void setFullPath(String FullPath) {
        this.FullPath = FullPath;
    }

    /**
     * 获取命令详情
     * @return CmdLine 命令详情
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * 设置命令详情
     * @param CmdLine 命令详情
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * 获取执行用户
     * @return UserName 执行用户
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置执行用户
     * @param UserName 执行用户
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取执行用户组
     * @return UserGroup 执行用户组
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * 设置执行用户组
     * @param UserGroup 执行用户组
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * 获取父进程名
     * @return ParentProcName 父进程名
     */
    public String getParentProcName() {
        return this.ParentProcName;
    }

    /**
     * 设置父进程名
     * @param ParentProcName 父进程名
     */
    public void setParentProcName(String ParentProcName) {
        this.ParentProcName = ParentProcName;
    }

    /**
     * 获取父进程用户
     * @return ParentProcUser 父进程用户
     */
    public String getParentProcUser() {
        return this.ParentProcUser;
    }

    /**
     * 设置父进程用户
     * @param ParentProcUser 父进程用户
     */
    public void setParentProcUser(String ParentProcUser) {
        this.ParentProcUser = ParentProcUser;
    }

    /**
     * 获取父进程用户组
     * @return ParentProcGroup 父进程用户组
     */
    public String getParentProcGroup() {
        return this.ParentProcGroup;
    }

    /**
     * 设置父进程用户组
     * @param ParentProcGroup 父进程用户组
     */
    public void setParentProcGroup(String ParentProcGroup) {
        this.ParentProcGroup = ParentProcGroup;
    }

    /**
     * 获取父进程路径
     * @return ParentProcPath 父进程路径
     */
    public String getParentProcPath() {
        return this.ParentProcPath;
    }

    /**
     * 设置父进程路径
     * @param ParentProcPath 父进程路径
     */
    public void setParentProcPath(String ParentProcPath) {
        this.ParentProcPath = ParentProcPath;
    }

    /**
     * 获取处理状态
     * @return Status 处理状态
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置处理状态
     * @param Status 处理状态
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取产生时间
     * @return CreateTime 产生时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置产生时间
     * @param CreateTime 产生时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取主机名
     * @return MachineName 主机名
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * 设置主机名
     * @param MachineName 主机名
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * 获取进程树
     * @return ProcTree 进程树
     */
    public String getProcTree() {
        return this.ProcTree;
    }

    /**
     * 设置进程树
     * @param ProcTree 进程树
     */
    public void setProcTree(String ProcTree) {
        this.ProcTree = ProcTree;
    }

    /**
     * 内部实现，用户禁止调用
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

