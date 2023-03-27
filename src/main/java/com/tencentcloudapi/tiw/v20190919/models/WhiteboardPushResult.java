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

public class WhiteboardPushResult extends AbstractModel{

    /**
    * AUTO - 自动停止推流， USER_CALL - 用户主动调用停止推流
    */
    @SerializedName("FinishReason")
    @Expose
    private String FinishReason;

    /**
    * 异常数
    */
    @SerializedName("ExceptionCnt")
    @Expose
    private Long ExceptionCnt;

    /**
    * 房间号
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * IM群组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 推流真实开始时间
    */
    @SerializedName("PushStartTime")
    @Expose
    private Long PushStartTime;

    /**
    * 推流结束时间
    */
    @SerializedName("PushStopTime")
    @Expose
    private Long PushStopTime;

    /**
    * 白板推流首帧对应的IM时间戳，可用于录制回放时IM聊天消息与白板推流视频进行同步对时。
    */
    @SerializedName("IMSyncTime")
    @Expose
    private Long IMSyncTime;

    /**
    * 任务失败错误码
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 错误信息
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
     * Get AUTO - 自动停止推流， USER_CALL - 用户主动调用停止推流 
     * @return FinishReason AUTO - 自动停止推流， USER_CALL - 用户主动调用停止推流
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set AUTO - 自动停止推流， USER_CALL - 用户主动调用停止推流
     * @param FinishReason AUTO - 自动停止推流， USER_CALL - 用户主动调用停止推流
     */
    public void setFinishReason(String FinishReason) {
        this.FinishReason = FinishReason;
    }

    /**
     * Get 异常数 
     * @return ExceptionCnt 异常数
     */
    public Long getExceptionCnt() {
        return this.ExceptionCnt;
    }

    /**
     * Set 异常数
     * @param ExceptionCnt 异常数
     */
    public void setExceptionCnt(Long ExceptionCnt) {
        this.ExceptionCnt = ExceptionCnt;
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
     * Get IM群组ID 
     * @return GroupId IM群组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set IM群组ID
     * @param GroupId IM群组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 推流真实开始时间 
     * @return PushStartTime 推流真实开始时间
     */
    public Long getPushStartTime() {
        return this.PushStartTime;
    }

    /**
     * Set 推流真实开始时间
     * @param PushStartTime 推流真实开始时间
     */
    public void setPushStartTime(Long PushStartTime) {
        this.PushStartTime = PushStartTime;
    }

    /**
     * Get 推流结束时间 
     * @return PushStopTime 推流结束时间
     */
    public Long getPushStopTime() {
        return this.PushStopTime;
    }

    /**
     * Set 推流结束时间
     * @param PushStopTime 推流结束时间
     */
    public void setPushStopTime(Long PushStopTime) {
        this.PushStopTime = PushStopTime;
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
     * Get 任务失败错误码 
     * @return ErrorCode 任务失败错误码
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 任务失败错误码
     * @param ErrorCode 任务失败错误码
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 错误信息 
     * @return ErrorMsg 错误信息
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误信息
     * @param ErrorMsg 错误信息
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    public WhiteboardPushResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhiteboardPushResult(WhiteboardPushResult source) {
        if (source.FinishReason != null) {
            this.FinishReason = new String(source.FinishReason);
        }
        if (source.ExceptionCnt != null) {
            this.ExceptionCnt = new Long(source.ExceptionCnt);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PushStartTime != null) {
            this.PushStartTime = new Long(source.PushStartTime);
        }
        if (source.PushStopTime != null) {
            this.PushStopTime = new Long(source.PushStopTime);
        }
        if (source.IMSyncTime != null) {
            this.IMSyncTime = new Long(source.IMSyncTime);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinishReason", this.FinishReason);
        this.setParamSimple(map, prefix + "ExceptionCnt", this.ExceptionCnt);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PushStartTime", this.PushStartTime);
        this.setParamSimple(map, prefix + "PushStopTime", this.PushStopTime);
        this.setParamSimple(map, prefix + "IMSyncTime", this.IMSyncTime);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

