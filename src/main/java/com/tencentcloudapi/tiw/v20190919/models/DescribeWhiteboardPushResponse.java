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

public class DescribeWhiteboardPushResponse extends AbstractModel{

    /**
    * 推流结束原因，
- AUTO: 房间内长时间没有音视频上行及白板操作导致自动停止推流
- USER_CALL: 主动调用了停止推流接口
- EXCEPTION: 推流异常结束
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * 需要查询结果的白板推流任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 推流任务状态
- PREPARED: 表示推流正在准备中（进房/启动推流服务等操作）
- PUSHING: 表示推流已开始
- STOPPED: 表示推流已停止
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
    * 推流用户Id
    */
    @SerializedName("PushUserId")
    @Expose
    private String PushUserId;

    /**
    * 实际开始推流时间，Unix 时间戳，单位秒
    */
    @SerializedName("PushStartTime")
    @Expose
    private Long PushStartTime;

    /**
    * 实际停止推流时间，Unix 时间戳，单位秒
    */
    @SerializedName("PushStopTime")
    @Expose
    private Long PushStopTime;

    /**
    * 推流过程中出现异常的次数
    */
    @SerializedName("ExceptionCnt")
    @Expose
    private Long ExceptionCnt;

    /**
    * 白板推流首帧对应的IM时间戳，可用于录制回放时IM聊天消息与白板推流视频进行同步对时。
    */
    @SerializedName("IMSyncTime")
    @Expose
    private Long IMSyncTime;

    /**
    * 备份推流任务结果信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Backup")
    @Expose
    private String Backup;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 推流结束原因，
- AUTO: 房间内长时间没有音视频上行及白板操作导致自动停止推流
- USER_CALL: 主动调用了停止推流接口
- EXCEPTION: 推流异常结束 
     * @return FinishReason 推流结束原因，
- AUTO: 房间内长时间没有音视频上行及白板操作导致自动停止推流
- USER_CALL: 主动调用了停止推流接口
- EXCEPTION: 推流异常结束
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set 推流结束原因，
- AUTO: 房间内长时间没有音视频上行及白板操作导致自动停止推流
- USER_CALL: 主动调用了停止推流接口
- EXCEPTION: 推流异常结束
     * @param FinishReason 推流结束原因，
- AUTO: 房间内长时间没有音视频上行及白板操作导致自动停止推流
- USER_CALL: 主动调用了停止推流接口
- EXCEPTION: 推流异常结束
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get 需要查询结果的白板推流任务Id 
     * @return TaskId 需要查询结果的白板推流任务Id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 需要查询结果的白板推流任务Id
     * @param TaskId 需要查询结果的白板推流任务Id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 推流任务状态
- PREPARED: 表示推流正在准备中（进房/启动推流服务等操作）
- PUSHING: 表示推流已开始
- STOPPED: 表示推流已停止 
     * @return Status 推流任务状态
- PREPARED: 表示推流正在准备中（进房/启动推流服务等操作）
- PUSHING: 表示推流已开始
- STOPPED: 表示推流已停止
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 推流任务状态
- PREPARED: 表示推流正在准备中（进房/启动推流服务等操作）
- PUSHING: 表示推流已开始
- STOPPED: 表示推流已停止
     * @param Status 推流任务状态
- PREPARED: 表示推流正在准备中（进房/启动推流服务等操作）
- PUSHING: 表示推流已开始
- STOPPED: 表示推流已停止
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
     * Get 推流用户Id 
     * @return PushUserId 推流用户Id
     */
    public String getPushUserId() {
        return this.PushUserId;
    }

    /**
     * Set 推流用户Id
     * @param PushUserId 推流用户Id
     */
    public void setPushUserId(String PushUserId) {
        this.PushUserId = PushUserId;
    }

    /**
     * Get 实际开始推流时间，Unix 时间戳，单位秒 
     * @return PushStartTime 实际开始推流时间，Unix 时间戳，单位秒
     */
    public Long getPushStartTime() {
        return this.PushStartTime;
    }

    /**
     * Set 实际开始推流时间，Unix 时间戳，单位秒
     * @param PushStartTime 实际开始推流时间，Unix 时间戳，单位秒
     */
    public void setPushStartTime(Long PushStartTime) {
        this.PushStartTime = PushStartTime;
    }

    /**
     * Get 实际停止推流时间，Unix 时间戳，单位秒 
     * @return PushStopTime 实际停止推流时间，Unix 时间戳，单位秒
     */
    public Long getPushStopTime() {
        return this.PushStopTime;
    }

    /**
     * Set 实际停止推流时间，Unix 时间戳，单位秒
     * @param PushStopTime 实际停止推流时间，Unix 时间戳，单位秒
     */
    public void setPushStopTime(Long PushStopTime) {
        this.PushStopTime = PushStopTime;
    }

    /**
     * Get 推流过程中出现异常的次数 
     * @return ExceptionCnt 推流过程中出现异常的次数
     */
    public Long getExceptionCnt() {
        return this.ExceptionCnt;
    }

    /**
     * Set 推流过程中出现异常的次数
     * @param ExceptionCnt 推流过程中出现异常的次数
     */
    public void setExceptionCnt(Long ExceptionCnt) {
        this.ExceptionCnt = ExceptionCnt;
    }

    /**
     * Get 白板推流首帧对应的IM时间戳，可用于录制回放时IM聊天消息与白板推流视频进行同步对时。 
     * @return IMSyncTime 白板推流首帧对应的IM时间戳，可用于录制回放时IM聊天消息与白板推流视频进行同步对时。
     */
    public Long getIMSyncTime() {
        return this.IMSyncTime;
    }

    /**
     * Set 白板推流首帧对应的IM时间戳，可用于录制回放时IM聊天消息与白板推流视频进行同步对时。
     * @param IMSyncTime 白板推流首帧对应的IM时间戳，可用于录制回放时IM聊天消息与白板推流视频进行同步对时。
     */
    public void setIMSyncTime(Long IMSyncTime) {
        this.IMSyncTime = IMSyncTime;
    }

    /**
     * Get 备份推流任务结果信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Backup 备份推流任务结果信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBackup() {
        return this.Backup;
    }

    /**
     * Set 备份推流任务结果信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Backup 备份推流任务结果信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackup(String Backup) {
        this.Backup = Backup;
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

    public DescribeWhiteboardPushResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWhiteboardPushResponse(DescribeWhiteboardPushResponse source) {
        if (source.FinishReason != null) {
            this.FinishReason = new String(source.FinishReason);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PushUserId != null) {
            this.PushUserId = new String(source.PushUserId);
        }
        if (source.PushStartTime != null) {
            this.PushStartTime = new Long(source.PushStartTime);
        }
        if (source.PushStopTime != null) {
            this.PushStopTime = new Long(source.PushStopTime);
        }
        if (source.ExceptionCnt != null) {
            this.ExceptionCnt = new Long(source.ExceptionCnt);
        }
        if (source.IMSyncTime != null) {
            this.IMSyncTime = new Long(source.IMSyncTime);
        }
        if (source.Backup != null) {
            this.Backup = new String(source.Backup);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
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
        this.setParamSimple(map, prefix + "PushUserId", this.PushUserId);
        this.setParamSimple(map, prefix + "PushStartTime", this.PushStartTime);
        this.setParamSimple(map, prefix + "PushStopTime", this.PushStopTime);
        this.setParamSimple(map, prefix + "ExceptionCnt", this.ExceptionCnt);
        this.setParamSimple(map, prefix + "IMSyncTime", this.IMSyncTime);
        this.setParamSimple(map, prefix + "Backup", this.Backup);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

