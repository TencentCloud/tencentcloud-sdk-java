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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalProcessEventInfo extends AbstractModel {

    /**
    * 进程目录
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 事件类型，MALICE_PROCESS_START:恶意进程启动
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 命中规则名称，PROXY_TOOL：代理软件，TRANSFER_CONTROL：横向渗透，ATTACK_CMD：恶意命令，REVERSE_SHELL：反弹shell，FILELESS：无文件程序执行，RISK_CMD：高危命令，ABNORMAL_CHILD_PROC：敏感服务异常子进程启动，USER_DEFINED_RULE：用户自定义规则
    */
    @SerializedName("MatchRuleName")
    @Expose
    private String MatchRuleName;

    /**
    * 生成时间
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * 容器名
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 镜像名
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 动作执行结果，    BEHAVIOR_NONE: 无
    BEHAVIOR_ALERT: 告警
    BEHAVIOR_RELEASE：放行
    BEHAVIOR_HOLDUP_FAILED:拦截失败
    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败
    */
    @SerializedName("Behavior")
    @Expose
    private String Behavior;

    /**
    * 状态，EVENT_UNDEAL:事件未处理
    EVENT_DEALED:事件已经处理
    EVENT_INGNORE：事件已经忽略
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 事件记录的唯一id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 镜像id，用于跳转
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 容器id，用于跳转
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 事件解决方案
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 事件详细描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 命中策略id
    */
    @SerializedName("MatchRuleId")
    @Expose
    private String MatchRuleId;

    /**
    * 命中规则行为：
RULE_MODE_RELEASE 放行
RULE_MODE_ALERT  告警
RULE_MODE_HOLDUP 拦截
    */
    @SerializedName("MatchAction")
    @Expose
    private String MatchAction;

    /**
    * 命中规则进程信息
    */
    @SerializedName("MatchProcessPath")
    @Expose
    private String MatchProcessPath;

    /**
    * 规则是否存在
    */
    @SerializedName("RuleExist")
    @Expose
    private Boolean RuleExist;

    /**
    * 事件数量
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * 最近生成时间
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * 规则组Id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 命中策略名称：SYSTEM_DEFINED_RULE （系统策略）或  用户自定义的策略名字
    */
    @SerializedName("MatchGroupName")
    @Expose
    private String MatchGroupName;

    /**
    * 命中规则等级，HIGH：高危，MIDDLE：中危，LOW：低危。
    */
    @SerializedName("MatchRuleLevel")
    @Expose
    private String MatchRuleLevel;

    /**
    * 网络状态
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
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 节点类型：NORMAL普通节点、SUPER超级节点
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * pod 名称
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * pod ip
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * 集群id
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * 节点公网ip
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点id
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * uuid
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * 节点内网ip
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get 进程目录 
     * @return ProcessPath 进程目录
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 进程目录
     * @param ProcessPath 进程目录
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get 事件类型，MALICE_PROCESS_START:恶意进程启动 
     * @return EventType 事件类型，MALICE_PROCESS_START:恶意进程启动
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型，MALICE_PROCESS_START:恶意进程启动
     * @param EventType 事件类型，MALICE_PROCESS_START:恶意进程启动
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 命中规则名称，PROXY_TOOL：代理软件，TRANSFER_CONTROL：横向渗透，ATTACK_CMD：恶意命令，REVERSE_SHELL：反弹shell，FILELESS：无文件程序执行，RISK_CMD：高危命令，ABNORMAL_CHILD_PROC：敏感服务异常子进程启动，USER_DEFINED_RULE：用户自定义规则 
     * @return MatchRuleName 命中规则名称，PROXY_TOOL：代理软件，TRANSFER_CONTROL：横向渗透，ATTACK_CMD：恶意命令，REVERSE_SHELL：反弹shell，FILELESS：无文件程序执行，RISK_CMD：高危命令，ABNORMAL_CHILD_PROC：敏感服务异常子进程启动，USER_DEFINED_RULE：用户自定义规则
     */
    public String getMatchRuleName() {
        return this.MatchRuleName;
    }

    /**
     * Set 命中规则名称，PROXY_TOOL：代理软件，TRANSFER_CONTROL：横向渗透，ATTACK_CMD：恶意命令，REVERSE_SHELL：反弹shell，FILELESS：无文件程序执行，RISK_CMD：高危命令，ABNORMAL_CHILD_PROC：敏感服务异常子进程启动，USER_DEFINED_RULE：用户自定义规则
     * @param MatchRuleName 命中规则名称，PROXY_TOOL：代理软件，TRANSFER_CONTROL：横向渗透，ATTACK_CMD：恶意命令，REVERSE_SHELL：反弹shell，FILELESS：无文件程序执行，RISK_CMD：高危命令，ABNORMAL_CHILD_PROC：敏感服务异常子进程启动，USER_DEFINED_RULE：用户自定义规则
     */
    public void setMatchRuleName(String MatchRuleName) {
        this.MatchRuleName = MatchRuleName;
    }

    /**
     * Get 生成时间 
     * @return FoundTime 生成时间
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set 生成时间
     * @param FoundTime 生成时间
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get 容器名 
     * @return ContainerName 容器名
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名
     * @param ContainerName 容器名
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get 镜像名 
     * @return ImageName 镜像名
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名
     * @param ImageName 镜像名
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 动作执行结果，    BEHAVIOR_NONE: 无
    BEHAVIOR_ALERT: 告警
    BEHAVIOR_RELEASE：放行
    BEHAVIOR_HOLDUP_FAILED:拦截失败
    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败 
     * @return Behavior 动作执行结果，    BEHAVIOR_NONE: 无
    BEHAVIOR_ALERT: 告警
    BEHAVIOR_RELEASE：放行
    BEHAVIOR_HOLDUP_FAILED:拦截失败
    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败
     */
    public String getBehavior() {
        return this.Behavior;
    }

    /**
     * Set 动作执行结果，    BEHAVIOR_NONE: 无
    BEHAVIOR_ALERT: 告警
    BEHAVIOR_RELEASE：放行
    BEHAVIOR_HOLDUP_FAILED:拦截失败
    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败
     * @param Behavior 动作执行结果，    BEHAVIOR_NONE: 无
    BEHAVIOR_ALERT: 告警
    BEHAVIOR_RELEASE：放行
    BEHAVIOR_HOLDUP_FAILED:拦截失败
    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败
     */
    public void setBehavior(String Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get 状态，EVENT_UNDEAL:事件未处理
    EVENT_DEALED:事件已经处理
    EVENT_INGNORE：事件已经忽略 
     * @return Status 状态，EVENT_UNDEAL:事件未处理
    EVENT_DEALED:事件已经处理
    EVENT_INGNORE：事件已经忽略
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，EVENT_UNDEAL:事件未处理
    EVENT_DEALED:事件已经处理
    EVENT_INGNORE：事件已经忽略
     * @param Status 状态，EVENT_UNDEAL:事件未处理
    EVENT_DEALED:事件已经处理
    EVENT_INGNORE：事件已经忽略
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 事件记录的唯一id 
     * @return Id 事件记录的唯一id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 事件记录的唯一id
     * @param Id 事件记录的唯一id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 镜像id，用于跳转 
     * @return ImageId 镜像id，用于跳转
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id，用于跳转
     * @param ImageId 镜像id，用于跳转
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 容器id，用于跳转 
     * @return ContainerId 容器id，用于跳转
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器id，用于跳转
     * @param ContainerId 容器id，用于跳转
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 事件解决方案 
     * @return Solution 事件解决方案
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 事件解决方案
     * @param Solution 事件解决方案
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get 事件详细描述 
     * @return Description 事件详细描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件详细描述
     * @param Description 事件详细描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 命中策略id 
     * @return MatchRuleId 命中策略id
     */
    public String getMatchRuleId() {
        return this.MatchRuleId;
    }

    /**
     * Set 命中策略id
     * @param MatchRuleId 命中策略id
     */
    public void setMatchRuleId(String MatchRuleId) {
        this.MatchRuleId = MatchRuleId;
    }

    /**
     * Get 命中规则行为：
RULE_MODE_RELEASE 放行
RULE_MODE_ALERT  告警
RULE_MODE_HOLDUP 拦截 
     * @return MatchAction 命中规则行为：
RULE_MODE_RELEASE 放行
RULE_MODE_ALERT  告警
RULE_MODE_HOLDUP 拦截
     */
    public String getMatchAction() {
        return this.MatchAction;
    }

    /**
     * Set 命中规则行为：
RULE_MODE_RELEASE 放行
RULE_MODE_ALERT  告警
RULE_MODE_HOLDUP 拦截
     * @param MatchAction 命中规则行为：
RULE_MODE_RELEASE 放行
RULE_MODE_ALERT  告警
RULE_MODE_HOLDUP 拦截
     */
    public void setMatchAction(String MatchAction) {
        this.MatchAction = MatchAction;
    }

    /**
     * Get 命中规则进程信息 
     * @return MatchProcessPath 命中规则进程信息
     */
    public String getMatchProcessPath() {
        return this.MatchProcessPath;
    }

    /**
     * Set 命中规则进程信息
     * @param MatchProcessPath 命中规则进程信息
     */
    public void setMatchProcessPath(String MatchProcessPath) {
        this.MatchProcessPath = MatchProcessPath;
    }

    /**
     * Get 规则是否存在 
     * @return RuleExist 规则是否存在
     */
    public Boolean getRuleExist() {
        return this.RuleExist;
    }

    /**
     * Set 规则是否存在
     * @param RuleExist 规则是否存在
     */
    public void setRuleExist(Boolean RuleExist) {
        this.RuleExist = RuleExist;
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
     * Get 规则组Id 
     * @return RuleId 规则组Id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则组Id
     * @param RuleId 规则组Id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 命中策略名称：SYSTEM_DEFINED_RULE （系统策略）或  用户自定义的策略名字 
     * @return MatchGroupName 命中策略名称：SYSTEM_DEFINED_RULE （系统策略）或  用户自定义的策略名字
     */
    public String getMatchGroupName() {
        return this.MatchGroupName;
    }

    /**
     * Set 命中策略名称：SYSTEM_DEFINED_RULE （系统策略）或  用户自定义的策略名字
     * @param MatchGroupName 命中策略名称：SYSTEM_DEFINED_RULE （系统策略）或  用户自定义的策略名字
     */
    public void setMatchGroupName(String MatchGroupName) {
        this.MatchGroupName = MatchGroupName;
    }

    /**
     * Get 命中规则等级，HIGH：高危，MIDDLE：中危，LOW：低危。 
     * @return MatchRuleLevel 命中规则等级，HIGH：高危，MIDDLE：中危，LOW：低危。
     */
    public String getMatchRuleLevel() {
        return this.MatchRuleLevel;
    }

    /**
     * Set 命中规则等级，HIGH：高危，MIDDLE：中危，LOW：低危。
     * @param MatchRuleLevel 命中规则等级，HIGH：高危，MIDDLE：中危，LOW：低危。
     */
    public void setMatchRuleLevel(String MatchRuleLevel) {
        this.MatchRuleLevel = MatchRuleLevel;
    }

    /**
     * Get 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED 
     * @return ContainerNetStatus 网络状态
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
     * Set 网络状态
未隔离  	NORMAL
已隔离		ISOLATED
隔离中		ISOLATING
隔离失败	ISOLATE_FAILED
解除隔离中  RESTORING
解除隔离失败 RESTORE_FAILED
     * @param ContainerNetStatus 网络状态
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
     * Get 节点类型：NORMAL普通节点、SUPER超级节点 
     * @return NodeType 节点类型：NORMAL普通节点、SUPER超级节点
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型：NORMAL普通节点、SUPER超级节点
     * @param NodeType 节点类型：NORMAL普通节点、SUPER超级节点
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get pod 名称 
     * @return PodName pod 名称
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set pod 名称
     * @param PodName pod 名称
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
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
     * Get 集群id 
     * @return NodeUniqueID 集群id
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set 集群id
     * @param NodeUniqueID 集群id
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get 节点公网ip 
     * @return PublicIP 节点公网ip
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set 节点公网ip
     * @param PublicIP 节点公网ip
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
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
     * @return NodeID 节点id
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set 节点id
     * @param NodeID 节点id
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get uuid 
     * @return HostID uuid
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set uuid
     * @param HostID uuid
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get 节点内网ip 
     * @return HostIP 节点内网ip
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set 节点内网ip
     * @param HostIP 节点内网ip
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
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

    public AbnormalProcessEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalProcessEventInfo(AbnormalProcessEventInfo source) {
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.MatchRuleName != null) {
            this.MatchRuleName = new String(source.MatchRuleName);
        }
        if (source.FoundTime != null) {
            this.FoundTime = new String(source.FoundTime);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Behavior != null) {
            this.Behavior = new String(source.Behavior);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MatchRuleId != null) {
            this.MatchRuleId = new String(source.MatchRuleId);
        }
        if (source.MatchAction != null) {
            this.MatchAction = new String(source.MatchAction);
        }
        if (source.MatchProcessPath != null) {
            this.MatchProcessPath = new String(source.MatchProcessPath);
        }
        if (source.RuleExist != null) {
            this.RuleExist = new Boolean(source.RuleExist);
        }
        if (source.EventCount != null) {
            this.EventCount = new Long(source.EventCount);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.MatchGroupName != null) {
            this.MatchGroupName = new String(source.MatchGroupName);
        }
        if (source.MatchRuleLevel != null) {
            this.MatchRuleLevel = new String(source.MatchRuleLevel);
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
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "MatchRuleName", this.MatchRuleName);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MatchRuleId", this.MatchRuleId);
        this.setParamSimple(map, prefix + "MatchAction", this.MatchAction);
        this.setParamSimple(map, prefix + "MatchProcessPath", this.MatchProcessPath);
        this.setParamSimple(map, prefix + "RuleExist", this.RuleExist);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "MatchGroupName", this.MatchGroupName);
        this.setParamSimple(map, prefix + "MatchRuleLevel", this.MatchRuleLevel);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

