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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScheduleRequest extends AbstractModel{

    /**
    * 编排名称，最多128字符。同一个用户该名称唯一。
    */
    @SerializedName("ScheduleName")
    @Expose
    private String ScheduleName;

    /**
    * 编排绑定的触发规则，当上传视频命中该规则到该对象时即触发编排。
    */
    @SerializedName("Trigger")
    @Expose
    private WorkflowTrigger Trigger;

    /**
    * 编排任务列表。
    */
    @SerializedName("Activities")
    @Expose
    private Activity [] Activities;

    /**
    * 媒体处理的文件输出存储位置。不填则继承 Trigger 中的存储位置。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如`/movie/201907/`。
如果不填，表示与触发文件所在的目录一致。
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * 任务的事件通知配置，不填代表不获取事件通知。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
     * Get 编排名称，最多128字符。同一个用户该名称唯一。 
     * @return ScheduleName 编排名称，最多128字符。同一个用户该名称唯一。
     */
    public String getScheduleName() {
        return this.ScheduleName;
    }

    /**
     * Set 编排名称，最多128字符。同一个用户该名称唯一。
     * @param ScheduleName 编排名称，最多128字符。同一个用户该名称唯一。
     */
    public void setScheduleName(String ScheduleName) {
        this.ScheduleName = ScheduleName;
    }

    /**
     * Get 编排绑定的触发规则，当上传视频命中该规则到该对象时即触发编排。 
     * @return Trigger 编排绑定的触发规则，当上传视频命中该规则到该对象时即触发编排。
     */
    public WorkflowTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * Set 编排绑定的触发规则，当上传视频命中该规则到该对象时即触发编排。
     * @param Trigger 编排绑定的触发规则，当上传视频命中该规则到该对象时即触发编排。
     */
    public void setTrigger(WorkflowTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get 编排任务列表。 
     * @return Activities 编排任务列表。
     */
    public Activity [] getActivities() {
        return this.Activities;
    }

    /**
     * Set 编排任务列表。
     * @param Activities 编排任务列表。
     */
    public void setActivities(Activity [] Activities) {
        this.Activities = Activities;
    }

    /**
     * Get 媒体处理的文件输出存储位置。不填则继承 Trigger 中的存储位置。 
     * @return OutputStorage 媒体处理的文件输出存储位置。不填则继承 Trigger 中的存储位置。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 媒体处理的文件输出存储位置。不填则继承 Trigger 中的存储位置。
     * @param OutputStorage 媒体处理的文件输出存储位置。不填则继承 Trigger 中的存储位置。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如`/movie/201907/`。
如果不填，表示与触发文件所在的目录一致。 
     * @return OutputDir 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如`/movie/201907/`。
如果不填，表示与触发文件所在的目录一致。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如`/movie/201907/`。
如果不填，表示与触发文件所在的目录一致。
     * @param OutputDir 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如`/movie/201907/`。
如果不填，表示与触发文件所在的目录一致。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get 任务的事件通知配置，不填代表不获取事件通知。 
     * @return TaskNotifyConfig 任务的事件通知配置，不填代表不获取事件通知。
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 任务的事件通知配置，不填代表不获取事件通知。
     * @param TaskNotifyConfig 任务的事件通知配置，不填代表不获取事件通知。
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    public CreateScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScheduleRequest(CreateScheduleRequest source) {
        if (source.ScheduleName != null) {
            this.ScheduleName = new String(source.ScheduleName);
        }
        if (source.Trigger != null) {
            this.Trigger = new WorkflowTrigger(source.Trigger);
        }
        if (source.Activities != null) {
            this.Activities = new Activity[source.Activities.length];
            for (int i = 0; i < source.Activities.length; i++) {
                this.Activities[i] = new Activity(source.Activities[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleName", this.ScheduleName);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamArrayObj(map, prefix + "Activities.", this.Activities);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);

    }
}

