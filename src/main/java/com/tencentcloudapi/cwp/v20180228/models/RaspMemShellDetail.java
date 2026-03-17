/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class RaspMemShellDetail extends AbstractModel {

    /**
    * 事件ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 服务器quuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 服务器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 实例id
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 公网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 主机tag
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostTags")
    @Expose
    private String [] HostTags;

    /**
    * 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 所属的类加载器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassLoaderName")
    @Expose
    private String ClassLoaderName;

    /**
    * 父类名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuperClassName")
    @Expose
    private String SuperClassName;

    /**
    * 继承的接口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Interfaces")
    @Expose
    private String Interfaces;

    /**
    * 注释
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Annotations")
    @Expose
    private String Annotations;

    /**
    * 类名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 类文件md5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 进程pid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * java进程路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * java进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Args")
    @Expose
    private String Args;

    /**
    * java内存马二进制代码(base64)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassContent")
    @Expose
    private String ClassContent;

    /**
    * java内存马反编译代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassContentPretty")
    @Expose
    private String ClassContentPretty;

    /**
    * 事件描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventDescription")
    @Expose
    private String EventDescription;

    /**
    * 安全建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityAdvice")
    @Expose
    private String SecurityAdvice;

    /**
    * 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近检测时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecentFoundTime")
    @Expose
    private String RecentFoundTime;

    /**
    * 节点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 容器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 容器id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 容器运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * 容器隔离状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * pod名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * podip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
     * Get 事件ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 事件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 事件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 服务器quuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quuid 服务器quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 服务器quuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quuid 服务器quuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 服务器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias 服务器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 服务器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias 服务器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 实例id 
     * @return InstanceID 实例id
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例id
     * @param InstanceID 实例id
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 公网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp 公网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 主机tag
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostTags 主机tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getHostTags() {
        return this.HostTags;
    }

    /**
     * Set 主机tag
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostTags 主机tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostTags(String [] HostTags) {
        this.HostTags = HostTags;
    }

    /**
     * Get 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 所属的类加载器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassLoaderName 所属的类加载器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassLoaderName() {
        return this.ClassLoaderName;
    }

    /**
     * Set 所属的类加载器
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassLoaderName 所属的类加载器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassLoaderName(String ClassLoaderName) {
        this.ClassLoaderName = ClassLoaderName;
    }

    /**
     * Get 父类名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuperClassName 父类名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuperClassName() {
        return this.SuperClassName;
    }

    /**
     * Set 父类名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuperClassName 父类名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuperClassName(String SuperClassName) {
        this.SuperClassName = SuperClassName;
    }

    /**
     * Get 继承的接口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Interfaces 继承的接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInterfaces() {
        return this.Interfaces;
    }

    /**
     * Set 继承的接口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Interfaces 继承的接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInterfaces(String Interfaces) {
        this.Interfaces = Interfaces;
    }

    /**
     * Get 注释
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Annotations 注释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 注释
注意：此字段可能返回 null，表示取不到有效值。
     * @param Annotations 注释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotations(String Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get 类名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassName 类名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set 类名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassName 类名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get 类文件md5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Md5 类文件md5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 类文件md5
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5 类文件md5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 进程pid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pid 进程pid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 进程pid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pid 进程pid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get java进程路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Exe java进程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set java进程路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Exe java进程路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get java进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Args java进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArgs() {
        return this.Args;
    }

    /**
     * Set java进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Args java进程命令行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArgs(String Args) {
        this.Args = Args;
    }

    /**
     * Get java内存马二进制代码(base64)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassContent java内存马二进制代码(base64)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassContent() {
        return this.ClassContent;
    }

    /**
     * Set java内存马二进制代码(base64)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassContent java内存马二进制代码(base64)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassContent(String ClassContent) {
        this.ClassContent = ClassContent;
    }

    /**
     * Get java内存马反编译代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassContentPretty java内存马反编译代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClassContentPretty() {
        return this.ClassContentPretty;
    }

    /**
     * Set java内存马反编译代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassContentPretty java内存马反编译代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassContentPretty(String ClassContentPretty) {
        this.ClassContentPretty = ClassContentPretty;
    }

    /**
     * Get 事件描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventDescription 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventDescription() {
        return this.EventDescription;
    }

    /**
     * Set 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventDescription 事件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventDescription(String EventDescription) {
        this.EventDescription = EventDescription;
    }

    /**
     * Get 安全建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityAdvice 安全建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecurityAdvice() {
        return this.SecurityAdvice;
    }

    /**
     * Set 安全建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityAdvice 安全建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityAdvice(String SecurityAdvice) {
        this.SecurityAdvice = SecurityAdvice;
    }

    /**
     * Get 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 首次发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近检测时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecentFoundTime 最近检测时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecentFoundTime() {
        return this.RecentFoundTime;
    }

    /**
     * Set 最近检测时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecentFoundTime 最近检测时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecentFoundTime(String RecentFoundTime) {
        this.RecentFoundTime = RecentFoundTime;
    }

    /**
     * Get 节点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 节点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId 节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId 节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 容器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerName 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerName 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 容器id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerId 容器id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerId 容器id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 容器运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerStatus 容器运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set 容器运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerStatus 容器运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get 容器隔离状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerNetStatus 容器隔离状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set 容器隔离状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerNetStatus 容器隔离状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get 镜像ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageId 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageId 镜像ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageName 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageName 镜像名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get pod名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName pod名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get podip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodIp podip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set podip
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodIp podip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get 集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    public RaspMemShellDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspMemShellDetail(RaspMemShellDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.HostTags != null) {
            this.HostTags = new String[source.HostTags.length];
            for (int i = 0; i < source.HostTags.length; i++) {
                this.HostTags[i] = new String(source.HostTags[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ClassLoaderName != null) {
            this.ClassLoaderName = new String(source.ClassLoaderName);
        }
        if (source.SuperClassName != null) {
            this.SuperClassName = new String(source.SuperClassName);
        }
        if (source.Interfaces != null) {
            this.Interfaces = new String(source.Interfaces);
        }
        if (source.Annotations != null) {
            this.Annotations = new String(source.Annotations);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.Args != null) {
            this.Args = new String(source.Args);
        }
        if (source.ClassContent != null) {
            this.ClassContent = new String(source.ClassContent);
        }
        if (source.ClassContentPretty != null) {
            this.ClassContentPretty = new String(source.ClassContentPretty);
        }
        if (source.EventDescription != null) {
            this.EventDescription = new String(source.EventDescription);
        }
        if (source.SecurityAdvice != null) {
            this.SecurityAdvice = new String(source.SecurityAdvice);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RecentFoundTime != null) {
            this.RecentFoundTime = new String(source.RecentFoundTime);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.ContainerStatus != null) {
            this.ContainerStatus = new String(source.ContainerStatus);
        }
        if (source.ContainerNetStatus != null) {
            this.ContainerNetStatus = new String(source.ContainerNetStatus);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamArraySimple(map, prefix + "HostTags.", this.HostTags);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClassLoaderName", this.ClassLoaderName);
        this.setParamSimple(map, prefix + "SuperClassName", this.SuperClassName);
        this.setParamSimple(map, prefix + "Interfaces", this.Interfaces);
        this.setParamSimple(map, prefix + "Annotations", this.Annotations);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Args", this.Args);
        this.setParamSimple(map, prefix + "ClassContent", this.ClassContent);
        this.setParamSimple(map, prefix + "ClassContentPretty", this.ClassContentPretty);
        this.setParamSimple(map, prefix + "EventDescription", this.EventDescription);
        this.setParamSimple(map, prefix + "SecurityAdvice", this.SecurityAdvice);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RecentFoundTime", this.RecentFoundTime);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);

    }
}

