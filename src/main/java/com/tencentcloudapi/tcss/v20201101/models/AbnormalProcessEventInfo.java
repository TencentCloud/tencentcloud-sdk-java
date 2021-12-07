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

public class AbnormalProcessEventInfo extends AbstractModel{

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
    * 命中规则
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
     * Get 命中规则 
     * @return MatchRuleName 命中规则
     */
    public String getMatchRuleName() {
        return this.MatchRuleName;
    }

    /**
     * Set 命中规则
     * @param MatchRuleName 命中规则
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

    }
}

