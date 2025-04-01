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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartPublishLiveStreamRequest extends AbstractModel {

    /**
    * 是否转码，0表示无需转码，1表示需要转码。是否收取转码费是由WithTranscoding参数决定的，WithTranscoding为0，表示旁路转推，不会收取转码费用，WithTranscoding为1，表示混流转推，会收取转码费用。 示例值：1
    */
    @SerializedName("WithTranscoding")
    @Expose
    private Long WithTranscoding;

    /**
    * 所有参与混流转推的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转推，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * 转推视频参数
    */
    @SerializedName("VideoParams")
    @Expose
    private VideoParams VideoParams;

    /**
    * 转推的URL参数，一个任务最多支持10个推流URL
    */
    @SerializedName("PublishParams")
    @Expose
    private PublishParams [] PublishParams;

    /**
     * Get 是否转码，0表示无需转码，1表示需要转码。是否收取转码费是由WithTranscoding参数决定的，WithTranscoding为0，表示旁路转推，不会收取转码费用，WithTranscoding为1，表示混流转推，会收取转码费用。 示例值：1 
     * @return WithTranscoding 是否转码，0表示无需转码，1表示需要转码。是否收取转码费是由WithTranscoding参数决定的，WithTranscoding为0，表示旁路转推，不会收取转码费用，WithTranscoding为1，表示混流转推，会收取转码费用。 示例值：1
     */
    public Long getWithTranscoding() {
        return this.WithTranscoding;
    }

    /**
     * Set 是否转码，0表示无需转码，1表示需要转码。是否收取转码费是由WithTranscoding参数决定的，WithTranscoding为0，表示旁路转推，不会收取转码费用，WithTranscoding为1，表示混流转推，会收取转码费用。 示例值：1
     * @param WithTranscoding 是否转码，0表示无需转码，1表示需要转码。是否收取转码费是由WithTranscoding参数决定的，WithTranscoding为0，表示旁路转推，不会收取转码费用，WithTranscoding为1，表示混流转推，会收取转码费用。 示例值：1
     */
    public void setWithTranscoding(Long WithTranscoding) {
        this.WithTranscoding = WithTranscoding;
    }

    /**
     * Get 所有参与混流转推的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转推，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。 
     * @return MaxIdleTime 所有参与混流转推的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转推，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set 所有参与混流转推的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转推，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
     * @param MaxIdleTime 所有参与混流转推的主播持续离开TRTC房间或切换成观众超过MaxIdleTime的时长，自动停止转推，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get 转推视频参数 
     * @return VideoParams 转推视频参数
     */
    public VideoParams getVideoParams() {
        return this.VideoParams;
    }

    /**
     * Set 转推视频参数
     * @param VideoParams 转推视频参数
     */
    public void setVideoParams(VideoParams VideoParams) {
        this.VideoParams = VideoParams;
    }

    /**
     * Get 转推的URL参数，一个任务最多支持10个推流URL 
     * @return PublishParams 转推的URL参数，一个任务最多支持10个推流URL
     */
    public PublishParams [] getPublishParams() {
        return this.PublishParams;
    }

    /**
     * Set 转推的URL参数，一个任务最多支持10个推流URL
     * @param PublishParams 转推的URL参数，一个任务最多支持10个推流URL
     */
    public void setPublishParams(PublishParams [] PublishParams) {
        this.PublishParams = PublishParams;
    }

    public StartPublishLiveStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartPublishLiveStreamRequest(StartPublishLiveStreamRequest source) {
        if (source.WithTranscoding != null) {
            this.WithTranscoding = new Long(source.WithTranscoding);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.VideoParams != null) {
            this.VideoParams = new VideoParams(source.VideoParams);
        }
        if (source.PublishParams != null) {
            this.PublishParams = new PublishParams[source.PublishParams.length];
            for (int i = 0; i < source.PublishParams.length; i++) {
                this.PublishParams[i] = new PublishParams(source.PublishParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WithTranscoding", this.WithTranscoding);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamObj(map, prefix + "VideoParams.", this.VideoParams);
        this.setParamArrayObj(map, prefix + "PublishParams.", this.PublishParams);

    }
}

