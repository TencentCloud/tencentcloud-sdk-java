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
package com.tencentcloudapi.fmu.v20191213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BeautifyVideoOutput extends AbstractModel{

    /**
    * 视频美颜输出的url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 视频美颜输出的视频MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoMD5")
    @Expose
    private String VideoMD5;

    /**
    * 美颜输出的视频封面图base64字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoverImage")
    @Expose
    private String CoverImage;

    /**
    * 视频宽度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频高度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 每秒传输帧数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fps")
    @Expose
    private Float Fps;

    /**
    * 视频播放时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DurationInSec")
    @Expose
    private Float DurationInSec;

    /**
     * Get 视频美颜输出的url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoUrl 视频美颜输出的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 视频美颜输出的url
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoUrl 视频美颜输出的url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 视频美颜输出的视频MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoMD5 视频美颜输出的视频MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoMD5() {
        return this.VideoMD5;
    }

    /**
     * Set 视频美颜输出的视频MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoMD5 视频美颜输出的视频MD5，用于校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoMD5(String VideoMD5) {
        this.VideoMD5 = VideoMD5;
    }

    /**
     * Get 美颜输出的视频封面图base64字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoverImage 美颜输出的视频封面图base64字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoverImage() {
        return this.CoverImage;
    }

    /**
     * Set 美颜输出的视频封面图base64字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoverImage 美颜输出的视频封面图base64字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoverImage(String CoverImage) {
        this.CoverImage = CoverImage;
    }

    /**
     * Get 视频宽度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 视频宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频宽度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 视频宽度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 视频高度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 视频高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频高度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 视频高度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 每秒传输帧数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fps 每秒传输帧数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFps() {
        return this.Fps;
    }

    /**
     * Set 每秒传输帧数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fps 每秒传输帧数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFps(Float Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 视频播放时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DurationInSec 视频播放时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDurationInSec() {
        return this.DurationInSec;
    }

    /**
     * Set 视频播放时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param DurationInSec 视频播放时长，单位为秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDurationInSec(Float DurationInSec) {
        this.DurationInSec = DurationInSec;
    }

    public BeautifyVideoOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BeautifyVideoOutput(BeautifyVideoOutput source) {
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.VideoMD5 != null) {
            this.VideoMD5 = new String(source.VideoMD5);
        }
        if (source.CoverImage != null) {
            this.CoverImage = new String(source.CoverImage);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Fps != null) {
            this.Fps = new Float(source.Fps);
        }
        if (source.DurationInSec != null) {
            this.DurationInSec = new Float(source.DurationInSec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "VideoMD5", this.VideoMD5);
        this.setParamSimple(map, prefix + "CoverImage", this.CoverImage);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "DurationInSec", this.DurationInSec);

    }
}

