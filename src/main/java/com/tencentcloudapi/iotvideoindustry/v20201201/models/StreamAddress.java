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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamAddress extends AbstractModel{

    /**
    * 流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * rtsp流地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RtspAddr")
    @Expose
    private String RtspAddr;

    /**
    * rtmp流地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RtmpAddr")
    @Expose
    private String RtmpAddr;

    /**
    * hls流地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HlsAddr")
    @Expose
    private String HlsAddr;

    /**
    * flv流地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlvAddr")
    @Expose
    private String FlvAddr;

    /**
     * Get 流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamId 流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamId 流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get rtsp流地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RtspAddr rtsp流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRtspAddr() {
        return this.RtspAddr;
    }

    /**
     * Set rtsp流地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param RtspAddr rtsp流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRtspAddr(String RtspAddr) {
        this.RtspAddr = RtspAddr;
    }

    /**
     * Get rtmp流地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RtmpAddr rtmp流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRtmpAddr() {
        return this.RtmpAddr;
    }

    /**
     * Set rtmp流地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param RtmpAddr rtmp流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRtmpAddr(String RtmpAddr) {
        this.RtmpAddr = RtmpAddr;
    }

    /**
     * Get hls流地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HlsAddr hls流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHlsAddr() {
        return this.HlsAddr;
    }

    /**
     * Set hls流地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param HlsAddr hls流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHlsAddr(String HlsAddr) {
        this.HlsAddr = HlsAddr;
    }

    /**
     * Get flv流地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlvAddr flv流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlvAddr() {
        return this.FlvAddr;
    }

    /**
     * Set flv流地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlvAddr flv流地址
注意：此字段可能返回 null，表示取不到有效值。
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

