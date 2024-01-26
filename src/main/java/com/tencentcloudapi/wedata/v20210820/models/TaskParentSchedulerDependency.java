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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskParentSchedulerDependency extends AbstractModel {

    /**
    * 父任务ID
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 周期类型
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 周期步长
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 该值不填
    */
    @SerializedName("NormalizedJobStartTime")
    @Expose
    private String NormalizedJobStartTime;

    /**
    * 任务Action
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * 依赖值
    */
    @SerializedName("SubordinateCyclicConfig")
    @Expose
    private String SubordinateCyclicConfig;

    /**
    * 空值策略
    */
    @SerializedName("PollingNullStrategy")
    @Expose
    private String PollingNullStrategy;

    /**
    * 依赖配置类型
    */
    @SerializedName("DependConfType")
    @Expose
    private String DependConfType;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 主循环配置
    */
    @SerializedName("MainCyclicConfig")
    @Expose
    private String MainCyclicConfig;

    /**
    * 延迟时间
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 周期类型为小时的时候需要设置当天的开始时间
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 周期类型为小时的时候需要设置当天的结束时间
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
     * Get 父任务ID 
     * @return ParentId 父任务ID
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父任务ID
     * @param ParentId 父任务ID
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 周期类型 
     * @return CycleType 周期类型
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 周期类型
     * @param CycleType 周期类型
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 周期步长 
     * @return CycleStep 周期步长
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 周期步长
     * @param CycleStep 周期步长
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 该值不填 
     * @return NormalizedJobStartTime 该值不填
     */
    public String getNormalizedJobStartTime() {
        return this.NormalizedJobStartTime;
    }

    /**
     * Set 该值不填
     * @param NormalizedJobStartTime 该值不填
     */
    public void setNormalizedJobStartTime(String NormalizedJobStartTime) {
        this.NormalizedJobStartTime = NormalizedJobStartTime;
    }

    /**
     * Get 任务Action 
     * @return TaskAction 任务Action
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 任务Action
     * @param TaskAction 任务Action
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get 依赖值 
     * @return SubordinateCyclicConfig 依赖值
     */
    public String getSubordinateCyclicConfig() {
        return this.SubordinateCyclicConfig;
    }

    /**
     * Set 依赖值
     * @param SubordinateCyclicConfig 依赖值
     */
    public void setSubordinateCyclicConfig(String SubordinateCyclicConfig) {
        this.SubordinateCyclicConfig = SubordinateCyclicConfig;
    }

    /**
     * Get 空值策略 
     * @return PollingNullStrategy 空值策略
     */
    public String getPollingNullStrategy() {
        return this.PollingNullStrategy;
    }

    /**
     * Set 空值策略
     * @param PollingNullStrategy 空值策略
     */
    public void setPollingNullStrategy(String PollingNullStrategy) {
        this.PollingNullStrategy = PollingNullStrategy;
    }

    /**
     * Get 依赖配置类型 
     * @return DependConfType 依赖配置类型
     */
    public String getDependConfType() {
        return this.DependConfType;
    }

    /**
     * Set 依赖配置类型
     * @param DependConfType 依赖配置类型
     */
    public void setDependConfType(String DependConfType) {
        this.DependConfType = DependConfType;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 主循环配置 
     * @return MainCyclicConfig 主循环配置
     */
    public String getMainCyclicConfig() {
        return this.MainCyclicConfig;
    }

    /**
     * Set 主循环配置
     * @param MainCyclicConfig 主循环配置
     */
    public void setMainCyclicConfig(String MainCyclicConfig) {
        this.MainCyclicConfig = MainCyclicConfig;
    }

    /**
     * Get 延迟时间 
     * @return DelayTime 延迟时间
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延迟时间
     * @param DelayTime 延迟时间
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 周期类型为小时的时候需要设置当天的开始时间 
     * @return ExecutionStartTime 周期类型为小时的时候需要设置当天的开始时间
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 周期类型为小时的时候需要设置当天的开始时间
     * @param ExecutionStartTime 周期类型为小时的时候需要设置当天的开始时间
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 周期类型为小时的时候需要设置当天的结束时间 
     * @return ExecutionEndTime 周期类型为小时的时候需要设置当天的结束时间
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 周期类型为小时的时候需要设置当天的结束时间
     * @param ExecutionEndTime 周期类型为小时的时候需要设置当天的结束时间
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    public TaskParentSchedulerDependency() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskParentSchedulerDependency(TaskParentSchedulerDependency source) {
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.NormalizedJobStartTime != null) {
            this.NormalizedJobStartTime = new String(source.NormalizedJobStartTime);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.SubordinateCyclicConfig != null) {
            this.SubordinateCyclicConfig = new String(source.SubordinateCyclicConfig);
        }
        if (source.PollingNullStrategy != null) {
            this.PollingNullStrategy = new String(source.PollingNullStrategy);
        }
        if (source.DependConfType != null) {
            this.DependConfType = new String(source.DependConfType);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.MainCyclicConfig != null) {
            this.MainCyclicConfig = new String(source.MainCyclicConfig);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "NormalizedJobStartTime", this.NormalizedJobStartTime);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "SubordinateCyclicConfig", this.SubordinateCyclicConfig);
        this.setParamSimple(map, prefix + "PollingNullStrategy", this.PollingNullStrategy);
        this.setParamSimple(map, prefix + "DependConfType", this.DependConfType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "MainCyclicConfig", this.MainCyclicConfig);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);

    }
}

