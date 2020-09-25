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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoGenerationTaskResponse extends AbstractModel{

    /**
    * 任务对应的群组Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 任务对应的房间号
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 任务的Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 已废弃
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 录制视频生成任务状态
- QUEUED: 正在排队
- PROCESSING: 正在生成视频
- FINISHED: 生成视频结束（成功完成或失败结束，可以通过错误码和错误信息进一步判断）
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 回放视频总时长,单位：毫秒
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
    * 已废弃，请使用`VideoInfoList`参数
    */
    @SerializedName("VideoInfos")
    @Expose
    private VideoInfo VideoInfos;

    /**
    * 录制视频生成视频列表
    */
    @SerializedName("VideoInfoList")
    @Expose
    private VideoInfo [] VideoInfoList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务对应的群组Id 
     * @return GroupId 任务对应的群组Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 任务对应的群组Id
     * @param GroupId 任务对应的群组Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 任务对应的房间号 
     * @return RoomId 任务对应的房间号
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 任务对应的房间号
     * @param RoomId 任务对应的房间号
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 任务的Id 
     * @return TaskId 任务的Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务的Id
     * @param TaskId 任务的Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 已废弃 
     * @return Progress 已废弃
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 已废弃
     * @param Progress 已废弃
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 录制视频生成任务状态
- QUEUED: 正在排队
- PROCESSING: 正在生成视频
- FINISHED: 生成视频结束（成功完成或失败结束，可以通过错误码和错误信息进一步判断） 
     * @return Status 录制视频生成任务状态
- QUEUED: 正在排队
- PROCESSING: 正在生成视频
- FINISHED: 生成视频结束（成功完成或失败结束，可以通过错误码和错误信息进一步判断）
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 录制视频生成任务状态
- QUEUED: 正在排队
- PROCESSING: 正在生成视频
- FINISHED: 生成视频结束（成功完成或失败结束，可以通过错误码和错误信息进一步判断）
     * @param Status 录制视频生成任务状态
- QUEUED: 正在排队
- PROCESSING: 正在生成视频
- FINISHED: 生成视频结束（成功完成或失败结束，可以通过错误码和错误信息进一步判断）
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 回放视频总时长,单位：毫秒 
     * @return TotalTime 回放视频总时长,单位：毫秒
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set 回放视频总时长,单位：毫秒
     * @param TotalTime 回放视频总时长,单位：毫秒
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get 已废弃，请使用`VideoInfoList`参数 
     * @return VideoInfos 已废弃，请使用`VideoInfoList`参数
     */
    public VideoInfo getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set 已废弃，请使用`VideoInfoList`参数
     * @param VideoInfos 已废弃，请使用`VideoInfoList`参数
     */
    public void setVideoInfos(VideoInfo VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get 录制视频生成视频列表 
     * @return VideoInfoList 录制视频生成视频列表
     */
    public VideoInfo [] getVideoInfoList() {
        return this.VideoInfoList;
    }

    /**
     * Set 录制视频生成视频列表
     * @param VideoInfoList 录制视频生成视频列表
     */
    public void setVideoInfoList(VideoInfo [] VideoInfoList) {
        this.VideoInfoList = VideoInfoList;
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamArrayObj(map, prefix + "VideoInfoList.", this.VideoInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

