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

public class CheckAttendanceRequest  extends AbstractModel{

    /**
    * 输入数据
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 输入类型，picture_url:图片，vod_url:视频文件
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 人员库 ID
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 人员 ID 列表
    */
    @SerializedName("PersonIdSet")
    @Expose
    private String [] PersonIdSet;

    /**
    * 确定出勤阀值；默认为0.92
    */
    @SerializedName("AttendanceThreshold")
    @Expose
    private Float AttendanceThreshold;

    /**
    * 考勤结束时间（到视频的第几秒结束考勤），单位秒；默认为900
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 考勤开始时间（从视频的第几秒开始考勤），单位秒；默认为0
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 识别阈值；默认为0.7
    */
    @SerializedName("Threshold")
    @Expose
    private Float Threshold;

    /**
     * 获取输入数据
     * @return FileContent 输入数据
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * 设置输入数据
     * @param FileContent 输入数据
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * 获取输入类型，picture_url:图片，vod_url:视频文件
     * @return FileType 输入类型，picture_url:图片，vod_url:视频文件
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * 设置输入类型，picture_url:图片，vod_url:视频文件
     * @param FileType 输入类型，picture_url:图片，vod_url:视频文件
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * 获取人员库 ID
     * @return LibraryId 人员库 ID
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * 设置人员库 ID
     * @param LibraryId 人员库 ID
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * 获取人员 ID 列表
     * @return PersonIdSet 人员 ID 列表
     */
    public String [] getPersonIdSet() {
        return this.PersonIdSet;
    }

    /**
     * 设置人员 ID 列表
     * @param PersonIdSet 人员 ID 列表
     */
    public void setPersonIdSet(String [] PersonIdSet) {
        this.PersonIdSet = PersonIdSet;
    }

    /**
     * 获取确定出勤阀值；默认为0.92
     * @return AttendanceThreshold 确定出勤阀值；默认为0.92
     */
    public Float getAttendanceThreshold() {
        return this.AttendanceThreshold;
    }

    /**
     * 设置确定出勤阀值；默认为0.92
     * @param AttendanceThreshold 确定出勤阀值；默认为0.92
     */
    public void setAttendanceThreshold(Float AttendanceThreshold) {
        this.AttendanceThreshold = AttendanceThreshold;
    }

    /**
     * 获取考勤结束时间（到视频的第几秒结束考勤），单位秒；默认为900
     * @return EndTime 考勤结束时间（到视频的第几秒结束考勤），单位秒；默认为900
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置考勤结束时间（到视频的第几秒结束考勤），单位秒；默认为900
     * @param EndTime 考勤结束时间（到视频的第几秒结束考勤），单位秒；默认为900
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取考勤开始时间（从视频的第几秒开始考勤），单位秒；默认为0
     * @return StartTime 考勤开始时间（从视频的第几秒开始考勤），单位秒；默认为0
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置考勤开始时间（从视频的第几秒开始考勤），单位秒；默认为0
     * @param StartTime 考勤开始时间（从视频的第几秒开始考勤），单位秒；默认为0
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取识别阈值；默认为0.7
     * @return Threshold 识别阈值；默认为0.7
     */
    public Float getThreshold() {
        return this.Threshold;
    }

    /**
     * 设置识别阈值；默认为0.7
     * @param Threshold 识别阈值；默认为0.7
     */
    public void setThreshold(Float Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamArraySimple(map, prefix + "PersonIdSet.", this.PersonIdSet);
        this.setParamSimple(map, prefix + "AttendanceThreshold", this.AttendanceThreshold);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

