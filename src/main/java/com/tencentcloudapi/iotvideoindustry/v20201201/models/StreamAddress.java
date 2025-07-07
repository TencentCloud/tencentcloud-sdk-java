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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamAddress extends AbstractModel {

    /**
    * 流ID
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * rtsp流地址
    */
    @SerializedName("RtspAddr")
    @Expose
    private String RtspAddr;

    /**
    * rtmp流地址
    */
    @SerializedName("RtmpAddr")
    @Expose
    private String RtmpAddr;

    /**
    * hls流地址
    */
    @SerializedName("HlsAddr")
    @Expose
    private String HlsAddr;

    /**
    * flv流地址
    */
    @SerializedName("FlvAddr")
    @Expose
    private String FlvAddr;

    /**
     * Get 流ID 
     * @return StreamId 流ID
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 流ID
     * @param StreamId 流ID
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get rtsp流地址 
     * @return RtspAddr rtsp流地址
     */
    public String getRtspAddr() {
        return this.RtspAddr;
    }

    /**
     * Set rtsp流地址
     * @param RtspAddr rtsp流地址
     */
    public void setRtspAddr(String RtspAddr) {
        this.RtspAddr = RtspAddr;
    }

    /**
     * Get rtmp流地址 
     * @return RtmpAddr rtmp流地址
     */
    public String getRtmpAddr() {
        return this.RtmpAddr;
    }

    /**
     * Set rtmp流地址
     * @param RtmpAddr rtmp流地址
     */
    public void setRtmpAddr(String RtmpAddr) {
        this.RtmpAddr = RtmpAddr;
    }

    /**
     * Get hls流地址 
     * @return HlsAddr hls流地址
     */
    public String getHlsAddr() {
        return this.HlsAddr;
    }

    /**
     * Set hls流地址
     * @param HlsAddr hls流地址
     */
    public void setHlsAddr(String HlsAddr) {
        this.HlsAddr = HlsAddr;
    }

    /**
     * Get flv流地址 
     * @return FlvAddr flv流地址
     */
    public String getFlvAddr() {
        return this.FlvAddr;
    }

    /**
     * Set flv流地址
     * @param FlvAddr flv流地址
     */
    public void setFlvAddr(String FlvAddr) {
        this.FlvAddr = FlvAddr;
    }

    public StreamAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamAddress(StreamAddress source) {
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.RtspAddr != null) {
            this.RtspAddr = new String(source.RtspAddr);
        }
        if (source.RtmpAddr != null) {
            this.RtmpAddr = new String(source.RtmpAddr);
        }
        if (source.HlsAddr != null) {
            this.HlsAddr = new String(source.HlsAddr);
        }
        if (source.FlvAddr != null) {
            this.FlvAddr = new String(source.FlvAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "RtspAddr", this.RtspAddr);
        this.setParamSimple(map, prefix + "RtmpAddr", this.RtmpAddr);
        this.setParamSimple(map, prefix + "HlsAddr", this.HlsAddr);
        this.setParamSimple(map, prefix + "FlvAddr", this.FlvAddr);

    }
}

