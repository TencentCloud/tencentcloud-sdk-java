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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduledTaskDetail extends AbstractModel {

    /**
    * <p>定时任务唯一标识</p>
    */
    @SerializedName("ScheduledTaskId")
    @Expose
    private String ScheduledTaskId;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>任务提示词</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>六段 cron 表达式</p>
    */
    @SerializedName("Schedule")
    @Expose
    private String Schedule;

    /**
    * <p>任务状态：1=ACTIVE，2=PAUSED</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>会话类型：1=数据分析，2=数据工程</p>
    */
    @SerializedName("SessionType")
    @Expose
    private Long SessionType;

    /**
    * <p>分析空间 ID</p>
    */
    @SerializedName("AnalysisSpaceId")
    @Expose
    private String AnalysisSpaceId;

    /**
    * <p>工作空间 ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>创建人 UIN</p>
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>创建时间，毫秒级 Unix 时间戳字符串</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>最近修改时间，毫秒级 Unix 时间戳字符串</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>生效开始时间，上海时区本地零点的毫秒时间戳字符串；0 表示不传</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>生效结束时间，上海时区本地零点的毫秒时间戳字符串；0 表示不传</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>技能 ID 列表</p>
    */
    @SerializedName("SkillIds")
    @Expose
    private String SkillIds;

    /**
    * <p>模型 ID</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>调度类型：1=每天，2=间隔，3=单次</p>
    */
    @SerializedName("ScheduleType")
    @Expose
    private Long ScheduleType;

    /**
    * <p>最近修改人 UIN</p>
    */
    @SerializedName("UpdateUserUin")
    @Expose
    private String UpdateUserUin;

    /**
    * <p>mcpId列表（逗号分隔）</p>
    */
    @SerializedName("MCPIds")
    @Expose
    private String MCPIds;

    /**
     * Get <p>定时任务唯一标识</p> 
     * @return ScheduledTaskId <p>定时任务唯一标识</p>
     */
    public String getScheduledTaskId() {
        return this.ScheduledTaskId;
    }

    /**
     * Set <p>定时任务唯一标识</p>
     * @param ScheduledTaskId <p>定时任务唯一标识</p>
     */
    public void setScheduledTaskId(String ScheduledTaskId) {
        this.ScheduledTaskId = ScheduledTaskId;
    }

    /**
     * Get <p>任务名称</p> 
     * @return Name <p>任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名称</p>
     * @param Name <p>任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>任务提示词</p> 
     * @return Prompt <p>任务提示词</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>任务提示词</p>
     * @param Prompt <p>任务提示词</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>六段 cron 表达式</p> 
     * @return Schedule <p>六段 cron 表达式</p>
     */
    public String getSchedule() {
        return this.Schedule;
    }

    /**
     * Set <p>六段 cron 表达式</p>
     * @param Schedule <p>六段 cron 表达式</p>
     */
    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get <p>任务状态：1=ACTIVE，2=PAUSED</p> 
     * @return Status <p>任务状态：1=ACTIVE，2=PAUSED</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态：1=ACTIVE，2=PAUSED</p>
     * @param Status <p>任务状态：1=ACTIVE，2=PAUSED</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>会话类型：1=数据分析，2=数据工程</p> 
     * @return SessionType <p>会话类型：1=数据分析，2=数据工程</p>
     */
    public Long getSessionType() {
        return this.SessionType;
    }

    /**
     * Set <p>会话类型：1=数据分析，2=数据工程</p>
     * @param SessionType <p>会话类型：1=数据分析，2=数据工程</p>
     */
    public void setSessionType(Long SessionType) {
        this.SessionType = SessionType;
    }

    /**
     * Get <p>分析空间 ID</p> 
     * @return AnalysisSpaceId <p>分析空间 ID</p>
     */
    public String getAnalysisSpaceId() {
        return this.AnalysisSpaceId;
    }

    /**
     * Set <p>分析空间 ID</p>
     * @param AnalysisSpaceId <p>分析空间 ID</p>
     */
    public void setAnalysisSpaceId(String AnalysisSpaceId) {
        this.AnalysisSpaceId = AnalysisSpaceId;
    }

    /**
     * Get <p>工作空间 ID</p> 
     * @return WorkspaceId <p>工作空间 ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间 ID</p>
     * @param WorkspaceId <p>工作空间 ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>创建人 UIN</p> 
     * @return CreateUserUin <p>创建人 UIN</p>
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>创建人 UIN</p>
     * @param CreateUserUin <p>创建人 UIN</p>
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>创建时间，毫秒级 Unix 时间戳字符串</p> 
     * @return CreateTime <p>创建时间，毫秒级 Unix 时间戳字符串</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，毫秒级 Unix 时间戳字符串</p>
     * @param CreateTime <p>创建时间，毫秒级 Unix 时间戳字符串</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最近修改时间，毫秒级 Unix 时间戳字符串</p> 
     * @return ModifyTime <p>最近修改时间，毫秒级 Unix 时间戳字符串</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>最近修改时间，毫秒级 Unix 时间戳字符串</p>
     * @param ModifyTime <p>最近修改时间，毫秒级 Unix 时间戳字符串</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>生效开始时间，上海时区本地零点的毫秒时间戳字符串；0 表示不传</p> 
     * @return StartTime <p>生效开始时间，上海时区本地零点的毫秒时间戳字符串；0 表示不传</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>生效开始时间，上海时区本地零点的毫秒时间戳字符串；0 表示不传</p>
     * @param StartTime <p>生效开始时间，上海时区本地零点的毫秒时间戳字符串；0 表示不传</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>生效结束时间，上海时区本地零点的毫秒时间戳字符串；0 表示不传</p> 
     * @return EndTime <p>生效结束时间，上海时区本地零点的毫秒时间戳字符串；0 表示不传</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>生效结束时间，上海时区本地零点的毫秒时间戳字符串；0 表示不传</p>
     * @param EndTime <p>生效结束时间，上海时区本地零点的毫秒时间戳字符串；0 表示不传</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>技能 ID 列表</p> 
     * @return SkillIds <p>技能 ID 列表</p>
     */
    public String getSkillIds() {
        return this.SkillIds;
    }

    /**
     * Set <p>技能 ID 列表</p>
     * @param SkillIds <p>技能 ID 列表</p>
     */
    public void setSkillIds(String SkillIds) {
        this.SkillIds = SkillIds;
    }

    /**
     * Get <p>模型 ID</p> 
     * @return ModelId <p>模型 ID</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>模型 ID</p>
     * @param ModelId <p>模型 ID</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>调度类型：1=每天，2=间隔，3=单次</p> 
     * @return ScheduleType <p>调度类型：1=每天，2=间隔，3=单次</p>
     */
    public Long getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set <p>调度类型：1=每天，2=间隔，3=单次</p>
     * @param ScheduleType <p>调度类型：1=每天，2=间隔，3=单次</p>
     */
    public void setScheduleType(Long ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    /**
     * Get <p>最近修改人 UIN</p> 
     * @return UpdateUserUin <p>最近修改人 UIN</p>
     */
    public String getUpdateUserUin() {
        return this.UpdateUserUin;
    }

    /**
     * Set <p>最近修改人 UIN</p>
     * @param UpdateUserUin <p>最近修改人 UIN</p>
     */
    public void setUpdateUserUin(String UpdateUserUin) {
        this.UpdateUserUin = UpdateUserUin;
    }

    /**
     * Get <p>mcpId列表（逗号分隔）</p> 
     * @return MCPIds <p>mcpId列表（逗号分隔）</p>
     */
    public String getMCPIds() {
        return this.MCPIds;
    }

    /**
     * Set <p>mcpId列表（逗号分隔）</p>
     * @param MCPIds <p>mcpId列表（逗号分隔）</p>
     */
    public void setMCPIds(String MCPIds) {
        this.MCPIds = MCPIds;
    }

    public ScheduledTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduledTaskDetail(ScheduledTaskDetail source) {
        if (source.ScheduledTaskId != null) {
            this.ScheduledTaskId = new String(source.ScheduledTaskId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Schedule != null) {
            this.Schedule = new String(source.Schedule);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SessionType != null) {
            this.SessionType = new Long(source.SessionType);
        }
        if (source.AnalysisSpaceId != null) {
            this.AnalysisSpaceId = new String(source.AnalysisSpaceId);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SkillIds != null) {
            this.SkillIds = new String(source.SkillIds);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ScheduleType != null) {
            this.ScheduleType = new Long(source.ScheduleType);
        }
        if (source.UpdateUserUin != null) {
            this.UpdateUserUin = new String(source.UpdateUserUin);
        }
        if (source.MCPIds != null) {
            this.MCPIds = new String(source.MCPIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduledTaskId", this.ScheduledTaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Schedule", this.Schedule);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SessionType", this.SessionType);
        this.setParamSimple(map, prefix + "AnalysisSpaceId", this.AnalysisSpaceId);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SkillIds", this.SkillIds);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);
        this.setParamSimple(map, prefix + "UpdateUserUin", this.UpdateUserUin);
        this.setParamSimple(map, prefix + "MCPIds", this.MCPIds);

    }
}

