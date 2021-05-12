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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailResponse extends AbstractModel{

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 审核时传入的数据Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 业务类型，用户可以在控制台查看自己配置的BizType
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 查询内容审核任务的状态，可选值：
FINISH 已完成
PENDING 等待中
RUNNING 进行中
ERROR 出错
CANCELLED 已取消
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务类型：可选AUDIO（点播音频），LIVE_AUDIO（直播音频）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 智能审核服务对于内容违规类型的等级，可选值：
Pass 建议通过；
Reveiw 建议复审；
Block 建议屏蔽；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 智能审核服务对于内容违规类型的判断，详见返回值列表
如：Label：Porn（色情）；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private TaskLabel [] Labels;

    /**
    * 输入的媒体信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputInfo")
    @Expose
    private InputInfo InputInfo;

    /**
    * 音频文本，备注：这里的文本最大只返回前1000个字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioText")
    @Expose
    private String AudioText;

    /**
    * 音频片段审核信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioSegments")
    @Expose
    private AudioSegments [] AudioSegments;

    /**
    * 错误类型，如果任务状态为Error，则该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorType")
    @Expose
    private String ErrorType;

    /**
    * 错误描述，如果任务状态为Error，则该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorDescription")
    @Expose
    private String ErrorDescription;

    /**
    * 任务创建时间，格式为 ISO 8601
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 任务最后更新时间，格式为 ISO 8601
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 审核时传入的数据Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataId 审核时传入的数据Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 审核时传入的数据Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataId 审核时传入的数据Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 业务类型，用户可以在控制台查看自己配置的BizType
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizType 业务类型，用户可以在控制台查看自己配置的BizType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 业务类型，用户可以在控制台查看自己配置的BizType
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizType 业务类型，用户可以在控制台查看自己配置的BizType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 查询内容审核任务的状态，可选值：
FINISH 已完成
PENDING 等待中
RUNNING 进行中
ERROR 出错
CANCELLED 已取消
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 查询内容审核任务的状态，可选值：
FINISH 已完成
PENDING 等待中
RUNNING 进行中
ERROR 出错
CANCELLED 已取消
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 查询内容审核任务的状态，可选值：
FINISH 已完成
PENDING 等待中
RUNNING 进行中
ERROR 出错
CANCELLED 已取消
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 查询内容审核任务的状态，可选值：
FINISH 已完成
PENDING 等待中
RUNNING 进行中
ERROR 出错
CANCELLED 已取消
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务类型：可选AUDIO（点播音频），LIVE_AUDIO（直播音频）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 任务类型：可选AUDIO（点播音频），LIVE_AUDIO（直播音频）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务类型：可选AUDIO（点播音频），LIVE_AUDIO（直播音频）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 任务类型：可选AUDIO（点播音频），LIVE_AUDIO（直播音频）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 智能审核服务对于内容违规类型的等级，可选值：
Pass 建议通过；
Reveiw 建议复审；
Block 建议屏蔽；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Suggestion 智能审核服务对于内容违规类型的等级，可选值：
Pass 建议通过；
Reveiw 建议复审；
Block 建议屏蔽；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 智能审核服务对于内容违规类型的等级，可选值：
Pass 建议通过；
Reveiw 建议复审；
Block 建议屏蔽；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 智能审核服务对于内容违规类型的等级，可选值：
Pass 建议通过；
Reveiw 建议复审；
Block 建议屏蔽；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 智能审核服务对于内容违规类型的判断，详见返回值列表
如：Label：Porn（色情）；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 智能审核服务对于内容违规类型的判断，详见返回值列表
如：Label：Porn（色情）；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 智能审核服务对于内容违规类型的判断，详见返回值列表
如：Label：Porn（色情）；
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 智能审核服务对于内容违规类型的判断，详见返回值列表
如：Label：Porn（色情）；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(TaskLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 输入的媒体信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputInfo 输入的媒体信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 输入的媒体信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputInfo 输入的媒体信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputInfo(InputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 音频文本，备注：这里的文本最大只返回前1000个字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioText 音频文本，备注：这里的文本最大只返回前1000个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAudioText() {
        return this.AudioText;
    }

    /**
     * Set 音频文本，备注：这里的文本最大只返回前1000个字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioText 音频文本，备注：这里的文本最大只返回前1000个字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioText(String AudioText) {
        this.AudioText = AudioText;
    }

    /**
     * Get 音频片段审核信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioSegments 音频片段审核信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioSegments [] getAudioSegments() {
        return this.AudioSegments;
    }

    /**
     * Set 音频片段审核信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioSegments 音频片段审核信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioSegments(AudioSegments [] AudioSegments) {
        this.AudioSegments = AudioSegments;
    }

    /**
     * Get 错误类型，如果任务状态为Error，则该字段不为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorType 错误类型，如果任务状态为Error，则该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorType() {
        return this.ErrorType;
    }

    /**
     * Set 错误类型，如果任务状态为Error，则该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorType 错误类型，如果任务状态为Error，则该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorType(String ErrorType) {
        this.ErrorType = ErrorType;
    }

    /**
     * Get 错误描述，如果任务状态为Error，则该字段不为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorDescription 错误描述，如果任务状态为Error，则该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorDescription() {
        return this.ErrorDescription;
    }

    /**
     * Set 错误描述，如果任务状态为Error，则该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorDescription 错误描述，如果任务状态为Error，则该字段不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorDescription(String ErrorDescription) {
        this.ErrorDescription = ErrorDescription;
    }

    /**
     * Get 任务创建时间，格式为 ISO 8601
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 任务创建时间，格式为 ISO 8601
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 任务创建时间，格式为 ISO 8601
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 任务创建时间，格式为 ISO 8601
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 任务最后更新时间，格式为 ISO 8601
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 任务最后更新时间，格式为 ISO 8601
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 任务最后更新时间，格式为 ISO 8601
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 任务最后更新时间，格式为 ISO 8601
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

