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

public class AudioMetadata extends AbstractModel{

    /**
    * 媒资音频文件大小，单位为Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 媒资音频文件MD5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * 媒资音频时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 媒资音频采样率，单位为khz
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SampleRate")
    @Expose
    private Float SampleRate;

    /**
    * 媒资音频码率，单位为kbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
    * 媒资音频文件格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get 媒资音频文件大小，单位为Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 媒资音频文件大小，单位为Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 媒资音频文件大小，单位为Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 媒资音频文件大小，单位为Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 媒资音频文件MD5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MD5 媒资音频文件MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set 媒资音频文件MD5
注意：此字段可能返回 null，表示取不到有效值。
     * @param MD5 媒资音频文件MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get 媒资音频时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 媒资音频时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 媒资音频时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 媒资音频时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 媒资音频采样率，单位为khz
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SampleRate 媒资音频采样率，单位为khz
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 媒资音频采样率，单位为khz
注意：此字段可能返回 null，表示取不到有效值。
     * @param SampleRate 媒资音频采样率，单位为khz
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampleRate(Float SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 媒资音频码率，单位为kbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BitRate 媒资音频码率，单位为kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set 媒资音频码率，单位为kbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param BitRate 媒资音频码率，单位为kbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    /**
     * Get 媒资音频文件格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Format 媒资音频文件格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 媒资音频文件格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Format 媒资音频文件格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public AudioMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioMetadata(AudioMetadata source) {
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Float(source.SampleRate);
        }
        if (source.BitRate != null) {
            this.BitRate = new Long(source.BitRate);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "BitRate", this.BitRate);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

