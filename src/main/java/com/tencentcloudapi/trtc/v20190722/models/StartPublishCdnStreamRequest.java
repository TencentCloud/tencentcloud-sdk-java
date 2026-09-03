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

public class StartPublishCdnStreamRequest extends AbstractModel {

    /**
    * <p>TRTC的<a href="https://cloud.tencent.com/document/product/647/46351#sdkappid">SdkAppId</a>，和转推的房间所对应的SdkAppId相同。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>主房间信息RoomId，转推的TRTC房间所对应的RoomId。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>主房间信息RoomType，必须和转推的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p>
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * <p>转推服务加入TRTC房间的机器人参数。</p>
    */
    @SerializedName("AgentParams")
    @Expose
    private AgentParams AgentParams;

    /**
    * <p>是否转码，0表示无需转码，1表示需要转码。<br>WithTranscoding为0，表示旁路转推，默认不转码；WithTranscoding为1，表示混流转推，此时一定会转码，并收取转码费用。<br>注：<br>1，混流是必须转码的，这个参数需设置为1。<br>2，WithTranscoding=0时，视频输出Codec默认跟随上行视频Codec，如果上行视频Codec发生变化，CDN会断流重推。</p>
    */
    @SerializedName("WithTranscoding")
    @Expose
    private Long WithTranscoding;

    /**
    * <p>转推流的音频编码参数。由于音频是必转码的（不会收取转码费用），所以启动任务的时候，必须填写。</p>
    */
    @SerializedName("AudioParams")
    @Expose
    private McuAudioParams AudioParams;

    /**
    * <p>转推流的视频编码参数，不填表示纯音频转推。</p>
    */
    @SerializedName("VideoParams")
    @Expose
    private McuVideoParams VideoParams;

    /**
    * <p>需要单流旁路转推的用户上行参数，单流旁路转推时，WithTranscoding需要设置为0。</p>
    */
    @SerializedName("SingleSubscribeParams")
    @Expose
    private SingleSubscribeParams SingleSubscribeParams;

    /**
    * <p>转推的CDN参数，一个任务最多支持10个推流URL。和回推房间参数必须要有一个。</p>
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
    * <p>回推房间信息，一个任务最多支持回推10个房间，和转推CDN参数必须要有一个。注：回推房间需使用10.4及以上SDK版本，如您有需求，请联系腾讯云技术支持。</p>
    */
    @SerializedName("FeedBackRoomParams")
    @Expose
    private McuFeedBackRoomParams [] FeedBackRoomParams;

    /**
    * <p>转推录制参数，<a href="https://cloud.tencent.com/document/product/647/111748">参考文档</a>。</p>
    */
    @SerializedName("RecordParams")
    @Expose
    private McuRecordParams RecordParams;

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
     * Get <p>主房间信息RoomId，转推的TRTC房间所对应的RoomId。</p> 
     * @return RoomId <p>主房间信息RoomId，转推的TRTC房间所对应的RoomId。</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>主房间信息RoomId，转推的TRTC房间所对应的RoomId。</p>
     * @param RoomId <p>主房间信息RoomId，转推的TRTC房间所对应的RoomId。</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>主房间信息RoomType，必须和转推的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p> 
     * @return RoomIdType <p>主房间信息RoomType，必须和转推的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p>
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set <p>主房间信息RoomType，必须和转推的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p>
     * @param RoomIdType <p>主房间信息RoomType，必须和转推的房间所对应的RoomId类型相同，0为整型房间号，1为字符串房间号。</p>
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get <p>转推服务加入TRTC房间的机器人参数。</p> 
     * @return AgentParams <p>转推服务加入TRTC房间的机器人参数。</p>
     */
    public AgentParams getAgentParams() {
        return this.AgentParams;
    }

    /**
     * Set <p>转推服务加入TRTC房间的机器人参数。</p>
     * @param AgentParams <p>转推服务加入TRTC房间的机器人参数。</p>
     */
    public void setAgentParams(AgentParams AgentParams) {
        this.AgentParams = AgentParams;
    }

    /**
     * Get <p>是否转码，0表示无需转码，1表示需要转码。<br>WithTranscoding为0，表示旁路转推，默认不转码；WithTranscoding为1，表示混流转推，此时一定会转码，并收取转码费用。<br>注：<br>1，混流是必须转码的，这个参数需设置为1。<br>2，WithTranscoding=0时，视频输出Codec默认跟随上行视频Codec，如果上行视频Codec发生变化，CDN会断流重推。</p> 
     * @return WithTranscoding <p>是否转码，0表示无需转码，1表示需要转码。<br>WithTranscoding为0，表示旁路转推，默认不转码；WithTranscoding为1，表示混流转推，此时一定会转码，并收取转码费用。<br>注：<br>1，混流是必须转码的，这个参数需设置为1。<br>2，WithTranscoding=0时，视频输出Codec默认跟随上行视频Codec，如果上行视频Codec发生变化，CDN会断流重推。</p>
     */
    public Long getWithTranscoding() {
        return this.WithTranscoding;
    }

    /**
     * Set <p>是否转码，0表示无需转码，1表示需要转码。<br>WithTranscoding为0，表示旁路转推，默认不转码；WithTranscoding为1，表示混流转推，此时一定会转码，并收取转码费用。<br>注：<br>1，混流是必须转码的，这个参数需设置为1。<br>2，WithTranscoding=0时，视频输出Codec默认跟随上行视频Codec，如果上行视频Codec发生变化，CDN会断流重推。</p>
     * @param WithTranscoding <p>是否转码，0表示无需转码，1表示需要转码。<br>WithTranscoding为0，表示旁路转推，默认不转码；WithTranscoding为1，表示混流转推，此时一定会转码，并收取转码费用。<br>注：<br>1，混流是必须转码的，这个参数需设置为1。<br>2，WithTranscoding=0时，视频输出Codec默认跟随上行视频Codec，如果上行视频Codec发生变化，CDN会断流重推。</p>
     */
    public void setWithTranscoding(Long WithTranscoding) {
        this.WithTranscoding = WithTranscoding;
    }

    /**
     * Get <p>转推流的音频编码参数。由于音频是必转码的（不会收取转码费用），所以启动任务的时候，必须填写。</p> 
     * @return AudioParams <p>转推流的音频编码参数。由于音频是必转码的（不会收取转码费用），所以启动任务的时候，必须填写。</p>
     */
    public McuAudioParams getAudioParams() {
        return this.AudioParams;
    }

    /**
     * Set <p>转推流的音频编码参数。由于音频是必转码的（不会收取转码费用），所以启动任务的时候，必须填写。</p>
     * @param AudioParams <p>转推流的音频编码参数。由于音频是必转码的（不会收取转码费用），所以启动任务的时候，必须填写。</p>
     */
    public void setAudioParams(McuAudioParams AudioParams) {
        this.AudioParams = AudioParams;
    }

    /**
     * Get <p>转推流的视频编码参数，不填表示纯音频转推。</p> 
     * @return VideoParams <p>转推流的视频编码参数，不填表示纯音频转推。</p>
     */
    public McuVideoParams getVideoParams() {
        return this.VideoParams;
    }

    /**
     * Set <p>转推流的视频编码参数，不填表示纯音频转推。</p>
     * @param VideoParams <p>转推流的视频编码参数，不填表示纯音频转推。</p>
     */
    public void setVideoParams(McuVideoParams VideoParams) {
        this.VideoParams = VideoParams;
    }

    /**
     * Get <p>需要单流旁路转推的用户上行参数，单流旁路转推时，WithTranscoding需要设置为0。</p> 
     * @return SingleSubscribeParams <p>需要单流旁路转推的用户上行参数，单流旁路转推时，WithTranscoding需要设置为0。</p>
     */
    public SingleSubscribeParams getSingleSubscribeParams() {
        return this.SingleSubscribeParams;
    }

    /**
     * Set <p>需要单流旁路转推的用户上行参数，单流旁路转推时，WithTranscoding需要设置为0。</p>
     * @param SingleSubscribeParams <p>需要单流旁路转推的用户上行参数，单流旁路转推时，WithTranscoding需要设置为0。</p>
     */
    public void setSingleSubscribeParams(SingleSubscribeParams SingleSubscribeParams) {
        this.SingleSubscribeParams = SingleSubscribeParams;
    }

    /**
     * Get <p>转推的CDN参数，一个任务最多支持10个推流URL。和回推房间参数必须要有一个。</p> 
     * @return PublishCdnParams <p>转推的CDN参数，一个任务最多支持10个推流URL。和回推房间参数必须要有一个。</p>
     */
    public McuPublishCdnParam [] getPublishCdnParams() {
        return this.PublishCdnParams;
    }

    /**
     * Set <p>转推的CDN参数，一个任务最多支持10个推流URL。和回推房间参数必须要有一个。</p>
     * @param PublishCdnParams <p>转推的CDN参数，一个任务最多支持10个推流URL。和回推房间参数必须要有一个。</p>
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
     * Get <p>回推房间信息，一个任务最多支持回推10个房间，和转推CDN参数必须要有一个。注：回推房间需使用10.4及以上SDK版本，如您有需求，请联系腾讯云技术支持。</p> 
     * @return FeedBackRoomParams <p>回推房间信息，一个任务最多支持回推10个房间，和转推CDN参数必须要有一个。注：回推房间需使用10.4及以上SDK版本，如您有需求，请联系腾讯云技术支持。</p>
     */
    public McuFeedBackRoomParams [] getFeedBackRoomParams() {
        return this.FeedBackRoomParams;
    }

    /**
     * Set <p>回推房间信息，一个任务最多支持回推10个房间，和转推CDN参数必须要有一个。注：回推房间需使用10.4及以上SDK版本，如您有需求，请联系腾讯云技术支持。</p>
     * @param FeedBackRoomParams <p>回推房间信息，一个任务最多支持回推10个房间，和转推CDN参数必须要有一个。注：回推房间需使用10.4及以上SDK版本，如您有需求，请联系腾讯云技术支持。</p>
     */
    public void setFeedBackRoomParams(McuFeedBackRoomParams [] FeedBackRoomParams) {
        this.FeedBackRoomParams = FeedBackRoomParams;
    }

    /**
     * Get <p>转推录制参数，<a href="https://cloud.tencent.com/document/product/647/111748">参考文档</a>。</p> 
     * @return RecordParams <p>转推录制参数，<a href="https://cloud.tencent.com/document/product/647/111748">参考文档</a>。</p>
     */
    public McuRecordParams getRecordParams() {
        return this.RecordParams;
    }

    /**
     * Set <p>转推录制参数，<a href="https://cloud.tencent.com/document/product/647/111748">参考文档</a>。</p>
     * @param RecordParams <p>转推录制参数，<a href="https://cloud.tencent.com/document/product/647/111748">参考文档</a>。</p>
     */
    public void setRecordParams(McuRecordParams RecordParams) {
        this.RecordParams = RecordParams;
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
        if (source.RecordParams != null) {
            this.RecordParams = new McuRecordParams(source.RecordParams);
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
        this.setParamObj(map, prefix + "RecordParams.", this.RecordParams);

    }
}

