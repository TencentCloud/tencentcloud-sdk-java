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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModerationParams extends AbstractModel {

    /**
    * <p>AI 内容理解任务类型， 1:音频切片理解，2:视频截帧理解，3:音视切片+视频截帧理解  默认值1 </p><p>枚举值：</p><ul><li>1： 音频切片理解</li></ul>
    */
    @SerializedName("ModerationType")
    @Expose
    private Long ModerationType;

    /**
    * <p>房间内持续没有用户（主播）上行推流的状态超过MaxIdleTime的时长，自动停止切片，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于1800秒(0.5小时)。示例值：30</p>
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * <p>音频切片时长，默认15s 示例值：15, 范围15-60s</p>
    */
    @SerializedName("SliceAudio")
    @Expose
    private Long SliceAudio;

    /**
    * <p>视频截帧间隔时长，默认5s, 范围1-60s</p>
    */
    @SerializedName("SliceVideo")
    @Expose
    private Long SliceVideo;

    /**
    * <p>供应商枚举，<br>trtc : trtc内容理解</p>
    */
    @SerializedName("ModerationSupplier")
    @Expose
    private String ModerationSupplier;

    /**
    * <p>第三方内容理解供应商需要配置信息, ModerationSupplier为trtc时，这个参数可以不需要初始化</p>
    */
    @SerializedName("ModerationSupplierParam")
    @Expose
    private ModerationSupplierParam ModerationSupplierParam;

    /**
    * <p>是否保存文件:  0不保存文件 1保存所有文件 2仅保存命中文件</p>
    */
    @SerializedName("SaveModerationFile")
    @Expose
    private Long SaveModerationFile;

    /**
    * <p>是否回调所有内容理解结果:0 默认回调所有结果 1 仅回调命中结果</p>
    */
    @SerializedName("CallbackAllResults")
    @Expose
    private Long CallbackAllResults;

    /**
    * <p>指定订阅流白名单或者黑名单。</p>
    */
    @SerializedName("SubscribeStreamUserIds")
    @Expose
    private SubscribeModerationUserIds SubscribeStreamUserIds;

    /**
     * Get <p>AI 内容理解任务类型， 1:音频切片理解，2:视频截帧理解，3:音视切片+视频截帧理解  默认值1 </p><p>枚举值：</p><ul><li>1： 音频切片理解</li></ul> 
     * @return ModerationType <p>AI 内容理解任务类型， 1:音频切片理解，2:视频截帧理解，3:音视切片+视频截帧理解  默认值1 </p><p>枚举值：</p><ul><li>1： 音频切片理解</li></ul>
     */
    public Long getModerationType() {
        return this.ModerationType;
    }

    /**
     * Set <p>AI 内容理解任务类型， 1:音频切片理解，2:视频截帧理解，3:音视切片+视频截帧理解  默认值1 </p><p>枚举值：</p><ul><li>1： 音频切片理解</li></ul>
     * @param ModerationType <p>AI 内容理解任务类型， 1:音频切片理解，2:视频截帧理解，3:音视切片+视频截帧理解  默认值1 </p><p>枚举值：</p><ul><li>1： 音频切片理解</li></ul>
     */
    public void setModerationType(Long ModerationType) {
        this.ModerationType = ModerationType;
    }

    /**
     * Get <p>房间内持续没有用户（主播）上行推流的状态超过MaxIdleTime的时长，自动停止切片，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于1800秒(0.5小时)。示例值：30</p> 
     * @return MaxIdleTime <p>房间内持续没有用户（主播）上行推流的状态超过MaxIdleTime的时长，自动停止切片，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于1800秒(0.5小时)。示例值：30</p>
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set <p>房间内持续没有用户（主播）上行推流的状态超过MaxIdleTime的时长，自动停止切片，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于1800秒(0.5小时)。示例值：30</p>
     * @param MaxIdleTime <p>房间内持续没有用户（主播）上行推流的状态超过MaxIdleTime的时长，自动停止切片，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于1800秒(0.5小时)。示例值：30</p>
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get <p>音频切片时长，默认15s 示例值：15, 范围15-60s</p> 
     * @return SliceAudio <p>音频切片时长，默认15s 示例值：15, 范围15-60s</p>
     */
    public Long getSliceAudio() {
        return this.SliceAudio;
    }

    /**
     * Set <p>音频切片时长，默认15s 示例值：15, 范围15-60s</p>
     * @param SliceAudio <p>音频切片时长，默认15s 示例值：15, 范围15-60s</p>
     */
    public void setSliceAudio(Long SliceAudio) {
        this.SliceAudio = SliceAudio;
    }

    /**
     * Get <p>视频截帧间隔时长，默认5s, 范围1-60s</p> 
     * @return SliceVideo <p>视频截帧间隔时长，默认5s, 范围1-60s</p>
     */
    public Long getSliceVideo() {
        return this.SliceVideo;
    }

    /**
     * Set <p>视频截帧间隔时长，默认5s, 范围1-60s</p>
     * @param SliceVideo <p>视频截帧间隔时长，默认5s, 范围1-60s</p>
     */
    public void setSliceVideo(Long SliceVideo) {
        this.SliceVideo = SliceVideo;
    }

    /**
     * Get <p>供应商枚举，<br>trtc : trtc内容理解</p> 
     * @return ModerationSupplier <p>供应商枚举，<br>trtc : trtc内容理解</p>
     */
    public String getModerationSupplier() {
        return this.ModerationSupplier;
    }

    /**
     * Set <p>供应商枚举，<br>trtc : trtc内容理解</p>
     * @param ModerationSupplier <p>供应商枚举，<br>trtc : trtc内容理解</p>
     */
    public void setModerationSupplier(String ModerationSupplier) {
        this.ModerationSupplier = ModerationSupplier;
    }

    /**
     * Get <p>第三方内容理解供应商需要配置信息, ModerationSupplier为trtc时，这个参数可以不需要初始化</p> 
     * @return ModerationSupplierParam <p>第三方内容理解供应商需要配置信息, ModerationSupplier为trtc时，这个参数可以不需要初始化</p>
     */
    public ModerationSupplierParam getModerationSupplierParam() {
        return this.ModerationSupplierParam;
    }

    /**
     * Set <p>第三方内容理解供应商需要配置信息, ModerationSupplier为trtc时，这个参数可以不需要初始化</p>
     * @param ModerationSupplierParam <p>第三方内容理解供应商需要配置信息, ModerationSupplier为trtc时，这个参数可以不需要初始化</p>
     */
    public void setModerationSupplierParam(ModerationSupplierParam ModerationSupplierParam) {
        this.ModerationSupplierParam = ModerationSupplierParam;
    }

    /**
     * Get <p>是否保存文件:  0不保存文件 1保存所有文件 2仅保存命中文件</p> 
     * @return SaveModerationFile <p>是否保存文件:  0不保存文件 1保存所有文件 2仅保存命中文件</p>
     */
    public Long getSaveModerationFile() {
        return this.SaveModerationFile;
    }

    /**
     * Set <p>是否保存文件:  0不保存文件 1保存所有文件 2仅保存命中文件</p>
     * @param SaveModerationFile <p>是否保存文件:  0不保存文件 1保存所有文件 2仅保存命中文件</p>
     */
    public void setSaveModerationFile(Long SaveModerationFile) {
        this.SaveModerationFile = SaveModerationFile;
    }

    /**
     * Get <p>是否回调所有内容理解结果:0 默认回调所有结果 1 仅回调命中结果</p> 
     * @return CallbackAllResults <p>是否回调所有内容理解结果:0 默认回调所有结果 1 仅回调命中结果</p>
     */
    public Long getCallbackAllResults() {
        return this.CallbackAllResults;
    }

    /**
     * Set <p>是否回调所有内容理解结果:0 默认回调所有结果 1 仅回调命中结果</p>
     * @param CallbackAllResults <p>是否回调所有内容理解结果:0 默认回调所有结果 1 仅回调命中结果</p>
     */
    public void setCallbackAllResults(Long CallbackAllResults) {
        this.CallbackAllResults = CallbackAllResults;
    }

    /**
     * Get <p>指定订阅流白名单或者黑名单。</p> 
     * @return SubscribeStreamUserIds <p>指定订阅流白名单或者黑名单。</p>
     */
    public SubscribeModerationUserIds getSubscribeStreamUserIds() {
        return this.SubscribeStreamUserIds;
    }

    /**
     * Set <p>指定订阅流白名单或者黑名单。</p>
     * @param SubscribeStreamUserIds <p>指定订阅流白名单或者黑名单。</p>
     */
    public void setSubscribeStreamUserIds(SubscribeModerationUserIds SubscribeStreamUserIds) {
        this.SubscribeStreamUserIds = SubscribeStreamUserIds;
    }

    public ModerationParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModerationParams(ModerationParams source) {
        if (source.ModerationType != null) {
            this.ModerationType = new Long(source.ModerationType);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.SliceAudio != null) {
            this.SliceAudio = new Long(source.SliceAudio);
        }
        if (source.SliceVideo != null) {
            this.SliceVideo = new Long(source.SliceVideo);
        }
        if (source.ModerationSupplier != null) {
            this.ModerationSupplier = new String(source.ModerationSupplier);
        }
        if (source.ModerationSupplierParam != null) {
            this.ModerationSupplierParam = new ModerationSupplierParam(source.ModerationSupplierParam);
        }
        if (source.SaveModerationFile != null) {
            this.SaveModerationFile = new Long(source.SaveModerationFile);
        }
        if (source.CallbackAllResults != null) {
            this.CallbackAllResults = new Long(source.CallbackAllResults);
        }
        if (source.SubscribeStreamUserIds != null) {
            this.SubscribeStreamUserIds = new SubscribeModerationUserIds(source.SubscribeStreamUserIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModerationType", this.ModerationType);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "SliceAudio", this.SliceAudio);
        this.setParamSimple(map, prefix + "SliceVideo", this.SliceVideo);
        this.setParamSimple(map, prefix + "ModerationSupplier", this.ModerationSupplier);
        this.setParamObj(map, prefix + "ModerationSupplierParam.", this.ModerationSupplierParam);
        this.setParamSimple(map, prefix + "SaveModerationFile", this.SaveModerationFile);
        this.setParamSimple(map, prefix + "CallbackAllResults", this.CallbackAllResults);
        this.setParamObj(map, prefix + "SubscribeStreamUserIds.", this.SubscribeStreamUserIds);

    }
}

