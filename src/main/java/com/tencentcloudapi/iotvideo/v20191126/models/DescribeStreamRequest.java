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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamRequest extends AbstractModel{

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 终端用户ID
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * 直播协议, 可选值：RTSP、RTMP、HLS、HLS-fmp4
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 音视频流地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 设备访问token，访问用户未绑定的设备时，需提供该参数
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 终端用户ID 
     * @return AccessId 终端用户ID
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set 终端用户ID
     * @param AccessId 终端用户ID
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get 直播协议, 可选值：RTSP、RTMP、HLS、HLS-fmp4 
     * @return Protocol 直播协议, 可选值：RTSP、RTMP、HLS、HLS-fmp4
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 直播协议, 可选值：RTSP、RTMP、HLS、HLS-fmp4
     * @param Protocol 直播协议, 可选值：RTSP、RTMP、HLS、HLS-fmp4
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 音视频流地址 
     * @return Address 音视频流地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 音视频流地址
     * @param Address 音视频流地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 设备访问token，访问用户未绑定的设备时，需提供该参数 
     * @return AccessToken 设备访问token，访问用户未绑定的设备时，需提供该参数
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set 设备访问token，访问用户未绑定的设备时，需提供该参数
     * @param AccessToken 设备访问token，访问用户未绑定的设备时，需提供该参数
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    public DescribeStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamRequest(DescribeStreamRequest source) {
        if (source.Tid != null) {
            this.Tid = new String(source.Tid);
        }
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.AccessToken != null) {
            this.AccessToken = new String(source.AccessToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);

    }
}

