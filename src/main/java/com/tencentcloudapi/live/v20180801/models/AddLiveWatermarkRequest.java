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

public class AddLiveWatermarkRequest extends AbstractModel {

    /**
    * <p>水印图片 URL。<br>URL中禁止包含的字符：<br> ;(){}$&gt;`#&quot;'|</p>
    */
    @SerializedName("PictureUrl")
    @Expose
    private String PictureUrl;

    /**
    * <p>水印名称。<br>最长30字节。</p>
    */
    @SerializedName("WatermarkName")
    @Expose
    private String WatermarkName;

    /**
    * <p>显示位置，X轴偏移，单位是百分比，默认 0。</p>
    */
    @SerializedName("XPosition")
    @Expose
    private Long XPosition;

    /**
    * <p>显示位置，Y轴偏移，单位是百分比，默认 0。</p>
    */
    @SerializedName("YPosition")
    @Expose
    private Long YPosition;

    /**
    * <p>水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始宽度。</p>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>水印高度，占直播原始画面高度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。</p>
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>背景水印宽度。默认宽度1920。</p><p>取值范围：[360, 4096]</p><p>单位：px</p>
    */
    @SerializedName("BackgroundWidth")
    @Expose
    private Long BackgroundWidth;

    /**
    * <p>背景水印高度。默认高度1080。</p><p>取值范围：[360, 4096]</p><p>单位：px</p>
    */
    @SerializedName("BackgroundHeight")
    @Expose
    private Long BackgroundHeight;

    /**
     * Get <p>水印图片 URL。<br>URL中禁止包含的字符：<br> ;(){}$&gt;`#&quot;'|</p> 
     * @return PictureUrl <p>水印图片 URL。<br>URL中禁止包含的字符：<br> ;(){}$&gt;`#&quot;'|</p>
     */
    public String getPictureUrl() {
        return this.PictureUrl;
    }

    /**
     * Set <p>水印图片 URL。<br>URL中禁止包含的字符：<br> ;(){}$&gt;`#&quot;'|</p>
     * @param PictureUrl <p>水印图片 URL。<br>URL中禁止包含的字符：<br> ;(){}$&gt;`#&quot;'|</p>
     */
    public void setPictureUrl(String PictureUrl) {
        this.PictureUrl = PictureUrl;
    }

    /**
     * Get <p>水印名称。<br>最长30字节。</p> 
     * @return WatermarkName <p>水印名称。<br>最长30字节。</p>
     */
    public String getWatermarkName() {
        return this.WatermarkName;
    }

    /**
     * Set <p>水印名称。<br>最长30字节。</p>
     * @param WatermarkName <p>水印名称。<br>最长30字节。</p>
     */
    public void setWatermarkName(String WatermarkName) {
        this.WatermarkName = WatermarkName;
    }

    /**
     * Get <p>显示位置，X轴偏移，单位是百分比，默认 0。</p> 
     * @return XPosition <p>显示位置，X轴偏移，单位是百分比，默认 0。</p>
     */
    public Long getXPosition() {
        return this.XPosition;
    }

    /**
     * Set <p>显示位置，X轴偏移，单位是百分比，默认 0。</p>
     * @param XPosition <p>显示位置，X轴偏移，单位是百分比，默认 0。</p>
     */
    public void setXPosition(Long XPosition) {
        this.XPosition = XPosition;
    }

    /**
     * Get <p>显示位置，Y轴偏移，单位是百分比，默认 0。</p> 
     * @return YPosition <p>显示位置，Y轴偏移，单位是百分比，默认 0。</p>
     */
    public Long getYPosition() {
        return this.YPosition;
    }

    /**
     * Set <p>显示位置，Y轴偏移，单位是百分比，默认 0。</p>
     * @param YPosition <p>显示位置，Y轴偏移，单位是百分比，默认 0。</p>
     */
    public void setYPosition(Long YPosition) {
        this.YPosition = YPosition;
    }

    /**
     * Get <p>水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始宽度。</p> 
     * @return Width <p>水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始宽度。</p>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始宽度。</p>
     * @param Width <p>水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始宽度。</p>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>水印高度，占直播原始画面高度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。</p> 
     * @return Height <p>水印高度，占直播原始画面高度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。</p>
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>水印高度，占直播原始画面高度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。</p>
     * @param Height <p>水印高度，占直播原始画面高度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。默认原始高度。</p>
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>背景水印宽度。默认宽度1920。</p><p>取值范围：[360, 4096]</p><p>单位：px</p> 
     * @return BackgroundWidth <p>背景水印宽度。默认宽度1920。</p><p>取值范围：[360, 4096]</p><p>单位：px</p>
     */
    public Long getBackgroundWidth() {
        return this.BackgroundWidth;
    }

    /**
     * Set <p>背景水印宽度。默认宽度1920。</p><p>取值范围：[360, 4096]</p><p>单位：px</p>
     * @param BackgroundWidth <p>背景水印宽度。默认宽度1920。</p><p>取值范围：[360, 4096]</p><p>单位：px</p>
     */
    public void setBackgroundWidth(Long BackgroundWidth) {
        this.BackgroundWidth = BackgroundWidth;
    }

    /**
     * Get <p>背景水印高度。默认高度1080。</p><p>取值范围：[360, 4096]</p><p>单位：px</p> 
     * @return BackgroundHeight <p>背景水印高度。默认高度1080。</p><p>取值范围：[360, 4096]</p><p>单位：px</p>
     */
    public Long getBackgroundHeight() {
        return this.BackgroundHeight;
    }

    /**
     * Set <p>背景水印高度。默认高度1080。</p><p>取值范围：[360, 4096]</p><p>单位：px</p>
     * @param BackgroundHeight <p>背景水印高度。默认高度1080。</p><p>取值范围：[360, 4096]</p><p>单位：px</p>
     */
    public void setBackgroundHeight(Long BackgroundHeight) {
        this.BackgroundHeight = BackgroundHeight;
    }

    public AddLiveWatermarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddLiveWatermarkRequest(AddLiveWatermarkRequest source) {
        if (source.PictureUrl != null) {
            this.PictureUrl = new String(source.PictureUrl);
        }
        if (source.WatermarkName != null) {
            this.WatermarkName = new String(source.WatermarkName);
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
        this.setParamSimple(map, prefix + "PictureUrl", this.PictureUrl);
        this.setParamSimple(map, prefix + "WatermarkName", this.WatermarkName);
        this.setParamSimple(map, prefix + "XPosition", this.XPosition);
        this.setParamSimple(map, prefix + "YPosition", this.YPosition);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "BackgroundWidth", this.BackgroundWidth);
        this.setParamSimple(map, prefix + "BackgroundHeight", this.BackgroundHeight);

    }
}

