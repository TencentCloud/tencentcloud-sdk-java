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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateLiveWatermarkRequest extends AbstractModel {

    /**
    * 水印 ID。
在添加水印接口 [AddLiveWatermark](/document/product/267/30154) 调用返回值中获取水印 ID。
    */
    @SerializedName("WatermarkId")
    @Expose
    private Long WatermarkId;

    /**
    * 水印图片 URL。
URL中禁止包含的字符：
 ;(){}$>`#"\'|
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
    * 水印名称。
最长30字节。
    */
    @SerializedName("WatermarkName")
    @Expose
    private String WatermarkName;

    /**
    * 水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始宽度。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 水印高度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 背景水印宽度。默认宽度1920。
    */
    @SerializedName("BackgroundWidth")
    @Expose
    private Long BackgroundWidth;

    /**
    * 背景水印高度。默认高度1080。
    */
    @SerializedName("BackgroundHeight")
    @Expose
    private Long BackgroundHeight;

    /**
     * Get 水印 ID。
在添加水印接口 [AddLiveWatermark](/document/product/267/30154) 调用返回值中获取水印 ID。 
     * @return WatermarkId 水印 ID。
在添加水印接口 [AddLiveWatermark](/document/product/267/30154) 调用返回值中获取水印 ID。
     */
    public Long getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * Set 水印 ID。
在添加水印接口 [AddLiveWatermark](/document/product/267/30154) 调用返回值中获取水印 ID。
     * @param WatermarkId 水印 ID。
在添加水印接口 [AddLiveWatermark](/document/product/267/30154) 调用返回值中获取水印 ID。
     */
    public void setWatermarkId(Long WatermarkId) {
        this.WatermarkId = WatermarkId;
    }

    /**
     * Get 水印图片 URL。
URL中禁止包含的字符：
 ;(){}$>`#"\'| 
     * @return PictureUrl 水印图片 URL。
URL中禁止包含的字符：
 ;(){}$>`#"\'|
     */
    public String getPictureUrl() {
        return this.PictureUrl;
    }

    /**
     * Set 水印图片 URL。
URL中禁止包含的字符：
 ;(){}$>`#"\'|
     * @param PictureUrl 水印图片 URL。
URL中禁止包含的字符：
 ;(){}$>`#"\'|
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
     * Get 水印名称。
最长30字节。 
     * @return WatermarkName 水印名称。
最长30字节。
     */
    public String getWatermarkName() {
        return this.WatermarkName;
    }

    /**
     * Set 水印名称。
最长30字节。
     * @param WatermarkName 水印名称。
最长30字节。
     */
    public void setWatermarkName(String WatermarkName) {
        this.WatermarkName = WatermarkName;
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
     * Get 水印高度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。 
     * @return Height 水印高度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 水印高度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。
     * @param Height 水印高度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 背景水印宽度。默认宽度1920。 
     * @return BackgroundWidth 背景水印宽度。默认宽度1920。
     */
    public Long getBackgroundWidth() {
        return this.BackgroundWidth;
    }

    /**
     * Set 背景水印宽度。默认宽度1920。
     * @param BackgroundWidth 背景水印宽度。默认宽度1920。
     */
    public void setBackgroundWidth(Long BackgroundWidth) {
        this.BackgroundWidth = BackgroundWidth;
    }

    /**
     * Get 背景水印高度。默认高度1080。 
     * @return BackgroundHeight 背景水印高度。默认高度1080。
     */
    public Long getBackgroundHeight() {
        return this.BackgroundHeight;
    }

    /**
     * Set 背景水印高度。默认高度1080。
     * @param BackgroundHeight 背景水印高度。默认高度1080。
     */
    public void setBackgroundHeight(Long BackgroundHeight) {
        this.BackgroundHeight = BackgroundHeight;
    }

    public UpdateLiveWatermarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateLiveWatermarkRequest(UpdateLiveWatermarkRequest source) {
        if (source.WatermarkId != null) {
            this.WatermarkId = new Long(source.WatermarkId);
        }
        if (source.PictureUrl != null) {
            this.PictureUrl = new String(source.PictureUrl);
        }
        if (source.XPosition != null) {
            this.XPosition = new Long(source.XPosition);
        }
        if (source.YPosition != null) {
            this.YPosition = new Long(source.YPosition);
        }
        if (source.WatermarkName != null) {
            this.WatermarkName = new String(source.WatermarkName);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.BackgroundWidth != null) {
            this.BackgroundWidth = new Long(source.BackgroundWidth);
        }
        if (source.BackgroundHeight != null) {
            this.BackgroundHeight = new Long(source.BackgroundHeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WatermarkId", this.WatermarkId);
        this.setParamSimple(map, prefix + "PictureUrl", this.PictureUrl);
        this.setParamSimple(map, prefix + "XPosition", this.XPosition);
        this.setParamSimple(map, prefix + "YPosition", this.YPosition);
        this.setParamSimple(map, prefix + "WatermarkName", this.WatermarkName);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "BackgroundWidth", this.BackgroundWidth);
        this.setParamSimple(map, prefix + "BackgroundHeight", this.BackgroundHeight);

    }
}

