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
    * <p>媒体处理的文件输入信息。</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * <p>媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。<br>注意：当InputInfo.Type为URL时，该参数是必填项</p>
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
    * <p>编排ID。<br>注意1：对于OutputStorage、OutputDir参数：</p><li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li><li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若创建任务接口（ProcessMedia）有指定输出，将覆盖原有编排的默认输出。</li><li>即输出设置的优先级：编排子任务节点 &gt; 任务接口指定 &gt; 对应编排内的配置 </li>注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessMedia）有设置，将覆盖原有编排的默认回调。<p>注意3：编排的 Trigger 只是用来自动化触发场景，在手动发起的请求中已经配置的 Trigger 无意义。</p>
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * <p>媒体处理类型任务参数。</p>
    */
    @SerializedName("MediaProcessTask")
    @Expose
    private MediaProcessTaskInput MediaProcessTask;

    /**
    * <p>视频内容审核类型任务参数。</p>
    */
    @SerializedName("AiContentReviewTask")
    @Expose
    private AiContentReviewTaskInput AiContentReviewTask;

    /**
    * <p>视频内容分析类型任务参数。</p>
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private AiAnalysisTaskInput AiAnalysisTask;

    /**
    * <p>视频内容识别类型任务参数。</p>
    */
    @SerializedName("AiRecognitionTask")
    @Expose
    private AiRecognitionTaskInput AiRecognitionTask;

    /**
    * <p>媒体质检类型任务参数。</p>
    */
    @SerializedName("AiQualityControlTask")
    @Expose
    private AiQualityControlTaskInput AiQualityControlTask;

    /**
    * <p>智能字幕</p>
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private SmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * <p>智能擦除类型任务参数</p>
    */
    @SerializedName("SmartEraseTask")
    @Expose
    private SmartEraseTaskInput SmartEraseTask;

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
    * <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不传该参数或者参数为空字符串则本次请求不做去重操作。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>来源上下文，用于透传用户请求信息，任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>任务类型，默认Online</p><li> Online：实时任务</li><li> Offline：闲时任务，不保证实效性，默认3天内处理完</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>资源ID，需要保证对应资源是开启状态。默认为账号主资源ID。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>媒体编排任务组<br>注意：填写此参数ScheduleId字段将失效，Activities优先级大于ScheduleId</p>
    */
    @SerializedName("Activities")
    @Expose
    private Activity [] Activities;

    /**
    * <p>是否跳过元信息获取，可选值：<br>0：表示不跳过<br>1：表示跳过<br>默认值：0</p>
    */
    @SerializedName("SkipMateData")
    @Expose
    private Long SkipMateData;

    /**
     * Get <p>媒体处理的文件输入信息。</p> 
     * @return InputInfo <p>媒体处理的文件输入信息。</p>
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>媒体处理的文件输入信息。</p>
     * @param InputInfo <p>媒体处理的文件输入信息。</p>
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。<br>注意：当InputInfo.Type为URL时，该参数是必填项</p> 
     * @return OutputStorage <p>媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。<br>注意：当InputInfo.Type为URL时，该参数是必填项</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。<br>注意：当InputInfo.Type为URL时，该参数是必填项</p>
     * @param OutputStorage <p>媒体处理输出文件的目标存储。不填则继承 InputInfo 中的存储位置。<br>注意：当InputInfo.Type为URL时，该参数是必填项</p>
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
     * Get <p>编排ID。<br>注意1：对于OutputStorage、OutputDir参数：</p><li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li><li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若创建任务接口（ProcessMedia）有指定输出，将覆盖原有编排的默认输出。</li><li>即输出设置的优先级：编排子任务节点 &gt; 任务接口指定 &gt; 对应编排内的配置 </li>注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessMedia）有设置，将覆盖原有编排的默认回调。<p>注意3：编排的 Trigger 只是用来自动化触发场景，在手动发起的请求中已经配置的 Trigger 无意义。</p> 
     * @return ScheduleId <p>编排ID。<br>注意1：对于OutputStorage、OutputDir参数：</p><li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li><li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若创建任务接口（ProcessMedia）有指定输出，将覆盖原有编排的默认输出。</li><li>即输出设置的优先级：编排子任务节点 &gt; 任务接口指定 &gt; 对应编排内的配置 </li>注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessMedia）有设置，将覆盖原有编排的默认回调。<p>注意3：编排的 Trigger 只是用来自动化触发场景，在手动发起的请求中已经配置的 Trigger 无意义。</p>
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set <p>编排ID。<br>注意1：对于OutputStorage、OutputDir参数：</p><li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li><li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若创建任务接口（ProcessMedia）有指定输出，将覆盖原有编排的默认输出。</li><li>即输出设置的优先级：编排子任务节点 &gt; 任务接口指定 &gt; 对应编排内的配置 </li>注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessMedia）有设置，将覆盖原有编排的默认回调。<p>注意3：编排的 Trigger 只是用来自动化触发场景，在手动发起的请求中已经配置的 Trigger 无意义。</p>
     * @param ScheduleId <p>编排ID。<br>注意1：对于OutputStorage、OutputDir参数：</p><li>当服务编排中子任务节点配置了OutputStorage、OutputDir时，该子任务节点中配置的输出作为子任务的输出。</li><li>当服务编排中子任务节点没有配置OutputStorage、OutputDir时，若创建任务接口（ProcessMedia）有指定输出，将覆盖原有编排的默认输出。</li><li>即输出设置的优先级：编排子任务节点 &gt; 任务接口指定 &gt; 对应编排内的配置 </li>注意2：对于TaskNotifyConfig参数，若创建任务接口（ProcessMedia）有设置，将覆盖原有编排的默认回调。<p>注意3：编排的 Trigger 只是用来自动化触发场景，在手动发起的请求中已经配置的 Trigger 无意义。</p>
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get <p>媒体处理类型任务参数。</p> 
     * @return MediaProcessTask <p>媒体处理类型任务参数。</p>
     */
    public MediaProcessTaskInput getMediaProcessTask() {
        return this.MediaProcessTask;
    }

    /**
     * Set <p>媒体处理类型任务参数。</p>
     * @param MediaProcessTask <p>媒体处理类型任务参数。</p>
     */
    public void setMediaProcessTask(MediaProcessTaskInput MediaProcessTask) {
        this.MediaProcessTask = MediaProcessTask;
    }

    /**
     * Get <p>视频内容审核类型任务参数。</p> 
     * @return AiContentReviewTask <p>视频内容审核类型任务参数。</p>
     */
    public AiContentReviewTaskInput getAiContentReviewTask() {
        return this.AiContentReviewTask;
    }

    /**
     * Set <p>视频内容审核类型任务参数。</p>
     * @param AiContentReviewTask <p>视频内容审核类型任务参数。</p>
     */
    public void setAiContentReviewTask(AiContentReviewTaskInput AiContentReviewTask) {
        this.AiContentReviewTask = AiContentReviewTask;
    }

    /**
     * Get <p>视频内容分析类型任务参数。</p> 
     * @return AiAnalysisTask <p>视频内容分析类型任务参数。</p>
     */
    public AiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set <p>视频内容分析类型任务参数。</p>
     * @param AiAnalysisTask <p>视频内容分析类型任务参数。</p>
     */
    public void setAiAnalysisTask(AiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get <p>视频内容识别类型任务参数。</p> 
     * @return AiRecognitionTask <p>视频内容识别类型任务参数。</p>
     */
    public AiRecognitionTaskInput getAiRecognitionTask() {
        return this.AiRecognitionTask;
    }

    /**
     * Set <p>视频内容识别类型任务参数。</p>
     * @param AiRecognitionTask <p>视频内容识别类型任务参数。</p>
     */
    public void setAiRecognitionTask(AiRecognitionTaskInput AiRecognitionTask) {
        this.AiRecognitionTask = AiRecognitionTask;
    }

    /**
     * Get <p>媒体质检类型任务参数。</p> 
     * @return AiQualityControlTask <p>媒体质检类型任务参数。</p>
     */
    public AiQualityControlTaskInput getAiQualityControlTask() {
        return this.AiQualityControlTask;
    }

    /**
     * Set <p>媒体质检类型任务参数。</p>
     * @param AiQualityControlTask <p>媒体质检类型任务参数。</p>
     */
    public void setAiQualityControlTask(AiQualityControlTaskInput AiQualityControlTask) {
        this.AiQualityControlTask = AiQualityControlTask;
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
     * Get <p>智能擦除类型任务参数</p> 
     * @return SmartEraseTask <p>智能擦除类型任务参数</p>
     */
    public SmartEraseTaskInput getSmartEraseTask() {
        return this.SmartEraseTask;
    }

    /**
     * Set <p>智能擦除类型任务参数</p>
     * @param SmartEraseTask <p>智能擦除类型任务参数</p>
     */
    public void setSmartEraseTask(SmartEraseTaskInput SmartEraseTask) {
        this.SmartEraseTask = SmartEraseTask;
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
     * Get <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不传该参数或者参数为空字符串则本次请求不做去重操作。</p> 
     * @return SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不传该参数或者参数为空字符串则本次请求不做去重操作。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不传该参数或者参数为空字符串则本次请求不做去重操作。</p>
     * @param SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不传该参数或者参数为空字符串则本次请求不做去重操作。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
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
     * Get <p>任务类型，默认Online</p><li> Online：实时任务</li><li> Offline：闲时任务，不保证实效性，默认3天内处理完</li> 
     * @return TaskType <p>任务类型，默认Online</p><li> Online：实时任务</li><li> Offline：闲时任务，不保证实效性，默认3天内处理完</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型，默认Online</p><li> Online：实时任务</li><li> Offline：闲时任务，不保证实效性，默认3天内处理完</li>
     * @param TaskType <p>任务类型，默认Online</p><li> Online：实时任务</li><li> Offline：闲时任务，不保证实效性，默认3天内处理完</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
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
     * Get <p>媒体编排任务组<br>注意：填写此参数ScheduleId字段将失效，Activities优先级大于ScheduleId</p> 
     * @return Activities <p>媒体编排任务组<br>注意：填写此参数ScheduleId字段将失效，Activities优先级大于ScheduleId</p>
     */
    public Activity [] getActivities() {
        return this.Activities;
    }

    /**
     * Set <p>媒体编排任务组<br>注意：填写此参数ScheduleId字段将失效，Activities优先级大于ScheduleId</p>
     * @param Activities <p>媒体编排任务组<br>注意：填写此参数ScheduleId字段将失效，Activities优先级大于ScheduleId</p>
     */
    public void setActivities(Activity [] Activities) {
        this.Activities = Activities;
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
        if (source.Activities != null) {
            this.Activities = new Activity[source.Activities.length];
            for (int i = 0; i < source.Activities.length; i++) {
                this.Activities[i] = new Activity(source.Activities[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Activities.", this.Activities);
        this.setParamSimple(map, prefix + "SkipMateData", this.SkipMateData);

    }
}

