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

public class SubmitOneByOneClassTaskRequest  extends AbstractModel{

    /**
    * 输入分析对象内容
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
    * 查询人员库列表，可填写学生的注册照所在人员库
    */
    @SerializedName("LibrarySet")
    @Expose
    private String [] LibrarySet;

    /**
    * 直播流评估时间，在FileType为live_url时生效，默认值为10分钟。
    */
    @SerializedName("MaxVideoDuration")
    @Expose
    private Long MaxVideoDuration;

    /**
    * 识别词库名列表，这些词汇库用来维护关键词，评估学生对这些关键词的使用情况
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
    * 语音文件类型10:视频（三种音频格式目前仅支持16k采样率16bit），当FileType为vod_url或live_url时为必填
    */
    @SerializedName("VoiceFileType")
    @Expose
    private Long VoiceFileType;

    /**
     * 获取输入分析对象内容
     * @return FileContent 输入分析对象内容
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * 设置输入分析对象内容
     * @param FileContent 输入分析对象内容
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * 获取输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址，picture: 图片二进制数据的BASE64编码
     * @return FileType 输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址，picture: 图片二进制数据的BASE64编码
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * 设置输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址，picture: 图片二进制数据的BASE64编码
     * @param FileType 输入分析对象类型，picture_url:图片地址，vod_url:视频地址，live_url：直播地址，picture: 图片二进制数据的BASE64编码
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * 获取音频源的语言，默认0为英文，1为中文 
     * @return Lang 音频源的语言，默认0为英文，1为中文 
     */
    public Long getLang() {
        return this.Lang;
    }

    /**
     * 设置音频源的语言，默认0为英文，1为中文 
     * @param Lang 音频源的语言，默认0为英文，1为中文 
     */
    public void setLang(Long Lang) {
        this.Lang = Lang;
    }

    /**
     * 获取查询人员库列表，可填写学生的注册照所在人员库
     * @return LibrarySet 查询人员库列表，可填写学生的注册照所在人员库
     */
    public String [] getLibrarySet() {
        return this.LibrarySet;
    }

    /**
     * 设置查询人员库列表，可填写学生的注册照所在人员库
     * @param LibrarySet 查询人员库列表，可填写学生的注册照所在人员库
     */
    public void setLibrarySet(String [] LibrarySet) {
        this.LibrarySet = LibrarySet;
    }

    /**
     * 获取直播流评估时间，在FileType为live_url时生效，默认值为10分钟。
     * @return MaxVideoDuration 直播流评估时间，在FileType为live_url时生效，默认值为10分钟。
     */
    public Long getMaxVideoDuration() {
        return this.MaxVideoDuration;
    }

    /**
     * 设置直播流评估时间，在FileType为live_url时生效，默认值为10分钟。
     * @param MaxVideoDuration 直播流评估时间，在FileType为live_url时生效，默认值为10分钟。
     */
    public void setMaxVideoDuration(Long MaxVideoDuration) {
        this.MaxVideoDuration = MaxVideoDuration;
    }

    /**
     * 获取识别词库名列表，这些词汇库用来维护关键词，评估学生对这些关键词的使用情况
     * @return VocabLibNameList 识别词库名列表，这些词汇库用来维护关键词，评估学生对这些关键词的使用情况
     */
    public String [] getVocabLibNameList() {
        return this.VocabLibNameList;
    }

    /**
     * 设置识别词库名列表，这些词汇库用来维护关键词，评估学生对这些关键词的使用情况
     * @param VocabLibNameList 识别词库名列表，这些词汇库用来维护关键词，评估学生对这些关键词的使用情况
     */
    public void setVocabLibNameList(String [] VocabLibNameList) {
        this.VocabLibNameList = VocabLibNameList;
    }

    /**
     * 获取语音编码类型 1:pcm，当FileType为vod_url或live_url时为必填
     * @return VoiceEncodeType 语音编码类型 1:pcm，当FileType为vod_url或live_url时为必填
     */
    public Long getVoiceEncodeType() {
        return this.VoiceEncodeType;
    }

    /**
     * 设置语音编码类型 1:pcm，当FileType为vod_url或live_url时为必填
     * @param VoiceEncodeType 语音编码类型 1:pcm，当FileType为vod_url或live_url时为必填
     */
    public void setVoiceEncodeType(Long VoiceEncodeType) {
        this.VoiceEncodeType = VoiceEncodeType;
    }

    /**
     * 获取语音文件类型10:视频（三种音频格式目前仅支持16k采样率16bit），当FileType为vod_url或live_url时为必填
     * @return VoiceFileType 语音文件类型10:视频（三种音频格式目前仅支持16k采样率16bit），当FileType为vod_url或live_url时为必填
     */
    public Long getVoiceFileType() {
        return this.VoiceFileType;
    }

    /**
     * 设置语音文件类型10:视频（三种音频格式目前仅支持16k采样率16bit），当FileType为vod_url或live_url时为必填
     * @param VoiceFileType 语音文件类型10:视频（三种音频格式目前仅支持16k采样率16bit），当FileType为vod_url或live_url时为必填
     */
    public void setVoiceFileType(Long VoiceFileType) {
        this.VoiceFileType = VoiceFileType;
    }

    /**
     * 内部实现，用户禁止调用
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

