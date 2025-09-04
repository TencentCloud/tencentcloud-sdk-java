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

public class SliceParams extends AbstractModel {

    /**
    * 切片任务类型:
1:音频切片；
2:视频截帧；
3:音视切片+视频截帧
示例值：1 
    */
    @SerializedName("SliceType")
    @Expose
    private Long SliceType;

    /**
    * 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
示例值：30
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * 音频切片时长，默认15s 示例值：15
取值范围15-60s
    */
    @SerializedName("SliceAudio")
    @Expose
    private Long SliceAudio;

    /**
    * 视频截帧间隔时长，默认5s， 示例值：5 取值范围5-60s
    */
    @SerializedName("SliceVideo")
    @Expose
    private Long SliceVideo;

    /**
    * 指定订阅流白名单或者黑名单。
    */
    @SerializedName("SubscribeStreamUserIds")
    @Expose
    private SubscribeStreamUserIds SubscribeStreamUserIds;

    /**
    * 已废弃，从控制台配置回调url
    */
    @SerializedName("SliceCallbackUrl")
    @Expose
    private String SliceCallbackUrl;

    /**
     * Get 切片任务类型:
1:音频切片；
2:视频截帧；
3:音视切片+视频截帧
示例值：1  
     * @return SliceType 切片任务类型:
1:音频切片；
2:视频截帧；
3:音视切片+视频截帧
示例值：1 
     */
    public Long getSliceType() {
        return this.SliceType;
    }

    /**
     * Set 切片任务类型:
1:音频切片；
2:视频截帧；
3:音视切片+视频截帧
示例值：1 
     * @param SliceType 切片任务类型:
1:音频切片；
2:视频截帧；
3:音视切片+视频截帧
示例值：1 
     */
    public void setSliceType(Long SliceType) {
        this.SliceType = SliceType;
    }

    /**
     * Get 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
示例值：30 
     * @return MaxIdleTime 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
示例值：30
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
示例值：30
     * @param MaxIdleTime 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
示例值：30
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get 音频切片时长，默认15s 示例值：15
取值范围15-60s 
     * @return SliceAudio 音频切片时长，默认15s 示例值：15
取值范围15-60s
     */
    public Long getSliceAudio() {
        return this.SliceAudio;
    }

    /**
     * Set 音频切片时长，默认15s 示例值：15
取值范围15-60s
     * @param SliceAudio 音频切片时长，默认15s 示例值：15
取值范围15-60s
     */
    public void setSliceAudio(Long SliceAudio) {
        this.SliceAudio = SliceAudio;
    }

    /**
     * Get 视频截帧间隔时长，默认5s， 示例值：5 取值范围5-60s 
     * @return SliceVideo 视频截帧间隔时长，默认5s， 示例值：5 取值范围5-60s
     */
    public Long getSliceVideo() {
        return this.SliceVideo;
    }

    /**
     * Set 视频截帧间隔时长，默认5s， 示例值：5 取值范围5-60s
     * @param SliceVideo 视频截帧间隔时长，默认5s， 示例值：5 取值范围5-60s
     */
    public void setSliceVideo(Long SliceVideo) {
        this.SliceVideo = SliceVideo;
    }

    /**
     * Get 指定订阅流白名单或者黑名单。 
     * @return SubscribeStreamUserIds 指定订阅流白名单或者黑名单。
     */
    public SubscribeStreamUserIds getSubscribeStreamUserIds() {
        return this.SubscribeStreamUserIds;
    }

    /**
     * Set 指定订阅流白名单或者黑名单。
     * @param SubscribeStreamUserIds 指定订阅流白名单或者黑名单。
     */
    public void setSubscribeStreamUserIds(SubscribeStreamUserIds SubscribeStreamUserIds) {
        this.SubscribeStreamUserIds = SubscribeStreamUserIds;
    }

    /**
     * Get 已废弃，从控制台配置回调url 
     * @return SliceCallbackUrl 已废弃，从控制台配置回调url
     */
    public String getSliceCallbackUrl() {
        return this.SliceCallbackUrl;
    }

    /**
     * Set 已废弃，从控制台配置回调url
     * @param SliceCallbackUrl 已废弃，从控制台配置回调url
     */
    public void setSliceCallbackUrl(String SliceCallbackUrl) {
        this.SliceCallbackUrl = SliceCallbackUrl;
    }

    public SliceParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SliceParams(SliceParams source) {
        if (source.SliceType != null) {
            this.SliceType = new Long(source.SliceType);
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
        if (source.SubscribeStreamUserIds != null) {
            this.SubscribeStreamUserIds = new SubscribeStreamUserIds(source.SubscribeStreamUserIds);
        }
        if (source.SliceCallbackUrl != null) {
            this.SliceCallbackUrl = new String(source.SliceCallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SliceType", this.SliceType);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "SliceAudio", this.SliceAudio);
        this.setParamSimple(map, prefix + "SliceVideo", this.SliceVideo);
        this.setParamObj(map, prefix + "SubscribeStreamUserIds.", this.SubscribeStreamUserIds);
        this.setParamSimple(map, prefix + "SliceCallbackUrl", this.SliceCallbackUrl);

    }
}

