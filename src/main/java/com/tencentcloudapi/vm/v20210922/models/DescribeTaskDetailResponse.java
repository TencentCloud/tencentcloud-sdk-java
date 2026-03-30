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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailResponse extends AbstractModel {

    /**
    * <p>该字段用于返回创建视频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>该字段用于返回调用视频审核接口时传入的数据ID参数，方便数据的辨别和管理。</p>
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * <p>该字段用于返回调用视频审核接口时传入的BizType参数，方便数据的辨别和管理。</p>
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * <p>该字段用于返回调用视频审核接口时传入的TaskInput参数中的任务名称，方便任务的识别与管理。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>该字段用于返回所查询内容的任务状态。<br><br>取值：<strong>FINISH</strong>（任务已完成）、<strong>PENDING</strong> （任务等待中）、<strong>RUNNING</strong> （任务进行中）、<strong>ERROR</strong> （任务出错）、<strong>CANCELLED</strong> （任务已取消）。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>该字段用于返回调用视频审核接口时输入的视频审核类型，取值为：<strong>VIDEO</strong>（点播视频）、<strong>LIVE_VIDEO</strong>（直播视频）和<strong>VIDEO_AIGC</strong>（AI生成检测），默认值为VIDEO。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>该字段用于返回基于恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>该字段用于返回检测结果所对应的恶意标签。<br>返回值：<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告，<strong>Custom</strong>：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。</p>
    */
    @SerializedName("Labels")
    @Expose
    private TaskLabel [] Labels;

    /**
    * <p>该字段用于返回输入媒体文件的详细信息，包括编解码格式、分片时长等信息。详细内容敬请参考MediaInfo数据结构的描述。</p>
    */
    @SerializedName("MediaInfo")
    @Expose
    private MediaInfo MediaInfo;

    /**
    * <p>该字段用于返回审核服务的媒体内容信息，主要包括传入文件类型和访问地址。</p>
    */
    @SerializedName("InputInfo")
    @Expose
    private InputInfo InputInfo;

    /**
    * <p>该字段用于返回被查询任务创建的时间，格式采用 ISO 8601标准。</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>该字段用于返回被查询任务最后更新时间，格式采用 ISO 8601标准。</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>在秒后重试</p>
    */
    @SerializedName("TryInSeconds")
    @Expose
    private Long TryInSeconds;

    /**
    * <p>该字段用于返回视频中截帧审核的结果，详细返回内容敬请参考ImageSegments数据结构的描述。</p>
    */
    @SerializedName("ImageSegments")
    @Expose
    private ImageSegments [] ImageSegments;

    /**
    * <p>该字段用于返回视频中音频审核的结果，详细返回内容敬请参考AudioSegments数据结构的描述。</p>
    */
    @SerializedName("AudioSegments")
    @Expose
    private AudioSegments [] AudioSegments;

    /**
    * <p>当任务状态为Error时，返回对应错误的类型，取值：<br><strong>DECODE_ERROR</strong>: 解码失败。（输入资源中可能包含无法解码的视频）<br><strong>URL_ERROR</strong>：下载地址验证失败。<br><strong>TIMEOUT_ERROR</strong>：处理超时。<br><strong>CALLBACK_ERRORR</strong>：回调错误。<br><strong>MODERATION_ERROR</strong>：审核失败。<br><strong>URL_NOT_SUPPORTED</strong>：源文件太大或没有图片音频帧<br>任务状态非Error时默认返回为空。</p>
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * <p>当任务状态为Error时，该字段用于返回对应错误的详细描述，任务状态非Error时默认返回为空。</p>
    */
    @SerializedName("ErrorDescription")
    @Expose
    private String ErrorDescription;

    /**
    * <p>该字段用于返回检测结果所对应的标签。如果未命中恶意，返回Normal，如果命中恶意，则返回Labels中优先级最高的标签</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>该字段用于返回音频文件识别出的对应文本内容，最大支持<strong>前1000个字符</strong>。</p>
    */
    @SerializedName("AudioText")
    @Expose
    private String AudioText;

    /**
    * <p>该字段用于返回音频文件识别出的对应文本内容。</p>
    */
    @SerializedName("Asrs")
    @Expose
    private RcbAsr [] Asrs;

    /**
    * <p>该字段用于返回检测结果明细数据相关的cos url</p>
    */
    @SerializedName("SegmentCosUrlList")
    @Expose
    private SegmentCosUrlList SegmentCosUrlList;

    /**
    * <p>该字段用于返回视频中视频切片审核的结果</p>
    */
    @SerializedName("VideoSegments")
    @Expose
    private VideoSegment [] VideoSegments;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>该字段用于返回创建视频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。</p> 
     * @return TaskId <p>该字段用于返回创建视频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>该字段用于返回创建视频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。</p>
     * @param TaskId <p>该字段用于返回创建视频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>该字段用于返回调用视频审核接口时传入的数据ID参数，方便数据的辨别和管理。</p> 
     * @return DataId <p>该字段用于返回调用视频审核接口时传入的数据ID参数，方便数据的辨别和管理。</p>
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set <p>该字段用于返回调用视频审核接口时传入的数据ID参数，方便数据的辨别和管理。</p>
     * @param DataId <p>该字段用于返回调用视频审核接口时传入的数据ID参数，方便数据的辨别和管理。</p>
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get <p>该字段用于返回调用视频审核接口时传入的BizType参数，方便数据的辨别和管理。</p> 
     * @return BizType <p>该字段用于返回调用视频审核接口时传入的BizType参数，方便数据的辨别和管理。</p>
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set <p>该字段用于返回调用视频审核接口时传入的BizType参数，方便数据的辨别和管理。</p>
     * @param BizType <p>该字段用于返回调用视频审核接口时传入的BizType参数，方便数据的辨别和管理。</p>
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get <p>该字段用于返回调用视频审核接口时传入的TaskInput参数中的任务名称，方便任务的识别与管理。</p> 
     * @return Name <p>该字段用于返回调用视频审核接口时传入的TaskInput参数中的任务名称，方便任务的识别与管理。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>该字段用于返回调用视频审核接口时传入的TaskInput参数中的任务名称，方便任务的识别与管理。</p>
     * @param Name <p>该字段用于返回调用视频审核接口时传入的TaskInput参数中的任务名称，方便任务的识别与管理。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>该字段用于返回所查询内容的任务状态。<br><br>取值：<strong>FINISH</strong>（任务已完成）、<strong>PENDING</strong> （任务等待中）、<strong>RUNNING</strong> （任务进行中）、<strong>ERROR</strong> （任务出错）、<strong>CANCELLED</strong> （任务已取消）。</p> 
     * @return Status <p>该字段用于返回所查询内容的任务状态。<br><br>取值：<strong>FINISH</strong>（任务已完成）、<strong>PENDING</strong> （任务等待中）、<strong>RUNNING</strong> （任务进行中）、<strong>ERROR</strong> （任务出错）、<strong>CANCELLED</strong> （任务已取消）。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>该字段用于返回所查询内容的任务状态。<br><br>取值：<strong>FINISH</strong>（任务已完成）、<strong>PENDING</strong> （任务等待中）、<strong>RUNNING</strong> （任务进行中）、<strong>ERROR</strong> （任务出错）、<strong>CANCELLED</strong> （任务已取消）。</p>
     * @param Status <p>该字段用于返回所查询内容的任务状态。<br><br>取值：<strong>FINISH</strong>（任务已完成）、<strong>PENDING</strong> （任务等待中）、<strong>RUNNING</strong> （任务进行中）、<strong>ERROR</strong> （任务出错）、<strong>CANCELLED</strong> （任务已取消）。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>该字段用于返回调用视频审核接口时输入的视频审核类型，取值为：<strong>VIDEO</strong>（点播视频）、<strong>LIVE_VIDEO</strong>（直播视频）和<strong>VIDEO_AIGC</strong>（AI生成检测），默认值为VIDEO。</p> 
     * @return Type <p>该字段用于返回调用视频审核接口时输入的视频审核类型，取值为：<strong>VIDEO</strong>（点播视频）、<strong>LIVE_VIDEO</strong>（直播视频）和<strong>VIDEO_AIGC</strong>（AI生成检测），默认值为VIDEO。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>该字段用于返回调用视频审核接口时输入的视频审核类型，取值为：<strong>VIDEO</strong>（点播视频）、<strong>LIVE_VIDEO</strong>（直播视频）和<strong>VIDEO_AIGC</strong>（AI生成检测），默认值为VIDEO。</p>
     * @param Type <p>该字段用于返回调用视频审核接口时输入的视频审核类型，取值为：<strong>VIDEO</strong>（点播视频）、<strong>LIVE_VIDEO</strong>（直播视频）和<strong>VIDEO_AIGC</strong>（AI生成检测），默认值为VIDEO。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>该字段用于返回基于恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p> 
     * @return Suggestion <p>该字段用于返回基于恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>该字段用于返回基于恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     * @param Suggestion <p>该字段用于返回基于恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：<strong>Block</strong>：建议屏蔽，<strong>Review</strong> ：建议人工复审，<strong>Pass</strong>：建议通过</p>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>该字段用于返回检测结果所对应的恶意标签。<br>返回值：<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告，<strong>Custom</strong>：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。</p> 
     * @return Labels <p>该字段用于返回检测结果所对应的恶意标签。<br>返回值：<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告，<strong>Custom</strong>：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。</p>
     */
    public TaskLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>该字段用于返回检测结果所对应的恶意标签。<br>返回值：<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告，<strong>Custom</strong>：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。</p>
     * @param Labels <p>该字段用于返回检测结果所对应的恶意标签。<br>返回值：<strong>Porn</strong>：色情，<strong>Abuse</strong>：谩骂，<strong>Ad</strong>：广告，<strong>Custom</strong>：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。</p>
     */
    public void setLabels(TaskLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>该字段用于返回输入媒体文件的详细信息，包括编解码格式、分片时长等信息。详细内容敬请参考MediaInfo数据结构的描述。</p> 
     * @return MediaInfo <p>该字段用于返回输入媒体文件的详细信息，包括编解码格式、分片时长等信息。详细内容敬请参考MediaInfo数据结构的描述。</p>
     */
    public MediaInfo getMediaInfo() {
        return this.MediaInfo;
    }

    /**
     * Set <p>该字段用于返回输入媒体文件的详细信息，包括编解码格式、分片时长等信息。详细内容敬请参考MediaInfo数据结构的描述。</p>
     * @param MediaInfo <p>该字段用于返回输入媒体文件的详细信息，包括编解码格式、分片时长等信息。详细内容敬请参考MediaInfo数据结构的描述。</p>
     */
    public void setMediaInfo(MediaInfo MediaInfo) {
        this.MediaInfo = MediaInfo;
    }

    /**
     * Get <p>该字段用于返回审核服务的媒体内容信息，主要包括传入文件类型和访问地址。</p> 
     * @return InputInfo <p>该字段用于返回审核服务的媒体内容信息，主要包括传入文件类型和访问地址。</p>
     */
    public InputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set <p>该字段用于返回审核服务的媒体内容信息，主要包括传入文件类型和访问地址。</p>
     * @param InputInfo <p>该字段用于返回审核服务的媒体内容信息，主要包括传入文件类型和访问地址。</p>
     */
    public void setInputInfo(InputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get <p>该字段用于返回被查询任务创建的时间，格式采用 ISO 8601标准。</p> 
     * @return CreatedAt <p>该字段用于返回被查询任务创建的时间，格式采用 ISO 8601标准。</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>该字段用于返回被查询任务创建的时间，格式采用 ISO 8601标准。</p>
     * @param CreatedAt <p>该字段用于返回被查询任务创建的时间，格式采用 ISO 8601标准。</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>该字段用于返回被查询任务最后更新时间，格式采用 ISO 8601标准。</p> 
     * @return UpdatedAt <p>该字段用于返回被查询任务最后更新时间，格式采用 ISO 8601标准。</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>该字段用于返回被查询任务最后更新时间，格式采用 ISO 8601标准。</p>
     * @param UpdatedAt <p>该字段用于返回被查询任务最后更新时间，格式采用 ISO 8601标准。</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>在秒后重试</p> 
     * @return TryInSeconds <p>在秒后重试</p>
     */
    public Long getTryInSeconds() {
        return this.TryInSeconds;
    }

    /**
     * Set <p>在秒后重试</p>
     * @param TryInSeconds <p>在秒后重试</p>
     */
    public void setTryInSeconds(Long TryInSeconds) {
        this.TryInSeconds = TryInSeconds;
    }

    /**
     * Get <p>该字段用于返回视频中截帧审核的结果，详细返回内容敬请参考ImageSegments数据结构的描述。</p> 
     * @return ImageSegments <p>该字段用于返回视频中截帧审核的结果，详细返回内容敬请参考ImageSegments数据结构的描述。</p>
     */
    public ImageSegments [] getImageSegments() {
        return this.ImageSegments;
    }

    /**
     * Set <p>该字段用于返回视频中截帧审核的结果，详细返回内容敬请参考ImageSegments数据结构的描述。</p>
     * @param ImageSegments <p>该字段用于返回视频中截帧审核的结果，详细返回内容敬请参考ImageSegments数据结构的描述。</p>
     */
    public void setImageSegments(ImageSegments [] ImageSegments) {
        this.ImageSegments = ImageSegments;
    }

    /**
     * Get <p>该字段用于返回视频中音频审核的结果，详细返回内容敬请参考AudioSegments数据结构的描述。</p> 
     * @return AudioSegments <p>该字段用于返回视频中音频审核的结果，详细返回内容敬请参考AudioSegments数据结构的描述。</p>
     */
    public AudioSegments [] getAudioSegments() {
        return this.AudioSegments;
    }

    /**
     * Set <p>该字段用于返回视频中音频审核的结果，详细返回内容敬请参考AudioSegments数据结构的描述。</p>
     * @param AudioSegments <p>该字段用于返回视频中音频审核的结果，详细返回内容敬请参考AudioSegments数据结构的描述。</p>
     */
    public void setAudioSegments(AudioSegments [] AudioSegments) {
        this.AudioSegments = AudioSegments;
    }

    /**
     * Get <p>当任务状态为Error时，返回对应错误的类型，取值：<br><strong>DECODE_ERROR</strong>: 解码失败。（输入资源中可能包含无法解码的视频）<br><strong>URL_ERROR</strong>：下载地址验证失败。<br><strong>TIMEOUT_ERROR</strong>：处理超时。<br><strong>CALLBACK_ERRORR</strong>：回调错误。<br><strong>MODERATION_ERROR</strong>：审核失败。<br><strong>URL_NOT_SUPPORTED</strong>：源文件太大或没有图片音频帧<br>任务状态非Error时默认返回为空。</p> 
     * @return ErrorType <p>当任务状态为Error时，返回对应错误的类型，取值：<br><strong>DECODE_ERROR</strong>: 解码失败。（输入资源中可能包含无法解码的视频）<br><strong>URL_ERROR</strong>：下载地址验证失败。<br><strong>TIMEOUT_ERROR</strong>：处理超时。<br><strong>CALLBACK_ERRORR</strong>：回调错误。<br><strong>MODERATION_ERROR</strong>：审核失败。<br><strong>URL_NOT_SUPPORTED</strong>：源文件太大或没有图片音频帧<br>任务状态非Error时默认返回为空。</p>
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set <p>当任务状态为Error时，返回对应错误的类型，取值：<br><strong>DECODE_ERROR</strong>: 解码失败。（输入资源中可能包含无法解码的视频）<br><strong>URL_ERROR</strong>：下载地址验证失败。<br><strong>TIMEOUT_ERROR</strong>：处理超时。<br><strong>CALLBACK_ERRORR</strong>：回调错误。<br><strong>MODERATION_ERROR</strong>：审核失败。<br><strong>URL_NOT_SUPPORTED</strong>：源文件太大或没有图片音频帧<br>任务状态非Error时默认返回为空。</p>
     * @param ErrorType <p>当任务状态为Error时，返回对应错误的类型，取值：<br><strong>DECODE_ERROR</strong>: 解码失败。（输入资源中可能包含无法解码的视频）<br><strong>URL_ERROR</strong>：下载地址验证失败。<br><strong>TIMEOUT_ERROR</strong>：处理超时。<br><strong>CALLBACK_ERRORR</strong>：回调错误。<br><strong>MODERATION_ERROR</strong>：审核失败。<br><strong>URL_NOT_SUPPORTED</strong>：源文件太大或没有图片音频帧<br>任务状态非Error时默认返回为空。</p>
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get <p>当任务状态为Error时，该字段用于返回对应错误的详细描述，任务状态非Error时默认返回为空。</p> 
     * @return ErrorDescription <p>当任务状态为Error时，该字段用于返回对应错误的详细描述，任务状态非Error时默认返回为空。</p>
     */
    public String getErrorDescription() {
        return this.ErrorDescription;
    }

    /**
     * Set <p>当任务状态为Error时，该字段用于返回对应错误的详细描述，任务状态非Error时默认返回为空。</p>
     * @param ErrorDescription <p>当任务状态为Error时，该字段用于返回对应错误的详细描述，任务状态非Error时默认返回为空。</p>
     */
    public void setErrorDescription(String ErrorDescription) {
        this.ErrorDescription = ErrorDescription;
    }

    /**
     * Get <p>该字段用于返回检测结果所对应的标签。如果未命中恶意，返回Normal，如果命中恶意，则返回Labels中优先级最高的标签</p> 
     * @return Label <p>该字段用于返回检测结果所对应的标签。如果未命中恶意，返回Normal，如果命中恶意，则返回Labels中优先级最高的标签</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>该字段用于返回检测结果所对应的标签。如果未命中恶意，返回Normal，如果命中恶意，则返回Labels中优先级最高的标签</p>
     * @param Label <p>该字段用于返回检测结果所对应的标签。如果未命中恶意，返回Normal，如果命中恶意，则返回Labels中优先级最高的标签</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>该字段用于返回音频文件识别出的对应文本内容，最大支持<strong>前1000个字符</strong>。</p> 
     * @return AudioText <p>该字段用于返回音频文件识别出的对应文本内容，最大支持<strong>前1000个字符</strong>。</p>
     */
    public String getAudioText() {
        return this.AudioText;
    }

    /**
     * Set <p>该字段用于返回音频文件识别出的对应文本内容，最大支持<strong>前1000个字符</strong>。</p>
     * @param AudioText <p>该字段用于返回音频文件识别出的对应文本内容，最大支持<strong>前1000个字符</strong>。</p>
     */
    public void setAudioText(String AudioText) {
        this.AudioText = AudioText;
    }

    /**
     * Get <p>该字段用于返回音频文件识别出的对应文本内容。</p> 
     * @return Asrs <p>该字段用于返回音频文件识别出的对应文本内容。</p>
     */
    public RcbAsr [] getAsrs() {
        return this.Asrs;
    }

    /**
     * Set <p>该字段用于返回音频文件识别出的对应文本内容。</p>
     * @param Asrs <p>该字段用于返回音频文件识别出的对应文本内容。</p>
     */
    public void setAsrs(RcbAsr [] Asrs) {
        this.Asrs = Asrs;
    }

    /**
     * Get <p>该字段用于返回检测结果明细数据相关的cos url</p> 
     * @return SegmentCosUrlList <p>该字段用于返回检测结果明细数据相关的cos url</p>
     */
    public SegmentCosUrlList getSegmentCosUrlList() {
        return this.SegmentCosUrlList;
    }

    /**
     * Set <p>该字段用于返回检测结果明细数据相关的cos url</p>
     * @param SegmentCosUrlList <p>该字段用于返回检测结果明细数据相关的cos url</p>
     */
    public void setSegmentCosUrlList(SegmentCosUrlList SegmentCosUrlList) {
        this.SegmentCosUrlList = SegmentCosUrlList;
    }

    /**
     * Get <p>该字段用于返回视频中视频切片审核的结果</p> 
     * @return VideoSegments <p>该字段用于返回视频中视频切片审核的结果</p>
     */
    public VideoSegment [] getVideoSegments() {
        return this.VideoSegments;
    }

    /**
     * Set <p>该字段用于返回视频中视频切片审核的结果</p>
     * @param VideoSegments <p>该字段用于返回视频中视频切片审核的结果</p>
     */
    public void setVideoSegments(VideoSegment [] VideoSegments) {
        this.VideoSegments = VideoSegments;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTaskDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskDetailResponse(DescribeTaskDetailResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Labels != null) {
            this.Labels = new TaskLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new TaskLabel(source.Labels[i]);
            }
        }
        if (source.MediaInfo != null) {
            this.MediaInfo = new MediaInfo(source.MediaInfo);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new InputInfo(source.InputInfo);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.TryInSeconds != null) {
            this.TryInSeconds = new Long(source.TryInSeconds);
        }
        if (source.ImageSegments != null) {
            this.ImageSegments = new ImageSegments[source.ImageSegments.length];
            for (int i = 0; i < source.ImageSegments.length; i++) {
                this.ImageSegments[i] = new ImageSegments(source.ImageSegments[i]);
            }
        }
        if (source.AudioSegments != null) {
            this.AudioSegments = new AudioSegments[source.AudioSegments.length];
            for (int i = 0; i < source.AudioSegments.length; i++) {
                this.AudioSegments[i] = new AudioSegments(source.AudioSegments[i]);
            }
        }
        if (source.ErrorType != null) {
            this.ErrorType = new String(source.ErrorType);
        }
        if (source.ErrorDescription != null) {
            this.ErrorDescription = new String(source.ErrorDescription);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.AudioText != null) {
            this.AudioText = new String(source.AudioText);
        }
        if (source.Asrs != null) {
            this.Asrs = new RcbAsr[source.Asrs.length];
            for (int i = 0; i < source.Asrs.length; i++) {
                this.Asrs[i] = new RcbAsr(source.Asrs[i]);
            }
        }
        if (source.SegmentCosUrlList != null) {
            this.SegmentCosUrlList = new SegmentCosUrlList(source.SegmentCosUrlList);
        }
        if (source.VideoSegments != null) {
            this.VideoSegments = new VideoSegment[source.VideoSegments.length];
            for (int i = 0; i < source.VideoSegments.length; i++) {
                this.VideoSegments[i] = new VideoSegment(source.VideoSegments[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamObj(map, prefix + "MediaInfo.", this.MediaInfo);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "TryInSeconds", this.TryInSeconds);
        this.setParamArrayObj(map, prefix + "ImageSegments.", this.ImageSegments);
        this.setParamArrayObj(map, prefix + "AudioSegments.", this.AudioSegments);
        this.setParamSimple(map, prefix + "ErrorType", this.ErrorType);
        this.setParamSimple(map, prefix + "ErrorDescription", this.ErrorDescription);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "AudioText", this.AudioText);
        this.setParamArrayObj(map, prefix + "Asrs.", this.Asrs);
        this.setParamObj(map, prefix + "SegmentCosUrlList.", this.SegmentCosUrlList);
        this.setParamArrayObj(map, prefix + "VideoSegments.", this.VideoSegments);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

