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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowMediaInfo extends AbstractModel{

    /**
    * 时间戳，单位是秒。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 总带宽。
    */
    @SerializedName("Network")
    @Expose
    private Long Network;

    /**
    * 传输流的视频数据。
    */
    @SerializedName("Video")
    @Expose
    private FlowMediaVideo [] Video;

    /**
    * 传输流的音频数据。
    */
    @SerializedName("Audio")
    @Expose
    private FlowMediaAudio [] Audio;

    /**
    * 标志同一次推流。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 客户端IP。
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
     * Get 时间戳，单位是秒。 
     * @return Timestamp 时间戳，单位是秒。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳，单位是秒。
     * @param Timestamp 时间戳，单位是秒。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 总带宽。 
     * @return Network 总带宽。
     */
    public Long getNetwork() {
        return this.Network;
    }

    /**
     * Set 总带宽。
     * @param Network 总带宽。
     */
    public void setNetwork(Long Network) {
        this.Network = Network;
    }

    /**
     * Get 传输流的视频数据。 
     * @return Video 传输流的视频数据。
     */
    public FlowMediaVideo [] getVideo() {
        return this.Video;
    }

    /**
     * Set 传输流的视频数据。
     * @param Video 传输流的视频数据。
     */
    public void setVideo(FlowMediaVideo [] Video) {
        this.Video = Video;
    }

    /**
     * Get 传输流的音频数据。 
     * @return Audio 传输流的音频数据。
     */
    public FlowMediaAudio [] getAudio() {
        return this.Audio;
    }

    /**
     * Set 传输流的音频数据。
     * @param Audio 传输流的音频数据。
     */
    public void setAudio(FlowMediaAudio [] Audio) {
        this.Audio = Audio;
    }

    /**
     * Get 标志同一次推流。 
     * @return SessionId 标志同一次推流。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 标志同一次推流。
     * @param SessionId 标志同一次推流。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 客户端IP。 
     * @return ClientIp 客户端IP。
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端IP。
     * @param ClientIp 客户端IP。
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    public FlowMediaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowMediaInfo(FlowMediaInfo source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Network != null) {
            this.Network = new Long(source.Network);
        }
        if (source.Video != null) {
            this.Video = new FlowMediaVideo[source.Video.length];
            for (int i = 0; i < source.Video.length; i++) {
                this.Video[i] = new FlowMediaVideo(source.Video[i]);
            }
        }
        if (source.Audio != null) {
            this.Audio = new FlowMediaAudio[source.Audio.length];
            for (int i = 0; i < source.Audio.length; i++) {
                this.Audio[i] = new FlowMediaAudio(source.Audio[i]);
            }
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Network", this.Network);
        this.setParamArrayObj(map, prefix + "Video.", this.Video);
        this.setParamArrayObj(map, prefix + "Audio.", this.Audio);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);

    }
}

