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

public class StartPublishCdnStreamRequest extends AbstractModel{

    /**
    * TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和转推的房间所对应的SdkAppId相同。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 主房间信息RoomId，转推的TRTC房间所对应的RoomId。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 主房间信息RoomType，必须和转推的房间所对应的RoomId类型相同，0为整形房间号，1为字符串房间号。
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * 转推服务加入TRTC房间的机器人参数。
    */
    @SerializedName("AgentParams")
    @Expose
    private AgentParams AgentParams;

    /**
    * 是否转码，0表示无需转码，1表示需要转码。
    */
    @SerializedName("WithTranscoding")
    @Expose
    private Long WithTranscoding;

    /**
    * 转推流的音频编码参数。
    */
    @SerializedName("AudioParams")
    @Expose
    private McuAudioParams AudioParams;

    /**
    * 转推流的视频编码参数，不填表示纯音频转推。
    */
    @SerializedName("VideoParams")
    @Expose
    private McuVideoParams VideoParams;

    /**
    * 需要单流旁路转推的用户上行参数，单流旁路转推时，WithTranscoding需要设置为0。
    */
    @SerializedName("SingleSubscribeParams")
    @Expose
    private SingleSubscribeParams SingleSubscribeParams;

    /**
    * 转推的CDN参数。
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
     * Get 主房间信息RoomId，转推的TRTC房间所对应的RoomId。 
     * @return RoomId 主房间信息RoomId，转推的TRTC房间所对应的RoomId。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 主房间信息RoomId，转推的TRTC房间所对应的RoomId。
     * @param RoomId 主房间信息RoomId，转推的TRTC房间所对应的RoomId。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 主房间信息RoomType，必须和转推的房间所对应的RoomId类型相同，0为整形房间号，1为字符串房间号。 
     * @return RoomIdType 主房间信息RoomType，必须和转推的房间所对应的RoomId类型相同，0为整形房间号，1为字符串房间号。
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set 主房间信息RoomType，必须和转推的房间所对应的RoomId类型相同，0为整形房间号，1为字符串房间号。
     * @param RoomIdType 主房间信息RoomType，必须和转推的房间所对应的RoomId类型相同，0为整形房间号，1为字符串房间号。
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get 转推服务加入TRTC房间的机器人参数。 
     * @return AgentParams 转推服务加入TRTC房间的机器人参数。
     */
    public AgentParams getAgentParams() {
        return this.AgentParams;
    }

    /**
     * Set 转推服务加入TRTC房间的机器人参数。
     * @param AgentParams 转推服务加入TRTC房间的机器人参数。
     */
    public void setAgentParams(AgentParams AgentParams) {
        this.AgentParams = AgentParams;
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
     * Get 转推流的音频编码参数。 
     * @return AudioParams 转推流的音频编码参数。
     */
    public McuAudioParams getAudioParams() {
        return this.AudioParams;
    }

    /**
     * Set 转推流的音频编码参数。
     * @param AudioParams 转推流的音频编码参数。
     */
    public void setAudioParams(McuAudioParams AudioParams) {
        this.AudioParams = AudioParams;
    }

    /**
     * Get 转推流的视频编码参数，不填表示纯音频转推。 
     * @return VideoParams 转推流的视频编码参数，不填表示纯音频转推。
     */
    public McuVideoParams getVideoParams() {
        return this.VideoParams;
    }

    /**
     * Set 转推流的视频编码参数，不填表示纯音频转推。
     * @param VideoParams 转推流的视频编码参数，不填表示纯音频转推。
     */
    public void setVideoParams(McuVideoParams VideoParams) {
        this.VideoParams = VideoParams;
    }

    /**
     * Get 需要单流旁路转推的用户上行参数，单流旁路转推时，WithTranscoding需要设置为0。 
     * @return SingleSubscribeParams 需要单流旁路转推的用户上行参数，单流旁路转推时，WithTranscoding需要设置为0。
     */
    public SingleSubscribeParams getSingleSubscribeParams() {
        return this.SingleSubscribeParams;
    }

    /**
     * Set 需要单流旁路转推的用户上行参数，单流旁路转推时，WithTranscoding需要设置为0。
     * @param SingleSubscribeParams 需要单流旁路转推的用户上行参数，单流旁路转推时，WithTranscoding需要设置为0。
     */
    public void setSingleSubscribeParams(SingleSubscribeParams SingleSubscribeParams) {
        this.SingleSubscribeParams = SingleSubscribeParams;
    }

    /**
     * Get 转推的CDN参数。 
     * @return PublishCdnParams 转推的CDN参数。
     */
    public McuPublishCdnParam [] getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set 转推的CDN参数。
     * @param PublishCdnParams 转推的CDN参数。
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

    public StartPublishCdnStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartPublishCdnStreamRequest(StartPublishCdnStreamRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.AgentParams != null) {
            this.AgentParams = new AgentParams(source.AgentParams);
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
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamObj(map, prefix + "AgentParams.", this.AgentParams);
        this.setParamSimple(map, prefix + "WithTranscoding", this.WithTranscoding);
        this.setParamObj(map, prefix + "AudioParams.", this.AudioParams);
        this.setParamObj(map, prefix + "VideoParams.", this.VideoParams);
        this.setParamObj(map, prefix + "SingleSubscribeParams.", this.SingleSubscribeParams);
        this.setParamArrayObj(map, prefix + "PublishCdnParams.", this.PublishCdnParams);
        this.setParamObj(map, prefix + "SeiParams.", this.SeiParams);
        this.setParamArrayObj(map, prefix + "FeedBackRoomParams.", this.FeedBackRoomParams);

    }
}

