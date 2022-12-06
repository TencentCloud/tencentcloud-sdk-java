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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePublishCdnStreamRequest extends AbstractModel{

    /**
    * TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和转推的房间所对应的SdkAppId相同。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 唯一标识转推任务。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。
    */
    @SerializedName("SequenceNumber")
    @Expose
    private Long SequenceNumber;

    /**
    * 是否转码，0表示无需转码，1表示需要转码。
    */
    @SerializedName("WithTranscoding")
    @Expose
    private Long WithTranscoding;

    /**
    * 更新相关参数，只支持更新参与混音的主播列表参数。不填表示不更新此参数。
    */
    @SerializedName("AudioParams")
    @Expose
    private McuAudioParams AudioParams;

    /**
    * 更新视频相关参数，转码时支持更新除编码类型之外的编码参数，视频布局参数，背景图片和背景颜色参数，水印参数。不填表示不更新此参数。
    */
    @SerializedName("VideoParams")
    @Expose
    private McuVideoParams VideoParams;

    /**
    * 更新单流转推的用户上行参数，仅在非转码时有效。不填表示不更新此参数。
    */
    @SerializedName("SingleSubscribeParams")
    @Expose
    private SingleSubscribeParams SingleSubscribeParams;

    /**
    * 更新转推的CDN参数。不填表示不更新此参数。
    */
    @SerializedName("PublishCdnParams")
    @Expose
    private McuPublishCdnParam [] PublishCdnParams;

    /**
    * 混流SEI参数
    */
    @SerializedName("SeiParams")
    @Expose
    private McuSeiParams SeiParams;

    /**
    * 回推房间信息
    */
    @SerializedName("FeedBackRoomParams")
    @Expose
    private McuFeedBackRoomParams [] FeedBackRoomParams;

    /**
     * Get TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和转推的房间所对应的SdkAppId相同。 
     * @return SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和转推的房间所对应的SdkAppId相同。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和转推的房间所对应的SdkAppId相同。
     * @param SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和转推的房间所对应的SdkAppId相同。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 唯一标识转推任务。 
     * @return TaskId 唯一标识转推任务。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 唯一标识转推任务。
     * @param TaskId 唯一标识转推任务。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。 
     * @return SequenceNumber 客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。
     */
    public Long getSequenceNumber() {
        return this.SequenceNumber;
    }

    /**
     * Set 客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。
     * @param SequenceNumber 客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。
     */
    public void setSequenceNumber(Long SequenceNumber) {
        this.SequenceNumber = SequenceNumber;
    }

    /**
     * Get 是否转码，0表示无需转码，1表示需要转码。 
     * @return WithTranscoding 是否转码，0表示无需转码，1表示需要转码。
     */
    public Long getWithTranscoding() {
        return this.WithTranscoding;
    }

    /**
     * Set 是否转码，0表示无需转码，1表示需要转码。
     * @param WithTranscoding 是否转码，0表示无需转码，1表示需要转码。
     */
    public void setWithTranscoding(Long WithTranscoding) {
        this.WithTranscoding = WithTranscoding;
    }

    /**
     * Get 更新相关参数，只支持更新参与混音的主播列表参数。不填表示不更新此参数。 
     * @return AudioParams 更新相关参数，只支持更新参与混音的主播列表参数。不填表示不更新此参数。
     */
    public McuAudioParams getAudioParams() {
        return this.AudioParams;
    }

    /**
     * Set 更新相关参数，只支持更新参与混音的主播列表参数。不填表示不更新此参数。
     * @param AudioParams 更新相关参数，只支持更新参与混音的主播列表参数。不填表示不更新此参数。
     */
    public void setAudioParams(McuAudioParams AudioParams) {
        this.AudioParams = AudioParams;
    }

    /**
     * Get 更新视频相关参数，转码时支持更新除编码类型之外的编码参数，视频布局参数，背景图片和背景颜色参数，水印参数。不填表示不更新此参数。 
     * @return VideoParams 更新视频相关参数，转码时支持更新除编码类型之外的编码参数，视频布局参数，背景图片和背景颜色参数，水印参数。不填表示不更新此参数。
     */
    public McuVideoParams getVideoParams() {
        return this.VideoParams;
    }

    /**
     * Set 更新视频相关参数，转码时支持更新除编码类型之外的编码参数，视频布局参数，背景图片和背景颜色参数，水印参数。不填表示不更新此参数。
     * @param VideoParams 更新视频相关参数，转码时支持更新除编码类型之外的编码参数，视频布局参数，背景图片和背景颜色参数，水印参数。不填表示不更新此参数。
     */
    public void setVideoParams(McuVideoParams VideoParams) {
        this.VideoParams = VideoParams;
    }

    /**
     * Get 更新单流转推的用户上行参数，仅在非转码时有效。不填表示不更新此参数。 
     * @return SingleSubscribeParams 更新单流转推的用户上行参数，仅在非转码时有效。不填表示不更新此参数。
     */
    public SingleSubscribeParams getSingleSubscribeParams() {
        return this.SingleSubscribeParams;
    }

    /**
     * Set 更新单流转推的用户上行参数，仅在非转码时有效。不填表示不更新此参数。
     * @param SingleSubscribeParams 更新单流转推的用户上行参数，仅在非转码时有效。不填表示不更新此参数。
     */
    public void setSingleSubscribeParams(SingleSubscribeParams SingleSubscribeParams) {
        this.SingleSubscribeParams = SingleSubscribeParams;
    }

    /**
     * Get 更新转推的CDN参数。不填表示不更新此参数。 
     * @return PublishCdnParams 更新转推的CDN参数。不填表示不更新此参数。
     */
    public McuPublishCdnParam [] getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set 更新转推的CDN参数。不填表示不更新此参数。
     * @param PublishCdnParams 更新转推的CDN参数。不填表示不更新此参数。
     */
    public void setPublishCdnParams(McuPublishCdnParam [] PublishCdnParams) {
        this.PublishCdnParams = PublishCdnParams;
    }

    /**
     * Get 混流SEI参数 
     * @return SeiParams 混流SEI参数
     */
    public McuSeiParams getSeiParams() {
        return this.SeiParams;
    }

    /**
     * Set 混流SEI参数
     * @param SeiParams 混流SEI参数
     */
    public void setSeiParams(McuSeiParams SeiParams) {
        this.SeiParams = SeiParams;
    }

    /**
     * Get 回推房间信息 
     * @return FeedBackRoomParams 回推房间信息
     */
    public McuFeedBackRoomParams [] getFeedBackRoomParams() {
        return this.FeedBackRoomParams;
    }

    /**
     * Set 回推房间信息
     * @param FeedBackRoomParams 回推房间信息
     */
    public void setFeedBackRoomParams(McuFeedBackRoomParams [] FeedBackRoomParams) {
        this.FeedBackRoomParams = FeedBackRoomParams;
    }

    public UpdatePublishCdnStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePublishCdnStreamRequest(UpdatePublishCdnStreamRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SequenceNumber != null) {
            this.SequenceNumber = new Long(source.SequenceNumber);
        }
        if (source.WithTranscoding != null) {
            this.WithTranscoding = new Long(source.WithTranscoding);
        }
        if (source.AudioParams != null) {
            this.AudioParams = new McuAudioParams(source.AudioParams);
        }
        if (source.VideoParams != null) {
            this.VideoParams = new McuVideoParams(source.VideoParams);
        }
        if (source.SingleSubscribeParams != null) {
            this.SingleSubscribeParams = new SingleSubscribeParams(source.SingleSubscribeParams);
        }
        if (source.PublishCdnParams != null) {
            this.PublishCdnParams = new McuPublishCdnParam[source.PublishCdnParams.length];
            for (int i = 0; i < source.PublishCdnParams.length; i++) {
                this.PublishCdnParams[i] = new McuPublishCdnParam(source.PublishCdnParams[i]);
            }
        }
        if (source.SeiParams != null) {
            this.SeiParams = new McuSeiParams(source.SeiParams);
        }
        if (source.FeedBackRoomParams != null) {
            this.FeedBackRoomParams = new McuFeedBackRoomParams[source.FeedBackRoomParams.length];
            for (int i = 0; i < source.FeedBackRoomParams.length; i++) {
                this.FeedBackRoomParams[i] = new McuFeedBackRoomParams(source.FeedBackRoomParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "SequenceNumber", this.SequenceNumber);
        this.setParamSimple(map, prefix + "WithTranscoding", this.WithTranscoding);
        this.setParamObj(map, prefix + "AudioParams.", this.AudioParams);
        this.setParamObj(map, prefix + "VideoParams.", this.VideoParams);
        this.setParamObj(map, prefix + "SingleSubscribeParams.", this.SingleSubscribeParams);
        this.setParamArrayObj(map, prefix + "PublishCdnParams.", this.PublishCdnParams);
        this.setParamObj(map, prefix + "SeiParams.", this.SeiParams);
        this.setParamArrayObj(map, prefix + "FeedBackRoomParams.", this.FeedBackRoomParams);

    }
}

