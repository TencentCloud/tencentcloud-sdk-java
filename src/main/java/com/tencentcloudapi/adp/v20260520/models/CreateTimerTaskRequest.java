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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTimerTaskRequest extends AbstractModel {

    /**
    * 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 页面手动创建 |
| 2 | 自然语言对话创建 |
    */
    @SerializedName("CreateSource")
    @Expose
    private Long CreateSource;

    /**
    * 输入上下文
    */
    @SerializedName("InputContextSnapshot")
    @Expose
    private String InputContextSnapshot;

    /**
    * 模型
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 提示词
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 推送配置
    */
    @SerializedName("PushConfig")
    @Expose
    private TimerPushConfig PushConfig;

    /**
    * 定时配置
    */
    @SerializedName("Schedule")
    @Expose
    private TimerScheduleConfig Schedule;

    /**
    * skill
    */
    @SerializedName("SkillSnapshot")
    @Expose
    private String SkillSnapshot;

    /**
    * 空间
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 工具
    */
    @SerializedName("ToolSnapshot")
    @Expose
    private String ToolSnapshot;

    /**
    * 工作空间
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 主用户
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * 子用户
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
     * Get 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 页面手动创建 |
| 2 | 自然语言对话创建 | 
     * @return CreateSource 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 页面手动创建 |
| 2 | 自然语言对话创建 |
     */
    public Long getCreateSource() {
        return this.CreateSource;
    }

    /**
     * Set 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 页面手动创建 |
| 2 | 自然语言对话创建 |
     * @param CreateSource 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 页面手动创建 |
| 2 | 自然语言对话创建 |
     */
    public void setCreateSource(Long CreateSource) {
        this.CreateSource = CreateSource;
    }

    /**
     * Get 输入上下文 
     * @return InputContextSnapshot 输入上下文
     */
    public String getInputContextSnapshot() {
        return this.InputContextSnapshot;
    }

    /**
     * Set 输入上下文
     * @param InputContextSnapshot 输入上下文
     */
    public void setInputContextSnapshot(String InputContextSnapshot) {
        this.InputContextSnapshot = InputContextSnapshot;
    }

    /**
     * Get 模型 
     * @return ModelId 模型
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型
     * @param ModelId 模型
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 提示词 
     * @return Prompt 提示词
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 提示词
     * @param Prompt 提示词
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 推送配置 
     * @return PushConfig 推送配置
     */
    public TimerPushConfig getPushConfig() {
        return this.PushConfig;
    }

    /**
     * Set 推送配置
     * @param PushConfig 推送配置
     */
    public void setPushConfig(TimerPushConfig PushConfig) {
        this.PushConfig = PushConfig;
    }

    /**
     * Get 定时配置 
     * @return Schedule 定时配置
     */
    public TimerScheduleConfig getSchedule() {
        return this.Schedule;
    }

    /**
     * Set 定时配置
     * @param Schedule 定时配置
     */
    public void setSchedule(TimerScheduleConfig Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get skill 
     * @return SkillSnapshot skill
     */
    public String getSkillSnapshot() {
        return this.SkillSnapshot;
    }

    /**
     * Set skill
     * @param SkillSnapshot skill
     */
    public void setSkillSnapshot(String SkillSnapshot) {
        this.SkillSnapshot = SkillSnapshot;
    }

    /**
     * Get 空间 
     * @return SpaceId 空间
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 空间
     * @param SpaceId 空间
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 工具 
     * @return ToolSnapshot 工具
     */
    public String getToolSnapshot() {
        return this.ToolSnapshot;
    }

    /**
     * Set 工具
     * @param ToolSnapshot 工具
     */
    public void setToolSnapshot(String ToolSnapshot) {
        this.ToolSnapshot = ToolSnapshot;
    }

    /**
     * Get 工作空间 
     * @return WorkspaceId 工作空间
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间
     * @param WorkspaceId 工作空间
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 主用户 
     * @return LoginUin 主用户
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set 主用户
     * @param LoginUin 主用户
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get 子用户 
     * @return LoginSubAccountUin 子用户
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set 子用户
     * @param LoginSubAccountUin 子用户
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    public CreateTimerTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTimerTaskRequest(CreateTimerTaskRequest source) {
        if (source.CreateSource != null) {
            this.CreateSource = new Long(source.CreateSource);
        }
        if (source.InputContextSnapshot != null) {
            this.InputContextSnapshot = new String(source.InputContextSnapshot);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.PushConfig != null) {
            this.PushConfig = new TimerPushConfig(source.PushConfig);
        }
        if (source.Schedule != null) {
            this.Schedule = new TimerScheduleConfig(source.Schedule);
        }
        if (source.SkillSnapshot != null) {
            this.SkillSnapshot = new String(source.SkillSnapshot);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ToolSnapshot != null) {
            this.ToolSnapshot = new String(source.ToolSnapshot);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateSource", this.CreateSource);
        this.setParamSimple(map, prefix + "InputContextSnapshot", this.InputContextSnapshot);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamObj(map, prefix + "PushConfig.", this.PushConfig);
        this.setParamObj(map, prefix + "Schedule.", this.Schedule);
        this.setParamSimple(map, prefix + "SkillSnapshot", this.SkillSnapshot);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ToolSnapshot", this.ToolSnapshot);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

