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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAITaskResultResponse extends AbstractModel{

    /**
    * 音频分析结果
    */
    @SerializedName("AudioResult")
    @Expose
    private StandardAudioResult AudioResult;

    /**
    * 图像分析结果
    */
    @SerializedName("ImageResult")
    @Expose
    private StandardImageResult ImageResult;

    /**
    * 视频分析结果
    */
    @SerializedName("VideoResult")
    @Expose
    private StandardVideoResult VideoResult;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务唯一id。在URL方式时提交请求后会返回一个jobid，后续查询该url的结果时使用这个jobid进行查询。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 音频分析结果 
     * @return AudioResult 音频分析结果
     */
    public StandardAudioResult getAudioResult() {
        return this.AudioResult;
    }

    /**
     * Set 音频分析结果
     * @param AudioResult 音频分析结果
     */
    public void setAudioResult(StandardAudioResult AudioResult) {
        this.AudioResult = AudioResult;
    }

    /**
     * Get 图像分析结果 
     * @return ImageResult 图像分析结果
     */
    public StandardImageResult getImageResult() {
        return this.ImageResult;
    }

    /**
     * Set 图像分析结果
     * @param ImageResult 图像分析结果
     */
    public void setImageResult(StandardImageResult ImageResult) {
        this.ImageResult = ImageResult;
    }

    /**
     * Get 视频分析结果 
     * @return VideoResult 视频分析结果
     */
    public StandardVideoResult getVideoResult() {
        return this.VideoResult;
    }

    /**
     * Set 视频分析结果
     * @param VideoResult 视频分析结果
     */
    public void setVideoResult(StandardVideoResult VideoResult) {
        this.VideoResult = VideoResult;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务唯一id。在URL方式时提交请求后会返回一个jobid，后续查询该url的结果时使用这个jobid进行查询。 
     * @return TaskId 任务唯一id。在URL方式时提交请求后会返回一个jobid，后续查询该url的结果时使用这个jobid进行查询。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务唯一id。在URL方式时提交请求后会返回一个jobid，后续查询该url的结果时使用这个jobid进行查询。
     * @param TaskId 任务唯一id。在URL方式时提交请求后会返回一个jobid，后续查询该url的结果时使用这个jobid进行查询。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AudioResult.", this.AudioResult);
        this.setParamObj(map, prefix + "ImageResult.", this.ImageResult);
        this.setParamObj(map, prefix + "VideoResult.", this.VideoResult);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

