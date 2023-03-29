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

public class RecordTaskResult extends AbstractModel{

    /**
    * AUTO - 自动停止录制， USER_CALL - 用户主动调用停止录制
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
    * 分组
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 录制真实开始时间
    */
    @SerializedName("RecordStartTime")
    @Expose
    private Long RecordStartTime;

    /**
    * 录制结束时间
    */
    @SerializedName("RecordStopTime")
    @Expose
    private Long RecordStopTime;

    /**
    * 录制总时长
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
    * 视频信息列表
    */
    @SerializedName("VideoInfos")
    @Expose
    private VideoInfo [] VideoInfos;

    /**
    * 被忽略的视频时间段
    */
    @SerializedName("OmittedDurations")
    @Expose
    private OmittedDuration [] OmittedDurations;

    /**
    * 详情
    */
    @SerializedName("Details")
    @Expose
    private String Details;

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
     * Get AUTO - 自动停止录制， USER_CALL - 用户主动调用停止录制 
     * @return FinishReason AUTO - 自动停止录制， USER_CALL - 用户主动调用停止录制
     */
    public String getFinishReason() {
        return this.FinishReason;
    }

    /**
     * Set AUTO - 自动停止录制， USER_CALL - 用户主动调用停止录制
     * @param FinishReason AUTO - 自动停止录制， USER_CALL - 用户主动调用停止录制
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
     * Get 分组 
     * @return GroupId 分组
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组
     * @param GroupId 分组
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 录制真实开始时间 
     * @return RecordStartTime 录制真实开始时间
     */
    public Long getRecordStartTime() {
        return this.RecordStartTime;
    }

    /**
     * Set 录制真实开始时间
     * @param RecordStartTime 录制真实开始时间
     */
    public void setRecordStartTime(Long RecordStartTime) {
        this.RecordStartTime = RecordStartTime;
    }

    /**
     * Get 录制结束时间 
     * @return RecordStopTime 录制结束时间
     */
    public Long getRecordStopTime() {
        return this.RecordStopTime;
    }

    /**
     * Set 录制结束时间
     * @param RecordStopTime 录制结束时间
     */
    public void setRecordStopTime(Long RecordStopTime) {
        this.RecordStopTime = RecordStopTime;
    }

    /**
     * Get 录制总时长 
     * @return TotalTime 录制总时长
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set 录制总时长
     * @param TotalTime 录制总时长
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get 视频信息列表 
     * @return VideoInfos 视频信息列表
     */
    public VideoInfo [] getVideoInfos() {
        return this.VideoInfos;
    }

    /**
     * Set 视频信息列表
     * @param VideoInfos 视频信息列表
     */
    public void setVideoInfos(VideoInfo [] VideoInfos) {
        this.VideoInfos = VideoInfos;
    }

    /**
     * Get 被忽略的视频时间段 
     * @return OmittedDurations 被忽略的视频时间段
     */
    public OmittedDuration [] getOmittedDurations() {
        return this.OmittedDurations;
    }

    /**
     * Set 被忽略的视频时间段
     * @param OmittedDurations 被忽略的视频时间段
     */
    public void setOmittedDurations(OmittedDuration [] OmittedDurations) {
        this.OmittedDurations = OmittedDurations;
    }

    /**
     * Get 详情 
     * @return Details 详情
     */
    public String getDetails() {
        return this.Details;
    }

    /**
     * Set 详情
     * @param Details 详情
     */
    public void setDetails(String Details) {
        this.Details = Details;
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

    public RecordTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordTaskResult(RecordTaskResult source) {
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
        if (source.RecordStartTime != null) {
            this.RecordStartTime = new Long(source.RecordStartTime);
        }
        if (source.RecordStopTime != null) {
            this.RecordStopTime = new Long(source.RecordStopTime);
        }
        if (source.TotalTime != null) {
            this.TotalTime = new Long(source.TotalTime);
        }
        if (source.VideoInfos != null) {
            this.VideoInfos = new VideoInfo[source.VideoInfos.length];
            for (int i = 0; i < source.VideoInfos.length; i++) {
                this.VideoInfos[i] = new VideoInfo(source.VideoInfos[i]);
            }
        }
        if (source.OmittedDurations != null) {
            this.OmittedDurations = new OmittedDuration[source.OmittedDurations.length];
            for (int i = 0; i < source.OmittedDurations.length; i++) {
                this.OmittedDurations[i] = new OmittedDuration(source.OmittedDurations[i]);
            }
        }
        if (source.Details != null) {
            this.Details = new String(source.Details);
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
        this.setParamSimple(map, prefix + "RecordStartTime", this.RecordStartTime);
        this.setParamSimple(map, prefix + "RecordStopTime", this.RecordStopTime);
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamArrayObj(map, prefix + "VideoInfos.", this.VideoInfos);
        this.setParamArrayObj(map, prefix + "OmittedDurations.", this.OmittedDurations);
        this.setParamSimple(map, prefix + "Details", this.Details);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);

    }
}

