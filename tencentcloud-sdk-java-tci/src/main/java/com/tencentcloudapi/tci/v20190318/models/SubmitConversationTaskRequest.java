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

public class SubmitConversationTaskRequest extends AbstractModel{

    /**
    * 音频源的语言，默认0为英文，1为中文
    */
    @SerializedName("Lang")
    @Expose
    private Long Lang;

    /**
    * 学生音频流
    */
    @SerializedName("StudentUrl")
    @Expose
    private String StudentUrl;

    /**
    * 教师音频流
    */
    @SerializedName("TeacherUrl")
    @Expose
    private String TeacherUrl;

    /**
    * 语音编码类型 1:pcm
    */
    @SerializedName("VoiceEncodeType")
    @Expose
    private Long VoiceEncodeType;

    /**
    * 语音文件类型 1:raw, 2:wav, 3:mp3（三种格式目前仅支持16k采样率16bit）
    */
    @SerializedName("VoiceFileType")
    @Expose
    private Long VoiceFileType;

    /**
    * 功能开关列表，表示是否需要打开相应的功能，返回相应的信息
    */
    @SerializedName("Functions")
    @Expose
    private Function Functions;

    /**
    * 识别词库名列表，评估过程使用这些词汇库中的词汇进行词汇使用行为分析
    */
    @SerializedName("VocabLibNameList")
    @Expose
    private String [] VocabLibNameList;

    /**
     * Get 音频源的语言，默认0为英文，1为中文 
     * @return Lang 音频源的语言，默认0为英文，1为中文
     */
    public Long getLang() {
        return this.Lang;
    }

    /**
     * Set 音频源的语言，默认0为英文，1为中文
     * @param Lang 音频源的语言，默认0为英文，1为中文
     */
    public void setLang(Long Lang) {
        this.Lang = Lang;
    }

    /**
     * Get 学生音频流 
     * @return StudentUrl 学生音频流
     */
    public String getStudentUrl() {
        return this.StudentUrl;
    }

    /**
     * Set 学生音频流
     * @param StudentUrl 学生音频流
     */
    public void setStudentUrl(String StudentUrl) {
        this.StudentUrl = StudentUrl;
    }

    /**
     * Get 教师音频流 
     * @return TeacherUrl 教师音频流
     */
    public String getTeacherUrl() {
        return this.TeacherUrl;
    }

    /**
     * Set 教师音频流
     * @param TeacherUrl 教师音频流
     */
    public void setTeacherUrl(String TeacherUrl) {
        this.TeacherUrl = TeacherUrl;
    }

    /**
     * Get 语音编码类型 1:pcm 
     * @return VoiceEncodeType 语音编码类型 1:pcm
     */
    public Long getVoiceEncodeType() {
        return this.VoiceEncodeType;
    }

    /**
     * Set 语音编码类型 1:pcm
     * @param VoiceEncodeType 语音编码类型 1:pcm
     */
    public void setVoiceEncodeType(Long VoiceEncodeType) {
        this.VoiceEncodeType = VoiceEncodeType;
    }

    /**
     * Get 语音文件类型 1:raw, 2:wav, 3:mp3（三种格式目前仅支持16k采样率16bit） 
     * @return VoiceFileType 语音文件类型 1:raw, 2:wav, 3:mp3（三种格式目前仅支持16k采样率16bit）
     */
    public Long getVoiceFileType() {
        return this.VoiceFileType;
    }

    /**
     * Set 语音文件类型 1:raw, 2:wav, 3:mp3（三种格式目前仅支持16k采样率16bit）
     * @param VoiceFileType 语音文件类型 1:raw, 2:wav, 3:mp3（三种格式目前仅支持16k采样率16bit）
     */
    public void setVoiceFileType(Long VoiceFileType) {
        this.VoiceFileType = VoiceFileType;
    }

    /**
     * Get 功能开关列表，表示是否需要打开相应的功能，返回相应的信息 
     * @return Functions 功能开关列表，表示是否需要打开相应的功能，返回相应的信息
     */
    public Function getFunctions() {
        return this.Functions;
    }

    /**
     * Set 功能开关列表，表示是否需要打开相应的功能，返回相应的信息
     * @param Functions 功能开关列表，表示是否需要打开相应的功能，返回相应的信息
     */
    public void setFunctions(Function Functions) {
        this.Functions = Functions;
    }

    /**
     * Get 识别词库名列表，评估过程使用这些词汇库中的词汇进行词汇使用行为分析 
     * @return VocabLibNameList 识别词库名列表，评估过程使用这些词汇库中的词汇进行词汇使用行为分析
     */
    public String [] getVocabLibNameList() {
        return this.VocabLibNameList;
    }

    /**
     * Set 识别词库名列表，评估过程使用这些词汇库中的词汇进行词汇使用行为分析
     * @param VocabLibNameList 识别词库名列表，评估过程使用这些词汇库中的词汇进行词汇使用行为分析
     */
    public void setVocabLibNameList(String [] VocabLibNameList) {
        this.VocabLibNameList = VocabLibNameList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamSimple(map, prefix + "StudentUrl", this.StudentUrl);
        this.setParamSimple(map, prefix + "TeacherUrl", this.TeacherUrl);
        this.setParamSimple(map, prefix + "VoiceEncodeType", this.VoiceEncodeType);
        this.setParamSimple(map, prefix + "VoiceFileType", this.VoiceFileType);
        this.setParamObj(map, prefix + "Functions.", this.Functions);
        this.setParamArraySimple(map, prefix + "VocabLibNameList.", this.VocabLibNameList);

    }
}

