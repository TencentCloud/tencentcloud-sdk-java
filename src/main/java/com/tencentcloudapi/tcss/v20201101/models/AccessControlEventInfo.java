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

public class AccessControlEventInfo extends AbstractModel{

    /**
    * 进程名称
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 命中规则名称
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
    * 动作执行结果，   BEHAVIOR_NONE: 无
    BEHAVIOR_ALERT: 告警
    BEHAVIOR_RELEASE：放行
    BEHAVIOR_HOLDUP_FAILED:拦截失败
    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败
    */
    @SerializedName("Behavior")
    @Expose
    private String Behavior;

    /**
    * 状态0:未处理  “EVENT_UNDEAL”:事件未处理
    "EVENT_DEALED":事件已经处理
    "EVENT_INGNORE"：事件已经忽略
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
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 事件类型， FILE_ABNORMAL_READ:文件异常读取
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 镜像id, 用于跳转
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 容器id, 用于跳转
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
    * 命中规则文件信息
    */
    @SerializedName("MatchFilePath")
    @Expose
    private String MatchFilePath;

    /**
    * 文件路径，包含名字
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

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
    * 规则组id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

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
     * Get 命中规则名称 
     * @return MatchRuleName 命中规则名称
     */
    public String getMatchRuleName() {
        return this.MatchRuleName;
    }

    /**
     * Set 命中规则名称
     * @param MatchRuleName 命中规则名称
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
     * Get 动作执行结果，   BEHAVIOR_NONE: 无
    BEHAVIOR_ALERT: 告警
    BEHAVIOR_RELEASE：放行
    BEHAVIOR_HOLDUP_FAILED:拦截失败
    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败 
     * @return Behavior 动作执行结果，   BEHAVIOR_NONE: 无
    BEHAVIOR_ALERT: 告警
    BEHAVIOR_RELEASE：放行
    BEHAVIOR_HOLDUP_FAILED:拦截失败
    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败
     */
    public String getBehavior() {
        return this.Behavior;
    }

    /**
     * Set 动作执行结果，   BEHAVIOR_NONE: 无
    BEHAVIOR_ALERT: 告警
    BEHAVIOR_RELEASE：放行
    BEHAVIOR_HOLDUP_FAILED:拦截失败
    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败
     * @param Behavior 动作执行结果，   BEHAVIOR_NONE: 无
    BEHAVIOR_ALERT: 告警
    BEHAVIOR_RELEASE：放行
    BEHAVIOR_HOLDUP_FAILED:拦截失败
    BEHAVIOR_HOLDUP_SUCCESSED：拦截失败
     */
    public void setBehavior(String Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get 状态0:未处理  “EVENT_UNDEAL”:事件未处理
    "EVENT_DEALED":事件已经处理
    "EVENT_INGNORE"：事件已经忽略 
     * @return Status 状态0:未处理  “EVENT_UNDEAL”:事件未处理
    "EVENT_DEALED":事件已经处理
    "EVENT_INGNORE"：事件已经忽略
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态0:未处理  “EVENT_UNDEAL”:事件未处理
    "EVENT_DEALED":事件已经处理
    "EVENT_INGNORE"：事件已经忽略
     * @param Status 状态0:未处理  “EVENT_UNDEAL”:事件未处理
    "EVENT_DEALED":事件已经处理
    "EVENT_INGNORE"：事件已经忽略
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
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 事件类型， FILE_ABNORMAL_READ:文件异常读取 
     * @return EventType 事件类型， FILE_ABNORMAL_READ:文件异常读取
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型， FILE_ABNORMAL_READ:文件异常读取
     * @param EventType 事件类型， FILE_ABNORMAL_READ:文件异常读取
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 镜像id, 用于跳转 
     * @return ImageId 镜像id, 用于跳转
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id, 用于跳转
     * @param ImageId 镜像id, 用于跳转
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 容器id, 用于跳转 
     * @return ContainerId 容器id, 用于跳转
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器id, 用于跳转
     * @param ContainerId 容器id, 用于跳转
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
     * Get 命中规则文件信息 
     * @return MatchFilePath 命中规则文件信息
     */
    public String getMatchFilePath() {
        return this.MatchFilePath;
    }

    /**
     * Set 命中规则文件信息
     * @param MatchFilePath 命中规则文件信息
     */
    public void setMatchFilePath(String MatchFilePath) {
        this.MatchFilePath = MatchFilePath;
    }

    /**
     * Get 文件路径，包含名字 
     * @return FilePath 文件路径，包含名字
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件路径，包含名字
     * @param FilePath 文件路径，包含名字
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
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
     * Get 规则组id 
     * @return RuleId 规则组id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则组id
     * @param RuleId 规则组id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
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

    }
}

