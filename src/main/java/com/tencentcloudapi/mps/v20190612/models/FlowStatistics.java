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

public class FlowStatistics extends AbstractModel{

    /**
    * 会话Id。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 对端IP。
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 总带宽。
    */
    @SerializedName("Network")
    @Expose
    private Long Network;

    /**
    * 视频数据。
    */
    @SerializedName("Video")
    @Expose
    private FlowVideo [] Video;

    /**
    * 音频数据。
    */
    @SerializedName("Audio")
    @Expose
    private FlowAudio [] Audio;

    /**
     * Get 会话Id。 
     * @return SessionId 会话Id。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话Id。
     * @param SessionId 会话Id。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 对端IP。 
     * @return ClientIp 对端IP。
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 对端IP。
     * @param ClientIp 对端IP。
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
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
     * Get 视频数据。 
     * @return Video 视频数据。
     */
    public FlowVideo [] getVideo() {
        return this.Video;
    }

    /**
     * Set 视频数据。
     * @param Video 视频数据。
     */
    public void setVideo(FlowVideo [] Video) {
        this.Video = Video;
    }

    /**
     * Get 音频数据。 
     * @return Audio 音频数据。
     */
    public FlowAudio [] getAudio() {
        return this.Audio;
    }

    /**
     * Set 音频数据。
     * @param Audio 音频数据。
     */
    public void setAudio(FlowAudio [] Audio) {
        this.Audio = Audio;
    }

    public FlowStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowStatistics(FlowStatistics source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.Network != null) {
            this.Network = new Long(source.Network);
        }
        if (source.Video != null) {
            this.Video = new FlowVideo[source.Video.length];
            for (int i = 0; i < source.Video.length; i++) {
                this.Video[i] = new FlowVideo(source.Video[i]);
            }
        }
        if (source.Audio != null) {
            this.Audio = new FlowAudio[source.Audio.length];
            for (int i = 0; i < source.Audio.length; i++) {
                this.Audio[i] = new FlowAudio(source.Audio[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "Network", this.Network);
        this.setParamArrayObj(map, prefix + "Video.", this.Video);
        this.setParamArrayObj(map, prefix + "Audio.", this.Audio);

    }
}

