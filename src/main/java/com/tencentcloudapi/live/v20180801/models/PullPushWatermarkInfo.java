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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PullPushWatermarkInfo extends AbstractModel{

    /**
    * 水印图片 URL。
URL中禁止包含的字符：
;(){}$>`#"'|
    */
    @SerializedName("PictureUrl")
    @Expose
    private String PictureUrl;

    /**
    * 显示位置，X轴偏移，单位是百分比，默认 0。
    */
    @SerializedName("XPosition")
    @Expose
    private Long XPosition;

    /**
    * 显示位置，Y轴偏移，单位是百分比，默认 0。
    */
    @SerializedName("YPosition")
    @Expose
    private Long YPosition;

    /**
    * 水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始宽度。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 水印高度，占直播原始画面高度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 水印位置，默认 0。
0：左上角。
1：右上角。
2：右下角。
3：左下角。
    */
    @SerializedName("Location")
    @Expose
    private Long Location;

    /**
     * Get 水印图片 URL。
URL中禁止包含的字符：
;(){}$>`#"'| 
     * @return PictureUrl 水印图片 URL。
URL中禁止包含的字符：
;(){}$>`#"'|
     */
    public String getPictureUrl() {
        return this.PictureUrl;
    }

    /**
     * Set 水印图片 URL。
URL中禁止包含的字符：
;(){}$>`#"'|
     * @param PictureUrl 水印图片 URL。
URL中禁止包含的字符：
;(){}$>`#"'|
     */
    public void setPictureUrl(String PictureUrl) {
        this.PictureUrl = PictureUrl;
    }

    /**
     * Get 显示位置，X轴偏移，单位是百分比，默认 0。 
     * @return XPosition 显示位置，X轴偏移，单位是百分比，默认 0。
     */
    public Long getXPosition() {
        return this.XPosition;
    }

    /**
     * Set 显示位置，X轴偏移，单位是百分比，默认 0。
     * @param XPosition 显示位置，X轴偏移，单位是百分比，默认 0。
     */
    public void setXPosition(Long XPosition) {
        this.XPosition = XPosition;
    }

    /**
     * Get 显示位置，Y轴偏移，单位是百分比，默认 0。 
     * @return YPosition 显示位置，Y轴偏移，单位是百分比，默认 0。
     */
    public Long getYPosition() {
        return this.YPosition;
    }

    /**
     * Set 显示位置，Y轴偏移，单位是百分比，默认 0。
     * @param YPosition 显示位置，Y轴偏移，单位是百分比，默认 0。
     */
    public void setYPosition(Long YPosition) {
        this.YPosition = YPosition;
    }

    /**
     * Get 水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始宽度。 
     * @return Width 水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始宽度。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始宽度。
     * @param Width 水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始宽度。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 水印高度，占直播原始画面高度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。 
     * @return Height 水印高度，占直播原始画面高度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 水印高度，占直播原始画面高度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。
     * @param Height 水印高度，占直播原始画面高度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 水印位置，默认 0。
0：左上角。
1：右上角。
2：右下角。
3：左下角。 
     * @return Location 水印位置，默认 0。
0：左上角。
1：右上角。
2：右下角。
3：左下角。
     */
    public Long getLocation() {
        return this.Location;
    }

    /**
     * Set 水印位置，默认 0。
0：左上角。
1：右上角。
2：右下角。
3：左下角。
     * @param Location 水印位置，默认 0。
0：左上角。
1：右上角。
2：右下角。
3：左下角。
     */
    public void setLocation(Long Location) {
        this.Location = Location;
    }

    public PullPushWatermarkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullPushWatermarkInfo(PullPushWatermarkInfo source) {
        if (source.PictureUrl != null) {
            this.PictureUrl = new String(source.PictureUrl);
        }
        if (source.XPosition != null) {
            this.XPosition = new Long(source.XPosition);
        }
        if (source.YPosition != null) {
            this.YPosition = new Long(source.YPosition);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Location != null) {
            this.Location = new Long(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PictureUrl", this.PictureUrl);
        this.setParamSimple(map, prefix + "XPosition", this.XPosition);
        this.setParamSimple(map, prefix + "YPosition", this.YPosition);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Location", this.Location);

    }
}

