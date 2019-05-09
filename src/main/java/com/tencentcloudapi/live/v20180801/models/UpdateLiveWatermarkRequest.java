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

public class UpdateLiveWatermarkRequest  extends AbstractModel{

    /**
    * 水印ID。
    */
    @SerializedName("WatermarkId")
    @Expose
    private Integer WatermarkId;

    /**
    * 水印图片url。
    */
    @SerializedName("PictureUrl")
    @Expose
    private String PictureUrl;

    /**
    * 显示位置，X轴偏移。
    */
    @SerializedName("XPosition")
    @Expose
    private Integer XPosition;

    /**
    * 显示位置，Y轴偏移。
    */
    @SerializedName("YPosition")
    @Expose
    private Integer YPosition;

    /**
    * 水印名称。
    */
    @SerializedName("WatermarkName")
    @Expose
    private String WatermarkName;

    /**
    * 水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。
    */
    @SerializedName("Width")
    @Expose
    private Integer Width;

    /**
    * 水印高度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。
    */
    @SerializedName("Height")
    @Expose
    private Integer Height;

    /**
     * 获取水印ID。
     * @return WatermarkId 水印ID。
     */
    public Integer getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * 设置水印ID。
     * @param WatermarkId 水印ID。
     */
    public void setWatermarkId(Integer WatermarkId) {
        this.WatermarkId = WatermarkId;
    }

    /**
     * 获取水印图片url。
     * @return PictureUrl 水印图片url。
     */
    public String getPictureUrl() {
        return this.PictureUrl;
    }

    /**
     * 设置水印图片url。
     * @param PictureUrl 水印图片url。
     */
    public void setPictureUrl(String PictureUrl) {
        this.PictureUrl = PictureUrl;
    }

    /**
     * 获取显示位置，X轴偏移。
     * @return XPosition 显示位置，X轴偏移。
     */
    public Integer getXPosition() {
        return this.XPosition;
    }

    /**
     * 设置显示位置，X轴偏移。
     * @param XPosition 显示位置，X轴偏移。
     */
    public void setXPosition(Integer XPosition) {
        this.XPosition = XPosition;
    }

    /**
     * 获取显示位置，Y轴偏移。
     * @return YPosition 显示位置，Y轴偏移。
     */
    public Integer getYPosition() {
        return this.YPosition;
    }

    /**
     * 设置显示位置，Y轴偏移。
     * @param YPosition 显示位置，Y轴偏移。
     */
    public void setYPosition(Integer YPosition) {
        this.YPosition = YPosition;
    }

    /**
     * 获取水印名称。
     * @return WatermarkName 水印名称。
     */
    public String getWatermarkName() {
        return this.WatermarkName;
    }

    /**
     * 设置水印名称。
     * @param WatermarkName 水印名称。
     */
    public void setWatermarkName(String WatermarkName) {
        this.WatermarkName = WatermarkName;
    }

    /**
     * 获取水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。
     * @return Width 水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。
     */
    public Integer getWidth() {
        return this.Width;
    }

    /**
     * 设置水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。
     * @param Width 水印宽度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。
     */
    public void setWidth(Integer Width) {
        this.Width = Width;
    }

    /**
     * 获取水印高度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。
     * @return Height 水印高度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。
     */
    public Integer getHeight() {
        return this.Height;
    }

    /**
     * 设置水印高度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。
     * @param Height 水印高度，占直播原始画面宽度百分比，建议高宽只设置一项，另外一项会自适应缩放，避免变形。
     */
    public void setHeight(Integer Height) {
        this.Height = Height;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WatermarkId", this.WatermarkId);
        this.setParamSimple(map, prefix + "PictureUrl", this.PictureUrl);
        this.setParamSimple(map, prefix + "XPosition", this.XPosition);
        this.setParamSimple(map, prefix + "YPosition", this.YPosition);
        this.setParamSimple(map, prefix + "WatermarkName", this.WatermarkName);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

