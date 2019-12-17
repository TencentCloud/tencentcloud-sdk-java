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

public class SubmitDoubleVideoHighlightsRequest extends AbstractModel{

    /**
    * 学生视频url
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 需要检索的人脸合集库，不在库中的人脸将不参与精彩集锦；目前仅支持输入一个人脸库。
    */
    @SerializedName("LibIds")
    @Expose
    private String [] LibIds;

    /**
    * 详细功能开关配置项
    */
    @SerializedName("Functions")
    @Expose
    private DoubleVideoFunction Functions;

    /**
    * 需要匹配的人员信息列表。
    */
    @SerializedName("PersonInfoList")
    @Expose
    private PersonInfo [] PersonInfoList;

    /**
    * 视频处理的抽帧间隔，单位毫秒。建议留空。
    */
    @SerializedName("FrameInterval")
    @Expose
    private Long FrameInterval;

    /**
    * 旧版本需要匹配的人员信息列表。
    */
    @SerializedName("PersonIds")
    @Expose
    private String [] PersonIds;

    /**
    * 人脸检索的相似度阈值，默认值0.89。建议留空。
    */
    @SerializedName("SimThreshold")
    @Expose
    private Float SimThreshold;

    /**
    * 老师视频url
    */
    @SerializedName("TeacherFileContent")
    @Expose
    private String TeacherFileContent;

    /**
     * Get 学生视频url 
     * @return FileContent 学生视频url
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 学生视频url
     * @param FileContent 学生视频url
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 需要检索的人脸合集库，不在库中的人脸将不参与精彩集锦；目前仅支持输入一个人脸库。 
     * @return LibIds 需要检索的人脸合集库，不在库中的人脸将不参与精彩集锦；目前仅支持输入一个人脸库。
     */
    public String [] getLibIds() {
        return this.LibIds;
    }

    /**
     * Set 需要检索的人脸合集库，不在库中的人脸将不参与精彩集锦；目前仅支持输入一个人脸库。
     * @param LibIds 需要检索的人脸合集库，不在库中的人脸将不参与精彩集锦；目前仅支持输入一个人脸库。
     */
    public void setLibIds(String [] LibIds) {
        this.LibIds = LibIds;
    }

    /**
     * Get 详细功能开关配置项 
     * @return Functions 详细功能开关配置项
     */
    public DoubleVideoFunction getFunctions() {
        return this.Functions;
    }

    /**
     * Set 详细功能开关配置项
     * @param Functions 详细功能开关配置项
     */
    public void setFunctions(DoubleVideoFunction Functions) {
        this.Functions = Functions;
    }

    /**
     * Get 需要匹配的人员信息列表。 
     * @return PersonInfoList 需要匹配的人员信息列表。
     */
    public PersonInfo [] getPersonInfoList() {
        return this.PersonInfoList;
    }

    /**
     * Set 需要匹配的人员信息列表。
     * @param PersonInfoList 需要匹配的人员信息列表。
     */
    public void setPersonInfoList(PersonInfo [] PersonInfoList) {
        this.PersonInfoList = PersonInfoList;
    }

    /**
     * Get 视频处理的抽帧间隔，单位毫秒。建议留空。 
     * @return FrameInterval 视频处理的抽帧间隔，单位毫秒。建议留空。
     */
    public Long getFrameInterval() {
        return this.FrameInterval;
    }

    /**
     * Set 视频处理的抽帧间隔，单位毫秒。建议留空。
     * @param FrameInterval 视频处理的抽帧间隔，单位毫秒。建议留空。
     */
    public void setFrameInterval(Long FrameInterval) {
        this.FrameInterval = FrameInterval;
    }

    /**
     * Get 旧版本需要匹配的人员信息列表。 
     * @return PersonIds 旧版本需要匹配的人员信息列表。
     */
    public String [] getPersonIds() {
        return this.PersonIds;
    }

    /**
     * Set 旧版本需要匹配的人员信息列表。
     * @param PersonIds 旧版本需要匹配的人员信息列表。
     */
    public void setPersonIds(String [] PersonIds) {
        this.PersonIds = PersonIds;
    }

    /**
     * Get 人脸检索的相似度阈值，默认值0.89。建议留空。 
     * @return SimThreshold 人脸检索的相似度阈值，默认值0.89。建议留空。
     */
    public Float getSimThreshold() {
        return this.SimThreshold;
    }

    /**
     * Set 人脸检索的相似度阈值，默认值0.89。建议留空。
     * @param SimThreshold 人脸检索的相似度阈值，默认值0.89。建议留空。
     */
    public void setSimThreshold(Float SimThreshold) {
        this.SimThreshold = SimThreshold;
    }

    /**
     * Get 老师视频url 
     * @return TeacherFileContent 老师视频url
     */
    public String getTeacherFileContent() {
        return this.TeacherFileContent;
    }

    /**
     * Set 老师视频url
     * @param TeacherFileContent 老师视频url
     */
    public void setTeacherFileContent(String TeacherFileContent) {
        this.TeacherFileContent = TeacherFileContent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamArraySimple(map, prefix + "LibIds.", this.LibIds);
        this.setParamObj(map, prefix + "Functions.", this.Functions);
        this.setParamArrayObj(map, prefix + "PersonInfoList.", this.PersonInfoList);
        this.setParamSimple(map, prefix + "FrameInterval", this.FrameInterval);
        this.setParamArraySimple(map, prefix + "PersonIds.", this.PersonIds);
        this.setParamSimple(map, prefix + "SimThreshold", this.SimThreshold);
        this.setParamSimple(map, prefix + "TeacherFileContent", this.TeacherFileContent);

    }
}

