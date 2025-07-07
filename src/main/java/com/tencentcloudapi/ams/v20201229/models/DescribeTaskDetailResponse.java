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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailResponse extends AbstractModel {

    /**
    * 该字段用于返回创建音频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 该字段用于返回调用音频审核接口时在Tasks参数内传入的数据ID参数，方便数据的辨别和管理。
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 该字段用于返回调用音频审核接口时传入的BizType参数，方便数据的辨别和管理。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 该字段用于返回调用音频审核接口时传入的TaskInput参数中的任务名称，方便任务的识别与管理。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 该字段用于返回所查询内容的任务状态。
<br>取值：**FINISH**（任务已完成）、**PENDING** （任务等待中）、**RUNNING** （任务进行中）、**ERROR** （任务出错）、**CANCELLED** （任务已取消）。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 该字段用于返回调用音频审核接口时输入的音频审核类型，取值为：**AUDIO**（点播音频）和**LIVE_AUDIO**（直播音频），默认值为AUDIO。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 该字段用于返回基于恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
    */
    @SerializedName("Labels")
    @Expose
    private TaskLabel [] Labels;

    /**
    * 该字段用于返回审核服务的媒体内容信息，主要包括传入文件类型和访问地址。
    */
    @SerializedName("InputInfo")
    @Expose
    private InputInfo InputInfo;

    /**
    * 该字段用于返回音频文件识别出的对应文本内容，最大支持**前1000个字符**。
    */
    @SerializedName("AudioText")
    @Expose
    private String AudioText;

    /**
    * 该字段用于返回音频片段的审核结果，主要包括开始时间和音频审核的相应结果。<br>具体输出内容请参见AudioSegments及AudioResult数据结构的详细描述。
    */
    @SerializedName("AudioSegments")
    @Expose
    private AudioSegments [] AudioSegments;

    /**
    * 当任务状态为Error时，该字段用于返回对应错误的类型；任务状态非Error时，默认返回为空。
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * 当任务状态为Error时，该字段用于返回对应错误的详细描述，任务状态非Error时默认返回为空。
    */
    @SerializedName("ErrorDescription")
    @Expose
    private String ErrorDescription;

    /**
    * 该字段用于返回被查询任务创建的时间，格式采用 ISO 8601标准。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 该字段用于返回被查询任务最后更新时间，格式采用 ISO 8601标准。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 该字段用于返回检测结果所对应的标签。如果未命中恶意，返回Normal，如果命中恶意，则返回Labels中优先级最高的标签
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 媒体信息
    */
    @SerializedName("MediaInfo")
    @Expose
    private MediaInfo MediaInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 该字段用于返回创建音频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。 
     * @return TaskId 该字段用于返回创建音频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 该字段用于返回创建音频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。
     * @param TaskId 该字段用于返回创建音频审核任务后返回的任务ID（在Results参数中），用于标识需要查询任务详情的审核任务。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 该字段用于返回调用音频审核接口时在Tasks参数内传入的数据ID参数，方便数据的辨别和管理。 
     * @return DataId 该字段用于返回调用音频审核接口时在Tasks参数内传入的数据ID参数，方便数据的辨别和管理。
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 该字段用于返回调用音频审核接口时在Tasks参数内传入的数据ID参数，方便数据的辨别和管理。
     * @param DataId 该字段用于返回调用音频审核接口时在Tasks参数内传入的数据ID参数，方便数据的辨别和管理。
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 该字段用于返回调用音频审核接口时传入的BizType参数，方便数据的辨别和管理。 
     * @return BizType 该字段用于返回调用音频审核接口时传入的BizType参数，方便数据的辨别和管理。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 该字段用于返回调用音频审核接口时传入的BizType参数，方便数据的辨别和管理。
     * @param BizType 该字段用于返回调用音频审核接口时传入的BizType参数，方便数据的辨别和管理。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 该字段用于返回调用音频审核接口时传入的TaskInput参数中的任务名称，方便任务的识别与管理。 
     * @return Name 该字段用于返回调用音频审核接口时传入的TaskInput参数中的任务名称，方便任务的识别与管理。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 该字段用于返回调用音频审核接口时传入的TaskInput参数中的任务名称，方便任务的识别与管理。
     * @param Name 该字段用于返回调用音频审核接口时传入的TaskInput参数中的任务名称，方便任务的识别与管理。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 该字段用于返回所查询内容的任务状态。
<br>取值：**FINISH**（任务已完成）、**PENDING** （任务等待中）、**RUNNING** （任务进行中）、**ERROR** （任务出错）、**CANCELLED** （任务已取消）。 
     * @return Status 该字段用于返回所查询内容的任务状态。
<br>取值：**FINISH**（任务已完成）、**PENDING** （任务等待中）、**RUNNING** （任务进行中）、**ERROR** （任务出错）、**CANCELLED** （任务已取消）。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 该字段用于返回所查询内容的任务状态。
<br>取值：**FINISH**（任务已完成）、**PENDING** （任务等待中）、**RUNNING** （任务进行中）、**ERROR** （任务出错）、**CANCELLED** （任务已取消）。
     * @param Status 该字段用于返回所查询内容的任务状态。
<br>取值：**FINISH**（任务已完成）、**PENDING** （任务等待中）、**RUNNING** （任务进行中）、**ERROR** （任务出错）、**CANCELLED** （任务已取消）。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 该字段用于返回调用音频审核接口时输入的音频审核类型，取值为：**AUDIO**（点播音频）和**LIVE_AUDIO**（直播音频），默认值为AUDIO。 
     * @return Type 该字段用于返回调用音频审核接口时输入的音频审核类型，取值为：**AUDIO**（点播音频）和**LIVE_AUDIO**（直播音频），默认值为AUDIO。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 该字段用于返回调用音频审核接口时输入的音频审核类型，取值为：**AUDIO**（点播音频）和**LIVE_AUDIO**（直播音频），默认值为AUDIO。
     * @param Type 该字段用于返回调用音频审核接口时输入的音频审核类型，取值为：**AUDIO**（点播音频）和**LIVE_AUDIO**（直播音频），默认值为AUDIO。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 该字段用于返回基于恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过 
     * @return Suggestion 该字段用于返回基于恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 该字段用于返回基于恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     * @param Suggestion 该字段用于返回基于恶意标签的后续操作建议。当您获取到判定结果后，返回值表示系统推荐的后续操作；建议您按照业务所需，对不同违规类型与建议值进行处理。<br>返回值：**Block**：建议屏蔽，**Review** ：建议人工复审，**Pass**：建议通过
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。 
     * @return Labels 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public TaskLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     * @param Labels 该字段用于返回检测结果所对应的恶意标签。<br>返回值：**Porn**：色情，**Abuse**：谩骂，**Ad**：广告，**Custom**：自定义违规；以及其他令人反感、不安全或不适宜的内容类型。
     */
    public void setLabels(TaskLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 该字段用于返回审核服务的媒体内容信息，主要包括传入文件类型和访问地址。 
     * @return InputInfo 该字段用于返回审核服务的媒体内容信息，主要包括传入文件类型和访问地址。
     */
    public InputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 该字段用于返回审核服务的媒体内容信息，主要包括传入文件类型和访问地址。
     * @param InputInfo 该字段用于返回审核服务的媒体内容信息，主要包括传入文件类型和访问地址。
     */
    public void setInputInfo(InputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 该字段用于返回音频文件识别出的对应文本内容，最大支持**前1000个字符**。 
     * @return AudioText 该字段用于返回音频文件识别出的对应文本内容，最大支持**前1000个字符**。
     */
    public String getAudioText() {
        return this.AudioText;
    }

    /**
     * Set 该字段用于返回音频文件识别出的对应文本内容，最大支持**前1000个字符**。
     * @param AudioText 该字段用于返回音频文件识别出的对应文本内容，最大支持**前1000个字符**。
     */
    public void setAudioText(String AudioText) {
        this.AudioText = AudioText;
    }

    /**
     * Get 该字段用于返回音频片段的审核结果，主要包括开始时间和音频审核的相应结果。<br>具体输出内容请参见AudioSegments及AudioResult数据结构的详细描述。 
     * @return AudioSegments 该字段用于返回音频片段的审核结果，主要包括开始时间和音频审核的相应结果。<br>具体输出内容请参见AudioSegments及AudioResult数据结构的详细描述。
     */
    public AudioSegments [] getAudioSegments() {
        return this.AudioSegments;
    }

    /**
     * Set 该字段用于返回音频片段的审核结果，主要包括开始时间和音频审核的相应结果。<br>具体输出内容请参见AudioSegments及AudioResult数据结构的详细描述。
     * @param AudioSegments 该字段用于返回音频片段的审核结果，主要包括开始时间和音频审核的相应结果。<br>具体输出内容请参见AudioSegments及AudioResult数据结构的详细描述。
     */
    public void setAudioSegments(AudioSegments [] AudioSegments) {
        this.AudioSegments = AudioSegments;
    }

    /**
     * Get 当任务状态为Error时，该字段用于返回对应错误的类型；任务状态非Error时，默认返回为空。 
     * @return ErrorType 当任务状态为Error时，该字段用于返回对应错误的类型；任务状态非Error时，默认返回为空。
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set 当任务状态为Error时，该字段用于返回对应错误的类型；任务状态非Error时，默认返回为空。
     * @param ErrorType 当任务状态为Error时，该字段用于返回对应错误的类型；任务状态非Error时，默认返回为空。
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get 当任务状态为Error时，该字段用于返回对应错误的详细描述，任务状态非Error时默认返回为空。 
     * @return ErrorDescription 当任务状态为Error时，该字段用于返回对应错误的详细描述，任务状态非Error时默认返回为空。
     */
    public String getErrorDescription() {
        return this.ErrorDescription;
    }

    /**
     * Set 当任务状态为Error时，该字段用于返回对应错误的详细描述，任务状态非Error时默认返回为空。
     * @param ErrorDescription 当任务状态为Error时，该字段用于返回对应错误的详细描述，任务状态非Error时默认返回为空。
     */
    public void setErrorDescription(String ErrorDescription) {
        this.ErrorDescription = ErrorDescription;
    }

    /**
     * Get 该字段用于返回被查询任务创建的时间，格式采用 ISO 8601标准。 
     * @return CreatedAt 该字段用于返回被查询任务创建的时间，格式采用 ISO 8601标准。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 该字段用于返回被查询任务创建的时间，格式采用 ISO 8601标准。
     * @param CreatedAt 该字段用于返回被查询任务创建的时间，格式采用 ISO 8601标准。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 该字段用于返回被查询任务最后更新时间，格式采用 ISO 8601标准。 
     * @return UpdatedAt 该字段用于返回被查询任务最后更新时间，格式采用 ISO 8601标准。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 该字段用于返回被查询任务最后更新时间，格式采用 ISO 8601标准。
     * @param UpdatedAt 该字段用于返回被查询任务最后更新时间，格式采用 ISO 8601标准。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 该字段用于返回检测结果所对应的标签。如果未命中恶意，返回Normal，如果命中恶意，则返回Labels中优先级最高的标签 
     * @return Label 该字段用于返回检测结果所对应的标签。如果未命中恶意，返回Normal，如果命中恶意，则返回Labels中优先级最高的标签
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 该字段用于返回检测结果所对应的标签。如果未命中恶意，返回Normal，如果命中恶意，则返回Labels中优先级最高的标签
     * @param Label 该字段用于返回检测结果所对应的标签。如果未命中恶意，返回Normal，如果命中恶意，则返回Labels中优先级最高的标签
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 媒体信息 
     * @return MediaInfo 媒体信息
     */
    public MediaInfo getMediaInfo() {
        return this.MediaInfo;
    }

    /**
     * Set 媒体信息
     * @param MediaInfo 媒体信息
     */
    public void setMediaInfo(MediaInfo MediaInfo) {
        this.MediaInfo = MediaInfo;
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
        if (source.InputInfo != null) {
            this.InputInfo = new InputInfo(source.InputInfo);
        }
        if (source.AudioText != null) {
            this.AudioText = new String(source.AudioText);
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
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.MediaInfo != null) {
            this.MediaInfo = new MediaInfo(source.MediaInfo);
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
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "AudioText", this.AudioText);
        this.setParamArrayObj(map, prefix + "AudioSegments.", this.AudioSegments);
        this.setParamSimple(map, prefix + "ErrorType", this.ErrorType);
        this.setParamSimple(map, prefix + "ErrorDescription", this.ErrorDescription);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamObj(map, prefix + "MediaInfo.", this.MediaInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

