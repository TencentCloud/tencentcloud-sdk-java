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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaMetadata extends AbstractModel{

    /**
    * 媒资视频文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 媒资视频文件MD5
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * 媒资视频时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 媒资视频总帧数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumFrames")
    @Expose
    private Long NumFrames;

    /**
    * 媒资视频宽度，单位为像素
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 媒资视频高度，单位为像素
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 媒资视频帧率，单位为Hz
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FPS")
    @Expose
    private Float FPS;

    /**
    * 媒资视频比特率，单位为kbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
     * Get 媒资视频文件大小 
     * @return FileSize 媒资视频文件大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 媒资视频文件大小
     * @param FileSize 媒资视频文件大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 媒资视频文件MD5 
     * @return MD5 媒资视频文件MD5
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set 媒资视频文件MD5
     * @param MD5 媒资视频文件MD5
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get 媒资视频时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 媒资视频时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 媒资视频时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 媒资视频时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 媒资视频总帧数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumFrames 媒资视频总帧数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumFrames() {
        return this.NumFrames;
    }

    /**
     * Set 媒资视频总帧数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumFrames 媒资视频总帧数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumFrames(Long NumFrames) {
        this.NumFrames = NumFrames;
    }

    /**
     * Get 媒资视频宽度，单位为像素
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 媒资视频宽度，单位为像素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 媒资视频宽度，单位为像素
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 媒资视频宽度，单位为像素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 媒资视频高度，单位为像素
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 媒资视频高度，单位为像素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 媒资视频高度，单位为像素
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 媒资视频高度，单位为像素
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 媒资视频帧率，单位为Hz
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FPS 媒资视频帧率，单位为Hz
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFPS() {
        return this.FPS;
    }

    /**
     * Set 媒资视频帧率，单位为Hz
注意：此字段可能返回 null，表示取不到有效值。
     * @param FPS 媒资视频帧率，单位为Hz
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFPS(Float FPS) {
        this.FPS = FPS;
    }

    /**
     * Get 媒资视频比特率，单位为kbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BitRate 媒资视频比特率，单位为kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set 媒资视频比特率，单位为kbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param BitRate 媒资视频比特率，单位为kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    public MediaMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaMetadata(MediaMetadata source) {
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.NumFrames != null) {
            this.NumFrames = new Long(source.NumFrames);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.FPS != null) {
            this.FPS = new Float(source.FPS);
        }
        if (source.BitRate != null) {
            this.BitRate = new Long(source.BitRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "NumFrames", this.NumFrames);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "FPS", this.FPS);
        this.setParamSimple(map, prefix + "BitRate", this.BitRate);

    }
}

