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

public class DescribeOnlineRecordResponse extends AbstractModel{

    /**
    * 录制结束原因，
- AUTO: 房间内长时间没有音视频上行及白板操作导致自动停止录制
- USER_CALL: 主动调用了停止录制接口
- EXCEPTION: 录制异常结束
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * 需要查询结果的录制任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 录制任务状态
- PREPARED: 表示录制正在准备中（进房/启动录制服务等操作）
- RECORDING: 表示录制已开始
- PAUSED: 表示录制已暂停
- STOPPED: 表示录制已停止，正在处理并上传视频
- FINISHED: 表示视频处理并上传完成，成功生成录制结果
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 房间号
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 白板的群组 Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 录制用户Id
    */
    @SerializedName("RecordUserId")
    @Expose
    private String RecordUserId;

    /**
    * 实际开始录制时间，Unix 时间戳，单位秒
    */
    @SerializedName("RecordStartTime")
    @Expose
    private Long RecordStartTime;

    /**
    * 实际停止录制时间，Unix 时间戳，单位秒
    */
    @SerializedName("RecordStopTime")
    @Expose
    private Long RecordStopTime;

    /**
    * 回放视频总时长（单位：毫秒）
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
    * 录制过程中出现异常的次数
    */
    @SerializedName("ExceptionCnt")
    @Expose
    private Long ExceptionCnt;

    /**
    * 拼接视频中被忽略的时间段，只有开启视频拼接功能的时候，这个参数才是有效的
    */
    @SerializedName("OmittedDurations")
    @Expose
    private OmittedDuration [] OmittedDurations;

    /**
    * 录制视频列表
    */
    @SerializedName("VideoInfos")
    @Expose
    private VideoInfo [] VideoInfos;

    /**
    * 回放URL，需配合信令播放器使用。此字段仅适用于`视频生成模式`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplayUrl")
    @Expose
    private String ReplayUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 录制结束原因，
- AUTO: 房间内长时间没有音视频上行及白板操作导致自动停止录制
- USER_CALL: 主动调用了停止录制接口
- EXCEPTION: 录制异常结束 
     * @return FinishReason 录制结束原因，
- AUTO: 房间内长时间没有音视频上行及白板操作导致自动停止录制
- USER_CALL: 主动调用了停止录制接口
- EXCEPTION: 录制异常结束
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set 录制结束原因，
- AUTO: 房间内长时间没有音视频上行及白板操作导致自动停止录制
- USER_CALL: 主动调用了停止录制接口
- EXCEPTION: 录制异常结束
     * @param FinishReason 录制结束原因，
- AUTO: 房间内长时间没有音视频上行及白板操作导致自动停止录制
- USER_CALL: 主动调用了停止录制接口
- EXCEPTION: 录制异常结束
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get 需要查询结果的录制任务Id 
     * @return TaskId 需要查询结果的录制任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 需要查询结果的录制任务Id
     * @param TaskId 需要查询结果的录制任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 录制任务状态
- PREPARED: 表示录制正在准备中（进房/启动录制服务等操作）
- RECORDING: 表示录制已开始
- PAUSED: 表示录制已暂停
- STOPPED: 表示录制已停止，正在处理并上传视频
- FINISHED: 表示视频处理并上传完成，成功生成录制结果 
     * @return Status 录制任务状态
- PREPARED: 表示录制正在准备中（进房/启动录制服务等操作）
- RECORDING: 表示录制已开始
- PAUSED: 表示录制已暂停
- STOPPED: 表示录制已停止，正在处理并上传视频
- FINISHED: 表示视频处理并上传完成，成功生成录制结果
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 录制任务状态
- PREPARED: 表示录制正在准备中（进房/启动录制服务等操作）
- RECORDING: 表示录制已开始
- PAUSED: 表示录制已暂停
- STOPPED: 表示录制已停止，正在处理并上传视频
- FINISHED: 表示视频处理并上传完成，成功生成录制结果
     * @param Status 录制任务状态
- PREPARED: 表示录制正在准备中（进房/启动录制服务等操作）
- RECORDING: 表示录制已开始
- PAUSED: 表示录制已暂停
- STOPPED: 表示录制已停止，正在处理并上传视频
- FINISHED: 表示视频处理并上传完成，成功生成录制结果
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 房间号 
     * @return RoomId 房间号
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间号
     * @param RoomId 房间号
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 白板的群组 Id 
     * @return GroupId 白板的群组 Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 白板的群组 Id
     * @param GroupId 白板的群组 Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 录制用户Id 
     * @return RecordUserId 录制用户Id
     */
    public String getRecordUserId() {
        return this.RecordUserId;
    }

    /**
     * Set 录制用户Id
     * @param RecordUserId 录制用户Id
     */
    public void setRecordUserId(String RecordUserId) {
        this.RecordUserId = RecordUserId;
    }

    /**
     * Get 实际开始录制时间，Unix 时间戳，单位秒 
     * @return RecordStartTime 实际开始录制时间，Unix 时间戳，单位秒
     */
    public Long getRecordStartTime() {
        return this.RecordStartTime;
    }

    /**
     * Set 实际开始录制时间，Unix 时间戳，单位秒
     * @param RecordStartTime 实际开始录制时间，Unix 时间戳，单位秒
     */
    public void setRecordStartTime(Long RecordStartTime) {
        this.RecordStartTime = RecordStartTime;
    }

    /**
     * Get 实际停止录制时间，Unix 时间戳，单位秒 
     * @return RecordStopTime 实际停止录制时间，Unix 时间戳，单位秒
     */
    public Long getRecordStopTime() {
        return this.RecordStopTime;
    }

    /**
     * Set 实际停止录制时间，Unix 时间戳，单位秒
     * @param RecordStopTime 实际停止录制时间，Unix 时间戳，单位秒
     */
    public void setRecordStopTime(Long RecordStopTime) {
        this.RecordStopTime = RecordStopTime;
    }

    /**
     * Get 回放视频总时长（单位：毫秒） 
     * @return TotalTime 回放视频总时长（单位：毫秒）
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set 回放视频总时长（单位：毫秒）
     * @param TotalTime 回放视频总时长（单位：毫秒）
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get 录制过程中出现异常的次数 
     * @return ExceptionCnt 录制过程中出现异常的次数
     */
    public Long getExceptionCnt() {
        return this.ExceptionCnt;
    }

    /**
     * Set 录制过程中出现异常的次数
     * @param ExceptionCnt 录制过程中出现异常的次数
     */
    public void setExceptionCnt(Long ExceptionCnt) {
        this.ExceptionCnt = ExceptionCnt;
    }

    /**
     * Get 拼接视频中被忽略的时间段，只有开启视频拼接功能的时候，这个参数才是有效的 
     * @return OmittedDurations 拼接视频中被忽略的时间段，只有开启视频拼接功能的时候，这个参数才是有效的
     */
    public OmittedDuration [] getOmittedDurations() {
        return this.OmittedDurations;
    }

    /**
     * Set 拼接视频中被忽略的时间段，只有开启视频拼接功能的时候，这个参数才是有效的
     * @param OmittedDurations 拼接视频中被忽略的时间段，只有开启视频拼接功能的时候，这个参数才是有效的
     */
    public void setOmittedDurations(OmittedDuration [] OmittedDurations) {
        this.OmittedDurations = OmittedDurations;
    }

    /**
     * Get 录制视频列表 
     * @return VideoInfos 录制视频列表
     */
    public VideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set 录制视频列表
     * @param VideoInfos 录制视频列表
     */
    public void setVideoInfos(VideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get 回放URL，需配合信令播放器使用。此字段仅适用于`视频生成模式`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplayUrl 回放URL，需配合信令播放器使用。此字段仅适用于`视频生成模式`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplayUrl() {
        return this.ReplayUrl;
    }

    /**
     * Set 回放URL，需配合信令播放器使用。此字段仅适用于`视频生成模式`
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplayUrl 回放URL，需配合信令播放器使用。此字段仅适用于`视频生成模式`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplayUrl(String ReplayUrl) {
        this.ReplayUrl = ReplayUrl;
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
        this.setParamSimple(map, prefix + "FinishReason", this.FinishReason);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "RecordUserId", this.RecordUserId);
        this.setParamSimple(map, prefix + "RecordStartTime", this.RecordStartTime);
        this.setParamSimple(map, prefix + "RecordStopTime", this.RecordStopTime);
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "ExceptionCnt", this.ExceptionCnt);
        this.setParamArrayObj(map, prefix + "OmittedDurations.", this.OmittedDurations);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamSimple(map, prefix + "ReplayUrl", this.ReplayUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

