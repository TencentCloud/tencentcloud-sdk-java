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

public class WatermarkInfo extends AbstractModel {

    /**
    * 水印 ID。
    */
    @SerializedName("WatermarkId")
    @Expose
    private Long WatermarkId;

    /**
    * 水印图片 URL。
    */
    @SerializedName("PictureUrl")
    @Expose
    private String PictureUrl;

    /**
    * 显示位置，X 轴偏移。
    */
    @SerializedName("XPosition")
    @Expose
    private Long XPosition;

    /**
    * 显示位置，Y 轴偏移。
    */
    @SerializedName("YPosition")
    @Expose
    private Long YPosition;

    /**
    * 水印名称。
    */
    @SerializedName("WatermarkName")
    @Expose
    private String WatermarkName;

    /**
    * 当前状态。0：未使用，1:使用中。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 添加时间。
注：此字段为北京时间（UTC+8时区）。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 水印宽。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 水印高。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 背景水印宽。
    */
    @SerializedName("BackgroundWidth")
    @Expose
    private Long BackgroundWidth;

    /**
    * 背景水印高。
    */
    @SerializedName("BackgroundHeight")
    @Expose
    private Long BackgroundHeight;

    /**
     * Get 水印 ID。 
     * @return WatermarkId 水印 ID。
     */
    public Long getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * Set 水印 ID。
     * @param WatermarkId 水印 ID。
     */
    public void setWatermarkId(Long WatermarkId) {
        this.WatermarkId = WatermarkId;
    }

    /**
     * Get 水印图片 URL。 
     * @return PictureUrl 水印图片 URL。
     */
    public String getPictureUrl() {
        return this.PictureUrl;
    }

    /**
     * Set 水印图片 URL。
     * @param PictureUrl 水印图片 URL。
     */
    public void setPictureUrl(String PictureUrl) {
        this.PictureUrl = PictureUrl;
    }

    /**
     * Get 显示位置，X 轴偏移。 
     * @return XPosition 显示位置，X 轴偏移。
     */
    public Long getXPosition() {
        return this.XPosition;
    }

    /**
     * Set 显示位置，X 轴偏移。
     * @param XPosition 显示位置，X 轴偏移。
     */
    public void setXPosition(Long XPosition) {
        this.XPosition = XPosition;
    }

    /**
     * Get 显示位置，Y 轴偏移。 
     * @return YPosition 显示位置，Y 轴偏移。
     */
    public Long getYPosition() {
        return this.YPosition;
    }

    /**
     * Set 显示位置，Y 轴偏移。
     * @param YPosition 显示位置，Y 轴偏移。
     */
    public void setYPosition(Long YPosition) {
        this.YPosition = YPosition;
    }

    /**
     * Get 水印名称。 
     * @return WatermarkName 水印名称。
     */
    public String getWatermarkName() {
        return this.WatermarkName;
    }

    /**
     * Set 水印名称。
     * @param WatermarkName 水印名称。
     */
    public void setWatermarkName(String WatermarkName) {
        this.WatermarkName = WatermarkName;
    }

    /**
     * Get 当前状态。0：未使用，1:使用中。 
     * @return Status 当前状态。0：未使用，1:使用中。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 当前状态。0：未使用，1:使用中。
     * @param Status 当前状态。0：未使用，1:使用中。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 添加时间。
注：此字段为北京时间（UTC+8时区）。 
     * @return CreateTime 添加时间。
注：此字段为北京时间（UTC+8时区）。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 添加时间。
注：此字段为北京时间（UTC+8时区）。
     * @param CreateTime 添加时间。
注：此字段为北京时间（UTC+8时区）。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 水印宽。 
     * @return Width 水印宽。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 水印宽。
     * @param Width 水印宽。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 水印高。 
     * @return Height 水印高。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 水印高。
     * @param Height 水印高。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 背景水印宽。 
     * @return BackgroundWidth 背景水印宽。
     */
    public Long getBackgroundWidth() {
        return this.BackgroundWidth;
    }

    /**
     * Set 背景水印宽。
     * @param BackgroundWidth 背景水印宽。
     */
    public void setBackgroundWidth(Long BackgroundWidth) {
        this.BackgroundWidth = BackgroundWidth;
    }

    /**
     * Get 背景水印高。 
     * @return BackgroundHeight 背景水印高。
     */
    public Long getBackgroundHeight() {
        return this.BackgroundHeight;
    }

    /**
     * Set 背景水印高。
     * @param BackgroundHeight 背景水印高。
     */
    public void setBackgroundHeight(Long BackgroundHeight) {
        this.BackgroundHeight = BackgroundHeight;
    }

    public WatermarkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WatermarkInfo(WatermarkInfo source) {
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "BackgroundWidth", this.BackgroundWidth);
        this.setParamSimple(map, prefix + "BackgroundHeight", this.BackgroundHeight);

    }
}

