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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoTrackItem extends AbstractModel {

    /**
    * 视频片段的媒体素材来源，可以是：
<li>点播的媒体文件 ID；</li>
<li>其他媒体文件的下载 URL。</li>
注意：当使用其他媒体文件的下载 URL 作为素材来源，且开启了访问控制（如防盗链）时，需要在 URL 携带访问控制参数（如防盗链签名）。
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * 视频片段取自素材文件的起始时间，单位为秒。默认为0。
    */
    @SerializedName("SourceMediaStartTime")
    @Expose
    private Float SourceMediaStartTime;

    /**
    * 视频片段时长，单位为秒。默认取视频素材本身长度，表示截取全部素材。如果源文件是图片，Duration需要大于0。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 视频片段目标时长，单位为秒。
<li>当 TargetDuration 不填或填0时，表示目标时长和 Duration 一致；</li>
<li>当 TargetDuration 取大于0的值时，将对视频片段做快进或慢放等处理，使得输出片段的时长等于 TargetDuration。</li>
    */
    @SerializedName("TargetDuration")
    @Expose
    private Float TargetDuration;

    /**
    * 视频原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值 ：Center。
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * 视频片段原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布口宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认值：0px。
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * 视频片段原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认值：0px。
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * 视频片段的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%；
</li><li>当字符串以 px 结尾，表示视频片段 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 对音频进行操作，如静音等。
    */
    @SerializedName("AudioOperations")
    @Expose
    private AudioTransform [] AudioOperations;

    /**
    * 对图像进行的操作，如图像旋转等。
    */
    @SerializedName("ImageOperations")
    @Expose
    private ImageTransform [] ImageOperations;

    /**
     * Get 视频片段的媒体素材来源，可以是：
<li>点播的媒体文件 ID；</li>
<li>其他媒体文件的下载 URL。</li>
注意：当使用其他媒体文件的下载 URL 作为素材来源，且开启了访问控制（如防盗链）时，需要在 URL 携带访问控制参数（如防盗链签名）。 
     * @return SourceMedia 视频片段的媒体素材来源，可以是：
<li>点播的媒体文件 ID；</li>
<li>其他媒体文件的下载 URL。</li>
注意：当使用其他媒体文件的下载 URL 作为素材来源，且开启了访问控制（如防盗链）时，需要在 URL 携带访问控制参数（如防盗链签名）。
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set 视频片段的媒体素材来源，可以是：
<li>点播的媒体文件 ID；</li>
<li>其他媒体文件的下载 URL。</li>
注意：当使用其他媒体文件的下载 URL 作为素材来源，且开启了访问控制（如防盗链）时，需要在 URL 携带访问控制参数（如防盗链签名）。
     * @param SourceMedia 视频片段的媒体素材来源，可以是：
<li>点播的媒体文件 ID；</li>
<li>其他媒体文件的下载 URL。</li>
注意：当使用其他媒体文件的下载 URL 作为素材来源，且开启了访问控制（如防盗链）时，需要在 URL 携带访问控制参数（如防盗链签名）。
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get 视频片段取自素材文件的起始时间，单位为秒。默认为0。 
     * @return SourceMediaStartTime 视频片段取自素材文件的起始时间，单位为秒。默认为0。
     */
    public Float getSourceMediaStartTime() {
        return this.SourceMediaStartTime;
    }

    /**
     * Set 视频片段取自素材文件的起始时间，单位为秒。默认为0。
     * @param SourceMediaStartTime 视频片段取自素材文件的起始时间，单位为秒。默认为0。
     */
    public void setSourceMediaStartTime(Float SourceMediaStartTime) {
        this.SourceMediaStartTime = SourceMediaStartTime;
    }

    /**
     * Get 视频片段时长，单位为秒。默认取视频素材本身长度，表示截取全部素材。如果源文件是图片，Duration需要大于0。 
     * @return Duration 视频片段时长，单位为秒。默认取视频素材本身长度，表示截取全部素材。如果源文件是图片，Duration需要大于0。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 视频片段时长，单位为秒。默认取视频素材本身长度，表示截取全部素材。如果源文件是图片，Duration需要大于0。
     * @param Duration 视频片段时长，单位为秒。默认取视频素材本身长度，表示截取全部素材。如果源文件是图片，Duration需要大于0。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 视频片段目标时长，单位为秒。
<li>当 TargetDuration 不填或填0时，表示目标时长和 Duration 一致；</li>
<li>当 TargetDuration 取大于0的值时，将对视频片段做快进或慢放等处理，使得输出片段的时长等于 TargetDuration。</li> 
     * @return TargetDuration 视频片段目标时长，单位为秒。
<li>当 TargetDuration 不填或填0时，表示目标时长和 Duration 一致；</li>
<li>当 TargetDuration 取大于0的值时，将对视频片段做快进或慢放等处理，使得输出片段的时长等于 TargetDuration。</li>
     */
    public Float getTargetDuration() {
        return this.TargetDuration;
    }

    /**
     * Set 视频片段目标时长，单位为秒。
<li>当 TargetDuration 不填或填0时，表示目标时长和 Duration 一致；</li>
<li>当 TargetDuration 取大于0的值时，将对视频片段做快进或慢放等处理，使得输出片段的时长等于 TargetDuration。</li>
     * @param TargetDuration 视频片段目标时长，单位为秒。
<li>当 TargetDuration 不填或填0时，表示目标时长和 Duration 一致；</li>
<li>当 TargetDuration 取大于0的值时，将对视频片段做快进或慢放等处理，使得输出片段的时长等于 TargetDuration。</li>
     */
    public void setTargetDuration(Float TargetDuration) {
        this.TargetDuration = TargetDuration;
    }

    /**
     * Get 视频原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值 ：Center。 
     * @return CoordinateOrigin 视频原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值 ：Center。
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * Set 视频原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值 ：Center。
     * @param CoordinateOrigin 视频原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值 ：Center。
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * Get 视频片段原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布口宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认值：0px。 
     * @return XPos 视频片段原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布口宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认值：0px。
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set 视频片段原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布口宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认值：0px。
     * @param XPos 视频片段原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布口宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认值：0px。
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get 视频片段原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认值：0px。 
     * @return YPos 视频片段原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认值：0px。
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set 视频片段原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认值：0px。
     * @param YPos 视频片段原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认值：0px。
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li> 
     * @return Width 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     * @param Width 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get 视频片段的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%；
</li><li>当字符串以 px 结尾，表示视频片段 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li> 
     * @return Height 视频片段的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%；
</li><li>当字符串以 px 结尾，表示视频片段 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set 视频片段的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%；
</li><li>当字符串以 px 结尾，表示视频片段 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     * @param Height 视频片段的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%；
</li><li>当字符串以 px 结尾，表示视频片段 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get 对音频进行操作，如静音等。 
     * @return AudioOperations 对音频进行操作，如静音等。
     */
    public AudioTransform [] getAudioOperations() {
        return this.AudioOperations;
    }

    /**
     * Set 对音频进行操作，如静音等。
     * @param AudioOperations 对音频进行操作，如静音等。
     */
    public void setAudioOperations(AudioTransform [] AudioOperations) {
        this.AudioOperations = AudioOperations;
    }

    /**
     * Get 对图像进行的操作，如图像旋转等。 
     * @return ImageOperations 对图像进行的操作，如图像旋转等。
     */
    public ImageTransform [] getImageOperations() {
        return this.ImageOperations;
    }

    /**
     * Set 对图像进行的操作，如图像旋转等。
     * @param ImageOperations 对图像进行的操作，如图像旋转等。
     */
    public void setImageOperations(ImageTransform [] ImageOperations) {
        this.ImageOperations = ImageOperations;
    }

    public VideoTrackItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoTrackItem(VideoTrackItem source) {
        if (source.SourceMedia != null) {
            this.SourceMedia = new String(source.SourceMedia);
        }
        if (source.SourceMediaStartTime != null) {
            this.SourceMediaStartTime = new Float(source.SourceMediaStartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.TargetDuration != null) {
            this.TargetDuration = new Float(source.TargetDuration);
        }
        if (source.CoordinateOrigin != null) {
            this.CoordinateOrigin = new String(source.CoordinateOrigin);
        }
        if (source.XPos != null) {
            this.XPos = new String(source.XPos);
        }
        if (source.YPos != null) {
            this.YPos = new String(source.YPos);
        }
        if (source.Width != null) {
            this.Width = new String(source.Width);
        }
        if (source.Height != null) {
            this.Height = new String(source.Height);
        }
        if (source.AudioOperations != null) {
            this.AudioOperations = new AudioTransform[source.AudioOperations.length];
            for (int i = 0; i < source.AudioOperations.length; i++) {
                this.AudioOperations[i] = new AudioTransform(source.AudioOperations[i]);
            }
        }
        if (source.ImageOperations != null) {
            this.ImageOperations = new ImageTransform[source.ImageOperations.length];
            for (int i = 0; i < source.ImageOperations.length; i++) {
                this.ImageOperations[i] = new ImageTransform(source.ImageOperations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceMedia", this.SourceMedia);
        this.setParamSimple(map, prefix + "SourceMediaStartTime", this.SourceMediaStartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "TargetDuration", this.TargetDuration);
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamArrayObj(map, prefix + "AudioOperations.", this.AudioOperations);
        this.setParamArrayObj(map, prefix + "ImageOperations.", this.ImageOperations);

    }
}

