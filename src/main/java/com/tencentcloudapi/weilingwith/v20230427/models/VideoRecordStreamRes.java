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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoRecordStreamRes extends AbstractModel {

    /**
    * FLV协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FLV")
    @Expose
    private String FLV;

    /**
    * RTMP协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RTMP")
    @Expose
    private String RTMP;

    /**
    * HLS协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HLS")
    @Expose
    private String HLS;

    /**
    * WebRtc协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebRTC")
    @Expose
    private String WebRTC;

    /**
    * RAW协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RAW")
    @Expose
    private RawInfo RAW;

    /**
    * 视频流的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stream")
    @Expose
    private String Stream;

    /**
     * Get FLV协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FLV FLV协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFLV() {
        return this.FLV;
    }

    /**
     * Set FLV协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     * @param FLV FLV协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFLV(String FLV) {
        this.FLV = FLV;
    }

    /**
     * Get RTMP协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RTMP RTMP协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRTMP() {
        return this.RTMP;
    }

    /**
     * Set RTMP协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     * @param RTMP RTMP协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRTMP(String RTMP) {
        this.RTMP = RTMP;
    }

    /**
     * Get HLS协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HLS HLS协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHLS() {
        return this.HLS;
    }

    /**
     * Set HLS协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     * @param HLS HLS协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHLS(String HLS) {
        this.HLS = HLS;
    }

    /**
     * Get WebRtc协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebRTC WebRtc协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebRTC() {
        return this.WebRTC;
    }

    /**
     * Set WebRtc协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebRTC WebRtc协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebRTC(String WebRTC) {
        this.WebRTC = WebRTC;
    }

    /**
     * Get RAW协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RAW RAW协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RawInfo getRAW() {
        return this.RAW;
    }

    /**
     * Set RAW协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     * @param RAW RAW协议格式视频流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRAW(RawInfo RAW) {
        this.RAW = RAW;
    }

    /**
     * Get 视频流的唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stream 视频流的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStream() {
        return this.Stream;
    }

    /**
     * Set 视频流的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stream 视频流的唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStream(String Stream) {
        this.Stream = Stream;
    }

    public VideoRecordStreamRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoRecordStreamRes(VideoRecordStreamRes source) {
        if (source.FLV != null) {
            this.FLV = new String(source.FLV);
        }
        if (source.RTMP != null) {
            this.RTMP = new String(source.RTMP);
        }
        if (source.HLS != null) {
            this.HLS = new String(source.HLS);
        }
        if (source.WebRTC != null) {
            this.WebRTC = new String(source.WebRTC);
        }
        if (source.RAW != null) {
            this.RAW = new RawInfo(source.RAW);
        }
        if (source.Stream != null) {
            this.Stream = new String(source.Stream);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FLV", this.FLV);
        this.setParamSimple(map, prefix + "RTMP", this.RTMP);
        this.setParamSimple(map, prefix + "HLS", this.HLS);
        this.setParamSimple(map, prefix + "WebRTC", this.WebRTC);
        this.setParamObj(map, prefix + "RAW.", this.RAW);
        this.setParamSimple(map, prefix + "Stream", this.Stream);

    }
}

