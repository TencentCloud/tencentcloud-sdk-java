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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartStreamIngestRequest extends AbstractModel {

    /**
    * TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和TRTC的房间所对应的SdkAppId相同。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，录制的TRTC房间所对应的RoomId。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * TRTC房间号的类型。
【*注意】必须和录制的房间所对应的RoomId类型相同:
0: 字符串类型的RoomId
1: 32位整型的RoomId（默认）
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * 输入在线媒体流机器人的UserId，用于进房发起拉流转推任务。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 输入在线媒体流机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * 【本字段已废弃，请使用 StreamUrl 字段】源流URL，支持一个地址。
    */
    @SerializedName("SourceUrl")
    @Expose
    private String [] SourceUrl;

    /**
    * TRTC房间权限加密串，只有在TRTC控制台启用了高级权限控制的时候需要携带，在TRTC控制台如果开启高级权限控制后，TRTC 的后台服务系统会校验一个叫做 [PrivateMapKey] 的“权限票据”，权限票据中包含了一个加密后的 RoomId 和一个加密后的“权限位列表”。由于 PrivateMapKey 中包含 RoomId，所以只提供了 UserSig 没有提供 PrivateMapKey 时，并不能进入指定的房间。
    */
    @SerializedName("PrivateMapKey")
    @Expose
    private String PrivateMapKey;

    /**
    * 视频编码参数。可选，如果不填，保持原始流的参数。
    */
    @SerializedName("VideoEncodeParams")
    @Expose
    private VideoEncodeParams VideoEncodeParams;

    /**
    * 音频编码参数。可选，如果不填，保持原始流的参数。
    */
    @SerializedName("AudioEncodeParams")
    @Expose
    private AudioEncodeParams AudioEncodeParams;

    /**
    * 源流URL。历史原因本字段【必填】。
    */
    @SerializedName("StreamUrl")
    @Expose
    private String StreamUrl;

    /**
     * Get TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和TRTC的房间所对应的SdkAppId相同。 
     * @return SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和TRTC的房间所对应的SdkAppId相同。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和TRTC的房间所对应的SdkAppId相同。
     * @param SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和TRTC的房间所对应的SdkAppId相同。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，录制的TRTC房间所对应的RoomId。 
     * @return RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，录制的TRTC房间所对应的RoomId。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，录制的TRTC房间所对应的RoomId。
     * @param RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，录制的TRTC房间所对应的RoomId。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get TRTC房间号的类型。
【*注意】必须和录制的房间所对应的RoomId类型相同:
0: 字符串类型的RoomId
1: 32位整型的RoomId（默认） 
     * @return RoomIdType TRTC房间号的类型。
【*注意】必须和录制的房间所对应的RoomId类型相同:
0: 字符串类型的RoomId
1: 32位整型的RoomId（默认）
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set TRTC房间号的类型。
【*注意】必须和录制的房间所对应的RoomId类型相同:
0: 字符串类型的RoomId
1: 32位整型的RoomId（默认）
     * @param RoomIdType TRTC房间号的类型。
【*注意】必须和录制的房间所对应的RoomId类型相同:
0: 字符串类型的RoomId
1: 32位整型的RoomId（默认）
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get 输入在线媒体流机器人的UserId，用于进房发起拉流转推任务。 
     * @return UserId 输入在线媒体流机器人的UserId，用于进房发起拉流转推任务。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 输入在线媒体流机器人的UserId，用于进房发起拉流转推任务。
     * @param UserId 输入在线媒体流机器人的UserId，用于进房发起拉流转推任务。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 输入在线媒体流机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。 
     * @return UserSig 输入在线媒体流机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set 输入在线媒体流机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     * @param UserSig 输入在线媒体流机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算[UserSig](https://cloud.tencent.com/document/product/647/45910#UserSig)的方案。
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get 【本字段已废弃，请使用 StreamUrl 字段】源流URL，支持一个地址。 
     * @return SourceUrl 【本字段已废弃，请使用 StreamUrl 字段】源流URL，支持一个地址。
     */
    public String [] getSourceUrl() {
        return this.SourceUrl;
    }

    /**
     * Set 【本字段已废弃，请使用 StreamUrl 字段】源流URL，支持一个地址。
     * @param SourceUrl 【本字段已废弃，请使用 StreamUrl 字段】源流URL，支持一个地址。
     */
    public void setSourceUrl(String [] SourceUrl) {
        this.SourceUrl = SourceUrl;
    }

    /**
     * Get TRTC房间权限加密串，只有在TRTC控制台启用了高级权限控制的时候需要携带，在TRTC控制台如果开启高级权限控制后，TRTC 的后台服务系统会校验一个叫做 [PrivateMapKey] 的“权限票据”，权限票据中包含了一个加密后的 RoomId 和一个加密后的“权限位列表”。由于 PrivateMapKey 中包含 RoomId，所以只提供了 UserSig 没有提供 PrivateMapKey 时，并不能进入指定的房间。 
     * @return PrivateMapKey TRTC房间权限加密串，只有在TRTC控制台启用了高级权限控制的时候需要携带，在TRTC控制台如果开启高级权限控制后，TRTC 的后台服务系统会校验一个叫做 [PrivateMapKey] 的“权限票据”，权限票据中包含了一个加密后的 RoomId 和一个加密后的“权限位列表”。由于 PrivateMapKey 中包含 RoomId，所以只提供了 UserSig 没有提供 PrivateMapKey 时，并不能进入指定的房间。
     */
    public String getPrivateMapKey() {
        return this.PrivateMapKey;
    }

    /**
     * Set TRTC房间权限加密串，只有在TRTC控制台启用了高级权限控制的时候需要携带，在TRTC控制台如果开启高级权限控制后，TRTC 的后台服务系统会校验一个叫做 [PrivateMapKey] 的“权限票据”，权限票据中包含了一个加密后的 RoomId 和一个加密后的“权限位列表”。由于 PrivateMapKey 中包含 RoomId，所以只提供了 UserSig 没有提供 PrivateMapKey 时，并不能进入指定的房间。
     * @param PrivateMapKey TRTC房间权限加密串，只有在TRTC控制台启用了高级权限控制的时候需要携带，在TRTC控制台如果开启高级权限控制后，TRTC 的后台服务系统会校验一个叫做 [PrivateMapKey] 的“权限票据”，权限票据中包含了一个加密后的 RoomId 和一个加密后的“权限位列表”。由于 PrivateMapKey 中包含 RoomId，所以只提供了 UserSig 没有提供 PrivateMapKey 时，并不能进入指定的房间。
     */
    public void setPrivateMapKey(String PrivateMapKey) {
        this.PrivateMapKey = PrivateMapKey;
    }

    /**
     * Get 视频编码参数。可选，如果不填，保持原始流的参数。 
     * @return VideoEncodeParams 视频编码参数。可选，如果不填，保持原始流的参数。
     */
    public VideoEncodeParams getVideoEncodeParams() {
        return this.VideoEncodeParams;
    }

    /**
     * Set 视频编码参数。可选，如果不填，保持原始流的参数。
     * @param VideoEncodeParams 视频编码参数。可选，如果不填，保持原始流的参数。
     */
    public void setVideoEncodeParams(VideoEncodeParams VideoEncodeParams) {
        this.VideoEncodeParams = VideoEncodeParams;
    }

    /**
     * Get 音频编码参数。可选，如果不填，保持原始流的参数。 
     * @return AudioEncodeParams 音频编码参数。可选，如果不填，保持原始流的参数。
     */
    public AudioEncodeParams getAudioEncodeParams() {
        return this.AudioEncodeParams;
    }

    /**
     * Set 音频编码参数。可选，如果不填，保持原始流的参数。
     * @param AudioEncodeParams 音频编码参数。可选，如果不填，保持原始流的参数。
     */
    public void setAudioEncodeParams(AudioEncodeParams AudioEncodeParams) {
        this.AudioEncodeParams = AudioEncodeParams;
    }

    /**
     * Get 源流URL。历史原因本字段【必填】。 
     * @return StreamUrl 源流URL。历史原因本字段【必填】。
     */
    public String getStreamUrl() {
        return this.StreamUrl;
    }

    /**
     * Set 源流URL。历史原因本字段【必填】。
     * @param StreamUrl 源流URL。历史原因本字段【必填】。
     */
    public void setStreamUrl(String StreamUrl) {
        this.StreamUrl = StreamUrl;
    }

    public StartStreamIngestRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartStreamIngestRequest(StartStreamIngestRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.SourceUrl != null) {
            this.SourceUrl = new String[source.SourceUrl.length];
            for (int i = 0; i < source.SourceUrl.length; i++) {
                this.SourceUrl[i] = new String(source.SourceUrl[i]);
            }
        }
        if (source.PrivateMapKey != null) {
            this.PrivateMapKey = new String(source.PrivateMapKey);
        }
        if (source.VideoEncodeParams != null) {
            this.VideoEncodeParams = new VideoEncodeParams(source.VideoEncodeParams);
        }
        if (source.AudioEncodeParams != null) {
            this.AudioEncodeParams = new AudioEncodeParams(source.AudioEncodeParams);
        }
        if (source.StreamUrl != null) {
            this.StreamUrl = new String(source.StreamUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamArraySimple(map, prefix + "SourceUrl.", this.SourceUrl);
        this.setParamSimple(map, prefix + "PrivateMapKey", this.PrivateMapKey);
        this.setParamObj(map, prefix + "VideoEncodeParams.", this.VideoEncodeParams);
        this.setParamObj(map, prefix + "AudioEncodeParams.", this.AudioEncodeParams);
        this.setParamSimple(map, prefix + "StreamUrl", this.StreamUrl);

    }
}

