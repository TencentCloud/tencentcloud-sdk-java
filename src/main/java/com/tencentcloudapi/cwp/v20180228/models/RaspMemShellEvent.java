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

public class RaspMemShellEvent extends AbstractModel {

    /**
    * 事件ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 服务器quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 服务器名称
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 服务器IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 说明
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 首次发现时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近检测时间
    */
    @SerializedName("RecentFoundTime")
    @Expose
    private String RecentFoundTime;

    /**
    * 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 类文件md5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 类名
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 父类名
    */
    @SerializedName("SuperClassName")
    @Expose
    private String SuperClassName;

    /**
    * 继承的接口
    */
    @SerializedName("Interfaces")
    @Expose
    private String Interfaces;

    /**
    * 注释
    */
    @SerializedName("Annotations")
    @Expose
    private String Annotations;

    /**
    * 所属的类加载器
    */
    @SerializedName("LoaderClassName")
    @Expose
    private String LoaderClassName;

    /**
    * 进程pid
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * java进程路径
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * java进程命令行参数
    */
    @SerializedName("Args")
    @Expose
    private String Args;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点id
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 容器名称
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 容器id
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 容器运行状态
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * 容器隔离状态
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * 镜像ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * pod名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * podip
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 和节点id一样，前端可以不用这个
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 服务器内网ip
    */
    @SerializedName("HostInnerIP")
    @Expose
    private String HostInnerIP;

    /**
    * 服务器外网ip
    */
    @SerializedName("HostPublicIP")
    @Expose
    private String HostPublicIP;

    /**
    * 普通节点：NORMAL
超级节点：SUPER
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 超级节点唯一id
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
     * Get 事件ID 
     * @return Id 事件ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件ID
     * @param Id 事件ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 服务器quuid 
     * @return Quuid 服务器quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 服务器quuid
     * @param Quuid 服务器quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 服务器名称 
     * @return Alias 服务器名称
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 服务器名称
     * @param Alias 服务器名称
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 服务器IP 
     * @return HostIp 服务器IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 服务器IP
     * @param HostIp 服务器IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他 
     * @return Type 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
     * @param Type 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 说明 
     * @return Description 说明
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 说明
     * @param Description 说明
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 首次发现时间 
     * @return CreateTime 首次发现时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次发现时间
     * @param CreateTime 首次发现时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近检测时间 
     * @return RecentFoundTime 最近检测时间
     */
    public String getRecentFoundTime() {
        return this.RecentFoundTime;
    }

    /**
     * Set 最近检测时间
     * @param RecentFoundTime 最近检测时间
     */
    public void setRecentFoundTime(String RecentFoundTime) {
        this.RecentFoundTime = RecentFoundTime;
    }

    /**
     * Get 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理 
     * @return Status 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
     * @param Status 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 类文件md5 
     * @return Md5 类文件md5
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 类文件md5
     * @param Md5 类文件md5
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 类名 
     * @return ClassName 类名
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set 类名
     * @param ClassName 类名
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get 父类名 
     * @return SuperClassName 父类名
     */
    public String getSuperClassName() {
        return this.SuperClassName;
    }

    /**
     * Set 父类名
     * @param SuperClassName 父类名
     */
    public void setSuperClassName(String SuperClassName) {
        this.SuperClassName = SuperClassName;
    }

    /**
     * Get 继承的接口 
     * @return Interfaces 继承的接口
     */
    public String getInterfaces() {
        return this.Interfaces;
    }

    /**
     * Set 继承的接口
     * @param Interfaces 继承的接口
     */
    public void setInterfaces(String Interfaces) {
        this.Interfaces = Interfaces;
    }

    /**
     * Get 注释 
     * @return Annotations 注释
     */
    public String getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 注释
     * @param Annotations 注释
     */
    public void setAnnotations(String Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get 所属的类加载器 
     * @return LoaderClassName 所属的类加载器
     */
    public String getLoaderClassName() {
        return this.LoaderClassName;
    }

    /**
     * Set 所属的类加载器
     * @param LoaderClassName 所属的类加载器
     */
    public void setLoaderClassName(String LoaderClassName) {
        this.LoaderClassName = LoaderClassName;
    }

    /**
     * Get 进程pid 
     * @return Pid 进程pid
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 进程pid
     * @param Pid 进程pid
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get java进程路径 
     * @return Exe java进程路径
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set java进程路径
     * @param Exe java进程路径
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get java进程命令行参数 
     * @return Args java进程命令行参数
     */
    public String getArgs() {
        return this.Args;
    }

    /**
     * Set java进程命令行参数
     * @param Args java进程命令行参数
     */
    public void setArgs(String Args) {
        this.Args = Args;
    }

    /**
     * Get 节点名称 
     * @return NodeName 节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
     * @param NodeName 节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点id 
     * @return NodeId 节点id
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点id
     * @param NodeId 节点id
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
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
     * Get 容器id 
     * @return ContainerId 容器id
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器id
     * @param ContainerId 容器id
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 容器运行状态 
     * @return ContainerStatus 容器运行状态
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set 容器运行状态
     * @param ContainerStatus 容器运行状态
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get 容器隔离状态 
     * @return ContainerNetStatus 容器隔离状态
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set 容器隔离状态
     * @param ContainerNetStatus 容器隔离状态
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get 镜像ID 
     * @return ImageId 镜像ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID
     * @param ImageId 镜像ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
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
     * Get pod名称 
     * @return PodName pod名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod名称
     * @param PodName pod名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get podip 
     * @return PodIp podip
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set podip
     * @param PodIp podip
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
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

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 和节点id一样，前端可以不用这个 
     * @return InstanceID 和节点id一样，前端可以不用这个
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 和节点id一样，前端可以不用这个
     * @param InstanceID 和节点id一样，前端可以不用这个
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 服务器内网ip 
     * @return HostInnerIP 服务器内网ip
     */
    public String getHostInnerIP() {
        return this.HostInnerIP;
    }

    /**
     * Set 服务器内网ip
     * @param HostInnerIP 服务器内网ip
     */
    public void setHostInnerIP(String HostInnerIP) {
        this.HostInnerIP = HostInnerIP;
    }

    /**
     * Get 服务器外网ip 
     * @return HostPublicIP 服务器外网ip
     */
    public String getHostPublicIP() {
        return this.HostPublicIP;
    }

    /**
     * Set 服务器外网ip
     * @param HostPublicIP 服务器外网ip
     */
    public void setHostPublicIP(String HostPublicIP) {
        this.HostPublicIP = HostPublicIP;
    }

    /**
     * Get 普通节点：NORMAL
超级节点：SUPER 
     * @return NodeType 普通节点：NORMAL
超级节点：SUPER
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 普通节点：NORMAL
超级节点：SUPER
     * @param NodeType 普通节点：NORMAL
超级节点：SUPER
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 超级节点唯一id 
     * @return NodeUniqueID 超级节点唯一id
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set 超级节点唯一id
     * @param NodeUniqueID 超级节点唯一id
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    public RaspMemShellEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RaspMemShellEvent(RaspMemShellEvent source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RecentFoundTime != null) {
            this.RecentFoundTime = new String(source.RecentFoundTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
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
        if (source.LoaderClassName != null) {
            this.LoaderClassName = new String(source.LoaderClassName);
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
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.HostInnerIP != null) {
            this.HostInnerIP = new String(source.HostInnerIP);
        }
        if (source.HostPublicIP != null) {
            this.HostPublicIP = new String(source.HostPublicIP);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RecentFoundTime", this.RecentFoundTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "SuperClassName", this.SuperClassName);
        this.setParamSimple(map, prefix + "Interfaces", this.Interfaces);
        this.setParamSimple(map, prefix + "Annotations", this.Annotations);
        this.setParamSimple(map, prefix + "LoaderClassName", this.LoaderClassName);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Args", this.Args);
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
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "HostInnerIP", this.HostInnerIP);
        this.setParamSimple(map, prefix + "HostPublicIP", this.HostPublicIP);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);

    }
}

