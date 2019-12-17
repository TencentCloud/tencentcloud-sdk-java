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

public class SubmitFullBodyClassTaskRequest extends AbstractModel{

    /**
    * 输入分析对象内容，输入数据格式参考FileType参数释义
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址，picture: 图片二进制数据的BASE64编码
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 音频源的语言，默认0为英文，1为中文
    */
    @SerializedName("Lang")
    @Expose
    private Long Lang;

    /**
    * 查询人员库列表，可填写老师的注册照所在人员库
    */
    @SerializedName("LibrarySet")
    @Expose
    private String [] LibrarySet;

    /**
    * 视频评估时间，单位秒，点播场景默认值为2小时（无法探测长度时）或完整视频，直播场景默认值为10分钟或直播提前结束
    */
    @SerializedName("MaxVideoDuration")
    @Expose
    private Long MaxVideoDuration;

    /**
    * 识别词库名列表，这些词汇库用来维护关键词，评估老师授课过程中，对这些关键词的使用情况
    */
    @SerializedName("VocabLibNameList")
    @Expose
    private String [] VocabLibNameList;

    /**
    * 语音编码类型 1:pcm，当FileType为vod_url或live_url时为必填
    */
    @SerializedName("VoiceEncodeType")
    @Expose
    private Long VoiceEncodeType;

    /**
    * 语音文件类型 10:视频（三种音频格式目前仅支持16k采样率16bit），当FileType为vod_url或live_url时为必填
    */
    @SerializedName("VoiceFileType")
    @Expose
    private Long VoiceFileType;

    /**
     * Get 输入分析对象内容，输入数据格式参考FileType参数释义 
     * @return FileContent 输入分析对象内容，输入数据格式参考FileType参数释义
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 输入分析对象内容，输入数据格式参考FileType参数释义
     * @param FileContent 输入分析对象内容，输入数据格式参考FileType参数释义
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址，picture: 图片二进制数据的BASE64编码 
     * @return FileType 输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址，picture: 图片二进制数据的BASE64编码
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址，picture: 图片二进制数据的BASE64编码
     * @param FileType 输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址，picture: 图片二进制数据的BASE64编码
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

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
     * Get 查询人员库列表，可填写老师的注册照所在人员库 
     * @return LibrarySet 查询人员库列表，可填写老师的注册照所在人员库
     */
    public String [] getLibrarySet() {
        return this.LibrarySet;
    }

    /**
     * Set 查询人员库列表，可填写老师的注册照所在人员库
     * @param LibrarySet 查询人员库列表，可填写老师的注册照所在人员库
     */
    public void setLibrarySet(String [] LibrarySet) {
        this.LibrarySet = LibrarySet;
    }

    /**
     * Get 视频评估时间，单位秒，点播场景默认值为2小时（无法探测长度时）或完整视频，直播场景默认值为10分钟或直播提前结束 
     * @return MaxVideoDuration 视频评估时间，单位秒，点播场景默认值为2小时（无法探测长度时）或完整视频，直播场景默认值为10分钟或直播提前结束
     */
    public Long getMaxVideoDuration() {
        return this.MaxVideoDuration;
    }

    /**
     * Set 视频评估时间，单位秒，点播场景默认值为2小时（无法探测长度时）或完整视频，直播场景默认值为10分钟或直播提前结束
     * @param MaxVideoDuration 视频评估时间，单位秒，点播场景默认值为2小时（无法探测长度时）或完整视频，直播场景默认值为10分钟或直播提前结束
     */
    public void setMaxVideoDuration(Long MaxVideoDuration) {
        this.MaxVideoDuration = MaxVideoDuration;
    }

    /**
     * Get 识别词库名列表，这些词汇库用来维护关键词，评估老师授课过程中，对这些关键词的使用情况 
     * @return VocabLibNameList 识别词库名列表，这些词汇库用来维护关键词，评估老师授课过程中，对这些关键词的使用情况
     */
    public String [] getVocabLibNameList() {
        return this.VocabLibNameList;
    }

    /**
     * Set 识别词库名列表，这些词汇库用来维护关键词，评估老师授课过程中，对这些关键词的使用情况
     * @param VocabLibNameList 识别词库名列表，这些词汇库用来维护关键词，评估老师授课过程中，对这些关键词的使用情况
     */
    public void setVocabLibNameList(String [] VocabLibNameList) {
        this.VocabLibNameList = VocabLibNameList;
    }

    /**
     * Get 语音编码类型 1:pcm，当FileType为vod_url或live_url时为必填 
     * @return VoiceEncodeType 语音编码类型 1:pcm，当FileType为vod_url或live_url时为必填
     */
    public Long getVoiceEncodeType() {
        return this.VoiceEncodeType;
    }

    /**
     * Set 语音编码类型 1:pcm，当FileType为vod_url或live_url时为必填
     * @param VoiceEncodeType 语音编码类型 1:pcm，当FileType为vod_url或live_url时为必填
     */
    public void setVoiceEncodeType(Long VoiceEncodeType) {
        this.VoiceEncodeType = VoiceEncodeType;
    }

    /**
     * Get 语音文件类型 10:视频（三种音频格式目前仅支持16k采样率16bit），当FileType为vod_url或live_url时为必填 
     * @return VoiceFileType 语音文件类型 10:视频（三种音频格式目前仅支持16k采样率16bit），当FileType为vod_url或live_url时为必填
     */
    public Long getVoiceFileType() {
        return this.VoiceFileType;
    }

    /**
     * Set 语音文件类型 10:视频（三种音频格式目前仅支持16k采样率16bit），当FileType为vod_url或live_url时为必填
     * @param VoiceFileType 语音文件类型 10:视频（三种音频格式目前仅支持16k采样率16bit），当FileType为vod_url或live_url时为必填
     */
    public void setVoiceFileType(Long VoiceFileType) {
        this.VoiceFileType = VoiceFileType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamArraySimple(map, prefix + "LibrarySet.", this.LibrarySet);
        this.setParamSimple(map, prefix + "MaxVideoDuration", this.MaxVideoDuration);
        this.setParamArraySimple(map, prefix + "VocabLibNameList.", this.VocabLibNameList);
        this.setParamSimple(map, prefix + "VoiceEncodeType", this.VoiceEncodeType);
        this.setParamSimple(map, prefix + "VoiceFileType", this.VoiceFileType);

    }
}

