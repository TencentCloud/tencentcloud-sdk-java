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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskDetailResponse extends AbstractModel{

    /**
    * 任务信息，不包含任务结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskInfo")
    @Expose
    private TaskInfo TaskInfo;

    /**
    * 视频任务结果数据，只在视频任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskData")
    @Expose
    private Data TaskData;

    /**
    * 图片任务结果数据，只在图片任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageTaskData")
    @Expose
    private ImageData ImageTaskData;

    /**
    * 音频任务结果数据，只在音频任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioTaskData")
    @Expose
    private AudioData AudioTaskData;

    /**
    * 文本任务结果数据，只在文本任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextTaskData")
    @Expose
    private TextData TextTaskData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务信息，不包含任务结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskInfo 任务信息，不包含任务结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskInfo getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set 任务信息，不包含任务结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskInfo 任务信息，不包含任务结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskInfo(TaskInfo TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    /**
     * Get 视频任务结果数据，只在视频任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskData 视频任务结果数据，只在视频任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Data getTaskData() {
        return this.TaskData;
    }

    /**
     * Set 视频任务结果数据，只在视频任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskData 视频任务结果数据，只在视频任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskData(Data TaskData) {
        this.TaskData = TaskData;
    }

    /**
     * Get 图片任务结果数据，只在图片任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageTaskData 图片任务结果数据，只在图片任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageData getImageTaskData() {
        return this.ImageTaskData;
    }

    /**
     * Set 图片任务结果数据，只在图片任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageTaskData 图片任务结果数据，只在图片任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageTaskData(ImageData ImageTaskData) {
        this.ImageTaskData = ImageTaskData;
    }

    /**
     * Get 音频任务结果数据，只在音频任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioTaskData 音频任务结果数据，只在音频任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioData getAudioTaskData() {
        return this.AudioTaskData;
    }

    /**
     * Set 音频任务结果数据，只在音频任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioTaskData 音频任务结果数据，只在音频任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioTaskData(AudioData AudioTaskData) {
        this.AudioTaskData = AudioTaskData;
    }

    /**
     * Get 文本任务结果数据，只在文本任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextTaskData 文本任务结果数据，只在文本任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TextData getTextTaskData() {
        return this.TextTaskData;
    }

    /**
     * Set 文本任务结果数据，只在文本任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextTaskData 文本任务结果数据，只在文本任务结束时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextTaskData(TextData TextTaskData) {
        this.TextTaskData = TextTaskData;
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
        if (source.TaskInfo != null) {
            this.TaskInfo = new TaskInfo(source.TaskInfo);
        }
        if (source.TaskData != null) {
            this.TaskData = new Data(source.TaskData);
        }
        if (source.ImageTaskData != null) {
            this.ImageTaskData = new ImageData(source.ImageTaskData);
        }
        if (source.AudioTaskData != null) {
            this.AudioTaskData = new AudioData(source.AudioTaskData);
        }
        if (source.TextTaskData != null) {
            this.TextTaskData = new TextData(source.TextTaskData);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TaskInfo.", this.TaskInfo);
        this.setParamObj(map, prefix + "TaskData.", this.TaskData);
        this.setParamObj(map, prefix + "ImageTaskData.", this.ImageTaskData);
        this.setParamObj(map, prefix + "AudioTaskData.", this.AudioTaskData);
        this.setParamObj(map, prefix + "TextTaskData.", this.TextTaskData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

