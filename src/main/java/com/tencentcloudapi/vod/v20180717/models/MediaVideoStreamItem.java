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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaVideoStreamItem  extends AbstractModel{

    /**
    * 视频流的码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 视频流的高度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 视频流的宽度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频流的编码格式，例如 h264。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 帧率，单位：hz。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
     * 获取视频流的码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Bitrate 视频流的码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * 设置视频流的码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bitrate 视频流的码率，单位：bps。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * 获取视频流的高度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Height 视频流的高度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * 设置视频流的高度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 视频流的高度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * 获取视频流的宽度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Width 视频流的宽度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * 设置视频流的宽度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 视频流的宽度，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * 获取视频流的编码格式，例如 h264。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Codec 视频流的编码格式，例如 h264。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * 设置视频流的编码格式，例如 h264。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Codec 视频流的编码格式，例如 h264。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * 获取帧率，单位：hz。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Fps 帧率，单位：hz。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * 设置帧率，单位：hz。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fps 帧率，单位：hz。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);

    }
}

