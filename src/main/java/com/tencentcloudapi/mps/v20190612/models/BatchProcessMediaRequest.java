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
    * <p>媒体处理的文件输入信息。</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo [] InputInfo;

    /**
    * <p>媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。<br>注意：当InputInfo.Type为URL时，该参数是必填项，目前只支持COS输出</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如<code>/movie/201907/</code>。<br>如果不填，表示与 InputInfo 中文件所在的目录一致。</p>
    */
    @SerializedName("OutputDir")
    @Expose
    private String OutputDir;

    /**
    * <p>智能字幕</p>
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private SmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * <p>任务的事件通知信息，不填代表不获取事件通知。</p>
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * <p>任务流的优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>是否跳过元信息获取，可选值：<br>0：表示不跳过<br>1：表示跳过<br>默认值：0</p>
    */
    @SerializedName("SkipMateData")
    @Expose
    private Long SkipMateData;

    /**
    * <p>执行模式，可选值：</p><li>Parallel: 并发执行</li><li>Serial: 串行执行</li>注意：默认并发执行。
    */
    @SerializedName("TaskMode")
    @Expose
    private String TaskMode;

    /**
     * Get <p>媒体处理的文件输入信息。</p> 
     * @return InputInfo <p>媒体处理的文件输入信息。</p>
     */
    public MediaInputInfo [] getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>媒体处理的文件输入信息。</p>
     * @param InputInfo <p>媒体处理的文件输入信息。</p>
     */
    public void setInputInfo(MediaInputInfo [] InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。<br>注意：当InputInfo.Type为URL时，该参数是必填项，目前只支持COS输出</p> 
     * @return OutputStorage <p>媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。<br>注意：当InputInfo.Type为URL时，该参数是必填项，目前只支持COS输出</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。<br>注意：当InputInfo.Type为URL时，该参数是必填项，目前只支持COS输出</p>
     * @param OutputStorage <p>媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。<br>注意：当InputInfo.Type为URL时，该参数是必填项，目前只支持COS输出</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如<code>/movie/201907/</code>。<br>如果不填，表示与 InputInfo 中文件所在的目录一致。</p> 
     * @return OutputDir <p>媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如<code>/movie/201907/</code>。<br>如果不填，表示与 InputInfo 中文件所在的目录一致。</p>
     */
    public String getOutputDir() {
        return this.OutputDir;
    }

    /**
     * Set <p>媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如<code>/movie/201907/</code>。<br>如果不填，表示与 InputInfo 中文件所在的目录一致。</p>
     * @param OutputDir <p>媒体处理生成的文件输出的目标目录，必选以 / 开头和结尾，如<code>/movie/201907/</code>。<br>如果不填，表示与 InputInfo 中文件所在的目录一致。</p>
     */
    public void setOutputDir(String OutputDir) {
        this.OutputDir = OutputDir;
    }

    /**
     * Get <p>智能字幕</p> 
     * @return SmartSubtitlesTask <p>智能字幕</p>
     */
    public SmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set <p>智能字幕</p>
     * @param SmartSubtitlesTask <p>智能字幕</p>
     */
    public void setSmartSubtitlesTask(SmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get <p>任务的事件通知信息，不填代表不获取事件通知。</p> 
     * @return TaskNotifyConfig <p>任务的事件通知信息，不填代表不获取事件通知。</p>
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set <p>任务的事件通知信息，不填代表不获取事件通知。</p>
     * @param TaskNotifyConfig <p>任务的事件通知信息，不填代表不获取事件通知。</p>
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get <p>任务流的优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。</p> 
     * @return TasksPriority <p>任务流的优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>任务流的优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。</p>
     * @param TasksPriority <p>任务流的优先级，数值越大优先级越高，取值范围是-10到 10，不填代表0。</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。</p> 
     * @return ResourceId <p>资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。</p>
     * @param ResourceId <p>资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>是否跳过元信息获取，可选值：<br>0：表示不跳过<br>1：表示跳过<br>默认值：0</p> 
     * @return SkipMateData <p>是否跳过元信息获取，可选值：<br>0：表示不跳过<br>1：表示跳过<br>默认值：0</p>
     */
    public Long getSkipMateData() {
        return this.SkipMateData;
    }

    /**
     * Set <p>是否跳过元信息获取，可选值：<br>0：表示不跳过<br>1：表示跳过<br>默认值：0</p>
     * @param SkipMateData <p>是否跳过元信息获取，可选值：<br>0：表示不跳过<br>1：表示跳过<br>默认值：0</p>
     */
    public void setSkipMateData(Long SkipMateData) {
        this.SkipMateData = SkipMateData;
    }

    /**
     * Get <p>执行模式，可选值：</p><li>Parallel: 并发执行</li><li>Serial: 串行执行</li>注意：默认并发执行。 
     * @return TaskMode <p>执行模式，可选值：</p><li>Parallel: 并发执行</li><li>Serial: 串行执行</li>注意：默认并发执行。
     */
    public String getTaskMode() {
        return this.TaskMode;
    }

    /**
     * Set <p>执行模式，可选值：</p><li>Parallel: 并发执行</li><li>Serial: 串行执行</li>注意：默认并发执行。
     * @param TaskMode <p>执行模式，可选值：</p><li>Parallel: 并发执行</li><li>Serial: 串行执行</li>注意：默认并发执行。
     */
    public void setTaskMode(String TaskMode) {
        this.TaskMode = TaskMode;
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
        if (source.TaskMode != null) {
            this.TaskMode = new String(source.TaskMode);
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
        this.setParamSimple(map, prefix + "TaskMode", this.TaskMode);

    }
}

