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

public class UpdatePublishCdnStreamRequest extends AbstractModel {

    /**
    * <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和转推的房间所对应的SdkAppId相同。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>唯一标识转推任务。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
    */
    @SerializedName("SequenceNumber")
    @Expose
    private Long SequenceNumber;

    /**
    * <p>是否转码，0表示无需转码，1表示需要转码。 WithTranscoding为0，表示旁路转推，默认不转码；WithTranscoding为1，表示混流转推，此时一定会转码，并收取转码费用。 注： 1，混流是必须转码的，这个参数需设置为1。 2，WithTranscoding=0时，视频输出Codec默认跟随上行视频Codec，如果上行视频Codec发生变化，CDN会断流重推。</p>
    */
    @SerializedName("WithTranscoding")
    @Expose
    private Long WithTranscoding;

    /**
    * <p>更新相关参数，只支持更新参与混音的主播列表参数，不支持更新Codec、采样率、码率和声道数。不填表示不更新此参数。</p>
    */
    @SerializedName("AudioParams")
    @Expose
    private McuAudioParams AudioParams;

    /**
    * <p>更新视频相关参数，转码时支持更新除编码类型之外的编码参数，视频布局参数，背景图片和背景颜色参数，水印参数。不填表示不更新此参数。</p>
    */
    @SerializedName("VideoParams")
    @Expose
    private McuVideoParams VideoParams;

    /**
    * <p>更新单流转推的用户上行参数，仅在非转码时有效。不填表示不更新此参数。</p>
    */
    @SerializedName("SingleSubscribeParams")
    @Expose
    private SingleSubscribeParams SingleSubscribeParams;

    /**
    * <p>更新转推的CDN参数。不填表示不更新此参数。</p>
    */
    @SerializedName("PublishCdnParams")
    @Expose
    private McuPublishCdnParam [] PublishCdnParams;

    /**
    * <p>混流SEI参数</p>
    */
    @SerializedName("SeiParams")
    @Expose
    private McuSeiParams SeiParams;

    /**
    * <p>回推房间信息</p>
    */
    @SerializedName("FeedBackRoomParams")
    @Expose
    private McuFeedBackRoomParams [] FeedBackRoomParams;

    /**
     * Get <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和转推的房间所对应的SdkAppId相同。</p> 
     * @return SdkAppId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和转推的房间所对应的SdkAppId相同。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和转推的房间所对应的SdkAppId相同。</p>
     * @param SdkAppId <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和转推的房间所对应的SdkAppId相同。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>唯一标识转推任务。</p> 
     * @return TaskId <p>唯一标识转推任务。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>唯一标识转推任务。</p>
     * @param TaskId <p>唯一标识转推任务。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p> 
     * @return SequenceNumber <p>客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
     */
    public Long getSequenceNumber() {
        return this.SequenceNumber;
    }

    /**
     * Set <p>客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
     * @param SequenceNumber <p>客户保证同一个任务，每次更新请求中的SequenceNumber递增，防止请求乱序。</p>
     */
    public void setSequenceNumber(Long SequenceNumber) {
        this.SequenceNumber = SequenceNumber;
    }

    /**
     * Get <p>是否转码，0表示无需转码，1表示需要转码。 WithTranscoding为0，表示旁路转推，默认不转码；WithTranscoding为1，表示混流转推，此时一定会转码，并收取转码费用。 注： 1，混流是必须转码的，这个参数需设置为1。 2，WithTranscoding=0时，视频输出Codec默认跟随上行视频Codec，如果上行视频Codec发生变化，CDN会断流重推。</p> 
     * @return WithTranscoding <p>是否转码，0表示无需转码，1表示需要转码。 WithTranscoding为0，表示旁路转推，默认不转码；WithTranscoding为1，表示混流转推，此时一定会转码，并收取转码费用。 注： 1，混流是必须转码的，这个参数需设置为1。 2，WithTranscoding=0时，视频输出Codec默认跟随上行视频Codec，如果上行视频Codec发生变化，CDN会断流重推。</p>
     */
    public Long getWithTranscoding() {
        return this.WithTranscoding;
    }

    /**
     * Set <p>是否转码，0表示无需转码，1表示需要转码。 WithTranscoding为0，表示旁路转推，默认不转码；WithTranscoding为1，表示混流转推，此时一定会转码，并收取转码费用。 注： 1，混流是必须转码的，这个参数需设置为1。 2，WithTranscoding=0时，视频输出Codec默认跟随上行视频Codec，如果上行视频Codec发生变化，CDN会断流重推。</p>
     * @param WithTranscoding <p>是否转码，0表示无需转码，1表示需要转码。 WithTranscoding为0，表示旁路转推，默认不转码；WithTranscoding为1，表示混流转推，此时一定会转码，并收取转码费用。 注： 1，混流是必须转码的，这个参数需设置为1。 2，WithTranscoding=0时，视频输出Codec默认跟随上行视频Codec，如果上行视频Codec发生变化，CDN会断流重推。</p>
     */
    public void setWithTranscoding(Long WithTranscoding) {
        this.WithTranscoding = WithTranscoding;
    }

    /**
     * Get <p>更新相关参数，只支持更新参与混音的主播列表参数，不支持更新Codec、采样率、码率和声道数。不填表示不更新此参数。</p> 
     * @return AudioParams <p>更新相关参数，只支持更新参与混音的主播列表参数，不支持更新Codec、采样率、码率和声道数。不填表示不更新此参数。</p>
     */
    public McuAudioParams getAudioParams() {
        return this.AudioParams;
    }

    /**
     * Set <p>更新相关参数，只支持更新参与混音的主播列表参数，不支持更新Codec、采样率、码率和声道数。不填表示不更新此参数。</p>
     * @param AudioParams <p>更新相关参数，只支持更新参与混音的主播列表参数，不支持更新Codec、采样率、码率和声道数。不填表示不更新此参数。</p>
     */
    public void setAudioParams(McuAudioParams AudioParams) {
        this.AudioParams = AudioParams;
    }

    /**
     * Get <p>更新视频相关参数，转码时支持更新除编码类型之外的编码参数，视频布局参数，背景图片和背景颜色参数，水印参数。不填表示不更新此参数。</p> 
     * @return VideoParams <p>更新视频相关参数，转码时支持更新除编码类型之外的编码参数，视频布局参数，背景图片和背景颜色参数，水印参数。不填表示不更新此参数。</p>
     */
    public McuVideoParams getVideoParams() {
        return this.VideoParams;
    }

    /**
     * Set <p>更新视频相关参数，转码时支持更新除编码类型之外的编码参数，视频布局参数，背景图片和背景颜色参数，水印参数。不填表示不更新此参数。</p>
     * @param VideoParams <p>更新视频相关参数，转码时支持更新除编码类型之外的编码参数，视频布局参数，背景图片和背景颜色参数，水印参数。不填表示不更新此参数。</p>
     */
    public void setVideoParams(McuVideoParams VideoParams) {
        this.VideoParams = VideoParams;
    }

    /**
     * Get <p>更新单流转推的用户上行参数，仅在非转码时有效。不填表示不更新此参数。</p> 
     * @return SingleSubscribeParams <p>更新单流转推的用户上行参数，仅在非转码时有效。不填表示不更新此参数。</p>
     */
    public SingleSubscribeParams getSingleSubscribeParams() {
        return this.SingleSubscribeParams;
    }

    /**
     * Set <p>更新单流转推的用户上行参数，仅在非转码时有效。不填表示不更新此参数。</p>
     * @param SingleSubscribeParams <p>更新单流转推的用户上行参数，仅在非转码时有效。不填表示不更新此参数。</p>
     */
    public void setSingleSubscribeParams(SingleSubscribeParams SingleSubscribeParams) {
        this.SingleSubscribeParams = SingleSubscribeParams;
    }

    /**
     * Get <p>更新转推的CDN参数。不填表示不更新此参数。</p> 
     * @return PublishCdnParams <p>更新转推的CDN参数。不填表示不更新此参数。</p>
     */
    public McuPublishCdnParam [] getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set <p>更新转推的CDN参数。不填表示不更新此参数。</p>
     * @param PublishCdnParams <p>更新转推的CDN参数。不填表示不更新此参数。</p>
     */
    public void setPublishCdnParams(McuPublishCdnParam [] PublishCdnParams) {
        this.PublishCdnParams = PublishCdnParams;
    }

    /**
     * Get <p>混流SEI参数</p> 
     * @return SeiParams <p>混流SEI参数</p>
     */
    public McuSeiParams getSeiParams() {
        return this.SeiParams;
    }

    /**
     * Set <p>混流SEI参数</p>
     * @param SeiParams <p>混流SEI参数</p>
     */
    public void setSeiParams(McuSeiParams SeiParams) {
        this.SeiParams = SeiParams;
    }

    /**
     * Get <p>回推房间信息</p> 
     * @return FeedBackRoomParams <p>回推房间信息</p>
     */
    public McuFeedBackRoomParams [] getFeedBackRoomParams() {
        return this.FeedBackRoomParams;
    }

    /**
     * Set <p>回推房间信息</p>
     * @param FeedBackRoomParams <p>回推房间信息</p>
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

