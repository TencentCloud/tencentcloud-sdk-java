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

public class ProcessMediaRequest extends AbstractModel {

    /**
    * 媒体处理的文件输入信息。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

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
    * 编排ID。
注意1：对于OutputStorage、OutputDir参数：
<li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li>
<li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若创建任务接口（ProcessMedia）有指定输出，将覆盖原有编排的默认输出。</li>
<li>即输出设置的优先级：编排子任务节点 > 任务接口指定 > 对应编排内的配置 </li>
注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessMedia）有设置，将覆盖原有编排的默认回调。

注意3：编排的 Trigger 只是用来自动化触发场景，在手动发起的请求中已经配置的 Trigger 无意义。
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * 媒体处理类型任务参数。
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * 视频内容审核类型任务参数。
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * 视频内容分析类型任务参数。
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * 视频内容识别类型任务参数。
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * 媒体质检类型任务参数。
    */
    @SerializedName("AiQualityControlTask")
    @Expose
    private AiQualityControlTaskInput AiQualityControlTask;

    /**
    * 智能字幕
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private SmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * 智能擦除类型任务参数
    */
    @SerializedName("SmartEraseTask")
    @Expose
    private SmartEraseTaskInput SmartEraseTask;

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
    * 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不传该参数或者参数为空字符串则本次请求不做去重操作。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 任务类型，默认Online
<li> Online：实时任务</li>
<li> Offline：闲时任务，不保证实效性，默认3天内处理完</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

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
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 媒体处理的文件输入信息。
     * @param InputInfo 媒体处理的文件输入信息。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
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
     * Get 编排ID。
注意1：对于OutputStorage、OutputDir参数：
<li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li>
<li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若创建任务接口（ProcessMedia）有指定输出，将覆盖原有编排的默认输出。</li>
<li>即输出设置的优先级：编排子任务节点 > 任务接口指定 > 对应编排内的配置 </li>
注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessMedia）有设置，将覆盖原有编排的默认回调。

注意3：编排的 Trigger 只是用来自动化触发场景，在手动发起的请求中已经配置的 Trigger 无意义。 
     * @return ScheduleId 编排ID。
注意1：对于OutputStorage、OutputDir参数：
<li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li>
<li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若创建任务接口（ProcessMedia）有指定输出，将覆盖原有编排的默认输出。</li>
<li>即输出设置的优先级：编排子任务节点 > 任务接口指定 > 对应编排内的配置 </li>
注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessMedia）有设置，将覆盖原有编排的默认回调。

注意3：编排的 Trigger 只是用来自动化触发场景，在手动发起的请求中已经配置的 Trigger 无意义。
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set 编排ID。
注意1：对于OutputStorage、OutputDir参数：
<li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li>
<li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若创建任务接口（ProcessMedia）有指定输出，将覆盖原有编排的默认输出。</li>
<li>即输出设置的优先级：编排子任务节点 > 任务接口指定 > 对应编排内的配置 </li>
注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessMedia）有设置，将覆盖原有编排的默认回调。

注意3：编排的 Trigger 只是用来自动化触发场景，在手动发起的请求中已经配置的 Trigger 无意义。
     * @param ScheduleId 编排ID。
注意1：对于OutputStorage、OutputDir参数：
<li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li>
<li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若创建任务接口（ProcessMedia）有指定输出，将覆盖原有编排的默认输出。</li>
<li>即输出设置的优先级：编排子任务节点 > 任务接口指定 > 对应编排内的配置 </li>
注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessMedia）有设置，将覆盖原有编排的默认回调。

注意3：编排的 Trigger 只是用来自动化触发场景，在手动发起的请求中已经配置的 Trigger 无意义。
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get 媒体处理类型任务参数。 
     * @return MediaProcessTask 媒体处理类型任务参数。
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set 媒体处理类型任务参数。
     * @param MediaProcessTask 媒体处理类型任务参数。
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get 视频内容审核类型任务参数。 
     * @return AiContentReviewTask 视频内容审核类型任务参数。
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set 视频内容审核类型任务参数。
     * @param AiContentReviewTask 视频内容审核类型任务参数。
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get 视频内容分析类型任务参数。 
     * @return AiAnalysisTask 视频内容分析类型任务参数。
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set 视频内容分析类型任务参数。
     * @param AiAnalysisTask 视频内容分析类型任务参数。
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get 视频内容识别类型任务参数。 
     * @return AiRecognitionTask 视频内容识别类型任务参数。
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set 视频内容识别类型任务参数。
     * @param AiRecognitionTask 视频内容识别类型任务参数。
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get 媒体质检类型任务参数。 
     * @return AiQualityControlTask 媒体质检类型任务参数。
     */
    public AiQualityControlTaskInput getAiQualityControlTask() {
        return this.AiQualityControlTask;
    }

    /**
     * Set 媒体质检类型任务参数。
     * @param AiQualityControlTask 媒体质检类型任务参数。
     */
    public void setAiQualityControlTask(AiQualityControlTaskInput AiQualityControlTask) {
        this.AiQualityControlTask = AiQualityControlTask;
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
     * Get 智能擦除类型任务参数 
     * @return SmartEraseTask 智能擦除类型任务参数
     */
    public SmartEraseTaskInput getSmartEraseTask() {
        return this.SmartEraseTask;
    }

    /**
     * Set 智能擦除类型任务参数
     * @param SmartEraseTask 智能擦除类型任务参数
     */
    public void setSmartEraseTask(SmartEraseTaskInput SmartEraseTask) {
        this.SmartEraseTask = SmartEraseTask;
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
     * Get 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不传该参数或者参数为空字符串则本次请求不做去重操作。 
     * @return SessionId 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不传该参数或者参数为空字符串则本次请求不做去重操作。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不传该参数或者参数为空字符串则本次请求不做去重操作。
     * @param SessionId 用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不传该参数或者参数为空字符串则本次请求不做去重操作。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
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
     * Get 任务类型，默认Online
<li> Online：实时任务</li>
<li> Offline：闲时任务，不保证实效性，默认3天内处理完</li> 
     * @return TaskType 任务类型，默认Online
<li> Online：实时任务</li>
<li> Offline：闲时任务，不保证实效性，默认3天内处理完</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型，默认Online
<li> Online：实时任务</li>
<li> Offline：闲时任务，不保证实效性，默认3天内处理完</li>
     * @param TaskType 任务类型，默认Online
<li> Online：实时任务</li>
<li> Offline：闲时任务，不保证实效性，默认3天内处理完</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
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

    public ProcessMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMediaRequest(ProcessMediaRequest source) {
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputDir != null) {
            this.OutputDir = new String(source.OutputDir);
        }
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
        }
        if (source.MediaProcessTask != null) {
            this.MediaProcessTask = new MediaProcessTaskInput(source.MediaProcessTask);
        }
        if (source.AiContentReviewTask != null) {
            this.AiContentReviewTask = new AiContentReviewTaskInput(source.AiContentReviewTask);
        }
        if (source.AiAnalysisTask != null) {
            this.AiAnalysisTask = new AiAnalysisTaskInput(source.AiAnalysisTask);
        }
        if (source.AiRecognitionTask != null) {
            this.AiRecognitionTask = new AiRecognitionTaskInput(source.AiRecognitionTask);
        }
        if (source.AiQualityControlTask != null) {
            this.AiQualityControlTask = new AiQualityControlTaskInput(source.AiQualityControlTask);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new SmartSubtitlesTaskInput(source.SmartSubtitlesTask);
        }
        if (source.SmartEraseTask != null) {
            this.SmartEraseTask = new SmartEraseTaskInput(source.SmartEraseTask);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
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
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputDir", this.OutputDir);
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamObj(map, prefix + "MediaProcessTask.", this.MediaProcessTask);
        this.setParamObj(map, prefix + "AiContentReviewTask.", this.AiContentReviewTask);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "AiRecognitionTask.", this.AiRecognitionTask);
        this.setParamObj(map, prefix + "AiQualityControlTask.", this.AiQualityControlTask);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamObj(map, prefix + "SmartEraseTask.", this.SmartEraseTask);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "SkipMateData", this.SkipMateData);

    }
}

