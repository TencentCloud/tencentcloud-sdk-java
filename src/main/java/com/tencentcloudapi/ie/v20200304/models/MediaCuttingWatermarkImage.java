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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCuttingWatermarkImage extends AbstractModel{

    /**
    * 水印源的ID，对应SourceInfoSet内的源。
注意1：对应的 MediaSourceInfo.Type需要为Image。
注意2：对于动图，只取第一帧图像作为水印源。
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 水印水平坐标，单位像素，默认：0。
    */
    @SerializedName("PosX")
    @Expose
    private Long PosX;

    /**
    * 水印垂直坐标，单位像素，默认：0。
    */
    @SerializedName("PosY")
    @Expose
    private Long PosY;

    /**
    * 水印宽度，单位像素，默认：0。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 水印高度，单位像素，默认：0。
注意：对于宽高符合以下规则：
1、Width>0 且 Height>0，按指定宽高拉伸；
2、Width=0 且 Height>0，以Height为基准等比缩放；
3、Width>0 且 Height=0，以Width为基准等比缩放；
4、Width=0 且 Height=0，采用源的宽高。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 指定坐标原点，可选值：
<li>LeftTop：PosXY 表示水印左上点到图片左上点的相对位置</li>
<li>RightTop：PosXY 表示水印右上点到图片右上点的相对位置</li>
<li>LeftBottom：PosXY 表示水印左下点到图片左下点的相对位置</li>
<li>RightBottom：PosXY 表示水印右下点到图片右下点的相对位置</li>
<li>Center：PosXY 表示水印中心点到图片中心点的相对位置</li>
默认：LeftTop。
    */
    @SerializedName("PosOriginType")
    @Expose
    private String PosOriginType;

    /**
     * Get 水印源的ID，对应SourceInfoSet内的源。
注意1：对应的 MediaSourceInfo.Type需要为Image。
注意2：对于动图，只取第一帧图像作为水印源。 
     * @return SourceId 水印源的ID，对应SourceInfoSet内的源。
注意1：对应的 MediaSourceInfo.Type需要为Image。
注意2：对于动图，只取第一帧图像作为水印源。
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 水印源的ID，对应SourceInfoSet内的源。
注意1：对应的 MediaSourceInfo.Type需要为Image。
注意2：对于动图，只取第一帧图像作为水印源。
     * @param SourceId 水印源的ID，对应SourceInfoSet内的源。
注意1：对应的 MediaSourceInfo.Type需要为Image。
注意2：对于动图，只取第一帧图像作为水印源。
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 水印水平坐标，单位像素，默认：0。 
     * @return PosX 水印水平坐标，单位像素，默认：0。
     */
    public Long getPosX() {
        return this.PosX;
    }

    /**
     * Set 水印水平坐标，单位像素，默认：0。
     * @param PosX 水印水平坐标，单位像素，默认：0。
     */
    public void setPosX(Long PosX) {
        this.PosX = PosX;
    }

    /**
     * Get 水印垂直坐标，单位像素，默认：0。 
     * @return PosY 水印垂直坐标，单位像素，默认：0。
     */
    public Long getPosY() {
        return this.PosY;
    }

    /**
     * Set 水印垂直坐标，单位像素，默认：0。
     * @param PosY 水印垂直坐标，单位像素，默认：0。
     */
    public void setPosY(Long PosY) {
        this.PosY = PosY;
    }

    /**
     * Get 水印宽度，单位像素，默认：0。 
     * @return Width 水印宽度，单位像素，默认：0。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 水印宽度，单位像素，默认：0。
     * @param Width 水印宽度，单位像素，默认：0。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 水印高度，单位像素，默认：0。
注意：对于宽高符合以下规则：
1、Width>0 且 Height>0，按指定宽高拉伸；
2、Width=0 且 Height>0，以Height为基准等比缩放；
3、Width>0 且 Height=0，以Width为基准等比缩放；
4、Width=0 且 Height=0，采用源的宽高。 
     * @return Height 水印高度，单位像素，默认：0。
注意：对于宽高符合以下规则：
1、Width>0 且 Height>0，按指定宽高拉伸；
2、Width=0 且 Height>0，以Height为基准等比缩放；
3、Width>0 且 Height=0，以Width为基准等比缩放；
4、Width=0 且 Height=0，采用源的宽高。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 水印高度，单位像素，默认：0。
注意：对于宽高符合以下规则：
1、Width>0 且 Height>0，按指定宽高拉伸；
2、Width=0 且 Height>0，以Height为基准等比缩放；
3、Width>0 且 Height=0，以Width为基准等比缩放；
4、Width=0 且 Height=0，采用源的宽高。
     * @param Height 水印高度，单位像素，默认：0。
注意：对于宽高符合以下规则：
1、Width>0 且 Height>0，按指定宽高拉伸；
2、Width=0 且 Height>0，以Height为基准等比缩放；
3、Width>0 且 Height=0，以Width为基准等比缩放；
4、Width=0 且 Height=0，采用源的宽高。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 指定坐标原点，可选值：
<li>LeftTop：PosXY 表示水印左上点到图片左上点的相对位置</li>
<li>RightTop：PosXY 表示水印右上点到图片右上点的相对位置</li>
<li>LeftBottom：PosXY 表示水印左下点到图片左下点的相对位置</li>
<li>RightBottom：PosXY 表示水印右下点到图片右下点的相对位置</li>
<li>Center：PosXY 表示水印中心点到图片中心点的相对位置</li>
默认：LeftTop。 
     * @return PosOriginType 指定坐标原点，可选值：
<li>LeftTop：PosXY 表示水印左上点到图片左上点的相对位置</li>
<li>RightTop：PosXY 表示水印右上点到图片右上点的相对位置</li>
<li>LeftBottom：PosXY 表示水印左下点到图片左下点的相对位置</li>
<li>RightBottom：PosXY 表示水印右下点到图片右下点的相对位置</li>
<li>Center：PosXY 表示水印中心点到图片中心点的相对位置</li>
默认：LeftTop。
     */
    public String getPosOriginType() {
        return this.PosOriginType;
    }

    /**
     * Set 指定坐标原点，可选值：
<li>LeftTop：PosXY 表示水印左上点到图片左上点的相对位置</li>
<li>RightTop：PosXY 表示水印右上点到图片右上点的相对位置</li>
<li>LeftBottom：PosXY 表示水印左下点到图片左下点的相对位置</li>
<li>RightBottom：PosXY 表示水印右下点到图片右下点的相对位置</li>
<li>Center：PosXY 表示水印中心点到图片中心点的相对位置</li>
默认：LeftTop。
     * @param PosOriginType 指定坐标原点，可选值：
<li>LeftTop：PosXY 表示水印左上点到图片左上点的相对位置</li>
<li>RightTop：PosXY 表示水印右上点到图片右上点的相对位置</li>
<li>LeftBottom：PosXY 表示水印左下点到图片左下点的相对位置</li>
<li>RightBottom：PosXY 表示水印右下点到图片右下点的相对位置</li>
<li>Center：PosXY 表示水印中心点到图片中心点的相对位置</li>
默认：LeftTop。
     */
    public void setPosOriginType(String PosOriginType) {
        this.PosOriginType = PosOriginType;
    }

    public MediaCuttingWatermarkImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCuttingWatermarkImage(MediaCuttingWatermarkImage source) {
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.PosX != null) {
            this.PosX = new Long(source.PosX);
        }
        if (source.PosY != null) {
            this.PosY = new Long(source.PosY);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.PosOriginType != null) {
            this.PosOriginType = new String(source.PosOriginType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "PosX", this.PosX);
        this.setParamSimple(map, prefix + "PosY", this.PosY);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "PosOriginType", this.PosOriginType);

    }
}

