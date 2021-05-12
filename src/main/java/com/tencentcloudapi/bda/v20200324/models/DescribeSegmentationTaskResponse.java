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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSegmentationTaskResponse extends AbstractModel{

    /**
    * 当前任务状态：
QUEUING 排队中
PROCESSING 处理中
FINISHED 处理完成
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 分割后视频URL, 存储于腾讯云COS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultVideoUrl")
    @Expose
    private String ResultVideoUrl;

    /**
    * 分割后视频MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultVideoMD5")
    @Expose
    private String ResultVideoMD5;

    /**
    * 视频基本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoBasicInformation")
    @Expose
    private VideoBasicInformation VideoBasicInformation;

    /**
    * 分割任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前任务状态：
QUEUING 排队中
PROCESSING 处理中
FINISHED 处理完成 
     * @return TaskStatus 当前任务状态：
QUEUING 排队中
PROCESSING 处理中
FINISHED 处理完成
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 当前任务状态：
QUEUING 排队中
PROCESSING 处理中
FINISHED 处理完成
     * @param TaskStatus 当前任务状态：
QUEUING 排队中
PROCESSING 处理中
FINISHED 处理完成
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 分割后视频URL, 存储于腾讯云COS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultVideoUrl 分割后视频URL, 存储于腾讯云COS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultVideoUrl() {
        return this.ResultVideoUrl;
    }

    /**
     * Set 分割后视频URL, 存储于腾讯云COS
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultVideoUrl 分割后视频URL, 存储于腾讯云COS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultVideoUrl(String ResultVideoUrl) {
        this.ResultVideoUrl = ResultVideoUrl;
    }

    /**
     * Get 分割后视频MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultVideoMD5 分割后视频MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResultVideoMD5() {
        return this.ResultVideoMD5;
    }

    /**
     * Set 分割后视频MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultVideoMD5 分割后视频MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultVideoMD5(String ResultVideoMD5) {
        this.ResultVideoMD5 = ResultVideoMD5;
    }

    /**
     * Get 视频基本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoBasicInformation 视频基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoBasicInformation getVideoBasicInformation() {
        return this.VideoBasicInformation;
    }

    /**
     * Set 视频基本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoBasicInformation 视频基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoBasicInformation(VideoBasicInformation VideoBasicInformation) {
        this.VideoBasicInformation = VideoBasicInformation;
    }

    /**
     * Get 分割任务错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 分割任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 分割任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 分割任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
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

    public DescribeSegmentationTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSegmentationTaskResponse(DescribeSegmentationTaskResponse source) {
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.ResultVideoUrl != null) {
            this.ResultVideoUrl = new String(source.ResultVideoUrl);
        }
        if (source.ResultVideoMD5 != null) {
            this.ResultVideoMD5 = new String(source.ResultVideoMD5);
        }
        if (source.VideoBasicInformation != null) {
            this.VideoBasicInformation = new VideoBasicInformation(source.VideoBasicInformation);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "ResultVideoUrl", this.ResultVideoUrl);
        this.setParamSimple(map, prefix + "ResultVideoMD5", this.ResultVideoMD5);
        this.setParamObj(map, prefix + "VideoBasicInformation.", this.VideoBasicInformation);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

