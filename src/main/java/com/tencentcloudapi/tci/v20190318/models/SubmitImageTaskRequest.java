/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitImageTaskRequest extends AbstractModel {

    /**
    * 输入分析对象内容，输入数据格式参考FileType参数释义
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 输入分析对象类型，picture：二进制图片的 base64 编码字符串，picture_url:图片地址，vod_url：视频地址，live_url：直播地址
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 任务控制选项
    */
    @SerializedName("Functions")
    @Expose
    private ImageTaskFunction Functions;

    /**
    * 光照标准列表
    */
    @SerializedName("LightStandardSet")
    @Expose
    private LightStandard [] LightStandardSet;

    /**
    * 结果更新回调地址。
    */
    @SerializedName("EventsCallBack")
    @Expose
    private String EventsCallBack;

    /**
    * 抽帧的时间间隔，单位毫秒，默认值1000，保留字段，当前不支持填写。
    */
    @SerializedName("FrameInterval")
    @Expose
    private Long FrameInterval;

    /**
    * 查询人员库列表
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
    * 人脸识别中的相似度阈值，默认值为0.89，保留字段，当前不支持填写。
    */
    @SerializedName("SimThreshold")
    @Expose
    private Float SimThreshold;

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
     * Get 输入分析对象类型，picture：二进制图片的 base64 编码字符串，picture_url:图片地址，vod_url：视频地址，live_url：直播地址 
     * @return FileType 输入分析对象类型，picture：二进制图片的 base64 编码字符串，picture_url:图片地址，vod_url：视频地址，live_url：直播地址
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 输入分析对象类型，picture：二进制图片的 base64 编码字符串，picture_url:图片地址，vod_url：视频地址，live_url：直播地址
     * @param FileType 输入分析对象类型，picture：二进制图片的 base64 编码字符串，picture_url:图片地址，vod_url：视频地址，live_url：直播地址
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 任务控制选项 
     * @return Functions 任务控制选项
     */
    public ImageTaskFunction getFunctions() {
        return this.Functions;
    }

    /**
     * Set 任务控制选项
     * @param Functions 任务控制选项
     */
    public void setFunctions(ImageTaskFunction Functions) {
        this.Functions = Functions;
    }

    /**
     * Get 光照标准列表 
     * @return LightStandardSet 光照标准列表
     */
    public LightStandard [] getLightStandardSet() {
        return this.LightStandardSet;
    }

    /**
     * Set 光照标准列表
     * @param LightStandardSet 光照标准列表
     */
    public void setLightStandardSet(LightStandard [] LightStandardSet) {
        this.LightStandardSet = LightStandardSet;
    }

    /**
     * Get 结果更新回调地址。 
     * @return EventsCallBack 结果更新回调地址。
     */
    public String getEventsCallBack() {
        return this.EventsCallBack;
    }

    /**
     * Set 结果更新回调地址。
     * @param EventsCallBack 结果更新回调地址。
     */
    public void setEventsCallBack(String EventsCallBack) {
        this.EventsCallBack = EventsCallBack;
    }

    /**
     * Get 抽帧的时间间隔，单位毫秒，默认值1000，保留字段，当前不支持填写。 
     * @return FrameInterval 抽帧的时间间隔，单位毫秒，默认值1000，保留字段，当前不支持填写。
     */
    public Long getFrameInterval() {
        return this.FrameInterval;
    }

    /**
     * Set 抽帧的时间间隔，单位毫秒，默认值1000，保留字段，当前不支持填写。
     * @param FrameInterval 抽帧的时间间隔，单位毫秒，默认值1000，保留字段，当前不支持填写。
     */
    public void setFrameInterval(Long FrameInterval) {
        this.FrameInterval = FrameInterval;
    }

    /**
     * Get 查询人员库列表 
     * @return LibrarySet 查询人员库列表
     */
    public String [] getLibrarySet() {
        return this.LibrarySet;
    }

    /**
     * Set 查询人员库列表
     * @param LibrarySet 查询人员库列表
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
     * Get 人脸识别中的相似度阈值，默认值为0.89，保留字段，当前不支持填写。 
     * @return SimThreshold 人脸识别中的相似度阈值，默认值为0.89，保留字段，当前不支持填写。
     */
    public Float getSimThreshold() {
        return this.SimThreshold;
    }

    /**
     * Set 人脸识别中的相似度阈值，默认值为0.89，保留字段，当前不支持填写。
     * @param SimThreshold 人脸识别中的相似度阈值，默认值为0.89，保留字段，当前不支持填写。
     */
    public void setSimThreshold(Float SimThreshold) {
        this.SimThreshold = SimThreshold;
    }

    public SubmitImageTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitImageTaskRequest(SubmitImageTaskRequest source) {
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Functions != null) {
            this.Functions = new ImageTaskFunction(source.Functions);
        }
        if (source.LightStandardSet != null) {
            this.LightStandardSet = new LightStandard[source.LightStandardSet.length];
            for (int i = 0; i < source.LightStandardSet.length; i++) {
                this.LightStandardSet[i] = new LightStandard(source.LightStandardSet[i]);
            }
        }
        if (source.EventsCallBack != null) {
            this.EventsCallBack = new String(source.EventsCallBack);
        }
        if (source.FrameInterval != null) {
            this.FrameInterval = new Long(source.FrameInterval);
        }
        if (source.LibrarySet != null) {
            this.LibrarySet = new String[source.LibrarySet.length];
            for (int i = 0; i < source.LibrarySet.length; i++) {
                this.LibrarySet[i] = new String(source.LibrarySet[i]);
            }
        }
        if (source.MaxVideoDuration != null) {
            this.MaxVideoDuration = new Long(source.MaxVideoDuration);
        }
        if (source.SimThreshold != null) {
            this.SimThreshold = new Float(source.SimThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamObj(map, prefix + "Functions.", this.Functions);
        this.setParamArrayObj(map, prefix + "LightStandardSet.", this.LightStandardSet);
        this.setParamSimple(map, prefix + "EventsCallBack", this.EventsCallBack);
        this.setParamSimple(map, prefix + "FrameInterval", this.FrameInterval);
        this.setParamArraySimple(map, prefix + "LibrarySet.", this.LibrarySet);
        this.setParamSimple(map, prefix + "MaxVideoDuration", this.MaxVideoDuration);
        this.setParamSimple(map, prefix + "SimThreshold", this.SimThreshold);

    }
}

