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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDefenceEventDetail extends AbstractModel{

    /**
    * 漏洞CVEID
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞PocID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * 入侵状态
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 攻击源IP
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

    /**
    * 攻击源ip地址所在城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 事件数量
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 容器ID
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
    * 容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 镜像ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 处理状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 攻击源端口
    */
    @SerializedName("SourcePort")
    @Expose
    private String [] SourcePort;

    /**
    * 事件ID
    */
    @SerializedName("EventID")
    @Expose
    private Long EventID;

    /**
    * 主机名称/超级节点名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 主机内网IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 主机外网IP
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * Pod名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 危害描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 修复建议
    */
    @SerializedName("OfficialSolution")
    @Expose
    private String OfficialSolution;

    /**
    * 攻击包
    */
    @SerializedName("NetworkPayload")
    @Expose
    private String NetworkPayload;

    /**
    * 进程PID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PID")
    @Expose
    private Long PID;

    /**
    * 进程主类名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * 堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StackTrace")
    @Expose
    private String StackTrace;

    /**
    * 监听账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerAccount")
    @Expose
    private String ServerAccount;

    /**
    * 监听端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerPort")
    @Expose
    private String ServerPort;

    /**
    * 进程路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerExe")
    @Expose
    private String ServerExe;

    /**
    * 进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerArg")
    @Expose
    private String ServerArg;

    /**
    * 主机QUUID/超级节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * 隔离状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * 容器子状态
"AGENT_OFFLINE"       //Agent离线
	"NODE_DESTROYED"      //节点已销毁
	"CONTAINER_EXITED"    //容器已退出
	"CONTAINER_DESTROYED" //容器已销毁
	"SHARED_HOST"         // 容器与主机共享网络
	"RESOURCE_LIMIT"      //隔离操作资源超限
	"UNKNOW"              // 原因未知
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerNetSubStatus")
    @Expose
    private String ContainerNetSubStatus;

    /**
    * 容器隔离操作来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerIsolateOperationSrc")
    @Expose
    private String ContainerIsolateOperationSrc;

    /**
    * 容器状态
正在运行: RUNNING
暂停: PAUSED
停止: STOPPED
已经创建: CREATED
已经销毁: DESTROYED
正在重启中: RESTARTING
迁移中: REMOVING
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * 接口Url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JNDIUrl")
    @Expose
    private String JNDIUrl;

    /**
    * rasp detail
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RaspDetail")
    @Expose
    private RaspInfo [] RaspDetail;

    /**
    * 超级节点子网名称
    */
    @SerializedName("NodeSubNetName")
    @Expose
    private String NodeSubNetName;

    /**
    * 超级节点子网网段
    */
    @SerializedName("NodeSubNetCIDR")
    @Expose
    private String NodeSubNetCIDR;

    /**
    * pod ip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * 节点类型[NORMAL:普通节点|SUPER:超级节点]
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 超级节点ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * 超级节点唯一ID
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * 超级节点子网ID
    */
    @SerializedName("NodeSubNetID")
    @Expose
    private String NodeSubNetID;

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get 漏洞CVEID 
     * @return CVEID 漏洞CVEID
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set 漏洞CVEID
     * @param CVEID 漏洞CVEID
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get 漏洞名称 
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set 漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get 漏洞PocID 
     * @return PocID 漏洞PocID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set 漏洞PocID
     * @param PocID 漏洞PocID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get 入侵状态 
     * @return EventType 入侵状态
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 入侵状态
     * @param EventType 入侵状态
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 攻击源IP 
     * @return SourceIP 攻击源IP
     */
    public String getSourceIP() {
        return this.SourceIP;
    }

    /**
     * Set 攻击源IP
     * @param SourceIP 攻击源IP
     */
    public void setSourceIP(String SourceIP) {
        this.SourceIP = SourceIP;
    }

    /**
     * Get 攻击源ip地址所在城市 
     * @return City 攻击源ip地址所在城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 攻击源ip地址所在城市
     * @param City 攻击源ip地址所在城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 事件数量 
     * @return EventCount 事件数量
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set 事件数量
     * @param EventCount 事件数量
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get 容器ID 
     * @return ContainerID 容器ID
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set 容器ID
     * @param ContainerID 容器ID
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    /**
     * Get 容器名称 
     * @return ContainerName 容器名称
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称
     * @param ContainerName 容器名称
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 镜像ID 
     * @return ImageID 镜像ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
     * @param ImageID 镜像ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 处理状态 
     * @return Status 处理状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态
     * @param Status 处理状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 攻击源端口 
     * @return SourcePort 攻击源端口
     */
    public String [] getSourcePort() {
        return this.SourcePort;
    }

    /**
     * Set 攻击源端口
     * @param SourcePort 攻击源端口
     */
    public void setSourcePort(String [] SourcePort) {
        this.SourcePort = SourcePort;
    }

    /**
     * Get 事件ID 
     * @return EventID 事件ID
     */
    public Long getEventID() {
        return this.EventID;
    }

    /**
     * Set 事件ID
     * @param EventID 事件ID
     */
    public void setEventID(Long EventID) {
        this.EventID = EventID;
    }

    /**
     * Get 主机名称/超级节点名称 
     * @return HostName 主机名称/超级节点名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称/超级节点名称
     * @param HostName 主机名称/超级节点名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 主机内网IP 
     * @return HostIP 主机内网IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 主机内网IP
     * @param HostIP 主机内网IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 主机外网IP 
     * @return PublicIP 主机外网IP
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 主机外网IP
     * @param PublicIP 主机外网IP
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get Pod名称 
     * @return PodName Pod名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod名称
     * @param PodName Pod名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 危害描述 
     * @return Description 危害描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 危害描述
     * @param Description 危害描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 修复建议 
     * @return OfficialSolution 修复建议
     */
    public String getOfficialSolution() {
        return this.OfficialSolution;
    }

    /**
     * Set 修复建议
     * @param OfficialSolution 修复建议
     */
    public void setOfficialSolution(String OfficialSolution) {
        this.OfficialSolution = OfficialSolution;
    }

    /**
     * Get 攻击包 
     * @return NetworkPayload 攻击包
     */
    public String getNetworkPayload() {
        return this.NetworkPayload;
    }

    /**
     * Set 攻击包
     * @param NetworkPayload 攻击包
     */
    public void setNetworkPayload(String NetworkPayload) {
        this.NetworkPayload = NetworkPayload;
    }

    /**
     * Get 进程PID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PID 进程PID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPID() {
        return this.PID;
    }

    /**
     * Set 进程PID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PID 进程PID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPID(Long PID) {
        this.PID = PID;
    }

    /**
     * Get 进程主类名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainClass 进程主类名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set 进程主类名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainClass 进程主类名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get 堆栈信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StackTrace 堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStackTrace() {
        return this.StackTrace;
    }

    /**
     * Set 堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StackTrace 堆栈信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStackTrace(String StackTrace) {
        this.StackTrace = StackTrace;
    }

    /**
     * Get 监听账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerAccount 监听账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerAccount() {
        return this.ServerAccount;
    }

    /**
     * Set 监听账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerAccount 监听账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerAccount(String ServerAccount) {
        this.ServerAccount = ServerAccount;
    }

    /**
     * Get 监听端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerPort 监听端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerPort() {
        return this.ServerPort;
    }

    /**
     * Set 监听端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerPort 监听端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerPort(String ServerPort) {
        this.ServerPort = ServerPort;
    }

    /**
     * Get 进程路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerExe 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerExe() {
        return this.ServerExe;
    }

    /**
     * Set 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerExe 进程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerExe(String ServerExe) {
        this.ServerExe = ServerExe;
    }

    /**
     * Get 进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerArg 进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerArg() {
        return this.ServerArg;
    }

    /**
     * Set 进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerArg 进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerArg(String ServerArg) {
        this.ServerArg = ServerArg;
    }

    /**
     * Get 主机QUUID/超级节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QUUID 主机QUUID/超级节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set 主机QUUID/超级节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param QUUID 主机QUUID/超级节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get 隔离状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerNetStatus 隔离状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set 隔离状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerNetStatus 隔离状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get 容器子状态
"AGENT_OFFLINE"       //Agent离线
	"NODE_DESTROYED"      //节点已销毁
	"CONTAINER_EXITED"    //容器已退出
	"CONTAINER_DESTROYED" //容器已销毁
	"SHARED_HOST"         // 容器与主机共享网络
	"RESOURCE_LIMIT"      //隔离操作资源超限
	"UNKNOW"              // 原因未知
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerNetSubStatus 容器子状态
"AGENT_OFFLINE"       //Agent离线
	"NODE_DESTROYED"      //节点已销毁
	"CONTAINER_EXITED"    //容器已退出
	"CONTAINER_DESTROYED" //容器已销毁
	"SHARED_HOST"         // 容器与主机共享网络
	"RESOURCE_LIMIT"      //隔离操作资源超限
	"UNKNOW"              // 原因未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerNetSubStatus() {
        return this.ContainerNetSubStatus;
    }

    /**
     * Set 容器子状态
"AGENT_OFFLINE"       //Agent离线
	"NODE_DESTROYED"      //节点已销毁
	"CONTAINER_EXITED"    //容器已退出
	"CONTAINER_DESTROYED" //容器已销毁
	"SHARED_HOST"         // 容器与主机共享网络
	"RESOURCE_LIMIT"      //隔离操作资源超限
	"UNKNOW"              // 原因未知
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerNetSubStatus 容器子状态
"AGENT_OFFLINE"       //Agent离线
	"NODE_DESTROYED"      //节点已销毁
	"CONTAINER_EXITED"    //容器已退出
	"CONTAINER_DESTROYED" //容器已销毁
	"SHARED_HOST"         // 容器与主机共享网络
	"RESOURCE_LIMIT"      //隔离操作资源超限
	"UNKNOW"              // 原因未知
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerNetSubStatus(String ContainerNetSubStatus) {
        this.ContainerNetSubStatus = ContainerNetSubStatus;
    }

    /**
     * Get 容器隔离操作来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerIsolateOperationSrc 容器隔离操作来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerIsolateOperationSrc() {
        return this.ContainerIsolateOperationSrc;
    }

    /**
     * Set 容器隔离操作来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerIsolateOperationSrc 容器隔离操作来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerIsolateOperationSrc(String ContainerIsolateOperationSrc) {
        this.ContainerIsolateOperationSrc = ContainerIsolateOperationSrc;
    }

    /**
     * Get 容器状态
正在运行: RUNNING
暂停: PAUSED
停止: STOPPED
已经创建: CREATED
已经销毁: DESTROYED
正在重启中: RESTARTING
迁移中: REMOVING
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerStatus 容器状态
正在运行: RUNNING
暂停: PAUSED
停止: STOPPED
已经创建: CREATED
已经销毁: DESTROYED
正在重启中: RESTARTING
迁移中: REMOVING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set 容器状态
正在运行: RUNNING
暂停: PAUSED
停止: STOPPED
已经创建: CREATED
已经销毁: DESTROYED
正在重启中: RESTARTING
迁移中: REMOVING
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerStatus 容器状态
正在运行: RUNNING
暂停: PAUSED
停止: STOPPED
已经创建: CREATED
已经销毁: DESTROYED
正在重启中: RESTARTING
迁移中: REMOVING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get 接口Url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JNDIUrl 接口Url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJNDIUrl() {
        return this.JNDIUrl;
    }

    /**
     * Set 接口Url
注意：此字段可能返回 null，表示取不到有效值。
     * @param JNDIUrl 接口Url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJNDIUrl(String JNDIUrl) {
        this.JNDIUrl = JNDIUrl;
    }

    /**
     * Get rasp detail
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RaspDetail rasp detail
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RaspInfo [] getRaspDetail() {
        return this.RaspDetail;
    }

    /**
     * Set rasp detail
注意：此字段可能返回 null，表示取不到有效值。
     * @param RaspDetail rasp detail
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRaspDetail(RaspInfo [] RaspDetail) {
        this.RaspDetail = RaspDetail;
    }

    /**
     * Get 超级节点子网名称 
     * @return NodeSubNetName 超级节点子网名称
     */
    public String getNodeSubNetName() {
        return this.NodeSubNetName;
    }

    /**
     * Set 超级节点子网名称
     * @param NodeSubNetName 超级节点子网名称
     */
    public void setNodeSubNetName(String NodeSubNetName) {
        this.NodeSubNetName = NodeSubNetName;
    }

    /**
     * Get 超级节点子网网段 
     * @return NodeSubNetCIDR 超级节点子网网段
     */
    public String getNodeSubNetCIDR() {
        return this.NodeSubNetCIDR;
    }

    /**
     * Set 超级节点子网网段
     * @param NodeSubNetCIDR 超级节点子网网段
     */
    public void setNodeSubNetCIDR(String NodeSubNetCIDR) {
        this.NodeSubNetCIDR = NodeSubNetCIDR;
    }

    /**
     * Get pod ip 
     * @return PodIP pod ip
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set pod ip
     * @param PodIP pod ip
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get 节点类型[NORMAL:普通节点|SUPER:超级节点] 
     * @return NodeType 节点类型[NORMAL:普通节点|SUPER:超级节点]
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型[NORMAL:普通节点|SUPER:超级节点]
     * @param NodeType 节点类型[NORMAL:普通节点|SUPER:超级节点]
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 超级节点ID 
     * @return NodeID 超级节点ID
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set 超级节点ID
     * @param NodeID 超级节点ID
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get 超级节点唯一ID 
     * @return NodeUniqueID 超级节点唯一ID
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set 超级节点唯一ID
     * @param NodeUniqueID 超级节点唯一ID
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get 超级节点子网ID 
     * @return NodeSubNetID 超级节点子网ID
     */
    public String getNodeSubNetID() {
        return this.NodeSubNetID;
    }

    /**
     * Set 超级节点子网ID
     * @param NodeSubNetID 超级节点子网ID
     */
    public void setNodeSubNetID(String NodeSubNetID) {
        this.NodeSubNetID = NodeSubNetID;
    }

    /**
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    public VulDefenceEventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceEventDetail(VulDefenceEventDetail source) {
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SourcePort != null) {
            this.SourcePort = new String[source.SourcePort.length];
            for (int i = 0; i < source.SourcePort.length; i++) {
                this.SourcePort[i] = new String(source.SourcePort[i]);
            }
        }
        if (source.EventID != null) {
            this.EventID = new Long(source.EventID);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OfficialSolution != null) {
            this.OfficialSolution = new String(source.OfficialSolution);
        }
        if (source.NetworkPayload != null) {
            this.NetworkPayload = new String(source.NetworkPayload);
        }
        if (source.PID != null) {
            this.PID = new Long(source.PID);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.StackTrace != null) {
            this.StackTrace = new String(source.StackTrace);
        }
        if (source.ServerAccount != null) {
            this.ServerAccount = new String(source.ServerAccount);
        }
        if (source.ServerPort != null) {
            this.ServerPort = new String(source.ServerPort);
        }
        if (source.ServerExe != null) {
            this.ServerExe = new String(source.ServerExe);
        }
        if (source.ServerArg != null) {
            this.ServerArg = new String(source.ServerArg);
        }
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.ContainerNetStatus != null) {
            this.ContainerNetStatus = new String(source.ContainerNetStatus);
        }
        if (source.ContainerNetSubStatus != null) {
            this.ContainerNetSubStatus = new String(source.ContainerNetSubStatus);
        }
        if (source.ContainerIsolateOperationSrc != null) {
            this.ContainerIsolateOperationSrc = new String(source.ContainerIsolateOperationSrc);
        }
        if (source.ContainerStatus != null) {
            this.ContainerStatus = new String(source.ContainerStatus);
        }
        if (source.JNDIUrl != null) {
            this.JNDIUrl = new String(source.JNDIUrl);
        }
        if (source.RaspDetail != null) {
            this.RaspDetail = new RaspInfo[source.RaspDetail.length];
            for (int i = 0; i < source.RaspDetail.length; i++) {
                this.RaspDetail[i] = new RaspInfo(source.RaspDetail[i]);
            }
        }
        if (source.NodeSubNetName != null) {
            this.NodeSubNetName = new String(source.NodeSubNetName);
        }
        if (source.NodeSubNetCIDR != null) {
            this.NodeSubNetCIDR = new String(source.NodeSubNetCIDR);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.NodeSubNetID != null) {
            this.NodeSubNetID = new String(source.NodeSubNetID);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SourcePort.", this.SourcePort);
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OfficialSolution", this.OfficialSolution);
        this.setParamSimple(map, prefix + "NetworkPayload", this.NetworkPayload);
        this.setParamSimple(map, prefix + "PID", this.PID);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "StackTrace", this.StackTrace);
        this.setParamSimple(map, prefix + "ServerAccount", this.ServerAccount);
        this.setParamSimple(map, prefix + "ServerPort", this.ServerPort);
        this.setParamSimple(map, prefix + "ServerExe", this.ServerExe);
        this.setParamSimple(map, prefix + "ServerArg", this.ServerArg);
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "JNDIUrl", this.JNDIUrl);
        this.setParamArrayObj(map, prefix + "RaspDetail.", this.RaspDetail);
        this.setParamSimple(map, prefix + "NodeSubNetName", this.NodeSubNetName);
        this.setParamSimple(map, prefix + "NodeSubNetCIDR", this.NodeSubNetCIDR);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "NodeSubNetID", this.NodeSubNetID);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

