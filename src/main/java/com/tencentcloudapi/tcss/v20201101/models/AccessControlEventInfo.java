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

public class AccessControlEventInfo extends AbstractModel {

    /**
    * <p>进程名称</p>
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * <p>命中规则名称</p>
    */
    @SerializedName("MatchRuleName")
    @Expose
    private String MatchRuleName;

    /**
    * <p>生成时间</p>
    */
    @SerializedName("FoundTime")
    @Expose
    private String FoundTime;

    /**
    * <p>容器名</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>镜像名</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>动作执行结果，   BEHAVIOR_NONE: 无<br>    BEHAVIOR_ALERT: 告警<br>    BEHAVIOR_RELEASE：放行<br>    BEHAVIOR_HOLDUP_FAILED:拦截失败<br>    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败</p>
    */
    @SerializedName("Behavior")
    @Expose
    private String Behavior;

    /**
    * <p>状态0:未处理  “EVENT_UNDEAL”:事件未处理<br>    &quot;EVENT_DEALED&quot;:事件已经处理<br>    &quot;EVENT_INGNORE&quot;：事件已经忽略</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>事件记录的唯一id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>事件类型， FILE_ABNORMAL_READ:文件异常读取</p>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>镜像id, 用于跳转</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>容器id, 用于跳转</p>
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * <p>事件解决方案</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>事件详细描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>命中策略id</p>
    */
    @SerializedName("MatchRuleId")
    @Expose
    private String MatchRuleId;

    /**
    * <p>命中规则行为：<br>RULE_MODE_RELEASE 放行<br>RULE_MODE_ALERT  告警<br>RULE_MODE_HOLDUP 拦截</p>
    */
    @SerializedName("MatchAction")
    @Expose
    private String MatchAction;

    /**
    * <p>命中规则进程信息</p>
    */
    @SerializedName("MatchProcessPath")
    @Expose
    private String MatchProcessPath;

    /**
    * <p>命中规则文件信息</p>
    */
    @SerializedName("MatchFilePath")
    @Expose
    private String MatchFilePath;

    /**
    * <p>文件路径，包含名字</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * <p>规则是否存在</p>
    */
    @SerializedName("RuleExist")
    @Expose
    private Boolean RuleExist;

    /**
    * <p>事件数量</p>
    */
    @SerializedName("EventCount")
    @Expose
    private Long EventCount;

    /**
    * <p>最近生成时间</p>
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * <p>规则组id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>网络状态<br>未隔离      NORMAL<br>已隔离        ISOLATED<br>隔离中        ISOLATING<br>隔离失败    ISOLATE_FAILED<br>解除隔离中  RESTORING<br>解除隔离失败 RESTORE_FAILED</p>
    */
    @SerializedName("ContainerNetStatus")
    @Expose
    private String ContainerNetStatus;

    /**
    * <p>容器子状态<br>&quot;AGENT_OFFLINE&quot;       //Agent离线<br>&quot;NODE_DESTROYED&quot;      //节点已销毁<br>&quot;CONTAINER_EXITED&quot;    //容器已退出<br>&quot;CONTAINER_DESTROYED&quot; //容器已销毁<br>&quot;SHARED_HOST&quot;         // 容器与主机共享网络<br>&quot;RESOURCE_LIMIT&quot;      //隔离操作资源超限<br>&quot;UNKNOW&quot;              // 原因未知</p>
    */
    @SerializedName("ContainerNetSubStatus")
    @Expose
    private String ContainerNetSubStatus;

    /**
    * <p>容器隔离操作来源</p>
    */
    @SerializedName("ContainerIsolateOperationSrc")
    @Expose
    private String ContainerIsolateOperationSrc;

    /**
    * <p>容器状态<br>正在运行: RUNNING<br>暂停: PAUSED<br>停止: STOPPED<br>已经创建: CREATED<br>已经销毁: DESTROYED<br>正在重启中: RESTARTING<br>迁移中: REMOVING</p>
    */
    @SerializedName("ContainerStatus")
    @Expose
    private String ContainerStatus;

    /**
    * <p>节点名称：如果是超级节点，展示的实质上是它的node_id</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>pod名称</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>pod ip</p>
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * <p>节点类型：NORMAL普通节点、SUPER超级节点</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>集群id</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>节点的唯一id，主要是超级节点使用</p>
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * <p>节点公网IP</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>节点id</p>
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * <p>uuid</p>
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * <p>节点内网ip</p>
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>命令行参数</p>
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
     * Get <p>进程名称</p> 
     * @return ProcessName <p>进程名称</p>
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set <p>进程名称</p>
     * @param ProcessName <p>进程名称</p>
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get <p>命中规则名称</p> 
     * @return MatchRuleName <p>命中规则名称</p>
     */
    public String getMatchRuleName() {
        return this.MatchRuleName;
    }

    /**
     * Set <p>命中规则名称</p>
     * @param MatchRuleName <p>命中规则名称</p>
     */
    public void setMatchRuleName(String MatchRuleName) {
        this.MatchRuleName = MatchRuleName;
    }

    /**
     * Get <p>生成时间</p> 
     * @return FoundTime <p>生成时间</p>
     */
    public String getFoundTime() {
        return this.FoundTime;
    }

    /**
     * Set <p>生成时间</p>
     * @param FoundTime <p>生成时间</p>
     */
    public void setFoundTime(String FoundTime) {
        this.FoundTime = FoundTime;
    }

    /**
     * Get <p>容器名</p> 
     * @return ContainerName <p>容器名</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>容器名</p>
     * @param ContainerName <p>容器名</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>镜像名</p> 
     * @return ImageName <p>镜像名</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>镜像名</p>
     * @param ImageName <p>镜像名</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>动作执行结果，   BEHAVIOR_NONE: 无<br>    BEHAVIOR_ALERT: 告警<br>    BEHAVIOR_RELEASE：放行<br>    BEHAVIOR_HOLDUP_FAILED:拦截失败<br>    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败</p> 
     * @return Behavior <p>动作执行结果，   BEHAVIOR_NONE: 无<br>    BEHAVIOR_ALERT: 告警<br>    BEHAVIOR_RELEASE：放行<br>    BEHAVIOR_HOLDUP_FAILED:拦截失败<br>    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败</p>
     */
    public String getBehavior() {
        return this.Behavior;
    }

    /**
     * Set <p>动作执行结果，   BEHAVIOR_NONE: 无<br>    BEHAVIOR_ALERT: 告警<br>    BEHAVIOR_RELEASE：放行<br>    BEHAVIOR_HOLDUP_FAILED:拦截失败<br>    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败</p>
     * @param Behavior <p>动作执行结果，   BEHAVIOR_NONE: 无<br>    BEHAVIOR_ALERT: 告警<br>    BEHAVIOR_RELEASE：放行<br>    BEHAVIOR_HOLDUP_FAILED:拦截失败<br>    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败</p>
     */
    public void setBehavior(String Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get <p>状态0:未处理  “EVENT_UNDEAL”:事件未处理<br>    &quot;EVENT_DEALED&quot;:事件已经处理<br>    &quot;EVENT_INGNORE&quot;：事件已经忽略</p> 
     * @return Status <p>状态0:未处理  “EVENT_UNDEAL”:事件未处理<br>    &quot;EVENT_DEALED&quot;:事件已经处理<br>    &quot;EVENT_INGNORE&quot;：事件已经忽略</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态0:未处理  “EVENT_UNDEAL”:事件未处理<br>    &quot;EVENT_DEALED&quot;:事件已经处理<br>    &quot;EVENT_INGNORE&quot;：事件已经忽略</p>
     * @param Status <p>状态0:未处理  “EVENT_UNDEAL”:事件未处理<br>    &quot;EVENT_DEALED&quot;:事件已经处理<br>    &quot;EVENT_INGNORE&quot;：事件已经忽略</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>事件记录的唯一id</p> 
     * @return Id <p>事件记录的唯一id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>事件记录的唯一id</p>
     * @param Id <p>事件记录的唯一id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>文件名称</p> 
     * @return FileName <p>文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名称</p>
     * @param FileName <p>文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>事件类型， FILE_ABNORMAL_READ:文件异常读取</p> 
     * @return EventType <p>事件类型， FILE_ABNORMAL_READ:文件异常读取</p>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>事件类型， FILE_ABNORMAL_READ:文件异常读取</p>
     * @param EventType <p>事件类型， FILE_ABNORMAL_READ:文件异常读取</p>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>镜像id, 用于跳转</p> 
     * @return ImageId <p>镜像id, 用于跳转</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>镜像id, 用于跳转</p>
     * @param ImageId <p>镜像id, 用于跳转</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>容器id, 用于跳转</p> 
     * @return ContainerId <p>容器id, 用于跳转</p>
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set <p>容器id, 用于跳转</p>
     * @param ContainerId <p>容器id, 用于跳转</p>
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get <p>事件解决方案</p> 
     * @return Solution <p>事件解决方案</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>事件解决方案</p>
     * @param Solution <p>事件解决方案</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>事件详细描述</p> 
     * @return Description <p>事件详细描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>事件详细描述</p>
     * @param Description <p>事件详细描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>命中策略id</p> 
     * @return MatchRuleId <p>命中策略id</p>
     */
    public String getMatchRuleId() {
        return this.MatchRuleId;
    }

    /**
     * Set <p>命中策略id</p>
     * @param MatchRuleId <p>命中策略id</p>
     */
    public void setMatchRuleId(String MatchRuleId) {
        this.MatchRuleId = MatchRuleId;
    }

    /**
     * Get <p>命中规则行为：<br>RULE_MODE_RELEASE 放行<br>RULE_MODE_ALERT  告警<br>RULE_MODE_HOLDUP 拦截</p> 
     * @return MatchAction <p>命中规则行为：<br>RULE_MODE_RELEASE 放行<br>RULE_MODE_ALERT  告警<br>RULE_MODE_HOLDUP 拦截</p>
     */
    public String getMatchAction() {
        return this.MatchAction;
    }

    /**
     * Set <p>命中规则行为：<br>RULE_MODE_RELEASE 放行<br>RULE_MODE_ALERT  告警<br>RULE_MODE_HOLDUP 拦截</p>
     * @param MatchAction <p>命中规则行为：<br>RULE_MODE_RELEASE 放行<br>RULE_MODE_ALERT  告警<br>RULE_MODE_HOLDUP 拦截</p>
     */
    public void setMatchAction(String MatchAction) {
        this.MatchAction = MatchAction;
    }

    /**
     * Get <p>命中规则进程信息</p> 
     * @return MatchProcessPath <p>命中规则进程信息</p>
     */
    public String getMatchProcessPath() {
        return this.MatchProcessPath;
    }

    /**
     * Set <p>命中规则进程信息</p>
     * @param MatchProcessPath <p>命中规则进程信息</p>
     */
    public void setMatchProcessPath(String MatchProcessPath) {
        this.MatchProcessPath = MatchProcessPath;
    }

    /**
     * Get <p>命中规则文件信息</p> 
     * @return MatchFilePath <p>命中规则文件信息</p>
     */
    public String getMatchFilePath() {
        return this.MatchFilePath;
    }

    /**
     * Set <p>命中规则文件信息</p>
     * @param MatchFilePath <p>命中规则文件信息</p>
     */
    public void setMatchFilePath(String MatchFilePath) {
        this.MatchFilePath = MatchFilePath;
    }

    /**
     * Get <p>文件路径，包含名字</p> 
     * @return FilePath <p>文件路径，包含名字</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>文件路径，包含名字</p>
     * @param FilePath <p>文件路径，包含名字</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get <p>规则是否存在</p> 
     * @return RuleExist <p>规则是否存在</p>
     */
    public Boolean getRuleExist() {
        return this.RuleExist;
    }

    /**
     * Set <p>规则是否存在</p>
     * @param RuleExist <p>规则是否存在</p>
     */
    public void setRuleExist(Boolean RuleExist) {
        this.RuleExist = RuleExist;
    }

    /**
     * Get <p>事件数量</p> 
     * @return EventCount <p>事件数量</p>
     */
    public Long getEventCount() {
        return this.EventCount;
    }

    /**
     * Set <p>事件数量</p>
     * @param EventCount <p>事件数量</p>
     */
    public void setEventCount(Long EventCount) {
        this.EventCount = EventCount;
    }

    /**
     * Get <p>最近生成时间</p> 
     * @return LatestFoundTime <p>最近生成时间</p>
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set <p>最近生成时间</p>
     * @param LatestFoundTime <p>最近生成时间</p>
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get <p>规则组id</p> 
     * @return RuleId <p>规则组id</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则组id</p>
     * @param RuleId <p>规则组id</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>网络状态<br>未隔离      NORMAL<br>已隔离        ISOLATED<br>隔离中        ISOLATING<br>隔离失败    ISOLATE_FAILED<br>解除隔离中  RESTORING<br>解除隔离失败 RESTORE_FAILED</p> 
     * @return ContainerNetStatus <p>网络状态<br>未隔离      NORMAL<br>已隔离        ISOLATED<br>隔离中        ISOLATING<br>隔离失败    ISOLATE_FAILED<br>解除隔离中  RESTORING<br>解除隔离失败 RESTORE_FAILED</p>
     */
    public String getContainerNetStatus() {
        return this.ContainerNetStatus;
    }

    /**
     * Set <p>网络状态<br>未隔离      NORMAL<br>已隔离        ISOLATED<br>隔离中        ISOLATING<br>隔离失败    ISOLATE_FAILED<br>解除隔离中  RESTORING<br>解除隔离失败 RESTORE_FAILED</p>
     * @param ContainerNetStatus <p>网络状态<br>未隔离      NORMAL<br>已隔离        ISOLATED<br>隔离中        ISOLATING<br>隔离失败    ISOLATE_FAILED<br>解除隔离中  RESTORING<br>解除隔离失败 RESTORE_FAILED</p>
     */
    public void setContainerNetStatus(String ContainerNetStatus) {
        this.ContainerNetStatus = ContainerNetStatus;
    }

    /**
     * Get <p>容器子状态<br>&quot;AGENT_OFFLINE&quot;       //Agent离线<br>&quot;NODE_DESTROYED&quot;      //节点已销毁<br>&quot;CONTAINER_EXITED&quot;    //容器已退出<br>&quot;CONTAINER_DESTROYED&quot; //容器已销毁<br>&quot;SHARED_HOST&quot;         // 容器与主机共享网络<br>&quot;RESOURCE_LIMIT&quot;      //隔离操作资源超限<br>&quot;UNKNOW&quot;              // 原因未知</p> 
     * @return ContainerNetSubStatus <p>容器子状态<br>&quot;AGENT_OFFLINE&quot;       //Agent离线<br>&quot;NODE_DESTROYED&quot;      //节点已销毁<br>&quot;CONTAINER_EXITED&quot;    //容器已退出<br>&quot;CONTAINER_DESTROYED&quot; //容器已销毁<br>&quot;SHARED_HOST&quot;         // 容器与主机共享网络<br>&quot;RESOURCE_LIMIT&quot;      //隔离操作资源超限<br>&quot;UNKNOW&quot;              // 原因未知</p>
     */
    public String getContainerNetSubStatus() {
        return this.ContainerNetSubStatus;
    }

    /**
     * Set <p>容器子状态<br>&quot;AGENT_OFFLINE&quot;       //Agent离线<br>&quot;NODE_DESTROYED&quot;      //节点已销毁<br>&quot;CONTAINER_EXITED&quot;    //容器已退出<br>&quot;CONTAINER_DESTROYED&quot; //容器已销毁<br>&quot;SHARED_HOST&quot;         // 容器与主机共享网络<br>&quot;RESOURCE_LIMIT&quot;      //隔离操作资源超限<br>&quot;UNKNOW&quot;              // 原因未知</p>
     * @param ContainerNetSubStatus <p>容器子状态<br>&quot;AGENT_OFFLINE&quot;       //Agent离线<br>&quot;NODE_DESTROYED&quot;      //节点已销毁<br>&quot;CONTAINER_EXITED&quot;    //容器已退出<br>&quot;CONTAINER_DESTROYED&quot; //容器已销毁<br>&quot;SHARED_HOST&quot;         // 容器与主机共享网络<br>&quot;RESOURCE_LIMIT&quot;      //隔离操作资源超限<br>&quot;UNKNOW&quot;              // 原因未知</p>
     */
    public void setContainerNetSubStatus(String ContainerNetSubStatus) {
        this.ContainerNetSubStatus = ContainerNetSubStatus;
    }

    /**
     * Get <p>容器隔离操作来源</p> 
     * @return ContainerIsolateOperationSrc <p>容器隔离操作来源</p>
     */
    public String getContainerIsolateOperationSrc() {
        return this.ContainerIsolateOperationSrc;
    }

    /**
     * Set <p>容器隔离操作来源</p>
     * @param ContainerIsolateOperationSrc <p>容器隔离操作来源</p>
     */
    public void setContainerIsolateOperationSrc(String ContainerIsolateOperationSrc) {
        this.ContainerIsolateOperationSrc = ContainerIsolateOperationSrc;
    }

    /**
     * Get <p>容器状态<br>正在运行: RUNNING<br>暂停: PAUSED<br>停止: STOPPED<br>已经创建: CREATED<br>已经销毁: DESTROYED<br>正在重启中: RESTARTING<br>迁移中: REMOVING</p> 
     * @return ContainerStatus <p>容器状态<br>正在运行: RUNNING<br>暂停: PAUSED<br>停止: STOPPED<br>已经创建: CREATED<br>已经销毁: DESTROYED<br>正在重启中: RESTARTING<br>迁移中: REMOVING</p>
     */
    public String getContainerStatus() {
        return this.ContainerStatus;
    }

    /**
     * Set <p>容器状态<br>正在运行: RUNNING<br>暂停: PAUSED<br>停止: STOPPED<br>已经创建: CREATED<br>已经销毁: DESTROYED<br>正在重启中: RESTARTING<br>迁移中: REMOVING</p>
     * @param ContainerStatus <p>容器状态<br>正在运行: RUNNING<br>暂停: PAUSED<br>停止: STOPPED<br>已经创建: CREATED<br>已经销毁: DESTROYED<br>正在重启中: RESTARTING<br>迁移中: REMOVING</p>
     */
    public void setContainerStatus(String ContainerStatus) {
        this.ContainerStatus = ContainerStatus;
    }

    /**
     * Get <p>节点名称：如果是超级节点，展示的实质上是它的node_id</p> 
     * @return NodeName <p>节点名称：如果是超级节点，展示的实质上是它的node_id</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>节点名称：如果是超级节点，展示的实质上是它的node_id</p>
     * @param NodeName <p>节点名称：如果是超级节点，展示的实质上是它的node_id</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>pod名称</p> 
     * @return PodName <p>pod名称</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>pod名称</p>
     * @param PodName <p>pod名称</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>pod ip</p> 
     * @return PodIP <p>pod ip</p>
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set <p>pod ip</p>
     * @param PodIP <p>pod ip</p>
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get <p>节点类型：NORMAL普通节点、SUPER超级节点</p> 
     * @return NodeType <p>节点类型：NORMAL普通节点、SUPER超级节点</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型：NORMAL普通节点、SUPER超级节点</p>
     * @param NodeType <p>节点类型：NORMAL普通节点、SUPER超级节点</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>集群id</p> 
     * @return ClusterID <p>集群id</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>集群id</p>
     * @param ClusterID <p>集群id</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>节点的唯一id，主要是超级节点使用</p> 
     * @return NodeUniqueID <p>节点的唯一id，主要是超级节点使用</p>
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set <p>节点的唯一id，主要是超级节点使用</p>
     * @param NodeUniqueID <p>节点的唯一id，主要是超级节点使用</p>
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get <p>节点公网IP</p> 
     * @return PublicIP <p>节点公网IP</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>节点公网IP</p>
     * @param PublicIP <p>节点公网IP</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>节点id</p> 
     * @return NodeID <p>节点id</p>
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set <p>节点id</p>
     * @param NodeID <p>节点id</p>
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get <p>uuid</p> 
     * @return HostID <p>uuid</p>
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set <p>uuid</p>
     * @param HostID <p>uuid</p>
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get <p>节点内网ip</p> 
     * @return HostIP <p>节点内网ip</p>
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set <p>节点内网ip</p>
     * @param HostIP <p>节点内网ip</p>
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>命令行参数</p> 
     * @return CmdLine <p>命令行参数</p>
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set <p>命令行参数</p>
     * @param CmdLine <p>命令行参数</p>
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    public AccessControlEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessControlEventInfo(AccessControlEventInfo source) {
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
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
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
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
        if (source.MatchFilePath != null) {
            this.MatchFilePath = new String(source.MatchFilePath);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
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
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
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
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "MatchRuleName", this.MatchRuleName);
        this.setParamSimple(map, prefix + "FoundTime", this.FoundTime);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MatchRuleId", this.MatchRuleId);
        this.setParamSimple(map, prefix + "MatchAction", this.MatchAction);
        this.setParamSimple(map, prefix + "MatchProcessPath", this.MatchProcessPath);
        this.setParamSimple(map, prefix + "MatchFilePath", this.MatchFilePath);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "RuleExist", this.RuleExist);
        this.setParamSimple(map, prefix + "EventCount", this.EventCount);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ContainerNetStatus", this.ContainerNetStatus);
        this.setParamSimple(map, prefix + "ContainerNetSubStatus", this.ContainerNetSubStatus);
        this.setParamSimple(map, prefix + "ContainerIsolateOperationSrc", this.ContainerIsolateOperationSrc);
        this.setParamSimple(map, prefix + "ContainerStatus", this.ContainerStatus);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);

    }
}

