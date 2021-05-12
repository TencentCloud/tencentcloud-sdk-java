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
package com.tencentcloudapi.ams.v20200608.models;

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
    * 业务类型，用于调用识别策略模板；
（暂未发布功能，敬请期待）
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
    * 传入媒体的解码信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaInfo")
    @Expose
    private MediaInfo MediaInfo;

    /**
    * 审核任务的信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputInfo")
    @Expose
    private InputInfo InputInfo;

    /**
    * 审核任务的创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 审核任务的更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 在N秒后重试
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TryInSeconds")
    @Expose
    private Long TryInSeconds;

    /**
    * 视频/音频审核中的音频结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioSegments")
    @Expose
    private AudioSegments [] AudioSegments;

    /**
    * 视频审核中的图片结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageSegments")
    @Expose
    private ImageSegments [] ImageSegments;

    /**
    * 音频识别总文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioText")
    @Expose
    private String AudioText;

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
     * Get 业务类型，用于调用识别策略模板；
（暂未发布功能，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizType 业务类型，用于调用识别策略模板；
（暂未发布功能，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 业务类型，用于调用识别策略模板；
（暂未发布功能，敬请期待）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizType 业务类型，用于调用识别策略模板；
（暂未发布功能，敬请期待）
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
     * Get 传入媒体的解码信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MediaInfo 传入媒体的解码信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInfo getMediaInfo() {
        return this.MediaInfo;
    }

    /**
     * Set 传入媒体的解码信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaInfo 传入媒体的解码信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaInfo(MediaInfo MediaInfo) {
        this.MediaInfo = MediaInfo;
    }

    /**
     * Get 审核任务的信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputInfo 审核任务的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 审核任务的信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputInfo 审核任务的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputInfo(InputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 审核任务的创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 审核任务的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 审核任务的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 审核任务的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 审核任务的更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 审核任务的更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 审核任务的更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 审核任务的更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 在N秒后重试
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TryInSeconds 在N秒后重试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTryInSeconds() {
        return this.TryInSeconds;
    }

    /**
     * Set 在N秒后重试
注意：此字段可能返回 null，表示取不到有效值。
     * @param TryInSeconds 在N秒后重试
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTryInSeconds(Long TryInSeconds) {
        this.TryInSeconds = TryInSeconds;
    }

    /**
     * Get 视频/音频审核中的音频结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioSegments 视频/音频审核中的音频结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioSegments [] getAudioSegments() {
        return this.AudioSegments;
    }

    /**
     * Set 视频/音频审核中的音频结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioSegments 视频/音频审核中的音频结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioSegments(AudioSegments [] AudioSegments) {
        this.AudioSegments = AudioSegments;
    }

    /**
     * Get 视频审核中的图片结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageSegments 视频审核中的图片结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageSegments [] getImageSegments() {
        return this.ImageSegments;
    }

    /**
     * Set 视频审核中的图片结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageSegments 视频审核中的图片结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageSegments(ImageSegments [] ImageSegments) {
        this.ImageSegments = ImageSegments;
    }

    /**
     * Get 音频识别总文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioText 音频识别总文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAudioText() {
        return this.AudioText;
    }

    /**
     * Set 音频识别总文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioText 音频识别总文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioText(String AudioText) {
        this.AudioText = AudioText;
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
        if (source.AudioSegments != null) {
            this.AudioSegments = new AudioSegments[source.AudioSegments.length];
            for (int i = 0; i < source.AudioSegments.length; i++) {
                this.AudioSegments[i] = new AudioSegments(source.AudioSegments[i]);
            }
        }
        if (source.ImageSegments != null) {
            this.ImageSegments = new ImageSegments[source.ImageSegments.length];
            for (int i = 0; i < source.ImageSegments.length; i++) {
                this.ImageSegments[i] = new ImageSegments(source.ImageSegments[i]);
            }
        }
        if (source.AudioText != null) {
            this.AudioText = new String(source.AudioText);
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
        this.setParamArrayObj(map, prefix + "AudioSegments.", this.AudioSegments);
        this.setParamArrayObj(map, prefix + "ImageSegments.", this.ImageSegments);
        this.setParamSimple(map, prefix + "AudioText", this.AudioText);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

