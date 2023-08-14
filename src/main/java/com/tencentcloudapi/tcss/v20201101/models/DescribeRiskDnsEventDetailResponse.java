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

public class DescribeRiskDnsEventDetailResponse extends AbstractModel{

    /**
    * 事件ID
    */
    @SerializedName("EventID")
    @Expose
    private Long EventID;

    /**
    * 事件类型，恶意域名请求：DOMAIN，恶意IP请求：IP
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 恶意请求次数
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 首次发现时间
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * 最近生成时间
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

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
    * 隔离状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * 容器状态
正在运行: RUNNING
暂停: PAUSED
停止: STOPPED
已经创建: CREATED
已经销毁: DESTROYED
正在重启中: RESTARTING
迁移中: REMOVING
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * 容器子状态
"AGENT_OFFLINE"       //Agent离线
"NODE_DESTROYED"      //节点已销毁
"CONTAINER_EXITED"    //容器已退出
"CONTAINER_DESTROYED" //容器已销毁
"SHARED_HOST"         // 容器与主机共享网络
"RESOURCE_LIMIT"      //隔离操作资源超限
"UNKNOW"              // 原因未知
    */
    @SerializedName("ContainerNetSubStatus")
    @Expose
    private String ContainerNetSubStatus;

    /**
    * 容器隔离操作来源
    */
    @SerializedName("ContainerIsolateOperationSrc")
    @Expose
    private String ContainerIsolateOperationSrc;

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
    * 主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 内网IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 外网IP
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * 节点名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 事件描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 解决方案
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 参考链接
    */
    @SerializedName("Reference")
    @Expose
    private String [] Reference;

    /**
    * 恶意域名或IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 恶意IP所属城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 命中规则类型
SYSTEM：系统规则
 USER：用户自定义
    */
    @SerializedName("MatchRuleType")
    @Expose
    private String MatchRuleType;

    /**
    * 标签特征
    */
    @SerializedName("FeatureLabel")
    @Expose
    private String FeatureLabel;

    /**
    * 进程权限
    */
    @SerializedName("ProcessAuthority")
    @Expose
    private String ProcessAuthority;

    /**
    * 进程md5
    */
    @SerializedName("ProcessMd5")
    @Expose
    private String ProcessMd5;

    /**
    * 进程启动用户
    */
    @SerializedName("ProcessStartUser")
    @Expose
    private String ProcessStartUser;

    /**
    * 进程用户组
    */
    @SerializedName("ProcessUserGroup")
    @Expose
    private String ProcessUserGroup;

    /**
    * 进程路径
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 进程树
    */
    @SerializedName("ProcessTree")
    @Expose
    private String ProcessTree;

    /**
    * 进程命令行参数
    */
    @SerializedName("ProcessParam")
    @Expose
    private String ProcessParam;

    /**
    * 父进程启动用户
    */
    @SerializedName("ParentProcessStartUser")
    @Expose
    private String ParentProcessStartUser;

    /**
    * 父进程用户组
    */
    @SerializedName("ParentProcessUserGroup")
    @Expose
    private String ParentProcessUserGroup;

    /**
    * 父进程路径
    */
    @SerializedName("ParentProcessPath")
    @Expose
    private String ParentProcessPath;

    /**
    * 父进程命令行参数
    */
    @SerializedName("ParentProcessParam")
    @Expose
    private String ParentProcessParam;

    /**
    * 祖先进程启动用户
    */
    @SerializedName("AncestorProcessStartUser")
    @Expose
    private String AncestorProcessStartUser;

    /**
    * 祖先进程用户组
    */
    @SerializedName("AncestorProcessUserGroup")
    @Expose
    private String AncestorProcessUserGroup;

    /**
    * 祖先进程路径
    */
    @SerializedName("AncestorProcessPath")
    @Expose
    private String AncestorProcessPath;

    /**
    * 祖先进程命令行参数
    */
    @SerializedName("AncestorProcessParam")
    @Expose
    private String AncestorProcessParam;

    /**
    * 主机ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * 事件状态
EVENT_UNDEAL： 待处理
EVENT_DEALED：已处理
EVENT_IGNORE： 已忽略
EVENT_ADD_WHITE：已加白
    */
    @SerializedName("EventStatus")
    @Expose
    private String EventStatus;

    /**
    * 操作时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 节点类型
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点子网ID
    */
    @SerializedName("NodeSubNetID")
    @Expose
    private String NodeSubNetID;

    /**
    * 节点子网名称
    */
    @SerializedName("NodeSubNetName")
    @Expose
    private String NodeSubNetName;

    /**
    * 节点子网网段
    */
    @SerializedName("NodeSubNetCIDR")
    @Expose
    private String NodeSubNetCIDR;

    /**
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * podip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * pod状态
    */
    @SerializedName("PodStatus")
    @Expose
    private String PodStatus;

    /**
    * 节点唯一id
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * 节点ID名称
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 事件类型，恶意域名请求：DOMAIN，恶意IP请求：IP 
     * @return EventType 事件类型，恶意域名请求：DOMAIN，恶意IP请求：IP
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型，恶意域名请求：DOMAIN，恶意IP请求：IP
     * @param EventType 事件类型，恶意域名请求：DOMAIN，恶意IP请求：IP
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 恶意请求次数 
     * @return EventCount 恶意请求次数
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set 恶意请求次数
     * @param EventCount 恶意请求次数
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get 首次发现时间 
     * @return FoundTime 首次发现时间
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set 首次发现时间
     * @param FoundTime 首次发现时间
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get 最近生成时间 
     * @return LatestFoundTime 最近生成时间
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set 最近生成时间
     * @param LatestFoundTime 最近生成时间
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
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
     * Get 隔离状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED 
     * @return ContainerNetStatus 隔离状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
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
     * @param ContainerNetStatus 隔离状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
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
     * @return ContainerStatus 容器状态
正在运行: RUNNING
暂停: PAUSED
停止: STOPPED
已经创建: CREATED
已经销毁: DESTROYED
正在重启中: RESTARTING
迁移中: REMOVING
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
     * @param ContainerStatus 容器状态
正在运行: RUNNING
暂停: PAUSED
停止: STOPPED
已经创建: CREATED
已经销毁: DESTROYED
正在重启中: RESTARTING
迁移中: REMOVING
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
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
     * @return ContainerNetSubStatus 容器子状态
"AGENT_OFFLINE"       //Agent离线
"NODE_DESTROYED"      //节点已销毁
"CONTAINER_EXITED"    //容器已退出
"CONTAINER_DESTROYED" //容器已销毁
"SHARED_HOST"         // 容器与主机共享网络
"RESOURCE_LIMIT"      //隔离操作资源超限
"UNKNOW"              // 原因未知
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
     * @param ContainerNetSubStatus 容器子状态
"AGENT_OFFLINE"       //Agent离线
"NODE_DESTROYED"      //节点已销毁
"CONTAINER_EXITED"    //容器已退出
"CONTAINER_DESTROYED" //容器已销毁
"SHARED_HOST"         // 容器与主机共享网络
"RESOURCE_LIMIT"      //隔离操作资源超限
"UNKNOW"              // 原因未知
     */
    public void setContainerNetSubStatus(String ContainerNetSubStatus) {
        this.ContainerNetSubStatus = ContainerNetSubStatus;
    }

    /**
     * Get 容器隔离操作来源 
     * @return ContainerIsolateOperationSrc 容器隔离操作来源
     */
    public String getContainerIsolateOperationSrc() {
        return this.ContainerIsolateOperationSrc;
    }

    /**
     * Set 容器隔离操作来源
     * @param ContainerIsolateOperationSrc 容器隔离操作来源
     */
    public void setContainerIsolateOperationSrc(String ContainerIsolateOperationSrc) {
        this.ContainerIsolateOperationSrc = ContainerIsolateOperationSrc;
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
     * Get 主机名称 
     * @return HostName 主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名称
     * @param HostName 主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 内网IP 
     * @return HostIP 内网IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 内网IP
     * @param HostIP 内网IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get 外网IP 
     * @return PublicIP 外网IP
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 外网IP
     * @param PublicIP 外网IP
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get 节点名称 
     * @return PodName 节点名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set 节点名称
     * @param PodName 节点名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 事件描述 
     * @return Description 事件描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件描述
     * @param Description 事件描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 解决方案 
     * @return Solution 解决方案
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 解决方案
     * @param Solution 解决方案
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get 参考链接 
     * @return Reference 参考链接
     */
    public String [] getReference() {
        return this.Reference;
    }

    /**
     * Set 参考链接
     * @param Reference 参考链接
     */
    public void setReference(String [] Reference) {
        this.Reference = Reference;
    }

    /**
     * Get 恶意域名或IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 恶意域名或IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 恶意域名或IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 恶意域名或IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 恶意IP所属城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 恶意IP所属城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 恶意IP所属城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 恶意IP所属城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 命中规则类型
SYSTEM：系统规则
 USER：用户自定义 
     * @return MatchRuleType 命中规则类型
SYSTEM：系统规则
 USER：用户自定义
     */
    public String getMatchRuleType() {
        return this.MatchRuleType;
    }

    /**
     * Set 命中规则类型
SYSTEM：系统规则
 USER：用户自定义
     * @param MatchRuleType 命中规则类型
SYSTEM：系统规则
 USER：用户自定义
     */
    public void setMatchRuleType(String MatchRuleType) {
        this.MatchRuleType = MatchRuleType;
    }

    /**
     * Get 标签特征 
     * @return FeatureLabel 标签特征
     */
    public String getFeatureLabel() {
        return this.FeatureLabel;
    }

    /**
     * Set 标签特征
     * @param FeatureLabel 标签特征
     */
    public void setFeatureLabel(String FeatureLabel) {
        this.FeatureLabel = FeatureLabel;
    }

    /**
     * Get 进程权限 
     * @return ProcessAuthority 进程权限
     */
    public String getProcessAuthority() {
        return this.ProcessAuthority;
    }

    /**
     * Set 进程权限
     * @param ProcessAuthority 进程权限
     */
    public void setProcessAuthority(String ProcessAuthority) {
        this.ProcessAuthority = ProcessAuthority;
    }

    /**
     * Get 进程md5 
     * @return ProcessMd5 进程md5
     */
    public String getProcessMd5() {
        return this.ProcessMd5;
    }

    /**
     * Set 进程md5
     * @param ProcessMd5 进程md5
     */
    public void setProcessMd5(String ProcessMd5) {
        this.ProcessMd5 = ProcessMd5;
    }

    /**
     * Get 进程启动用户 
     * @return ProcessStartUser 进程启动用户
     */
    public String getProcessStartUser() {
        return this.ProcessStartUser;
    }

    /**
     * Set 进程启动用户
     * @param ProcessStartUser 进程启动用户
     */
    public void setProcessStartUser(String ProcessStartUser) {
        this.ProcessStartUser = ProcessStartUser;
    }

    /**
     * Get 进程用户组 
     * @return ProcessUserGroup 进程用户组
     */
    public String getProcessUserGroup() {
        return this.ProcessUserGroup;
    }

    /**
     * Set 进程用户组
     * @param ProcessUserGroup 进程用户组
     */
    public void setProcessUserGroup(String ProcessUserGroup) {
        this.ProcessUserGroup = ProcessUserGroup;
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
     * Get 进程树 
     * @return ProcessTree 进程树
     */
    public String getProcessTree() {
        return this.ProcessTree;
    }

    /**
     * Set 进程树
     * @param ProcessTree 进程树
     */
    public void setProcessTree(String ProcessTree) {
        this.ProcessTree = ProcessTree;
    }

    /**
     * Get 进程命令行参数 
     * @return ProcessParam 进程命令行参数
     */
    public String getProcessParam() {
        return this.ProcessParam;
    }

    /**
     * Set 进程命令行参数
     * @param ProcessParam 进程命令行参数
     */
    public void setProcessParam(String ProcessParam) {
        this.ProcessParam = ProcessParam;
    }

    /**
     * Get 父进程启动用户 
     * @return ParentProcessStartUser 父进程启动用户
     */
    public String getParentProcessStartUser() {
        return this.ParentProcessStartUser;
    }

    /**
     * Set 父进程启动用户
     * @param ParentProcessStartUser 父进程启动用户
     */
    public void setParentProcessStartUser(String ParentProcessStartUser) {
        this.ParentProcessStartUser = ParentProcessStartUser;
    }

    /**
     * Get 父进程用户组 
     * @return ParentProcessUserGroup 父进程用户组
     */
    public String getParentProcessUserGroup() {
        return this.ParentProcessUserGroup;
    }

    /**
     * Set 父进程用户组
     * @param ParentProcessUserGroup 父进程用户组
     */
    public void setParentProcessUserGroup(String ParentProcessUserGroup) {
        this.ParentProcessUserGroup = ParentProcessUserGroup;
    }

    /**
     * Get 父进程路径 
     * @return ParentProcessPath 父进程路径
     */
    public String getParentProcessPath() {
        return this.ParentProcessPath;
    }

    /**
     * Set 父进程路径
     * @param ParentProcessPath 父进程路径
     */
    public void setParentProcessPath(String ParentProcessPath) {
        this.ParentProcessPath = ParentProcessPath;
    }

    /**
     * Get 父进程命令行参数 
     * @return ParentProcessParam 父进程命令行参数
     */
    public String getParentProcessParam() {
        return this.ParentProcessParam;
    }

    /**
     * Set 父进程命令行参数
     * @param ParentProcessParam 父进程命令行参数
     */
    public void setParentProcessParam(String ParentProcessParam) {
        this.ParentProcessParam = ParentProcessParam;
    }

    /**
     * Get 祖先进程启动用户 
     * @return AncestorProcessStartUser 祖先进程启动用户
     */
    public String getAncestorProcessStartUser() {
        return this.AncestorProcessStartUser;
    }

    /**
     * Set 祖先进程启动用户
     * @param AncestorProcessStartUser 祖先进程启动用户
     */
    public void setAncestorProcessStartUser(String AncestorProcessStartUser) {
        this.AncestorProcessStartUser = AncestorProcessStartUser;
    }

    /**
     * Get 祖先进程用户组 
     * @return AncestorProcessUserGroup 祖先进程用户组
     */
    public String getAncestorProcessUserGroup() {
        return this.AncestorProcessUserGroup;
    }

    /**
     * Set 祖先进程用户组
     * @param AncestorProcessUserGroup 祖先进程用户组
     */
    public void setAncestorProcessUserGroup(String AncestorProcessUserGroup) {
        this.AncestorProcessUserGroup = AncestorProcessUserGroup;
    }

    /**
     * Get 祖先进程路径 
     * @return AncestorProcessPath 祖先进程路径
     */
    public String getAncestorProcessPath() {
        return this.AncestorProcessPath;
    }

    /**
     * Set 祖先进程路径
     * @param AncestorProcessPath 祖先进程路径
     */
    public void setAncestorProcessPath(String AncestorProcessPath) {
        this.AncestorProcessPath = AncestorProcessPath;
    }

    /**
     * Get 祖先进程命令行参数 
     * @return AncestorProcessParam 祖先进程命令行参数
     */
    public String getAncestorProcessParam() {
        return this.AncestorProcessParam;
    }

    /**
     * Set 祖先进程命令行参数
     * @param AncestorProcessParam 祖先进程命令行参数
     */
    public void setAncestorProcessParam(String AncestorProcessParam) {
        this.AncestorProcessParam = AncestorProcessParam;
    }

    /**
     * Get 主机ID 
     * @return HostID 主机ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set 主机ID
     * @param HostID 主机ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get 事件状态
EVENT_UNDEAL： 待处理
EVENT_DEALED：已处理
EVENT_IGNORE： 已忽略
EVENT_ADD_WHITE：已加白 
     * @return EventStatus 事件状态
EVENT_UNDEAL： 待处理
EVENT_DEALED：已处理
EVENT_IGNORE： 已忽略
EVENT_ADD_WHITE：已加白
     */
    public String getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set 事件状态
EVENT_UNDEAL： 待处理
EVENT_DEALED：已处理
EVENT_IGNORE： 已忽略
EVENT_ADD_WHITE：已加白
     * @param EventStatus 事件状态
EVENT_UNDEAL： 待处理
EVENT_DEALED：已处理
EVENT_IGNORE： 已忽略
EVENT_ADD_WHITE：已加白
     */
    public void setEventStatus(String EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get 操作时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperationTime 操作时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set 操作时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperationTime 操作时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 节点类型 
     * @return NodeType 节点类型
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型
     * @param NodeType 节点类型
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
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
     * Get 节点子网ID 
     * @return NodeSubNetID 节点子网ID
     */
    public String getNodeSubNetID() {
        return this.NodeSubNetID;
    }

    /**
     * Set 节点子网ID
     * @param NodeSubNetID 节点子网ID
     */
    public void setNodeSubNetID(String NodeSubNetID) {
        this.NodeSubNetID = NodeSubNetID;
    }

    /**
     * Get 节点子网名称 
     * @return NodeSubNetName 节点子网名称
     */
    public String getNodeSubNetName() {
        return this.NodeSubNetName;
    }

    /**
     * Set 节点子网名称
     * @param NodeSubNetName 节点子网名称
     */
    public void setNodeSubNetName(String NodeSubNetName) {
        this.NodeSubNetName = NodeSubNetName;
    }

    /**
     * Get 节点子网网段 
     * @return NodeSubNetCIDR 节点子网网段
     */
    public String getNodeSubNetCIDR() {
        return this.NodeSubNetCIDR;
    }

    /**
     * Set 节点子网网段
     * @param NodeSubNetCIDR 节点子网网段
     */
    public void setNodeSubNetCIDR(String NodeSubNetCIDR) {
        this.NodeSubNetCIDR = NodeSubNetCIDR;
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
     * Get podip 
     * @return PodIP podip
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set podip
     * @param PodIP podip
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get pod状态 
     * @return PodStatus pod状态
     */
    public String getPodStatus() {
        return this.PodStatus;
    }

    /**
     * Set pod状态
     * @param PodStatus pod状态
     */
    public void setPodStatus(String PodStatus) {
        this.PodStatus = PodStatus;
    }

    /**
     * Get 节点唯一id 
     * @return NodeUniqueID 节点唯一id
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set 节点唯一id
     * @param NodeUniqueID 节点唯一id
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get 节点ID名称 
     * @return NodeID 节点ID名称
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set 节点ID名称
     * @param NodeID 节点ID名称
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
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
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeRiskDnsEventDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskDnsEventDetailResponse(DescribeRiskDnsEventDetailResponse source) {
        if (source.EventID != null) {
            this.EventID = new Long(source.EventID);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.FoundTime != null) {
            this.FoundTime = new String(source.FoundTime);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ContainerNetStatus != null) {
            this.ContainerNetStatus = new String(source.ContainerNetStatus);
        }
        if (source.ContainerStatus != null) {
            this.ContainerStatus = new String(source.ContainerStatus);
        }
        if (source.ContainerNetSubStatus != null) {
            this.ContainerNetSubStatus = new String(source.ContainerNetSubStatus);
        }
        if (source.ContainerIsolateOperationSrc != null) {
            this.ContainerIsolateOperationSrc = new String(source.ContainerIsolateOperationSrc);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
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
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Reference != null) {
            this.Reference = new String[source.Reference.length];
            for (int i = 0; i < source.Reference.length; i++) {
                this.Reference[i] = new String(source.Reference[i]);
            }
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.MatchRuleType != null) {
            this.MatchRuleType = new String(source.MatchRuleType);
        }
        if (source.FeatureLabel != null) {
            this.FeatureLabel = new String(source.FeatureLabel);
        }
        if (source.ProcessAuthority != null) {
            this.ProcessAuthority = new String(source.ProcessAuthority);
        }
        if (source.ProcessMd5 != null) {
            this.ProcessMd5 = new String(source.ProcessMd5);
        }
        if (source.ProcessStartUser != null) {
            this.ProcessStartUser = new String(source.ProcessStartUser);
        }
        if (source.ProcessUserGroup != null) {
            this.ProcessUserGroup = new String(source.ProcessUserGroup);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.ProcessTree != null) {
            this.ProcessTree = new String(source.ProcessTree);
        }
        if (source.ProcessParam != null) {
            this.ProcessParam = new String(source.ProcessParam);
        }
        if (source.ParentProcessStartUser != null) {
            this.ParentProcessStartUser = new String(source.ParentProcessStartUser);
        }
        if (source.ParentProcessUserGroup != null) {
            this.ParentProcessUserGroup = new String(source.ParentProcessUserGroup);
        }
        if (source.ParentProcessPath != null) {
            this.ParentProcessPath = new String(source.ParentProcessPath);
        }
        if (source.ParentProcessParam != null) {
            this.ParentProcessParam = new String(source.ParentProcessParam);
        }
        if (source.AncestorProcessStartUser != null) {
            this.AncestorProcessStartUser = new String(source.AncestorProcessStartUser);
        }
        if (source.AncestorProcessUserGroup != null) {
            this.AncestorProcessUserGroup = new String(source.AncestorProcessUserGroup);
        }
        if (source.AncestorProcessPath != null) {
            this.AncestorProcessPath = new String(source.AncestorProcessPath);
        }
        if (source.AncestorProcessParam != null) {
            this.AncestorProcessParam = new String(source.AncestorProcessParam);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.EventStatus != null) {
            this.EventStatus = new String(source.EventStatus);
        }
        if (source.OperationTime != null) {
            this.OperationTime = new String(source.OperationTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeSubNetID != null) {
            this.NodeSubNetID = new String(source.NodeSubNetID);
        }
        if (source.NodeSubNetName != null) {
            this.NodeSubNetName = new String(source.NodeSubNetName);
        }
        if (source.NodeSubNetCIDR != null) {
            this.NodeSubNetCIDR = new String(source.NodeSubNetCIDR);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodStatus != null) {
            this.PodStatus = new String(source.PodStatus);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventID", this.EventID);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamArraySimple(map, prefix + "Reference.", this.Reference);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "MatchRuleType", this.MatchRuleType);
        this.setParamSimple(map, prefix + "FeatureLabel", this.FeatureLabel);
        this.setParamSimple(map, prefix + "ProcessAuthority", this.ProcessAuthority);
        this.setParamSimple(map, prefix + "ProcessMd5", this.ProcessMd5);
        this.setParamSimple(map, prefix + "ProcessStartUser", this.ProcessStartUser);
        this.setParamSimple(map, prefix + "ProcessUserGroup", this.ProcessUserGroup);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "ProcessTree", this.ProcessTree);
        this.setParamSimple(map, prefix + "ProcessParam", this.ProcessParam);
        this.setParamSimple(map, prefix + "ParentProcessStartUser", this.ParentProcessStartUser);
        this.setParamSimple(map, prefix + "ParentProcessUserGroup", this.ParentProcessUserGroup);
        this.setParamSimple(map, prefix + "ParentProcessPath", this.ParentProcessPath);
        this.setParamSimple(map, prefix + "ParentProcessParam", this.ParentProcessParam);
        this.setParamSimple(map, prefix + "AncestorProcessStartUser", this.AncestorProcessStartUser);
        this.setParamSimple(map, prefix + "AncestorProcessUserGroup", this.AncestorProcessUserGroup);
        this.setParamSimple(map, prefix + "AncestorProcessPath", this.AncestorProcessPath);
        this.setParamSimple(map, prefix + "AncestorProcessParam", this.AncestorProcessParam);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeSubNetID", this.NodeSubNetID);
        this.setParamSimple(map, prefix + "NodeSubNetName", this.NodeSubNetName);
        this.setParamSimple(map, prefix + "NodeSubNetCIDR", this.NodeSubNetCIDR);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodStatus", this.PodStatus);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

