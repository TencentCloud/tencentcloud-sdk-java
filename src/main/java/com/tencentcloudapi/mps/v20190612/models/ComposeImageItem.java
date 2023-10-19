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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeImageItem extends AbstractModel {

    /**
    * 元素对应媒体信息。
    */
    @SerializedName("SourceMedia")
    @Expose
    private ComposeSourceMedia SourceMedia;

    /**
    * 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。
    */
    @SerializedName("TrackTime")
    @Expose
    private ComposeTrackTime TrackTime;

    /**
    * 元素中心点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认：50%。
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * 元素中心点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认：50%。
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
为空（或0） 的场景：
<li>当 Width、Height 均为空，则 Width 和 Height 取源素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按源素材比例缩放。</li>
<li>当 Width 非空，Height 为空，则 Height 按源素材比例缩放。</li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * 元素的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
为空（或0） 的场景：
<li>当 Width、Height 均为空，则 Width 和 Height 取源素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按源素材比例缩放。</li>
<li>当 Width 非空，Height 为空，则 Height 按源素材比例缩放。</li>
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 对图像画面进行的操作，如图像旋转等。
    */
    @SerializedName("ImageOperations")
    @Expose
    private ComposeImageOperation [] ImageOperations;

    /**
     * Get 元素对应媒体信息。 
     * @return SourceMedia 元素对应媒体信息。
     */
    public ComposeSourceMedia getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * Set 元素对应媒体信息。
     * @param SourceMedia 元素对应媒体信息。
     */
    public void setSourceMedia(ComposeSourceMedia SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * Get 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。 
     * @return TrackTime 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。
     */
    public ComposeTrackTime getTrackTime() {
        return this.TrackTime;
    }

    /**
     * Set 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。
     * @param TrackTime 元素在轨道时间轴上的时间信息，不填则紧跟上一个元素。
     */
    public void setTrackTime(ComposeTrackTime TrackTime) {
        this.TrackTime = TrackTime;
    }

    /**
     * Get 元素中心点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认：50%。 
     * @return XPos 元素中心点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认：50%。
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * Set 元素中心点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认：50%。
     * @param XPos 元素中心点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认：50%。
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * Get 元素中心点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认：50%。 
     * @return YPos 元素中心点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认：50%。
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * Set 元素中心点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认：50%。
     * @param YPos 元素中心点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认：50%。
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * Get 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
为空（或0） 的场景：
<li>当 Width、Height 均为空，则 Width 和 Height 取源素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按源素材比例缩放。</li>
<li>当 Width 非空，Height 为空，则 Height 按源素材比例缩放。</li> 
     * @return Width 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
为空（或0） 的场景：
<li>当 Width、Height 均为空，则 Width 和 Height 取源素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按源素材比例缩放。</li>
<li>当 Width 非空，Height 为空，则 Height 按源素材比例缩放。</li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * Set 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
为空（或0） 的场景：
<li>当 Width、Height 均为空，则 Width 和 Height 取源素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按源素材比例缩放。</li>
<li>当 Width 非空，Height 为空，则 Height 按源素材比例缩放。</li>
     * @param Width 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
为空（或0） 的场景：
<li>当 Width、Height 均为空，则 Width 和 Height 取源素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按源素材比例缩放。</li>
<li>当 Width 非空，Height 为空，则 Height 按源素材比例缩放。</li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * Get 元素的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
为空（或0） 的场景：
<li>当 Width、Height 均为空，则 Width 和 Height 取源素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按源素材比例缩放。</li>
<li>当 Width 非空，Height 为空，则 Height 按源素材比例缩放。</li> 
     * @return Height 元素的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
为空（或0） 的场景：
<li>当 Width、Height 均为空，则 Width 和 Height 取源素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按源素材比例缩放。</li>
<li>当 Width 非空，Height 为空，则 Height 按源素材比例缩放。</li>
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * Set 元素的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
为空（或0） 的场景：
<li>当 Width、Height 均为空，则 Width 和 Height 取源素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按源素材比例缩放。</li>
<li>当 Width 非空，Height 为空，则 Height 按源素材比例缩放。</li>
     * @param Height 元素的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示元素 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示元素 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
为空（或0） 的场景：
<li>当 Width、Height 均为空，则 Width 和 Height 取源素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按源素材比例缩放。</li>
<li>当 Width 非空，Height 为空，则 Height 按源素材比例缩放。</li>
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * Get 对图像画面进行的操作，如图像旋转等。 
     * @return ImageOperations 对图像画面进行的操作，如图像旋转等。
     */
    public ComposeImageOperation [] getImageOperations() {
        return this.ImageOperations;
    }

    /**
     * Set 对图像画面进行的操作，如图像旋转等。
     * @param ImageOperations 对图像画面进行的操作，如图像旋转等。
     */
    public void setImageOperations(ComposeImageOperation [] ImageOperations) {
        this.ImageOperations = ImageOperations;
    }

    public ComposeImageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeImageItem(ComposeImageItem source) {
        if (source.SourceMedia != null) {
            this.SourceMedia = new ComposeSourceMedia(source.SourceMedia);
        }
        if (source.TrackTime != null) {
            this.TrackTime = new ComposeTrackTime(source.TrackTime);
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
        if (source.ImageOperations != null) {
            this.ImageOperations = new ComposeImageOperation[source.ImageOperations.length];
            for (int i = 0; i < source.ImageOperations.length; i++) {
                this.ImageOperations[i] = new ComposeImageOperation(source.ImageOperations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SourceMedia.", this.SourceMedia);
        this.setParamObj(map, prefix + "TrackTime.", this.TrackTime);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamArrayObj(map, prefix + "ImageOperations.", this.ImageOperations);

    }
}

