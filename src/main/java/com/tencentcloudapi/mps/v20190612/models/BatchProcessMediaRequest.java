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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchProcessMediaRequest extends AbstractModel {

    /**
    * 媒体处理的文件输入信息。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo [] InputInfo;

    /**
    * 媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。
注意：当InputInfo.Type为URL时，该参数是必填项
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如`/movie/201907/`。
如果不填，表示与 InputInfo 中文件所在的目录一致。
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * 智能字幕
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private SmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * 任务的事件通知信息，不填代表不获取事件通知。
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * 任务流的优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 是否跳过元信息获取，可选值： 
0：表示不跳过 
1：表示跳过 
默认值：0	
    */
    @SerializedName("SkipMateData")
    @Expose
    private Long SkipMateData;

    /**
     * Get 媒体处理的文件输入信息。 
     * @return InputInfo 媒体处理的文件输入信息。
     */
    public MediaInputInfo [] getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 媒体处理的文件输入信息。
     * @param InputInfo 媒体处理的文件输入信息。
     */
    public void setInputInfo(MediaInputInfo [] InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。
注意：当InputInfo.Type为URL时，该参数是必填项 
     * @return OutputStorage 媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。
注意：当InputInfo.Type为URL时，该参数是必填项
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。
注意：当InputInfo.Type为URL时，该参数是必填项
     * @param OutputStorage 媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。
注意：当InputInfo.Type为URL时，该参数是必填项
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如`/movie/201907/`。
如果不填，表示与 InputInfo 中文件所在的目录一致。 
     * @return OutputDir 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如`/movie/201907/`。
如果不填，表示与 InputInfo 中文件所在的目录一致。
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如`/movie/201907/`。
如果不填，表示与 InputInfo 中文件所在的目录一致。
     * @param OutputDir 媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如`/movie/201907/`。
如果不填，表示与 InputInfo 中文件所在的目录一致。
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get 智能字幕 
     * @return SmartSubtitlesTask 智能字幕
     */
    public SmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set 智能字幕
     * @param SmartSubtitlesTask 智能字幕
     */
    public void setSmartSubtitlesTask(SmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get 任务的事件通知信息，不填代表不获取事件通知。 
     * @return TaskNotifyConfig 任务的事件通知信息，不填代表不获取事件通知。
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 任务的事件通知信息，不填代表不获取事件通知。
     * @param TaskNotifyConfig 任务的事件通知信息，不填代表不获取事件通知。
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get 任务流的优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。 
     * @return TasksPriority 任务流的优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set 任务流的优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。
     * @param TasksPriority 任务流的优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。 
     * @return SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     * @param SessionContext 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get 资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。 
     * @return ResourceId 资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。
     * @param ResourceId 资源ID，需要保证对应资源是开启状态。默认为帐号主资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 是否跳过元信息获取，可选值： 
0：表示不跳过 
1：表示跳过 
默认值：0	 
     * @return SkipMateData 是否跳过元信息获取，可选值： 
0：表示不跳过 
1：表示跳过 
默认值：0	
     */
    public Long getSkipMateData() {
        return this.SkipMateData;
    }

    /**
     * Set 是否跳过元信息获取，可选值： 
0：表示不跳过 
1：表示跳过 
默认值：0	
     * @param SkipMateData 是否跳过元信息获取，可选值： 
0：表示不跳过 
1：表示跳过 
默认值：0	
     */
    public void setSkipMateData(Long SkipMateData) {
        this.SkipMateData = SkipMateData;
    }

    public BatchProcessMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchProcessMediaRequest(BatchProcessMediaRequest source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo[source.InputInfo.length];
            for (int i = 0; i < source.InputInfo.length; i++) {
                this.InputInfo[i] = new MediaInputInfo(source.InputInfo[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new SmartSubtitlesTaskInput(source.SmartSubtitlesTask);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.SkipMateData != null) {
            this.SkipMateData = new Long(source.SkipMateData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "SkipMateData", this.SkipMateData);

    }
}

