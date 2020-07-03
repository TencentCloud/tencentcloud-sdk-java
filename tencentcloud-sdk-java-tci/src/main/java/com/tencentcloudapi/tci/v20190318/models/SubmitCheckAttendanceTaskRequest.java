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

public class SubmitCheckAttendanceTaskRequest extends AbstractModel{

    /**
    * 输入数据
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 视频流类型，vod_url表示点播URL，live_url表示直播URL，默认vod_url
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 人员库 ID列表
    */
    @SerializedName("LibraryIds")
    @Expose
    private String [] LibraryIds;

    /**
    * 确定出勤阈值；默认为0.92
    */
    @SerializedName("AttendanceThreshold")
    @Expose
    private Float AttendanceThreshold;

    /**
    * 是否开启陌生人模式，陌生人模式是指在任务中发现的非注册人脸库中的人脸也返回相关统计信息，默认不开启
    */
    @SerializedName("EnableStranger")
    @Expose
    private Boolean EnableStranger;

    /**
    * 考勤结束时间（到视频的第几秒结束考勤），单位秒；默认为900 
对于直播场景，使用绝对时间戳，单位秒，默认当前时间往后12小时
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 通知回调地址，要求方法为post，application/json格式
    */
    @SerializedName("NoticeUrl")
    @Expose
    private String NoticeUrl;

    /**
    * 考勤开始时间（从视频的第几秒开始考勤），单位秒；默认为0 
对于直播场景，使用绝对时间戳，单位秒，默认当前时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 识别阈值；默认为0.8
    */
    @SerializedName("Threshold")
    @Expose
    private Float Threshold;

    /**
     * Get 输入数据 
     * @return FileContent 输入数据
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 输入数据
     * @param FileContent 输入数据
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 视频流类型，vod_url表示点播URL，live_url表示直播URL，默认vod_url 
     * @return FileType 视频流类型，vod_url表示点播URL，live_url表示直播URL，默认vod_url
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 视频流类型，vod_url表示点播URL，live_url表示直播URL，默认vod_url
     * @param FileType 视频流类型，vod_url表示点播URL，live_url表示直播URL，默认vod_url
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 人员库 ID列表 
     * @return LibraryIds 人员库 ID列表
     */
    public String [] getLibraryIds() {
        return this.LibraryIds;
    }

    /**
     * Set 人员库 ID列表
     * @param LibraryIds 人员库 ID列表
     */
    public void setLibraryIds(String [] LibraryIds) {
        this.LibraryIds = LibraryIds;
    }

    /**
     * Get 确定出勤阈值；默认为0.92 
     * @return AttendanceThreshold 确定出勤阈值；默认为0.92
     */
    public Float getAttendanceThreshold() {
        return this.AttendanceThreshold;
    }

    /**
     * Set 确定出勤阈值；默认为0.92
     * @param AttendanceThreshold 确定出勤阈值；默认为0.92
     */
    public void setAttendanceThreshold(Float AttendanceThreshold) {
        this.AttendanceThreshold = AttendanceThreshold;
    }

    /**
     * Get 是否开启陌生人模式，陌生人模式是指在任务中发现的非注册人脸库中的人脸也返回相关统计信息，默认不开启 
     * @return EnableStranger 是否开启陌生人模式，陌生人模式是指在任务中发现的非注册人脸库中的人脸也返回相关统计信息，默认不开启
     */
    public Boolean getEnableStranger() {
        return this.EnableStranger;
    }

    /**
     * Set 是否开启陌生人模式，陌生人模式是指在任务中发现的非注册人脸库中的人脸也返回相关统计信息，默认不开启
     * @param EnableStranger 是否开启陌生人模式，陌生人模式是指在任务中发现的非注册人脸库中的人脸也返回相关统计信息，默认不开启
     */
    public void setEnableStranger(Boolean EnableStranger) {
        this.EnableStranger = EnableStranger;
    }

    /**
     * Get 考勤结束时间（到视频的第几秒结束考勤），单位秒；默认为900 
对于直播场景，使用绝对时间戳，单位秒，默认当前时间往后12小时 
     * @return EndTime 考勤结束时间（到视频的第几秒结束考勤），单位秒；默认为900 
对于直播场景，使用绝对时间戳，单位秒，默认当前时间往后12小时
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 考勤结束时间（到视频的第几秒结束考勤），单位秒；默认为900 
对于直播场景，使用绝对时间戳，单位秒，默认当前时间往后12小时
     * @param EndTime 考勤结束时间（到视频的第几秒结束考勤），单位秒；默认为900 
对于直播场景，使用绝对时间戳，单位秒，默认当前时间往后12小时
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 通知回调地址，要求方法为post，application/json格式 
     * @return NoticeUrl 通知回调地址，要求方法为post，application/json格式
     */
    public String getNoticeUrl() {
        return this.NoticeUrl;
    }

    /**
     * Set 通知回调地址，要求方法为post，application/json格式
     * @param NoticeUrl 通知回调地址，要求方法为post，application/json格式
     */
    public void setNoticeUrl(String NoticeUrl) {
        this.NoticeUrl = NoticeUrl;
    }

    /**
     * Get 考勤开始时间（从视频的第几秒开始考勤），单位秒；默认为0 
对于直播场景，使用绝对时间戳，单位秒，默认当前时间 
     * @return StartTime 考勤开始时间（从视频的第几秒开始考勤），单位秒；默认为0 
对于直播场景，使用绝对时间戳，单位秒，默认当前时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 考勤开始时间（从视频的第几秒开始考勤），单位秒；默认为0 
对于直播场景，使用绝对时间戳，单位秒，默认当前时间
     * @param StartTime 考勤开始时间（从视频的第几秒开始考勤），单位秒；默认为0 
对于直播场景，使用绝对时间戳，单位秒，默认当前时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 识别阈值；默认为0.8 
     * @return Threshold 识别阈值；默认为0.8
     */
    public Float getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 识别阈值；默认为0.8
     * @param Threshold 识别阈值；默认为0.8
     */
    public void setThreshold(Float Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamArraySimple(map, prefix + "LibraryIds.", this.LibraryIds);
        this.setParamSimple(map, prefix + "AttendanceThreshold", this.AttendanceThreshold);
        this.setParamSimple(map, prefix + "EnableStranger", this.EnableStranger);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NoticeUrl", this.NoticeUrl);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

