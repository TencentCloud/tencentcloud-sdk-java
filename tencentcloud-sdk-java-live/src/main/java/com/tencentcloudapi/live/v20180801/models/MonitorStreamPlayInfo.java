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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorStreamPlayInfo extends AbstractModel{

    /**
    * 播放域名。
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * 流id。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 播放码率，0表示原始码率。
    */
    @SerializedName("Rate")
    @Expose
    private Long Rate;

    /**
    * 播放协议，可选值包括 Unknown，Flv，Hls，Rtmp，Huyap2p。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 带宽，单位是Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * 在线人数，1分钟采样一个点，统计采样点的tcp链接数目。
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
    * 请求数。
    */
    @SerializedName("Request")
    @Expose
    private Long Request;

    /**
     * Get 播放域名。 
     * @return PlayDomain 播放域名。
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set 播放域名。
     * @param PlayDomain 播放域名。
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get 流id。 
     * @return StreamName 流id。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流id。
     * @param StreamName 流id。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 播放码率，0表示原始码率。 
     * @return Rate 播放码率，0表示原始码率。
     */
    public Long getRate() {
        return this.Rate;
    }

    /**
     * Set 播放码率，0表示原始码率。
     * @param Rate 播放码率，0表示原始码率。
     */
    public void setRate(Long Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 播放协议，可选值包括 Unknown，Flv，Hls，Rtmp，Huyap2p。 
     * @return Protocol 播放协议，可选值包括 Unknown，Flv，Hls，Rtmp，Huyap2p。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 播放协议，可选值包括 Unknown，Flv，Hls，Rtmp，Huyap2p。
     * @param Protocol 播放协议，可选值包括 Unknown，Flv，Hls，Rtmp，Huyap2p。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 带宽，单位是Mbps。 
     * @return Bandwidth 带宽，单位是Mbps。
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽，单位是Mbps。
     * @param Bandwidth 带宽，单位是Mbps。
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 在线人数，1分钟采样一个点，统计采样点的tcp链接数目。 
     * @return Online 在线人数，1分钟采样一个点，统计采样点的tcp链接数目。
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set 在线人数，1分钟采样一个点，统计采样点的tcp链接数目。
     * @param Online 在线人数，1分钟采样一个点，统计采样点的tcp链接数目。
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    /**
     * Get 请求数。 
     * @return Request 请求数。
     */
    public Long getRequest() {
        return this.Request;
    }

    /**
     * Set 请求数。
     * @param Request 请求数。
     */
    public void setRequest(Long Request) {
        this.Request = Request;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "Request", this.Request);

    }
}

