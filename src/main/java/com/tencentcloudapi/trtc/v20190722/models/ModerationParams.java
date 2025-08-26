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
    * 审核任务类型， 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核4:音频流式审核 5:音频流式+视频截帧审核  默认值1 （流式审核需要供应商支持才生效）
    */
    @SerializedName("ModerationType")
    @Expose
    private Long ModerationType;

    /**
    * 房间内持续没有用户（主播）上行推流的状态超过MaxIdleTime的时长，自动停止切片，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于1800秒(0.5小时)。示例值：30 
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * 音频切片时长，默认15s 示例值：15
    */
    @SerializedName("SliceAudio")
    @Expose
    private Long SliceAudio;

    /**
    * 视频截帧间隔时长，默认5s
    */
    @SerializedName("SliceVideo")
    @Expose
    private Long SliceVideo;

    /**
    * 供应商枚举，
tianyu : 天御内容安全 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
ace  : ACE内容安全 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
shumei : 数美审核（支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
yidun : 网易易盾审核 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
    */
    @SerializedName("ModerationSupplier")
    @Expose
    private String ModerationSupplier;

    /**
    * 第三方审核商送审需要配置信息
    */
    @SerializedName("ModerationSupplierParam")
    @Expose
    private ModerationSupplierParam ModerationSupplierParam;

    /**
    * 是否保存文件  0不保存文件 1保存所有文件 2仅保存命中文件
    */
    @SerializedName("SaveModerationFile")
    @Expose
    private Long SaveModerationFile;

    /**
    * 是否回调所有审核结果:0 默认回调所有结果 1 仅回调命中结果 
    */
    @SerializedName("CallbackAllResults")
    @Expose
    private Long CallbackAllResults;

    /**
    * 指定订阅流白名单或者黑名单。
    */
    @SerializedName("SubscribeStreamUserIds")
    @Expose
    private SubscribeModerationUserIds SubscribeStreamUserIds;

    /**
     * Get 审核任务类型， 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核4:音频流式审核 5:音频流式+视频截帧审核  默认值1 （流式审核需要供应商支持才生效） 
     * @return ModerationType 审核任务类型， 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核4:音频流式审核 5:音频流式+视频截帧审核  默认值1 （流式审核需要供应商支持才生效）
     */
    public Long getModerationType() {
        return this.ModerationType;
    }

    /**
     * Set 审核任务类型， 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核4:音频流式审核 5:音频流式+视频截帧审核  默认值1 （流式审核需要供应商支持才生效）
     * @param ModerationType 审核任务类型， 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核4:音频流式审核 5:音频流式+视频截帧审核  默认值1 （流式审核需要供应商支持才生效）
     */
    public void setModerationType(Long ModerationType) {
        this.ModerationType = ModerationType;
    }

    /**
     * Get 房间内持续没有用户（主播）上行推流的状态超过MaxIdleTime的时长，自动停止切片，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于1800秒(0.5小时)。示例值：30  
     * @return MaxIdleTime 房间内持续没有用户（主播）上行推流的状态超过MaxIdleTime的时长，自动停止切片，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于1800秒(0.5小时)。示例值：30 
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set 房间内持续没有用户（主播）上行推流的状态超过MaxIdleTime的时长，自动停止切片，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于1800秒(0.5小时)。示例值：30 
     * @param MaxIdleTime 房间内持续没有用户（主播）上行推流的状态超过MaxIdleTime的时长，自动停止切片，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于1800秒(0.5小时)。示例值：30 
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get 音频切片时长，默认15s 示例值：15 
     * @return SliceAudio 音频切片时长，默认15s 示例值：15
     */
    public Long getSliceAudio() {
        return this.SliceAudio;
    }

    /**
     * Set 音频切片时长，默认15s 示例值：15
     * @param SliceAudio 音频切片时长，默认15s 示例值：15
     */
    public void setSliceAudio(Long SliceAudio) {
        this.SliceAudio = SliceAudio;
    }

    /**
     * Get 视频截帧间隔时长，默认5s 
     * @return SliceVideo 视频截帧间隔时长，默认5s
     */
    public Long getSliceVideo() {
        return this.SliceVideo;
    }

    /**
     * Set 视频截帧间隔时长，默认5s
     * @param SliceVideo 视频截帧间隔时长，默认5s
     */
    public void setSliceVideo(Long SliceVideo) {
        this.SliceVideo = SliceVideo;
    }

    /**
     * Get 供应商枚举，
tianyu : 天御内容安全 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
ace  : ACE内容安全 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
shumei : 数美审核（支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
yidun : 网易易盾审核 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核） 
     * @return ModerationSupplier 供应商枚举，
tianyu : 天御内容安全 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
ace  : ACE内容安全 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
shumei : 数美审核（支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
yidun : 网易易盾审核 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
     */
    public String getModerationSupplier() {
        return this.ModerationSupplier;
    }

    /**
     * Set 供应商枚举，
tianyu : 天御内容安全 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
ace  : ACE内容安全 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
shumei : 数美审核（支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
yidun : 网易易盾审核 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
     * @param ModerationSupplier 供应商枚举，
tianyu : 天御内容安全 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
ace  : ACE内容安全 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
shumei : 数美审核（支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
yidun : 网易易盾审核 （支持 1:音频切片审核，2:视频截帧审核，3:音视切片审核+视频截帧审核）
     */
    public void setModerationSupplier(String ModerationSupplier) {
        this.ModerationSupplier = ModerationSupplier;
    }

    /**
     * Get 第三方审核商送审需要配置信息 
     * @return ModerationSupplierParam 第三方审核商送审需要配置信息
     */
    public ModerationSupplierParam getModerationSupplierParam() {
        return this.ModerationSupplierParam;
    }

    /**
     * Set 第三方审核商送审需要配置信息
     * @param ModerationSupplierParam 第三方审核商送审需要配置信息
     */
    public void setModerationSupplierParam(ModerationSupplierParam ModerationSupplierParam) {
        this.ModerationSupplierParam = ModerationSupplierParam;
    }

    /**
     * Get 是否保存文件  0不保存文件 1保存所有文件 2仅保存命中文件 
     * @return SaveModerationFile 是否保存文件  0不保存文件 1保存所有文件 2仅保存命中文件
     */
    public Long getSaveModerationFile() {
        return this.SaveModerationFile;
    }

    /**
     * Set 是否保存文件  0不保存文件 1保存所有文件 2仅保存命中文件
     * @param SaveModerationFile 是否保存文件  0不保存文件 1保存所有文件 2仅保存命中文件
     */
    public void setSaveModerationFile(Long SaveModerationFile) {
        this.SaveModerationFile = SaveModerationFile;
    }

    /**
     * Get 是否回调所有审核结果:0 默认回调所有结果 1 仅回调命中结果  
     * @return CallbackAllResults 是否回调所有审核结果:0 默认回调所有结果 1 仅回调命中结果 
     */
    public Long getCallbackAllResults() {
        return this.CallbackAllResults;
    }

    /**
     * Set 是否回调所有审核结果:0 默认回调所有结果 1 仅回调命中结果 
     * @param CallbackAllResults 是否回调所有审核结果:0 默认回调所有结果 1 仅回调命中结果 
     */
    public void setCallbackAllResults(Long CallbackAllResults) {
        this.CallbackAllResults = CallbackAllResults;
    }

    /**
     * Get 指定订阅流白名单或者黑名单。 
     * @return SubscribeStreamUserIds 指定订阅流白名单或者黑名单。
     */
    public SubscribeModerationUserIds getSubscribeStreamUserIds() {
        return this.SubscribeStreamUserIds;
    }

    /**
     * Set 指定订阅流白名单或者黑名单。
     * @param SubscribeStreamUserIds 指定订阅流白名单或者黑名单。
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

